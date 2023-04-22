package com.example.spring.miniproject.controller;


import com.example.spring.miniproject.model.Article;
import com.example.spring.miniproject.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ArticleService articleService;

    @GetMapping("/")
    String viewHome(Model model) {
        List<Article> articles = articleService.findAll();
        model.addAttribute("articles", articles);
        System.out.println(articleService.findAll());
        return "pages/index";
    }

    @GetMapping("/view-category/{title}")
    String viewByCategory(Model model, @PathVariable String title) {
        List<Article> articles = articleService.findAllByCategory(title);
        model.addAttribute("articles", articles);
        System.out.println(articleService.findAllByCategory(title));
        return "pages/article/view-category";
    }

    @GetMapping("/profile/{name}")
    String profileUser(Model model, @PathVariable String name) {
        List<Article> articles = articleService.getArticlesByAuthor(name);
        model.addAttribute("articles", articles);
        System.out.println(articleService.getArticlesByAuthor(name));
        return "pages/article/profile";
    }



//    @GetMapping("/")
//    public String allUsersDisplay(Model model){
//        model.addAttribute("Authors", authorInterface.getAllAuthor());
//        model.addAttribute("allArticle", articleInterface.getAllArticle());
//        return "pages/index";
//    }


}
