package com.instagram.ui.widget.pulsingbutton;

import X.0qQ;
import X.AnonymousClass37O;
import X.C66580MXl;
import X.C73150PXl;
import X.JTT;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PulsingPillButton extends FrameLayout {
    public float A00;
    public float A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public final AnimatorSet A06;
    public final GradientDrawable A07;
    public final FrameLayout A08;
    public final FrameLayout A09;
    public final TypedArray A0A;
    public final GradientDrawable A0B;
    public final GradientDrawable A0C;
    public final View A0D;
    public final ImageView A0E;
    public final ImageView A0F;
    public final ImageView A0G;
    public final ImageView A0H;
    public final LinearLayout A0I;
    public final TextView A0J;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PulsingPillButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void setEndButtonClickListener(View.OnClickListener onClickListener) {
        0qQ.A0B(onClickListener, 0);
        this.A0E.setOnClickListener(onClickListener);
    }

    public final void A00(int i, int i2) {
        this.A05 = i;
        this.A07.setColors(new int[]{i, i2});
        this.A0B.setStroke(2, i);
        this.A0C.setStroke(2, i);
    }

    public final View getView() {
        return this.A0D;
    }

    public final void setButtonDrawable(Drawable drawable) {
        this.A0F.setImageDrawable(drawable);
    }

    public final void setButtonResource(int i) {
        this.A0F.setImageResource(i);
    }

    public final void setButtonSecondaryResource(int i) {
        ImageView imageView = this.A0G;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
    }

    public final void setButtonTertiaryResource(int i) {
        ImageView imageView = this.A0H;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
    }

    public final void setButtonText(int i) {
        if (i != 0) {
            this.A0J.setText(i);
            this.A07.setSize(0, 0);
            AnimatorSet animatorSet = this.A06;
            if (animatorSet.isStarted()) {
                animatorSet.end();
                FrameLayout frameLayout = this.A08;
                frameLayout.setVisibility(8);
                this.A09.setVisibility(8);
                frameLayout.post(new C73150PXl(this));
                return;
            }
            return;
        }
        this.A0J.setText((CharSequence) null);
    }

    public final void setButtonTextCaps(boolean z) {
        this.A0J.setAllCaps(z);
    }

    public final void setButtonTextColor(int i) {
        this.A0J.setTextColor(i);
    }

    public final void setButtonTextStyle(int i) {
        this.A0J.setTextAppearance(i);
    }

    public final void setEndButtonResource(int i) {
        ImageView imageView = this.A0E;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
    }

    public final void setIconColor(int i) {
        this.A0F.setColorFilter(AnonymousClass37O.A00(i));
        this.A0G.setColorFilter(AnonymousClass37O.A00(i));
        this.A0H.setColorFilter(AnonymousClass37O.A00(i));
        this.A0E.setColorFilter(AnonymousClass37O.A00(i));
    }

    public final void setPulseCircleStrokeColor(int i) {
        this.A0B.setStroke(2, i);
        this.A0C.setStroke(2, i);
    }

    public final void setPulsingEnabled(boolean z) {
        this.A04 = z;
        if (!z) {
            AnimatorSet animatorSet = this.A06;
            if (animatorSet.isStarted()) {
                animatorSet.end();
            }
        } else if (!this.A06.isStarted()) {
            this.A08.post(new C73150PXl(this));
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LinearLayout linearLayout = this.A0I;
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        float f = ((float) measuredHeight) / 2.0f;
        GradientDrawable gradientDrawable = this.A07;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setSize(measuredWidth, measuredHeight);
        FrameLayout frameLayout = this.A08;
        C66580MXl.A1C(frameLayout, measuredWidth);
        C66580MXl.A1B(frameLayout, measuredHeight);
        GradientDrawable gradientDrawable2 = this.A0B;
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setSize(measuredWidth, measuredHeight);
        FrameLayout frameLayout2 = this.A09;
        C66580MXl.A1C(frameLayout2, measuredWidth);
        C66580MXl.A1B(frameLayout2, measuredHeight);
        GradientDrawable gradientDrawable3 = this.A0C;
        gradientDrawable3.setCornerRadius(f);
        gradientDrawable3.setSize(measuredWidth, measuredHeight);
    }

    public final void setInnerCirclePulseDistanceDp(float f) {
        this.A00 = f;
    }

    public final void setOuterCirclePulseDistanceDp(float f) {
        this.A01 = f;
    }

    public final void setPulseInward(boolean z) {
        this.A03 = z;
    }

    public final void setPulseRepeatCount(int i) {
        this.A02 = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PulsingPillButton(android.content.Context r15, android.util.AttributeSet r16, int r17) {
        /*
            r14 = this;
            r3 = 1
            X.0qQ.A0B(r15, r3)
            r2 = r16
            r0 = r17
            r14.<init>(r15, r2, r0)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r15)
            r0 = 2131628577(0x7f0e1221, float:1.888445E38)
            android.view.View r1 = X.DbT.A0D(r1, r14, r0, r3)
            r14.A0D = r1
            int[] r0 = X.C71382cm.A1s
            android.content.res.TypedArray r2 = r15.obtainStyledAttributes(r2, r0)
            X.0qQ.A07(r2)
            r14.A0A = r2
            r0 = 2131438862(0x7f0b2d0e, float:1.8499663E38)
            android.view.View r13 = X.AnonymousClass7TF.A0F(r1, r0)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r14.A0I = r13
            r0 = 2131438858(0x7f0b2d0a, float:1.8499655E38)
            android.view.View r12 = X.AnonymousClass7TF.A0F(r1, r0)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r14.A08 = r12
            r0 = 2131438859(0x7f0b2d0b, float:1.8499657E38)
            android.view.View r11 = X.AnonymousClass7TF.A0F(r1, r0)
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            r14.A09 = r11
            r0 = 2131438864(0x7f0b2d10, float:1.8499667E38)
            android.widget.ImageView r0 = X.DbX.A0J(r1, r0)
            r14.A0F = r0
            r0 = 2131438865(0x7f0b2d11, float:1.8499669E38)
            android.widget.ImageView r0 = X.DbX.A0J(r1, r0)
            r14.A0G = r0
            r0 = 2131438866(0x7f0b2d12, float:1.849967E38)
            android.widget.ImageView r0 = X.DbX.A0J(r1, r0)
            r14.A0H = r0
            r0 = 2131438863(0x7f0b2d0f, float:1.8499665E38)
            android.widget.ImageView r0 = X.DbX.A0J(r1, r0)
            r14.A0E = r0
            r0 = 2131438867(0x7f0b2d13, float:1.8499673E38)
            android.widget.TextView r0 = X.AnonymousClass7TG.A0R(r1, r0)
            r14.A0J = r0
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            r14.A0B = r10
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
            r9.<init>()
            r14.A0C = r9
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r14.A06 = r0
            r0 = 1082130432(0x40800000, float:4.0)
            r14.A00 = r0
            r0 = 1090519040(0x41000000, float:8.0)
            r14.A01 = r0
            r8 = 2
            r14.A02 = r8
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r7 = r15.getColor(r0)
            int r6 = r15.getColor(r0)
            r0 = 2131100011(0x7f06016b, float:1.7812391E38)
            int r1 = r15.getColor(r0)
            int r0 = r2.getColor(r3, r1)
            r14.A05 = r0
            r4 = 0
            int r0 = r2.getColor(r4, r1)
            int r5 = r14.A05
            android.graphics.drawable.GradientDrawable$Orientation r3 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR
            int[] r1 = new int[]{r5, r0}
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r3, r1)
            r14.A07 = r0
            r0.setShape(r4)
            r13.setBackground(r0)
            r10.setShape(r4)
            r10.setStroke(r8, r5)
            r12.setBackground(r10)
            r9.setShape(r4)
            r9.setStroke(r8, r5)
            r11.setBackground(r9)
            r0 = 6
            int r0 = r2.getResourceId(r0, r4)
            r14.setButtonText(r0)
            r0 = 7
            int r0 = r2.getColor(r0, r7)
            r14.setButtonTextColor(r0)
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r8)
            r14.setButtonDrawable(r0)
            r0 = 3
            int r0 = r2.getColor(r0, r6)
            r14.setIconColor(r0)
            r0 = 4
            boolean r0 = r2.getBoolean(r0, r4)
            r14.setPulsingEnabled(r0)
            r0 = 5
            int r0 = r2.getInt(r0, r4)
            r14.A02 = r0
            r2.recycle()
            android.widget.FrameLayout r1 = r14.A08
            X.PXl r0 = new X.PXl
            r0.<init>(r14)
            r1.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.pulsingbutton.PulsingPillButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* synthetic */ PulsingPillButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PulsingPillButton(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
