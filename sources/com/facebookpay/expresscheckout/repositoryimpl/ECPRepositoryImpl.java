package com.facebookpay.expresscheckout.repositoryimpl;

import X.2Fk;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass2Fj;
import X.AnonymousClass2gB;
import X.AnonymousClass7TE;
import X.C10253RpD;
import X.C10750RxU;
import X.C10900S0a;
import X.C11008S5e;
import X.C13301TUa;
import X.C298525tb;
import X.JTO;
import X.OV4;
import X.Pxh;
import X.QXO;
import X.S5d;
import X.SJ1;
import X.SUj;
import X.Stb;
import X.Stc;
import X.TUY;
import X.TUZ;
import android.util.LruCache;
import com.facebookpay.expresscheckout.api.executor.ECPCheckoutSetupMutationAPI;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

public final class ECPRepositoryImpl {
    public AnonymousClass2Fj A00 = JTO.A0K();
    public C10750RxU A01;
    public ArrayList A02 = AnonymousClass7TE.A1C();
    public final 2Fk A03;
    public final AnonymousClass2gB A04;
    public final C10900S0a A05 = new C10900S0a();
    public final OV4 A06 = new OV4();
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(TUY.A00);
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(TUZ.A00);
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(C13301TUa.A00);
    public final ECPCheckoutSetupMutationAPI A0A = new ECPCheckoutSetupMutationAPI();
    public final C10253RpD A0B = new C10253RpD();

    /* JADX WARNING: type inference failed for: r14v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(com.facebookpay.expresscheckout.models.CheckoutConfiguration r18, com.facebookpay.logging.LoggingPolicy r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.List r24, X.AnonymousClass4D7 r25) {
        /*
            r17 = this;
            r12 = 0
            r3 = 30
            r4 = r25
            boolean r0 = X.MEC.A03(r3, r4)
            r6 = r17
            if (r0 == 0) goto L_0x0077
            r14 = r4
            X.MEC r14 = (X.MEC) r14
            int r2 = r14.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0077
            int r2 = r2 - r1
            r14.A00 = r2
        L_0x001b:
            java.lang.Object r1 = r14.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r14.A00
            r15 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 != r15) goto L_0x00e1
            X.0eS.A00(r1)
        L_0x0029:
            X.SUj r1 = (X.SUj) r1
            X.SUj r4 = X.SUj.A08(r12)
            boolean r0 = X.SUj.A0V(r1)
            if (r0 == 0) goto L_0x00c3
            if (r1 == 0) goto L_0x00be
            goto L_0x007c
        L_0x0038:
            X.0eS.A00(r1)
            r9 = r21
            r11 = r22
            r10 = r23
            if (r23 == 0) goto L_0x0064
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0064
            X.OV4 r0 = r6.A06
            X.RyJ r3 = r0.A00(r9, r10)
            if (r3 == 0) goto L_0x0064
            X.QSl r2 = r3.A01
            r1 = 0
            java.lang.String r0 = "is_ecp_available"
            boolean r0 = r2.getCoercedBooleanField(r1, r0)
            if (r0 == 0) goto L_0x00e6
            if (r22 == 0) goto L_0x0064
            int r0 = r11.length()
            if (r0 != 0) goto L_0x00e6
        L_0x0064:
            r14.A00 = r15
            r5 = r18
            r7 = r19
            r8 = r20
            r13 = r24
            r16 = r15
            java.lang.Object r1 = A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r1 != r4) goto L_0x0029
            return r4
        L_0x0077:
            X.MEC r14 = X.MEC.A00(r6, r4, r3)
            goto L_0x001b
        L_0x007c:
            java.lang.Object r4 = r1.A01     // Catch:{ Exception -> 0x00ce }
            X.QXD r4 = (X.QXD) r4     // Catch:{ Exception -> 0x00ce }
            if (r4 == 0) goto L_0x00be
            X.QXl r0 = r4.A0E()     // Catch:{ Exception -> 0x00ce }
            if (r0 == 0) goto L_0x00be
            X.RyJ r3 = X.C11432SUd.A09(r0)     // Catch:{ Exception -> 0x00ce }
            X.QXl r0 = r4.A0E()     // Catch:{ Exception -> 0x00ce }
            if (r0 == 0) goto L_0x00bc
            X.QRU r2 = r0.A0J()     // Catch:{ Exception -> 0x00ce }
            if (r2 == 0) goto L_0x00bc
            java.lang.Class<X.QTR> r1 = X.QTR.class
            r0 = 819094042(0x30d2621a, float:1.5307393E-9)
            X.3lr r2 = r2.A01(r1, r0)     // Catch:{ Exception -> 0x00ce }
            X.QTR r2 = (X.QTR) r2     // Catch:{ Exception -> 0x00ce }
        L_0x00a3:
            X.QXl r1 = r4.A0E()     // Catch:{ Exception -> 0x00ce }
            if (r1 == 0) goto L_0x00ba
            java.lang.String r0 = "order_id"
            java.lang.String r1 = r1.A07(r0)     // Catch:{ Exception -> 0x00ce }
        L_0x00b0:
            com.facebookpay.expresscheckout.models.CheckoutAvailability r0 = new com.facebookpay.expresscheckout.models.CheckoutAvailability     // Catch:{ Exception -> 0x00ce }
            r0.<init>(r2, r3, r1)     // Catch:{ Exception -> 0x00ce }
            X.SUj r4 = X.SUj.A09(r0)     // Catch:{ Exception -> 0x00ce }
            return r4
        L_0x00ba:
            r1 = r12
            goto L_0x00b0
        L_0x00bc:
            r2 = r12
            goto L_0x00a3
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x00ce }
            throw r0     // Catch:{ Exception -> 0x00ce }
        L_0x00c3:
            boolean r0 = X.SUj.A0S(r1)
            if (r0 == 0) goto L_0x00e0
            X.SUj r4 = X.SUj.A0A(r12, r12)
            return r4
        L_0x00ce:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L_0x00d7
            java.lang.String r1 = ""
        L_0x00d7:
            X.RKx r0 = new X.RKx
            r0.<init>(r1)
            X.SUj r4 = X.SUj.A0A(r12, r0)
        L_0x00e0:
            return r4
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00e6:
            com.facebookpay.expresscheckout.models.CheckoutAvailability r0 = new com.facebookpay.expresscheckout.models.CheckoutAvailability
            r0.<init>(r12, r3, r12)
            X.SUj r4 = X.SUj.A09(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A04(com.facebookpay.expresscheckout.models.CheckoutConfiguration, com.facebookpay.logging.LoggingPolicy, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    public final boolean A06(String str) {
        SJ1 sj1 = new SJ1((OtcInput) null, str);
        if (!SUj.A0Q(((Stb) this.A09.getValue()).A01(sj1)) || !SUj.A0Q(Pxh.A0S(this.A07).A06(sj1)) || !SUj.A0Q(((Stc) this.A08.getValue()).A05(new SJ1((OtcInput) null, str)))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r18v2, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r21, com.facebookpay.logging.LoggingPolicy r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.List r28, X.AnonymousClass4D7 r29) {
        /*
            r14 = r25
            r1 = r27
            r4 = 10
            r7 = r29
            boolean r0 = X.ME0.A02(r4, r7)
            r6 = r21
            if (r0 == 0) goto L_0x01e3
            r5 = r7
            X.ME0 r5 = (X.ME0) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x01e3
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x001e:
            java.lang.Object r7 = r5.A05
            X.1Hj r4 = X.1Hj.A02
            int r2 = r5.A00
            r0 = 0
            r3 = 1
            if (r2 == 0) goto L_0x0170
            if (r2 != r3) goto L_0x01ea
            java.lang.Object r2 = r5.A04
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            java.lang.Object r1 = r5.A03
            java.lang.Object r14 = r5.A02
            java.lang.String r14 = (java.lang.String) r14
            X.0eS.A00(r7)
        L_0x0037:
            r4 = r7
            X.SUj r4 = (X.SUj) r4
            boolean r5 = X.SUj.A0V(r4)
            if (r5 == 0) goto L_0x00b8
            java.lang.Object r8 = r4.A01
            X.QXD r8 = (X.QXD) r8
            r11 = 0
            if (r8 == 0) goto L_0x0079
            X.QXl r10 = r8.A0E()
            if (r10 == 0) goto L_0x005c
            java.lang.Class<X.BSx> r9 = X.C42150BSx.class
            r7 = 9
            java.lang.String r6 = "error"
            r5 = -910544720(0xffffffffc9ba30b0, float:-1525270.0)
            X.3lr r5 = r10.getOptionalTreeField(r7, r6, r9, r5)
            if (r5 != 0) goto L_0x00b8
        L_0x005c:
            X.QXl r3 = r8.A0E()
            if (r3 == 0) goto L_0x0079
            X.QRN r6 = r3.A0F()
            if (r6 == 0) goto L_0x0079
            java.lang.Class<X.QSl> r5 = X.C7670QSl.class
            r3 = -633919572(0xffffffffda3727ac, float:-1.28883851E16)
            X.3lr r5 = r6.A01(r5, r3)
            if (r5 == 0) goto L_0x0079
            java.lang.String r3 = "is_ecp_available"
            boolean r0 = r5.getCoercedBooleanField(r0, r3)
        L_0x0079:
            X.Sto r7 = X.C51965G9l.A0g()
            if (r8 == 0) goto L_0x008c
            X.QXl r5 = r8.A0E()
            if (r5 == 0) goto L_0x008c
            java.lang.String r3 = "order_id"
            java.lang.String r11 = r5.A07(r3)
        L_0x008c:
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            if (r1 == 0) goto L_0x0098
            java.lang.String r3 = "product_session_id"
            r6.put(r3, r1)
        L_0x0098:
            r1 = 0
            X.0qQ.A0B(r2, r1)
            X.0Ae r3 = r7.A00
            java.lang.String r1 = "client_add_checkoutsetupmutation_success"
            X.0Aj r3 = X.C51969G9p.A0d(r3, r1)
            r1 = 14
            X.1Ln r5 = X.C51965G9l.A0U(r3, r1)
            X.TWO r1 = new X.TWO
            r8 = r1
            r9 = r2
            r10 = r14
            r12 = r6
            r13 = r0
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x00b4:
            X.C12411Sto.A03(r5, r2, r1)
            return r4
        L_0x00b8:
            r8 = 0
            java.lang.Object r7 = r4.A01
            X.QXD r7 = (X.QXD) r7
            r10 = 0
            if (r7 == 0) goto L_0x016c
            X.QXl r5 = r7.A0E()
            if (r5 == 0) goto L_0x016c
            X.QRN r9 = r5.A0F()
            if (r9 == 0) goto L_0x016c
            java.lang.Class<X.QSl> r6 = X.C7670QSl.class
            r5 = -633919572(0xffffffffda3727ac, float:-1.28883851E16)
            X.3lr r9 = r9.A01(r6, r5)
            if (r9 == 0) goto L_0x016d
            java.lang.String r5 = "ecp_availability_reason"
            java.lang.String r5 = r9.getOptionalStringField(r3, r5)
            if (r5 == 0) goto L_0x016d
            r8 = r5
            r13 = 1
        L_0x00e1:
            java.lang.Throwable r5 = r4.A02
            if (r5 != 0) goto L_0x016a
            if (r7 == 0) goto L_0x0126
            X.QXl r12 = r7.A0E()
            if (r12 == 0) goto L_0x0126
            java.lang.Class<X.BSx> r11 = X.C42150BSx.class
            r7 = 9
            java.lang.String r6 = "error"
            r5 = -910544720(0xffffffffc9ba30b0, float:-1525270.0)
            X.3lr r7 = r12.getOptionalTreeField(r7, r6, r11, r5)
            if (r7 == 0) goto L_0x0126
            java.lang.Class<X.BVE> r6 = X.BVE.class
            r5 = -1028067872(0xffffffffc2b8ede0, float:-92.4646)
            X.3lr r12 = r7.reinterpretRequired(r0, r6, r5)
            if (r12 == 0) goto L_0x0126
            java.lang.String r5 = "error_code"
            int r11 = r12.getCoercedIntField(r0, r5)
            java.lang.String r5 = "error_title"
            java.lang.String r7 = r12.A09(r5)
            java.lang.String r6 = ""
            if (r7 != 0) goto L_0x0118
            r7 = r6
        L_0x0118:
            java.lang.String r5 = "error_description"
            java.lang.String r5 = r12.getOptionalStringField(r3, r5)
            if (r5 == 0) goto L_0x0121
            r6 = r5
        L_0x0121:
            X.TQk r10 = new X.TQk
            r10.<init>(r11, r7, r6)
        L_0x0126:
            X.Sto r7 = X.C51965G9l.A0g()
            r12 = 1
            if (r9 == 0) goto L_0x0168
            java.lang.String r5 = "is_ecp_available"
            boolean r5 = r9.getCoercedBooleanField(r0, r5)
            if (r5 != r3) goto L_0x0168
        L_0x0135:
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            X.Pxj.A1Q(r10, r6)
            if (r13 == 0) goto L_0x0143
            java.lang.String r5 = "ecp_availability_reason"
            r6.put(r5, r8)
        L_0x0143:
            if (r1 == 0) goto L_0x014b
            java.lang.String r5 = "product_session_id"
            r6.put(r5, r1)
        L_0x014b:
            X.0qQ.A0B(r2, r0)
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_add_checkoutsetupmutation_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 12
            X.1Ln r5 = X.C51965G9l.A0U(r1, r0)
            X.IxI r1 = new X.IxI
            r7 = r1
            r8 = r2
            r9 = r6
            r10 = r14
            r11 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x00b4
        L_0x0168:
            r12 = 0
            goto L_0x0135
        L_0x016a:
            r10 = r5
            goto L_0x0126
        L_0x016c:
            r9 = r8
        L_0x016d:
            r13 = 0
            goto L_0x00e1
        L_0x0170:
            X.0eS.A00(r7)
            r13 = r24
            long r20 = java.lang.Long.parseLong(r13)
            X.0sl r18 = X.0sl.A00
            com.facebookpay.logging.LoggingContext r2 = new com.facebookpay.logging.LoggingContext
            r12 = r23
            r16 = r22
            r17 = r12
            r19 = r18
            r22 = r0
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20, r22)
            X.Sto r8 = X.C51965G9l.A0g()
            r15 = r26
            if (r26 == 0) goto L_0x0199
            int r7 = r15.length()
            if (r7 != 0) goto L_0x019b
        L_0x0199:
            r22 = 1
        L_0x019b:
            java.util.LinkedHashMap r9 = X.AnonymousClass7TE.A1H()
            if (r27 == 0) goto L_0x01a7
            java.lang.String r7 = "product_session_id"
            r9.put(r7, r1)
        L_0x01a7:
            X.0Ae r8 = r8.A00
            java.lang.String r7 = "client_add_checkoutsetupmutation_init"
            X.0Aj r8 = X.C51969G9p.A0d(r8, r7)
            r7 = 13
            X.1Ln r8 = X.C51965G9l.A0U(r8, r7)
            r21 = 6
            X.Pzd r7 = new X.Pzd
            r17 = r28
            r16 = r7
            r18 = r9
            r19 = r2
            r20 = r14
            r16.<init>((java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (java.lang.String) r20, (int) r21, (boolean) r22)
            X.C12411Sto.A03(r8, r2, r7)
            com.facebookpay.expresscheckout.api.executor.ECPCheckoutSetupMutationAPI r11 = r6.A0A
            X.AnonymousClass2E0.A00()
            java.lang.String r16 = "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969"
            r5.A01 = r6
            r5.A02 = r14
            r5.A03 = r1
            r5.A04 = r2
            r5.A00 = r3
            r18 = r5
            java.lang.Object r7 = r11.A00(r12, r13, r14, r15, r16, r17, r18)
            if (r7 != r4) goto L_0x0037
            return r4
        L_0x01e3:
            X.ME0 r5 = new X.ME0
            r5.<init>(r6, r7, r4)
            goto L_0x001e
        L_0x01ea:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A01(com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl, com.facebookpay.logging.LoggingPolicy, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    public final boolean A05() {
        QXO qxo;
        ImmutableList A0E;
        C10750RxU rxU = this.A01;
        if (rxU == null || (qxo = rxU.A00) == null || (A0E = qxo.A0E()) == null || !A0E.contains(C298525tb.META_BRANDING_FOOTER)) {
            return false;
        }
        return true;
    }

    public ECPRepositoryImpl() {
        AnonymousClass2gB A0M = Pxh.A0M();
        this.A04 = A0M;
        this.A03 = A0M;
    }

    public final C10750RxU A02(String str, String str2) {
        if (str2.length() == 0) {
            return null;
        }
        C10253RpD rpD = this.A0B;
        S5d s5d = new S5d(str, str2);
        LruCache lruCache = rpD.A00;
        C11008S5e s5e = (C11008S5e) lruCache.get(s5d);
        if (s5e == null) {
            return null;
        }
        if (s5e.A00 >= System.currentTimeMillis() - 14400000) {
            return s5e.A01;
        }
        lruCache.remove(s5d);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (((X.Stc) r3.A08.getValue()).A0C(r1, (X.RFC) null) != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(java.lang.String r4, java.util.Set r5, java.util.Set r6) {
        /*
            r3 = this;
            X.AnonymousClass7TG.A1N(r5, r6)
            r2 = 0
            X.SJ1 r1 = new X.SJ1
            r1.<init>(r2, r4)
            X.REn r0 = X.REn.UX_SHIPPING_ADDRESS
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x001f
            X.0eM r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            X.Stb r0 = (X.Stb) r0
            boolean r0 = r0.A06(r1)
            if (r0 != 0) goto L_0x006a
        L_0x001f:
            X.REi r0 = X.C8891REi.REQUEST_PAYER_NAME
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x0033
            X.0eM r0 = r3.A07
            X.Std r0 = X.Pxh.A0S(r0)
            boolean r0 = r0.A0E(r1)
            if (r0 != 0) goto L_0x006a
        L_0x0033:
            X.REi r0 = X.C8891REi.REQUEST_PAYER_EMAIL
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x0047
            X.0eM r0 = r3.A07
            X.Std r0 = X.Pxh.A0S(r0)
            boolean r0 = r0.A0D(r1)
            if (r0 != 0) goto L_0x006a
        L_0x0047:
            X.REi r0 = X.C8891REi.REQUEST_PAYER_PHONE
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x005b
            X.0eM r0 = r3.A07
            X.Std r0 = X.Pxh.A0S(r0)
            boolean r0 = r0.A0F(r1)
            if (r0 != 0) goto L_0x006a
        L_0x005b:
            X.0eM r0 = r3.A08
            java.lang.Object r0 = r0.getValue()
            X.Stc r0 = (X.Stc) r0
            boolean r1 = r0.A0C(r1, r2)
            r0 = 0
            if (r1 == 0) goto L_0x006b
        L_0x006a:
            r0 = 1
        L_0x006b:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A07(java.lang.String, java.util.Set, java.util.Set):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r29v1, types: [X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x023a, code lost:
        if (r11 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x023f, code lost:
        if (r11 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0244, code lost:
        if (r11 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0249, code lost:
        if (r11 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x024e, code lost:
        if (r11 != null) goto L_0x00d3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0280 A[SYNTHETIC, Splitter:B:126:0x0280] */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014f A[SYNTHETIC, Splitter:B:67:0x014f] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebookpay.expresscheckout.models.CheckoutConfiguration r20, com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r21, com.facebookpay.logging.LoggingPolicy r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.List r28, X.AnonymousClass4D7 r29, boolean r30, boolean r31) {
        /*
            r18 = r23
            r3 = r24
            r4 = r22
            r6 = r20
            r20 = r30
            r2 = r21
            r19 = r31
            r7 = 0
            r9 = r29
            boolean r0 = r9 instanceof X.C66127MDf
            if (r0 == 0) goto L_0x0274
            r8 = r9
            X.MDf r8 = (X.C66127MDf) r8
            int r0 = r8.A0A
            if (r0 != r7) goto L_0x0274
            int r5 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto L_0x0274
            int r5 = r5 - r1
            r8.A00 = r5
        L_0x0027:
            java.lang.Object r1 = r8.A06
            X.1Hj r5 = X.1Hj.A02
            int r0 = r8.A00
            r9 = 1
            if (r0 == 0) goto L_0x0252
            if (r0 != r9) goto L_0x0297
            boolean r0 = r8.A09
            r19 = r0
            boolean r0 = r8.A08
            r20 = r0
            java.lang.Object r6 = r8.A05
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r6 = (com.facebookpay.expresscheckout.models.CheckoutConfiguration) r6
            java.lang.Object r4 = r8.A04
            com.facebookpay.logging.LoggingPolicy r4 = (com.facebookpay.logging.LoggingPolicy) r4
            java.lang.Object r3 = r8.A03
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r8.A02
            r18 = r0
            r0 = r18
            java.lang.String r0 = (java.lang.String) r0
            r18 = r0
            java.lang.Object r2 = r8.A01
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r2 = (com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl) r2
            X.0eS.A00(r1)
        L_0x0057:
            r5 = r1
            X.SUj r5 = (X.SUj) r5
            boolean r0 = X.SUj.A0V(r5)
            if (r0 == 0) goto L_0x0113
            java.lang.Object r11 = r5.A01
            X.QXD r11 = (X.QXD) r11
            r8 = 0
            if (r11 == 0) goto L_0x0239
            X.QXl r0 = r11.A0E()
            if (r0 == 0) goto L_0x0239
            X.QXC r0 = r0.A0I()
            if (r0 == 0) goto L_0x0239
            X.QTJ r13 = r0.A0E()
        L_0x0077:
            X.QXl r0 = r11.A0E()
            if (r0 == 0) goto L_0x023e
            X.QRN r10 = r0.A0F()
            if (r10 == 0) goto L_0x023e
            java.lang.Class<X.QSl> r1 = X.C7670QSl.class
            r0 = -633919572(0xffffffffda3727ac, float:-1.28883851E16)
            X.3lr r14 = r10.A01(r1, r0)
            X.QSl r14 = (X.C7670QSl) r14
        L_0x008e:
            X.QXl r0 = r11.A0E()
            if (r0 == 0) goto L_0x0243
            X.QRL r10 = r0.A0E()
            if (r10 == 0) goto L_0x0243
            java.lang.Class<X.QXO> r1 = X.QXO.class
            r0 = -1333706087(0xffffffffb0814299, float:-9.404914E-10)
            X.3lr r12 = r10.A01(r1, r0)
            X.QXO r12 = (X.QXO) r12
        L_0x00a5:
            X.QXl r0 = r11.A0E()
            if (r0 == 0) goto L_0x0248
            X.QRT r10 = r0.A0H()
            if (r10 == 0) goto L_0x0248
            java.lang.Class<X.QTG> r1 = X.QTG.class
            r0 = 1367251747(0x517e9b23, float:6.8345278E10)
            X.3lr r10 = r10.A01(r1, r0)
            X.QTG r10 = (X.QTG) r10
        L_0x00bc:
            X.QXl r0 = r11.A0E()
            if (r0 == 0) goto L_0x024d
            X.QRS r15 = r0.A0G()
            if (r15 == 0) goto L_0x024d
            java.lang.Class<X.QT9> r1 = X.QT9.class
            r0 = -1503034778(0xffffffffa6698266, float:-8.1014837E-16)
            X.3lr r1 = r15.A01(r1, r0)
            X.QT9 r1 = (X.QT9) r1
        L_0x00d3:
            X.QXl r15 = r11.A0E()
            if (r15 == 0) goto L_0x00df
            java.lang.String r0 = "order_id"
            r15.getOptionalStringField(r7, r0)
        L_0x00df:
            X.RxU r0 = new X.RxU
            r21 = r0
            r22 = r12
            r23 = r14
            r24 = r1
            r25 = r10
            r26 = r13
            r21.<init>(r22, r23, r24, r25, r26)
            r2.A01 = r0
            if (r13 == 0) goto L_0x0236
            java.lang.String r0 = "strong_id__"
            java.lang.String r15 = r13.getOptionalStringField(r7, r0)
            if (r15 == 0) goto L_0x0104
            int r0 = r15.length()
            if (r0 == 0) goto L_0x0104
            r9 = 0
        L_0x0104:
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x0114
            java.lang.String r1 = "Server receiver_id cannot be null"
            X.TQk r0 = new X.TQk
            r0.<init>(r7, r1, r10)
            X.SUj r5 = X.SUj.A0A(r8, r0)
        L_0x0113:
            return r5
        L_0x0114:
            X.RxU r14 = r2.A01
            if (r14 == 0) goto L_0x013d
            X.RpD r0 = r2.A0B
            X.AnonymousClass7TF.A1H(r3, r15)
            android.util.LruCache r13 = r0.A00
            int r1 = r13.size()
            r0 = 20
            if (r1 != r0) goto L_0x012c
            r0 = 10
            r13.trimToSize(r0)
        L_0x012c:
            X.S5d r12 = new X.S5d
            r12.<init>(r3, r15)
            long r0 = java.lang.System.currentTimeMillis()
            X.S5e r9 = new X.S5e
            r9.<init>(r14, r0)
            r13.put(r12, r9)
        L_0x013d:
            if (r11 == 0) goto L_0x014a
            X.QXl r0 = r11.A0E()     // Catch:{ Exception -> 0x0285 }
            if (r0 == 0) goto L_0x014a
            X.RyJ r14 = X.C11432SUd.A09(r0)     // Catch:{ Exception -> 0x0285 }
            goto L_0x014b
        L_0x014a:
            r14 = r8
        L_0x014b:
            java.lang.String r17 = "Required value was null."
            if (r14 == 0) goto L_0x0280
            X.OV4 r0 = r2.A06     // Catch:{ Exception -> 0x0285 }
            boolean r16 = X.AnonymousClass7TF.A1U(r7, r3, r15)     // Catch:{ Exception -> 0x0285 }
            android.util.LruCache r13 = r0.A00     // Catch:{ Exception -> 0x0285 }
            int r1 = r13.size()     // Catch:{ Exception -> 0x0285 }
            r0 = 20
            if (r1 != r0) goto L_0x0164
            r0 = 10
            r13.trimToSize(r0)     // Catch:{ Exception -> 0x0285 }
        L_0x0164:
            X.S5c r12 = new X.S5c     // Catch:{ Exception -> 0x0285 }
            r12.<init>(r3, r15)     // Catch:{ Exception -> 0x0285 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0285 }
            X.ONN r9 = new X.ONN     // Catch:{ Exception -> 0x0285 }
            r9.<init>(r14, r0)     // Catch:{ Exception -> 0x0285 }
            r13.put(r12, r9)     // Catch:{ Exception -> 0x0285 }
            X.RxU r0 = r2.A01
            if (r0 == 0) goto L_0x0113
            X.QSl r1 = r0.A01
            if (r1 == 0) goto L_0x0113
            java.lang.String r0 = "is_ecp_available"
            boolean r0 = r1.getCoercedBooleanField(r7, r0)
            if (r0 == 0) goto L_0x0113
            X.RxU r9 = r2.A01
            if (r9 == 0) goto L_0x0233
            X.QXO r1 = r9.A00
        L_0x018b:
            if (r20 == 0) goto L_0x0113
            if (r19 == 0) goto L_0x0113
            if (r1 == 0) goto L_0x0113
            if (r9 == 0) goto L_0x0113
            X.QTJ r10 = r9.A04
            if (r10 == 0) goto L_0x027b
            java.lang.String r0 = "strong_id__"
            java.lang.String r25 = r10.getOptionalStringField(r7, r0)
            if (r25 == 0) goto L_0x027b
            boolean r27 = X.C11432SUd.A0M(r11)
            java.util.LinkedHashSet r0 = X.C11432SUd.A0H(r1)
            java.util.Set r7 = X.00k.A0j(r0)
            if (r6 == 0) goto L_0x01b3
            java.util.Set<X.REi> r0 = r6.A0I
            r7.addAll(r0)
        L_0x01b3:
            com.google.common.collect.ImmutableList r0 = r1.A0E()
            X.0qQ.A07(r0)
            java.util.LinkedHashSet r0 = X.C11432SUd.A0I(r0)
            java.util.Set r1 = X.00k.A0j(r0)
            if (r6 == 0) goto L_0x01c9
            java.util.Set<X.REn> r0 = r6.A0H
            r1.addAll(r0)
        L_0x01c9:
            boolean r0 = r2.A07(r3, r1, r7)
            if (r0 == 0) goto L_0x0230
            java.lang.String r26 = "NUX"
        L_0x01d1:
            r24 = r3
            r19 = r6
            r20 = r9
            r21 = r4
            r22 = r8
            r23 = r18
            java.util.ArrayList r0 = X.C11081S9b.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2.A02 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r27)
            X.RDz r6 = r5.A00
            java.lang.Throwable r4 = r5.A02
            X.RDz r0 = X.C8882RDz.SUCCESS
            if (r6 != r0) goto L_0x0228
            r0 = r16
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r0)
            if (r0 == 0) goto L_0x021b
            java.lang.String r4 = X.C51972G9s.A0n()
            java.lang.String r1 = "CARD"
            com.facebookpay.otc.models.OtcInput r0 = new com.facebookpay.otc.models.OtcInput
            r0.<init>(r4, r1)
            java.lang.String r13 = "NUX"
            r6 = r8
            r7 = r9
            r9 = r0
            r10 = r18
            r11 = r3
            r12 = r25
            r14 = r16
            X.C11081S9b.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.2gB r1 = r2.A04
            X.SUj r0 = X.SUj.A09(r4)
        L_0x0217:
            r1.A0B(r0)
            return r5
        L_0x021b:
            X.2gB r1 = r2.A04
            java.lang.String r0 = "OTC is not available"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            X.SUj r0 = X.SUj.A0A(r8, r0)
            goto L_0x0217
        L_0x0228:
            X.2gB r1 = r2.A04
            X.SUj r0 = new X.SUj
            r0.<init>(r6, r8, r4)
            goto L_0x0217
        L_0x0230:
            java.lang.String r26 = "PUX"
            goto L_0x01d1
        L_0x0233:
            r1 = 0
            goto L_0x018b
        L_0x0236:
            r15 = r8
            goto L_0x0104
        L_0x0239:
            r13 = r8
            if (r11 == 0) goto L_0x023e
            goto L_0x0077
        L_0x023e:
            r14 = r8
            if (r11 == 0) goto L_0x0243
            goto L_0x008e
        L_0x0243:
            r12 = r8
            if (r11 == 0) goto L_0x0248
            goto L_0x00a5
        L_0x0248:
            r10 = r8
            if (r11 == 0) goto L_0x024d
            goto L_0x00bc
        L_0x024d:
            r1 = r8
            if (r11 == 0) goto L_0x00df
            goto L_0x00d3
        L_0x0252:
            X.0eS.A00(r1)
            r8.A01 = r2
            r0 = r18
            r8.A02 = r0
            r8.A03 = r3
            r8.A04 = r4
            r8.A05 = r6
            r0 = r20
            r8.A08 = r0
            r0 = r19
            r8.A09 = r0
            r8.A00 = r9
            r29 = r8
            java.lang.Object r1 = A01(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r1 != r5) goto L_0x0057
            return r5
        L_0x0274:
            X.MDf r8 = new X.MDf
            r8.<init>(r2, r9)
            goto L_0x0027
        L_0x027b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0280:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)     // Catch:{ Exception -> 0x0285 }
            throw r0     // Catch:{ Exception -> 0x0285 }
        L_0x0285:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L_0x028d
            r1 = r10
        L_0x028d:
            X.TQk r0 = new X.TQk
            r0.<init>(r7, r1, r10)
            X.SUj r5 = X.SUj.A0A(r8, r0)
            return r5
        L_0x0297:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A00(com.facebookpay.expresscheckout.models.CheckoutConfiguration, com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl, com.facebookpay.logging.LoggingPolicy, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.4D7, boolean, boolean):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.QRO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: X.QRO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.QRO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.QRO} */
    /* JADX WARNING: type inference failed for: r25v0, types: [X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015c, code lost:
        r0 = (X.QTR) r2.A01(X.QTR.class, 819094042);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.facebookpay.expresscheckout.handler.ECPHandler r44, com.facebookpay.expresscheckout.models.ECPPaymentRequest r45, com.facebookpay.expresscheckout.models.TransactionInfo r46, java.lang.String r47, java.util.List r48, X.AnonymousClass4D7 r49, boolean r50) {
        /*
            r43 = this;
            r6 = r45
            r2 = r44
            r3 = r46
            r11 = 0
            r7 = r49
            boolean r0 = r7 instanceof X.MDP
            r5 = r43
            if (r0 == 0) goto L_0x00c4
            r13 = r7
            X.MDP r13 = (X.MDP) r13
            int r0 = r13.A08
            if (r0 != r11) goto L_0x00c4
            int r4 = r13.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x00c4
            int r4 = r4 - r1
            r13.A01 = r4
        L_0x0021:
            java.lang.Object r10 = r13.A07
            X.1Hj r4 = X.1Hj.A02
            int r0 = r13.A01
            r9 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0051
            if (r0 != r9) goto L_0x03ac
            int r7 = r13.A00
            java.lang.Object r12 = r13.A06
            X.0rm r12 = (X.0rm) r12
            java.lang.Object r3 = r13.A05
            java.lang.Object r2 = r13.A04
            com.facebookpay.expresscheckout.handler.ECPHandler r2 = (com.facebookpay.expresscheckout.handler.ECPHandler) r2
            java.lang.Object r6 = r13.A03
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r6 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r6
            java.lang.Object r5 = r13.A02
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r5 = (com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl) r5
            X.0eS.A00(r10)
        L_0x0044:
            X.SUj r10 = (X.SUj) r10
            boolean r0 = X.SUj.A0V(r10)
            if (r0 == 0) goto L_0x039c
            if (r3 != 0) goto L_0x00f5
            if (r10 == 0) goto L_0x00f5
            goto L_0x00cb
        L_0x0051:
            X.0eS.A00(r10)
            X.OV4 r1 = r5.A06
            java.lang.String r10 = r6.A08
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r14 = r6.A05
            if (r14 == 0) goto L_0x00c2
            java.lang.String r0 = r14.A02
        L_0x005e:
            X.RyJ r0 = r1.A00(r10, r0)
            if (r0 == 0) goto L_0x00bb
            X.2Fj r1 = r5.A00
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.SQ0.A01(r0, r6, r3)
            X.SUj.A0K(r1, r0)
            r7 = 1
        L_0x006e:
            java.lang.String r1 = r6.A07
            if (r14 == 0) goto L_0x0082
            java.lang.String r0 = r14.A02
            if (r0 == 0) goto L_0x0082
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0082
            if (r1 == 0) goto L_0x0082
            if (r50 != 0) goto L_0x03b1
            if (r46 != 0) goto L_0x03b1
        L_0x0082:
            X.0rm r12 = X.C51965G9l.A11()
            java.lang.String r15 = r6.A0A
            if (r14 == 0) goto L_0x00b9
            java.lang.String r0 = r14.A02
        L_0x008c:
            r13.A02 = r5
            r13.A03 = r6
            r13.A04 = r2
            r13.A05 = r3
            r13.A06 = r12
            r13.A00 = r7
            r13.A01 = r9
            r24 = r48
            r23 = r47
            r16 = r8
            r17 = r5
            r18 = r8
            r19 = r15
            r20 = r10
            r21 = r0
            r22 = r1
            r25 = r13
            r26 = r9
            r27 = r11
            java.lang.Object r10 = A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r10 != r4) goto L_0x0044
            return r4
        L_0x00b9:
            r0 = r8
            goto L_0x008c
        L_0x00bb:
            X.2Fj r0 = r5.A00
            X.SUj.A0K(r0, r6)
            r7 = 0
            goto L_0x006e
        L_0x00c2:
            r0 = r8
            goto L_0x005e
        L_0x00c4:
            X.MDP r13 = new X.MDP
            r13.<init>(r5, r7, r11)
            goto L_0x0021
        L_0x00cb:
            java.lang.Object r0 = r10.A01     // Catch:{ Exception -> 0x0399 }
            X.QXD r0 = (X.QXD) r0     // Catch:{ Exception -> 0x0399 }
            if (r0 == 0) goto L_0x00f5
            X.QXl r0 = r0.A0E()     // Catch:{ Exception -> 0x0399 }
            if (r0 == 0) goto L_0x00f5
            X.QRU r4 = r0.A0J()     // Catch:{ Exception -> 0x0399 }
            if (r4 == 0) goto L_0x00f5
            java.lang.Class<X.QTR> r1 = X.QTR.class
            r0 = 819094042(0x30d2621a, float:1.5307393E-9)
            X.3lr r0 = r4.A01(r1, r0)     // Catch:{ Exception -> 0x0399 }
            X.QTR r0 = (X.QTR) r0     // Catch:{ Exception -> 0x0399 }
            if (r0 == 0) goto L_0x00f5
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.C11432SUd.A0C(r0)     // Catch:{ Exception -> 0x0399 }
            X.SUj r0 = X.SUj.A09(r0)     // Catch:{ Exception -> 0x0399 }
            r2.Ep6(r0)     // Catch:{ Exception -> 0x0399 }
        L_0x00f5:
            if (r7 == 0) goto L_0x0100
            if (r3 == 0) goto L_0x0100
            java.lang.String r0 = r6.A07     // Catch:{ Exception -> 0x0399 }
            if (r0 == 0) goto L_0x0100
            r4 = 0
            goto L_0x03c9
        L_0x0100:
            java.lang.Object r0 = r10.A01     // Catch:{ Exception -> 0x0399 }
            X.QXD r0 = (X.QXD) r0     // Catch:{ Exception -> 0x0399 }
            if (r0 == 0) goto L_0x0389
            X.QXl r13 = r0.A0E()     // Catch:{ Exception -> 0x0399 }
            r4 = 0
            if (r13 == 0) goto L_0x0389
            X.0qQ.A0B(r6, r9)     // Catch:{ Exception -> 0x03b3 }
            X.QXC r0 = r13.A0I()     // Catch:{ Exception -> 0x03b3 }
            r14 = 0
            if (r0 == 0) goto L_0x016e
            X.QTJ r1 = r0.A0E()     // Catch:{ Exception -> 0x03b3 }
            if (r1 == 0) goto L_0x016e
            java.lang.String r0 = "strong_id__"
            java.lang.String r15 = r1.getOptionalStringField(r11, r0)     // Catch:{ Exception -> 0x03b3 }
        L_0x0124:
            X.QXC r0 = r13.A0I()     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x016c
            X.QTJ r1 = r0.A0E()     // Catch:{ Exception -> 0x03b3 }
            if (r1 == 0) goto L_0x016c
            java.lang.String r0 = "name"
            java.lang.String r3 = r1.getOptionalStringField(r9, r0)     // Catch:{ Exception -> 0x03b3 }
        L_0x0137:
            X.QXC r0 = r13.A0I()     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x016a
            X.QTJ r1 = r0.A0E()     // Catch:{ Exception -> 0x03b3 }
            if (r1 == 0) goto L_0x016a
            java.lang.String r0 = "image"
            java.lang.String r2 = r1.A09(r0)     // Catch:{ Exception -> 0x03b3 }
        L_0x0149:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r6.A05     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x0168
            java.lang.String r1 = r0.A00     // Catch:{ Exception -> 0x03b3 }
        L_0x014f:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r19 = new com.facebookpay.expresscheckout.models.PaymentReceiverInfo     // Catch:{ Exception -> 0x03b3 }
            r0 = r19
            r0.<init>(r15, r3, r2, r1)     // Catch:{ Exception -> 0x03b3 }
            X.QRU r2 = r13.A0J()     // Catch:{ Exception -> 0x03b3 }
            if (r2 == 0) goto L_0x0173
            java.lang.Class<X.QTR> r1 = X.QTR.class
            r0 = 819094042(0x30d2621a, float:1.5307393E-9)
            X.3lr r0 = r2.A01(r1, r0)     // Catch:{ Exception -> 0x03b3 }
            X.QTR r0 = (X.QTR) r0     // Catch:{ Exception -> 0x03b3 }
            goto L_0x0170
        L_0x0168:
            r1 = r14
            goto L_0x014f
        L_0x016a:
            r2 = r14
            goto L_0x0149
        L_0x016c:
            r3 = r14
            goto L_0x0137
        L_0x016e:
            r15 = r14
            goto L_0x0124
        L_0x0170:
            if (r0 == 0) goto L_0x0173
            goto L_0x0176
        L_0x0173:
            r18 = r8
            goto L_0x017a
        L_0x0176:
            com.facebookpay.expresscheckout.models.TransactionInfo r18 = X.C11432SUd.A0C(r0)     // Catch:{ Exception -> 0x03b3 }
        L_0x017a:
            X.QRL r2 = r13.A0E()     // Catch:{ Exception -> 0x03b3 }
            if (r2 == 0) goto L_0x01b4
            java.lang.Class<X.QXO> r1 = X.QXO.class
            r0 = -1333706087(0xffffffffb0814299, float:-9.404914E-10)
            X.3lr r0 = r2.A01(r1, r0)     // Catch:{ Exception -> 0x03b3 }
            X.QXO r0 = (X.QXO) r0     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x01b4
            com.google.common.collect.ImmutableList r0 = r0.A0E()     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x01b4
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x03b3 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x03b3 }
        L_0x019b:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x03b3 }
            X.5tb r0 = (X.C298525tb) r0     // Catch:{ Exception -> 0x03b3 }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x03b3 }
            X.REn r0 = X.C11432SUd.A05(r0)     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x019b
            r2.add(r0)     // Catch:{ Exception -> 0x03b3 }
            goto L_0x019b
        L_0x01b4:
            r15 = r14
            goto L_0x01ba
        L_0x01b6:
            java.util.Set r15 = X.00k.A0k(r2)     // Catch:{ Exception -> 0x03b3 }
        L_0x01ba:
            X.QRL r2 = r13.A0E()     // Catch:{ Exception -> 0x03b3 }
            if (r2 == 0) goto L_0x01fa
            java.lang.Class<X.QXO> r1 = X.QXO.class
            r0 = -1333706087(0xffffffffb0814299, float:-9.404914E-10)
            X.3lr r3 = r2.A01(r1, r0)     // Catch:{ Exception -> 0x03b3 }
            X.QXO r3 = (X.QXO) r3     // Catch:{ Exception -> 0x03b3 }
            if (r3 == 0) goto L_0x01fa
            X.RFw r2 = X.C8928RFw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ Exception -> 0x03b3 }
            r1 = 3
            java.lang.String r0 = "request_fields"
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedEnumListField(r1, r0, r2)     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x01fa
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x03b3 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x03b3 }
        L_0x01e1:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x03b3 }
            X.RFw r0 = (X.C8928RFw) r0     // Catch:{ Exception -> 0x03b3 }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x03b3 }
            X.REi r0 = X.C11432SUd.A06(r0)     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x01e1
            r1.add(r0)     // Catch:{ Exception -> 0x03b3 }
            goto L_0x01e1
        L_0x01fa:
            r17 = r14
            goto L_0x0201
        L_0x01fd:
            java.util.Set r17 = X.00k.A0k(r1)     // Catch:{ Exception -> 0x03b3 }
        L_0x0201:
            java.lang.Class<X.QRQ> r3 = X.QRQ.class
            r2 = 10
            java.lang.String r1 = "embedded_bloks_apm_buttons"
            r0 = -803301311(0xffffffffd01e9841, float:-1.0643113E10)
            X.3lr r3 = r13.getOptionalTreeField(r2, r1, r3, r0)     // Catch:{ Exception -> 0x03b3 }
            X.QRQ r3 = (X.QRQ) r3     // Catch:{ Exception -> 0x03b3 }
            if (r3 == 0) goto L_0x023a
            java.lang.Class<X.QRP> r2 = X.QRP.class
            java.lang.String r1 = "component"
            r0 = 356680169(0x154281e9, float:3.928047E-26)
            X.3lr r2 = r3.getOptionalTreeField(r11, r1, r2, r0)     // Catch:{ Exception -> 0x03b3 }
            X.QRP r2 = (X.QRP) r2     // Catch:{ Exception -> 0x03b3 }
            if (r2 == 0) goto L_0x023a
            java.lang.Class<X.QXm> r1 = X.C7801QXm.class
            r0 = -708877377(0xffffffffd5bf63bf, float:-2.63043909E13)
            X.3lr r0 = r2.reinterpretRequired(r11, r1, r0)     // Catch:{ Exception -> 0x03b3 }
            X.TlT r0 = (X.C13925TlT) r0     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x023a
            com.facebookpay.apm.APMConfigurationImpl r3 = new com.facebookpay.apm.APMConfigurationImpl     // Catch:{ Exception -> 0x03b3 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x03b3 }
        L_0x0233:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r6.A01     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r16 = "Required value was null."
            if (r0 == 0) goto L_0x025a
            goto L_0x023c
        L_0x023a:
            r3 = r14
            goto L_0x0233
        L_0x023c:
            if (r3 != 0) goto L_0x0240
            com.facebookpay.expresscheckout.models.APMConfiguration r3 = r0.A01     // Catch:{ Exception -> 0x03b3 }
        L_0x0240:
            java.util.Set<X.REn> r2 = r0.A0H     // Catch:{ Exception -> 0x03b3 }
            X.0sl r1 = X.0sl.A00     // Catch:{ Exception -> 0x03b3 }
            java.util.Set r2 = X.00k.A0n(r1, r2)     // Catch:{ Exception -> 0x03b3 }
            if (r15 != 0) goto L_0x024b
            r15 = r1
        L_0x024b:
            java.util.Set r2 = X.00k.A0n(r2, r15)     // Catch:{ Exception -> 0x03b3 }
            java.util.Set<X.REi> r15 = r0.A0I     // Catch:{ Exception -> 0x03b3 }
            java.util.Set r15 = X.00k.A0n(r1, r15)     // Catch:{ Exception -> 0x03b3 }
            if (r17 != 0) goto L_0x025d
            r17 = r1
            goto L_0x025d
        L_0x025a:
            r20 = r14
            goto L_0x02c1
        L_0x025d:
            r1 = r17
            java.util.Set r1 = X.00k.A0n(r15, r1)     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r15 = r0.A0G     // Catch:{ Exception -> 0x03b3 }
            r34 = r15
            java.lang.String r15 = r0.A0E     // Catch:{ Exception -> 0x03b3 }
            r35 = r15
            boolean r15 = r0.A0J     // Catch:{ Exception -> 0x03b3 }
            r40 = r15
            X.RGk r15 = r0.A02     // Catch:{ Exception -> 0x03b3 }
            r22 = r15
            X.RGk r15 = r0.A03     // Catch:{ Exception -> 0x03b3 }
            r23 = r15
            java.lang.Boolean r15 = r0.A09     // Catch:{ Exception -> 0x03b3 }
            r24 = r15
            java.lang.Boolean r15 = r0.A0A     // Catch:{ Exception -> 0x03b3 }
            r25 = r15
            java.lang.Boolean r15 = r0.A05     // Catch:{ Exception -> 0x03b3 }
            r26 = r15
            java.lang.Boolean r15 = r0.A0C     // Catch:{ Exception -> 0x03b3 }
            r27 = r15
            java.lang.String r15 = r0.A0F     // Catch:{ Exception -> 0x03b3 }
            r36 = r15
            java.lang.Boolean r15 = r0.A04     // Catch:{ Exception -> 0x03b3 }
            r28 = r15
            java.lang.Boolean r15 = r0.A06     // Catch:{ Exception -> 0x03b3 }
            r29 = r15
            java.lang.Integer r15 = r0.A0D     // Catch:{ Exception -> 0x03b3 }
            r33 = r15
            java.lang.Boolean r15 = r0.A08     // Catch:{ Exception -> 0x03b3 }
            r30 = r15
            int r15 = r0.A00     // Catch:{ Exception -> 0x03b3 }
            r39 = r15
            boolean r15 = r0.A0K     // Catch:{ Exception -> 0x03b3 }
            r21 = r15
            java.lang.Boolean r15 = r0.A07     // Catch:{ Exception -> 0x03b3 }
            r17 = r15
            boolean r15 = r0.A0L     // Catch:{ Exception -> 0x03b3 }
            java.lang.Boolean r0 = r0.A0B     // Catch:{ Exception -> 0x03b3 }
            X.AnonymousClass7TF.A1B(r2, r9, r1)     // Catch:{ Exception -> 0x03b3 }
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r20 = new com.facebookpay.expresscheckout.models.CheckoutConfiguration     // Catch:{ Exception -> 0x03b3 }
            r31 = r17
            r32 = r0
            r37 = r2
            r38 = r1
            r41 = r21
            r42 = r15
            r21 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x03b3 }
        L_0x02c1:
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r3 = r6.A03     // Catch:{ Exception -> 0x03b3 }
            if (r3 == 0) goto L_0x02c9
            com.facebookpay.common.models.CurrencyAmount r0 = r3.A00     // Catch:{ Exception -> 0x03b3 }
            if (r0 != 0) goto L_0x02ed
        L_0x02c9:
            if (r18 == 0) goto L_0x02ed
            X.QRT r2 = r13.A0H()     // Catch:{ Exception -> 0x03b3 }
            if (r2 == 0) goto L_0x031a
            java.lang.Class<X.QTG> r1 = X.QTG.class
            r0 = 1367251747(0x517e9b23, float:6.8345278E10)
            X.3lr r2 = r2.A01(r1, r0)     // Catch:{ Exception -> 0x03b3 }
            X.QTG r2 = (X.QTG) r2     // Catch:{ Exception -> 0x03b3 }
            if (r2 == 0) goto L_0x031a
            java.lang.String r0 = "order_id"
            java.lang.String r1 = r13.getOptionalStringField(r11, r0)     // Catch:{ Exception -> 0x03b3 }
            if (r1 == 0) goto L_0x0384
            r0 = r18
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r3 = X.C11432SUd.A0A(r2, r0, r1)     // Catch:{ Exception -> 0x03b3 }
        L_0x02ed:
            java.lang.Class<X.QRO> r15 = X.QRO.class
            r2 = 11
            java.lang.String r1 = "ecp_custom_fields"
            r0 = 516679119(0x1ecbe5cf, float:2.1588508E-20)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r13, r15, r1, r2, r0)     // Catch:{ Exception -> 0x03b3 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ Exception -> 0x03b3 }
        L_0x02fe:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x031d
            java.lang.Object r15 = r16.next()     // Catch:{ Exception -> 0x03b3 }
            r2 = r15
            X.QRO r2 = (X.QRO) r2     // Catch:{ Exception -> 0x03b3 }
            X.RGa r1 = X.C8932RGa.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r0 = "key"
            java.lang.Enum r1 = r2.getOptionalEnumField(r11, r0, r1)     // Catch:{ Exception -> 0x03b3 }
            X.RGa r1 = (X.C8932RGa) r1     // Catch:{ Exception -> 0x03b3 }
            X.RGa r0 = X.C8932RGa.DEVELOPER_TOS_URI     // Catch:{ Exception -> 0x03b3 }
            if (r1 != r0) goto L_0x02fe
            goto L_0x031c
        L_0x031a:
            r3 = r14
            goto L_0x02ed
        L_0x031c:
            r14 = r15
        L_0x031d:
            X.QRO r14 = (X.QRO) r14     // Catch:{ Exception -> 0x03b3 }
            if (r14 == 0) goto L_0x0330
            java.lang.String r0 = "value"
            java.lang.String r1 = r14.getOptionalStringField(r9, r0)     // Catch:{ Exception -> 0x03b3 }
            if (r1 == 0) goto L_0x0330
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r6.A04     // Catch:{ Exception -> 0x03b3 }
            com.facebookpay.expresscheckout.models.ItemDetails r0 = r0.A09     // Catch:{ Exception -> 0x03b3 }
            r0.A00 = r1     // Catch:{ Exception -> 0x03b3 }
        L_0x0330:
            java.lang.String r0 = r6.A0A     // Catch:{ Exception -> 0x03b3 }
            r17 = r0
            java.lang.String r0 = r6.A08     // Catch:{ Exception -> 0x03b3 }
            r16 = r0
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r15 = r6.A04     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r0 = "order_id"
            java.lang.String r31 = r13.getOptionalStringField(r11, r0)     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r14 = r6.A09     // Catch:{ Exception -> 0x03b3 }
            int r1 = r6.A00     // Catch:{ Exception -> 0x03b3 }
            X.QRS r13 = r13.A0G()     // Catch:{ Exception -> 0x03b3 }
            if (r13 == 0) goto L_0x035e
            java.lang.Class<X.QT9> r2 = X.QT9.class
            r0 = -1503034778(0xffffffffa6698266, float:-8.1014837E-16)
            X.3lr r0 = r13.A01(r2, r0)     // Catch:{ Exception -> 0x03b3 }
            X.QT9 r0 = (X.QT9) r0     // Catch:{ Exception -> 0x03b3 }
            if (r0 == 0) goto L_0x035e
            com.facebookpay.logging.LoggingPolicy r2 = X.C11432SUd.A0E(r0)     // Catch:{ Exception -> 0x03b3 }
            if (r2 != 0) goto L_0x0360
        L_0x035e:
            com.facebookpay.logging.LoggingPolicy r2 = r6.A06     // Catch:{ Exception -> 0x03b3 }
        L_0x0360:
            com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration r0 = r6.A02     // Catch:{ Exception -> 0x03b3 }
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r21 = new com.facebookpay.expresscheckout.models.ECPPaymentRequest     // Catch:{ Exception -> 0x03b3 }
            r24 = r3
            r25 = r15
            r26 = r19
            r27 = r2
            r28 = r17
            r29 = r16
            r30 = r14
            r32 = r1
            r33 = r11
            r23 = r0
            r22 = r20
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ Exception -> 0x03b3 }
            X.SUj r0 = X.SUj.A09(r21)     // Catch:{ Exception -> 0x03b3 }
            r12.A00 = r0     // Catch:{ Exception -> 0x03b3 }
            goto L_0x03c9
        L_0x0384:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)     // Catch:{ Exception -> 0x03b3 }
            throw r0     // Catch:{ Exception -> 0x03b3 }
        L_0x0389:
            r4 = 0
            java.lang.String r1 = "payment request null"
            X.RKx r0 = new X.RKx     // Catch:{ Exception -> 0x03b3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x03b3 }
            X.SUj r0 = X.SUj.A0A(r8, r0)     // Catch:{ Exception -> 0x03b3 }
            r12.A00 = r0     // Catch:{ Exception -> 0x03b3 }
            goto L_0x03c9
        L_0x0399:
            r0 = move-exception
            r4 = 0
            goto L_0x03b4
        L_0x039c:
            r4 = 0
            boolean r0 = X.SUj.A0S(r10)
            if (r0 == 0) goto L_0x03c9
            java.lang.Object r0 = r12.A00
            if (r0 != 0) goto L_0x03c7
            X.SUj r0 = X.SUj.A0A(r8, r8)
            goto L_0x03c7
        L_0x03ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03b1:
            r4 = r8
            goto L_0x03fd
        L_0x03b3:
            r0 = move-exception
        L_0x03b4:
            if (r7 != 0) goto L_0x03c9
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L_0x03be
            java.lang.String r1 = ""
        L_0x03be:
            X.RKx r0 = new X.RKx
            r0.<init>(r1)
            X.SUj r0 = X.SUj.A0A(r8, r0)
        L_0x03c7:
            r12.A00 = r0
        L_0x03c9:
            java.lang.Object r1 = r12.A00
            if (r1 == 0) goto L_0x03d2
            X.2Fj r0 = r5.A00
            r0.A0B(r1)
        L_0x03d2:
            boolean r0 = X.SUj.A0S(r10)
            if (r0 != 0) goto L_0x040c
            java.lang.Object r0 = r10.A01
            X.QXD r0 = (X.QXD) r0
            if (r0 == 0) goto L_0x040c
            X.QXl r0 = r0.A0E()
            if (r0 == 0) goto L_0x040c
            X.QRN r2 = r0.A0F()
            if (r2 == 0) goto L_0x040c
            java.lang.Class<X.QSl> r1 = X.C7670QSl.class
            r0 = -633919572(0xffffffffda3727ac, float:-1.28883851E16)
            X.3lr r1 = r2.A01(r1, r0)
            if (r1 == 0) goto L_0x040c
            java.lang.String r0 = "is_ecp_available"
            boolean r0 = r1.getCoercedBooleanField(r11, r0)
            if (r0 != r9) goto L_0x040c
        L_0x03fd:
            X.2Fj r0 = r5.A00
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x0407
            java.lang.Object r4 = r0.A01
        L_0x0407:
            X.SUj r4 = X.SUj.A09(r4)
            return r4
        L_0x040c:
            java.lang.Throwable r0 = r10.A02
            X.SUj r4 = X.SUj.A0A(r6, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A03(com.facebookpay.expresscheckout.handler.ECPHandler, com.facebookpay.expresscheckout.models.ECPPaymentRequest, com.facebookpay.expresscheckout.models.TransactionInfo, java.lang.String, java.util.List, X.4D7, boolean):java.lang.Object");
    }
}
