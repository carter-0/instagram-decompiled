package X;

/* renamed from: X.Hcc  reason: case insensitive filesystem */
public abstract class C55128Hcc {
    public static final void A00(C286575Wy r12, C55527Hj9 hj9, C62320sa r14, C62320sa r15, C62320sa r16, int i) {
        int i2;
        C62320sa r8 = r14;
        0qQ.A0B(r14, 0);
        C55527Hj9 hj92 = hj9;
        C62320sa r10 = r15;
        C62320sa r9 = r16;
        AnonymousClass7TG.A1U(r15, r9, hj9);
        r12.ExV(1492715429);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r12, r14) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r12, r15);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r12, r9);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r12, hj9);
        }
        if ((i2 & 1171) != 1170 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1138131070, "com.instagram.schools.management.components.ErrorDialog (ErrorDialog.kt:17)");
            }
            if (C51971G9r.A1W(hj9.A00)) {
                r15.invoke();
                C53398GnV gnV = new C53398GnV(AnonymousClass05K.A01, C288035bG.A00(r12, 2131960862), (C62320sa) null, 28);
                C53398GnV gnV2 = new C53398GnV(AnonymousClass05K.A00, C288035bG.A00(r12, 2131964884), r8, 12);
                r12.ExS(-1434077876);
                boolean A1S = AnonymousClass7TF.A1S(i2 & 7168, C249703kE.FLAG_MOVED) | C51972G9s.A1N(i2);
                Object ECw = r12.ECw();
                if (A1S || ECw == AnonymousClass5XT.A00) {
                    ECw = C58691Iw0.A00(r12, r9, hj92, 16);
                }
                C51965G9l.A1X(r12, false);
                C56632I5m.A02(r12, gnV, gnV2, C288035bG.A00(r12, 2131963127), C288035bG.A00(r12, 2131963126), (C62320sa) ECw);
            }
            if (0fL.A02()) {
                0fL.A00(-1051334337);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(hj92, r8, r9, r10, i3, 20);
        }
    }
}
