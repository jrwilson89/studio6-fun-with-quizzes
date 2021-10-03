package main;

public abstract class Questions {

    //Class variables

    private final String theQuestion;
    private final String theAnswer;

    //Constructors
    public Questions(String question, String answer) {
        this.theQuestion = question;
        this.theAnswer = answer;
    }

    //Methods
    //Getters
    public String getTheQuestion() {return this.theQuestion;}
    public String getTheAnswer() {return this.theAnswer;}

    //Other methods
    public abstract boolean checkAnswer (String answer);

}
