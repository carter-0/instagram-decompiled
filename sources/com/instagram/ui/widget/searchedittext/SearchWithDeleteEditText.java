package com.instagram.ui.widget.searchedittext;

import X.0qQ;
import X.C50423FbW;
import X.C51007Fmu;
import X.G5I;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

public final class SearchWithDeleteEditText extends SearchEditText {
    public G5I A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchWithDeleteEditText(Context context) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
        setBackgroundResource(0);
    }

    public final boolean onCheckIsTextEditor() {
        return true;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        G5I g5i;
        0qQ.A0B(keyEvent, 1);
        if (keyEvent.getKeyCode() == 67 && (g5i = this.A00) != null) {
            C50423FbW fbW = ((C51007Fmu) g5i).A00;
            Editable text = fbW.A07.getText();
            if ((text == null || text.length() == 0) && (!fbW.A08.isEmpty())) {
                ViewGroup viewGroup = fbW.A04;
                View childAt = viewGroup.getChildAt((viewGroup.getChildCount() - 2) - 1);
                0qQ.A07(childAt);
                childAt.requestFocus();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void setOnDeleteKeyListener(G5I g5i) {
        this.A00 = g5i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchWithDeleteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        setBackgroundResource(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchWithDeleteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
        setBackgroundResource(0);
    }
}
