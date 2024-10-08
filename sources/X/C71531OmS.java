package X;

/* renamed from: X.OmS  reason: case insensitive filesystem */
public final class C71531OmS implements C74290PsI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ OWR A01;
    public final /* synthetic */ C71019OYu A02;
    public final /* synthetic */ C71087ObS A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C71531OmS(OWR owr, C71019OYu oYu, C71087ObS obS, String str, String str2, int i) {
        this.A02 = oYu;
        this.A00 = i;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = owr;
        this.A03 = obS;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0123 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0127 A[Catch:{ UnsupportedOperationException -> 0x0130 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void run(java.lang.Object r26) {
        /*
            r25 = this;
            r1 = r26
            X.Nnw r1 = (X.C69552Nnw) r1
            boolean r0 = r1 instanceof X.N0I
            r7 = r25
            if (r0 == 0) goto L_0x014a
            X.N0I r1 = (X.N0I) r1
            java.lang.Object r0 = r1.A00
            X.ONI r0 = (X.ONI) r0
            java.lang.String r4 = r0.A01
            X.NjU r1 = r0.A00
            X.NjU r0 = X.C69329NjU.A03
            boolean r9 = X.AnonymousClass7TF.A1W(r1, r0)
            X.OYu r5 = r7.A02
            X.OML r1 = r5.A01
            int r0 = r7.A00
            r24 = r0
            r3 = 1
            com.facebook.quicklog.QuickPerformanceLogger r6 = r1.A00
            r2 = 178991798(0xaab32b6, float:1.6485776E-32)
            java.lang.String r1 = "vdid_is_present"
            r6.markerAnnotate(r2, r0, r1, r3)
            X.OFm r2 = r5.A02
            X.0sa r0 = r5.isLoginHighPriorityEnabled
            boolean r0 = X.C51971G9r.A1b(r0)
            r2.A01 = r0
            X.0sa r0 = r5.isLoginLongLivedRetryEnabled
            boolean r0 = X.C51971G9r.A1b(r0)
            r2.A02 = r0
            X.0sa r0 = r5.hardTimeoutInSecondsForLogin
            int r0 = X.JTR.A0H(r0)
            r2.A00 = r0
            java.lang.String r14 = r7.A05
            java.lang.String r1 = r7.A04
            X.OWR r8 = r7.A01
            r16 = 0
            r0 = 4
            X.0qQ.A0B(r8, r0)
            X.ObS r6 = X.C71087ObS.A00()
            if (r9 == 0) goto L_0x00a6
            X.O5S r12 = X.C69688NqA.A00(r14)
            if (r12 != 0) goto L_0x0098
            java.lang.String r4 = "PIN normalization failed"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r8.A01
            r2 = 1021649468(0x3ce5223c, float:0.027970426)
            int r1 = r8.A00
            java.lang.String r0 = "pin_normalization_failed"
            r3.markerPoint(r2, r1, r0)
            java.lang.String r0 = "pin_normalization_error"
            X.C66583MXo.A1C(r3, r0, r4, r2, r1)
            X.Nk3 r3 = X.C69363Nk3.A0C
            java.lang.String r0 = r3.A01
            r8.A01(r0)
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r16)
            X.OW0 r0 = new X.OW0
            r0.<init>(r3, r1, r2, r2)
            r6.A05(r0)
        L_0x0086:
            X.ObS r0 = r7.A03
            X.OmQ r7 = new X.OmQ
            r9 = r16
            r10 = r8
            r11 = r5
            r12 = r0
            r8 = r24
            r7.<init>(r8, r9, r10, r11, r12)
            r6.A04(r7)
            return
        L_0x0098:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r11 = r8.A01
            r10 = 1021649468(0x3ce5223c, float:0.027970426)
            int r9 = r8.A00
            java.lang.String r0 = "pin_normalization_success"
            r11.markerPoint(r10, r9, r0)
            java.lang.String r14 = r12.A00
        L_0x00a6:
            X.OEl r13 = r2.A04
            X.OGb r10 = r13.A02
            boolean r0 = r2.A01
            r10.A01 = r0
            boolean r0 = r2.A02
            r10.A02 = r0
            int r0 = r2.A00
            r10.A00 = r0
            X.OVI r12 = new X.OVI
            r12.<init>(r8, r2, r6, r1)
            java.lang.String r11 = X.AnonymousClass7TF.A0c()
            com.facebook.quicklog.LightweightQuickPerformanceLogger r15 = r8.A01
            r9 = 1021649468(0x3ce5223c, float:0.027970426)
            int r1 = r8.A00
            java.lang.String r2 = "request_uuid"
            r15.markerAnnotate(r9, r1, r2, r11)
            java.lang.String r0 = "init_login_network_start"
            r15.markerPoint(r9, r1, r0)
            java.lang.Integer r0 = r13.A03
            java.lang.String r1 = X.C69691NqD.A00(r0)
            X.OLW r9 = new X.OLW
            r22 = r4
            r23 = r11
            r19 = r13
            r20 = r12
            r21 = r14
            r17 = r9
            r18 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r0 = 3
            X.0qQ.A0B(r11, r0)
            X.0Df r4 = X.C66584MXp.A0E(r1, r4)
            int r0 = r10.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "vesta_client_api_version"
            X.0Df.A00(r4, r1, r0)
            X.0Df.A00(r4, r11, r2)
            java.lang.Class<X.OOK> r2 = X.OOK.class
            java.lang.String r1 = "create"
            r0 = r16
            java.lang.Object r2 = X.C41847B3o.A17(r2, r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0144 }
            X.OnL r2 = (X.C71584OnL) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0144 }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "request"
            X.DbW.A18(r4, r1, r0)
            r2.A02 = r3
            X.1Ef r4 = r2.build()
            X.0qQ.A07(r4)
            boolean r0 = r10.A01     // Catch:{ UnsupportedOperationException -> 0x0123 }
            if (r0 == 0) goto L_0x0123
            r0 = 2
            r4.setRequestPurpose(r0)     // Catch:{ UnsupportedOperationException -> 0x0123 }
        L_0x0123:
            boolean r0 = r10.A02     // Catch:{ UnsupportedOperationException -> 0x0130 }
            if (r0 == 0) goto L_0x0130
            X.1Ef r1 = r4.setRetryPolicy(r3)     // Catch:{ UnsupportedOperationException -> 0x0130 }
            int r0 = r10.A00     // Catch:{ UnsupportedOperationException -> 0x0130 }
            r1.setNetworkTimeoutSeconds(r0)     // Catch:{ UnsupportedOperationException -> 0x0130 }
        L_0x0130:
            X.1vo r3 = r10.A04
            r0 = 2
            X.OnG r2 = new X.OnG
            r2.<init>(r0, r10, r9)
            X.On2 r1 = new X.On2
            r1.<init>(r9, r0)
            java.util.concurrent.Executor r0 = r10.A05
            r3.ATM(r1, r2, r4, r0)
            goto L_0x0086
        L_0x0144:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x014a:
            boolean r6 = r1 instanceof X.N0J
            X.OYu r5 = r7.A02
            X.OML r0 = r5.A01
            int r4 = r7.A00
            r3 = 0
            com.facebook.quicklog.QuickPerformanceLogger r2 = r0.A00
            r1 = 178991798(0xaab32b6, float:1.6485776E-32)
            java.lang.String r0 = "vdid_is_present"
            r2.markerAnnotate(r1, r4, r0, r3)
            X.ObS r1 = r7.A03
            if (r6 == 0) goto L_0x016e
            X.Nk3 r0 = X.C69363Nk3.A07
            X.C71019OYu.A01(r5, r0, r1, r4)
            X.OWR r1 = r7.A01
            java.lang.String r0 = "VDID_FETCH_FAILED"
        L_0x016a:
            r1.A01(r0)
            return
        L_0x016e:
            X.Nk3 r0 = X.C69363Nk3.A0G
            X.C71019OYu.A01(r5, r0, r1, r4)
            X.OWR r1 = r7.A01
            java.lang.String r0 = "MISSING_VDID_RESULT"
            goto L_0x016a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71531OmS.run(java.lang.Object):void");
    }
}
