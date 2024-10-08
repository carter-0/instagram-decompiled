package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.6Ni  reason: invalid class name and case insensitive filesystem */
public abstract class C306746Ni {
    public static final Matrix A00 = new Matrix();
    public static final Rect A01 = new Rect();
    public static final float[] A02 = new float[8];
    public static final Matrix A03 = new Matrix();
    public static final float[] A04 = new float[2];
    public static final C306756Nj[] A05;
    public static final C306756Nj[] A06;

    public static void A01(Rect rect, C255793uj r7, float f, int i, int i2) {
        A02(rect, r7, f, i, i2, 0);
    }

    public static void A02(Rect rect, C255793uj r8, float f, int i, int i2, int i3) {
        float f2 = (float) i;
        float f3 = f2 / f;
        int round = Math.round(r8.CGW() * f2);
        int round2 = Math.round(r8.BCs() * f3);
        int round3 = Math.round(r8.CGs() * f2);
        int round4 = Math.round((r8.CHR() * f3) + ((((float) i2) - f3) / 2.0f));
        int round5 = Math.round(((float) (-round)) / 2.0f) + i3;
        int round6 = Math.round(((float) (-round2)) / 2.0f);
        rect.set(round5, round6, round + round5, round2 + round6);
        rect.offset(round3, round4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.6Nj[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.6Nj[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            A01 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            A00 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            A03 = r0
            r0 = 8
            float[] r0 = new float[r0]
            A02 = r0
            r0 = 2
            float[] r0 = new float[r0]
            A04 = r0
            r4 = 4
            X.6Nj[] r3 = new X.C306756Nj[r4]
            A05 = r3
            X.6Nj[] r2 = new X.C306756Nj[r4]
            A06 = r2
            r1 = 0
        L_0x002a:
            X.6Nj r0 = new X.6Nj
            r0.<init>()
            r3[r1] = r0
            X.6Nj r0 = new X.6Nj
            r0.<init>()
            r2[r1] = r0
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x002a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306746Ni.<clinit>():void");
    }

    public static boolean A03(C255793uj r9, float f, float f2) {
        float[] fArr = A04;
        fArr[0] = f;
        fArr[1] = f2;
        Matrix matrix = A00;
        matrix.reset();
        Matrix matrix2 = A03;
        matrix2.reset();
        Rect rect = A01;
        matrix.setRotate(r9.Bod() * 360.0f, rect.exactCenterX(), rect.exactCenterY());
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        return rect.contains(Math.round(fArr[0]), Math.round(fArr[1]));
    }

    public static void A00(Rect rect, C255793uj r7, float f, int i, int i2) {
        A01(rect, r7, f, i, i2);
        float Bod = r7.Bod();
        float[] fArr = A02;
        float f2 = (float) rect.left;
        fArr[0] = f2;
        float f3 = (float) rect.top;
        fArr[1] = f3;
        float f4 = (float) rect.right;
        fArr[2] = f4;
        fArr[3] = f3;
        fArr[4] = f4;
        float f5 = (float) rect.bottom;
        fArr[5] = f5;
        fArr[6] = f2;
        fArr[7] = f5;
        Matrix matrix = A00;
        matrix.reset();
        matrix.setRotate(Bod * 360.0f, rect.exactCenterX(), rect.exactCenterY());
        matrix.mapPoints(fArr);
        int round = Math.round(fArr[0]);
        int round2 = Math.round(fArr[1]);
        rect.set(round, round2, round, round2);
        int i3 = 2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 < 8) {
                rect.union(Math.round(fArr[i3]), Math.round(fArr[i4]));
                i3 += 2;
            } else {
                return;
            }
        }
    }
}
