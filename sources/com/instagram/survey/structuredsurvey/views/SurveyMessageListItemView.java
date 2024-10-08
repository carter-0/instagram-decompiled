package com.instagram.survey.structuredsurvey.views;

import X.DbU;
import X.U5Y;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.android.R;

public class SurveyMessageListItemView extends U5Y {
    public TextView A00 = DbU.A0G(this, R.id.survey_message_text);

    public SurveyMessageListItemView(Context context) {
        super(context);
        setContentView(R.layout.survey_message_view);
    }

    public SurveyMessageListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(R.layout.survey_message_view);
    }
}
