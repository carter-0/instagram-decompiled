package com.instagram.profile.productsonprofile.producttab.ui;

import X.05G;
import X.0qQ;
import X.JTO;
import com.instagram.common.session.UserSession;

public final class ProductTabRepository {
    public final UserSession A00;
    public final 05G A01 = JTO.A1J();

    public ProductTabRepository(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e1, code lost:
        if (r6 != null) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C63741L4z r19, java.lang.String r20, X.AnonymousClass4D7 r21, int r22) {
        /*
            r18 = this;
            r1 = r19
            r6 = 22
            r7 = r21
            boolean r0 = X.ME9.A03(r6, r7)
            r5 = r18
            if (r0 == 0) goto L_0x013d
            r4 = r7
            X.ME9 r4 = (X.ME9) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x013d
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x001c:
            java.lang.Object r6 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x00e8
            if (r0 != r2) goto L_0x014c
            java.lang.Object r1 = r4.A02
            X.L4z r1 = (X.C63741L4z) r1
            java.lang.Object r8 = r4.A01
            com.instagram.profile.productsonprofile.producttab.ui.ProductTabRepository r8 = (com.instagram.profile.productsonprofile.producttab.ui.ProductTabRepository) r8
            X.0eS.A00(r6)
        L_0x0032:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0143
            X.3lr r6 = X.C41846B3n.A0R(r6)
            if (r6 == 0) goto L_0x00e4
            java.lang.Class<X.C4F> r4 = X.C4F.class
            r0 = 828(0x33c, float:1.16E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            r0 = -705124832(0xffffffffd5f8a620, float:-3.41740481E13)
            X.3lr r7 = r6.A05(r4, r3, r0)
            if (r7 == 0) goto L_0x00e4
            java.lang.Class<X.C4E> r5 = X.C4E.class
            r4 = 2
            java.lang.String r3 = "products"
            r0 = 962426465(0x395d7661, float:2.1120302E-4)
            com.google.common.collect.ImmutableList r9 = r7.getOptionalCompactedTreeListField(r4, r3, r5, r0)
            if (r9 == 0) goto L_0x00e4
        L_0x005d:
            X.05G r0 = r8.A01
            r0.Epw(r9)
            r7 = 0
            if (r6 == 0) goto L_0x00e0
            java.lang.Class<X.C4F> r4 = X.C4F.class
            r0 = 828(0x33c, float:1.16E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            r0 = -705124832(0xffffffffd5f8a620, float:-3.41740481E13)
            X.3lr r3 = r6.getRequiredTreeField(r7, r3, r4, r0)
            if (r3 == 0) goto L_0x00e0
            r0 = 323(0x143, float:4.53E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r5 = r3.getRequiredBooleanField(r7, r0)
        L_0x0080:
            java.lang.Class<X.C4F> r4 = X.C4F.class
            r0 = 828(0x33c, float:1.16E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            r0 = -705124832(0xffffffffd5f8a620, float:-3.41740481E13)
            X.3lr r3 = r6.getRequiredTreeField(r7, r3, r4, r0)
            if (r3 == 0) goto L_0x009a
            r0 = 4124(0x101c, float:5.779E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.getRequiredIntField(r2, r0)
        L_0x009a:
            r0 = 3
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0q(r9, r0)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x0151
            X.JhL r8 = r1.A00
            java.util.Iterator r9 = r9.iterator()
        L_0x00a9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0151
            X.3lr r3 = X.C41845B3m.A0V(r9)
            java.lang.Class<X.C4D> r2 = X.C4D.class
            r0 = -861521069(0xffffffffcca63b53, float:-8.7153304E7)
            X.3lr r2 = r3.reinterpretRequired(r7, r2, r0)
            com.instagram.common.session.UserSession r0 = r8.A02
            X.1E5 r4 = X.1E4.A00(r0)
            java.lang.Class<com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict> r0 = com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict.class
            com.facebook.pando.TreeJNI r3 = r2.reinterpret(r0)
            com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict r3 = (com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict) r3
            java.util.HashSet r2 = X.AnonymousClass7TE.A1F()
            X.1E9 r0 = new X.1E9
            r0.<init>(r4, r2, r7)
            com.instagram.user.model.ProductDetailsProductItemDict r2 = r3.FGq(r0)
            X.IOV r0 = new X.IOV
            r0.<init>(r2)
            r6.add(r0)
            goto L_0x00a9
        L_0x00e0:
            r5 = 0
            if (r6 == 0) goto L_0x009a
            goto L_0x0080
        L_0x00e4:
            X.0sn r9 = X.0sn.A00
            goto L_0x005d
        L_0x00e8:
            X.0eS.A00(r6)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1vn r0 = X.1vm.A01(r0)
            r13 = 0
            X.2IS r9 = X.C41845B3m.A04()
            X.2IS r10 = X.C41845B3m.A04()
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r6 = 496(0x1f0, float:6.95E-43)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            r8 = r20
            X.0Df r8 = X.C41845B3m.A03(r7, r8, r6)
            java.lang.Integer r7 = X.JTO.A0w(r22)
            java.lang.String r6 = "start_index"
            X.0Df.A00(r8, r7, r6)
            java.lang.String r6 = "request"
            X.1vR r7 = X.C41847B3o.A04(r8, r9, r6)
            java.util.Map r9 = r9.getParamsCopy()
            java.util.Map r10 = r10.getParamsCopy()
            java.lang.Class<X.C4G> r11 = X.C4G.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGAdsProductInfoODLQuery"
            r12 = 0
            java.lang.String r16 = "xdt_v1_ondemand_product_info"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.ME9.A01(r5, r1, r4, r2)
            java.lang.Object r6 = r0.A04(r6, r4)
            if (r6 == r3) goto L_0x016c
            r8 = r5
            goto L_0x0032
        L_0x013d:
            X.ME9 r4 = X.ME9.A00(r5, r7, r6)
            goto L_0x001c
        L_0x0143:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x016a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x014c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0151:
            X.JhL r3 = r1.A00
            X.05G r2 = r3.A05
            boolean r1 = r1.A01
            X.HDE r0 = new X.HDE
            r0.<init>(r6, r1)
            r2.Epw(r0)
            int r1 = r3.A00
            int r0 = r6.size()
            int r1 = r1 + r0
            r3.A00 = r1
            r3.A01 = r5
        L_0x016a:
            X.0gF r3 = X.C60340gF.A00
        L_0x016c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.productsonprofile.producttab.ui.ProductTabRepository.A00(X.L4z, java.lang.String, X.4D7, int):java.lang.Object");
    }
}
