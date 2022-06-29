package com.bezkoder.spring.data.mongodb.repository;

import com.bezkoder.spring.data.mongodb.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> { }