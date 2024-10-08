package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.HxP  reason: case insensitive filesystem */
public abstract class C56371HxP {
    public static final void A00(C286575Wy r16, JRL jrl, C53371Gmv gmv, C62320sa r19, C62320sa r20, 0sP r21, int i) {
        int i2;
        C286625Xd ASQ;
        int i3;
        C53371Gmv gmv2 = gmv;
        0qQ.A0B(gmv2, 0);
        JRL jrl2 = jrl;
        C62320sa r11 = r19;
        C62320sa r12 = r20;
        0sP r14 = r21;
        C51974G9v.A1P(r11, r12, r14, jrl2);
        C286575Wy r15 = r16;
        r15.ExV(-402253941);
        int i4 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r15, gmv2) | i;
        } else {
            i2 = i4;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r15, r11);
        }
        if ((i4 & 384) == 0) {
            i2 |= G9t.A0G(r15, r12);
        }
        if ((i4 & 3072) == 0) {
            i2 |= G9t.A0H(r15, r14);
        }
        if ((i4 & 24576) == 0) {
            i2 |= G9t.A0I(r15, jrl2);
        }
        if ((i2 & 9363) != 9362 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1861989968, "instagram.features.clips.spins.feedback.ui.ClipsSpinsReplyBottomSheetContent (ClipsSpinsReplyBottomSheetContent.kt:45)");
            }
            String str = gmv2.A02;
            if (str == null) {
                if (0fL.A02()) {
                    0fL.A00(1200224033);
                }
                ASQ = r15.ASQ();
                if (ASQ != null) {
                    i3 = 11;
                    ASQ.A06 = new J9H(i4, i3, gmv2, r11, r12, jrl2, r14);
                }
                return;
            }
            C285245Qk r3 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r15, 0);
            int A00 = C287425a7.A00(r15);
            C286565Wx r4 = (C286565Wx) r15;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A01 = C287435a8.A01(r15, r3);
            C51973G9u.A0y(r15, r4);
            C51971G9r.A12(r15, A0Z, A04);
            0sL r2 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r2, A00);
            }
            C51965G9l.A18(r15, A01);
            C55250Hef.A00(r15, gmv2, r11, C51965G9l.A01(i2));
            r15.ExS(1869628537);
            if (gmv2.A05) {
                int i5 = i2 << 3;
                JRL jrl3 = jrl2;
                String str2 = str;
                C62320sa r18 = r11;
                C62320sa r192 = r12;
                0sP r202 = r14;
                A01(r15, jrl3, str2, r18, r192, r202, C51973G9u.A03(i5 & 896, i5 & 7168, i5), gmv2.A06);
            }
            if (C51971G9r.A1S(r15, r4, false)) {
                0fL.A00(455925488);
            }
        } else {
            r15.Evl();
        }
        ASQ = r15.ASQ();
        if (ASQ != null) {
            i3 = 10;
            ASQ.A06 = new J9H(i4, i3, gmv2, r11, r12, jrl2, r14);
        }
    }

    public static final void A01(C286575Wy r47, JRL jrl, String str, C62320sa r50, C62320sa r51, 0sP r52, int i, boolean z) {
        int i2;
        C286575Wy r0 = r47;
        r0.ExV(-1365201263);
        int i3 = i;
        String str2 = str;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r0, str2) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r0, z2);
        }
        C62320sa r46 = r50;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r0, r46);
        }
        C62320sa r45 = r51;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r0, r45);
        }
        0sP r44 = r52;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r0, r44);
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r0, jrl);
        }
        if ((74899 & i2) != 74898 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1641334232, "instagram.features.clips.spins.feedback.ui.FeedbackRow (ClipsSpinsReplyBottomSheetContent.kt:69)");
            }
            ImageUrl A0G = C51976G9y.A0G(r0);
            Object A0m = C51967G9n.A0m(r0, 815901766);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r0, "");
            }
            C284945Oz r4 = (C284945Oz) A0m;
            C286565Wx r3 = (C286565Wx) r0;
            C286565Wx.A0L(r3, false);
            C56547I1b i1b = (C56547I1b) C51976G9y.A0I(r0, obj, 815903780);
            C286565Wx.A0L(r3, false);
            C60340gF r10 = C60340gF.A00;
            Object A0m2 = C51967G9n.A0m(r0, 815905488);
            if (A0m2 == obj) {
                A0m2 = new C58092ImE(i1b, (AnonymousClass4D7) null, 14);
                r0.FLL(A0m2);
            }
            C51968G9o.A1E(r0, r3, A0m2, r10);
            C285245Qk r11 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(r11, 0.0f, 0.0f, 0.0f, 16.0f);
            AnonymousClass5RD A0W = C51968G9o.A0W(r0);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r0, A0B);
            C51973G9u.A0y(r0, r3);
            C51971G9r.A12(r0, A0W, A04);
            0sL r9 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r9, A00);
            }
            C51965G9l.A18(r0, A01);
            AnonymousClass6FX r14 = AnonymousClass6FX.A00;
            GRY.A02(r0, C287195Zj.A09(r11, 8.0f, 0.0f), 1zC.A00(r0, A0G), C57116IPf.A00, 432);
            String A1A = C51966G9m.A1A(r4);
            Modifier A002 = r14.A00(C287195Zj.A0B(C51970G9q.A0U(r11, i1b), 0.0f, 0.0f, 12.0f, 0.0f));
            C304776Fe r12 = new C304776Fe(C51966G9m.A0M(r0));
            AnonymousClass5Z4 A003 = AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0g(r0), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 66305, 0, 6291454, C51966G9m.A0H(r0), 0, 0, 0);
            I23 i23 = new I23((Boolean) null, -1, 0, 4);
            r0.ExS(-1299361098);
            boolean A1W = C51974G9v.A1W(i2) | C51972G9s.A1O(i2);
            Object ECw = r0.ECw();
            if (A1W || ECw == obj) {
                ECw = C59104J6m.A00(r0, r45, r4, r44, 49);
            }
            I4S i4s = new I4S((0sP) null, (0sP) null, C51965G9l.A0z(r3, ECw));
            Object A0m3 = C51967G9n.A0m(r0, -1299378757);
            if (A0m3 == obj) {
                A0m3 = C59097J6f.A01(r4, 36);
                r0.FLL(A0m3);
            }
            I4S i4s2 = i4s;
            I23 i232 = i23;
            I5J.A01((C287605aT) null, i4s2, i232, r0, A002, r12, A003, (C59648JRq) null, A1A, C51965G9l.A0z(r3, A0m3), (0sP) null, AnonymousClass5PI.A01(r0, new C59362JGo(jrl, r4, str2, 4), 18878928), 0, 0, 1572912, 196608, 16152, false, false, false);
            C55251Heg.A00(r0, r46, ((i2 >> 6) & 14) | (i2 & 112), z2);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(785046716);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA9(r46, r45, r44, jrl, str2, i3, 3, z2);
        }
    }
}
