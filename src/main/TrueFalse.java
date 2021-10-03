package main;

public class TrueFalse extends Questions {
    //Class variables

    //Constructors
    public TrueFalse (String question, String answer) {
        super(question, answer);
    }

    //Method
    @Override
    public boolean checkAnswer (String answer) {
        //answer = "TRUE" or "FALSE"
        //answer = "true" or "false"
        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
