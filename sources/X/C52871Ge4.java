package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.Ge4  reason: case insensitive filesystem */
public final class C52871Ge4 extends FrameLayout {
    public boolean A00;
    public final AnimatorSet A01 = new AnimatorSet();
    public final PathMeasure A02;
    public final PathMeasure A03;
    public final PathMeasure A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final Path A08;
    public final Path A09;
    public final Path A0A;
    public final Drawable A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final PathInterpolator A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52871Ge4(android.content.Context r21, android.graphics.drawable.Drawable r22, android.graphics.drawable.Drawable r23, android.graphics.drawable.Drawable r24, int r25, int r26) {
        /*
            r20 = this;
            r6 = r22
            r10 = r23
            r0 = r24
            X.C51974G9v.A1M(r6, r10, r0)
            r8 = r21
            r7 = r20
            r7.<init>(r8)
            r7.A0C = r6
            r7.A0B = r10
            r7.A0D = r0
            android.content.Context r2 = r7.getContext()
            android.util.DisplayMetrics r1 = X.AnonymousClass7TF.A0E(r2)
            r3 = r25
            float r3 = (float) r3
            r4 = 1
            float r1 = android.util.TypedValue.applyDimension(r4, r3, r1)
            int r5 = (int) r1
            android.util.DisplayMetrics r2 = X.AnonymousClass7TF.A0E(r2)
            r1 = r26
            float r1 = (float) r1
            float r1 = android.util.TypedValue.applyDimension(r4, r1, r2)
            int r4 = (int) r1
            r1 = 1056293519(0x3ef5c28f, float:0.48)
            float r3 = r3 * r1
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r7.A01 = r1
            float r9 = (float) r5
            r1 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r1
            float r1 = -r9
            float r1 = r1 - r3
            float r9 = r9 + r3
            r2 = 0
            r12 = 1057803469(0x3f0ccccd, float:0.55)
            r11 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.PathInterpolator r3 = new android.view.animation.PathInterpolator
            r3.<init>(r2, r2, r12, r11)
            r7.A0E = r3
            android.graphics.Path r12 = X.C51965G9l.A0C()
            r12.moveTo(r2, r2)
            r16 = 1103626240(0x41c80000, float:25.0)
            float r13 = r1 - r16
            r14 = 1101004800(0x41a00000, float:20.0)
            r15 = r13
            r18 = r2
            r17 = r1
            r12.cubicTo(r13, r14, r15, r16, r17, r18)
            r7.A08 = r12
            r3 = 0
            android.graphics.PathMeasure r11 = new android.graphics.PathMeasure
            r11.<init>(r12, r3)
            r7.A02 = r11
            android.graphics.Path r12 = X.C51965G9l.A0C()
            r12.moveTo(r1, r2)
            r12.lineTo(r9, r2)
            r7.A09 = r12
            android.graphics.PathMeasure r11 = new android.graphics.PathMeasure
            r11.<init>(r12, r3)
            r7.A03 = r11
            android.graphics.Path r11 = X.C51965G9l.A0C()
            r11.moveTo(r9, r2)
            float r14 = r9 + r16
            r12 = 1101004800(0x41a00000, float:20.0)
            r16 = r14
            r17 = r12
            r19 = r2
            r13 = r11
            r15 = r12
            r13.cubicTo(r14, r15, r16, r17, r18, r19)
            r7.A0A = r11
            android.graphics.PathMeasure r2 = new android.graphics.PathMeasure
            r2.<init>(r11, r3)
            r7.A04 = r2
            android.widget.ImageView r13 = new android.widget.ImageView
            r13.<init>(r8)
            r7.A07 = r13
            r13.setImageDrawable(r0)
            r11 = 17
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r5, r4, r11)
            r13.setLayoutParams(r0)
            r13.setTranslationX(r1)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13.setTranslationZ(r3)
            r0 = -1046478848(0xffffffffc1a00000, float:-20.0)
            r13.setRotation(r0)
            r2 = 1059816735(0x3f2b851f, float:0.67)
            r13.setScaleX(r2)
            r13.setScaleY(r2)
            r7.addView(r13)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r8)
            r7.A05 = r1
            r1.setImageDrawable(r10)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r5, r4, r11)
            r1.setLayoutParams(r0)
            r1.setTranslationX(r9)
            r1.setTranslationZ(r3)
            r1.setRotation(r12)
            r1.setScaleX(r2)
            r1.setScaleY(r2)
            r7.addView(r1)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r8)
            r7.A06 = r1
            r1.setImageDrawable(r6)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r5, r4, r11)
            r1.setLayoutParams(r0)
            r7.addView(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52871Ge4.<init>(android.content.Context, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, int, int):void");
    }

    public static final List A00(ImageView imageView, C52871Ge4 ge4, int i) {
        int i2 = -i;
        int i3 = i2 % 3;
        long j = (((long) (i3 + ((((i3 ^ 3) & ((-i3) | i3)) >> 31) & 3))) * 1600) + 1200;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ImageView imageView2 = imageView;
        C52871Ge4 ge42 = ge4;
        C52871Ge4 ge43 = ge42;
        ofFloat.addUpdateListener(new I82(imageView2, ge43, new float[2], 6));
        PathInterpolator pathInterpolator = ge43.A0E;
        ofFloat.setInterpolator(pathInterpolator);
        ofFloat.setDuration(400);
        ofFloat.setStartDelay(j);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.67f});
        ValueAnimator valueAnimator = ofFloat2;
        I84.A01(valueAnimator, imageView2, 24);
        valueAnimator.setDuration(400);
        valueAnimator.setStartDelay(j);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView2, View.ROTATION, new float[]{0.0f, -20.0f});
        ObjectAnimator objectAnimator = ofFloat3;
        objectAnimator.setDuration(400);
        objectAnimator.setStartDelay(j);
        objectAnimator.setInterpolator(pathInterpolator);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, View.TRANSLATION_Z, new float[]{0.0f, -1.0f});
        ObjectAnimator objectAnimator2 = ofFloat4;
        objectAnimator2.setDuration(10);
        objectAnimator2.setStartDelay(j);
        int i4 = (i2 + 1) % 3;
        long j2 = (((long) (i4 + ((((i4 ^ 3) & ((-i4) | i4)) >> 31) & 3))) * 1600) + 1200;
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat5.addUpdateListener(new I82(imageView2, ge42, new float[2], 7));
        ofFloat5.setInterpolator(pathInterpolator);
        ofFloat5.setDuration(400);
        ofFloat5.setStartDelay(j2);
        Property property = View.ROTATION;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView2, property, new float[]{-20.0f, 20.0f});
        ObjectAnimator objectAnimator3 = ofFloat6;
        objectAnimator3.setDuration(400);
        objectAnimator3.setStartDelay(j2);
        int i5 = (i2 + 2) % 3;
        long j3 = (((long) (i5 + ((((i5 ^ 3) & ((-i5) | i5)) >> 31) & 3))) * 1600) + 1200;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C52871Ge4 ge44 = ge42;
        ofFloat7.addUpdateListener(new I82(imageView2, ge44, new float[2], 8));
        ofFloat7.setInterpolator(pathInterpolator);
        ofFloat7.setDuration(400);
        ofFloat7.setStartDelay(j3);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(imageView2, property, new float[]{20.0f, 0.0f});
        ofFloat8.setDuration(400);
        ofFloat8.setStartDelay(j3);
        ofFloat8.setInterpolator(pathInterpolator);
        ValueAnimator ofFloat9 = ValueAnimator.ofFloat(new float[]{0.67f, 1.0f});
        I84.A01(ofFloat9, imageView2, 25);
        ofFloat9.setDuration(400);
        ofFloat9.setStartDelay(j3);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(imageView2, View.TRANSLATION_Z, new float[]{-1.0f, 0.0f});
        ofFloat10.setDuration(10);
        ofFloat10.setStartDelay(j3);
        return 0sr.A1P(new ValueAnimator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofFloat10});
    }
}
