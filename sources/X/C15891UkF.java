package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.UkF  reason: case insensitive filesystem */
public final class C15891UkF extends C230372pW {
    public final C18757Vzs A00;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        GMQ gmq = (GMQ) obj;
        0qQ.A0B(gmq, 0);
        V1Z v1z = (V1Z) gmq.A01;
        C61069Jw7 jw7 = (C61069Jw7) gmq.A02;
        Product product = (Product) gmq.A06;
        this.A00.A02(v1z, (V1Y) gmq.A05, jw7, (1Xj) gmq.A03, product, (User) gmq.A04, (Integer) gmq.A07, 0Yt.A0E());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        if (r8 != null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013f, code lost:
        if (r8 != null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0141, code lost:
        r1 = r8.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0145, code lost:
        r1 = X.C13992Tns.A0F(r4, r7, r1);
        r0 = "signal_type";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A04(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            X.GMQ r13 = (X.GMQ) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            X.Vzs r6 = r12.A00
            java.lang.Object r11 = r13.A05
            X.V1Y r11 = (X.V1Y) r11
            java.lang.Object r2 = r13.A01
            X.V1Z r2 = (X.V1Z) r2
            java.lang.Object r8 = r13.A07
            java.lang.Object r7 = r13.A02
            X.Jw7 r7 = (X.C61069Jw7) r7
            java.lang.Object r10 = r13.A06
            com.instagram.user.model.Product r10 = (com.instagram.user.model.Product) r10
            java.lang.Object r5 = r13.A03
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r9 = r13.A04
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            X.0qQ.A0B(r11, r0)
            X.AnonymousClass7TG.A1P(r2, r7)
            X.0wc r1 = r6.A04
            java.lang.String r0 = "commerce_reconsideration_sub_impression"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x005f
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            X.C18757Vzs.A01(r11, r2, r4, r6)
            java.lang.String r1 = r6.A08
            if (r1 == 0) goto L_0x004b
            r0 = 1548(0x60c, float:2.169E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.AAJ(r0, r1)
        L_0x004b:
            int r2 = r2.ordinal()
            r0 = 179(0xb3, float:2.51E-43)
            r1 = 0
            if (r2 == r0) goto L_0x0094
            switch(r2) {
                case 82: goto L_0x008c;
                case 113: goto L_0x011b;
                case 254: goto L_0x0060;
                default: goto L_0x0057;
            }
        L_0x0057:
            java.lang.String r0 = "extra_data"
            r4.A9H(r0, r3)
            r4.Cgf()
        L_0x005f:
            return
        L_0x0060:
            if (r10 == 0) goto L_0x008a
            java.lang.String r0 = r10.A0H
            if (r0 == 0) goto L_0x008a
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r0)
        L_0x006a:
            java.lang.String r0 = "product_id"
            r4.A9F(r0, r2)
            if (r10 == 0) goto L_0x0088
            com.instagram.user.model.User r0 = r10.A0B
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x0088
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r0)
        L_0x007f:
            java.lang.String r0 = "merchant_id"
            r4.A9F(r0, r2)
            if (r8 == 0) goto L_0x0145
            goto L_0x0141
        L_0x0088:
            r2 = r1
            goto L_0x007f
        L_0x008a:
            r2 = r1
            goto L_0x006a
        L_0x008c:
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "position"
            goto L_0x014b
        L_0x0094:
            if (r10 == 0) goto L_0x0119
            java.lang.String r0 = r10.A0H
            if (r0 == 0) goto L_0x0119
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r0)
        L_0x009e:
            java.lang.String r0 = "product_id"
            r4.A9F(r0, r2)
            if (r10 == 0) goto L_0x00b5
            com.instagram.user.model.User r0 = r10.A0B
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x00b5
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r0)
            if (r2 != 0) goto L_0x00c9
        L_0x00b5:
            if (r5 == 0) goto L_0x00c3
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r5)
            if (r0 == 0) goto L_0x00c3
            java.lang.Long r2 = X.C51972G9s.A0h(r0)
            if (r2 != 0) goto L_0x00c9
        L_0x00c3:
            if (r9 == 0) goto L_0x0117
            java.lang.Long r2 = X.C51972G9s.A0h(r9)
        L_0x00c9:
            java.lang.String r0 = "merchant_id"
            r4.A9F(r0, r2)
            if (r8 == 0) goto L_0x0115
            java.lang.String r0 = r8.toString()
        L_0x00d4:
            java.lang.String r2 = X.C13992Tns.A0F(r4, r7, r0)
            java.lang.String r0 = "signal_type"
            r4.AAJ(r0, r2)
            java.lang.String r0 = X.C51969G9p.A0u(r5)
            X.C51965G9l.A1I(r4, r0)
            if (r5 == 0) goto L_0x0113
            X.1iA r0 = r5.BR7()
            java.lang.String r2 = r0.name()
        L_0x00ee:
            java.lang.String r0 = "m_t"
            r4.AAJ(r0, r2)
            if (r5 == 0) goto L_0x0111
            com.instagram.common.session.UserSession r0 = r6.A05
            java.lang.String r0 = X.C231122qu.A07(r0, r5)
            if (r0 == 0) goto L_0x0111
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
        L_0x0101:
            X.C51965G9l.A1D(r4, r0)
            if (r5 == 0) goto L_0x010e
            com.instagram.model.mediatype.ProductType r0 = r5.A1v()
            if (r0 == 0) goto L_0x010e
            java.lang.String r1 = r0.A00
        L_0x010e:
            java.lang.String r0 = "media_product_type"
            goto L_0x014b
        L_0x0111:
            r0 = r1
            goto L_0x0101
        L_0x0113:
            r2 = r1
            goto L_0x00ee
        L_0x0115:
            r0 = r1
            goto L_0x00d4
        L_0x0117:
            r2 = r1
            goto L_0x00c9
        L_0x0119:
            r2 = r1
            goto L_0x009e
        L_0x011b:
            if (r10 == 0) goto L_0x0152
            java.lang.String r0 = r10.A0H
            if (r0 == 0) goto L_0x0152
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r0)
        L_0x0125:
            java.lang.String r0 = "product_id"
            r4.A9F(r0, r2)
            if (r10 == 0) goto L_0x0150
            com.instagram.user.model.User r0 = r10.A0B
            if (r0 == 0) goto L_0x0150
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x0150
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r0)
        L_0x013a:
            java.lang.String r0 = "merchant_id"
            r4.A9F(r0, r2)
            if (r8 == 0) goto L_0x0145
        L_0x0141:
            java.lang.String r1 = r8.toString()
        L_0x0145:
            java.lang.String r1 = X.C13992Tns.A0F(r4, r7, r1)
            java.lang.String r0 = "signal_type"
        L_0x014b:
            r4.AAJ(r0, r1)
            goto L_0x0057
        L_0x0150:
            r2 = r1
            goto L_0x013a
        L_0x0152:
            r2 = r1
            goto L_0x0125
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15891UkF.A04(java.lang.Object, java.lang.Object):void");
    }

    public C15891UkF(UserSession userSession, C18757Vzs vzs) {
        super(C13988Tno.A0K(userSession));
        this.A00 = vzs;
    }
}
