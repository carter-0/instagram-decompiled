package com.meta.metaai.components.voice.animation.transrcipt.widget;

import X.0eP;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C51967G9n;
import X.JTO;
import X.JTT;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DisabledHorizontalScrollView extends HorizontalScrollView {
    public float A00;
    public float A01;
    public 0eP A02;
    public final Paint A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DisabledHorizontalScrollView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final float getAppearingWidth() {
        return this.A00;
    }

    public final float getDisappearingWidth() {
        return this.A01;
    }

    public final void draw(Canvas canvas) {
        Bitmap createBitmap;
        Canvas A0B;
        int A032 = AnonymousClass0fD.A03(-1469773218);
        0qQ.A0B(canvas, 0);
        0eP r0 = this.A02;
        if (r0 != null) {
            createBitmap = (Bitmap) r0.A00;
            A0B = (Canvas) r0.A01;
        } else {
            createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            A0B = JTO.A0B(createBitmap);
            this.A02 = AnonymousClass7TE.A1L(createBitmap, A0B);
        }
        A0B.drawColor(0, PorterDuff.Mode.CLEAR);
        View childAt = getChildAt(0);
        A0B.save();
        A0B.translate(childAt.getTranslationX(), 0.0f);
        childAt.draw(A0B);
        A0B.restore();
        float f = this.A01;
        if (f > 0.0f) {
            A0B.drawRect(new RectF(0.0f, 0.0f, f, AnonymousClass7TE.A03(this)), this.A03);
        }
        if (this.A00 > 0.0f) {
            A0B.drawRect(new RectF(AnonymousClass7TE.A02(this) - this.A00, 0.0f, AnonymousClass7TE.A02(this), AnonymousClass7TE.A03(this)), this.A03);
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
        AnonymousClass0fD.A0A(601407467, A032);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02 = null;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0fD.A0C(1699866799, AnonymousClass0fD.A05(-1294201786));
        return false;
    }

    public final void setAppearingWidth(float f) {
        this.A00 = f;
    }

    public final void setDisappearingWidth(float f) {
        this.A01 = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisabledHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A03 = A0V;
        A0V.setDither(true);
        Integer[] numArr = {C51967G9n.A0k(), C51967G9n.A0j()};
        int[] iArr = new int[2];
        int i = 0;
        do {
            iArr[i] = JTO.A0A(numArr, i);
            i++;
        } while (i < 2);
        Float[] fArr = {Float.valueOf(0.0f), C51967G9n.A0h()};
        float[] fArr2 = new float[2];
        int i2 = 0;
        do {
            fArr2[i2] = fArr[i2].floatValue();
            i2++;
        } while (i2 < 2);
        A0V.setShader(new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, iArr, fArr2, Shader.TileMode.CLAMP));
        A0V.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
    }

    public /* synthetic */ DisabledHorizontalScrollView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }
}
