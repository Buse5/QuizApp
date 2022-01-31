package com.example.quizappwithspringboot.repositories;

import com.example.quizappwithspringboot.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
