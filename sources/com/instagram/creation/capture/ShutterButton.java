package com.instagram.creation.capture;

import X.0qQ;
import X.2Yu;
import X.2eS;
import X.AnonymousClass7TE;
import X.JTP;
import X.JTT;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ShutterButton extends View {
    public float A00;
    public Integer A01;
    public Integer A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final ArgbEvaluator A0G;
    public final Paint A0H;

    public ShutterButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        float width = ((float) canvas.getWidth()) / 2.0f;
        float height = ((float) canvas.getHeight()) / 2.0f;
        float height2 = ((float) canvas.getHeight()) / 2.0f;
        Paint paint = this.A0H;
        paint.setColor(this.A0F);
        canvas.drawCircle(width, height, height2, paint);
        paint.setColor(JTP.A09(this.A01));
        canvas.drawCircle(width, height, (float) AnonymousClass7TE.A05(0.90909094f, height2), paint);
        paint.setColor(JTP.A09(this.A02));
        canvas.drawCircle(width, height, (float) AnonymousClass7TE.A05(height2, 0.54545456f), paint);
    }

    public final void setProgress(float f) {
        this.A00 = f;
        A00(f);
        invalidate();
    }

    public final void A00(float f) {
        ArgbEvaluator argbEvaluator;
        Integer valueOf;
        int i;
        if (isPressed() || isActivated()) {
            argbEvaluator = this.A0G;
            Object evaluate = argbEvaluator.evaluate(f, Integer.valueOf(this.A0B), Integer.valueOf(this.A05));
            0qQ.A0C(evaluate, "null cannot be cast to non-null type kotlin.Int");
            this.A01 = (Integer) evaluate;
            valueOf = Integer.valueOf(this.A0E);
            i = this.A08;
        } else {
            boolean isEnabled = isEnabled();
            argbEvaluator = this.A0G;
            if (!isEnabled) {
                Object evaluate2 = argbEvaluator.evaluate(f, Integer.valueOf(this.A0A), Integer.valueOf(this.A04));
                0qQ.A0C(evaluate2, "null cannot be cast to non-null type kotlin.Int");
                this.A01 = (Integer) evaluate2;
                valueOf = Integer.valueOf(this.A0D);
                i = this.A07;
            } else {
                Object evaluate3 = argbEvaluator.evaluate(f, Integer.valueOf(this.A09), Integer.valueOf(this.A03));
                0qQ.A0C(evaluate3, "null cannot be cast to non-null type kotlin.Int");
                this.A01 = (Integer) evaluate3;
                valueOf = Integer.valueOf(this.A0C);
                i = this.A06;
            }
        }
        Object evaluate4 = argbEvaluator.evaluate(f, valueOf, Integer.valueOf(i));
        0qQ.A0C(evaluate4, "null cannot be cast to non-null type kotlin.Int");
        this.A02 = (Integer) evaluate4;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A00(this.A00);
        invalidate();
    }

    public ShutterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0G = new ArgbEvaluator();
        this.A0H = JTP.A0D();
        Context context2 = getContext();
        this.A0F = 2Yu.A0F(context2, R.attr.captureStrokeRing);
        this.A09 = 2Yu.A0F(context2, R.attr.captureCameraOuterRing);
        this.A0C = 2Yu.A0F(context2, R.attr.captureCameraInnerRing);
        this.A03 = 2Yu.A0F(context2, R.attr.captureCamcorderOuterRing);
        this.A06 = 2Yu.A0F(context2, R.attr.captureCamcorderInnerRing);
        this.A05 = 2Yu.A0F(context2, R.attr.captureCamcorderOuterRingPressed);
        this.A08 = 2Yu.A0F(context2, R.attr.captureCamcorderInnerRingPressed);
        this.A07 = 2Yu.A0F(context2, R.attr.captureCamcorderInnerRingDisable);
        this.A04 = 2Yu.A0F(context2, R.attr.captureCamcorderOuterRingDisable);
        this.A0B = 2Yu.A0F(context2, R.attr.captureCameraOuterRingPressed);
        this.A0E = 2Yu.A0F(context2, R.attr.captureCameraInnerRingPressed);
        this.A0A = 2Yu.A0F(context2, R.attr.captureCameraOuterRing);
        this.A0D = 2Yu.A0F(context2, R.attr.captureCameraInnerRing);
        A00(0.0f);
        2eS.A01(this);
    }

    public /* synthetic */ ShutterButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }
}
