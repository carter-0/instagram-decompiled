package com.instagram.ui.widget.textureview;

import X.AnonymousClass4M7;
import X.AnonymousClass4XA;
import X.MQ2;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;

public class ScalingTextureView extends MultiListenerTextureView {
    public float A00;
    public int A01;
    public int A02;
    public float A03;
    public float A04;
    public AnonymousClass4M7 A05;

    public ScalingTextureView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static void A00(ScalingTextureView scalingTextureView) {
        int i;
        ScalingTextureView scalingTextureView2 = scalingTextureView;
        int i2 = scalingTextureView.A02;
        if (i2 > 0 && (i = scalingTextureView.A01) > 0) {
            AnonymousClass4XA.A01(scalingTextureView2, scalingTextureView2.A05, (MQ2) null, scalingTextureView2.A04, scalingTextureView2.A03, scalingTextureView2.A00, i2, i);
        }
    }

    public int getVideoHeight() {
        return this.A01;
    }

    public int getVideoWidth() {
        return this.A02;
    }

    public void setScaleType(AnonymousClass4M7 r2) {
        if (this.A05 != r2) {
            this.A05 = r2;
            A00(this);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this);
    }

    public void setCropTopCoordinate(float f) {
        this.A00 = f;
    }

    public ScalingTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = AnonymousClass4M7.FILL;
        this.A04 = 0.8f;
        this.A03 = 1.91f;
        this.A00 = 0.0f;
    }

    public ScalingTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
