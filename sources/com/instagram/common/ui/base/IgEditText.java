package com.instagram.common.ui.base;

import X.0fS;
import X.0mq;
import X.0oh;
import X.0qQ;
import X.AnonymousClass000;
import X.C2364933y;
import X.C70572Rz;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class IgEditText extends EditText {
    public boolean A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgEditText(Context context) {
        this(context, (AttributeSet) null, 0, R.style.EditTextStyle);
        0qQ.A0B(context, 1);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        0qQ.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C70572Rz.A00().AMD(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            Editable text = getText();
            0qQ.A07(text);
            if (!0mq.A06(this, text)) {
                throw e;
            }
        }
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        0qQ.A0B(keyEvent, 1);
        if (!this.A00 || i != 4) {
            return super.onKeyPreIme(i, keyEvent);
        }
        clearFocus();
        return false;
    }

    public void setKeyListener(KeyListener keyListener) {
        C70572Rz.A00().AMI(keyListener, this);
        super.setKeyListener(keyListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgEditText(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.EditTextStyle);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2 == 0 ? R.style.EditTextStyle : i2);
        Typeface A02;
        0qQ.A0B(context, 1);
        int inputType = getInputType();
        C2364933y A002 = C70572Rz.A00();
        KeyListener keyListener = getKeyListener();
        A002.AMI(keyListener, this);
        super.setKeyListener(keyListener);
        setInputType(inputType);
        setImeOptions(getImeOptions() | 33554432);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A16);
        0qQ.A07(obtainStyledAttributes);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            setHint(context.getText(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId3 != 0) {
            setImeActionLabel(context.getText(resourceId3), getImeActionId());
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId4 != 0) {
            setText(context.getText(resourceId4));
        }
        this.A00 = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        Typeface typeface = getTypeface();
        Typeface typeface2 = getTypeface();
        if (typeface2 != null && typeface2.isBold()) {
            z = true;
        }
        if (0oh.A08()) {
            if (Systrace.A0E(1)) {
                0fS.A01(AnonymousClass000.A00(963), 805611063);
            }
            int intValue = 0oh.A04(typeface, z).intValue();
            if (intValue == 0) {
                A02 = 0oh.A02(context);
            } else if (intValue != 1) {
                A02 = 0oh.A00(context);
            } else {
                A02 = 0oh.A01(context);
            }
            setTypeface(A02);
            if (Systrace.A0E(1)) {
                0fS.A00(1985649994);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgEditText(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? R.style.EditTextStyle : i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, R.style.EditTextStyle);
        0qQ.A0B(context, 1);
    }
}
