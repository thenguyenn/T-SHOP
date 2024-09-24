package com.demo.service;

import com.demo.model.Category;
import com.demo.repo.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

//TODO: Connect to database

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepo categoryRepo;

    public List<Category> getAll(){
        return categoryRepo.findAll();
    }

//    public List<Category> getAll(){
//        return Arrays.asList(
//            new Category("IP", "IPhone"),
//            new Category("ANDR", "Android")
//        );
//    }
}
