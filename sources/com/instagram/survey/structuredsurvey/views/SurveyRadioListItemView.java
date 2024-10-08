package com.instagram.survey.structuredsurvey.views;

import X.C16287Urp;
import X.DbU;
import X.U5Y;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.TextView;
import com.instagram.android.R;

public class SurveyRadioListItemView extends U5Y implements Checkable {
    public RadioButton A00 = ((RadioButton) requireViewById(R.id.survey_radio_button));
    public TextView A01 = DbU.A0G(this, R.id.survey_radio_text);
    public boolean A02;

    public final boolean isChecked() {
        return this.A02;
    }

    public void setChecked(boolean z) {
        this.A02 = z;
        this.A00.setChecked(z);
        ((C16287Urp) this.A00).A01 = this.A02;
    }

    public final void toggle() {
        setChecked(!this.A02);
    }

    public SurveyRadioListItemView(Context context) {
        super(context);
        setContentView(R.layout.survey_radio_view);
    }

    public SurveyRadioListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(R.layout.survey_radio_view);
    }
}
