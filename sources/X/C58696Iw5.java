package X;

/* renamed from: X.Iw5  reason: case insensitive filesystem */
public final class C58696Iw5 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58696Iw5(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public static C58696Iw5 A00(C286575Wy r1, Object obj, Object obj2, Object obj3, int i) {
        C58696Iw5 iw5 = new C58696Iw5(i, obj, obj2, obj3);
        r1.FLL(iw5);
        return iw5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0521, code lost:
        r2.removeOnAttachStateChangeListener(r0);
        r1 = r4.A02;
        X.0qQ.A0B(r1, 1);
        X.C275604qc.A00(r2).A00.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011a, code lost:
        r2 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011e, code lost:
        r3.Epw(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01d7, code lost:
        r2.invoke(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0397, code lost:
        X.C51969G9p.A15(r2, r4, r1, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r20 = this;
            r4 = r20
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x06a5;
                case 1: goto L_0x07d1;
                case 2: goto L_0x07b1;
                case 3: goto L_0x066e;
                case 4: goto L_0x0599;
                case 5: goto L_0x0588;
                case 6: goto L_0x0535;
                case 7: goto L_0x0795;
                case 8: goto L_0x0519;
                case 9: goto L_0x0510;
                case 10: goto L_0x04b0;
                case 11: goto L_0x0775;
                case 12: goto L_0x0498;
                case 13: goto L_0x0768;
                case 14: goto L_0x0768;
                case 15: goto L_0x075a;
                case 16: goto L_0x0453;
                case 17: goto L_0x039e;
                case 18: goto L_0x0733;
                case 19: goto L_0x0007;
                case 20: goto L_0x0007;
                case 21: goto L_0x0007;
                case 22: goto L_0x0338;
                case 23: goto L_0x0327;
                case 24: goto L_0x02c5;
                case 25: goto L_0x02b4;
                case 26: goto L_0x02a3;
                case 27: goto L_0x026f;
                case 28: goto L_0x025e;
                case 29: goto L_0x0721;
                case 30: goto L_0x0246;
                case 31: goto L_0x022a;
                case 32: goto L_0x022a;
                case 33: goto L_0x021d;
                case 34: goto L_0x01df;
                case 35: goto L_0x01c3;
                case 36: goto L_0x01a7;
                case 37: goto L_0x017e;
                case 38: goto L_0x017e;
                case 39: goto L_0x016d;
                case 40: goto L_0x0123;
                case 41: goto L_0x0108;
                case 42: goto L_0x00f0;
                case 43: goto L_0x00d9;
                case 44: goto L_0x07f6;
                case 45: goto L_0x008b;
                case 46: goto L_0x0065;
                case 47: goto L_0x0710;
                case 48: goto L_0x002f;
                case 49: goto L_0x0019;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r4.A03
            X.PrE r2 = (X.C74225PrE) r2
            X.JSm r2 = (X.C59667JSm) r2
            java.lang.Object r1 = r4.A01
            X.N4A r1 = (X.N4A) r1
            java.lang.Object r0 = r4.A02
            r2.CNu(r1, r0)
        L_0x0016:
            X.0gF r7 = X.C60340gF.A00
        L_0x0018:
            return r7
        L_0x0019:
            java.lang.Object r3 = r4.A01
            X.Hrc r3 = (X.C56030Hrc) r3
            java.lang.Object r0 = r4.A03
            X.7dj r0 = (X.C335907dj) r0
            java.lang.String r2 = r0.A0K
            java.lang.String r1 = r0.A0N
            r0 = 1
            r3.A01(r2, r1, r0)
            java.lang.Object r3 = r4.A02
            X.5Oz r3 = (X.C284945Oz) r3
            goto L_0x011a
        L_0x002f:
            java.lang.Object r1 = r4.A03
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x003a
            java.lang.Object r0 = r4.A02
            r1.invoke(r0)
        L_0x003a:
            java.lang.Object r3 = r4.A01
            X.5Oz r3 = (X.C284945Oz) r3
            java.lang.Object r0 = r3.getValue()
            X.DgM r2 = X.C46519DgM.FOLLOW
            if (r0 != r2) goto L_0x0056
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
        L_0x0048:
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x0061
            r0 = 3
            if (r1 == r0) goto L_0x011e
            X.DgM r2 = X.C46519DgM.UNKNOWN
            goto L_0x011e
        L_0x0056:
            java.lang.Object r1 = r3.getValue()
            X.DgM r0 = X.C46519DgM.FOLLOWING
            if (r1 != r0) goto L_0x0016
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            goto L_0x0048
        L_0x0061:
            X.DgM r2 = X.C46519DgM.FOLLOWING
            goto L_0x011e
        L_0x0065:
            X.OWB r1 = new X.OWB
            r1.<init>()
            java.lang.Object r0 = r4.A01
            com.instagram.bugreporter.model.BugReport r0 = (com.instagram.bugreporter.model.BugReport) r0
            r1.A02(r0)
            com.instagram.bugreporter.model.BugReport r1 = r1.A01()
            java.lang.Object r0 = r4.A02
            java.io.File r0 = (java.io.File) r0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r0)
            java.io.File r1 = r1.A05
            if (r1 == 0) goto L_0x0016
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            X.C11108SAj.A00(r0, r2)
            goto L_0x0016
        L_0x008b:
            java.lang.Object r5 = r4.A03
            X.JjM r5 = (X.C60318JjM) r5
            com.instagram.common.session.UserSession r7 = r5.A04
            java.lang.Object r6 = r4.A02
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            java.lang.String r0 = r6.getId()
            X.0iw r3 = r5.A03
            r2 = 0
            X.C64186LSt.A04(r3, r7, r0)
            java.util.Map r1 = r5.A08
            java.lang.String r0 = r6.getId()
            r1.put(r0, r6)
            java.lang.String r0 = r6.getId()
            X.C64186LSt.A01(r3, r7, r0)
            X.LdS r0 = X.C64526LdS.A00
            X.MPw[] r0 = new X.C66390MPw[]{r0}
            X.C60318JjM.A04(r5, r0)
            java.lang.String r0 = "continue"
            X.C60318JjM.A03(r5, r0)
            X.0eM r0 = r5.A0A
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r4.A01
            X.Kzk r0 = (X.C63597Kzk) r0
            if (r0 == 0) goto L_0x00d4
            X.K88 r0 = r0.A00
            X.0hq r0 = r0.getParentFragmentManager()
            r0.A13()
        L_0x00d4:
            X.C60318JjM.A01(r2, r5)
            goto L_0x0016
        L_0x00d9:
            java.lang.Object r5 = r4.A03
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r3 = r4.A01
            r2 = 0
            r1 = 3
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r3, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r5)
            java.lang.Object r0 = r4.A02
            X.DbS.A1U(r0)
            goto L_0x0016
        L_0x00f0:
            java.lang.Object r2 = r4.A02
            X.5Oz r2 = (X.C284945Oz) r2
            java.lang.Object r0 = r4.A03
            X.GnJ r0 = (X.C53387GnJ) r0
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2.Epw(r1)
            java.lang.Object r0 = r4.A01
            X.C51965G9l.A1W(r0, r1)
            goto L_0x0016
        L_0x0108:
            java.lang.Object r0 = r4.A02
            X.DbS.A1U(r0)
            java.lang.Object r1 = r4.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 1
            X.C51967G9n.A16(r1, r0)
            java.lang.Object r3 = r4.A03
            X.5Oz r3 = (X.C284945Oz) r3
            r0 = 0
        L_0x011a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x011e:
            r3.Epw(r2)
            goto L_0x0016
        L_0x0123:
            java.lang.Object r2 = r4.A03
            X.0lg r2 = (X.0lg) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 13
            X.IwG r1 = new X.IwG
            r1.<init>((java.lang.Object) r2, (int) r0)
            java.lang.Class<com.instagram.barcelona.location.api.LocationRepository> r0 = com.instagram.barcelona.location.api.LocationRepository.class
            java.lang.Object r1 = r2.A01(r0, r1)
            com.instagram.barcelona.location.api.LocationRepository r1 = (com.instagram.barcelona.location.api.LocationRepository) r1
            java.lang.Object r3 = r4.A02
            X.5vQ r3 = (X.C299575vQ) r3
            r0 = r3
            X.9JB r0 = (X.AnonymousClass9JB) r0
            java.lang.String r2 = r0.A03
            long r18 = java.lang.Long.parseLong(r2)
            java.lang.String r8 = r0.A04
            r6 = 0
            com.instagram.barcelona.location.model.LocationModel r5 = new com.instagram.barcelona.location.model.LocationModel
            r7 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.A00(r5)
            java.lang.Object r1 = r4.A01
            X.5vd r1 = (X.C299665vd) r1
            X.5vJ r0 = r3.Be5()
            java.lang.String r0 = r0.A03
            r1.DOr(r0, r2, r8)
            goto L_0x0016
        L_0x016d:
            java.lang.Object r2 = r4.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r4.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r4.A02
            X.4bv r0 = (X.C267624bv) r0
            X.C52480GUi.A00(r1, r0, r2)
            goto L_0x0016
        L_0x017e:
            java.lang.Object r5 = r4.A03
            X.36O r5 = (X.AnonymousClass36O) r5
            java.lang.Object r4 = r4.A02
            com.instagram.creation.base.ui.mediatabbar.Tab r4 = (com.instagram.creation.base.ui.mediatabbar.Tab) r4
            boolean r0 = X.AnonymousClass36O.A0G
            com.instagram.common.session.UserSession r3 = r5.A04
            X.F3s r2 = X.C49061Eof.A00(r3)
            X.EWT r1 = X.EWT.EDIT_PROFILE_PIC_FLOW
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r2.A02(r1, r0)
            X.6ve r1 = X.C322316vd.A00(r3)
            r0 = 146(0x92, float:2.05E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A06(r0)
            r5.A09(r4)
            goto L_0x0016
        L_0x01a7:
            java.lang.Object r2 = r4.A03
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r4.A01
            java.lang.Object r0 = X.C51966G9m.A17(r0)
            X.4ch r0 = (X.C268064ch) r0
            if (r0 == 0) goto L_0x01c0
            X.5VN r1 = X.C289425dZ.A01(r0)
        L_0x01b9:
            java.lang.Object r0 = r4.A02
            X.Gm3 r0 = (X.C53317Gm3) r0
            java.lang.String r0 = r0.A05
            goto L_0x01d7
        L_0x01c0:
            X.5VN r1 = X.AnonymousClass5VN.A04
            goto L_0x01b9
        L_0x01c3:
            java.lang.Object r2 = r4.A03
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r4.A01
            java.lang.Object r0 = r4.A02
            java.lang.Object r0 = X.C51966G9m.A17(r0)
            X.4ch r0 = (X.C268064ch) r0
            if (r0 == 0) goto L_0x01dc
            X.5VN r0 = X.C289425dZ.A01(r0)
        L_0x01d7:
            r2.invoke(r1, r0)
            goto L_0x0016
        L_0x01dc:
            X.5VN r0 = X.AnonymousClass5VN.A04
            goto L_0x01d7
        L_0x01df:
            java.lang.Object r0 = r4.A01
            java.lang.Object r1 = X.C51966G9m.A18(r0)
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r4.A02
            X.MbG r0 = (X.C66709MbG) r0
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r4.A03
            X.8ab r3 = X.DbS.A0Y(r1)
            r0 = 2131963380(0x7f132df4, float:1.9563512E38)
            r3.A09(r0)
            r0 = 2131963379(0x7f132df3, float:1.956351E38)
            r3.A08(r0)
            X.Dba.A1M(r3)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131963365(0x7f132de5, float:1.9563481E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r1, r0)
            r1 = 0
            X.I8y r0 = new X.I8y
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r4)
            r3.A0d(r0, r2)
            X.I8V r0 = X.I8V.A00
            X.DbX.A16(r0, r3)
            goto L_0x0016
        L_0x021d:
            java.lang.Object r1 = r4.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r4.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.13w.A02(r1, r0)
            goto L_0x0016
        L_0x022a:
            java.lang.Object r2 = r4.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r4.A03
            X.JcX r0 = (X.C59964JcX) r0
            java.lang.Object r1 = r0.A02
            X.Gll r1 = (X.C53299Gll) r1
            java.lang.String r0 = r1.A02
            java.lang.String r1 = r1.A03
            r2.invoke(r0, r1)
            java.lang.Object r0 = r4.A01
            X.LRW r0 = (X.LRW) r0
            r0.A04(r1)
            goto L_0x0016
        L_0x0246:
            java.lang.Object r0 = r4.A02
            X.DbS.A1U(r0)
            java.lang.Object r1 = r4.A01
            X.LRW r1 = (X.LRW) r1
            java.lang.Object r0 = r4.A03
            X.JcX r0 = (X.C59964JcX) r0
            java.lang.Object r0 = r0.A02
            X.Gll r0 = (X.C53299Gll) r0
            java.lang.String r0 = r0.A03
            r1.A04(r0)
            goto L_0x0016
        L_0x025e:
            java.lang.Object r2 = r4.A03
            X.Qf0 r2 = (X.C8013Qf0) r2
            java.lang.Object r1 = r4.A02
            X.Qf5 r1 = (X.C8018Qf5) r1
            java.lang.Object r0 = r4.A01
            X.SUj r0 = (X.SUj) r0
            X.C8013Qf0.A08(r1, r2, r0)
            goto L_0x0016
        L_0x026f:
            java.lang.Object r5 = r4.A03
            X.QDN r5 = (X.QDN) r5
            java.lang.Object r3 = r4.A02
            com.facebookpay.shippingaddress.model.ShippingAddress r3 = (com.facebookpay.shippingaddress.model.ShippingAddress) r3
            java.lang.Object r2 = r4.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r2 = (com.facebookpay.paymentmethod.model.PaymentMethod) r2
            r0 = 922(0x39a, float:1.292E-42)
            java.lang.String r1 = X.Pxd.A00(r0)
            java.lang.String r0 = "use_shipping_address_from_alert_dialog"
            X.STa.A04(r5, r1, r0)
            if (r3 == 0) goto L_0x0291
            X.StS r1 = X.C11091S9q.A00(r3)
            X.QDT r0 = r5.A1R
            r0.A0L(r1, r2)
        L_0x0291:
            X.RH6 r1 = X.RH6.A0Y
            r0 = 0
            r5.A0q(r1, r0)
            X.QDN.A0D(r1, r5)
            X.5tb r1 = X.C298525tb.PAYMENT_METHOD
            X.SUj r0 = r5.A0D
            X.QDN.A0N(r5, r1, r0)
            goto L_0x0016
        L_0x02a3:
            java.lang.Object r2 = r4.A03
            X.Qex r2 = (X.C8010Qex) r2
            java.lang.Object r1 = r4.A02
            X.QFO r1 = (X.QFO) r1
            java.lang.Object r0 = r4.A01
            X.SUj r0 = (X.SUj) r0
            X.C8010Qex.A07(r1, r2, r0)
            goto L_0x0016
        L_0x02b4:
            java.lang.Object r2 = r4.A03
            X.Qew r2 = (X.C8009Qew) r2
            java.lang.Object r1 = r4.A02
            X.QFN r1 = (X.QFN) r1
            java.lang.Object r0 = r4.A01
            X.SUj r0 = (X.SUj) r0
            X.C8009Qew.A07(r1, r2, r0)
            goto L_0x0016
        L_0x02c5:
            java.lang.Object r6 = r4.A03
            X.Qew r6 = (X.C8009Qew) r6
            X.0sK r3 = r6.A05
            java.lang.Object r5 = r4.A01
            X.SUj r5 = (X.SUj) r5
            java.lang.Object r7 = r5.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem r7 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem) r7
            if (r7 == 0) goto L_0x0325
            java.lang.String r0 = r7.A04
            java.lang.Long r2 = X.DbV.A0q(r0)
        L_0x02db:
            r0 = 287(0x11f, float:4.02E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 859(0x35b, float:1.204E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r3.invoke(r1, r0, r2)
            java.lang.Object r3 = r4.A02
            X.QFN r3 = (X.QFN) r3
            com.facebookpay.widget.listcell.ListCell r2 = r3.A01
            r1 = 0
            r2.setOnClickListener(r1)
            r2.setPrimaryText(r1)
            android.widget.FrameLayout r0 = r2.A07
            X.AnonymousClass7TH.A0R(r0)
            r2.setActionMenu(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r2.A08(r0)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            if (r7 == 0) goto L_0x0312
            r1 = 12
            java.lang.String r0 = r7.A04
            r2.put(r1, r0)
        L_0x0312:
            X.0sP r0 = r6.A03
            java.lang.Object r4 = r0.invoke(r2)
            X.2Fk r4 = (X.2Fk) r4
            X.07Z r2 = r6.A01
            r0 = 34
            X.Iwy r1 = new X.Iwy
            r1.<init>(r0, r5, r6, r3)
            r0 = 1
            goto L_0x0397
        L_0x0325:
            r2 = 0
            goto L_0x02db
        L_0x0327:
            java.lang.Object r2 = r4.A03
            X.Qev r2 = (X.C8008Qev) r2
            java.lang.Object r1 = r4.A02
            X.QFM r1 = (X.QFM) r1
            java.lang.Object r0 = r4.A01
            X.SUj r0 = (X.SUj) r0
            X.C8008Qev.A07(r1, r2, r0)
            goto L_0x0016
        L_0x0338:
            java.lang.Object r6 = r4.A03
            X.Qev r6 = (X.C8008Qev) r6
            X.0sK r3 = r6.A05
            java.lang.Object r5 = r4.A01
            X.SUj r5 = (X.SUj) r5
            java.lang.Object r7 = r5.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem r7 = (com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem) r7
            if (r7 == 0) goto L_0x039c
            java.lang.String r0 = r7.A04
            java.lang.Long r2 = X.DbV.A0q(r0)
        L_0x034e:
            r0 = 287(0x11f, float:4.02E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 855(0x357, float:1.198E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r3.invoke(r1, r0, r2)
            java.lang.Object r3 = r4.A02
            X.QFM r3 = (X.QFM) r3
            com.facebookpay.widget.listcell.ListCell r2 = r3.A01
            r1 = 0
            r2.setOnClickListener(r1)
            r2.setPrimaryText(r1)
            android.widget.FrameLayout r0 = r2.A07
            X.AnonymousClass7TH.A0R(r0)
            r2.setActionMenu(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r2.A08(r0)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            if (r7 == 0) goto L_0x0385
            r1 = 12
            java.lang.String r0 = r7.A04
            r2.put(r1, r0)
        L_0x0385:
            X.0sP r0 = r6.A03
            java.lang.Object r4 = r0.invoke(r2)
            X.2Fk r4 = (X.2Fk) r4
            X.07Z r2 = r6.A01
            r0 = 33
            X.Iwy r1 = new X.Iwy
            r1.<init>(r0, r5, r6, r3)
            r0 = 0
        L_0x0397:
            X.C51969G9p.A15(r2, r4, r1, r0)
            goto L_0x0016
        L_0x039c:
            r2 = 0
            goto L_0x034e
        L_0x039e:
            X.01W r0 = X.OUs.A03
            java.lang.Object r3 = r0.removeLast()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r4.A01
            X.6Rx r2 = (X.C307896Rx) r2
            if (r2 == 0) goto L_0x03cb
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = X.C56488HzK.A02
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r0.writeLock()
            X.0qQ.A07(r1)
            r1.lock()
            java.util.Map r0 = X.C56488HzK.A00     // Catch:{ all -> 0x080f }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x080f }
            X.Hzu r0 = (X.C56523Hzu) r0     // Catch:{ all -> 0x080f }
            if (r0 == 0) goto L_0x03c8
            r0.A00 = r2     // Catch:{ all -> 0x080f }
        L_0x03c8:
            r1.unlock()
        L_0x03cb:
            java.lang.Object r0 = r4.A03
            int r1 = X.AnonymousClass7TE.A0M(r0)
            r5 = 0
            r7 = 0
            if (r1 == r5) goto L_0x0403
            r0 = 1
            if (r1 == r0) goto L_0x03ef
            r0 = 2
            if (r1 == r0) goto L_0x03eb
            r0 = 3
            if (r1 != r0) goto L_0x080a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = X.C51975G9x.A0q(r3)
            java.util.Map r0 = X.C56488HzK.A00     // Catch:{ all -> 0x0814 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0814 }
            X.Hzu r0 = (X.C56523Hzu) r0     // Catch:{ all -> 0x0814 }
            goto L_0x0417
        L_0x03eb:
            X.C56488HzK.A00(r3)
            goto L_0x0425
        L_0x03ef:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = X.C51975G9x.A0q(r3)
            java.util.Map r0 = X.C56488HzK.A00     // Catch:{ all -> 0x0814 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0814 }
            X.Hzu r0 = (X.C56523Hzu) r0     // Catch:{ all -> 0x0814 }
            r1.unlock()
            if (r0 == 0) goto L_0x0425
            X.4uI r2 = r0.A03
            goto L_0x041e
        L_0x0403:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = X.C51975G9x.A0q(r3)
            java.util.Map r0 = X.C56488HzK.A00     // Catch:{ all -> 0x0814 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0814 }
            X.Hzu r0 = (X.C56523Hzu) r0     // Catch:{ all -> 0x0814 }
            r1.unlock()
            if (r0 == 0) goto L_0x0425
            X.4uI r2 = r0.A01
            goto L_0x041e
        L_0x0417:
            r1.unlock()
            if (r0 == 0) goto L_0x0425
            X.4uI r2 = r0.A02
        L_0x041e:
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            X.6Rx r0 = r0.A00
            X.C299275ur.A00(r0, r1, r2)
        L_0x0425:
            java.lang.Object r0 = r4.A02
            X.OB1 r0 = (X.OB1) r0
            X.O5g r2 = new X.O5g
            r2.<init>(r0)
            X.0qQ.A0B(r3, r5)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = X.C56488HzK.A02
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r0.writeLock()
            X.0qQ.A07(r1)
            r1.lock()
            java.util.Map r0 = X.C56488HzK.A01     // Catch:{ all -> 0x080f }
            r0.put(r3, r2)     // Catch:{ all -> 0x080f }
            r1.unlock()
            X.OUl r0 = X.OUl.A00
            android.app.Activity r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x0018
            r0.finish()
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0453:
            r5 = 0
            r6 = 0
            java.lang.Object r0 = r4.A02
            X.4uI r0 = (X.C277014uI) r0
            if (r0 == 0) goto L_0x0496
            java.lang.Object r5 = r4.A01
            X.6Rx r5 = (X.C307896Rx) r5
            r3 = 1
            r6 = r0
        L_0x0461:
            X.OUl r1 = X.OUl.A00
            X.01W r0 = X.OUs.A03
            java.lang.Object r0 = r0.A0R()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x048f
            r0 = 0
        L_0x046e:
            if (r0 == 0) goto L_0x0820
            X.0hq r2 = r0.getSupportFragmentManager()
            java.lang.String r1 = "consent_screen"
            androidx.fragment.app.Fragment r2 = r2.A0R(r1)
            if (r2 == 0) goto L_0x0819
            if (r3 == 0) goto L_0x0483
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            X.C299275ur.A00(r5, r1, r6)
        L_0x0483:
            X.0s1 r0 = X.DbW.A0D(r0)
            r0.A03(r2)
            r0.A00()
            goto L_0x0016
        L_0x048f:
            android.app.Activity r0 = r1.A00(r0)
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            goto L_0x046e
        L_0x0496:
            r3 = 0
            goto L_0x0461
        L_0x0498:
            java.lang.Object r2 = r4.A02
            X.2Wh r2 = (X.2Wh) r2
            java.lang.Object r1 = r4.A03
            X.7h8 r1 = (X.C337927h8) r1
            X.2lf r0 = r1.A09
            X.C337407gI.A03(r0, r2)
            X.2Wg r1 = r1.A0A
            java.lang.Object r0 = r4.A01
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.FIe(r0)
            goto L_0x0016
        L_0x04b0:
            java.lang.Object r6 = r4.A03
            X.HtO r6 = (X.C56136HtO) r6
            monitor-enter(r6)
            X.3XI r0 = r6.A06     // Catch:{ all -> 0x0827 }
            if (r0 == 0) goto L_0x04c0
            X.2Uj r0 = r0.A00     // Catch:{ all -> 0x0827 }
            if (r0 == 0) goto L_0x04c0
            r0.A00()     // Catch:{ all -> 0x0827 }
        L_0x04c0:
            X.IIN r0 = r6.A01     // Catch:{ all -> 0x0827 }
            r5 = 0
            r3 = 1
            X.C245983dn.A02(r5)     // Catch:{ all -> 0x0827 }
            r0.A01 = r3     // Catch:{ all -> 0x0827 }
            java.util.List r2 = r0.A00     // Catch:{ all -> 0x0827 }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0827 }
        L_0x04cf:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0827 }
            if (r0 == 0) goto L_0x04e3
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0827 }
            X.3ga r0 = (X.C247583ga) r0     // Catch:{ all -> 0x0827 }
            X.3gY r0 = r0.A00     // Catch:{ all -> 0x0827 }
            X.4Cc r0 = r0.A01     // Catch:{ all -> 0x0827 }
            X.AnonymousClass5H8.A01(r5, r0)     // Catch:{ all -> 0x0827 }
            goto L_0x04cf
        L_0x04e3:
            r2.clear()     // Catch:{ all -> 0x0827 }
            r6.A06 = r5     // Catch:{ all -> 0x0827 }
            r6.A05 = r5     // Catch:{ all -> 0x0827 }
            r6.A04 = r5     // Catch:{ all -> 0x0827 }
            monitor-exit(r6)
            java.lang.Object r1 = r4.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r4.A01
            java.lang.Object r1 = r1.invoke(r0)
            X.GrK r1 = (X.C53605GrK) r1
            r1.A0W()
            X.0sa r0 = r1.A02
            if (r0 == 0) goto L_0x0503
            r0.invoke()
        L_0x0503:
            r1.A02 = r5
            r1.A00 = r5
            r1.A01 = r5
            r1.A03 = r3
            r1.requestLayout()
            goto L_0x0016
        L_0x0510:
            java.lang.Object r2 = r4.A03
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r4.A01
            X.I9u r0 = (X.I9u) r0
            goto L_0x0521
        L_0x0519:
            java.lang.Object r2 = r4.A03
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r4.A01
            X.I9x r0 = (X.I9x) r0
        L_0x0521:
            r2.removeOnAttachStateChangeListener(r0)
            java.lang.Object r1 = r4.A02
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.4qe r0 = X.C275604qc.A00(r2)
            java.util.ArrayList r0 = r0.A00
            r0.remove(r1)
            goto L_0x0016
        L_0x0535:
            java.lang.Object r6 = r4.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r4.A02
            java.lang.Object r7 = r4.A03
            X.IFl r7 = (X.C56864IFl) r7
            int r4 = X.C51966G9m.A06(r6)
            if (r4 < 0) goto L_0x0016
            r0 = 0
        L_0x0546:
            int r3 = r0 + 1
            X.4cj r0 = X.G9w.A0J(r6, r0)
            java.lang.Object r2 = r0.BaX()
            boolean r0 = r2 instanceof X.IGB
            if (r0 == 0) goto L_0x057e
            X.IGB r2 = (X.IGB) r2
            if (r2 == 0) goto L_0x057f
            X.Hog r0 = r2.A00
            java.lang.Object r0 = r0.A04
            X.Htj r1 = new X.Htj
            r1.<init>(r0)
            X.0sP r0 = r2.A01
            r0.invoke(r1)
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.util.List r0 = r1.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x0570:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x057f
            java.lang.Object r0 = r1.next()
            X.C51965G9l.A1W(r0, r5)
            goto L_0x0570
        L_0x057e:
            r2 = 0
        L_0x057f:
            java.util.List r0 = r7.A04
            r0.add(r2)
            if (r3 > r4) goto L_0x0016
            r0 = r3
            goto L_0x0546
        L_0x0588:
            java.lang.Object r2 = r4.A03
            X.4cg r2 = (X.C268054cg) r2
            java.lang.Object r1 = r4.A01
            X.5QA r1 = (X.AnonymousClass5QA) r1
            java.lang.Object r0 = r4.A02
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r0
            X.C268054cg.A09(r1, r0, r2)
            goto L_0x0016
        L_0x0599:
            java.lang.Object r6 = r4.A02
            X.5ey r6 = (X.C290225ey) r6
            X.5SI r0 = r6.A0J
            r8 = 0
            r0.A02 = r8
            X.5R6 r5 = r0.A0I
            X.5Pl r0 = r5.A0A()
            int r7 = r0.A00
            if (r7 <= 0) goto L_0x05d0
            java.lang.Object[] r3 = r0.A02
        L_0x05ae:
            r0 = r3[r8]
            X.5R6 r0 = (X.AnonymousClass5R6) r0
            X.5SI r0 = r0.A0U
            X.5ey r2 = r0.A05
            X.0qQ.A0A(r2)
            int r0 = r2.A00
            r2.A01 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.A00 = r0
            java.lang.Integer r1 = r2.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x05cc
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.A05 = r0
        L_0x05cc:
            int r8 = r8 + 1
            if (r8 < r7) goto L_0x05ae
        L_0x05d0:
            X.IzU r0 = X.C58905IzU.A00
            r6.AWC(r0)
            X.4e4 r8 = r6.BHL()
            X.6GP r0 = r8.A0Z()
            if (r0 == 0) goto L_0x0607
            boolean r7 = r0.A02
            java.lang.Object r0 = r4.A03
            X.5SI r0 = (X.AnonymousClass5SI) r0
            X.5R6 r0 = r0.A0I
            java.util.List r3 = r0.A0F()
            int r2 = r3.size()
            r1 = 0
        L_0x05f0:
            if (r1 >= r2) goto L_0x0607
            java.lang.Object r0 = r3.get(r1)
            X.5R6 r0 = (X.AnonymousClass5R6) r0
            X.5RP r0 = r0.A0W
            X.4cg r0 = r0.A04
            X.6GP r0 = r0.A0Z()
            if (r0 == 0) goto L_0x0604
            r0.A02 = r7
        L_0x0604:
            int r1 = r1 + 1
            goto L_0x05f0
        L_0x0607:
            java.lang.Object r0 = r4.A01
            X.4cX r0 = (X.C267964cX) r0
            X.5d6 r0 = r0.A0N()
            r0.E2n()
            X.6GP r0 = r8.A0Z()
            if (r0 == 0) goto L_0x063f
            java.lang.Object r0 = r4.A03
            X.5SI r0 = (X.AnonymousClass5SI) r0
            X.5R6 r0 = r0.A0I
            java.util.List r4 = r0.A0F()
            int r3 = r4.size()
            r2 = 0
        L_0x0627:
            if (r2 >= r3) goto L_0x063f
            java.lang.Object r0 = r4.get(r2)
            X.5R6 r0 = (X.AnonymousClass5R6) r0
            X.5RP r0 = r0.A0W
            X.4cg r0 = r0.A04
            X.6GP r1 = r0.A0Z()
            if (r1 == 0) goto L_0x063c
            r0 = 0
            r1.A02 = r0
        L_0x063c:
            int r2 = r2 + 1
            goto L_0x0627
        L_0x063f:
            X.5Pl r0 = r5.A0A()
            int r5 = r0.A00
            if (r5 <= 0) goto L_0x0667
            r4 = 0
            java.lang.Object[] r3 = r0.A02
        L_0x064a:
            r0 = r3[r4]
            X.5R6 r0 = (X.AnonymousClass5R6) r0
            X.5SI r0 = r0.A0U
            X.5ey r2 = r0.A05
            X.0qQ.A0A(r2)
            int r0 = r2.A01
            int r1 = r2.A00
            if (r0 == r1) goto L_0x0663
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x0663
            X.C290225ey.A03(r2)
        L_0x0663:
            int r4 = r4 + 1
            if (r4 < r5) goto L_0x064a
        L_0x0667:
            X.IzV r0 = X.C58906IzV.A00
            r6.AWC(r0)
            goto L_0x0016
        L_0x066e:
            java.lang.Object r0 = r4.A01
            X.62b r0 = (X.C3022062b) r0
            java.lang.Object r2 = r0.A02
            X.6Gc r2 = (X.C305016Gc) r2
            java.lang.Object r1 = r4.A02
            X.5Xz r1 = (X.C286835Xz) r1
            boolean r0 = r2 instanceof X.C52946Gfx
            if (r0 == 0) goto L_0x0016
            X.Gfx r2 = (X.C52946Gfx) r2     // Catch:{ IllegalArgumentException -> 0x0016 }
            java.lang.String r4 = r2.A01     // Catch:{ IllegalArgumentException -> 0x0016 }
            X.5Xy r1 = (X.C286825Xy) r1     // Catch:{ IllegalArgumentException -> 0x0016 }
            android.content.Context r3 = r1.A00     // Catch:{ ActivityNotFoundException -> 0x0696 }
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch:{ ActivityNotFoundException -> 0x0696 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0696 }
            r0.<init>(r2, r1)     // Catch:{ ActivityNotFoundException -> 0x0696 }
            r3.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0696 }
            goto L_0x0016
        L_0x0696:
            r2 = move-exception
            java.lang.String r1 = "Can't open "
            r0 = 46
            java.lang.String r1 = X.002.A0S(r1, r4, r0)     // Catch:{ IllegalArgumentException -> 0x0016 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0016 }
            r0.<init>(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0016 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0016 }
        L_0x06a5:
            java.lang.Object r3 = r4.A03
            X.6IZ r3 = (X.AnonymousClass6IZ) r3
            X.6Ib r6 = r3.A08
        L_0x06ab:
            X.5Pl r7 = r6.A00
            int r1 = r7.A00
            boolean r0 = X.AnonymousClass7TF.A1P(r1)
            r5 = 1
            if (r0 == 0) goto L_0x06eb
            if (r1 != 0) goto L_0x06c0
            java.lang.String r1 = "MutableVector is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x06c0:
            int r1 = r1 + -1
            java.lang.Object[] r0 = r7.A02
            r0 = r0[r1]
            X.6Ic r0 = (X.AnonymousClass6Ic) r0
            X.0sa r0 = r0.A00
            java.lang.Object r2 = r0.invoke()
            X.5VN r2 = (X.AnonymousClass5VN) r2
            if (r2 == 0) goto L_0x06da
            long r0 = r3.A00
            boolean r0 = X.AnonymousClass6IZ.A04(r3, r2, r0)
            if (r0 == 0) goto L_0x06eb
        L_0x06da:
            int r0 = r7.A00
            int r0 = r0 - r5
            java.lang.Object r0 = r7.A00(r0)
            X.6Ic r0 = (X.AnonymousClass6Ic) r0
            X.1IX r1 = r0.A01
            X.0gF r0 = X.C60340gF.A00
            r1.resumeWith(r0)
            goto L_0x06ab
        L_0x06eb:
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x0700
            X.5VN r2 = X.AnonymousClass6IZ.A02(r3)
            if (r2 == 0) goto L_0x0700
            long r0 = r3.A00
            boolean r0 = X.AnonymousClass6IZ.A04(r3, r2, r0)
            if (r0 != r5) goto L_0x0700
            r0 = 0
            r3.A06 = r0
        L_0x0700:
            java.lang.Object r1 = r4.A01
            androidx.compose.foundation.gestures.UpdatableAnimationState r1 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r1
            java.lang.Object r0 = r4.A02
            X.JS2 r0 = (X.JS2) r0
            float r0 = X.AnonymousClass6IZ.A00(r0, r3)
            r1.A00 = r0
            goto L_0x0016
        L_0x0710:
            java.lang.Object r2 = r4.A02
            X.29o r2 = (X.29o) r2
            java.lang.Object r1 = r4.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r4.A01
            java.io.File r0 = (java.io.File) r0
            java.util.Map r7 = r2.B3P(r1, r0)
            return r7
        L_0x0721:
            java.lang.Object r2 = r4.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r4.A02
            X.3kK r1 = (X.C249763kK) r1
            java.lang.Object r0 = r4.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.GyH r7 = new X.GyH
            r7.<init>(r0, r2, r1)
            return r7
        L_0x0733:
            java.lang.Object r0 = r4.A03
            X.OL3 r0 = (X.OL3) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            java.lang.Object r2 = r4.A01
            com.facebook.rsys.audiomodule.gen.AudioModule r2 = (com.facebook.rsys.audiomodule.gen.AudioModule) r2
            if (r2 == 0) goto L_0x0755
            java.lang.Object r0 = r4.A02
            X.GnK r0 = (X.C53388GnK) r0
            java.lang.Object r1 = r0.A05
            com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy r1 = (com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy) r1
            X.NfN r0 = new X.NfN
            r0.<init>(r2, r1, r3)
            com.instagram.rtc.rsys.proxies.IGRTCFeatureProvider r0 = com.instagram.rtc.rsys.proxies.IGRTCFeatureProvider.CProxy.createFeatureProvider(r0)
            com.facebook.djinni.msys.infra.McfReference r7 = r0.getRawFeatureProvider()
            return r7
        L_0x0755:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x075a:
            java.lang.Object r1 = r4.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r4.A02
            X.0sP r0 = (X.0sP) r0
            X.Ryr r7 = new X.Ryr
            r7.<init>(r0, r1)
            return r7
        L_0x0768:
            java.lang.Object r2 = r4.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r4.A01
            java.lang.Object r0 = r4.A03
            java.lang.Object r7 = r2.invoke(r1, r0)
            return r7
        L_0x0775:
            java.lang.Object r3 = r4.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r4.A02
            X.2Sa r2 = (X.2Sa) r2
            java.lang.Object r0 = r4.A03
            X.HtO r0 = (X.C56136HtO) r0
            int r0 = r0.A00
            X.2V7 r1 = new X.2V7
            r1.<init>(r0)
            X.AnonymousClass7TG.A1N(r3, r2)
            boolean r0 = X.AnonymousClass2Ub.A00(r3)
            X.3X5 r7 = new X.3X5
            r7.<init>(r1, r2, r0)
            return r7
        L_0x0795:
            java.lang.Object r6 = r4.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r5 = r4.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r3 = r4.A02
            com.facebook.quicklog.QuickPerformanceLogger r3 = (com.facebook.quicklog.QuickPerformanceLogger) r3
            X.12T r2 = X.AnonymousClass12T.A00
            r1 = 637710289(0x2602afd1, float:4.5341086E-16)
            r0 = 3
            X.0nV r0 = r2.CO6(r1, r0)
            com.facebook.avatar.expresso.odr.ODRController r7 = new com.facebook.avatar.expresso.odr.ODRController
            r7.<init>(r6, r3, r5, r0)
            return r7
        L_0x07b1:
            java.lang.Object r0 = r4.A01
            java.lang.Object r2 = X.C51966G9m.A18(r0)
            X.0sJ r2 = (X.0sJ) r2
            java.lang.Object r0 = r4.A02
            java.lang.Object r1 = X.C51966G9m.A18(r0)
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r4.A03
            java.lang.Object r0 = X.DbT.A0r(r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            X.GZc r7 = new X.GZc
            r7.<init>(r1, r2, r0)
            return r7
        L_0x07d1:
            java.lang.Object r0 = r4.A01
            java.lang.Object r3 = X.C51966G9m.A18(r0)
            X.6Ga r3 = (X.C304996Ga) r3
            java.lang.Object r2 = r4.A03
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            X.6Gu r0 = r2.A0A
            X.6Gv r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.2HY r0 = (X.2HY) r0
            X.6Iw r1 = new X.6Iw
            r1.<init>(r3, r0)
            java.lang.Object r0 = r4.A02
            X.6Ha r0 = (X.C305226Ha) r0
            X.6Iz r7 = new X.6Iz
            r7.<init>(r0, r3, r2, r1)
            return r7
        L_0x07f6:
            java.lang.Object r3 = r4.A03
            X.6Rx r3 = (X.C307896Rx) r3
            java.lang.Object r2 = r4.A02
            X.4uI r2 = (X.C277014uI) r2
            java.lang.Object r1 = r4.A01
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.Object r7 = X.C308206Td.A0E(r3, r2, r0)
            return r7
        L_0x080a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x080f:
            r0 = move-exception
            r1.unlock()
            throw r0
        L_0x0814:
            r0 = move-exception
            r1.unlock()
            throw r0
        L_0x0819:
            java.lang.String r0 = "No active screen is opened!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0820:
            java.lang.String r0 = "No active consent flow is opened!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0827:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58696Iw5.invoke():java.lang.Object");
    }
}
