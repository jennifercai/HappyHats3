package hats3.data;

import java.io.*;
/**
 * This class contains the list of questions to be asked.
 * @author Cindy Lian
 * @author Jennifer Cai
 * @version 4.0, June 10, 2013
 */
public class Questions
{
  /**
   * currentQuestion - int - int of the current question being asked.
   */
  int currentQuestion;
  /**
   * questions - String [] - String array of all the questions that can be asked.
   */
  String[] questions;
  /**
   * answers - String [][] - String 2d array of all the answers for the questions.
   */
  String [][] answers;
  /**
   * correctAnswer - int [] - int array of all the correct answers.
   */
  int[] correctAnswer;
  /**
   * singleAnswer - String [] - Stores the answers for a single question.
   */
  String[] singleAnswers = new String[4];
  /**
   * temp - String - temporary String storage
   */
  String temp;
  
  /**
   * Creates the questions depending on the level. 
   * <p>
   * Variable Dictionary:<br>
   * Variable - Type - Purpose<br>
   * numQuestions - int - Number of different questions in the file<br>
   * For Loops:<br>
   *  Variable/Condition/Increment<br>
   *  int x/x < numQuestions/x++<br>
   *  Purpose: read in all the questions in the file.<br>
   * </p>
   * @throws Exception 
   * @param level String of level
   */
  public Questions(String level)throws Exception
  {
    int numQuestions = 20;
    questions = new String [numQuestions];
    answers=new String [numQuestions][4];
    correctAnswer=new int [numQuestions];
    BufferedReader in = new BufferedReader (new FileReader ("hats3/tFiles/Level"+level+"Qs.turt"));
    if (in.readLine().equals ("Level "+level));
    {
      for (int x = 0; x < numQuestions; x++)
      {
        questions [x]= in.readLine ();
        for (int z = 0; z<4;z++)
        {
          answers [x][z]= in.readLine();
        }
        temp= in.readLine();
        correctAnswer[x]=Integer.parseInt(temp);
      }
    } 
  }
  
  /**
   * Returns a random question to be displayed.
   * @return String of question
   */
  public String getQuestion()
  {
    currentQuestion = (int)(Math.random()*20);
    return questions[currentQuestion];
  }
  
  /**
   * Returns a string array of the answer of the current question.
   * @return String [] answers
   */
  public String[] getAnswers()
  {
    for (int x = 0; x<4; x++)
    {
      singleAnswers[x] = answers[currentQuestion][x];
    }
    return singleAnswers;
  }
  
  /**
   * Returns the integer corresponding with the correct answer.
   * @return int of correct answer
   */
  public int getCorrectAnswer()
  {
    return correctAnswer[currentQuestion];
  }
}
