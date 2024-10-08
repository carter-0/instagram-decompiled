package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.Hyl  reason: case insensitive filesystem */
public abstract class C56453Hyl {
    public static final GS7 A00;

    public static final void A00(C286575Wy r36, C49491EwW ewW, Integer num, String str, String str2, String str3, String str4, String str5, 0sL r44, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        SimpleImageUrl simpleImageUrl;
        String str6 = str2;
        0qQ.A0B(str6, 1);
        C49491EwW ewW2 = ewW;
        String str7 = str3;
        String str8 = str5;
        C51973G9u.A0t(2, str7, str8, ewW2);
        C286575Wy r7 = r36;
        r7.ExV(1143517220);
        int i5 = i;
        String str9 = str;
        if ((i & 6) == 0) {
            i3 = G9t.A0O(r7, str9) | i;
        } else {
            i3 = i5;
        }
        if ((i & 48) == 0) {
            i3 |= G9t.A0P(r7, str6);
        }
        if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r7, str7);
        }
        String str10 = str4;
        if ((i5 & 3072) == 0) {
            i3 |= G9t.A0R(r7, str10);
        }
        boolean z4 = z;
        if ((i5 & 24576) == 0) {
            i3 |= G9t.A0c(r7, z4);
        }
        boolean z5 = z2;
        if ((196608 & i) == 0) {
            i3 |= G9t.A0d(r7, z5);
        }
        boolean z6 = z3;
        if ((i & 1572864) == 0) {
            i3 |= G9t.A0e(r7, z6);
        }
        Integer num2 = num;
        if ((i & 12582912) == 0) {
            i3 |= G9t.A0V(r7, num2);
        }
        if ((i & 100663296) == 0) {
            i3 |= G9t.A0W(r7, str8);
        }
        if ((i & 805306368) == 0) {
            i3 |= G9t.A0X(r7, ewW2);
        }
        int i6 = i2;
        0sL r38 = r44;
        if ((i2 & 6) == 0) {
            i4 = i2 | C51971G9r.A08(r7, r38);
        } else {
            i4 = i6;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && r7.Bwn()) {
            r7.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(1405589658, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequest (FollowRequest.kt:32)");
            }
            if (str9 != null) {
                simpleImageUrl = DbS.A0V(str9);
            } else {
                simpleImageUrl = null;
            }
            AnonymousClass2DN A002 = 1zC.A00(r7, simpleImageUrl);
            GS7 gs7 = A00;
            r7.ExS(-1534585919);
            int i7 = i3 & 1879048192;
            boolean z7 = false;
            boolean A1S = AnonymousClass7TF.A1S(i7, 536870912);
            Object ECw = r7.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = C51969G9p.A0y(r7, ewW2, 14);
            }
            C286565Wx A0H = C51965G9l.A0H(r7, false);
            int i8 = i3 << 6;
            C286575Wy r17 = r7;
            String str11 = str6;
            String str12 = str7;
            String str13 = str10;
            GS8.A01(r17, (Modifier) null, A002, gs7, str11, str12, str13, (C62320sa) ((C59520Ya) ECw), (0sP) null, AnonymousClass5PI.A01(r7, new C59369JGv(4, ewW2, r38, num2, z4), -1527912765), C51969G9p.A05(i3 & 112, 57344 & i8, i8) | (234881024 & i8) | ((i3 << 12) & 1879048192), 196656, 21708, false, false, z6, z5);
            r7.ExS(-1534566389);
            if (i7 == 536870912) {
                z7 = true;
            }
            Object ECw2 = r7.ECw();
            if (z7 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C51646Fy5(ewW2, (AnonymousClass4D7) null, 0);
                r7.FLL(ECw2);
            }
            if (C51972G9s.A1S(r7, A0H, ECw2, str8)) {
                0fL.A00(-1210963774);
            }
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JCD(ewW2, num2, str9, str6, str7, str10, str8, r38, i5, i6, z4, z5, z6);
        }
    }

    static {
        GS7 gs7 = GS7.A03;
        JSI jsi = gs7.A02;
        float AeO = jsi.AeO();
        GS6 gs6 = new GS6(AeO, AeO, jsi.AeL(), jsi.AeM());
        C304836Fk r2 = gs7.A01;
        0qQ.A0B(r2, 0);
        A00 = new GS7(r2, gs6, 72.0f);
    }
}
