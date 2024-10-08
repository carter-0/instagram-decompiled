package com.instagram.inappbrowser.expandablefooter.retailads.viewmodel;

import X.05G;
import X.0qQ;
import X.0sn;
import X.106;
import com.instagram.common.session.UserSession;

public final class IGMetadataFooterRepository {
    public final UserSession A00;
    public final 05G A01 = 106.A01(0sn.A00);

    public IGMetadataFooterRepository(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.1Xj r21, X.C46212DQp r22, X.AnonymousClass4D7 r23) {
        /*
            r20 = this;
            r1 = r22
            r4 = 38
            r6 = r23
            boolean r0 = X.C66137MDp.A02(r4, r6)
            r7 = r20
            if (r0 == 0) goto L_0x010f
            r5 = r6
            X.MDp r5 = (X.C66137MDp) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x010f
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x001c:
            java.lang.Object r3 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r2 = r5.A00
            r0 = 1
            if (r2 == 0) goto L_0x00ba
            if (r2 != r0) goto L_0x011b
            java.lang.Object r1 = r5.A01
            X.DQp r1 = (X.C46212DQp) r1
            X.0eS.A00(r3)
        L_0x002e:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r2 = r3 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x00b2
            X.3lr r6 = X.C41846B3n.A0R(r3)
            r4 = 0
            if (r6 == 0) goto L_0x00ad
            java.lang.Class<X.C3q> r5 = X.C43642C3q.class
            java.lang.String r3 = "xdt_iab_metadata(data:{\"media_id\":$media_id})"
            r2 = -1684404323(0xffffffff9b9a079d, float:-2.5482083E-22)
            X.3lr r6 = r6.A05(r5, r3, r2)
            if (r6 == 0) goto L_0x00ad
            java.lang.Class<X.C3p> r5 = X.C43641C3p.class
            java.lang.String r3 = "metadata"
            r2 = 1744145919(0x67f58dff, float:2.3191983E24)
            X.3lr r6 = r6.getOptionalTreeField(r0, r3, r5, r2)
            if (r6 == 0) goto L_0x00ad
            X.Kio r3 = X.C62617Kio.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "footer_format"
            java.lang.Enum r8 = r6.getOptionalEnumField(r0, r2, r3)
            X.Kio r8 = (X.C62617Kio) r8
            if (r8 != 0) goto L_0x0063
            X.Kio r8 = X.C62617Kio.BASIC
        L_0x0063:
            java.lang.Class<X.C3o> r7 = X.C43640C3o.class
            r5 = 0
            java.lang.String r3 = "comments"
            r2 = -411592462(0xffffffffe77798f2, float:-1.1692459E24)
            com.google.common.collect.ImmutableList r2 = r6.getOptionalCompactedTreeListField(r5, r3, r7, r2)
            if (r2 == 0) goto L_0x00b0
            java.lang.Object r2 = X.00k.A0J(r2)
            X.3lr r2 = (X.C250663lr) r2
            if (r2 == 0) goto L_0x00b0
            java.lang.String r9 = X.C41847B3o.A18(r2)
        L_0x007d:
            java.lang.String r5 = "footer_delay"
            int r11 = r6.A00(r5)
            boolean r13 = r6.hasFieldValue(r5)
            r3 = 4
            java.lang.String r2 = "comment_count"
            java.lang.String r10 = r6.getRequiredStringField(r3, r2)
            X.0qQ.A07(r10)
            boolean r14 = r6.hasFieldValue(r5)
            int r12 = r6.A00(r5)
            r3 = 3
            java.lang.String r2 = "allow_footer_tap"
            boolean r15 = r6.getCoercedBooleanField(r3, r2)
            X.JuH r7 = new X.JuH
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            X.N4R r2 = new X.N4R
            r2.<init>((X.C61052Jvq) r4, (X.C60959JuH) r7, (int) r0)
            r1.DoD(r2)
        L_0x00ad:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x00b0:
            r9 = r4
            goto L_0x007d
        L_0x00b2:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0116
            r1.onFailure()
            goto L_0x00ad
        L_0x00ba:
            X.0eS.A00(r3)
            com.instagram.common.session.UserSession r2 = r7.A00
            X.1vn r3 = X.1vm.A01(r2)
            r2 = r21
            X.1Xy r2 = r2.A0C
            java.lang.String r6 = r2.getPk()
            if (r6 == 0) goto L_0x00ad
            r15 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            java.lang.String r2 = "media_id"
            r8.A04(r2, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.String r2 = "fetchComments"
            r8.A02(r2, r6)
            X.1vR r9 = X.C41845B3m.A05()
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.C3r> r13 = X.C43643C3r.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "IABMetadataContentQuery"
            r14 = 0
            java.lang.String r18 = "xdt_iab_metadata"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5.A01 = r1
            r5.A00 = r0
            java.lang.Object r3 = r3.A04(r8, r5)
            if (r3 != r4) goto L_0x002e
            return r4
        L_0x010f:
            X.MDp r5 = new X.MDp
            r5.<init>(r7, r6, r4)
            goto L_0x001c
        L_0x0116:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x011b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.expandablefooter.retailads.viewmodel.IGMetadataFooterRepository.A00(X.1Xj, X.DQp, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        if (r8 != null) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C46212DQp r21, java.lang.String r22, X.AnonymousClass4D7 r23) {
        /*
            r20 = this;
            r1 = r21
            r6 = 45
            r7 = r23
            boolean r0 = X.C66145MDx.A02(r6, r7)
            r5 = r20
            if (r0 == 0) goto L_0x010f
            r4 = r7
            X.MDx r4 = (X.C66145MDx) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x010f
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x001c:
            java.lang.Object r7 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x00c2
            if (r0 != r2) goto L_0x011b
            java.lang.Object r1 = r4.A02
            X.DQp r1 = (X.C46212DQp) r1
            java.lang.Object r6 = r4.A01
            com.instagram.inappbrowser.expandablefooter.retailads.viewmodel.IGMetadataFooterRepository r6 = (com.instagram.inappbrowser.expandablefooter.retailads.viewmodel.IGMetadataFooterRepository) r6
            X.0eS.A00(r7)
        L_0x0032:
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r0 = r7 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00ba
            X.3lr r8 = X.C41846B3n.A0R(r7)
            if (r8 == 0) goto L_0x00b7
            java.lang.Class<X.C4K> r4 = X.C4K.class
            java.lang.String r3 = "xdt_ig_ad_product_recommender_products(client_token:$client_token)"
            r0 = 2147378330(0x7ffe649a, float:NaN)
            X.3lr r5 = r8.A05(r4, r3, r0)
            if (r5 == 0) goto L_0x00b7
            java.lang.Class<X.C4J> r4 = X.C4J.class
            java.lang.String r3 = "edges"
            r0 = -1592230587(0xffffffffa1187d45, float:-5.1665396E-19)
            com.google.common.collect.ImmutableList r7 = r5.getRequiredCompactedTreeListField(r2, r3, r4, r0)
            if (r7 == 0) goto L_0x00b7
        L_0x0058:
            X.05G r0 = r6.A01
            r0.Epw(r7)
            r2 = 0
            if (r8 == 0) goto L_0x00b3
            java.lang.Class<X.C4K> r4 = X.C4K.class
            java.lang.String r3 = "xdt_ig_ad_product_recommender_products(client_token:$client_token)"
            r0 = 2147378330(0x7ffe649a, float:NaN)
            X.3lr r5 = r8.getRequiredTreeField(r2, r3, r4, r0)
            if (r5 == 0) goto L_0x00b3
            java.lang.Class<X.C4H> r4 = X.C4H.class
            java.lang.String r3 = "configuration"
            r0 = 446915483(0x1aa3639b, float:6.757614E-23)
            X.3lr r3 = r5.getOptionalTreeField(r2, r3, r4, r0)
            if (r3 == 0) goto L_0x00b3
            java.lang.String r0 = "dwell_time_ms"
            int r6 = r3.getCoercedIntField(r2, r0)
        L_0x0080:
            java.lang.Class<X.C4K> r4 = X.C4K.class
            java.lang.String r3 = "xdt_ig_ad_product_recommender_products(client_token:$client_token)"
            r0 = 2147378330(0x7ffe649a, float:NaN)
            X.3lr r5 = r8.getRequiredTreeField(r2, r3, r4, r0)
            if (r5 == 0) goto L_0x00a0
            java.lang.Class<X.C4H> r4 = X.C4H.class
            java.lang.String r3 = "configuration"
            r0 = 446915483(0x1aa3639b, float:6.757614E-23)
            X.3lr r3 = r5.getOptionalTreeField(r2, r3, r4, r0)
            if (r3 == 0) goto L_0x00a0
            java.lang.String r0 = "dwell_time_ms"
            boolean r2 = r3.hasFieldValue(r0)
        L_0x00a0:
            r0 = 3
            X.Jvq r4 = new X.Jvq
            r4.<init>((java.util.List) r7, (int) r6, (int) r0, (boolean) r2)
            r3 = 2
            r2 = 0
            X.N4R r0 = new X.N4R
            r0.<init>((X.C61052Jvq) r4, (X.C60959JuH) r2, (int) r3)
            r1.DoD(r0)
        L_0x00b0:
            X.0gF r3 = X.C60340gF.A00
        L_0x00b2:
            return r3
        L_0x00b3:
            r6 = 0
            if (r8 == 0) goto L_0x00a0
            goto L_0x0080
        L_0x00b7:
            X.0sn r7 = X.0sn.A00
            goto L_0x0058
        L_0x00ba:
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0116
            r1.onFailure()
            goto L_0x00b0
        L_0x00c2:
            X.0eS.A00(r7)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1vn r0 = X.1vm.A01(r0)
            r15 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            r6 = 70
            java.lang.String r6 = X.C273654mx.A00(r6)
            r9 = r22
            boolean r6 = X.C41848B3p.A1Z(r8, r6, r9)
            X.1vR r9 = X.C41845B3m.A06(r6)
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.C4L> r13 = X.C4L.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "IGProductRecommenderContentQuery"
            r14 = 0
            java.lang.String r18 = "xdt_ig_ad_product_recommender_products"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4.A01 = r5
            r4.A02 = r1
            r4.A00 = r2
            java.lang.Object r7 = r0.A04(r8, r4)
            if (r7 == r3) goto L_0x00b2
            r6 = r5
            goto L_0x0032
        L_0x010f:
            X.MDx r4 = new X.MDx
            r4.<init>(r5, r7, r6)
            goto L_0x001c
        L_0x0116:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x011b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.expandablefooter.retailads.viewmodel.IGMetadataFooterRepository.A01(X.DQp, java.lang.String, X.4D7):java.lang.Object");
    }
}
