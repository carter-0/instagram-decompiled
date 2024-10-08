package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;

/* renamed from: X.5sg  reason: invalid class name and case insensitive filesystem */
public final class C297985sg {
    public final Path A00 = new Path();
    public final Path A01 = new Path();
    public final Path A02 = new Path();
    public final PointF A03 = new PointF();
    public final C297995sh A04 = new C297995sh();
    public final float[] A05 = new float[2];
    public final float[] A06 = new float[2];
    public final Matrix[] A07 = new Matrix[4];
    public final Matrix[] A08 = new Matrix[4];
    public final C297995sh[] A09 = new C297995sh[4];
    public final Path A0A = new Path();

    private boolean A00(Path path, int i) {
        Path path2 = this.A0A;
        path2.reset();
        this.A09[i].A04(this.A07[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    public final void A01(Path path, RectF rectF, C297895sX r31, C298015sj r32, float f) {
        C297895sX r9;
        C297915sZ r5;
        C297995sh[] r7;
        Matrix[] matrixArr;
        float f2;
        float f3;
        float f4;
        float[] fArr;
        Matrix[] matrixArr2;
        float abs;
        C297945sc r0;
        Path path2;
        Matrix matrix;
        Path path3 = path;
        path3.rewind();
        Path path4 = this.A02;
        path4.rewind();
        Path path5 = this.A00;
        Path path6 = path5;
        path6.rewind();
        RectF rectF2 = rectF;
        path5.addRect(rectF2, Path.Direction.CW);
        int i = 0;
        int i2 = 0;
        while (true) {
            r9 = r31;
            C297935sb r2 = r9.A03;
            while (true) {
                if (i2 == 1) {
                    r5 = r9.A05;
                } else if (i2 == 2) {
                    r5 = r9.A04;
                } else if (i2 != 3) {
                    r5 = r9.A07;
                } else {
                    r5 = r9.A06;
                }
                r7 = this.A09;
                r5.A00(r7[i2], 90.0f, f, r2.ArV(rectF2));
                int i3 = i2 + 1;
                float f5 = (float) (i3 * 90);
                matrixArr = this.A07;
                matrixArr[i2].reset();
                PointF pointF = this.A03;
                if (i2 == 1) {
                    f4 = rectF2.right;
                    f3 = rectF2.bottom;
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        f2 = rectF2.right;
                    } else {
                        f2 = rectF2.left;
                    }
                    f3 = rectF2.top;
                } else {
                    f4 = rectF2.left;
                    f3 = rectF2.bottom;
                }
                pointF.set(f2, f3);
                matrixArr[i2].setTranslate(pointF.x, pointF.y);
                matrixArr[i2].preRotate(f5);
                fArr = this.A05;
                C297995sh r3 = r7[i2];
                fArr[0] = r3.A02;
                fArr[1] = r3.A03;
                matrixArr[i2].mapPoints(fArr);
                matrixArr2 = this.A08;
                matrixArr2[i2].reset();
                matrixArr2[i2].setTranslate(fArr[0], fArr[1]);
                matrixArr2[i2].preRotate((float) ((i2 + 1) * 90));
                i2 = i3;
                if (i3 >= 4) {
                    break;
                } else if (i3 == 1) {
                    r2 = r9.A01;
                } else if (i3 == 2) {
                    r2 = r9.A00;
                } else if (i3 == 3) {
                    r2 = r9.A02;
                }
            }
        }
        do {
            C297995sh r1 = r7[i];
            fArr[0] = 0.0f;
            fArr[1] = r1.A04;
            matrixArr[i].mapPoints(fArr);
            float f6 = fArr[0];
            float f7 = fArr[1];
            Path path7 = path3;
            if (i == 0) {
                path7.moveTo(f6, f7);
            } else {
                path7.lineTo(f6, f7);
            }
            r7[i].A04(matrixArr[i], path7);
            if (r32 != null) {
                C297995sh r14 = r7[i];
                Matrix matrix2 = matrixArr[i];
                C297875sV r12 = ((C298005si) r32).A00;
                Paint paint = C297875sV.A0M;
                r12.A0F.set(i, false);
                C297965se[] r13 = r12.A0G;
                C297995sh.A00(r14, r14.A01);
                r13[i] = new C324216yp(new Matrix(matrix2), r14, new ArrayList(r14.A05));
            }
            int i4 = (i + 1) % 4;
            C297995sh r15 = r7[i];
            fArr[0] = r15.A02;
            fArr[1] = r15.A03;
            matrixArr[i].mapPoints(fArr);
            float[] fArr2 = this.A06;
            C297995sh r122 = r7[i4];
            fArr2[0] = 0.0f;
            fArr2[1] = r122.A04;
            matrixArr[i4].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot((double) (fArr[0] - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
            C297995sh r16 = r7[i];
            fArr[0] = r16.A02;
            fArr[1] = r16.A03;
            matrixArr[i].mapPoints(fArr);
            if (i == 1 || i == 3) {
                abs = Math.abs(rectF2.centerX() - fArr[0]);
            } else {
                abs = Math.abs(rectF2.centerY() - fArr[1]);
            }
            C297995sh r17 = this.A04;
            r17.A02(0.0f, 270.0f, 0.0f);
            if (i == 1) {
                r0 = r9.A08;
            } else if (i == 2) {
                r0 = r9.A09;
            } else if (i != 3) {
                r0 = r9.A0A;
            } else {
                r0 = r9.A0B;
            }
            if (r0 instanceof C324186ym) {
                float f8 = ((C324186ym) r0).A00 * f;
                float f9 = abs - f8;
                r17.A01(f9, 0.0f);
                r17.A03(f9, -f8, abs + f8, f8, -180.0f);
            }
            r17.A01(max, 0.0f);
            Path path8 = this.A01;
            path8.reset();
            r17.A04(matrixArr2[i], path8);
            if (A00(path8, i) || A00(path8, i4)) {
                path8.op(path8, path6, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = r17.A04;
                matrixArr2[i].mapPoints(fArr);
                path2 = path4;
                path2.moveTo(fArr[0], fArr[1]);
                matrix = matrixArr2[i];
            } else {
                matrix = matrixArr2[i];
                path2 = path3;
            }
            r17.A04(matrix, path2);
            if (r32 != null) {
                Matrix matrix3 = matrixArr2[i];
                C297875sV r132 = ((C298005si) r32).A00;
                Paint paint2 = C297875sV.A0M;
                r132.A0F.set(i + 4, false);
                C297965se[] r133 = r132.A0H;
                C297995sh.A00(r17, r17.A01);
                r133[i] = new C324216yp(new Matrix(matrix3), r17, new ArrayList(r17.A05));
            }
            i++;
        } while (i < 4);
        path3.close();
        path4.close();
        if (!path4.isEmpty()) {
            path3.op(path4, Path.Op.UNION);
        }
    }

    public C297985sg() {
        int i = 0;
        do {
            this.A09[i] = new C297995sh();
            this.A07[i] = new Matrix();
            this.A08[i] = new Matrix();
            i++;
        } while (i < 4);
    }
}
