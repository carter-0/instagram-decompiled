package X;

/* renamed from: X.Hcf  reason: case insensitive filesystem */
public abstract class C55131Hcf {
    public static final void A00(C286575Wy r14, C54672HOd hOd, INA ina, C62320sa r17, C62320sa r18, int i, int i2, int i3, boolean z) {
        int i4;
        INA ina2 = ina;
        C62320sa r8 = r17;
        C62320sa r5 = r18;
        C51973G9u.A0r(0, r8, r5, ina2);
        C54672HOd hOd2 = hOd;
        0qQ.A0B(hOd, 6);
        r14.ExV(-258736883);
        int i5 = i3;
        if ((i3 & 6) == 0) {
            i4 = C41848B3p.A01(r14, r8) | i3;
        } else {
            i4 = i5;
        }
        int i6 = i;
        if ((i3 & 48) == 0) {
            i4 |= G9t.A06(r14, i6);
        }
        int i7 = i2;
        if ((i5 & 384) == 0) {
            i4 |= G9t.A07(r14, i7);
        }
        boolean z2 = z;
        if ((i5 & 3072) == 0) {
            i4 |= G9t.A0b(r14, z2);
        }
        if ((i5 & 24576) == 0) {
            i4 |= G9t.A0I(r14, r5);
        }
        if ((196608 & i3) == 0) {
            i4 |= G9t.A0J(r14, ina2);
        }
        if ((1572864 & i3) == 0) {
            i4 |= G9t.A0U(r14, hOd);
        }
        if ((599187 & i4) != 599186 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2068928779, "com.instagram.schools.management.graduation.ChangeGraduationComposeView (ChangeGraduationComposeView.kt:36)");
            }
            Object A0m = C51967G9n.A0m(r14, -906670042);
            if (A0m == AnonymousClass5XT.A00) {
                A0m = new C55527Hj9();
                r14.FLL(A0m);
            }
            C51965G9l.A1X(r14, false);
            if (C51975G9x.A1T(r14, new C59200JAe(r5, A0m, hOd2, r8, ina2, i6, i7, 6, z2), 491353675)) {
                0fL.A00(-784409119);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59198JAc(r8, r5, ina2, hOd2, i6, i7, i5, 0, z2);
        }
    }
}
