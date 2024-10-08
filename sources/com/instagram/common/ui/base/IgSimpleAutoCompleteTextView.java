package com.instagram.common.ui.base;

import X.0oh;
import X.0qQ;
import X.2Yu;
import X.AnonymousClass05K;
import X.C2364933y;
import X.C247933h9;
import X.C70572Rz;
import X.C71382cm;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.instagram.android.R;

public class IgSimpleAutoCompleteTextView extends AutoCompleteTextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgSimpleAutoCompleteTextView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A01(context, (AttributeSet) null);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        0qQ.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C70572Rz.A00().AMD(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    private final void A01(Context context, AttributeSet attributeSet) {
        C2364933y A00 = C70572Rz.A00();
        KeyListener keyListener = getKeyListener();
        A00.AMI(keyListener, this);
        super.setKeyListener(keyListener);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1I);
        0qQ.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            setCompletionHint(context.getText(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(5, 0);
        if (resourceId2 != 0) {
            setContentDescription(context.getText(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId3 != 0) {
            setHint(context.getText(resourceId3));
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId4 != 0) {
            setImeActionLabel(context.getText(resourceId4), getImeActionId());
        }
        int resourceId5 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId5 != 0) {
            setText(context.getText(resourceId5));
        }
        int color = obtainStyledAttributes.getColor(0, R.color.baseline_neutral_80);
        0oh.A07(getContext(), (Typeface) null, this, AnonymousClass05K.A00);
        obtainStyledAttributes.recycle();
        setImeOptions(33554432 | getImeOptions());
        setEditableFactory(new Editable.Factory());
        if (Build.VERSION.SDK_INT >= 34 && ((Boolean) C247933h9.A01.getValue()).booleanValue()) {
            setLayerType(1, (Paint) null);
        }
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842906});
        0qQ.A07(obtainStyledAttributes2);
        try {
            if (color == obtainStyledAttributes2.getColor(0, 0) || color == context.getColor(R.color.baseline_neutral_80)) {
                setHintTextColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_text)));
            }
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    public void setKeyListener(KeyListener keyListener) {
        C70572Rz.A00().AMI(keyListener, this);
        super.setKeyListener(keyListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgSimpleAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A01(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgSimpleAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        A01(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgSimpleAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
        super(context, attributeSet, i, i2, theme);
        0qQ.A0B(context, 1);
        A01(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgSimpleAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A01(context, attributeSet);
    }
}
