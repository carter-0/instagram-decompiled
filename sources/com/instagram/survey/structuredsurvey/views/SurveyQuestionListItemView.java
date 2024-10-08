package com.instagram.survey.structuredsurvey.views;

import X.DbU;
import X.U5Y;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.android.R;

public class SurveyQuestionListItemView extends U5Y {
    public TextView A00 = DbU.A0G(this, R.id.survey_question_number);
    public TextView A01 = DbU.A0G(this, R.id.survey_question);

    public SurveyQuestionListItemView(Context context) {
        super(context);
        setContentView(R.layout.survey_question_view);
    }

    public SurveyQuestionListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(R.layout.survey_question_view);
    }
}
