package X;

public final class TPM implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final Object A01;

    public static void A01(C250663lr r2, Qmk qmk, Object obj, int i) {
        qmk.A03 = new C11499SbM(i, obj, (Object) r2);
        qmk.A00 = 2131962182;
        qmk.A06 = !r2.getCoercedBooleanField(1, "is_default");
    }

    public TPM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass2gB A00(2Fk r1, Object obj, int i) {
        return AnonymousClass72Y.A01(r1, new TPM(obj, i));
    }

    /* JADX WARNING: type inference failed for: r0v227, types: [X.Reo, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0579, code lost:
        return com.google.common.collect.ImmutableList.of();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0600, code lost:
        return X.SUj.A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0607, code lost:
        return X.SUj.A0A(r1, r6.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x060c, code lost:
        return X.SUj.A09(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        return X.SUj.A06(r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            r6 = r16
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x0726;
                case 1: goto L_0x0709;
                case 2: goto L_0x06c6;
                case 3: goto L_0x06a7;
                case 4: goto L_0x0692;
                case 5: goto L_0x060d;
                case 6: goto L_0x05df;
                case 7: goto L_0x05c2;
                case 8: goto L_0x0019;
                case 9: goto L_0x05b1;
                case 10: goto L_0x057a;
                case 11: goto L_0x04a7;
                case 12: goto L_0x037c;
                case 13: goto L_0x0305;
                case 14: goto L_0x0285;
                case 15: goto L_0x0186;
                case 16: goto L_0x0166;
                case 17: goto L_0x00af;
                case 18: goto L_0x0029;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.SUj r6 = (X.SUj) r6
            java.lang.Object r0 = r6.A01
            if (r0 == 0) goto L_0x0027
            X.34S r0 = (X.AnonymousClass34S) r0
            java.lang.Object r0 = r0.A00
            r0.getClass()
        L_0x0014:
            X.SUj r0 = X.SUj.A06(r6, r0)
            return r0
        L_0x0019:
            X.SUj r6 = (X.SUj) r6
            java.lang.Object r1 = r6.A01
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = (java.lang.String) r1
            X.RpH r0 = new X.RpH
            r0.<init>(r1)
            goto L_0x0014
        L_0x0027:
            r0 = 0
            goto L_0x0014
        L_0x0029:
            X.SUj r6 = (X.SUj) r6
            boolean r0 = X.SUj.A0V(r6)
            r4 = 110177888(0x6912e60, float:5.461108E-35)
            if (r0 == 0) goto L_0x0066
            java.lang.Object r3 = r15.A01
            X.QnD r3 = (X.C8271QnD) r3
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0049
            X.2FO r2 = r3.A08
            com.facebookpay.logging.FBPayLoggerData r0 = r3.A01
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "fbpay_transactions_page_api_success"
            r2.Cgl(r0, r1)
        L_0x0049:
            java.lang.Object r1 = X.SUj.A0D(r6)
            X.D9l r1 = (X.C45887D9l) r1
            java.lang.String r0 = r1.A02
            r3.A03 = r0
            com.fbpay.hub.transactions.api.UpcomingPayout r0 = r1.A00
            if (r0 != 0) goto L_0x0059
            com.fbpay.hub.transactions.api.UpcomingPayout r0 = r3.A02
        L_0x0059:
            r3.A02 = r0
            com.google.common.collect.ImmutableList r0 = X.C8271QnD.A00(r1, r3)
            com.facebook.quicklog.QuickPerformanceLogger r2 = r3.A00
            r1 = 2
            r2.markerEnd(r4, r1)
            return r0
        L_0x0066:
            boolean r0 = X.SUj.A0T(r6)
            java.lang.Object r3 = r15.A01
            X.QnD r3 = (X.C8271QnD) r3
            if (r0 == 0) goto L_0x008c
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0081
            X.2FO r2 = r3.A08
            com.facebookpay.logging.FBPayLoggerData r0 = r3.A01
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "fbpay_transactions_page_api_init"
            r2.Cgl(r0, r1)
        L_0x0081:
            java.lang.Object r0 = r6.A01
            if (r0 == 0) goto L_0x0575
            X.D9l r0 = (X.C45887D9l) r0
            com.google.common.collect.ImmutableList r0 = X.C8271QnD.A00(r0, r3)
            return r0
        L_0x008c:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r3.A00
            r0 = 3
            r1.markerEnd(r4, r0)
            java.lang.Throwable r1 = r6.A02
            r1.getClass()
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0081
            com.facebookpay.logging.FBPayLoggerData r0 = r3.A01
            java.util.LinkedHashMap r2 = X.C2818159r.A06(r0)
            java.lang.String r0 = "throwable"
            r2.put(r0, r1)
            X.2FO r1 = r3.A08
            java.lang.String r0 = "fbpay_transactions_page_api_fail"
            r1.Cgl(r0, r2)
            goto L_0x0081
        L_0x00af:
            X.SUj r6 = (X.SUj) r6
            boolean r0 = X.SUj.A0V(r6)
            if (r0 == 0) goto L_0x0575
            java.lang.Object r5 = r15.A01
            java.lang.Object r6 = r6.A01
            r6.getClass()
            com.google.common.collect.ImmutableList r6 = (com.google.common.collect.ImmutableList) r6
            com.google.common.collect.ImmutableList$Builder r4 = X.Pxe.A0Y()
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00ff
            X.Qmh r2 = new X.Qmh
            r2.<init>()
            r0 = 2130969507(0x7f0403a3, float:1.7547698E38)
            r2.A00 = r0
            X.SRV r0 = X.AnonymousClass2E0.A0E()
            android.content.Context r1 = r0.A08
            r0 = 2131969073(0x7f134431, float:1.9575059E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A02 = r0
            X.SRV r0 = X.AnonymousClass2E0.A0E()
            android.content.Context r1 = r0.A08
            r0 = 2131969072(0x7f134430, float:1.9575057E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A01 = r0
            X.Qmo r0 = new X.Qmo
            r0.<init>(r2)
            r4.add(r0)
        L_0x00fa:
            com.google.common.collect.ImmutableList r0 = r4.build()
            return r0
        L_0x00ff:
            X.Qmj r1 = new X.Qmj
            r1.<init>()
            r0 = 2131969088(0x7f134440, float:1.9575089E38)
            r1.A02 = r0
            int r0 = r6.size()
            r3 = 3
            if (r0 <= r3) goto L_0x011d
            r0 = 2131962203(0x7f13295b, float:1.9561125E38)
            r1.A00 = r0
            r0 = 57
            X.SbJ r0 = X.C11496SbJ.A00(r5, r0)
            r1.A03 = r0
        L_0x011d:
            X.Qms.A00(r1, r4)
            r2 = 0
        L_0x0121:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x00fa
            if (r2 >= r3) goto L_0x00fa
            java.lang.Object r7 = r6.get(r2)
            com.fbpay.hub.orders.api.FBPayOrder r7 = (com.fbpay.hub.orders.api.FBPayOrder) r7
            r0 = 4
            X.Qml r1 = new X.Qml
            r1.<init>(r0)
            java.lang.String r0 = r7.A01
            r1.A0E = r0
            java.lang.String r0 = r7.A06
            r1.A0G = r0
            java.lang.String r0 = r7.A02
            r1.A0F = r0
            java.lang.String r0 = r7.A04
            r1.A0D = r0
            java.lang.Integer r0 = r7.A00
            r1.A0C = r0
            r0 = 48
            X.SbM r0 = X.C11499SbM.A00(r5, r7, r0)
            r1.A08 = r0
            X.Qmv r0 = new X.Qmv
            r0.<init>()
            r1.A0B = r0
            X.SEE.A00(r1)
            X.Qmq r0 = new X.Qmq
            r0.<init>(r1)
            r4.add(r0)
            int r2 = r2 + 1
            goto L_0x0121
        L_0x0166:
            X.SUj r6 = (X.SUj) r6
            boolean r0 = X.SUj.A0V(r6)
            if (r0 == 0) goto L_0x017c
            java.lang.Object r0 = r6.A01
            r0.getClass()
            X.S4Y r0 = (X.S4Y) r0
            boolean r0 = r0.A02
        L_0x0177:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x017c:
            boolean r0 = X.SUj.A0S(r6)
            if (r0 == 0) goto L_0x0184
            r0 = 0
            goto L_0x0177
        L_0x0184:
            r0 = 0
            return r0
        L_0x0186:
            X.SUj r6 = (X.SUj) r6
            boolean r0 = X.SUj.A0V(r6)
            if (r0 == 0) goto L_0x0575
            java.lang.Object r5 = r15.A01
            X.Qn9 r5 = (X.C8267Qn9) r5
            java.lang.Object r8 = r6.A01
            r8.getClass()
            X.S4Y r8 = (X.S4Y) r8
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.Qmk r2 = new X.Qmk
            r2.<init>()
            r0 = 2131962195(0x7f132953, float:1.9561108E38)
            r2.A02 = r0
            r7 = 1
            r2.A07 = r7
            r0 = 53
            X.SbJ r0 = X.C11496SbJ.A00(r5, r0)
            r2.A03 = r0
            X.RsJ r1 = new X.RsJ
            r1.<init>()
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            r1.A00 = r6
            X.SEE r0 = new X.SEE
            r0.<init>(r1)
            r2.A02 = r0
            X.Qmt r0 = new X.Qmt
            r0.<init>(r2)
            r4.add(r0)
            X.Qmk r1 = new X.Qmk
            r1.<init>()
            r0 = 2131962196(0x7f132954, float:1.956111E38)
            r1.A02 = r0
            r1.A07 = r7
            r0 = 54
            X.SbJ r0 = X.C11496SbJ.A00(r5, r0)
            r1.A03 = r0
            X.Qmt r0 = X.Qmt.A00(r1, r6)
            r4.add(r0)
            X.Qmk r1 = new X.Qmk
            r1.<init>()
            r0 = 2131962197(0x7f132955, float:1.9561112E38)
            r1.A02 = r0
            r1.A07 = r7
            r0 = 55
            X.SbJ r0 = X.C11496SbJ.A00(r5, r0)
            r1.A03 = r0
            X.Qmt r0 = X.Qmt.A00(r1, r6)
            r4.add(r0)
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x0228
            X.Qmk r2 = new X.Qmk
            r2.<init>()
            boolean r1 = X.C11431STx.A03()
            r0 = 2131962193(0x7f132951, float:1.9561104E38)
            if (r1 == 0) goto L_0x0215
            r0 = 2131965871(0x7f1337af, float:1.9568564E38)
        L_0x0215:
            r2.A02 = r0
            r2.A07 = r7
            r0 = 56
            X.SbJ r0 = X.C11496SbJ.A00(r5, r0)
            r2.A03 = r0
            X.Qmt r0 = X.Qmt.A00(r2, r6)
            r4.add(r0)
        L_0x0228:
            boolean r0 = r8.A00
            r3 = 0
            if (r0 == 0) goto L_0x024e
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x024e
            X.Qmk r2 = new X.Qmk
            r2.<init>()
            r0 = 2131962194(0x7f132952, float:1.9561106E38)
            r2.A02 = r0
            r2.A07 = r7
            r1 = 12
            X.SbI r0 = new X.SbI
            r0.<init>(r5, r1)
            r2.A03 = r0
            X.Qmt r0 = X.Qmt.A00(r2, r6)
            r4.add(r3, r0)
            r3 = 1
        L_0x024e:
            com.instagram.common.session.UserSession r1 = r5.A04
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r1)
            boolean r0 = X.2Ek.A01(r0)
            if (r0 != 0) goto L_0x0262
            boolean r0 = X.AnonymousClass431.A00(r1)
            if (r0 == 0) goto L_0x0280
        L_0x0262:
            int r3 = r3 + 1
            X.Qmk r2 = new X.Qmk
            r2.<init>()
            r0 = 2131953829(0x7f1308a5, float:1.954414E38)
            r2.A02 = r0
            r2.A07 = r7
            r1 = 13
            X.SbI r0 = new X.SbI
            r0.<init>(r5, r1)
            r2.A03 = r0
            X.Qmt r0 = X.Qmt.A00(r2, r6)
            r4.add(r3, r0)
        L_0x0280:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r4)
            return r0
        L_0x0285:
            java.lang.Number r6 = (java.lang.Number) r6
            java.lang.Object r4 = r15.A01
            X.QDC r4 = (X.QDC) r4
            com.fbpay.hub.form.params.FormParams r0 = r4.A01
            java.lang.String r3 = r0.A09
            if (r3 != 0) goto L_0x0293
            java.lang.String r3 = "FBPAY_HUB"
        L_0x0293:
            X.RsL r7 = r4.A0A
            X.QD8 r0 = r4.A00
            android.util.SparseArray r5 = r0.A00()
            com.fbpay.hub.form.params.FormParams r2 = r4.A01
            java.lang.String r1 = r2.A08
            r0 = 12
            r5.put(r0, r1)
            com.facebookpay.logging.FBPayLoggerData r0 = r2.A00
            if (r0 == 0) goto L_0x02b1
            r1 = 22
            java.lang.String r0 = r0.A00()
            r5.put(r1, r0)
        L_0x02b1:
            com.fbpay.hub.form.params.FormParams r0 = r4.A01
            int r2 = r0.A04
            int r9 = r6.intValue()
            X.Rq0 r1 = r7.A01
            r0 = 1
            if (r2 == 0) goto L_0x02f2
            if (r2 == r0) goto L_0x02ec
            r0 = 2
            if (r2 == r0) goto L_0x02e6
            r0 = 3
            if (r2 == r0) goto L_0x02de
            r0 = 5
            if (r2 != r0) goto L_0x02fa
            com.instagram.common.session.UserSession r0 = r1.A00
            X.DGK r6 = new X.DGK
            r6.<init>(r0)
        L_0x02d0:
            X.Tg9 r6 = (X.C13737Tg9) r6
            X.5A3 r8 = r7.A00
            X.QnI r4 = new X.QnI
            r4.<init>(r5, r6, r7, r8, r9)
            X.QCn r0 = X.SSC.A03(r4)
            return r0
        L_0x02de:
            com.instagram.common.session.UserSession r0 = r1.A00
            X.SvH r6 = new X.SvH
            r6.<init>(r0, r3)
            goto L_0x02d0
        L_0x02e6:
            X.DGI r6 = new X.DGI
            r6.<init>()
            goto L_0x02d0
        L_0x02ec:
            X.DGJ r6 = new X.DGJ
            r6.<init>()
            goto L_0x02d0
        L_0x02f2:
            com.instagram.common.session.UserSession r0 = r1.A00
            X.DGL r6 = new X.DGL
            r6.<init>(r0)
            goto L_0x02d0
        L_0x02fa:
            r0 = 2527(0x9df, float:3.541E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r2)
            throw r0
        L_0x0305:
            X.SUj r6 = (X.SUj) r6
            boolean r0 = X.SUj.A0V(r6)
            if (r0 == 0) goto L_0x0575
            java.lang.Object r5 = r15.A01
            java.lang.Object r7 = r6.A01
            r7.getClass()
            X.S4N r7 = (X.S4N) r7
            com.google.common.collect.ImmutableList$Builder r4 = X.Pxe.A0Y()
            X.Qmj r1 = new X.Qmj
            r1.<init>()
            r0 = 2131957626(0x7f13177a, float:1.9551841E38)
            r1.A02 = r0
            X.Qms.A00(r1, r4)
            X.Qmk r6 = new X.Qmk
            r6.<init>()
            r0 = 2131973724(0x7f13565c, float:1.9584492E38)
            r6.A02 = r0
            java.lang.String r0 = r7.A00
            r6.A04 = r0
            r3 = 1
            r6.A07 = r3
            r0 = 47
            X.SbJ r0 = X.C11496SbJ.A00(r5, r0)
            r6.A03 = r0
            X.RsJ r1 = new X.RsJ
            r1.<init>()
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1.A00 = r2
            X.SEE r0 = new X.SEE
            r0.<init>(r1)
            r6.A02 = r0
            X.Qmt r0 = new X.Qmt
            r0.<init>(r6)
            r4.add(r0)
            X.Qmk r1 = new X.Qmk
            r1.<init>()
            r0 = 2131969070(0x7f13442e, float:1.9575052E38)
            r1.A02 = r0
            java.lang.String r0 = r7.A01
            r1.A04 = r0
            r0 = 48
            X.SbJ r0 = X.C11496SbJ.A00(r5, r0)
            r1.A03 = r0
            r1.A07 = r3
            X.Qmt r0 = X.Qmt.A00(r1, r2)
            r4.add(r0)
            com.google.common.collect.ImmutableList r0 = r4.build()
            return r0
        L_0x037c:
            X.SUj r6 = (X.SUj) r6
            boolean r0 = X.SUj.A0V(r6)
            if (r0 == 0) goto L_0x0575
            java.lang.Object r4 = r15.A01
            java.lang.Object r6 = r6.A01
            r6.getClass()
            X.S4X r6 = (X.S4X) r6
            com.google.common.collect.ImmutableList$Builder r5 = X.Pxe.A0Y()
            java.lang.String r7 = r6.A02
            X.SRV r0 = X.AnonymousClass2E0.A0E()
            X.SDj r0 = r0.A06()
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310362190053407(0x8100150001001f, double:3.02615748685812E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x03d7
            X.Qmj r1 = new X.Qmj
            r1.<init>()
            r0 = 2131962806(0x7f132bb6, float:1.9562348E38)
            r1.A02 = r0
            X.Qms.A00(r1, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0416
            X.Qmg r1 = new X.Qmg
            r1.<init>()
            r0 = 2131962802(0x7f132bb2, float:1.956234E38)
            r1.A00 = r0
            r0 = 46
            X.SbJ r0 = X.C11496SbJ.A00(r4, r0)
            r1.A01 = r0
            X.Qmr r0 = new X.Qmr
            r0.<init>(r1)
        L_0x03d4:
            r5.add(r0)
        L_0x03d7:
            com.google.common.collect.ImmutableList r7 = r6.A00
            X.Qmj r1 = new X.Qmj
            r1.<init>()
            r0 = 2131961574(0x7f1326e6, float:1.9559849E38)
            r1.A02 = r0
            X.Qms.A00(r1, r5)
            X.3kO r3 = r7.iterator()
        L_0x03ea:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0431
            X.3lr r2 = X.C41845B3m.A0V(r3)
            X.Qmk r1 = new X.Qmk
            r1.<init>()
            java.lang.String r0 = "normalized_email_address"
            java.lang.String r0 = r2.A09(r0)
            r1.A05 = r0
            r0 = 1
            r1.A07 = r0
            r0 = 46
            A01(r2, r1, r4, r0)
            X.SEE.A00(r1)
            X.Qmt r0 = new X.Qmt
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x03ea
        L_0x0416:
            X.Qmk r2 = new X.Qmk
            r2.<init>()
            r2.A05 = r7
            r0 = 1
            r2.A07 = r0
            r1 = 3
            X.Sb7 r0 = new X.Sb7
            r0.<init>(r7, r4, r1)
            r2.A03 = r0
            X.SEE.A00(r2)
            X.Qmt r0 = new X.Qmt
            r0.<init>(r2)
            goto L_0x03d4
        L_0x0431:
            boolean r3 = r7.isEmpty()
            X.Qmg r2 = new X.Qmg
            r2.<init>()
            r0 = 2131961573(0x7f1326e5, float:1.9559847E38)
            r2.A00 = r0
            r1 = 2
            X.Sb6 r0 = new X.Sb6
            r0.<init>(r1, r4, r3)
            r2.A01 = r0
            X.Qmr.A00(r2, r5)
            com.google.common.collect.ImmutableList r6 = r6.A01
            X.Qmj r1 = new X.Qmj
            r1.<init>()
            r0 = 2131969397(0x7f134575, float:1.9575716E38)
            r1.A02 = r0
            X.Qms.A00(r1, r5)
            X.3kO r3 = r6.iterator()
        L_0x045d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0489
            X.3lr r2 = X.C41845B3m.A0V(r3)
            X.Qmk r1 = new X.Qmk
            r1.<init>()
            java.lang.String r0 = "normalized_phone_number"
            java.lang.String r0 = r2.A09(r0)
            r1.A05 = r0
            r0 = 1
            r1.A07 = r0
            r0 = 47
            A01(r2, r1, r4, r0)
            X.SEE.A00(r1)
            X.Qmt r0 = new X.Qmt
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x045d
        L_0x0489:
            boolean r3 = r6.isEmpty()
            X.Qmg r2 = new X.Qmg
            r2.<init>()
            r0 = 2131969390(0x7f13456e, float:1.9575701E38)
            r2.A00 = r0
            r1 = 3
            X.Sb6 r0 = new X.Sb6
            r0.<init>(r1, r4, r3)
            r2.A01 = r0
            X.Qmr.A00(r2, r5)
            com.google.common.collect.ImmutableList r0 = r5.build()
            return r0
        L_0x04a7:
            X.SUj r6 = (X.SUj) r6
            boolean r0 = X.SUj.A0V(r6)
            if (r0 == 0) goto L_0x0575
            java.lang.Object r3 = r15.A01
            X.Qn8 r3 = (X.C8266Qn8) r3
            java.lang.Object r1 = r6.A01
            r1.getClass()
            X.S4M r1 = (X.S4M) r1
            com.facebookpay.form.model.AddressFormFieldsConfig r0 = r1.A00
            r3.A00 = r0
            com.google.common.collect.ImmutableList$Builder r2 = X.Pxe.A0Y()
            com.google.common.collect.ImmutableList r4 = r1.A01
            X.3kO r7 = r4.iterator()
        L_0x04c8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0556
            X.3lr r6 = X.C41845B3m.A0V(r7)
            X.Qmk r5 = new X.Qmk
            r5.<init>()
            r1 = 9
            java.lang.String r0 = "label"
            java.lang.String r0 = r6.getOptionalStringField(r1, r0)
            r5.A05 = r0
            java.lang.String r0 = "care_of"
            java.lang.String r8 = r6.A09(r0)
            r1 = 7
            java.lang.String r0 = "street1"
            java.lang.String r9 = r6.getOptionalStringField(r1, r0)
            java.lang.String r0 = "street2"
            java.lang.String r10 = r6.A0D(r0)
            r1 = 3
            java.lang.String r0 = "city_name"
            java.lang.String r11 = r6.getOptionalStringField(r1, r0)
            r1 = 5
            java.lang.String r0 = "state_name"
            java.lang.String r12 = r6.getOptionalStringField(r1, r0)
            r1 = 4
            java.lang.String r0 = "postal_code"
            java.lang.String r13 = r6.getOptionalStringField(r1, r0)
            r1 = 6
            java.lang.String r0 = "country_name"
            java.lang.String r14 = r6.getOptionalStringField(r1, r0)
            if (r8 == 0) goto L_0x0553
            if (r9 == 0) goto L_0x0553
            if (r11 == 0) goto L_0x0553
            if (r12 == 0) goto L_0x0553
            if (r13 == 0) goto L_0x0553
            if (r14 == 0) goto L_0x0553
            if (r10 == 0) goto L_0x0548
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0548
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13, r14}
            java.lang.String r0 = "%s, %s, %s, %s, %s, %s, %s"
        L_0x052e:
            java.lang.String r0 = X.0mp.A06(r0, r1)
        L_0x0532:
            r5.A04 = r0
            r0 = 1
            r5.A07 = r0
            r0 = 44
            A01(r6, r5, r3, r0)
            X.SEE.A00(r5)
            X.Qmt r0 = new X.Qmt
            r0.<init>(r5)
            r2.add(r0)
            goto L_0x04c8
        L_0x0548:
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13}
            java.lang.String r0 = "%s, %s, %s, %s, %s, %s"
            goto L_0x052e
        L_0x0553:
            java.lang.String r0 = ""
            goto L_0x0532
        L_0x0556:
            X.Qmg r1 = new X.Qmg
            r1.<init>()
            r0 = 2131973723(0x7f13565b, float:1.958449E38)
            r1.A00 = r0
            r0 = 45
            X.SbM r0 = X.C11499SbM.A00(r3, r4, r0)
            r1.A01 = r0
            r0 = 2131432678(0x7f0b14e6, float:1.848712E38)
            r1.A01 = r0
            X.Qmr.A00(r1, r2)
            com.google.common.collect.ImmutableList r0 = r2.build()
            return r0
        L_0x0575:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            return r0
        L_0x057a:
            X.SUj r6 = (X.SUj) r6
            boolean r0 = X.SUj.A0V(r6)
            if (r0 == 0) goto L_0x0599
            java.lang.Object r0 = X.SUj.A0D(r6)
            X.RpH r0 = (X.C10257RpH) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.SUj r0 = X.SUj.A09(r0)
            return r0
        L_0x0599:
            boolean r0 = X.SUj.A0S(r6)
            if (r0 == 0) goto L_0x05aa
            java.lang.Throwable r1 = r6.A02
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            X.SUj r0 = X.SUj.A0A(r0, r1)
            return r0
        L_0x05aa:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.SUj r0 = X.SUj.A08(r0)
            return r0
        L_0x05b1:
            X.SUj r6 = (X.SUj) r6
            java.lang.Object r0 = r6.A01
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.SUj r0 = X.SUj.A06(r6, r0)
            return r0
        L_0x05c2:
            X.SUj r6 = (X.SUj) r6
            boolean r0 = X.SUj.A0V(r6)
            r1 = 0
            if (r0 != 0) goto L_0x0608
            boolean r0 = X.SUj.A0S(r6)
            if (r0 != 0) goto L_0x0601
            boolean r0 = X.SUj.A0T(r6)
            if (r0 != 0) goto L_0x05fc
            java.lang.String r0 = "not possible"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x05df:
            X.SUj r6 = (X.SUj) r6
            boolean r0 = X.SUj.A0V(r6)
            r1 = 0
            if (r0 != 0) goto L_0x0608
            boolean r0 = X.SUj.A0S(r6)
            if (r0 != 0) goto L_0x0601
            boolean r0 = X.SUj.A0T(r6)
            if (r0 != 0) goto L_0x05fc
            java.lang.String r0 = "not possible"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x05fc:
            X.SUj r0 = X.SUj.A08(r1)
            return r0
        L_0x0601:
            java.lang.Throwable r0 = r6.A02
            X.SUj r0 = X.SUj.A0A(r1, r0)
            return r0
        L_0x0608:
            X.SUj r0 = X.SUj.A09(r1)
            return r0
        L_0x060d:
            X.SFo r6 = (X.C11214SFo) r6
            java.lang.Object r3 = r15.A01
            X.QDI r3 = (X.QDI) r3
            boolean r0 = X.QDI.A00(r3)
            if (r0 == 0) goto L_0x0666
            android.os.Bundle r1 = r3.A00
            if (r1 == 0) goto L_0x0659
            java.lang.String r0 = "AUTH_FLOW_UTIL_PIN_FORGOT"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x0659
        L_0x0625:
            X.SIS r5 = r3.A0A
            android.os.Bundle r1 = r3.A00
            java.lang.String r0 = "PAYMENT_TYPE"
            java.lang.String r0 = r1.getString(r0)
            r0.getClass()
            android.os.Bundle r1 = r3.A00
            java.lang.String r0 = "AUTH_FLOW_UTIL_PASSWORD_ENTERED"
            java.lang.String r7 = X.DbU.A0l(r1, r0)
            java.lang.String r8 = r3.A03
            r8.getClass()
            X.5A3 r2 = r5.A01
            r9 = 0
            X.DEc r4 = new X.DEc
            r4.<init>(r5, r6, r7, r8, r9)
            X.SOC r1 = r5.A00
            X.DbZ.A0t(r9, r2, r1, r6)
            X.Qnc r0 = new X.Qnc
            r0.<init>(r4, r1, r2, r6)
            X.QCn r0 = X.SSC.A03(r0)
            X.SIS.A00(r0, r1)
            return r0
        L_0x0659:
            android.os.Bundle r1 = r3.A00
            if (r1 == 0) goto L_0x0666
            java.lang.String r0 = "AUTH_FLOW_UTIL_PIN_LOCKED"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x0666
            goto L_0x0625
        L_0x0666:
            boolean r2 = X.QDI.A00(r3)
            X.SIS r4 = r3.A0A
            android.os.Bundle r1 = r3.A00
            java.lang.String r0 = "PAYMENT_TYPE"
            java.lang.String r3 = X.DbU.A0l(r1, r0)
            if (r2 == 0) goto L_0x068d
            X.5A3 r2 = r4.A01
            r1 = 3
            X.DEl r0 = new X.DEl
            r0.<init>(r4, r6, r3, r1)
            X.QCn r2 = X.SQA.A00(r0, r4, r2, r6)
            r1 = 5
            X.TPJ r0 = new X.TPJ
            r0.<init>(r1, r6, r4)
            X.2gB r0 = X.AnonymousClass72Y.A01(r2, r0)
            return r0
        L_0x068d:
            X.QCn r0 = r4.A02(r6, r3)
            return r0
        L_0x0692:
            X.SFo r6 = (X.C11214SFo) r6
            java.lang.Object r0 = r15.A01
            X.QDF r0 = (X.QDF) r0
            X.SIS r2 = r0.A08
            android.os.Bundle r1 = r0.A00
            java.lang.String r0 = "PAYMENT_TYPE"
            java.lang.String r0 = X.DbU.A0l(r1, r0)
            X.QCn r0 = r2.A02(r6, r0)
            return r0
        L_0x06a7:
            X.RQX r6 = (X.RQX) r6
            X.S2Z r1 = new X.S2Z
            r1.<init>()
            java.lang.String r0 = r6.A02
            r1.A03 = r0
            java.lang.String r0 = r6.A01
            r1.A01 = r0
            r0 = 1
            r1.A04 = r0
            java.lang.String r0 = r6.A00
            r1.A02 = r0
            r0 = 15
            r1.A00 = r0
            X.Rws r0 = r1.A00()
            return r0
        L_0x06c6:
            X.SUj r6 = (X.SUj) r6
            java.lang.Object r0 = r15.A01
            X.QDE r0 = (X.QDE) r0
            X.Q2D r1 = r0.A01
            r0 = 15
            int r1 = r1.A03(r0)
            r2 = 0
            if (r1 == 0) goto L_0x06e1
            X.TQo r0 = new X.TQo
            r0.<init>(r1)
        L_0x06dc:
            X.SUj r0 = X.SUj.A0A(r2, r0)
            return r0
        L_0x06e1:
            boolean r0 = X.SUj.A0V(r6)
            if (r0 == 0) goto L_0x0704
            java.lang.Object r1 = r6.A01
            if (r1 == 0) goto L_0x06fc
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x06fc
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r1)
            X.SUj r0 = X.SUj.A09(r0)
            return r0
        L_0x06fc:
            r1 = 100
            X.TQo r0 = new X.TQo
            r0.<init>(r1)
            goto L_0x06dc
        L_0x0704:
            X.SUj r0 = X.SUj.A06(r6, r2)
            return r0
        L_0x0709:
            android.util.Pair r6 = (android.util.Pair) r6
            java.lang.Object r0 = r15.A01
            X.QCx r0 = (X.C7432QCx) r0
            java.lang.Object r2 = r6.first
            X.RQD r2 = (X.RQD) r2
            X.SSL r1 = r0.A01
            com.facebookpay.logging.FBPayLoggerData r0 = r0.A00
            X.2gB r2 = r1.A04(r2, r0)
            r1 = 1
            X.TPJ r0 = new X.TPJ
            r0.<init>(r1, r6, r15)
            X.2gB r0 = X.AnonymousClass72Y.A01(r2, r0)
            return r0
        L_0x0726:
            java.lang.Object r0 = r15.A01
            X.STY r0 = (X.STY) r0
            java.lang.String r6 = (java.lang.String) r6
            X.RRP r0 = r0.A06(r6)
            X.SHz r0 = r0.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TPM.invoke(java.lang.Object):java.lang.Object");
    }
}
