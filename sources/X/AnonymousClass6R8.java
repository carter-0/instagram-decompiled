package X;

/* renamed from: X.6R8  reason: invalid class name */
public final class AnonymousClass6R8 implements C307636Qw {
    public final 0lg A00;

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00af: MOVE  (r1v30 com.instagram.common.session.UserSession) = (r0v1 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void AUw(X.Q3K r18, X.Q3F r19, java.lang.String r20, java.util.Map r21, java.util.concurrent.Executor r22) {
        /*
            r17 = this;
            r0 = r17
            X.0lg r0 = r0.A00
            r11 = 0
            X.8do r1 = X.C359988do.A04
            r6 = r20
            boolean r1 = r1.A0A(r0, r6)
            r4 = r18
            r3 = r19
            r8 = r21
            r2 = r22
            if (r1 == 0) goto L_0x00d3
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.lang.String r1 = "app_id"
            X.0Df r9 = r7.A02()
            X.0Df.A00(r9, r6, r1)
            java.lang.String r5 = "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969"
            java.lang.String r1 = "bloks_versioning_id"
            X.0Df.A00(r9, r5, r1)
            X.0qv r5 = X.0qv.A02
            android.content.Context r1 = X.C60960kU.A00
            java.lang.String r6 = r5.A05(r1)
            r5 = 9
            r1 = 37
            java.lang.String r1 = X.Dbp.A02(r11, r5, r1)
            X.0Df r5 = r7.A02()
            X.0Df.A00(r5, r6, r1)
            java.lang.String r1 = "infra_params"
            r9.A0E(r5, r1)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r8)
            java.lang.String r5 = "params"
            org.json.JSONObject r1 = r6.put(r5, r1)
            java.lang.String r1 = r1.toString()
            X.0Df.A00(r9, r1, r5)
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IV r1 = r8.A00
            X.0Df r1 = r1.A02()
            r1.A0E(r9, r5)
            X.2IV r6 = X.C360628et.A00()
            java.lang.String r5 = "instagram"
            java.lang.String r1 = "styles_id"
            r6.A09(r5, r1)
            java.lang.String r1 = "bk_context"
            r8.A00(r6, r1)
            X.2IY r1 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r8.getParamsCopy()
            java.util.Map r9 = r7.getParamsCopy()
            java.lang.Class<X.Q46> r10 = X.Q46.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "BloksAsyncComponentQuery"
            java.lang.String r15 = "bloks_component_query"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.Q3K r7 = X.Q3K.PREFETCH
            r1 = 2
            if (r4 != r7) goto L_0x00a6
            r1 = 1
        L_0x00a6:
            X.1Ef r6 = r5.setRequestPurpose(r1)
            boolean r1 = r0 instanceof com.instagram.common.session.UserSession
            if (r1 == 0) goto L_0x00b9
            r1 = r0
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            if (r1 == 0) goto L_0x00b9
            X.1vn r1 = X.1vm.A01(r1)
            if (r1 != 0) goto L_0x00bf
        L_0x00b9:
            X.0aP r0 = (X.AnonymousClass0aP) r0
            X.1vn r1 = X.1vm.A00(r0)
        L_0x00bf:
            X.Q3C r5 = new X.Q3C
            r5.<init>(r6, r3, r1, r2)
        L_0x00c4:
            X.11X r5 = (X.AnonymousClass11X) r5
            int r2 = r5.getRunnableId()
            r1 = 2
            if (r4 != r7) goto L_0x00ce
            r1 = 4
        L_0x00ce:
            r0 = 1
            X.1ES.A05(r5, r2, r1, r0, r0)
            return
        L_0x00d3:
            X.Q3K r7 = X.Q3K.PREFETCH
            r1 = 0
            if (r4 != r7) goto L_0x00d9
            r1 = 1
        L_0x00d9:
            X.1NY r5 = X.C359988do.A00(r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r5.A08(r0)
            java.lang.String r1 = "bloks/async_component_query/"
            r0 = 47
            java.lang.String r0 = X.002.A0S(r1, r6, r0)
            r5.A0A(r0)
            X.Q4F r0 = X.Q4E.A01
            r5.A0P(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "params"
            r5.A9m(r0, r1)
            X.1OC r0 = r5.A0M()
            X.Q4D r5 = new X.Q4D
            r5.<init>(r0, r3, r6, r2)
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6R8.AUw(X.Q3K, X.Q3F, java.lang.String, java.util.Map, java.util.concurrent.Executor):void");
    }

    public AnonymousClass6R8(0lg r1) {
        this.A00 = r1;
    }
}
