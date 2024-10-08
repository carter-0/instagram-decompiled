package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* renamed from: X.HYl  reason: case insensitive filesystem */
public abstract class C54929HYl {
    public static final void A00(C286575Wy r22, Modifier modifier, C53360Gmk gmk, 0sP r25, 0sP r26, 0sP r27, 0sP r28, int i) {
        int i2;
        C286575Wy r1 = r22;
        r1.ExV(2113670161);
        int i3 = i;
        C53360Gmk gmk2 = gmk;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r1, gmk2) | i;
        } else {
            i2 = i3;
        }
        0sP r10 = r25;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r1, r10);
        }
        0sP r8 = r26;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r1, r8);
        }
        0sP r12 = r27;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r1, r12);
        }
        0sP r9 = r28;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r1, r9);
        }
        Modifier modifier2 = modifier;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0T(r1, modifier2);
        }
        if ((74899 & i2) != 74898 || !r1.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1424028589, "com.instagram.creator.achievements.modules.fragments.AchievementsHubScreen (AchievementsHubFragment.kt:289)");
            }
            Object A0r = C51965G9l.A0r(r1);
            boolean z = true;
            Modifier A0V = C51966G9m.A0V(modifier2);
            boolean A1S = C51973G9u.A1S(r1, gmk2, A0r, -1267904702) | C51972G9s.A1L(i2) | AnonymousClass7TF.A1S(i2 & 896, 256) | AnonymousClass7TF.A1S(i2 & 7168, C249703kE.FLAG_MOVED);
            if ((i2 & 57344) != 16384) {
                z = false;
            }
            boolean z2 = A1S | z;
            Object ECw = r1.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new C58799Ixk(5, gmk2, A0r, r8, r9, r10, r12);
                r1.FLL(ECw);
            }
            C51968G9o.A1N(r1);
            AnonymousClass6HY.A04((LazyListState) null, r1, A0V, (0sP) ECw, 12582912, 126, true);
            if (0fL.A02()) {
                0fL.A00(-987553807);
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA2(r8, r9, r10, modifier2, r12, gmk2, i3, 3);
        }
    }
}
