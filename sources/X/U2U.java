package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.Iterator;

public final class U2U extends MetricAffectingSpan implements AnonymousClass6MP, AnonymousClass6MR {
    public static final C17758Veh A07 = new Object();
    public int A00;
    public C306576Mr A01 = C306576Mr.DISABLED;
    public boolean A02 = true;
    public final Paint A03;
    public final Paint A04;
    public final ArrayList A05;
    public final ArrayList A06;

    public U2U(ArrayList arrayList, ArrayList arrayList2) {
        this.A05 = arrayList;
        this.A06 = arrayList2;
        Paint paint = new Paint();
        this.A03 = paint;
        Paint paint2 = new Paint();
        this.A04 = paint2;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
    }

    public final void AQG(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A02) {
            this.A02 = false;
            canvas.save();
            ArrayList arrayList = this.A05;
            int size = arrayList.size();
            ArrayList arrayList2 = this.A06;
            int min = Math.min(size, arrayList2.size());
            for (int i = 0; i < min; i++) {
                ((C17901Vhs) arrayList.get(i)).A00(canvas, this.A03);
                ((C17901Vhs) arrayList2.get(i)).A00(canvas, this.A04);
            }
            canvas.restore();
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
        ArrayList arrayList = this.A05;
        arrayList.clear();
        ArrayList arrayList2 = this.A06;
        arrayList2.clear();
        C17758Veh veh = A07;
        float f2 = f;
        int i3 = i;
        int i4 = i2;
        arrayList.addAll(veh.A00(layout, f2, i3, i4, true));
        arrayList2.addAll(veh.A00(layout, f2, i3, i4, false));
    }

    public final /* synthetic */ boolean onPreDraw() {
        this.A02 = true;
        return true;
    }

    public final void updateDrawState(TextPaint textPaint) {
    }

    public final void updateMeasureState(TextPaint textPaint) {
    }

    public final int BfU() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.WUo, java.lang.Object, X.X6W] */
    public final X6W By4() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator A1G = AnonymousClass7TE.A1G(this.A05);
        while (A1G.hasNext()) {
            C17901Vhs vhs = (C17901Vhs) AnonymousClass7TF.A0a(A1G);
            arrayList.add(new C18501Vsw(vhs.A03, vhs.A01, vhs.A02, vhs.A04));
        }
        Iterator A1G2 = AnonymousClass7TE.A1G(this.A06);
        while (A1G2.hasNext()) {
            C17901Vhs vhs2 = (C17901Vhs) AnonymousClass7TF.A0a(A1G2);
            arrayList2.add(new C18501Vsw(vhs2.A03, vhs2.A01, vhs2.A02, vhs2.A04));
        }
        int color = this.A03.getColor();
        int color2 = this.A04.getColor();
        C306576Mr r3 = this.A01;
        ? obj = new Object();
        obj.A01 = color;
        obj.A00 = color2;
        obj.A03 = arrayList;
        obj.A04 = arrayList2;
        obj.A02 = r3;
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
        boolean A1W = AnonymousClass7TF.A1W(this.A01, C306576Mr.INVERTED);
        Paint paint = this.A03;
        int i3 = i;
        if (A1W) {
            i3 = i2;
        }
        paint.setColor(i3);
        Paint paint2 = this.A04;
        if (!A1W) {
            i = i2;
        }
        paint2.setColor(i);
    }
}
