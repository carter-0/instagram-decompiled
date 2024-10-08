package X;

public final class J6F extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6F(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static J6F A00(Object obj, int i) {
        return new J6F(obj, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03a8, code lost:
        r3 = r1.onTouch(r6.A01, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03af, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03bb, code lost:
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ad, code lost:
        r1.Chc(X.AnonymousClass5OC.TAG_ABOVE_PROFILE, r3, r4, (java.lang.Integer) null, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e8, code lost:
        r1.Chb(X.AnonymousClass5OC.TAG_ABOVE_PROFILE, r3, r4, r5, (java.lang.Integer) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0143, code lost:
        r3.CJ0(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0158, code lost:
        r4.CJ2(r1, r3, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0241, code lost:
        r2 = r1.A03("clips_author_info_inline_follow_button_component");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0249, code lost:
        if ((r2 instanceof com.instagram.user.follow.FollowButton) == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x024b, code lost:
        r2 = (com.instagram.user.follow.FollowButtonBase) r2;
        r2.A0J.A0C = X.C243943aO.FOLLOW_BUTTON_EXPANDED_AREA;
        r2.performClick();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0292, code lost:
        r2.onClick(r0.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02dd, code lost:
        r0.invoke();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            r6 = r24
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x0023;
                case 2: goto L_0x0047;
                case 3: goto L_0x0055;
                case 4: goto L_0x0069;
                case 5: goto L_0x0076;
                case 6: goto L_0x008a;
                case 7: goto L_0x009a;
                case 8: goto L_0x00b5;
                case 9: goto L_0x00c2;
                case 10: goto L_0x00cf;
                case 11: goto L_0x00dc;
                case 12: goto L_0x00f0;
                case 13: goto L_0x00fd;
                case 14: goto L_0x010c;
                case 15: goto L_0x011d;
                case 16: goto L_0x012c;
                case 17: goto L_0x0009;
                case 18: goto L_0x0135;
                case 19: goto L_0x0148;
                case 20: goto L_0x015d;
                case 21: goto L_0x012c;
                case 22: goto L_0x0009;
                case 23: goto L_0x02e2;
                case 24: goto L_0x018d;
                case 25: goto L_0x028a;
                case 26: goto L_0x01d0;
                case 27: goto L_0x02f4;
                case 28: goto L_0x01db;
                case 29: goto L_0x01f6;
                case 30: goto L_0x0205;
                case 31: goto L_0x0301;
                case 32: goto L_0x021c;
                case 33: goto L_0x0232;
                case 34: goto L_0x0239;
                case 35: goto L_0x0232;
                case 36: goto L_0x0239;
                case 37: goto L_0x0258;
                case 38: goto L_0x0319;
                case 39: goto L_0x0299;
                case 40: goto L_0x012c;
                case 41: goto L_0x0009;
                case 42: goto L_0x02a9;
                case 43: goto L_0x0341;
                case 44: goto L_0x0378;
                case 45: goto L_0x02b6;
                case 46: goto L_0x02c3;
                case 47: goto L_0x02d0;
                case 48: goto L_0x03b1;
                case 49: goto L_0x02d7;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
            X.GAM r0 = (X.GAM) r0
            android.animation.ValueAnimator r0 = r0.A08
            r0.cancel()
        L_0x0012:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0015:
            java.lang.Object r0 = r1.A01
            X.Gv6 r0 = (X.C53839Gv6) r0
            X.JTB r1 = r0.A05
            X.4bN r4 = r0.A01
            X.GDe r5 = r0.A02
            X.GKd r3 = X.C52236GKd.A04
            goto L_0x00e8
        L_0x0023:
            java.lang.Object r3 = r1.A01
            X.Gv6 r3 = (X.C53839Gv6) r3
            X.4bN r4 = r3.A01
            X.1Xj r2 = r4.A02
            if (r2 == 0) goto L_0x003c
            X.GDe r0 = r3.A02
            X.3W1 r1 = r0.A0E
            if (r1 == 0) goto L_0x003c
            X.JTB r0 = r3.A05
            X.JRM r0 = r0.C41()
            r0.Duw(r2, r1)
        L_0x003c:
            X.JTB r1 = r3.A05
            X.GDe r0 = r3.A02
            int r6 = r0.A09()
            X.GKd r3 = X.C52236GKd.A19
            goto L_0x00ad
        L_0x0047:
            java.lang.Object r0 = r1.A01
            X.Gv6 r0 = (X.C53839Gv6) r0
            X.JTB r1 = r0.A05
            X.4bN r4 = r0.A01
            X.GDe r5 = r0.A02
            X.GKd r3 = X.C52236GKd.A19
            goto L_0x00e8
        L_0x0055:
            java.lang.Object r0 = r1.A01
            X.Gv6 r0 = (X.C53839Gv6) r0
            X.JTB r1 = r0.A05
            X.4bN r4 = r0.A01
            X.GDe r0 = r0.A02
            r1.Du6(r4, r0)
            int r6 = r0.A09()
            X.GKd r3 = X.C52236GKd.A0F
            goto L_0x00ad
        L_0x0069:
            java.lang.Object r0 = r1.A01
            X.Gv6 r0 = (X.C53839Gv6) r0
            X.JTB r1 = r0.A05
            X.4bN r4 = r0.A01
            X.GDe r5 = r0.A02
            X.GKd r3 = X.C52236GKd.A0F
            goto L_0x00e8
        L_0x0076:
            java.lang.Object r0 = r1.A01
            X.Gv6 r0 = (X.C53839Gv6) r0
            X.JTB r1 = r0.A05
            X.4bN r4 = r0.A01
            X.GDe r0 = r0.A02
            r1.Du8(r4, r0)
            int r6 = r0.A09()
            X.GKd r3 = X.C52236GKd.A1R
            goto L_0x00ad
        L_0x008a:
            java.lang.Object r0 = r1.A01
            X.Gv6 r0 = (X.C53839Gv6) r0
            X.JTB r1 = r0.A05
            X.4bN r4 = r0.A01
            X.GDe r5 = r0.A02
            r1.Du7(r4, r5)
            X.GKd r3 = X.C52236GKd.A1R
            goto L_0x00e8
        L_0x009a:
            java.lang.Object r0 = r1.A01
            X.Gv6 r0 = (X.C53839Gv6) r0
            X.JTB r1 = r0.A05
            X.4bN r4 = r0.A01
            X.GDe r0 = r0.A02
            r1.DuI(r4, r0)
            int r6 = r0.A09()
            X.GKd r3 = X.C52236GKd.A0A
        L_0x00ad:
            X.5OC r2 = X.AnonymousClass5OC.TAG_ABOVE_PROFILE
            r5 = 0
            r1.Chc(r2, r3, r4, r5, r6)
            goto L_0x0012
        L_0x00b5:
            java.lang.Object r0 = r1.A01
            X.Gv6 r0 = (X.C53839Gv6) r0
            X.JTB r1 = r0.A05
            X.4bN r4 = r0.A01
            X.GDe r5 = r0.A02
            X.GKd r3 = X.C52236GKd.A0A
            goto L_0x00e8
        L_0x00c2:
            java.lang.Object r0 = r1.A01
            X.GtA r0 = (X.C53719GtA) r0
            X.JTB r1 = r0.A02
            X.4bN r4 = r0.A00
            X.GDe r5 = r0.A01
            X.GKd r3 = X.C52236GKd.A1G
            goto L_0x00e8
        L_0x00cf:
            java.lang.Object r0 = r1.A01
            X.Gtk r0 = (X.C53755Gtk) r0
            X.JTB r1 = r0.A02
            X.4bN r4 = r0.A00
            X.GDe r5 = r0.A01
            X.GKd r3 = X.C52236GKd.A1X
            goto L_0x00e8
        L_0x00dc:
            java.lang.Object r0 = r1.A01
            X.GtB r0 = (X.C53720GtB) r0
            X.JTB r1 = r0.A02
            X.4bN r4 = r0.A00
            X.GDe r5 = r0.A01
            X.GKd r3 = X.C52236GKd.A1Y
        L_0x00e8:
            X.5OC r2 = X.AnonymousClass5OC.TAG_ABOVE_PROFILE
            r6 = 0
            r1.Chb(r2, r3, r4, r5, r6)
            goto L_0x0012
        L_0x00f0:
            java.lang.Object r0 = r1.A01
            X.Gup r0 = (X.C53822Gup) r0
            X.JTF r3 = r0.A04
            X.4bN r2 = r0.A01
            X.GK4 r1 = r0.A03
            int r0 = r0.A00
            goto L_0x0143
        L_0x00fd:
            java.lang.Object r0 = r1.A01
            X.Gup r0 = (X.C53822Gup) r0
            X.JTF r4 = r0.A04
            X.GK4 r3 = r0.A03
            int r2 = r0.A00
            X.4bN r1 = r0.A01
            X.JMk r0 = r0.A05
            goto L_0x0158
        L_0x010c:
            java.lang.Object r0 = r1.A01
            X.Gtl r0 = (X.C53756Gtl) r0
            X.JTB r2 = r0.A00
            X.Gqt r0 = r0.A01
            X.4bN r1 = r0.A00
            X.GDe r0 = r0.A01
            r2.Cww(r1, r0)
            goto L_0x0012
        L_0x011d:
            java.lang.Object r0 = r1.A01
            X.Gtl r0 = (X.C53756Gtl) r0
            X.JTB r1 = r0.A00
            X.Gqt r0 = r0.A01
            X.4bN r0 = r0.A00
            r1.Cwx(r0)
            goto L_0x0012
        L_0x012c:
            java.lang.Object r0 = r1.A01
            X.GAM r0 = (X.GAM) r0
            r0.A01()
            goto L_0x0012
        L_0x0135:
            java.lang.Object r0 = r1.A01
            X.GK6 r0 = (X.GK6) r0
            X.JTF r3 = r0.A00
            X.GK5 r0 = r0.A01
            X.4bN r2 = r0.A02
            X.GK4 r1 = r0.A05
            int r0 = r0.A00
        L_0x0143:
            r3.CJ0(r2, r1, r0)
            goto L_0x0012
        L_0x0148:
            java.lang.Object r0 = r1.A01
            X.GK6 r0 = (X.GK6) r0
            X.JTF r4 = r0.A00
            X.GK5 r0 = r0.A01
            X.GK4 r3 = r0.A05
            int r2 = r0.A00
            X.4bN r1 = r0.A02
            X.JMk r0 = r0.A06
        L_0x0158:
            r4.CJ2(r1, r3, r0, r2)
            goto L_0x0012
        L_0x015d:
            java.lang.Object r5 = r1.A01
            X.GvC r5 = (X.C53845GvC) r5
            com.instagram.common.session.UserSession r3 = r5.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328413937548627(0x81108000003d53, double:3.03757348466265E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0181
            X.JTJ r4 = r5.A04
            X.Gqu r0 = r5.A05
            X.4bN r3 = r0.A00
            X.GDe r2 = r0.A01
            boolean r1 = r0.A03
            int r0 = r5.A00
            r4.CJH(r3, r2, r0, r1)
            goto L_0x0012
        L_0x0181:
            X.JTB r3 = r5.A03
            X.Gqu r0 = r5.A05
            X.4bN r2 = r0.A00
            X.GDe r1 = r0.A01
            int r0 = r5.A00
            goto L_0x026f
        L_0x018d:
            r4 = 0
            X.0qQ.A0B(r6, r4)
            java.lang.Object r0 = r1.A01
            X.GHU r0 = (X.GHU) r0
            X.JTB r5 = r0.A07
            X.4bN r7 = r0.A02
            X.GDe r8 = r0.A03
            com.instagram.common.session.UserSession r3 = r0.A04
            com.instagram.user.model.User r10 = r7.A08(r3)
            X.HLF r9 = X.AnonymousClass3ZC.A01(r7)
            X.0Tu r2 = X.C51965G9l.A0Z(r3, r4)
            r0 = 2342171461806013797(0x2081108900013d65, double:4.072752961511325E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01cd
            r18 = 0
        L_0x01b6:
            r6 = 0
            java.lang.String r17 = "profile_info_follower_count"
            java.lang.String r19 = "primary"
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r20 = r6
            r21 = r4
            r22 = r4
            r5.Da6(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0012
        L_0x01cd:
            java.lang.String r18 = "profile_info_follower_count_tap"
            goto L_0x01b6
        L_0x01d0:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r1.A01
            X.C51965G9l.A1W(r0, r6)
            goto L_0x0012
        L_0x01db:
            java.lang.Object r0 = r1.A01
            X.GHU r0 = (X.GHU) r0
            com.instagram.common.session.UserSession r3 = r0.A04
            X.4DU r2 = r0.A06
            X.4bN r1 = r0.A02
            X.1Xj r0 = r1.A02
            if (r0 == 0) goto L_0x01f4
            java.lang.String r5 = r0.A2n()
        L_0x01ed:
            r4 = 0
            r6 = 0
            X.C52086GEg.A0T(r1, r2, r3, r4, r5, r6)
            goto L_0x0012
        L_0x01f4:
            r5 = 0
            goto L_0x01ed
        L_0x01f6:
            java.lang.Object r0 = r1.A01
            X.Gtm r0 = (X.C53757Gtm) r0
            X.JPu r2 = r0.A02
            X.GES r1 = r0.A03
            X.GDe r0 = r0.A00
            r2.D4D(r0, r1)
            goto L_0x0012
        L_0x0205:
            java.lang.Object r1 = r1.A01
            X.GwF r1 = (X.C53909GwF) r1
            X.4Ew r0 = X.C53909GwF.A09
            X.JP4 r2 = r1.A06
            X.4bN r3 = r1.A02
            X.GDe r4 = r1.A03
            int r6 = r1.A01
            int r7 = r1.A00
            X.JTB r5 = r1.A05
            r2.D7h(r3, r4, r5, r6, r7)
            goto L_0x0012
        L_0x021c:
            java.lang.Object r1 = r1.A01
            X.3Zt r1 = (X.C243673Zt) r1
            X.AnonymousClass2VL.A00()
            java.lang.Object r0 = r1.A00
            java.util.Timer r0 = (java.util.Timer) r0
            if (r0 == 0) goto L_0x022c
            r0.cancel()
        L_0x022c:
            r0 = 0
            r1.A00(r0)
            goto L_0x0012
        L_0x0232:
            java.lang.Object r0 = r1.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r1 = r0.A05
            goto L_0x0241
        L_0x0239:
            java.lang.Object r0 = r1.A01
            X.2Wc r0 = (X.C70832Wc) r0
            X.2V1 r1 = r0.Aqq()
        L_0x0241:
            java.lang.String r0 = "clips_author_info_inline_follow_button_component"
            android.view.View r2 = r1.A03(r0)
            boolean r0 = r2 instanceof com.instagram.user.follow.FollowButton
            if (r0 == 0) goto L_0x0012
            com.instagram.user.follow.FollowButtonBase r2 = (com.instagram.user.follow.FollowButtonBase) r2
            X.4at r1 = r2.A0J
            X.3aO r0 = X.C243943aO.FOLLOW_BUTTON_EXPANDED_AREA
            r1.A0C = r0
            r2.performClick()
            goto L_0x0012
        L_0x0258:
            X.2WA r0 = X.G9w.A0R(r6)
            java.lang.Object r1 = r1.A01
            X.GMi r1 = (X.C52292GMi) r1
            android.view.View$OnClickListener r2 = r1.A00
            if (r2 != 0) goto L_0x0292
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0274
            X.JTB r3 = r1.A06
            X.4bN r2 = r1.A02
            X.GDe r1 = r1.A04
            r0 = 1
        L_0x026f:
            r3.Dly(r2, r1, r0)
            goto L_0x0012
        L_0x0274:
            com.instagram.clips.intf.ClipsViewerConfig r0 = r1.A01
            X.4bN r4 = r1.A02
            boolean r0 = X.AnonymousClass3ZC.A06(r0, r4)
            if (r0 == 0) goto L_0x0012
            X.JTB r3 = r1.A06
            X.GDe r2 = r1.A04
            X.8ZN r1 = X.AnonymousClass8ZN.CLIPS_VIEWER_ATTRIBUTION_LINE
            r0 = 1
            r3.CwW(r1, r4, r2, r0)
            goto L_0x0012
        L_0x028a:
            X.2WA r0 = X.G9w.A0R(r6)
            java.lang.Object r2 = r1.A01
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
        L_0x0292:
            android.view.View r0 = r0.A00
            r2.onClick(r0)
            goto L_0x0012
        L_0x0299:
            java.lang.Object r0 = r1.A01
            X.GMi r0 = (X.C52292GMi) r0
            X.JTB r3 = r0.A06
            X.4bN r2 = r0.A02
            X.GDe r1 = r0.A04
            r0 = 0
            r3.CwV(r2, r1, r0)
            goto L_0x0012
        L_0x02a9:
            java.lang.Object r0 = r1.A01
            X.GsT r0 = (X.C53676GsT) r0
            X.JQl r1 = r0.A00
            X.GET r0 = r0.A01
            r1.DV5(r0)
            goto L_0x0012
        L_0x02b6:
            java.lang.Object r0 = r1.A01
            X.GHS r0 = (X.GHS) r0
            X.JQU r1 = r0.A00
            X.GER r0 = r0.A01
            r1.DH6(r0)
            goto L_0x0012
        L_0x02c3:
            java.lang.Object r0 = r1.A01
            X.GHS r0 = (X.GHS) r0
            X.JQU r1 = r0.A00
            X.GER r0 = r0.A01
            r1.Do7(r0)
            goto L_0x0012
        L_0x02d0:
            java.lang.Object r0 = r1.A01
            X.GsU r0 = (X.C53677GsU) r0
            X.0sa r0 = r0.A00
            goto L_0x02dd
        L_0x02d7:
            java.lang.Object r0 = r1.A01
            X.Gur r0 = (X.C53824Gur) r0
            X.0sa r0 = r0.A00
        L_0x02dd:
            r0.invoke()
            goto L_0x0012
        L_0x02e2:
            X.2Uy r0 = X.C51968G9o.A0a(r6)
            java.lang.Object r2 = r1.A01
            android.view.View$OnTouchListener r2 = (android.view.View.OnTouchListener) r2
            android.view.View r1 = r0.A01
            android.view.MotionEvent r0 = r0.A00
            boolean r3 = r2.onTouch(r1, r0)
            goto L_0x03b7
        L_0x02f4:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r1.A01
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r0 = r0.invoke(r6)
            return r0
        L_0x0301:
            int r0 = X.AnonymousClass7TE.A0M(r6)
            int r2 = r0 + 1
            java.lang.Object r1 = r1.A01
            X.GwF r1 = (X.C53909GwF) r1
            X.4Ew r0 = X.C53909GwF.A09
            java.util.List r0 = r1.A07
            int r0 = r0.size()
            int r2 = r2 % r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L_0x0319:
            X.2Uy r6 = (X.C70762Uy) r6
            r3 = 0
            X.0qQ.A0B(r6, r3)
            java.lang.Object r2 = r1.A01
            X.GMi r2 = (X.C52292GMi) r2
            com.instagram.clips.intf.ClipsViewerConfig r0 = r2.A01
            X.4bN r1 = r2.A02
            boolean r0 = X.AnonymousClass3ZC.A06(r0, r1)
            if (r0 == 0) goto L_0x03b7
            android.view.View$OnClickListener r0 = r2.A00
            if (r0 != 0) goto L_0x03b7
            X.JTB r0 = r2.A06
            android.view.View$OnTouchListener r2 = r0.CwX(r1)
            if (r2 == 0) goto L_0x03b7
            android.view.View r1 = r6.A01
            android.view.MotionEvent r0 = r6.A00
            r2.onTouch(r1, r0)
            goto L_0x03b7
        L_0x0341:
            X.2Uy r6 = X.C51968G9o.A0a(r6)
            android.view.MotionEvent r5 = r6.A00
            X.3ZC r2 = X.AnonymousClass3ZC.A00
            X.0qQ.A0A(r5)
            java.lang.Object r7 = r1.A01
            X.GHV r7 = (X.GHV) r7
            com.instagram.clips.intf.ClipsViewerConfig r0 = r7.A03
            X.4bN r1 = r7.A04
            boolean r0 = r2.A0a(r5, r0, r1)
            if (r0 == 0) goto L_0x03af
            android.view.View r4 = r6.A01
            X.0qQ.A06(r4)
            com.instagram.common.session.UserSession r3 = r7.A06
            boolean r2 = r1.CcK()
            float r1 = r5.getX()
            float r0 = r5.getY()
            boolean r0 = X.GL7.A00(r4, r3, r1, r0, r2)
            if (r0 == 0) goto L_0x0376
            android.view.View$OnTouchListener r1 = r7.A00
            goto L_0x03a8
        L_0x0376:
            r3 = 1
            goto L_0x03b7
        L_0x0378:
            X.2Uy r6 = (X.C70762Uy) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            android.view.MotionEvent r5 = r6.A00
            X.0qQ.A0A(r5)
            X.0qQ.A0B(r5, r0)
            int r0 = r5.getAction()
            if (r0 != 0) goto L_0x03af
            java.lang.Object r4 = r1.A01
            X.GHR r4 = (X.GHR) r4
            com.instagram.clips.intf.ClipsViewerConfig r0 = r4.A01
            X.4bN r3 = r4.A02
            boolean r0 = X.AnonymousClass3ZC.A07(r0, r3)
            if (r0 == 0) goto L_0x03af
            X.JTB r2 = r4.A08
            com.instagram.user.model.User r1 = r4.A07
            X.4DU r0 = r4.A05
            java.lang.String r0 = r0.getModuleName()
            android.view.View$OnTouchListener r1 = r2.Da7(r3, r1, r0)
        L_0x03a8:
            android.view.View r0 = r6.A01
            boolean r3 = r1.onTouch(r0, r5)
            goto L_0x03b7
        L_0x03af:
            r3 = 0
            goto L_0x03b7
        L_0x03b1:
            java.lang.Object r0 = r1.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            boolean r3 = r0.A21
        L_0x03b7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J6F.invoke(java.lang.Object):java.lang.Object");
    }
}
