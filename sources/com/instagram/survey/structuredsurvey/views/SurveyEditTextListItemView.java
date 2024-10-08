package com.instagram.survey.structuredsurvey.views;

import X.AnonymousClass7TF;
import X.C16288Urq;
import X.DbU;
import X.U5Y;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.instagram.android.R;

public class SurveyEditTextListItemView extends U5Y {
    public EditText A00;

    public String getText() {
        return AnonymousClass7TF.A0f(this.A00);
    }

    public final void onStartTemporaryDetach() {
        ((C16288Urq) this.A00).A00(AnonymousClass7TF.A0f(this.A00));
        super.onStartTemporaryDetach();
    }

    public void setItemOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A00.setOnFocusChangeListener(onFocusChangeListener);
    }

    public SurveyEditTextListItemView(Context context) {
        super(context);
        setContentView(R.layout.survey_editext_view);
        EditText A0E = DbU.A0E(this, R.id.survey_edit_text);
        this.A00 = A0E;
        A0E.setFocusable(true);
        this.A00.setFocusableInTouchMode(true);
    }

    public SurveyEditTextListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(R.layout.survey_editext_view);
        EditText A0E = DbU.A0E(this, R.id.survey_edit_text);
        this.A00 = A0E;
        A0E.setFocusable(true);
        this.A00.setFocusableInTouchMode(true);
    }
}
