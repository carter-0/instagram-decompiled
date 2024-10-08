package X;

/* renamed from: X.G0f  reason: case insensitive filesystem */
public final class C51763G0f extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51763G0f(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        r2 = (X.C46748Dkb) r4.A03.getValue();
        X.Dba.A1S(r2, r2.A01, 38, r3);
        X.DbZ.A15(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014c, code lost:
        r3.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a2, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0268;
                case 1: goto L_0x025a;
                case 2: goto L_0x0250;
                case 3: goto L_0x0246;
                case 4: goto L_0x023c;
                case 5: goto L_0x022b;
                case 6: goto L_0x020f;
                case 7: goto L_0x01fe;
                case 8: goto L_0x01ee;
                case 9: goto L_0x01e4;
                case 10: goto L_0x01da;
                case 11: goto L_0x01ce;
                case 12: goto L_0x01b7;
                case 13: goto L_0x01ad;
                case 14: goto L_0x01a3;
                case 15: goto L_0x0187;
                case 16: goto L_0x017f;
                case 17: goto L_0x0281;
                case 18: goto L_0x0281;
                case 19: goto L_0x0281;
                case 20: goto L_0x027e;
                case 21: goto L_0x0160;
                case 22: goto L_0x0150;
                case 23: goto L_0x013b;
                case 24: goto L_0x012a;
                case 25: goto L_0x012a;
                case 26: goto L_0x0117;
                case 27: goto L_0x00e2;
                case 28: goto L_0x00d6;
                case 29: goto L_0x00c6;
                case 30: goto L_0x027e;
                case 31: goto L_0x00bf;
                case 32: goto L_0x0005;
                case 33: goto L_0x00a5;
                case 34: goto L_0x0095;
                case 35: goto L_0x008c;
                case 36: goto L_0x008c;
                case 37: goto L_0x027e;
                case 38: goto L_0x00bf;
                case 39: goto L_0x0005;
                case 40: goto L_0x007b;
                case 41: goto L_0x0062;
                case 42: goto L_0x005c;
                case 43: goto L_0x003b;
                case 44: goto L_0x002b;
                case 45: goto L_0x027e;
                case 46: goto L_0x00bf;
                case 47: goto L_0x0005;
                case 48: goto L_0x001b;
                case 49: goto L_0x000c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.07f r1 = X.DbY.A0I(r0)
            return r1
        L_0x000c:
            java.lang.Object r0 = r5.A01
            X.E5V r0 = (X.E5V) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6ud r1 = X.C321706uc.A00(r0)
            return r1
        L_0x001b:
            java.lang.Object r0 = r5.A01
            X.E0d r0 = (X.E0d) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EEn r1 = new X.EEn
            r1.<init>(r0)
            return r1
        L_0x002b:
            java.lang.Object r2 = r5.A01
            X.E0d r2 = (X.E0d) r2
            X.0eM r0 = r2.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.VgC r1 = new X.VgC
            r1.<init>(r2, r0)
            return r1
        L_0x003b:
            java.lang.Object r2 = r5.A01
            X.E0d r2 = (X.E0d) r2
            android.os.Bundle r1 = r2.mArguments
            if (r1 == 0) goto L_0x005a
            r0 = 376(0x178, float:5.27E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x005a
            X.0eM r0 = r2.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.model.reels.Reel r1 = X.Dba.A0L(r0, r1)
            return r1
        L_0x005a:
            r1 = 0
            return r1
        L_0x005c:
            java.lang.Object r4 = r5.A01
            X.E0d r4 = (X.E0d) r4
            r3 = 0
            goto L_0x0067
        L_0x0062:
            java.lang.Object r4 = r5.A01
            X.E0d r4 = (X.E0d) r4
            r3 = 1
        L_0x0067:
            X.0eM r0 = r4.A03
            java.lang.Object r2 = r0.getValue()
            X.Dkb r2 = (X.C46748Dkb) r2
            X.4Cq r1 = r2.A01
            r0 = 38
            X.Dba.A1S(r2, r1, r0, r3)
            X.DbZ.A15(r4)
            goto L_0x01a0
        L_0x007b:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.fanclub.api.FanClubApi r2 = new com.instagram.fanclub.api.FanClubApi
            r2.<init>(r0)
            X.12T r0 = X.AnonymousClass12T.A00
            X.6x6 r1 = new X.6x6
            r1.<init>(r0, r2)
            return r1
        L_0x008c:
            java.lang.Object r0 = r5.A01
            X.E35 r0 = (X.E35) r0
            X.E35.A02(r0)
            goto L_0x01a0
        L_0x0095:
            java.lang.Object r0 = r5.A01
            X.E35 r0 = (X.E35) r0
            X.0eM r0 = r0.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EEm r1 = new X.EEm
            r1.<init>(r0)
            return r1
        L_0x00a5:
            java.lang.Object r1 = r5.A01
            X.4mT r1 = (X.C273374mT) r1
            com.google.common.collect.ImmutableList r0 = X.C47532E6t.A02
            com.instagram.common.session.UserSession r2 = r1.getSession()
            android.os.Bundle r1 = r1.requireArguments()
            java.lang.String r0 = "ContactOptionsFragment.USER_ID"
            java.lang.String r0 = X.C320236s2.A01(r1, r0)
            X.EF3 r1 = new X.EF3
            r1.<init>(r2, r0)
            return r1
        L_0x00bf:
            java.lang.Object r0 = r5.A01
            java.lang.Object r1 = X.DbT.A0r(r0)
            return r1
        L_0x00c6:
            java.lang.Object r0 = r5.A01
            X.E1U r0 = (X.E1U) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Dkh r1 = new X.Dkh
            r1.<init>(r0)
            return r1
        L_0x00d6:
            java.lang.Object r0 = r5.A01
            X.Dkh r0 = (X.C46754Dkh) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.Eui r1 = new X.Eui
            r1.<init>(r0)
            return r1
        L_0x00e2:
            java.lang.Object r0 = r5.A01
            X.DfQ r0 = (X.C46462DfQ) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316388029501739(0x8105900006112b, double:3.029968251989353E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00f8
            X.6wu r1 = X.C323076wu.GraphQLWithDefer
            return r1
        L_0x00f8:
            r0 = 36316388029370665(0x81059000041129, double:3.029968251906461E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0106
            X.6wu r1 = X.C323076wu.GraphQL
            return r1
        L_0x0106:
            r0 = 36316388029239591(0x81059000021127, double:3.0299682518235694E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0114
            X.6wu r1 = X.C323076wu.ApiStreaming
            return r1
        L_0x0114:
            X.6wu r1 = X.C323076wu.LegacyApi
            return r1
        L_0x0117:
            java.lang.Object r2 = r5.A01
            X.6po r2 = (X.C318956po) r2
            X.3oV r0 = r2.A0A
            if (r0 == 0) goto L_0x0128
            android.view.View r1 = r0.getView()
        L_0x0123:
            r0 = 1
            r2.A05(r1, r0)
            goto L_0x01a0
        L_0x0128:
            r1 = 0
            goto L_0x0123
        L_0x012a:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.String r1 = r0.A06
            r0 = 1
            X.6su r2 = new X.6su
            r2.<init>(r1, r0)
            goto L_0x014c
        L_0x013b:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.String r1 = r0.A06
            X.5m9 r0 = X.C294255m9.A04
            X.6uk r2 = new X.6uk
            r2.<init>(r0, r1)
        L_0x014c:
            r3.A00(r2)
            goto L_0x01a0
        L_0x0150:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.F3s r2 = X.C49061Eof.A00(r0)
            X.EWT r1 = X.EWT.PIN_POST_FLOW
            java.lang.String r0 = ""
            r2.A04(r1, r0)
            goto L_0x01a0
        L_0x0160:
            java.lang.Object r4 = r5.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r4)
            java.lang.String r2 = r4.A06
            X.5m9 r1 = X.C294255m9.A04
            X.6uk r0 = new X.6uk
            r0.<init>(r1, r2)
            r3.A00(r0)
            X.F3s r2 = X.C49061Eof.A00(r4)
            X.EWT r1 = X.EWT.PIN_POST_FLOW
            r0 = 0
            r2.A01(r1, r0)
            goto L_0x01a0
        L_0x017f:
            java.lang.Object r0 = r5.A01
            X.70J r0 = (X.AnonymousClass70J) r0
            r0.A04()
            goto L_0x01a0
        L_0x0187:
            java.lang.Object r0 = r5.A01
            com.instagram.profile.fragment.UserDetailFragment r0 = (com.instagram.profile.fragment.UserDetailFragment) r0
            r0.A0q()
            X.6x7 r0 = r0.A0x
            if (r0 == 0) goto L_0x01a0
            X.710 r2 = r0.BhL()
            r1 = 0
            r0 = 930(0x3a2, float:1.303E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.DRV(r0, r1)
        L_0x01a0:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x01a3:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.F3s r1 = new X.F3s
            r1.<init>(r0)
            return r1
        L_0x01ad:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6uP r1 = new X.6uP
            r1.<init>(r0)
            return r1
        L_0x01b7:
            java.lang.Object r0 = r5.A01
            X.Dks r0 = (X.C46765Dks) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 3
            X.MMK r1 = new X.MMK
            r1.<init>(r2, r0)
            java.lang.Class<X.KWP> r0 = X.KWP.class
            java.lang.Object r1 = r2.A01(r0, r1)
            return r1
        L_0x01ce:
            java.lang.Object r0 = r5.A01
            X.0kT r0 = (X.0kT) r0
            android.content.Context r0 = r0.context
            X.12I r1 = new X.12I
            r1.<init>(r0)
            return r1
        L_0x01da:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.WPe r1 = new X.WPe
            r1.<init>(r0)
            return r1
        L_0x01e4:
            java.lang.Object r0 = r5.A01
            X.0lg r0 = (X.0lg) r0
            X.3Gh r1 = new X.3Gh
            r1.<init>(r0)
            return r1
        L_0x01ee:
            java.lang.Object r3 = r5.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325832662398210(0x810e2700033502, double:3.035941075863565E-306)
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r1
        L_0x01fe:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A2o
            java.lang.Class<X.Twt> r0 = X.C14471Twt.class
            X.3Fv r1 = r2.A02(r1, r0)
            return r1
        L_0x020f:
            java.lang.Object r0 = r5.A01
            X.Twt r0 = (X.C14471Twt) r0
            X.0eM r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.3Fv r0 = (X.C239283Fv) r0
            X.0r6 r2 = r0.Aap()
            r1 = 16
            X.FxC r0 = new X.FxC
            r0.<init>((X.AnonymousClass0r6) r2, (int) r1)
            X.0r6 r1 = X.AnonymousClass11E.A01(r0)
            return r1
        L_0x022b:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A2o
            java.lang.Class<X.Twt> r0 = X.C14471Twt.class
            X.0xa r1 = r2.A04(r1, r0)
            return r1
        L_0x023c:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Twt r1 = new X.Twt
            r1.<init>(r0)
            return r1
        L_0x0246:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3UF r1 = new X.3UF
            r1.<init>(r0)
            return r1
        L_0x0250:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.L2B r1 = new X.L2B
            r1.<init>(r0)
            return r1
        L_0x025a:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Am r0 = X.1Al.A01(r0)
            X.A4M r1 = new X.A4M
            r1.<init>(r0)
            return r1
        L_0x0268:
            java.lang.Object r3 = r5.A01
            X.LvP r3 = (X.C65549LvP) r3
            X.3Fv r0 = r3.A00
            X.0r6 r2 = r0.Aap()
            r1 = 11
            X.MC0 r0 = new X.MC0
            r0.<init>(r1, r3, r2)
            X.0r6 r1 = X.AnonymousClass11E.A01(r0)
            return r1
        L_0x027e:
            java.lang.Object r1 = r5.A01
            return r1
        L_0x0281:
            java.lang.Object r0 = r5.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r0
            X.F1D r1 = r0.A01
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51763G0f.invoke():java.lang.Object");
    }
}
