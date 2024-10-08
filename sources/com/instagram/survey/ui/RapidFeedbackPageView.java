package com.instagram.survey.ui;

import X.0qQ;
import X.DbV;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.instagram.android.R;

public final class RapidFeedbackPageView extends RelativeLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RapidFeedbackPageView(Context context) {
        super(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
        DbV.A0D(this).inflate(R.layout.rapidfeedback_page, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RapidFeedbackPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        DbV.A0D(this).inflate(R.layout.rapidfeedback_page, this);
    }
}
