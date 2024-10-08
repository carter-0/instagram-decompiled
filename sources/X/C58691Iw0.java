package X;

/* renamed from: X.Iw0  reason: case insensitive filesystem */
public final class C58691Iw0 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58691Iw0(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C58691Iw0 A00(C286575Wy r1, Object obj, Object obj2, int i) {
        C58691Iw0 iw0 = new C58691Iw0(i, obj, obj2);
        r1.FLL(iw0);
        return iw0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x044b, code lost:
        r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x04c3, code lost:
        X.DbS.A1U(r0.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x04db, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x05eb, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ad, code lost:
        r5.A0C.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0223, code lost:
        r1 = X.AnonymousClass7TE.A0e(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x022b, code lost:
        if (r1.isSampled() == false) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x022d, code lost:
        X.C51965G9l.A1B(r2, r1);
        r3 = X.C54684HOp.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02be, code lost:
        X.C51967G9n.A16(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02e6, code lost:
        r1 = X.AnonymousClass7TE.A0e(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02ee, code lost:
        if (r1.isSampled() == false) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02f0, code lost:
        X.C51965G9l.A1B(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02f3, code lost:
        X.C51965G9l.A1A(r3, r1);
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02f8, code lost:
        r1.AAJ("waterfall_id", r2);
        X.DbX.A1L(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r24 = this;
            r0 = r24
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0029;
                case 1: goto L_0x0039;
                case 2: goto L_0x004b;
                case 3: goto L_0x0066;
                case 4: goto L_0x00c4;
                case 5: goto L_0x00d1;
                case 6: goto L_0x00df;
                case 7: goto L_0x00ef;
                case 8: goto L_0x0106;
                case 9: goto L_0x011e;
                case 10: goto L_0x0169;
                case 11: goto L_0x0196;
                case 12: goto L_0x01bf;
                case 13: goto L_0x0007;
                case 14: goto L_0x01f0;
                case 15: goto L_0x0007;
                case 16: goto L_0x01fd;
                case 17: goto L_0x0206;
                case 18: goto L_0x0215;
                case 19: goto L_0x0007;
                case 20: goto L_0x0007;
                case 21: goto L_0x0234;
                case 22: goto L_0x028a;
                case 23: goto L_0x02b7;
                case 24: goto L_0x02c3;
                case 25: goto L_0x02d5;
                case 26: goto L_0x0302;
                case 27: goto L_0x03a8;
                case 28: goto L_0x0410;
                case 29: goto L_0x0007;
                case 30: goto L_0x0450;
                case 31: goto L_0x0007;
                case 32: goto L_0x04ca;
                case 33: goto L_0x04d5;
                case 34: goto L_0x04ca;
                case 35: goto L_0x04ca;
                case 36: goto L_0x04e0;
                case 37: goto L_0x056f;
                case 38: goto L_0x05ad;
                case 39: goto L_0x0007;
                case 40: goto L_0x05c8;
                case 41: goto L_0x0007;
                case 42: goto L_0x05d6;
                case 43: goto L_0x0007;
                case 44: goto L_0x0007;
                case 45: goto L_0x0007;
                case 46: goto L_0x05ec;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.A01
            X.0sa r1 = (X.C62320sa) r1
            if (r1 == 0) goto L_0x0013
            java.lang.Object r5 = r1.invoke()
            if (r5 != 0) goto L_0x0025
        L_0x0013:
            java.lang.Object r0 = r0.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0026
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0026
            X.2YQ r5 = r1.getDefaultViewModelCreationExtras()
        L_0x0025:
            return r5
        L_0x0026:
            X.2YP r5 = X.AnonymousClass2YP.A00
            return r5
        L_0x0029:
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A02
            X.OTz r0 = (X.C70978OTz) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.OEU r5 = new X.OEU
            r5.<init>(r1, r0)
            return r5
        L_0x0039:
            java.lang.Object r3 = r0.A02
            X.OTz r3 = (X.C70978OTz) r3
            com.instagram.common.session.UserSession r2 = r3.A00
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            X.O9L r0 = r3.A01
            X.OEV r5 = new X.OEV
            r5.<init>(r1, r2, r0)
            return r5
        L_0x004b:
            java.lang.Object r4 = r0.A02
            X.OTz r4 = (X.C70978OTz) r4
            com.instagram.common.session.UserSession r3 = r4.A00
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            r0 = 3
            X.PlW r1 = new X.PlW
            r1.<init>(r4, r0)
            X.OJz r0 = new X.OJz
            r0.<init>(r3)
            X.OFc r5 = new X.OFc
            r5.<init>(r2, r3, r0, r1)
            return r5
        L_0x0066:
            java.lang.Object r4 = r0.A02
            X.POV r4 = (X.POV) r4
            java.lang.Object r1 = r0.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131429359(0x7f0b07ef, float:1.8480388E38)
            android.view.ViewStub r1 = X.DbS.A0F(r1, r0)
            r0 = 2131626599(0x7f0e0a67, float:1.8880439E38)
            r1.setLayoutResource(r0)
            android.view.View r1 = r1.inflate()
            r0 = 2131430916(0x7f0b0e04, float:1.8483546E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r1, r0)
            androidx.viewpager2.widget.ViewPager2 r5 = (androidx.viewpager2.widget.ViewPager2) r5
            r3 = 1
            r5.setFitsSystemWindows(r3)
            r5.requestApplyInsets()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            boolean r0 = r2 instanceof X.2dP
            if (r0 == 0) goto L_0x00ae
            android.content.res.Resources r1 = X.DbU.A05(r5)
            r0 = 2131165208(0x7f070018, float:1.7944627E38)
            int r1 = r1.getDimensionPixelSize(r0)
            com.instagram.ui.widget.coordinatorlayoutbehavior.BottomSheetScaleBehavior r0 = new com.instagram.ui.widget.coordinatorlayoutbehavior.BottomSheetScaleBehavior
            r0.<init>()
            r0.A00 = r1
            X.2dP r2 = (X.2dP) r2
            r2.A00(r0)
        L_0x00ae:
            r0 = 0
            r5.setUserInputEnabled(r0)
            X.Muu r0 = r4.A03
            r5.setAdapter(r0)
            r5.setOffscreenPageLimit(r3)
            r1 = 3
            X.N02 r0 = new X.N02
            r0.<init>(r4, r1)
            r5.A05(r0)
            return r5
        L_0x00c4:
            java.lang.Object r1 = r0.A02
            X.Neg r1 = (X.C69101Neg) r1
            java.lang.Object r0 = r0.A01
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            X.C69101Neg.A00(r0, r1)
            goto L_0x05e9
        L_0x00d1:
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A02
            X.5Gy r0 = (X.C283285Gy) r0
            android.view.GestureDetector r5 = new android.view.GestureDetector
            r5.<init>(r1, r0)
            return r5
        L_0x00df:
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A02
            X.N1V r0 = (X.N1V) r0
            X.MsC r0 = r0.A03
            android.view.ScaleGestureDetector r5 = new android.view.ScaleGestureDetector
            r5.<init>(r1, r0)
            return r5
        L_0x00ef:
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r1)
            r2 = 2131626956(0x7f0e0bcc, float:1.8881163E38)
            java.lang.Object r0 = r0.A02
            X.OFa r0 = (X.C70653OFa) r0
            android.view.ViewGroup r1 = r0.A00
            r0 = 0
            android.view.View r5 = X.DbW.A09(r3, r1, r2, r0)
            return r5
        L_0x0106:
            java.lang.Object r1 = r0.A02
            X.OTy r1 = (X.C70977OTy) r1
            android.content.Context r1 = r1.A02
            X.2tC r2 = X.AnonymousClass2t9.A00(r1)
            java.lang.Object r1 = r0.A01
            X.0iw r1 = (X.AnonymousClass0iw) r1
            X.H79 r0 = new X.H79
            r0.<init>(r1)
            X.2t9 r5 = X.DbU.A0U(r2, r0)
            return r5
        L_0x011e:
            java.lang.Object r4 = r0.A01
            X.0lg r4 = (X.0lg) r4
            X.0Tu r3 = X.0Tu.A06
            r1 = 36323324401560660(0x810bdf00042c54, double:3.034354841609943E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0166
            com.facebook.rtc.views.omnigrid.GridSelfViewLocation r6 = com.facebook.rtc.views.omnigrid.GridSelfViewLocation.TOP_RIGHT
        L_0x0131:
            java.lang.Object r0 = r0.A02
            X.OWU r0 = (X.OWU) r0
            X.OIG r1 = r0.A07
            int r0 = r1.A00
            X.NE8 r13 = new X.NE8
            r13.<init>(r0)
            int r0 = r1.A0C
            X.NE8 r11 = new X.NE8
            r11.<init>(r0)
            X.NE8 r12 = new X.NE8
            r12.<init>(r0)
            int r0 = r1.A09
            X.NE8 r14 = new X.NE8
            r14.<init>(r0)
            r7 = 0
            r17 = 0
            r16 = 22287(0x570f, float:3.1231E-41)
            X.N4M r5 = new X.N4M
            r8 = r7
            r9 = r7
            r10 = r7
            r15 = r7
            r18 = r17
            r19 = r17
            r20 = r17
            r5.<init>((com.facebook.rtc.views.omnigrid.GridSelfViewLocation) r6, (X.C69671Npt) r7, (X.C69671Npt) r8, (X.C69671Npt) r9, (X.C69671Npt) r10, (X.C69671Npt) r11, (X.C69671Npt) r12, (X.C69671Npt) r13, (X.C69671Npt) r14, (java.lang.Object) r15, (int) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20)
            return r5
        L_0x0166:
            com.facebook.rtc.views.omnigrid.GridSelfViewLocation r6 = com.facebook.rtc.views.omnigrid.GridSelfViewLocation.BOTTOM_RIGHT
            goto L_0x0131
        L_0x0169:
            java.lang.Object r5 = r0.A02
            X.Neq r5 = (X.C69111Neq) r5
            X.Ocu r4 = r5.A0E
            r3 = 1
            r2 = 0
            X.POs r1 = new X.POs
            r1.<init>(r3)
            r4.A03(r1)
            java.lang.Object r0 = r0.A01
            int r1 = X.AnonymousClass7TE.A0M(r0)
            if (r1 == r2) goto L_0x018e
            if (r1 == r3) goto L_0x018b
            r0 = 2
            if (r1 != r0) goto L_0x0191
            X.IX3 r1 = X.IX3.A00
        L_0x0188:
            X.Prv r1 = (X.C74267Prv) r1
            goto L_0x01ad
        L_0x018b:
            X.IX7 r1 = X.IX7.A00
            goto L_0x0188
        L_0x018e:
            X.IX5 r1 = X.IX5.A00
            goto L_0x0188
        L_0x0191:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0196:
            java.lang.Object r1 = r0.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r1 = 0
            if (r2 == r1) goto L_0x01b7
            r1 = 1
            if (r2 == r1) goto L_0x01b4
            r1 = 2
            if (r2 != r1) goto L_0x01ba
            X.IX2 r1 = X.IX2.A00
        L_0x01a7:
            X.Prv r1 = (X.C74267Prv) r1
            java.lang.Object r5 = r0.A02
            X.Neq r5 = (X.C69111Neq) r5
        L_0x01ad:
            X.OKY r0 = r5.A0C
            r0.A00(r1)
            goto L_0x05e9
        L_0x01b4:
            X.IX6 r1 = X.IX6.A00
            goto L_0x01a7
        L_0x01b7:
            X.IX4 r1 = X.IX4.A00
            goto L_0x01a7
        L_0x01ba:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01bf:
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            r1 = 2131231393(0x7f0802a1, float:1.8078866E38)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r3 = r2.getContext()
            android.graphics.drawable.Drawable r5 = r3.getDrawable(r1)
            if (r5 == 0) goto L_0x01ee
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165308(0x7f07007c, float:1.794483E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r0 = 2130970306(0x7f0406c2, float:1.7549318E38)
            int r1 = X.AnonymousClass7TF.A03(r3, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r5.setColorFilter(r1, r0)
            r0 = 0
            r5.setBounds(r0, r0, r2, r2)
            return r5
        L_0x01ee:
            r5 = 0
            return r5
        L_0x01f0:
            java.lang.Object r2 = r0.A02
            X.4Cq r2 = (X.C262224Cq) r2
            java.lang.Object r1 = r0.A01
            r0 = 43
            X.DbX.A1X(r1, r2, r0)
            goto L_0x05e9
        L_0x01fd:
            java.lang.Object r1 = r0.A02
            X.Hj9 r1 = (X.C55527Hj9) r1
            r2 = 0
            X.5Oz r1 = r1.A00
            goto L_0x02be
        L_0x0206:
            java.lang.Object r1 = r0.A01
            X.INA r1 = (X.INA) r1
            java.lang.Object r2 = r0.A02
            X.HOd r2 = (X.C54672HOd) r2
            X.0wc r1 = X.INA.A01(r1, r2)
            java.lang.String r0 = "ig_school_reliability_graduation_date_error_dialog_impression"
            goto L_0x0223
        L_0x0215:
            java.lang.Object r1 = r0.A01
            X.INA r1 = (X.INA) r1
            java.lang.Object r2 = r0.A02
            X.HOd r2 = (X.C54672HOd) r2
            X.0wc r1 = X.INA.A01(r1, r2)
            java.lang.String r0 = "ig_school_reliability_graduation_date_dismiss_button_tap"
        L_0x0223:
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x05e9
            X.C51965G9l.A1B(r2, r1)
            X.HOp r3 = X.C54684HOp.UPDATE_GRADUATION
            goto L_0x02f3
        L_0x0234:
            java.lang.Object r2 = r0.A02
            X.H0x r2 = (X.C54153H0x) r2
            java.lang.Object r1 = r0.A01
            X.4gU r1 = (X.C270284gU) r1
            X.GnQ r0 = X.C51975G9x.A0b(r1)
            java.lang.Integer r5 = r0.A07
            X.GnQ r0 = X.C51975G9x.A0b(r1)
            java.lang.Integer r6 = r0.A08
            X.Vtr r3 = X.C18539Vtr.A01
            android.content.Context r4 = r2.requireContext()
            r0 = 41
            X.JFv r8 = new X.JFv
            r8.<init>(r2, r0)
            r0 = 20
            X.Ivq r7 = new X.Ivq
            r7.<init>(r2, r0)
            r3.A00(r4, r5, r6, r7, r8)
            X.INA r1 = X.G9w.A0a(r2)
            X.GnQ r0 = X.C53035GhR.A00(r2)
            X.HOd r4 = r0.A00
            X.HOp r3 = X.C54153H0x.A00(r2)
            X.GnQ r0 = X.C53035GhR.A00(r2)
            java.lang.String r2 = r0.A0E
            X.AnonymousClass7TG.A1T(r4, r3, r2)
            X.0wc r1 = X.INA.A00(r1)
            java.lang.String r0 = "ig_school_registration_grad_date_picker_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x05e9
            X.C51971G9r.A15(r4, r3, r1)
            goto L_0x02f8
        L_0x028a:
            java.lang.Object r2 = r0.A02
            X.H0x r2 = (X.C54153H0x) r2
            r2.A07()
            java.lang.Object r0 = r0.A01
            X.4gU r0 = (X.C270284gU) r0
            X.GnQ r0 = X.C51975G9x.A0b(r0)
            java.lang.String r0 = r0.A0C
            if (r0 != 0) goto L_0x02b2
            X.HOm r1 = X.C54681HOm.UNKNOWN
            java.lang.String r0 = "user tried to continue without selecting a school"
            r2.A0A(r1, r0)
            android.content.Context r2 = r2.getContext()
            r1 = 2131972722(0x7f135272, float:1.958246E38)
            java.lang.String r0 = "input error"
            X.C59689JTv.A0F(r2, r0, r1)
            goto L_0x05e9
        L_0x02b2:
            r2.A09()
            goto L_0x05e9
        L_0x02b7:
            java.lang.Object r1 = r0.A02
            X.HjA r1 = (X.C55528HjA) r1
            r2 = 0
            X.5Oz r1 = r1.A00
        L_0x02be:
            X.C51967G9n.A16(r1, r2)
            goto L_0x04c3
        L_0x02c3:
            java.lang.Object r1 = r0.A01
            X.INA r1 = (X.INA) r1
            X.HOp r3 = X.C54684HOp.SCHOOL_SETTINGS
            java.lang.Object r2 = r0.A02
            X.HOd r2 = (X.C54672HOd) r2
            r0 = 1
            X.0wc r1 = X.INA.A02(r1, r2, r0)
            java.lang.String r0 = "ig_school_reliability_switch_schools_error_dialog_impression"
            goto L_0x02e6
        L_0x02d5:
            java.lang.Object r1 = r0.A01
            X.INA r1 = (X.INA) r1
            X.HOp r3 = X.C54684HOp.SCHOOL_SETTINGS
            java.lang.Object r2 = r0.A02
            X.HOd r2 = (X.C54672HOd) r2
            r0 = 1
            X.0wc r1 = X.INA.A02(r1, r2, r0)
            java.lang.String r0 = "ig_school_reliability_switch_schools_dismiss_button_tap"
        L_0x02e6:
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x05e9
            X.C51965G9l.A1B(r2, r1)
        L_0x02f3:
            X.C51965G9l.A1A(r3, r1)
            java.lang.String r2 = ""
        L_0x02f8:
            java.lang.String r0 = "waterfall_id"
            r1.AAJ(r0, r2)
            X.DbX.A1L(r1)
            goto L_0x05e9
        L_0x0302:
            java.lang.Object r3 = r0.A02
            X.H0r r3 = (X.C54147H0r) r3
            java.lang.Object r0 = r0.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.JwA r0 = (X.C61072JwA) r0
            java.lang.Object r0 = r0.A02
            X.JwL r0 = (X.C61083JwL) r0
            java.lang.Object r0 = r0.A01
            X.Gm0 r0 = (X.C53314Gm0) r0
            if (r0 == 0) goto L_0x05e9
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = r0.A04
            com.instagram.schools.management.data.SchoolAddress r0 = r0.A02
            java.lang.String r15 = ""
            com.instagram.schools.management.data.SchoolInfo r7 = new com.instagram.schools.management.data.SchoolInfo
            r7.<init>(r0, r2, r15)
            X.HEH r2 = new X.HEH
            r2.<init>()
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            X.HMD[] r0 = X.HMD.values()
            X.0sC r6 = X.0pe.A00(r0)
        L_0x0339:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x034f
            java.lang.Object r4 = r6.next()
            X.HMD r0 = X.HMD.SCHOOL_SELECTION
            if (r4 == r0) goto L_0x0339
            X.HMD r0 = X.HMD.ADD_SCHOOL
            if (r4 == r0) goto L_0x0339
            r5.add(r4)
            goto L_0x0339
        L_0x034f:
            r8 = 0
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            r0.<init>()
            r0.add(r7)
            com.google.common.collect.ImmutableList r19 = r0.build()
            X.0qQ.A07(r19)
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            r0.<init>()
            com.google.common.collect.ImmutableList r20 = r0.build()
            X.0qQ.A07(r20)
            java.lang.String r18 = X.AnonymousClass7TG.A0j()
            X.HOd r7 = X.C54672HOd.QP
            com.google.common.collect.ImmutableList r21 = r5.build()
            X.0qQ.A07(r21)
            r22 = 0
            X.HLs r10 = X.C54635HLs.INITIAL
            com.instagram.schools.management.data.SchoolOnboardingParcelData r6 = new com.instagram.schools.management.data.SchoolOnboardingParcelData
            r9 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r16 = r15
            r17 = r8
            r23 = r22
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r0 = "EXTRA_SCHOOL_ONBOARDING_DATA"
            r1.putParcelable(r0, r6)
            r2.setArguments(r1)
            java.util.List r0 = X.C55352HgK.A00
            r0.clear()
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0eM r0 = r3.A03
            X.6Yo r1 = X.DbX.A0N(r1, r0)
            r1.A0B(r8, r2)
            goto L_0x044b
        L_0x03a8:
            java.lang.Object r5 = r0.A02
            X.H0r r5 = (X.C54147H0r) r5
            java.lang.Object r0 = r0.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.JwA r0 = (X.C61072JwA) r0
            java.lang.Object r0 = r0.A02
            X.JwL r0 = (X.C61083JwL) r0
            java.lang.Object r6 = r0.A01
            X.Gm0 r6 = (X.C53314Gm0) r6
            X.0eM r0 = r5.A02
            X.INA r0 = X.C51966G9m.A0z(r0)
            X.HOp r3 = X.C54684HOp.SCHOOL_SETTINGS
            X.HOd r2 = r5.A00
            X.0wc r1 = X.INA.A01(r0, r2)
            java.lang.String r0 = "ig_school_reliability_remove_school_button_tap"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x03dc
            X.C51965G9l.A1B(r2, r1)
            X.C51974G9v.A0j(r3, r1)
        L_0x03dc:
            if (r6 == 0) goto L_0x05e9
            r0 = 7
            X.IZq r1 = new X.IZq
            r1.<init>(r5, r0)
            X.0eM r0 = r5.A03
            X.7Pr r0 = X.DbX.A0f(r0)
            r0.A0U = r1
            X.7Pu r4 = r0.A00()
            java.lang.String r3 = r6.A04
            X.IXa r2 = new X.IXa
            r2.<init>(r4, r5)
            X.HOd r0 = X.C54672HOd.PROFILE_BIO
            X.DbY.A1S(r3, r0)
            X.H0D r1 = new X.H0D
            r1.<init>()
            r1.A02 = r3
            r1.A01 = r2
            r1.A00 = r0
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            r4.A02(r0, r1)
            goto L_0x05e9
        L_0x0410:
            java.lang.Object r5 = r0.A02
            X.H0r r5 = (X.C54147H0r) r5
            java.lang.Object r0 = r0.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.JwA r0 = (X.C61072JwA) r0
            java.lang.Object r0 = r0.A02
            X.JwL r0 = (X.C61083JwL) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x05e9
            X.0eM r0 = r5.A02
            X.INA r0 = X.C51966G9m.A0z(r0)
            X.HOd r4 = X.C54672HOd.PROFILE_BIO
            X.HOp r3 = X.C54684HOp.SCHOOL_SETTINGS
            java.lang.String r2 = ""
            X.0wc r1 = X.INA.A00(r0)
            java.lang.String r0 = "ig_school_reliability_edit_banner_tap"
            X.C51976G9y.A0U(r4, r3, r1, r0, r2)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0eM r0 = r5.A03
            X.6Yo r1 = X.DbX.A0N(r1, r0)
            X.H0q r0 = new X.H0q
            r0.<init>()
            r1.A0D(r0)
        L_0x044b:
            r1.A04()
            goto L_0x05e9
        L_0x0450:
            java.lang.Object r4 = r0.A02
            X.GhR r4 = (X.C53035GhR) r4
            X.0Ud r3 = r4.A02
            java.lang.Object r1 = r3.getValue()
            X.JwL r1 = (X.C61083JwL) r1
            java.lang.Object r1 = r1.A00
            X.GnQ r1 = (X.C53393GnQ) r1
            com.google.common.collect.ImmutableList r1 = r1.A02
            int r2 = r1.size()
            r1 = 1
            if (r2 <= r1) goto L_0x04c3
            java.lang.Object r1 = r3.getValue()
            X.JwL r1 = (X.C61083JwL) r1
            java.lang.Object r1 = r1.A00
            X.GnQ r1 = (X.C53393GnQ) r1
            com.google.common.collect.ImmutableList r1 = r1.A01
            java.util.ArrayList r6 = X.00k.A0U(r1)
            X.HMD r2 = X.HMD.SCHOOL_SELECTION
            r1 = 2
            r6.add(r1, r2)
            X.05G r5 = r4.A01
        L_0x0481:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.JwL r3 = (X.C61083JwL) r3
            java.lang.Object r13 = r3.A00
            X.GnQ r13 = (X.C53393GnQ) r13
            r7 = 0
            r22 = 0
            com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
            r1.<init>()
            r1.addAll(r6)
            com.google.common.collect.ImmutableList r9 = r1.build()
            X.0qQ.A07(r9)
            r21 = 65535(0xffff, float:9.1834E-41)
            r8 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            r19 = r7
            r20 = r7
            X.GnQ r2 = X.C53393GnQ.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r1 = r3.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.JwL r1 = X.C61083JwL.A00(r2, r1)
            boolean r1 = r5.AIY(r4, r1)
            if (r1 == 0) goto L_0x0481
        L_0x04c3:
            java.lang.Object r0 = r0.A01
            X.DbS.A1U(r0)
            goto L_0x05e9
        L_0x04ca:
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A02
            X.Gly r0 = (X.C53312Gly) r0
            java.lang.String r0 = r0.A04
            goto L_0x04db
        L_0x04d5:
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A02
        L_0x04db:
            r1.invoke(r0)
            goto L_0x05e9
        L_0x04e0:
            java.lang.Object r1 = r0.A02
            X.H0z r1 = (X.C54155H0z) r1
            X.0eM r1 = r1.A0F
            java.lang.Object r4 = r1.getValue()
            X.GhG r4 = (X.C53025GhG) r4
            java.lang.Object r0 = r0.A01
            X.Gly r0 = (X.C53312Gly) r0
            java.lang.String r6 = r0.A04
            r5 = 0
            X.0qQ.A0B(r6, r5)
            X.0Ud r0 = r4.A06
            java.lang.Object r0 = r0.getValue()
            X.GnT r0 = (X.C53396GnT) r0
            java.lang.Object r0 = r0.A05
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x050a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0552
            java.lang.Object r8 = r7.next()
            X.Gly r8 = (X.C53312Gly) r8
            java.lang.String r14 = r8.A04
            boolean r0 = X.0qQ.A0K(r14, r6)
            if (r0 == 0) goto L_0x054e
            java.util.Map r0 = r4.A04
            java.lang.Object r2 = r0.get(r6)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            if (r2 == 0) goto L_0x054e
            com.instagram.common.session.UserSession r1 = r4.A00
            X.1OP r0 = X.1OP.$redex_init_class
            com.instagram.model.reels.Reel r11 = X.AnonymousClass3PQ.A03(r1, r2)
            java.lang.String r12 = r8.A05
            com.instagram.common.typedurl.ImageUrl r9 = r8.A00
            java.lang.String r13 = r8.A03
            X.DgM r10 = r8.A01
            boolean r15 = r8.A08
            boolean r2 = r8.A07
            boolean r1 = r8.A06
            X.0qQ.A0B(r12, r5)
            r0 = 1
            X.AnonymousClass7TG.A0w(r0, r9, r14, r10)
            X.Gly r8 = new X.Gly
            r16 = r2
            r17 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x054e:
            r3.add(r8)
            goto L_0x050a
        L_0x0552:
            X.62P r7 = X.AnonymousClass62Q.A00(r3)
            X.05G r2 = r4.A05
        L_0x0558:
            java.lang.Object r1 = r2.getValue()
            r4 = r1
            X.GnT r4 = (X.C53396GnT) r4
            r3 = 0
            r8 = 123(0x7b, float:1.72E-43)
            r5 = r3
            r6 = r3
            X.GnT r0 = X.C53396GnT.A00(r3, r4, r5, r6, r7, r8)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0558
            goto L_0x05e9
        L_0x056f:
            java.lang.Object r4 = r0.A02
            X.H0z r4 = (X.C54155H0z) r4
            java.lang.Object r0 = r0.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.GnT r0 = (X.C53396GnT) r0
            java.lang.Object r2 = r0.A04
            X.3lr r2 = (X.C250663lr) r2
            if (r2 == 0) goto L_0x05ab
            r1 = 0
            java.lang.String r0 = "fbid"
            java.lang.String r3 = r2.getRequiredStringField(r1, r0)
            X.0qQ.A07(r3)
            java.lang.String r0 = "name"
            java.lang.String r1 = r2.A08(r0)
            if (r1 != 0) goto L_0x0595
            java.lang.String r1 = ""
        L_0x0595:
            r0 = 6
            X.ULg r2 = new X.ULg
            r2.<init>(r3, r1, r0)
        L_0x059b:
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L_0x05e9
            X.0eM r0 = r4.A0B
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.C49126Epp.A00(r1, r2, r0)
            goto L_0x05e9
        L_0x05ab:
            r2 = 0
            goto L_0x059b
        L_0x05ad:
            java.lang.Object r4 = r0.A02
            X.H0z r4 = (X.C54155H0z) r4
            androidx.fragment.app.FragmentActivity r3 = r4.getActivity()
            if (r3 == 0) goto L_0x05e9
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            java.lang.Object r1 = r0.A01
            X.4gU r1 = (X.C270284gU) r1
            X.Iia r0 = new X.Iia
            r0.<init>(r1, r3, r4)
            r2.post(r0)
            goto L_0x05e9
        L_0x05c8:
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A01
            com.instagram.screentime.IGScreenTimeApi r0 = (com.instagram.screentime.IGScreenTimeApi) r0
            X.HlD r5 = new X.HlD
            r5.<init>(r1, r0)
            return r5
        L_0x05d6:
            java.lang.Object r3 = r0.A02
            X.ESI r3 = (X.ESI) r3
            r2 = 0
            r3.A09 = r2
            X.ESI.A0A(r3, r2)
            java.lang.Object r1 = r0.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.ESI.A09(r3, r1, r0, r2)
        L_0x05e9:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x05ec:
            X.8Yd r2 = X.C357488Yc.A03
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A02
            X.K4f r0 = (X.C61363K4f) r0
            X.0eM r0 = r0.A0a
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.8Yc r0 = r2.A00(r1, r0)
            X.W0T r5 = r0.A00()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58691Iw0.invoke():java.lang.Object");
    }
}
