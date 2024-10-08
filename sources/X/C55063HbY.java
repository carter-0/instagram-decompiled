package X;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;

/* renamed from: X.HbY  reason: case insensitive filesystem */
public abstract class C55063HbY {
    @Deprecated(message = "DO NOT USE -- use IgdsButton instead (this is only for QE investigation)")
    public static final void A00(C286575Wy r13, Modifier modifier, AnonymousClass6CC r15, String str, C62320sa r17, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        String str2 = str;
        0qQ.A0B(str2, 0);
        AnonymousClass6CC r9 = r15;
        C62320sa r8 = r17;
        AnonymousClass7TF.A1C(r15, 1, r8);
        C286575Wy r0 = r13;
        r13.ExV(-1431770245);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r13, str2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r13, r15);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r13, modifier);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r13, r8);
        }
        if ((i3 & 1171) != 1170 || !r13.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-586369363, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestButton (FollowRequestButton.kt:39)");
            }
            C287605aT r14 = (C287605aT) C51974G9v.A0V(r13, 194182054);
            C51965G9l.A1X(r13, false);
            String str3 = str2;
            C286575Wy r132 = r0;
            AnonymousClass5ZZ.A0L(r132, C287205Zk.A02(C287215Zl.A09, C287195Zj.A09(C287205Zk.A05(C51970G9q.A0T(r0, C288245bb.A00(r14, C287635aW.A00((C287095Yz) null, r14, AnonymousClass5R5.A00(modifier2, C59036J3v.A00, true), C51965G9l.A0R(0), (String) null, r8, true), 0.3f, true), r9.AD4(false)), r9.CoN(AnonymousClass6CD.SMALL)), 12.0f, 5.0f)), C51966G9m.A0h(r0), str3, i3 & 14, r9.AJf(true));
            if (0fL.A02()) {
                0fL.A00(-1574070331);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9N(modifier2, r8, r9, str2, i5, i4, 4);
        }
    }
}
