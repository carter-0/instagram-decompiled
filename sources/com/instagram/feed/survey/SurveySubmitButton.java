package com.instagram.feed.survey;

import X.0qQ;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class SurveySubmitButton extends IgTextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurveySubmitButton(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.feed.survey.SurveySubmitButton, android.view.View] */
    public void setActivated(boolean z) {
        SurveySubmitButton.super.setActivated(z);
        boolean isActivated = isActivated();
        int i = R.drawable.not_activated_survey_submit_button_background;
        if (isActivated) {
            i = R.drawable.activated_survey_submit_button_background;
        }
        setBackgroundResource(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurveySubmitButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurveySubmitButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}
