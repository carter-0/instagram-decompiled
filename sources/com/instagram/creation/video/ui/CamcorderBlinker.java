package com.instagram.creation.video.ui;

import X.0nA;
import X.AnonymousClass05K;
import X.C59796JYp;
import X.C59872Jav;
import X.C66523MVb;
import X.JTS;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

public class CamcorderBlinker extends ColorFilterAlphaImageView implements C66523MVb {
    public int A00;
    public Animation A01;
    public C59872Jav A02;

    public final void D3P(C59796JYp jYp) {
    }

    public final void DfJ() {
    }

    private void A00() {
        C59872Jav jav = this.A02;
        if (jav != null) {
            double A002 = (((double) jav.A01.A00()) / 60000.0d) * ((double) this.A00);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            RectF rectF = 0nA.A01;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.setMargins((int) Math.max(A002 - ((double) TypedValue.applyDimension(1, 1.0f, displayMetrics)), 0.0d), 0, 0, 0);
            setLayoutParams(marginLayoutParams);
        }
    }

    public final void A05() {
        C59872Jav jav = this.A02;
        jav.getClass();
        if (60000 - jav.A01.A00() <= 0) {
            clearAnimation();
            setVisibility(8);
            return;
        }
        startAnimation(this.A01);
        setVisibility(0);
        A00();
    }

    public final void D3Q(C59796JYp jYp, Integer num) {
        int i;
        if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A00) {
            clearAnimation();
            i = 8;
        } else {
            startAnimation(this.A01);
            i = 0;
        }
        setVisibility(i);
    }

    public final void D3W(C59796JYp jYp) {
        startAnimation(this.A01);
        setVisibility(0);
        A00();
    }

    public void setClipStackManager(C59872Jav jav) {
        this.A02 = jav;
        A00();
    }

    public CamcorderBlinker(Context context) {
        super(context);
        JTS.A1Q(this);
    }

    public final void D3X() {
        clearAnimation();
        setVisibility(8);
    }

    public final void D3R(C59796JYp jYp) {
        A00();
    }

    public CamcorderBlinker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        JTS.A1Q(this);
    }

    public CamcorderBlinker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        JTS.A1Q(this);
    }
}
