package com.google.android.material.textfield;

import X.AnonymousClass0fD;
import X.AnonymousClass3U5;
import X.C297835sR;
import X.C297855sT;
import X.C297865sU;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.instagram.android.R;
import java.util.Locale;

public class TextInputEditText extends AnonymousClass3U5 {
    public boolean A00;
    public final Rect A01;

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C297835sR.A00(context, attributeSet, i, 0), attributeSet, i);
        this.A01 = new Rect();
        TypedArray A002 = C297855sT.A00(context, attributeSet, C297865sU.A0c, new int[0], i, 2132018493);
        this.A00 = A002.getBoolean(0, false);
        A002.recycle();
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.A00 = z;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.A00 && rect != null) {
            Rect rect2 = this.A01;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || !this.A00 || rect == null)) {
            Rect rect2 = this.A01;
            textInputLayout.getGlobalVisibleRect(rect2, point);
            rect.bottom = rect2.bottom;
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.A0S) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-1486108126);
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.A0S && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
        AnonymousClass0fD.A0D(-1553932031, A06);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.A00) {
            Rect rect2 = this.A01;
            rect2.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(rect2, true);
        }
        return requestRectangleOnScreen;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context) {
        this(context, (AttributeSet) null);
    }
}
