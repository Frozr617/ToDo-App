import java.awt.Dimension;
import java.lang.ClassNotFoundException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App
{
    public static String todoText;
    public static JFrame adding;
    public static JFrame frame;
    public static void ToDos()
    {
      frame = new JFrame("To-Do");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel toDosPanel = new JPanel();
      JButton addToDo = new JButton("Add to-do");
      addToDo.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          addingDo();
        }
      });
      JLabel label = new JLabel("Here is your to-do`s");
      toDosPanel.add(label);
      toDosPanel.add(addToDo);
      frame.add(toDosPanel);

      frame.setSize(new Dimension(750, 500));
      frame.setVisible(true);
   }

   public static void main(String[] args)
   {
     ToDos();
    }
   public static void addingDo()
   {
     System.out.println("Add some to-do`s!");
      adding = new JFrame("Adding To-Do");
      //Creating Panel
      JPanel addingPanel = new JPanel();
      JLabel add = new JLabel("Add to-do!");
      JButton addConfirm = new JButton("Add");
      addConfirm.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(todoText);
        }
      });
      BoxLayout boxlayout = new BoxLayout(addingPanel, BoxLayout.Y_AXIS);
      JTextField todo = new JTextField();
      todoText = todo.getText();
      addingPanel.add(add);
      addingPanel.add(todo);
      addingPanel.setLayout(boxlayout);
      addingPanel.add(addConfirm);
      adding.add(addingPanel);
      adding.setSize(new Dimension(300, 600));
      adding.setVisible(true);
   }
}
