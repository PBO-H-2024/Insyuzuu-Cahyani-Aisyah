/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package internshipprogram;

/**
 *
 * @author LENOVO
 */

public class finalScoreCalculation {
    private static final double ANDROID_WRITING_EXAM_WEIGHT = 0.2;
    private static final double ANDROID_CODING_TEST_WEIGHT = 0.5;
    private static final double ANDROID_INTERVIEW_TEST_WEIGHT = 0.3;
    private static final double WEB_WRITING_EXAM_WEIGHT = 0.4;
    private static final double WEB_CODING_TEST_WEIGHT = 0.35;
    private static final double WEB_INTERVIEW_TEST_WEIGHT = 0.25;

    public static double calculateAndroidFinalScore(candidate Candidate) {
        return ((Candidate.getWritingExamScore() + Candidate.getCodingTestScore() + Candidate.getInterviewTestScore()) / 3)
                * (ANDROID_WRITING_EXAM_WEIGHT + ANDROID_CODING_TEST_WEIGHT + ANDROID_INTERVIEW_TEST_WEIGHT);
    }

    public static double calculateWebFinalScore(candidate Candidate) {
        return ((Candidate.getWritingExamScore() + Candidate.getCodingTestScore() + Candidate.getInterviewTestScore()) / 3)
                * (WEB_WRITING_EXAM_WEIGHT + WEB_CODING_TEST_WEIGHT + WEB_INTERVIEW_TEST_WEIGHT);
    }
}