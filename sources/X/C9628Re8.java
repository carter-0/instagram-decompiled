package X;

/* renamed from: X.Re8  reason: case insensitive filesystem */
public abstract class C9628Re8 {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r4 = X.C7649QRq.class;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.incentives.model.ECPIncentive A00(X.C7699QTo r16) {
        /*
            X.RGS r5 = X.RGS.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r3 = 1
            java.lang.String r2 = "incentive_type"
            r0 = r16
            java.lang.Enum r1 = r0.getOptionalEnumField(r3, r2, r5)
            X.RGS r1 = (X.RGS) r1
            if (r1 != 0) goto L_0x0020
            r1 = -1
        L_0x0010:
            r6 = 4
            r4 = 0
            java.lang.String r9 = "Required value was null."
            if (r1 == r6) goto L_0x0025
            r6 = 7
            if (r1 == r6) goto L_0x0025
            r6 = 3
            if (r1 == r6) goto L_0x009d
            r6 = 6
            if (r1 == r6) goto L_0x009d
            return r4
        L_0x0020:
            int r1 = r1.ordinal()
            goto L_0x0010
        L_0x0025:
            java.lang.String r1 = "incentive_id"
            java.lang.String r11 = r0.A07(r1)
            if (r11 == 0) goto L_0x0141
            java.lang.String r1 = "title"
            java.lang.String r12 = r0.A0B(r1)
            if (r12 == 0) goto L_0x013c
            java.lang.String r1 = "subtitle"
            java.lang.String r13 = r0.A0C(r1)
            java.lang.Enum r10 = r0.getOptionalEnumField(r3, r2, r5)
            X.RGS r10 = (X.RGS) r10
            if (r10 == 0) goto L_0x0137
            r2 = 3
            java.lang.String r1 = "is_best_offer"
            boolean r16 = r0.getCoercedBooleanField(r2, r1)
            java.lang.String r1 = "incentive_credential_id"
            java.lang.String r14 = r0.A09(r1)
            if (r14 == 0) goto L_0x0132
            r2 = 6
            java.lang.String r1 = "expiration_date_text"
            java.lang.String r15 = r0.getOptionalStringField(r2, r1)
            if (r15 == 0) goto L_0x012d
            java.lang.Class<X.QTn> r8 = X.C7698QTn.class
            r7 = 7
            java.lang.String r6 = "discount_amount"
            r5 = -748553028(0xffffffffd361fcbc, float:-9.7060782E11)
            X.3lr r1 = r0.getOptionalTreeField(r7, r6, r8, r5)
            if (r1 == 0) goto L_0x0128
            java.lang.Class<X.QRq> r4 = X.C7649QRq.class
            r3 = 98567921(0x5e006f1, float:2.1067409E-35)
            X.3lr r2 = r1.A01(r4, r3)
            if (r2 == 0) goto L_0x0128
            java.lang.String r1 = "currency"
            java.lang.String r2 = r2.A07(r1)
            if (r2 == 0) goto L_0x0128
            X.3lr r0 = r0.getOptionalTreeField(r7, r6, r8, r5)
            if (r0 == 0) goto L_0x0123
            X.3lr r1 = r0.A01(r4, r3)
            if (r1 == 0) goto L_0x0123
            java.lang.String r0 = "amount"
            java.lang.String r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0123
            com.facebookpay.common.models.CurrencyAmount r9 = new com.facebookpay.common.models.CurrencyAmount
            r9.<init>(r2, r0)
            com.facebookpay.incentives.model.ECPOnsiteOffer r8 = new com.facebookpay.incentives.model.ECPOnsiteOffer
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0107
        L_0x009d:
            java.lang.String r1 = "promo_code"
            java.lang.String r11 = r0.A0D(r1)
            if (r11 == 0) goto L_0x011e
            java.lang.String r1 = "title"
            java.lang.String r12 = r0.A0B(r1)
            if (r12 == 0) goto L_0x0119
            java.lang.String r1 = "incentive_id"
            java.lang.String r13 = r0.A07(r1)
            java.lang.String r1 = "subtitle"
            java.lang.String r14 = r0.A0C(r1)
            java.lang.Enum r3 = r0.getOptionalEnumField(r3, r2, r5)
            X.RGS r3 = (X.RGS) r3
            if (r3 == 0) goto L_0x0114
            r2 = 3
            java.lang.String r1 = "is_best_offer"
            boolean r16 = r0.getCoercedBooleanField(r2, r1)
            r2 = 6
            java.lang.String r1 = "expiration_date_text"
            java.lang.String r15 = r0.getOptionalStringField(r2, r1)
            java.lang.Class<X.QTn> r6 = X.C7698QTn.class
            r5 = 7
            java.lang.String r2 = "discount_amount"
            r1 = -748553028(0xffffffffd361fcbc, float:-9.7060782E11)
            X.3lr r2 = r0.getOptionalTreeField(r5, r2, r6, r1)
            if (r2 == 0) goto L_0x0100
            java.lang.Class<X.QRq> r1 = X.C7649QRq.class
            r0 = 98567921(0x5e006f1, float:2.1067409E-35)
            X.3lr r2 = r2.A01(r1, r0)
            if (r2 == 0) goto L_0x0100
            java.lang.String r0 = "currency"
            java.lang.String r1 = r2.A07(r0)
            if (r1 == 0) goto L_0x010f
            java.lang.String r0 = "amount"
            java.lang.String r0 = r2.A08(r0)
            if (r0 == 0) goto L_0x010a
            com.facebookpay.common.models.CurrencyAmount r4 = new com.facebookpay.common.models.CurrencyAmount
            r4.<init>(r1, r0)
        L_0x0100:
            com.facebookpay.incentives.model.ECPOffsiteOffer r8 = new com.facebookpay.incentives.model.ECPOffsiteOffer
            r9 = r4
            r10 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0107:
            com.facebookpay.incentives.model.ECPIncentive r8 = (com.facebookpay.incentives.model.ECPIncentive) r8
            return r8
        L_0x010a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x010f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0114:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0119:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x011e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0123:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0128:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x012d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0132:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0137:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x013c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0141:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9628Re8.A00(X.QTo):com.facebookpay.incentives.model.ECPIncentive");
    }
}
