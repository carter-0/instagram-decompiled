package X;

/* renamed from: X.OmG  reason: case insensitive filesystem */
public final class C71519OmG implements C74290PsI {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71519OmG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v30, types: [X.OAb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v32, types: [X.OAb, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03a7, code lost:
        r1 = (X.C71087ObS) r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03f6, code lost:
        r1.A05(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x041e, code lost:
        r2.A05(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0421, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cf, code lost:
        if (r0 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020c, code lost:
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0210, code lost:
        X.C67754Mu9.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0213, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0222, code lost:
        r1.append(r0);
        r1.append(((X.N0J) r10).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0254, code lost:
        r1.A02(r0.invoke(r10));
        r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x025e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void run(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x03fa;
                case 1: goto L_0x03de;
                case 2: goto L_0x03c5;
                case 3: goto L_0x03ac;
                case 4: goto L_0x038f;
                case 5: goto L_0x0377;
                case 6: goto L_0x0361;
                case 7: goto L_0x0347;
                case 8: goto L_0x02d5;
                case 9: goto L_0x0288;
                case 10: goto L_0x025f;
                case 11: goto L_0x0242;
                case 12: goto L_0x0230;
                case 13: goto L_0x01e0;
                case 14: goto L_0x01ae;
                case 15: goto L_0x0087;
                case 16: goto L_0x0128;
                case 17: goto L_0x00e5;
                case 18: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            X.Nnw r10 = (X.C69552Nnw) r10
            boolean r0 = r10 instanceof X.N0I
            java.lang.Object r5 = r9.A02
            X.MuD r5 = (X.C67758MuD) r5
            if (r0 == 0) goto L_0x043a
            X.NUQ r1 = r5.A07
            java.lang.String r0 = "TURN_OFF_3P_FINISHED"
            r1.A0B(r0)
            X.N0I r10 = (X.N0I) r10
            java.lang.Object r0 = r10.A00
            X.O5Q r0 = (X.O5Q) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x0027:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.ONe r0 = (X.C70832ONe) r0
            X.Njv r1 = r0.A00
            X.Njv r0 = X.C69356Njv.A07
            if (r1 != r0) goto L_0x0027
            r4.add(r2)
            goto L_0x0027
        L_0x003e:
            java.util.Iterator r8 = r4.iterator()
        L_0x0042:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0005
            java.lang.Object r1 = r8.next()
            X.ONe r1 = (X.C70832ONe) r1
            java.lang.Object r0 = r9.A01
            X.OOB r0 = (X.OOB) r0
            java.lang.String r7 = r1.A01
            X.OZI r1 = r0.A00
            X.ObS r6 = X.C71087ObS.A00()
            X.O5P r0 = r1.A01
            X.0sa r0 = r0.A00
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 != 0) goto L_0x006d
            X.OZI.A01(r6)
        L_0x0067:
            r0 = 29
            X.C71087ObS.A01(r6, r5, r0)
            goto L_0x0042
        L_0x006d:
            X.NAX r4 = r1.A02
            r0 = 9
            X.Opg r0 = X.C71722Opg.A00(r6, r0)
            X.68L r3 = X.C66581MXm.A0I(r4)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66581MXm.A0J(r3, r0)
            r1 = 3
            X.OoX r0 = new X.OoX
            r0.<init>(r4, r2, r7, r1)
            X.C66582MXn.A1E(r3, r0, r2)
            goto L_0x0067
        L_0x0087:
            X.Nnw r10 = (X.C69552Nnw) r10
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r1 = r9.A01
            X.OOB r1 = (X.OOB) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A06(r0)
            java.lang.Object r0 = r9.A02
            X.MtS r0 = (X.C67713MtS) r0
            X.05G r1 = r0.A08
            X.N0I r10 = (X.N0I) r10
            java.lang.Object r0 = r10.A00
            r1.Epw(r0)
            return
        L_0x00a4:
            boolean r0 = r10 instanceof X.N0J
            if (r0 == 0) goto L_0x0005
            X.N0J r10 = (X.N0J) r10
            java.lang.Exception r4 = r10.A00
            java.lang.Object r3 = r9.A02
            X.MtS r3 = (X.C67713MtS) r3
            X.05G r2 = r3.A08
            if (r4 == 0) goto L_0x00ba
            java.lang.String r1 = r4.getMessage()
            if (r1 != 0) goto L_0x00bc
        L_0x00ba:
            java.lang.String r1 = ""
        L_0x00bc:
            X.KQZ r0 = new X.KQZ
            r0.<init>(r4, r1)
            r2.FIA(r0)
            if (r4 == 0) goto L_0x00d1
            X.3ju r0 = r3.A06
            r0.FIG(r4)
            java.lang.String r0 = r4.getMessage()
            if (r0 != 0) goto L_0x00d3
        L_0x00d1:
            java.lang.String r0 = "on tpid generated failure"
        L_0x00d3:
            java.util.List r1 = r3.A05
            r1.add(r0)
            X.NUN r2 = r3.A02
            r0 = 0
            java.lang.String[] r1 = X.DbU.A1b(r1, r0)
            java.lang.String r0 = "FAILURE_REASON"
            r2.A0F(r0, r1)
            return
        L_0x00e5:
            X.Nnw r10 = (X.C69552Nnw) r10
            java.lang.Object r5 = r9.A02
            X.OyT r5 = (X.C72203OyT) r5
            X.05G r1 = r5.A0N
            X.Niu r0 = X.C69294Niu.Loading
            r1.Epw(r0)
            X.05G r0 = r5.A0K
            X.Niv r1 = X.C69295Niv.Loading
            r0.Epw(r1)
            X.05G r0 = r5.A0L
            r0.Epw(r1)
            X.05G r0 = r5.A0M
            r0.Epw(r1)
            X.0eM r0 = r5.A09
            java.lang.Object r4 = r0.getValue()
            X.NUZ r4 = (X.NUZ) r4
            java.lang.Object r3 = r9.A01
            java.lang.Integer r3 = (java.lang.Integer) r3
            com.instagram.common.session.UserSession r0 = r5.A08
            X.65E r0 = X.AnonymousClass65D.A00(r0)
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36315949947948821(0x81052a00540f15, double:3.029691207451275E-306)
            boolean r1 = X.AnonymousClass65A.A02(r2, r0)
            r0 = 1
            r4.A0H(r3, r1, r0)
            X.C72203OyT.A02(r10, r5)
            return
        L_0x0128:
            X.OVu r10 = (X.C70999OVu) r10
            if (r10 == 0) goto L_0x0159
            X.Nk3 r4 = r10.A00
            r0 = -1
            if (r4 == 0) goto L_0x0159
            int r1 = r4.ordinal()
            if (r1 == r0) goto L_0x0159
            r3 = 0
            if (r1 == r3) goto L_0x0159
            r2 = 1
            if (r1 == r2) goto L_0x014f
            r0 = 4
            if (r1 == r0) goto L_0x014f
            java.lang.Object r1 = r9.A02
            X.MtV r1 = (X.C67716MtV) r1
            java.lang.String r0 = r4.A01
            X.C67716MtV.A03(r1, r0, r3)
        L_0x0149:
            X.OyT r1 = r1.A09
            r0 = 0
            r1.A02 = r0
            return
        L_0x014f:
            java.lang.Object r1 = r9.A02
            X.MtV r1 = (X.C67716MtV) r1
            java.lang.String r0 = r4.A01
            X.C67716MtV.A03(r1, r0, r2)
            goto L_0x0149
        L_0x0159:
            java.lang.Object r1 = r9.A02
            X.MtV r1 = (X.C67716MtV) r1
            java.lang.Object r2 = r9.A01
            X.OOB r2 = (X.OOB) r2
            X.NUK r0 = r1.A07
            r0.A08()
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r2.A06(r3)
            X.NUN r2 = r1.A08
            java.lang.String r0 = "CONFIRM_PIN_SETUP_SUCCESS"
            r2.A0B(r0)
            r2.A08()
            java.lang.Integer r5 = r1.A0C
            if (r5 == r3) goto L_0x017d
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r5 != r0) goto L_0x0193
        L_0x017d:
            X.Nj3 r0 = r1.A0A
            int r3 = r0.ordinal()
            r2 = 4
            r0 = 2131975433(0x7f135d09, float:1.9587958E38)
            if (r3 != r2) goto L_0x018c
            r0 = 2131961634(0x7f132722, float:1.955997E38)
        L_0x018c:
            X.GKO r0 = X.JTP.A0Q(r0)
            X.C67716MtV.A01(r0, r1)
        L_0x0193:
            com.instagram.common.session.UserSession r0 = r1.A06
            r8 = 0
            X.OKI r2 = new X.OKI
            r2.<init>(r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A0j
            android.app.Application r3 = r1.A0D()
            X.1a8 r4 = r1.A05
            r0 = 47
            X.PqZ r7 = new X.PqZ
            r7.<init>(r1, r0)
            r2.A00(r3, r4, r5, r6, r7, r8)
            goto L_0x0149
        L_0x01ae:
            X.Nnw r10 = (X.C69552Nnw) r10
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x01ce
            X.OUY r1 = X.OUY.A00
            java.lang.Object r4 = r9.A02
            X.Mu9 r4 = (X.C67754Mu9) r4
            com.instagram.common.session.UserSession r0 = r4.A05
            java.util.concurrent.CompletableFuture r3 = r1.A00(r0)
            java.lang.Object r2 = r9.A01
            r0 = 49
            X.J6W r1 = new X.J6W
            r1.<init>(r0, r2, r10, r4)
            r0 = 4
            X.C73452Pcu.A00(r3, r1, r0)
            return
        L_0x01ce:
            boolean r0 = r10 instanceof X.N0J
            java.lang.Object r2 = r9.A02
            X.Mu9 r2 = (X.C67754Mu9) r2
            if (r0 == 0) goto L_0x01dd
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "generateRecoveryCode: failure, cause="
            goto L_0x0222
        L_0x01dd:
            java.lang.String r0 = "generateRecoveryCode: unknown failure"
            goto L_0x0210
        L_0x01e0:
            X.Nnw r10 = (X.C69552Nnw) r10
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x0214
            java.lang.Object r2 = r9.A02
            X.Mu9 r2 = (X.C67754Mu9) r2
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "createVirtualDevice: success, rcResult="
            r1.append(r0)
            X.N0I r10 = (X.N0I) r10
            java.lang.Object r0 = r10.A00
            r1.append(r0)
            java.lang.String r0 = ", recoveryCode="
            r1.append(r0)
            java.lang.Object r0 = r9.A01
            X.Nnw r0 = (X.C69552Nnw) r0
            X.N0I r0 = (X.N0I) r0
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
        L_0x020c:
            java.lang.String r0 = r1.toString()
        L_0x0210:
            X.C67754Mu9.A01(r2, r0)
            return
        L_0x0214:
            boolean r0 = r10 instanceof X.N0J
            java.lang.Object r2 = r9.A02
            X.Mu9 r2 = (X.C67754Mu9) r2
            if (r0 == 0) goto L_0x022d
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "createVirtualDevice: failure, cause="
        L_0x0222:
            r1.append(r0)
            X.N0J r10 = (X.N0J) r10
            java.lang.Exception r0 = r10.A00
            r1.append(r0)
            goto L_0x020c
        L_0x022d:
            java.lang.String r0 = "createVirtualDevice: failure"
            goto L_0x0210
        L_0x0230:
            java.lang.Object r1 = r9.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            X.0qQ.A0A(r1)
            java.lang.Object r0 = r9.A02
            X.0sP r0 = (X.0sP) r0
            if (r10 != 0) goto L_0x0254
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x0242:
            java.lang.Object r1 = r9.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            X.0qQ.A0A(r1)
            java.lang.Object r0 = r9.A02
            X.0sP r0 = (X.0sP) r0
            if (r10 != 0) goto L_0x0254
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x0254:
            java.lang.Object r0 = r0.invoke(r10)
            r1.A02(r0)
            r1.A00()
            return
        L_0x025f:
            java.lang.Object r0 = r9.A01
            X.SRY r0 = (X.SRY) r0
            java.lang.Object r3 = r9.A02
            X.S3o r3 = (X.C10980S3o) r3
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r0.A06     // Catch:{ Exception -> 0x0283 }
            if (r0 == 0) goto L_0x026f
            r3.A00(r0)     // Catch:{ Exception -> 0x0283 }
            return
        L_0x026f:
            r0 = 129(0x81, float:1.81E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ Exception -> 0x0283 }
            java.lang.String r2 = "Callback service is not available after future is resolved."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0283 }
            X.SQO.A01(r0, r2, r1)     // Catch:{ Exception -> 0x0283 }
            java.lang.String r1 = "Callback service is not available after future is resolved"
            X.0KC.A0E(r0, r1)     // Catch:{ Exception -> 0x0283 }
            return
        L_0x0283:
            r0 = move-exception
            r3.A01(r0)
            return
        L_0x0288:
            X.No0 r10 = (X.C69556No0) r10
            boolean r0 = r10 instanceof X.N0R
            if (r0 == 0) goto L_0x0299
            java.lang.Object r2 = r9.A01
            X.ObS r2 = (X.C71087ObS) r2
            java.lang.Object r1 = r9.A02
            r0 = 0
            X.C71087ObS.A01(r2, r1, r0)
            return
        L_0x0299:
            boolean r1 = r10 instanceof X.N0Q
            r0 = 0
            if (r1 == 0) goto L_0x02bc
            java.lang.Object r2 = r9.A02
            X.ObS r2 = (X.C71087ObS) r2
            X.OAb r1 = new X.OAb
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            X.N0Q r10 = (X.N0Q) r10
            X.Nk3 r0 = r10.A00
        L_0x02b1:
            r1.A00 = r0
            X.OVu r0 = new X.OVu
            r0.<init>(r1)
            r2.A05(r0)
            return
        L_0x02bc:
            if (r10 != 0) goto L_0x02d0
            java.lang.Object r2 = r9.A02
            X.ObS r2 = (X.C71087ObS) r2
            X.OAb r1 = new X.OAb
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            X.Nk3 r0 = X.C69363Nk3.A07
            goto L_0x02b1
        L_0x02d0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02d5:
            X.Nnw r10 = (X.C69552Nnw) r10
            if (r10 != 0) goto L_0x02fd
            java.lang.Object r0 = r9.A02
            X.OVw r0 = (X.C71000OVw) r0
            java.lang.String r4 = "Missing result"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r0.A01
            r2 = 1021652080(0x3ce52c70, float:0.027975291)
            int r1 = r0.A00
            java.lang.String r0 = "create_virtual_device_failed"
            r3.markerPoint(r2, r1, r0)
            java.lang.String r0 = "create_virtual_device_error"
            X.C66583MXo.A1C(r3, r0, r4, r2, r1)
        L_0x02f0:
            java.lang.Object r2 = r9.A01
            X.ObS r2 = (X.C71087ObS) r2
            X.Nk3 r0 = X.C69363Nk3.A07
            X.N0O r1 = new X.N0O
            r1.<init>(r0)
            goto L_0x041e
        L_0x02fd:
            boolean r0 = r10 instanceof X.N0J
            if (r0 == 0) goto L_0x0326
            java.lang.String r4 = "createUniqueVirtualDevice failed"
            java.lang.Object r1 = r9.A02
            X.OVw r1 = (X.C71000OVw) r1
            X.N0J r10 = (X.N0J) r10
            java.lang.Exception r0 = r10.A00
            if (r0 == 0) goto L_0x0314
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x0314
            r4 = r0
        L_0x0314:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r1.A01
            r2 = 1021652080(0x3ce52c70, float:0.027975291)
            int r1 = r1.A00
            java.lang.String r0 = "create_virtual_device_failed"
            r3.markerPoint(r2, r1, r0)
            java.lang.String r0 = "create_virtual_device_error"
            X.C66583MXo.A1C(r3, r0, r4, r2, r1)
            goto L_0x02f0
        L_0x0326:
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x0342
            java.lang.Object r0 = r9.A02
            X.OVw r0 = (X.C71000OVw) r0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r0.A01
            r2 = 1021652080(0x3ce52c70, float:0.027975291)
            int r1 = r0.A00
            java.lang.String r0 = "create_virtual_device_success"
            r3.markerPoint(r2, r1, r0)
            java.lang.Object r2 = r9.A01
            X.ObS r2 = (X.C71087ObS) r2
            X.N0P r1 = X.N0P.A00
            goto L_0x041e
        L_0x0342:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0347:
            X.Nnw r10 = (X.C69552Nnw) r10
            java.lang.Object r0 = r9.A02
            X.ONS r0 = (X.ONS) r0
            r0.A01(r10)
            java.lang.Object r1 = r9.A01
            X.ObS r1 = (X.C71087ObS) r1
            if (r10 != 0) goto L_0x03f6
            com.encryptedbackups.statemanager.model.RemoveAllDevicesFromBackupException r0 = new com.encryptedbackups.statemanager.model.RemoveAllDevicesFromBackupException
            r0.<init>()
            X.N0J r10 = X.N0J.A00(r0)
            goto L_0x03f6
        L_0x0361:
            X.Nnw r10 = (X.C69552Nnw) r10
            java.lang.Object r0 = r9.A02
            X.ONS r0 = (X.ONS) r0
            r0.A01(r10)
            java.lang.Object r1 = r9.A01
            X.ObS r1 = (X.C71087ObS) r1
            if (r10 != 0) goto L_0x03f6
            r0 = 0
            X.N0J r10 = X.N0J.A00(r0)
            goto L_0x03f6
        L_0x0377:
            X.Nnw r10 = (X.C69552Nnw) r10
            java.lang.Object r0 = r9.A01
            X.ONS r0 = (X.ONS) r0
            r0.A01(r10)
            if (r10 != 0) goto L_0x03a7
            java.lang.Object r1 = r9.A02
            X.ObS r1 = (X.C71087ObS) r1
            X.NnJ r0 = new X.NnJ
            r0.<init>()
            X.N0J.A01(r1, r0)
            return
        L_0x038f:
            X.Nnw r10 = (X.C69552Nnw) r10
            java.lang.Object r0 = r9.A01
            X.ONS r0 = (X.ONS) r0
            r0.A01(r10)
            if (r10 != 0) goto L_0x03a7
            java.lang.Object r1 = r9.A02
            X.ObS r1 = (X.C71087ObS) r1
            X.NnJ r0 = new X.NnJ
            r0.<init>()
            X.N0J.A01(r1, r0)
            return
        L_0x03a7:
            java.lang.Object r1 = r9.A02
            X.ObS r1 = (X.C71087ObS) r1
            goto L_0x03f6
        L_0x03ac:
            X.Nnw r10 = (X.C69552Nnw) r10
            java.lang.Object r0 = r9.A01
            X.ONS r0 = (X.ONS) r0
            r0.A01(r10)
            java.lang.Object r1 = r9.A02
            X.ObS r1 = (X.C71087ObS) r1
            if (r10 != 0) goto L_0x03f6
            X.NnJ r0 = new X.NnJ
            r0.<init>()
            X.N0J r10 = X.N0J.A00(r0)
            goto L_0x03f6
        L_0x03c5:
            X.Nnw r10 = (X.C69552Nnw) r10
            java.lang.Object r0 = r9.A01
            X.ONS r0 = (X.ONS) r0
            r0.A01(r10)
            java.lang.Object r1 = r9.A02
            X.ObS r1 = (X.C71087ObS) r1
            if (r10 != 0) goto L_0x03f6
            com.encryptedbackups.statemanager.model.CreateVirtualDeviceException r0 = new com.encryptedbackups.statemanager.model.CreateVirtualDeviceException
            r0.<init>()
            X.N0J r10 = X.N0J.A00(r0)
            goto L_0x03f6
        L_0x03de:
            X.Nnw r10 = (X.C69552Nnw) r10
            java.lang.Object r0 = r9.A01
            X.ONS r0 = (X.ONS) r0
            r0.A01(r10)
            java.lang.Object r1 = r9.A02
            X.ObS r1 = (X.C71087ObS) r1
            if (r10 != 0) goto L_0x03f6
            com.encryptedbackups.statemanager.model.AddDeviceException r0 = new com.encryptedbackups.statemanager.model.AddDeviceException
            r0.<init>()
            X.N0J r10 = X.N0J.A00(r0)
        L_0x03f6:
            r1.A05(r10)
            return
        L_0x03fa:
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x0422
            java.lang.Object r0 = r9.A02
            X.OdW r0 = (X.C71133OdW) r0
            X.OFl r1 = r0.A00
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0422
            java.lang.Object r2 = r9.A01
            X.ObS r2 = (X.C71087ObS) r2
            java.util.List r0 = r1.A01
            if (r0 == 0) goto L_0x0430
            java.util.ArrayList r1 = X.C71133OdW.A01(r0)
            X.O5Q r0 = new X.O5Q
            r0.<init>(r1)
            X.N0I r1 = new X.N0I
            r1.<init>(r0)
        L_0x041e:
            r2.A05(r1)
            return
        L_0x0422:
            java.lang.Object r2 = r9.A01
            X.ObS r2 = (X.C71087ObS) r2
            com.encryptedbackups.statemanager.model.ApiCacheNotInitializedException r0 = new com.encryptedbackups.statemanager.model.ApiCacheNotInitializedException
            r0.<init>()
            X.N0J r1 = X.N0J.A00(r0)
            goto L_0x041e
        L_0x0430:
            java.lang.String r0 = "virtualDevicesList"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x043a:
            java.lang.String r1 = "TURN_OFF_3P_FETCH_VD_FAIL"
            X.NUQ r0 = r5.A07
            r0.A0B(r1)
            r0 = 2131973146(0x7f13541a, float:1.958332E38)
            X.C67758MuD.A03(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71519OmG.run(java.lang.Object):void");
    }
}
