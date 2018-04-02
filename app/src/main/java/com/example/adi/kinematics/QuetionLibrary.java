package com.example.adi.kinematics;

/**
 * Created by adi on 02/04/2018.
 */

public class QuetionLibrary {
    private String mQuestions []={
            "איזה סימן מייצג את המהירות?",
            "איזה רכיב ניתן למצוא על ידי שימוש בנוסחא: dv/dt ?",
            "איזה סימן מייצג את התאוצה?",
            "מה מייצגת הסימן d?",
            "מה מייצג הסימן vo?",
            "מה מייצג הסימן x?",
            "באיזה יחידות מסמלים את התאוצה- a?"
    };
    private String mChoice[][]={
            {"d","a","v"},
            {"a","v0","t"},
            {"v0","x","a"},
            {"זמן","הפרש","תאוצה"},
            {"מהירות","מהירות התחלתית","העתק"},
            {"מיקום התחלתי","זמן","העתק"},
            {"m","sec^2","m/sec^2"},
    };

    private String mCorrectAnsers[]={"v","a","a","הפרש","מהירות התחלתית","העתק","m/sec^2"};

    public String getQuestions(int a){
        String question=mQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0=mChoice[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1=mChoice[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2=mChoice[a][2];
        return choice2;
    }

    public  String getCorrectAnswer(int a){
        String answer=mCorrectAnsers[a];
        return answer;
    }

}
