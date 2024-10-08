package com.instagram.survey.structuredsurvey.views;

import X.0nA;
import X.AnonymousClass7TF;
import X.C16289Urr;
import X.C16524UwT;
import X.C66581MXm;
import X.U5Y;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.TextView;

public class SurveyWriteInListItemView extends U5Y implements Checkable {
    public View.OnFocusChangeListener A00;
    public View A01;
    public Checkable A02;
    public EditText A03;
    public TextView A04;
    public C16524UwT A05;

    public String getText() {
        EditText editText = this.A03;
        editText.getClass();
        return AnonymousClass7TF.A0f(editText);
    }

    public final boolean isChecked() {
        Checkable checkable = this.A02;
        checkable.getClass();
        return checkable.isChecked();
    }

    public void setChecked(boolean z) {
        Checkable checkable = this.A02;
        checkable.getClass();
        checkable.setChecked(z);
        ((C16289Urr) this.A00).A01 = C66581MXm.A1a(z);
        this.A01.getClass();
        this.A03.getClass();
        View view = this.A01;
        if (z) {
            view.setVisibility(0);
            this.A03.setVisibility(0);
            return;
        }
        view.setVisibility(4);
        this.A03.setVisibility(4);
        0nA.A0N(getRootView());
        Window window = ((Activity) getContext()).getWindow();
        window.getClass();
        window.setSoftInputMode(3);
    }

    public void setItemOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A00 = onFocusChangeListener;
    }

    public final void toggle() {
        Checkable checkable = this.A02;
        checkable.getClass();
        setChecked(!checkable.isChecked());
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        ((C16289Urr) this.A00).A02.A00(getText());
    }

    public SurveyWriteInListItemView(Context context) {
        super(context);
    }

    public SurveyWriteInListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
