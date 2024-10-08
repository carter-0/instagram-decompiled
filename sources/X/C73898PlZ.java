package X;

/* renamed from: X.PlZ  reason: case insensitive filesystem */
public final class C73898PlZ extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73898PlZ(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73898PlZ(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ca, code lost:
        return X.C66584MXp.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0194, code lost:
        return r1.requireViewById(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0208, code lost:
        X.HBP.A00(new com.instagram.friendmap.data.MapText.Res(r2, new java.lang.String[0]), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021a, code lost:
        r0 = new X.PGZ(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0248, code lost:
        r2.A0P(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0259, code lost:
        r2.A0W(r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x026b, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x0005;
                case 2: goto L_0x002a;
                case 3: goto L_0x0042;
                case 4: goto L_0x004a;
                case 5: goto L_0x0052;
                case 6: goto L_0x000c;
                case 7: goto L_0x006d;
                case 8: goto L_0x0075;
                case 9: goto L_0x008f;
                case 10: goto L_0x0097;
                case 11: goto L_0x0020;
                case 12: goto L_0x0023;
                case 13: goto L_0x0005;
                case 14: goto L_0x00a7;
                case 15: goto L_0x00af;
                case 16: goto L_0x00b7;
                case 17: goto L_0x00bf;
                case 18: goto L_0x00cb;
                case 19: goto L_0x00d8;
                case 20: goto L_0x00ec;
                case 21: goto L_0x00fc;
                case 22: goto L_0x010f;
                case 23: goto L_0x0127;
                case 24: goto L_0x0020;
                case 25: goto L_0x0023;
                case 26: goto L_0x0005;
                case 27: goto L_0x014e;
                case 28: goto L_0x0162;
                case 29: goto L_0x016c;
                case 30: goto L_0x0020;
                case 31: goto L_0x0023;
                case 32: goto L_0x0005;
                case 33: goto L_0x0176;
                case 34: goto L_0x0187;
                case 35: goto L_0x0195;
                case 36: goto L_0x01d4;
                case 37: goto L_0x01e3;
                case 38: goto L_0x01eb;
                case 39: goto L_0x01f2;
                case 40: goto L_0x01fa;
                case 41: goto L_0x0201;
                case 42: goto L_0x0214;
                case 43: goto L_0x0220;
                case 44: goto L_0x022a;
                case 45: goto L_0x023b;
                case 46: goto L_0x0242;
                case 47: goto L_0x024c;
                case 48: goto L_0x0253;
                case 49: goto L_0x025e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.07f r6 = X.DbY.A0I(r0)
        L_0x000b:
            return r6
        L_0x000c:
            java.lang.Object r0 = r7.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "presence_launch_config"
            android.os.Parcelable r6 = r1.getParcelable(r0)
            if (r6 != 0) goto L_0x000b
            com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig r6 = new com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig
            r6.<init>()
            return r6
        L_0x0020:
            java.lang.Object r6 = r7.A01
            return r6
        L_0x0023:
            java.lang.Object r0 = r7.A01
            java.lang.Object r6 = X.DbT.A0r(r0)
            return r6
        L_0x002a:
            java.lang.Object r2 = r7.A01
            X.GzW r2 = (X.C54101GzW) r2
            X.0eM r0 = r2.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            com.instagram.friendmap.configs.PagerSheetLaunchConfig r0 = (com.instagram.friendmap.configs.PagerSheetLaunchConfig) r0
            X.H67 r6 = new X.H67
            r6.<init>(r1, r0)
            return r6
        L_0x0042:
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131433167(0x7f0b16cf, float:1.8488112E38)
            goto L_0x00c6
        L_0x004a:
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131438091(0x7f0b2a0b, float:1.84981E38)
            goto L_0x00c6
        L_0x0052:
            java.lang.Object r0 = r7.A01
            X.NKO r0 = (X.NKO) r0
            X.0eM r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig r0 = (com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig) r0
            java.lang.Integer r0 = r0.A01
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x006a
            X.6r8 r6 = X.C319736r8.FRIEND_MAP_FLOATY_GRID
            return r6
        L_0x006a:
            X.6r8 r6 = X.C319736r8.FRIEND_MAP
            return r6
        L_0x006d:
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131433188(0x7f0b16e4, float:1.8488155E38)
            goto L_0x00c6
        L_0x0075:
            java.lang.Object r2 = r7.A01
            X.NKO r2 = (X.NKO) r2
            X.0eM r0 = r2.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A09
            java.lang.Object r0 = r0.getValue()
            com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig r0 = (com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig) r0
            java.lang.String r0 = r0.A03
            X.NMz r6 = new X.NMz
            r6.<init>(r1, r0)
            return r6
        L_0x008f:
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131440529(0x7f0b3391, float:1.8503044E38)
            goto L_0x00c6
        L_0x0097:
            java.lang.Object r0 = r7.A01
            X.NKO r0 = (X.NKO) r0
            X.0eM r0 = r0.A0D
            android.view.ViewGroup r0 = X.C66583MXo.A0C(r0)
            X.6Uk r6 = new X.6Uk
            r6.<init>(r0)
            return r6
        L_0x00a7:
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131433185(0x7f0b16e1, float:1.8488149E38)
            goto L_0x00c6
        L_0x00af:
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131433186(0x7f0b16e2, float:1.848815E38)
            goto L_0x00c6
        L_0x00b7:
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131433189(0x7f0b16e5, float:1.8488157E38)
            goto L_0x00c6
        L_0x00bf:
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131433191(0x7f0b16e7, float:1.848816E38)
        L_0x00c6:
            android.view.View r6 = X.C66584MXp.A0A(r1, r0)
            return r6
        L_0x00cb:
            java.lang.Object r1 = r7.A01
            X.0sK r1 = (X.0sK) r1
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r1.invoke(r0, r0, r0)
            goto L_0x0269
        L_0x00d8:
            java.lang.Object r0 = r7.A01
            X.Gzz r0 = (X.C54130Gzz) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.30l r6 = new X.30l
            r6.<init>(r1, r0)
            return r6
        L_0x00ec:
            java.lang.Object r1 = r7.A01
            X.Gzz r1 = (X.C54130Gzz) r1
            X.0eM r0 = r1.A03
            com.instagram.common.session.UserSession r0 = X.JTS.A0J(r0)
            X.Ody r6 = new X.Ody
            r6.<init>(r1, r0)
            return r6
        L_0x00fc:
            java.lang.Object r0 = r7.A01
            X.Gzz r0 = (X.C54130Gzz) r0
            X.0sK r2 = r0.A00
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r2.invoke(r1, r0, r1)
            goto L_0x0269
        L_0x010f:
            java.lang.Object r3 = r7.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r0 = 21
            X.PlZ r2 = new X.PlZ
            r2.<init>(r3, r0)
            boolean r1 = X.JTQ.A1X(r3)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.C71054OaW.A00(r0, r2, r1)
            goto L_0x0269
        L_0x0127:
            java.lang.Object r4 = r7.A01
            X.Gzz r4 = (X.C54130Gzz) r4
            X.0eM r0 = r4.A03
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r2 = r4.mArguments
            r1 = 1
            if (r2 == 0) goto L_0x014c
            java.lang.String r0 = "arg_is_from_nux"
            boolean r0 = r2.getBoolean(r0)
            if (r0 != r1) goto L_0x014c
        L_0x013e:
            X.0eM r0 = r4.A02
            java.lang.Object r0 = r0.getValue()
            X.Ody r0 = (X.C71144Ody) r0
            X.NN7 r6 = new X.NN7
            r6.<init>(r3, r0, r1)
            return r6
        L_0x014c:
            r1 = 0
            goto L_0x013e
        L_0x014e:
            java.lang.Object r0 = r7.A01
            X.NJg r0 = (X.C68468NJg) r0
            android.content.Context r1 = r0.requireContext()
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.T6B r6 = new X.T6B
            r6.<init>(r1, r0)
            return r6
        L_0x0162:
            java.lang.Object r0 = r7.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131436999(0x7f0b25c7, float:1.8495884E38)
            goto L_0x0190
        L_0x016c:
            java.lang.Object r0 = r7.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131443461(0x7f0b3f05, float:1.850899E38)
            goto L_0x0190
        L_0x0176:
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0185
            java.lang.String r0 = "friend_map_update_launch_config"
            android.os.Parcelable r6 = r1.getParcelable(r0)
            return r6
        L_0x0185:
            r6 = 0
            return r6
        L_0x0187:
            java.lang.Object r0 = r7.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131443460(0x7f0b3f04, float:1.8508989E38)
        L_0x0190:
            android.view.View r6 = r1.requireViewById(r0)
            return r6
        L_0x0195:
            java.lang.Object r6 = r7.A01
            X.NJg r6 = (X.C68468NJg) r6
            X.0eM r1 = r6.A04
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            X.0eM r0 = r6.A01
            java.lang.Object r4 = r0.getValue()
            X.T6B r4 = (X.T6B) r4
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            r3 = 0
            X.0qQ.A0B(r0, r3)
            X.Ody r2 = new X.Ody
            r2.<init>(r6, r0)
            r1 = 0
            android.content.res.Resources r0 = X.DbV.A05(r6)
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L_0x01c9
            android.os.LocaleList r0 = r0.getLocales()
            if (r0 == 0) goto L_0x01c9
            java.util.Locale r1 = r0.get(r3)
        L_0x01c9:
            X.0eM r0 = r6.A05
            r0.getValue()
            X.NNF r6 = new X.NNF
            r6.<init>(r5, r4, r2, r1)
            return r6
        L_0x01d4:
            java.lang.Object r2 = r7.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 38
            X.C66181MGs.A02(r2, r1, r0)
            goto L_0x0269
        L_0x01e3:
            java.lang.Object r3 = r7.A01
            X.HBP r3 = (X.HBP) r3
            r2 = 2131962719(0x7f132b5f, float:1.9562171E38)
            goto L_0x0208
        L_0x01eb:
            java.lang.Object r2 = r7.A01
            X.MYL r2 = (X.MYL) r2
            X.NjD r1 = X.C69312NjD.UPDATE_HIDDEN_PLACE
            goto L_0x021a
        L_0x01f2:
            java.lang.Object r3 = r7.A01
            X.HBP r3 = (X.HBP) r3
            r2 = 2131962700(0x7f132b4c, float:1.9562133E38)
            goto L_0x0208
        L_0x01fa:
            java.lang.Object r2 = r7.A01
            X.MYL r2 = (X.MYL) r2
            X.NjD r1 = X.C69312NjD.CREATE_HIDDEN_PLACE
            goto L_0x021a
        L_0x0201:
            java.lang.Object r3 = r7.A01
            X.HBP r3 = (X.HBP) r3
            r2 = 2131962704(0x7f132b50, float:1.956214E38)
        L_0x0208:
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            com.instagram.friendmap.data.MapText$Res r0 = new com.instagram.friendmap.data.MapText$Res
            r0.<init>(r2, r1)
            X.HBP.A00(r0, r3)
            goto L_0x0269
        L_0x0214:
            java.lang.Object r2 = r7.A01
            X.MYL r2 = (X.MYL) r2
            X.NjD r1 = X.C69312NjD.DELETE_HIDDEN_PLACE
        L_0x021a:
            X.PGZ r0 = new X.PGZ
            r0.<init>(r1)
            goto L_0x0248
        L_0x0220:
            java.lang.Object r1 = r7.A01
            X.MYL r1 = (X.MYL) r1
            X.Pp9 r0 = X.C74106Pp9.A00
            r1.A0R(r0)
            goto L_0x0269
        L_0x022a:
            java.lang.Object r2 = r7.A01
            X.NdD r2 = (X.C69028NdD) r2
            X.Ody r1 = r2.A03
            java.lang.String r0 = "LOCATION_SHARE_PERMISSION"
            X.C71144Ody.A07(r1, r0)
            X.OZw r0 = r2.A06
            r0.A03()
            goto L_0x0269
        L_0x023b:
            java.lang.Object r2 = r7.A01
            X.MYL r2 = (X.MYL) r2
            X.PH4 r0 = X.PH4.A00
            goto L_0x0248
        L_0x0242:
            java.lang.Object r2 = r7.A01
            X.MYL r2 = (X.MYL) r2
            X.PH3 r0 = X.PH3.A00
        L_0x0248:
            r2.A0P(r0)
            goto L_0x0269
        L_0x024c:
            java.lang.Object r2 = r7.A01
            X.NdD r2 = (X.C69028NdD) r2
            X.NmU r1 = X.C69486NmU.MUTUALS_CHECKUP
            goto L_0x0259
        L_0x0253:
            java.lang.Object r2 = r7.A01
            X.NdD r2 = (X.C69028NdD) r2
            X.NmU r1 = X.C69486NmU.DEEPLINK
        L_0x0259:
            r0 = 0
            r2.A0W(r1, r0)
            goto L_0x0269
        L_0x025e:
            java.lang.Object r0 = r7.A01
            X.NdD r0 = (X.C69028NdD) r0
            X.Ody r1 = r0.A03
            X.HOc r0 = X.C54671HOc.FINAL_REMINDER_NUX
            r1.A09(r0)
        L_0x0269:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73898PlZ.invoke():java.lang.Object");
    }
}
