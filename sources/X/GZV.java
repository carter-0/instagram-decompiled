package X;

public abstract class GZV {
    public static final void A00(C286575Wy r8, 0sL r9, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        0sL r3 = r9;
        0qQ.A0B(r9, 1);
        r8.ExV(-1398424219);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0Y(r8, z) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r8, r9);
        }
        if ((i3 & 19) != 18 || !r8.Bwn()) {
            if (i5 != 0) {
                z2 = false;
            }
            if (0fL.A02()) {
                0fL.A01(1095151543, "com.instagram.barcelona.bds.theme.BdsTheme (BdsTheme.kt:23)");
            }
            C287015Yr.A00(r8, AnonymousClass5PI.A01(r8, new J73(4, r9, z2), -1375927148), 6);
            if (0fL.A02()) {
                0fL.A00(279900827);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59131J7n(r3, i6, i4, 1, z2);
        }
    }
}
