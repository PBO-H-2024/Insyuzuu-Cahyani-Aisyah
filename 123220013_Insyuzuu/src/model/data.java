/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC PRAKTIKUM
 */
public class data {
    private String name;
    private String path;
    private double writing;
    private double coding;
    private double interview;
    private double score;
    private String status;
    /**
    public class finalScoreCalculation {
    private static final double ANDROID_WRITING_EXAM_WEIGHT = 0.2;
    private static final double ANDROID_CODING_TEST_WEIGHT = 0.5;
    private static final double ANDROID_INTERVIEW_TEST_WEIGHT = 0.3;
    private static final double WEB_WRITING_EXAM_WEIGHT = 0.4;
    private static final double WEB_CODING_TEST_WEIGHT = 0.35;
    private static final double WEB_INTERVIEW_TEST_WEIGHT = 0.25;
*/
    //public static double calculateAndroidFinalScore(data Data) {
     //   return ((Data.getWritingExamScore() + Data.getCodingTestScore() + Data.getInterviewTestScore()) / 3)
       //         * (ANDROID_WRITING_EXAM_WEIGHT + ANDROID_CODING_TEST_WEIGHT + ANDROID_INTERVIEW_TEST_WEIGHT);
   // }

   // public static double calculateWebFinalScore(data Data) {
      //  return ((Data.getWritingExamScore() + Data.getCodingTestScore() + Data.getInterviewTestScore()) / 3)
      //          * (WEB_WRITING_EXAM_WEIGHT + WEB_CODING_TEST_WEIGHT + WEB_INTERVIEW_TEST_WEIGHT);
    //}
//}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public double getWriting() {
        return writing;
    }

    public void setWriting(double writing) {
        this.writing = writing;
    }

    public double getCoding() {
        return coding;
    }

    public void setCoding(double coding) {
        this.coding = coding;
    }

    public double getInterview() {
        return interview;
    }

    public void setInterview(double interview) {
        this.interview = interview;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
