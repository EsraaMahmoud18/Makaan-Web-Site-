package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.database.entity.ContactEntity;
import com.example.demo.database.entity.NewsLetterEntity;
import com.example.demo.database.repository.NewsLetterRepo;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class NewsLetterService {
private final NewsLetterRepo newsLetterRepo;

public NewsLetterEntity addNewNewsletter(NewsLetterEntity newsLetterEntity)
{
	   return newsLetterRepo.save(newsLetterEntity);
}


}
