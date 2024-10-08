package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.Gnx  reason: case insensitive filesystem */
public final class C53405Gnx extends AnonymousClass0T0 implements C59538JNk {
    public final int A00;
    public final C52710GbN A01;
    public final JLX A02;
    public final JLY A03;

    public final void AQK(Canvas canvas, I13 i13) {
        C52710GbN gbN;
        JLX jlx;
        0qQ.A0B(i13, 1);
        Paint paint = i13.A00;
        if (paint == null) {
            paint = AnonymousClass7TE.A0V(7);
            AnonymousClass7TE.A1Q(paint);
            i13.A00 = paint;
        }
        C52710GbN gbN2 = this.A01;
        C53405Gnx gnx = i13.A03;
        if (gnx != null) {
            gbN = gnx.A01;
        } else {
            gbN = null;
        }
        if (!0qQ.A0K(gbN2, gbN)) {
            if (gbN2 != null) {
                paint.setShadowLayer(gbN2.A02, gbN2.A00, gbN2.A01, gbN2.A03);
            } else {
                paint.clearShadowLayer();
            }
        }
        int i = this.A00;
        C53405Gnx gnx2 = i13.A03;
        if (gnx2 == null || i != gnx2.A00) {
            SMJ.A01(i, paint);
        }
        JLX jlx2 = this.A02;
        C53405Gnx gnx3 = i13.A03;
        if (gnx3 != null) {
            jlx = gnx3.A02;
        } else {
            jlx = null;
        }
        if (!0qQ.A0K(jlx2, jlx)) {
            if (jlx2 instanceof C53417Go9) {
                if (paint.getShader() != null) {
                    paint.setShader((Shader) null);
                }
                int color = paint.getColor();
                int i2 = ((C53417Go9) jlx2).A00;
                if (color != i2) {
                    paint.setColor(i2);
                }
            } else if (jlx2 instanceof C53416Go8) {
                paint.setShader(((C53416Go8) jlx2).A00.FH5());
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        i13.A03 = this;
        JLY jly = this.A03;
        if (jly instanceof C53418GoA) {
            canvas.drawPath(i13.A00((C53418GoA) jly, (C53426GoI) null), paint);
        } else if (!(jly instanceof C59666JSl)) {
            throw AnonymousClass7TE.A1K();
        } else if (!(jly instanceof C53422GoE) || ((C53422GoE) jly).A00 != 1) {
            ((C59666JSl) jly).AQJ(canvas, paint);
        } else {
            2SK.A02("CanvasFill", "A Line shape cannot be 'filled'. Ignoring.");
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53405Gnx) {
                C53405Gnx gnx = (C53405Gnx) obj;
                if (!0qQ.A0K(this.A03, gnx.A03) || !0qQ.A0K(this.A02, gnx.A02) || this.A00 != gnx.A00 || !0qQ.A0K(this.A01, gnx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A03)) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A01);
    }

    public C53405Gnx(C52710GbN gbN, JLX jlx, JLY jly, int i) {
        this.A03 = jly;
        this.A02 = jlx;
        this.A00 = i;
        this.A01 = gbN;
    }
}
