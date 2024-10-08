package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LineBackgroundSpan;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6MO  reason: invalid class name */
public final class AnonymousClass6MO implements AnonymousClass6MP, ViewTreeObserver.OnPreDrawListener, AnonymousClass6MR, LineBackgroundSpan {
    public int A00;
    public int A01;
    public C306576Mr A02 = C306576Mr.DISABLED;
    public boolean A03;
    public float A04;
    public List A05 = C306556Mp.A00(this.A06);
    public List A06;
    public boolean A07;
    public final Paint A08;
    public final boolean A09;

    public AnonymousClass6MO(List list, float f, int i) {
        0qQ.A0B(list, 3);
        this.A00 = i;
        this.A04 = f;
        this.A06 = list;
        Paint paint = new Paint(1);
        this.A08 = paint;
        paint.setColor(this.A00);
        this.A09 = Color.alpha(this.A00) < 255;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setPathEffect(new CornerPathEffect(this.A04));
        this.A07 = true;
    }

    public final /* synthetic */ void AQG(Canvas canvas) {
    }

    public final void AQO(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
    }

    public final void ESD(int i, int i2) {
        this.A07 = true;
        this.A01 = i;
        if (this.A02 == C306576Mr.INVERTED) {
            i2 = i;
        }
        this.A00 = i2;
        this.A08.setColor(i2);
    }

    public final void Eo9(C306576Mr r2) {
        0qQ.A0B(r2, 0);
        this.A02 = r2;
    }

    public final void FLc(Layout layout, Integer num, float f, int i, int i2) {
        0qQ.A0B(layout, 0);
        float f2 = f * 0.2f;
        float f3 = f / 4.0f;
        this.A04 = f3;
        ArrayList A022 = C306496Mj.A02(layout, f * 0.3f, f2, f2, f3, 1.0f);
        this.A06 = A022;
        this.A05 = C306556Mp.A00(A022);
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        0qQ.A0B(canvas, 0);
        if (this.A07 || this.A03) {
            this.A07 = false;
            int size = this.A05.size();
            for (int i9 = 0; i9 < size; i9++) {
                canvas.drawPath((Path) this.A05.get(i9), this.A08);
            }
        }
    }

    public final boolean onPreDraw() {
        this.A07 = true;
        return true;
    }

    public final int BfU() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WUj, java.lang.Object, X.X6W] */
    public final X6W By4() {
        int i = this.A00;
        float f = this.A04;
        List list = this.A06;
        ? obj = new Object();
        obj.A02 = 0sn.A00;
        obj.A01 = i;
        obj.A00 = f;
        obj.A02 = list;
        return obj;
    }

    public final /* synthetic */ Integer By7() {
        return AnonymousClass05K.A00;
    }

    public final C306576Mr C57() {
        return this.A02;
    }
}
