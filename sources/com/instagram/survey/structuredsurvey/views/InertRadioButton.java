package com.instagram.survey.structuredsurvey.views;

import X.AnonymousClass0fD;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.RadioButton;

public class InertRadioButton extends RadioButton {
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0fD.A0C(1035249555, AnonymousClass0fD.A05(-779261832));
        return false;
    }

    public InertRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InertRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InertRadioButton(Context context) {
        super(context);
    }
}
