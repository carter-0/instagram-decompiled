package X;

/* renamed from: X.Inp  reason: case insensitive filesystem */
public final class C58185Inp extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58185Inp(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01fb, code lost:
        if (r3.A0J != false) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0210, code lost:
        X.DbS.A1U(r10.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0315, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0024;
                case 1: goto L_0x0046;
                case 2: goto L_0x006e;
                case 3: goto L_0x0279;
                case 4: goto L_0x02d7;
                case 5: goto L_0x025d;
                case 6: goto L_0x03c0;
                case 7: goto L_0x007b;
                case 8: goto L_0x0086;
                case 9: goto L_0x0093;
                case 10: goto L_0x007b;
                case 11: goto L_0x007b;
                case 12: goto L_0x00a7;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x00ba;
                case 16: goto L_0x0391;
                case 17: goto L_0x0005;
                case 18: goto L_0x0391;
                case 19: goto L_0x0391;
                case 20: goto L_0x0005;
                case 21: goto L_0x0107;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x0147;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0164;
                case 28: goto L_0x0178;
                case 29: goto L_0x01aa;
                case 30: goto L_0x01bc;
                case 31: goto L_0x01c8;
                case 32: goto L_0x01de;
                case 33: goto L_0x0208;
                case 34: goto L_0x02c2;
                case 35: goto L_0x0005;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x0217;
                case 40: goto L_0x03da;
                case 41: goto L_0x0391;
                case 42: goto L_0x0005;
                case 43: goto L_0x03e8;
                case 44: goto L_0x022e;
                case 45: goto L_0x0005;
                case 46: goto L_0x03f6;
                case 47: goto L_0x03a8;
                case 48: goto L_0x0391;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r2 = r0.invoke()
            if (r2 != 0) goto L_0x0023
        L_0x0011:
            java.lang.Object r0 = r10.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x03bd
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x03bd
            X.2YQ r2 = r1.getDefaultViewModelCreationExtras()
        L_0x0023:
            return r2
        L_0x0024:
            java.lang.Object r0 = r10.A02
            X.2uK r0 = (X.C232722uK) r0
            X.4Ne r0 = r0.A02
            if (r0 == 0) goto L_0x003d
            X.3V3 r0 = r0.A08
            if (r0 == 0) goto L_0x003d
            X.3fz r1 = r0.BQv()
            if (r1 == 0) goto L_0x003d
            r0 = 0
            r1.setEnabled(r0)
            r1.Eqk(r0)
        L_0x003d:
            java.lang.Object r0 = r10.A01
            android.widget.PopupWindow r0 = (android.widget.PopupWindow) r0
            r0.dismiss()
            goto L_0x0313
        L_0x0046:
            java.lang.Object r0 = r10.A02
            X.2uK r0 = (X.C232722uK) r0
            X.4M3 r3 = r0.A05
            if (r3 == 0) goto L_0x0313
            r2 = 1
            com.instagram.common.session.UserSession r1 = r0.A0K
            r0 = 0
            X.0qQ.A0B(r1, r0)
            boolean r0 = X.AnonymousClass3WS.A06(r1)
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r10.A01
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = X.C51966G9m.A1D(r0)
            java.lang.String r0 = X.AnonymousClass3WS.A00(r1, r0)
        L_0x0067:
            r3.EnT(r2, r0)
            goto L_0x0313
        L_0x006c:
            r0 = 0
            goto L_0x0067
        L_0x006e:
            java.lang.Object r1 = r10.A02
            X.OZw r1 = (X.C71035OZw) r1
            java.lang.Object r0 = r10.A01
            X.0sa r0 = (X.C62320sa) r0
            X.C71035OZw.A00(r1, r0)
            goto L_0x0313
        L_0x007b:
            java.lang.Object r1 = r10.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r10.A01
            r1.invoke(r0)
            goto L_0x0313
        L_0x0086:
            java.lang.Object r1 = r10.A02
            X.HBP r1 = (X.HBP) r1
            java.lang.Object r0 = r10.A01
            X.N2q r0 = (X.C68150N2q) r0
            r1.A0S(r0)
            goto L_0x0313
        L_0x0093:
            java.lang.Object r1 = r10.A01
            X.Ody r1 = (X.C71144Ody) r1
            X.HOc r0 = X.C54671HOc.MAP_INTRO_NUX
            r1.A09(r0)
            X.HNM r1 = X.HNM.NOTES_WITH_LOCATION_NUX
            java.lang.Object r0 = r10.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            r1.A00(r0)
            goto L_0x0313
        L_0x00a7:
            java.lang.Object r1 = r10.A02
            X.Ody r1 = (X.C71144Ody) r1
            java.lang.String r0 = "TRIPLE_DOT_MENU"
            X.C71144Ody.A07(r1, r0)
            java.lang.Object r1 = r10.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 1
            X.C51967G9n.A16(r1, r0)
            goto L_0x0313
        L_0x00ba:
            java.lang.Object r0 = r10.A02
            X.NJF r0 = (X.NJF) r0
            X.0eM r0 = r0.A0G
            java.lang.Object r4 = r0.getValue()
            X.NdA r4 = (X.NdA) r4
            java.lang.Object r1 = r10.A01
            X.N4t r1 = (X.N4t) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.4AB r0 = r1.A05
            if (r0 == 0) goto L_0x0313
            java.util.List r0 = r0.A0J
            if (r0 == 0) goto L_0x0313
            java.lang.Object r0 = X.00k.A0J(r0)
            X.913 r0 = (X.AnonymousClass913) r0
            if (r0 == 0) goto L_0x0313
            X.4zZ r0 = r0.BWY()
            if (r0 == 0) goto L_0x0313
            java.lang.String r0 = r0.A0H
            if (r0 == 0) goto L_0x0313
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0313
            long r2 = r0.longValue()
            com.instagram.common.session.UserSession r0 = r4.A00
            boolean r0 = r1.A06(r0)
            if (r0 != 0) goto L_0x0313
            com.instagram.friendmap.data.FriendMapRepository r1 = r4.A01
            boolean r0 = r1.A0B(r2)
            if (r0 != 0) goto L_0x0313
            r1.A06(r2)
            goto L_0x0313
        L_0x0107:
            java.lang.Object r0 = r10.A02
            X.OMm r0 = (X.C70817OMm) r0
            androidx.fragment.app.FragmentActivity r5 = r0.A00
            com.instagram.common.session.UserSession r4 = r0.A02
            java.lang.Object r3 = r10.A01
            com.instagram.friendmap.configs.PagerSheetLaunchConfig r3 = (com.instagram.friendmap.configs.PagerSheetLaunchConfig) r3
            boolean r0 = X.DbW.A1Y(r3)
            X.7Pr r2 = X.DbS.A0W(r4)
            r2.A1R = r0
            r2.A13 = r0
            r2.A0y = r0
            r2.A0k = r0
            X.0sa r1 = r3.A01
            r0 = 6
            X.C57385IZq.A00(r2, r1, r0)
            X.7Pu r2 = r2.A00()
            X.GzW r1 = new X.GzW
            r1.<init>()
            r0 = 1029(0x405, float:1.442E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            android.os.Bundle r0 = X.DbY.A0B(r0, r3)
            X.C227642jf.A04(r0, r4)
            r1.setArguments(r0)
            r2.A02(r5, r1)
            goto L_0x0313
        L_0x0147:
            java.lang.Object r0 = r10.A02
            X.Gzz r0 = (X.C54130Gzz) r0
            X.0sK r4 = r0.A00
            java.lang.Object r3 = r10.A01
            X.IV6 r3 = (X.IV6) r3
            boolean r0 = r3.A01
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.A00
            X.C51967G9n.A1N(r2, r1, r4, r0)
            goto L_0x0313
        L_0x0164:
            java.lang.Object r0 = r10.A02
            X.NdA r0 = (X.NdA) r0
            X.NdD r3 = r0.A03
            X.NmU r2 = X.C69486NmU.SELF_LOCATION_POG
            java.lang.Object r0 = r10.A01
            r1 = 0
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r3.A0X(r2, r1, r0)
            goto L_0x0313
        L_0x0178:
            java.lang.Object r0 = r10.A01
            X.N2q r0 = (X.C68150N2q) r0
            java.lang.String r5 = r0.A03
            if (r5 == 0) goto L_0x01a3
            java.lang.Object r1 = r10.A02
            X.HBP r1 = (X.HBP) r1
            com.instagram.friendmap.data.FriendMapRepository r4 = r1.A00
            r0 = 41
            X.PlZ r2 = new X.PlZ
            r2.<init>(r1, r0)
            r0 = 42
            X.PlZ r3 = new X.PlZ
            r3.<init>(r1, r0)
            X.4Cq r0 = r4.A01
            r6 = 0
            r7 = 17
            X.MH7 r1 = new X.MH7
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.String) r5, (X.AnonymousClass4D7) r6, (int) r7)
            X.AnonymousClass7TE.A1Z(r1, r0)
            goto L_0x0313
        L_0x01a3:
            java.lang.Object r5 = r10.A02
            X.MYL r5 = (X.MYL) r5
            X.IV7 r4 = X.IV7.A00
            goto L_0x0203
        L_0x01aa:
            java.lang.Object r5 = r10.A02
            X.NdD r5 = (X.C69028NdD) r5
            java.lang.Object r1 = r10.A01
            java.util.List r1 = (java.util.List) r1
            android.location.Location r0 = X.C69028NdD.A03(r5)
            X.PGt r4 = new X.PGt
            r4.<init>(r0, r1)
            goto L_0x0203
        L_0x01bc:
            java.lang.Object r0 = r10.A02
            X.NdD r0 = (X.C69028NdD) r0
            X.Ody r1 = r0.A03
            X.HOc r0 = X.C54671HOc.FINAL_REMINDER_NUX
            r1.A0A(r0)
            goto L_0x0210
        L_0x01c8:
            java.lang.Object r5 = r10.A02
            X.NdD r5 = (X.C69028NdD) r5
            java.lang.Object r1 = r10.A01
            X.4AB r1 = (X.AnonymousClass4AB) r1
            android.location.Location r0 = X.C69028NdD.A03(r5)
            X.OIR r0 = X.C69028NdD.A05(r0, r1)
            X.PGh r4 = new X.PGh
            r4.<init>(r0)
            goto L_0x0203
        L_0x01de:
            java.lang.Object r5 = r10.A02
            X.NdD r5 = (X.C69028NdD) r5
            java.lang.Object r3 = r10.A01
            X.N4t r3 = (X.N4t) r3
            X.4AB r1 = r3.A05
            android.location.Location r0 = X.C69028NdD.A03(r5)
            X.OIR r2 = X.C69028NdD.A05(r0, r1)
            com.instagram.common.session.UserSession r0 = r5.A02
            boolean r0 = X.AnonymousClass3HF.A01(r0)
            if (r0 == 0) goto L_0x01fd
            boolean r1 = r3.A0J
            r0 = 1
            if (r1 == 0) goto L_0x01fe
        L_0x01fd:
            r0 = 0
        L_0x01fe:
            X.PGx r4 = new X.PGx
            r4.<init>(r2, r3, r0)
        L_0x0203:
            r5.A0P(r4)
            goto L_0x0313
        L_0x0208:
            java.lang.Object r1 = r10.A02
            X.NdD r1 = (X.C69028NdD) r1
            r0 = 0
            r1.A0b(r0)
        L_0x0210:
            java.lang.Object r0 = r10.A01
            X.DbS.A1U(r0)
            goto L_0x0313
        L_0x0217:
            java.lang.Object r1 = r10.A02
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r1 = (com.instagram.igds.components.faceswarm.IgdsFaceSwarm) r1
            java.lang.Runnable r0 = r1.A07
            if (r0 == 0) goto L_0x0222
            r0.run()
        L_0x0222:
            r0 = 0
            r1.A07 = r0
            java.lang.Object r0 = r10.A01
            java.util.List r0 = (java.util.List) r0
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm.A05(r1, r0)
            goto L_0x0313
        L_0x022e:
            java.lang.Object r5 = r10.A02
            X.K6o r5 = (X.C61417K6o) r5
            X.0hq r0 = r5.mFragmentManager
            if (r0 == 0) goto L_0x0313
            java.lang.Object r4 = r10.A01
            android.app.Activity r4 = (android.app.Activity) r4
            X.0eM r0 = r5.A07
            X.Dg1 r3 = X.C46498Dg1.A00(r4, r0)
            r1 = 2131964014(0x7f13306e, float:1.9564798E38)
            r0 = 12
            X.ICz r0 = X.C56802ICz.A00(r5, r0)
            r3.A02(r0, r1)
            r2 = 2131964025(0x7f133079, float:1.956482E38)
            r1 = 0
            X.LY6 r0 = new X.LY6
            r0.<init>(r5, r1)
            r3.A04(r0, r2)
            X.C51969G9p.A11(r4, r3)
            goto L_0x0313
        L_0x025d:
            java.lang.Object r2 = r10.A02
            X.Ikd r2 = (X.C58045Ikd) r2
            java.lang.Object r0 = r10.A01
            java.lang.Object r1 = r2.remove(r0)
            X.HFr r1 = (X.C54485HFr) r1
            if (r1 == 0) goto L_0x02d5
            r1.A02()
            X.01W r0 = r2.A04
            boolean r0 = r0.add(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x0279:
            java.lang.Object r3 = r10.A02
            X.Ikd r3 = (X.C58045Ikd) r3
            X.01W r0 = r3.A04
            java.lang.Object r2 = r0.A0S()
            if (r2 != 0) goto L_0x0023
            int r1 = r3.size()
            int r0 = r3.A00
            if (r1 >= r0) goto L_0x02d5
            android.widget.FrameLayout r4 = r3.A01
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r4)
            com.instagram.common.session.UserSession r0 = r3.A03
            X.HFr r2 = new X.HFr
            r2.<init>(r1, r0)
            java.lang.Object r1 = r10.A01
            X.JPR r1 = (X.JPR) r1
            X.4DJ r0 = r3.A02
            r0.registerLifecycleListener(r2)
            X.MqP r1 = (X.C67591MqP) r1
            int r0 = r1.A02
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r0, r0)
            r1 = 1000(0x3e8, float:1.401E-42)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r2)
            int r0 = X.C61380mr.A01(r0, r1)
            int r1 = -r0
            r0 = 0
            r3.setMargins(r1, r1, r0, r0)
            r2.setLayoutParams(r3)
            r4.addView(r2)
            return r2
        L_0x02c2:
            java.lang.Object r0 = r10.A01
            X.DbS.A1U(r0)
            java.lang.Object r0 = r10.A02
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r2 = r0.A00
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0023
        L_0x02d5:
            r2 = 0
            return r2
        L_0x02d7:
            java.lang.Object r6 = r10.A02
            java.util.AbstractMap r6 = (java.util.AbstractMap) r6
            java.lang.Object r5 = r10.A01
            X.JPR r5 = (X.JPR) r5
            boolean r0 = r6.containsKey(r5)
            r2 = 0
            if (r0 == 0) goto L_0x0316
            java.lang.Object r3 = r6.get(r5)
            X.HFr r3 = (X.C54485HFr) r3
            if (r3 == 0) goto L_0x0023
            r0 = 0
            r3.A03(r5, r0)
            int r1 = r3.getWidth()
            X.MqP r5 = (X.C67591MqP) r5
            int r0 = r5.A02
            if (r1 != r0) goto L_0x0304
            int r1 = r3.getHeight()
            int r0 = r5.A02
            if (r1 == r0) goto L_0x0313
        L_0x0304:
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            if (r1 == 0) goto L_0x040e
            int r0 = r5.A02
            r1.width = r0
            r1.height = r0
            r3.setLayoutParams(r1)
        L_0x0313:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0316:
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r9 = X.AnonymousClass7TF.A0s(r6)
        L_0x031e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x035b
            java.util.Map$Entry r7 = X.AnonymousClass7TE.A1J(r9)
            java.lang.Object r4 = r7.getKey()
            X.JPR r4 = (X.JPR) r4
            boolean r0 = r4.AkI()
            if (r0 == 0) goto L_0x034f
            r3 = r5
            X.MqP r3 = (X.C67591MqP) r3
            X.MqO r0 = r3.A0E
            java.lang.String r1 = r0.A03
            if (r1 != 0) goto L_0x033f
            java.lang.String r1 = r3.A0F
        L_0x033f:
            X.MqP r4 = (X.C67591MqP) r4
            X.MqO r0 = r4.A0E
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L_0x0349
            java.lang.String r0 = r4.A0F
        L_0x0349:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x031e
        L_0x034f:
            java.lang.Object r1 = r7.getKey()
            java.lang.Object r0 = r7.getValue()
            r8.put(r1, r0)
            goto L_0x031e
        L_0x035b:
            java.util.Iterator r4 = X.AnonymousClass7TF.A0s(r8)
        L_0x035f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x037b
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r4)
            java.lang.Object r3 = r0.getKey()
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r1 = 5
            X.Inp r0 = new X.Inp
            r0.<init>(r1, r3, r6)
            X.C58045Ikd.A00(r0)
            goto L_0x035f
        L_0x037b:
            r1 = 3
            X.Inp r0 = new X.Inp
            r0.<init>(r1, r5, r6)
            java.lang.Object r1 = X.C58045Ikd.A00(r0)
            X.HFr r1 = (X.C54485HFr) r1
            if (r1 == 0) goto L_0x0023
            r6.put(r5, r1)
            r0 = 1
            r1.A03(r5, r0)
            goto L_0x0313
        L_0x0391:
            java.lang.Object r0 = r10.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x039d
            java.lang.Object r2 = r0.invoke()
            if (r2 != 0) goto L_0x0023
        L_0x039d:
            java.lang.Object r0 = r10.A02
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.2YQ r2 = r0.getDefaultViewModelCreationExtras()
            return r2
        L_0x03a8:
            java.lang.Object r0 = r10.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x03b4
            java.lang.Object r2 = r0.invoke()
            if (r2 != 0) goto L_0x0023
        L_0x03b4:
            java.lang.Object r0 = r10.A02
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            X.2YQ r2 = r0.getDefaultViewModelCreationExtras()
            return r2
        L_0x03bd:
            X.2YP r2 = X.AnonymousClass2YP.A00
            return r2
        L_0x03c0:
            java.lang.Object r4 = r10.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r10.A02
            X.HFr r3 = (X.C54485HFr) r3
            com.instagram.common.session.UserSession r2 = r3.A00
            r1 = 0
            java.lang.String r0 = "note_map_drawable"
            X.4M1 r2 = X.AnonymousClass4M0.A00(r4, r2, r1, r3, r0)
            r0 = 1
            r2.A0Z = r0
            r2.A06 = r0
            r2.Ech(r0)
            return r2
        L_0x03da:
            java.lang.Object r1 = r10.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r10.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.59l r2 = new X.59l
            r2.<init>(r1, r0)
            return r2
        L_0x03e8:
            java.lang.Object r1 = r10.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r10.A01
            com.instagram.igtv.repository.user.UserNetworkDataSource r0 = (com.instagram.igtv.repository.user.UserNetworkDataSource) r0
            com.instagram.igtv.repository.user.UserRepository r2 = new com.instagram.igtv.repository.user.UserRepository
            r2.<init>(r1, r0)
            return r2
        L_0x03f6:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r0)
            r2 = 2131240273(0x7f082551, float:1.8096877E38)
            java.lang.Object r1 = r10.A02
            X.JpN r1 = (X.C60676JpN) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            int r0 = r1.A00
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3JT.A05(r3, r2, r0)
            return r2
        L_0x040e:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58185Inp.invoke():java.lang.Object");
    }
}
