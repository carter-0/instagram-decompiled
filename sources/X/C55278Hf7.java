package X;

import androidx.compose.ui.Modifier;
import com.instagram.user.model.User;

/* renamed from: X.Hf7  reason: case insensitive filesystem */
public abstract class C55278Hf7 {
    public static final void A00(C286575Wy r35, C284945Oz r36, C284945Oz r37, C284945Oz r38, C62320sa r39, C62320sa r40, C62320sa r41, C62320sa r42, int i) {
        int i2;
        String str;
        String str2;
        String optionalStringField;
        C284945Oz r34 = r36;
        0qQ.A0B(r34, 0);
        C284945Oz r33 = r37;
        C284945Oz r32 = r38;
        C62320sa r31 = r39;
        C62320sa r30 = r40;
        C284945Oz r4 = r33;
        C51974G9v.A1P(r4, r32, r31, r30);
        C62320sa r29 = r41;
        C62320sa r28 = r42;
        C62320sa r2 = r29;
        DbW.A1O(r2, 5, r28);
        C286575Wy r0 = r35;
        r0.ExV(1466639934);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r0, r34) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r0, r4);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r0, r32);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r0, r31);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r0, r30);
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r0, r2);
        }
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0K(r0, r28);
        }
        if ((599187 & i2) != 599186 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1157456944, "instagram.features.devoptions.graphql.consistency.ConsistencyView (GraphQLRestConsistencyFragment.kt:176)");
            }
            C285245Qk r22 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r0, 0);
            int A00 = C287425a7.A00(r0);
            C286565Wx r1 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r0, r22);
            C62320sa r6 = C287485aD.A00;
            C51973G9u.A0z(r0, r1, r6);
            0sL r5 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0Z, A04, r5);
            0sL r43 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r43, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            C287295Zu r8 = C287275Zs.A01;
            C287245Zp r7 = C287215Zl.A05;
            AnonymousClass5RD A02 = C287395a4.A02(r8, r0, r7, 0);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r1);
            Modifier A012 = C287435a8.A01(r0, r22);
            C51973G9u.A0z(r0, r1, r6);
            C287595aO.A00(r0, A02, r5);
            if (C51965G9l.A1Y(r0, r1, A042, A0w) || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r43, A002);
            }
            C287595aO.A00(r0, A012, A1K);
            User user = (User) r34.getValue();
            String str3 = "Loading...";
            if (user == null || (str = user.getFullName()) == null) {
                str = str3;
            }
            AnonymousClass5ZZ.A0z(r0, 002.A0R("REST, using API Framework. Name: ", str));
            r0.ASN();
            AnonymousClass5RD A022 = C287395a4.A02(r8, r0, r7, 0);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(r1);
            Modifier A013 = C287435a8.A01(r0, r22);
            C51973G9u.A0z(r0, r1, r6);
            C287595aO.A00(r0, A022, r5);
            if (C51965G9l.A1Y(r0, r1, A043, A0w) || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r43, A003);
            }
            C287595aO.A00(r0, A013, A1K);
            User user2 = (User) r33.getValue();
            if (user2 == null || (str2 = user2.getFullName()) == null) {
                str2 = str3;
            }
            AnonymousClass5ZZ.A0z(r0, 002.A0R("GraphQL, convert to API Framework. Name: ", str2));
            r0.ASN();
            AnonymousClass5RD A023 = C287395a4.A02(r8, r0, r7, 0);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A044 = C286565Wx.A04(r1);
            Modifier A014 = C287435a8.A01(r0, r22);
            C51973G9u.A0z(r0, r1, r6);
            C287595aO.A00(r0, A023, r5);
            if (C51965G9l.A1Y(r0, r1, A044, A0w) || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r43, A004);
            }
            C287595aO.A00(r0, A014, A1K);
            C250663lr r14 = (C250663lr) r32.getValue();
            if (!(r14 == null || (optionalStringField = r14.getOptionalStringField(0, "full_name")) == null)) {
                str3 = optionalStringField;
            }
            AnonymousClass5ZZ.A0z(r0, 002.A0R("GraphQL, using fragment models. Name: ", str3));
            r0.ASN();
            AnonymousClass5RD A024 = C287395a4.A02(r8, r0, r7, 0);
            int A005 = C287425a7.A00(r0);
            AnonymousClass5RM A045 = C286565Wx.A04(r1);
            Modifier A015 = C287435a8.A01(r0, r22);
            C51973G9u.A0z(r0, r1, r6);
            C287595aO.A00(r0, A024, r5);
            if (C51965G9l.A1Y(r0, r1, A045, A0w) || !C51972G9s.A1Q(r0, A005)) {
                C51971G9r.A13(r0, r43, A005);
            }
            C287595aO.A00(r0, A015, A1K);
            Modifier A09 = C287195Zj.A09(r22, 0.0f, 8.0f);
            AnonymousClass6CA r19 = AnonymousClass6CA.A00;
            C286575Wy r222 = r0;
            AnonymousClass6CE.A05(r222, A09, r19.A02(r0), "Mutate API Framework model", r31, ((i2 >> 9) & 14) | 1573296);
            r0.ASN();
            AnonymousClass5RD A025 = C287395a4.A02(r8, r0, r7, 0);
            int A006 = C287425a7.A00(r0);
            AnonymousClass5RM A046 = C286565Wx.A04(r1);
            Modifier A016 = C287435a8.A01(r0, r22);
            C51973G9u.A0z(r0, r1, r6);
            C287595aO.A00(r0, A025, r5);
            if (C51965G9l.A1Y(r0, r1, A046, A0w) || !C51972G9s.A1Q(r0, A006)) {
                C51971G9r.A13(r0, r43, A006);
            }
            C287595aO.A00(r0, A016, A1K);
            AnonymousClass6CE.A05(r222, C287195Zj.A09(r22, 0.0f, 8.0f), r19.A02(r0), "Publish update to Pando", r30, ((i2 >> 12) & 14) | 1573296);
            r0.ASN();
            AnonymousClass5RD A026 = C287395a4.A02(r8, r0, r7, 0);
            int A007 = C287425a7.A00(r0);
            AnonymousClass5RM A047 = C286565Wx.A04(r1);
            Modifier A017 = C287435a8.A01(r0, r22);
            C51973G9u.A0z(r0, r1, r6);
            C287595aO.A00(r0, A026, r5);
            if (C51965G9l.A1Y(r0, r1, A047, A0w) || !C51972G9s.A1Q(r0, A007)) {
                C51971G9r.A13(r0, r43, A007);
            }
            C287595aO.A00(r0, A017, A1K);
            AnonymousClass6CE.A05(r222, C287195Zj.A09(r22, 0.0f, 8.0f), r19.A02(r0), "Refetch REST", r29, ((i2 >> 15) & 14) | 1573296);
            r0.ASN();
            AnonymousClass5RD A027 = C287395a4.A02(r8, r0, r7, 0);
            int A008 = C287425a7.A00(r0);
            AnonymousClass5RM A048 = C286565Wx.A04(r1);
            Modifier A018 = C287435a8.A01(r0, r22);
            C51973G9u.A0z(r0, r1, r6);
            C287595aO.A00(r0, A027, r5);
            if (C51965G9l.A1Y(r0, r1, A048, A0w) || !C51972G9s.A1Q(r0, A008)) {
                C51971G9r.A13(r0, r43, A008);
            }
            C287595aO.A00(r0, A018, A1K);
            AnonymousClass6CE.A05(r0, C287195Zj.A09(r22, 0.0f, 8.0f), r19.A02(r0), "Refetch GraphQL", r28, ((i2 >> 18) & 14) | 1573296);
            if (C51971G9r.A1R(r0)) {
                0fL.A00(354125302);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59205JAj(i3, 5, r34, r33, r32, r31, r30, r29, r28);
        }
    }
}
