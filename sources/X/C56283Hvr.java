package X;

import androidx.compose.ui.Modifier;
import com.instagram.creator.achievements.modules.models.Badge;

/* renamed from: X.Hvr  reason: case insensitive filesystem */
public abstract class C56283Hvr {
    public static final void A00(C286575Wy r12, Modifier modifier, Badge.ChallengeBadge challengeBadge, int i, int i2) {
        Modifier modifier2 = modifier;
        C286575Wy r9 = r12;
        r12.ExV(-1803514468);
        int i3 = i2;
        if ((i2 & 2) != 0) {
            modifier2 = Modifier.A00;
        }
        if (0fL.A02()) {
            0fL.A01(317766790, "com.instagram.creator.achievements.modules.views.TextBox (ChallengeCard.kt:76)");
        }
        int i4 = i;
        AnonymousClass5RD A0D = C51976G9y.A0D(r12, i >> 3);
        int A00 = C287425a7.A00(r12);
        C286565Wx r1 = (C286565Wx) r9;
        AnonymousClass5RM A04 = C286565Wx.A04(r1);
        Modifier A01 = C287435a8.A01(r12, modifier2);
        C51973G9u.A0y(r12, r1);
        C51971G9r.A12(r12, A0D, A04);
        0sL r5 = C287485aD.A02;
        if (r1.A0K || !C51972G9s.A1Q(r12, A00)) {
            C51971G9r.A13(r12, r5, A00);
        }
        C51965G9l.A18(r12, A01);
        Modifier A0U = C51969G9p.A0U();
        Badge.ChallengeBadge challengeBadge2 = challengeBadge;
        AnonymousClass5ZZ.A0A(r9, C51967G9n.A0C(A0U, 4.0f), C51965G9l.A0S(r9), challengeBadge.A07, 2, 48, 390, 11260);
        String str = challengeBadge2.A05;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        r9.ExS(-961777885);
        if (str != null) {
            AnonymousClass5ZZ.A0A(r9, A0U, C51966G9m.A0b(r9), str, 2, 48, 390, 11260);
        }
        if (C51971G9r.A1S(r9, r1, false)) {
            0fL.A00(-1281764848);
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(challengeBadge2, modifier2, i3, i4, 30);
        }
    }

    public static final void A01(C286575Wy r19, Modifier modifier, Badge.ChallengeBadge challengeBadge, 0sP r22, int i) {
        Integer num;
        float f;
        Badge.ChallengeBadge challengeBadge2 = challengeBadge;
        0sP r4 = r22;
        boolean A1b = C51973G9u.A1b(challengeBadge2, r4, modifier);
        C286575Wy r7 = r19;
        if (C51967G9n.A1T(r7, 1427942308)) {
            0fL.A01(-312484714, "com.instagram.creator.achievements.modules.views.ChallengeCard (ChallengeCard.kt:36)");
        }
        Modifier A05 = C287635aW.A05(C51966G9m.A0X(C51968G9o.A0P(modifier, 16.0f), C51966G9m.A0C(r7)), (C287625aV) null, (String) null, new C58689Ivy(5, r4, challengeBadge2), A1b);
        AnonymousClass5RD A0a = C51966G9m.A0a(false);
        int A00 = C287425a7.A00(r7);
        C286565Wx r8 = (C286565Wx) r7;
        AnonymousClass5RM A04 = C286565Wx.A04(r8);
        Modifier A01 = C287435a8.A01(r7, A05);
        C62320sa r15 = C287485aD.A00;
        C51973G9u.A0z(r7, r8, r15);
        0sL r14 = C287485aD.A03;
        0sL A0w = C51969G9p.A0w(r7, A0a, A04, r14);
        0sL r12 = C287485aD.A02;
        if (r8.A0K || !C51972G9s.A1Q(r7, A00)) {
            C51971G9r.A13(r7, r12, A00);
        }
        0sL A1K = C51966G9m.A1K(r7, A01);
        C285245Qk r3 = Modifier.A00;
        Modifier A07 = C287195Zj.A07(r3, 16.0f);
        AnonymousClass5RD A0Z = C51969G9p.A0Z(r7, 0);
        int A002 = C287425a7.A00(r7);
        AnonymousClass5RM A042 = C286565Wx.A04(r8);
        Modifier A012 = C287435a8.A01(r7, A07);
        C51973G9u.A0z(r7, r8, r15);
        C287595aO.A00(r7, A0Z, r14);
        if (C51965G9l.A1Y(r7, r8, A042, A0w) || !C51972G9s.A1Q(r7, A002)) {
            C51971G9r.A13(r7, r12, A002);
        }
        C287595aO.A00(r7, A012, A1K);
        C287245Zp r0 = C287215Zl.A04;
        Modifier A0A = C287195Zj.A0A(r3, 0.0f, 0.0f, 0.0f);
        AnonymousClass5RD A0Q = C51965G9l.A0Q(r7, r0);
        int A003 = C287425a7.A00(r7);
        AnonymousClass5RM A043 = C286565Wx.A04(r8);
        Modifier A013 = C287435a8.A01(r7, A0A);
        C51973G9u.A0z(r7, r8, r15);
        C287595aO.A00(r7, A0Q, r14);
        if (C51965G9l.A1Y(r7, r8, A043, A0w) || !C51972G9s.A1Q(r7, A003)) {
            C51971G9r.A13(r7, r12, A003);
        }
        C287595aO.A00(r7, A013, A1K);
        AnonymousClass6G3.A04(r7, C287205Zk.A0C(r3, 76.0f), 1zC.A00(r7, DbS.A0V(challengeBadge2.A06)));
        A00(r7, C287195Zj.A0B(r3, 12.0f, 0.0f, 0.0f, 0.0f), challengeBadge2, 56, 0);
        r7.ASN();
        r7.ExS(-623933510);
        if (challengeBadge2.A0D && (num = challengeBadge2.A02) != null) {
            int intValue = num.intValue();
            Modifier A09 = C287195Zj.A09(C51966G9m.A0T(r3), 0.0f, 4.0f);
            float f2 = (float) intValue;
            Integer num2 = challengeBadge2.A04;
            if (num2 != null) {
                f = (float) num2.intValue();
            } else {
                f = 1.0f;
            }
            long A0A2 = C51966G9m.A0A(r7);
            C286575Wy r9 = r7;
            String str = challengeBadge2.A0A;
            HZ1.A00(r9, A09, str, challengeBadge2.A0B, f2 / f, 6, 4, 0, A0A2);
        }
        C286565Wx.A0L(r8, false);
        String str2 = challengeBadge2.A09;
        r7.ExS(-623916590);
        if (str2 != null) {
            AnonymousClass6CE.A04(r7, C51966G9m.A0T(r3), C51965G9l.A0m(r7), str2, new C58689Ivy(6, r4, challengeBadge2));
        }
        if (C51973G9u.A1R(r7, r8)) {
            0fL.A00(751315960);
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(r4, challengeBadge2, modifier, i, 26);
        }
    }
}
