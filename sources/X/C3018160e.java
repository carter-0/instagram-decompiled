package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.60e  reason: invalid class name and case insensitive filesystem */
public final class C3018160e implements C3018060d {
    public Matrix A00;
    public RectF A01;
    public float[] A02;
    public final Path A03;

    public final boolean E0d(C3018060d r6, C3018060d r7, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else {
            op = Path.Op.INTERSECT;
        }
        Path path = this.A03;
        if (r6 instanceof C3018160e) {
            Path path2 = ((C3018160e) r6).A03;
            if (r7 instanceof C3018160e) {
                return path.op(path2, ((C3018160e) r7).A03, op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void A00(long j) {
        Matrix matrix = this.A00;
        if (matrix == null) {
            this.A00 = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.A00;
        0qQ.A0A(matrix2);
        matrix2.setTranslate(C289295dM.A01(j), C289295dM.A02(j));
        Path path = this.A03;
        Matrix matrix3 = this.A00;
        0qQ.A0A(matrix3);
        path.transform(matrix3);
    }

    public final void A01(AnonymousClass5VN r8, float f) {
        float f2 = r8.A01;
        float f3 = r8.A03;
        float f4 = r8.A02;
        float f5 = r8.A00;
        RectF rectF = this.A01;
        if (rectF == null) {
            rectF = new RectF();
            this.A01 = rectF;
        }
        rectF.set(f2, f3, f4, f5);
        Path path = this.A03;
        RectF rectF2 = this.A01;
        0qQ.A0A(rectF2);
        path.arcTo(rectF2, f, 45.0f, false);
    }

    public final void AA1(AnonymousClass5VN r6, Integer num) {
        float f = r6.A01;
        if (!Float.isNaN(f)) {
            float f2 = r6.A03;
            if (!Float.isNaN(f2)) {
                float f3 = r6.A02;
                if (!Float.isNaN(f3)) {
                    float f4 = r6.A00;
                    if (!Float.isNaN(f4)) {
                        RectF rectF = this.A01;
                        if (rectF == null) {
                            rectF = new RectF();
                            this.A01 = rectF;
                        }
                        rectF.set(f, f2, f3, f4);
                        Path path = this.A03;
                        RectF rectF2 = this.A01;
                        0qQ.A0A(rectF2);
                        path.addRect(rectF2, Path.Direction.CCW);
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    public final void AAA(AnonymousClass6GT r10, Integer num) {
        RectF rectF = this.A01;
        if (rectF == null) {
            rectF = new RectF();
            this.A01 = rectF;
        }
        rectF.set(r10.A01, r10.A03, r10.A02, r10.A00);
        float[] fArr = this.A02;
        if (fArr == null) {
            fArr = new float[8];
            this.A02 = fArr;
        }
        long j = r10.A06;
        long j2 = AnonymousClass6GS.A00;
        fArr[0] = Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = AnonymousClass6GS.A00(j);
        long j3 = r10.A07;
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = AnonymousClass6GS.A00(j3);
        long j4 = r10.A05;
        fArr[4] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[5] = AnonymousClass6GS.A00(j4);
        long j5 = r10.A04;
        fArr[6] = Float.intBitsToFloat((int) (j5 >> 32));
        fArr[7] = AnonymousClass6GS.A00(j5);
        Path path = this.A03;
        RectF rectF2 = this.A01;
        0qQ.A0A(rectF2);
        float[] fArr2 = this.A02;
        0qQ.A0A(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final AnonymousClass5VN AhZ() {
        RectF rectF = this.A01;
        if (rectF == null) {
            rectF = new RectF();
            this.A01 = rectF;
        }
        this.A03.computeBounds(rectF, true);
        return new AnonymousClass5VN(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public C3018160e(Path path) {
        this.A03 = path;
    }

    public C3018160e() {
        this(new Path());
    }
}
