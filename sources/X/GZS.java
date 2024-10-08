package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class GZS {
    public static final void A00(C286575Wy r34, FragmentActivity fragmentActivity, C299665vd r36, C299635va r37, UserSession userSession, String str, String str2, String str3, String str4, String str5, C62320sa r44, 0sP r45, 0sP r46, 0sL r47, AnonymousClass62P r48, int i, int i2, int i3) {
        int i4;
        int i5;
        UserSession userSession2 = userSession;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession2, fragmentActivity2);
        String str6 = str;
        0qQ.A0B(str6, 2);
        C299635va r15 = r37;
        C299665vd r24 = r36;
        AnonymousClass62P r4 = r48;
        C51973G9u.A0u(7, r4, r15, r24);
        0sP r6 = r46;
        0sP r7 = r45;
        C62320sa r8 = r44;
        0sL r5 = r47;
        C51974G9v.A1R(r7, r5, r8, r6);
        C286575Wy r9 = r34;
        r9.ExV(1219864207);
        int i6 = i2;
        if ((i2 & 6) == 0) {
            i4 = C41848B3p.A01(r9, userSession2) | i2;
        } else {
            i4 = i6;
        }
        int i7 = 32;
        if ((i2 & 48) == 0) {
            i4 |= G9t.A0F(r9, fragmentActivity2);
        }
        int i8 = 256;
        if ((i6 & 384) == 0) {
            i4 |= G9t.A0Q(r9, str6);
        }
        String str7 = str2;
        if ((i6 & 3072) == 0) {
            i4 |= G9t.A0R(r9, str7);
        }
        String str8 = str3;
        if ((i6 & 24576) == 0) {
            i4 |= G9t.A0S(r9, str8);
        }
        String str9 = str4;
        if ((i2 & 196608) == 0) {
            i4 |= G9t.A0T(r9, str9);
        }
        String str10 = str5;
        if ((i2 & 1572864) == 0) {
            i4 |= G9t.A0U(r9, str10);
        }
        if ((i2 & 12582912) == 0) {
            i4 |= G9t.A0V(r9, r4);
        }
        int i9 = i;
        if ((i2 & 100663296) == 0) {
            int i10 = 33554432;
            if (r9.AGs(i9)) {
                i10 = 67108864;
            }
            i4 |= i10;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= G9t.A0X(r9, r15);
        }
        int i11 = i3;
        if ((i3 & 6) == 0) {
            i5 = i3 | G9t.A0O(r9, r24);
        } else {
            i5 = i11;
        }
        if ((i3 & 48) == 0) {
            if (!r9.AGw(r7)) {
                i7 = 16;
            }
            i5 |= i7;
        }
        if ((i11 & 384) == 0) {
            if (!r9.AGw(r5)) {
                i8 = 128;
            }
            i5 |= i8;
        }
        if ((i11 & 3072) == 0) {
            i5 |= C51971G9r.A09(r9, r8);
        }
        if ((i11 & 24576) == 0) {
            i5 |= C51971G9r.A0A(r9, r6);
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 9363) == 9362 && r9.Bwn()) {
            r9.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(-1567130871, "instagram.features.clips.viewer.feature.threads.ui.ThreadsInReelsUnit (ThreadsInReelsUnit.kt:90)");
            }
            C286575Wy r32 = r9;
            UserSession userSession3 = userSession2;
            String str11 = str6;
            GZU.A00(r32, userSession3, str11, AnonymousClass5PI.A01(r9, new GZT(C51968G9o.A0I(r9), C51969G9p.A0S(C51967G9n.A0j()), C51969G9p.A0S(Float.valueOf(-1.0f)), C51970G9q.A0S(C51968G9o.A0u()), fragmentActivity2, r24, r15, userSession2, str9, str10, str8, str7, r8, r6, r7, r5, r4, i9, 2), 232839028), ((i4 >> 6) & 14) | 3456 | ((i4 << 3) & 112), 0, A1U);
            if (0fL.A02()) {
                0fL.A00(-149189515);
            }
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JD9(fragmentActivity2, r24, r15, userSession2, str6, str7, str8, str9, str10, r8, r7, r6, r5, r4, i9, i6, i11);
        }
    }
}
