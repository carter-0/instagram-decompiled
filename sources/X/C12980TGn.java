package X;

/* renamed from: X.TGn  reason: case insensitive filesystem */
public final class C12980TGn implements Runnable {
    public final /* synthetic */ C12435SuM A00;
    public final /* synthetic */ String A01;

    public C12980TGn(C12435SuM suM, String str) {
        this.A01 = str;
        this.A00 = suM;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0120, code lost:
        if (r8.contains(r11.name()) != false) goto L_0x0122;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            com.facebookpay.offsite.models.message.GsonUtils r1 = com.facebookpay.offsite.models.message.GsonUtils.INSTANCE
            r2 = r23
            java.lang.String r0 = r2.A01
            com.facebookpay.offsite.models.message.PaymentHandledRequest r4 = r1.getToOffsitePaymentHandledMsg(r0)
            X.SuM r8 = r2.A00
            X.0eM r0 = r8.A07
            java.lang.Object r5 = r0.getValue()
            com.facebookpay.offsite.base.CheckoutHandler r5 = (com.facebookpay.offsite.base.CheckoutHandler) r5
            r3 = 0
            X.0qQ.A0B(r4, r3)
            X.Q6J r7 = r5.A04
            r13 = 0
            if (r7 == 0) goto L_0x01f0
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            java.util.Map r0 = r5.A0F
            r2.putAll(r0)
            long r0 = r4.timeStamp
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "REQUEST_TIMESTAMP"
            r2.put(r0, r1)
            X.2Fj r9 = r5.A0P
            java.lang.Object r0 = r9.A02()
            com.facebookpay.offsite.models.message.PaymentResponseWithAdditionalData r0 = (com.facebookpay.offsite.models.message.PaymentResponseWithAdditionalData) r0
            if (r0 == 0) goto L_0x0054
            com.facebookpay.offsite.models.message.PaymentResponse r0 = r0.paymentResponse
            if (r0 == 0) goto L_0x0054
            com.facebookpay.offsite.models.message.PaymentResponseContent r0 = r0.content
            if (r0 == 0) goto L_0x0054
            com.facebookpay.offsite.models.message.PaymentContainer r0 = r0.container
            if (r0 == 0) goto L_0x0054
            com.facebookpay.offsite.models.message.PaymentContainerType r0 = r0.containerType
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r0.getType()
            java.lang.String r0 = "CONTAINER_TYPE"
            r2.put(r0, r1)
        L_0x0054:
            com.facebookpay.offsite.models.message.PaymentAuthorizationResult r6 = r4.content
            java.lang.String r10 = r5.A08
            X.0qQ.A0B(r6, r3)
            com.facebookpay.offsite.models.message.AuthorizationState r0 = r6.authorizationState
            int r11 = r0.ordinal()
            r1 = 0
            if (r11 == r3) goto L_0x0088
            r0 = 2
            if (r11 == r0) goto L_0x0088
            com.facebookpay.offsite.models.message.PaymentDataError r0 = r6.error
            if (r0 == 0) goto L_0x0204
            com.facebookpay.offsite.models.message.PaymentDataErrorReason r11 = r0.reason
            if (r11 == 0) goto L_0x0204
            r0 = 13
            java.lang.Integer[] r12 = X.AnonymousClass05K.A00(r0)
            int r9 = r12.length
            java.util.ArrayList r8 = X.DbS.A0v(r9)
        L_0x007a:
            if (r3 >= r9) goto L_0x0118
            r0 = r12[r3]
            java.lang.String r0 = X.C11297SKg.A02(r0)
            r8.add(r0)
            int r3 = r3 + 1
            goto L_0x007a
        L_0x0088:
            com.facebookpay.offsite.models.message.PaymentAuthorizationResult r0 = r4.content
            com.facebookpay.offsite.models.message.AuthorizationState r0 = r0.authorizationState
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0108
            r0 = 2
            if (r1 != r0) goto L_0x01f0
            java.lang.Object r0 = r9.A02()
            com.facebookpay.offsite.models.message.PaymentResponseWithAdditionalData r0 = (com.facebookpay.offsite.models.message.PaymentResponseWithAdditionalData) r0
            if (r0 == 0) goto L_0x00cd
            com.facebookpay.offsite.models.message.PaymentResponse r0 = r0.paymentResponse
            if (r0 == 0) goto L_0x00cd
            com.facebookpay.offsite.models.message.PaymentResponseContent r0 = r0.content
            if (r0 == 0) goto L_0x00cd
            com.facebookpay.offsite.models.message.PaymentContainer r0 = r0.container
            if (r0 == 0) goto L_0x00cd
            com.facebookpay.offsite.models.message.PaymentContainerType r1 = r0.containerType
        L_0x00ab:
            com.facebookpay.offsite.models.message.PaymentContainerType r0 = com.facebookpay.offsite.models.message.PaymentContainerType.PAYPAL_OTC_V1
            if (r1 == r0) goto L_0x00cf
            java.util.concurrent.atomic.AtomicReference r0 = r5.A0V
            java.lang.Object r0 = r0.get()
            X.0qQ.A07(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = "INTERNAL_ERROR"
            r8 = r13
            r9 = r13
            r10 = r13
            r6 = r0
            com.facebookpay.offsite.base.CheckoutHandler.A05(r5, r6, r7, r8, r9, r10)
            X.2Fj r1 = r5.A0Q
            X.0gF r0 = X.C60340gF.A00
            X.SUj r0 = X.SUj.A0A(r0, r13)
            goto L_0x01ed
        L_0x00cd:
            r1 = r13
            goto L_0x00ab
        L_0x00cf:
            java.lang.String r3 = r5.A09
            if (r3 == 0) goto L_0x00eb
            X.S7g r0 = com.facebookpay.offsite.base.CheckoutHandler.A00(r5)
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r2 = r0.A00
            if (r2 == 0) goto L_0x00eb
            X.SSt r1 = X.C11418SSt.A01
            java.lang.String r0 = com.facebookpay.offsite.base.CheckoutHandler.A02(r5)
            java.util.LinkedHashMap r1 = r1.A04(r2, r0, r3, r13)
            java.lang.String r0 = "submit_payment_container_success"
            com.facebookpay.offsite.base.CheckoutHandler.A06(r5, r0, r1)
        L_0x00eb:
            r9.A0B(r13)
            X.2Fj r3 = r5.A0Q
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.S7g r0 = com.facebookpay.offsite.base.CheckoutHandler.A00(r5)
            java.lang.String r1 = r0.A07
            com.facebookpay.expresscheckout.models.PaymentHandledResponseData r0 = new com.facebookpay.expresscheckout.models.PaymentHandledResponseData
            r0.<init>(r2, r1)
            X.SUj.A0K(r3, r0)
            androidx.fragment.app.FragmentActivity r1 = r8.A02
            X.2gO r0 = r8.A04
            r9.A06(r1, r0)
            return
        L_0x0108:
            X.REu r0 = X.C8902REu.CLIENT_LOAD_OFFSITEPAYMENTHANDLED_SUCCESS
            r5.A0H(r0, r2)
            X.2Fj r1 = r5.A0Q
            X.0gF r0 = X.C60340gF.A00
            X.SUj.A0K(r1, r0)
            com.facebookpay.offsite.base.CheckoutHandler.A04(r5)
            return
        L_0x0118:
            java.lang.String r0 = r11.name()
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0204
        L_0x0122:
            java.lang.String r0 = r11.name()
            java.lang.Integer r3 = X.C11297SKg.A00(r0)
            com.facebookpay.offsite.models.message.PaymentDataError r0 = r6.error
            if (r0 == 0) goto L_0x0130
            java.lang.String r1 = r0.message
        L_0x0130:
            int r0 = r3.intValue()
            switch(r0) {
                case 2: goto L_0x01ff;
                case 3: goto L_0x0137;
                case 4: goto L_0x0137;
                case 5: goto L_0x0137;
                case 6: goto L_0x01f5;
                case 7: goto L_0x01fa;
                default: goto L_0x0137;
            }
        L_0x0137:
            r0 = 2131961294(0x7f1325ce, float:1.955928E38)
        L_0x013a:
            java.lang.String r21 = X.AnonymousClass7TE.A16(r7, r0)
            java.lang.String r22 = X.C9651ReV.A00(r7, r3, r10, r1)
            boolean r1 = r6.retryable
            r0 = 2131961292(0x7f1325cc, float:1.9559277E38)
            if (r1 == 0) goto L_0x014c
            r0 = 2131961301(0x7f1325d5, float:1.9559295E38)
        L_0x014c:
            java.lang.String r1 = r7.getString(r0)
            X.0qQ.A0A(r1)
            boolean r0 = r6.retryable
            if (r0 == 0) goto L_0x01f1
            X.RFe r0 = X.C8911RFe.A04
        L_0x0159:
            X.RGf r0 = r0.A01
            X.RuV r15 = new X.RuV
            r15.<init>(r0, r1, r13)
            java.lang.Integer r20 = X.AnonymousClass05K.A0N
            com.facebookpay.common.models.ErrorDialogContent r12 = new com.facebookpay.common.models.ErrorDialogContent
            r14 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.TQm r6 = new X.TQm
            r6.<init>(r12)
            com.facebookpay.offsite.models.message.PaymentAuthorizationResult r1 = r4.content
            com.facebookpay.offsite.models.message.PaymentDataError r0 = r1.error
            if (r0 == 0) goto L_0x017f
            com.facebookpay.offsite.models.message.PaymentDataErrorReason r0 = r0.reason
            if (r0 != 0) goto L_0x0181
        L_0x017f:
            com.facebookpay.offsite.models.message.PaymentDataErrorReason r0 = com.facebookpay.offsite.models.message.PaymentDataErrorReason.OTHER_ERROR
        L_0x0181:
            java.lang.String r0 = r0.name()
            java.lang.Integer r7 = X.C11297SKg.A00(r0)
            boolean r0 = r1.retryable
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "RETRYABLE"
            r2.put(r0, r1)
            java.lang.String r1 = X.C11297SKg.A01(r7)
            java.lang.String r0 = "ERROR_CODE"
            r2.put(r0, r1)
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            java.lang.String r0 = "EVENT_EXTRA"
            r2.put(r0, r3)
            java.util.Locale r1 = java.util.Locale.ROOT
            X.0qQ.A08(r1)
            java.lang.String r0 = "ERROR_MESSAGE"
            java.lang.String r1 = X.DbT.A12(r1, r0)
            com.facebookpay.offsite.models.message.PaymentAuthorizationResult r0 = r4.content
            com.facebookpay.offsite.models.message.PaymentDataError r0 = r0.error
            if (r0 == 0) goto L_0x01bb
            java.lang.String r0 = r0.message
            if (r0 != 0) goto L_0x01bd
        L_0x01bb:
            java.lang.String r0 = "No error message"
        L_0x01bd:
            r3.put(r1, r0)
            X.REu r0 = X.C8902REu.CLIENT_LOAD_OFFSITEPAYMENTHANDLED_FAIL
            r5.A0H(r0, r2)
            java.lang.String r4 = r5.A09
            if (r4 == 0) goto L_0x01e5
            X.S7g r0 = com.facebookpay.offsite.base.CheckoutHandler.A00(r5)
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r3 = r0.A00
            if (r3 == 0) goto L_0x01e5
            X.SSt r2 = X.C11418SSt.A01
            java.lang.String r1 = com.facebookpay.offsite.base.CheckoutHandler.A02(r5)
            java.lang.String r0 = X.C11297SKg.A02(r7)
            java.util.LinkedHashMap r1 = r2.A04(r3, r1, r4, r0)
            java.lang.String r0 = "submit_payment_container_fail"
            com.facebookpay.offsite.base.CheckoutHandler.A06(r5, r0, r1)
        L_0x01e5:
            X.2Fj r1 = r5.A0Q
            X.0gF r0 = X.C60340gF.A00
            X.SUj r0 = X.SUj.A0A(r0, r6)
        L_0x01ed:
            r1.A0B(r0)
        L_0x01f0:
            return
        L_0x01f1:
            X.RFe r0 = X.C8911RFe.A05
            goto L_0x0159
        L_0x01f5:
            r0 = 2131961193(0x7f132569, float:1.9559076E38)
            goto L_0x013a
        L_0x01fa:
            r0 = 2131961300(0x7f1325d4, float:1.9559293E38)
            goto L_0x013a
        L_0x01ff:
            r0 = 2131961297(0x7f1325d1, float:1.9559287E38)
            goto L_0x013a
        L_0x0204:
            com.facebookpay.offsite.models.message.PaymentDataErrorReason r11 = com.facebookpay.offsite.models.message.PaymentDataErrorReason.OTHER_ERROR
            goto L_0x0122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12980TGn.run():void");
    }
}
