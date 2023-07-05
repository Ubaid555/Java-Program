import javax.swing.*;
import java.awt.*;

public class Compliance_Report {
    Compliance_Report() {
        JFrame jf = new JFrame();
        jf.setSize(400, 500);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        JLabel jl1 = new JLabel("OFFICIUM SYSTEM");
        jl1.setFont(jl1.getFont().deriveFont(Font.BOLD, 24f));
        jl1.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel jl2 = new JLabel("FEEDBACK COMPLIANCE REPORT");
        jl2.setFont(jl2.getFont().deriveFont(Font.BOLD, 18f));
        jl2.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel jl3 = new JLabel("PERSONAL INFORMATION");
        jl3.setFont(jl3.getFont().deriveFont(Font.BOLD, 18f));
        jl3.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel textFieldsPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        textFieldsPanel.setBackground(Color.WHITE);

        for (int i = 1; i <= 6; i++) {
            JTextField textField = new JTextField();
            textFieldsPanel.add(textField);
        }

        JLabel jl4 = new JLabel("SYSTEM INFORMATION");
        jl4.setFont(jl4.getFont().deriveFont(Font.BOLD, 18f));
        jl4.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel questionsPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        questionsPanel.setBackground(Color.WHITE);

        JLabel question1 = new JLabel("Question 1:");
        JRadioButton rb11 = new JRadioButton("Option 1");
        JRadioButton rb12 = new JRadioButton("Option 2");

        JLabel question2 = new JLabel("Question 2:");
        JRadioButton rb21 = new JRadioButton("Option 1");
        JRadioButton rb22 = new JRadioButton("Option 2");

        JLabel question3 = new JLabel("Question 3:");
        JRadioButton rb31 = new JRadioButton("Option 1");
        JRadioButton rb32 = new JRadioButton("Option 2");

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rb11);
        buttonGroup1.add(rb12);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(rb21);
        buttonGroup2.add(rb22);

        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(rb31);
        buttonGroup3.add(rb32);

        questionsPanel.add(question1);
        questionsPanel.add(rb11);
        questionsPanel.add(rb12);
        questionsPanel.add(question2);
        questionsPanel.add(rb21);
        questionsPanel.add(rb22);
        questionsPanel.add(question3);
        questionsPanel.add(rb31);
        questionsPanel.add(rb32);

        mainPanel.add(jl1, BorderLayout.NORTH);
        mainPanel.add(jl2, BorderLayout.CENTER);
        mainPanel.add(jl3, BorderLayout.CENTER);
        mainPanel.add(textFieldsPanel, BorderLayout.CENTER);
        mainPanel.add(jl4, BorderLayout.CENTER);
        mainPanel.add(questionsPanel, BorderLayout.CENTER);

        jf.add(mainPanel);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Compliance_Report();
    }
}
