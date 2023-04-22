package com.example.spring.miniproject.service;

import com.example.spring.miniproject.model.Article;

import java.util.List;


public interface ArticleService {
    List<Article> findAll();

    List<Article> findAllByCategory(String title);



    List<Article> getArticlesByAuthor(String name);


}
