package X;

public final class J6R extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6R(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static J6R A00(Object obj, Object obj2, int i) {
        return new J6R(i, obj, obj2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0507, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x05ca, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x05f7, code lost:
        if (r2.A0A != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0686, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x069e, code lost:
        if (r3 > 90000) goto L_0x0564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cb, code lost:
        r3 = new X.HFL(r6, r0, r4);
        r1 = r2.A01;
        X.0qQ.A06(r1);
        r0 = r2.A00;
        X.0qQ.A06(r0);
        r3.onTouch(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x07f0, code lost:
        if (r0 != null) goto L_0x07f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x081b, code lost:
        r2.setSpan(r5, r4, r2.length(), 17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0840, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        r1.A00 = r0.getY();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        return java.lang.Boolean.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x026c, code lost:
        r6.Chc(X.AnonymousClass5OC.TAG_ABOVE_PROFILE, r8, r9, (java.lang.Integer) null, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            r2 = r16
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x0825;
                case 1: goto L_0x07f6;
                case 2: goto L_0x07da;
                case 3: goto L_0x07cf;
                case 4: goto L_0x07bb;
                case 5: goto L_0x079c;
                case 6: goto L_0x0786;
                case 7: goto L_0x067a;
                case 8: goto L_0x076d;
                case 9: goto L_0x0736;
                case 10: goto L_0x06f4;
                case 11: goto L_0x06e3;
                case 12: goto L_0x06cb;
                case 13: goto L_0x06bd;
                case 14: goto L_0x06ac;
                case 15: goto L_0x050c;
                case 16: goto L_0x04ff;
                case 17: goto L_0x04ec;
                case 18: goto L_0x04a7;
                case 19: goto L_0x0472;
                case 20: goto L_0x0442;
                case 21: goto L_0x0418;
                case 22: goto L_0x03fd;
                case 23: goto L_0x0007;
                case 24: goto L_0x03d1;
                case 25: goto L_0x0007;
                case 26: goto L_0x0356;
                case 27: goto L_0x0345;
                case 28: goto L_0x0007;
                case 29: goto L_0x0331;
                case 30: goto L_0x0312;
                case 31: goto L_0x02f7;
                case 32: goto L_0x02db;
                case 33: goto L_0x02c6;
                case 34: goto L_0x02ac;
                case 35: goto L_0x0297;
                case 36: goto L_0x0274;
                case 37: goto L_0x0255;
                case 38: goto L_0x0215;
                case 39: goto L_0x01c8;
                case 40: goto L_0x0183;
                case 41: goto L_0x00ac;
                case 42: goto L_0x015d;
                case 43: goto L_0x008e;
                case 44: goto L_0x0043;
                case 45: goto L_0x002a;
                case 46: goto L_0x014a;
                case 47: goto L_0x012d;
                case 48: goto L_0x0103;
                case 49: goto L_0x00df;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.2Uy r2 = (X.C70762Uy) r2
            r5 = 0
            X.0qQ.A0B(r2, r5)
            java.lang.Object r1 = r15.A01
            X.0rh r1 = (X.0rh) r1
            android.view.MotionEvent r0 = r2.A00
            float r0 = r0.getX()
            r1.A00 = r0
            java.lang.Object r1 = r15.A02
            X.0rh r1 = (X.0rh) r1
            android.view.MotionEvent r0 = r2.A00
        L_0x001f:
            float r0 = r0.getY()
            r1.A00 = r0
        L_0x0025:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x002a:
            X.2W7 r2 = (X.AnonymousClass2W7) r2
            r5 = 0
            X.0qQ.A0B(r2, r5)
            java.lang.Object r1 = r15.A01
            X.0rh r1 = (X.0rh) r1
            android.view.MotionEvent r0 = r2.A00
            float r0 = r0.getX()
            r1.A00 = r0
            java.lang.Object r1 = r15.A02
            X.0rh r1 = (X.0rh) r1
            android.view.MotionEvent r0 = r2.A00
            goto L_0x001f
        L_0x0043:
            X.2Uy r4 = X.C51968G9o.A0a(r2)
            java.lang.Object r6 = r15.A02
            X.GvC r6 = (X.C53845GvC) r6
            java.lang.Object r5 = r15.A01
            X.3Y5 r5 = (X.AnonymousClass3Y5) r5
            com.instagram.common.session.UserSession r3 = r6.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328413937548627(0x81108000003d53, double:3.03757348466265E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0081
            X.JTJ r2 = r6.A04
            X.Gqu r0 = r6.A05
            X.4bN r1 = r0.A00
            android.content.Context r0 = X.C243803a8.A00(r5)
            android.view.View$OnTouchListener r2 = r2.AdX(r0, r1)
        L_0x006c:
            if (r2 == 0) goto L_0x008c
            android.view.View r1 = r4.A01
            android.view.MotionEvent r0 = r4.A00
            boolean r0 = r2.onTouch(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x008c
            boolean r5 = r0.booleanValue()
            goto L_0x0025
        L_0x0081:
            X.JTB r1 = r6.A03
            X.Gqu r0 = r6.A05
            X.4bN r0 = r0.A00
            android.view.View$OnTouchListener r2 = r1.CwX(r0)
            goto L_0x006c
        L_0x008c:
            r5 = 0
            goto L_0x0025
        L_0x008e:
            X.2Uy r2 = (X.C70762Uy) r2
            r5 = 0
            X.0qQ.A0B(r2, r5)
            java.lang.Object r0 = r15.A01
            android.content.Context r6 = X.C51969G9p.A0L(r0)
            java.lang.Object r0 = r15.A02
            X.GK6 r0 = (X.GK6) r0
            X.GK5 r1 = r0.A01
            X.JTF r4 = r0.A00
            X.AnonymousClass7TG.A1O(r1, r4)
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x0025
            X.1Xj r0 = r1.A04
            goto L_0x00cb
        L_0x00ac:
            X.2Uy r2 = (X.C70762Uy) r2
            r5 = 0
            X.0qQ.A0B(r2, r5)
            java.lang.Object r0 = r15.A01
            android.content.Context r6 = X.C51969G9p.A0L(r0)
            java.lang.Object r0 = r15.A02
            X.Gup r0 = (X.C53822Gup) r0
            X.GK4 r3 = r0.A03
            X.JTF r4 = r0.A04
            X.AnonymousClass7TG.A1O(r3, r4)
            X.GJ2 r1 = r3.A02
            X.GJ2 r0 = X.GJ2.EFFECT
            if (r1 != r0) goto L_0x0025
            X.1Xj r0 = r3.A00
        L_0x00cb:
            X.HFL r3 = new X.HFL
            r3.<init>(r6, r0, r4)
            android.view.View r1 = r2.A01
            X.0qQ.A06(r1)
            android.view.MotionEvent r0 = r2.A00
            X.0qQ.A06(r0)
            r3.onTouch(r1, r0)
            goto L_0x0025
        L_0x00df:
            java.lang.Object r3 = r15.A02
            X.GsT r3 = (X.C53676GsT) r3
            X.GET r2 = r3.A01
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0101
            java.lang.Object r0 = r15.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r1 = r0.A05
            r0 = 2131430167(0x7f0b0b17, float:1.8482027E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.view.View r1 = r1.A03(r0)
        L_0x00fa:
            X.JQl r0 = r3.A00
            r0.DV7(r1, r2)
            goto L_0x083e
        L_0x0101:
            r1 = 0
            goto L_0x00fa
        L_0x0103:
            java.lang.Object r4 = r15.A02
            X.Gtm r4 = (X.C53757Gtm) r4
            X.GES r3 = r4.A03
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x083e
            java.lang.Object r0 = r15.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r1 = r0.A05
            r0 = 2131430049(0x7f0b0aa1, float:1.8481788E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.view.View r2 = r1.A03(r0)
            if (r2 == 0) goto L_0x083e
            X.JTB r1 = r4.A01
            com.instagram.user.model.User r0 = r3.A01
            java.lang.String r0 = r0.getUsername()
            r1.EuF(r2, r0)
            goto L_0x083e
        L_0x012d:
            java.lang.Object r1 = r15.A01
            X.3Zt r1 = (X.C243673Zt) r1
            X.AnonymousClass2VL.A00()
            java.lang.Object r0 = r1.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x083e
            java.lang.Object r0 = r15.A02
            X.DbS.A1U(r0)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r1.A00(r0)
            goto L_0x083e
        L_0x014a:
            java.lang.Object r0 = r15.A02
            X.GHU r0 = (X.GHU) r0
            com.instagram.common.session.UserSession r3 = r0.A04
            X.4DU r2 = r0.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Object r0 = r15.A01
            X.1Xj r0 = (X.1Xj) r0
            X.JVF.A00(r2, r3, r0, r1)
            goto L_0x083e
        L_0x015d:
            java.lang.Object r2 = r15.A02
            X.GIt r2 = (X.C52202GIt) r2
            java.lang.Object r0 = r15.A01
            boolean r5 = X.C51972G9s.A1a(r0)
            com.instagram.clips.intf.ClipsViewerConfig r4 = r2.A02
            X.GIs r1 = r2.A05
            X.4bN r3 = r1.A00
            boolean r0 = X.AnonymousClass3ZC.A06(r4, r3)
            if (r0 == 0) goto L_0x083e
            X.JTJ r2 = r2.A04
            X.GDe r1 = r1.A01
            if (r5 == 0) goto L_0x0180
            X.8ZN r0 = X.AnonymousClass8ZN.CLIPS_VIEWER_HIGHLIGHTED_ATTRIBUTION_LINE
        L_0x017b:
            r2.CIB(r0, r4, r3, r1)
            goto L_0x083e
        L_0x0180:
            X.8ZN r0 = X.AnonymousClass8ZN.CLIPS_VIEWER_ATTRIBUTION_LINE
            goto L_0x017b
        L_0x0183:
            java.lang.Object r5 = r15.A02
            X.GTo r5 = (X.C52462GTo) r5
            java.lang.Object r3 = r15.A01
            X.2Wb r3 = (X.2Wb) r3
            X.GDe r0 = r5.A01
            X.3W1 r2 = r0.A0E
            if (r2 == 0) goto L_0x01b7
            boolean r0 = r2.A2z
            if (r0 == 0) goto L_0x01b7
            X.37E r1 = X.AnonymousClass37D.A00
            android.app.Activity r0 = X.C51969G9p.A0J(r3)
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x01a6
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r1.A0S(r0)
        L_0x01a6:
            boolean r0 = r2.A1p
            if (r0 == 0) goto L_0x01b7
            X.S6e r3 = r5.A02
            if (r3 == 0) goto L_0x01b7
            java.lang.String r2 = "secondary_cta"
            java.lang.String r1 = "dismiss"
            java.lang.String r0 = "interaction_tap"
            r3.A02(r2, r1, r0)
        L_0x01b7:
            X.JTB r4 = r5.A03
            if (r4 == 0) goto L_0x083e
            X.4bN r3 = r5.A00
            java.lang.String r2 = "sponsored_label"
            java.lang.String r1 = "sponsored_label_waist_tap"
            java.lang.String r0 = "primary"
            r4.Dzu(r3, r2, r1, r0)
            goto L_0x083e
        L_0x01c8:
            java.lang.Object r4 = r15.A02
            X.GvB r4 = (X.C53844GvB) r4
            java.lang.Object r5 = r15.A01
            X.2Wb r5 = (X.2Wb) r5
            X.GDe r0 = r4.A01
            X.3W1 r2 = r0.A0E
            if (r2 == 0) goto L_0x01fc
            boolean r0 = r2.A2z
            if (r0 == 0) goto L_0x01fc
            X.37E r1 = X.AnonymousClass37D.A00
            android.app.Activity r0 = X.C51969G9p.A0J(r5)
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x01eb
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r1.A0S(r0)
        L_0x01eb:
            boolean r0 = r2.A1p
            if (r0 == 0) goto L_0x01fc
            X.S6e r3 = r4.A02
            if (r3 == 0) goto L_0x01fc
            java.lang.String r2 = "secondary_cta"
            java.lang.String r1 = "dismiss"
            java.lang.String r0 = "interaction_tap"
            r3.A02(r2, r1, r0)
        L_0x01fc:
            X.JTK r1 = r4.A03
            if (r1 == 0) goto L_0x083e
            X.2V1 r0 = r5.Aqq()
            android.content.Context r2 = X.C51965G9l.A0B(r0)
            X.4bN r3 = r4.A00
            java.lang.String r4 = "sponsored_label"
            java.lang.String r5 = "sponsored_label_waist_tap"
            java.lang.String r6 = "primary"
            r1.CJR(r2, r3, r4, r5, r6)
            goto L_0x083e
        L_0x0215:
            X.2WA r8 = X.G9w.A0R(r2)
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r5 = r15.A02
            X.Gtk r5 = (X.C53755Gtk) r5
            java.util.Map r4 = r5.A03
            android.view.View r0 = r8.A00
            java.lang.Number r0 = X.C51966G9m.A14(r0, r4)
            long r0 = X.DbY.A04(r0)
            long r6 = r6 - r0
            r1 = 1200(0x4b0, double:5.93E-321)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x083e
            X.JTB r6 = r5.A02
            java.lang.Object r0 = r15.A01
            X.1Xj r0 = (X.1Xj) r0
            X.GDe r3 = r5.A01
            r6.Dzi(r3, r0)
            android.view.View r2 = r8.A00
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.put(r2, r0)
            X.4bN r9 = r5.A00
            int r11 = r3.A09()
            X.GKd r8 = X.C52236GKd.A1X
            goto L_0x026c
        L_0x0255:
            java.lang.Object r1 = r15.A02
            X.GtA r1 = (X.C53719GtA) r1
            X.JTB r6 = r1.A02
            java.lang.Object r0 = r15.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.4bN r9 = r1.A00
            r6.Dmw(r9, r0)
            X.GDe r0 = r1.A01
            int r11 = r0.A09()
            X.GKd r8 = X.C52236GKd.A1G
        L_0x026c:
            X.5OC r7 = X.AnonymousClass5OC.TAG_ABOVE_PROFILE
            r10 = 0
            r6.Chc(r7, r8, r9, r10, r11)
            goto L_0x083e
        L_0x0274:
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r15.A02
            X.Gv6 r0 = (X.C53839Gv6) r0
            X.JTB r3 = r0.A05
            X.4bN r6 = r0.A01
            X.GDe r7 = r0.A02
            X.GKd r5 = X.C52236GKd.A0k
            X.5OC r4 = X.AnonymousClass5OC.TAG_ABOVE_PROFILE
            r8 = 0
            r3.Chb(r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x083e
            java.lang.Object r1 = r15.A01
            X.2Wa r1 = (X.2Wa) r1
            boolean r0 = r3.CnX(r2)
            X.C51967G9n.A1I(r1, r0)
            goto L_0x083e
        L_0x0297:
            X.I6E r4 = X.I6E.A00
            java.lang.Object r0 = r15.A02
            X.Gv6 r0 = (X.C53839Gv6) r0
            com.instagram.common.session.UserSession r3 = r0.A04
            X.0iw r2 = r0.A03
            java.lang.Object r1 = r15.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r4.A04(r2, r3, r1, r0)
            goto L_0x083e
        L_0x02ac:
            java.lang.Object r1 = r15.A02
            X.Gv6 r1 = (X.C53839Gv6) r1
            X.JTB r0 = r1.A05
            java.lang.Object r4 = r15.A01
            X.1Xj r4 = (X.1Xj) r4
            r0.DJk(r4)
            X.I6E r3 = X.I6E.A00
            com.instagram.common.session.UserSession r2 = r1.A04
            X.0iw r1 = r1.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A03(r1, r2, r4, r0)
            goto L_0x083e
        L_0x02c6:
            java.lang.Object r0 = r15.A02
            X.Gv6 r0 = (X.C53839Gv6) r0
            X.JTB r2 = r0.A05
            java.lang.Object r1 = r15.A01
            X.1Xj r1 = (X.1Xj) r1
            X.GDe r0 = r0.A02
            int r0 = r0.A09()
            r2.ChG(r1, r0)
            goto L_0x083e
        L_0x02db:
            android.view.View r3 = X.C51969G9p.A0O(r2)
            java.lang.Object r0 = r15.A02
            X.Gv6 r0 = (X.C53839Gv6) r0
            X.JTB r2 = r0.A05
            java.lang.Object r1 = r15.A01
            X.1Xj r1 = (X.1Xj) r1
            X.GDe r0 = r0.A02
            int r0 = r0.A09()
            r2.ChH(r1, r0)
            r2.CIJ(r3, r1)
            goto L_0x083e
        L_0x02f7:
            java.lang.Object r0 = r15.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r1 = r0.A05
            java.lang.Object r0 = r15.A02
            X.GvA r0 = (X.C53843GvA) r0
            java.lang.Integer r0 = r0.A01
            android.view.View r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x083e
            int r0 = r0.intValue()
            r1.setId(r0)
            goto L_0x083e
        L_0x0312:
            java.lang.Object r1 = r15.A02
            X.GvA r1 = (X.C53843GvA) r1
            java.lang.Integer r2 = r1.A01
            if (r2 == 0) goto L_0x032a
            java.lang.Object r0 = r15.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.0sP r1 = r1.A03
            if (r1 == 0) goto L_0x083e
            X.2V1 r0 = r0.A05
            android.view.View r0 = r0.A03(r2)
            goto L_0x0507
        L_0x032a:
            X.0sP r1 = r1.A03
            if (r1 == 0) goto L_0x083e
            r0 = 0
            goto L_0x0507
        L_0x0331:
            java.lang.Object r0 = r15.A02
            X.2V5 r0 = (X.2V5) r0
            java.lang.Float r1 = X.C51967G9n.A0h()
            r0.A00(r1)
            java.lang.Object r0 = r15.A01
            X.2V5 r0 = (X.2V5) r0
            r0.A00(r1)
            goto L_0x083e
        L_0x0345:
            java.lang.Object r0 = r15.A02
            X.GTs r0 = (X.C52466GTs) r0
            X.JTB r2 = r0.A01
            X.4bN r1 = r0.A00
            java.lang.Object r0 = r15.A01
            X.4w6 r0 = (X.C278014w6) r0
            r2.DKW(r0, r1)
            goto L_0x083e
        L_0x0356:
            java.lang.Object r0 = r15.A02
            X.GNs r0 = (X.C52325GNs) r0
            X.GCk r2 = r0.A01
            java.lang.Object r0 = r15.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0368:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x037a
            java.lang.Object r0 = r1.next()
            X.HN1 r0 = (X.HN1) r0
            X.HLy r0 = r0.A02
            r5.add(r0)
            goto L_0x0368
        L_0x037a:
            X.0Ae r1 = r2.A00
            java.lang.String r0 = "ig_sundial_gesture_system_events"
            X.0Aj r4 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x083e
            java.lang.String r1 = "fanout_menu_impression"
            java.lang.String r0 = "action"
            X.C51973G9u.A14(r4, r0, r1)
            r3 = 0
            java.lang.String r0 = "action_source"
            r4.AAJ(r0, r3)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x039d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03b1
            java.lang.Object r0 = r1.next()
            X.HLy r0 = (X.C54641HLy) r0
            java.lang.String r0 = r0.name()
            r2.add(r0)
            goto L_0x039d
        L_0x03b1:
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "options"
            r4.AAJ(r0, r1)
            int r0 = r5.size()
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "options_count"
            r4.A9F(r0, r1)
            java.lang.String r0 = "metadata"
            r4.A9H(r0, r3)
            r4.Cgf()
            goto L_0x083e
        L_0x03d1:
            X.2W7 r2 = (X.AnonymousClass2W7) r2
            r1 = 0
            X.0qQ.A0B(r2, r1)
            java.lang.Object r0 = r15.A01
            X.Gls r0 = (X.C53306Gls) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x03f8
            java.lang.Object r0 = r15.A02
            boolean r0 = X.C51972G9s.A1a(r0)
            if (r0 == 0) goto L_0x03f8
            android.view.View r0 = r2.A01
            android.view.ViewParent r1 = r0.getParent()
            r0 = 1
            if (r1 == 0) goto L_0x03f3
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x03f3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x03f8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x03fd:
            int r2 = X.AnonymousClass7TE.A0M(r2)
            java.lang.Object r0 = r15.A02
            X.GuV r0 = (X.C53802GuV) r0
            int r1 = r0.A01
            java.lang.Object r0 = r15.A01
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            float r0 = r0.getAnimatedFraction()
            int r0 = X.0nH.A02(r0, r2, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0418:
            X.2WA r0 = X.G9w.A0R(r2)
            java.lang.Object r6 = r15.A02
            X.GxQ r6 = (X.C53982GxQ) r6
            X.GFO r5 = r6.A04
            boolean r4 = r5.A0D()
            if (r4 == 0) goto L_0x0435
            java.lang.Object r2 = r15.A01
            X.GCs r2 = (X.C52046GCs) r2
            android.view.View r1 = r0.A00
            X.0qQ.A06(r1)
            r0 = 0
            r2.A05(r1, r0, r0)
        L_0x0435:
            X.JTB r3 = r6.A03
            X.4bN r2 = r5.A0D
            X.GDe r1 = r5.A0E
            int r0 = r6.A00
            r3.DrX(r2, r1, r0, r4)
            goto L_0x083e
        L_0x0442:
            X.2WE r3 = X.C51968G9o.A0f(r2)
            java.lang.Object r1 = r15.A01
            X.3bE r1 = (X.C244463bE) r1
            r0 = 1
            r1.A00 = r0
            java.lang.Object r2 = r15.A02
            X.GYo r2 = (X.C52589GYo) r2
            com.instagram.common.session.UserSession r4 = r2.A06
            X.4bN r5 = r2.A03
            X.GDe r6 = r2.A04
            X.JTB r7 = r2.A07
            java.util.HashMap r8 = r2.A0E
            X.GFO r9 = r2.A0A
            X.GFx r10 = r2.A0D
            X.GZC r11 = r2.A08
            X.GZD r12 = r2.A09
            X.0iw r13 = r2.A05
            X.GAk r14 = r2.A0C
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
            r0 = 32
            X.JGB.A01(r3, r2, r1, r0)
            goto L_0x083e
        L_0x0472:
            X.2WE r5 = X.C51968G9o.A0f(r2)
            java.lang.Object r1 = r15.A01
            X.3bE r1 = (X.C244463bE) r1
            r0 = 1
            r1.A00 = r0
            java.lang.Object r4 = r15.A02
            X.GG5 r4 = (X.GG5) r4
            X.GFO r3 = r4.A00
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            r0 = 31
            X.JGB.A01(r5, r4, r1, r0)
            X.2V5 r2 = r3.A0A
            r1 = 15
            X.JGX r0 = new X.JGX
            r0.<init>(r4, r1)
            X.C244463bE.A00(r2, r5, r0)
            boolean r0 = r3.A0C()
            if (r0 == 0) goto L_0x083e
            X.2V5 r1 = r3.A02
            X.JJL r0 = X.JJL.A00
            X.C244463bE.A00(r1, r5, r0)
            goto L_0x083e
        L_0x04a7:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r1 = "ClipsItemErrorBoundary"
            java.lang.String r0 = "Error caught while rendering clip!"
            X.0KC.A0F(r1, r0, r2)
            X.0wj r4 = X.0wj.A01
            r0 = 817902720(0x30c03480, float:1.398476E-9)
            X.0f9 r3 = r4.AEf(r1, r0)
            java.lang.String r1 = "Clips item error caught: "
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "message"
            X.AnonymousClass7TF.A19(r3, r0, r1, r2)
            java.lang.Object r0 = r15.A02
            X.GDo r0 = (X.C52068GDo) r0
            X.5o2 r0 = r0.A00
            java.lang.String r1 = r0.toString()
            r0 = 817898112(0x30c02280, float:1.3979644E-9)
            X.0f9 r0 = r4.AEf(r1, r0)
            r0.ERJ(r2)
            r0.report()
            java.lang.Object r0 = r15.A01
            X.2Wa r0 = (X.2Wa) r0
            r0.A01(r2)
            goto L_0x083e
        L_0x04ec:
            java.lang.Object r0 = r15.A02
            X.GwU r0 = (X.C53924GwU) r0
            X.JPo r3 = r0.A04
            X.4bN r2 = r0.A00
            X.GDe r1 = r0.A01
            java.lang.Object r0 = r15.A01
            X.3xZ r0 = (X.C257543xZ) r0
            r3.DUS(r2, r1, r0)
            goto L_0x083e
        L_0x04ff:
            java.lang.Object r0 = r15.A02
            X.GBa r0 = (X.C52003GBa) r0
            X.0sP r1 = r0.A0E
            java.lang.Object r0 = r15.A01
        L_0x0507:
            r1.invoke(r0)
            goto L_0x083e
        L_0x050c:
            X.7zG r2 = (X.C348917zG) r2
            if (r2 == 0) goto L_0x083e
            X.5kq r8 = r2.A01
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 1
            if (r0 == 0) goto L_0x083e
            java.lang.Object r2 = r15.A02
            X.H0c r2 = (X.C54133H0c) r2
            java.lang.Object r6 = r15.A01
            android.view.View r6 = (android.view.View) r6
            X.0eM r5 = r2.A0B
            r5.getValue()
            java.util.List r0 = r8.A0v
            java.util.Iterator r7 = r0.iterator()
            r3 = 0
        L_0x052f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0542
            java.lang.Object r0 = r7.next()
            X.51M r0 = (X.AnonymousClass51M) r0
            int r1 = r0.A08
            int r0 = r0.A09
            int r1 = r1 - r0
            int r3 = r3 + r1
            goto L_0x052f
        L_0x0542:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r8.A0N
            if (r0 != 0) goto L_0x0564
            java.util.List r0 = r8.A0l
            if (r0 == 0) goto L_0x0550
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0564
        L_0x0550:
            X.8vh r0 = r8.A0C
            if (r0 == 0) goto L_0x069a
            X.8pV r0 = r0.A01
            if (r0 == 0) goto L_0x069a
            X.8vv r0 = r0.A03
            if (r0 == 0) goto L_0x069a
            java.util.List r0 = r0.A05
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r4) goto L_0x069a
        L_0x0564:
            r1 = 0
        L_0x0565:
            r2.A06 = r1
            X.0eM r0 = r2.A0C
            X.0lg r7 = X.DbT.A0X(r0)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323156898229161(0x810bb8000a2ba9, double:3.034248911828621E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            r2.A07 = r0
            r0 = 2131428299(0x7f0b03cb, float:1.8478239E38)
            android.view.View r0 = r6.requireViewById(r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = (com.instagram.igds.components.textcell.IgdsListCell) r0
            r2.A02 = r0
            java.lang.String r9 = "audioTranslationOptInToggle"
            r8 = r9
            if (r0 == 0) goto L_0x05c3
            X.Njo r3 = X.C69349Njo.TYPE_SWITCH
            r0.setTextCellType(r3)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r2.A02
            if (r1 == 0) goto L_0x05c3
            r0 = 2131955270(0x7f130e46, float:1.9547063E38)
            r1.A06(r0)
            r0 = 2131428300(0x7f0b03cc, float:1.847824E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r6, r0)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r6)
            r0 = 2131955271(0x7f130e47, float:1.9547065E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r7.setText(r0)
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x068b
            r0 = 2131428298(0x7f0b03ca, float:1.8478237E38)
            android.view.ViewStub r1 = X.DbS.A0F(r6, r0)
            r2.A01 = r1
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0617
            if (r1 != 0) goto L_0x05cb
            java.lang.String r9 = "lipSyncOptInToggleStub"
        L_0x05c3:
            X.0qQ.A0F(r9)
        L_0x05c6:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x05cb:
            android.view.View r1 = r1.inflate()
            r7 = 8
            r1.setVisibility(r7)
            r0 = 2131428297(0x7f0b03c9, float:1.8478235E38)
            android.view.View r1 = r1.requireViewById(r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            r2.A04 = r1
            java.lang.String r9 = "lipSyncOptInToggle"
            if (r1 == 0) goto L_0x05c3
            r0 = 2131955267(0x7f130e43, float:1.9547057E38)
            r1.A06(r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = r2.A04
            if (r0 == 0) goto L_0x05c3
            r0.setTextCellType(r3)
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x05f9
            boolean r0 = r2.A0A
            r3 = 0
            if (r0 == 0) goto L_0x05fa
        L_0x05f9:
            r3 = 1
        L_0x05fa:
            com.instagram.igds.components.textcell.IgdsListCell r0 = r2.A04
            if (r0 == 0) goto L_0x05c3
            r0.setChecked(r3)
            java.lang.Object r0 = r5.getValue()
            X.JiA r0 = (X.C60253JiA) r0
            X.2Fj r1 = r0.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A0B(r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = r2.A04
            if (r0 == 0) goto L_0x05c3
            X.IEB.A00(r0, r2, r7)
        L_0x0617:
            r0 = 2131428296(0x7f0b03c8, float:1.8478232E38)
            android.view.View r1 = r6.requireViewById(r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            r2.A03 = r1
            java.lang.String r9 = "audioTranslationsLanguageSelector"
            if (r1 == 0) goto L_0x05c3
            X.Njo r0 = X.C69349Njo.TYPE_CHEVRON
            r1.setTextCellType(r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r2.A03
            if (r1 == 0) goto L_0x05c3
            r0 = 2131955281(0x7f130e51, float:1.9547085E38)
            r1.A06(r0)
            com.instagram.igds.components.textcell.IgdsListCell r3 = r2.A03
            if (r3 == 0) goto L_0x05c3
            int r0 = r2.A00
            if (r0 <= 0) goto L_0x0677
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L_0x0641:
            r0 = 0
            r3.A0K(r1, r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r2.A03
            if (r1 == 0) goto L_0x05c3
            r0 = 37
            X.C56801ICy.A01(r1, r0, r2)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r2.A02
            if (r1 == 0) goto L_0x0686
            boolean r0 = r2.A09
            r1.setChecked(r0)
            java.lang.Object r1 = r5.getValue()
            X.JiA r1 = (X.C60253JiA) r1
            boolean r0 = r2.A09
            r1.A01(r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = r2.A02
            if (r0 == 0) goto L_0x0686
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x066d
            X.C54133H0c.A01(r2, r4)
        L_0x066d:
            com.instagram.igds.components.textcell.IgdsListCell r1 = r2.A02
            if (r1 == 0) goto L_0x0686
            r0 = 7
            X.IEB.A00(r1, r2, r0)
            goto L_0x083e
        L_0x0677:
            java.lang.String r1 = ""
            goto L_0x0641
        L_0x067a:
            java.lang.Object r0 = r15.A02
            X.HIp r0 = (X.C54554HIp) r0
            com.meta.foa.session.FoaUserSession r3 = r0.A01
            X.GhS r2 = r0.A01
            if (r2 != 0) goto L_0x06a2
            java.lang.String r8 = "nuxViewModel"
        L_0x0686:
            X.0qQ.A0F(r8)
            goto L_0x05c6
        L_0x068b:
            com.instagram.igds.components.textcell.IgdsListCell r1 = r2.A02
            if (r1 == 0) goto L_0x05c3
            r0 = 36
            X.ICy r0 = X.C56801ICy.A00(r2, r0)
            r1.setCompoundButtonClickListener(r0)
            goto L_0x083e
        L_0x069a:
            r0 = 90000(0x15f90, float:1.26117E-40)
            r1 = 1
            if (r3 <= r0) goto L_0x0565
            goto L_0x0564
        L_0x06a2:
            java.lang.Object r1 = r15.A01
            X.I1s r1 = (X.C56564I1s) r1
            X.Gt0 r0 = new X.Gt0
            r0.<init>(r3, r1, r2)
            return r0
        L_0x06ac:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r15.A02
            X.5Oz r0 = (X.C284945Oz) r0
            r0.Epw(r2)
            java.lang.Object r0 = r15.A01
            X.0sP r0 = (X.0sP) r0
            goto L_0x07f2
        L_0x06bd:
            X.Ja7 r2 = (X.C59832Ja7) r2
            java.lang.Object r0 = r15.A02
            X.LBJ r0 = (X.LBJ) r0
            X.0qQ.A0A(r2)
            X.C56269Hvd.A00(r2, r0)
            goto L_0x083e
        L_0x06cb:
            X.GO1 r2 = (X.GO1) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r3 = r15.A02
            X.GiF r3 = (X.C53081GiF) r3
            java.lang.Object r1 = r15.A01
            X.8vc r1 = (X.C369968vc) r1
            X.Iih r0 = new X.Iih
            r0.<init>(r1, r2, r3)
            X.11Z.A02(r0)
            goto L_0x083e
        L_0x06e3:
            java.lang.Object r3 = r15.A02
            X.2YL r3 = (X.2YL) r3
            X.6oS r2 = X.C318116oQ.A00(r3)
            java.lang.Object r1 = r15.A01
            r0 = 16
            X.C58105ImR.A01(r3, r1, r2, r0)
            goto L_0x083e
        L_0x06f4:
            X.I11 r2 = (X.I11) r2
            r3 = 0
            X.0qQ.A0B(r2, r3)
            java.lang.Object r7 = r15.A02
            X.Gqi r7 = (X.C53567Gqi) r7
            java.lang.Object r0 = r7.A02
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r6 = r15.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0708:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x072d
            java.lang.Object r5 = r1.next()
            X.3lr r5 = (X.C250663lr) r5
            java.lang.String r0 = "strong_id__"
            java.lang.String r8 = r5.getOptionalStringField(r3, r0)
            if (r8 == 0) goto L_0x0708
            r0 = -737245827(0xffffffffd40e857d, float:-2.44849967E12)
            r9 = 4
            X.JGw r4 = new X.JGw
            r4.<init>(r5, r6, r7, r8, r9)
            X.5PJ r0 = X.AnonymousClass5PI.A03(r4, r0)
            r2.A01(r8, r8, r8, r0)
            goto L_0x0708
        L_0x072d:
            X.0sK r1 = X.C55401Hh7.A01
            java.lang.String r0 = "disclaimer"
            r2.A01(r0, r0, r0, r1)
            goto L_0x083e
        L_0x0736:
            X.I11 r2 = (X.I11) r2
            r8 = 0
            X.0qQ.A0B(r2, r8)
            java.lang.Object r0 = r15.A02
            X.Gqh r0 = (X.C53566Gqh) r0
            X.62P r0 = r0.A00
            java.lang.Object r7 = r15.A01
            java.util.Iterator r6 = r0.iterator()
        L_0x0748:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x083e
            java.lang.Object r5 = r6.next()
            X.3lr r5 = (X.C250663lr) r5
            java.lang.String r0 = "strong_id__"
            java.lang.String r4 = r5.getOptionalStringField(r8, r0)
            if (r4 == 0) goto L_0x0748
            r3 = 2144429832(0x7fd16708, float:NaN)
            r1 = 2
            X.JGo r0 = new X.JGo
            r0.<init>(r5, r7, r4, r1)
            X.5PJ r0 = X.AnonymousClass5PI.A03(r0, r3)
            r2.A01(r4, r4, r4, r0)
            goto L_0x0748
        L_0x076d:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r15.A02
            X.GuU r0 = (X.C53801GuU) r0
            X.0sL r1 = r0.A01
            java.lang.Object r0 = r15.A01
            X.JMW r0 = (X.JMW) r0
            X.IdH r0 = (X.C57590IdH) r0
            X.Hsk r0 = r0.A00
            java.lang.String r0 = r0.A01
            r1.invoke(r0, r2)
            goto L_0x083e
        L_0x0786:
            X.Gd5 r2 = (X.C52813Gd5) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.HNO r4 = X.HNO.A0E
            java.lang.Object r3 = r15.A01
            java.lang.Object r1 = r15.A02
            r0 = 5
            X.J6R r0 = A00(r1, r3, r0)
            X.C55234HeP.A00(r2, r4, r0)
            goto L_0x083e
        L_0x079c:
            android.text.SpannableStringBuilder r2 = (android.text.SpannableStringBuilder) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r1 = r15.A02
            r0 = 14
            X.IwH r1 = X.C58708IwH.A01(r1, r0)
            java.lang.Object r0 = r15.A01
            X.0sP r0 = (X.0sP) r0
            X.Gy0 r5 = new X.Gy0
            r5.<init>(r1)
            int r4 = r2.length()
            r0.invoke(r2)
            goto L_0x081b
        L_0x07bb:
            java.lang.Object r0 = r15.A02
            X.I0l r0 = (X.C56536I0l) r0
            X.0Ud r3 = r0.A07
            java.lang.Object r2 = r15.A01
            X.0sP r2 = (X.0sP) r2
            X.HtS r1 = X.C56536I0l.A00(r0)
            X.Gsx r0 = new X.Gsx
            r0.<init>(r1, r2, r3)
            return r0
        L_0x07cf:
            java.lang.Object r1 = r15.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r15.A02
            java.lang.Object r0 = r1.invoke(r0)
            return r0
        L_0x07da:
            X.ExE r2 = (X.C49532ExE) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r1 = r15.A01
            X.I4X r1 = (X.I4X) r1
            X.Di6 r0 = r1.A03
            r2.A00 = r0
            java.lang.Integer r0 = r1.A00
            r2.A01 = r0
            java.lang.Object r0 = r15.A02
            X.0sP r0 = (X.0sP) r0
            if (r0 == 0) goto L_0x083e
        L_0x07f2:
            r0.invoke(r2)
            goto L_0x083e
        L_0x07f6:
            android.text.SpannableStringBuilder r2 = (android.text.SpannableStringBuilder) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r3 = r15.A01
            X.2Wb r3 = (X.2Wb) r3
            java.lang.Object r1 = r15.A02
            r0 = 16
            X.Ivx r0 = X.C58688Ivx.A00(r3, r1, r0)
            X.Gy0 r5 = new X.Gy0
            r5.<init>(r0)
            int r4 = r2.length()
            r0 = 2131966028(0x7f13384c, float:1.9568883E38)
            java.lang.String r0 = X.C244013aV.A0E(r3, r0)
            r2.append(r0)
        L_0x081b:
            int r1 = r2.length()
            r0 = 17
            r2.setSpan(r5, r4, r1, r0)
            goto L_0x083e
        L_0x0825:
            java.lang.Object r3 = r15.A02
            X.GuS r3 = (X.C53799GuS) r3
            X.0sP r1 = r3.A01
            X.HIT r0 = X.HIT.A00
            r1.invoke(r0)
            X.AUb r2 = r3.A00
            java.lang.Object r1 = r15.A01
            X.A7O r1 = (X.A7O) r1
            X.IHc r0 = new X.IHc
            r0.<init>(r3)
            r2.A06(r1, r0)
        L_0x083e:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J6R.invoke(java.lang.Object):java.lang.Object");
    }
}
