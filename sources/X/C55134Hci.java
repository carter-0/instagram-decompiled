package X;

/* renamed from: X.Hci  reason: case insensitive filesystem */
public abstract class C55134Hci {
    public static final void A00(C286575Wy r7, String str, C62320sa r9, C62320sa r10, int i) {
        int i2;
        String str2 = str;
        C62320sa r3 = r9;
        C62320sa r4 = r10;
        AnonymousClass7TG.A1T(r9, r10, str);
        r7.ExV(-308267474);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r7, r9) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r7, r10);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0Q(r7, str);
        }
        if ((i2 & 147) != 146 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1259722957, "com.instagram.schools.management.ui.SchoolRemovalBottomSheetComposeView (SchoolRemovalBottomSheetComposeView.kt:25)");
            }
            if (C51975G9x.A1T(r7, new J7R(r10, r9, str, 6), -977310228)) {
                0fL.A00(2020378158);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59141J7x(r3, r4, str2, i3, 15);
        }
    }
}
