package X;

import android.graphics.RadialGradient;
import android.graphics.Shader;

/* renamed from: X.Gnw  reason: case insensitive filesystem */
public final class C53404Gnw extends AnonymousClass0T0 implements C59537JNj {
    public final float A00;
    public final long A01;
    public final Shader.TileMode A02;
    public final C59721JVf A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53404Gnw) {
                C53404Gnw gnw = (C53404Gnw) obj;
                if (0qQ.A0K(this.A03, gnw.A03)) {
                    long j = this.A01;
                    long j2 = gnw.A01;
                    long j3 = C55305HfY.A00;
                    if (!(j == j2 && Float.compare(this.A00, gnw.A00) == 0 && this.A02 == gnw.A02)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Shader FH5() {
        long j = this.A01;
        long j2 = C55305HfY.A00;
        float A012 = C51971G9r.A01(j);
        float A002 = C51972G9s.A00(j);
        float f = this.A00;
        C59721JVf jVf = this.A03;
        return new RadialGradient(A012, A002, f, (int[]) jVf.A00, (float[]) jVf.A01, this.A02);
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A03);
        long j = this.A01;
        long j2 = C55305HfY.A00;
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A00(C51972G9s.A07(j, A0K), this.A00));
    }

    public C53404Gnw(Shader.TileMode tileMode, C59721JVf jVf, float f, long j) {
        this.A03 = jVf;
        this.A01 = j;
        this.A00 = f;
        this.A02 = tileMode;
    }
}
