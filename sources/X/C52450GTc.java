package X;

/* renamed from: X.GTc  reason: case insensitive filesystem */
public abstract class C52450GTc {
    public static final void A00(C286575Wy r12, AnonymousClass4DH r13, 0sL r14, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        0qQ.A0B(r13, 0);
        C286575Wy r3 = r12;
        r12.ExV(1791188404);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r12, r13) | i;
        } else {
            i2 = i;
        }
        boolean z4 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r12, z4);
        }
        boolean z5 = z2;
        if ((i & 384) == 0) {
            i2 |= G9t.A0a(r12, z5);
        }
        boolean z6 = z3;
        if ((i & 3072) == 0) {
            i2 |= G9t.A0b(r12, z6);
        }
        0sL r6 = r14;
        if ((i & 24576) == 0) {
            i2 |= G9t.A0I(r12, r14);
        }
        if ((i2 & 9363) != 9362 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1560857942, "com.instagram.compose.fragment.IgRoot (IgRoot.kt:17)");
            }
            Object A0m = C51967G9n.A0m(r12, 647723673);
            if (A0m == AnonymousClass5XT.A00) {
                A0m = 09i.A0A.A06(r13.requireArguments());
                r12.FLL(A0m);
            }
            C51965G9l.A1X(r12, false);
            int i3 = i2 << 3;
            C286885Ye.A03(r3, (0lg) A0m, r13.getModuleName(), r6, C51973G9u.A03(i3 & 896, i3 & 7168, i3), 0, z4, z5, z6);
            if (0fL.A02()) {
                0fL.A00(277342122);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J85(r13, r14, i, z, z2, z3);
        }
    }
}
