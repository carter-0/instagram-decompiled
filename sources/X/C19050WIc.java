package X;

/* renamed from: X.WIc  reason: case insensitive filesystem */
public final class C19050WIc implements X5y {
    public final /* synthetic */ C18482Vsb A00;
    public final /* synthetic */ C17919ViA A01;
    public final /* synthetic */ C17346VRz A02;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x007b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DoE(com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig r19, boolean r20) {
        /*
            r18 = this;
            r12 = 0
            r6 = r18
            X.VRz r5 = r6.A02
            X.02m r3 = r5.A01
            int r2 = r5.A00
            r1 = 20120872(0x1330528, float:3.2880807E-38)
            java.lang.String r0 = "ohai_config_network_fetch_needed"
            r4 = r20
            r3.markerAnnotate(r1, r2, r0, r4)
            X.Vsb r4 = r6.A00
            java.util.Map r1 = r4.A01
            java.lang.String r0 = "LS_IgdReceiverFetch"
            java.lang.Object r3 = r1.get(r0)
            if (r3 == 0) goto L_0x00de
            X.VXa r3 = (X.C17473VXa) r3
            byte[] r2 = X.C18482Vsb.A05
            X.ViA r0 = r6.A01
            X.WIi r1 = new X.WIi
            r6 = r19
            r1.<init>(r4, r6, r0, r5)
            X.VZ9 r8 = r3.A00
            X.WIh r0 = new X.WIh
            r0.<init>(r1, r3)
            X.VgW r7 = new X.VgW
            r7.<init>(r8, r0, r2)
            X.W2O r10 = r8.A02
            monitor-enter(r10)
            java.util.HashMap r0 = X.W2O.A00(r10)     // Catch:{ JSONException -> 0x0049 }
            java.util.Collection r1 = r0.values()     // Catch:{ JSONException -> 0x0049 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0049 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0049 }
            goto L_0x004e
        L_0x0049:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00db }
            r0.<init>()     // Catch:{ all -> 0x00db }
        L_0x004e:
            monitor-exit(r10)
            java.util.Iterator r9 = r0.iterator()
            r6 = 0
        L_0x0054:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r5 = r9.next()
            X.V41 r5 = (X.V41) r5
            long r3 = java.lang.System.currentTimeMillis()
            long r1 = r5.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
            java.lang.String r1 = r5.A05
            monitor-enter(r10)
            X.0qQ.A0B(r1, r12)     // Catch:{ all -> 0x00db }
            java.util.HashMap r0 = X.W2O.A00(r10)     // Catch:{ JSONException -> 0x007b }
            r0.remove(r1)     // Catch:{ JSONException -> 0x007b }
            X.W2O.A02(r10, r0)     // Catch:{ JSONException -> 0x007b }
            goto L_0x007e
        L_0x007b:
            r10.A04()     // Catch:{ all -> 0x00db }
        L_0x007e:
            monitor-exit(r10)
            goto L_0x0054
        L_0x0080:
            if (r6 != 0) goto L_0x0054
            r6 = r5
            goto L_0x0054
        L_0x0084:
            if (r6 != 0) goto L_0x00d7
            java.lang.System.currentTimeMillis()
            X.VLe r0 = r8.A01
            java.lang.String r3 = r8.A04
            X.VQv r5 = new X.VQv
            r5.<init>(r7, r8)
            X.VXa r0 = r0.A00
            X.VRu r4 = r0.A02
            X.0qQ.A0B(r3, r12)
            r13 = 0
            X.2IS r2 = new X.2IS
            r2.<init>()
            X.2IS r1 = new X.2IS
            r1.<init>()
            java.lang.String r0 = "projectName"
            X.1vR r7 = X.DbU.A0J(r2, r0, r3)
            java.util.Map r9 = r2.getParamsCopy()
            java.util.Map r10 = r1.getParamsCopy()
            java.lang.Class<X.UQF> r11 = X.UQF.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "IGDirectACSConfigQuery"
            java.lang.String r16 = "acs_config"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vo r3 = r4.A00
            r0 = 1
            X.WHv r2 = new X.WHv
            r2.<init>(r0, r4, r5)
            X.WHf r1 = new X.WHf
            r1.<init>(r5, r0)
            java.util.concurrent.ExecutorService r0 = r4.A01
            r3.ATM(r1, r2, r6, r0)
            return
        L_0x00d7:
            r7.A00(r6)
            return
        L_0x00db:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x00de:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19050WIc.DoE(com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig, boolean):void");
    }

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        C17346VRz vRz = this.A02;
        02m r4 = vRz.A01;
        int i = vRz.A00;
        r4.markerAnnotate(20120872, i, "ohai_config_fetch_failure", true);
        r4.markerEnd(20120872, i, 3);
        this.A01.A00(th);
    }

    public C19050WIc(C18482Vsb vsb, C17919ViA viA, C17346VRz vRz) {
        this.A02 = vRz;
        this.A00 = vsb;
        this.A01 = viA;
    }
}
