package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.5S8  reason: invalid class name */
public final class AnonymousClass5S8 implements AnonymousClass5S9 {
    public int A00 = 3;
    public Paint A01 = new Paint(7);
    public Shader A02;
    public C288195bW A03;
    public C13866Tin A04;

    public final int C1y() {
        int i;
        Paint.Cap strokeCap = this.A01.getStrokeCap();
        if (strokeCap == null || (i = C298595ti.A00[strokeCap.ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        return 0;
    }

    public final int C20() {
        int i;
        Paint.Join strokeJoin = this.A01.getStrokeJoin();
        if (!(strokeJoin == null || (i = C298595ti.A01[strokeJoin.ordinal()]) == 1)) {
            if (i == 2) {
                return 2;
            }
            if (i != 3) {
                return 0;
            }
            return 1;
        }
        return 0;
    }

    public final void EOX(float f) {
        this.A01.setAlpha((int) ((float) Math.rint((double) (f * 255.0f))));
    }

    public final void EPk(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            C14126TqL.A00(i, this.A01);
        }
    }

    public final void ESE(long j) {
        this.A01.setColor(C285595Rx.A00(j));
    }

    public final void ESH(C288195bW r3) {
        ColorFilter colorFilter;
        this.A03 = r3;
        Paint paint = this.A01;
        if (r3 != null) {
            colorFilter = r3.A00;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    public final void EnK(int i) {
        Paint.Cap cap;
        Paint paint = this.A01;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public final void EnM(int i) {
        Paint.Style style;
        Paint paint = this.A01;
        if (i == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }
}
