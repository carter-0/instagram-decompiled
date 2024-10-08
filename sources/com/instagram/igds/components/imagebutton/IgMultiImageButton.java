package com.instagram.igds.components.imagebutton;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass71S;
import X.C321476uF;
import X.C321486uG;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class IgMultiImageButton extends IgImageButton {
    public AnonymousClass71S A00;
    public int A01;
    public boolean A02;
    public final ValueAnimator A03;
    public final ValueAnimator.AnimatorUpdateListener A04;
    public final C321486uG A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgMultiImageButton(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void A0E(AnonymousClass0iw r3, ImageUrl imageUrl, int i) {
        0qQ.A0B(imageUrl, 0);
        AnonymousClass71S r0 = this.A00;
        if (r0 != null) {
            r0.A00(this);
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator.isRunning()) {
            valueAnimator.end();
        }
        IgMultiImageButton.super.A0E(r3, imageUrl, i);
    }

    public void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A02) {
            C321486uG r3 = this.A05;
            int i = r3.A00 + r3.A06;
            float f = (float) r3.A07;
            r3.setBounds(0, 0, i, i);
            canvas.save();
            canvas.translate(((float) (canvas.getWidth() - i)) - f, f);
            r3.draw(canvas);
            canvas.restore();
        }
    }

    public void setUrl(ImageUrl imageUrl, AnonymousClass0iw r4) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass71S r0 = this.A00;
        if (r0 != null) {
            r0.A00(this);
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator.isRunning()) {
            valueAnimator.end();
        }
        IgMultiImageButton.super.setUrl(imageUrl, r4);
    }

    public final void setCoordinator(AnonymousClass71S r2) {
        AnonymousClass71S r0 = this.A00;
        if (r0 != null) {
            r0.A00(this);
        }
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    public final void setNumberedCheckBoxEnabled(boolean z) {
        this.A02 = z;
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    public final void setSelected(int i) {
        this.A01 = i;
        C321486uG r3 = this.A05;
        r3.A00(i);
        boolean z = false;
        if (this.A01 > -1) {
            z = true;
        }
        r3.A04 = z;
        r3.invalidateSelf();
        invalidate();
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(616213253);
        IgMultiImageButton.super.onAttachedToWindow();
        this.A03.addUpdateListener(this.A04);
        AnonymousClass0fD.A0D(-337634269, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-528950392);
        IgMultiImageButton.super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.A03;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.removeUpdateListener(this.A04);
        AnonymousClass71S r0 = this.A00;
        if (r0 != null) {
            r0.A00(this);
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.end();
        }
        AnonymousClass0fD.A0D(-389131031, A06);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgMultiImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A03 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.A04 = new C321476uF(this);
        this.A05 = new C321486uG(context);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgMultiImageButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgMultiImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
