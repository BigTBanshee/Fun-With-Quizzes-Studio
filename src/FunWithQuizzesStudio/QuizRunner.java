package FunWithQuizzesStudio;

public class QuizRunner {

    public static void main(String[] args) {
        Quiz newQuiz = new Quiz();

        MultipleChoice myMultiChoiceQuestion = new MultipleChoice("Who was the first woman in space?" +
                "\nA: Sally Ride\nB: Mother Theresa\nC: Hillary Clinton", "Sally Ride");
        newQuiz.addQuestion(myMultiChoiceQuestion);

        Checkbox myCheckBoxQuestion = new Checkbox("Which animals are real? Select all that apply.\nA: Cats\nB: Unicorns\nC: Centaur\nD: Mouse", "A, D");
        newQuiz.addQuestion(myCheckBoxQuestion);

        TrueOrFalse myTrueFalseQuestion = new TrueOrFalse("Coding is fun?  \n True or False?", "True");
        newQuiz.addQuestion(myTrueFalseQuestion );

        newQuiz.runQuiz();
    }
}
