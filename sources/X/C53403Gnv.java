package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;

/* renamed from: X.Gnv  reason: case insensitive filesystem */
public final class C53403Gnv extends AnonymousClass0T0 implements C59537JNj {
    public final long A00;
    public final long A01;
    public final Shader.TileMode A02;
    public final C59721JVf A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53403Gnv) {
                C53403Gnv gnv = (C53403Gnv) obj;
                if (0qQ.A0K(this.A03, gnv.A03)) {
                    long j = this.A01;
                    long j2 = gnv.A01;
                    long j3 = C55305HfY.A00;
                    if (!(j == j2 && this.A00 == gnv.A00 && this.A02 == gnv.A02)) {
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
        float A002 = C51968G9o.A00(j);
        float A003 = C51972G9s.A00(j);
        long j3 = this.A00;
        float A004 = C51968G9o.A00(j3);
        float A005 = C51972G9s.A00(j3);
        C59721JVf jVf = this.A03;
        return new LinearGradient(A002, A003, A004, A005, (int[]) jVf.A00, (float[]) jVf.A01, this.A02);
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A03);
        long j = this.A01;
        long j2 = C55305HfY.A00;
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A01(this.A00, AnonymousClass7TF.A01(j, A0K)));
    }

    public C53403Gnv(Shader.TileMode tileMode, C59721JVf jVf, long j, long j2) {
        this.A03 = jVf;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = tileMode;
    }
}
