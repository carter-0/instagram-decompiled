package X;

/* renamed from: X.Pmh  reason: case insensitive filesystem */
public final class C73963Pmh extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73963Pmh(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A05 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x052c, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b9, code lost:
        r3.A06("target_name", r2);
        r3.A07("incentives_to_apply", (java.util.List) r0.A03);
        r3.A07("applied_incentives", (java.util.List) r0.A01);
        r1 = (com.facebookpay.logging.LoggingContext) r0.A04;
        X.C51971G9r.A1B(r3, r1);
        X.C66582MXn.A1B(r3, r1);
        r15.A0N(r3, "event_payload");
        X.C51969G9p.A1G(r15, r0.A02);
        r1 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e6, code lost:
        if (r1 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e8, code lost:
        r15.A0R("error_message", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ed, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01cf, code lost:
        if (r2.A06() != true) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02e1, code lost:
        X.C66582MXn.A1E(r1, r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        X.C51969G9p.A1G(r15, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x020f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24) {
        /*
            r23 = this;
            r15 = r24
            r0 = r23
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x00ee;
                case 1: goto L_0x0042;
                case 2: goto L_0x0053;
                case 3: goto L_0x00a5;
                case 4: goto L_0x0009;
                case 5: goto L_0x0009;
                case 6: goto L_0x0009;
                case 7: goto L_0x0112;
                case 8: goto L_0x0182;
                case 9: goto L_0x01b8;
                case 10: goto L_0x0241;
                case 11: goto L_0x0282;
                case 12: goto L_0x02b2;
                case 13: goto L_0x02e6;
                case 14: goto L_0x03be;
                case 15: goto L_0x0412;
                case 16: goto L_0x0432;
                case 17: goto L_0x0469;
                case 18: goto L_0x04a8;
                case 19: goto L_0x04d9;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Ln r15 = (X.1Ln) r15
            X.N15 r4 = new X.N15
            r4.<init>()
            java.lang.Object r3 = r0.A03
            com.facebookpay.logging.LoggingContext r3 = (com.facebookpay.logging.LoggingContext) r3
            X.C51971G9r.A1B(r4, r3)
            java.lang.String r2 = r0.A05
            java.lang.String r1 = "ecp_handle_checkout_event_request_type"
            r4.A06(r1, r2)
            X.C66582MXn.A1B(r4, r3)
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x002c
            java.lang.String r1 = "discounts_to_apply"
            r4.A07(r1, r2)
        L_0x002c:
            java.lang.Object r2 = r0.A04
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x0037
            java.lang.String r1 = "order_id"
            r4.A05(r1, r2)
        L_0x0037:
            java.lang.String r1 = "event_payload"
            r15.A0N(r4, r1)
            java.lang.Object r0 = r0.A02
        L_0x003e:
            X.C51969G9p.A1G(r15, r0)
        L_0x0041:
            return r15
        L_0x0042:
            X.1Ln r15 = (X.1Ln) r15
            X.GkN r3 = new X.GkN
            r3.<init>()
            java.lang.String r2 = "incentive"
            java.lang.String r1 = "view_name"
            r3.A06(r1, r2)
            java.lang.String r2 = "add_incentive"
            goto L_0x00b9
        L_0x0053:
            X.1Ln r15 = (X.1Ln) r15
            X.QI0 r3 = new X.QI0
            r3.<init>()
            java.lang.Object r1 = r0.A02
            X.XRm r1 = (X.C21267XRm) r1
            if (r1 == 0) goto L_0x0066
            X.XST r2 = X.SUU.A01(r1)
            if (r2 != 0) goto L_0x0068
        L_0x0066:
            X.XST r2 = X.XST.A03
        L_0x0068:
            java.lang.String r1 = "credential_type"
            r3.A01(r2, r1)
            java.lang.Object r1 = r0.A04
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            X.C51971G9r.A1B(r3, r1)
            X.C66582MXn.A1B(r3, r1)
            java.lang.String r2 = r0.A05
            java.lang.String r1 = "view_name"
            r3.A06(r1, r2)
            java.lang.String r1 = "edit_card"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x0092
            r1 = 872(0x368, float:1.222E-42)
            java.lang.String r1 = X.Pxd.A00(r1)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x009d
        L_0x0092:
            java.lang.Object r2 = r0.A01
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x009d
            java.lang.String r1 = "credential_id"
            r3.A05(r1, r2)
        L_0x009d:
            java.lang.String r1 = "event_payload"
            r15.A0N(r3, r1)
            java.lang.Object r0 = r0.A03
            goto L_0x003e
        L_0x00a5:
            X.1Ln r15 = (X.1Ln) r15
            X.GkN r3 = new X.GkN
            r3.<init>()
            java.lang.String r2 = "incentive"
            java.lang.String r1 = "view_name"
            r3.A06(r1, r2)
            r1 = 262(0x106, float:3.67E-43)
            java.lang.String r2 = X.Pxd.A00(r1)
        L_0x00b9:
            java.lang.String r1 = "target_name"
            r3.A06(r1, r2)
            java.lang.Object r2 = r0.A03
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = "incentives_to_apply"
            r3.A07(r1, r2)
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = "applied_incentives"
            r3.A07(r1, r2)
            java.lang.Object r1 = r0.A04
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            X.C51971G9r.A1B(r3, r1)
            X.C66582MXn.A1B(r3, r1)
            java.lang.String r1 = "event_payload"
            r15.A0N(r3, r1)
            java.lang.Object r1 = r0.A02
            X.C51969G9p.A1G(r15, r1)
            java.lang.String r1 = r0.A05
            if (r1 == 0) goto L_0x0041
            java.lang.String r0 = "error_message"
            r15.A0R(r0, r1)
            return r15
        L_0x00ee:
            java.lang.Object r4 = r0.A03
            androidx.compose.ui.window.PopupLayout r4 = (androidx.compose.ui.window.PopupLayout) r4
            android.view.WindowManager r2 = r4.A0B
            android.view.WindowManager$LayoutParams r1 = r4.A0A
            r2.addView(r4, r1)
            java.lang.Object r3 = r0.A02
            X.0sa r3 = (X.C62320sa) r3
            java.lang.Object r2 = r0.A04
            X.HrS r2 = (X.C56020HrS) r2
            java.lang.String r1 = r0.A05
            java.lang.Object r0 = r0.A01
            X.5Q8 r0 = (X.AnonymousClass5Q8) r0
            r4.A0B(r0, r2, r1, r3)
            r0 = 8
            X.GP2 r15 = new X.GP2
            r15.<init>(r4, r0)
            return r15
        L_0x0112:
            r12 = 0
            X.0qQ.A0B(r15, r12)
            X.Sto r3 = X.C51965G9l.A0g()
            java.lang.Object r2 = r0.A04
            X.QDN r2 = (X.QDN) r2
            com.facebookpay.logging.LoggingContext r5 = r2.A1P
            java.lang.Object r4 = r0.A02
            com.facebookpay.paymentmethod.model.PaymentMethod r4 = (com.facebookpay.paymentmethod.model.PaymentMethod) r4
            java.lang.String r1 = r4.Asm()
            long r13 = java.lang.Long.parseLong(r1)
            X.XRm r6 = r4.Asn()
            java.lang.Object r1 = r0.A01
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r1 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r1
            java.lang.String r1 = r1.A0B
            java.util.List r7 = X.AnonymousClass7TE.A1I(r1)
            X.QDL r1 = r2.A1O
            java.util.List r8 = r1.A06()
            java.lang.Object r1 = r0.A03
            X.SUj r1 = (X.SUj) r1
            java.lang.Throwable r4 = r1.A02
            boolean r1 = r4 instanceof X.C13219TQk
            if (r1 == 0) goto L_0x0153
            r1 = r4
            X.TQk r1 = (X.C13219TQk) r1
            if (r1 == 0) goto L_0x0153
            java.lang.String r11 = r1.A02
            if (r11 != 0) goto L_0x0155
        L_0x0153:
            java.lang.String r11 = ""
        L_0x0155:
            java.util.LinkedHashMap r9 = X.C66584MXp.A0f(r2)
            java.lang.String r2 = "error_message"
            if (r4 == 0) goto L_0x0164
            java.lang.String r1 = X.2Og.A00(r4)
            r9.put(r2, r1)
        L_0x0164:
            java.lang.String r10 = r0.A05
            X.C51974G9v.A1M(r6, r10, r8)
            X.0Ae r1 = r3.A00
            java.lang.String r0 = "client_submit_ecppaymentcontainer_fail"
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)
            r1 = 121(0x79, float:1.7E-43)
            X.1Ln r0 = new X.1Ln
            r0.<init>(r2, r1)
            X.Pmx r4 = new X.Pmx
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.C12411Sto.A03(r0, r5, r4)
            goto L_0x052a
        L_0x0182:
            X.6Gb r4 = X.C51968G9o.A0L(r15)
            java.lang.Object r8 = r0.A02
            java.util.List r8 = (java.util.List) r8
            X.JEW r1 = X.JEW.A00
            java.lang.Object r6 = r0.A01
            java.lang.String r10 = r0.A05
            java.lang.Object r7 = r0.A03
            java.lang.Object r9 = r0.A04
            int r3 = r8.size()
            r0 = 24
            X.J6l r2 = new X.J6l
            r2.<init>((int) r0, (java.lang.Object) r8, (java.lang.Object) r1)
            r0 = 10
            X.MP6 r1 = new X.MP6
            r1.<init>(r8, r0)
            r0 = -1091073711(0xffffffffbef78951, float:-0.48346952)
            r11 = 1
            X.JJj r5 = new X.JJj
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.5PJ r0 = X.AnonymousClass5PI.A04(r5, r0, r11)
            r4.CfA(r2, r1, r0, r3)
            goto L_0x052a
        L_0x01b8:
            java.lang.Object r6 = r0.A02
            X.ODI r6 = (X.ODI) r6
            X.04n r3 = r6.A00
            r10 = 1
            if (r3 == 0) goto L_0x01d1
            X.04l r2 = r3.A00
            boolean r1 = r2.A07()
            if (r1 != r10) goto L_0x01d1
            boolean r1 = r2.A06()
            r22 = 1
            if (r1 == r10) goto L_0x023a
        L_0x01d1:
            r22 = 0
            if (r3 != 0) goto L_0x023a
            r21 = 0
        L_0x01d7:
            r4 = 0
            if (r3 == 0) goto L_0x01e9
            X.04l r2 = r3.A00
            r2.A05(r4)
            r2.A04(r4)
            r2.A01(r10)
            r1 = 2
            r2.A02(r1)
        L_0x01e9:
            java.lang.Object r8 = r0.A03
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r7 = r0.A01
            X.4DU r7 = (X.AnonymousClass4DU) r7
            java.lang.Object r5 = r0.A04
            X.GgM r5 = (X.C52969GgM) r5
            long r2 = r5.A02
            java.lang.String r9 = r5.A09
            X.0qQ.A0B(r8, r4)
            X.0qQ.A0B(r7, r10)
            X.0wc r4 = X.AnonymousClass0kN.A01(r7, r8)
            java.lang.String r1 = "barcelona_media_viewer_entry"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r1)
            boolean r1 = r4.isSampled()
            if (r1 == 0) goto L_0x0228
            X.DbW.A15(r4, r7)
            java.lang.String r1 = X.DbS.A0k()
            if (r1 != 0) goto L_0x021a
            java.lang.String r1 = ""
        L_0x021a:
            X.C51965G9l.A1K(r4, r1)
            X.C51970G9q.A18(r4, r2)
            java.lang.String r1 = "viewer_session_id"
            r4.AAJ(r1, r9)
            r4.Cgf()
        L_0x0228:
            java.lang.String r0 = r0.A05
            X.Olb r15 = new X.Olb
            r17 = r5
            r18 = r8
            r19 = r7
            r20 = r0
            r16 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r15
        L_0x023a:
            X.04l r1 = r3.A00
            int r21 = r1.A00()
            goto L_0x01d7
        L_0x0241:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r4 = r15.booleanValue()
            java.lang.Object r3 = r0.A03
            X.5Oz r3 = (X.C284945Oz) r3
            java.lang.Object r1 = r3.getValue()
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            if (r1 == r4) goto L_0x027a
            java.lang.Object r1 = r0.A02
            X.5V6 r1 = (X.AnonymousClass5V6) r1
            X.5V5 r1 = (X.AnonymousClass5V5) r1
            r2 = 0
            android.view.View r1 = r1.A00
            r1.performHapticFeedback(r2)
            if (r4 == 0) goto L_0x027f
            java.lang.String r9 = "carousel_pinch_in"
        L_0x0265:
            java.lang.Object r5 = r0.A04
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r10 = r5.A06
            java.lang.Object r4 = r0.A01
            X.0iw r4 = (X.AnonymousClass0iw) r4
            java.lang.String r11 = r0.A05
            r6 = 0
            r14 = 1
            r7 = r6
            r8 = r6
            r12 = r6
            r13 = r6
            X.C321406u6.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x027a:
            r3.Epw(r15)
            goto L_0x052a
        L_0x027f:
            java.lang.String r9 = "carousel_pinch_out"
            goto L_0x0265
        L_0x0282:
            com.facebook.msys.mca.MailboxFeature r15 = (com.facebook.msys.mca.MailboxFeature) r15
            r3 = 0
            X.0qQ.A0B(r15, r3)
            java.lang.Object r1 = r0.A03
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r18 = X.C69853NtH.A00(r1)
            java.lang.Object r13 = r0.A02
            java.lang.Object r14 = r0.A04
            java.lang.String r2 = r0.A05
            java.lang.Object r1 = r0.A01
            r0 = 32
            X.Opg r0 = X.C71722Opg.A00(r1, r0)
            X.68L r1 = X.C66581MXm.A0I(r15)
            com.facebook.msys.mca.MailboxFutureImpl r0 = X.C66581MXm.A0J(r1, r0)
            X.Op6 r12 = new X.Op6
            r17 = r2
            r19 = r3
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x02e1
        L_0x02b2:
            com.facebook.msys.mca.MailboxFeature r15 = (com.facebook.msys.mca.MailboxFeature) r15
            r1 = 0
            X.0qQ.A0B(r15, r1)
            java.lang.Object r1 = r0.A03
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r18 = X.C69853NtH.A00(r1)
            java.lang.Object r14 = r0.A02
            java.lang.String r2 = r0.A05
            java.lang.Object r13 = r0.A04
            java.lang.Object r1 = r0.A01
            r0 = 36
            X.Opg r0 = X.C71722Opg.A00(r1, r0)
            X.68L r1 = X.C66581MXm.A0I(r15)
            com.facebook.msys.mca.MailboxFutureImpl r0 = X.C66581MXm.A0J(r1, r0)
            r19 = 1
            X.Op6 r12 = new X.Op6
            r17 = r2
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
        L_0x02e1:
            X.C66582MXn.A1E(r1, r12, r0)
            goto L_0x052a
        L_0x02e6:
            java.util.List r15 = (java.util.List) r15
            r1 = 0
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0q(r15, r1)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r15.iterator()
        L_0x02f9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0314
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.3su r2 = (X.C254703su) r2
            java.lang.String r1 = r2.A0g()
            if (r1 == 0) goto L_0x02f9
            java.lang.String r1 = r2.A1Y
            if (r1 == 0) goto L_0x02f9
            r7.add(r3)
            goto L_0x02f9
        L_0x0314:
            java.util.Iterator r4 = r7.iterator()
        L_0x0318:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x033f
            X.3su r3 = X.C66580MXl.A0a(r4)
            java.lang.String r1 = r3.A0g()
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x033a
            r6.add(r1)
            java.lang.String r1 = r3.A1Y
            if (r1 == 0) goto L_0x0335
            r5.add(r1)
            goto L_0x0318
        L_0x0335:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x033a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x033f:
            boolean r1 = X.DbT.A1b(r6)
            if (r1 == 0) goto L_0x0354
            java.lang.Object r3 = r0.A04
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r0.A03
            X.2Ep r2 = (X.AnonymousClass2Ep) r2
            java.lang.Object r1 = r0.A02
            java.util.Map r1 = (java.util.Map) r1
            X.C71114Od7.A03(r3, r2, r6, r5, r1)
        L_0x0354:
            java.lang.Object r1 = r0.A02
            java.util.Map r1 = (java.util.Map) r1
            java.util.Collection r2 = r1.values()
            r1 = 6
            java.util.List r3 = X.C73429PcU.A00(r2, r1)
            java.lang.String r2 = r0.A05
            X.Pnw r1 = X.C74031Pnw.A00
            java.util.List r1 = X.C71114Od7.A02(r2, r3, r1)
            java.lang.Object r5 = r0.A01
            X.0sP r5 = (X.0sP) r5
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r1.iterator()
        L_0x0375:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0390
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            X.3su r0 = (X.C254703su) r0
            boolean r0 = r0.A1S()
            if (r0 == 0) goto L_0x0375
            r3.add(r1)
            goto L_0x0375
        L_0x0390:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r3.iterator()
        L_0x0398:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03b9
            X.0eP r1 = X.JTO.A1A(r3)
            java.lang.Object r0 = r1.A00
            java.lang.Object r2 = r1.A01
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            r0 = 7
            java.util.List r0 = X.C73429PcU.A00(r2, r0)
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            X.018.A16(r0, r4)
            goto L_0x0398
        L_0x03b9:
            r5.invoke(r4)
            goto L_0x052a
        L_0x03be:
            boolean r2 = X.AnonymousClass7TE.A1a(r15)
            java.lang.Object r8 = r0.A04
            com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl r8 = (com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl) r8
            java.lang.Object r7 = r0.A02
            X.MZ9 r7 = (X.MZ9) r7
            java.lang.Object r6 = r0.A01
            X.MZB r6 = (X.MZB) r6
            java.lang.String r1 = "Completed decoupled MEM login with success="
            java.lang.String r1 = X.002.A1D(r1, r2)
            com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl.access$logMemLoginEvent(r8, r7, r6, r1)
            java.util.Set r2 = r8.didInitializeMsysMailboxAfterDelay
            java.lang.Object r5 = r0.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r1 = r5.A06
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L_0x052a
            X.0Tu r3 = X.0Tu.A05
            r1 = 36607440784528965(0x820e4600191645, double:3.2140311862439456E-306)
            long r1 = X.182.A01(r3, r5, r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            X.0qQ.A0A(r3)
            java.lang.String r4 = "Scheduling mailbox init after "
            java.lang.String r3 = " ms delay"
            java.lang.String r3 = X.002.A0e(r4, r3, r1)
            com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl.access$logMemLoginEvent(r8, r7, r6, r3)
            X.0no r3 = X.0no.A00()
            java.lang.String r9 = r0.A05
            X.NSV r4 = new X.NSV
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A01(r4, r1)
            goto L_0x052a
        L_0x0412:
            if (r24 != 0) goto L_0x042b
            java.lang.Object r15 = r0.A03
            if (r15 != 0) goto L_0x042b
            java.lang.String r3 = r0.A05
            java.lang.Object r1 = r0.A02
            X.2Eq r1 = (X.2Eq) r1
            java.lang.Long r1 = r1.C6I()
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "both message rebuild and reverb query failed"
            X.C66584MXp.A16(r2, r3, r1)
        L_0x042b:
            java.lang.Object r0 = r0.A01
            X.C51965G9l.A1W(r0, r15)
            goto L_0x052a
        L_0x0432:
            X.2HJ r15 = (X.2HJ) r15
            r1 = 0
            X.0qQ.A0B(r15, r1)
            java.lang.Object r3 = r0.A01
            X.2Mg r3 = (X.2Mg) r3
            byte[] r1 = r15.A03()
            java.lang.String r7 = r3.A02(r1)
            java.lang.Object r4 = r0.A04
            X.Svp r4 = (X.C12512Svp) r4
            java.lang.String r5 = r0.A05
            java.lang.Object r1 = r0.A02
            X.59w r1 = (X.C2818659w) r1
            java.lang.Object r2 = r0.A03
            X.OMB r2 = (X.OMB) r2
            java.lang.String r6 = ""
            r8 = 0
            if (r2 != 0) goto L_0x045f
            X.0sa r0 = com.fbpay.w3c.security.SecurityProviderEphemeral.A00
            java.lang.Object r2 = r0.invoke()
            X.OMB r2 = (X.OMB) r2
        L_0x045f:
            X.TWU r0 = new X.TWU
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r2.A01(r0)
            goto L_0x052a
        L_0x0469:
            java.lang.String r15 = (java.lang.String) r15
            r5 = 0
            X.0qQ.A0B(r15, r5)
            java.lang.Object r3 = r0.A01
            X.6Zz r3 = (X.C309886Zz) r3
            java.lang.Object r2 = r0.A04
            X.3mM r2 = (X.C250973mM) r2
            java.lang.Object r1 = r0.A03
            X.3uh r1 = (X.C255773uh) r1
            r3.Dr6(r1, r2, r15)
            java.lang.Object r1 = r0.A02
            X.6Pp r1 = (X.C307306Pp) r1
            java.lang.String r4 = r0.A05
            r3 = 1
            if (r4 == 0) goto L_0x052a
            X.0Ae r1 = r1.A02
            X.0qQ.A0B(r1, r5)
            java.lang.String r0 = "ads_text_overlay_client_logging_text_clicks"
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x052a
            java.lang.String r0 = "ad_id"
            java.lang.Boolean r1 = X.JTP.A0g(r2, r0, r4, r3)
            java.lang.String r0 = "is_show_more_clicked"
            r2.A7p(r0, r1)
            r2.Cgf()
            goto L_0x052a
        L_0x04a8:
            X.OCq r15 = (X.C70593OCq) r15
            r1 = 0
            X.0qQ.A0B(r15, r1)
            java.lang.Object r1 = r0.A04
            X.325 r1 = (X.AnonymousClass325) r1
            X.AnonymousClass325.A01(r15, r1)
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.String r2 = r3.getId()
            if (r2 == 0) goto L_0x04d4
            boolean r1 = r3.A5D()
            if (r1 == 0) goto L_0x04cc
            X.1Xj r1 = r3.A1f(r2)
            X.0qQ.A0A(r1)
        L_0x04cc:
            java.lang.Object r0 = r0.A03
            X.JQL r0 = (X.JQL) r0
            r0.DeI()
            goto L_0x052a
        L_0x04d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x04d9:
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            r3 = 0
            r2 = 2131962246(0x7f132986, float:1.9561212E38)
            r1 = 0
            X.C59689JTv.A01(r4, r3, r2, r1)
            java.lang.Object r1 = r0.A04
            X.325 r1 = (X.AnonymousClass325) r1
            X.326 r4 = r1.A04
            java.lang.Object r5 = r0.A03
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r3 = r0.A02
            X.DTv r3 = (X.C46292DTv) r3
            X.Pwf r1 = r3.Bbg()
            if (r1 == 0) goto L_0x052d
            java.lang.Long r1 = r1.BEY()
        L_0x04fd:
            java.lang.String r7 = java.lang.String.valueOf(r1)
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r6 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.CANCELED
            com.instagram.user.model.ProductDetailsProductItemDictIntf r1 = r3.Bfu()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0511
            java.lang.String r8 = r1.getProductId()
            if (r8 != 0) goto L_0x0512
        L_0x0511:
            r8 = r2
        L_0x0512:
            com.instagram.user.model.ProductDetailsProductItemDictIntf r1 = r3.Bfu()
            if (r1 == 0) goto L_0x0524
            com.instagram.user.model.User r1 = r1.BRo()
            if (r1 == 0) goto L_0x0524
            java.lang.String r9 = X.AnonymousClass3ZA.A00(r1)
            if (r9 != 0) goto L_0x0525
        L_0x0524:
            r9 = r2
        L_0x0525:
            java.lang.String r10 = r0.A05
            r4.A01(r5, r6, r7, r8, r9, r10)
        L_0x052a:
            X.0gF r15 = X.C60340gF.A00
            return r15
        L_0x052d:
            r1 = 0
            goto L_0x04fd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73963Pmh.invoke(java.lang.Object):java.lang.Object");
    }
}
