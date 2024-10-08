package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;

/* renamed from: X.91R  reason: invalid class name */
public final class AnonymousClass91R extends MetricAffectingSpan implements AnonymousClass6MP, AnonymousClass6MR {
    public int A00;
    public int A01;
    public int A02;
    public C306576Mr A03;
    public boolean A04;
    public float[][] A05;
    public final float A06;
    public final Paint A07 = new Paint();
    public final Typeface A08;
    public final C358928bh A09;
    public final Context A0A;

    public AnonymousClass91R(Context context, C358928bh r4, float[][] fArr, float f) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r4, 2);
        this.A0A = context;
        this.A09 = r4;
        this.A06 = f;
        this.A05 = fArr;
        this.A08 = AnonymousClass91U.A01(AnonymousClass0qo.A00(context), r4);
        this.A04 = true;
        this.A03 = C306576Mr.DISABLED;
    }

    public final /* synthetic */ void AQG(Canvas canvas) {
    }

    public final void AQO(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        int i6;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 1);
        Spanned spanned2 = spanned;
        0qQ.A0B(spanned2, 2);
        0qQ.A0B(paint, 7);
        if (this.A04 && i < this.A05.length) {
            Typeface typeface = this.A08;
            paint.setTypeface(typeface);
            float[] fArr = this.A05[i];
            if (fArr != null) {
                Paint paint2 = this.A07;
                paint2.set(paint);
                paint2.setTypeface(typeface);
                paint2.setColor(this.A00);
                paint2.setStyle(Paint.Style.STROKE);
                C358928bh r2 = this.A09;
                paint2.setLetterSpacing(r2.A00 + this.A06);
                paint2.setStrokeJoin(Paint.Join.ROUND);
                paint2.setStrokeWidth(paint.getTextSize() * r2.A02);
                int i7 = i2;
                int i8 = i3;
                canvas2.drawText(spanned2, i7, i8, fArr[0], fArr[1], paint2);
                Float f = r2.A03;
                if (f != null) {
                    float floatValue = f.floatValue();
                    if (this.A03 == C306576Mr.INVERTED_OUTLINED) {
                        i6 = this.A02;
                    } else {
                        i6 = this.A01;
                    }
                    paint2.setColor(i6);
                    paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint2.setStrokeWidth(paint.getTextSize() * floatValue);
                    canvas2.drawText(spanned2, i7, i8, fArr[0], fArr[1], paint2);
                }
                C358848bZ[] r1 = (C358848bZ[]) C263324Kh.A06(spanned2, C358848bZ.class);
                if (r1.length != 0) {
                    C358848bZ r12 = r1[0];
                    r12.A01 = 0.0f;
                    r12.A00 = 0.0f;
                }
            }
        }
    }

    public final void Eo9(C306576Mr r2) {
        0qQ.A0B(r2, 0);
        this.A03 = r2;
    }

    public final void FLc(Layout layout, Integer num, float f, int i, int i2) {
        0qQ.A0B(layout, 0);
        if (this.A04) {
            this.A05 = A1T.A00(layout);
        }
    }

    public final /* synthetic */ boolean onPreDraw() {
        this.A04 = true;
        return true;
    }

    public final void updateMeasureState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setTypeface(this.A08);
        textPaint.setLetterSpacing(this.A09.A00 + this.A06);
    }

    public final int BfU() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.Abv, java.lang.Object, X.X6W] */
    public final X6W By4() {
        int i = this.A01;
        int i2 = this.A02;
        String name = this.A09.name();
        float f = this.A06;
        C306576Mr r5 = this.A03;
        ArrayList arrayList = new ArrayList();
        float[][] fArr = this.A05;
        for (float[] fArr2 : fArr) {
            if (fArr2 != null) {
                arrayList.add(Float.valueOf(fArr2[0]));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (float[] fArr3 : fArr) {
            if (fArr3 != null) {
                arrayList2.add(Float.valueOf(fArr3[1]));
            }
        }
        0qQ.A0B(name, 3);
        0qQ.A0B(r5, 5);
        ? obj = new Object();
        obj.A01 = i;
        obj.A02 = i2;
        obj.A04 = name;
        obj.A00 = f;
        obj.A03 = r5;
        obj.A05 = arrayList;
        obj.A06 = arrayList2;
        return obj;
    }

    public final Integer By7() {
        return AnonymousClass05K.A01;
    }

    public final C306576Mr C57() {
        return this.A03;
    }

    public final void ESD(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        if (this.A03 != C306576Mr.INVERTED_OUTLINED) {
            i = i2;
        }
        this.A00 = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setTypeface(this.A08);
            textPaint.setLetterSpacing(this.A09.A00 + this.A06);
        }
    }
}
