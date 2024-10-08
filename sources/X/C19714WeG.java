package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WeG  reason: case insensitive filesystem */
public final class C19714WeG implements AnonymousClass6MP, AnonymousClass6MR {
    public float A00;
    public int A01;
    public int A02;
    public Paint A03;
    public C306576Mr A04;
    public boolean A05;
    public ArrayList A06;
    public ArrayList A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final Context A0C;
    public final boolean A0D;

    public C19714WeG(Context context, ArrayList arrayList, float f, float f2, float f3, float f4, float f5, boolean z) {
        this.A0C = context;
        this.A00 = f;
        this.A07 = arrayList;
        this.A0D = z;
        this.A0B = f2;
        this.A08 = f3;
        this.A09 = f4;
        this.A0A = f5;
        this.A06 = new ArrayList();
        this.A03 = new Paint(1);
        this.A05 = true;
        this.A04 = C306576Mr.DISABLED;
        this.A06 = C13988Tno.A0i(this.A07);
        this.A03.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A03.setPathEffect(new CornerPathEffect(this.A00));
    }

    public static void A01(C19714WeG weG, C306386Ly r10, List list, boolean z) {
        TextPaint textPaint = r10.A0b;
        weG.A03(C306496Mj.A03(list, textPaint.getTextSize() * 0.3f, textPaint.getTextSize() * 0.0f, textPaint.getTextSize() * -0.01f, textPaint.getTextSize() / 4.0f, z), textPaint.getTextSize());
        weG.onPreDraw();
    }

    public final void A03(List list, float f) {
        this.A07 = (ArrayList) list;
        this.A00 = f / 4.0f;
        this.A06 = C13988Tno.A0i(list);
    }

    public final void AQG(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A05) {
            this.A05 = false;
            Paint paint = this.A03;
            paint.setAlpha(255);
            Iterator A1G = AnonymousClass7TE.A1G(this.A06);
            while (A1G.hasNext()) {
                canvas.drawPath((Path) AnonymousClass7TF.A0a(A1G), paint);
            }
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
        ArrayList A022 = C306496Mj.A02(layout, f * this.A09, f * this.A0B, f * this.A08, this.A00, this.A0A);
        0qQ.A0C(A022, AnonymousClass000.A00(337));
        this.A07 = A022;
        this.A00 = f / 4.0f;
        this.A06 = C13988Tno.A0i(A022);
    }

    public final /* synthetic */ boolean onPreDraw() {
        this.A05 = true;
        return true;
    }

    public static void A00(Layout layout, C306386Ly r10, Object obj) {
        C19714WeG weG = (C19714WeG) obj;
        TextPaint textPaint = r10.A0b;
        weG.A03(C306496Mj.A02(layout, textPaint.getTextSize() * 0.3f, textPaint.getTextSize() * weG.A0B, textPaint.getTextSize() * weG.A08, weG.A00, 1.0f), textPaint.getTextSize());
    }

    public final void A02(Canvas canvas, Integer num) {
        if (this.A05) {
            this.A05 = false;
            if (num != null) {
                this.A03.setAlpha(num.intValue());
            }
            Iterator A1G = AnonymousClass7TE.A1G(this.A06);
            while (A1G.hasNext()) {
                canvas.drawPath((Path) AnonymousClass7TF.A0a(A1G), this.A03);
            }
        }
    }

    public final int BfU() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.WUr, java.lang.Object, X.X6W] */
    public final X6W By4() {
        int i = this.A01;
        int i2 = this.A02;
        float f = this.A00;
        ArrayList arrayList = this.A07;
        boolean z = this.A0D;
        float f2 = this.A0B;
        float f3 = this.A08;
        float f4 = this.A09;
        float f5 = this.A0A;
        C306576Mr r1 = this.A04;
        0qQ.A0B(arrayList, 4);
        ? obj = new Object();
        obj.A06 = i;
        obj.A05 = i2;
        obj.A01 = f;
        obj.A08 = arrayList;
        obj.A09 = z;
        obj.A04 = f2;
        obj.A00 = f3;
        obj.A02 = f4;
        obj.A03 = f5;
        obj.A07 = r1;
        return obj;
    }

    public final /* synthetic */ Integer By7() {
        return AnonymousClass05K.A00;
    }

    public final C306576Mr C57() {
        return this.A04;
    }

    public final void ESD(int i, int i2) {
        boolean z = this.A0D;
        if (z) {
            i = 0nH.A03(i);
        }
        this.A01 = i;
        if (z) {
            i2 = 0nH.A03(i2);
        }
        this.A02 = i2;
        Paint paint = this.A03;
        if (this.A04 == C306576Mr.INVERTED) {
            i2 = this.A01;
        }
        paint.setColor(i2);
    }
}
