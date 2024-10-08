package com.instagram.genai.imageservice.api;

public final class GenAIImagineQueryGraphQLApi {
    public static final GenAIImagineQueryGraphQLApi A00 = new Object();

    /* JADX WARNING: type inference failed for: r2v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, X.AnonymousClass4D7 r25, int r26, int r27) {
        /*
            r17 = this;
            r5 = 21
            r6 = r25
            boolean r0 = X.C66137MDp.A02(r5, r6)
            r3 = r17
            if (r0 == 0) goto L_0x014b
            r2 = r6
            X.MDp r2 = (X.C66137MDp) r2
            int r4 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x014b
            int r4 = r4 - r1
            r2.A00 = r4
        L_0x001a:
            java.lang.Object r4 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r11 = 1
            if (r0 == 0) goto L_0x00ac
            if (r0 != r11) goto L_0x0151
            X.0eS.A00(r4)
        L_0x0028:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r3 = X.JTQ.A0Y(r4)
            X.C89 r3 = (X.C89) r3
            r0 = 0
            if (r3 == 0) goto L_0x00a1
            X.Bvf r2 = r3.A0E()
            if (r2 == 0) goto L_0x00a1
            java.lang.String r1 = "success"
            java.lang.Boolean r1 = X.C41846B3n.A0d(r2, r1, r11)
        L_0x0043:
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r11)
            if (r1 != 0) goto L_0x009d
            if (r3 == 0) goto L_0x009e
            X.Bvf r4 = r3.A0E()
            if (r4 == 0) goto L_0x009e
            java.lang.Class<X.Bvd> r3 = X.C43277Bvd.class
            r6 = 0
            java.lang.String r2 = "response"
            r1 = -1715466463(0xffffffff99c00f21, float:-1.9858445E-23)
            com.google.common.collect.ImmutableList r1 = r4.getRequiredCompactedTreeListField(r6, r2, r3, r1)
            if (r1 == 0) goto L_0x009e
            java.lang.Object r4 = X.00k.A0J(r1)
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x009e
            java.lang.Class<X.Bva> r3 = X.C43274Bva.class
            r5 = 2
            r1 = 4417(0x1141, float:6.19E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = -1378427176(0xffffffffadd6ded8, float:-2.4427946E-11)
            X.3lr r4 = r4.reinterpretIfFulfillsType(r5, r2, r3, r1)
            if (r4 == 0) goto L_0x009e
            java.lang.String r0 = "message"
            java.lang.String r3 = r4.getOptionalStringField(r6, r0)
            X.XRM r1 = X.XRM.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "error_type"
            java.lang.Enum r2 = r4.getOptionalEnumField(r5, r0, r1)
            X.XRM r2 = (X.XRM) r2
            java.lang.String r0 = "exception_class"
            java.lang.String r0 = r4.getOptionalStringField(r11, r0)
        L_0x008f:
            X.Kkm r1 = new X.Kkm
            r1.<init>(r2, r3, r0)
            X.4dn r0 = new X.4dn
            r0.<init>(r1)
            X.5sO r4 = X.C41845B3m.A0c(r0)
        L_0x009d:
            return r4
        L_0x009e:
            r3 = r0
            r2 = r0
            goto L_0x008f
        L_0x00a1:
            r1 = r0
            goto L_0x0043
        L_0x00a3:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x009d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ac:
            X.0eS.A00(r4)
            java.lang.Integer r4 = X.JTO.A0w(r26)
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.lang.String r0 = "prompt"
            r6 = r20
            X.0Df r6 = X.C41845B3m.A03(r5, r6, r0)
            java.lang.String r0 = "seed"
            r7 = r19
            X.0Df.A00(r6, r7, r0)
            java.lang.String r0 = "num_images"
            X.0Df.A00(r6, r4, r0)
            java.lang.String r0 = "source_handle"
            r4 = r24
            X.0Df.A00(r6, r4, r0)
            java.lang.String r0 = "surface_type"
            r4 = r22
            X.0Df.A00(r6, r4, r0)
            java.lang.String r0 = "intent"
            r4 = r21
            X.0Df.A00(r6, r4, r0)
            java.lang.String r4 = "123"
            java.lang.String r0 = "client_mutation_id"
            X.0Df.A00(r6, r4, r0)
            java.lang.String r0 = "usecase"
            r4 = r23
            X.0Df r7 = X.C41845B3m.A03(r5, r4, r0)
            java.lang.String r4 = "AI_GENERATED"
            java.lang.String r0 = "original_media_source"
            X.0Df r5 = X.C41845B3m.A03(r5, r4, r0)
            r0 = 2312(0x908, float:3.24E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "meta_ai_access_point"
            X.0Df.A00(r5, r4, r0)
            java.lang.String r0 = "user_interaction_params"
            r7.A0E(r5, r0)
            r0 = 647(0x287, float:9.07E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r6.A0E(r7, r0)
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r4 = X.C41845B3m.A04()
            java.lang.String r0 = "params"
            X.1vR r6 = X.C41847B3o.A04(r6, r5, r0)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.C89> r10 = X.C89.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "IGGraphQLGenAIImagineRootCall"
            r13 = 64
            java.lang.String r15 = "xfb_genai_imagine_results_for_surface"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r27
            r5.setNetworkTimeoutSeconds(r0)
            X.1vn r0 = X.1vm.A01(r18)
            r2.A01 = r3
            r2.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r2)
            if (r4 != r1) goto L_0x0028
            return r1
        L_0x014b:
            X.MDp r2 = X.C66137MDp.A00(r3, r6, r5)
            goto L_0x001a
        L_0x0151:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.api.GenAIImagineQueryGraphQLApi.A00(com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7, int, int):java.lang.Object");
    }
}
