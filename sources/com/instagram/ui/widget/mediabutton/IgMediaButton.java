package com.instagram.ui.widget.mediabutton;

import X.00l;
import X.0qQ;
import X.C3020561i;
import X.C51966G9m;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class IgMediaButton extends ConstraintLayout {
    public static final Interpolator A0A = new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f);
    public final ObjectAnimator A00;
    public final ObjectAnimator A01;
    public final ObjectAnimator A02;
    public final ObjectAnimator A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ImageView A08;
    public final TextView A09;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgMediaButton(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r4 = 1
            r2 = r20
            X.0qQ.A0B(r2, r4)
            r5 = r19
            r1 = r21
            r0 = r22
            r5.<init>(r2, r1, r0)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            r0 = 2131627706(0x7f0e0eba, float:1.8882684E38)
            r1.inflate(r0, r5, r4)
            r0 = 2131435883(0x7f0b216b, float:1.849362E38)
            android.widget.ImageView r9 = X.DbU.A0F(r5, r0)
            r5.A04 = r9
            r0 = 2131435887(0x7f0b216f, float:1.8493629E38)
            android.widget.ImageView r0 = X.DbU.A0F(r5, r0)
            r5.A08 = r0
            r0 = 2131435888(0x7f0b2170, float:1.849363E38)
            android.widget.TextView r0 = X.DbU.A0G(r5, r0)
            r5.A09 = r0
            r0 = 2131435884(0x7f0b216c, float:1.8493623E38)
            android.widget.ImageView r7 = X.DbU.A0F(r5, r0)
            r5.A05 = r7
            r0 = 2131435886(0x7f0b216e, float:1.8493627E38)
            android.widget.ImageView r6 = X.DbU.A0F(r5, r0)
            r5.A07 = r6
            r0 = 2131435885(0x7f0b216d, float:1.8493625E38)
            android.widget.ImageView r3 = X.DbU.A0F(r5, r0)
            r5.A06 = r3
            X.2eS.A01(r5)
            r8 = 2
            float[] r0 = new float[r4]
            r12 = 0
            r2 = 1066192077(0x3f8ccccd, float:1.1)
            r0[r12] = r2
            java.lang.String r11 = "scaleX"
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r11, r0)
            float[] r0 = new float[r4]
            r0[r12] = r2
            java.lang.String r10 = "scaleY"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r10, r0)
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[]{r1, r0}
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r9, r0)
            r0 = 700(0x2bc, double:3.46E-321)
            r9.setDuration(r0)
            r9.setRepeatMode(r8)
            r2 = -1
            r9.setRepeatCount(r2)
            r1 = 1084227584(0x40a00000, float:5.0)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r1)
            r9.setInterpolator(r0)
            r5.A00 = r9
            float[] r0 = new float[r8]
            r0 = {1063675494, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r13 = android.animation.PropertyValuesHolder.ofFloat(r11, r0)
            float[] r0 = new float[r8]
            r0 = {1063675494, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r14 = android.animation.PropertyValuesHolder.ofFloat(r10, r0)
            float[] r1 = new float[r4]
            r0 = -1047527424(0xffffffffc1900000, float:-18.0)
            r1[r12] = r0
            java.lang.String r0 = "translationX"
            android.animation.PropertyValuesHolder r15 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            float[] r1 = new float[r4]
            r0 = -1048576000(0xffffffffc1800000, float:-16.0)
            r1[r12] = r0
            java.lang.String r0 = "translationY"
            android.animation.PropertyValuesHolder r16 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            float[] r1 = new float[r8]
            r1 = {1065353216, 0} // fill-array
            java.lang.String r0 = "alpha"
            android.animation.PropertyValuesHolder r17 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            float[] r8 = new float[r8]
            r0 = 0
            r8[r12] = r0
            double r0 = java.lang.Math.random()
            r9 = 4628855992006737920(0x403d000000000000, double:29.0)
            double r0 = r0 * r9
            float r9 = (float) r0
            r0 = -1050673152(0xffffffffc1600000, float:-14.0)
            float r9 = r9 + r0
            r8[r4] = r9
            java.lang.String r0 = "rotation"
            android.animation.PropertyValuesHolder r18 = android.animation.PropertyValuesHolder.ofFloat(r0, r8)
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[]{r13, r14, r15, r16, r17, r18}
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            r0 = 1400(0x578, double:6.917E-321)
            r7.setDuration(r0)
            r0 = 750(0x2ee, double:3.705E-321)
            r7.setStartDelay(r0)
            r7.setRepeatCount(r2)
            r7.setRepeatMode(r4)
            android.view.animation.Interpolator r0 = A0A
            r7.setInterpolator(r0)
            r1 = 7
            X.LTd r0 = new X.LTd
            r0.<init>(r1, r5, r7)
            r7.addListener(r0)
            r5.A01 = r7
            r4 = 1069547520(0x3fc00000, float:1.5)
            r1 = 400(0x190, double:1.976E-321)
            r0 = 1056964608(0x3f000000, float:0.5)
            android.animation.ObjectAnimator r0 = A00(r3, r4, r0, r1)
            r5.A02 = r0
            r3 = 1068708659(0x3fb33333, float:1.4)
            r1 = 800(0x320, double:3.953E-321)
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            android.animation.ObjectAnimator r0 = A00(r6, r3, r0, r1)
            r5.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.mediabutton.IgMediaButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static final ObjectAnimator A00(ImageView imageView, float f, float f2, long j) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{f}), PropertyValuesHolder.ofFloat("alpha", new float[]{f2, 0.0f})});
        ofPropertyValuesHolder.setDuration(1400);
        ofPropertyValuesHolder.setStartDelay(j);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setRepeatMode(1);
        ofPropertyValuesHolder.setInterpolator(new C3020561i());
        return ofPropertyValuesHolder;
    }

    public final void setLabel(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        TextView textView = this.A09;
        textView.setVisibility(0);
        textView.setText(charSequence);
        if (C51966G9m.A1X(charSequence)) {
            CharSequence contentDescription = getContentDescription();
            if (contentDescription == null || 00l.A0W(contentDescription)) {
                setContentDescription(charSequence);
            }
        }
    }

    public final void setDrawableLarge(Drawable drawable) {
        ImageView imageView = this.A04;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
    }

    public final void setDrawableMedium(Drawable drawable) {
        ImageView imageView = this.A08;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgMediaButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgMediaButton(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
