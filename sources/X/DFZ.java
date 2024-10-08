package X;

public final class DFZ implements AnonymousClass2Kv {
    public final /* synthetic */ C70834ONg A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ 0sP A04;

    public DFZ(C70834ONg oNg, String str, String str2, C62320sa r4, 0sP r5) {
        this.A00 = oNg;
        this.A04 = r5;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r8 == null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r14) {
        /*
            r13 = this;
            X.ONg r5 = r13.A00
            X.5D7 r0 = r5.A00
            r4 = 1
            r0.A03(r4)
            r6 = 0
            if (r14 == 0) goto L_0x005a
            X.3lr r3 = X.C41845B3m.A0U(r14)
            if (r3 == 0) goto L_0x005a
            java.lang.Class<X.BiJ> r2 = X.C42783BiJ.class
            java.lang.String r1 = "xfb_genai_platform_agent_sync_chat(agent_id:$agent_id,metagen_key:$metagen_key,plugin_request_options:$plugin_request_options,prompt:{\"content\":$content,\"role\":$role},runtime_params:$runtime_params)"
            r0 = 324345727(0x13551f7f, float:2.6899908E-27)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x005a
            java.lang.Class<X.BiI> r2 = X.C42782BiI.class
            java.lang.String r1 = "response_metadata"
            r0 = 333974355(0x13e80b53, float:5.85762E-27)
            X.3lr r7 = r3.getOptionalTreeField(r4, r1, r2, r0)
            X.BiI r7 = (X.C42782BiI) r7
            if (r7 == 0) goto L_0x0043
            java.lang.Class<X.BiH> r3 = X.C42781BiH.class
            r2 = 3
            java.lang.String r1 = "error"
            r0 = -279505678(0xffffffffef5714f2, float:-6.65646E28)
            X.3lr r6 = r7.getOptionalTreeField(r2, r1, r3, r0)
            X.BiH r6 = (X.C42781BiH) r6
            java.lang.String r0 = "response"
            java.lang.String r8 = r7.A09(r0)
            if (r8 != 0) goto L_0x0045
        L_0x0043:
            java.lang.String r8 = ""
        L_0x0045:
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()
            X.0sP r12 = r13.A04
            java.lang.String r9 = r13.A02
            java.lang.String r10 = r13.A01
            X.0sa r11 = r13.A03
            X.DI6 r4 = new X.DI6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.post(r4)
            return
        L_0x005a:
            r7 = r6
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFZ.invoke(X.3JD):void");
    }
}
