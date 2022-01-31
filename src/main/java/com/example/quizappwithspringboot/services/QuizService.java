package com.example.quizappwithspringboot.services;

import com.example.quizappwithspringboot.entities.Question;
import com.example.quizappwithspringboot.entities.QuestionForm;
import com.example.quizappwithspringboot.entities.Result;
import com.example.quizappwithspringboot.repositories.QuestionRepository;
import com.example.quizappwithspringboot.repositories.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuizService {
    @Autowired
    Question question;
    @Autowired
    QuestionForm qForm;
    @Autowired
    QuestionRepository qRepo;
    @Autowired
    ResultRepository rRepo;
    @Autowired
    Result result;
    public QuestionForm getQuestions() {
        List<Question> allQues = qRepo.findAll();
        List<Question> qList = new ArrayList<Question>();

        Random random = new Random();

        for(int i=0; i<5; i++) {
            int rand = random.nextInt(allQues.size());
            qList.add(allQues.get(rand));
            allQues.remove(rand);
        }
        qForm.setQuestions(qList);
        return qForm;
    }
    public int getResult(QuestionForm qForm) {
        int correct = 0;

        for(Question q: qForm.getQuestions())
            if(q.getAns() == q.getChose())
                correct++;

        return correct;
    }

    public void saveScore(Result result) {
        Result saveResult = new Result();
        saveResult.setUsername(result.getUsername());
        saveResult.setTotalCorrect(result.getTotalCorrect());
        rRepo.save(saveResult);
    }

    public List<Result> getTopScore() {
        List<Result> sList = rRepo.findAll(Sort.by(Sort.Direction.DESC, "totalCorrect"));

        return sList;
    }
}
