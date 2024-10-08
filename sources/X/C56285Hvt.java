package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.Hvt  reason: case insensitive filesystem */
public abstract class C56285Hvt {
    public static final void A00(C286575Wy r15, Modifier modifier, C53392GnP gnP, 0sP r18, 0sP r19, 0sP r20, 0sL r21, int i) {
        int i2;
        boolean z;
        C286575Wy r2 = r15;
        r15.ExV(-79656142);
        int i3 = i;
        Modifier modifier2 = modifier;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r15, modifier2) | i;
        } else {
            i2 = i3;
        }
        C53392GnP gnP2 = gnP;
        if ((i & 48) == 0) {
            i2 |= C51970G9q.A06(G9t.A1U(r15, gnP2, i3) ? 1 : 0);
        }
        0sP r10 = r18;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r15, r10);
        }
        0sP r8 = r19;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r15, r8);
        }
        0sP r11 = r20;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r15, r11);
        }
        0sL r12 = r21;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r15, r12);
        }
        if ((74899 & i2) != 74898 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-382556569, "com.instagram.creator.agent.settings.keyword.AddKeywordSection (AddKeywordFragment.kt:192)");
            }
            Long l = gnP2.A06;
            r15.ExS(-844980281);
            boolean z2 = false;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && r15.AGw(gnP2))) {
                z = true;
            } else {
                z = false;
            }
            boolean A1U = C51968G9o.A1U(r15, l, z | AnonymousClass7TF.A1S(i2 & 896, 256) | AnonymousClass7TF.A1S(i2 & 7168, C249703kE.FLAG_MOVED), C51974G9v.A1W(i2));
            if ((458752 & i2) == 131072) {
                z2 = true;
            }
            boolean z3 = A1U | z2;
            Object ECw = r15.ECw();
            if (z3 || ECw == AnonymousClass5XT.A00) {
                ECw = new C58799Ixk(8, l, gnP2, r10, r8, r21, r11);
                r2.FLL(ECw);
            }
            C51968G9o.A1N(r2);
            AnonymousClass6HY.A07(r2, modifier2, (0sP) ECw, i2 & 14);
            if (0fL.A02()) {
                0fL.A00(-1264186496);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA2(r8, gnP2, r10, r11, r12, modifier2, i3, 6);
        }
    }

    public static final void A01(C286575Wy r14, C53392GnP gnP, C62320sa r16, 0sP r17, 0sP r18, 0sP r19, 0sL r20, int i) {
        int i2;
        String str;
        int i3;
        C286575Wy r8 = r14;
        r14.ExV(1989795282);
        int i4 = i;
        C53392GnP gnP2 = gnP;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r14, gnP, i4) ? 1 : 0) | i;
        } else {
            i2 = i4;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r17);
        }
        0sP r5 = r18;
        if ((i4 & 384) == 0) {
            i2 |= G9t.A0G(r14, r5);
        }
        0sP r4 = r19;
        if ((i4 & 3072) == 0) {
            i2 |= G9t.A0H(r14, r4);
        }
        0sL r3 = r20;
        if ((i4 & 24576) == 0) {
            i2 |= G9t.A0I(r14, r3);
        }
        C62320sa r7 = r16;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r14, r7);
        }
        if ((74899 & i2) != 74898 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1471644906, "com.instagram.creator.agent.settings.keyword.AddKeywordLayout (AddKeywordFragment.kt:159)");
            }
            C285245Qk r9 = Modifier.A00;
            Modifier A00 = JJP.A00(r9, C287655aY.A00, 0);
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r14, C287215Zl.A02, 0);
            int A002 = C287425a7.A00(r14);
            C286565Wx r10 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r10);
            Modifier A01 = C287435a8.A01(r8, A00);
            C51973G9u.A0y(r8, r10);
            C51971G9r.A12(r8, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r10.A0K || !C51972G9s.A1Q(r8, A002)) {
                C51971G9r.A13(r8, r1, A002);
            }
            C51965G9l.A18(r8, A01);
            C304676Et r12 = C304676Et.A00;
            C52738Gbq gbq = new C52738Gbq((C62320sa) null, 7, 0);
            r8.ExS(-1018451786);
            if (gnP.A0A) {
                str = C288035bG.A00(r8, 2131952303);
            } else {
                str = gnP.A08;
            }
            C286565Wx.A0L(r10, false);
            C52739Gbr.A04(r8, gbq, str);
            Modifier A003 = r12.A00(r9, true);
            int i5 = i2 << 3;
            A00(r8, A003, gnP2, r17, r18, r19, r20, C51969G9p.A04(i5, i5 & 112) | (57344 & i5) | (i5 & 458752));
            if (gnP2.A0C) {
                r8.ExS(-1018438086);
                i3 = 2131964562;
            } else {
                r8.ExS(-1018436084);
                i3 = 2131972502;
            }
            String A004 = C288035bG.A00(r8, i3);
            C286565Wx.A0L(r10, false);
            boolean A1W = AnonymousClass7TF.A1W(gnP2.A02, C54617HLa.LOADING);
            boolean z = true;
            if (gnP2.A08.length() <= 0 || gnP2.A07.length() <= 0 || !(gnP2.A04 instanceof C57145IQj) || !(gnP2.A05 instanceof C57145IQj)) {
                z = false;
            }
            r8.ExS(-1018429792);
            boolean A1P = C51972G9s.A1P(i2, 458752, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            Object ECw = r8.ECw();
            if (A1P || ECw == AnonymousClass5XT.A00) {
                ECw = C58706IwF.A01(r7, 35);
                r8.FLL(ECw);
            }
            I7L.A09(r8, A004, C51965G9l.A0y(r10, ECw, false), z, A1W);
            if (C51967G9n.A1R(r8)) {
                0fL.A00(573597325);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            0sL r82 = r3;
            C62320sa r92 = r7;
            0sP r72 = r17;
            ASQ.A06 = new JA2(r5, gnP2, r72, r82, r92, r4, i4, 5);
        }
    }
}
