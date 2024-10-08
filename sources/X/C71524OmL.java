package X;

/* renamed from: X.OmL  reason: case insensitive filesystem */
public final class C71524OmL implements C74290PsI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C71524OmL(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0325, code lost:
        X.C71099OcZ.A02(r2, r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0329, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0380, code lost:
        r6.A02(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0383, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03a3, code lost:
        r4.A02(r3);
        r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d8, code lost:
        if (r0 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        r4.A04(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01bf, code lost:
        if (r4 != null) goto L_0x01c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void run(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x03aa;
                case 1: goto L_0x034f;
                case 2: goto L_0x02ed;
                case 3: goto L_0x029e;
                case 4: goto L_0x023e;
                case 5: goto L_0x00ee;
                case 6: goto L_0x0071;
                case 7: goto L_0x01d3;
                case 8: goto L_0x001c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A02
            X.OOB r0 = (X.OOB) r0
            X.ObS r4 = r0.A02()
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A01
            r0 = 8
            X.OmL r1 = new X.OmL
            r1.<init>(r0, r3, r10, r2)
        L_0x0018:
            r4.A04(r1)
        L_0x001b:
            return
        L_0x001c:
            X.Nnw r10 = (X.C69552Nnw) r10
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r9.A01
            X.Nnw r1 = (X.C69552Nnw) r1
            boolean r0 = r1 instanceof X.N0I
            if (r0 == 0) goto L_0x001b
            X.N0I r10 = (X.N0I) r10
            java.lang.Object r0 = r10.A00
            X.O5Q r0 = (X.O5Q) r0
            java.util.List r2 = r0.A00
            java.lang.Object r3 = r9.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r5 = r9.A02
            java.lang.Integer r5 = (java.lang.Integer) r5
            X.N0I r1 = (X.N0I) r1
            java.lang.Object r0 = r1.A00
            X.Njg r0 = (X.C69341Njg) r0
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x006e
            r0 = 0
            if (r1 == r0) goto L_0x006b
            r0 = 2
            if (r1 == r0) goto L_0x0068
            r0 = 3
            if (r1 != r0) goto L_0x03d1
            X.Nj3 r4 = X.C69302Nj3.FetchError
        L_0x0052:
            X.Njv r0 = X.C69356Njv.A07
            java.lang.Integer r6 = X.C71099OcZ.A00(r0, r2)
            X.Njv r0 = X.C69356Njv.A09
            java.lang.Integer r7 = X.C71099OcZ.A00(r0, r2)
            X.Njv r0 = X.C69356Njv.A05
            java.lang.Integer r8 = X.C71099OcZ.A00(r0, r2)
            X.C71099OcZ.A01(r3, r4, r5, r6, r7, r8)
            return
        L_0x0068:
            X.Nj3 r4 = X.C69302Nj3.DeviceNotOnboarded
            goto L_0x0052
        L_0x006b:
            X.Nj3 r4 = X.C69302Nj3.NoBackupsPresent
            goto L_0x0052
        L_0x006e:
            X.Nj3 r4 = X.C69302Nj3.DeviceOnboarded
            goto L_0x0052
        L_0x0071:
            X.Nnw r10 = (X.C69552Nnw) r10
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r6 = r9.A03
            X.MtS r6 = (X.C67713MtS) r6
            X.N0I r10 = (X.N0I) r10
            java.lang.Object r7 = r10.A00
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r9.A01
            X.OOB r3 = (X.OOB) r3
            X.0qQ.A0A(r3)
            java.lang.Object r5 = r9.A02
            X.ObS r4 = X.C71087ObS.A00()
            X.NUN r1 = r6.A02
            java.lang.String r0 = "GDRIVE_SETUP_GENERATE_RC_START"
            r1.A0B(r0)
            X.Njv r0 = X.C69356Njv.A07
            X.ObS r0 = r3.A04(r0)
            r8 = 1
            X.OmT r2 = new X.OmT
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.A04(r2)
            r0 = 15
            X.OmG r1 = new X.OmG
            r1.<init>(r0, r6, r3)
            goto L_0x0018
        L_0x00ad:
            boolean r0 = r10 instanceof X.N0J
            if (r0 == 0) goto L_0x001b
            X.N0J r10 = (X.N0J) r10
            java.lang.Exception r4 = r10.A00
            java.lang.Object r3 = r9.A03
            X.MtS r3 = (X.C67713MtS) r3
            X.05G r2 = r3.A08
            if (r4 == 0) goto L_0x00c3
            java.lang.String r1 = r4.getMessage()
            if (r1 != 0) goto L_0x00c5
        L_0x00c3:
            java.lang.String r1 = ""
        L_0x00c5:
            X.KQZ r0 = new X.KQZ
            r0.<init>(r4, r1)
            r2.FIA(r0)
            if (r4 == 0) goto L_0x00da
            X.3ju r0 = r3.A06
            r0.FIG(r4)
            java.lang.String r0 = r4.getMessage()
            if (r0 != 0) goto L_0x00dc
        L_0x00da:
            java.lang.String r0 = "fetch tpid Error"
        L_0x00dc:
            java.util.List r1 = r3.A05
            r1.add(r0)
            X.NUN r2 = r3.A02
            r0 = 0
            java.lang.String[] r1 = X.DbU.A1b(r1, r0)
            java.lang.String r0 = "FAILURE_REASON"
            r2.A0F(r0, r1)
            return
        L_0x00ee:
            X.Nnw r10 = (X.C69552Nnw) r10
            boolean r0 = r10 instanceof X.N0I
            java.lang.String r5 = ""
            java.lang.String r6 = "EncryptedBackupsGDriveRestoreViewModel"
            if (r0 == 0) goto L_0x0190
            X.N0I r10 = (X.N0I) r10
            java.lang.Object r1 = r10.A00
            java.lang.String r1 = (java.lang.String) r1
            X.0eM r0 = X.O5J.A04     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            r0.getValue()     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            java.lang.Object r7 = r9.A02     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            X.S5E r7 = (X.S5E) r7     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            r4 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r4, r7, r1)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            java.lang.String r2 = X.C71069Oao.A00(r7, r1)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            int r0 = r2.length()     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            if (r0 <= 0) goto L_0x0171
            java.lang.String r1 = "https://www.googleapis.com/drive/v3/files/"
            java.lang.String r0 = "?alt=media"
            java.lang.String r0 = X.002.A0g(r1, r2, r0)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            java.net.HttpURLConnection r2 = X.C66584MXp.A0d(r0)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            java.lang.String r0 = "GET"
            r2.setRequestMethod(r0)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            r2.setUseCaches(r4)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            r2.setDoInput(r3)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            r2.setDoOutput(r4)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            java.lang.String r1 = "Bearer "
            X.PwC r0 = X.C74517PwC.A00     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            X.0qQ.A08(r0)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            X.SIw r0 = r7.A00     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            java.lang.String r0 = r0.A00     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            r0.getClass()     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            java.lang.String r0 = "Authorization"
            r2.setRequestProperty(r0, r1)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            int r0 = r2.getResponseCode()     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            java.lang.String r7 = X.C71069Oao.A02(r2, r0)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            r2.disconnect()     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            java.lang.Object r4 = r9.A03     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            X.MtU r4 = (X.C67715MtU) r4     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            X.OyT r0 = r4.A04     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            r0.A04 = r3     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            X.OUY r1 = X.OUY.A00     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            com.instagram.common.session.UserSession r0 = r4.A01     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            java.util.concurrent.CompletableFuture r3 = r1.A00(r0)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            java.lang.Object r2 = r9.A01     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            r0 = 28
            X.PmT r1 = new X.PmT     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            r1.<init>(r4, r2, r7, r0)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            r0 = 5
            X.C73452Pcu.A00(r3, r1, r0)     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            goto L_0x03d6
        L_0x0171:
            X.Nnj r0 = new X.Nnj     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            r0.<init>()     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
            throw r0     // Catch:{ IOException -> 0x017b, Nnj -> 0x0177 }
        L_0x0177:
            r4 = move-exception
            java.lang.String r0 = "handleGDriveRestore FileNotExistException error"
            goto L_0x017e
        L_0x017b:
            r4 = move-exception
            java.lang.String r0 = "handleGDriveRestore ioexception error"
        L_0x017e:
            X.0KC.A0H(r6, r0, r4)
            java.lang.Object r1 = r9.A03
            X.MtU r1 = (X.C67715MtU) r1
            X.C67715MtU.A00(r1, r4)
            X.3ju r0 = r1.A07
            r0.FIG(r4)
            X.05G r1 = r1.A0B
            goto L_0x01c1
        L_0x0190:
            boolean r0 = r10 instanceof X.N0J
            if (r0 == 0) goto L_0x001b
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "handleGDriveRestore tpid error "
            r1.append(r0)
            X.N0J r10 = (X.N0J) r10
            java.lang.Exception r4 = r10.A00
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r4, r1)
            X.0KC.A0D(r6, r0)
            java.lang.Object r3 = r9.A03
            X.MtU r3 = (X.C67715MtU) r3
            X.C67715MtU.A00(r3, r4)
            X.3ju r2 = r3.A07
            if (r4 != 0) goto L_0x01d1
            java.lang.String r1 = "Unknown error"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
        L_0x01ba:
            r2.FIG(r0)
            X.05G r1 = r3.A0B
            if (r4 == 0) goto L_0x01c8
        L_0x01c1:
            java.lang.String r0 = r4.getMessage()
            if (r0 == 0) goto L_0x01c8
            r5 = r0
        L_0x01c8:
            X.NUC r0 = new X.NUC
            r0.<init>(r5)
            r1.FIA(r0)
            return
        L_0x01d1:
            r0 = r4
            goto L_0x01ba
        L_0x01d3:
            X.Nnw r10 = (X.C69552Nnw) r10
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r5 = r9.A03
            X.MtV r5 = (X.C67716MtV) r5
            java.lang.Object r4 = r9.A01
            java.lang.Object r3 = r9.A02
            X.NUK r0 = r5.A07
            r0.A09()
            X.OUY r1 = X.OUY.A00
            com.instagram.common.session.UserSession r0 = r5.A06
            java.util.concurrent.CompletableFuture r2 = r1.A00(r0)
            r0 = 0
            X.PqU r1 = new X.PqU
            r1.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5)
            r0 = 12
            X.C73452Pcu.A00(r2, r1, r0)
            return
        L_0x01fa:
            boolean r0 = r10 instanceof X.N0J
            java.lang.Object r3 = r9.A03
            X.MtV r3 = (X.C67716MtV) r3
            if (r0 == 0) goto L_0x023c
            X.N0J r10 = (X.N0J) r10
        L_0x0204:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "failed to generate RC, cause:"
            r1.append(r0)
            r2 = 0
            if (r10 == 0) goto L_0x023a
            java.lang.Exception r0 = r10.A00
        L_0x0212:
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r0, r1)
            java.lang.String r0 = "EncryptedBackupsPinSetupViewModel"
            X.0KC.A0D(r0, r1)
            if (r10 == 0) goto L_0x0225
            java.lang.Exception r0 = r10.A00
            if (r0 == 0) goto L_0x0225
            java.lang.String r2 = r0.toString()
        L_0x0225:
            X.C67716MtV.A02(r3, r2)
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0 = 2131961631(0x7f13271f, float:1.9559964E38)
            X.GKO r0 = X.DbS.A0Q(r1, r0)
            X.C67716MtV.A00(r0, r3)
            X.OyT r0 = r3.A09
            r0.A02 = r2
            return
        L_0x023a:
            r0 = r2
            goto L_0x0212
        L_0x023c:
            r10 = 0
            goto L_0x0204
        L_0x023e:
            X.Nnw r10 = (X.C69552Nnw) r10
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x0278
            java.lang.Object r1 = r9.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            X.0qQ.A0A(r1)
            X.NU1 r0 = X.NU1.A00
            r1.A02(r0)
            r1.A00()
            java.lang.Object r3 = r9.A03
            X.OO6 r3 = (X.OO6) r3
            X.NUG r2 = r3.A05
            java.lang.String r1 = "BLOCKSTORE"
            r2.A09()
            java.lang.String r0 = "RESTORE_KEY_SOLUTION"
            r2.A0D(r0, r1)
            X.0eM r0 = r3.A08
            java.lang.Object r1 = r0.getValue()
            X.OyT r1 = (X.C72203OyT) r1
            java.lang.Integer r0 = r3.A07
            r1.A05(r0)
            java.lang.Object r2 = r9.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x0325
        L_0x0278:
            boolean r0 = r10 instanceof X.N0J
            java.lang.Object r4 = r9.A01
            X.67Z r4 = (X.AnonymousClass67Z) r4
            if (r0 == 0) goto L_0x0298
            X.0qQ.A0A(r4)
            java.lang.String r2 = "failed to add device "
            X.N0J r10 = (X.N0J) r10
            java.lang.Exception r1 = r10.A00
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r1, r2, r0)
        L_0x0291:
            X.NTx r3 = new X.NTx
            r3.<init>(r0)
            goto L_0x03a3
        L_0x0298:
            X.0qQ.A0A(r4)
            java.lang.String r0 = "Failed to add device"
            goto L_0x0291
        L_0x029e:
            X.Nnw r10 = (X.C69552Nnw) r10
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x02c7
            X.N0I r10 = (X.N0I) r10
            java.lang.Object r1 = r10.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r9.A01
            X.67Z r4 = (X.AnonymousClass67Z) r4
            X.NTr r0 = X.C68705NTr.A00
            r4.A02(r0)
            java.lang.Object r6 = r9.A03
            X.1a8 r6 = (X.1a8) r6
            java.lang.Object r3 = r9.A02
            X.OO6 r3 = (X.OO6) r3
            X.1aU r2 = r3.A05(r6, r1)
            r0 = 4
            X.PUC r1 = new X.PUC
            r1.<init>((X.AnonymousClass67Z) r4, (X.1a8) r6, (X.OO6) r3, (int) r0)
            goto L_0x0380
        L_0x02c7:
            java.lang.Object r3 = r9.A02
            X.OO6 r3 = (X.OO6) r3
            X.NUV r0 = r3.A06
            java.lang.String r2 = "failed to generate rc"
            java.util.List r0 = r0.A00
            r0.add(r2)
            android.content.Context r0 = r3.A00
            X.ObS r1 = r3.A00(r0)
            r0 = 8
            X.C71087ObS.A01(r1, r3, r0)
            java.lang.Object r4 = r9.A01
            X.67Z r4 = (X.AnonymousClass67Z) r4
            X.0qQ.A0A(r4)
            X.NTn r3 = new X.NTn
            r3.<init>(r2)
            goto L_0x03a3
        L_0x02ed:
            X.Nnw r10 = (X.C69552Nnw) r10
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x032a
            java.lang.Object r1 = r9.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            X.0qQ.A0A(r1)
            X.NTi r0 = X.C68696NTi.A00
            r1.A02(r0)
            r1.A00()
            java.lang.Object r3 = r9.A03
            X.OHi r3 = (X.C70713OHi) r3
            X.NUG r2 = r3.A04
            java.lang.String r1 = "AUTO_BACKUPS"
            r2.A09()
            java.lang.String r0 = "RESTORE_KEY_SOLUTION"
            r2.A0D(r0, r1)
            X.0eM r0 = r3.A07
            java.lang.Object r1 = r0.getValue()
            X.OyT r1 = (X.C72203OyT) r1
            java.lang.Integer r0 = r3.A06
            r1.A05(r0)
            java.lang.Object r2 = r9.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
        L_0x0325:
            r0 = 0
            X.C71099OcZ.A02(r2, r1, r0)
            return
        L_0x032a:
            boolean r0 = r10 instanceof X.N0J
            java.lang.Object r4 = r9.A01
            X.67Z r4 = (X.AnonymousClass67Z) r4
            if (r0 == 0) goto L_0x0349
            X.0qQ.A0A(r4)
            java.lang.String r2 = "failed to add device "
            X.N0J r10 = (X.N0J) r10
            java.lang.Exception r1 = r10.A00
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r1, r2, r0)
        L_0x0343:
            X.NTe r3 = new X.NTe
            r3.<init>(r0)
            goto L_0x03a3
        L_0x0349:
            X.0qQ.A0A(r4)
            java.lang.String r0 = "Failed to add device"
            goto L_0x0343
        L_0x034f:
            X.Nnw r10 = (X.C69552Nnw) r10
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x0384
            java.lang.Object r5 = r9.A01
            X.67Z r5 = (X.AnonymousClass67Z) r5
            X.NTa r0 = X.C68688NTa.A00
            r5.A02(r0)
            X.N0I r10 = (X.N0I) r10
            java.lang.Object r4 = r10.A00
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r9.A02
            X.1a8 r6 = (X.1a8) r6
            java.lang.Object r3 = r9.A03
            X.OHi r3 = (X.C70713OHi) r3
            X.1aU r2 = r3.A02
            r0 = 34
            X.PmN r1 = new X.PmN
            r1.<init>(r4, r3, r0)
            r0 = 1
            X.1aU r2 = X.C72168Oxd.A00(r2, r6, r1, r0)
            r0 = 0
            X.PUC r1 = new X.PUC
            r1.<init>((X.AnonymousClass67Z) r5, (X.1a8) r6, (X.C70713OHi) r3, (int) r0)
        L_0x0380:
            r6.A02(r2, r1)
            return
        L_0x0384:
            java.lang.Object r0 = r9.A03
            X.OHi r0 = (X.C70713OHi) r0
            X.NUY r2 = r0.A05
            java.lang.String r1 = "failed to generate rc"
            java.util.List r0 = r2.A00
            r0.add(r1)
            r2.A0H()
            java.lang.Object r4 = r9.A01
            X.67Z r4 = (X.AnonymousClass67Z) r4
            X.0qQ.A0A(r4)
            java.lang.String r1 = "failed to generate recovery code"
            r0 = 0
            X.NTW r3 = new X.NTW
            r3.<init>(r0, r1)
        L_0x03a3:
            r4.A02(r3)
            r4.A00()
            return
        L_0x03aa:
            boolean r0 = r10 instanceof X.N0I
            if (r0 == 0) goto L_0x03c4
            java.lang.Object r2 = r9.A03
            X.OdW r2 = (X.C71133OdW) r2
            X.OFl r0 = r2.A00
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x03c4
            java.lang.Object r1 = r9.A02
            X.Nkh r1 = (X.C69403Nkh) r1
            java.lang.Object r0 = r9.A01
            X.ObS r0 = (X.C71087ObS) r0
            X.C71133OdW.A02(r2, r0, r1)
            return
        L_0x03c4:
            java.lang.Object r1 = r9.A01
            X.ObS r1 = (X.C71087ObS) r1
            com.encryptedbackups.statemanager.model.ApiCacheNotInitializedException r0 = new com.encryptedbackups.statemanager.model.ApiCacheNotInitializedException
            r0.<init>()
            X.N0J.A01(r1, r0)
            return
        L_0x03d1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71524OmL.run(java.lang.Object):void");
    }
}
