package X;

/* renamed from: X.Pha  reason: case insensitive filesystem */
public final class C73661Pha extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73661Pha(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0289, code lost:
        return X.JTP.A0k(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b7, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x02c1;
                case 1: goto L_0x02b8;
                case 2: goto L_0x02aa;
                case 3: goto L_0x029a;
                case 4: goto L_0x028a;
                case 5: goto L_0x027a;
                case 6: goto L_0x026e;
                case 7: goto L_0x0262;
                case 8: goto L_0x0258;
                case 9: goto L_0x024c;
                case 10: goto L_0x0241;
                case 11: goto L_0x0235;
                case 12: goto L_0x022a;
                case 13: goto L_0x021f;
                case 14: goto L_0x020f;
                case 15: goto L_0x01ff;
                case 16: goto L_0x01dc;
                case 17: goto L_0x01ef;
                case 18: goto L_0x01dc;
                case 19: goto L_0x01c1;
                case 20: goto L_0x01b4;
                case 21: goto L_0x01a5;
                case 22: goto L_0x0195;
                case 23: goto L_0x0025;
                case 24: goto L_0x012d;
                case 25: goto L_0x000f;
                case 26: goto L_0x0123;
                case 27: goto L_0x0119;
                case 28: goto L_0x010f;
                case 29: goto L_0x0105;
                case 30: goto L_0x00fb;
                case 31: goto L_0x00f1;
                case 32: goto L_0x00e7;
                case 33: goto L_0x00dd;
                case 34: goto L_0x00d3;
                case 35: goto L_0x00c9;
                case 36: goto L_0x00bf;
                case 37: goto L_0x00b5;
                case 38: goto L_0x00ab;
                case 39: goto L_0x00a1;
                case 40: goto L_0x0097;
                case 41: goto L_0x008d;
                case 42: goto L_0x0083;
                case 43: goto L_0x0079;
                case 44: goto L_0x006f;
                case 45: goto L_0x0065;
                case 46: goto L_0x004f;
                case 47: goto L_0x0045;
                case 48: goto L_0x003a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OyL r3 = new X.OyL
            r3.<init>(r0)
        L_0x000e:
            return r3
        L_0x000f:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            r3 = 0
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = "nux_landing_surface"
            java.io.Serializable r1 = r1.getSerializable(r0)
        L_0x001e:
            boolean r0 = r1 instanceof X.EV9
            if (r0 == 0) goto L_0x000e
            return r1
        L_0x0023:
            r1 = r3
            goto L_0x001e
        L_0x0025:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "entry_point"
            java.io.Serializable r3 = r1.getSerializable(r0)
            boolean r0 = r3 instanceof X.C69503Nml
            if (r0 == 0) goto L_0x0037
            if (r3 != 0) goto L_0x000e
        L_0x0037:
            X.Nml r3 = X.C69503Nml.A0J
            return r3
        L_0x003a:
            java.lang.Object r0 = r10.A01
            X.OBJ r0 = (X.OBJ) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.2Dm r3 = X.2L2.A00(r0)
            return r3
        L_0x0045:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Ocj r3 = new X.Ocj
            r3.<init>(r0)
            return r3
        L_0x004f:
            java.lang.Object r1 = r10.A01
            X.OyP r1 = (X.OyP) r1
            X.OaK r0 = X.OyP.A08
            java.io.File r0 = r1.A03
            java.io.File r0 = r0.getParentFile()
            java.lang.String r0 = r0.getCanonicalPath()
            X.NEW r3 = new X.NEW
            r3.<init>(r0)
            return r3
        L_0x0065:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OyP r3 = new X.OyP
            r3.<init>(r0)
            return r3
        L_0x006f:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.7Ep r3 = new X.7Ep
            r3.<init>(r0)
            return r3
        L_0x0079:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OKF r3 = new X.OKF
            r3.<init>(r0)
            return r3
        L_0x0083:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.ONE r3 = new X.ONE
            r3.<init>(r0)
            return r3
        L_0x008d:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.MdY r3 = new X.MdY
            r3.<init>(r0)
            return r3
        L_0x0097:
            java.lang.Object r1 = r10.A01
            X.0sP r1 = (X.0sP) r1
            r0 = 0
            r1.invoke(r0)
            goto L_0x02b5
        L_0x00a1:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.MmS r3 = new X.MmS
            r3.<init>(r0)
            return r3
        L_0x00ab:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Orl r3 = new X.Orl
            r3.<init>(r0)
            return r3
        L_0x00b5:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2BC r3 = new X.2BC
            r3.<init>(r0)
            return r3
        L_0x00bf:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2BB r3 = new X.2BB
            r3.<init>(r0)
            return r3
        L_0x00c9:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2BA r3 = new X.2BA
            r3.<init>(r0)
            return r3
        L_0x00d3:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.MZB r3 = new X.MZB
            r3.<init>(r0)
            return r3
        L_0x00dd:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Os8 r3 = new X.Os8
            r3.<init>(r0)
            return r3
        L_0x00e7:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OsA r3 = new X.OsA
            r3.<init>(r0)
            return r3
        L_0x00f1:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Os2 r3 = new X.Os2
            r3.<init>(r0)
            return r3
        L_0x00fb:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.O61 r3 = new X.O61
            r3.<init>(r0)
            return r3
        L_0x0105:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Mob r3 = new X.Mob
            r3.<init>(r0)
            return r3
        L_0x010f:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.F9v r3 = new X.F9v
            r3.<init>(r0)
            return r3
        L_0x0119:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Os9 r3 = new X.Os9
            r3.<init>(r0)
            return r3
        L_0x0123:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.LAh r3 = new X.LAh
            r3.<init>(r0)
            return r3
        L_0x012d:
            java.lang.Object r4 = r10.A01
            X.E2X r4 = (X.E2X) r4
            X.0eM r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            X.EV9 r0 = (X.EV9) r0
            if (r0 == 0) goto L_0x02b5
            int r1 = r0.ordinal()
            r9 = 1
            if (r1 == r9) goto L_0x017b
            r0 = 2
            if (r1 != r0) goto L_0x02b5
            X.0eM r1 = r4.A01
            java.lang.String r0 = X.DbS.A0t(r1)
            if (r0 == 0) goto L_0x0172
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0172
            X.0eM r0 = r4.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r2 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r2.<init>(r0)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            java.lang.String r5 = X.DbS.A0t(r1)
            if (r5 != 0) goto L_0x016a
            java.lang.String r5 = ""
        L_0x016a:
            r6 = 0
            r7 = r6
            r8 = r6
            r2.A08(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x02b5
        L_0x0172:
            java.lang.String r1 = "AiAgentUpsellInterstitialFragment"
            java.lang.String r0 = "AgentId must be provided to launch a thread with an agent"
            X.0KC.A0D(r1, r0)
            goto L_0x02b5
        L_0x017b:
            X.0eM r0 = r4.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0eM r0 = r4.A03
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = r0.toString()
            r0 = 0
            X.C49951FGg.A00(r2, r0, r3, r1, r0)
            goto L_0x02b5
        L_0x0195:
            java.lang.Object r0 = r10.A01
            X.E2X r0 = (X.E2X) r0
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7I3 r3 = new X.7I3
            r3.<init>(r0)
            return r3
        L_0x01a5:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01ed
            java.lang.String r0 = "ai_agent_id"
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x01b4:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "entry_point"
            java.io.Serializable r3 = r1.getSerializable(r0)
            return r3
        L_0x01c1:
            java.lang.Object r1 = r10.A01
            X.NII r1 = (X.NII) r1
            X.0eM r0 = r1.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A01
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = X.DbX.A0t(r0)
            r0 = 0
            X.LRW r3 = new X.LRW
            r3.<init>(r2, r1, r0)
            return r3
        L_0x01dc:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "entry_point"
            java.io.Serializable r1 = r1.getSerializable(r0)
            boolean r0 = r1 instanceof X.C69503Nml
            if (r0 == 0) goto L_0x01ed
            return r1
        L_0x01ed:
            r3 = 0
            return r3
        L_0x01ef:
            java.lang.Object r0 = r10.A01
            X.E2S r0 = (X.E2S) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7I3 r3 = new X.7I3
            r3.<init>(r0)
            return r3
        L_0x01ff:
            java.lang.Object r0 = r10.A01
            X.NIU r0 = (X.NIU) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7I3 r3 = new X.7I3
            r3.<init>(r0)
            return r3
        L_0x020f:
            java.lang.Object r0 = r10.A01
            X.NgJ r0 = (X.NgJ) r0
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7I3 r3 = new X.7I3
            r3.<init>(r0)
            return r3
        L_0x021f:
            java.lang.Object r0 = r10.A01
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r0 = (com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.2Dm r3 = X.1bJ.A00(r0)
            return r3
        L_0x022a:
            java.lang.Object r0 = r10.A01
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r0 = (com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.7I6 r3 = X.AnonymousClass7I4.A00(r0)
            return r3
        L_0x0235:
            java.lang.Object r0 = r10.A01
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r0 = (com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.LTH r3 = new X.LTH
            r3.<init>(r0)
            return r3
        L_0x0241:
            java.lang.Object r0 = r10.A01
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r0 = (com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.5D7 r3 = X.AnonymousClass5D5.A00(r0)
            return r3
        L_0x024c:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165258(0x7f07004a, float:1.7944728E38)
            goto L_0x0285
        L_0x0258:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            X.N1U r3 = new X.N1U
            r3.<init>(r0)
            return r3
        L_0x0262:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            goto L_0x0285
        L_0x026e:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            goto L_0x0285
        L_0x027a:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165205(0x7f070015, float:1.794462E38)
        L_0x0285:
            java.lang.Integer r3 = X.JTP.A0k(r1, r0)
            return r3
        L_0x028a:
            java.lang.Object r0 = r10.A01
            X.NgR r0 = (X.C69178NgR) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7I3 r3 = new X.7I3
            r3.<init>(r0)
            return r3
        L_0x029a:
            java.lang.Object r0 = r10.A01
            X.NgR r0 = (X.C69178NgR) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7ZW r3 = new X.7ZW
            r3.<init>(r0)
            return r3
        L_0x02aa:
            java.lang.Object r1 = r10.A01
            X.7Sq r1 = (X.C331857Sq) r1
            java.lang.Integer r0 = r1.A03
            if (r0 == 0) goto L_0x02b5
            X.C331857Sq.A03(r1, r0)
        L_0x02b5:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x02b8:
            java.lang.Object r0 = r10.A01
            X.0lg r0 = (X.0lg) r0
            X.0wc r3 = X.AnonymousClass0kN.A02(r0)
            return r3
        L_0x02c1:
            java.lang.Object r0 = r10.A01
            X.E2s r0 = (X.C47446E2s) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.ODN r3 = new X.ODN
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73661Pha.invoke():java.lang.Object");
    }
}
