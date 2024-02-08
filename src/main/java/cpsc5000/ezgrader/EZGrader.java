package cpsc5000.ezgrader;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author calif
 */
public class EZGrader 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        int numberOfQuestions = 0;
        int questionsWrong = 0;
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EZGradeGui().setVisible(true);
            }
        });
        
        
//        //String numberOfQuestionsString = JOptionPane.showInputDialog ("How many questions are on the test? ");
//        numberOfQuestions = Integer.parseInt(numberOfQuestionsString);
//        //System.out.println("How many questions were incorrect? ");
//        //questionsWrong = input.nextInt();
//        
//        GradeCalculator myGrade = new GradeCalculator (numberOfQuestions, 0);
//        //myGrade.calculateGrade();
//        
//        //myGrade.displayGrade();
//        myGrade.displayEZGrade();
        
        //EZGradeGui myTable = new EZGradeGui();
        //myTable.setVisible(true);
        
        
        
        
       
//        table gui = new table (myGrade.getGradeArray());
//        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        gui.setSize(900, 500);
//        gui.setVisible(true);
//        gui.setTitle("EZ Grade Calculator");
      
       
    }
    
}
