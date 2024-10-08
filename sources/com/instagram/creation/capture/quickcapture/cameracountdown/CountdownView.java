package com.instagram.creation.capture.quickcapture.cameracountdown;

import X.0mi;
import X.2cs;
import X.AnonymousClass2S0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C71392co;
import X.JTO;
import X.JTP;
import X.K0E;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

public class CountdownView extends View {
    public float A00;
    public int A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final Rect A05;
    public final RectF A06;
    public final TextPaint A07;
    public final String[] A08;
    public final 2cs A09;

    public CountdownView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float A022 = AnonymousClass7TE.A02(this);
        float A032 = AnonymousClass7TE.A03(this);
        float f = this.A02 / 2.0f;
        float A012 = 0mi.A01(this.A00, 0.0f, 1.0f, 0.0f, 360.0f);
        canvas.save();
        RectF rectF = this.A06;
        float f2 = this.A03;
        float f3 = f + f2;
        rectF.set(f3, f3, (A022 - f) - f2, (A032 - f) - f2);
        canvas.drawArc(rectF, A012 - 90.0f, 360.0f - A012, false, this.A04);
        canvas.restore();
        float A023 = AnonymousClass7TE.A02(this);
        float A033 = AnonymousClass7TE.A03(this);
        String str = this.A08[this.A01];
        TextPaint textPaint = this.A07;
        int length = str.length();
        Rect rect = this.A05;
        textPaint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, A023 / 2.0f, (A033 / 2.0f) + (((float) rect.height()) / 2.0f), textPaint);
    }

    public void setProgress(float f) {
        this.A00 = f;
        int A012 = (int) 0mi.A01(f, 0.0f, 1.0f, 2.999f, 0.0f);
        if (this.A01 != A012) {
            this.A01 = A012;
            2cs r3 = this.A09;
            r3.A08(0.0d, true);
            r3.A03();
            AnonymousClass2S0.A01.A03();
        }
        invalidate();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A07.setTextSize(AnonymousClass7TE.A02(this) * 0.375f);
    }

    public CountdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.A05 = AnonymousClass7TE.A0W();
        this.A06 = AnonymousClass7TE.A0Y();
        String[] strArr = new String[3];
        int i3 = 0;
        do {
            i2 = i3 + 1;
            strArr[i3] = String.valueOf(i2);
            i3 = i2;
        } while (i2 < 3);
        this.A08 = strArr;
        this.A01 = 0;
        Resources resources = context.getResources();
        float A0C = (float) AnonymousClass7TE.A0C(resources);
        this.A02 = A0C;
        float A032 = (float) JTP.A03(resources);
        this.A03 = A032;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A04 = A0V;
        A0V.setColor(-1);
        JTO.A1N(A0V);
        A0V.setStrokeWidth(A0C);
        A0V.setStrokeCap(Paint.Cap.ROUND);
        TextPaint textPaint = new TextPaint(1);
        this.A07 = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setFakeBoldText(true);
        int color = context.getColor(R.color.black_15_transparent);
        A0V.setShadowLayer(A032, 0.0f, 0.0f, color);
        textPaint.setShadowLayer(A032, 0.0f, 0.0f, color);
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A09(C71392co.A04(20.0d, 8.0d));
        this.A09 = A0J;
        K0E.A00(A0J, this, 3);
    }

    public CountdownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
