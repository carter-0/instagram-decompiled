package com.instagram.ui.widget.volume;

import X.AnonymousClass0fD;
import X.C73151PXm;
import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public final class VolumeIndicator extends ProgressBar {
    public Runnable A00;

    public final void A00(int i, int i2) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        setMax(i2);
        if (!(getVisibility() == 0 && getAlpha() == 1.0f)) {
            setVisibility(0);
            animate().setDuration(200).setListener((Animator.AnimatorListener) null).alpha(1.0f);
        }
        setProgress(i);
        Runnable runnable2 = this.A00;
        if (runnable2 == null) {
            runnable2 = new C73151PXm(this);
            this.A00 = runnable2;
        }
        postDelayed(runnable2, 2000);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-582349776);
        Runnable runnable = this.A00;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.A00 = null;
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(614533106, A06);
    }

    public VolumeIndicator(Context context) {
        super(context);
    }

    public VolumeIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VolumeIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
