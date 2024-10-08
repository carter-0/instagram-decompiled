package com.instagram.ui.widget.textview;

import X.0qQ;
import X.C2364933y;
import X.C70572Rz;
import android.content.Context;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;

public final class ActionMultiLineEditText extends IgEditText {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionMultiLineEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, R.style.EditTextStyle);
        0qQ.A0B(context, 1);
        C2364933y A00 = C70572Rz.A00();
        KeyListener keyListener = getKeyListener();
        A00.AMI(keyListener, this);
        super.setKeyListener(keyListener);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        0qQ.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i = editorInfo.imeOptions;
        if ((1073741824 & i) != 0) {
            editorInfo.imeOptions = i & -1073741825;
        }
        C70572Rz.A00().AMD(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public void setKeyListener(KeyListener keyListener) {
        C70572Rz.A00().AMI(keyListener, this);
        super.setKeyListener(keyListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionMultiLineEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.EditTextStyle);
        0qQ.A0B(context, 1);
        C2364933y A00 = C70572Rz.A00();
        KeyListener keyListener = getKeyListener();
        A00.AMI(keyListener, this);
        super.setKeyListener(keyListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionMultiLineEditText(Context context) {
        super(context, (AttributeSet) null, 0, R.style.EditTextStyle);
        0qQ.A0B(context, 1);
        C2364933y A00 = C70572Rz.A00();
        KeyListener keyListener = getKeyListener();
        A00.AMI(keyListener, this);
        super.setKeyListener(keyListener);
    }
}
