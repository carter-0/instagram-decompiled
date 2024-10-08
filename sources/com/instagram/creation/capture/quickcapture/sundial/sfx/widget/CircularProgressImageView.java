package com.instagram.creation.capture.quickcapture.sundial.sfx.widget;

import X.0qQ;
import X.2Yu;
import X.AnonymousClass0eM;
import X.AnonymousClass1GD;
import X.AnonymousClass3NG;
import X.AnonymousClass7TE;
import X.C61685KHt;
import X.C64203LTq;
import X.JTO;
import X.JTT;
import X.MMR;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CircularProgressImageView extends CircularImageView implements Animator.AnimatorListener {
    public float A00;
    public View.OnClickListener A01;
    public boolean A02;
    public final Paint A03;
    public final Paint A04;
    public final RectF A05;
    public final AnonymousClass0eM A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CircularProgressImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        setAngle(0.0f);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A02) {
            canvas2.drawArc(this.A05, this.A00, 360.0f, false, this.A03);
        }
        canvas2.drawArc(this.A05, 270.0f, this.A00, false, this.A04);
    }

    private final C64203LTq getAnimation() {
        return (C64203LTq) this.A06.getValue();
    }

    public final float getAngle() {
        return this.A00;
    }

    public final View.OnClickListener getItemOnClickListener() {
        return this.A01;
    }

    public final void setProgressPaintColor(int i) {
        this.A04.setColor(i);
    }

    public final void A0I() {
        ValueAnimator valueAnimator = getAnimation().A02;
        if (valueAnimator.isStarted() && !valueAnimator.isPaused()) {
            valueAnimator.pause();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView, android.view.View] */
    public final void A0J() {
        C64203LTq animation = getAnimation();
        animation.A02.cancel();
        ? r1 = animation.A03;
        r1.setAngle(0.0f);
        r1.requestLayout();
    }

    public final void A0K() {
        getAnimation().A02.resume();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView, android.view.View] */
    public final void A0L(int i) {
        clearAnimation();
        ValueAnimator valueAnimator = getAnimation().A02;
        valueAnimator.setDuration((long) i);
        valueAnimator.start();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView, android.view.View] */
    public final void onMeasure(int i, int i2) {
        CircularProgressImageView.super.onMeasure(i, i2);
        float measuredWidth = (float) getMeasuredWidth();
        RectF rectF = this.A05;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = measuredWidth;
        rectF.bottom = (float) getMeasuredHeight();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView, android.view.View] */
    public final void setAngle(float f) {
        invalidate();
        this.A00 = f;
    }

    public final void setItemOnClickListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public final void setShouldDrawProgressBackground(boolean z) {
        this.A02 = z;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView, android.view.View, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircularProgressImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        float dimension = context.getResources().getDimension(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        Paint A0C = JTO.A0C();
        A0C.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        A0C.setStyle(style);
        A0C.setStrokeWidth(dimension);
        Paint.Cap cap = Paint.Cap.ROUND;
        A0C.setStrokeCap(cap);
        AnonymousClass7TE.A1N(context, A0C, 2Yu.A0H(context, R.attr.igds_color_icon_badge));
        this.A04 = A0C;
        Paint A0C2 = JTO.A0C();
        A0C2.setAntiAlias(true);
        A0C2.setStyle(style);
        A0C2.setStrokeWidth(dimension);
        A0C2.setStrokeCap(cap);
        AnonymousClass7TE.A1N(context, A0C2, 2Yu.A0H(context, AnonymousClass1GD.A03() ? R.attr.igds_color_separator_or_stroke_on_media : R.attr.igds_color_separator));
        this.A03 = A0C2;
        this.A05 = AnonymousClass7TE.A0Y();
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(this);
        A0m.A04 = new C61685KHt(this, 27);
        A0m.A02 = 0.75f;
        A0m.A07 = false;
        A0m.A00();
        this.A06 = MMR.A00(this, 33);
    }

    public /* synthetic */ CircularProgressImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CircularProgressImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
