package GUI;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton btn;
    private JLabel sudokuCodeLabel;
    private JTextField sudokuCode;
    private JLabel sudokuSourceLabel;
    private JTextField sudokuSource;
    private JLabel success;


    int count = 0;

    public GUI() {
        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Solved sudoku tracker");
        frame.add(panel);
        panel.setLayout(null);


        sudokuCodeLabel = new JLabel("Enter sudoku code");

        sudokuCodeLabel.setBounds(10, 20, 125, 25);
        panel.add(sudokuCodeLabel);

        sudokuCode = new JTextField(20);
        sudokuCode.setBounds(135, 20, 165, 25);
        panel.add(sudokuCode);

        sudokuSourceLabel = new JLabel("Enter sudoku source");
        sudokuSourceLabel.setBounds(10, 50, 125, 25);
        panel.add(sudokuSourceLabel);

        sudokuSource = new JTextField(20);
        sudokuSource.setBounds(135, 50, 165, 25);
        panel.add(sudokuSource);

        btn = new JButton("add");
        btn.setBounds(10, 80, 80, 25);
        btn.addActionListener(this);
        panel.add(btn);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);




        //frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String code = sudokuCode.getText();
        String source = sudokuSource.getText();
        System.out.println(code + " " + source);
    }
}
