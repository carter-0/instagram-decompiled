package X;

import android.graphics.Matrix;

/* renamed from: X.GoF  reason: case insensitive filesystem */
public final class C53423GoF extends AnonymousClass0T0 implements C59540JNm {
    public final float A00;
    public final long A01;

    public final void AC6(Matrix matrix) {
        0qQ.A0B(matrix, 0);
        float f = this.A00;
        long j = this.A01;
        long j2 = C55305HfY.A00;
        matrix.postRotate(f, C51971G9r.A01(j), C51972G9s.A00(j));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53423GoF) {
                C53423GoF goF = (C53423GoF) obj;
                if (Float.compare(this.A00, goF.A00) == 0) {
                    long j = this.A01;
                    long j2 = goF.A01;
                    long j3 = C55305HfY.A00;
                    if (j == j2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A002 = G9w.A00(this.A00);
        long j = this.A01;
        long j2 = C55305HfY.A00;
        return A002 + C51968G9o.A03(j);
    }

    public C53423GoF(long j, float f) {
        this.A00 = f;
        this.A01 = j;
    }
}
