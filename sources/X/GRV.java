package X;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public abstract class GRV {
    public static final int A00(float f) {
        double floor;
        double d = (double) f;
        if (f >= 0.0f) {
            floor = Math.ceil(d);
        } else {
            floor = Math.floor(d);
        }
        return -((int) ((float) floor));
    }

    public static final GRU A02(C286575Wy r3) {
        View view = (View) r3.AJO(AndroidCompositionLocals_androidKt.A03);
        if (0fL.A02()) {
            0fL.A01(986604945, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:235)");
        }
        boolean AGu = r3.AGu(view);
        Object ECw = r3.ECw();
        if (AGu || ECw == AnonymousClass5XT.A00) {
            ECw = new GRU(view);
            r3.FLL(ECw);
        }
        GRU gru = (GRU) ECw;
        if (0fL.A02()) {
            0fL.A00(576166946);
        }
        return gru;
    }

    public static final long A01(int[] iArr, long j) {
        float A01 = C289295dM.A01(j);
        int i = (A01 > 0.0f ? 1 : (A01 == 0.0f ? 0 : -1));
        float f = ((float) iArr[0]) * -1.0f;
        if (i < 0 ? f < A01 : f > A01) {
            f = A01;
        }
        float A02 = C289295dM.A02(j);
        int i2 = (A02 > 0.0f ? 1 : (A02 == 0.0f ? 0 : -1));
        float f2 = ((float) iArr[1]) * -1.0f;
        if (i2 < 0 ? f2 < A02 : f2 > A02) {
            f2 = A02;
        }
        return C289325dP.A00(f, f2);
    }
}
