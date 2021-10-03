package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();
        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("In the movie 'The Last Dragon', what did Sho'Nuff describe himself as?\nA: The Meanest\nB: The Prettiest\nC: The Baddest Mofo Lowdown Around This Town\nD: All of the above\nPlease type the letter of the answer", "D");
        myQuiz.addQuestions(myMultipleChoiceQuestion);

        CheckBox myCheckBoxQuestion = new CheckBox("Check all that apply, what are some of the names of the characters in 'The Last Dragon'?\nA: Eddie Arkadian\nB: Richie Green\nC: Angela\nD: Robert Frost", "A,B,C");
        myQuiz.addQuestions(myCheckBoxQuestion);

        TrueFalse myTrueFalse = new TrueFalse("Bruce Leroy was searching for The Glow.", "True");
        myQuiz.addQuestions(myTrueFalse);

        myQuiz.runQuiz();
    }
}
