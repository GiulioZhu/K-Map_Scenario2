import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.*;


public class UI {
    JFrame frame = new JFrame("K-Map");
    Font titleF = new Font("serif", Font.BOLD, 36);
    Font normalT = new Font("serif", Font.BOLD, 20);
    Font big = new Font("serif", Font.BOLD, 30);
    Question bank = new Question();
    Random rd = new Random();
    static int generatedNum;

    
    public int toInt(String text) {
        return Integer.parseInt(text);
    }

    // Buttons for the k-map
    /*
     * Table Combinations (Depending on the variables their size and position will vary)
     *   1 2   | 1 2 3 4 |   1 2 3 4
     *   3 4   | 5 6 7 8 |   5 6 7 8
     *         |         |   9 10 11 12
     *         |         |   13 14 15 16
     * 
     */
    JButton r1 = new JButton("0");
    JButton r2 = new JButton("0");
    JButton r3 = new JButton("0");
    JButton r4 = new JButton("0");
    JButton r5 = new JButton("0");
    JButton r6 = new JButton("0");
    JButton r7 = new JButton("0");
    JButton r8 = new JButton("0");
    JButton r9 = new JButton("0");
    JButton r10 = new JButton("0");
    JButton r11 = new JButton("0");
    JButton r12 = new JButton("0");
    JButton r13 = new JButton("0");
    JButton r14 = new JButton("0");
    JButton r15 = new JButton("0");
    JButton r16 = new JButton("0");

    // Labels for table
    JLabel a = new JLabel("A");
    JLabel b = new JLabel("B");
    JLabel c = new JLabel("C");
    JLabel ab = new JLabel("AB");
    JLabel cd = new JLabel("CD");
    JLabel t = new JLabel("1");
    JLabel f = new JLabel("0");
    JLabel ff = new JLabel("00");
    JLabel ft = new JLabel("01");
    JLabel tf = new JLabel("10");
    JLabel tt = new JLabel("11");

    // Clones
    JLabel t1 = clone(t);
    JLabel f1 = clone(f);
    JLabel ff1 = clone(ff);
    JLabel ft1 = clone(ft);
    JLabel tf1 = clone(tf);
    JLabel tt1 = clone(tt);

    // Simplify Button
    JButton simplify = new JButton("Simplify");
    JLabel expression = new JLabel("Expression:");

    // Sets all table values
    public void initializeTable() {
        // Simplify button
        simplify.setFont(normalT);
        simplify.setBounds(350, 700, 300, 50);
        expression.setFont(normalT);
        expression.setBounds(350, 650, 300, 50);

        // Text
        r1.setFont(big);
        r2.setFont(big);
        r3.setFont(big);
        r4.setFont(big);
        r5.setFont(big);
        r6.setFont(big);
        r7.setFont(big);
        r8.setFont(big);
        r9.setFont(big);
        r10.setFont(big);
        r11.setFont(big);
        r12.setFont(big);
        r13.setFont(big);
        r14.setFont(big);
        r15.setFont(big);
        r16.setFont(big);

        r1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r1.getText().equals("0")) {
                    r1.setText("1");
                } else {
                    r1.setText("0");
                } 
            }
        });

        r2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r2.getText().equals("0")) {
                    r2.setText("1");
                } else {
                    r2.setText("0");
                } 
            }
        });

        r3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r3.getText().equals("0")) {
                    r3.setText("1");
                } else {
                    r3.setText("0");
                } 
            }
        });

        r4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r4.getText().equals("0")) {
                    r4.setText("1");
                } else {
                    r4.setText("0");
                } 
            }
        });

        r5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r5.getText().equals("0")) {
                    r5.setText("1");
                } else {
                    r5.setText("0");
                } 
            }
        });

        r6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r6.getText().equals("0")) {
                    r6.setText("1");
                } else {
                    r6.setText("0");
                } 
            }
        });

        r7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r7.getText().equals("0")) {
                    r7.setText("1");
                } else {
                    r7.setText("0");
                } 
            }
        });

        r8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r8.getText().equals("0")) {
                    r8.setText("1");
                } else {
                    r8.setText("0");
                } 
            }
        });

        r9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r9.getText().equals("0")) {
                    r9.setText("1");
                } else {
                    r9.setText("0");
                } 
            }
        });

        r10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r10.getText().equals("0")) {
                    r10.setText("1");
                } else {
                    r10.setText("0");
                } 
            }
        });

        r11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r11.getText().equals("0")) {
                    r11.setText("1");
                } else {
                    r11.setText("0");
                } 
            }
        });

        r12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r12.getText().equals("0")) {
                    r12.setText("1");
                } else {
                    r12.setText("0");
                } 
            }
        });

        r13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r13.getText().equals("0")) {
                    r13.setText("1");
                } else {
                    r13.setText("0");
                } 
            }
        });

        r14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r14.getText().equals("0")) {
                    r14.setText("1");
                } else {
                    r14.setText("0");
                } 
            }
        });

        r15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r15.getText().equals("0")) {
                    r15.setText("1");
                } else {
                    r15.setText("0");
                } 
            }
        });

        r16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r16.getText().equals("0")) {
                    r16.setText("1");
                } else {
                    r16.setText("0");
                } 
            }
        });
    }

    public void removeTable() {
        // resets all texts
        r1.setText("0"); r2.setText("0"); r3.setText("0");
        r4.setText("0"); r5.setText("0"); r6.setText("0");
        r7.setText("0"); r8.setText("0"); r9.setText("0");
        r10.setText("0"); r11.setText("0"); r12.setText("0");
        r13.setText("0"); r14.setText("0"); r15.setText("0"); 
        r16.setText("0"); expression.setText("Expression:");

        frame.remove(r1); frame.remove(r2); frame.remove(r3); frame.remove(r4); frame.remove(r5);
        frame.remove(r6); frame.remove(r7); frame.remove(r8); frame.remove(r9); frame.remove(r10); 
        frame.remove(r11); frame.remove(r12); frame.remove(r13); frame.remove(r14); frame.remove(r15);
        frame.remove(r16); frame.remove(simplify); frame.remove(expression); frame.remove(a); 
        frame.remove(b); frame.remove(c); frame.remove(ab); frame.remove(cd); frame.remove(ff); 
        frame.remove(tf); frame.remove(ft); frame.remove(tt); frame.remove(t); frame.remove(f);
        frame.remove(f1); frame.remove(t1); frame.remove(tf1); frame.remove(ft1); frame.remove(tt1);
        frame.remove(ff1);
    } 

    public JLabel clone(JLabel clone) {
        return new JLabel(clone.getText());
    }

	public void run() {
        // setting up
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true);
        initializeTable();
        menu();
	}



    public void menu() {
        // UI Elements
        JLabel title = new JLabel("Karnaugh Map for COMP0003");
        JButton exit = new JButton ("EXIT");
        JButton kmap = new JButton ("KARNAUGH MAP");
        JButton exercises = new JButton ("EXERCISES");

        // Title
        title.setBounds(250, 0, 600, 50);
        title.setFont(titleF);


        // Exit
        exit.setFont(normalT);
        exit.setBounds(350, 700, 300, 100);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bank.save();
                System.exit(1);
            }
        });

        // K-map
        kmap.setFont(normalT);
        kmap.setBounds(350, 300, 300, 100);
        kmap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.remove(title); frame.remove(exit); frame.remove(kmap); frame.remove(exercises);
                kMap();
            }
        });

        // Exercises
        exercises.setFont(normalT);
        exercises.setBounds(350, 500, 300, 100);
        exercises.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.remove(title); frame.remove(exit); frame.remove(kmap); frame.remove(exercises);
                exercises();
            }
        });

        frame.add(exit); frame.add(kmap); frame.add(title); frame.add(exercises); 
        frame.setVisible(true);
    }

    public void kMap() {
        // Title
        JLabel title = new JLabel("Karnaugh Map");
        title.setBounds(380, 0, 600, 50);
        title.setFont(titleF);

        // 2 Variable
        JButton v2 = new JButton("2 Variable");
        v2.setFont(normalT);
        v2.setBounds(200, 70, 200, 30);
        v2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                removeTable();
                twoVariable();
            }
        });

        // 3 Variable
        JButton v3 = new JButton("3 Variable");
        v3.setFont(normalT);
        v3.setBounds(400, 70, 200, 30);
        v3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                removeTable();
                threeVariable();
            }
        });

        // 4 Variable
        JButton v4 = new JButton("4 Variable");
        v4.setFont(normalT);
        v4.setBounds(600, 70, 200, 30);
        v4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                removeTable();
                fourVariable();
            }
        });

        // Back
        JButton back = new JButton ("BACK");
        back.setFont(normalT);
        back.setBounds(350, 800, 300, 50);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.remove(title); frame.remove(back); frame.remove(v2); frame.remove(v3); frame.remove(v4); 
                removeTable();
                menu();
            }
        });

        frame.add(title); frame.add(back); frame.add(v2); frame.add(v3); frame.add(v4);
        frame.setVisible(true);
    }

    public void twoVariable() {
        // Text Settings
        a.setBounds(260, 180, 20, 20);
        a.setFont(normalT);
        b.setBounds(280, 160, 20, 20);
        b.setFont(normalT);

        t.setBounds(590, 180, 20, 20);
        t.setFont(normalT);
        f.setBounds(390, 180, 20, 20);
        f.setFont(normalT);
        
        t1.setBounds(280, 290, 20, 20);
        t1.setFont(normalT);
        f1.setBounds(280, 490, 20, 20);
        f1.setFont(normalT);

        // Bounds
        r1.setBounds(300, 200, 200, 200);
        r2.setBounds(500, 200, 200, 200);
        r3.setBounds(300, 400, 200, 200);
        r4.setBounds(500, 400, 200, 200);

        // Simplification
        simplify.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[][][] groups;
                int[][] map = {
                    {toInt(r1.getText()), toInt(r2.getText())},
                    {toInt(r3.getText()), toInt(r4.getText())}
                };
                KarnaughMap solver = new KarnaughMap(map);
                groups = solver.Group();
                expression.setText("Expression: " + solver.generateBooleanExpression(groups));
            }
        });

        frame.add(r1); frame.add(r2); frame.add(r3); frame.add(r4); frame.add(simplify); frame.add(expression);
        frame.add(a); frame.add(b); frame.add(t); frame.add(f); frame.add(t1); frame.add(f1);
        frame.setVisible(true);
    }

    public void threeVariable() {
        // Text Settings
        ab.setBounds(280, 160, 40, 20);
        ab.setFont(normalT);
        c.setBounds(260, 180, 20, 20);
        c.setFont(normalT);

        ff.setBounds(340, 180, 40, 20);
        ff.setFont(normalT);
        ft.setBounds(440, 180, 40, 20);
        ft.setFont(normalT);
        tt.setBounds(540, 180, 40, 20);
        tt.setFont(normalT);
        tf.setBounds(640, 180, 40, 20);
        tf.setFont(normalT);
        t.setBounds(280, 240, 20, 20);
        t.setFont(normalT);
        f.setBounds(280, 340, 20, 20);
        f.setFont(normalT);

        // Bounds
        r1.setBounds(300, 200, 100, 100);
        r2.setBounds(400, 200, 100, 100);
        r3.setBounds(500, 200, 100, 100);
        r4.setBounds(600, 200, 100, 100);
        r5.setBounds(300, 300, 100, 100);
        r6.setBounds(400, 300, 100, 100);
        r7.setBounds(500, 300, 100, 100);
        r8.setBounds(600, 300, 100, 100);

        // Simplification
        simplify.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[][][] groups;
                int[][] map = {
                    {toInt(r1.getText()), toInt(r2.getText()), toInt(r3.getText()), toInt(r4.getText())},
                    {toInt(r5.getText()), toInt(r6.getText()), toInt(r7.getText()), toInt(r8.getText())}
                };
                KarnaughMap solver = new KarnaughMap(map);
                groups = solver.Group();
                expression.setText("Expression: " + solver.generateBooleanExpression(groups));
            }
        });


        frame.add(r1); frame.add(r2); frame.add(r3); frame.add(r4); frame.add(r5); frame.add(r6); 
        frame.add(r7); frame.add(r8); frame.add(simplify); frame.add(expression);
        frame.add(ab); frame.add(c); frame.add(ff); frame.add(ft); frame.add(tt); frame.add(tf); 
        frame.add(t); frame.add(f);
        frame.setVisible(true);
    }

    public void fourVariable() {
        // Text Settings
        ab.setBounds(250, 180, 40, 20);
        ab.setFont(normalT);
        cd.setBounds(290, 160, 40, 20);
        cd.setFont(normalT);

        // Horizontal
        ff.setBounds(340, 180, 40, 20);
        ff.setFont(normalT);
        ft.setBounds(440, 180, 40, 20);
        ft.setFont(normalT);
        tt.setBounds(540, 180, 40, 20);
        tt.setFont(normalT);
        tf.setBounds(640, 180, 40, 20);
        tf.setFont(normalT);
        
        // Vertical
        ff1.setBounds(260, 240, 40, 20);
        ff1.setFont(normalT);
        ft1.setBounds(260, 340, 40, 20);
        ft1.setFont(normalT);
        tt1.setBounds(260, 440, 40, 20);
        tt1.setFont(normalT);
        tf1.setBounds(260, 540, 40, 20);
        tf1.setFont(normalT);

        // Bounds
        r1.setBounds(300, 200, 100, 100);
        r2.setBounds(400, 200, 100, 100);
        r3.setBounds(500, 200, 100, 100);
        r4.setBounds(600, 200, 100, 100);
        r5.setBounds(300, 300, 100, 100);
        r6.setBounds(400, 300, 100, 100);
        r7.setBounds(500, 300, 100, 100);
        r8.setBounds(600, 300, 100, 100);
        r9.setBounds(300, 400, 100, 100);
        r10.setBounds(400, 400, 100, 100);
        r11.setBounds(500, 400, 100, 100);
        r12.setBounds(600, 400, 100, 100);
        r13.setBounds(300, 500, 100, 100);
        r14.setBounds(400, 500, 100, 100);
        r15.setBounds(500, 500, 100, 100);
        r16.setBounds(600, 500, 100, 100);

        simplify.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[][][] groups;
                int[][] map = {
                    {toInt(r1.getText()), toInt(r2.getText()), toInt(r3.getText()), toInt(r4.getText())},
                    {toInt(r5.getText()), toInt(r6.getText()), toInt(r7.getText()), toInt(r8.getText())},
                    {toInt(r9.getText()), toInt(r10.getText()), toInt(r11.getText()), toInt(r12.getText())},
                    {toInt(r13.getText()), toInt(r14.getText()), toInt(r15.getText()), toInt(r16.getText())}
                };
                KarnaughMap solver = new KarnaughMap(map);
                groups = solver.Group();
                expression.setText("Expression: " + solver.generateBooleanExpression(groups));
            }
        });

        frame.add(r1); frame.add(r2); frame.add(r3); frame.add(r4); frame.add(r5); 
        frame.add(r6); frame.add(r7); frame.add(r8); frame.add(r9); frame.add(r10);
        frame.add(r11); frame.add(r12); frame.add(r13); frame.add(r14); frame.add(r15);
        frame.add(r16); frame.add(simplify); frame.add(expression); frame.add(ab); frame.add(cd);
        frame.add(ff); frame.add(ft); frame.add(tt); frame.add(tf); frame.add(ff1); frame.add(ft1);
        frame.add(tt1); frame.add(tf1);
        frame.setVisible(true);
    }

    public void exercises() {
        JLabel title = new JLabel("EXERCISES");
        JButton back = new JButton ("BACK");
        JButton questions = new JButton("QUESTIONS");
        JButton edit = new JButton("EDIT");

        // Title
        title.setFont(titleF);
        title.setBounds(400, 50, 400, 50);

        // Back Button
        back.setFont(normalT);
        back.setBounds(350, 800, 300, 50);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.remove(title); frame.remove(back); frame.remove(questions); frame.remove(edit);
                menu();
            }
        });

        // Questions Button
        questions.setFont(normalT);
        questions.setBounds(350, 300, 300, 100);
        questions.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.remove(title); frame.remove(back); frame.remove(questions); frame.remove(edit);
                questions();
            }
        });

        // Edit Button
        edit.setFont(normalT);
        edit.setBounds(350, 500, 300, 100);
        edit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.remove(title); frame.remove(back); frame.remove(questions); frame.remove(edit);
                edit();
            }
        });


        frame.add(title); frame.add(back); frame.add(questions); frame.add(edit);
        frame.setVisible(true);
    }

    public void questions() {
        JLabel title = new JLabel("QUESTIONS");
        JButton back = new JButton ("BACK");
        JButton generate = new JButton("GENERATE QUESTION");
        JButton submit = new JButton("SUBMIT");

        List<String> questions = bank.getQuestions();
        List<String> answers = bank.getAnswers();
        generatedNum = rd.nextInt(questions.size());

        // Question part
        JLabel question = new JLabel("Question: " + questions.get(generatedNum));
        JLabel answerField = new JLabel("");
        JButton A = new JButton("A");
        JButton B = new JButton("B");
        JButton not = new JButton("¬");
        JButton and = new JButton("AND");
        JButton or = new JButton("OR");
        JButton del = new JButton("DEL");

        // Title
        title.setFont(titleF);
        title.setBounds(400, 50, 400, 50);

        // Back Button
        back.setFont(normalT);
        back.setBounds(350, 800, 300, 50);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.remove(title); frame.remove(back); frame.remove(question); frame.remove(answerField);
                frame.remove(A); frame.remove(B); frame.remove(not); frame.remove(and); frame.remove(or);
                frame.remove(generate); frame.remove(submit); frame.remove(del);
                exercises();
            }
        });

        // Question UI
        question.setFont(normalT);
        question.setBounds(300, 150, 400, 50);

        answerField.setFont(normalT);
        answerField.setBounds(300, 220, 400, 50);

        A.setBounds(150, 300, 50, 50);
        A.setFont(normalT);
        A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                answerField.setText(answerField.getText() + "A");
            }
        });

        B.setBounds(250, 300, 50, 50);
        B.setFont(normalT);
        B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                answerField.setText(answerField.getText() + "B");
            }
        });

        not.setBounds(350, 300, 50, 50);
        not.setFont(normalT);
        not.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                answerField.setText(answerField.getText() + "¬");
            }
        });

        and.setBounds(450, 300, 100, 50);
        and.setFont(normalT);
        and.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                answerField.setText(answerField.getText() + "∧");
            }
        });

        or.setBounds(600, 300, 100, 50);
        or.setFont(normalT);
        or.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                answerField.setText(answerField.getText() + "∨");
            }
        });

        del.setBounds(750, 300, 100, 50);
        del.setFont(normalT);
        del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = answerField.getText();
                if (temp.length() > 0) {
                    answerField.setText(temp.substring(0, temp.length() - 1));
                }
            }
        });

        generate.setBounds(700, 150, 200, 50);
        generate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generatedNum = rd.nextInt(questions.size());
                question.setText(questions.get(generatedNum));
                answerField.setText("");
            }
        });

        submit.setBounds(300, 400, 400, 100);
        submit.setFont(normalT);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (answerField.getText().equals(answers.get(generatedNum))) {
                    JOptionPane.showMessageDialog(null, "Correct!");
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect!");
                }
            }
        });

        frame.add(title); frame.add(back); frame.add(question); frame.add(answerField); 
        frame.add(A); frame.add(B); frame.add(not); frame.add(and); frame.add(or);
        frame.add(generate); frame.add(submit); frame.add(del);
        frame.setVisible(true);
    }

    public void edit() {
        String[] questions = bank.getQuestions().toArray(new String[0]);
        String[] answers = bank.getAnswers().toArray(new String[0]);

        // UI
        JLabel title = new JLabel("EDIT");
        JButton back = new JButton ("BACK");
        JButton add = new JButton("ADD");
        JButton save = new JButton("SAVE");
        JButton delete = new JButton("DEL");
        JLabel question = new JLabel("Question");
        JLabel answer = new JLabel("Answer");

        // Question part
        question.setFont(normalT);
        question.setBounds(200, 150, 200, 50);
        JList q = new JList(questions);
        q.setBounds(200, 200, 200, 500);
        JScrollPane scroll = new JScrollPane(q);

        // Answer part
        answer.setFont(normalT);
        answer.setBounds(600, 150, 200, 50);
        JList a = new JList(answers);
        a.setBounds(600, 200, 200, 500);
        JScrollPane scroll2 = new JScrollPane(a);

        // Add & Delete
        add.setFont(normalT);
        add.setBounds(450, 400, 100, 50);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String question = JOptionPane.showInputDialog("Enter question (use A, B, ¬, ∧, ∨)");
                String answer = JOptionPane.showInputDialog("Enter answer  (use A, B, ¬, ∧, ∨)");
                bank.addQuestion(question, answer);
                String[] questions = bank.getQuestions().toArray(new String[0]);
                String[] answers = bank.getAnswers().toArray(new String[0]);
                q.setListData(questions);
                a.setListData(answers);
            }
        });


        delete.setFont(normalT);
        delete.setBounds(450, 500, 100, 50);
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bank.removeQuestion(q.getSelectedIndex());
                String[] questions = bank.getQuestions().toArray(new String[0]);
                String[] answers = bank.getAnswers().toArray(new String[0]);
                q.setListData(questions);
                a.setListData(answers);
            }
        });

        save.setFont(normalT);
        save.setBounds(450, 600, 100, 50);
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bank.save();
                JOptionPane.showMessageDialog(null, "Saved!");
            }
        });

        // Title
        title.setFont(titleF);
        title.setBounds(450, 50, 200, 50);

        // Back Button
        back.setFont(normalT);
        back.setBounds(350, 800, 300, 50);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.remove(title); frame.remove(back); frame.remove(add); frame.remove(delete);
                frame.remove(question); frame.remove(answer); frame.remove(q); frame.remove(a);
                frame.remove(scroll); frame.remove(scroll2); frame.remove(save);
                exercises();
            }
        });

        frame.add(title); frame.add(back); frame.add(add); frame.add(delete); frame.add(save);
        frame.add(question); frame.add(answer); frame.add(q); frame.add(a); frame.add(scroll); 
        frame.add(scroll2); 
        frame.setVisible(true);
    }
}