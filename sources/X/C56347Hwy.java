package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.Hwy  reason: case insensitive filesystem */
public abstract class C56347Hwy {
    public static final void A00(C286575Wy r10, 0sP r11, AnonymousClass62P r12, int i, boolean z, boolean z2) {
        int i2;
        0sP r4 = r11;
        0qQ.A0B(r11, 0);
        r10.ExV(-738731530);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, r4) | i;
        } else {
            i2 = i;
        }
        AnonymousClass62P r5 = r12;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r10, r12);
        }
        boolean z3 = z;
        if ((i & 384) == 0) {
            i2 |= G9t.A0a(r10, z);
        }
        boolean z4 = z2;
        if ((i & 3072) == 0) {
            i2 |= G9t.A0b(r10, z2);
        }
        if ((i2 & 1171) != 1170 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1017508094, "com.instagram.schools.management.visibility.EditVisibilityComposeView (EditVisibilityComposeView.kt:29)");
            }
            if (C51975G9x.A1T(r10, new J8V(1, C51966G9m.A16(r10), r4, r5, z3, z4), -4220424)) {
                0fL.A00(-1873687418);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8S(r4, r5, i3, 1, z, z2);
        }
    }

    public static final void A01(AnonymousClass62P r4, 0sP r5, C286575Wy r6, int i) {
        int i2;
        r6.ExV(-350465505);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r6, r4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r6, r5);
        }
        if ((i2 & 19) != 18 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1076324732, "com.instagram.schools.management.visibility.VisibilityOptionsList (EditVisibilityComposeView.kt:55)");
            }
            LazyListState A00 = C305066Gi.A00(r6, 0, 0, 0, 3);
            boolean A1Z = C51967G9n.A1Z(r6, r4, 376581985) | C51968G9o.A1S(i2);
            Object ECw = r6.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new C74186PqS(33, (Object) r5, (Object) r4);
                r6.FLL(ECw);
            }
            C51968G9o.A1N(r6);
            AnonymousClass6HY.A05(A00, r6, (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(1578186560);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, r5, r4, i, 6);
        }
    }
}
