package com.example.spring.miniproject.controller;

import com.example.spring.miniproject.model.Article;
import com.example.spring.miniproject.service.ArticleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;
//    @GetMapping("/all-users")
//    String viewArticle() {
//        return "pages/article/all-users";
//    }
//    @GetMapping("/all-users")
//    String viewByCategory(Model model, String name) {
//        List<Article> articles = articleService.findAllUserByName(name);
//        model.addAttribute("articles", articles);
//        System.out.println(articleService.findAllUserByName(name));
//        return "pages/article/all-users";
//    }

    @GetMapping("/all-users")
    String viewHome(Model model) {
        List<Article> articles = articleService.findAll();
        model.addAttribute("articles", articles);
        System.out.println(articleService.findAll());
        return "pages/article/all-users";
    }

    @GetMapping("/view-category")
    String viewByCategories() {

        return "pages/article/view-category";
    }
    @GetMapping("/post")
    String viewArticleNew(Article article, Model model) {
        model.addAttribute("article", article);
        return "pages/article/post";
    }
    @PostMapping("/post")
    String doSaveArticle(@ModelAttribute @Valid Article article, BindingResult result,
                         @RequestParam("thumbnailFile") MultipartFile file,
                         Model model) {
        if(result.hasErrors()) {
            model.addAttribute("article", article);
            return "pages/article/post";
        }
        System.out.println(file.getOriginalFilename());
        return "redirect:/post";
    }


}

















