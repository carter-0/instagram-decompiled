package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.List;

/* renamed from: X.5R3  reason: invalid class name */
public final class AnonymousClass5R3 implements AnonymousClass5QA {
    public Canvas A00 = AnonymousClass5R4.A00;
    public Rect A01;
    public Rect A02;

    public final /* synthetic */ void AHy(AnonymousClass5VN r7, int i) {
        AHx(1, r7.A01, r7.A03, r7.A02, r7.A00);
    }

    public final void AIt(float[] fArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                float f = 0.0f;
                if (i == i2) {
                    f = 1.0f;
                }
                if (fArr[(i * 4) + i2] == f) {
                    i2++;
                } else {
                    Matrix matrix = new Matrix();
                    C298435tQ.A00(matrix, fArr);
                    this.A00.concat(matrix);
                    return;
                }
            } while (i2 < 4);
        }
    }

    public final void AQp(AnonymousClass5S9 r12, List list, int i) {
        if (i != 1) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                long j = ((C289295dM) list.get(i2)).A00;
                this.A00.drawPoint(C289295dM.A01(j), C289295dM.A02(j), ((AnonymousClass5S8) r12).A01);
            }
        } else if (list.size() >= 2) {
            Paint paint = ((AnonymousClass5S8) r12).A01;
            for (int i3 = 0; i3 < list.size() - 1; i3 += 2) {
                long j2 = ((C289295dM) list.get(i3)).A00;
                long j3 = ((C289295dM) list.get(i3 + 1)).A00;
                this.A00.drawLine(C289295dM.A01(j2), C289295dM.A02(j2), C289295dM.A01(j3), C289295dM.A02(j3), paint);
            }
        }
    }

    public final void AHw(C3018060d r4, int i) {
        Canvas canvas = this.A00;
        if (r4 instanceof C3018160e) {
            canvas.clipPath(((C3018160e) r4).A03, Region.Op.INTERSECT);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void AHx(int i, float f, float f2, float f3, float f4) {
        Region.Op op;
        Canvas canvas = this.A00;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    public final void APQ() {
        C10108Rmk.A00(this.A00, false);
    }

    public final void AQP(AnonymousClass5S9 r10, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.A00.drawArc(f, f2, f3, f4, f5, f6, z, ((AnonymousClass5S8) r10).A01);
    }

    public final void AQT(AnonymousClass5S9 r5, float f, long j) {
        this.A00.drawCircle(C289295dM.A01(j), C289295dM.A02(j), f, ((AnonymousClass5S8) r5).A01);
    }

    public final void AQc(C3018260f r6, AnonymousClass5S9 r7, long j) {
        this.A00.drawBitmap(C298615tk.A00(r6), C289295dM.A01(0), Float.intBitsToFloat(0), ((AnonymousClass5S8) r7).A01);
    }

    public final void AQe(C3018260f r13, AnonymousClass5S9 r14, long j, long j2, long j3, long j4) {
        if (this.A02 == null) {
            this.A02 = new Rect();
            this.A01 = new Rect();
        }
        Canvas canvas = this.A00;
        Bitmap A002 = C298615tk.A00(r13);
        Rect rect = this.A02;
        0qQ.A0A(rect);
        int i = (int) (0 >> 32);
        rect.left = i;
        rect.top = 0;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = C289005cr.A00(j2);
        Rect rect2 = this.A01;
        0qQ.A0A(rect2);
        int i2 = (int) (j3 >> 32);
        rect2.left = i2;
        int i3 = (int) (j3 & 4294967295L);
        rect2.top = i3;
        rect2.right = i2 + ((int) (j4 >> 32));
        rect2.bottom = i3 + C289005cr.A00(j4);
        canvas.drawBitmap(A002, rect, rect2, ((AnonymousClass5S8) r14).A01);
    }

    public final void AQk(AnonymousClass5S9 r7, long j, long j2) {
        this.A00.drawLine(C289295dM.A01(j), C289295dM.A02(j), C289295dM.A01(j2), C289295dM.A02(j2), ((AnonymousClass5S8) r7).A01);
    }

    public final void AQl(AnonymousClass5S9 r4, C3018060d r5) {
        Canvas canvas = this.A00;
        if (r5 instanceof C3018160e) {
            canvas.drawPath(((C3018160e) r5).A03, ((AnonymousClass5S8) r4).A01);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void AQq(AnonymousClass5S9 r7, float f, float f2, float f3, float f4) {
        this.A00.drawRect(f, f2, f3, f4, ((AnonymousClass5S8) r7).A01);
    }

    public final void AQt(AnonymousClass5S9 r9, float f, float f2, float f3, float f4, float f5, float f6) {
        this.A00.drawRoundRect(f, f2, f3, f4, f5, f6, ((AnonymousClass5S8) r9).A01);
    }

    public final void ARm() {
        C10108Rmk.A00(this.A00, true);
    }

    public final void EIm() {
        this.A00.restore();
    }

    public final void EJQ(float f) {
        this.A00.rotate(f);
    }

    public final void EJt() {
        this.A00.save();
    }

    public final void EK4(AnonymousClass5VN r8, AnonymousClass5S9 r9) {
        this.A00.saveLayer(r8.A01, r8.A03, r8.A02, r8.A00, ((AnonymousClass5S8) r9).A01, 31);
    }

    public final void EKI(float f, float f2) {
        this.A00.scale(f, f2);
    }

    public final void FHv(float f, float f2) {
        this.A00.translate(f, f2);
    }
}
