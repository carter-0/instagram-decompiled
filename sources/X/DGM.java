package X;

public final class DGM implements AnonymousClass2hV {
    public final int A00;
    public final Object A01;

    public DGM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:292:0x05ab  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r64) {
        /*
            r63 = this;
            r62 = r63
            r3 = r64
            r0 = r62
            int r0 = r0.A00
            switch(r0) {
                case 0: goto L_0x0812;
                case 1: goto L_0x0626;
                case 2: goto L_0x0054;
                case 3: goto L_0x0039;
                case 4: goto L_0x0022;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.3lr r3 = (X.C250663lr) r3
            X.2hV r2 = X.C45198Cs6.A00
            r3.getClass()
            r1 = -1930157512(0xffffffff8cf42238, float:-3.7614747E-31)
            java.lang.Class<X.C7T> r0 = X.C7T.class
            X.3lr r0 = r3.A01(r0, r1)     // Catch:{ ClassNotFoundException -> 0x001c }
            goto L_0x0049
        L_0x001c:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0022:
            X.3lr r3 = (X.C250663lr) r3
            X.2hV r2 = X.C45198Cs6.A02
            r3.getClass()
            r1 = 2065636552(0x7b1f1cc8, float:8.2615895E35)
            java.lang.Class<X.BUz> r0 = X.C42204BUz.class
            X.3lr r0 = r3.A01(r0, r1)     // Catch:{ ClassNotFoundException -> 0x0033 }
            goto L_0x0049
        L_0x0033:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0039:
            X.3lr r3 = (X.C250663lr) r3
            X.2hV r2 = X.C45198Cs6.A01
            r3.getClass()
            r1 = -192063486(0xfffffffff48d5802, float:-8.958726E31)
            java.lang.Class<X.C7R> r0 = X.C7R.class
            X.3lr r0 = r3.A01(r0, r1)     // Catch:{ ClassNotFoundException -> 0x004e }
        L_0x0049:
            java.lang.Object r0 = r2.apply(r0)
            return r0
        L_0x004e:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0054:
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            X.3lr r3 = (X.C250663lr) r3
            com.google.common.collect.ImmutableList$Builder r23 = new com.google.common.collect.ImmutableList$Builder
            r23.<init>()
            r20 = 0
            if (r3 == 0) goto L_0x0606
            java.lang.Class<X.Bvx> r30 = X.C43297Bvx.class
            r2 = 0
            java.lang.String r29 = "fbpay_account_extended"
            r4 = -751257185(0xffffffffd338b99f, float:-7.9338819E11)
            r1 = r29
            r0 = r30
            X.3lr r0 = r3.getOptionalTreeField(r2, r1, r0, r4)
            if (r0 == 0) goto L_0x0606
            r0 = r30
            X.3lr r5 = r3.getOptionalTreeField(r2, r1, r0, r4)
            if (r5 == 0) goto L_0x042d
            java.lang.Class<X.Bvw> r4 = X.C43296Bvw.class
            java.lang.String r1 = "fbpay_account"
            r0 = -1331856066(0xffffffffb09d7d3e, float:-1.1458849E-9)
            X.3lr r5 = r5.getOptionalTreeField(r2, r1, r4, r0)
        L_0x008c:
            java.lang.String r22 = "Required value was null."
            if (r5 == 0) goto L_0x0486
            java.lang.Class<X.Bvv> r4 = X.C43295Bvv.class
            java.lang.String r1 = "consumer_payment_credentials(extra_data:{\"ad_id\":$ad_id,\"legacy_device_key\":$legacy_dev_pub_key,\"session_id_for_logging\":$iab_session_id,\"shared_device_key\":$shared_dev_pub_key},family_device_id:$family_device_id,payment_type:$payment_type)"
            r0 = 1831008720(0x6d22f9d0, float:3.152411E27)
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r2, r1, r4, r0)
            X.3kO r28 = r0.iterator()
            X.0qQ.A07(r28)
        L_0x00a2:
            boolean r0 = r28.hasNext()
            if (r0 == 0) goto L_0x0486
            X.3lr r5 = X.C41845B3m.A0V(r28)
            r24 = 0
            r31 = 0
            r25 = 0
            r26 = 0
            r47 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            X.XRn r1 = X.C21268XRn.A09
            java.lang.String r0 = "credential_type"
            java.lang.Enum r4 = r5.getOptionalEnumField(r2, r0, r1)
            X.XRn r4 = (X.C21268XRn) r4
            if (r4 == 0) goto L_0x0481
            r0 = r62
            java.lang.Object r1 = r0.A01
            java.util.Set r1 = (java.util.Set) r1
            java.util.Map r0 = X.C10125Rn2.A03
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L_0x046d
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00a2
            int r4 = r4.ordinal()
            r1 = 1
            r27 = 6
            r0 = r27
            if (r4 == r0) goto L_0x021e
            r0 = 20
            if (r4 == r0) goto L_0x01e2
            r0 = 61
            if (r4 == r0) goto L_0x0199
            r0 = 71
            if (r4 != r0) goto L_0x0179
            java.lang.Class<X.Bwe> r4 = X.C43340Bwe.class
            r7 = 2
            r0 = 1872397695(0x6f9a857f, float:9.564416E28)
            X.3lr r8 = r5.reinterpretRequired(r7, r4, r0)
            java.lang.Class<X.Bwj> r5 = X.C43345Bwj.class
            r6 = 3
            java.lang.String r4 = "ExistingShopPayAccountOption"
            r0 = -1966389433(0xffffffff8acb4747, float:-1.9575E-32)
            X.3lr r5 = r8.reinterpretIfFulfillsType(r6, r4, r5, r0)
            if (r5 == 0) goto L_0x00a2
            java.lang.String r9 = "strong_id__"
            java.lang.String r0 = r5.getOptionalStringField(r1, r9)
            if (r0 == 0) goto L_0x00a2
            java.lang.String r4 = "shoppay_user_id"
            java.lang.String r0 = r5.getOptionalStringField(r7, r4)
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = "shoppay_username"
            java.lang.String r8 = r5.getOptionalStringField(r6, r0)
            if (r8 == 0) goto L_0x00a2
            long r13 = java.lang.System.currentTimeMillis()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r10
            java.lang.String r8 = "authorization_expires_at"
            long r11 = r5.getCoercedTimeField(r2, r8)
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            r13 = 0
            if (r10 <= 0) goto L_0x0136
            r13 = 1
        L_0x0136:
            java.lang.String r10 = r5.getOptionalStringField(r1, r9)
            if (r10 == 0) goto L_0x043b
            long r8 = r5.getCoercedTimeField(r2, r8)
            java.lang.String r11 = r5.getOptionalStringField(r7, r4)
            if (r11 == 0) goto L_0x0436
            java.lang.String r12 = r5.getOptionalStringField(r6, r0)
            if (r12 == 0) goto L_0x0431
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r26 = new com.fbpay.hub.paymentmethods.api.FbPayShopPay
            r7 = r26
            r7.<init>(r8, r10, r11, r12, r13)
            X.SRV r0 = X.AnonymousClass2E0.A0E()
            if (r13 != 0) goto L_0x018f
            android.content.Context r4 = r0.A08
            r1 = 2131969223(0x7f1344c7, float:1.9575363E38)
            java.lang.String r0 = r7.A01
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r53 = r4.getString(r1, r0)
        L_0x0168:
            r54 = 3
            if (r13 == 0) goto L_0x0179
            X.SRV r0 = X.AnonymousClass2E0.A0E()
            android.content.Context r1 = r0.A08
            r0 = 2131969222(0x7f1344c6, float:1.957536E38)
            java.lang.String r52 = r1.getString(r0)
        L_0x0179:
            com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod r1 = new com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod
            r46 = r1
            r48 = r24
            r49 = r31
            r50 = r25
            r51 = r26
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54)
            r0 = r23
            r0.add(r1)
            goto L_0x00a2
        L_0x018f:
            android.content.Context r1 = r0.A08
            r0 = 2131969221(0x7f1344c5, float:1.9575359E38)
            java.lang.String r53 = r1.getString(r0)
            goto L_0x0168
        L_0x0199:
            java.lang.Class<X.Bwe> r4 = X.C43340Bwe.class
            r6 = 2
            r0 = 1872397695(0x6f9a857f, float:9.564416E28)
            X.3lr r7 = r5.reinterpretRequired(r6, r4, r0)
            java.lang.Class<X.Bwi> r5 = X.C43344Bwi.class
            java.lang.String r4 = "PaymentPaypalBillingAgreement"
            r0 = -1178034052(0xffffffffb9c8a07c, float:-3.8266543E-4)
            X.3lr r6 = r7.reinterpretIfFulfillsType(r6, r4, r5, r0)
            if (r6 == 0) goto L_0x00a2
            java.lang.String r0 = "strong_id__"
            java.lang.String r4 = r6.getOptionalStringField(r1, r0)
            if (r4 == 0) goto L_0x00a2
            java.lang.String r4 = "email"
            java.lang.String r5 = r6.getOptionalStringField(r2, r4)
            if (r5 == 0) goto L_0x00a2
            java.lang.String r5 = r6.getOptionalStringField(r2, r4)
            if (r5 == 0) goto L_0x044a
            java.lang.String r4 = r6.getOptionalStringField(r1, r0)
            if (r4 == 0) goto L_0x0445
            java.lang.String r1 = r6.getOptionalStringField(r1, r0)
            if (r1 == 0) goto L_0x0440
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r25 = new com.fbpay.hub.paymentmethods.api.FbPayPayPal
            r0 = r25
            r0.<init>(r1, r5, r4)
            java.lang.String r0 = "user_display_name"
            java.lang.String r53 = r6.A0B(r0)
            r54 = 1
            goto L_0x0179
        L_0x01e2:
            java.lang.Class<X.Bwe> r6 = X.C43340Bwe.class
            r4 = 2
            r0 = 1872397695(0x6f9a857f, float:9.564416E28)
            X.3lr r7 = r5.reinterpretRequired(r4, r6, r0)
            java.lang.Class<X.Bwh> r6 = X.C43343Bwh.class
            java.lang.String r4 = "DirectDebit"
            r0 = -977188081(0xffffffffc5c14b0f, float:-6185.3823)
            X.3lr r6 = r7.reinterpretIfFulfillsType(r1, r4, r6, r0)
            if (r6 == 0) goto L_0x00a2
            java.lang.String r0 = "id"
            java.lang.String r4 = r5.getOptionalStringField(r1, r0)
            if (r4 == 0) goto L_0x044f
            com.fbpay.hub.paymentmethods.api.FbPayBankAccount r24 = new com.fbpay.hub.paymentmethods.api.FbPayBankAccount
            r0 = r24
            r0.<init>((java.lang.String) r4)
            r54 = 2
            java.lang.String r0 = "bank_name"
            java.lang.String r4 = r6.A0A(r0)
            java.lang.String r0 = "last_four_digits"
            java.lang.String r1 = r6.getOptionalStringField(r1, r0)
            java.lang.String r0 = "%s*%s"
            java.lang.String r53 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r4, r1)
            goto L_0x0179
        L_0x021e:
            java.lang.Class<X.Bwe> r6 = X.C43340Bwe.class
            r4 = 2
            r0 = 1872397695(0x6f9a857f, float:9.564416E28)
            X.3lr r7 = r5.reinterpretRequired(r4, r6, r0)
            java.lang.Class<X.C8G> r6 = X.C8G.class
            java.lang.String r5 = "CreditCard"
            r0 = 981393133(0x3a7edeed, float:9.7225496E-4)
            X.3lr r0 = r7.reinterpretIfFulfillsType(r2, r5, r6, r0)
            X.C8G r0 = (X.C8G) r0
            if (r0 == 0) goto L_0x00a2
            X.RGK r13 = X.RGK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r12 = "card_type"
            java.lang.Enum r5 = r0.getOptionalEnumField(r1, r12, r13)
            if (r5 == 0) goto L_0x00a2
            java.lang.String r10 = "strong_id__"
            java.lang.String r5 = r0.A0B(r10)
            if (r5 == 0) goto L_0x00a2
            java.lang.String r11 = "expiry_year"
            java.lang.String r5 = r0.A0A(r11)
            if (r5 == 0) goto L_0x00a2
            java.lang.String r8 = "expiry_month"
            java.lang.String r5 = r0.getOptionalStringField(r4, r8)
            if (r5 == 0) goto L_0x00a2
            java.lang.String r6 = "last4"
            java.lang.String r5 = r0.A0C(r6)
            if (r5 == 0) goto L_0x00a2
            X.C8F r5 = r0.A0E()
            if (r5 == 0) goto L_0x00a2
            X.C8F r5 = r0.A0E()
            if (r5 == 0) goto L_0x00a2
            X.Bwd r5 = r5.A0E()
            if (r5 == 0) goto L_0x00a2
            java.lang.String r7 = "street1"
            java.lang.String r5 = r5.getOptionalStringField(r2, r7)
            if (r5 == 0) goto L_0x00a2
            X.C8F r5 = r0.A0E()
            if (r5 == 0) goto L_0x00a2
            X.Bwd r5 = r5.A0E()
            if (r5 == 0) goto L_0x00a2
            java.lang.String r15 = "city"
            java.lang.String r5 = r5.getOptionalStringField(r4, r15)
            if (r5 == 0) goto L_0x00a2
            X.C8F r5 = r0.A0E()
            if (r5 == 0) goto L_0x00a2
            X.Bwd r9 = r5.A0E()
            if (r9 == 0) goto L_0x00a2
            java.lang.String r21 = "state"
            r5 = r21
            java.lang.String r5 = r9.A0A(r5)
            if (r5 == 0) goto L_0x00a2
            X.C8F r5 = r0.A0E()
            if (r5 == 0) goto L_0x00a2
            X.Bwd r5 = r5.A0E()
            if (r5 == 0) goto L_0x00a2
            java.lang.String r9 = "zip"
            java.lang.String r5 = r5.A0B(r9)
            if (r5 == 0) goto L_0x00a2
            X.C8F r5 = r0.A0E()
            if (r5 == 0) goto L_0x00a2
            X.Bwd r5 = r5.A0E()
            if (r5 == 0) goto L_0x00a2
            java.lang.String r14 = "country"
            java.lang.String r5 = r5.A0C(r14)
            if (r5 == 0) goto L_0x00a2
            java.lang.Enum r5 = r0.getOptionalEnumField(r1, r12, r13)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            X.RGo r12 = X.C11334SNo.A01(r5)
            java.lang.String r5 = "cardType"
            X.C11367SPk.A03(r12, r5)
            java.lang.String r38 = r0.A0B(r10)
            if (r38 == 0) goto L_0x0468
            java.lang.String r39 = r0.getOptionalStringField(r4, r8)
            if (r39 == 0) goto L_0x0463
            java.lang.String r40 = r0.A0A(r11)
            if (r40 == 0) goto L_0x045e
            java.lang.String r41 = r0.A0B(r10)
            if (r41 == 0) goto L_0x0459
            java.lang.String r42 = r0.A0C(r6)
            if (r42 == 0) goto L_0x0454
            r6 = 10
            r5 = 232(0xe8, float:3.25E-43)
            java.lang.String r5 = X.Pxd.A00(r5)
            java.lang.Boolean r35 = X.C41846B3n.A0d(r0, r5, r6)
            r6 = 11
            r5 = 239(0xef, float:3.35E-43)
            java.lang.String r5 = X.Pxd.A00(r5)
            java.lang.String r43 = r0.getOptionalStringField(r6, r5)
            X.XRj r5 = X.C21264XRj.A02
            r8 = 12
            r6 = 241(0xf1, float:3.38E-43)
            java.lang.String r6 = X.Pxd.A00(r6)
            java.lang.Enum r6 = r0.getOptionalEnumField(r8, r6, r5)
            if (r6 == 0) goto L_0x0429
            boolean r8 = r6.equals(r5)
            if (r8 != 0) goto L_0x0429
            java.lang.String r45 = r6.toString()
        L_0x032e:
            r8 = 13
            r6 = 240(0xf0, float:3.36E-43)
            java.lang.String r6 = X.Pxd.A00(r6)
            java.lang.Enum r6 = r0.getOptionalEnumField(r8, r6, r5)
            if (r6 == 0) goto L_0x0425
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x0425
            java.lang.String r44 = r6.toString()
        L_0x0346:
            X.C8F r5 = r0.A0E()
            if (r5 == 0) goto L_0x0421
            X.Bwd r5 = r5.A0E()
            if (r5 == 0) goto L_0x0421
            java.lang.String r60 = r5.getOptionalStringField(r2, r7)
        L_0x0356:
            X.C8F r5 = r0.A0E()
            if (r5 == 0) goto L_0x041d
            X.Bwd r5 = r5.A0E()
            if (r5 == 0) goto L_0x041d
            java.lang.String r6 = "street2"
            java.lang.String r61 = r5.getOptionalStringField(r1, r6)
        L_0x0368:
            X.C8F r1 = r0.A0E()
            if (r1 == 0) goto L_0x0419
            X.Bwd r1 = r1.A0E()
            if (r1 == 0) goto L_0x0419
            java.lang.String r56 = r1.getOptionalStringField(r4, r15)
        L_0x0378:
            X.C8F r1 = r0.A0E()
            if (r1 == 0) goto L_0x0415
            X.Bwd r4 = r1.A0E()
            if (r4 == 0) goto L_0x0415
            r1 = r21
            java.lang.String r59 = r4.A0A(r1)
        L_0x038a:
            X.C8F r1 = r0.A0E()
            if (r1 == 0) goto L_0x0412
            X.Bwd r1 = r1.A0E()
            if (r1 == 0) goto L_0x0412
            java.lang.String r58 = r1.A0B(r9)
        L_0x039a:
            X.C8F r1 = r0.A0E()
            if (r1 == 0) goto L_0x040f
            X.Bwd r1 = r1.A0E()
            if (r1 == 0) goto L_0x040f
            java.lang.String r57 = r1.A0C(r14)
        L_0x03aa:
            com.fbpay.hub.contactinfo.address.api.FBPayAddress r32 = new com.fbpay.hub.contactinfo.address.api.FBPayAddress
            r55 = r32
            r55.<init>(r56, r57, r58, r59, r60, r61)
            r4 = 9
            java.lang.String r1 = "card_holder_name"
            java.lang.String r36 = r0.getOptionalStringField(r4, r1)
            X.C8F r1 = r0.A0E()
            if (r1 == 0) goto L_0x040c
            X.Bwd r1 = r1.A0E()
            if (r1 == 0) goto L_0x040c
            java.lang.String r46 = r1.A0B(r9)
        L_0x03c9:
            X.C8F r1 = r0.A0E()
            if (r1 == 0) goto L_0x0409
            X.Bwd r1 = r1.A0E()
            if (r1 == 0) goto L_0x0409
            java.lang.String r37 = r1.A0C(r14)
        L_0x03d9:
            r4 = 14
            java.lang.String r1 = "bound_passkey_ids"
            com.google.common.collect.ImmutableList r34 = r0.getRequiredCompactedStringListField(r4, r1)
            com.fbpay.hub.paymentmethods.api.FbPayCreditCard r31 = new com.fbpay.hub.paymentmethods.api.FbPayCreditCard
            r33 = r12
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            java.lang.String r4 = "cc_title"
            r1 = r27
            java.lang.String r53 = r0.getOptionalStringField(r1, r4)
            r4 = 7
            java.lang.String r1 = "cc_subtitle"
            java.lang.String r52 = r0.getOptionalStringField(r4, r1)
            r1 = 195(0xc3, float:2.73E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            java.lang.String r0 = r0.getOptionalStringField(r2, r1)
            if (r0 == 0) goto L_0x0179
            android.net.Uri r47 = X.0cp.A03(r0)
            goto L_0x0179
        L_0x0409:
            r37 = r16
            goto L_0x03d9
        L_0x040c:
            r46 = r16
            goto L_0x03c9
        L_0x040f:
            r57 = r16
            goto L_0x03aa
        L_0x0412:
            r58 = r16
            goto L_0x039a
        L_0x0415:
            r59 = r16
            goto L_0x038a
        L_0x0419:
            r56 = r16
            goto L_0x0378
        L_0x041d:
            r61 = r16
            goto L_0x0368
        L_0x0421:
            r60 = r16
            goto L_0x0356
        L_0x0425:
            r44 = r16
            goto L_0x0346
        L_0x0429:
            r45 = r16
            goto L_0x032e
        L_0x042d:
            r5 = r16
            goto L_0x008c
        L_0x0431:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0436:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x043b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0440:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0445:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x044a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x044f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0454:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0459:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x045e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0463:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0468:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x046d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unsupported credential type:"
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r4, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0481:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0486:
            r4 = -751257185(0xffffffffd338b99f, float:-7.9338819E11)
            r1 = r29
            r0 = r30
            X.3lr r6 = r3.getOptionalTreeField(r2, r1, r0, r4)
            if (r6 == 0) goto L_0x0601
            java.lang.Class<X.C8B> r4 = X.C8B.class
            r5 = 1
            java.lang.String r1 = "new_payment_credential_options(payment_type:$payment_type)"
            r0 = 706545385(0x2a1d06e9, float:1.3946799E-13)
            com.google.common.collect.ImmutableList r0 = r6.getRequiredCompactedTreeListField(r5, r1, r4, r0)
            if (r0 == 0) goto L_0x0601
            X.3kO r13 = r0.iterator()
            X.0qQ.A07(r13)
            r12 = 0
            r11 = 0
            r10 = 0
        L_0x04ab:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0599
            java.lang.Object r9 = r13.next()
            X.C8B r9 = (X.C8B) r9
            if (r9 == 0) goto L_0x0594
            X.XRn r1 = X.C21268XRn.A04
            X.C8E r0 = r9.A0E()
            X.XRn r6 = X.C21268XRn.A09
            java.lang.String r4 = "credential_type"
            java.lang.Enum r0 = r0.getOptionalEnumField(r2, r4, r6)
            if (r1 != r0) goto L_0x04f6
            X.C8E r0 = r9.A0E()
            java.lang.Class<X.Bwf> r8 = X.C43341Bwf.class
            r7 = 2
            java.lang.String r6 = "NewCreditCardOption"
            r4 = -40060861(0xfffffffffd9cb843, float:-2.6039539E37)
            X.3lr r0 = r0.reinterpretIfFulfillsType(r7, r6, r8, r4)
            if (r0 == 0) goto L_0x0599
            java.lang.String r1 = "title"
            java.lang.String r0 = r0.getOptionalStringField(r2, r1)
            if (r0 == 0) goto L_0x0599
            r12 = 1
            X.C8E r0 = r9.A0E()
            X.3lr r0 = r0.reinterpretIfFulfillsType(r7, r6, r8, r4)
            if (r0 == 0) goto L_0x04f3
            java.lang.String r19 = r0.getOptionalStringField(r2, r1)
            goto L_0x04ab
        L_0x04f3:
            r19 = r20
            goto L_0x04ab
        L_0x04f6:
            X.XRn r1 = X.C21268XRn.A05
            X.C8E r0 = r9.A0E()
            java.lang.Enum r0 = r0.getOptionalEnumField(r2, r4, r6)
            if (r1 != r0) goto L_0x0556
            X.C8E r0 = r9.A0E()
            X.QX1 r0 = r0.A0E()
            if (r0 == 0) goto L_0x0599
            X.C8E r0 = r9.A0E()
            X.QX1 r0 = r0.A0E()
            if (r0 == 0) goto L_0x0599
            java.lang.String r4 = "title"
            java.lang.String r0 = r0.A09(r4)
            if (r0 == 0) goto L_0x0599
            X.C8E r0 = r9.A0E()
            X.QX1 r0 = r0.A0E()
            if (r0 == 0) goto L_0x0599
            java.lang.String r1 = "url"
            java.lang.String r0 = r0.getOptionalStringField(r5, r1)
            if (r0 == 0) goto L_0x0599
            r11 = 1
            X.C8E r0 = r9.A0E()
            X.QX1 r0 = r0.A0E()
            if (r0 == 0) goto L_0x054f
            java.lang.String r18 = r0.A09(r4)
        L_0x053f:
            X.C8E r0 = r9.A0E()
            X.QX1 r0 = r0.A0E()
            if (r0 == 0) goto L_0x0552
            java.lang.String r17 = r0.getOptionalStringField(r5, r1)
            goto L_0x04ab
        L_0x054f:
            r18 = r20
            goto L_0x053f
        L_0x0552:
            r17 = r20
            goto L_0x04ab
        L_0x0556:
            X.XRn r1 = X.C21268XRn.A06
            X.C8E r0 = r9.A0E()
            java.lang.Enum r0 = r0.getOptionalEnumField(r2, r4, r6)
            if (r1 != r0) goto L_0x04ab
            X.C8E r0 = r9.A0E()
            java.lang.Class<X.Bwg> r8 = X.C43342Bwg.class
            r7 = 3
            java.lang.String r6 = "NewShopPayOption"
            r4 = -986202572(0xffffffffc537be34, float:-2939.8877)
            X.3lr r0 = r0.reinterpretIfFulfillsType(r7, r6, r8, r4)
            if (r0 == 0) goto L_0x0599
            java.lang.String r1 = "title"
            java.lang.String r0 = r0.getOptionalStringField(r2, r1)
            if (r0 == 0) goto L_0x0599
            r10 = 1
            X.C8E r0 = r9.A0E()
            X.3lr r0 = r0.reinterpretIfFulfillsType(r7, r6, r8, r4)
            if (r0 == 0) goto L_0x058f
            java.lang.String r16 = r0.getOptionalStringField(r2, r1)
            if (r16 == 0) goto L_0x058f
            goto L_0x04ab
        L_0x058f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0594:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0599:
            X.Cvb r4 = new X.Cvb
            r4.<init>()
            com.google.common.collect.ImmutableList r1 = r23.build()
            r4.A04 = r1
            java.lang.String r0 = "paymentMethods"
            X.C11367SPk.A03(r1, r0)
            if (r12 == 0) goto L_0x05ea
            com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption r1 = new com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption
            r0 = r19
            r1.<init>((java.lang.String) r0)
        L_0x05b2:
            r4.A01 = r1
            if (r11 == 0) goto L_0x05e7
            com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption r6 = new com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption
            r1 = r17
            r0 = r18
            r6.<init>(r1, r0)
        L_0x05bf:
            r4.A02 = r6
            if (r10 == 0) goto L_0x05cc
            X.Cwf r20 = new X.Cwf
            r1 = r20
            r0 = r16
            r1.<init>(r0)
        L_0x05cc:
            r0 = r20
            r4.A03 = r0
            java.lang.Class<X.Bvy> r7 = X.C43298Bvy.class
            java.lang.String r6 = "payments_address_form_fields_config(query_params:{\"payment_type\":$payment_type})"
            r1 = -703364103(0xffffffffd61383f9, float:-4.0548757E13)
            X.3lr r0 = r3.getOptionalTreeField(r5, r6, r7, r1)
            if (r0 == 0) goto L_0x0620
            X.3lr r3 = r3.getOptionalTreeField(r5, r6, r7, r1)
            if (r3 == 0) goto L_0x05fc
            r1 = -1659328637(0xffffffff9d18a783, float:-2.0203634E-21)
            goto L_0x05ed
        L_0x05e7:
            r6 = r20
            goto L_0x05bf
        L_0x05ea:
            r1 = r20
            goto L_0x05b2
        L_0x05ed:
            java.lang.Class<X.QSO> r0 = X.QSO.class
            X.3lr r0 = r3.reinterpretRequired(r2, r0, r1)     // Catch:{ ClassNotFoundException -> 0x05f6 }
            X.QSO r0 = (X.QSO) r0     // Catch:{ ClassNotFoundException -> 0x05f6 }
            goto L_0x0617
        L_0x05f6:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x05fc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0601:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0606:
            X.Cvb r4 = new X.Cvb
            r4.<init>()
            com.google.common.collect.ImmutableList r1 = r23.build()
            r4.A04 = r1
            java.lang.String r0 = "paymentMethods"
            X.C11367SPk.A03(r1, r0)
            goto L_0x0620
        L_0x0617:
            X.0qQ.A07(r0)
            com.facebookpay.form.model.AddressFormFieldsConfig r0 = X.C11393SRk.A00(r0)
            r4.A00 = r0
        L_0x0620:
            X.Cwm r0 = new X.Cwm
            r0.<init>(r4)
            return r0
        L_0x0626:
            X.C8A r3 = (X.C8A) r3
            if (r3 == 0) goto L_0x080d
            X.Bvu r0 = r3.A0E()
            if (r0 == 0) goto L_0x080d
            X.Bvu r0 = r3.A0E()
            java.lang.Class<X.Bvt> r13 = X.C43293Bvt.class
            r12 = -1474788971(0xffffffffa8188195, float:-8.465794E-15)
            X.3lr r0 = r0.A01(r13, r12)
            if (r0 == 0) goto L_0x080d
            X.Bvu r0 = r3.A0E()
            X.3lr r0 = r0.A01(r13, r12)
            java.lang.Class<X.Bw9> r11 = X.C43309Bw9.class
            r10 = 1
            r9 = 1517733831(0x5a76c7c7, float:1.73656254E16)
            X.3lr r0 = r0.reinterpretRequired(r10, r11, r9)
            if (r0 == 0) goto L_0x080d
            X.Bvu r0 = r3.A0E()
            X.3lr r0 = r0.A01(r13, r12)
            X.3lr r0 = r0.reinterpretRequired(r10, r11, r9)
            java.lang.Class<X.Bw8> r8 = X.C43308Bw8.class
            r5 = 0
            java.lang.String r7 = "payment_transactions_shopping_bag_on_user(first:$first,payment_order_types:[\"IG_MOR_DONATIONS\",\"IG_NMOR_DONATION_P4P\",\"IG_NMOR_P2B\",\"IG_NMOR_SHOPPING\",\"NMOR_CHECKOUT_EXPERIENCES\",\"NMOR_INSTAGRAM_P2B\"])"
            r6 = -741318032(0xffffffffd3d06270, float:-1.79000941E12)
            X.3lr r0 = r0.getOptionalTreeField(r5, r7, r8, r6)
            if (r0 == 0) goto L_0x080d
            X.Bvu r0 = r3.A0E()
            X.3lr r0 = r0.A01(r13, r12)
            X.3lr r0 = r0.reinterpretRequired(r10, r11, r9)
            X.3lr r0 = r0.getOptionalTreeField(r5, r7, r8, r6)
            java.lang.Class<X.Bw7> r4 = X.C43307Bw7.class
            java.lang.String r2 = "edges"
            r1 = 480025544(0x1c9c9bc8, float:1.0363483E-21)
            com.google.common.collect.ImmutableList r0 = r0.getRequiredCompactedTreeListField(r5, r2, r4, r1)
            if (r0 == 0) goto L_0x080d
            X.Bvu r0 = r3.A0E()
            X.3lr r0 = r0.A01(r13, r12)
            X.3lr r0 = r0.reinterpretRequired(r10, r11, r9)
            X.3lr r0 = r0.getOptionalTreeField(r5, r7, r8, r6)
            com.google.common.collect.ImmutableList r0 = r0.getRequiredCompactedTreeListField(r5, r2, r4, r1)
            com.google.common.collect.ImmutableList$Builder r6 = new com.google.common.collect.ImmutableList$Builder
            r6.<init>()
            X.3kO r13 = r0.iterator()
        L_0x06a7:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0808
            X.3lr r3 = X.C41845B3m.A0V(r13)
            java.lang.Class<X.Bw6> r2 = X.C43306Bw6.class
            java.lang.String r1 = "node"
            r0 = -1847009372(0xffffffff91e8dfa4, float:-3.6740975E-28)
            X.3lr r10 = r3.getOptionalTreeField(r5, r1, r2, r0)
            if (r10 == 0) goto L_0x06a7
            java.lang.Class<X.Bw5> r9 = X.C43305Bw5.class
            r8 = -1071380812(0xffffffffc02406b4, float:-2.5629091)
            X.3lr r0 = r10.A01(r9, r8)
            if (r0 == 0) goto L_0x06a7
            X.3lr r0 = r10.A01(r9, r8)
            java.lang.Class<X.Bw4> r7 = X.C43304Bw4.class
            java.lang.String r4 = "history_row_view_data"
            r3 = 2118708786(0x7e48ee32, float:6.6770595E37)
            X.3lr r0 = r0.A02(r7, r4, r3)
            if (r0 == 0) goto L_0x06a7
            X.3lr r0 = r10.A01(r9, r8)
            X.3lr r0 = r0.A02(r7, r4, r3)
            java.lang.Class<X.Bw3> r2 = X.C43303Bw3.class
            r1 = 1474268720(0x57df8e30, float:4.91603567E14)
            X.3lr r0 = r0.reinterpretRequired(r5, r2, r1)
            if (r0 == 0) goto L_0x06a7
            X.3lr r0 = r10.A01(r9, r8)
            X.3lr r0 = r0.A02(r7, r4, r3)
            X.3lr r7 = r0.reinterpretRequired(r5, r2, r1)
            X.3lr r1 = r10.A01(r9, r8)
            java.lang.String r0 = "__typename"
            java.lang.String r20 = r1.getStringValue(r0)
            if (r20 == 0) goto L_0x06a7
            if (r7 == 0) goto L_0x06a7
            java.lang.String r11 = "order_id"
            java.lang.String r0 = r7.getOptionalStringField(r5, r11)
            if (r0 == 0) goto L_0x06a7
            X.EWv r4 = X.C48129EWv.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r3 = 5
            java.lang.String r2 = "status_type"
            java.lang.Enum r0 = r7.getOptionalEnumField(r3, r2, r4)
            if (r0 == 0) goto L_0x06a7
            java.lang.Class<X.Bw2> r12 = X.C43302Bw2.class
            r10 = 7
            java.lang.String r9 = "status_with_entities"
            r8 = -195465726(0xfffffffff4596e02, float:-6.890623E31)
            X.3lr r0 = r7.getOptionalTreeField(r10, r9, r12, r8)
            if (r0 == 0) goto L_0x06a7
            X.3lr r0 = r7.getOptionalTreeField(r10, r9, r12, r8)
            java.lang.String r1 = "text"
            java.lang.String r0 = r0.getOptionalStringField(r5, r1)
            if (r0 == 0) goto L_0x06a7
            X.3lr r0 = r7.getOptionalTreeField(r10, r9, r12, r8)
            java.lang.String r0 = r0.getOptionalStringField(r5, r1)
            long r0 = java.lang.Long.parseLong(r0)
            java.util.Locale r9 = X.AnonymousClass1Q2.A02()
            r8 = 2
            java.text.DateFormat r10 = java.text.DateFormat.getDateInstance(r8, r9)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r8
            java.util.Date r8 = new java.util.Date
            r8.<init>(r0)
            java.lang.String r8 = r10.format(r8)
            r15 = 0
            java.lang.String r1 = r7.getOptionalStringField(r5, r11)
            java.lang.String r0 = "orderId"
            X.C11367SPk.A03(r1, r0)
            r0 = r62
            java.lang.Object r9 = r0.A01
            android.content.Context r9 = (android.content.Context) r9
            java.lang.Enum r0 = r7.getOptionalEnumField(r3, r2, r4)
            X.EWv r0 = (X.C48129EWv) r0
            int r0 = r0.ordinal()
            r11 = 1
            switch(r0) {
                case 1: goto L_0x07e2;
                case 2: goto L_0x0773;
                case 3: goto L_0x0773;
                case 4: goto L_0x0773;
                case 5: goto L_0x07e6;
                case 6: goto L_0x07d6;
                case 7: goto L_0x07f7;
                case 8: goto L_0x07ea;
                case 9: goto L_0x07ee;
                case 10: goto L_0x07fb;
                case 11: goto L_0x0773;
                case 12: goto L_0x0773;
                case 13: goto L_0x0773;
                case 14: goto L_0x0773;
                case 15: goto L_0x0773;
                case 16: goto L_0x0773;
                case 17: goto L_0x07da;
                case 18: goto L_0x07c6;
                case 19: goto L_0x0773;
                case 20: goto L_0x0773;
                case 21: goto L_0x07ce;
                case 22: goto L_0x07d2;
                case 23: goto L_0x07ca;
                case 24: goto L_0x0773;
                case 25: goto L_0x0773;
                case 26: goto L_0x07de;
                default: goto L_0x0773;
            }
        L_0x0773:
            java.lang.String r0 = "orderStatus"
            X.C11367SPk.A03(r8, r0)
            java.lang.String r0 = "title"
            java.lang.String r21 = r7.A0A(r0)
            java.lang.String r0 = "image_uri"
            java.lang.String r16 = r7.getOptionalStringField(r11, r0)
            java.lang.String r11 = "merchant_name"
            java.lang.String r0 = r7.A0B(r11)
            if (r0 == 0) goto L_0x07c3
            r10 = 2131969069(0x7f13442d, float:1.957505E38)
            java.lang.String r0 = r7.A0B(r11)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r17 = r9.getString(r10, r0)
        L_0x079b:
            r10 = 6
            java.lang.String r0 = "quantity"
            int r22 = r7.getCoercedIntField(r10, r0)
            java.lang.Enum r2 = r7.getOptionalEnumField(r3, r2, r4)
            X.EWv r0 = X.C48129EWv.PAYMENT_UPDATE_REQUIRED
            if (r2 != r0) goto L_0x07b5
            r0 = 2131100130(0x7f0601e2, float:1.7812633E38)
            int r0 = r9.getColor(r0)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
        L_0x07b5:
            com.fbpay.hub.orders.api.FBPayOrder r14 = new com.fbpay.hub.orders.api.FBPayOrder
            r18 = r1
            r19 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r6.add(r14)
            goto L_0x06a7
        L_0x07c3:
            r17 = 0
            goto L_0x079b
        L_0x07c6:
            r10 = 2131969078(0x7f134436, float:1.9575069E38)
            goto L_0x07fe
        L_0x07ca:
            r10 = 2131969081(0x7f134439, float:1.9575075E38)
            goto L_0x07fe
        L_0x07ce:
            r10 = 2131969080(0x7f134438, float:1.9575073E38)
            goto L_0x07fe
        L_0x07d2:
            r10 = 2131969082(0x7f13443a, float:1.9575077E38)
            goto L_0x07fe
        L_0x07d6:
            r10 = 2131969067(0x7f13442b, float:1.9575046E38)
            goto L_0x07fe
        L_0x07da:
            r10 = 2131969079(0x7f134437, float:1.957507E38)
            goto L_0x07fe
        L_0x07de:
            r10 = 2131969084(0x7f13443c, float:1.957508E38)
            goto L_0x07fe
        L_0x07e2:
            r10 = 2131969060(0x7f134424, float:1.9575032E38)
            goto L_0x07fe
        L_0x07e6:
            r10 = 2131969063(0x7f134427, float:1.9575038E38)
            goto L_0x07fe
        L_0x07ea:
            r10 = 2131969075(0x7f134433, float:1.9575063E38)
            goto L_0x07fe
        L_0x07ee:
            r0 = 2131969076(0x7f134434, float:1.9575065E38)
            java.lang.String r8 = r9.getString(r0)
            goto L_0x0773
        L_0x07f7:
            r10 = 2131969074(0x7f134432, float:1.957506E38)
            goto L_0x07fe
        L_0x07fb:
            r10 = 2131969077(0x7f134435, float:1.9575067E38)
        L_0x07fe:
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            java.lang.String r8 = r9.getString(r10, r0)
            goto L_0x0773
        L_0x0808:
            com.google.common.collect.ImmutableList r0 = r6.build()
            return r0
        L_0x080d:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            return r0
        L_0x0812:
            X.3lr r3 = (X.C250663lr) r3
            r1 = -2078243045(0xffffffff8420871b, float:-1.8869947E-36)
            java.lang.Class<X.BTk> r0 = X.C42163BTk.class
            X.3lr r7 = r3.A01(r0, r1)     // Catch:{ ClassNotFoundException -> 0x084e }
            if (r7 == 0) goto L_0x0846
            java.lang.Class<X.BTj> r6 = X.C42162BTj.class
            java.lang.String r5 = "fbpay_authentication_information_query(input:$input)"
            r4 = -750448790(0xffffffffd3450f6a, float:-8.4636716E11)
            X.3lr r0 = r7.A03(r6, r5, r4)
            if (r0 == 0) goto L_0x0846
            X.3lr r0 = r7.A03(r6, r5, r4)
            java.lang.Class<X.QSU> r3 = X.QSU.class
            java.lang.String r2 = "authentication_information"
            r1 = -1182435316(0xffffffffb985780c, float:-2.545718E-4)
            X.3lr r0 = r0.A02(r3, r2, r1)
            if (r0 == 0) goto L_0x0846
            X.3lr r0 = r7.A03(r6, r5, r4)
            X.3lr r0 = r0.A02(r3, r2, r1)
            return r0
        L_0x0846:
            java.lang.String r1 = "The authentication information is null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x084e:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DGM.apply(java.lang.Object):java.lang.Object");
    }
}
