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
import java.util.List;

public final class U2T extends MetricAffectingSpan implements AnonymousClass6MP, AnonymousClass6MR {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public C306576Mr A0B = C306576Mr.DISABLED;
    public float A0C;
    public float[][] A0D;
    public final Context A0E;
    public final Typeface A0F;

    public final /* synthetic */ void AQG(Canvas canvas) {
    }

    public final void AQO(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        Canvas canvas2 = canvas;
        Spanned spanned2 = spanned;
        AnonymousClass7TF.A1B(canvas, 1, spanned);
        Paint paint2 = paint;
        0qQ.A0B(paint, 7);
        if (i < this.A0D.length) {
            paint.setTypeface(this.A0F);
            float[] fArr = this.A0D[i];
            if (fArr != null) {
                paint.setColor(this.A06);
                float textSize = paint.getTextSize() * 0.03f;
                float f = 4.0f * textSize;
                int i6 = i2;
                int i7 = i3;
                canvas2.drawText(spanned2, i6, i7, fArr[0] + f, fArr[1] + f + this.A02, paint2);
                paint.setColor(this.A04);
                float f2 = 3.0f * textSize;
                canvas2.drawText(spanned2, i6, i7, fArr[0] + f2, fArr[1] + f2 + this.A00, paint2);
                paint.setColor(this.A07);
                float f3 = 2.0f * textSize;
                canvas2.drawText(spanned2, i6, i7, fArr[0] + f3, fArr[1] + f3 + this.A03, paint2);
                paint.setColor(this.A05);
                canvas2.drawText(spanned2, i6, i7, fArr[0] + textSize, fArr[1] + textSize + this.A01, paint2);
            }
        }
    }

    public final void Eo9(C306576Mr r2) {
        0qQ.A0B(r2, 0);
        this.A0B = r2;
    }

    public final void FLc(Layout layout, Integer num, float f, int i, int i2) {
        0qQ.A0B(layout, 0);
        this.A0C = f * 0.05f;
        int lineCount = layout.getLineCount();
        float[][] fArr = new float[lineCount][];
        for (int i3 = 0; i3 < lineCount; i3++) {
            fArr[i3] = new float[]{layout.getLineLeft(i3), (float) layout.getLineBaseline(i3)};
        }
        this.A0D = fArr;
    }

    public final void updateDrawState(TextPaint textPaint) {
    }

    public final void updateMeasureState(TextPaint textPaint) {
    }

    public final int BfU() {
        return this.A08;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.WUp, java.lang.Object, X.X6W] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.VTy] */
    public final X6W By4() {
        float f = this.A0C;
        int i = this.A0A;
        int i2 = this.A06;
        float[][] fArr = this.A0D;
        C306576Mr r1 = this.A0B;
        0qQ.A0B(fArr, 4);
        ? obj = new Object();
        obj.A00 = f;
        obj.A02 = i;
        obj.A01 = i2;
        obj.A03 = r1;
        obj.A04 = new ArrayList();
        for (float[] fArr2 : fArr) {
            ? obj2 = new Object();
            if (fArr2 != null) {
                obj2.A00 = fArr2[0];
                obj2.A01 = fArr2[1];
            }
            List list = obj.A04;
            if (list != null) {
                list.add(obj2);
            }
        }
        return obj;
    }

    public final /* synthetic */ Integer By7() {
        return AnonymousClass05K.A00;
    }

    public final C306576Mr C57() {
        return this.A0B;
    }

    public final void ESD(int i, int i2) {
        this.A08 = i;
        this.A09 = i2;
        C306576Mr r2 = this.A0B;
        C306576Mr r1 = C306576Mr.INVERTED;
        int i3 = i;
        if (r2 == r1) {
            i3 = i2;
        }
        this.A0A = i3;
        int i4 = i2;
        if (r2 == r1) {
            i4 = i;
        }
        this.A06 = i4;
        this.A07 = 0nH.A0A(i, i2, 1, 3);
        this.A05 = 0nH.A0A(this.A08, this.A09, 1, 5);
        this.A04 = 0nH.A0A(this.A08, this.A09, 3, 5);
    }

    public final /* synthetic */ boolean onPreDraw() {
        return true;
    }

    public U2T(Context context, float[][] fArr, float f) {
        this.A0E = context;
        this.A0C = f;
        this.A0D = fArr;
        this.A0F = AnonymousClass91U.A01(AnonymousClass0qo.A00(context), C358928bh.A0T);
    }
}
