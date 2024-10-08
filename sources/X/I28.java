package X;

import androidx.compose.ui.Modifier;

public abstract class I28 {
    public static final C56838IEj A00(C286575Wy r9) {
        boolean z = true;
        if (0fL.A02()) {
            0fL.A01(1839438786, "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)");
        }
        Object[] objArr = new Object[0];
        C286015Tp r4 = C56838IEj.A08;
        C286575Wy r3 = r9;
        if (!r9.AGs(0)) {
            z = false;
        }
        Object ECw = r9.ECw();
        if (z || ECw == AnonymousClass5XT.A00) {
            ECw = new C67001MgZ(0, 0);
            r9.FLL(ECw);
        }
        C56838IEj iEj = (C56838IEj) C305136Gr.A00(r3, r4, (C62320sa) ECw, objArr, 0, 4);
        if (0fL.A02()) {
            0fL.A00(794391905);
        }
        return iEj;
    }

    public static final Modifier A01(C56838IEj iEj, Modifier modifier) {
        return C287435a8.A02(modifier, C287655aY.A00, new JGP(iEj, true));
    }

    public static Modifier A02(C286575Wy r0, Modifier modifier) {
        return A01(A00(r0), modifier);
    }
}
