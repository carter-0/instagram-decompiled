package com.instagram.ui.widget.emitter;

import X.0qQ;
import X.AnonymousClass0fD;
import X.C278204wS;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PulseEmitter extends View {
    public static final float[] A08 = {0.75f, 0.95f, 1.0f};
    public static final int[] A09 = {Color.argb(255, 25, 25, 25), Color.argb(255, 69, 69, 69), Color.argb(255, 89, 89, 89)};
    public boolean A00;
    public int[] A01;
    public final List A02;
    public final List A03;
    public final Paint A04;
    public final Picture A05;
    public final Handler A06;
    public final float[] A07;

    public PulseEmitter(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Picture picture = this.A05;
        Canvas beginRecording = picture.beginRecording(getWidth(), getHeight());
        0qQ.A07(beginRecording);
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        Paint paint = this.A04;
        beginRecording.drawCircle(width, height, width, paint);
        List list = this.A03;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object animatedValue = ((ValueAnimator) list.get(i)).getAnimatedValue();
            0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Number) animatedValue).floatValue();
            beginRecording.save();
            beginRecording.scale(floatValue, floatValue, width, height);
            beginRecording.drawCircle(width, height, width, paint);
            beginRecording.restore();
        }
        canvas.drawPicture(picture);
    }

    public final void setGradientColors(int[] iArr) {
        0qQ.A0B(iArr, 0);
        this.A01 = iArr;
        if (getWidth() > 0 && getHeight() > 0) {
            A00(getWidth(), getHeight());
        }
    }

    private final void A00(int i, int i2) {
        float f = ((float) i) / 2.0f;
        this.A04.setShader(new RadialGradient(f, ((float) i2) / 2.0f, f, this.A01, this.A07, Shader.TileMode.CLAMP));
    }

    public final void A01() {
        if (!this.A00) {
            this.A00 = true;
            this.A06.sendEmptyMessage(0);
        }
    }

    public final void A02() {
        if (this.A00) {
            this.A00 = false;
            this.A06.removeMessages(0);
            List<Animator> list = this.A03;
            for (Animator cancel : list) {
                cancel.cancel();
            }
            list.clear();
            this.A02.clear();
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1526535855);
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            A01();
        }
        AnonymousClass0fD.A0D(1282001367, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(551056016);
        super.onDetachedFromWindow();
        A02();
        AnonymousClass0fD.A0D(1816822822, A062);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (getVisibility() == 0) {
            A01();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(216059109);
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        AnonymousClass0fD.A0D(1589603495, A062);
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        A02();
    }

    public PulseEmitter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A05 = new Picture();
        Paint paint = new Paint();
        this.A04 = paint;
        this.A01 = A09;
        this.A07 = A08;
        this.A06 = new C278204wS(Looper.getMainLooper(), this);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PulseEmitter(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PulseEmitter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
