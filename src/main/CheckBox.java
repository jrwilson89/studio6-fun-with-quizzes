package main;

public class CheckBox extends Questions {

    //Class variables

    //Constructors
    public CheckBox (String question, String answer) {
        super(question, answer);
    }

    //Method
    @Override
    public boolean checkAnswer (String answer) {
        //answer = "A", "B" or "C"
        //answer = "a", "b" or "c"
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
