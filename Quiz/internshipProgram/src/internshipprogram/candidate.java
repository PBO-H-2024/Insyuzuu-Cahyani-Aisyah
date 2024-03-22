/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package internshipprogram;
/**
 *
 * @author LENOVO
 */
public class candidate {
    //attribute
    private String name;
    private String nim;
    private double writingExamScore;
    private double codingTestScore;
    private double interviewTestScore;

    //constructor
    public candidate(String name, String nim, double writingExamScore, double codingTestScore, double interviewTestScore) {
        this.name = name;
        this.nim = nim;
        this.writingExamScore = writingExamScore;
        this.codingTestScore = codingTestScore;
        this.interviewTestScore = interviewTestScore;
    }

    //setter and getter
    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public double getWritingExamScore() {
        return writingExamScore;
    }

    public double getCodingTestScore() {
        return codingTestScore;
    }

    public double getInterviewTestScore() {
        return interviewTestScore;
    }
}
