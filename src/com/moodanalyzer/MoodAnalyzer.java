/**
 * Purpose : Given a message, ability to analyse and respond HAPPY or SAD mood

 */
package com.moodanalyzer;

    public class MoodAnalyzer {

        public String analyseMood(String message) {
            if (message.contains("happy"))
                return "HAPPY";
            else
                return "SAD";
        }

    }