package X;

/* renamed from: X.Veg  reason: case insensitive filesystem */
public final class C17757Veg {
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b5, code lost:
        if (r9.contains(X.C16497Uvt.FREE_SHIPPING) != false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0102, code lost:
        if (new java.math.BigDecimal(r0.getAmountWithOffset()).equals(java.math.BigDecimal.ZERO) != true) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableStringBuilder A00(android.content.Context r14, com.instagram.common.session.UserSession r15, com.instagram.user.model.Product r16, java.lang.Boolean r17, java.lang.String r18, boolean r19, boolean r20) {
        /*
            r13 = this;
            r1 = r18
            r4 = 1
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            r3 = r16
            if (r18 != 0) goto L_0x0018
            boolean r0 = r3.A05()
            if (r0 == 0) goto L_0x01f4
            java.lang.String r1 = r3.A0G
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = ""
        L_0x0018:
            java.lang.String r0 = r3.A0L
            android.text.SpannableStringBuilder r0 = X.C324476zN.A04(r14, r0, r1)
        L_0x001e:
            r2.append(r0)
            java.lang.String r1 = r3.A0K
            if (r1 == 0) goto L_0x003e
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x003e
            boolean r0 = r3.A05()
            android.text.SpannableStringBuilder r1 = X.C324476zN.A02(r14, r15, r1, r0)
            if (r20 == 0) goto L_0x003e
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r2.append(r0)
            r0.append(r1)
        L_0x003e:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            r1 = 0
            if (r0 == 0) goto L_0x0065
            java.lang.Long r0 = r0.BeS()
            if (r0 == 0) goto L_0x0065
            long r7 = r0.longValue()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r5
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            if (r0 == 0) goto L_0x0065
            boolean r0 = r3.A06()
            if (r0 == 0) goto L_0x0065
            r0 = 2131969724(0x7f1346bc, float:1.9576379E38)
            java.lang.String r1 = r14.getString(r0)
        L_0x0065:
            com.instagram.api.schemas.LoyaltyToplineInfoDict r7 = r3.A03
            com.instagram.api.schemas.ProductAffiliateInformationDict r5 = r3.A04
            java.lang.String r8 = " · "
            if (r1 == 0) goto L_0x0075
            android.text.SpannableStringBuilder r0 = r2.append(r8)
            r0.append(r1)
        L_0x0074:
            return r2
        L_0x0075:
            if (r5 == 0) goto L_0x01f1
            java.lang.String r0 = r5.ApW()
        L_0x007b:
            r12 = 0
            if (r0 == 0) goto L_0x0091
            android.text.SpannableStringBuilder r3 = r2.append(r8)
            r1 = 2131952521(0x7f130389, float:1.9541487E38)
            java.lang.String r0 = r5.ApW()
            java.lang.String r0 = X.DbW.A0h(r14, r0, r1)
        L_0x008d:
            r3.append(r0)
            return r2
        L_0x0091:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r0 = r17
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x00b6
            X.0Tu r5 = X.0Tu.A05
            r0 = 36313858293369100(0x8103430000090c, double:3.028368436672642E-306)
            boolean r0 = X.182.A06(r5, r15, r0)
            if (r0 == 0) goto L_0x00b6
            android.text.SpannableStringBuilder r3 = r2.append(r8)
            r0 = 2131974090(0x7f1357ca, float:1.9585234E38)
        L_0x00b1:
            java.lang.String r0 = r14.getString(r0)
            goto L_0x008d
        L_0x00b6:
            if (r7 == 0) goto L_0x00ce
            java.lang.Boolean r0 = r7.Cee()
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x00ce
            android.text.SpannableStringBuilder r1 = r2.append(r8)
            java.lang.String r0 = r7.BOk()
            r1.append(r0)
            return r2
        L_0x00ce:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x0074
            java.lang.Boolean r0 = r0.A05
            boolean r11 = X.0qQ.A0K(r0, r6)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            X.0qQ.A0A(r0)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            X.0qQ.A0A(r0)
            com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata r0 = r0.A01
            if (r0 == 0) goto L_0x0104
            com.instagram.model.payments.CurrencyAmountInfo r0 = r0.Bo7()
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = r0.getAmountWithOffset()
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r0)
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            boolean r0 = r1.equals(r0)
            r10 = 1
            if (r0 == r4) goto L_0x0105
        L_0x0104:
            r10 = 0
        L_0x0105:
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x01aa
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x01aa
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r3.A01
            com.instagram.api.schemas.ProductArtsLabelsDict r0 = r1.A04
            if (r0 != 0) goto L_0x01aa
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.instagram.api.schemas.SellerBadgeDict r0 = r1.A08
            if (r0 == 0) goto L_0x013e
            com.instagram.api.schemas.SellerBadgeSurfaces r1 = com.instagram.api.schemas.SellerBadgeSurfaces.PRODUCT_DESCRIPTION_PAGE
            java.util.List r0 = r0.C3O()
            if (r0 == 0) goto L_0x013e
            boolean r0 = r0.contains(r1)
            if (r0 != r4) goto L_0x013e
            X.0Tu r4 = X.0Tu.A05
            r0 = 36313815343696131(0x81033900000903, double:3.028341275126512E-306)
            boolean r0 = X.182.A06(r4, r15, r0)
            if (r0 != 0) goto L_0x013e
            X.UwD r0 = X.UwD.SELLER_BADGE
            r5.add(r0)
        L_0x013e:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x01a8
            java.lang.Boolean r0 = r0.A05
            boolean r1 = X.0qQ.A0K(r0, r6)
        L_0x014a:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x01a6
            java.lang.Boolean r0 = r0.A06
            boolean r0 = X.0qQ.A0K(r0, r6)
        L_0x0156:
            if (r1 == 0) goto L_0x015f
            if (r0 != 0) goto L_0x015f
            X.UwD r0 = X.UwD.FREE_SHIPPING
            r5.add(r0)
        L_0x015f:
            X.UwD r0 = X.UwD.FREE_SHIPPING
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x01b7
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            com.instagram.api.schemas.ProductArtsLabelsDict r0 = r0.A04
            if (r0 == 0) goto L_0x01ad
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x01ad
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x0179:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01af
            java.lang.Object r0 = r8.next()
            com.instagram.api.schemas.ProductArtsLabelInformationDict r0 = (com.instagram.api.schemas.ProductArtsLabelInformationDict) r0
            java.lang.String r7 = r0.getLabelType()
            X.Uvt[] r6 = X.C16497Uvt.values()
            int r4 = r6.length
            r3 = 0
        L_0x018f:
            if (r3 >= r4) goto L_0x01a0
            r1 = r6[r3]
            java.lang.String r0 = r1.name()
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 != 0) goto L_0x01a2
            int r3 = r3 + 1
            goto L_0x018f
        L_0x01a0:
            X.Uvt r1 = X.C16497Uvt.UNKNOWN
        L_0x01a2:
            r9.add(r1)
            goto L_0x0179
        L_0x01a6:
            r0 = 0
            goto L_0x0156
        L_0x01a8:
            r1 = 0
            goto L_0x014a
        L_0x01aa:
            X.0sn r5 = X.0sn.A00
            goto L_0x015f
        L_0x01ad:
            X.0sn r9 = X.0sn.A00
        L_0x01af:
            X.Uvt r0 = X.C16497Uvt.FREE_SHIPPING
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x01b8
        L_0x01b7:
            r12 = 1
        L_0x01b8:
            X.UwD r0 = X.UwD.RETURNS
            boolean r1 = r5.contains(r0)
            int r3 = r2.length()
            java.lang.String r0 = " + "
            if (r11 == 0) goto L_0x01e2
            if (r10 == 0) goto L_0x01d5
            if (r12 != 0) goto L_0x01d5
            if (r1 != 0) goto L_0x01d5
            android.text.SpannableStringBuilder r3 = r2.append(r0)
            r0 = 2131962675(0x7f132b33, float:1.9562082E38)
            goto L_0x00b1
        L_0x01d5:
            if (r19 != 0) goto L_0x01d9
            if (r12 != 0) goto L_0x01e2
        L_0x01d9:
            android.text.SpannableStringBuilder r3 = r2.append(r0)
            r0 = 2131962676(0x7f132b34, float:1.9562084E38)
            goto L_0x00b1
        L_0x01e2:
            if (r10 == 0) goto L_0x0203
            if (r19 != 0) goto L_0x01e8
            if (r1 != 0) goto L_0x0203
        L_0x01e8:
            android.text.SpannableStringBuilder r3 = r2.append(r0)
            r0 = 2131962673(0x7f132b31, float:1.9562078E38)
            goto L_0x00b1
        L_0x01f1:
            r0 = 0
            goto L_0x007b
        L_0x01f4:
            java.lang.String r1 = r3.A0L
            r0 = 2132018041(0x7f140379, float:1.9674377E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.CharSequence r0 = X.C324476zN.A09(r14, r1, r0)
            goto L_0x001e
        L_0x0203:
            r1 = 2132017467(0x7f14013b, float:1.9673213E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r14, r1)
            X.C51971G9r.A0y(r2, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17757Veg.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.user.model.Product, java.lang.Boolean, java.lang.String, boolean, boolean):android.text.SpannableStringBuilder");
    }
}
