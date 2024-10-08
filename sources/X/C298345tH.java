package X;

/* renamed from: X.5tH  reason: invalid class name and case insensitive filesystem */
public final class C298345tH implements C239153Fe {
    public boolean A00;
    public final Class A01;
    public final boolean A02;

    public final void EZZ(boolean z) {
        this.A00 = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.reflect.InvocationTargetException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.io.IOException} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r2.equals("args") == false) goto L_0x0072;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1XR A00(java.lang.String r8) {
        /*
            r7 = this;
            X.15p r0 = X.AnonymousClass15o.A00
            X.16F r6 = r0.A03(r8)
            r6.A1J()     // Catch:{ all -> 0x0109 }
            X.16L r0 = r6.A11()     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x00ec
            r6.A1J()     // Catch:{ all -> 0x0109 }
            java.lang.String r2 = r6.A0q()     // Catch:{ all -> 0x0109 }
            r6.A1J()     // Catch:{ all -> 0x0109 }
            java.lang.String r4 = "parseFromJson"
            r3 = 0
            if (r2 == 0) goto L_0x0072
            int r5 = r2.hashCode()     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            r0 = -1938755376(0xffffffff8c70f0d0, float:-1.8561394E-31)
            java.lang.String r1 = "error_message"
            if (r5 == r0) goto L_0x0063
            r0 = 3002589(0x2dd0dd, float:4.207523E-39)
            if (r5 == r0) goto L_0x006a
            r0 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r5 != r0) goto L_0x0072
            java.lang.String r0 = "error"
            boolean r0 = r2.equals(r0)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            if (r0 == 0) goto L_0x0072
            java.lang.Class<X.VnR> r1 = X.C18201VnR.class
            java.lang.Class<X.16F> r0 = X.16F.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            java.lang.reflect.Method r1 = r1.getMethod(r4, r0)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            java.lang.Object r1 = r1.invoke(r3, r0)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.graphql.error.GraphQLError"
            X.0qQ.A0C(r1, r0)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            X.Ufy r1 = (X.C15632Ufy) r1     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            X.0qQ.A07(r1)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            X.V1w r0 = new X.V1w     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            r0.<init>(r1)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            throw r0     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
        L_0x0063:
            boolean r0 = r2.equals(r1)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            if (r0 != 0) goto L_0x00a5
            goto L_0x0072
        L_0x006a:
            java.lang.String r0 = "args"
            boolean r0 = r2.equals(r0)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            if (r0 != 0) goto L_0x00a5
        L_0x0072:
            java.lang.Class r1 = r7.A01     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            if (r1 == 0) goto L_0x0093
            java.lang.Class<X.16F> r0 = X.16F.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            java.lang.reflect.Method r1 = r1.getMethod(r4, r0)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            if (r1 == 0) goto L_0x0093
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            java.lang.Object r1 = r1.invoke(r3, r0)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
        L_0x008a:
            boolean r0 = r1 instanceof X.1XR     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            if (r0 == 0) goto L_0x0099
            X.1XR r1 = (X.1XR) r1     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            if (r1 == 0) goto L_0x0099
            goto L_0x0095
        L_0x0093:
            r1 = r3
            goto L_0x008a
        L_0x0095:
            r6.close()
            return r1
        L_0x0099:
            java.lang.String r0 = "GraphQL Response was not parseable. First level token: "
            java.lang.String r1 = X.002.A0R(r0, r2)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            r0.<init>(r1)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            throw r0     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
        L_0x00a5:
            X.16L r0 = r6.A11()     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = r6.A0q()     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            boolean r0 = r1.equals(r0)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            if (r0 != 0) goto L_0x00b9
            r6.A1J()     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            goto L_0x00a5
        L_0x00b9:
            java.lang.String r0 = r6.A0q()     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            boolean r0 = r1.equals(r0)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            if (r0 == 0) goto L_0x00cd
            java.lang.String r1 = r6.A1O()     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
        L_0x00c7:
            X.CTl r0 = new X.CTl     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            r0.<init>(r1)     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
            throw r0     // Catch:{ NoSuchMethodException -> 0x00d1, InvocationTargetException -> 0x00f4, IllegalAccessException -> 0x00cf }
        L_0x00cd:
            r1 = r3
            goto L_0x00c7
        L_0x00cf:
            r1 = move-exception
            goto L_0x00e6
        L_0x00d1:
            r2 = move-exception
            java.lang.Class r0 = r7.A01     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x00da
            java.lang.String r3 = r0.getCanonicalName()     // Catch:{ all -> 0x0109 }
        L_0x00da:
            java.lang.String r0 = "On Class "
            java.lang.String r1 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x0109 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0109 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0109 }
            goto L_0x00eb
        L_0x00e6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0109 }
            r0.<init>(r1)     // Catch:{ all -> 0x0109 }
        L_0x00eb:
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x00ec:
            java.lang.String r0 = "Response body is empty"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0109 }
            r1.<init>(r0)     // Catch:{ all -> 0x0109 }
            goto L_0x0108
        L_0x00f4:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getTargetException()     // Catch:{ all -> 0x0109 }
            boolean r0 = r0 instanceof java.lang.Exception     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x0108
            java.lang.Throwable r1 = r1.getTargetException()     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Exception"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0109 }
            java.lang.Exception r1 = (java.lang.Exception) r1     // Catch:{ all -> 0x0109 }
        L_0x0108:
            throw r1     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            r6.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C298345tH.A00(java.lang.String):X.1XR");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x016e in list []
        	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:44)
        	at jadx.core.dex.instructions.SwitchNode.initBlocks(SwitchNode.java:64)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.lambda$initBlocksInTargetNodes$0(BlockSplitter.java:71)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.initBlocksInTargetNodes(BlockSplitter.java:68)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(BlockSplitter.java:53)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object then(java.lang.Object r14) {
        /*
            r13 = this;
            X.2ZL r14 = (X.2ZL) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            X.1Qb r12 = r14.A00()
            java.lang.String r3 = "IOException."
            java.lang.String r2 = "IGLegacyFragmentModelResponseParser"
            if (r12 == 0) goto L_0x0195
            X.15p r1 = X.AnonymousClass15o.A00     // Catch:{ all -> 0x01a2 }
            java.io.InputStream r0 = r12.AjD()     // Catch:{ all -> 0x01a2 }
            X.16F r11 = r1.A01(r0)     // Catch:{ all -> 0x01a2 }
            X.16L r7 = X.16L.A0D     // Catch:{ all -> 0x019d }
            X.16L r0 = r11.A1J()     // Catch:{ all -> 0x019d }
            X.C293315kW.A00(r0, r7)     // Catch:{ all -> 0x019d }
            X.16L r6 = X.16L.A0A     // Catch:{ all -> 0x019d }
            X.16L r0 = r11.A1J()     // Catch:{ all -> 0x019d }
            X.C293315kW.A00(r0, r6)     // Catch:{ all -> 0x019d }
            r5 = 0     // Catch:{ all -> 0x019d }
            r4 = r5     // Catch:{ all -> 0x019d }
        L_0x002e:
            X.16L r1 = r11.A11()     // Catch:{ all -> 0x019d }
            if (r1 != r6) goto L_0x0139     // Catch:{ all -> 0x019d }
            java.lang.String r1 = r11.A0q()     // Catch:{ all -> 0x019d }
            if (r1 == 0) goto L_0x0184     // Catch:{ all -> 0x019d }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x019d }
            java.lang.String r9 = "parseFromJson"
            switch(r0) {
                case -1938755376: goto L_0x016e;
                case -1809421292: goto L_0x00eb;
                case -1294635157: goto L_0x0045;
                case 3076010: goto L_0x0099;
                default: goto L_0x0043;
            }     // Catch:{ all -> 0x01a2 }
        L_0x0043:
            goto L_0x0184     // Catch:{ all -> 0x01a2 }
        L_0x0045:
            java.lang.String r0 = "errors"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x0184     // Catch:{ all -> 0x019d }
            X.16L r8 = X.16L.A0C     // Catch:{ all -> 0x019d }
            X.16L r0 = r11.A1J()     // Catch:{ all -> 0x019d }
            X.C293315kW.A00(r0, r8)     // Catch:{ all -> 0x019d }
        L_0x0056:
            X.16L r0 = r11.A11()     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x00fd     // Catch:{ all -> 0x019d }
            r11.A1J()     // Catch:{ all -> 0x019d }
            X.16L r8 = X.16L.A08     // Catch:{ all -> 0x019d }
            X.16L r0 = r11.A11()     // Catch:{ all -> 0x019d }
            if (r8 == r0) goto L_0x00fd     // Catch:{ all -> 0x019d }
            X.C293315kW.A00(r0, r7)     // Catch:{ all -> 0x019d }
            java.lang.Class<X.VnR> r8 = X.C18201VnR.class     // Catch:{ all -> 0x019d }
            java.lang.Class<X.16F> r0 = X.16F.class     // Catch:{ all -> 0x019d }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x019d }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r0)     // Catch:{ all -> 0x019d }
            java.lang.Object[] r0 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x019d }
            java.lang.Object r10 = r8.invoke(r5, r0)     // Catch:{ all -> 0x019d }
            boolean r0 = r10 instanceof X.C15632Ufy     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x010f     // Catch:{ all -> 0x019d }
            X.Ufy r10 = (X.C15632Ufy) r10     // Catch:{ all -> 0x019d }
            if (r10 == 0) goto L_0x010f     // Catch:{ all -> 0x019d }
            boolean r0 = r13.A00     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x0102     // Catch:{ all -> 0x019d }
            r0 = 209(0xd1, float:2.93E-43)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x019d }
            java.lang.String r8 = r10.A05     // Catch:{ all -> 0x019d }
            boolean r0 = r0.equalsIgnoreCase(r8)     // Catch:{ all -> 0x019d }
            if (r0 != 0) goto L_0x0102     // Catch:{ all -> 0x019d }
            goto L_0x0056     // Catch:{ all -> 0x019d }
        L_0x0099:
            java.lang.String r0 = "data"     // Catch:{ all -> 0x019d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x0184     // Catch:{ all -> 0x019d }
            X.16L r0 = r11.A1J()     // Catch:{ all -> 0x019d }
            X.C293315kW.A00(r0, r7)     // Catch:{ all -> 0x019d }
            boolean r8 = r13.A02     // Catch:{ all -> 0x019d }
            if (r8 == 0) goto L_0x00ba     // Catch:{ all -> 0x019d }
            X.16L r0 = r11.A1J()     // Catch:{ all -> 0x019d }
            X.C293315kW.A00(r0, r6)     // Catch:{ all -> 0x019d }
            X.16L r0 = r11.A1J()     // Catch:{ all -> 0x019d }
            X.C293315kW.A00(r0, r7)     // Catch:{ all -> 0x019d }
        L_0x00ba:
            if (r4 != 0) goto L_0x0131     // Catch:{ all -> 0x019d }
            java.lang.Class r4 = r13.A01     // Catch:{ all -> 0x019d }
            if (r4 == 0) goto L_0x00dd     // Catch:{ all -> 0x019d }
            java.lang.Class<X.16F> r0 = X.16F.class     // Catch:{ all -> 0x019d }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x019d }
            java.lang.reflect.Method r4 = r4.getMethod(r9, r0)     // Catch:{ all -> 0x019d }
            if (r4 == 0) goto L_0x00dd     // Catch:{ all -> 0x019d }
            java.lang.Object[] r0 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x019d }
            java.lang.Object r4 = r4.invoke(r5, r0)     // Catch:{ all -> 0x019d }
        L_0x00d4:
            boolean r0 = r4 instanceof X.1XR     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x0120     // Catch:{ all -> 0x019d }
            X.1XR r4 = (X.1XR) r4     // Catch:{ all -> 0x019d }
            if (r4 == 0) goto L_0x0120     // Catch:{ all -> 0x019d }
            goto L_0x00df     // Catch:{ all -> 0x019d }
        L_0x00dd:
            r4 = r5     // Catch:{ all -> 0x019d }
            goto L_0x00d4     // Catch:{ all -> 0x019d }
        L_0x00df:
            if (r8 == 0) goto L_0x00fd     // Catch:{ all -> 0x019d }
            X.16L r1 = X.16L.A09     // Catch:{ all -> 0x019d }
            X.16L r0 = r11.A1J()     // Catch:{ all -> 0x019d }
            X.C293315kW.A00(r0, r1)     // Catch:{ all -> 0x019d }
            goto L_0x00fd     // Catch:{ all -> 0x019d }
        L_0x00eb:
            java.lang.String r0 = "extensions"     // Catch:{ all -> 0x019d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x0184     // Catch:{ all -> 0x019d }
            X.16L r0 = r11.A1J()     // Catch:{ all -> 0x019d }
            X.C293315kW.A00(r0, r7)     // Catch:{ all -> 0x019d }
            r11.A0z()     // Catch:{ all -> 0x019d }
        L_0x00fd:
            r11.A1J()     // Catch:{ all -> 0x019d }
            goto L_0x002e     // Catch:{ all -> 0x019d }
        L_0x0102:
            java.util.List r0 = java.util.Collections.singletonList(r10)     // Catch:{ all -> 0x019d }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x019d }
            X.V1w r1 = new X.V1w     // Catch:{ all -> 0x019d }
            r1.<init>(r0)     // Catch:{ all -> 0x019d }
            goto L_0x0183     // Catch:{ all -> 0x019d }
        L_0x010f:
            java.lang.String r0 = "Unparseable error"     // Catch:{ all -> 0x019d }
            X.0wb.A03(r2, r0)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "GraphQL Error was not parseable. First level token: "     // Catch:{ all -> 0x019d }
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x019d }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x019d }
            r1.<init>(r0)     // Catch:{ all -> 0x019d }
            goto L_0x0183     // Catch:{ all -> 0x019d }
        L_0x0120:
            java.lang.String r0 = "Unparseable response"     // Catch:{ all -> 0x019d }
            X.0wb.A03(r2, r0)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "GraphQL Response was not parseable. First level token: "     // Catch:{ all -> 0x019d }
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x019d }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x019d }
            r1.<init>(r0)     // Catch:{ all -> 0x019d }
            goto L_0x0183     // Catch:{ all -> 0x019d }
        L_0x0131:
            java.lang.String r1 = "Check failed."     // Catch:{ all -> 0x019d }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x019d }
            r0.<init>(r1)     // Catch:{ all -> 0x019d }
            throw r0     // Catch:{ all -> 0x019d }
        L_0x0139:
            X.16L r0 = X.16L.A09     // Catch:{ all -> 0x019d }
            X.C293315kW.A00(r1, r0)     // Catch:{ all -> 0x019d }
            if (r4 == 0) goto L_0x0166     // Catch:{ all -> 0x019d }
            r11.close()     // Catch:{ all -> 0x01a2 }
            int r0 = r14.A02     // Catch:{ all -> 0x01a2 }
            r4.setStatusCode(r0)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = "X-IG-ANDROID-FROM-DISK-CACHE"     // Catch:{ all -> 0x01a2 }
            X.1Fn r1 = r14.A01(r0)     // Catch:{ all -> 0x01a2 }
            r0 = 0     // Catch:{ all -> 0x01a2 }
            if (r1 == 0) goto L_0x0152     // Catch:{ all -> 0x01a2 }
            r0 = 1     // Catch:{ all -> 0x01a2 }
        L_0x0152:
            r4.setFromDiskCache(r0)     // Catch:{ all -> 0x01a2 }
            r12.close()     // Catch:{ IOException -> 0x0159 }
            goto L_0x0165     // Catch:{ IOException -> 0x0159 }
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x0161
            r3 = r0
        L_0x0161:
            X.0wb.A03(r2, r3)
            return r4
        L_0x0165:
            return r4
        L_0x0166:
            java.lang.String r0 = "GraphQL response was missing"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x019d }
            r1.<init>(r0)     // Catch:{ all -> 0x019d }
            goto L_0x0183     // Catch:{ all -> 0x019d }
        L_0x016e:
            java.lang.String r0 = "error_message"     // Catch:{ all -> 0x019d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x0184     // Catch:{ all -> 0x019d }
            java.lang.String r0 = r11.A1O()     // Catch:{ all -> 0x019d }
            if (r0 != 0) goto L_0x017e     // Catch:{ all -> 0x019d }
            java.lang.String r0 = ""     // Catch:{ all -> 0x019d }
        L_0x017e:
            X.CTl r1 = new X.CTl     // Catch:{ all -> 0x019d }
            r1.<init>(r0)     // Catch:{ all -> 0x019d }
        L_0x0183:
            throw r1     // Catch:{ all -> 0x019d }
        L_0x0184:
            java.lang.String r0 = "Unexpected first level token"     // Catch:{ all -> 0x019d }
            X.0wb.A03(r2, r0)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "GraphQL Response was not parseable. Unexpected first level token: "     // Catch:{ all -> 0x019d }
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x019d }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x019d }
            r1.<init>(r0)     // Catch:{ all -> 0x019d }
            goto L_0x0183     // Catch:{ all -> 0x019d }
        L_0x0195:
            java.lang.String r1 = "Json Parser is null"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01a2 }
            r0.<init>(r1)     // Catch:{ all -> 0x01a2 }
            goto L_0x01a1     // Catch:{ all -> 0x01a2 }
            r0 = move-exception     // Catch:{ all -> 0x01a2 }
            r11.close()     // Catch:{ all -> 0x01a2 }
        L_0x01a1:
            throw r0     // Catch:{ all -> 0x01a2 }
            r1 = move-exception
            if (r12 == 0) goto L_0x01b4
            r12.close()     // Catch:{ IOException -> 0x01a9 }
            throw r1
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x01b1
            r3 = r0
        L_0x01b1:
            X.0wb.A03(r2, r3)
        L_0x01b4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C298345tH.then(java.lang.Object):java.lang.Object");
    }

    public C298345tH(Class cls, boolean z) {
        this.A01 = cls;
        this.A02 = z;
    }
}
