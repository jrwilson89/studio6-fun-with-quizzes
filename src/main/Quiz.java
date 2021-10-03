package main;

//Requirements:
//  Add questions to quiz
//  Run the quiz
//  Grade the quiz

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    //Class variables
    private ArrayList<Questions> questions = new ArrayList<Questions>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner=new Scanner(System.in);

    //Constructor
    public Quiz() {

    }
    //Methods
    public void addQuestions(Questions question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        //Loop through each question
        for (Questions questions:questions) {
            //Ask the user the question
            System.out.println(questions.getTheQuestion());
            //Get the user's answer
            String userAnswer = this.getUsersAnswers();
            //Check the answer
            boolean userGotQuestionCorrect = questions.checkAnswer(userAnswer);
            //Increment numberOfQuestionsCorrect if answered correctly
            if (userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }
        //Grade the quiz
        double percentageCorrect = ((double)this.numberOfQuestionsCorrect/(double)this.questions.size())*100;
        System.out.println("Users Grade: " + percentageCorrect + "%");

    }
    private String getUsersAnswers(){
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }

}
