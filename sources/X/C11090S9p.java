package X;

/* renamed from: X.S9p  reason: case insensitive filesystem */
public abstract class C11090S9p {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r20v6, types: [com.facebookpay.expresscheckout.models.FulfillmentOption] */
    /* JADX WARNING: type inference failed for: r35v2, types: [com.facebookpay.expresscheckout.models.PickupFulfillmentOption] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.expresscheckout.models.TransactionInfo A00(com.facebookpay.offsite.models.message.PaymentDetails r41, java.lang.String r42, java.lang.String r43) {
        /*
            r34 = r43
            r6 = r42
            r0 = 0
            r1 = r41
            com.facebookpay.offsite.models.message.PaymentItem r2 = r1.total
            if (r2 == 0) goto L_0x02aa
            java.util.ArrayList<com.facebookpay.offsite.models.message.PaymentShippingOption> r4 = r1.shippingOptions
            r17 = 10
            r19 = 0
            if (r4 == 0) goto L_0x006c
            boolean r3 = X.DbT.A1b(r4)
            if (r3 == 0) goto L_0x006c
            java.lang.String r8 = r1.shippingOptionId
            if (r8 != 0) goto L_0x0025
            java.lang.Object r3 = r4.get(r0)
            com.facebookpay.offsite.models.message.PaymentShippingOption r3 = (com.facebookpay.offsite.models.message.PaymentShippingOption) r3
            java.lang.String r8 = r3.id
        L_0x0025:
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r10 = r4.iterator()
        L_0x002d:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x006f
            java.lang.Object r4 = r10.next()
            com.facebookpay.offsite.models.message.PaymentShippingOption r4 = (com.facebookpay.offsite.models.message.PaymentShippingOption) r4
            X.0qQ.A0B(r4, r0)
            java.lang.String r9 = r4.id
            r5 = r6
            if (r42 != 0) goto L_0x0043
            java.lang.String r5 = "SHIPPING"
        L_0x0043:
            java.util.Locale r3 = java.util.Locale.ROOT
            X.0qQ.A08(r3)
            java.lang.String r3 = X.Pxf.A0n(r3, r5)
            java.lang.Integer r13 = X.C11085S9f.A00(r3)
            java.lang.String r5 = r4.label
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r3 = r4.amount
            com.facebookpay.common.models.CurrencyAmount r12 = X.SQ3.A00(r3)
            java.lang.String r4 = r4.secondaryLabel
            if (r4 != 0) goto L_0x005e
            java.lang.String r4 = ""
        L_0x005e:
            com.facebookpay.expresscheckout.models.ShippingOption r3 = new com.facebookpay.expresscheckout.models.ShippingOption
            r16 = r4
            r11 = r3
            r14 = r9
            r15 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            r7.add(r3)
            goto L_0x002d
        L_0x006c:
            r15 = r19
            goto L_0x0074
        L_0x006f:
            com.facebookpay.expresscheckout.models.ShippingOptions r15 = new com.facebookpay.expresscheckout.models.ShippingOptions
            r15.<init>(r8, r7)
        L_0x0074:
            java.util.ArrayList<com.facebookpay.offsite.models.message.PaymentFulfillmentOption> r4 = r1.fulfillmentOptions
            if (r4 == 0) goto L_0x016d
            boolean r3 = X.DbT.A1b(r4)
            if (r3 == 0) goto L_0x016d
            java.lang.String r8 = r1.fulfillmentOptionId
            if (r8 != 0) goto L_0x008a
            java.lang.Object r3 = r4.get(r0)
            com.facebookpay.offsite.models.message.PaymentFulfillmentOption r3 = (com.facebookpay.offsite.models.message.PaymentFulfillmentOption) r3
            java.lang.String r8 = r3.id
        L_0x008a:
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r16 = r4.iterator()
        L_0x0092:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x0170
            java.lang.Object r9 = r16.next()
            com.facebookpay.offsite.models.message.PaymentFulfillmentOption r9 = (com.facebookpay.offsite.models.message.PaymentFulfillmentOption) r9
            X.0qQ.A0B(r9, r0)
            boolean r3 = r9 instanceof com.facebookpay.offsite.models.message.PaymentPickupOption
            if (r3 == 0) goto L_0x014a
            java.lang.String r3 = r9.id
            r39 = r3
            java.lang.String r3 = r9.label
            r40 = r3
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r3 = r9.amount
            com.facebookpay.common.models.CurrencyAmount r36 = X.SQ3.A00(r3)
            java.util.Date r3 = r9.dateTimeRangeStart
            r41 = r3
            java.util.Date r3 = r9.dateTimeRangeEnd
            r42 = r3
            com.facebookpay.offsite.models.message.PaymentPickupOption r9 = (com.facebookpay.offsite.models.message.PaymentPickupOption) r9
            com.facebookpay.offsite.models.message.W3CShippingAddress r3 = r9.pickupLocationAddress
            X.0qQ.A0B(r3, r0)
            java.lang.String r4 = r3.organization
            r20 = r4
            java.lang.String r14 = r3.recipient
            java.util.ArrayList<java.lang.String> r4 = r3.addressLine
            if (r4 == 0) goto L_0x0147
            java.lang.Object r10 = X.00k.A0O(r4, r0)
            java.lang.String r10 = (java.lang.String) r10
        L_0x00d2:
            java.util.ArrayList<java.lang.String> r5 = r3.addressLine
            if (r5 == 0) goto L_0x0144
            r4 = 1
            java.lang.Object r4 = X.00k.A0O(r5, r4)
            java.lang.String r4 = (java.lang.String) r4
        L_0x00dd:
            java.lang.String r13 = r3.city
            java.lang.String r12 = r3.region
            java.lang.String r11 = r3.country
            java.lang.String r3 = r3.postalCode
            r5 = 0
            r33 = 1
            com.facebookpay.shippingaddress.model.ShippingAddress r18 = new com.facebookpay.shippingaddress.model.ShippingAddress
            r25 = r12
            r26 = r11
            r27 = r3
            r28 = r5
            r29 = r0
            r30 = r0
            r31 = r0
            r32 = r0
            r21 = r14
            r22 = r10
            r23 = r4
            r24 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            boolean r10 = r9.pickupStoreAvailability
            com.facebookpay.offsite.models.message.PaymentDistance r9 = r9.pickupStoreDistance
            if (r9 == 0) goto L_0x0127
            double r3 = r9.value
            java.lang.String r9 = r9.unit
            java.util.Locale r5 = java.util.Locale.ROOT
            X.0qQ.A08(r5)
            java.lang.String r9 = X.Pxf.A0n(r5, r9)
            java.lang.String r5 = "MILES"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0139
            java.lang.Integer r9 = X.AnonymousClass05K.A00
        L_0x0122:
            com.facebookpay.common.models.Distance r5 = new com.facebookpay.common.models.Distance
            r5.<init>(r9, r3)
        L_0x0127:
            com.facebookpay.expresscheckout.models.PickupFulfillmentOption r4 = new com.facebookpay.expresscheckout.models.PickupFulfillmentOption
            r35 = r4
            r37 = r5
            r38 = r18
            r43 = r10
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)
        L_0x0134:
            r7.add(r4)
            goto L_0x0092
        L_0x0139:
            java.lang.String r5 = "KILOMETERS"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0168
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            goto L_0x0122
        L_0x0144:
            r4 = r19
            goto L_0x00dd
        L_0x0147:
            r10 = r19
            goto L_0x00d2
        L_0x014a:
            java.lang.String r11 = r9.id
            java.lang.String r10 = r9.label
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r3 = r9.amount
            com.facebookpay.common.models.CurrencyAmount r21 = X.SQ3.A00(r3)
            java.util.Date r5 = r9.dateTimeRangeStart
            java.util.Date r3 = r9.dateTimeRangeEnd
            com.facebookpay.expresscheckout.models.FulfillmentOption r4 = new com.facebookpay.expresscheckout.models.FulfillmentOption
            r25 = r3
            r20 = r4
            r22 = r11
            r23 = r10
            r24 = r5
            r20.<init>(r21, r22, r23, r24, r25)
            goto L_0x0134
        L_0x0168:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r9)
            throw r0
        L_0x016d:
            r4 = r19
            goto L_0x0175
        L_0x0170:
            com.facebookpay.expresscheckout.models.FulfillmentOptions r4 = new com.facebookpay.expresscheckout.models.FulfillmentOptions
            r4.<init>(r8, r7)
        L_0x0175:
            if (r6 != 0) goto L_0x0179
            java.lang.String r6 = "SHIPPING"
        L_0x0179:
            java.util.Locale r3 = java.util.Locale.ROOT
            X.0qQ.A08(r3)
            java.lang.String r3 = X.Pxf.A0n(r3, r6)
            java.lang.Integer r32 = X.C11085S9f.A00(r3)
            if (r34 != 0) goto L_0x0198
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r34 = r3.getCountry()
            if (r34 != 0) goto L_0x0198
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r34 = r3.getCountry()
        L_0x0198:
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r3 = r2.amount
            java.lang.String r9 = r3.currency
            java.util.ArrayList<com.facebookpay.offsite.models.message.SummaryPaymentItem> r5 = r1.summaryItems
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r10 = r5.iterator()
        L_0x01a6:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x01e9
            java.lang.Object r6 = r10.next()
            com.facebookpay.offsite.models.message.SummaryPaymentItem r6 = (com.facebookpay.offsite.models.message.SummaryPaymentItem) r6
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r5 = r6.amount
            com.facebookpay.common.models.CurrencyAmount r21 = X.SQ3.A00(r5)
            java.lang.String r7 = r6.label
            java.lang.String r8 = r6.summaryItemType
            X.0qQ.A0B(r8, r0)
            java.util.Map r5 = X.RFW.A01
            java.lang.Object r6 = r5.get(r8)
            X.RFW r6 = (X.RFW) r6
            if (r6 == 0) goto L_0x01e2
            X.RFB r22 = X.RFB.FINAL
            com.facebookpay.expresscheckout.models.PriceInfo r5 = new com.facebookpay.expresscheckout.models.PriceInfo
            r20 = r5
            r23 = r6
            r24 = r19
            r25 = r7
            r26 = r19
            r27 = r19
            r28 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r3.add(r5)
            goto L_0x01a6
        L_0x01e2:
            java.lang.String r0 = "PriceInfoType is not found for identifier => "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r8)
            throw r0
        L_0x01e9:
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r5 = r2.amount
            com.facebookpay.common.models.CurrencyAmount r21 = X.SQ3.A00(r5)
            java.lang.String r5 = r2.label
            X.RFW r23 = X.RFW.TOTAL
            X.RFB r22 = X.RFB.ESTIMATED
            r35 = 0
            com.facebookpay.expresscheckout.models.PriceInfo r2 = new com.facebookpay.expresscheckout.models.PriceInfo
            r20 = r2
            r24 = r19
            r25 = r5
            r26 = r19
            r27 = r19
            r28 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r3.add(r2)
            java.util.ArrayList<com.facebookpay.offsite.models.message.PaymentItem> r2 = r1.displayItems
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r10 = r2.iterator()
        L_0x0215:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0250
            java.lang.Object r2 = r10.next()
            com.facebookpay.offsite.models.message.PaymentItem r2 = (com.facebookpay.offsite.models.message.PaymentItem) r2
            X.0qQ.A0B(r2, r0)
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r6 = r2.amount
            com.facebookpay.common.models.CurrencyAmount r21 = X.SQ3.A00(r6)
            java.lang.String r8 = r2.label
            X.RFB r22 = X.RFB.FINAL
            java.lang.String r7 = r2.quantity
            if (r7 == 0) goto L_0x024d
            r6 = r17
            java.lang.Integer r24 = X.00y.A0m(r7, r6)
        L_0x0238:
            java.lang.String r7 = r2.imageURI
            java.lang.String r6 = r2.secondaryLabel
            com.facebookpay.expresscheckout.models.PriceInfo r2 = new com.facebookpay.expresscheckout.models.PriceInfo
            r20 = r2
            r25 = r8
            r27 = r6
            r28 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r5.add(r2)
            goto L_0x0215
        L_0x024d:
            r24 = 0
            goto L_0x0238
        L_0x0250:
            java.util.List<com.facebookpay.offsite.models.message.PaymentOffer> r0 = r1.offers
            if (r0 == 0) goto L_0x026e
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x025c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0272
            java.lang.Object r0 = r2.next()
            com.facebookpay.offsite.models.message.PaymentOffer r0 = (com.facebookpay.offsite.models.message.PaymentOffer) r0
            java.lang.String r0 = r0.code
            r7.add(r0)
            goto L_0x025c
        L_0x026e:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
        L_0x0272:
            com.facebookpay.expresscheckout.models.PromoCodeList r6 = new com.facebookpay.expresscheckout.models.PromoCodeList
            r6.<init>(r7)
            X.0sn r38 = X.0sn.A00
            com.facebookpay.offsite.models.message.PaymentPickupInfo r0 = r1.pickupInfo
            if (r0 == 0) goto L_0x0296
            java.lang.String r8 = r0.pickupRadiusZipCode
            java.lang.String r7 = r0.pickupName
            java.lang.String r2 = r0.pickupEmail
            java.lang.String r1 = r0.pickupPhone
            java.lang.String r0 = r0.pickupNotes
            com.facebookpay.expresscheckout.models.PickupInfo r19 = new com.facebookpay.expresscheckout.models.PickupInfo
            r20 = r8
            r21 = r7
            r22 = r2
            r23 = r1
            r24 = r0
            r19.<init>(r20, r21, r22, r23, r24)
        L_0x0296:
            com.facebookpay.expresscheckout.models.TransactionInfo r27 = new com.facebookpay.expresscheckout.models.TransactionInfo
            r29 = r19
            r30 = r6
            r31 = r15
            r33 = r9
            r36 = r3
            r37 = r5
            r28 = r4
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r27
        L_0x02aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11090S9p.A00(com.facebookpay.offsite.models.message.PaymentDetails, java.lang.String, java.lang.String):com.facebookpay.expresscheckout.models.TransactionInfo");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r24v8, types: [com.facebookpay.offsite.models.message.PaymentFulfillmentOption] */
    /* JADX WARNING: type inference failed for: r24v9, types: [com.facebookpay.offsite.models.message.PaymentPickupOption] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x025e A[LOOP:7: B:106:0x0258->B:108:0x025e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.offsite.models.message.PaymentDetails A01(com.facebookpay.expresscheckout.models.TransactionInfo r32, com.facebookpay.shippingaddress.model.ShippingAddress r33, com.facebookpay.shippingaddress.model.ShippingAddress r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.util.List r41) {
        /*
            r5 = r32
            r13 = r38
            r9 = r41
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r7 = r5.A08
            r0 = 0
            if (r7 == 0) goto L_0x02a6
            java.util.Iterator r4 = r7.iterator()
        L_0x000f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0090
            java.lang.Object r3 = r4.next()
            r1 = r3
            com.facebookpay.expresscheckout.models.PriceInfo r1 = (com.facebookpay.expresscheckout.models.PriceInfo) r1
            X.RFW r2 = r1.A01
            X.RFW r1 = X.RFW.TOTAL
            if (r2 != r1) goto L_0x000f
        L_0x0022:
            com.facebookpay.expresscheckout.models.PriceInfo r3 = (com.facebookpay.expresscheckout.models.PriceInfo) r3
            if (r3 == 0) goto L_0x02a6
            java.lang.String r4 = r3.A04
            com.facebookpay.common.models.CurrencyAmount r1 = r3.A00
            java.lang.String r3 = r1.A00
            java.lang.String r2 = r1.A01
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r1 = new com.facebookpay.offsite.models.message.PaymentCurrencyAmount
            r1.<init>(r3, r2)
            r21 = 0
            java.lang.String r19 = "1"
            com.facebookpay.offsite.models.message.PaymentItem r17 = new com.facebookpay.offsite.models.message.PaymentItem
            r22 = r21
            r23 = r21
            r24 = r21
            r25 = r21
            r18 = r4
            r20 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r1 = r5.A07
            if (r1 == 0) goto L_0x0092
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r11 = r1.iterator()
        L_0x0054:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0093
            java.lang.Object r10 = r11.next()
            com.facebookpay.expresscheckout.models.PriceInfo r10 = (com.facebookpay.expresscheckout.models.PriceInfo) r10
            java.lang.String r8 = r10.A04
            java.lang.Integer r1 = r10.A02
            java.lang.String r24 = java.lang.String.valueOf(r1)
            com.facebookpay.common.models.CurrencyAmount r1 = r10.A00
            java.lang.String r2 = r1.A00
            java.lang.String r1 = r1.A01
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r6 = new com.facebookpay.offsite.models.message.PaymentCurrencyAmount
            r6.<init>(r2, r1)
            java.lang.String r3 = r10.A03
            java.lang.String r2 = r10.A05
            com.facebookpay.offsite.models.message.PaymentItem r1 = new com.facebookpay.offsite.models.message.PaymentItem
            r22 = r1
            r23 = r8
            r25 = r6
            r26 = r3
            r27 = r2
            r28 = r21
            r29 = r21
            r30 = r21
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            r4.add(r1)
            goto L_0x0054
        L_0x0090:
            r3 = r0
            goto L_0x0022
        L_0x0092:
            r4 = r0
        L_0x0093:
            r6 = r36
            if (r36 == 0) goto L_0x0143
            com.facebookpay.expresscheckout.models.ShippingOptions r1 = r5.A03
            if (r1 == 0) goto L_0x0140
            java.util.ArrayList<com.facebookpay.expresscheckout.models.ShippingOption> r1 = r1.A01
            if (r1 == 0) goto L_0x0140
            java.util.Iterator r3 = r1.iterator()
        L_0x00a3:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x013d
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.facebookpay.expresscheckout.models.ShippingOption r1 = (com.facebookpay.expresscheckout.models.ShippingOption) r1
            java.lang.String r1 = r1.A03
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 == 0) goto L_0x00a3
        L_0x00b8:
            com.facebookpay.expresscheckout.models.ShippingOption r2 = (com.facebookpay.expresscheckout.models.ShippingOption) r2
            if (r2 == 0) goto L_0x0140
            java.lang.String r6 = r2.A03
        L_0x00be:
            r8 = r37
            if (r37 == 0) goto L_0x013a
            com.facebookpay.expresscheckout.models.FulfillmentOptions r1 = r5.A00
            if (r1 == 0) goto L_0x013a
            java.util.ArrayList<com.facebookpay.expresscheckout.models.FulfillmentOption> r1 = r1.A01
            if (r1 == 0) goto L_0x013a
            java.util.Iterator r3 = r1.iterator()
        L_0x00ce:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0138
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.facebookpay.expresscheckout.models.FulfillmentOption r1 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r1
            java.lang.String r1 = r1.A00()
            boolean r1 = X.0qQ.A0K(r1, r8)
            if (r1 == 0) goto L_0x00ce
        L_0x00e5:
            com.facebookpay.expresscheckout.models.FulfillmentOption r2 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r2
            if (r2 == 0) goto L_0x013a
            java.lang.String r23 = r2.A00()
        L_0x00ed:
            com.facebookpay.expresscheckout.models.ShippingOptions r1 = r5.A03
            if (r1 == 0) goto L_0x0146
            java.util.ArrayList<com.facebookpay.expresscheckout.models.ShippingOption> r1 = r1.A01
            if (r1 == 0) goto L_0x0146
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r14 = r1.iterator()
        L_0x00fd:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x014a
            java.lang.Object r2 = r14.next()
            com.facebookpay.expresscheckout.models.ShippingOption r2 = (com.facebookpay.expresscheckout.models.ShippingOption) r2
            java.lang.String r11 = r2.A03
            java.lang.String r10 = r2.A04
            com.facebookpay.common.models.CurrencyAmount r1 = r2.A00
            java.lang.String r12 = r1.A00
            java.lang.String r1 = r1.A01
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r8 = new com.facebookpay.offsite.models.message.PaymentCurrencyAmount
            r8.<init>(r12, r1)
            java.lang.Boolean r28 = X.Pxi.A0R(r11, r6)
            java.lang.String r2 = r2.A02
            int r1 = r2.length()
            if (r1 > 0) goto L_0x0125
            r2 = 0
        L_0x0125:
            com.facebookpay.offsite.models.message.PaymentShippingOption r1 = new com.facebookpay.offsite.models.message.PaymentShippingOption
            r24 = r1
            r25 = r11
            r26 = r10
            r27 = r8
            r29 = r2
            r24.<init>(r25, r26, r27, r28, r29)
            r3.add(r1)
            goto L_0x00fd
        L_0x0138:
            r2 = r0
            goto L_0x00e5
        L_0x013a:
            r23 = r0
            goto L_0x00ed
        L_0x013d:
            r2 = r0
            goto L_0x00b8
        L_0x0140:
            r6 = r0
            goto L_0x00be
        L_0x0143:
            r6 = r0
            goto L_0x00be
        L_0x0146:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
        L_0x014a:
            com.facebookpay.expresscheckout.models.FulfillmentOptions r1 = r5.A00
            if (r1 == 0) goto L_0x01eb
            java.util.ArrayList<com.facebookpay.expresscheckout.models.FulfillmentOption> r1 = r1.A01
            if (r1 == 0) goto L_0x01eb
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r16 = r1.iterator()
        L_0x015a:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x01ef
            java.lang.Object r1 = r16.next()
            com.facebookpay.expresscheckout.models.FulfillmentOption r1 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            boolean r2 = r1 instanceof com.facebookpay.expresscheckout.models.PickupFulfillmentOption
            if (r2 == 0) goto L_0x01c6
            com.facebookpay.expresscheckout.models.PickupFulfillmentOption r1 = (com.facebookpay.expresscheckout.models.PickupFulfillmentOption) r1
            java.lang.String r2 = r1.A03
            r20 = r2
            java.lang.String r2 = r1.A04
            r19 = r2
            com.facebookpay.common.models.CurrencyAmount r2 = r1.A00
            java.lang.String r10 = r2.A00
            java.lang.String r2 = r2.A01
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r12 = new com.facebookpay.offsite.models.message.PaymentCurrencyAmount
            r12.<init>(r10, r2)
            java.util.Date r2 = r1.A06
            r18 = r2
            java.util.Date r15 = r1.A05
            com.facebookpay.shippingaddress.model.ShippingAddress r2 = r1.A02
            com.facebookpay.offsite.models.message.W3CShippingAddress r30 = X.C11299SKj.A00(r2)
            boolean r14 = r1.A07
            com.facebookpay.common.models.Distance r10 = r1.A01
            if (r10 == 0) goto L_0x01c4
            double r1 = r10.A00
            java.lang.Integer r10 = r10.A01
            int r11 = r10.intValue()
            r10 = 1
            if (r11 != r10) goto L_0x01c0
            java.lang.String r11 = "kilometers"
        L_0x01a2:
            com.facebookpay.offsite.models.message.PaymentDistance r10 = new com.facebookpay.offsite.models.message.PaymentDistance
            r10.<init>(r1, r11)
        L_0x01a7:
            com.facebookpay.offsite.models.message.PaymentPickupOption r1 = new com.facebookpay.offsite.models.message.PaymentPickupOption
            r24 = r1
            r25 = r20
            r26 = r19
            r27 = r12
            r28 = r18
            r29 = r15
            r31 = r14
            r32 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x01bc:
            r8.add(r1)
            goto L_0x015a
        L_0x01c0:
            java.lang.String r11 = "miles"
            goto L_0x01a2
        L_0x01c4:
            r10 = 0
            goto L_0x01a7
        L_0x01c6:
            java.lang.String r25 = r1.A00()
            java.lang.String r12 = r1.A01
            com.facebookpay.common.models.CurrencyAmount r2 = r1.A00
            java.lang.String r11 = r2.A00
            java.lang.String r2 = r2.A01
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r10 = new com.facebookpay.offsite.models.message.PaymentCurrencyAmount
            r10.<init>(r11, r2)
            java.util.Date r2 = r1.A03
            java.util.Date r11 = r1.A02
            com.facebookpay.offsite.models.message.PaymentFulfillmentOption r1 = new com.facebookpay.offsite.models.message.PaymentFulfillmentOption
            r24 = r1
            r26 = r12
            r27 = r10
            r28 = r2
            r29 = r11
            r24.<init>(r25, r26, r27, r28, r29)
            goto L_0x01bc
        L_0x01eb:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
        L_0x01ef:
            java.lang.String r1 = "null cannot be cast to non-null type java.util.ArrayList<com.facebookpay.offsite.models.message.PaymentItem>"
            X.0qQ.A0C(r4, r1)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r7.iterator()
        L_0x01fd:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0230
            java.lang.Object r7 = r14.next()
            com.facebookpay.expresscheckout.models.PriceInfo r7 = (com.facebookpay.expresscheckout.models.PriceInfo) r7
            X.RFW r12 = r7.A01
            X.RFW r1 = X.RFW.TOTAL
            if (r12 == r1) goto L_0x01fd
            java.lang.String r11 = r7.A04
            com.facebookpay.common.models.CurrencyAmount r1 = r7.A00
            java.lang.String r7 = r1.A00
            java.lang.String r1 = r1.A01
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r10 = new com.facebookpay.offsite.models.message.PaymentCurrencyAmount
            r10.<init>(r7, r1)
            if (r12 == 0) goto L_0x022b
            java.lang.String r7 = r12.A00
            if (r7 == 0) goto L_0x022b
            com.facebookpay.offsite.models.message.SummaryPaymentItem r1 = new com.facebookpay.offsite.models.message.SummaryPaymentItem
            r1.<init>(r11, r10, r7)
            r2.add(r1)
            goto L_0x01fd
        L_0x022b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0230:
            java.lang.String r1 = "null cannot be cast to non-null type java.util.ArrayList<com.facebookpay.offsite.models.message.SummaryPaymentItem>"
            X.0qQ.A0C(r2, r1)
            r7 = r33
            r1 = r35
            if (r33 == 0) goto L_0x026e
            com.facebookpay.offsite.models.message.W3CShippingAddress r24 = X.C11299SKj.A01(r7, r1)
        L_0x0240:
            r7 = r34
            if (r34 == 0) goto L_0x026b
            com.facebookpay.offsite.models.message.W3CShippingAddress r25 = X.C11299SKj.A01(r7, r1)
        L_0x0248:
            if (r41 != 0) goto L_0x0250
            com.facebookpay.expresscheckout.models.PromoCodeList r1 = r5.A02
            if (r1 == 0) goto L_0x0271
            java.util.List<java.lang.String> r9 = r1.A00
        L_0x0250:
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r9)
            java.util.Iterator r10 = r9.iterator()
        L_0x0258:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0272
            java.lang.String r9 = X.AnonymousClass7TE.A18(r10)
            com.facebookpay.offsite.models.message.PaymentOffer r1 = new com.facebookpay.offsite.models.message.PaymentOffer
            r1.<init>(r9, r0)
            r7.add(r1)
            goto L_0x0258
        L_0x026b:
            r25 = r0
            goto L_0x0248
        L_0x026e:
            r24 = r0
            goto L_0x0240
        L_0x0271:
            r7 = r0
        L_0x0272:
            com.facebookpay.expresscheckout.models.PickupInfo r1 = r5.A01
            if (r1 == 0) goto L_0x028e
            if (r38 != 0) goto L_0x027a
            java.lang.String r13 = r1.A04
        L_0x027a:
            java.lang.String r10 = r1.A01
            java.lang.String r9 = r1.A00
            java.lang.String r5 = r1.A03
            java.lang.String r1 = r1.A02
            com.facebookpay.offsite.models.message.PaymentPickupInfo r0 = new com.facebookpay.offsite.models.message.PaymentPickupInfo
            r11 = r0
            r12 = r13
            r13 = r10
            r14 = r9
            r15 = r5
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x028e:
            com.facebookpay.offsite.models.message.PaymentDetails r16 = new com.facebookpay.offsite.models.message.PaymentDetails
            r28 = r39
            r29 = r40
            r27 = r0
            r18 = r4
            r19 = r2
            r20 = r3
            r21 = r8
            r22 = r6
            r26 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r16
        L_0x02a6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11090S9p.A01(com.facebookpay.expresscheckout.models.TransactionInfo, com.facebookpay.shippingaddress.model.ShippingAddress, com.facebookpay.shippingaddress.model.ShippingAddress, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):com.facebookpay.offsite.models.message.PaymentDetails");
    }
}
