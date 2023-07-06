import javax.swing.*;
import java.awt.*;

public class Feedback_Report extends JPanel {
    private JLabel label1, label2, label3, label4, label5, label6, label7,label8;
    JLabel[] labels = new JLabel[9];
    String[] labelTexts = {"Is Application is fully deployed in FY/Dept?", "Has all necessary regarding useage been conveyed during training sessions?"
    		, "Is Application is reliable, provide Document secrecy ?", "Is Applicationn useful for ,maintaining document history?", "In case of any issue OA team is helping properly?",
    		  "Is Application being user friendly", "Using Application is a good/wise decision?", "Is Application allows me to work accurately?",
    		  "There is a need of organization is to encouraged employee to use the Application"};
    private JPanel panel1, panel2;
    private JTextField textfield1 , textfield2, textfield3, textfield4, textfield5, textfield6;
    private JRadioButton rd_btn1,rd_btn2,rd_btn3,rd_btn4,rd_btn5,rd_btn6;
    private ButtonGroup btn_grp1, btn_grp2,btn_grp3;

    private JFrame frame= new JFrame("Feedback Report");
    
    public JLabel[] createLabels(String[] labeltext,int x, int y, int width, int height) {
    	JLabel[] labels = new JLabel[9];
    	for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel(labelTexts[i]);
            labels[i].setBounds(x, y, width, height);
            y += y + 70; // Increase y-coordinate for the next label
        }
        return labels;
    }
    
    
    public static JRadioButton[] createRadioButtons(int x, int y, int width, int height) {
   
            JRadioButton[] radioButtons = new JRadioButton[5];
            ButtonGroup buttonGroup = new ButtonGroup();
            
            for (int i = 0; i < radioButtons.length; i++) {
                radioButtons[i] = new JRadioButton(String.valueOf(i + 1)); // Set label as 1, 2, 3, 4, 5
                radioButtons[i].setBounds(x, y, width, height);
                buttonGroup.add(radioButtons[i]); // Add the radio button to the button group
                x += height + 10; // Increase y-coordinate for the next radio button
            }
            
            return radioButtons;
        }
    
    public Feedback_Report() {
    	
    	label1 = new JLabel("OFFICIUM SYSTEM");
    	label1.setBounds(500, 10, 200, 20);
    	label1.setFont(new Font("Arial",Font.BOLD,20));
    	label1.setHorizontalAlignment(SwingConstants.CENTER);
    	
    	label2 = new JLabel("FEEDBACK COMPLIANCE REPORT");
    	label2.setBounds(400, 70, 400, 20);
    	label2.setFont(new Font("Arial",Font.BOLD,20));
    	label2.setHorizontalAlignment(SwingConstants.CENTER);
    	
    	label3 = new JLabel("PERSONAL INFORMATION");
    	label3.setBounds(450, 140, 300, 20);
    	label3.setFont(new Font("Arial",Font.BOLD,20));
    	label3.setHorizontalAlignment(SwingConstants.CENTER);
    	
    	label4 = new JLabel("SYSTEM INFORMATION");
    	label4.setBounds(450, 350, 300, 20);
    	label4.setFont(new Font("Arial",Font.BOLD,20));
    	label4.setHorizontalAlignment(SwingConstants.CENTER);
    	
    	label5 = new JLabel("DO you have a PC for the application use? ");
    	label5.setBounds(400, 400, 800, 20);
    	label5.setFont(new Font("Arial",Font.BOLD,20));
    	
    	rd_btn1 = new JRadioButton("Shared");
    	rd_btn2 = new JRadioButton("Personal");
    	
    	rd_btn1.setBounds(400, 420, 100, 30);
    	rd_btn2.setBounds(500, 420, 100, 30);
    	
    	btn_grp1=new ButtonGroup();  
    	btn_grp1.add(rd_btn1);
    	btn_grp1.add(rd_btn2);
    	
    	label6 = new JLabel("Is PC connected to network?");
    	label6.setBounds(400, 500, 800, 20);
    	label6.setFont(new Font("Arial",Font.BOLD,20));
    	
    	rd_btn3 = new JRadioButton("Yes");
    	rd_btn4 = new JRadioButton("No");
    	
    	rd_btn3.setBounds(400, 520, 100, 30);
    	rd_btn4.setBounds(500, 520, 100, 30);
    	
    	btn_grp2=new ButtonGroup();  
    	btn_grp2.add(rd_btn3);
    	btn_grp2.add(rd_btn4);
   	
    	label7 = new JLabel("Is PC meeting minimum requirement of the application (Core i3 & above)?");
    	label7.setBounds(400, 600, 800, 20);
    	label7.setFont(new Font("Arial",Font.BOLD,20));
    	
    	rd_btn5 = new JRadioButton("Yes");
    	rd_btn6 = new JRadioButton("No");
    	
    	rd_btn5.setBounds(400, 620, 100, 30);
    	rd_btn6.setBounds(500, 620, 100, 30);
    	
    	btn_grp3=new ButtonGroup();  
    	btn_grp3.add(rd_btn5);
    	btn_grp3.add(rd_btn6);
    	
    	label8 = new JLabel("SOFTWARE INFORMATION SURVEY SCALE");
    	label8.setBounds(400, 700, 500, 20);
    	label8.setFont(new Font("Arial",Font.BOLD,20));
    	label8.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel[] labels = createLabels(labelTexts,400,750,600,30);
        JRadioButton[] buttons = createRadioButtons(400, 780, 40, 30);
        for (JRadioButton button : buttons) {
            frame.add(button);
        }
        
//        JRadioButton[] button1 = createRadioButtons(400, 850, 40, 30);
//        for (JRadioButton button : buttons) {
//            frame.add(button);
//        }
//        
//        JRadioButton[] button2 = createRadioButtons(400, 950, 40, 30);
//        for (JRadioButton button : buttons) {
//            frame.add(button);
//        }
    	textfield1 = new JTextField("Name");
    	textfield1.setBounds(400, 200, 150, 50);
    	
    	textfield2 = new JTextField();
    	textfield2.setBounds(550, 200, 150, 50);
    	
    	textfield3 = new JTextField();
    	textfield3.setBounds(700, 200, 150, 50);
    	
    	textfield4 = new JTextField();
    	textfield4.setBounds(400, 250, 150, 50);
    	
    	textfield5 = new JTextField();
    	textfield5.setBounds(550, 250, 150, 50);
    	
    	textfield6 = new JTextField();
    	textfield6.setBounds(700, 250, 150, 50);
    	
    	
    	
    	
    	frame.setLayout(null);
    	frame.setSize(1500, 1500);
    	
    	frame.add(label1);
    	frame.add(label2);
    	frame.add(label3);
    	frame.add(label4);
    	
    	frame.add(label5);
    	frame.add(rd_btn1);
    	frame.add(rd_btn2);
    	
    	frame.add(label6);
    	frame.add(rd_btn3);
    	frame.add(rd_btn4);
    	
    	frame.add(label7);
    	frame.add(rd_btn5);
    	frame.add(rd_btn6);
    	
    	frame.add(label8);
    	frame.add(labels[0]);
//        frame.add(labels[1]);
//        frame.add(labels[2]);
    	
    	frame.add(textfield1);
    	frame.add(textfield2);
    	frame.add(textfield3);
    	frame.add(textfield4);
    	frame.add(textfield5);
    	frame.add(textfield6);
    	
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       new Feedback_Report();
        
    }
}
