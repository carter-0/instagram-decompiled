package com.instagram.survey.structuredsurvey.views;

import X.U5Y;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

public class SurveySpaceListItemView extends U5Y {
    public View A00 = requireViewById(R.id.survey_space_view);

    public SurveySpaceListItemView(Context context) {
        super(context);
        setContentView(R.layout.survey_space_view);
    }

    public SurveySpaceListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(R.layout.survey_space_view);
    }
}
