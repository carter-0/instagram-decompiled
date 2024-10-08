package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.VgH  reason: case insensitive filesystem */
public final class C17804VgH {
    public final UserSession A00;
    public final String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        X.0qQ.A0B(r5, 1);
        r8 = new java.util.HashMap();
        r8.putAll(r5.A01);
        r4 = r5.A00;
        r10 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r10.hasNext() == false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        r3 = (com.instagram.api.schemas.ProductVariantPossibleValueDictIntf) r10.next();
        r1 = r3.getId();
        X.0qQ.A0B(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        if (r5.A01.get(r1) != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        if (r11 != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r3.isPreselected() == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        r1 = r3.getId();
        r0 = r3.getValue();
        X.0qQ.A0B(r1, 0);
        X.0qQ.A0B(r0, 1);
        r8.put(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
        if (r1.equals(r0) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d1, code lost:
        r5 = new X.C18448Vrv(r4, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C18588Vuf A00(X.X9L r14, X.C18588Vuf r15) {
        /*
            r13 = this;
            X.W2j r3 = new X.W2j
            r3.<init>(r15)
            com.instagram.user.model.Product r6 = r14.Bft()
            r3.A08 = r6
            com.instagram.user.model.Product r2 = r15.A09
            if (r2 == 0) goto L_0x0019
            java.lang.String r1 = r2.A0H
            java.lang.String r0 = r6.A0H
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r2 = r6
        L_0x001a:
            r3.A09 = r2
            X.Vuf r0 = new X.Vuf
            r0.<init>(r3)
            java.util.List r1 = r14.BZ9()
            java.util.Iterator r12 = r1.iterator()
        L_0x0029:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x01e9
            java.lang.Object r10 = r12.next()
            X.WSU r10 = (X.WSU) r10
            java.lang.Integer r1 = r10.A01
            int r2 = r1.intValue()
            r1 = 28
            if (r2 == r1) goto L_0x01a9
            r1 = 8
            if (r2 == r1) goto L_0x012d
            r1 = 13
            if (r2 == r1) goto L_0x00c6
            r1 = 25
            if (r2 != r1) goto L_0x0029
            X.W2j r7 = new X.W2j
            r7.<init>(r0)
            X.Vrv r5 = r0.A07
            java.util.List r2 = r6.A0O
            if (r2 == 0) goto L_0x01d6
            java.lang.String r1 = r13.A01
            int r0 = r1.hashCode()
            r11 = 1
            switch(r0) {
                case -1683091079: goto L_0x00bd;
                case -1438769962: goto L_0x00ba;
                case -390532548: goto L_0x00b7;
                case 324051100: goto L_0x00b4;
                case 1106896933: goto L_0x00b1;
                case 1562566334: goto L_0x00ae;
                case 1773330491: goto L_0x00ab;
                default: goto L_0x0060;
            }
        L_0x0060:
            r11 = 0
        L_0x0061:
            r9 = 1
            X.0qQ.A0B(r5, r9)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Map r0 = r5.A01
            r8.putAll(r0)
            java.lang.String r4 = r5.A00
            java.util.Iterator r10 = r2.iterator()
        L_0x0075:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r3 = r10.next()
            com.instagram.api.schemas.ProductVariantPossibleValueDictIntf r3 = (com.instagram.api.schemas.ProductVariantPossibleValueDictIntf) r3
            java.lang.String r1 = r3.getId()
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.util.Map r0 = r5.A01
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0075
            if (r11 != 0) goto L_0x0099
            boolean r0 = r3.isPreselected()
            if (r0 == 0) goto L_0x0075
        L_0x0099:
            java.lang.String r1 = r3.getId()
            java.lang.String r0 = r3.getValue()
            X.0qQ.A0B(r1, r2)
            X.0qQ.A0B(r0, r9)
            r8.put(r1, r0)
            goto L_0x0075
        L_0x00ab:
            java.lang.String r0 = "order_details_header"
            goto L_0x00bf
        L_0x00ae:
            java.lang.String r0 = "shopping_bag_item_product_thumbnail"
            goto L_0x00bf
        L_0x00b1:
            java.lang.String r0 = "shopping_product_collection"
            goto L_0x00bf
        L_0x00b4:
            java.lang.String r0 = "shopping_consumer_wishlist_price_drop_activity_feed"
            goto L_0x00bf
        L_0x00b7:
            java.lang.String r0 = "shopping_bag_product_collection"
            goto L_0x00bf
        L_0x00ba:
            java.lang.String r0 = "shopping_consumer_opt_in_restock_activity_feed"
            goto L_0x00bf
        L_0x00bd:
            java.lang.String r0 = "shopping_bag_item_product_name"
        L_0x00bf:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0061
            goto L_0x0060
        L_0x00c6:
            X.W2j r7 = new X.W2j
            r7.<init>(r0)
            X.UrR r10 = (X.C16264UrR) r10
            X.VWl r2 = r0.A05
            java.util.Map r1 = r2.A00
            java.lang.String r9 = r10.A02
            java.lang.Object r0 = r1.get(r9)
            if (r0 != 0) goto L_0x0129
            r0 = 1644(0x66c, float:2.304E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            java.util.Map r8 = X.0u4.A03(r1)
            java.util.Map r5 = r2.A02
            java.util.Map r4 = r2.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.32Q r1 = X.AnonymousClass32Q.A00
            r0 = 0
            X.4n0 r3 = new X.4n0
            r3.<init>(r0, r1, r2)
            X.1XO r0 = r10.A00
            if (r0 == 0) goto L_0x0100
            java.util.List r0 = r0.A06
            X.0qQ.A07(r0)
            r3.A0A(r0)
        L_0x0100:
            X.UXi r0 = r10.A01
            if (r0 == 0) goto L_0x011e
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x01df
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0111:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x011b
            X.C13992Tns.A1A(r2, r1)
            goto L_0x0111
        L_0x011b:
            r3.A0A(r2)
        L_0x011e:
            r3.A06()
            r8.put(r9, r3)
            X.VWl r2 = new X.VWl
            r2.<init>(r8, r5, r4)
        L_0x0129:
            r7.A05 = r2
            goto L_0x01d8
        L_0x012d:
            X.W2j r7 = new X.W2j
            r7.<init>(r0)
            X.UrN r10 = (X.C16260UrN) r10
            X.W1L r9 = r0.A04
            X.VYe r4 = r0.A03
            X.Vsx r0 = r0.A02
            boolean r3 = r0.A06
            com.instagram.common.session.UserSession r2 = r13.A00
            java.util.Map r1 = r9.A05
            java.lang.String r0 = X.W1L.A00(r2, r6)
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x01a6
            X.VuM r8 = new X.VuM
            r8.<init>(r9)
            java.util.List r5 = r10.A00
            r8.A00(r2, r6, r5)
            java.lang.String r4 = r4.A03
            if (r4 == 0) goto L_0x019d
            java.lang.Integer r0 = r9.A03
            if (r0 != 0) goto L_0x019d
            if (r3 != 0) goto L_0x019d
            r3 = 0
            r2 = 0
        L_0x0160:
            int r0 = r5.size()
            if (r2 >= r0) goto L_0x019f
            java.lang.Object r1 = r5.get(r2)
            X.Vjd r1 = (X.C18001Vjd) r1
            boolean r0 = r1 instanceof X.C16272UrZ
            if (r0 == 0) goto L_0x019a
            X.UrZ r1 = (X.C16272UrZ) r1
            X.1Xj r0 = r1.A00
            X.DTv r1 = X.C254423sS.A04(r0, r4)
            if (r1 == 0) goto L_0x019a
            X.Pwf r0 = r1.Bbg()
            if (r0 == 0) goto L_0x019a
            X.Pwf r1 = r1.Bbg()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Long r0 = r1.BEY()
            java.lang.String r0 = X.DbX.A0t(r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x019a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
        L_0x019a:
            int r2 = r2 + 1
            goto L_0x0160
        L_0x019d:
            java.lang.Integer r3 = r9.A03
        L_0x019f:
            r8.A03 = r3
            X.W1L r9 = new X.W1L
            r9.<init>(r8)
        L_0x01a6:
            r7.A04 = r9
            goto L_0x01d8
        L_0x01a9:
            X.W2j r7 = new X.W2j
            r7.<init>(r0)
            X.UrS r10 = (X.C16265UrS) r10
            r5 = 0
            X.Uxz r4 = X.C16605Uxz.UNINITIALIZED
            X.N8v r3 = r10.A01
            java.lang.Long r1 = r3.A02
            r1.getClass()
            java.lang.String r2 = r1.toString()
            X.VYe r0 = r0.A03
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = r0.A01
            if (r1 != 0) goto L_0x01c9
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = r3.A00
            r1.getClass()
        L_0x01c9:
            X.VYe r0 = new X.VYe
            r0.<init>(r1, r5, r4, r2)
            r7.A03 = r0
            goto L_0x01d8
        L_0x01d1:
            X.Vrv r5 = new X.Vrv
            r5.<init>(r4, r8)
        L_0x01d6:
            r7.A07 = r5
        L_0x01d8:
            X.Vuf r0 = new X.Vuf
            r0.<init>(r7)
            goto L_0x0029
        L_0x01df:
            java.lang.String r0 = "mediaFeed"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17804VgH.A00(X.X9L, X.Vuf):X.Vuf");
    }

    public C17804VgH(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }
}
