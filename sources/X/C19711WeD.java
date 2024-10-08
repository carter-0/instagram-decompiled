package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WeD  reason: case insensitive filesystem */
public final class C19711WeD implements AnonymousClass6MP, AnonymousClass6MR {
    public int A00;
    public Paint A01 = new Paint();
    public C306576Mr A02 = C306576Mr.DISABLED;
    public boolean A03 = true;
    public ArrayList A04 = new ArrayList();
    public final ArrayList A05;

    public C19711WeD(ArrayList arrayList) {
        this.A05 = arrayList;
        this.A04 = C13988Tno.A0i(arrayList);
        this.A01.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public final void AQG(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A03) {
            this.A03 = false;
            Iterator A1G = AnonymousClass7TE.A1G(this.A04);
            while (A1G.hasNext()) {
                canvas.drawPath((Path) AnonymousClass7TF.A0a(A1G), this.A01);
            }
        }
    }

    public final /* synthetic */ void AQO(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        0qQ.A0B(canvas, 2);
        AQG(canvas);
    }

    public final void Eo9(C306576Mr r2) {
        0qQ.A0B(r2, 0);
        this.A02 = r2;
    }

    public final void FLc(Layout layout, Integer num, float f, int i, int i2) {
        0qQ.A0B(layout, 0);
        ArrayList arrayList = this.A05;
        arrayList.clear();
        arrayList.addAll(VIN.A00(layout, f));
        this.A04 = C13988Tno.A0i(arrayList);
    }

    public final /* synthetic */ boolean onPreDraw() {
        this.A03 = true;
        return true;
    }

    public final int BfU() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.WUn, java.lang.Object, X.X6W] */
    public final X6W By4() {
        Paint paint = this.A01;
        int color = paint.getColor();
        int color2 = paint.getColor();
        ArrayList arrayList = this.A05;
        C306576Mr r1 = this.A02;
        ? obj = new Object();
        obj.A01 = color;
        obj.A00 = color2;
        obj.A03 = arrayList;
        obj.A02 = r1;
        return obj;
    }

    public final /* synthetic */ Integer By7() {
        return AnonymousClass05K.A00;
    }

    public final C306576Mr C57() {
        return this.A02;
    }

    public final void ESD(int i, int i2) {
        this.A00 = i;
        Paint paint = this.A01;
        if (this.A02 == C306576Mr.INVERTED) {
            i2 = i;
        }
        paint.setColor(i2);
    }
}
