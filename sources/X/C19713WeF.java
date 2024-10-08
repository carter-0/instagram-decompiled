package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WeF  reason: case insensitive filesystem */
public final class C19713WeF implements AnonymousClass6MP, AnonymousClass6MR {
    public static final C18525Vtb A07 = new Object();
    public int A00;
    public Paint A01;
    public C306576Mr A02;
    public ArrayList A03;
    public ArrayList A04;
    public boolean A05;
    public final float A06;

    public final void AQG(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A05) {
            this.A05 = false;
            Iterator A1G = AnonymousClass7TE.A1G(this.A03);
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
        AnonymousClass7TF.A1B(layout, 0, num);
        Paint paint = this.A01;
        C18525Vtb vtb = A07;
        paint.setStrokeWidth(0.1f * f);
        ArrayList arrayList = this.A04;
        arrayList.clear();
        arrayList.addAll(vtb.A01(layout, num, f, 0, layout.getText().length()));
        this.A03 = C13988Tno.A0i(this.A04);
    }

    public final /* synthetic */ boolean onPreDraw() {
        this.A05 = true;
        return true;
    }

    public final int BfU() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.WUm, java.lang.Object, X.X6W] */
    public final X6W By4() {
        int color = this.A01.getColor();
        float f = this.A06;
        ArrayList arrayList = this.A04;
        C306576Mr r1 = this.A02;
        ? obj = new Object();
        obj.A01 = color;
        obj.A00 = f;
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
        if (this.A02 != C306576Mr.INVERTED) {
            i = i2;
        }
        paint.setColor(i);
    }

    public C19713WeF(ArrayList arrayList, float f) {
        this.A06 = f;
        this.A04 = arrayList;
        this.A01 = new Paint();
        this.A03 = new ArrayList();
        this.A05 = true;
        this.A02 = C306576Mr.DISABLED;
        this.A03 = C13988Tno.A0i(this.A04);
        this.A01.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A01.setStrokeWidth(f);
    }
}
