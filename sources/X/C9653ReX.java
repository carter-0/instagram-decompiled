package X;

/* renamed from: X.ReX  reason: case insensitive filesystem */
public abstract class C9653ReX {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r1 != false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.payments.model.ContainerPttPayload A00(X.C10824Ryk r14, java.lang.String r15) {
        /*
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = r14.A01
            com.facebookpay.common.models.CurrencyAmount r5 = X.C11432SUd.A03(r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r14.A00
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r1 = r0.A03
            if (r1 == 0) goto L_0x0012
            X.RFA r0 = r1.A02
            java.lang.String r6 = r0.A00
            if (r6 != 0) goto L_0x0016
        L_0x0012:
            X.RFA r0 = X.RFA.LIVE
            java.lang.String r6 = r0.A00
        L_0x0016:
            r13 = 0
            if (r1 == 0) goto L_0x0076
            java.lang.String r7 = r1.A04
            java.lang.String r9 = r1.A03
            if (r9 == 0) goto L_0x0076
            java.lang.String r8 = r14.A06
            com.facebookpay.paymentmethod.model.PaymentMethod r3 = r14.A03
            java.lang.String r4 = r3.Asm()
            r0 = 100
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0)
            java.lang.String r1 = r5.A01
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            java.math.BigDecimal r0 = r2.multiply(r0)
            int r2 = r0.intValue()
            java.lang.String r1 = r5.A00
            com.facebookpay.payments.model.PayComponent r0 = new com.facebookpay.payments.model.PayComponent
            r0.<init>(r4, r2, r1)
            java.util.List r10 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r11 = r3.Asm()
            boolean r1 = r3 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r1 == 0) goto L_0x0072
            r0 = r3
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
            if (r0 == 0) goto L_0x0072
            X.QRp r2 = r0.A02
            r1 = 7
            java.lang.String r0 = "expiry_month"
            java.lang.String r12 = r2.getOptionalStringField(r1, r0)
        L_0x005e:
            com.facebookpay.paymentmethod.model.CreditCard r3 = (com.facebookpay.paymentmethod.model.CreditCard) r3
            if (r3 == 0) goto L_0x006b
            X.QRp r2 = r3.A02
            r1 = 6
            java.lang.String r0 = "expiry_year"
            java.lang.String r13 = r2.getOptionalStringField(r1, r0)
        L_0x006b:
            com.facebookpay.payments.model.ContainerPttPayload r5 = new com.facebookpay.payments.model.ContainerPttPayload
            r14 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        L_0x0072:
            r12 = r13
            if (r1 == 0) goto L_0x006b
            goto L_0x005e
        L_0x0076:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9653ReX.A00(X.Ryk, java.lang.String):com.facebookpay.payments.model.ContainerPttPayload");
    }
}
