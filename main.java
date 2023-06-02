
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("CardLayout Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);

   
    JPanel panel = new JPanel();

    
    CardLayout cardLayout = new CardLayout();
    panel.setLayout(cardLayout);

  
    panel.add(new JButton("Button 1"), "Button 1");
    panel.add(new JButton("Button 2"), "Button 2");

    
    JButton nextButton = new JButton("Next");
    nextButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        cardLayout.next(panel);
      }
    });
    frame.add(nextButton, BorderLayout.SOUTH);

    
    frame.add(panel);

   
    frame.setVisible(true);
  }
}
