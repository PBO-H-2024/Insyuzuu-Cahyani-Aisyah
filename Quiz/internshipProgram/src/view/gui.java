/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import internshipprogram.finalScoreCalculation;
import internshipprogram.candidate;
/**
 *
 * @author LENOVO
 */

import javax.swing.*;

public class gui {
    public void displayGUI() {
        JFrame frame = new JFrame("Internship Program");
        frame.setSize(500, 400);

        JPanel panel = new JPanel();
        frame.add(panel);
        komponen(panel);

        frame.setVisible(true);
    }

    private void komponen(JPanel panel) {
        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Name :");
        nameLabel.setBounds(10, 20, 80, 25);
        panel.add(nameLabel);

        JTextField nameText = new JTextField(20);
        nameText.setBounds(100, 20, 165, 25);
        panel.add(nameText);

        JLabel nimLabel = new JLabel("NIM :");
        nimLabel.setBounds(10, 50, 80, 25);
        panel.add(nimLabel);

        JTextField nimText = new JTextField(20);
        nimText.setBounds(100, 50, 165, 25);
        panel.add(nimText);

        JLabel writingLabel = new JLabel("Writing Exam Score :");
        writingLabel.setBounds(10, 80, 150, 25);
        panel.add(writingLabel);

        JTextField writingText = new JTextField(20);
        writingText.setBounds(160, 80, 100, 25);
        panel.add(writingText);

        JLabel codingLabel = new JLabel("Coding Test Score :");
        codingLabel.setBounds(10, 110, 150, 25);
        panel.add(codingLabel);

        JTextField codingText = new JTextField(20);
        codingText.setBounds(160, 110, 100, 25);
        panel.add(codingText);

        JLabel interviewLabel = new JLabel("Interview Test Score :");
        interviewLabel.setBounds(10, 140, 150, 25);
        panel.add(interviewLabel);

        JTextField interviewText = new JTextField(20);
        interviewText.setBounds(160, 140, 100, 25);
        panel.add(interviewText);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(80, 200, 100, 25);
        panel.add(calculateButton);

        JTextField resultLabel = new JTextField(20);
        resultLabel.setBounds(10, 230, 300, 40);
        panel.add(resultLabel);

        calculateButton.addActionListener(e -> {
            try {
                String name = nameText.getText();
                String nim = nimText.getText();
                double writingScore = Double.parseDouble(writingText.getText());
                double codingScore = Double.parseDouble(codingText.getText());
                double interviewScore = Double.parseDouble(interviewText.getText());

                candidate Candidate = new candidate(name, nim, writingScore, codingScore, interviewScore);

                double finalScore;
                if (nim.startsWith("")) {
                    finalScore = finalScoreCalculation.calculateAndroidFinalScore(Candidate);
                } else {
                    finalScore = finalScoreCalculation.calculateWebFinalScore(Candidate);
                }
                if (finalScore >= 85) {
                    resultLabel.setText(name + " with NIM " + nim + " is ACCEPTED with a final score of " + finalScore);
                } else {
                    resultLabel.setText(name + " with NIM " + nim + " is NOT ACCEPTED with a final score of " + finalScore);
                }
                //error handling if user invalid input score
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Please valid scores.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(panel, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}

