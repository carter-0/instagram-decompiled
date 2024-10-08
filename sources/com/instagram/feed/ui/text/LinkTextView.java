package com.instagram.feed.ui.text;

import X.0oh;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.C17107VId;
import X.C70572Rz;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

public class LinkTextView extends TextView {
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence Cmk;
        if (charSequence == null) {
            Cmk = null;
        } else {
            Cmk = C70572Rz.A00().Cmk(-1, charSequence);
        }
        super.setText(Cmk, bufferType);
    }

    public LinkTextView(Context context) {
        super(context);
        0oh.A07(context, (Typeface) null, this, AnonymousClass05K.A00);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0fD.A05(-1518675000);
        Layout layout = getLayout();
        boolean z = true;
        if ((layout == null || !C17107VId.A00(layout, motionEvent, this)) && !super.onTouchEvent(motionEvent)) {
            z = false;
        }
        AnonymousClass0fD.A0C(1375740748, A05);
        return z;
    }

    public LinkTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0oh.A07(context, (Typeface) null, this, AnonymousClass05K.A00);
    }

    public LinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0oh.A07(context, (Typeface) null, this, AnonymousClass05K.A00);
    }
}
