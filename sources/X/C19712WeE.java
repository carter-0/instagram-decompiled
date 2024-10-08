package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;

/* renamed from: X.WeE  reason: case insensitive filesystem */
public final class C19712WeE implements AnonymousClass6MP, AnonymousClass6MR {
    public int A00;
    public int A01;
    public Paint A02;
    public Rect A03;
    public C306576Mr A04 = C306576Mr.DISABLED;
    public boolean A05 = true;
    public final float A06;
    public final float A07;
    public final float A08;
    public final Context A09;

    public C19712WeE(Context context, Rect rect, float f, float f2, float f3) {
        0qQ.A0B(rect, 5);
        this.A09 = context;
        this.A08 = f;
        this.A06 = f2;
        this.A07 = f3;
        this.A03 = rect;
        Paint paint = new Paint(1);
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public final void A00(Layout layout, float f) {
        float lineLeft = layout.getLineLeft(0);
        float lineRight = layout.getLineRight(0);
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            float lineLeft2 = layout.getLineLeft(i);
            float lineRight2 = layout.getLineRight(i);
            if (lineLeft2 < lineLeft) {
                lineLeft = lineLeft2;
            }
            if (lineRight2 > lineRight) {
                lineRight = lineRight2;
            }
        }
        Float valueOf = Float.valueOf(lineLeft);
        Float valueOf2 = Float.valueOf(lineRight);
        float floatValue = valueOf.floatValue();
        float f2 = this.A07 * f;
        this.A03 = new Rect((int) (floatValue - f2), (int) ((-this.A08) * f), (int) (valueOf2.floatValue() + f2), (int) (((float) layout.getHeight()) + (this.A06 * f)));
    }

    public final void AQG(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A05) {
            this.A05 = false;
            Paint paint = this.A02;
            paint.setAlpha(255);
            canvas.drawRect(this.A03, paint);
        }
    }

    public final /* synthetic */ void AQO(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        0qQ.A0B(canvas, 2);
        AQG(canvas);
    }

    public final void Eo9(C306576Mr r2) {
        0qQ.A0B(r2, 0);
        this.A04 = r2;
    }

    public final void FLc(Layout layout, Integer num, float f, int i, int i2) {
        0qQ.A0B(layout, 0);
        A00(layout, f);
    }

    public final /* synthetic */ boolean onPreDraw() {
        this.A05 = true;
        return true;
    }

    public final int BfU() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.VYq, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.WUq, java.lang.Object, X.X6W] */
    public final X6W By4() {
        int i = this.A00;
        int i2 = this.A01;
        C306576Mr r6 = this.A04;
        float f = this.A08;
        float f2 = this.A06;
        float f3 = this.A07;
        Rect rect = this.A03;
        0qQ.A0B(rect, 1);
        ? obj = new Object();
        obj.A01 = rect.left;
        obj.A03 = rect.top;
        obj.A02 = rect.right;
        obj.A00 = rect.bottom;
        ? obj2 = new Object();
        obj2.A03 = i;
        obj2.A04 = i2;
        obj2.A05 = r6;
        obj2.A02 = f;
        obj2.A00 = f2;
        obj2.A01 = f3;
        obj2.A06 = obj;
        return obj2;
    }

    public final /* synthetic */ Integer By7() {
        return AnonymousClass05K.A00;
    }

    public final C306576Mr C57() {
        return this.A04;
    }

    public final void ESD(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        Paint paint = this.A02;
        if (this.A04 == C306576Mr.INVERTED) {
            i2 = i;
        }
        paint.setColor(i2);
    }
}
