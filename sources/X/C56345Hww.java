package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.Hww  reason: case insensitive filesystem */
public abstract class C56345Hww {
    public static final void A01(C286575Wy r10, String str, 0sP r12, AnonymousClass62P r13, int i, boolean z, boolean z2) {
        int i2;
        String str2 = str;
        0sP r3 = r12;
        int A02 = DbW.A02(0, r12, str);
        C286575Wy r2 = r10;
        r10.ExV(405454400);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, r12) | i;
        } else {
            i2 = i;
        }
        AnonymousClass62P r4 = r13;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r10, r13);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0Q(r10, str);
        }
        boolean z3 = z;
        if ((i & 3072) == 0) {
            i2 |= G9t.A0b(r10, z);
        }
        boolean z4 = z2;
        if ((i & 24576) == 0) {
            i2 |= G9t.A0c(r10, z4);
        }
        if ((i2 & 9363) != 9362 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2120474132, "com.instagram.schools.management.badge.EditBadgeComposeView (EditBadgeComposeView.kt:29)");
            }
            if (C51975G9x.A1T(r2, new J8I(C51970G9q.A0N(r10), str2, r3, r4, z, z2), -244604862)) {
                0fL.A00(-1809971764);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9M(r3, r4, str2, i3, A02, z3, z4);
        }
    }

    public static final void A00(C286575Wy r11, String str, 0sP r13, AnonymousClass62P r14, int i) {
        int i2;
        r11.ExV(480890691);
        int i3 = i;
        AnonymousClass62P r8 = r14;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, r14) | i;
        } else {
            i2 = i;
        }
        String str2 = str;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r11, str);
        }
        0sP r7 = r13;
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r11, r13);
        }
        if ((i2 & 147) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1332824529, "com.instagram.schools.management.badge.BadgeNamesList (EditBadgeComposeView.kt:58)");
            }
            LazyListState A00 = C305066Gi.A00(r11, 0, 0, 0, 3);
            boolean A1N = C51973G9u.A1N(r11, 1182643292, i2) | C51972G9s.A1L(i2) | AnonymousClass7TF.A1S(i2 & 896, 256);
            Object ECw = r11.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0z(r11, r13, r14, str, 36);
            }
            C51965G9l.A1X(r11, false);
            AnonymousClass6HY.A05(A00, r11, (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(-518801583);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59141J7x(r7, r8, str2, i3, 12);
        }
    }
}
