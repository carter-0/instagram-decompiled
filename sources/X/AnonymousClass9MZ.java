package X;

/* renamed from: X.9MZ  reason: invalid class name */
public final class AnonymousClass9MZ extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MZ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(1);
        this.A00 = i;
        this.A04 = obj;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A01 = obj5;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x018a: MOVE  (r6v8 com.facebook.pando.PandoGraphQLRequest) = (r9v6 com.facebook.pando.PandoGraphQLRequest)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            int r2 = r1.A00
            switch(r2) {
                case 0: goto L_0x017c;
                case 1: goto L_0x00d7;
                case 2: goto L_0x02f0;
                case 3: goto L_0x02fd;
                case 4: goto L_0x030b;
                case 5: goto L_0x0336;
                case 6: goto L_0x035f;
                case 7: goto L_0x038b;
                case 8: goto L_0x002d;
                case 9: goto L_0x0077;
                case 10: goto L_0x03b7;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r5 = r1.A04
            X.3fk r5 = (X.C247083fk) r5
            int r0 = r5.A01
            if (r2 != r0) goto L_0x002a
            java.lang.Object r4 = r1.A02
            X.3VD r4 = (X.AnonymousClass3VD) r4
            java.lang.Object r3 = r1.A03
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            java.lang.Object r2 = r1.A05
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r1.A01
            X.47O r0 = (X.AnonymousClass47O) r0
            r4.A01(r2, r3, r0, r5)
        L_0x002a:
            X.0gF r1 = X.C60340gF.A00
        L_0x002c:
            return r1
        L_0x002d:
            android.content.Context r0 = (android.content.Context) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r3 = r1.A05
            X.5Es r3 = (X.C282785Es) r3
            java.lang.Object r6 = r1.A03
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r5 = r1.A04
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            java.lang.Object r2 = r1.A02
            java.lang.Object r4 = r1.A01
            X.3YT r4 = (X.AnonymousClass3YT) r4
            com.instagram.common.session.UserSession r3 = r3.A00
            boolean r1 = X.C247643gg.A06(r3, r6)
            if (r1 != 0) goto L_0x0063
            boolean r1 = X.1sx.A0J(r6)
            if (r1 == 0) goto L_0x0068
            boolean r1 = X.C55000HaX.A00(r3, r6)
            java.lang.String r1 = X.1sx.A05(r0, r3, r6, r1)
        L_0x005b:
            if (r1 == 0) goto L_0x0063
            boolean r2 = X.00l.A0W(r1)
            if (r2 == 0) goto L_0x002c
        L_0x0063:
            java.lang.CharSequence r1 = r4.C4o(r0, r3, r6, r5)
            return r1
        L_0x0068:
            X.5Ey r1 = X.AnonymousClass5Ey.A00
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0063
            X.1Xy r1 = r6.A0C
            java.lang.String r1 = r1.Ate()
            goto L_0x005b
        L_0x0077:
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r8 = r1.A02
            X.1Xj r8 = (X.1Xj) r8
            java.lang.String r12 = r8.getId()
            if (r12 == 0) goto L_0x002a
            java.lang.Object r9 = r1.A01
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r4 = r1.A05
            X.3Yc r4 = (X.C243273Yc) r4
            java.lang.Object r3 = r1.A04
            X.0iw r3 = (X.AnonymousClass0iw) r3
            java.lang.Object r2 = r1.A03
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            X.I4E r5 = X.I4E.A00
            com.instagram.common.session.UserSession r6 = r4.A00
            java.lang.String r13 = r8.A2Z()
            java.lang.String r14 = r3.getModuleName()
            X.1Xy r1 = r8.A0C
            java.lang.String r15 = r1.BIl()
            X.1Xy r1 = r8.A0C
            java.lang.String r16 = r1.getLoggingInfoToken()
            int r1 = r2.getPosition()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = r2.A03
            X.1Xj r1 = r8.A1c(r1)
            if (r1 == 0) goto L_0x00d4
            java.lang.String r17 = r1.getId()
        L_0x00c3:
            int r1 = r2.A03
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            com.instagram.common.typedurl.ImageUrl r7 = r8.A1Q()
            r18 = r0
            r5.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x002a
        L_0x00d4:
            r17 = 0
            goto L_0x00c3
        L_0x00d7:
            X.2Uy r0 = (X.C70762Uy) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            android.view.MotionEvent r2 = r0.A00
            int r2 = r2.getAction()
            r6 = 1
            if (r2 != r6) goto L_0x012a
            java.lang.Object r7 = r1.A03
            X.3Zt r7 = (X.C243673Zt) r7
            android.view.View r8 = r0.A01
            X.0qQ.A06(r8)
            int r5 = r8.getMeasuredHeight()
            X.37E r3 = X.AnonymousClass37D.A00
            android.content.Context r2 = r8.getContext()
            X.37D r2 = r3.A02(r2)
            X.7Pu r2 = X.C48943Emh.A00(r2)
            if (r2 == 0) goto L_0x017a
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r2 = r2.A03
            androidx.fragment.app.Fragment r2 = r2.A0M()
            if (r2 == 0) goto L_0x017a
            android.view.View r2 = r2.mView
            if (r2 == 0) goto L_0x017a
            int r4 = r2.getHeight()
        L_0x0113:
            r2 = 2
            int[] r2 = new int[r2]
            r8.getLocationOnScreen(r2)
            r2 = r2[r6]
            int r3 = r2 + 250
            int r2 = r8.getHeight()
            int r3 = r3 - r2
            X.A63 r2 = new X.A63
            r2.<init>(r3, r5, r4)
            r7.A00(r2)
        L_0x012a:
            android.view.MotionEvent r2 = r0.A00
            int r2 = r2.getAction()
            if (r2 != 0) goto L_0x016b
            java.lang.Object r2 = r1.A05
            X.7hK r2 = (X.C338047hK) r2
            com.instagram.common.session.UserSession r5 = r2.A03
            X.0Tu r4 = X.0Tu.A05
            r2 = 36323032344177408(0x810b9b000a2b00, double:3.034170143344754E-306)
            java.lang.Boolean r2 = X.AnonymousClass7TF.A0R(r4, r5, r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x016b
            java.lang.Object r4 = r1.A04
            X.3Zt r4 = (X.C243673Zt) r4
            android.view.View r3 = r0.A01
            X.0qQ.A06(r3)
            r2 = 2
            int[] r2 = new int[r2]
            r3.getLocationInWindow(r2)
            r2 = r2[r6]
            float r2 = (float) r2
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r4.A00(r2)
            java.lang.Object r3 = r1.A01
            X.3Zt r3 = (X.C243673Zt) r3
            android.view.View r2 = r0.A01
            r3.A00(r2)
        L_0x016b:
            java.lang.Object r1 = r1.A02
            android.view.GestureDetector r1 = (android.view.GestureDetector) r1
            android.view.MotionEvent r0 = r0.A00
            boolean r0 = r1.onTouchEvent(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x017a:
            r4 = 0
            goto L_0x0113
        L_0x017c:
            com.facebook.pando.PandoGraphQLServiceJNI r0 = (com.facebook.pando.PandoGraphQLServiceJNI) r0
            if (r0 == 0) goto L_0x02bd
            java.lang.Object r9 = r1.A04     // Catch:{ IllegalStateException -> 0x02d9 }
            X.1Ef r9 = (X.1Ef) r9     // Catch:{ IllegalStateException -> 0x02d9 }
            boolean r2 = r9 instanceof com.facebook.pando.PandoGraphQLRequest     // Catch:{ IllegalStateException -> 0x02d9 }
            r5 = 0
            if (r2 == 0) goto L_0x02c5
            r6 = r9
            com.facebook.pando.PandoGraphQLRequest r6 = (com.facebook.pando.PandoGraphQLRequest) r6     // Catch:{ IllegalStateException -> 0x02d9 }
            if (r6 == 0) goto L_0x02c5
            java.lang.Object r4 = r1.A05     // Catch:{ IllegalStateException -> 0x02d9 }
            X.1vy r4 = (X.1vy) r4     // Catch:{ IllegalStateException -> 0x02d9 }
            boolean r2 = r6.isMutation     // Catch:{ IllegalStateException -> 0x02d9 }
            if (r2 == 0) goto L_0x019e
            r2 = 0
            r6.setFreshCacheAgeMs(r2)     // Catch:{ IllegalStateException -> 0x02d9 }
            r6.setMaxToleratedCacheAgeMs(r2)     // Catch:{ IllegalStateException -> 0x02d9 }
        L_0x019e:
            X.1vx r8 = r4.A00     // Catch:{ IllegalStateException -> 0x02d9 }
            if (r8 == 0) goto L_0x01b5
            X.0sa r2 = r8.A00     // Catch:{ IllegalStateException -> 0x02d9 }
            if (r2 == 0) goto L_0x01b5
            java.lang.Object r10 = r2.invoke()     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IllegalStateException -> 0x02d9 }
        L_0x01ac:
            int r2 = r6.injectionCapabilities     // Catch:{ IllegalStateException -> 0x02d9 }
            r4 = 4
            r3 = r2 & 4
            r2 = 0
            if (r3 != r4) goto L_0x01b8
            goto L_0x01b7
        L_0x01b5:
            r10 = 0
            goto L_0x01ac
        L_0x01b7:
            r2 = 1
        L_0x01b8:
            r11 = 0
            if (r2 == 0) goto L_0x01be
            if (r10 == 0) goto L_0x01be
            goto L_0x01c0
        L_0x01be:
            r12 = 0
            goto L_0x01cf
        L_0x01c0:
            java.util.Map r7 = r6.params     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.String r4 = r6.rootCallVariable     // Catch:{ IllegalStateException -> 0x02d9 }
            X.TNG r3 = new X.TNG     // Catch:{ IllegalStateException -> 0x02d9 }
            r3.<init>(r10, r11)     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.String r2 = "actor_id"
            boolean r12 = X.C392949ve.A00(r4, r2, r7, r3)     // Catch:{ IllegalStateException -> 0x02d9 }
        L_0x01cf:
            int r2 = r6.injectionCapabilities     // Catch:{ IllegalStateException -> 0x02d9 }
            r3 = 8
            r2 = r2 & 8
            if (r2 != r3) goto L_0x01fc
            java.util.Map r7 = r6.params     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.String r4 = r6.rootCallVariable     // Catch:{ IllegalStateException -> 0x02d9 }
            X.Aso r3 = X.C41367Aso.A00     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.String r2 = "client_mutation_id"
            boolean r10 = X.C392949ve.A00(r4, r2, r7, r3)     // Catch:{ IllegalStateException -> 0x02d9 }
        L_0x01e3:
            int r2 = r6.injectionCapabilities     // Catch:{ IllegalStateException -> 0x02d9 }
            r3 = 16
            r2 = r2 & 16
            if (r2 != r3) goto L_0x01fe
            java.util.Map r7 = r6.params     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.String r4 = r6.rootCallVariable     // Catch:{ IllegalStateException -> 0x02d9 }
            X.Asp r3 = X.C41368Asp.A00     // Catch:{ IllegalStateException -> 0x02d9 }
            r2 = 546(0x222, float:7.65E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)     // Catch:{ IllegalStateException -> 0x02d9 }
            boolean r11 = X.C392949ve.A00(r4, r2, r7, r3)     // Catch:{ IllegalStateException -> 0x02d9 }
            goto L_0x01fe
        L_0x01fc:
            r10 = 0
            goto L_0x01e3
        L_0x01fe:
            if (r12 != 0) goto L_0x0204
            if (r10 != 0) goto L_0x0204
            if (r11 == 0) goto L_0x020b
        L_0x0204:
            java.util.Map r3 = r6.params     // Catch:{ IllegalStateException -> 0x02d9 }
            java.util.Map r2 = r6.transientParams     // Catch:{ IllegalStateException -> 0x02d9 }
            r6.setQueryVariables(r3, r2)     // Catch:{ IllegalStateException -> 0x02d9 }
        L_0x020b:
            int r4 = r6.injectionCapabilities     // Catch:{ IllegalStateException -> 0x02d9 }
            r3 = 128(0x80, float:1.794E-43)
            r2 = r4 & r3
            r11 = 0
            if (r2 != r3) goto L_0x0215
            r11 = 1
        L_0x0215:
            r2 = 256(0x100, float:3.59E-43)
            r4 = r4 & r2
            r7 = 0
            if (r4 != r2) goto L_0x021c
            r7 = 1
        L_0x021c:
            r2 = 0
            X.0qQ.A0B(r9, r2)     // Catch:{ IllegalStateException -> 0x02d9 }
            boolean r10 = r9.hasAcsToken()     // Catch:{ IllegalStateException -> 0x02d9 }
            boolean r4 = r9.hasOhaiConfig()     // Catch:{ IllegalStateException -> 0x02d9 }
            r3 = 0
            if (r11 != r10) goto L_0x022c
            r2 = 1
        L_0x022c:
            if (r7 != r4) goto L_0x022f
            r3 = 1
        L_0x022f:
            if (r2 == 0) goto L_0x0233
            if (r3 != 0) goto L_0x0281
        L_0x0233:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ IllegalStateException -> 0x02d9 }
            r7.<init>()     // Catch:{ IllegalStateException -> 0x02d9 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IllegalStateException -> 0x02d9 }
            r4.<init>()     // Catch:{ IllegalStateException -> 0x02d9 }
            if (r2 != 0) goto L_0x024a
            java.lang.String r2 = "ACS token"
            if (r10 == 0) goto L_0x0247
            r4.add(r2)     // Catch:{ IllegalStateException -> 0x02d9 }
            goto L_0x024a
        L_0x0247:
            r7.add(r2)     // Catch:{ IllegalStateException -> 0x02d9 }
        L_0x024a:
            if (r3 != 0) goto L_0x0257
            boolean r3 = r9.hasOhaiConfig()     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.String r2 = "OHAI config"
            if (r3 == 0) goto L_0x027d
            r4.add(r2)     // Catch:{ IllegalStateException -> 0x02d9 }
        L_0x0257:
            boolean r2 = r7.isEmpty()     // Catch:{ IllegalStateException -> 0x02d9 }
            r2 = r2 ^ 1
            if (r2 != 0) goto L_0x02a7
            boolean r2 = r4.isEmpty()     // Catch:{ IllegalStateException -> 0x02d9 }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0281
            java.lang.String r3 = "Unexpected "
            java.lang.String r2 = " and "
            java.lang.String r0 = ""
            java.lang.String r2 = X.00k.A0P(r2, r0, r0, r4, r5)     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.String r0 = " was provided to the request."
            java.lang.String r0 = X.002.A0g(r3, r2, r0)     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x02d9 }
            r2.<init>(r0)     // Catch:{ IllegalStateException -> 0x02d9 }
            goto L_0x02d8
        L_0x027d:
            r7.add(r2)     // Catch:{ IllegalStateException -> 0x02d9 }
            goto L_0x0257
        L_0x0281:
            if (r8 == 0) goto L_0x028f
            r3 = 1
            boolean r2 = r8.A03     // Catch:{ IllegalStateException -> 0x02d9 }
            if (r2 != r3) goto L_0x028f
            java.lang.String r3 = "ig_legacy_dict_validate_null"
            java.lang.String r2 = "true"
            r6.addAdditionalHttpRequestParam(r3, r2)     // Catch:{ IllegalStateException -> 0x02d9 }
        L_0x028f:
            java.lang.Object r4 = r1.A03     // Catch:{ IllegalStateException -> 0x02d9 }
            X.2Kv r4 = (X.AnonymousClass2Kv) r4     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.Object r2 = r1.A02     // Catch:{ IllegalStateException -> 0x02d9 }
            X.2Kw r2 = (X.2Kw) r2     // Catch:{ IllegalStateException -> 0x02d9 }
            X.3r4 r3 = new X.3r4     // Catch:{ IllegalStateException -> 0x02d9 }
            r3.<init>(r2, r4)     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.Object r2 = r1.A01     // Catch:{ IllegalStateException -> 0x02d9 }
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2     // Catch:{ IllegalStateException -> 0x02d9 }
            com.facebook.pando.IPandoGraphQLService$Result r0 = r0.initiate(r5, r6, r3, r2)     // Catch:{ IllegalStateException -> 0x02d9 }
            com.facebook.pando.IPandoGraphQLService$Token r1 = r0.cancelToken     // Catch:{ IllegalStateException -> 0x02d9 }
            return r1
        L_0x02a7:
            java.lang.String r3 = "Request was marked with @deidentified, but no "
            java.lang.String r2 = " or "
            java.lang.String r0 = ""
            java.lang.String r2 = X.00k.A0P(r2, r0, r0, r7, r5)     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.String r0 = " was provided."
            java.lang.String r0 = X.002.A0g(r3, r2, r0)     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x02d9 }
            r2.<init>(r0)     // Catch:{ IllegalStateException -> 0x02d9 }
            goto L_0x02d8
        L_0x02bd:
            java.lang.String r0 = "Attempted to execute a query with a null service. Most likely you either used executeAndSubscribe with a query executor that has not setup a consistency service, or you called executeAndSubscribe with a query executor that was intended to be for logged out calls."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x02d9 }
            r2.<init>(r0)     // Catch:{ IllegalStateException -> 0x02d9 }
            goto L_0x02d8
        L_0x02c5:
            java.lang.String r2 = "Pando Query Executor can only be used with Pando GraphQL Request, actual type is "
            java.lang.Class r0 = r9.getClass()     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.String r0 = r0.getName()     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.String r0 = X.002.A0R(r2, r0)     // Catch:{ IllegalStateException -> 0x02d9 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x02d9 }
            r2.<init>(r0)     // Catch:{ IllegalStateException -> 0x02d9 }
        L_0x02d8:
            throw r2     // Catch:{ IllegalStateException -> 0x02d9 }
        L_0x02d9:
            r3 = move-exception
            java.lang.Object r2 = r1.A01
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Object r1 = r1.A02
            X.2Kw r1 = (X.2Kw) r1
            X.AmD r0 = new X.AmD
            r0.<init>(r1, r3)
            r2.execute(r0)
            X.AVE r1 = new X.AVE
            r1.<init>()
            return r1
        L_0x02f0:
            android.content.Context r0 = (android.content.Context) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A05
            X.4nl r2 = (X.C274134nl) r2
            X.0eM r2 = r2.A05
            goto L_0x036b
        L_0x02fd:
            android.content.Context r0 = (android.content.Context) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A05
            X.4nl r2 = (X.C274134nl) r2
            X.0eM r2 = r2.A06
            goto L_0x0397
        L_0x030b:
            android.content.Context r0 = (android.content.Context) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            X.3eW r6 = X.C246393eW.A00
            java.lang.Object r2 = r1.A05
            X.4y4 r2 = (X.C279094y4) r2
            com.instagram.common.session.UserSession r5 = r2.A00
            java.lang.Object r4 = r1.A02
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r1.A01
            X.1Xj r3 = (X.1Xj) r3
            X.3VA r13 = X.AnonymousClass3VA.ADD_CONTENT_NOTE
            java.lang.Object r2 = r1.A04
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.Object r1 = r1.A03
            X.4DU r1 = (X.AnonymousClass4DU) r1
            r7 = r0
            r8 = r5
            r9 = r4
            r10 = r3
            r11 = r1
            r12 = r2
            X.4Fv r1 = r6.A00(r7, r8, r9, r10, r11, r12, r13)
            return r1
        L_0x0336:
            X.3V9 r0 = (X.AnonymousClass3V9) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r6 = r1.A01
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r7 = r1.A02
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r9 = r1.A04
            X.3W1 r9 = (X.AnonymousClass3W1) r9
            java.lang.Object r3 = r1.A05
            X.4y4 r3 = (X.C279094y4) r3
            X.4GD r2 = r3.A01
            X.4Gh r10 = r2.BR1()
            java.lang.Object r8 = r1.A03
            X.4DU r8 = (X.AnonymousClass4DU) r8
            com.instagram.common.session.UserSession r5 = r3.A00
            r11 = r0
            r12 = r4
            X.3aW r1 = X.C262914Gm.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x035f:
            android.content.Context r0 = (android.content.Context) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A05
            X.4y4 r2 = (X.C279094y4) r2
            X.0eM r2 = r2.A05
        L_0x036b:
            java.lang.Object r5 = r2.getValue()
            X.4Gv r5 = (X.C263004Gv) r5
            java.lang.Object r4 = r1.A02
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r1.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r1.A04
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.Object r1 = r1.A03
            X.4DU r1 = (X.AnonymousClass4DU) r1
            r6 = r0
            r7 = r4
            r8 = r3
            r9 = r1
            r10 = r2
            X.9J0 r1 = r5.A00(r6, r7, r8, r9, r10)
            return r1
        L_0x038b:
            android.content.Context r0 = (android.content.Context) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A05
            X.4y4 r2 = (X.C279094y4) r2
            X.0eM r2 = r2.A06
        L_0x0397:
            java.lang.Object r5 = r2.getValue()
            X.4Gz r5 = (X.C263044Gz) r5
            java.lang.Object r4 = r1.A02
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r1.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r1.A04
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.Object r1 = r1.A03
            X.4DU r1 = (X.AnonymousClass4DU) r1
            r6 = r0
            r7 = r4
            r8 = r3
            r9 = r1
            r10 = r2
            X.9Ia r1 = r5.A01(r6, r7, r8, r9, r10)
            return r1
        L_0x03b7:
            X.9IZ r0 = (X.AnonymousClass9IZ) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A05
            X.3dW r2 = (X.C245813dW) r2
            java.lang.Object r3 = r1.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r1.A03
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r7 = r1.A04
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            java.lang.Object r6 = r1.A02
            X.4DU r6 = (X.AnonymousClass4DU) r6
            boolean r1 = r4.A4n()
            if (r1 == 0) goto L_0x03ea
            X.0eM r0 = r2.A07
            java.lang.Object r2 = r0.getValue()
            X.4Fu r2 = (X.C262734Fu) r2
            r5 = r4
            X.9Ia r0 = r2.A00(r3, r4, r5, r6, r7)
            X.9II r1 = new X.9II
            r1.<init>((X.C376449Ia) r0)
            return r1
        L_0x03ea:
            boolean r1 = r0.A01
            if (r1 == 0) goto L_0x03f4
            X.9II r1 = new X.9II
            r1.<init>((X.AnonymousClass9IZ) r0)
            return r1
        L_0x03f4:
            X.4Jc r1 = X.AnonymousClass4Jc.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9MZ.invoke(java.lang.Object):java.lang.Object");
    }
}
