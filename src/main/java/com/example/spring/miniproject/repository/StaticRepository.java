package com.example.spring.miniproject.repository;

import com.example.spring.miniproject.model.Article;
import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@Getter
public class StaticRepository {

    private Faker faker;

    @Autowired
    public void setFaker(Faker faker) {
        this.faker = faker;
    }

    private List<Article> articles;


    @PostConstruct
    void init() {
        articles = new ArrayList<>() {{
            add(new Article((UUID.randomUUID()), "rabbit2.jpg", "rabbit", faker.book().author(), faker.book().title(), "rabbit1.jpg", "la-lisa"));
            add(new Article((UUID.randomUUID()), "dog2.jpg", "dog", faker.book().author(), faker.book().title(), "dog1.jpg", "jennie-ta"));
            add(new Article((UUID.randomUUID()), "tiger2.jpg", "tiger", faker.book().author(), faker.book().title(), "tiger1.jpg", "ro-se"));
            add(new Article((UUID.randomUUID()), "pet.jpg", "cat", faker.book().author(), faker.book().title(), "cat1.png", "ji-soo"));
            add(new Article((UUID.randomUUID()), "rabbit2.jpg", "rabbit", faker.book().author(), faker.book().title(), "rabbit1.jpg", "la-lisa"));
            add(new Article((UUID.randomUUID()), "dog2.jpg", "dog", faker.book().author(), faker.book().title(), "dog1.jpg", "jennie-ta"));
            add(new Article((UUID.randomUUID()), "tiger2.jpg", "tiger", faker.book().author(), faker.book().title(), "tiger1.jpg", "ro-se"));
            add(new Article((UUID.randomUUID()), "pet.jpg", "cat", faker.book().author(), faker.book().title(), "cat1.png", "ji-soo"));

        }};
    }



    public List<Article> getArticlesByCategory(String title) {
        List<Article> articles1 = new ArrayList<>();
        for(int i = 0; i < articles.size(); i++) {
            if(articles.get(i).getTitle().equals(title)){
                articles1.add(articles.get(i));
            }
        }
        return articles1;

    }

    public List<Article> getArticlesByAuthor(String name) {
        List<Article> articles2 = new ArrayList<>();
        for(int i = 0; i < articles.size(); i++) {
            if(articles.get(i).getName().equals(name)){
                articles2.add(articles.get(i));
            }
        }
        return articles2;

    }






}

















