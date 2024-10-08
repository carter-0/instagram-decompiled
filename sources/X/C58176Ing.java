package X;

/* renamed from: X.Ing  reason: case insensitive filesystem */
public final class C58176Ing extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58176Ing(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0701, code lost:
        if (r21 != false) goto L_0x0703;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x070b, code lost:
        if (r18 != false) goto L_0x070d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x071c, code lost:
        if (r20 == null) goto L_0x071e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x072c, code lost:
        if (r0.length() <= 0) goto L_0x072e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x07c7, code lost:
        if (r1.BCW() != null) goto L_0x07c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0a3c, code lost:
        if (r18 != false) goto L_0x0791;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x0c37, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0c43, code lost:
        if (((X.1Xj) r3.A01).A0C.Ah4() == null) goto L_0x0c45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0c45, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x0d77, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x07fc  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0831  */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x084d  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x087f  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0891  */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x0a02  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:706:0x0d9b  */
    /* JADX WARNING: Removed duplicated region for block: B:714:0x0860 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r23 = this;
            r3 = r23
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0ac4;
                case 1: goto L_0x0ac7;
                case 2: goto L_0x0007;
                case 3: goto L_0x0ace;
                case 4: goto L_0x0ade;
                case 5: goto L_0x0afa;
                case 6: goto L_0x0b09;
                case 7: goto L_0x0b1d;
                case 8: goto L_0x0b1d;
                case 9: goto L_0x0b25;
                case 10: goto L_0x0ac4;
                case 11: goto L_0x0ac7;
                case 12: goto L_0x0007;
                case 13: goto L_0x0b34;
                case 14: goto L_0x0b4e;
                case 15: goto L_0x0b5b;
                case 16: goto L_0x0b1d;
                case 17: goto L_0x0b68;
                case 18: goto L_0x0b79;
                case 19: goto L_0x0ac4;
                case 20: goto L_0x0ac7;
                case 21: goto L_0x0007;
                case 22: goto L_0x0baa;
                case 23: goto L_0x0bf2;
                case 24: goto L_0x0bf9;
                case 25: goto L_0x000e;
                case 26: goto L_0x0c0b;
                case 27: goto L_0x0c21;
                case 28: goto L_0x0bf2;
                case 29: goto L_0x0c47;
                case 30: goto L_0x0c56;
                case 31: goto L_0x0b1d;
                case 32: goto L_0x0c7a;
                case 33: goto L_0x0025;
                case 34: goto L_0x0c89;
                case 35: goto L_0x0ce1;
                case 36: goto L_0x0ac4;
                case 37: goto L_0x0ac7;
                case 38: goto L_0x0007;
                case 39: goto L_0x0cee;
                case 40: goto L_0x0d01;
                case 41: goto L_0x0d17;
                case 42: goto L_0x0036;
                case 43: goto L_0x0d21;
                case 44: goto L_0x0d2b;
                case 45: goto L_0x0c38;
                case 46: goto L_0x0d3a;
                case 47: goto L_0x0d45;
                case 48: goto L_0x0d4e;
                case 49: goto L_0x0d5f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A01
            X.07f r2 = X.DbY.A0I(r0)
        L_0x000d:
            return r2
        L_0x000e:
            java.lang.Object r0 = r3.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0022
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r2 = r1.getString(r0)
            if (r2 != 0) goto L_0x000d
        L_0x0022:
            java.lang.String r2 = "UNKNOWN"
            return r2
        L_0x0025:
            java.lang.Object r0 = r3.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "origin"
            java.lang.String r2 = r1.getString(r0)
            if (r2 != 0) goto L_0x000d
            java.lang.String r2 = ""
            return r2
        L_0x0036:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Object r5 = r3.A01
            X.I7R r5 = (X.I7R) r5
            X.1Xj r4 = r5.A06
            boolean r0 = r4.A54()
            if (r0 == 0) goto L_0x00a7
            android.content.Context r6 = r5.A02
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131963394(0x7f132e02, float:1.956354E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r1, r0)
            X.HNR r3 = X.HNR.A0p
            X.0Pl r0 = r5.A0A
            java.lang.CharSequence r1 = r0.A0H(r6, r1)
            com.instagram.api.schemas.MediaOptionStyle r0 = com.instagram.api.schemas.MediaOptionStyle.A05
            X.I7R.A00(r0, r5, r3, r1, r2)
        L_0x0060:
            boolean r0 = r4.A5m()
            if (r0 != 0) goto L_0x008f
            boolean r0 = X.I7R.A0A(r5)
            if (r0 == 0) goto L_0x008f
            boolean r0 = r4.A4M()
            if (r0 == 0) goto L_0x008f
            com.instagram.common.session.UserSession r1 = r5.A04
            X.2f5 r0 = X.C225892f5.A00(r1)
            boolean r0 = r0.A0O(r4)
            if (r0 == 0) goto L_0x009e
            boolean r0 = X.I56.A03(r1)
            r1 = 2131975988(0x7f135f34, float:1.9589084E38)
            if (r0 == 0) goto L_0x008a
            r1 = 2131972593(0x7f1351f1, float:1.9582198E38)
        L_0x008a:
            X.HNR r0 = X.HNR.A2R
            X.I7R.A01(r5, r0, r2, r1)
        L_0x008f:
            boolean r0 = X.C56301HwE.A01(r4)
            if (r0 == 0) goto L_0x000d
            X.HNR r1 = X.HNR.A0f
            r0 = 2131961868(0x7f13280c, float:1.9560445E38)
            X.I7R.A01(r5, r1, r2, r0)
            return r2
        L_0x009e:
            X.HNR r1 = X.HNR.A1e
            r0 = 2131972502(0x7f135196, float:1.9582013E38)
            X.I7R.A01(r5, r1, r2, r0)
            goto L_0x008f
        L_0x00a7:
            boolean r0 = r4.A5m()
            if (r0 == 0) goto L_0x00b2
            r0 = 1
            X.I7R.A09(r5, r2, r0)
            goto L_0x0060
        L_0x00b2:
            com.instagram.common.session.UserSession r3 = r5.A04
            boolean r0 = X.2R8.A02(r3, r4)
            if (r0 == 0) goto L_0x0606
            X.LTW r0 = X.LTW.A00
            boolean r0 = r0.A0B(r3, r4)
            if (r0 == 0) goto L_0x00de
            boolean r0 = r5.A0H
            boolean r0 = X.LTW.A08(r3, r0)
            if (r0 != 0) goto L_0x00de
            X.HNR r6 = X.HNR.A0c
            android.content.Context r0 = r5.A02
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131955380(0x7f130eb4, float:1.9547286E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r1, r0)
            com.instagram.api.schemas.MediaOptionStyle r0 = com.instagram.api.schemas.MediaOptionStyle.A06
            X.I7R.A00(r0, r5, r6, r1, r2)
        L_0x00de:
            boolean r0 = X.C254413sR.A01(r3, r4)
            if (r0 == 0) goto L_0x00f4
            X.HNR r7 = X.HNR.A1Q
            com.instagram.api.schemas.MediaOptionStyle r6 = com.instagram.api.schemas.MediaOptionStyle.A05
            r1 = 2131972024(0x7f134fb8, float:1.9581044E38)
            android.content.Context r0 = r5.A02
            java.lang.String r0 = X.AnonymousClass7TE.A16(r0, r1)
            X.I7R.A00(r6, r5, r7, r0, r2)
        L_0x00f4:
            X.I7R.A07(r5, r2)
            X.1sw r1 = r4.A1u()
            X.1sw r0 = X.1sw.A04
            r7 = 1
            boolean r6 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.Integer r0 = r4.A2K()
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            if (r0 == r8) goto L_0x010b
            r7 = 0
        L_0x010b:
            com.instagram.user.model.User r0 = r4.A2A(r3)
            if (r0 == 0) goto L_0x0d82
            java.lang.Integer r0 = r0.A0N()
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            if (r0 != r10) goto L_0x0131
            X.4Cl r0 = X.DbV.A0k(r3)
            java.lang.Boolean r0 = r0.AkB()
            if (r0 == 0) goto L_0x0131
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0131
            X.HNR r1 = X.HNR.A0l
            r0 = 2131973005(0x7f13538d, float:1.9583034E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0131:
            if (r7 == 0) goto L_0x0156
            X.HNR r1 = X.HNR.A0Z
            r0 = 2131957579(0x7f13174b, float:1.9551746E38)
            X.I7R.A01(r5, r1, r2, r0)
            X.HNR r1 = X.HNR.A1H
            r0 = 2131971433(0x7f134d69, float:1.9579845E38)
        L_0x0140:
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0143:
            boolean r0 = r4.A6B()
            if (r0 == 0) goto L_0x0151
            X.HNR r1 = X.HNR.A0S
            r0 = 2131975067(0x7f135b9b, float:1.9587216E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0151:
            X.I7R.A06(r5, r2)
            goto L_0x0060
        L_0x0156:
            if (r6 == 0) goto L_0x0180
            X.HNR r1 = X.HNR.A0A
            r0 = 2131965924(0x7f1337e4, float:1.9568672E38)
            X.I7R.A01(r5, r1, r2, r0)
            X.HNR r1 = X.HNR.A0W
            r0 = 2131957568(0x7f131740, float:1.9551724E38)
            X.I7R.A01(r5, r1, r2, r0)
            boolean r0 = X.AnonymousClass430.A00(r3)
            if (r0 == 0) goto L_0x017c
            boolean r0 = r4.A5h()
            if (r0 != 0) goto L_0x017c
            X.HNR r1 = X.HNR.A19
            r0 = 2131969192(0x7f1344a8, float:1.95753E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x017c:
            X.I7R.A08(r5, r2)
            goto L_0x0143
        L_0x0180:
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x01a7
            com.instagram.user.model.User r0 = X.DbT.A0j(r3)
            boolean r0 = r0.A2L()
            if (r0 == 0) goto L_0x01a7
            boolean r0 = r4.A5M()
            if (r0 != 0) goto L_0x01a7
            X.HNR r6 = X.HNR.A0F
            android.content.Context r0 = r5.A02
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r0)
            java.lang.String r1 = X.C305796Jo.A01(r0, r4)
            com.instagram.api.schemas.MediaOptionStyle r0 = com.instagram.api.schemas.MediaOptionStyle.A04
            X.I7R.A00(r0, r5, r6, r1, r2)
        L_0x01a7:
            boolean r0 = X.C246353eS.A09(r3, r4)
            r6 = 1
            r7 = 1
            r11 = 2
            if (r0 == 0) goto L_0x020a
            X.0Tu r9 = X.0Tu.A05
            r0 = 36318234865113104(0x81073e00011810, double:3.03113619826659E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 == 0) goto L_0x020a
            r0 = 36318234865375251(0x81073e00051813, double:3.031136198432373E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 == 0) goto L_0x020a
            java.lang.Integer r9 = X.C246353eS.A02(r3)
            if (r9 == 0) goto L_0x0d7d
            X.Dfd r13 = X.C246353eS.A01(r4)
            X.HPj r17 = X.C59724JVi.A00(r4)
            boolean r1 = X.C246353eS.A0A(r3, r9)
            int r0 = r13.ordinal()
            if (r0 == r6) goto L_0x05f0
            if (r0 == r11) goto L_0x05e9
            r12 = 0
            if (r0 != r12) goto L_0x0d78
            if (r9 != r10) goto L_0x05da
            X.8jd r11 = X.C363388je.A00(r3)
            java.lang.String r0 = "MediaOptionsOverflowMenuCreator"
            com.facebook.common.callercontext.CallerContext r10 = com.facebook.common.callercontext.CallerContext.A01(r0)
            java.lang.String r1 = "reels_in_feed_overflow_menu"
            r0 = 0
            r11.A02(r10, r0, r1, r12)
            X.HNR r1 = X.HNR.A1p
        L_0x01f9:
            r0 = 2131971821(0x7f134eed, float:1.9580632E38)
        L_0x01fc:
            X.I7R.A01(r5, r1, r2, r0)
            X.4DU r0 = r5.A07
            r14 = r0
            r15 = r3
            r16 = r4
            r18 = r9
            X.C246353eS.A07(r13, r14, r15, r16, r17, r18)
        L_0x020a:
            boolean r0 = r4.A5Y()
            if (r0 != 0) goto L_0x028f
            boolean r0 = r4.A5G()
            if (r0 != 0) goto L_0x028f
            boolean r0 = r4.A5M()
            if (r0 != 0) goto L_0x028f
            X.3QO r1 = r4.A1t()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r1 == r0) goto L_0x028f
            X.3QO r1 = r4.A1t()
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r1 == r0) goto L_0x028f
            X.1Xy r0 = r4.A0C
            X.DUr r0 = r0.BeN()
            if (r0 != 0) goto L_0x028f
            X.EZv r0 = X.C48153EZv.A05
            com.google.common.collect.ImmutableList r0 = X.C63418Kwe.A00(r3)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x028f
            com.instagram.model.sharelater.ShareLaterMedia r9 = new com.instagram.model.sharelater.ShareLaterMedia
            r9.<init>(r4)
            X.8jd r1 = X.C363388je.A00(r3)
            java.lang.String r0 = "MediaOptionsOverflowMenuCreator"
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A01(r0)
            X.5wF r0 = r1.A00(r0)
            boolean r0 = X.C363388je.A02(r0)
            boolean r0 = X.AnonymousClass3YO.A01(r3, r9, r0)
            if (r0 != 0) goto L_0x026a
            X.0Tu r9 = X.0Tu.A05
            r0 = 36322873429731976(0x810b7600002a88, double:3.0340696452095654E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 != 0) goto L_0x028f
        L_0x026a:
            r0 = 0
            boolean r0 = X.AnonymousClass3YO.A02(r4, r0)
            if (r0 != 0) goto L_0x05d3
            X.0Tu r9 = X.0Tu.A05
            r0 = 36329723902640418(0x8111b100014122, double:3.0384019118615044E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 == 0) goto L_0x0287
            X.5w9 r9 = X.AnonymousClass5w8.A05
            android.content.Context r1 = r5.A02
            java.lang.String r0 = "feed_share_later"
            r9.A03(r3, r1, r0)
        L_0x0287:
            X.HNR r1 = X.HNR.A1m
            r0 = 2131973560(0x7f1355b8, float:1.958416E38)
        L_0x028c:
            X.I7R.A01(r5, r1, r2, r0)
        L_0x028f:
            boolean r0 = X.C14290TtO.A00(r3)
            if (r0 == 0) goto L_0x0298
            X.I7R.A04(r5, r2)
        L_0x0298:
            boolean r0 = X.C54977HaA.A00(r4)
            if (r0 == 0) goto L_0x02a6
            X.HNR r1 = X.HNR.A0E
            r0 = 2131965929(0x7f1337e9, float:1.9568682E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x02a6:
            X.I7R.A08(r5, r2)
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x05d0
            X.0Tu r9 = X.0Tu.A05
            r0 = 36315640704929216(0x8104e200020dc0, double:3.029495640920455E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 == 0) goto L_0x05d0
        L_0x02bc:
            boolean r0 = r4.A5Y()
            if (r0 != 0) goto L_0x02e1
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x02ca
            if (r6 == 0) goto L_0x02e1
        L_0x02ca:
            boolean r6 = r4.A5c()
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x05b2
            r1 = 2131963377(0x7f132df1, float:1.9563506E38)
            if (r6 == 0) goto L_0x05cc
            r1 = 2131975882(0x7f135eca, float:1.9588869E38)
        L_0x02dc:
            X.HNR r0 = X.HNR.A2K
        L_0x02de:
            X.I7R.A01(r5, r0, r2, r1)
        L_0x02e1:
            X.2ib r0 = X.AnonymousClass3YZ.A00(r3)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x02f9
            boolean r0 = r4.A61()
            if (r0 == 0) goto L_0x05ab
            r1 = 2131975886(0x7f135ece, float:1.9588877E38)
            X.HNR r0 = X.HNR.A2L
        L_0x02f6:
            X.I7R.A01(r5, r0, r2, r1)
        L_0x02f9:
            boolean r0 = r4.A5Y()
            if (r0 != 0) goto L_0x030d
            boolean r0 = r4.A4c()
            if (r0 == 0) goto L_0x05a4
            X.HNR r1 = X.HNR.A28
            r0 = 2131975592(0x7f135da8, float:1.958828E38)
        L_0x030a:
            X.I7R.A01(r5, r1, r2, r0)
        L_0x030d:
            X.0eE r9 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r9.A01(r3)
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = X.C51973G9u.A0k(r4)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0339
            X.1Xy r0 = r4.A0C
            com.instagram.api.schemas.OpenCarouselSubmissionState r1 = r0.BYK()
            if (r1 == 0) goto L_0x0584
            com.instagram.api.schemas.OpenCarouselSubmissionState r0 = com.instagram.api.schemas.OpenCarouselSubmissionState.A07
            if (r1 == r0) goto L_0x0331
            com.instagram.api.schemas.OpenCarouselSubmissionState r0 = com.instagram.api.schemas.OpenCarouselSubmissionState.A09
            if (r1 != r0) goto L_0x0584
        L_0x0331:
            X.HNR r1 = X.HNR.A21
            r0 = 2131975564(0x7f135d8c, float:1.9588224E38)
        L_0x0336:
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0339:
            boolean r0 = X.C250563lf.A0p(r3, r4)
            if (r0 == 0) goto L_0x0353
            X.1Xy r0 = r4.A0C
            java.lang.Boolean r0 = r0.Cd9()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r7)
            if (r0 == 0) goto L_0x057d
            X.HNR r1 = X.HNR.A25
            r0 = 2131975571(0x7f135d93, float:1.9588238E38)
        L_0x0350:
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0353:
            boolean r0 = r4.A5D()
            if (r0 == 0) goto L_0x0361
            X.HNR r1 = X.HNR.A0R
            r0 = 2131956890(0x7f13149a, float:1.9550348E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0361:
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x0567
            X.HNR r1 = X.HNR.A0e
        L_0x0369:
            r0 = 2131961425(0x7f132651, float:1.9559547E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x036f:
            boolean r0 = X.AnonymousClass3YR.A06(r3, r4, r8, r7)
            if (r0 == 0) goto L_0x0394
            X.HNR r1 = X.HNR.A2V
            r0 = 2131976633(0x7f1361b9, float:1.9590392E38)
            X.I7R.A01(r5, r1, r2, r0)
            com.instagram.user.model.User r1 = r9.A01(r3)
            com.instagram.user.model.User r0 = r4.A2A(r3)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0394
            X.0wc r1 = X.AnonymousClass0kN.A02(r3)
            java.lang.String r0 = "instagram_feed_self_view_overflow_menu_insights_option_impression"
            X.C51974G9v.A1F(r1, r0)
        L_0x0394:
            boolean r0 = X.AnonymousClass430.A00(r3)
            if (r0 == 0) goto L_0x03a8
            boolean r0 = r4.A5h()
            if (r0 != 0) goto L_0x03a8
            X.HNR r1 = X.HNR.A19
            r0 = 2131969192(0x7f1344a8, float:1.95753E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x03a8:
            boolean r0 = r5.A0H
            if (r0 != 0) goto L_0x03b2
            X.I7R.A05(r5, r2)
            X.I7R.A03(r5, r2)
        L_0x03b2:
            X.1Xy r0 = r4.A0C
            java.lang.Boolean r0 = r0.BC2()
            if (r0 == 0) goto L_0x03c8
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03c8
            X.HNR r1 = X.HNR.A2Y
            r0 = 2131976676(0x7f1361e4, float:1.959048E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x03c8:
            X.1Xy r0 = r4.A0C
            X.1s9 r1 = r0.BP1()
            boolean r0 = X.C52345GOp.A0D(r4)
            if (r0 == 0) goto L_0x03ea
            if (r1 == 0) goto L_0x03ea
            boolean r0 = r1.getCanToggleMashupsAllowed()
            if (r0 == 0) goto L_0x03ea
            boolean r0 = r1.getMashupsAllowed()
            if (r0 == 0) goto L_0x0560
            X.HNR r1 = X.HNR.A23
            r0 = 2131972387(0x7f135123, float:1.958178E38)
        L_0x03e7:
            X.I7R.A01(r5, r1, r2, r0)
        L_0x03ea:
            boolean r0 = r4.A5s()
            if (r0 == 0) goto L_0x0504
            X.HNR r1 = X.HNR.A1J
            r0 = 2131972084(0x7f134ff4, float:1.9581166E38)
        L_0x03f5:
            X.I7R.A01(r5, r1, r2, r0)
        L_0x03f8:
            boolean r0 = r5.A0G
            if (r0 == 0) goto L_0x0418
            boolean r0 = r4.A5s()
            if (r0 != 0) goto L_0x0418
            boolean r0 = X.2R8.A02(r3, r4)
            if (r0 == 0) goto L_0x0418
            java.lang.String r0 = r3.A06
            boolean r0 = r4.A6h(r0)
            if (r0 == 0) goto L_0x04fd
            X.HNR r1 = X.HNR.A2P
            r0 = 2131965932(0x7f1337ec, float:1.9568688E38)
        L_0x0415:
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0418:
            boolean r0 = X.GLX.A02(r3, r4)
            if (r0 == 0) goto L_0x042e
            java.lang.String r0 = r3.A06
            boolean r0 = r4.A6g(r0)
            if (r0 == 0) goto L_0x04f6
            X.HNR r1 = X.HNR.A2Q
            r0 = 2131965933(0x7f1337ed, float:1.956869E38)
        L_0x042b:
            X.I7R.A01(r5, r1, r2, r0)
        L_0x042e:
            boolean r0 = r4.A5s()
            if (r0 != 0) goto L_0x0488
            boolean r0 = r4.CcK()
            if (r0 != 0) goto L_0x0488
            boolean r0 = r4.A4Z()
            if (r0 != 0) goto L_0x0488
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x0488
            X.0Tu r6 = X.0Tu.A05
            r0 = 36325360216126373(0x810db9000533a5, double:3.035642298938867E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0480
            androidx.fragment.app.Fragment r0 = r5.A03
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            java.lang.String r7 = r4.A2n()
            if (r7 == 0) goto L_0x0480
            X.0iw r6 = X.AnonymousClass6WL.A01(r0)
            if (r6 == 0) goto L_0x0480
            X.0wc r1 = X.AnonymousClass0kN.A01(r6, r3)
            java.lang.String r0 = "instagram_feed_self_view_overflow_menu_move_to_drafts_option_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0480
            X.DbW.A15(r1, r6)
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r7)
            X.C51965G9l.A1E(r1, r0)
            X.DbX.A1L(r1)
        L_0x0480:
            X.HNR r1 = X.HNR.A14
            r0 = 2131966746(0x7f133b1a, float:1.9570339E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0488:
            boolean r0 = r4.A5s()
            if (r0 != 0) goto L_0x04a2
            boolean r0 = r4.CcK()
            if (r0 != 0) goto L_0x04a2
            boolean r0 = X.2R8.A02(r3, r4)
            if (r0 == 0) goto L_0x04a2
            X.HNR r1 = X.HNR.A0W
            r0 = 2131957568(0x7f131740, float:1.9551724E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x04a2:
            X.1Xy r0 = r4.A0C
            X.1bS r1 = r0.B8b()
            if (r1 == 0) goto L_0x04c6
            java.lang.String r0 = r1.getFundraiserId()
            if (r0 == 0) goto L_0x04c6
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r1 = r1.B8e()
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r0 = com.instagram.model.fundraiser.FundraiserCampaignTypeEnum.IG_STANDALONE_FOR_CHARITY
            if (r1 != r0) goto L_0x04c6
            boolean r0 = r4.A4O()
            if (r0 == 0) goto L_0x04c6
            X.HNR r1 = X.HNR.A1R
            r0 = 2131972050(0x7f134fd2, float:1.9581097E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x04c6:
            boolean r0 = r4.A4h()
            if (r0 == 0) goto L_0x04da
            boolean r0 = r4.A4O()
            if (r0 == 0) goto L_0x04da
            X.HNR r1 = X.HNR.A1S
            r0 = 2131972011(0x7f134fab, float:1.9581018E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x04da:
            X.I7R.A02(r5, r2)
            X.57N r0 = r5.A05
            if (r0 == 0) goto L_0x0143
            boolean r0 = X.C321566uO.A00(r3, r4)
            if (r0 == 0) goto L_0x0143
            X.3X1 r1 = r4.A1w()
            X.3X1 r0 = X.AnonymousClass3X1.FAN_CLUB
            if (r1 != r0) goto L_0x05f7
            X.HNR r1 = X.HNR.A0i
            r0 = 2131961984(0x7f132880, float:1.956068E38)
            goto L_0x0140
        L_0x04f6:
            X.HNR r1 = X.HNR.A1E
            r0 = 2131965931(0x7f1337eb, float:1.9568686E38)
            goto L_0x042b
        L_0x04fd:
            X.HNR r1 = X.HNR.A1D
            r0 = 2131965930(0x7f1337ea, float:1.9568684E38)
            goto L_0x0415
        L_0x0504:
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x053b
            boolean r0 = r4.A5r()
            if (r0 == 0) goto L_0x053b
            boolean r0 = r4.A64()
            if (r0 == 0) goto L_0x053b
            boolean r0 = r4.A5M()
            if (r0 != 0) goto L_0x053b
            X.3QO r1 = r4.A1t()
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r1 != r0) goto L_0x0534
            boolean r0 = X.C318996ps.A01()
            if (r0 == 0) goto L_0x03f8
            X.HNR r1 = X.HNR.A1K
            X.C51967G9n.A0v()
            r0 = 2131955700(0x7f130ff4, float:1.9547935E38)
            goto L_0x03f5
        L_0x0534:
            X.HNR r1 = X.HNR.A1L
            r0 = 2131955701(0x7f130ff5, float:1.9547937E38)
            goto L_0x03f5
        L_0x053b:
            boolean r0 = r4.A5Y()
            if (r0 == 0) goto L_0x03f8
            boolean r0 = r4.A5r()
            if (r0 == 0) goto L_0x03f8
            boolean r0 = r4.A64()
            if (r0 == 0) goto L_0x03f8
            boolean r0 = r4.CcK()
            if (r0 != 0) goto L_0x03f8
            boolean r0 = r4.A5M()
            if (r0 != 0) goto L_0x03f8
            X.HNR r1 = X.HNR.A1T
            r0 = 2131972063(0x7f134fdf, float:1.9581123E38)
            goto L_0x03f5
        L_0x0560:
            X.HNR r1 = X.HNR.A2D
            r0 = 2131972376(0x7f135118, float:1.9581758E38)
            goto L_0x03e7
        L_0x0567:
            boolean r0 = r4.A5Y()
            if (r0 != 0) goto L_0x0573
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x0579
        L_0x0573:
            boolean r0 = r4.A5Y()
            if (r0 == 0) goto L_0x036f
        L_0x0579:
            X.HNR r1 = X.HNR.A0d
            goto L_0x0369
        L_0x057d:
            X.HNR r1 = X.HNR.A2F
            r0 = 2131975593(0x7f135da9, float:1.9588283E38)
            goto L_0x0350
        L_0x0584:
            boolean r0 = r4.A4T()
            if (r0 == 0) goto L_0x0339
            X.0Tu r6 = X.0Tu.A05
            r0 = 36320279270400163(0x81091a000e20a3, double:3.0324290884022857E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0339
            boolean r0 = X.C56645I6a.A01(r3)
            if (r0 == 0) goto L_0x0339
            X.HNR r1 = X.HNR.A2B
            r0 = 2131975589(0x7f135da5, float:1.9588275E38)
            goto L_0x0336
        L_0x05a4:
            X.HNR r1 = X.HNR.A1y
            r0 = 2131975569(0x7f135d91, float:1.9588234E38)
            goto L_0x030a
        L_0x05ab:
            r1 = 2131963389(0x7f132dfd, float:1.956353E38)
            X.HNR r0 = X.HNR.A0u
            goto L_0x02f6
        L_0x05b2:
            boolean r0 = r4.CeS()
            if (r0 == 0) goto L_0x05c2
            r1 = 2131963374(0x7f132dee, float:1.95635E38)
            if (r6 == 0) goto L_0x05cc
            r1 = 2131975880(0x7f135ec8, float:1.9588865E38)
            goto L_0x02dc
        L_0x05c2:
            r1 = 2131963375(0x7f132def, float:1.9563502E38)
            if (r6 == 0) goto L_0x05cc
            r1 = 2131975881(0x7f135ec9, float:1.9588867E38)
            goto L_0x02dc
        L_0x05cc:
            X.HNR r0 = X.HNR.A0s
            goto L_0x02de
        L_0x05d0:
            r6 = 0
            goto L_0x02bc
        L_0x05d3:
            X.HNR r1 = X.HNR.A0B
            r0 = 2131973644(0x7f13560c, float:1.958433E38)
            goto L_0x028c
        L_0x05da:
            if (r1 != 0) goto L_0x05e6
            boolean r0 = X.C367288qV.A09(r3)
            if (r0 == 0) goto L_0x05e6
            X.HNR r1 = X.HNR.A1q
            goto L_0x01f9
        L_0x05e6:
            X.HNR r1 = X.HNR.A1r
            goto L_0x05eb
        L_0x05e9:
            X.HNR r1 = X.HNR.A0D
        L_0x05eb:
            r0 = 2131955643(0x7f130fbb, float:1.954782E38)
            goto L_0x01fc
        L_0x05f0:
            X.HNR r1 = X.HNR.A0C
            r0 = 2131973451(0x7f13554b, float:1.9583938E38)
            goto L_0x01fc
        L_0x05f7:
            X.3X1 r1 = r4.A1w()
            X.3X1 r0 = X.AnonymousClass3X1.PREVIEW
            if (r1 != r0) goto L_0x0143
            X.HNR r1 = X.HNR.A0h
            r0 = 2131961983(0x7f13287f, float:1.9560678E38)
            goto L_0x0140
        L_0x0606:
            X.OcF r0 = r5.A0C
            r0.A05()
            boolean r0 = X.AnonymousClass3YV.A06(r3, r4)
            if (r0 == 0) goto L_0x0619
            X.HNR r1 = X.HNR.A0x
            r0 = 2131969629(0x7f13465d, float:1.9576186E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0619:
            com.instagram.user.model.User r10 = r4.A2A(r3)
            java.lang.String r22 = "Required value was null."
            if (r10 == 0) goto L_0x0daa
            X.2f1 r0 = X.AnonymousClass2f1.A00(r3)
            boolean r21 = r0.A0Q(r10)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36316027252051821(0x81053c00030f6d, double:3.0297400948772906E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0644
            boolean r0 = X.GKS.A02(r3, r4)
            if (r0 == 0) goto L_0x0ab7
            X.HNR r1 = X.HNR.A1B
            r0 = 2131953189(0x7f130625, float:1.9542842E38)
        L_0x0641:
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0644:
            boolean r0 = X.I7R.A0A(r5)
            r9 = 1
            r0 = r0 ^ 1
            X.I7R.A09(r5, r2, r0)
            boolean r0 = r4.A6B()
            if (r0 == 0) goto L_0x065c
            X.HNR r1 = X.HNR.A0S
            r0 = 2131975067(0x7f135b9b, float:1.9587216E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x065c:
            X.I7R.A07(r5, r2)
            boolean r0 = X.I7R.A0A(r5)
            if (r0 == 0) goto L_0x0672
            boolean r0 = r5.A0H
            if (r0 != 0) goto L_0x066f
            X.I7R.A05(r5, r2)
            X.I7R.A03(r5, r2)
        L_0x066f:
            X.I7R.A04(r5, r2)
        L_0x0672:
            X.I7R.A06(r5, r2)
            boolean r0 = X.C254413sR.A01(r3, r4)
            if (r0 == 0) goto L_0x0a5c
            X.HNR r8 = X.HNR.A1Q
            com.instagram.api.schemas.MediaOptionStyle r7 = com.instagram.api.schemas.MediaOptionStyle.A05
            r1 = 2131972048(0x7f134fd0, float:1.9581093E38)
            android.content.Context r0 = r5.A02
            java.lang.String r0 = X.AnonymousClass7TE.A16(r0, r1)
            X.I7R.A00(r7, r5, r8, r0, r2)
        L_0x068b:
            X.I7R.A02(r5, r2)
            boolean r0 = r4.A4z()
            if (r0 == 0) goto L_0x069c
            X.HNR r1 = X.HNR.A05
            r0 = 2131974135(0x7f1357f7, float:1.9585325E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x069c:
            boolean r0 = X.2R8.A03(r3, r4)
            if (r0 == 0) goto L_0x06aa
            X.HNR r1 = X.HNR.A1P
            r0 = 2131972038(0x7f134fc6, float:1.9581072E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x06aa:
            X.1Xy r0 = r4.A0C
            java.lang.Boolean r0 = r0.B1K()
            if (r0 == 0) goto L_0x06ed
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x06ed
            X.1sy r1 = r5.A09
            X.1sy r0 = X.1sy.A0H
            if (r1 == r0) goto L_0x06c2
            X.1sy r0 = X.1sy.A0A
            if (r1 != r0) goto L_0x06ed
        L_0x06c2:
            X.HNR r1 = X.HNR.A2a
            r0 = 2131976890(0x7f1362ba, float:1.9590913E38)
            X.I7R.A01(r5, r1, r2, r0)
            X.I5c r11 = X.C56624I5c.A00
            android.content.Context r7 = r5.A02
            X.4DU r1 = r5.A07
            int r0 = r5.A01
            java.lang.String r17 = java.lang.String.valueOf(r0)
            X.3W1 r0 = r5.A08
            int r0 = r0.A0W
            java.lang.String r18 = java.lang.String.valueOf(r0)
            X.3kK r0 = r5.A0B
            java.lang.String r19 = r0.getSessionId()
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            r12 = r7
            r13 = r3
            r14 = r4
            r15 = r1
            r11.A02(r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x06ed:
            X.1Xy r0 = r4.A0C
            X.1eD r20 = r0.B5C()
            X.1Xy r0 = r4.A0C
            X.1eD r19 = r0.B5S()
            X.3W1 r12 = r5.A08
            boolean r0 = r12.A2a
            if (r0 == 0) goto L_0x0703
            r18 = 1
            if (r21 == 0) goto L_0x0705
        L_0x0703:
            r18 = 0
        L_0x0705:
            boolean r0 = r5.A0E
            if (r0 != 0) goto L_0x070d
            r16 = 0
            if (r18 == 0) goto L_0x070f
        L_0x070d:
            r16 = 1
        L_0x070f:
            X.1sy r8 = r5.A09
            X.1sy r7 = X.1sy.A0H
            boolean r17 = X.AnonymousClass7TF.A1W(r8, r7)
            if (r17 == 0) goto L_0x071e
            if (r16 != 0) goto L_0x071e
            r15 = 1
            if (r20 != 0) goto L_0x071f
        L_0x071e:
            r15 = 0
        L_0x071f:
            if (r19 == 0) goto L_0x072e
            java.lang.String r0 = r19.getTitle()
            if (r0 == 0) goto L_0x072e
            int r0 = r0.length()
            r14 = 1
            if (r0 > 0) goto L_0x072f
        L_0x072e:
            r14 = 0
        L_0x072f:
            boolean r13 = r10.A26()
            if (r21 == 0) goto L_0x0754
            if (r17 == 0) goto L_0x0754
            boolean r0 = X.2R8.A02(r3, r4)
            if (r0 != 0) goto L_0x0754
            X.0Tu r11 = X.0Tu.A06
            r0 = 36313888360171802(0x81034a001f091a, double:3.02838745103974E-306)
            boolean r0 = X.182.A06(r11, r3, r0)
            if (r0 == 0) goto L_0x0754
            if (r13 == 0) goto L_0x0a55
            X.HNR r1 = X.HNR.A1O
            r0 = 2131972032(0x7f134fc0, float:1.958106E38)
        L_0x0751:
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0754:
            boolean r0 = r12.A28
            if (r0 == 0) goto L_0x0a3c
            java.lang.String r11 = ""
            if (r18 == 0) goto L_0x0a1c
            if (r14 == 0) goto L_0x0a1c
            X.HNR r1 = X.HNR.A1g
            if (r19 == 0) goto L_0x0da0
            java.lang.String r0 = r19.getTitle()
            if (r0 == 0) goto L_0x0769
            r11 = r0
        L_0x0769:
            com.instagram.api.schemas.MediaOptionStyle r0 = r19.C7w()
            X.I7R.A00(r0, r5, r1, r11, r2)
            boolean r0 = X.AnonymousClass3VO.A09(r4)
            if (r0 == 0) goto L_0x0a09
            r0 = 36317921332762255(0x8106f50005168f, double:3.03093791914542E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0a09
        L_0x0781:
            X.HNR r11 = X.HNR.A1j
            android.content.Context r1 = r5.A02
            r0 = 2131964434(0x7f133212, float:1.956565E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            com.instagram.api.schemas.MediaOptionStyle r0 = com.instagram.api.schemas.MediaOptionStyle.A06
            X.I7R.A00(r0, r5, r11, r1, r2)
        L_0x0791:
            X.1Xy r0 = r4.A0C
            java.util.List r0 = r0.C8a()
            if (r0 == 0) goto L_0x07b3
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r9) goto L_0x07b3
            android.content.Context r0 = r5.A02
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131965837(0x7f13378d, float:1.9568495E38)
            java.lang.String r11 = X.AnonymousClass7TF.A0d(r1, r0)
            X.HNR r1 = X.HNR.A0z
            com.instagram.api.schemas.MediaOptionStyle r0 = com.instagram.api.schemas.MediaOptionStyle.A06
            X.I7R.A00(r0, r5, r1, r11, r2)
        L_0x07b3:
            X.1Xy r0 = r4.A0C
            com.instagram.model.hashtag.Hashtag r0 = r0.B6n()
            if (r0 != 0) goto L_0x07c9
            androidx.fragment.app.Fragment r1 = r5.A03
            boolean r0 = r1 instanceof X.C266514Zg
            if (r0 == 0) goto L_0x07d1
            X.4Zg r1 = (X.C266514Zg) r1
            com.instagram.model.hashtag.Hashtag r0 = r1.BCW()
            if (r0 == 0) goto L_0x07d1
        L_0x07c9:
            X.HNR r1 = X.HNR.A0r
            r0 = 2131960997(0x7f1324a5, float:1.9558678E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x07d1:
            boolean r0 = X.AnonymousClass3YV.A06(r3, r4)
            if (r0 == 0) goto L_0x080d
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x080d
            boolean r0 = r4.A64()
            if (r0 == 0) goto L_0x080d
            boolean r0 = r4.A5M()
            if (r0 != 0) goto L_0x080d
            r0 = 36323165487573961(0x810bba00012bc9, double:3.034254343764859E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x080d
            X.3QO r1 = r4.A1t()
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r1 != r0) goto L_0x0a02
            boolean r0 = X.C318996ps.A01()
            if (r0 == 0) goto L_0x080d
            X.HNR r1 = X.HNR.A1K
            X.C51967G9n.A0v()
            r0 = 2131955700(0x7f130ff4, float:1.9547935E38)
        L_0x080a:
            X.I7R.A01(r5, r1, r2, r0)
        L_0x080d:
            X.0eE r11 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r11.A01(r3)
            boolean r0 = r4.A6e(r0)
            if (r0 != 0) goto L_0x0823
            com.instagram.user.model.User r0 = r11.A01(r3)
            boolean r0 = X.Hd1.A00(r4, r0)
            if (r0 == 0) goto L_0x082b
        L_0x0823:
            X.HNR r1 = X.HNR.A0t
            r0 = 2131968339(0x7f134153, float:1.957357E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x082b:
            boolean r0 = r4.A4O()
            if (r0 == 0) goto L_0x0839
            X.HNR r1 = X.HNR.A1R
            r0 = 2131972050(0x7f134fd2, float:1.9581097E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0839:
            r0 = 36874987180720188(0x83019b0001003c, double:3.38322860451814E-306)
            java.lang.String r15 = X.182.A04(r6, r3, r0)
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            r0 = 3
            java.lang.Integer[] r14 = X.AnonymousClass05K.A00(r0)
            int r12 = r14.length
            r1 = 0
        L_0x084b:
            if (r1 >= r12) goto L_0x0860
            r16 = r14[r1]
            int r0 = r16.intValue()
            switch(r0) {
                case 1: goto L_0x09fa;
                case 2: goto L_0x09fe;
                default: goto L_0x0856;
            }
        L_0x0856:
            java.lang.String r0 = "none"
        L_0x0858:
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x09f6
            r13 = r16
        L_0x0860:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r13 == r0) goto L_0x086a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r13 != r0) goto L_0x09f3
            if (r17 == 0) goto L_0x09f3
        L_0x086a:
            if (r21 == 0) goto L_0x088b
            if (r9 != 0) goto L_0x088b
            X.HNR r12 = X.HNR.A1w
            android.content.Context r0 = r5.A02
            android.content.res.Resources r9 = r0.getResources()
            boolean r1 = r10.A25()
            r0 = 2131966171(0x7f1338db, float:1.9569173E38)
            if (r1 == 0) goto L_0x0882
            r0 = 2131966170(0x7f1338da, float:1.956917E38)
        L_0x0882:
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r9, r0)
            com.instagram.api.schemas.MediaOptionStyle r0 = com.instagram.api.schemas.MediaOptionStyle.A06
            X.I7R.A00(r0, r5, r12, r1, r2)
        L_0x088b:
            com.instagram.user.model.User r0 = r4.A2A(r3)
            if (r0 == 0) goto L_0x0d9b
            boolean r0 = r0.A1h()
            if (r0 == 0) goto L_0x089f
            X.HNR r1 = X.HNR.A06
            r0 = 2131962346(0x7f1329ea, float:1.9561415E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x089f:
            X.I7R.A08(r5, r2)
            boolean r0 = X.I7R.A0A(r5)
            if (r0 != 0) goto L_0x08b5
            boolean r0 = r5.A0H
            if (r0 != 0) goto L_0x08b2
            X.I7R.A05(r5, r2)
            X.I7R.A03(r5, r2)
        L_0x08b2:
            X.I7R.A04(r5, r2)
        L_0x08b5:
            com.instagram.user.model.User r0 = r11.A01(r3)
            X.4Cl r0 = r0.A03
            java.lang.Integer r9 = r0.B6v()
            boolean r0 = r4.CcK()
            if (r0 != 0) goto L_0x08fa
            if (r8 != r7) goto L_0x08fa
            boolean r0 = X.2R8.A02(r3, r4)
            if (r0 != 0) goto L_0x08fa
            X.2f1 r1 = X.AnonymousClass2f1.A00(r3)
            com.instagram.user.model.User r0 = r4.A2A(r3)
            if (r0 == 0) goto L_0x0d96
            boolean r0 = r1.A0Q(r0)
            if (r0 == 0) goto L_0x08fa
            if (r9 == 0) goto L_0x08fa
            int r1 = r9.intValue()
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r1 >= r0) goto L_0x08fa
            r0 = 36311951328543561(0x810187000a0349, double:3.0271624644382403E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 != 0) goto L_0x08fa
            X.HNR r1 = X.HNR.A2I
            r0 = 2131975854(0x7f135eae, float:1.9588812E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x08fa:
            boolean r0 = r4.CcK()
            if (r0 != 0) goto L_0x0924
            if (r8 != r7) goto L_0x0924
            boolean r0 = X.2R8.A02(r3, r4)
            if (r0 != 0) goto L_0x0924
            X.1Xy r0 = r4.A0C
            com.instagram.model.hashtag.Hashtag r0 = r0.B6n()
            if (r0 == 0) goto L_0x0924
            com.instagram.user.model.User r0 = r11.A01(r3)
            X.4Cl r0 = r0.A03
            java.lang.Integer r0 = r0.B6v()
            if (r0 == 0) goto L_0x0924
            X.HNR r1 = X.HNR.A2H
            r0 = 2131975861(0x7f135eb5, float:1.9588826E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0924:
            boolean r0 = r4.CcK()
            if (r0 != 0) goto L_0x0961
            if (r8 != r7) goto L_0x0961
            boolean r0 = X.2R8.A02(r3, r4)
            if (r0 != 0) goto L_0x0961
            X.2f1 r1 = X.AnonymousClass2f1.A00(r3)
            com.instagram.user.model.User r0 = r4.A2A(r3)
            if (r0 == 0) goto L_0x0d91
            boolean r0 = r1.A0Q(r0)
            if (r0 == 0) goto L_0x0961
            com.instagram.user.model.User r0 = r4.A2A(r3)
            if (r0 == 0) goto L_0x0d8c
            boolean r0 = r0.A1s()
            if (r0 != 0) goto L_0x0961
            r0 = 36311951328478024(0x81018700090348, double:3.0271624643967945E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 != 0) goto L_0x0961
            X.HNR r1 = X.HNR.A16
            r0 = 2131967919(0x7f133faf, float:1.9572718E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x0961:
            boolean r0 = X.I7R.A0A(r5)
            X.I7R.A09(r5, r2, r0)
            boolean r0 = r4.A5x()
            if (r0 == 0) goto L_0x099a
            X.1Xy r0 = r4.A0C
            X.DUd r0 = r0.Bmy()
            if (r0 == 0) goto L_0x0d87
            com.instagram.user.model.User r0 = r0.Bn4()
            java.lang.String r0 = r0.getId()
            boolean r0 = X.2R8.A05(r3, r0)
            if (r0 == 0) goto L_0x099a
            X.4DU r0 = r5.A07
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "feed_contextual_profile"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x099a
            X.HNR r1 = X.HNR.A1W
            r0 = 2131972093(0x7f134ffd, float:1.9581184E38)
            X.I7R.A01(r5, r1, r2, r0)
        L_0x099a:
            com.instagram.user.model.User r7 = r11.A01(r3)
            X.1Xy r0 = r4.A0C
            java.util.List r0 = r0.Aay()
            r1 = 1
            if (r0 == 0) goto L_0x09ca
            boolean r0 = r0.contains(r7)
            if (r0 != r1) goto L_0x09ca
        L_0x09ad:
            r0 = 36320279269941404(0x81091a0007209c, double:3.0324290881121646E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0060
            X.HNR r6 = X.HNR.A18
            com.instagram.api.schemas.MediaOptionStyle r3 = com.instagram.api.schemas.MediaOptionStyle.A05
            r1 = 2131968967(0x7f1343c7, float:1.9574844E38)
            android.content.Context r0 = r5.A02
            java.lang.String r0 = X.AnonymousClass7TE.A16(r0, r1)
            X.I7R.A00(r3, r5, r6, r0, r2)
            goto L_0x0060
        L_0x09ca:
            java.util.List r1 = X.C51966G9m.A1I(r4)
            if (r1 == 0) goto L_0x0060
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x09dc
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x09dc
            goto L_0x0060
        L_0x09dc:
            java.util.Iterator r7 = r1.iterator()
        L_0x09e0:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0060
            X.1Xj r0 = X.C51966G9m.A0t(r7)
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.PENDING_CAROUSEL_ITEM
            com.instagram.model.mediatype.ProductType r0 = r0.A1v()
            if (r1 != r0) goto L_0x09e0
            goto L_0x09ad
        L_0x09f3:
            r9 = 0
            goto L_0x086a
        L_0x09f6:
            int r1 = r1 + 1
            goto L_0x084b
        L_0x09fa:
            java.lang.String r0 = "feed"
            goto L_0x0858
        L_0x09fe:
            java.lang.String r0 = "all"
            goto L_0x0858
        L_0x0a02:
            X.HNR r1 = X.HNR.A1L
            r0 = 2131955701(0x7f130ff5, float:1.9547937E38)
            goto L_0x080a
        L_0x0a09:
            boolean r0 = X.AnonymousClass3VO.A08(r4)
            if (r0 == 0) goto L_0x0791
            r0 = 36317921332827792(0x8106f500061690, double:3.030937919186866E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0791
            goto L_0x0781
        L_0x0a1c:
            if (r16 == 0) goto L_0x0a40
            X.HNR r11 = X.HNR.A1g
            X.1Xy r0 = r4.A0C
            X.1eD r0 = r0.B2u()
            if (r0 == 0) goto L_0x0a2e
            java.lang.String r1 = r0.getTitle()
            if (r1 != 0) goto L_0x0a37
        L_0x0a2e:
            android.content.Context r1 = r5.A02
            r0 = 2131968504(0x7f1341f8, float:1.9573904E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
        L_0x0a37:
            com.instagram.api.schemas.MediaOptionStyle r0 = com.instagram.api.schemas.MediaOptionStyle.A06
            X.I7R.A00(r0, r5, r11, r1, r2)
        L_0x0a3c:
            if (r18 == 0) goto L_0x07b3
            goto L_0x0791
        L_0x0a40:
            if (r15 == 0) goto L_0x0a3c
            X.HNR r1 = X.HNR.A1h
            if (r20 == 0) goto L_0x0da5
            java.lang.String r0 = r20.getTitle()
            if (r0 == 0) goto L_0x0a4d
            r11 = r0
        L_0x0a4d:
            com.instagram.api.schemas.MediaOptionStyle r0 = r20.C7w()
            X.I7R.A00(r0, r5, r1, r11, r2)
            goto L_0x0a3c
        L_0x0a55:
            X.HNR r1 = X.HNR.A09
            r0 = 2131952378(0x7f1302fa, float:1.9541197E38)
            goto L_0x0751
        L_0x0a5c:
            java.util.ArrayList r1 = X.C254423sS.A05(r4)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0a7a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0a7a
        L_0x0a6a:
            boolean r0 = X.C254413sR.A02(r3, r4)
            if (r0 == 0) goto L_0x068b
            X.HNR r1 = X.HNR.A1d
            r0 = 2131972242(0x7f135092, float:1.9581486E38)
        L_0x0a75:
            X.I7R.A01(r5, r1, r2, r0)
            goto L_0x068b
        L_0x0a7a:
            java.util.Iterator r11 = r1.iterator()
        L_0x0a7e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0a6a
            java.lang.Object r8 = r11.next()
            X.DTv r8 = (X.C46292DTv) r8
            X.Pwf r0 = r8.Bbg()
            r7 = 0
            if (r0 == 0) goto L_0x0ab5
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = r0.BzM()
        L_0x0a95:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r0 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.PENDING
            if (r1 != r0) goto L_0x0a7e
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r8.Bfu()
            if (r0 == 0) goto L_0x0aa9
            com.instagram.user.model.User r0 = r0.BRo()
            if (r0 == 0) goto L_0x0aa9
            java.lang.String r7 = X.AnonymousClass3ZA.A00(r0)
        L_0x0aa9:
            boolean r0 = X.C51966G9m.A1W(r3, r7)
            if (r0 == 0) goto L_0x0a7e
            X.HNR r1 = X.HNR.A0G
            r0 = 2131954734(0x7f130c2e, float:1.9545976E38)
            goto L_0x0a75
        L_0x0ab5:
            r1 = r7
            goto L_0x0a95
        L_0x0ab7:
            boolean r0 = X.GKS.A03(r3, r4)
            if (r0 == 0) goto L_0x0644
            X.HNR r1 = X.HNR.A2N
            r0 = 2131953201(0x7f130631, float:1.9542866E38)
            goto L_0x0641
        L_0x0ac4:
            java.lang.Object r2 = r3.A01
            return r2
        L_0x0ac7:
            java.lang.Object r0 = r3.A01
            java.lang.Object r2 = X.DbT.A0r(r0)
            return r2
        L_0x0ace:
            java.lang.Object r0 = r3.A01
            X.E7N r0 = (X.E7N) r0
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KDU r2 = new X.KDU
            r2.<init>(r0)
            return r2
        L_0x0ade:
            java.lang.Object r5 = r3.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            com.instagram.fanclub.api.FanClubApi r4 = new com.instagram.fanclub.api.FanClubApi
            r4.<init>(r5)
            java.lang.String r3 = r5.A06
            X.0Tu r2 = X.0Tu.A06
            r0 = 36320309334384860(0x810921000220dc, double:3.032448100987266E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository r2 = new com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository
            r2.<init>(r4, r3, r0)
            return r2
        L_0x0afa:
            java.lang.Object r1 = r3.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            com.instagram.fanclub.api.FanClubApi r0 = new com.instagram.fanclub.api.FanClubApi
            r0.<init>(r1)
            com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository r2 = new com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository
            r2.<init>(r1, r0)
            return r2
        L_0x0b09:
            java.lang.Object r2 = r3.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            com.instagram.fanclub.api.FanClubApi r1 = new com.instagram.fanclub.api.FanClubApi
            r1.<init>(r2)
            X.Fkx r0 = new X.Fkx
            r0.<init>(r2)
            com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository r2 = new com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository
            r2.<init>(r1, r0)
            return r2
        L_0x0b1d:
            java.lang.Object r0 = r3.A01
            X.0r6[] r0 = (X.AnonymousClass0r6[]) r0
            int r0 = r0.length
            java.lang.Object[] r2 = new java.lang.Object[r0]
            return r2
        L_0x0b25:
            java.lang.Object r0 = r3.A01
            android.os.Bundle r2 = X.DbS.A0B(r0)
            java.lang.String r1 = "origin"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
        L_0x0b34:
            java.lang.Object r2 = r3.A01
            X.Ubn r2 = (X.C15388Ubn) r2
            android.app.Application r3 = X.DbY.A05(r2)
            X.0eM r0 = r2.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A09
            java.lang.String r0 = X.DbW.A0l(r0)
            X.Ghh r2 = new X.Ghh
            r2.<init>(r3, r1, r0)
            return r2
        L_0x0b4e:
            java.lang.Object r0 = r3.A01
            com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl r0 = (com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.0iw r0 = r0.A00
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r1)
            return r2
        L_0x0b5b:
            java.lang.Object r0 = r3.A01
            X.Jfh r0 = (X.C60101Jfh) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            X.0xG r0 = X.C60101Jfh.A0B
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r1)
            return r2
        L_0x0b68:
            java.lang.Object r0 = r3.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.fanclub.api.FanClubApi r1 = new com.instagram.fanclub.api.FanClubApi
            r1.<init>(r0)
            X.12T r0 = X.AnonymousClass12T.A00
            X.Lip r2 = new X.Lip
            r2.<init>(r0, r1)
            return r2
        L_0x0b79:
            java.lang.Object r0 = r3.A01
            android.content.Context r1 = X.DbT.A08(r0)
            r0 = 2131237848(0x7f081bd8, float:1.8091958E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            if (r2 == 0) goto L_0x0ba5
            r2.mutate()
            r0 = 2130970311(0x7f0406c7, float:1.7549329E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbX.A11(r1, r2, r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165290(0x7f07006a, float:1.7944793E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 0
            r2.setBounds(r0, r0, r1, r1)
            return r2
        L_0x0ba5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0baa:
            java.lang.Object r2 = r3.A01
            X.E4g r2 = (X.C47481E4g) r2
            X.0eM r0 = r2.A04
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r2.requireArguments()
            r0 = 2087(0x827, float:2.925E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r4 = r1.getBoolean(r0)
            android.os.Bundle r1 = r2.requireArguments()
            r0 = 2089(0x829, float:2.927E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r5 = r1.getBoolean(r0)
            android.os.Bundle r1 = r2.requireArguments()
            r0 = 2086(0x826, float:2.923E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r6 = r1.getBoolean(r0)
            android.os.Bundle r1 = r2.requireArguments()
            r0 = 3434(0xd6a, float:4.812E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r7 = r1.getBoolean(r0)
            X.EFS r2 = new X.EFS
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L_0x0bf2:
            java.lang.Object r0 = r3.A01
            X.07f r2 = X.C51971G9r.A0U(r0)
            return r2
        L_0x0bf9:
            java.lang.Object r0 = r3.A01
            X.E4f r0 = (X.C47480E4f) r0
            com.instagram.common.session.UserSession r1 = r0.A05()
            java.lang.String r0 = r0.A08()
            X.H64 r2 = new X.H64
            r2.<init>(r1, r0)
            return r2
        L_0x0c0b:
            java.lang.Object r2 = r3.A01
            X.E2g r2 = (X.C47434E2g) r2
            X.0eM r0 = r2.A02
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A00
            java.lang.String r0 = X.DbS.A0t(r0)
            X.KCo r2 = new X.KCo
            r2.<init>(r1, r0)
            return r2
        L_0x0c21:
            java.lang.Object r0 = r3.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0c45
            r0 = 3991(0xf97, float:5.593E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r1 = r1.getBoolean(r0)
        L_0x0c33:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L_0x0c38:
            java.lang.Object r0 = r3.A01
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.BoostUpsellBannerPayloadSchema r0 = r0.Ah4()
            r1 = 0
            if (r0 != 0) goto L_0x0c33
        L_0x0c45:
            r1 = 1
            goto L_0x0c33
        L_0x0c47:
            java.lang.Object r1 = r3.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            com.instagram.fanclub.api.FanClubApi r0 = new com.instagram.fanclub.api.FanClubApi
            r0.<init>(r1)
            com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository r2 = new com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository
            r2.<init>(r0)
            return r2
        L_0x0c56:
            java.lang.Object r0 = r3.A01
            X.JiU r0 = (X.C60273JiU) r0
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r0 = r0.A02
            X.6jB r0 = r0.A04
            X.0xa r5 = r0.A01
            r0 = 3790(0xece, float:5.311E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            long r2 = X.DbW.A06(r5, r4)
            r0 = 1
            long r2 = r2 + r0
            X.0xY r0 = r5.AR4()
            r0.E5c(r4, r2)
            r0.apply()
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0c7a:
            java.lang.Object r0 = r3.A01
            X.Gzo r0 = (X.C54119Gzo) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.FYu r2 = X.C48796EkJ.A00(r0)
            return r2
        L_0x0c89:
            java.lang.Object r7 = r3.A01
            X.Gzo r7 = (X.C54119Gzo) r7
            X.0eM r0 = r7.A00
            java.lang.Object r2 = r0.getValue()
            X.FYu r2 = (X.C50337FYu) r2
            X.0eM r0 = r7.A01
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = X.C41847B3o.A1E(r0)
            r0 = 649(0x289, float:9.1E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0cd3
            X.EZp r0 = X.C48147EZp.FAN_CLUB_CREATOR_ONBOARDING
        L_0x0cad:
            X.EZo r1 = X.C48146EZo.THREAD_VIEW
            r5 = 0
            java.lang.String r3 = "creator_share_ssc_to_bc"
            java.lang.String r4 = "tap"
            X.C50337FYu.A01(r0, r1, r2, r3, r4, r5)
            X.0eM r0 = r7.A04
            X.2YL r9 = X.DbS.A0H(r0)
            androidx.fragment.app.FragmentActivity r8 = r7.requireActivity()
            X.6oS r0 = X.C318116oQ.A00(r9)
            r11 = 23
            X.MHE r6 = new X.MHE
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            X.AnonymousClass7TE.A1Z(r6, r0)
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0cd3:
            java.lang.String r0 = "prodash_next_step"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0cde
            X.EZp r0 = X.C48147EZp.PRODASH_NEXT_STEPS
            goto L_0x0cad
        L_0x0cde:
            X.EZp r0 = X.C48147EZp.CONVERSATION_STARTER_PILL
            goto L_0x0cad
        L_0x0ce1:
            X.37E r1 = X.AnonymousClass37D.A00
            java.lang.Object r0 = r3.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbZ.A0E(r0)
            X.DbX.A10(r0, r1)
            goto L_0x0d75
        L_0x0cee:
            java.lang.Object r0 = r3.A01
            android.os.Bundle r2 = X.DbS.A0B(r0)
            r0 = 461(0x1cd, float:6.46E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
        L_0x0d01:
            java.lang.Object r2 = r3.A01
            X.Gzo r2 = (X.C54119Gzo) r2
            X.0eM r0 = r2.A02
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A03
            java.lang.String r0 = X.DbW.A0l(r0)
            X.H65 r2 = new X.H65
            r2.<init>(r1, r0)
            return r2
        L_0x0d17:
            java.lang.Object r0 = r3.A01
            X.0lg r0 = (X.0lg) r0
            X.2Ds r2 = new X.2Ds
            r2.<init>(r0)
            return r2
        L_0x0d21:
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            X.5Gq r2 = new X.5Gq
            r2.<init>(r0)
            return r2
        L_0x0d2b:
            java.lang.Object r0 = r3.A01
            X.HFf r0 = (X.C54477HFf) r0
            android.content.Context r0 = r0.A00
            int r0 = X.AnonymousClass0nB.A01(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0d3a:
            java.lang.Object r0 = r3.A01
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.BoostUpsellBannerPayloadSchema r2 = r0.Ah4()
            return r2
        L_0x0d45:
            java.lang.Object r0 = r3.A01
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r2 = r0.A2n()
            return r2
        L_0x0d4e:
            java.lang.Object r0 = r3.A01
            X.Gue r0 = (X.C53811Gue) r0
            X.2uK r3 = r0.A02
            X.1Xj r2 = r0.A00
            X.3W1 r1 = r0.A01
            r0 = -3
            r3.A0S(r2, r1, r0)
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0d5f:
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = r0.getTag()
            boolean r0 = r1 instanceof X.C262804Gb
            if (r0 == 0) goto L_0x0d75
            X.4Gb r1 = (X.C262804Gb) r1
            if (r1 == 0) goto L_0x0d75
            com.instagram.feed.widget.IgProgressImageView r1 = r1.A0F
            r0 = 0
            r1.A0B(r0)
        L_0x0d75:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0d78:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0d7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0d82:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0d87:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0d8c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0d91:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0d96:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0d9b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0da0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0da5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0daa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58176Ing.invoke():java.lang.Object");
    }
}
