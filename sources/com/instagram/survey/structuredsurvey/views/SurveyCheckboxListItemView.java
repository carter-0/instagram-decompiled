package com.instagram.survey.structuredsurvey.views;

import X.C16286Uro;
import X.DbU;
import X.U5Y;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.TextView;
import com.instagram.android.R;

public class SurveyCheckboxListItemView extends U5Y implements Checkable {
    public CheckBox A00 = ((CheckBox) requireViewById(R.id.survey_checkbox));
    public TextView A01 = DbU.A0G(this, R.id.survey_checkbox_text);
    public boolean A02;

    public final boolean isChecked() {
        return this.A02;
    }

    public void setChecked(boolean z) {
        this.A02 = z;
        this.A00.setChecked(z);
        ((C16286Uro) this.A00).A01 = this.A02;
    }

    public final void toggle() {
        setChecked(!this.A02);
    }

    public SurveyCheckboxListItemView(Context context) {
        super(context);
        setContentView(R.layout.survey_checkbox_view);
    }

    public SurveyCheckboxListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(R.layout.survey_checkbox_view);
    }
}
