package com.instagram.survey.structuredsurvey.views;

import X.U5Y;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.android.R;

public class SurveyDividerListItemView extends U5Y {
    public SurveyDividerListItemView(Context context) {
        super(context);
        setContentView(R.layout.row_divider);
    }

    public SurveyDividerListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(R.layout.row_divider);
    }
}
