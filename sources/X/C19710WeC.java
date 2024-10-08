package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WeC  reason: case insensitive filesystem */
public final class C19710WeC implements AnonymousClass6MP, AnonymousClass6MR {
    public int A00;
    public C306576Mr A01 = C306576Mr.DISABLED;
    public ArrayList A02;
    public boolean A03 = true;
    public final Paint A04;
    public final ArrayList A05;

    public C19710WeC(ArrayList arrayList) {
        this.A05 = arrayList;
        Paint paint = new Paint();
        this.A04 = paint;
        this.A02 = C13988Tno.A0i(arrayList);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public final void AQG(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A03) {
            this.A03 = false;
            Iterator A1G = AnonymousClass7TE.A1G(this.A02);
            while (A1G.hasNext()) {
                canvas.drawPath((Path) AnonymousClass7TF.A0a(A1G), this.A04);
            }
        }
    }

    public final /* synthetic */ void AQO(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        0qQ.A0B(canvas, 2);
        AQG(canvas);
    }

    public final void Eo9(C306576Mr r2) {
        0qQ.A0B(r2, 0);
        this.A01 = r2;
    }

    public final void FLc(Layout layout, Integer num, float f, int i, int i2) {
        0qQ.A0B(layout, 0);
        this.A02 = C13988Tno.A0i(VIL.A00(layout, f, i, i2));
    }

    public final /* synthetic */ boolean onPreDraw() {
        this.A03 = true;
        return true;
    }

    public final int BfU() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.WUk, java.lang.Object, X.X6W] */
    public final X6W By4() {
        int color = this.A04.getColor();
        ArrayList arrayList = this.A05;
        C306576Mr r1 = this.A01;
        ? obj = new Object();
        obj.A00 = color;
        obj.A02 = arrayList;
        obj.A01 = r1;
        return obj;
    }

    public final /* synthetic */ Integer By7() {
        return AnonymousClass05K.A00;
    }

    public final C306576Mr C57() {
        return this.A01;
    }

    public final void ESD(int i, int i2) {
        this.A00 = i;
        Paint paint = this.A04;
        if (this.A01 == C306576Mr.INVERTED) {
            i2 = i;
        }
        paint.setColor(i2);
    }
}
