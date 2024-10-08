package com.instagram.ui.text.backinterceptedittext;

import X.0qQ;
import X.C3020761l;
import X.C62320sa;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;

public final class BackInterceptEditText extends IgEditText {
    public C62320sa A00 = C3020761l.A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackInterceptEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, R.style.EditTextStyle);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        0qQ.A0B(keyEvent, 1);
        if (i != 4 || !((Boolean) this.A00.invoke()).booleanValue()) {
            return super.onKeyPreIme(i, keyEvent);
        }
        return true;
    }

    public final void setOnBackCallback(C62320sa r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final C62320sa getOnBackCallback() {
        return this.A00;
    }
}
