package com.instagram.genai.imageservice.api;

public final class GenAIImageQueryGraphQLApi {
    public static final GenAIImageQueryGraphQLApi A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C239803Ii A00(X.C239803Ii r6) {
        /*
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006a
            X.3lr r4 = X.C41846B3n.A0R(r6)
            r0 = 0
            if (r4 == 0) goto L_0x0064
            java.lang.Class<X.Bvk> r3 = X.C43284Bvk.class
            r1 = 1969(0x7b1, float:2.759E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = -166495565(0xfffffffff6137ab3, float:-7.478089E32)
            X.3lr r5 = r4.A03(r3, r2, r1)
            if (r5 == 0) goto L_0x0064
            java.lang.Class<X.Bvj> r4 = X.C43283Bvj.class
            r3 = 1
            java.lang.String r2 = "status"
            r1 = -11976301(0xffffffffff494193, float:-2.675153E38)
            X.3lr r4 = r5.getOptionalTreeField(r3, r2, r4, r1)
            if (r4 == 0) goto L_0x0065
            r2 = 0
            java.lang.String r1 = "success"
            boolean r1 = r4.getCoercedBooleanField(r2, r1)
            if (r1 == r3) goto L_0x0063
            X.Kik r2 = X.C62613Kik.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "error_code"
            java.lang.Enum r1 = r4.getOptionalEnumField(r3, r1, r2)
            if (r1 == 0) goto L_0x0065
            java.lang.String r3 = r1.toString()
        L_0x0041:
            r0 = 284(0x11c, float:3.98E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r4.A09(r0)
            r0 = 283(0x11b, float:3.97E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r4.A0A(r0)
        L_0x0055:
            X.Kkn r1 = new X.Kkn
            r1.<init>(r3, r2, r0)
            X.4dn r0 = new X.4dn
            r0.<init>(r1)
            X.5sO r6 = X.C41845B3m.A0c(r0)
        L_0x0063:
            return r6
        L_0x0064:
            r4 = r0
        L_0x0065:
            r3 = r0
            if (r4 != 0) goto L_0x0041
            r2 = r0
            goto L_0x0055
        L_0x006a:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0063
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.api.GenAIImageQueryGraphQLApi.A00(X.3Ii):X.3Ii");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, X.AnonymousClass4D7 r27, int r28, int r29) {
        /*
            r18 = this;
            r5 = 19
            r6 = r27
            boolean r0 = X.C66137MDp.A02(r5, r6)
            r4 = r18
            if (r0 == 0) goto L_0x00bd
            r3 = r6
            X.MDp r3 = (X.C66137MDp) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bd
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r5 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x00c3
            X.0eS.A00(r5)
        L_0x0028:
            X.3Ii r5 = (X.C239803Ii) r5
            X.3Ii r0 = A00(r5)
            return r0
        L_0x002f:
            X.0eS.A00(r5)
            java.lang.Integer r8 = X.JTO.A0w(r28)
            java.lang.Integer r9 = X.JTO.A0w(r29)
            r13 = 0
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "src_client_id"
            r5 = r23
            X.0Df r6 = X.C41845B3m.A03(r7, r5, r0)
            java.lang.String r0 = "src_opaque_token_handle"
            r5 = r24
            X.0Df.A00(r6, r5, r0)
            java.lang.String r0 = "mask_client_id"
            r5 = r25
            X.0Df.A00(r6, r5, r0)
            java.lang.String r0 = "mask_opaque_token_handle"
            r5 = r26
            X.0Df.A00(r6, r5, r0)
            X.2IV r5 = new X.2IV
            r5.<init>()
            java.lang.String r0 = "points"
            r5.A05(r0, r13)
            java.lang.String r0 = "prompt"
            r5 = r22
            X.0Df r7 = X.C41845B3m.A03(r7, r5, r0)
            java.lang.String r0 = "num_of_images"
            X.0Df.A00(r7, r9, r0)
            java.lang.String r0 = "variant_starting_offset"
            X.0Df.A00(r7, r8, r0)
            java.lang.String r0 = "type"
            r5 = r20
            X.0Df.A00(r7, r5, r0)
            java.lang.String r0 = "src_image"
            r7.A0E(r6, r0)
            java.lang.String r0 = "client_session_id"
            r5 = r21
            X.2IS r6 = X.JTQ.A0D(r7, r5, r0)
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "params"
            X.1vR r7 = X.C41847B3o.A04(r7, r6, r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Bvl> r11 = X.C43285Bvl.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGSharingGenAIImageQuery"
            r12 = 0
            java.lang.String r16 = "xig_ig_genai_image_query"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r0 = X.1vm.A01(r19)
            r3.A01 = r4
            r3.A00 = r1
            java.lang.Object r5 = r0.A04(r6, r3)
            if (r5 != r2) goto L_0x0028
            return r2
        L_0x00bd:
            X.MDp r3 = X.C66137MDp.A00(r4, r6, r5)
            goto L_0x001a
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.api.GenAIImageQueryGraphQLApi.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7, int, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.common.session.UserSession r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, X.AnonymousClass4D7 r23) {
        /*
            r18 = this;
            r5 = 20
            r6 = r23
            boolean r0 = X.C66137MDp.A02(r5, r6)
            r4 = r18
            if (r0 == 0) goto L_0x00af
            r3 = r6
            X.MDp r3 = (X.C66137MDp) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00af
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r5 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x00b5
            X.0eS.A00(r5)
        L_0x0028:
            X.3Ii r5 = (X.C239803Ii) r5
            X.3Ii r0 = A00(r5)
            return r0
        L_0x002f:
            X.0eS.A00(r5)
            r13 = 0
            java.lang.String r8 = "SEMANTIC_SEGMENTATION"
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "src_client_id"
            r5 = r20
            X.0Df r6 = X.C41845B3m.A03(r7, r5, r0)
            java.lang.String r0 = "src_opaque_token_handle"
            r5 = r21
            X.0Df.A00(r6, r5, r0)
            java.lang.String r0 = "mask_client_id"
            X.0Df.A00(r6, r13, r0)
            java.lang.String r0 = "mask_opaque_token_handle"
            X.0Df.A00(r6, r13, r0)
            X.2IV r5 = new X.2IV
            r5.<init>()
            java.lang.String r0 = "points"
            r5.A05(r0, r13)
            java.lang.String r0 = "prompt"
            X.0Df r7 = X.C41845B3m.A03(r7, r13, r0)
            java.lang.String r0 = "num_of_images"
            X.0Df.A00(r7, r13, r0)
            java.lang.String r0 = "variant_starting_offset"
            X.0Df.A00(r7, r13, r0)
            java.lang.String r0 = "type"
            X.0Df.A00(r7, r8, r0)
            java.lang.String r0 = "src_image"
            r7.A0E(r6, r0)
            java.lang.String r0 = "client_session_id"
            r5 = r22
            X.2IS r6 = X.JTQ.A0D(r7, r5, r0)
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "params"
            X.1vR r7 = X.C41847B3o.A04(r7, r6, r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Bvl> r11 = X.C43285Bvl.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGSharingGenAIImageQuery"
            r12 = 0
            java.lang.String r16 = "xig_ig_genai_image_query"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r0 = X.1vm.A01(r19)
            r3.A01 = r4
            r3.A00 = r1
            java.lang.Object r5 = r0.A04(r6, r3)
            if (r5 != r2) goto L_0x0028
            return r2
        L_0x00af:
            X.MDp r3 = X.C66137MDp.A00(r4, r6, r5)
            goto L_0x001a
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.api.GenAIImageQueryGraphQLApi.A02(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }
}
