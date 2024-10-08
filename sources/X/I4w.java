package X;

import android.app.Activity;
import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.ChallengeButtonInfo;
import com.instagram.api.schemas.ChallengeDetails;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.common.session.UserSession;

public abstract class I4w {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r4.length() == 0) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r12, androidx.compose.ui.Modifier r13, com.instagram.api.schemas.ChallengeButtonInfo r14, java.lang.String r15, X.0sP r16, int r17, int r18) {
        /*
            r7 = r13
            r0 = 1223773120(0x48f14bc0, float:494174.0)
            r12.ExV(r0)
            r11 = r18
            r0 = r18 & 8
            if (r0 == 0) goto L_0x000f
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
        L_0x000f:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x001d
            r1 = 2133874943(0x7f3058ff, float:2.3440622E38)
            java.lang.String r0 = "com.instagram.creator.achievements.modules.views.ProgressDescriptionRow (ChallengeDetailsScreen.kt:145)"
            X.0fL.A01(r1, r0)
        L_0x001d:
            r2 = 0
            r6 = r14
            if (r14 == 0) goto L_0x009f
            java.lang.String r5 = r14.Air()
            java.lang.String r4 = r14.Avk()
        L_0x0029:
            r0 = -1269590788(0xffffffffb45394fc, float:-1.9705107E-7)
            r12.ExS(r0)
            if (r4 == 0) goto L_0x004d
            r0 = -1269590110(0xffffffffb45397a2, float:-1.970607E-7)
            r12.ExS(r0)
            java.lang.String r0 = "instagram://bloks/"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x004a
            android.content.Context r1 = X.C51968G9o.A0I(r12)
            com.instagram.common.session.UserSession r0 = X.C51968G9o.A0h(r12)
            X.FFC.A02(r1, r0, r4)
        L_0x004a:
            X.C51965G9l.A1V(r12)
        L_0x004d:
            X.C51968G9o.A1N(r12)
            r3 = 0
            if (r5 == 0) goto L_0x0064
            if (r4 == 0) goto L_0x005c
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x005d
        L_0x005c:
            r0 = 1
        L_0x005d:
            r0 = r0 ^ 1
            X.Gc0 r2 = new X.Gc0
            r2.<init>(r5, r0)
        L_0x0064:
            if (r4 == 0) goto L_0x006c
            int r0 = r4.length()
            if (r0 != 0) goto L_0x006d
        L_0x006c:
            r3 = 1
        L_0x006d:
            r4 = r3 ^ 1
            r3 = 0
            r1 = 7
            X.Ivy r0 = new X.Ivy
            r8 = r16
            r0.<init>(r1, r8, r14)
            androidx.compose.ui.Modifier r1 = X.C287635aW.A05(r7, r3, r3, r0, r4)
            r10 = r17
            r0 = r17 & 14
            r9 = r15
            X.C52636GaA.A0F(r12, r1, r2, r15, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0090
            r0 = -689288491(0xffffffffd6ea4ad5, float:-1.28803561E14)
            X.0fL.A00(r0)
        L_0x0090:
            X.5Xd r0 = r12.ASQ()
            if (r0 == 0) goto L_0x009e
            r12 = 3
            X.J9N r5 = new X.J9N
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.A06 = r5
        L_0x009e:
            return
        L_0x009f:
            r5 = r2
            r4 = r2
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4w.A00(X.5Wy, androidx.compose.ui.Modifier, com.instagram.api.schemas.ChallengeButtonInfo, java.lang.String, X.0sP, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b0, code lost:
        if (r9.length() <= 0) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e9, code lost:
        if (r10.length() <= 0) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r13, androidx.compose.ui.Modifier r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, int r19) {
        /*
            r7 = r14
            r0 = 232958341(0xde2a985, float:1.3969136E-30)
            r2 = r13
            r13.ExV(r0)
            r12 = r19
            r0 = r19 & 1
            r8 = r15
            r11 = r18
            if (r0 == 0) goto L_0x013c
            r0 = r18 | 6
        L_0x0013:
            r1 = r19 & 2
            r9 = r16
            if (r1 == 0) goto L_0x0131
            r0 = r0 | 48
        L_0x001b:
            r1 = r19 & 4
            r10 = r17
            if (r1 == 0) goto L_0x0126
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0023:
            r4 = r19 & 8
            if (r4 == 0) goto L_0x011b
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0029:
            r3 = r0 & 5851(0x16db, float:8.199E-42)
            r1 = 1170(0x492, float:1.64E-42)
            if (r3 != r1) goto L_0x0046
            boolean r1 = r13.Bwn()
            if (r1 == 0) goto L_0x0046
            r13.Evl()
        L_0x0038:
            X.5Xd r0 = r2.ASQ()
            if (r0 == 0) goto L_0x0045
            X.J8C r6 = new X.J8C
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.A06 = r6
        L_0x0045:
            return
        L_0x0046:
            if (r4 == 0) goto L_0x004a
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
        L_0x004a:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0058
            r3 = -766873205(0xffffffffd24a718b, float:-2.17372082E11)
            java.lang.String r1 = "com.instagram.creator.achievements.modules.views.TextBox (ChallengeDetailsScreen.kt:104)"
            X.0fL.A01(r3, r1)
        L_0x0058:
            X.5Zr r1 = X.C287215Zl.A00
            int r0 = r0 >> 9
            X.5RD r4 = X.C51975G9x.A0M(r13, r1, r0)
            r1 = 0
            int r6 = X.C287425a7.A00(r13)
            r0 = r2
            X.5Wx r0 = (X.C286565Wx) r0
            X.5RM r3 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r13, r7)
            X.C51973G9u.A0y(r13, r0)
            X.C51971G9r.A12(r13, r4, r3)
            X.0sL r4 = X.C287485aD.A02
            boolean r3 = r0.A0K
            if (r3 != 0) goto L_0x0082
            boolean r3 = X.C51972G9s.A1Q(r13, r6)
            if (r3 != 0) goto L_0x0085
        L_0x0082:
            X.C51971G9r.A13(r13, r4, r6)
        L_0x0085:
            X.C51965G9l.A18(r13, r5)
            int r3 = r15.length()
            if (r3 <= 0) goto L_0x0118
            r3 = r15
        L_0x008f:
            r4 = -961755539(0xffffffffc6acc66d, float:-22115.213)
            r13.ExS(r4)
            if (r3 == 0) goto L_0x00a6
            X.5Z4 r6 = X.C51966G9m.A0e(r13)
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            r4 = 1090519040(0x41000000, float:8.0)
            androidx.compose.ui.Modifier r4 = X.C51967G9n.A0F(r5, r4)
            X.AnonymousClass5ZZ.A05(r13, r4, r6, r3)
        L_0x00a6:
            X.C286565Wx.A0L(r0, r1)
            if (r16 == 0) goto L_0x00b2
            int r4 = r9.length()
            r3 = r9
            if (r4 > 0) goto L_0x00b3
        L_0x00b2:
            r3 = 0
        L_0x00b3:
            r4 = -961747534(0xffffffffc6ace5b2, float:-22130.848)
            r13.ExS(r4)
            if (r3 == 0) goto L_0x00df
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            r4 = 0
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A0A(r5, r4, r4, r4)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A04(r4)
            X.5Z4 r13 = X.C51966G9m.A0b(r13)
            r5 = 12
            long r18 = X.AnonymousClass5Z7.A01(r5)
            long r16 = X.C51966G9m.A0M(r2)
            r14 = 3
            r15 = 16744444(0xff7ffc, float:2.3463964E-38)
            X.5Z4 r5 = X.AnonymousClass5Z4.A01((X.AnonymousClass5Z2) null, r13, (X.C268454dQ) null, (X.C291715hl) null, (X.AnonymousClass5ZD) null, r14, 0, r15, r16, r18, 0)
            X.AnonymousClass5ZZ.A05(r2, r4, r5, r3)
        L_0x00df:
            X.C286565Wx.A0L(r0, r1)
            if (r10 == 0) goto L_0x00eb
            int r3 = r10.length()
            r5 = r10
            if (r3 > 0) goto L_0x00ec
        L_0x00eb:
            r5 = 0
        L_0x00ec:
            r3 = -961732481(0xffffffffc6ad207f, float:-22160.248)
            r2.ExS(r3)
            if (r5 == 0) goto L_0x010a
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            r3 = 0
            androidx.compose.ui.Modifier r3 = X.C287195Zj.A0A(r4, r3, r3, r3)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A04(r3)
            X.5Z4 r3 = X.C51966G9m.A0c(r2)
            X.5Z4 r3 = X.AnonymousClass5Z4.A01((X.AnonymousClass5Z2) null, r3, (X.C268454dQ) null, (X.C291715hl) null, (X.AnonymousClass5ZD) null, 3, 0, 16744447, 0, 0, 0)
            X.AnonymousClass5ZZ.A05(r2, r4, r3, r5)
        L_0x010a:
            boolean r0 = X.C51971G9r.A1S(r2, r0, r1)
            if (r0 == 0) goto L_0x0038
            r0 = 1334851667(0x4f903853, float:4.8392207E9)
            X.0fL.A00(r0)
            goto L_0x0038
        L_0x0118:
            r3 = 0
            goto L_0x008f
        L_0x011b:
            r1 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0029
            int r1 = X.G9t.A0R(r13, r14)
            r0 = r0 | r1
            goto L_0x0029
        L_0x0126:
            r1 = r11 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0023
            int r1 = X.G9t.A0Q(r13, r10)
            r0 = r0 | r1
            goto L_0x0023
        L_0x0131:
            r1 = r18 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x001b
            int r1 = X.G9t.A0P(r13, r9)
            r0 = r0 | r1
            goto L_0x001b
        L_0x013c:
            r0 = r18 & 14
            if (r0 != 0) goto L_0x0148
            int r0 = X.G9t.A0O(r13, r15)
            r0 = r0 | r18
            goto L_0x0013
        L_0x0148:
            r0 = r11
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4w.A01(X.5Wy, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }

    public static final void A03(C286575Wy r39, ChallengeDetails challengeDetails, String str, 0sP r42, 0sJ r43, 0sJ r44, int i) {
        ChallengeButtonInfo challengeButtonInfo;
        ChallengeDetails challengeDetails2 = challengeDetails;
        0qQ.A0B(challengeDetails2, 0);
        0sP r38 = r42;
        0sJ r37 = r43;
        0sJ r36 = r44;
        AnonymousClass7TG.A0w(2, r37, r36, r38);
        C286575Wy r2 = r39;
        if (C51967G9n.A1T(r2, 1318723811)) {
            0fL.A01(-1808047436, "com.instagram.creator.achievements.modules.views.ChallengeDetailsScreen (ChallengeDetailsScreen.kt:43)");
        }
        C285245Qk r8 = Modifier.A00;
        Modifier A0T = C51966G9m.A0T(r8);
        C287325Zx r15 = C287275Zs.A07;
        AnonymousClass5RD A02 = C291495hO.A02(r15, r2, C287215Zl.A02, 0);
        int A00 = C287425a7.A00(r2);
        C286565Wx r0 = (C286565Wx) r2;
        AnonymousClass5RM A04 = C286565Wx.A04(r0);
        Modifier A01 = C287435a8.A01(r2, A0T);
        C62320sa r14 = C287485aD.A00;
        C51973G9u.A0z(r2, r0, r14);
        0sL r13 = C287485aD.A03;
        0sL A0w = C51969G9p.A0w(r2, A02, A04, r13);
        0sL r11 = C287485aD.A02;
        if (r0.A0K || !C51972G9s.A1Q(r2, A00)) {
            C51971G9r.A13(r2, r11, A00);
        }
        0sL A1K = C51966G9m.A1K(r2, A01);
        Modifier A09 = C287195Zj.A09(A0T, 0.0f, 16.0f);
        AnonymousClass5RD A022 = C291495hO.A02(r15, r2, C287215Zl.A00, 48);
        int A002 = C287425a7.A00(r2);
        AnonymousClass5RM A042 = C286565Wx.A04(r0);
        Modifier A012 = C287435a8.A01(r2, A09);
        C51973G9u.A0z(r2, r0, r14);
        C287595aO.A00(r2, A022, r13);
        if (C51965G9l.A1Y(r2, r0, A042, A0w) || !C51972G9s.A1Q(r2, A002)) {
            C51971G9r.A13(r2, r11, A002);
        }
        C287595aO.A00(r2, A012, A1K);
        AnonymousClass6G3.A06(r2, C287195Zj.A0A(C287205Zk.A0C(r8, 144.0f), 0.0f, 0.0f, 0.0f), 1zC.A00(r2, DbS.A0V(challengeDetails2.A09)), 440);
        A01(r2, A0T, challengeDetails2.A0E, challengeDetails2.A0D, challengeDetails2.A08, 3072, 0);
        r2.ExS(-1393445096);
        ChallengeState challengeState = challengeDetails2.A06;
        ChallengeState challengeState2 = ChallengeState.STARTED;
        if (challengeState == challengeState2) {
            HZ1.A00(r2, C287195Zj.A08(A0T, 4.0f), challengeDetails2.A0A, challengeDetails2.A0B, ((float) challengeDetails2.A00) / ((float) challengeDetails2.A01), 0, 12, 0, 0);
        }
        C286565Wx.A0L(r0, false);
        String str2 = challengeDetails2.A0C;
        if (str2 == null || str2.length() <= 0) {
            str2 = null;
        }
        r2.ExS(-1393429502);
        int i2 = i;
        if (str2 != null) {
            A00(r2, A0T, challengeDetails2.A03, str2, r38, ((i >> 6) & 896) | 3136, 0);
        }
        C286565Wx.A0L(r0, false);
        r2.ExS(-1393419760);
        String str3 = str;
        if (str != null) {
            C54934HYq.A00(r2, C287195Zj.A06(C287195Zj.A04(A0T)), str3, (String) null, (0sP) null, 48, 12);
        }
        C286565Wx.A0L(r0, false);
        r2.ASN();
        r2.ExS(320111949);
        if ((challengeState != challengeState2 || !challengeDetails2.A0F) && (challengeButtonInfo = challengeDetails2.A02) != null) {
            String str4 = challengeDetails2.A07;
            0qQ.A0B(str4, 0);
            long A07 = DbZ.A07(str4);
            A02(r2, challengeButtonInfo, challengeDetails2.A04, challengeDetails2.A05, challengeState, r37, r36, 266240 | (57344 & (i << 6)) | (3670016 & (i << 9)), A07);
        }
        if (C51971G9r.A1S(r2, r0, false)) {
            0fL.A00(1961893387);
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9P(r37, r38, r36, challengeDetails2, str3, i2, 2);
        }
    }

    public static final void A02(C286575Wy r17, ChallengeButtonInfo challengeButtonInfo, ChallengeButtonInfo challengeButtonInfo2, ChallengeName challengeName, ChallengeState challengeState, 0sJ r22, 0sJ r23, int i, long j) {
        String str;
        String Avk;
        C286575Wy r3 = r17;
        if (C51967G9n.A1T(r3, 992778645)) {
            0fL.A01(-141727264, "com.instagram.creator.achievements.modules.views.BottomButtons (ChallengeDetailsScreen.kt:174)");
        }
        Activity A00 = C61270mF.A00(C51968G9o.A0I(r3));
        UserSession A0h = C51968G9o.A0h(r3);
        ChallengeButtonInfo challengeButtonInfo3 = challengeButtonInfo;
        if (challengeButtonInfo3.Avk().startsWith("instagram://bloks/")) {
            FFC.A02(A00, A0h, challengeButtonInfo3.Avk());
        }
        ChallengeButtonInfo challengeButtonInfo4 = challengeButtonInfo2;
        if (!(challengeButtonInfo2 == null || (Avk = challengeButtonInfo4.Avk()) == null || !Avk.startsWith("instagram://bloks/"))) {
            FFC.A02(A00, A0h, Avk);
        }
        String Air = challengeButtonInfo3.Air();
        ChallengeName challengeName2 = challengeName;
        ChallengeState challengeState2 = challengeState;
        0sJ r10 = r22;
        long j2 = j;
        C20616Wvx wvx = new C20616Wvx(1, j2, r10, challengeName, challengeButtonInfo3, challengeState2);
        if (challengeButtonInfo4 != null) {
            str = challengeButtonInfo4.Air();
        } else {
            str = null;
        }
        0sJ r11 = r23;
        I7L.A07(r3, Air, str, wvx, new C20616Wvx(2, j2, r11, challengeName2, challengeButtonInfo4, challengeState2));
        if (0fL.A02()) {
            0fL.A00(-1437946205);
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59179J9j(challengeButtonInfo3, challengeButtonInfo4, challengeName2, challengeState2, r10, r11, i, j2);
        }
    }
}
