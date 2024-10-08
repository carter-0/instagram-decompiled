package com.instagram.zero.cms;

import X.0qQ;
import X.2b5;
import X.C66581MXm;
import X.C71382cm;
import X.C71622eP;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public class ZeroCmsTextView extends TextView {
    public 2b5 A00;
    public String A01;

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A2T);
        0qQ.A0B(obtainStyledAttributes, 1);
        this.A01 = C71622eP.A00(context, obtainStyledAttributes, 1);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C66581MXm.A15(context, this, resourceId);
            obtainStyledAttributes.recycle();
        }
    }

    public void setText(String str, String str2) {
        this.A01 = str;
        2b5 r0 = this.A00;
        if (r0 != null) {
            str2 = r0.getString(str, str2);
        }
        setText(str2);
        setContentDescription(str2);
    }

    public ZeroCmsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public ZeroCmsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public ZeroCmsTextView(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }
}
