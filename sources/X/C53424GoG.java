package X;

import android.graphics.Matrix;

/* renamed from: X.GoG  reason: case insensitive filesystem */
public final class C53424GoG extends AnonymousClass0T0 implements C59540JNm {
    public final float A00;
    public final float A01;

    public final void AC6(Matrix matrix) {
        0qQ.A0B(matrix, 0);
        matrix.postTranslate(this.A00, this.A01);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53424GoG) {
                C53424GoG goG = (C53424GoG) obj;
                if (!(Float.compare(this.A00, goG.A00) == 0 && Float.compare(this.A01, goG.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51966G9m.A02(G9w.A00(this.A00), this.A01);
    }

    public C53424GoG(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
