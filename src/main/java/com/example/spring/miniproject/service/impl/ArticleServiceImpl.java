package com.example.spring.miniproject.service.impl;

import com.example.spring.miniproject.model.Article;
import com.example.spring.miniproject.repository.StaticRepository;
import com.example.spring.miniproject.service.ArticleService;
import com.example.spring.miniproject.service.FileUploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final StaticRepository staticRepository;
    private final FileUploadService fileUploadService;


    @Override
    public List<Article> findAll() {
        return staticRepository.getArticles();
    }

    @Override
    public List<Article> findAllByCategory(String title) {
        return staticRepository.getArticlesByCategory(title);
    }



    @Override
    public List<Article> getArticlesByAuthor(String name) {
        return staticRepository.getArticlesByAuthor(name);
    }


}















