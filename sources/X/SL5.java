package X;

import java.util.ArrayList;

public abstract class SL5 {
    public static final SNH A00 = SNH.A01("k", "x", "y");

    public static C11800Sgm A00(S7N s7n, C12828T8z t8z) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        C12828T8z t8z2 = t8z;
        if (t8z.A0E() == AnonymousClass05K.A00) {
            t8z.A0I();
            while (t8z.A0Q()) {
                boolean A1W = AnonymousClass7TF.A1W(t8z.A0E(), AnonymousClass05K.A0C);
                S7N s7n2 = s7n;
                A1C.add(new C7495QGm(s7n, C11320SMu.A01(s7n2, C11821Sh7.A00, t8z2, SSo.A00(), A1W, false)));
            }
            t8z.A0K();
            SL6.A01(A1C);
        } else {
            A1C.add(new ST4(C11400SRv.A02(t8z, SSo.A00())));
        }
        return new C11800Sgm(A1C);
    }

    public static C13765Tgd A01(S7N s7n, C12828T8z t8z) {
        t8z.A0J();
        C11800Sgm sgm = null;
        QGY qgy = null;
        QGY qgy2 = null;
        boolean z = false;
        while (t8z.A0E() != AnonymousClass05K.A0N) {
            int A0D = t8z.A0D(A00);
            if (A0D != 0) {
                if (A0D != 1) {
                    if (A0D != 2) {
                        t8z.A0M();
                        t8z.A0N();
                    } else if (t8z.A0E() != AnonymousClass05K.A0j) {
                        qgy2 = C11390SRe.A01(s7n, t8z, true);
                    }
                } else if (t8z.A0E() != AnonymousClass05K.A0j) {
                    qgy = C11390SRe.A01(s7n, t8z, true);
                }
                t8z.A0N();
                z = true;
            } else {
                sgm = A00(s7n, t8z);
            }
        }
        t8z.A0L();
        if (z) {
            s7n.A03("Lottie doesn't support expressions.");
        }
        if (sgm == null) {
            return new C11801Sgn(qgy, qgy2);
        }
        return sgm;
    }
}
