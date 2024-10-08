package com.instagram.ui.widget.imageview;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C3021161q;
import X.C51969G9p;
import X.JTT;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BlinkingImageView extends C3021161q implements ValueAnimator.AnimatorUpdateListener {
    public boolean A00;
    public final ValueAnimator A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlinkingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.2f}).setDuration(800);
        0qQ.A07(duration);
        this.A01 = duration;
        duration.addUpdateListener(this);
        duration.setRepeatMode(2);
        duration.setRepeatCount(-1);
        C51969G9p.A10(duration);
    }

    public final void setBlinking(boolean z) {
        this.A00 = z;
        ValueAnimator valueAnimator = this.A01;
        if (!z) {
            valueAnimator.cancel();
            setImageAlpha(255);
        } else if (!valueAnimator.isStarted()) {
            valueAnimator.start();
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        setImageAlpha(AnonymousClass7TE.A06(AnonymousClass7TH.A00(valueAnimator), 255.0f));
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(1087184377);
        super.onAttachedToWindow();
        if (this.A00) {
            ValueAnimator valueAnimator = this.A01;
            if (!valueAnimator.isStarted()) {
                valueAnimator.start();
            }
        }
        AnonymousClass0fD.A0D(355755839, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(1067989183);
        this.A01.cancel();
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(-1428712358, A06);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BlinkingImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BlinkingImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ BlinkingImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
