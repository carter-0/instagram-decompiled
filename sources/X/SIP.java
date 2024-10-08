package X;

import com.google.common.collect.ImmutableList;

public final class SIP {
    public final C11281SIz A00 = new C11281SIz();
    public final C10900S0a A01 = new C10900S0a();

    public static final AnonymousClass2gB A00(S1I s1i, SJK sjk, SIP sip) {
        ImmutableList of = ImmutableList.of("PAY_BUTTON");
        0qQ.A0B(of, 0);
        sjk.A01 = of;
        C7422QCn A03 = SSC.A03(new C8275QnH(AnonymousClass2E0.A06(), C11592Scr.A00, new C11545Sc6(0, s1i, sjk, sip), 1));
        AnonymousClass2gB A012 = sip.A00.A01(SUj.A02(), new SJ1(sjk.A04, sjk.A0C));
        0qQ.A0C(A012, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.FBPayComponentDataQueryResponse>>");
        0qQ.A0A(A03);
        SQB.A02(A03, A012, new C11648Sdq(11, (Object) A012, (Object) sjk));
        return A012;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x009e, code lost:
        if (X.AnonymousClass7TE.A1b(r8) != true) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C7422QCn A01(com.facebookpay.otc.models.OtcInput r22, X.C10824Ryk r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            r21 = this;
            r3 = r23
            r20 = r24
            r0 = r20
            X.AnonymousClass7TG.A1N(r3, r0)
            r4 = 2
            r19 = r25
            r0 = r19
            X.0qQ.A0B(r0, r4)
            X.Sto r5 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r8 = r3.A02
            com.facebookpay.paymentmethod.model.PaymentMethod r2 = r3.A03
            java.lang.String r0 = r2.Asm()
            long r10 = java.lang.Long.parseLong(r0)
            X.XRm r7 = r2.Asn()
            r18 = r22
            if (r22 == 0) goto L_0x00d4
            X.SEB r0 = X.C11300SKk.A01(r18)
        L_0x002d:
            r1 = 0
            java.util.LinkedHashMap r9 = X.Pxj.A0x(r0)
            X.0qQ.A0B(r7, r4)
            X.0Ae r4 = r5.A00
            java.lang.String r0 = "client_add_ecppaymentcontainer_init"
            X.0Aj r4 = X.C51969G9p.A0d(r4, r0)
            r0 = 19
            X.1Ln r0 = X.C51965G9l.A0U(r4, r0)
            X.Iwz r6 = new X.Iwz
            r6.<init>(r7, r8, r9, r10)
            X.C12411Sto.A03(r0, r8, r6)
            com.facebook.quicklog.QuickPerformanceLogger r5 = r5.A01
            r4 = 223884226(0xd5833c2, float:6.662244E-31)
            java.lang.String r0 = "CONTAINER_CREATION_INIT"
            r5.markerPoint(r4, r0)
            r17 = 0
            r6 = 1
            com.facebookpay.expresscheckout.models.TransactionInfo r11 = r3.A01
            com.facebookpay.common.models.CurrencyAmount r7 = X.C11432SUd.A03(r11)
            java.lang.String r5 = r2.Asm()
            boolean r0 = r2 instanceof com.facebookpay.paymentmethod.model.TokenizedCard
            if (r0 == 0) goto L_0x00bf
            java.lang.String r4 = "NETWORK_TOKEN"
        L_0x0068:
            X.2IV r2 = X.Pxe.A0R()
            java.lang.String r0 = r7.A01
            java.lang.String r15 = "amount"
            r2.A09(r0, r15)
            java.lang.String r0 = r7.A00
            java.lang.String r14 = "currency_code"
            r2.A09(r0, r14)
            X.2IV r0 = X.Pxe.A0R()
            java.lang.String r13 = "credential_id"
            r0.A09(r5, r13)
            java.lang.String r12 = "credential_type"
            r0.A09(r4, r12)
            java.lang.String r10 = "charge_amount"
            r0.A06(r2, r10)
            X.2IV[] r0 = new X.2IV[]{r0}
            java.util.ArrayList r7 = X.0sr.A1L(r0)
            java.util.List r8 = r3.A08
            if (r8 == 0) goto L_0x00a0
            boolean r2 = X.AnonymousClass7TE.A1b(r8)
            r0 = 1
            if (r2 == r6) goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            r5 = 10
            if (r0 == 0) goto L_0x0113
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r8.iterator()
        L_0x00ad:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r2 = r8.next()
            boolean r0 = r2 instanceof com.facebookpay.incentives.model.ECPOnsiteOffer
            if (r0 == 0) goto L_0x00ad
            r4.add(r2)
            goto L_0x00ad
        L_0x00bf:
            boolean r0 = r2 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x00c6
            java.lang.String r4 = "CREDIT_CARD"
            goto L_0x0068
        L_0x00c6:
            boolean r0 = r2 instanceof com.facebookpay.paymentmethod.model.PayPalCredential
            if (r0 == 0) goto L_0x00cd
            java.lang.String r4 = "PAYPAL_BA"
            goto L_0x0068
        L_0x00cd:
            boolean r0 = r2 instanceof com.facebookpay.paymentmethod.model.APMCredential
            if (r0 == 0) goto L_0x02a1
            java.lang.String r4 = "NEW_PAYPAL_CHECKOUT"
            goto L_0x0068
        L_0x00d4:
            r0 = 0
            goto L_0x002d
        L_0x00d7:
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r16 = r4.iterator()
        L_0x00df:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0110
            java.lang.Object r0 = r16.next()
            com.facebookpay.incentives.model.ECPOnsiteOffer r0 = (com.facebookpay.incentives.model.ECPOnsiteOffer) r0
            java.lang.String r8 = r0.A01
            X.2IV r4 = X.Pxe.A0R()
            com.facebookpay.common.models.CurrencyAmount r2 = r0.A00
            java.lang.String r0 = r2.A01
            r4.A09(r0, r15)
            java.lang.String r0 = r2.A00
            r4.A09(r0, r14)
            java.lang.String r2 = "OFFER"
            X.2IV r0 = X.Pxe.A0R()
            r0.A09(r8, r13)
            r0.A09(r2, r12)
            r0.A06(r4, r10)
            r9.add(r0)
            goto L_0x00df
        L_0x0110:
            r7.addAll(r9)
        L_0x0113:
            X.2IV r2 = X.Pxe.A0R()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r8 = r3.A00
            java.lang.String r4 = r8.A09
            java.lang.String r0 = "payment_request_id"
            r2.A09(r4, r0)
            java.lang.String r4 = r3.A05
            java.lang.String r0 = "order_id"
            r2.A09(r4, r0)
            X.0K0 r10 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r4 = "platform_trust_token"
            r0 = r20
            X.0Df r4 = X.C41845B3m.A03(r10, r0, r4)
            java.lang.String r0 = "auth_factors"
            X.Pxf.A1E(r4, r2, r0)
            java.lang.String r4 = r3.A06
            java.lang.String r0 = "receiver_id"
            X.0Df r4 = X.C41845B3m.A03(r10, r4, r0)
            java.lang.String r0 = "receiver_info"
            X.Pxf.A1E(r4, r2, r0)
            java.lang.String r0 = "credentials"
            r2.A05(r0, r7)
            java.lang.String r4 = r8.A08
            java.lang.String r0 = "payment_product_id"
            r2.A09(r4, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r4 = r8.A03
            if (r4 == 0) goto L_0x0177
            java.util.ArrayList<X.RFh> r0 = r4.A07
            if (r0 == 0) goto L_0x0177
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0165:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0178
            java.lang.Object r0 = r7.next()
            X.RFh r0 = (X.C8914RFh) r0
            java.lang.String r0 = r0.A01
            r9.add(r0)
            goto L_0x0165
        L_0x0177:
            r9 = r1
        L_0x0178:
            java.lang.String r0 = "supported_container_types"
            r2.A05(r0, r9)
            java.lang.String r7 = r11.A05
            if (r7 != 0) goto L_0x0188
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = r0.getCountry()
        L_0x0188:
            java.lang.String r0 = "country_code"
            r2.A09(r7, r0)
            if (r4 == 0) goto L_0x0230
            java.lang.String r7 = r4.A04
        L_0x0191:
            java.lang.String r0 = "security_origin"
            r2.A09(r7, r0)
            if (r4 == 0) goto L_0x022d
            java.lang.String r7 = r4.A03
        L_0x019b:
            java.lang.String r0 = "container_context_id"
            r2.A09(r7, r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "is_guest_checkout"
            r2.A08(r0, r7)
            if (r4 == 0) goto L_0x01af
            X.RFA r0 = r4.A02
            java.lang.String r1 = r0.A00
        L_0x01af:
            java.lang.String r0 = "payment_mode"
            r2.A09(r1, r0)
            boolean r0 = r3.A09
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "save_shipping_as_billing_address"
            r2.A08(r0, r1)
            java.lang.String r1 = r3.A07
            if (r1 == 0) goto L_0x01cb
            java.lang.String r0 = "shipping_address_id"
            r2.A09(r1, r0)
        L_0x01cb:
            if (r4 == 0) goto L_0x023f
            java.util.Map<X.RFh, android.os.Bundle> r0 = r4.A08
            if (r0 == 0) goto L_0x023f
            java.util.ArrayList r9 = X.JTQ.A0f(r0)
            java.util.Iterator r13 = X.AnonymousClass7TF.A0u(r0)
        L_0x01d9:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0233
            java.util.Map$Entry r12 = X.AnonymousClass7TE.A1J(r13)
            X.2IV r11 = X.Pxe.A0R()
            java.lang.Object r0 = r12.getKey()
            X.RFh r0 = (X.C8914RFh) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "type"
            r11.A09(r1, r0)
            java.lang.Object r4 = r12.getValue()
            android.os.BaseBundle r4 = (android.os.BaseBundle) r4
            java.lang.String r1 = "webhookUri"
            java.lang.String r0 = ""
            java.lang.String r1 = r4.getString(r1, r0)
            java.lang.String r0 = "webhook_uri"
            X.0Df r7 = X.C41845B3m.A03(r10, r1, r0)
            java.lang.Object r4 = r12.getValue()
            android.os.BaseBundle r4 = (android.os.BaseBundle) r4
            java.lang.String r1 = "requireCVV"
            r0 = r17
            boolean r0 = r4.getBoolean(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "require_cvv"
            X.0Df.A00(r7, r1, r0)
            java.lang.String r0 = "config"
            X.Pxf.A1E(r7, r11, r0)
            r9.add(r11)
            goto L_0x01d9
        L_0x022d:
            r7 = r1
            goto L_0x019b
        L_0x0230:
            r7 = r1
            goto L_0x0191
        L_0x0233:
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            if (r0 == 0) goto L_0x023f
            java.lang.String r0 = "supported_containers"
            r2.A05(r0, r9)
        L_0x023f:
            X.QNI r7 = new X.QNI
            r7.<init>()
            java.lang.String r1 = r8.A0A
            java.lang.String r0 = X.Py7.A00()
            r7.A07(r1, r0)
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "client_mutation_id"
            r7.A07(r1, r0)
            java.lang.String r1 = "pay_button_click_id"
            r0 = r19
            r7.A07(r0, r1)
            X.2IV r1 = X.C11300SKk.A00(r18)
            java.lang.String r0 = "one_time_checkout_input"
            r7.A06(r1, r0)
            java.lang.String r0 = "step_up_completed_token"
            r1 = r26
            r7.A07(r1, r0)
            X.2IV[] r0 = new X.2IV[]{r2}
            java.util.ArrayList r1 = X.0sr.A1L(r0)
            java.lang.String r0 = "request_payment_container_input_list"
            r7.A05(r0, r1)
            X.5A3 r4 = X.AnonymousClass2E0.A06()
            r0 = 6
            X.Sc3 r2 = new X.Sc3
            r1 = r21
            r2.<init>(r0, r7, r1)
            X.Scq r1 = X.C11591Scq.A00
            X.QnH r0 = new X.QnH
            r0.<init>(r4, r1, r2, r6)
            X.QCn r2 = X.SSC.A03(r0)
            X.Sdq r1 = new X.Sdq
            r0 = r18
            r1.<init>((int) r5, (java.lang.Object) r0, (java.lang.Object) r3)
            X.SUj.A0H(r2, r1)
            X.0qQ.A0A(r2)
            return r2
        L_0x02a1:
            java.lang.String r0 = "Not supported credential type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SIP.A01(com.facebookpay.otc.models.OtcInput, X.Ryk, java.lang.String, java.lang.String, java.lang.String):X.QCn");
    }

    public final void A02(SJ1 sj1) {
        C11281SIz.A00(this.A00, sj1.A00, sj1);
    }
}
