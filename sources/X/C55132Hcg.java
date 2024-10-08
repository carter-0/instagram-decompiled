package X;

/* renamed from: X.Hcg  reason: case insensitive filesystem */
public abstract class C55132Hcg {
    public static final void A00(C286575Wy r15, String str, C62320sa r17, C62320sa r18, C62320sa r19, int i, boolean z) {
        int i2;
        C62320sa r4 = r17;
        C62320sa r2 = r18;
        AnonymousClass7TG.A1N(r4, r2);
        String str2 = str;
        C62320sa r3 = r19;
        AnonymousClass7TF.A1D(r3, 2, str2);
        r15.ExV(1773186248);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, r4) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r15, r2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r15, r3);
        }
        boolean z2 = z;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0b(r15, z2);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0S(r15, str2);
        }
        if ((i2 & 9363) != 9362 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(768149378, "com.instagram.schools.management.ui.SchoolManagementBottomSheetComposeView (SchoolManagementBottomSheetComposeView.kt:25)");
            }
            if (C51972G9s.A1U(r15, C51969G9p.A0U(), new C59128J7k(str2, r4, r2, r3, z2), 288623238)) {
                0fL.A00(1011933309);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9O(r2, r3, r4, str2, i3, 2, z2);
        }
    }
}
