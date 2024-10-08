package com.instagram.common.ui.widget.imageview;

import X.0qQ;
import X.AnonymousClass1GB;
import X.B1H;
import X.C71382cm;
import X.MQ1;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class ConstrainedImageView extends IgImageView {
    public float A00 = 1.0f;
    public B1H A01;
    public MQ1 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstrainedImageView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.ImageView, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        B1H b1h = this.A01;
        if (b1h != null) {
            b1h.DjV(this, i, i2, i3, i4);
        }
        return ConstrainedImageView.super.setFrame(i, i2, i3, i4);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void onMeasure(int i, int i2) {
        ConstrainedImageView.super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), AnonymousClass1GB.A01(((float) getMeasuredWidth()) / this.A00));
    }

    public final void setAspect(float f) {
        this.A00 = f;
    }

    public final void setOnMeasureListener(MQ1 mq1) {
        this.A02 = mq1;
    }

    public final void setOnSetFrameListener(B1H b1h) {
        this.A01 = b1h;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstrainedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A0L);
        0qQ.A07(obtainStyledAttributes);
        this.A00 = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstrainedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A0L);
        0qQ.A07(obtainStyledAttributes);
        this.A00 = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }
}
