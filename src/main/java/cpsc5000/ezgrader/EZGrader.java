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

    }

}
