# Spring Boot Quiz App

 ## Languages And Abilities 👩‍💻

| Dil / Yetenek | :arrow_right: | % |
| ------------- |:-------------:|:-------------:|
| Spring Boot | :arrow_right: | 90 |
| Thymeleaf | :arrow_right: | 70 |
| H2 Database | :arrow_right: | 70 |

### Application Images

## Home Page
![image](https://github.com/Buse5/QuizApp/blob/main/images/proje1.PNG)

## Home Page Warning
![image](https://github.com/Buse5/QuizApp/blob/main/images/entername.PNG)

## Quiz Page
![image](https://github.com/Buse5/QuizApp/blob/main/images/quetions.PNG)

![image](https://github.com/Buse5/QuizApp/blob/main/images/questions2.PNG)

## Your Score
![image](https://github.com/Buse5/QuizApp/blob/main/images/score.PNG)

## Score Board
![image](https://github.com/Buse5/QuizApp/blob/main/images/scoreTable.PNG)

### Create the H2 database and paste all the codes below to the console 👇 <br/>
### H2 Database Console 💾
```
insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
values(
          1,
          'What is a correct syntax to output "Hello World" in Java?',
          'echo "Hello World"',
          'printf("Hello World")',
          'System.out.println("Hello World")',
          3,
          -1)
;

insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
values(
          2,
          'Java is short for "JavaScript."',
          'True',
          'False',
          'Partially True',
          2,
          -1)
;

insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
values(
          3,
          'How do you insert COMMENTS in Java code?',
          '# This is a comment',
          '// This is a comment',
          '/* This is a comment',
          2,
          -1)
;

insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
values(
          4,
          'Which data type is used to create a variable that should store text?',
          'String',
          'Char',
          'Both',
          1,
          -1)
;

insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
values(
          5,
          'How do you create a variable with the numeric value 5?',
          'num x = 5',
          'float x = 5',
          'int x = 5',
          3,
          -1)
;

insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
values(
          6,
          'How do you create a variable with the floating number 2.8?',
          'num x = 2.8',
          'float x = 2.8',
          'int x = 2.8',
          2,
          -1)
;

insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
values(
          7,
          'Which method can be used to find the length of a string?',
          'getSize()',
          'length()',
          'size()',
          2,
          -1)
;

insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
values(
          8,
          'Which operator is used to add together two values?',
          '&&',
          '.add()',
          '+',
          3,
          -1)
;

insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
values(
          9,
          'The value of a string variable can be surrounded by single quotes.',
          'True',
          'False',
          'Maybe',
          2,
          -1)
;

insert into questions(ques_id, title, optionA, optionB, optionC, ans, chose)
values(
          10,
          'Which operator can be used to compare two values?',
          '><',
          '&|',
          '==',
          3,
          -1)
;
```
