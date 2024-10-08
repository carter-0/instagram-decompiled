package com.instagram.creation.video.widget.scrubber;

import X.0qQ;
import X.AnonymousClass0fD;
import X.JTT;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgScrubberProgressIndicator extends MediaFrameLayout {
    public AnimatorSet A00;
    public boolean A01;
    public boolean A02;
    public final Runnable A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgScrubberProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        if (!this.A02) {
            return;
        }
        if (i == 0) {
            this.A01 = true;
            AnimatorSet animatorSet = this.A00;
            0qQ.A0A(animatorSet);
            if (!animatorSet.isStarted()) {
                0qQ.A0A(animatorSet);
                animatorSet.start();
                return;
            }
            return;
        }
        this.A01 = false;
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-746607842);
        super.onAttachedToWindow();
        this.A02 = true;
        if (getVisibility() == 0) {
            this.A01 = true;
            AnimatorSet animatorSet = this.A00;
            0qQ.A0A(animatorSet);
            if (!animatorSet.isStarted()) {
                0qQ.A0A(animatorSet);
                animatorSet.start();
            }
        }
        AnonymousClass0fD.A0D(-1844312675, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-1068222831);
        super.onDetachedFromWindow();
        this.A02 = false;
        this.A01 = false;
        AnonymousClass0fD.A0D(-309377377, A06);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgScrubberProgressIndicator(android.content.Context r16, android.util.AttributeSet r17, int r18) {
        /*
            r15 = this;
            r0 = 1
            r2 = r16
            X.0qQ.A0B(r2, r0)
            r1 = r17
            r0 = r18
            r15.<init>(r2, r1, r0)
            X.PUt r0 = new X.PUt
            r0.<init>(r15)
            r15.A03 = r0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            r0 = 2131629835(0x7f0e170b, float:1.8887002E38)
            r1.inflate(r0, r15)
            r0 = 2131432003(0x7f0b1243, float:1.8485751E38)
            android.view.View r7 = r15.findViewById(r0)
            r0 = 2131432004(0x7f0b1244, float:1.8485753E38)
            android.view.View r4 = r15.findViewById(r0)
            r0 = 2131432005(0x7f0b1245, float:1.8485755E38)
            android.view.View r13 = r15.findViewById(r0)
            r2 = 2
            float[] r0 = new float[r2]
            r0 = {1065353216, 1068121457} // fill-array
            java.lang.String r6 = "scaleX"
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r7, r6, r0)
            r0 = 250(0xfa, double:1.235E-321)
            r11.setDuration(r0)
            android.view.animation.AccelerateInterpolator r3 = new android.view.animation.AccelerateInterpolator
            r3.<init>()
            r11.setInterpolator(r3)
            android.animation.ObjectAnimator r12 = r11.clone()
            X.0qQ.A07(r12)
            java.lang.String r5 = "scaleY"
            r12.setPropertyName(r5)
            float[] r3 = new float[r2]
            r3 = {1068121457, 1065353216} // fill-array
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r7, r6, r3)
            r10.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r10.setInterpolator(r0)
            android.animation.ObjectAnimator r9 = r10.clone()
            X.0qQ.A07(r9)
            r9.setPropertyName(r5)
            android.animation.ObjectAnimator r6 = r11.clone()
            X.0qQ.A07(r6)
            android.animation.ObjectAnimator r14 = r12.clone()
            X.0qQ.A07(r14)
            android.animation.ObjectAnimator r8 = r10.clone()
            X.0qQ.A07(r8)
            android.animation.ObjectAnimator r7 = r9.clone()
            X.0qQ.A07(r7)
            r6.setTarget(r4)
            r14.setTarget(r4)
            r8.setTarget(r4)
            r7.setTarget(r4)
            android.animation.ObjectAnimator r3 = r11.clone()
            X.0qQ.A07(r3)
            android.animation.ObjectAnimator r5 = r12.clone()
            X.0qQ.A07(r5)
            android.animation.ObjectAnimator r4 = r10.clone()
            X.0qQ.A07(r4)
            android.animation.ObjectAnimator r1 = r9.clone()
            X.0qQ.A07(r1)
            r3.setTarget(r13)
            r5.setTarget(r13)
            r4.setTarget(r13)
            r1.setTarget(r13)
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r15.A00 = r0
            android.animation.AnimatorSet$Builder r0 = r0.play(r11)
            r0.with(r12)
            android.animation.AnimatorSet r0 = r15.A00
            X.0qQ.A0A(r0)
            android.animation.AnimatorSet$Builder r0 = r0.play(r6)
            android.animation.AnimatorSet$Builder r0 = r0.with(r14)
            android.animation.AnimatorSet$Builder r0 = r0.with(r10)
            android.animation.AnimatorSet$Builder r0 = r0.with(r9)
            r0.after(r11)
            android.animation.AnimatorSet r0 = r15.A00
            X.0qQ.A0A(r0)
            android.animation.AnimatorSet$Builder r0 = r0.play(r3)
            android.animation.AnimatorSet$Builder r0 = r0.with(r5)
            android.animation.AnimatorSet$Builder r0 = r0.with(r8)
            android.animation.AnimatorSet$Builder r0 = r0.with(r7)
            r0.after(r6)
            android.animation.AnimatorSet r0 = r15.A00
            X.0qQ.A0A(r0)
            android.animation.AnimatorSet$Builder r0 = r0.play(r4)
            android.animation.AnimatorSet$Builder r0 = r0.with(r1)
            r0.after(r3)
            android.animation.AnimatorSet r0 = r15.A00
            X.0qQ.A0A(r0)
            X.C71161Oea.A00(r0, r15, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.video.widget.scrubber.IgScrubberProgressIndicator.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* synthetic */ IgScrubberProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgScrubberProgressIndicator(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
