package X;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.Gev  reason: case insensitive filesystem */
public final class C52921Gev extends C298605tj {
    public float A00;
    public Shader A01;
    public final Matrix A02 = new Matrix();
    public final float A03;
    public final List A04;

    public final Shader A01(long j) {
        LinearGradient A002 = C52416GRt.A00(this.A04, (List) null, 0, C289325dP.A00(0.0f, 0.0f), C289325dP.A00(0.0f, this.A03));
        A002.setLocalMatrix(this.A02);
        this.A01 = A002;
        return A002;
    }

    public C52921Gev(List list, float f) {
        this.A04 = list;
        this.A03 = f;
    }
}
