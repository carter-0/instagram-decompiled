package X;

/* renamed from: X.OmC  reason: case insensitive filesystem */
public final class C71515OmC implements C74290PsI {
    public final int A00;
    public final Object A01;

    public C71515OmC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.OAb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.OAb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.OAb, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02fc, code lost:
        X.C67758MuD.A03(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ff, code lost:
        X.C67758MuD.A01(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0302, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0307, code lost:
        r2.A0B(r0);
        X.C66913Mex.A04(r2, "ERROR_CODE", "FETCH_BACKUP_STATUS_API_FAILED");
        X.C73568Pfp.A02(new X.C61084JwM((X.C266444Yx) X.DbS.A0Q(new java.lang.Object[0], 2131973143), (X.C266444Yx) null, java.lang.Integer.valueOf(com.instagram.android.R.drawable.instagram_error_pano_outline_24), 2), r5, X.C318116oQ.A00(r5), 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0496, code lost:
        if (r0 == null) goto L_0x0498;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0693, code lost:
        r4 = X.JTP.A0Q(r1);
        X.AnonymousClass7TE.A1Z(new X.C58104ImQ(r4, r5, (X.AnonymousClass4D7) null, 46), X.C318116oQ.A00(r5));
        r5.A0B.Epw((java.lang.Object) null);
        r5.A07.A05(X.AnonymousClass05K.A0Y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x06b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x06f0, code lost:
        r1.A05(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x06f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0738, code lost:
        r2.A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x073b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0259, code lost:
        r3.FIA(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x025c, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void run(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x071a;
                case 1: goto L_0x070f;
                case 2: goto L_0x06f4;
                case 3: goto L_0x06fe;
                case 4: goto L_0x06df;
                case 5: goto L_0x06cd;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x06b3;
                case 10: goto L_0x0005;
                case 11: goto L_0x0685;
                case 12: goto L_0x0112;
                case 13: goto L_0x0676;
                case 14: goto L_0x064d;
                case 15: goto L_0x063c;
                case 16: goto L_0x0212;
                case 17: goto L_0x01ed;
                case 18: goto L_0x01d7;
                case 19: goto L_0x05eb;
                case 20: goto L_0x0192;
                case 21: goto L_0x0075;
                case 22: goto L_0x03c7;
                case 23: goto L_0x03bd;
                case 24: goto L_0x0392;
                case 25: goto L_0x0379;
                case 26: goto L_0x0331;
                case 27: goto L_0x02da;
                case 28: goto L_0x002d;
                case 29: goto L_0x02b8;
                case 30: goto L_0x0290;
                case 31: goto L_0x0158;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.OO6 r0 = (X.OO6) r0
            X.NUV r2 = r0.A06
            boolean r0 = X.DbX.A1a(r11)
            java.lang.String r1 = "IS_BLOCKSTORE_E2EE_ENABLED"
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "YES"
        L_0x0015:
            r2.A0D(r1, r0)
            java.util.List r1 = r2.A00
            r0 = 0
            java.lang.String[] r1 = X.DbU.A1b(r1, r0)
            java.lang.String r0 = "FAILURE_REASON"
            r2.A0F(r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A0A(r0)
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r0 = "NO"
            goto L_0x0015
        L_0x002d:
            X.Nnw r11 = (X.C69552Nnw) r11
            boolean r0 = r11 instanceof X.N0I
            if (r0 == 0) goto L_0x0066
            X.N0I r11 = (X.N0I) r11
            java.lang.Object r3 = r11.A00
            X.ONH r3 = (X.ONH) r3
            java.lang.Long r0 = r3.A01
            if (r0 == 0) goto L_0x0063
            long r1 = r0.longValue()
            X.NUh r0 = new X.NUh
            r0.<init>(r1)
        L_0x0046:
            java.lang.Long r1 = r3.A00
            if (r1 == 0) goto L_0x0060
            long r2 = r1.longValue()
            X.NUh r1 = new X.NUh
            r1.<init>(r2)
        L_0x0053:
            java.lang.Object r2 = r10.A01
            X.MuD r2 = (X.C67758MuD) r2
            X.05G r3 = r2.A0J
            X.N4R r2 = new X.N4R
            r2.<init>((X.C69582NoQ) r0, (X.C69582NoQ) r1)
            goto L_0x0259
        L_0x0060:
            X.NUi r1 = X.C68722NUi.A00
            goto L_0x0053
        L_0x0063:
            X.NUi r0 = X.C68722NUi.A00
            goto L_0x0046
        L_0x0066:
            java.lang.Object r0 = r10.A01
            X.MuD r0 = (X.C67758MuD) r0
            X.05G r3 = r0.A0J
            X.NUi r0 = X.C68722NUi.A00
            X.N4R r2 = new X.N4R
            r2.<init>((X.C69582NoQ) r0, (X.C69582NoQ) r0)
            goto L_0x0259
        L_0x0075:
            X.Nnw r11 = (X.C69552Nnw) r11
            boolean r0 = r11 instanceof X.N0I
            java.lang.Object r3 = r10.A01
            X.MtR r3 = (X.C67712MtR) r3
            if (r0 == 0) goto L_0x00ea
            X.N0I r11 = (X.N0I) r11
            java.lang.Object r0 = r11.A00
            X.O5R r0 = (X.O5R) r0
            X.Njr r4 = r0.A00
            int r0 = r4.ordinal()
            r5 = 0
            if (r0 != r5) goto L_0x00ec
            X.NUa r1 = r3.A06
            java.lang.String r0 = "OTC_ENTER_PIN_RESTORE_SUCCESS"
            r1.A0B(r0)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            r1.A0A(r8)
            java.lang.Integer r7 = r3.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r7 == r0) goto L_0x00be
            r0 = 2131975432(0x7f135d08, float:1.9587956E38)
            r6 = 0
            r1 = 6
            X.GKO r0 = X.JTP.A0Q(r0)
            X.JwM r4 = new X.JwM
            r4.<init>((X.C266444Yx) r0, (X.C266444Yx) r6, (java.lang.Integer) r6, (int) r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r0 = 48
            X.ImQ r1 = new X.ImQ
            r1.<init>(r4, r3, r6, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A03(r8, r0, r1, r2)
        L_0x00be:
            X.NUG r2 = r3.A05
            java.lang.String r1 = "OTC"
            r2.A09()
            java.lang.String r0 = "RESTORE_KEY_SOLUTION"
            r2.A0D(r0, r1)
            X.OyT r2 = r3.A07
            r2.A05(r7)
            com.instagram.common.session.UserSession r1 = r3.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.C71099OcZ.A02(r1, r0, r5)
            r1 = 15
            X.J6s r0 = new X.J6s
            r0.<init>(r3, r1)
            r2.A06(r0)
        L_0x00e0:
            X.05G r3 = r3.A0F
            r0 = 0
            X.O6C r2 = new X.O6C
            r2.<init>(r0)
            goto L_0x0259
        L_0x00ea:
            X.Njr r4 = X.C69352Njr.GENERIC_ERROR
        L_0x00ec:
            java.util.List r1 = r3.A09
            java.lang.String r0 = r4.toString()
            r1.add(r0)
            X.NUa r2 = r3.A06
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L_0x010c
            r0 = 0
            java.lang.String[] r1 = X.DbU.A1b(r1, r0)
            java.lang.String r0 = "OTC_FAILURE_REASON"
            r2.A0F(r0, r1)
            java.lang.String r0 = "OTC_ENTER_PIN_RESTORE_FAILURE"
            r2.A0B(r0)
        L_0x010c:
            X.05G r0 = r3.A0D
            r0.FIA(r4)
            goto L_0x00e0
        L_0x0112:
            X.Nnw r11 = (X.C69552Nnw) r11
            boolean r0 = r11 instanceof X.N0I
            if (r0 == 0) goto L_0x014e
            X.N0I r11 = (X.N0I) r11
            java.lang.Object r0 = r11.A00
            X.ON8 r0 = (X.ON8) r0
            java.lang.Integer r0 = r0.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x014e
            r0 = 1
            if (r1 == r0) goto L_0x0144
            r0 = 2
            if (r1 == r0) goto L_0x013a
            r0 = 3
            if (r1 != r0) goto L_0x028b
            java.lang.Object r0 = r10.A01
            X.Mu9 r0 = (X.C67754Mu9) r0
            X.05G r3 = r0.A0A
            X.Nj2 r2 = X.C69301Nj2.LocalDeviceOnly
            goto L_0x0259
        L_0x013a:
            java.lang.Object r0 = r10.A01
            X.Mu9 r0 = (X.C67754Mu9) r0
            X.05G r3 = r0.A0A
            X.Nj2 r2 = X.C69301Nj2.BackupCreated
            goto L_0x0259
        L_0x0144:
            java.lang.Object r0 = r10.A01
            X.Mu9 r0 = (X.C67754Mu9) r0
            X.05G r3 = r0.A0A
            X.Nj2 r2 = X.C69301Nj2.NoDecisionMade
            goto L_0x0259
        L_0x014e:
            java.lang.Object r0 = r10.A01
            X.Mu9 r0 = (X.C67754Mu9) r0
            X.05G r3 = r0.A0A
            X.Nj2 r2 = X.C69301Nj2.Failure
            goto L_0x0259
        L_0x0158:
            X.3xP r11 = (X.C257443xP) r11
            if (r11 == 0) goto L_0x016a
            java.lang.Object r0 = r11.A04()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x016a
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0029
        L_0x016a:
            java.lang.Object r3 = r10.A01
            X.Oy5 r3 = (X.Oy5) r3
            X.0eM r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            X.3HH r0 = (X.AnonymousClass3HH) r0
            r2 = 1
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "EB_TABLE_DROPPED"
            r1.E5T(r0, r2)
            r1.commit()
            X.0eM r0 = r3.A06
            java.lang.Object r1 = r0.getValue()
            X.1Av r1 = (X.1Av) r1
            r0 = 0
            r1.A0V(r0)
            return
        L_0x0192:
            java.lang.Object r2 = r10.A01
            X.Mtv r2 = (X.C67742Mtv) r2
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0029
            boolean r0 = r11 instanceof X.N0I
            java.lang.String r1 = "EncryptedBackupsOneTimeCodeDisplayCodeViewModel"
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = "listen for pake messages success"
            X.0KC.A0D(r1, r0)
            X.05G r1 = r2.A05
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r1.FIA(r0)
            X.NUH r2 = r2.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x01b2:
            r2.A0A(r0)
            return
        L_0x01b6:
            java.lang.String r0 = "listen for pake messages error"
            X.0KC.A0D(r1, r0)
            X.05G r1 = r2.A07
            java.lang.String r0 = ""
            r1.FIA(r0)
            X.05G r1 = r2.A05
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r1.FIA(r0)
            X.NUH r2 = r2.A03
            java.lang.String r1 = "FAILURE_REASON"
            java.lang.String r0 = "LISTEN_FOR_PAKE_MESSAGES_ERROR"
            r2.A0D(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x01b2
        L_0x01d7:
            boolean r0 = r11 instanceof X.N0I
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r10.A01
            X.OTo r0 = (X.C70967OTo) r0
            X.MoD r0 = r0.A04
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "EB_BLOCK_RELEASE_IMPRESSION"
            X.DbW.A1L(r1, r0)
            return
        L_0x01ed:
            X.Nnw r11 = (X.C69552Nnw) r11
            boolean r0 = r11 instanceof X.N0I
            if (r0 == 0) goto L_0x0200
            java.lang.Object r2 = r10.A01
            X.ObS r2 = (X.C71087ObS) r2
            X.KQb r1 = X.KQb.A00
            X.N0I r0 = new X.N0I
            r0.<init>(r1)
            goto L_0x0738
        L_0x0200:
            boolean r0 = r11 instanceof X.N0J
            if (r0 == 0) goto L_0x0029
            java.lang.Object r2 = r10.A01
            X.ObS r2 = (X.C71087ObS) r2
            X.N0J r11 = (X.N0J) r11
            java.lang.Exception r0 = r11.A00
            X.N0J r0 = X.N0J.A00(r0)
            goto L_0x0738
        L_0x0212:
            X.Nnw r11 = (X.C69552Nnw) r11
            boolean r0 = r11 instanceof X.N0J
            if (r0 == 0) goto L_0x025d
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "handleGDriveRestore addDevice error "
            r1.append(r0)
            X.N0J r11 = (X.N0J) r11
            java.lang.Exception r4 = r11.A00
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r4, r1)
            java.lang.String r0 = "EncryptedBackupsGDriveRestoreViewModel"
            X.0KC.A0D(r0, r1)
            java.lang.Object r3 = r10.A01
            X.MtU r3 = (X.C67715MtU) r3
            X.C67715MtU.A00(r3, r4)
            X.3ju r2 = r3.A07
            r1 = r4
            if (r4 != 0) goto L_0x0245
            r0 = 1049(0x419, float:1.47E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
        L_0x0245:
            r2.FIG(r1)
            X.05G r3 = r3.A0B
            if (r4 == 0) goto L_0x0252
            java.lang.String r0 = r4.getMessage()
            if (r0 != 0) goto L_0x0254
        L_0x0252:
            java.lang.String r0 = ""
        L_0x0254:
            X.NUC r2 = new X.NUC
            r2.<init>(r0)
        L_0x0259:
            r3.FIA(r2)
            return
        L_0x025d:
            boolean r0 = r11 instanceof X.N0I
            if (r0 == 0) goto L_0x0029
            java.lang.Object r4 = r10.A01
            X.MtU r4 = (X.C67715MtU) r4
            X.NUG r2 = r4.A02
            java.lang.String r1 = "3P"
            r2.A09()
            java.lang.String r0 = "RESTORE_KEY_SOLUTION"
            r2.A0D(r0, r1)
            X.OyT r3 = r4.A04
            java.lang.Integer r0 = r4.A05
            r3.A05(r0)
            com.instagram.common.session.UserSession r2 = r4.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            r0 = 0
            X.C71099OcZ.A02(r2, r1, r0)
            r1 = 13
            X.J6s r0 = new X.J6s
            r0.<init>(r4, r1)
            r3.A06(r0)
            return
        L_0x028b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0290:
            boolean r0 = r11 instanceof X.N0I
            java.lang.Object r5 = r10.A01
            X.MuD r5 = (X.C67758MuD) r5
            if (r0 == 0) goto L_0x02b3
            X.NUQ r1 = r5.A07
            java.lang.String r0 = "TURN_OFF_EB_SUCCESS"
            r1.A0B(r0)
            r1.A08()
            X.Jfc r0 = r5.A05
            r0.A0E()
            com.instagram.common.session.UserSession r2 = r5.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A02
            r0 = 0
            X.C71099OcZ.A02(r2, r1, r0)
            r0 = 2131973145(0x7f135419, float:1.9583318E38)
            goto L_0x02fc
        L_0x02b3:
            X.NUQ r2 = r5.A07
            java.lang.String r0 = "TURN_OFF_EB_FAIL"
            goto L_0x0307
        L_0x02b8:
            java.lang.Object r2 = r10.A01
            X.MuD r2 = (X.C67758MuD) r2
            X.C67758MuD.A01(r2)
            boolean r0 = r11 instanceof X.N0J
            if (r0 == 0) goto L_0x02d1
            java.lang.String r1 = "TURN_OFF_3P_REMOVE_3P_FAIL"
            X.NUQ r0 = r2.A07
            r0.A0B(r1)
            r0 = 2131973146(0x7f13541a, float:1.958332E38)
        L_0x02cd:
            X.C67758MuD.A03(r2, r0)
            return
        L_0x02d1:
            X.NUQ r0 = r2.A07
            r0.A08()
            r0 = 2131963010(0x7f132c82, float:1.9562761E38)
            goto L_0x02cd
        L_0x02da:
            boolean r0 = r11 instanceof X.N0I
            java.lang.Object r5 = r10.A01
            X.MuD r5 = (X.C67758MuD) r5
            if (r0 == 0) goto L_0x0303
            X.NUQ r1 = r5.A07
            java.lang.String r0 = "DELETE_EB_FINISHED"
            r1.A0B(r0)
            r1.A08()
            X.Jfc r0 = r5.A05
            r0.A0E()
            com.instagram.common.session.UserSession r2 = r5.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            r0 = 0
            X.C71099OcZ.A02(r2, r1, r0)
            r0 = 2131973142(0x7f135416, float:1.9583311E38)
        L_0x02fc:
            X.C67758MuD.A03(r5, r0)
        L_0x02ff:
            X.C67758MuD.A01(r5)
            return
        L_0x0303:
            X.NUQ r2 = r5.A07
            java.lang.String r0 = "DELETE_EB_FAIL"
        L_0x0307:
            r2.A0B(r0)
            java.lang.String r1 = "ERROR_CODE"
            java.lang.String r0 = "FETCH_BACKUP_STATUS_API_FAILED"
            X.C66913Mex.A04(r2, r1, r0)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 2131973143(0x7f135417, float:1.9583313E38)
            X.GKO r4 = X.DbS.A0Q(r1, r0)
            r0 = 2131238261(0x7f081d75, float:1.8092796E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 0
            r2 = 2
            X.JwM r1 = new X.JwM
            r1.<init>((X.C266444Yx) r4, (X.C266444Yx) r0, (java.lang.Integer) r3, (int) r2)
            X.6oS r0 = X.C318116oQ.A00(r5)
            X.C73568Pfp.A02(r1, r5, r0, r2)
            goto L_0x02ff
        L_0x0331:
            X.Nnw r11 = (X.C69552Nnw) r11
            boolean r0 = r11 instanceof X.N0I
            if (r0 == 0) goto L_0x0368
            X.N0I r11 = (X.N0I) r11
            java.lang.Object r0 = r11.A00
            X.O5Q r0 = (X.O5Q) r0
            java.util.List r3 = r0.A00
            r3.size()
            java.lang.Object r2 = r10.A01
            X.OyT r2 = (X.C72203OyT) r2
            X.Njv r0 = X.C69356Njv.A05
            X.Niv r1 = X.C72203OyT.A00(r0, r3)
            X.05G r0 = r2.A0K
            r0.Epw(r1)
            X.Njv r0 = X.C69356Njv.A07
            X.Niv r1 = X.C72203OyT.A00(r0, r3)
            X.05G r0 = r2.A0L
            r0.Epw(r1)
            X.Njv r0 = X.C69356Njv.A09
            X.Niv r1 = X.C72203OyT.A00(r0, r3)
        L_0x0362:
            X.05G r0 = r2.A0M
            r0.Epw(r1)
            return
        L_0x0368:
            java.lang.Object r2 = r10.A01
            X.OyT r2 = (X.C72203OyT) r2
            X.05G r0 = r2.A0K
            X.Niv r1 = X.C69295Niv.FetchError
            r0.Epw(r1)
            X.05G r0 = r2.A0L
            r0.Epw(r1)
            goto L_0x0362
        L_0x0379:
            X.Nnw r11 = (X.C69552Nnw) r11
            boolean r2 = r11 instanceof X.N0I
            java.lang.Object r0 = r10.A01
            X.OyT r0 = (X.C72203OyT) r0
            X.05G r1 = r0.A0O
            if (r2 == 0) goto L_0x038d
            X.N0I r11 = (X.N0I) r11
            java.lang.Object r0 = r11.A00
        L_0x0389:
            r1.Epw(r0)
            return
        L_0x038d:
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            goto L_0x0389
        L_0x0392:
            X.Nnw r11 = (X.C69552Nnw) r11
            java.lang.Object r2 = r10.A01
            X.OyT r2 = (X.C72203OyT) r2
            boolean r0 = r11 instanceof X.N0J
            r1 = 1
            if (r0 != 0) goto L_0x03b6
            boolean r0 = r11 instanceof X.N0I
            if (r0 == 0) goto L_0x03b6
            X.N0I r11 = (X.N0I) r11
            java.lang.Object r0 = r11.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            X.05G r1 = r2.A0N
            if (r0 == 0) goto L_0x03b3
            X.Niu r0 = X.C69294Niu.OptedOut
        L_0x03af:
            r1.Epw(r0)
            return
        L_0x03b3:
            X.Niu r0 = X.C69294Niu.NotOptedOut
            goto L_0x03af
        L_0x03b6:
            r2.A03 = r1
            X.05G r1 = r2.A0N
            X.Niu r0 = X.C69294Niu.FetchError
            goto L_0x03af
        L_0x03bd:
            X.Nnw r11 = (X.C69552Nnw) r11
            java.lang.Object r0 = r10.A01
            X.OyT r0 = (X.C72203OyT) r0
            X.C72203OyT.A02(r11, r0)
            return
        L_0x03c7:
            X.OW0 r11 = (X.OW0) r11
            if (r11 == 0) goto L_0x0440
            X.Nk3 r3 = r11.A00
            java.lang.Boolean r0 = r11.A01
            boolean r0 = X.DbX.A1a(r0)
            if (r0 == 0) goto L_0x0441
            java.lang.Object r3 = r10.A01
            X.MtT r3 = (X.C67714MtT) r3
            X.NUJ r0 = r3.A07
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r0.A0A(r7)
            X.NUa r1 = r3.A08
            java.lang.String r0 = "PIN_RESTORE_SUCCESS"
            r1.A0B(r0)
            r1.A0A(r7)
            java.lang.Integer r6 = r3.A0B
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r4 = 0
            r0 = 2131975432(0x7f135d08, float:1.9587956E38)
            if (r6 != r1) goto L_0x03f7
            r0 = 2131975433(0x7f135d09, float:1.9587958E38)
        L_0x03f7:
            X.GKO r5 = X.JTP.A0Q(r0)
            X.6oS r0 = X.C318116oQ.A00(r3)
            boolean r0 = X.19E.A07(r0)
            if (r0 == 0) goto L_0x0437
            X.6oS r2 = X.C318116oQ.A00(r3)
            r0 = 0
            X.Pfp r1 = new X.Pfp
            r1.<init>(r5, r3, r0, r4)
            X.19B r0 = X.19B.A00
            X.1Eo.A03(r7, r0, r1, r2)
        L_0x0414:
            X.NUG r2 = r3.A06
            java.lang.String r1 = "PIN"
            r2.A09()
            java.lang.String r0 = "RESTORE_KEY_SOLUTION"
            r2.A0D(r0, r1)
            X.OyT r2 = r3.A09
            r2.A05(r6)
            com.instagram.common.session.UserSession r1 = r3.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C71099OcZ.A02(r1, r0, r4)
            r1 = 18
            X.J6s r0 = new X.J6s
            r0.<init>(r3, r1)
            r2.A06(r0)
            return
        L_0x0437:
            X.PYQ r0 = new X.PYQ
            r0.<init>(r5, r3)
            X.11Z.A02(r0)
            goto L_0x0414
        L_0x0440:
            r3 = 0
        L_0x0441:
            java.lang.Object r2 = r10.A01
            X.MtT r2 = (X.C67714MtT) r2
            if (r11 != 0) goto L_0x0485
            java.lang.String r0 = "NULL_RESULT"
        L_0x0449:
            X.NUJ r3 = r2.A07
            java.lang.String r1 = "FAILURE_REASON"
            X.C66913Mex.A04(r3, r1, r0)
            X.C67714MtT.A00(r2, r0)
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x049b
            X.6ap r3 = X.DbS.A0a()
            android.content.Context r1 = X.C60960kU.A00
            r0 = 2131969462(0x7f1345b6, float:1.9575848E38)
            X.DbS.A19(r1, r3, r0)
            android.content.Context r1 = X.C60960kU.A00
            r0 = 2131969461(0x7f1345b5, float:1.9575845E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A0I = r0
            r0 = 1
            r3.A0L = r0
            android.content.Context r1 = X.C60960kU.A00
            r0 = 2131969460(0x7f1345b4, float:1.9575843E38)
            X.DbW.A0q(r1, r3, r0)
            X.MVB r0 = r2.A0A
            r3.A0A(r0)
            r3.A06()
            X.DbY.A1N(r3)
            return
        L_0x0485:
            if (r3 == 0) goto L_0x0498
            int r1 = r3.ordinal()
            r0 = 5
            if (r1 == r0) goto L_0x04a2
            r0 = 3
            if (r1 == r0) goto L_0x0502
            r0 = 6
            if (r1 == r0) goto L_0x0594
            java.lang.String r0 = r3.A01
            if (r0 != 0) goto L_0x0449
        L_0x0498:
            java.lang.String r0 = "NULL_ERROR_CODE"
            goto L_0x0449
        L_0x049b:
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131969474(0x7f1345c2, float:1.9575872E38)
            goto L_0x04e5
        L_0x04a2:
            X.NUJ r1 = r2.A07
            X.Nk3 r0 = X.C69363Nk3.A06
            java.lang.String r7 = r0.A01
            java.lang.String r0 = "FAILURE_REASON"
            r1.A0D(r0, r7)
            r1.A08()
            java.lang.Number r0 = r11.A03
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x05e6
            int r1 = r0.intValue()
            java.lang.Number r0 = r11.A02
            if (r0 == 0) goto L_0x05e1
            long r5 = r0.longValue()
            if (r1 <= 0) goto L_0x0594
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0502
            java.util.List r0 = r2.A0D
            r0.add(r7)
            X.NUa r3 = r2.A08
            r4 = 0
            java.lang.String[] r1 = X.DbU.A1b(r0, r4)
            java.lang.String r0 = "PIN_FAILURE_REASON"
            r3.A0F(r0, r1)
            java.lang.String r0 = "PIN_RESTORE_WRONG_PIN"
            r3.A0B(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131969476(0x7f1345c4, float:1.9575876E38)
        L_0x04e5:
            X.GKO r3 = X.DbS.A0Q(r1, r0)
            X.05G r0 = r2.A0Q
            X.AnonymousClass7TF.A1O(r0, r4)
            X.05G r1 = r2.A0N
            X.Nik r0 = X.C69284Nik.Error
            r1.Epw(r0)
            X.05G r0 = r2.A0O
        L_0x04f7:
            r0.Epw(r3)
        L_0x04fa:
            X.05G r1 = r2.A0P
            java.lang.String r0 = r2.A0C
            r1.Epw(r0)
            return
        L_0x0502:
            X.NUJ r3 = r2.A07
            X.Nk3 r0 = X.C69363Nk3.A09
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "FAILURE_REASON"
            r3.A0D(r0, r1)
            r3.A08()
            X.C67714MtT.A00(r2, r1)
            X.NUa r1 = r2.A08
            java.lang.String r0 = "PIN_RESTORE_LOCKOUT"
            r1.A0B(r0)
            java.lang.Number r0 = r11.A03
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x05dc
            int r7 = r0.intValue()
            if (r7 <= 0) goto L_0x0594
            java.lang.Number r0 = r11.A02
            if (r0 == 0) goto L_0x05d7
            int r5 = r0.intValue()
            if (r5 <= 0) goto L_0x0592
            long r3 = (long) r5
            r8 = 60
            r1 = 1
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0578
            r3 = 2131820750(0x7f1100ce, float:1.9274224E38)
        L_0x053b:
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r5)
            X.H6w r1 = new X.H6w
            r1.<init>(r0, r3, r5)
            android.content.Context r0 = X.C60960kU.A00
            X.0qQ.A07(r0)
            java.lang.CharSequence r0 = X.C66909Mes.A00(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            r0 = 2131963508(0x7f132e74, float:1.9563771E38)
            X.GKO r4 = X.DbS.A0Q(r1, r0)
        L_0x0558:
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r7)
            r0 = 2131820747(0x7f1100cb, float:1.9274218E38)
            X.H6w r3 = new X.H6w
            r3.<init>(r1, r0, r7)
            X.Nik r1 = X.C69284Nik.ErrorPinBackoff
            X.05G r0 = r2.A0Q
            X.JTR.A1V(r0)
            X.05G r0 = r2.A0N
            r0.Epw(r1)
            X.05G r0 = r2.A0O
            r0.Epw(r4)
            X.05G r0 = r2.A0L
            goto L_0x04f7
        L_0x0578:
            r5 = 3600(0xe10, double:1.7786E-320)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0588
            long r3 = r3 / r8
            int r0 = (int) r3
            int r5 = java.lang.Math.max(r0, r1)
            r3 = 2131820749(0x7f1100cd, float:1.9274222E38)
            goto L_0x053b
        L_0x0588:
            long r3 = r3 / r5
            int r0 = (int) r3
            int r5 = java.lang.Math.max(r0, r1)
            r3 = 2131820748(0x7f1100cc, float:1.927422E38)
            goto L_0x053b
        L_0x0592:
            r4 = 0
            goto L_0x0558
        L_0x0594:
            X.NUJ r3 = r2.A07
            X.Nk3 r0 = X.C69363Nk3.A05
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "FAILURE_REASON"
            r3.A0D(r0, r1)
            r3.A08()
            X.C67714MtT.A00(r2, r1)
            X.NUa r1 = r2.A08
            java.lang.String r0 = "PIN_RESTORE_LOCKOUT_PERMANENT"
            r1.A0B(r0)
            X.Nik r5 = X.C69284Nik.ErrorPinExpired
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131963507(0x7f132e73, float:1.956377E38)
            X.GKO r3 = X.DbS.A0Q(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131963505(0x7f132e71, float:1.9563765E38)
            X.GKO r1 = X.DbS.A0Q(r1, r0)
            X.05G r0 = r2.A0Q
            X.JTR.A1V(r0)
            X.05G r0 = r2.A0N
            r0.Epw(r5)
            X.05G r0 = r2.A0O
            r0.Epw(r3)
            X.05G r0 = r2.A0L
            r0.Epw(r1)
            goto L_0x04fa
        L_0x05d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x05dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x05e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x05e6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x05eb:
            X.Nnw r11 = (X.C69552Nnw) r11
            java.lang.Object r4 = r10.A01
            X.Mu7 r4 = (X.C67753Mu7) r4
            X.05G r1 = r4.A03
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r1.FIA(r0)
            boolean r0 = r11 instanceof X.N0I
            if (r0 == 0) goto L_0x0617
            X.N0I r11 = (X.N0I) r11
            java.lang.Object r3 = r11.A00
            int r0 = X.DbS.A05(r3)
            X.NUa r2 = r4.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "NUM_TRUSTED_DEVICE"
            r2.A0D(r0, r1)
            X.05G r0 = r4.A02
            r0.FIA(r3)
            return
        L_0x0617:
            boolean r0 = r11 instanceof X.N0J
            java.lang.String r2 = "EncryptedBackupsOneTimeCodeDevicesViewModel"
            if (r0 == 0) goto L_0x0632
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to fetch OTC devices, error: "
            r1.append(r0)
            X.N0J r11 = (X.N0J) r11
            java.lang.Exception r0 = r11.A00
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
        L_0x062e:
            X.0KC.A0C(r2, r0)
            return
        L_0x0632:
            if (r11 != 0) goto L_0x0637
            java.lang.String r0 = "Failed to fetch OTC devices, unknown error"
            goto L_0x062e
        L_0x0637:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x063c:
            boolean r0 = r11 instanceof X.N0I
            java.lang.Object r1 = r10.A01
            X.Mu9 r1 = (X.C67754Mu9) r1
            if (r0 == 0) goto L_0x064a
            java.lang.String r0 = "OTC notifications sent"
        L_0x0646:
            X.C67754Mu9.A01(r1, r0)
            return
        L_0x064a:
            java.lang.String r0 = "Failed to send OTC notifications, error"
            goto L_0x0646
        L_0x064d:
            boolean r0 = r11 instanceof X.N0I
            java.lang.Object r3 = r10.A01
            X.Mu9 r3 = (X.C67754Mu9) r3
            if (r0 == 0) goto L_0x0670
            java.lang.String r0 = "Onboarding decision reset"
            X.C67754Mu9.A01(r3, r0)
            X.1aU r1 = r3.A02
            r0 = 5
            X.1aU r2 = X.C72120Owf.A00(r1, r3, r0)
            X.1a8 r1 = r3.A04
            X.PSp r0 = X.C73006PSp.A00
            r1.A02(r2, r0)
            X.OyT r1 = r3.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r1.A05(r0)
            return
        L_0x0670:
            java.lang.String r0 = "Reset Onboarding decision failed"
            X.C67754Mu9.A01(r3, r0)
            return
        L_0x0676:
            boolean r0 = r11 instanceof X.N0I
            java.lang.Object r5 = r10.A01
            X.Mu9 r5 = (X.C67754Mu9) r5
            r1 = 2131962509(0x7f132a8d, float:1.9561745E38)
            if (r0 == 0) goto L_0x0693
            r1 = 2131962510(0x7f132a8e, float:1.9561747E38)
            goto L_0x0693
        L_0x0685:
            boolean r0 = r11 instanceof X.N0I
            java.lang.Object r5 = r10.A01
            X.Mu9 r5 = (X.C67754Mu9) r5
            r1 = 2131962507(0x7f132a8b, float:1.9561741E38)
            if (r0 == 0) goto L_0x0693
            r1 = 2131962508(0x7f132a8c, float:1.9561743E38)
        L_0x0693:
            X.GKO r4 = X.JTP.A0Q(r1)
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 46
            X.ImQ r0 = new X.ImQ
            r0.<init>(r4, r5, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            X.05G r0 = r5.A0B
            r0.Epw(r2)
            X.OyT r1 = r5.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r1.A05(r0)
            return
        L_0x06b3:
            java.lang.Object r0 = r10.A01
            X.OO6 r0 = (X.OO6) r0
            X.NUV r2 = r0.A06
            boolean r0 = X.DbX.A1a(r11)
            java.lang.String r1 = "IS_BLOCKSTORE_E2EE_ENABLED"
            if (r0 == 0) goto L_0x06ca
            java.lang.String r0 = "YES"
        L_0x06c3:
            r2.A0D(r1, r0)
            r2.A08()
            return
        L_0x06ca:
            java.lang.String r0 = "NO"
            goto L_0x06c3
        L_0x06cd:
            java.lang.Object r1 = r10.A01
            X.ObS r1 = (X.C71087ObS) r1
            if (r11 != 0) goto L_0x06f0
            java.lang.String r0 = "can't backup data as no result return from SDK"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            X.NEG r11 = new X.NEG
            r11.<init>(r0)
            goto L_0x06f0
        L_0x06df:
            java.lang.Object r1 = r10.A01
            X.ObS r1 = (X.C71087ObS) r1
            if (r11 != 0) goto L_0x06f0
            java.lang.String r0 = "can't backup data as no result return from SDK"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            X.NEG r11 = new X.NEG
            r11.<init>(r0)
        L_0x06f0:
            r1.A05(r11)
            return
        L_0x06f4:
            com.facebook.messaging.lockbox.LockBoxStorageManager r1 = com.facebook.messaging.lockbox.LockBoxStorageManager.INSTANCE
            java.lang.Object r0 = r10.A01
            X.ObS r0 = (X.C71087ObS) r0
            r1.nullableComplete(r0, r11)
            return
        L_0x06fe:
            X.No8 r11 = (X.C69564No8) r11
            java.lang.Object r2 = r10.A01
            X.ObS r2 = (X.C71087ObS) r2
            com.facebook.messaging.lockbox.LockBoxStorageManager r0 = com.facebook.messaging.lockbox.LockBoxStorageManager.INSTANCE
            int r0 = r0.parseBackupManagerResultToLockboxResult(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0738
        L_0x070f:
            java.lang.Object r2 = r10.A01
            X.ObS r2 = (X.C71087ObS) r2
            boolean r0 = r11 instanceof X.NEF
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0738
        L_0x071a:
            X.Nnz r11 = (X.C69555Nnz) r11
            boolean r0 = r11 instanceof X.N0P
            if (r0 == 0) goto L_0x073c
            java.lang.Object r2 = r10.A01
            X.ObS r2 = (X.C71087ObS) r2
            X.OAb r1 = new X.OAb
            r1.<init>()
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r1.A01 = r0
            X.Nk3 r0 = X.C69363Nk3.A0A
        L_0x0731:
            r1.A00 = r0
            X.OVu r0 = new X.OVu
            r0.<init>(r1)
        L_0x0738:
            r2.A05(r0)
            return
        L_0x073c:
            boolean r1 = r11 instanceof X.N0O
            r0 = 0
            if (r1 == 0) goto L_0x0755
            java.lang.Object r2 = r10.A01
            X.ObS r2 = (X.C71087ObS) r2
            X.OAb r1 = new X.OAb
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            X.N0O r11 = (X.N0O) r11
            X.Nk3 r0 = r11.A00
            goto L_0x0731
        L_0x0755:
            if (r11 != 0) goto L_0x0769
            java.lang.Object r2 = r10.A01
            X.ObS r2 = (X.C71087ObS) r2
            X.OAb r1 = new X.OAb
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            X.Nk3 r0 = X.C69363Nk3.A07
            goto L_0x0731
        L_0x0769:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71515OmC.run(java.lang.Object):void");
    }
}
