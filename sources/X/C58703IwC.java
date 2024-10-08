package X;

/* renamed from: X.IwC  reason: case insensitive filesystem */
public final class C58703IwC extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58703IwC(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 2Wa A00(AnonymousClass3Y5 r1, Object obj, int i) {
        return C243643Zq.A00(r1, new C58703IwC(obj, i));
    }

    public static Object A01(AnonymousClass3Y5 r1, Object obj, Object[] objArr, int i) {
        return AnonymousClass3Zw.A00(r1, new C58703IwC(obj, i), objArr);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02be, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a2, code lost:
        r3.AGC(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01fa, code lost:
        if (((X.AnonymousClass3W1) r5.A01).A10 != X.AnonymousClass05K.A00) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0222, code lost:
        if (X.AnonymousClass71K.A08(r1, r2) != false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0224, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0227, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0278, code lost:
        if (r0 == null) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x027a, code lost:
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x027f, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x02ab;
                case 1: goto L_0x029b;
                case 2: goto L_0x0289;
                case 3: goto L_0x0280;
                case 4: goto L_0x0270;
                case 5: goto L_0x0267;
                case 6: goto L_0x0255;
                case 7: goto L_0x0246;
                case 8: goto L_0x000f;
                case 9: goto L_0x023a;
                case 10: goto L_0x022a;
                case 11: goto L_0x020e;
                case 12: goto L_0x0206;
                case 13: goto L_0x01fd;
                case 14: goto L_0x01f2;
                case 15: goto L_0x01ea;
                case 16: goto L_0x01e3;
                case 17: goto L_0x01d9;
                case 18: goto L_0x01cf;
                case 19: goto L_0x01c5;
                case 20: goto L_0x01bb;
                case 21: goto L_0x01b1;
                case 22: goto L_0x01a7;
                case 23: goto L_0x0196;
                case 24: goto L_0x018e;
                case 25: goto L_0x02c6;
                case 26: goto L_0x02bf;
                case 27: goto L_0x0179;
                case 28: goto L_0x0163;
                case 29: goto L_0x0154;
                case 30: goto L_0x0144;
                case 31: goto L_0x0138;
                case 32: goto L_0x0117;
                case 33: goto L_0x00e0;
                case 34: goto L_0x00d5;
                case 35: goto L_0x00ca;
                case 36: goto L_0x00bf;
                case 37: goto L_0x00b4;
                case 38: goto L_0x00ad;
                case 39: goto L_0x00a6;
                case 40: goto L_0x009c;
                case 41: goto L_0x008e;
                case 42: goto L_0x0084;
                case 43: goto L_0x0079;
                case 44: goto L_0x0066;
                case 45: goto L_0x005d;
                case 46: goto L_0x0056;
                case 47: goto L_0x0041;
                case 48: goto L_0x0039;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.2Wa r0 = (X.2Wa) r0
            X.Hjp r4 = new X.Hjp
            r4.<init>(r0)
        L_0x000e:
            return r4
        L_0x000f:
            java.lang.Object r2 = r5.A01
            X.GFO r2 = (X.GFO) r2
            java.lang.String r1 = r2.A07()
            java.lang.String r0 = "under_hero"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r4 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r1 = r2.A06()
            java.lang.String r0 = "dots"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "progress_dots"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x000e
        L_0x0034:
            java.lang.Float r4 = X.C51967G9n.A0h()
            return r4
        L_0x0039:
            java.lang.Object r0 = r5.A01
            X.Gvd r0 = (X.C53872Gvd) r0
            boolean r0 = r0.A02
            goto L_0x02ba
        L_0x0041:
            java.lang.Object r0 = r5.A01
            X.Gvd r0 = (X.C53872Gvd) r0
            X.Hla r1 = r0.A01
            X.GrI r0 = r0.A00
            int r0 = r0.A00
            java.util.Map r1 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
            goto L_0x027d
        L_0x0056:
            java.lang.Object r0 = r5.A01
            X.4sL r0 = (X.C276014sL) r0
            X.1Xj r4 = r0.A00
            return r4
        L_0x005d:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.KWw r4 = X.C55122HcV.A00(r0)
            return r4
        L_0x0066:
            java.lang.Object r2 = r5.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            r0 = 0
            X.0qQ.A0B(r2, r0)
            android.content.Context r0 = X.C51966G9m.A0P(r2)
            com.instagram.clips.drafts.model.validation.ClipsDraftValidator r4 = X.HWL.A00(r0, r2, r1)
            return r4
        L_0x0079:
            X.2MU r1 = com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository.A09
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r4 = r1.A01(r0)
            return r4
        L_0x0084:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.H2J r4 = new X.H2J
            r4.<init>(r0)
            return r4
        L_0x008e:
            java.lang.Object r1 = r5.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.KWw r0 = X.C55122HcV.A00(r1)
            X.H2I r4 = new X.H2I
            r4.<init>(r1, r0)
            return r4
        L_0x009c:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Hmv r4 = new X.Hmv
            r4.<init>(r0)
            return r4
        L_0x00a6:
            java.lang.Object r0 = r5.A01
            X.DbS.A1U(r0)
            goto L_0x027d
        L_0x00ad:
            java.lang.Object r0 = r5.A01
            X.GaI r0 = (X.C52644GaI) r0
            java.util.List r4 = r0.A0A
            return r4
        L_0x00b4:
            java.lang.Object r0 = r5.A01
            X.I4A r0 = (X.I4A) r0
            com.instagram.common.session.UserSession r0 = r0.A04
            X.AYm r4 = X.C394779yg.A00(r0)
            return r4
        L_0x00bf:
            java.lang.Object r0 = r5.A01
            X.I4A r0 = (X.I4A) r0
            com.instagram.common.session.UserSession r0 = r0.A04
            X.8A2 r4 = X.AnonymousClass8A1.A01(r0)
            return r4
        L_0x00ca:
            java.lang.Object r0 = r5.A01
            X.I4A r0 = (X.I4A) r0
            com.instagram.common.session.UserSession r0 = r0.A04
            X.27r r4 = X.27p.A01(r0)
            return r4
        L_0x00d5:
            java.lang.Object r0 = r5.A01
            X.GZ8 r0 = (X.GZ8) r0
            X.0Ud r0 = r0.A06
            java.lang.Object r4 = r0.getValue()
            return r4
        L_0x00e0:
            java.lang.Object r2 = r5.A01
            X.Ieb r2 = (X.C57672Ieb) r2
            X.Gam r1 = r2.A03
            X.Jw7 r0 = r1.A00
            java.lang.Object r4 = r0.A02
            com.instagram.api.schemas.InstagramMidcardType r4 = (com.instagram.api.schemas.InstagramMidcardType) r4
            java.lang.Object r3 = r0.A01
            com.instagram.api.schemas.ClipsMidCardSubtype r3 = (com.instagram.api.schemas.ClipsMidCardSubtype) r3
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0114
            X.0sa r0 = r2.A01
        L_0x00f6:
            if (r0 == 0) goto L_0x027d
            r0.invoke()
            com.instagram.common.session.UserSession r0 = r2.A02
            X.GAc r2 = r2.A04
            X.0Aj r1 = X.C51972G9s.A0M(r2, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x027d
            java.lang.String r0 = "midcard_primary_cta_tap"
            X.93T r0 = X.C51979GAc.A00(r1, r2, r0)
            X.I3w.A02(r1, r3, r4, r0)
            goto L_0x027d
        L_0x0114:
            X.0sa r0 = r2.A00
            goto L_0x00f6
        L_0x0117:
            X.0kg r3 = X.0kg.A06
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "simpleVideoViewHolders["
            r2.append(r0)
            java.lang.Object r1 = r5.A01
            X.GxT r1 = (X.C53985GxT) r1
            java.lang.String r0 = r1.A06
            r2.append(r0)
            java.lang.String r0 = "] is null, mediaId: "
            java.lang.String r1 = X.G9w.A0i(r1, r0, r2)
            java.lang.String r0 = "MidcardVideoLayoutClipsComponent"
            X.0wb.A01(r3, r0, r1)
            goto L_0x027d
        L_0x0138:
            java.lang.Object r0 = r5.A01
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r0.A0E()
            r0.A0F()
            goto L_0x027d
        L_0x0144:
            java.lang.Object r1 = r5.A01
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r1
            r0 = -1
            r1.A0C = r0
            X.3v0 r0 = new X.3v0
            r0.<init>()
            r1.A0J = r0
            goto L_0x027d
        L_0x0154:
            java.lang.Object r1 = r5.A01
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r1
            X.3TG r0 = X.AnonymousClass3TG.DISCRETE_PAGING
            r1.setScrollMode(r0)
            r0 = 0
            r1.A0M(r0, r0)
            goto L_0x027d
        L_0x0163:
            java.lang.Object r0 = r5.A01
            X.Gva r0 = (X.C53869Gva) r0
            X.JT5 r0 = r0.A01
            r1 = 0
            if (r0 == 0) goto L_0x0174
            java.lang.Integer r0 = r0.AYl(r1)
            int r1 = X.C51967G9n.A04(r0, r1)
        L_0x0174:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            return r4
        L_0x0179:
            java.lang.Object r1 = r5.A01
            X.GJk r1 = (X.C52219GJk) r1
            java.lang.ref.WeakReference r0 = r1.A05
            java.lang.Object r3 = r0.get()
            X.JR1 r3 = (X.JR1) r3
            if (r3 == 0) goto L_0x027d
            X.GNk r2 = X.C52318GNk.COUNTDOWN_CANCELLED
            X.4bN r1 = r1.A01
            X.GNj r0 = X.C52317GNj.A0f
            goto L_0x01a2
        L_0x018e:
            java.lang.Object r0 = r5.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            boolean r0 = r0.A25
            goto L_0x02ba
        L_0x0196:
            java.lang.Object r0 = r5.A01
            X.GFJ r0 = (X.GFJ) r0
            X.JTB r3 = r0.A0H
            X.GNk r2 = X.C52318GNk.ITEM_INTERACTION_WITH_NEW_SURFACE
            X.4bN r1 = r0.A06
            X.GNj r0 = X.C52317GNj.A0E
        L_0x01a2:
            r3.AGC(r1, r2, r0)
            goto L_0x027d
        L_0x01a7:
            java.lang.Object r1 = r5.A01
            r0 = 14
            X.IUb r4 = new X.IUb
            r4.<init>(r1, r0)
            return r4
        L_0x01b1:
            java.lang.Object r1 = r5.A01
            r0 = 13
            X.IUb r4 = new X.IUb
            r4.<init>(r1, r0)
            return r4
        L_0x01bb:
            java.lang.Object r1 = r5.A01
            r0 = 12
            X.IUb r4 = new X.IUb
            r4.<init>(r1, r0)
            return r4
        L_0x01c5:
            java.lang.Object r1 = r5.A01
            r0 = 11
            X.IUb r4 = new X.IUb
            r4.<init>(r1, r0)
            return r4
        L_0x01cf:
            java.lang.Object r1 = r5.A01
            r0 = 10
            X.IUb r4 = new X.IUb
            r4.<init>(r1, r0)
            return r4
        L_0x01d9:
            java.lang.Object r1 = r5.A01
            r0 = 9
            X.IUb r4 = new X.IUb
            r4.<init>(r1, r0)
            return r4
        L_0x01e3:
            java.lang.Object r0 = r5.A01
            X.2Wa r0 = (X.2Wa) r0
            java.lang.Object r4 = r0.A03
            return r4
        L_0x01ea:
            java.lang.Object r0 = r5.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            boolean r0 = r0.A1w
            goto L_0x02ba
        L_0x01f2:
            java.lang.Object r0 = r5.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            java.lang.Integer r1 = r0.A10
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0227
            goto L_0x0224
        L_0x01fd:
            java.lang.Object r0 = r5.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.3W8 r0 = r0.A3R
            java.lang.Object r4 = r0.A00
            return r4
        L_0x0206:
            java.lang.Object r0 = r5.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            boolean r0 = r0.A2A
            goto L_0x02ba
        L_0x020e:
            X.71K r3 = X.GJ7.A00
            java.lang.Object r0 = r5.A01
            X.GFJ r0 = (X.GFJ) r0
            com.instagram.common.session.UserSession r2 = r0.A0A
            X.4bN r1 = r0.A06
            boolean r0 = r3.A0H(r1, r2)
            if (r0 == 0) goto L_0x0227
            boolean r0 = X.AnonymousClass71K.A08(r1, r2)
            if (r0 == 0) goto L_0x0227
        L_0x0224:
            r0 = 1
            goto L_0x02ba
        L_0x0227:
            r0 = 0
            goto L_0x02ba
        L_0x022a:
            java.lang.Object r0 = r5.A01
            X.GFJ r0 = (X.GFJ) r0
            X.4bN r2 = r0.A06
            X.JRO r1 = r0.A09
            X.JTB r0 = r0.A0H
            X.GFT r4 = new X.GFT
            r4.<init>(r2, r1, r0)
            return r4
        L_0x023a:
            java.lang.Object r0 = r5.A01
            X.GFJ r0 = (X.GFJ) r0
            com.instagram.common.session.UserSession r0 = r0.A0A
            X.GFS r4 = new X.GFS
            r4.<init>(r0)
            return r4
        L_0x0246:
            java.lang.Object r0 = r5.A01
            java.lang.Object r0 = X.DbT.A0r(r0)
            X.2Wd r0 = (X.2Wd) r0
            long r0 = r0.A00
            X.2Wd r4 = X.C51965G9l.A0e(r0)
            return r4
        L_0x0255:
            java.lang.Object r0 = r5.A01
            X.GFJ r0 = (X.GFJ) r0
            com.instagram.common.session.UserSession r3 = r0.A0A
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321301472027890(0x810a08000524f2, double:3.033075532827736E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x02ba
        L_0x0267:
            java.lang.Object r0 = r5.A01
            java.lang.Object r0 = X.C51968G9o.A0y(r0)
            android.animation.Animator r0 = (android.animation.Animator) r0
            goto L_0x0278
        L_0x0270:
            java.lang.Object r0 = r5.A01
            java.lang.Object r0 = X.C51968G9o.A0y(r0)
            android.animation.Animator r0 = (android.animation.Animator) r0
        L_0x0278:
            if (r0 == 0) goto L_0x027d
            r0.cancel()
        L_0x027d:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0280:
            java.lang.Object r0 = r5.A01
            X.GsX r0 = (X.C53680GsX) r0
            X.Gqw r0 = r0.A01
            boolean r0 = r0.A03
            goto L_0x02ba
        L_0x0289:
            java.lang.Object r0 = r5.A01
            X.GH3 r0 = (X.GH3) r0
            com.instagram.common.session.UserSession r3 = r0.A03
            X.4bN r2 = r0.A00
            X.0iw r1 = r0.A02
            boolean r0 = r0.A07
            X.Gtj r4 = new X.Gtj
            r4.<init>(r2, r1, r3, r0)
            return r4
        L_0x029b:
            java.lang.Object r3 = r5.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325416050373574(0x810dc6000033c6, double:3.0356776087416235E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x02ba
        L_0x02ab:
            java.lang.Object r3 = r5.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325416050439111(0x810dc6000133c7, double:3.0356776087830694E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
        L_0x02ba:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x02bf:
            java.lang.Object r0 = r5.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x02c6:
            java.lang.Object r0 = r5.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.GJF r4 = r0.A0n
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58703IwC.invoke():java.lang.Object");
    }
}
