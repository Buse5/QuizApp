package com.example.quizappwithspringboot.repositories;

import com.example.quizappwithspringboot.entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result,Integer> {
}
