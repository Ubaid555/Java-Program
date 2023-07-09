import javax.swing.*;
import java.awt.*;

public class FeedbackReportPanel extends JPanel {
    private static final String[] LABEL_TEXTS = {
            "Is Application fully deployed in FY/Dept?",
            "Has all necessary information regarding usage been conveyed during training sessions?",
            "Is Application reliable, providing document secrecy?",
            "Is Application useful for maintaining document history?",
            "In case of any issue, is the OA team providing proper help?",
            "Is Application user-friendly?",
            "Using Application is a good/wise decision?",
            "Does Application allow me to work accurately?",
            "Is there a need for the organization to encourage employees to use the Application"
    };

    private static final String[] RADIO_BUTTON_LABELS = {"1", "2", "3", "4", "5"};

    private static final String[] RADIO_BUTTON_LABELS1 = {"Shared", "Personal", "Yes", "No", "Yes","No"};

    private JLabel[] labels;
    private JTextField[] textFields;
    private JRadioButton[][] radioButtons;

    private JRadioButton [] radioButtons1;
    private JTextArea suggestionTextArea;
    private JFrame frame;

    public FeedbackReportPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(1200, 1700));

        createLabels();
        createTextFields();
        createRadioButtons();

        addComponentsToPanel();

        JScrollPane scrollPane = new JScrollPane(this);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(1200, 1400)); // Increase the size as desired

        frame = new JFrame("Feedback Report");
        frame.setLayout(new BorderLayout());
        frame.setSize(1480, 800);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createLabels() {
        labels = new JLabel[LABEL_TEXTS.length];
        int x = 400;
        int y = 750;
        int width = 600;
        int height = 30;
        int fontSize = 20; // Increase the font size here

        for (int i = 0; i < LABEL_TEXTS.length; i++) {
            labels[i] = new JLabel(LABEL_TEXTS[i]);
            labels[i].setBounds(x, y, width, height);
            labels[i].setFont(new Font("Arial", Font.BOLD, 14)); // Set the font size
            y += height + 30;
        }
    }

    private void createTextFields() {
        textFields = new JTextField[6];
        int x = 400;
        int y = 200;
        int width = 150;
        int height = 50;

        textFields[0] = new JTextField("Name");
        textFields[1] = new JTextField("Fy / Deptt");
        textFields[2] = new JTextField("Officer / Staff");
        textFields[3] = new JTextField("PL No.");
        textFields[4] = new JTextField("Section");
        textFields[5] = new JTextField("Designation");

        for (int i = 0; i < 3; i++) {
            textFields[i].setBounds(x, y, width, height);
            x = x + 150;
        }
        x = 400;
        y =  270;
        for (int j = 3; j < 6; j++) {
            textFields[j].setBounds(x, y, width, height);
            x = x + 150;
        }
    }

    private void createRadioButtons() {
        radioButtons = new JRadioButton[LABEL_TEXTS.length][5];
        radioButtons1 = new JRadioButton[6];
        ButtonGroup buttonGroup = new ButtonGroup();

        int x = 400;
        int y = 420;
        int width = 100;
        int height = 30;

        for (int i = 0; i < 6; i++) {
            x = 400;
            radioButtons1[i] = new JRadioButton(RADIO_BUTTON_LABELS1[i]);
            radioButtons1[i].setBounds(x, y, width, height);
            buttonGroup.add(radioButtons1[i]);
            add(radioButtons1[i]);
            i++;
            x = x + 100;
            radioButtons1[i] = new JRadioButton(RADIO_BUTTON_LABELS1[i]);
            radioButtons1[i].setBounds(x, y, width, height);
            buttonGroup.add(radioButtons1[i]);
            add(radioButtons1[i]);
            y = y + 100;
        }

        x = 400;
        y = 770;
        width = 40;
        height = 30;

        for (int i = 0; i < LABEL_TEXTS.length; i++) {
            for (int j = 0; j < RADIO_BUTTON_LABELS.length; j++) {
                radioButtons[i][j] = new JRadioButton(RADIO_BUTTON_LABELS[j]);
                radioButtons[i][j].setBounds(x, y, width, height);
                buttonGroup.add(radioButtons[i][j]);
                x += width + 10;
            }
            y += height + 30;
            x = 400;
        }
    }

    private void addComponentsToPanel() {
        addLabels();
        addTextFields();
        addRadioButtons();
        addSuggestionFieldAndSubmitButton();
    }

    private void addLabels() {
        add(createLabel("OFFICIUM SYSTEM", 500, 10, 200, 20, 20, SwingConstants.CENTER));
        add(createLabel("FEEDBACK COMPLIANCE REPORT", 400, 70, 400, 20, 20, SwingConstants.CENTER));
        add(createLabel("PERSONAL INFORMATION", 450, 140, 300, 20, 20, SwingConstants.CENTER));
        add(createLabel("SYSTEM INFORMATION", 450, 350, 300, 20, 20, SwingConstants.CENTER));
        add(createLabel("Do you have a PC for the application use?", 400, 400, 800, 20, 20, SwingConstants.LEFT));
        add(createLabel("IsPC connected to the network?", 400, 500, 800, 20, 20, SwingConstants.LEFT));
        add(createLabel("Is PC meeting the minimum requirement of the application (Core i3 & above)?", 400, 600, 800, 20, 20, SwingConstants.LEFT));
        add(createLabel("SOFTWARE INFORMATION SURVEY SCALE", 400, 700, 500, 20, 20, SwingConstants.CENTER));

        for (JLabel label : labels) {
            add(label);
        }
    }

    private JLabel createLabel(String text, int x, int y, int width, int height, int fontSize, int horizontalAlignment) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, width, height);
        label.setFont(new Font("Arial", Font.BOLD, fontSize));
        label.setHorizontalAlignment(horizontalAlignment);
        return label;
    }

    private void addTextFields() {
        for (JTextField textField : textFields) {
            add(textField);
        }
    }

    private void addRadioButtons() {
        for (JRadioButton[] buttonRow : radioButtons) {
            for (JRadioButton button : buttonRow) {
                add(button);
            }
        }
    }

    private void addSuggestionFieldAndSubmitButton() {
        int x = 400;
        int y = 1370;
        int width = 400;
        int height = 150;

        JLabel SuggestionLabel=new JLabel("Suggestion");
        SuggestionLabel.setFont(new Font("Arial", Font.BOLD, 22));
        SuggestionLabel.setBounds(500,1300,300,50);

        add(SuggestionLabel);
        suggestionTextArea = new JTextArea("");
        suggestionTextArea.setBounds(x, y, width, height);
        add(suggestionTextArea);

        JButton submitButton = new JButton("Submit");
       submitButton.setBounds(500,1550,150,50);
        add(submitButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FeedbackReportPanel();
        });
    }
}
