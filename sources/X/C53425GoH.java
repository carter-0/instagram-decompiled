package X;

import android.graphics.Matrix;

/* renamed from: X.GoH  reason: case insensitive filesystem */
public final class C53425GoH extends AnonymousClass0T0 implements C59540JNm {
    public final float A00;
    public final float A01;
    public final int A02;
    public final long A03;

    public C53425GoH(float f, float f2, int i, long j) {
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = j;
    }

    public final void AC6(Matrix matrix) {
        int i = this.A02;
        0qQ.A0B(matrix, 0);
        if (i != 0) {
            float f = this.A00;
            float f2 = this.A01;
            long j = this.A03;
            long j2 = C55305HfY.A00;
            matrix.postSkew(f, f2, C51971G9r.A01(j), C51972G9s.A00(j));
            return;
        }
        float f3 = this.A00;
        float f4 = this.A01;
        long j3 = this.A03;
        long j4 = C55305HfY.A00;
        matrix.postScale(f3, f4, C51971G9r.A01(j3), C51972G9s.A00(j3));
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A02 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C53425GoH)) {
            return false;
        }
        C53425GoH goH = (C53425GoH) obj;
        if (goH.A02 != i || Float.compare(this.A00, goH.A00) != 0 || Float.compare(this.A01, goH.A01) != 0) {
            return false;
        }
        long j = this.A03;
        long j2 = goH.A03;
        long j3 = C55305HfY.A00;
        if (j == j2) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A002 = AnonymousClass7TF.A00(G9w.A00(this.A00), this.A01);
        long j = this.A03;
        long j2 = C55305HfY.A00;
        return A002 + C51968G9o.A03(j);
    }
}
