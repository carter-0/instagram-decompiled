package X;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;

/* renamed from: X.GRs  reason: case insensitive filesystem */
public final class C52415GRs extends C298605tj {
    public long A00 = 9205357640488583168L;
    public Shader A01;
    public final Matrix A02 = new Matrix();
    public final C52402GRc A03;

    public C52415GRs(C52402GRc gRc) {
        this.A03 = gRc;
    }

    public final Shader A01(long j) {
        float A022 = C288025bF.A02(j);
        C52402GRc gRc = this.A03;
        long j2 = gRc.A01;
        long A002 = C289325dP.A00(A022 * C289295dM.A01(j2), C288025bF.A00(j) * C289295dM.A02(j2));
        float A023 = C288025bF.A02(j);
        long j3 = gRc.A00;
        LinearGradient A003 = C52416GRt.A00(gRc.A03, gRc.A02, 0, A002, C289325dP.A00(A023 * C289295dM.A01(j3), C288025bF.A00(j) * C289295dM.A02(j3)));
        this.A01 = A003;
        this.A00 = j;
        A003.getLocalMatrix(this.A02);
        return A003;
    }
}
