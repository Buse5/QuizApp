package com.example.quizappwithspringboot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Data
@AllArgsConstructor
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quesId;
    private String title;
    private String optionA;
    private String optionB;
    private String optionC;
    private int ans;
    private int chose;

    public Question() {

    }

    @Override
    public String toString() {
        return "Question [quesId=" + quesId + ", title=" + title + ", optionA=" + optionA + ", optionB=" + optionB + ", optionC=" + optionC + ", ans=" + ans + ", chose=" + chose + "]";
    }
}
