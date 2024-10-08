package X;

/* renamed from: X.HxR  reason: case insensitive filesystem */
public abstract class C56373HxR {
    public static final boolean A01(GSY gsy, C52030GCc gCc, C267324bN r6, int i) {
        0qQ.A0B(gCc, 3);
        if (!r6.CcK() || !r6.A06().A0t) {
            return false;
        }
        C52030GCc.A01(gsy, gCc, r6, "primary", new J6O(A00(i), 5));
        return true;
    }

    public static final 0jB A00(int i) {
        boolean A1P = AnonymousClass7TF.A1P(i);
        0jB A0k = C51965G9l.A0k();
        C51967G9n.A1J(C271774jZ.A23, A0k, true);
        C51967G9n.A1J(C271774jZ.A22, A0k, A1P);
        A0k.A04(C271774jZ.A21, Integer.valueOf(i));
        return A0k;
    }
}
