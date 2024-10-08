package com.facebook.smartcapture.ui;

import X.0qQ;
import X.AnonymousClass3NY;
import X.C71382cm;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class SCImageView extends ImageView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context, attributeSet, i);
    }

    private final void A00(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A23, i, 0);
            0qQ.A07(obtainStyledAttributes);
            try {
                setImageResource(obtainStyledAttributes.getResourceId(0, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setImageResource(int i) {
        if (i != 0) {
            try {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                AnonymousClass3NY r1 = new AnonymousClass3NY();
                r1.A00 = resources.getDrawable(i, theme);
                setImageDrawable(r1);
            } catch (Exception unused) {
                super.setImageResource(i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        A00(context, attributeSet, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context, attributeSet, 0);
    }
}
