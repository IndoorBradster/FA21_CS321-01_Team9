import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.awt.event.ActionEvent;

public class EducatorUI extends javax.swing.JFrame {

    private JPanel currentPage;
    private final LessonList lessonlist = new LessonList();
    private final QuizList quizzes = new QuizList();
    private Lesson currentLesson = new Lesson();
    private UserList UserList = new UserList();
    private accountcontrol currentUser = new accountcontrol();
    
    /**
     * Creates new form ContactEditorUI
     */
    public EducatorUI() {
        initComponents();
        onInitialize();
    }
    
    // Code that needs to run when initialized
    private void onInitialize() {
        // First page should always be login page
        currentPage = LoginPage;
        
        // Import data from lesson file and updates a lessonlist object
        try {
            File fXmlFile = new File("lessons.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("lesson");
            
            for (int ind = 0; ind < nodeList.getLength(); ind++) {
                Node nNode = nodeList.item(ind);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element tempElement = (Element) nNode;
                    Lesson tempLesson = new Lesson();
                    tempLesson.setLessonID(tempElement.getAttribute("id"));
                    tempLesson.setLessonTitle(tempElement.getElementsByTagName("title").item(0).getTextContent());
                    tempLesson.setLessonContent(tempElement.getElementsByTagName("content").item(0).getTextContent());
                    lessonlist.addLesson(tempLesson);
                }
            }
            
        } 
        catch (IOException | ParserConfigurationException | DOMException | SAXException e) {
            //exception handling done here
        }

        // Import Quizzes
        try {
            File fXmlFile = new File("quizzes.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("quiz");
            
            for (int ind = 0; ind < nodeList.getLength(); ind++) {
                Node nNode = nodeList.item(ind);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element tempElement = (Element) nNode;
                    quiz tempQuiz = new quiz();
                    tempQuiz.setQuizID(tempElement.getAttribute("id"));
                    
                    NodeList questionlist = tempElement.getElementsByTagName("question");
                    for (int j = 0; j < questionlist.getLength(); j++) {
                        Node questionNode = questionlist.item(j);
                        if (questionNode.getNodeType() == Node.ELEMENT_NODE) {
                            Element tempSubElement = (Element) questionNode;
                            Question tempQuestion = new Question();
                            tempQuestion.setQuestionPrompt(tempSubElement.getElementsByTagName("prompt").item(0).getTextContent());
                            tempQuestion.setQuestionNumber(tempSubElement.getElementsByTagName("questionnumber").item(0).getTextContent());
                            tempQuestion.setOptionA(tempSubElement.getElementsByTagName("answer").item(0).getTextContent());
                            tempQuestion.setOptionB(tempSubElement.getElementsByTagName("answer").item(1).getTextContent());
                            tempQuestion.setOptionC(tempSubElement.getElementsByTagName("answer").item(2).getTextContent());
                            tempQuestion.setOptionD(tempSubElement.getElementsByTagName("answer").item(3).getTextContent());
                            tempQuestion.setCorrectAnswer(tempSubElement.getElementsByTagName("correctanswer").item(0).getTextContent());
                            tempQuiz.addQuestion(tempQuestion);
                        }     
                    }
                    quizzes.addQuiz(tempQuiz.getQuizID(), tempQuiz);
                }
            }
        } 
        catch (IOException | ParserConfigurationException | DOMException | SAXException e) {
            //exception handling done here
        }
        
        // Import data from userlist file and updates a userlist object
        try {
            File fXmlFile = new File("users.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("user");
            
            for (int ind = 0; ind < nodeList.getLength(); ind++) {
                Node nNode = nodeList.item(ind);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element tempElement = (Element) nNode;
                    accountcontrol tempUser = new accountcontrol();
                    String userID = tempElement.getAttribute("id");
                    tempUser.setUserName(userID);
                    tempUser.setPassword(tempElement.getElementsByTagName("password").item(0).getTextContent());
                    UserList.addUser(tempUser.getUserName(), tempUser);
                }
            }
            
        } 
        catch (IOException | ParserConfigurationException | DOMException | SAXException e) {
            //exception handling done here
        }
        LoginError.setVisible(false);
        LessonListPageInit(lessonlist);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroup_QuizQuestion1 = new javax.swing.ButtonGroup();
        ButtonGroup_QuizQuestion2 = new javax.swing.ButtonGroup();
        ButtonGroup_QuizQuestion3 = new javax.swing.ButtonGroup();
        QuizContentPanelOld = new javax.swing.JPanel();
        Question1Panel = new javax.swing.JPanel();
        Question1Label = new javax.swing.JLabel();
        Question1ScrollPanel = new javax.swing.JScrollPane();
        Question1TextArea = new javax.swing.JTextArea();
        Question1Option1 = new javax.swing.JRadioButton();
        Question1Option2 = new javax.swing.JRadioButton();
        Question1Option4 = new javax.swing.JRadioButton();
        Question1Option3 = new javax.swing.JRadioButton();
        Question2Panel = new javax.swing.JPanel();
        Question2Label = new javax.swing.JLabel();
        Question2ScrollPanel = new javax.swing.JScrollPane();
        Question2TextArea = new javax.swing.JTextArea();
        Question2Option1 = new javax.swing.JRadioButton();
        Question2Option2 = new javax.swing.JRadioButton();
        Question2Option3 = new javax.swing.JRadioButton();
        Question2Option4 = new javax.swing.JRadioButton();
        Question3Panel = new javax.swing.JPanel();
        Question3Label = new javax.swing.JLabel();
        Question3ScrollPanel = new javax.swing.JScrollPane();
        Question3TextArea = new javax.swing.JTextArea();
        Question3Option1 = new javax.swing.JRadioButton();
        Question3Option2 = new javax.swing.JRadioButton();
        Question3Option3 = new javax.swing.JRadioButton();
        Question3Option4 = new javax.swing.JRadioButton();
        HomeButton = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        ContentPanel = new javax.swing.JPanel();
        LoginPage = new javax.swing.JPanel();
        LoginPromptText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        LoginError = new javax.swing.JLabel();
        HomePage = new javax.swing.JPanel();
        WelcomeTitle = new javax.swing.JLabel();
        LessonsButton = new javax.swing.JButton();
        ScoresButton = new javax.swing.JButton();
        LessonSelectPage = new javax.swing.JPanel();
        LessonsText = new javax.swing.JLabel();
        LessonListScrollPanel = new javax.swing.JScrollPane();
        LessonListPanel = new javax.swing.JPanel();
        LessonPage = new javax.swing.JPanel();
        LessonTitle = new javax.swing.JLabel();
        LessonScrollPanel = new javax.swing.JScrollPane();
        LessonContentTextPanel = new javax.swing.JTextArea();
        QuizButton = new javax.swing.JButton();
        QuizPage = new javax.swing.JPanel();
        QuizTitle = new javax.swing.JLabel();
        QuizScrollPanel = new javax.swing.JScrollPane();
        QuizContentPanel = new javax.swing.JPanel();
        SubmitQuizButton = new javax.swing.JButton();
        GradeBookPage = new javax.swing.JPanel();
        GradeBookLabel = new javax.swing.JLabel();
        GradeBookScrollPanel = new javax.swing.JScrollPane();
        GradeBookPanel = new javax.swing.JPanel();

        Question1Label.setText("Question 1:");

        Question1TextArea.setColumns(5);
        Question1TextArea.setLineWrap(true);
        Question1TextArea.setRows(5);
        Question1TextArea.setText("This is question 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam cursus, est eget efficitur dignissim, neque ligula tristique mauris, vel vestibulum purus nulla ac ante.");
        Question1TextArea.setWrapStyleWord(true);
        Question1ScrollPanel.setViewportView(Question1TextArea);

        ButtonGroup_QuizQuestion1.add(Question1Option1);
        Question1Option1.setText("Answer A");

        ButtonGroup_QuizQuestion1.add(Question1Option2);
        Question1Option2.setText("Answer B");

        ButtonGroup_QuizQuestion1.add(Question1Option4);
        Question1Option4.setText("Answer D");

        ButtonGroup_QuizQuestion1.add(Question1Option3);
        Question1Option3.setText("Answer C");
        Question1Option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question1Option3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Question1PanelLayout = new javax.swing.GroupLayout(Question1Panel);
        Question1Panel.setLayout(Question1PanelLayout);
        Question1PanelLayout.setHorizontalGroup(
            Question1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Question1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Question1ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Question1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Question1PanelLayout.createSequentialGroup()
                        .addGroup(Question1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Question1Option2)
                            .addComponent(Question1Option1))
                        .addGap(18, 18, 18)
                        .addGroup(Question1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Question1Option4)
                            .addComponent(Question1Option3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question1PanelLayout.setVerticalGroup(
            Question1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Question1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question1ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(Question1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question1Option1)
                    .addComponent(Question1Option3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Question1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Question1Option4)
                    .addComponent(Question1Option2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Question2Label.setText("Question 2:");

        Question2TextArea.setColumns(5);
        Question2TextArea.setLineWrap(true);
        Question2TextArea.setRows(5);
        Question2TextArea.setText("This is question 2. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam cursus, est eget efficitur dignissim, neque ligula tristique mauris, vel vestibulum purus nulla ac ante.");
        Question2TextArea.setWrapStyleWord(true);
        Question2ScrollPanel.setViewportView(Question2TextArea);

        ButtonGroup_QuizQuestion2.add(Question2Option1);
        Question2Option1.setText("Answer A");

        ButtonGroup_QuizQuestion2.add(Question2Option2);
        Question2Option2.setText("Answer B");

        ButtonGroup_QuizQuestion2.add(Question2Option3);
        Question2Option3.setText("Answer D");

        ButtonGroup_QuizQuestion2.add(Question2Option4);
        Question2Option4.setText("Answer C");

        javax.swing.GroupLayout Question2PanelLayout = new javax.swing.GroupLayout(Question2Panel);
        Question2Panel.setLayout(Question2PanelLayout);
        Question2PanelLayout.setHorizontalGroup(
            Question2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Question2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Question2ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Question2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Question2PanelLayout.createSequentialGroup()
                        .addGroup(Question2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Question2Option2)
                            .addComponent(Question2Option1))
                        .addGap(18, 18, 18)
                        .addGroup(Question2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Question2Option3)
                            .addComponent(Question2Option4))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        Question2PanelLayout.setVerticalGroup(
            Question2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Question2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question2ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(Question2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question2Option1)
                    .addComponent(Question2Option4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Question2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Question2Option3)
                    .addComponent(Question2Option2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Question3Label.setText("Question 3:");

        Question3TextArea.setColumns(5);
        Question3TextArea.setLineWrap(true);
        Question3TextArea.setRows(5);
        Question3TextArea.setText("This is question 3. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam cursus, est eget efficitur dignissim, neque ligula tristique mauris, vel vestibulum purus nulla ac ante.");
        Question3TextArea.setWrapStyleWord(true);
        Question3ScrollPanel.setViewportView(Question3TextArea);

        ButtonGroup_QuizQuestion3.add(Question3Option1);
        Question3Option1.setText("Answer A");

        ButtonGroup_QuizQuestion3.add(Question3Option2);
        Question3Option2.setText("Answer B");

        ButtonGroup_QuizQuestion3.add(Question3Option3);
        Question3Option3.setText("Answer D");

        ButtonGroup_QuizQuestion3.add(Question3Option4);
        Question3Option4.setText("Answer C");

        javax.swing.GroupLayout Question3PanelLayout = new javax.swing.GroupLayout(Question3Panel);
        Question3Panel.setLayout(Question3PanelLayout);
        Question3PanelLayout.setHorizontalGroup(
            Question3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Question3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Question3ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Question3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Question3PanelLayout.createSequentialGroup()
                        .addGroup(Question3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Question3Option2)
                            .addComponent(Question3Option1))
                        .addGap(18, 18, 18)
                        .addGroup(Question3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Question3Option3)
                            .addComponent(Question3Option4))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        Question3PanelLayout.setVerticalGroup(
            Question3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Question3Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question3ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(Question3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question3Option1)
                    .addComponent(Question3Option4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Question3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Question3Option3)
                    .addComponent(Question3Option2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout QuizContentPanelOldLayout = new javax.swing.GroupLayout(QuizContentPanelOld);
        QuizContentPanelOld.setLayout(QuizContentPanelOldLayout);
        QuizContentPanelOldLayout.setHorizontalGroup(
            QuizContentPanelOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizContentPanelOldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuizContentPanelOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Question1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Question2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Question3Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        QuizContentPanelOldLayout.setVerticalGroup(
            QuizContentPanelOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizContentPanelOldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Question1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Question2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Question3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(10, 10));
        setName("Shell"); // NOI18N

        HomeButton.setEnabled(false);
        HomeButton.setLabel("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        LogOutButton.setText("LogOut");
        LogOutButton.setEnabled(false);
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        ContentPanel.setLayout(new java.awt.CardLayout());

        LoginPromptText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginPromptText.setText("Please Login");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        UsernameField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                UsernameFieldInputMethodTextChanged(evt);
            }
        });
        UsernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsernameFieldKeyTyped(evt);
            }
        });

        UsernameLabel.setText("Username:");

        PasswordLabel.setText("Password:");

        LoginButton.setText("Login");
        LoginButton.setName(""); // NOI18N
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        LoginError.setForeground(new java.awt.Color(255, 0, 0));
        LoginError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginError.setText("Incorrect Username or Password. Please try again.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameLabel)
                    .addComponent(PasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(PasswordField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(LoginError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(LoginButton)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameLabel)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginError)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout LoginPageLayout = new javax.swing.GroupLayout(LoginPage);
        LoginPage.setLayout(LoginPageLayout);
        LoginPageLayout.setHorizontalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginPromptText, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        LoginPageLayout.setVerticalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(LoginPromptText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        ContentPanel.add(LoginPage, "card2");

        WelcomeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeTitle.setText("Welcome!");

        LessonsButton.setText("Lessons");
        LessonsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LessonsButtonActionPerformed(evt);
            }
        });

        ScoresButton.setText("Scores");
        ScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoresButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(WelcomeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(ScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LessonsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(195, 195, 195))
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(WelcomeTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LessonsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(370, Short.MAX_VALUE))
        );

        ContentPanel.add(HomePage, "card2");

        LessonsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LessonsText.setText("Lessons");
        LessonsText.setToolTipText("");

        LessonListScrollPanel.setToolTipText("");

        javax.swing.GroupLayout LessonListPanelLayout = new javax.swing.GroupLayout(LessonListPanel);
        LessonListPanel.setLayout(LessonListPanelLayout);
        LessonListPanelLayout.setHorizontalGroup(
            LessonListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        LessonListPanelLayout.setVerticalGroup(
            LessonListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        LessonListScrollPanel.setViewportView(LessonListPanel);

        javax.swing.GroupLayout LessonSelectPageLayout = new javax.swing.GroupLayout(LessonSelectPage);
        LessonSelectPage.setLayout(LessonSelectPageLayout);
        LessonSelectPageLayout.setHorizontalGroup(
            LessonSelectPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LessonSelectPageLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(LessonsText, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addGap(44, 44, 44))
            .addGroup(LessonSelectPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LessonSelectPageLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LessonListScrollPanel)
                    .addContainerGap()))
        );
        LessonSelectPageLayout.setVerticalGroup(
            LessonSelectPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LessonSelectPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LessonsText)
                .addContainerGap(472, Short.MAX_VALUE))
            .addGroup(LessonSelectPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LessonSelectPageLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(LessonListScrollPanel)
                    .addGap(46, 46, 46)))
        );

        ContentPanel.add(LessonSelectPage, "card2");

        LessonTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LessonTitle.setText("Lesson 1:");

        LessonContentTextPanel.setColumns(20);
        LessonContentTextPanel.setLineWrap(true);
        LessonContentTextPanel.setRows(5);
        LessonContentTextPanel.setText("    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam cursus, est eget efficitur dignissim, neque ligula tristique mauris, vel vestibulum purus nulla ac ante. Mauris porttitor nibh at imperdiet interdum. Nunc ut mauris quam. In sollicitudin nibh ac enim venenatis facilisis. Duis vitae tempus velit, id pharetra risus. Aenean non molestie erat. Suspendisse ac nunc est. Aenean ex quam, accumsan sit amet ultricies ac, elementum molestie tortor. Cras id semper odio. Duis egestas tellus justo, id rutrum arcu eleifend ut. Praesent sit amet est eget dui dictum pellentesque.\n\n    Cras consectetur tristique ex a euismod. Maecenas accumsan sed augue id malesuada. Donec erat turpis, interdum id vestibulum vel, lacinia a velit. Maecenas metus ipsum, suscipit id velit et, posuere efficitur eros. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Mauris eu lorem elit. Pellentesque ultricies eu ipsum sodales accumsan. Pellentesque gravida sit amet nunc in condimentum.\n\n    Sed et viverra sapien. Nunc faucibus orci eu quam pharetra viverra. Pellentesque tristique pretium semper. Sed bibendum felis et lorem scelerisque efficitur. Fusce ac sem risus. Aliquam nec nisl tempor, auctor erat eu, consequat eros. Donec nec pellentesque eros. Nullam tincidunt ultricies velit vitae ullamcorper. Aenean sagittis dignissim arcu ac porttitor. Quisque ligula eros, mattis at iaculis quis, facilisis quis urna.\n\n    Nunc sed sem quis augue dapibus hendrerit ut sed orci. Proin turpis nunc, pharetra et commodo nec, rutrum sodales nibh. Etiam ultricies pulvinar ante, eget molestie libero. Fusce viverra quis lorem vitae tincidunt. Phasellus tortor metus, congue in ex ornare, euismod faucibus nisl. Ut diam lacus, porta sed elit nec, ultrices tempus magna. Fusce diam purus, viverra eu dignissim eu, malesuada sed ipsum. Nulla a aliquet nisl, quis varius leo. Nullam eget vestibulum orci. Cras at aliquam arcu. Etiam diam dolor, ullamcorper vitae malesuada nec, tristique a magna. Donec a venenatis magna. Donec a nisl id libero varius pulvinar. Aliquam consequat sapien id nunc dignissim, eget vulputate leo scelerisque. Phasellus ut fermentum nulla.\n\n    Nulla iaculis dolor venenatis elit eleifend facilisis. Cras imperdiet ac magna vitae scelerisque. Etiam non elit in velit luctus laoreet a in libero. Aliquam nec quam velit. Quisque condimentum mauris tellus, vehicula sollicitudin ipsum porta vitae. In at venenatis augue, vel venenatis ante. Aenean sit amet vulputate velit. In nec velit vel lacus hendrerit condimentum quis sed elit. Mauris at pharetra ante.");
        LessonContentTextPanel.setWrapStyleWord(true);
        LessonScrollPanel.setViewportView(LessonContentTextPanel);

        QuizButton.setText("Take Quiz");
        QuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LessonPageLayout = new javax.swing.GroupLayout(LessonPage);
        LessonPage.setLayout(LessonPageLayout);
        LessonPageLayout.setHorizontalGroup(
            LessonPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LessonPageLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(LessonPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LessonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LessonPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(QuizButton)
                        .addComponent(LessonScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        LessonPageLayout.setVerticalGroup(
            LessonPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LessonPageLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(LessonTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LessonScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuizButton)
                .addGap(52, 52, 52))
        );

        ContentPanel.add(LessonPage, "card2");

        QuizTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        QuizTitle.setText("Quiz 1:");

        javax.swing.GroupLayout QuizContentPanelLayout = new javax.swing.GroupLayout(QuizContentPanel);
        QuizContentPanel.setLayout(QuizContentPanelLayout);
        QuizContentPanelLayout.setHorizontalGroup(
            QuizContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        QuizContentPanelLayout.setVerticalGroup(
            QuizContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        QuizScrollPanel.setViewportView(QuizContentPanel);

        SubmitQuizButton.setText("Submit Quiz");
        SubmitQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitQuizButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout QuizPageLayout = new javax.swing.GroupLayout(QuizPage);
        QuizPage.setLayout(QuizPageLayout);
        QuizPageLayout.setHorizontalGroup(
            QuizPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPageLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(QuizPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QuizTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(QuizPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SubmitQuizButton)
                        .addComponent(QuizScrollPanel)))
                .addGap(50, 50, 50))
        );
        QuizPageLayout.setVerticalGroup(
            QuizPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPageLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(QuizTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuizScrollPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubmitQuizButton)
                .addGap(52, 52, 52))
        );

        ContentPanel.add(QuizPage, "card2");

        GradeBookLabel.setText("Gradebook");

        javax.swing.GroupLayout GradeBookPanelLayout = new javax.swing.GroupLayout(GradeBookPanel);
        GradeBookPanel.setLayout(GradeBookPanelLayout);
        GradeBookPanelLayout.setHorizontalGroup(
            GradeBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        GradeBookPanelLayout.setVerticalGroup(
            GradeBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        GradeBookScrollPanel.setViewportView(GradeBookPanel);

        javax.swing.GroupLayout GradeBookPageLayout = new javax.swing.GroupLayout(GradeBookPage);
        GradeBookPage.setLayout(GradeBookPageLayout);
        GradeBookPageLayout.setHorizontalGroup(
            GradeBookPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GradeBookPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GradeBookScrollPanel)
                .addContainerGap())
            .addGroup(GradeBookPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GradeBookPageLayout.createSequentialGroup()
                    .addContainerGap(287, Short.MAX_VALUE)
                    .addComponent(GradeBookLabel)
                    .addContainerGap(287, Short.MAX_VALUE)))
        );
        GradeBookPageLayout.setVerticalGroup(
            GradeBookPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GradeBookPageLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(GradeBookScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(GradeBookPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GradeBookPageLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(GradeBookLabel)
                    .addContainerGap(499, Short.MAX_VALUE)))
        );

        ContentPanel.add(GradeBookPage, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HomeButton)
                    .addComponent(LogOutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        currentUser = null;
        swapPanel(LoginPage);
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        swapPanel(HomePage);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void LessonsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LessonsButtonActionPerformed
        swapPanel(LessonSelectPage);
    }//GEN-LAST:event_LessonsButtonActionPerformed

    private void ScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoresButtonActionPerformed
        initGradeBookPage();
        swapPanel(GradeBookPage);
    }//GEN-LAST:event_ScoresButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        try {
            currentUser = UserList.getUser(UsernameField.getText(), String.valueOf(PasswordField.getPassword()));
            if (currentUser.getPassword().equals(String.valueOf(PasswordField.getPassword()))) {
               swapPanel(HomePage);
                LogOutButton.setEnabled(true);
            }
            else {
                LoginError.setVisible(true);
            }
            
        } catch (NullPointerException e) {
            LoginError.setVisible(true);
        }   
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void QuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizButtonActionPerformed
        swapPanel(QuizPage);
        LogOutButton.setEnabled(false);
        HomeButton.setEnabled(false);
        QuizPageInit(currentLesson);
    }//GEN-LAST:event_QuizButtonActionPerformed

    private void SubmitQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitQuizButtonActionPerformed
        String LessonID = currentLesson.getLessonID();
        int score = quizzes.getQuiz(LessonID).calculateScore();
        Grade grade = new Grade();
        grade.setGrade(LessonID, score);
        currentUser.addGrade(LessonID, grade);
        
        initGradeBookPage();
        swapPanel(GradeBookPage);
        
    }//GEN-LAST:event_SubmitQuizButtonActionPerformed

    private void Question1Option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question1Option3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Question1Option3ActionPerformed

    private void UsernameFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_UsernameFieldInputMethodTextChanged
        
        String Username = (String) evt.getText().toString();
    }//GEN-LAST:event_UsernameFieldInputMethodTextChanged

    private void UsernameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameFieldKeyTyped
        String UsernameKeys = (String) evt.toString();
    }//GEN-LAST:event_UsernameFieldKeyTyped

    private void LessonActionPerformed(ActionEvent evt) {
        LessonButton lessonbutton = (LessonButton) evt.getSource();
        currentLesson = (Lesson) lessonbutton.getLesson();
        swapPanel(LessonPage);
        LessonPageInit(currentLesson);
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroup_QuizQuestion1;
    private javax.swing.ButtonGroup ButtonGroup_QuizQuestion2;
    private javax.swing.ButtonGroup ButtonGroup_QuizQuestion3;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JLabel GradeBookLabel;
    private javax.swing.JPanel GradeBookPage;
    private javax.swing.JPanel GradeBookPanel;
    private javax.swing.JScrollPane GradeBookScrollPanel;
    private javax.swing.JButton HomeButton;
    private javax.swing.JPanel HomePage;
    private javax.swing.JTextArea LessonContentTextPanel;
    private javax.swing.JPanel LessonListPanel;
    private javax.swing.JScrollPane LessonListScrollPanel;
    private javax.swing.JPanel LessonPage;
    private javax.swing.JScrollPane LessonScrollPanel;
    private javax.swing.JPanel LessonSelectPage;
    private javax.swing.JLabel LessonTitle;
    private javax.swing.JButton LessonsButton;
    private javax.swing.JLabel LessonsText;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginError;
    private javax.swing.JPanel LoginPage;
    private javax.swing.JLabel LoginPromptText;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel Question1Label;
    private javax.swing.JRadioButton Question1Option1;
    private javax.swing.JRadioButton Question1Option2;
    private javax.swing.JRadioButton Question1Option3;
    private javax.swing.JRadioButton Question1Option4;
    private javax.swing.JPanel Question1Panel;
    private javax.swing.JScrollPane Question1ScrollPanel;
    private javax.swing.JTextArea Question1TextArea;
    private javax.swing.JLabel Question2Label;
    private javax.swing.JRadioButton Question2Option1;
    private javax.swing.JRadioButton Question2Option2;
    private javax.swing.JRadioButton Question2Option3;
    private javax.swing.JRadioButton Question2Option4;
    private javax.swing.JPanel Question2Panel;
    private javax.swing.JScrollPane Question2ScrollPanel;
    private javax.swing.JTextArea Question2TextArea;
    private javax.swing.JLabel Question3Label;
    private javax.swing.JRadioButton Question3Option1;
    private javax.swing.JRadioButton Question3Option2;
    private javax.swing.JRadioButton Question3Option3;
    private javax.swing.JRadioButton Question3Option4;
    private javax.swing.JPanel Question3Panel;
    private javax.swing.JScrollPane Question3ScrollPanel;
    private javax.swing.JTextArea Question3TextArea;
    private javax.swing.JButton QuizButton;
    private javax.swing.JPanel QuizContentPanel;
    private javax.swing.JPanel QuizContentPanelOld;
    private javax.swing.JPanel QuizPage;
    private javax.swing.JScrollPane QuizScrollPanel;
    private javax.swing.JLabel QuizTitle;
    private javax.swing.JButton ScoresButton;
    private javax.swing.JButton SubmitQuizButton;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel WelcomeTitle;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
    private void swapPanel(JPanel Target) {
        // Enable Main Buttons
        HomeButton.setEnabled(true);
        LogOutButton.setEnabled(true);
        
        // Swap panels
        currentPage.setVisible(false);      // Disable the current page
        Target.setVisible(true);            // Enable the target page
        
        // Set the current page to the target
        currentPage = Target;               
        
        // Disabled the mainbuttons on certain pages
        if(currentPage == LoginPage) {    
            HomeButton.setEnabled(false);
            LogOutButton.setEnabled(false);
        }
        if(currentPage == HomePage) {
            HomeButton.setEnabled(false);
        }
    }

    private void LessonListPageInit(LessonList lessonlist) {

        Lesson Lesson;
        int dimy = 0;
        for (Iterator<Lesson> it = lessonlist.getLessons().iterator(); it.hasNext();) {
            Lesson = it.next();
            LessonButton button = new LessonButton();
            button.setText(Lesson.getLessonTitle());
            button.setLesson(Lesson);
            button.setBounds(12,12+dimy,LessonListPanel.getWidth()-24,50);
            LessonListPanel.add(button);
            button.setVisible(true);
            dimy+=50;
            
            LessonListPanel.setSize(LessonListPanel.getWidth(), LessonListPanel.getHeight()+dimy);
            
            button.addActionListener((java.awt.event.ActionEvent evt) -> {
                LessonActionPerformed(evt);
            });
        }
        LessonListPanel.setVisible(true);
    }
    
    private void LessonPageInit(Lesson lesson) {
        LessonTitle.setText(lesson.getLessonTitle());
        LessonContentTextPanel.setText(lesson.getLessonContent());
    }
    
    private void QuizPageInit(Lesson lesson) {
        
        Question question;
        int dimy = 0;
        quiz Quiz = quizzes.getQuiz(lesson.getLessonID());
        QuizTitle.setText(lesson.getLessonTitle());
        QuizContentPanel.removeAll();
        QuizContentPanel.revalidate();
        
        for (Iterator<Question> it = Quiz.getQuestions().iterator(); it.hasNext();) {
            question = it.next();

            QuizQuestionPanel questionpanel = new QuizQuestionPanel();
            questionpanel.initQuestionPanel(question, Quiz);
            questionpanel.setLabel(question.getQuestionPrompt());
            questionpanel.QuestionPromptText.setBounds(12, 12+dimy, (QuizContentPanel.getWidth()-48), 100);
            questionpanel.QuestionPromptText.setWrapStyleWord(true);

            questionpanel.setBounds(12, 12+dimy, (QuizContentPanel.getWidth()-24), 100);
            questionpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            QuizContentPanel.add(questionpanel);
            questionpanel.setVisible(true);

            dimy+=100;
        }
        QuizContentPanel.setVisible(true);
    }
    
    private void initGradeBookPage() {
        GradeBookPanel.removeAll();
        GradeBookPanel.revalidate();
        Lesson Lesson;
        int dimy = 0;
        for (Iterator<Lesson> it = lessonlist.getLessons().iterator(); it.hasNext();) {
            Lesson = it.next();
            JPanel gradePanel = new JPanel();
            gradePanel.setBounds(12, 12+dimy, (GradeBookPanel.getWidth()-24), 30);
            JLabel gradeLessonLabel = new JLabel(Lesson.getLessonTitle());

            
            JLabel gradeScoreLabel = new JLabel("--");
            gradeLessonLabel.setText(Lesson.getLessonTitle());
            try {
                String gradeScoreText = String.valueOf(currentUser.getGrade(Lesson.getLessonID()));
                gradeScoreLabel.setText(gradeScoreText);
            }
            catch(NullPointerException e) {
            }

            
            gradePanel.add(gradeLessonLabel);
            gradePanel.add(gradeScoreLabel);
            
            gradePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            GradeBookPanel.add(gradePanel);
            gradeLessonLabel.updateUI();
            dimy+=42;
        }
    }
}
