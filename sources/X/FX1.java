package X;

public final class FX1 implements 27S, 1wn {
    public final int A00;
    public final Object A01;

    public FX1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static FX1 A00(Object obj, int i) {
        return new FX1(obj, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x028c, code lost:
        r0 = X.DbU.A0u(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0294, code lost:
        return X.0qQ.A0K(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        r0 = r1.A0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cb, code lost:
        r0 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        r0 = r2.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0117, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d3, code lost:
        r0 = ((com.instagram.profilecard.domain.ProfileCardViewModel) r4.A01).A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d9, code lost:
        if (r0 == null) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01db, code lost:
        r0 = r0.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0235, code lost:
        r0 = ((com.instagram.profile.edit.controller.EditProfileFieldsController) r4.A01).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x023b, code lost:
        if (r0 == null) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x023d, code lost:
        r0 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0240, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean A72(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x027e;
                case 1: goto L_0x02dc;
                case 2: goto L_0x0255;
                case 3: goto L_0x0242;
                case 4: goto L_0x017c;
                case 5: goto L_0x00e1;
                case 6: goto L_0x0158;
                case 7: goto L_0x011c;
                case 8: goto L_0x022d;
                case 9: goto L_0x0224;
                case 10: goto L_0x02d5;
                case 11: goto L_0x020f;
                case 12: goto L_0x02ce;
                case 13: goto L_0x0200;
                case 14: goto L_0x00ce;
                case 15: goto L_0x00bf;
                case 16: goto L_0x00b2;
                case 17: goto L_0x00a5;
                case 18: goto L_0x0095;
                case 19: goto L_0x0087;
                case 20: goto L_0x0079;
                case 21: goto L_0x01f1;
                case 22: goto L_0x0068;
                case 23: goto L_0x02a8;
                case 24: goto L_0x01e1;
                case 25: goto L_0x01cb;
                case 26: goto L_0x01c2;
                case 27: goto L_0x01b9;
                case 28: goto L_0x01b0;
                case 29: goto L_0x0295;
                case 30: goto L_0x02b5;
                case 31: goto L_0x0036;
                case 32: goto L_0x0018;
                case 33: goto L_0x0199;
                case 34: goto L_0x017e;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.36g r5 = (X.C2370836g) r5
            com.instagram.user.model.User r0 = r5.A00
            java.lang.String r1 = r0.getId()
            java.lang.Object r0 = r4.A01
            X.E5d r0 = (X.C47498E5d) r0
            java.lang.String r0 = r0.A09
            boolean r2 = X.2Ob.A00(r1, r0)
        L_0x0017:
            return r2
        L_0x0018:
            X.FWh r5 = (X.C50276FWh) r5
            java.lang.String r2 = r5.A01
            java.lang.Object r1 = r4.A01
            X.FYw r1 = (X.C50339FYw) r1
            java.lang.String r0 = r1.A07
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x027c
            java.lang.Boolean r0 = r1.A04
            if (r0 == 0) goto L_0x027c
            boolean r1 = r5.A02
            boolean r0 = r0.booleanValue()
            if (r1 != r0) goto L_0x027c
            goto L_0x017c
        L_0x0036:
            X.FWS r5 = (X.FWS) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r2 = r4.A01
            X.Der r2 = (X.C46430Der) r2
            java.lang.Integer r1 = r2.A0K
            java.lang.String r0 = "type"
            if (r1 == 0) goto L_0x0054
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x004e
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x027c
        L_0x004e:
            X.Dex r1 = r2.A0E
            if (r1 != 0) goto L_0x005c
            java.lang.String r0 = "followListAdapter"
        L_0x0054:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005c:
            com.instagram.user.model.User r0 = r5.A00
            java.lang.String r0 = r0.getId()
            boolean r0 = r1.AJe(r0)
            goto L_0x0117
        L_0x0068:
            X.FWb r5 = (X.C50270FWb) r5
            java.lang.Object r0 = r4.A01
            X.Dib r0 = (X.C46656Dib) r0
            com.instagram.user.model.User r0 = r0.A0q
            if (r0 == 0) goto L_0x027c
            java.lang.String r2 = r5.A01
            java.lang.String r0 = r0.getId()
            goto L_0x00dc
        L_0x0079:
            X.FWW r5 = (X.FWW) r5
            java.lang.Object r1 = r4.A01
            X.Dib r1 = (X.C46656Dib) r1
            X.F1D r0 = r1.A0e
            r0.getClass()
            java.lang.String r2 = r5.A01
            goto L_0x00a2
        L_0x0087:
            X.INe r5 = (X.C57064INe) r5
            java.lang.Object r1 = r4.A01
            X.Dib r1 = (X.C46656Dib) r1
            X.F1D r0 = r1.A0e
            r0.getClass()
            java.lang.String r2 = r5.A00
            goto L_0x00a2
        L_0x0095:
            X.FWP r5 = (X.FWP) r5
            java.lang.Object r1 = r4.A01
            X.Dib r1 = (X.C46656Dib) r1
            X.F1D r0 = r1.A0e
            r0.getClass()
            java.lang.String r2 = r5.A00
        L_0x00a2:
            X.F1D r0 = r1.A0e
            goto L_0x00cb
        L_0x00a5:
            X.FWe r5 = (X.C50273FWe) r5
            java.lang.Object r0 = r4.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.F1D r0 = r0.A0e
            if (r0 == 0) goto L_0x027c
            java.lang.String r2 = r5.A02
            goto L_0x00cb
        L_0x00b2:
            X.FWX r5 = (X.FWX) r5
            java.lang.Object r0 = r4.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.F1D r0 = r0.A0e
            if (r0 == 0) goto L_0x027c
            java.lang.String r2 = r5.A01
            goto L_0x00cb
        L_0x00bf:
            X.FWV r5 = (X.FWV) r5
            java.lang.Object r0 = r4.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.F1D r0 = r0.A0e
            if (r0 == 0) goto L_0x027c
            java.lang.String r2 = r5.A01
        L_0x00cb:
            java.lang.String r0 = r0.A0G
            goto L_0x00dc
        L_0x00ce:
            X.3DP r5 = (X.AnonymousClass3DP) r5
            java.lang.Object r0 = r4.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.F1D r0 = r0.A0e
            if (r0 == 0) goto L_0x027c
            java.lang.String r2 = r0.A0G
            java.lang.String r0 = r5.A03
        L_0x00dc:
            boolean r0 = r2.equals(r0)
            goto L_0x0117
        L_0x00e1:
            X.36h r5 = (X.C2370936h) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.3Q2 r2 = r5.A00
            X.3QO r1 = r2.A1F
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r1 != r0) goto L_0x027c
            X.1Xj r1 = r2.A1C
            if (r1 == 0) goto L_0x011a
            java.lang.Object r0 = r4.A01
            X.E3K r0 = (X.E3K) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.user.model.User r0 = r1.A2A(r0)
            if (r0 == 0) goto L_0x011a
            java.lang.String r1 = r0.getId()
        L_0x0107:
            java.lang.Object r0 = r4.A01
            X.E3K r0 = (X.E3K) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r0.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
        L_0x0117:
            if (r0 == 0) goto L_0x027c
            goto L_0x017c
        L_0x011a:
            r1 = 0
            goto L_0x0107
        L_0x011c:
            X.376 r5 = (X.AnonymousClass376) r5
            r2 = 0
            X.0qQ.A0B(r5, r2)
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r4.A01
            X.E3K r0 = (X.E3K) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.user.model.User r3 = r1.A01(r0)
            java.util.List r0 = r5.A04
            X.0qQ.A06(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x013b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r1.next()
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            X.1Ns r0 = r0.A0W
            if (r0 == 0) goto L_0x0156
            java.lang.String r0 = r0.getId()
        L_0x014f:
            boolean r0 = X.DbV.A1Z(r3, r0)
            if (r0 == 0) goto L_0x013b
            goto L_0x017c
        L_0x0156:
            r0 = 0
            goto L_0x014f
        L_0x0158:
            X.WQ9 r5 = (X.WQ9) r5
            r2 = 0
            X.0qQ.A0B(r5, r2)
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r4.A01
            X.E3K r0 = (X.E3K) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.user.model.User r1 = r1.A01(r0)
            X.3uh r0 = r5.A00
            com.instagram.user.model.User r0 = r0.A0i
            java.lang.String r0 = X.DbX.A0r(r0)
            boolean r0 = X.DbV.A1Z(r1, r0)
            if (r0 == 0) goto L_0x0017
        L_0x017c:
            r2 = 1
            return r2
        L_0x017e:
            X.36g r5 = (X.C2370836g) r5
            java.lang.Object r2 = r4.A01
            X.E5c r2 = (X.C47497E5c) r2
            com.instagram.user.model.User r0 = r2.A01
            if (r0 == 0) goto L_0x027c
            com.instagram.user.model.User r0 = r5.A00
            java.lang.String r1 = r0.getId()
            com.instagram.user.model.User r0 = r2.A01
            java.lang.String r0 = r0.getId()
            boolean r2 = X.2Ob.A00(r1, r0)
            return r2
        L_0x0199:
            X.2Cy r5 = (X.2Cy) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            com.instagram.user.model.User r1 = r5.A00
            java.lang.Object r0 = r4.A01
            X.E2y r0 = (X.C47452E2y) r0
            X.5Oz r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            boolean r2 = r1.equals(r0)
            return r2
        L_0x01b0:
            X.FWP r5 = (X.FWP) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r1 = r5.A00
            goto L_0x01d3
        L_0x01b9:
            X.FWW r5 = (X.FWW) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r1 = r5.A01
            goto L_0x01d3
        L_0x01c2:
            X.FWU r5 = (X.FWU) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r1 = r5.A01
            goto L_0x01d3
        L_0x01cb:
            X.FWj r5 = (X.C50278FWj) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r1 = r5.A00
        L_0x01d3:
            java.lang.Object r0 = r4.A01
            com.instagram.profilecard.domain.ProfileCardViewModel r0 = (com.instagram.profilecard.domain.ProfileCardViewModel) r0
            com.instagram.user.model.User r0 = r0.A05
            if (r0 == 0) goto L_0x0240
            java.lang.String r0 = r0.getId()
            goto L_0x0290
        L_0x01e1:
            X.6pr r5 = (X.C318986pr) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r1 = r5.A00
            java.lang.Object r0 = r4.A01
            X.Dc7 r0 = (X.Dc7) r0
            X.0eM r0 = r0.A06
            goto L_0x028c
        L_0x01f1:
            X.2Cy r5 = (X.2Cy) r5
            com.instagram.user.model.User r1 = r5.A00
            java.lang.Object r0 = r4.A01
            X.Dib r0 = (X.C46656Dib) r0
            com.instagram.user.model.User r0 = r0.A0q
            boolean r2 = r1.equals(r0)
            return r2
        L_0x0200:
            X.2Cy r5 = (X.2Cy) r5
            com.instagram.user.model.User r1 = r5.A00
            java.lang.Object r0 = r4.A01
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r0 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r0
            com.instagram.user.model.User r0 = r0.A05
            boolean r2 = r1.equals(r0)
            return r2
        L_0x020f:
            X.FWf r5 = (X.C50274FWf) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r1 = r5.A01
            java.lang.Object r0 = r4.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r0
            com.instagram.user.model.User r0 = r0.A04
            if (r0 == 0) goto L_0x0240
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            goto L_0x0290
        L_0x0224:
            X.FWU r5 = (X.FWU) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r1 = r5.A01
            goto L_0x0235
        L_0x022d:
            X.FWj r5 = (X.C50278FWj) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r1 = r5.A00
        L_0x0235:
            java.lang.Object r0 = r4.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r0
            X.F1D r0 = r0.A01
            if (r0 == 0) goto L_0x0240
            java.lang.String r0 = r0.A0G
            goto L_0x0290
        L_0x0240:
            r0 = 0
            goto L_0x0290
        L_0x0242:
            X.2Cy r5 = (X.2Cy) r5
            com.instagram.user.model.User r1 = r5.A00
            java.lang.Object r0 = r4.A01
            X.Dev r0 = (X.C46433Dev) r0
            com.instagram.common.session.UserSession r0 = r0.A05
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)
            boolean r2 = r1.equals(r0)
            return r2
        L_0x0255:
            X.6qz r5 = (X.C319666qz) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.3UM r0 = r5.A00
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto L_0x027c
            java.lang.Object r0 = r4.A01
            X.E6m r0 = (X.C47526E6m) r0
            X.E9L r0 = r0.A00
            if (r0 != 0) goto L_0x0275
            java.lang.String r0 = "accountDiscoveryAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0275:
            java.util.HashSet r0 = r0.A02
            boolean r2 = r0.contains(r1)
            return r2
        L_0x027c:
            r2 = 0
            return r2
        L_0x027e:
            X.FW2 r5 = (X.FW2) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r1 = r5.A00
            java.lang.Object r0 = r4.A01
            X.H1y r0 = (X.C54178H1y) r0
            X.0eM r0 = r0.A07
        L_0x028c:
            java.lang.String r0 = X.DbU.A0u(r0)
        L_0x0290:
            boolean r2 = X.0qQ.A0K(r1, r0)
            return r2
        L_0x0295:
            X.FWR r5 = (X.FWR) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r1 = r5.A00
            r0 = 492(0x1ec, float:6.9E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r2 = r1.equals(r0)
            return r2
        L_0x02a8:
            X.2Cy r5 = (X.2Cy) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            com.instagram.user.model.User r0 = r5.A00
            boolean r2 = r0.A1W()
            return r2
        L_0x02b5:
            java.lang.Object r0 = r4.A01
            X.Der r0 = (X.C46430Der) r0
            com.instagram.user.recommended.FollowListData r0 = r0.A0D
            if (r0 != 0) goto L_0x02c7
            java.lang.String r0 = "followListData"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02c7:
            java.lang.String r0 = "getType"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x02ce:
            java.lang.String r0 = "userId"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x02d5:
            java.lang.String r0 = "userId"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x02dc:
            java.lang.String r0 = "user"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FX1.A72(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x08d9, code lost:
        X.0qQ.A0F("followListAdapter");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x08e2, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0229, code lost:
        r4.cleanUp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x088a;
                case 1: goto L_0x08c6;
                case 2: goto L_0x0858;
                case 3: goto L_0x082a;
                case 4: goto L_0x07c1;
                case 5: goto L_0x0793;
                case 6: goto L_0x074f;
                case 7: goto L_0x06e6;
                case 8: goto L_0x0678;
                case 9: goto L_0x0635;
                case 10: goto L_0x060c;
                case 11: goto L_0x05be;
                case 12: goto L_0x0590;
                case 13: goto L_0x0558;
                case 14: goto L_0x0512;
                case 15: goto L_0x04df;
                case 16: goto L_0x04b4;
                case 17: goto L_0x047d;
                case 18: goto L_0x045d;
                case 19: goto L_0x043d;
                case 20: goto L_0x0410;
                case 21: goto L_0x03ed;
                case 22: goto L_0x03be;
                case 23: goto L_0x039e;
                case 24: goto L_0x037d;
                case 25: goto L_0x0314;
                case 26: goto L_0x02d2;
                case 27: goto L_0x02a7;
                case 28: goto L_0x027c;
                case 29: goto L_0x0256;
                case 30: goto L_0x08ab;
                case 31: goto L_0x022e;
                case 32: goto L_0x008b;
                case 33: goto L_0x0062;
                case 34: goto L_0x0043;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1245331796(0x4a3a4154, float:3051605.0)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.36g r14 = (X.C2370836g) r14
            r0 = 1508590102(0x59eb4216, float:8.2774102E15)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r13.A01
            X.E5d r5 = (X.C47498E5d) r5
            X.C47498E5d.A01(r5)
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0036
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x0036
            com.instagram.common.session.UserSession r4 = r5.A01
            com.instagram.user.model.User r2 = r5.A04
            r2.getClass()
            java.lang.String r1 = r5.A08
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.String r0 = "share_business_bottom_sheet_follow"
            X.FEI.A00(r5, r4, r2, r1, r0)
        L_0x0036:
            r0 = 1329049157(0x4f37ae45, float:3.08165146E9)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 716929769(0x2abb7ae9, float:3.330316E-13)
        L_0x003f:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0043:
            r0 = -1049740176(0xffffffffc16e3c70, float:-14.889755)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1177798027(0xffffffffb9cc3a75, float:-3.8953466E-4)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.A01
            X.E5c r0 = (X.C47497E5c) r0
            X.C47497E5c.A00(r0)
            r0 = 626465565(0x25571b1d, float:1.8657464E-16)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -2023389154(0xffffffff8765881e, float:-1.7268046E-34)
            goto L_0x003f
        L_0x0062:
            r0 = -368717555(0xffffffffea05d10d, float:-4.0443587E25)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.2Cy r14 = (X.2Cy) r14
            r0 = -1649950238(0xffffffff9da7c1e2, float:-4.4405002E-21)
            int r2 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r0 = r13.A01
            X.E2y r0 = (X.C47452E2y) r0
            X.5Oz r1 = r0.A06
            r0 = 0
            r1.Epw(r0)
            com.instagram.user.model.User r0 = r14.A00
            r1.Epw(r0)
            r0 = 92434755(0x5827143, float:1.2266747E-35)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -625184986(0xffffffffdabc6f26, float:-2.65197523E16)
            goto L_0x003f
        L_0x008b:
            r0 = 636148184(0x25ead9d8, float:4.0740146E-16)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FWh r14 = (X.C50276FWh) r14
            r0 = 957107720(0x390c4e08, float:1.338051E-4)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r13.A01
            X.FYw r4 = (X.C50339FYw) r4
            X.G8v r7 = r4.A03
            if (r7 == 0) goto L_0x00ad
            java.lang.String r1 = r14.A00
            int r0 = r1.hashCode()
            r8 = 1
            switch(r0) {
                case -1867169789: goto L_0x00b7;
                case -753541113: goto L_0x01a8;
                case 3135262: goto L_0x0203;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            r0 = -986554809(0xffffffffc5325e47, float:-2853.8923)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1962259887(0xffffffff8b0a4a51, float:-2.6633743E-32)
            goto L_0x003f
        L_0x00b7:
            java.lang.String r0 = "success"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r7.Cb4(r8)
            if (r0 == 0) goto L_0x00d6
            X.0hq r1 = r7.B7v()
            java.lang.String r0 = "BLOCK_MUTATION_PROGRESS_DIALOG_FRAGMENT"
            androidx.fragment.app.Fragment r0 = r1.A0R(r0)
            X.0SM r0 = (X.0SM) r0
            if (r0 == 0) goto L_0x00d6
            r0.A08()
        L_0x00d6:
            java.lang.Integer r0 = r4.A06
            if (r0 == 0) goto L_0x017e
            int r0 = r0.intValue()
            if (r0 == r8) goto L_0x017e
            java.lang.Boolean r1 = r4.A05
            if (r1 == 0) goto L_0x017e
            X.17A r0 = r4.A00
            if (r0 == 0) goto L_0x017e
            java.lang.String r0 = r4.A08
            if (r0 == 0) goto L_0x017e
            X.G8B r0 = r4.A02
            if (r0 != 0) goto L_0x017e
            X.G7q r0 = r4.A01
            if (r0 == 0) goto L_0x018f
            X.G8v r0 = r4.A03
            android.content.Context r6 = r0.getContext()
            X.0lg r9 = r4.A09
            java.lang.Integer r0 = r4.A06
            int r10 = r0.intValue()
            java.lang.Boolean r0 = r4.A05
            boolean r0 = r0.booleanValue()
            r1 = r0 ^ 1
            X.17A r0 = r4.A00
            X.G7q r7 = r4.A01
            X.0qQ.A0B(r0, r8)
            java.lang.String r5 = r0.getFullName()
            java.lang.String r0 = r0.getUsername()
            if (r1 == 0) goto L_0x0187
            r1 = 2131952140(0x7f13020c, float:1.9540714E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
        L_0x0122:
            java.lang.String r5 = r6.getString(r1, r0)
            X.0qQ.A07(r5)
            r1 = 2
            r0 = 2131952137(0x7f130209, float:1.9540708E38)
            if (r10 != r1) goto L_0x0132
            r0 = 2131952138(0x7f13020a, float:1.954071E38)
        L_0x0132:
            java.lang.String r0 = r6.getString(r0)
            X.0qQ.A0A(r0)
            com.instagram.igds.components.headline.IgdsHeadline r1 = new com.instagram.igds.components.headline.IgdsHeadline
            r1.<init>(r6)
            r1.setHeadline((java.lang.CharSequence) r5)
            r1.setBody((java.lang.CharSequence) r0)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r6)
            r0.addView(r1)
            X.0qQ.A0B(r9, r8)
            X.Dg1 r5 = new X.Dg1
            r5.<init>(r6, r9)
            r5.A01 = r0
            r1 = 2131972171(0x7f13504b, float:1.9581342E38)
            r0 = 49
            X.FP4 r0 = X.FP4.A00(r7, r0)
            r5.A04(r0, r1)
            r1 = 2131957531(0x7f13171b, float:1.9551649E38)
            r0 = 50
            X.FP4 r0 = X.FP4.A00(r7, r0)
            r5.A02(r0, r1)
            r1 = 7
            X.IVE r0 = new X.IVE
            r0.<init>(r7, r1)
            r5.A03 = r0
            X.FFy r0 = new X.FFy
            r0.<init>(r5)
            r0.A05(r6)
        L_0x017e:
            X.G8B r0 = r4.A02
            if (r0 == 0) goto L_0x0229
            r0.onSuccess()
            goto L_0x0229
        L_0x0187:
            r1 = 2131952139(0x7f13020b, float:1.9540712E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}
            goto L_0x0122
        L_0x018f:
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x017e
            X.G8v r0 = r4.A03
            android.content.Context r6 = r0.getContext()
            r5 = 0
            java.lang.Integer r0 = r4.A06
            int r1 = r0.intValue()
            java.lang.String r0 = r4.A08
            X.FCZ.A02(r6, r5, r0, r1)
            goto L_0x017e
        L_0x01a8:
            r0 = 227(0xe3, float:3.18E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ad
            boolean r5 = r14.A02
            r0 = 0
            boolean r0 = r7.Cb4(r0)
            if (r0 == 0) goto L_0x01fa
            X.0hq r0 = r7.B7v()
            java.lang.String r9 = "BLOCK_MUTATION_PROGRESS_DIALOG_FRAGMENT"
            androidx.fragment.app.Fragment r0 = r0.A0R(r9)
            if (r0 != 0) goto L_0x01fa
            android.content.Context r1 = r7.getContext()
            r0 = 2131975844(0x7f135ea4, float:1.9588792E38)
            if (r5 == 0) goto L_0x01d5
            r0 = 2131953908(0x7f1308f4, float:1.95443E38)
        L_0x01d5:
            java.lang.String r6 = X.AnonymousClass7TE.A16(r1, r0)
            X.ERO r5 = new X.ERO
            r5.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "extra_progress_message"
            r1.putString(r0, r6)
            r0 = 720(0x2d0, float:1.009E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r1.putBoolean(r0, r8)
            r5.setArguments(r1)
            X.0hq r0 = r7.B7v()
            r5.A0B(r0, r9)
        L_0x01fa:
            X.G8B r0 = r4.A02
            if (r0 == 0) goto L_0x00ad
            r0.D5S()
            goto L_0x00ad
        L_0x0203:
            java.lang.String r0 = "fail"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r7.Cb4(r8)
            if (r0 == 0) goto L_0x0222
            X.0hq r1 = r7.B7v()
            java.lang.String r0 = "BLOCK_MUTATION_PROGRESS_DIALOG_FRAGMENT"
            androidx.fragment.app.Fragment r0 = r1.A0R(r0)
            X.0SM r0 = (X.0SM) r0
            if (r0 == 0) goto L_0x0222
            r0.A08()
        L_0x0222:
            X.G8B r0 = r4.A02
            if (r0 == 0) goto L_0x0229
            r0.DED()
        L_0x0229:
            r4.cleanUp()
            goto L_0x00ad
        L_0x022e:
            r0 = -18430266(0xfffffffffee6c6c6, float:-1.5337726E38)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FWS r14 = (X.FWS) r14
            r0 = -11516150(0xffffffffff50470a, float:-2.7684828E38)
            int r2 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r0 = r13.A01
            X.Der r0 = (X.C46430Der) r0
            X.Dex r1 = r0.A0E
            if (r1 == 0) goto L_0x08d9
            com.instagram.user.model.User r0 = r14.A00
            r1.A0D(r0)
            r0 = -404452461(0xffffffffe7e48b93, float:-2.1585485E24)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 1200177748(0x47894254, float:70276.66)
            goto L_0x003f
        L_0x0256:
            r0 = -17033919(0xfffffffffefc1541, float:-1.6753791E38)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -880560752(0xffffffffcb83b590, float:-1.7263392E7)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            X.ESI r1 = (X.ESI) r1
            X.0eM r0 = r1.A0E
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.ESI.A07(r0, r1)
            r0 = 1883357815(0x7041c277, float:2.398628E29)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 375448240(0x1660e2b0, float:1.8166106E-25)
            goto L_0x003f
        L_0x027c:
            r0 = -1972099166(0xffffffff8a7427a2, float:-1.1755627E-32)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1947567709(0xffffffff8bea79a3, float:-9.031654E-32)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r13.A01
            X.2YL r5 = (X.2YL) r5
            X.6oS r4 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 5
            X.MFx r0 = new X.MFx
            r0.<init>(r5, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r4)
            r0 = -970107766(0xffffffffc62d548a, float:-11093.135)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 2001950055(0x77535567, float:4.2863547E33)
            goto L_0x003f
        L_0x02a7:
            r0 = 69620166(0x42651c6, float:1.9550755E-36)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1505268619(0xffffffffa6476c75, float:-6.918898E-16)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r13.A01
            X.2YL r5 = (X.2YL) r5
            X.6oS r4 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 2
            X.MFx r0 = new X.MFx
            r0.<init>(r5, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r4)
            r0 = 613504301(0x2491552d, float:6.302802E-17)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1917880667(0x7250895b, float:4.1304918E30)
            goto L_0x003f
        L_0x02d2:
            r0 = -1279155086(0xffffffffb3c1a472, float:-9.017175E-8)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FWU r14 = (X.FWU) r14
            r0 = -1296695049(0xffffffffb2b600f7, float:-2.1188027E-8)
            int r7 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r0 = r13.A01
            com.instagram.profilecard.domain.ProfileCardViewModel r0 = (com.instagram.profilecard.domain.ProfileCardViewModel) r0
            X.05G r6 = r0.A0K
        L_0x02e8:
            java.lang.Object r5 = r6.getValue()
            r4 = r5
            X.GnU r4 = (X.C53397GnU) r4
            r2 = 0
            X.3qt r0 = r14.A00
            if (r0 == 0) goto L_0x02fa
            java.lang.String r1 = r0.Bjf()
            if (r1 != 0) goto L_0x02fc
        L_0x02fa:
            java.lang.String r1 = ""
        L_0x02fc:
            r0 = 8388479(0x7fff7f, float:1.1754763E-38)
            X.GnU r0 = X.C53397GnU.A00((com.instagram.common.typedurl.ImageUrl) null, (com.instagram.common.typedurl.ImageUrl) null, (X.C56532I0d) null, r4, (java.lang.Integer) null, (java.lang.String) null, r2, (java.lang.String) null, r2, r1, (java.util.Map) null, 0.0f, 0.0f, 0.0f, r0, false, false, false, false, false, false, false, false, false, false)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x02e8
            r0 = -1331569558(0xffffffffb0a1dc6a, float:-1.1776937E-9)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -746547807(0xffffffffd38095a1, float:-1.10453234E12)
            goto L_0x003f
        L_0x0314:
            r0 = -1205861143(0xffffffffb82004e9, float:-3.8151546E-5)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FWj r14 = (X.C50278FWj) r14
            r0 = -2104064932(0xffffffff8296845c, float:-2.211649E-37)
            int r5 = X.AnonymousClass7TG.A0D(r14, r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r14.A01
            if (r0 == 0) goto L_0x0344
            java.util.Iterator r1 = r0.iterator()
        L_0x0330:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0344
            java.lang.Object r0 = r1.next()
            X.3qn r0 = (X.C253443qn) r0
            X.3qm r0 = r0.FD6()
            r4.add(r0)
            goto L_0x0330
        L_0x0344:
            java.lang.Object r2 = r13.A01
            com.instagram.profilecard.domain.ProfileCardViewModel r2 = (com.instagram.profilecard.domain.ProfileCardViewModel) r2
            java.util.ArrayList r1 = com.instagram.profilecard.domain.ProfileCardViewModel.A01(r4)
            X.0Ud r0 = r2.A0L
            java.lang.Object r0 = r0.getValue()
            X.GnU r0 = (X.C53397GnU) r0
            java.util.Map r0 = r0.A0B
            java.util.LinkedHashMap r4 = X.0Yt.A03(r0)
            X.EVW r0 = X.EVW.CUSTOM_LINK
            r4.put(r0, r1)
            X.05G r2 = r2.A0K
        L_0x0361:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.GnU r0 = (X.C53397GnU) r0
            X.GnU r0 = X.C53397GnU.A00((com.instagram.common.typedurl.ImageUrl) null, (com.instagram.common.typedurl.ImageUrl) null, (X.C56532I0d) null, r0, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r4, 0.0f, 0.0f, 0.0f, 8388591, false, false, false, false, false, false, false, false, false, false)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0361
            r0 = -1859577936(0xffffffff912917b0, float:-1.3339049E-28)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1948356832(0x742190e0, float:5.1202283E31)
            goto L_0x003f
        L_0x037d:
            r0 = 647462196(0x26977d34, float:1.0511666E-15)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -2086969154(0xffffffff839b60be, float:-9.132292E-37)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            com.instagram.profile.fragment.UserDetailFragment r1 = (com.instagram.profile.fragment.UserDetailFragment) r1
            r0 = 0
            r1.A14(r0, r0, r0)
            r0 = -56429275(0xfffffffffca2f525, float:-6.768994E36)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1059818875(0xffffffffc0d47285, float:-6.6389794)
            goto L_0x003f
        L_0x039e:
            r0 = -959642523(0xffffffffc6cd0465, float:-26242.197)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -243844633(0xfffffffff17739e7, float:-1.22420475E30)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.A01
            X.DcA r0 = (X.DcA) r0
            X.DcA.A00(r0)
            r0 = -567127933(0xffffffffde325083, float:-3.21222844E18)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 969795548(0x39cde7dc, float:3.9273396E-4)
            goto L_0x003f
        L_0x03be:
            r0 = 380600363(0x16af802b, float:2.835366E-25)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FWb r14 = (X.C50270FWb) r14
            r0 = -127312051(0xfffffffff8695f4d, float:-1.8933408E34)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            X.Dib r2 = (X.C46656Dib) r2
            com.instagram.user.model.User r0 = r2.A0q
            java.lang.String r1 = r14.A00
            X.4Cl r0 = r0.A03
            r0.ENW(r1)
            android.widget.TextView r0 = r2.A0E
            if (r0 == 0) goto L_0x03e2
            r0.setText(r1)
        L_0x03e2:
            r0 = 328889169(0x139a7351, float:3.8988776E-27)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1775593538(0xffffffff962a97be, float:-1.3780372E-25)
            goto L_0x003f
        L_0x03ed:
            r0 = 1651900573(0x6276009d, float:1.1344858E21)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.2Cy r14 = (X.2Cy) r14
            r0 = -1617902319(0xffffffff9f90c511, float:-6.131239E-20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            X.Dib r1 = (X.C46656Dib) r1
            com.instagram.user.model.User r0 = r14.A00
            r1.A0q = r0
            r0 = 910330877(0x36428bfd, float:2.8989737E-6)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 1711752806(0x66074666, float:1.5970452E23)
            goto L_0x003f
        L_0x0410:
            r0 = 17799383(0x10f98d7, float:2.637461E-38)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FWW r14 = (X.FWW) r14
            r0 = 85168854(0x51392d6, float:6.938876E-36)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r13.A01
            X.Dib r4 = (X.C46656Dib) r4
            r0 = 1
            r4.A15 = r0
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            java.lang.String r1 = r14.A00
            com.instagram.common.session.UserSession r0 = r4.A0V
            X.FCN.A01(r2, r0, r1)
            r0 = -1845192590(0xffffffff92049872, float:-4.183976E-28)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1032410637(0x3d89560d, float:0.06705866)
            goto L_0x003f
        L_0x043d:
            r0 = 1935802877(0x736201fd, float:1.790618E31)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -803247401(0xffffffffd01f6ad7, float:-1.06983168E10)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.C46656Dib.A0C(r0)
            r0 = -1301101088(0xffffffffb272c5e0, float:-1.41312455E-8)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1411078134(0x541b57f6, float:2.66878268E12)
            goto L_0x003f
        L_0x045d:
            r0 = -1846635644(0xffffffff91ee9384, float:-3.7640693E-28)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -472664942(0xffffffffe3d3b492, float:-7.810549E21)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.C46656Dib.A0C(r0)
            r0 = 1583789694(0x5e66b67e, float:4.1561534E18)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -2009562691(0xffffffff883881bd, float:-5.5522993E-34)
            goto L_0x003f
        L_0x047d:
            r0 = 922730834(0x36ffc152, float:7.6220977E-6)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FWe r14 = (X.C50273FWe) r14
            r0 = 89710272(0x558dec0, float:1.0197184E-35)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            X.Dib r2 = (X.C46656Dib) r2
            X.F1D r1 = r2.A0e
            r1.getClass()
            int r0 = r14.A00
            r1.A00 = r0
            X.F1D r1 = r2.A0e
            boolean r0 = r2.A17
            if (r0 == 0) goto L_0x04b2
            java.lang.String r0 = r14.A01
        L_0x04a2:
            r1.A0C = r0
            X.C46656Dib.A09(r2)
            r0 = -1936972681(0xffffffff8c8c2477, float:-2.1592362E-31)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 193806048(0xb8d3ee0, float:5.440583E-32)
            goto L_0x003f
        L_0x04b2:
            r0 = 0
            goto L_0x04a2
        L_0x04b4:
            r0 = -2138235224(0xffffffff808d1ea8, float:-1.2959802E-38)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FWX r14 = (X.FWX) r14
            r0 = 1365546515(0x51649613, float:6.1360648E10)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            X.Dib r2 = (X.C46656Dib) r2
            X.F1D r1 = r2.A0e
            r1.getClass()
            java.lang.String r0 = r14.A00
            r1.A0M = r0
            X.C46656Dib.A08(r2)
            r0 = -347793913(0xffffffffeb451607, float:-2.382624E26)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -454012919(0xffffffffe4f05009, float:-3.5463886E22)
            goto L_0x003f
        L_0x04df:
            r0 = 1419016642(0x549479c2, float:5.1015833E12)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FWV r14 = (X.FWV) r14
            r0 = 558819736(0x214ee998, float:7.0104674E-19)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            X.Dib r2 = (X.C46656Dib) r2
            X.F1D r1 = r2.A0e
            r1.getClass()
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r1.A07 = r0
            X.F1D r1 = r2.A0e
            java.lang.String r0 = r14.A00
            r1.A0D = r0
            X.C46656Dib.A07(r2)
            r0 = 1146613863(0x4457f067, float:863.7563)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1136781356(0xffffffffbc3e17d4, float:-0.011602361)
            goto L_0x003f
        L_0x0512:
            r0 = 1079498815(0x4057d83f, float:3.3725736)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.3DP r14 = (X.AnonymousClass3DP) r14
            r0 = -666463104(0xffffffffd8469480, float:-8.7336442E14)
            int r5 = X.AnonymousClass0fD.A03(r0)
            boolean r0 = r14.A04
            java.lang.Object r4 = r13.A01
            X.Dib r4 = (X.C46656Dib) r4
            if (r0 == 0) goto L_0x0538
            X.C46656Dib.A0C(r4)
        L_0x052d:
            r0 = -859832929(0xffffffffccbffd9f, float:-1.00658424E8)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 518100952(0x1ee197d8, float:2.3885603E-20)
            goto L_0x003f
        L_0x0538:
            X.F1D r1 = r4.A0e
            r1.getClass()
            java.lang.String r0 = r14.A02
            r1.A0M = r0
            X.F1D r2 = r4.A0e
            java.lang.String r0 = r14.A00
            r2.A0B = r0
            java.lang.String r0 = r14.A01
            r2.A0H = r0
            r0 = 0
            r2.A0Z = r0
            android.widget.TextView r1 = r4.A0M
            if (r1 == 0) goto L_0x052d
            java.lang.String r0 = r2.A0M
            r1.setText(r0)
            goto L_0x052d
        L_0x0558:
            r0 = 486531972(0x1cffe384, float:1.6933296E-21)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.2Cy r14 = (X.2Cy) r14
            r0 = -11622917(0xffffffffff4ea5fb, float:-2.7468279E38)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r13.A01
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r2 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r2
            com.instagram.user.model.User r0 = r14.A00
            r2.A05 = r0
            r0 = 1
            r2.A07 = r0
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment.A02(r2)
            X.F1D r1 = r2.A03
            if (r1 == 0) goto L_0x0582
            com.instagram.user.model.User r0 = r2.A05
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            r1.A05 = r0
        L_0x0582:
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment.A01(r2)
            r0 = 32719138(0x1f34122, float:8.9357563E-38)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -508529438(0xffffffffe1b074e2, float:-4.0688116E20)
            goto L_0x003f
        L_0x0590:
            r0 = -1488570770(0xffffffffa746366e, float:-2.7507526E-15)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1384702842(0xffffffffad771c86, float:-1.4046658E-11)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r0
            com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController r0 = r0.A03
            if (r0 == 0) goto L_0x05b3
            com.instagram.igds.components.form.IgFormField r0 = r0.usernameField
            if (r0 == 0) goto L_0x05b3
            java.lang.String r0 = X.Dbm.A01()
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x05b3:
            r0 = 1310963900(0x4e23b8bc, float:6.8669824E8)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -234116245(0xfffffffff20bab6b, float:-2.7664415E30)
            goto L_0x003f
        L_0x05be:
            r0 = 1566678134(0x5d619c76, float:1.01606241E18)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FWf r14 = (X.C50274FWf) r14
            r0 = -2037847835(0xffffffff8688e8e5, float:-5.149972E-35)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r14, r6)
            java.lang.Object r4 = r13.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r4 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r4
            com.instagram.user.model.User r2 = r4.A04
            if (r2 != 0) goto L_0x05e5
            r0 = 825166165(0x312f0955, float:2.5471156E-9)
        L_0x05dd:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -112215184(0xfffffffff94fbb70, float:-6.7412946E34)
            goto L_0x003f
        L_0x05e5:
            boolean r0 = r14.A02
            X.4Cl r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.EdW(r0)
            int r0 = r14.A00
            X.4Cl r1 = r2.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.EdV(r0)
            com.instagram.common.session.UserSession r0 = r4.A0A
            X.17i r1 = X.17h.A00(r0)
            r0 = 1
            r1.A01(r2, r0, r6)
            com.instagram.profile.edit.controller.EditProfileFieldsController.A05(r4)
            r0 = -1766053324(0xffffffff96bc2a34, float:-3.0399672E-25)
            goto L_0x05dd
        L_0x060c:
            r0 = -1992823970(0xffffffff8937eb5e, float:-2.2138493E-33)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 1934453873(0x734d6c71, float:1.6275334E31)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r13.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r4 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r4
            android.view.View r0 = r4.view
            if (r0 != 0) goto L_0x062d
            r0 = -932355181(0xffffffffc86d6393, float:-243086.3)
        L_0x0625:
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 640908393(0x26337c69, float:6.227171E-16)
            goto L_0x003f
        L_0x062d:
            X.F1D r0 = r4.A01
            if (r0 != 0) goto L_0x08e3
            r0 = 1945251981(0x73f2308d, float:3.8376482E31)
            goto L_0x0625
        L_0x0635:
            r0 = 1284931339(0x4c967f0b, float:7.8903384E7)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FWU r14 = (X.FWU) r14
            r0 = -672310621(0xffffffffd7ed5aa3, float:-5.21947075E14)
            int r4 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r2 = r13.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r2 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r2
            X.F1D r1 = r2.A01
            if (r1 == 0) goto L_0x0655
            X.3qt r0 = r14.A00
            X.3qs r0 = r0.FCr()
            r1.A04 = r0
        L_0x0655:
            r2.A09()
            X.G8A r0 = r2.A02
            if (r0 != 0) goto L_0x0666
            java.lang.String r0 = "dataProvider"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0666:
            X.G98 r0 = r0.Bgm()
            r0.DFS()
            r0 = 369957495(0x160d1a77, float:1.139824E-25)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1538496927(0x5bb3999f, float:1.01105858E17)
            goto L_0x003f
        L_0x0678:
            r0 = 1293686008(0x4d1c14f8, float:1.63663744E8)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FWj r14 = (X.C50278FWj) r14
            r0 = -1633899202(0xffffffff9e9cad3e, float:-1.6588794E-20)
            int r6 = X.AnonymousClass7TG.A0D(r14, r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.List r2 = r14.A01
            if (r2 == 0) goto L_0x06a8
            java.util.Iterator r1 = r2.iterator()
        L_0x0694:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06a8
            java.lang.Object r0 = r1.next()
            X.3qn r0 = (X.C253443qn) r0
            X.3qm r0 = r0.FD6()
            r4.add(r0)
            goto L_0x0694
        L_0x06a8:
            java.lang.Object r0 = r13.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r0
            X.F1D r5 = r0.A01
            if (r5 == 0) goto L_0x06c1
            r5.A0Q = r4
            r4 = 0
            if (r2 == 0) goto L_0x06bf
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x06cc
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x06cc
        L_0x06bf:
            r5.A0b = r4
        L_0x06c1:
            r0 = -1591330718(0xffffffffa1263862, float:-5.631761E-19)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1408905080(0xffffffffac05d088, float:-1.9016195E-12)
            goto L_0x003f
        L_0x06cc:
            java.util.Iterator r2 = r2.iterator()
        L_0x06d0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06bf
            java.lang.Object r0 = r2.next()
            X.3qn r0 = (X.C253443qn) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK
            if (r1 != r0) goto L_0x06d0
            r4 = 1
            goto L_0x06bf
        L_0x06e6:
            r0 = -1905098532(0xffffffff8e7280dc, float:-2.9890847E-30)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.376 r14 = (X.AnonymousClass376) r14
            r0 = -1631029627(0xffffffff9ec87685, float:-2.1224842E-20)
            int r5 = X.AnonymousClass7TG.A0D(r14, r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r7 = r13.A01
            X.EO2 r7 = (X.EO2) r7
            X.0eM r6 = r7.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.user.model.User r4 = r1.A01(r0)
            java.util.List r0 = r14.A04
            X.0qQ.A06(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x070f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x074b
            java.lang.Object r1 = r2.next()
            com.instagram.model.reels.Reel r1 = (com.instagram.model.reels.Reel) r1
            X.1Ns r0 = r1.A0W
            if (r0 == 0) goto L_0x0749
            java.lang.String r0 = r0.getId()
        L_0x0723:
            boolean r0 = X.DbV.A1Z(r4, r0)
            if (r0 == 0) goto L_0x070f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            java.util.List r0 = r1.A0O(r0)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x070f
            X.DlJ r0 = X.EO2.A00(r7)
            r0.A02()
            r0 = 9983932(0x9857bc, float:1.3990469E-38)
        L_0x0741:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1025388932(0x3d1e3184, float:0.03862144)
            goto L_0x003f
        L_0x0749:
            r0 = 0
            goto L_0x0723
        L_0x074b:
            r0 = -862024979(0xffffffffcc9e8aed, float:-8.3122024E7)
            goto L_0x0741
        L_0x074f:
            r0 = -1932685645(0xffffffff8ccd8eb3, float:-3.1671135E-31)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.WQ9 r14 = (X.WQ9) r14
            r0 = 1431098965(0x554cd655, float:1.40763076E13)
            int r4 = X.AnonymousClass7TG.A0D(r14, r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r2 = r13.A01
            X.EO2 r2 = (X.EO2) r2
            X.0eM r0 = r2.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.user.model.User r1 = r1.A01(r0)
            X.3uh r0 = r14.A00
            com.instagram.user.model.User r0 = r0.A0i
            java.lang.String r0 = X.DbX.A0r(r0)
            boolean r0 = X.DbV.A1Z(r1, r0)
            if (r0 == 0) goto L_0x078f
            X.DlJ r0 = X.EO2.A00(r2)
            r0.A02()
            r0 = -341566188(0xffffffffeba41d14, float:-3.968023E26)
        L_0x0787:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1618092825(0x60722319, float:6.9791267E19)
            goto L_0x003f
        L_0x078f:
            r0 = -1559363805(0xffffffffa30dff23, float:-7.697653E-18)
            goto L_0x0787
        L_0x0793:
            r0 = -1663950400(0xffffffff9cd221c0, float:-1.3905358E-21)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 1916743838(0x723f309e, float:3.7869063E30)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.A01
            X.EO2 r0 = (X.EO2) r0
            X.DlJ r4 = X.EO2.A00(r0)
            java.lang.String r2 = r4.A00
            if (r2 == 0) goto L_0x07b6
            X.6oS r1 = X.C318116oQ.A00(r4)
            r0 = 8
            X.DbX.A1W(r4, r2, r1, r0)
        L_0x07b6:
            r0 = -2092605773(0xffffffff83455eb3, float:-5.8001806E-37)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1442617522(0x55fc98b2, float:3.47165939E13)
            goto L_0x003f
        L_0x07c1:
            r0 = -2038480668(0xffffffff867f40e4, float:-4.8007844E-35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.36g r14 = (X.C2370836g) r14
            r0 = -1692247779(0xffffffff9b22591d, float:-1.342912E-22)
            int r1 = X.AnonymousClass0fD.A03(r0)
            com.instagram.user.model.User r5 = r14.A00
            com.instagram.user.model.FollowStatus r2 = r5.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r2 == r0) goto L_0x0820
            com.instagram.user.model.FollowStatus r2 = r5.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            if (r2 == r0) goto L_0x0820
            java.lang.Object r4 = r13.A01
            X.E6T r4 = (X.E6T) r4
            java.util.Set r0 = r4.A0H
            r0.remove(r5)
        L_0x07ec:
            java.lang.String r2 = r5.getId()
            java.lang.String r7 = "follow_user"
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A04
            if (r0 == 0) goto L_0x0815
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            r0 = 3143(0xc47, float:4.404E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r11.put(r0, r2)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A04
            java.lang.String r5 = "invite_followers_via_suma_followings"
            r8 = 0
            java.lang.String r6 = r4.A07
            X.Xtl r4 = new X.Xtl
            r9 = r8
            r10 = r8
            r12 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.Ckp(r4)
        L_0x0815:
            r0 = 1412558333(0x5431edfd, float:3.05680797E12)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -1579686085(0xffffffffa1d7e73b, float:-1.4630173E-18)
            goto L_0x003f
        L_0x0820:
            java.lang.Object r4 = r13.A01
            X.E6T r4 = (X.E6T) r4
            java.util.Set r0 = r4.A0H
            r0.add(r5)
            goto L_0x07ec
        L_0x082a:
            r0 = -47009988(0xfffffffffd32af3c, float:-1.4844528E37)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.2Cy r14 = (X.2Cy) r14
            r0 = -538574532(0xffffffffdfe6013c, float:-3.3147188E19)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            X.Dev r1 = (X.C46433Dev) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x084d
            com.instagram.user.model.User r0 = r14.A00
            boolean r0 = r0.CPm()
            if (r0 == 0) goto L_0x084d
            r1.A00()
        L_0x084d:
            r0 = 589858678(0x23288776, float:9.135983E-18)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 1660756734(0x62fd22fe, float:2.3347739E21)
            goto L_0x003f
        L_0x0858:
            r0 = 801406501(0x2fc47e25, float:3.5741823E-10)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.6qz r14 = (X.C319666qz) r14
            r0 = -1139381319(0xffffffffbc166bb9, float:-0.0091809565)
            int r2 = X.AnonymousClass7TG.A0D(r14, r0)
            X.3UM r1 = r14.A00
            java.lang.Object r0 = r13.A01
            X.E6m r0 = (X.C47526E6m) r0
            X.E9L r0 = r0.A00
            if (r0 != 0) goto L_0x087c
            java.lang.String r0 = "accountDiscoveryAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x087c:
            r0.A01(r1)
            r0 = 1721475458(0x669ba182, float:3.6747305E23)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 1362861656(0x513b9e58, float:5.0363466E10)
            goto L_0x003f
        L_0x088a:
            r0 = -749582918(0xffffffffd35245ba, float:-9.0311295E11)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -370557207(0xffffffffe9e9bee9, float:-3.5322658E25)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r13.A01
            X.H1y r1 = (X.C54178H1y) r1
            r0 = 1
            X.C54178H1y.A00(r1, r0)
            r0 = -155894302(0xfffffffff6b53de2, float:-1.8380095E33)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 1979315754(0x75f9f62a, float:6.337279E32)
            goto L_0x003f
        L_0x08ab:
            r0 = -716688607(0xffffffffd5483321, float:-1.37576202E13)
            X.AnonymousClass0fD.A03(r0)
            r0 = -1053918457(0xffffffffc12e7b07, float:-10.905036)
            X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.A01
            X.Der r0 = (X.C46430Der) r0
            X.Dex r0 = r0.A0E
            if (r0 == 0) goto L_0x08d9
            java.lang.String r0 = "getUser"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x08c6:
            r0 = -861977203(0xffffffffcc9f458d, float:-8.3504232E7)
            X.AnonymousClass0fD.A03(r0)
            r0 = -1826809818(0xffffffff931d1826, float:-1.9828092E-27)
            X.AnonymousClass0fD.A03(r0)
            java.lang.String r0 = "user"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x08d9:
            java.lang.String r0 = "followListAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x08e3:
            com.instagram.common.session.UserSession r3 = r4.A0A
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36318136081323912(0x81072700081788, double:3.031073727000535E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x08ff
            X.F1D r0 = r4.A01
            if (r0 == 0) goto L_0x08ff
            java.lang.String r0 = "name"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x08ff:
            java.lang.String r0 = "name"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FX1.onEvent(java.lang.Object):void");
    }
}
