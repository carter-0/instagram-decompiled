package X;

/* renamed from: X.4ts  reason: invalid class name and case insensitive filesystem */
public final class C276774ts {
    public final int A00(C276544tV r3) {
        int i = r3.A04;
        if (i == 13327) {
            return 35;
        }
        if (i == 13387) {
            return 36;
        }
        if (i == 13708) {
            return 41;
        }
        if (i == 13982) {
            return 35;
        }
        if (i == 14093) {
            return 36;
        }
        if (i == 16278) {
            return 35;
        }
        if (i == 16444) {
            return 42;
        }
        if (i != 16675) {
            return 32;
        }
        return 36;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.IKM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: X.IKM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: X.IKM} */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0370, code lost:
        throw new java.io.IOException(X.002.A0R("can't parse unknown inputType: ", r4));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04a6 A[SYNTHETIC, Splitter:B:242:0x04a6] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A01(X.AnonymousClass6S4 r53, X.C276544tV r54, java.lang.Object r55) {
        /*
            r52 = this;
            r1 = r54
            r14 = r55
            int r2 = r1.A04
            boolean r0 = X.C250563lf.A0m(r2)
            if (r0 == 0) goto L_0x054f
            r0 = 13326(0x340e, float:1.8674E-41)
            if (r2 == r0) goto L_0x04db
            r0 = 13336(0x3418, float:1.8688E-41)
            r12 = r53
            if (r2 == r0) goto L_0x01d8
            r0 = 16927(0x421f, float:2.372E-41)
            if (r2 != r0) goto L_0x01c4
            r3 = 0
            java.lang.Object r4 = r12.A01
            if (r4 == 0) goto L_0x01bc
            X.6Rm r4 = (X.C307786Rm) r4
            java.lang.Object r2 = X.C307476Qg.A06(r4, r1)
            r2.getClass()
            r0 = 1
            X.0qQ.A0B(r4, r0)
            r7 = 38
            X.4tV r0 = r1.A07(r7)
            r8 = 35
            r16 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.String r20 = r0.A0K(r8)
            if (r20 != 0) goto L_0x0047
        L_0x003e:
            java.lang.String r5 = "bk.components.VideoV2"
            java.lang.String r0 = "playerIdentifier.mediaId is null"
            X.1Kn.A02(r5, r0)
            java.lang.String r20 = "-1"
        L_0x0047:
            java.util.List r0 = r1.A0M(r8)
            X.0qQ.A07(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r12 = r0.iterator()
        L_0x0057:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r11 = r12.next()
            X.4tV r11 = (X.C276544tV) r11
            X.0qQ.A0A(r11)
            X.0qQ.A0B(r11, r3)
            int r5 = r11.A04
            r10 = 0
            r0 = 15820(0x3dcc, float:2.2169E-41)
            if (r5 != r0) goto L_0x0057
            java.lang.String r5 = r11.A0K(r7)
            if (r5 == 0) goto L_0x0057
            X.6QE r0 = X.AnonymousClass6QE.A02
            android.net.Uri r0 = X.0cp.A03(r5)
            X.0qQ.A07(r0)
            android.net.Uri r6 = X.AnonymousClass6QJ.A01(r0, r3)
            if (r6 == 0) goto L_0x0057
            r0 = 41
            int r5 = r11.A03(r0, r3)
            int r0 = r11.A03(r8, r3)
            if (r5 == 0) goto L_0x009a
            if (r0 == 0) goto L_0x009a
            float r5 = (float) r5
            float r0 = (float) r0
            float r5 = r5 / r0
            java.lang.Float r10 = java.lang.Float.valueOf(r5)
        L_0x009a:
            r0 = 36
            java.lang.String r5 = r11.A0K(r0)
            if (r5 != 0) goto L_0x00a4
            java.lang.String r5 = "regular"
        L_0x00a4:
            X.UKJ r0 = new X.UKJ
            r0.<init>(r6, r10, r5)
            r9.add(r0)
            goto L_0x0057
        L_0x00ad:
            java.util.Iterator r8 = r9.iterator()
        L_0x00b1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r6 = r8.next()
            r0 = r6
            X.UKJ r0 = (X.UKJ) r0
            java.lang.String r5 = r0.A02
            java.lang.String r0 = "hd"
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x00b1
        L_0x00c8:
            X.UKJ r6 = (X.UKJ) r6
            if (r6 != 0) goto L_0x00d2
            java.lang.Object r6 = X.00k.A0J(r9)
            X.UKJ r6 = (X.UKJ) r6
        L_0x00d2:
            r0 = 43
            X.4uI r0 = r1.A0A(r0)
            if (r0 != 0) goto L_0x01b1
            r10 = r16
        L_0x00dc:
            r0 = 44
            X.4uI r8 = r1.A0A(r0)
            if (r8 != 0) goto L_0x01a8
            r0 = r16
        L_0x00e6:
            r5 = 45
            X.4uI r8 = r1.A0A(r5)
            if (r8 != 0) goto L_0x019f
            r9 = r16
        L_0x00f0:
            X.4tV r5 = r1.A07(r7)
            r8 = 36
            if (r5 == 0) goto L_0x019b
            java.lang.String r21 = r5.A0K(r8)
        L_0x00fc:
            X.4tV r5 = r1.A07(r7)
            if (r5 == 0) goto L_0x0197
            java.lang.String r22 = r5.A0K(r7)
        L_0x0106:
            java.lang.String r23 = r1.A0K(r8)
            r5 = 41
            boolean r26 = r1.A0R(r5, r3)
            r5 = 40
            boolean r27 = r1.A0R(r5, r3)
            r5 = 42
            java.lang.String r8 = r1.A0K(r5)
            if (r8 == 0) goto L_0x0194
            int r7 = r8.hashCode()
            r5 = -1881872635(0xffffffff8fd4e705, float:-2.09938E-29)
            if (r7 == r5) goto L_0x0189
            r5 = 94852023(0x5a753b7, float:1.5735357E-35)
            if (r7 == r5) goto L_0x017e
            r5 = 951526612(0x38b724d4, float:8.73298E-5)
            if (r7 != r5) goto L_0x0194
            java.lang.String r5 = "contain"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0194
            X.KgN r18 = X.C62472KgN.CONTAIN
        L_0x013b:
            r5 = 46
            java.lang.String r5 = r1.A0K(r5)
            if (r5 == 0) goto L_0x0147
            android.net.Uri r16 = X.0cp.A03(r5)
        L_0x0147:
            X.Hp5 r15 = new X.Hp5
            r24 = r0
            r25 = r9
            r19 = r6
            r17 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r0 = r1.A03
            long r0 = (long) r0
            r5 = 14
            X.JGF r8 = new X.JGF
            r8.<init>(r5, r4, r2)
            X.IK1 r4 = new X.IK1
            r4.<init>()
            X.IJB r7 = X.IJB.A00
            r6 = 3
            X.3aS r5 = X.C243983aS.A00
            X.2WU r9 = new X.2WU
            r9.<init>(r5, r7, r6, r3)
            r5 = 30
            X.Iwy r3 = new X.Iwy
            r3.<init>(r5, r2, r8, r15)
            r10 = 0
            X.2WG r8 = new X.2WG
            r11 = r3
            r12 = r0
            r8.<init>(r9, r10, r11, r12)
            goto L_0x04ec
        L_0x017e:
            java.lang.String r5 = "cover"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0194
            X.KgN r18 = X.C62472KgN.COVER
            goto L_0x013b
        L_0x0189:
            java.lang.String r5 = "stretch"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0194
            X.KgN r18 = X.C62472KgN.STRETCH
            goto L_0x013b
        L_0x0194:
            X.KgN r18 = X.C62472KgN.COVER
            goto L_0x013b
        L_0x0197:
            r22 = r16
            goto L_0x0106
        L_0x019b:
            r21 = r16
            goto L_0x00fc
        L_0x019f:
            r5 = 18
            X.Iwy r9 = new X.Iwy
            r9.<init>(r5, r4, r1, r8)
            goto L_0x00f0
        L_0x01a8:
            r5 = 19
            X.Iwy r0 = new X.Iwy
            r0.<init>(r5, r4, r1, r8)
            goto L_0x00e6
        L_0x01b1:
            X.VUQ r10 = new X.VUQ
            r10.<init>(r4, r1, r0)
            goto L_0x00dc
        L_0x01b8:
            r6 = r16
            goto L_0x00c8
        L_0x01bc:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x01c4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x01d8:
            r3 = 0
            java.lang.Object r2 = r12.A01
            if (r2 == 0) goto L_0x04d3
            X.6Rm r2 = (X.C307786Rm) r2
            java.lang.Object r11 = X.C307476Qg.A06(r2, r1)
            r11.getClass()
            X.GbJ r11 = (X.C52706GbJ) r11
            android.content.Context r0 = r2.A00
            r51 = r0
            int r0 = r1.A03
            long r4 = (long) r0
            r49 = r4
            r0 = 90
            X.4tV r8 = r1.A07(r0)
            r7 = 40
            r4 = 38
            r0 = 36
            r6 = 35
            r10 = 0
            if (r8 == 0) goto L_0x023b
            X.4tV r5 = r8.A07(r6)
            if (r5 == 0) goto L_0x0238
            int r26 = X.AnonymousClass6TP.A00(r2, r5, r3)
        L_0x020c:
            java.lang.String r5 = r8.A0F()
            r23 = 0
            if (r5 == 0) goto L_0x0218
            float r23 = X.AnonymousClass6Su.A01(r5)
        L_0x0218:
            java.lang.String r5 = r8.A0K(r4)
            r24 = 0
            if (r5 == 0) goto L_0x0224
            float r24 = X.AnonymousClass6Su.A01(r5)
        L_0x0224:
            java.lang.String r5 = r8.A0K(r7)
            r25 = 0
            if (r5 == 0) goto L_0x0230
            float r25 = X.AnonymousClass6Su.A01(r5)
        L_0x0230:
            r27 = 1
            X.GbN r22 = new X.GbN
            r22.<init>(r23, r24, r25, r26, r27)
            goto L_0x023d
        L_0x0238:
            r26 = 0
            goto L_0x020c
        L_0x023b:
            r22 = r10
        L_0x023d:
            r5 = 55
            X.4tV r5 = r1.A07(r5)     // Catch:{ 3yO -> 0x025f }
            if (r5 == 0) goto L_0x024e
            int r5 = X.AnonymousClass6TP.A00(r2, r5, r3)     // Catch:{ 3yO -> 0x025f }
            java.lang.Integer r32 = java.lang.Integer.valueOf(r5)     // Catch:{ 3yO -> 0x025f }
            goto L_0x026c
        L_0x024e:
            r5 = 52
            java.lang.String r5 = r1.A0K(r5)     // Catch:{ 3yO -> 0x025f }
            if (r5 == 0) goto L_0x026a
            int r5 = X.AnonymousClass6Su.A03(r5)     // Catch:{ 3yO -> 0x025f }
            java.lang.Integer r32 = java.lang.Integer.valueOf(r5)     // Catch:{ 3yO -> 0x025f }
            goto L_0x026c
        L_0x025f:
            r9 = move-exception
            java.lang.String r8 = "TextInputResolverUtils"
            java.lang.String r5 = "Error parsing text color for Text input"
            X.1Kn.A00(r2, r8, r5, r9)
            r32 = r10
            goto L_0x026c
        L_0x026a:
            r32 = r10
        L_0x026c:
            r5 = 42
            X.4uI r5 = r1.A0A(r5)
            if (r5 == 0) goto L_0x04a2
            r8 = 30
            X.IwR r21 = new X.IwR
            r5 = r21
            r5.<init>((int) r8, (java.lang.Object) r2, (java.lang.Object) r1)
        L_0x027d:
            r5 = 45
            X.4uI r5 = r1.A0A(r5)
            if (r5 == 0) goto L_0x049e
            r8 = 31
            X.IwR r20 = new X.IwR
            r5 = r20
            r5.<init>((int) r8, (java.lang.Object) r2, (java.lang.Object) r1)
        L_0x028e:
            r5 = 46
            X.4uI r5 = r1.A0A(r5)
            if (r5 == 0) goto L_0x049b
            r8 = 7
            X.JJU r5 = new X.JJU
            r5.<init>(r8, r2, r1)
        L_0x029c:
            r8 = 99
            boolean r8 = r1.A0R(r8, r3)
            if (r8 != 0) goto L_0x0497
            r8 = 62
            X.4uI r8 = r1.A0A(r8)
            if (r8 == 0) goto L_0x0497
            r9 = 13
            X.JGF r17 = new X.JGF
            r8 = r17
            r8.<init>(r9, r2, r1)
        L_0x02b5:
            r8 = 48
            X.4uI r8 = r1.A0A(r8)
            if (r8 == 0) goto L_0x0493
            r9 = 32
            X.IwR r19 = new X.IwR
            r8 = r19
            r8.<init>((int) r9, (java.lang.Object) r2, (java.lang.Object) r1)
        L_0x02c6:
            r8 = 50
            java.lang.String r27 = r1.A0K(r8)
            if (r27 != 0) goto L_0x02d0
            java.lang.String r27 = ""
        L_0x02d0:
            r8 = 53
            java.lang.String r8 = r1.A0K(r8)
            if (r8 == 0) goto L_0x0490
            float r8 = X.AnonymousClass6Su.A02(r8)
            X.GbH r15 = new X.GbH
            r15.<init>(r8)
        L_0x02e1:
            r8 = -1
            int r18 = r1.A03(r7, r8)
            java.lang.String r28 = r1.A0K(r0)
            X.4tV r0 = r1.A07(r4)
            if (r0 == 0) goto L_0x048c
            int r0 = X.AnonymousClass6TP.A00(r2, r0, r3)
            java.lang.Integer r34 = java.lang.Integer.valueOf(r0)
        L_0x02f8:
            r0 = 51
            java.lang.String r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x0488
            int r0 = X.AnonymousClass6Su.A06(r0)
            java.lang.Integer r35 = java.lang.Integer.valueOf(r0)
        L_0x0308:
            r0 = 59
            boolean r0 = r1.A0R(r0, r3)
            if (r0 == 0) goto L_0x0485
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>(r3, r3, r3, r3)
        L_0x0315:
            r0 = 91
            java.lang.String r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x0481
            float r0 = X.AnonymousClass6Su.A01(r0)
            java.lang.Float r30 = java.lang.Float.valueOf(r0)
        L_0x0325:
            r0 = 65
            X.4tV r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x047d
            int r0 = X.AnonymousClass6TP.A00(r2, r0, r3)
            java.lang.Integer r37 = java.lang.Integer.valueOf(r0)
        L_0x0335:
            r0 = 140(0x8c, float:1.96E-43)
            X.4tV r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0479
            int r0 = X.AnonymousClass6TP.A00(r2, r0, r3)
            java.lang.Integer r36 = java.lang.Integer.valueOf(r0)
        L_0x0345:
            r0 = 70
            java.lang.String r4 = r1.A0K(r0)
            r24 = 0
            if (r4 == 0) goto L_0x0356
            int r0 = r4.hashCode()
            switch(r0) {
                case -906336856: goto L_0x046d;
                case 3304: goto L_0x0461;
                case 3089282: goto L_0x0455;
                case 3377907: goto L_0x0449;
                case 3526536: goto L_0x043d;
                default: goto L_0x0356;
            }
        L_0x0356:
            r0 = 56
            java.lang.String r4 = r1.A0K(r0)
            if (r4 == 0) goto L_0x03ef
            int r0 = r4.hashCode()
            switch(r0) {
                case -2141169668: goto L_0x03f2;
                case -2066832464: goto L_0x03e4;
                case -1831299680: goto L_0x03d9;
                case -1413853096: goto L_0x03ca;
                case -1034364087: goto L_0x03bf;
                case 3076014: goto L_0x03b4;
                case 3556653: goto L_0x03a9;
                case 96619420: goto L_0x039e;
                case 106642798: goto L_0x0393;
                case 260133443: goto L_0x0388;
                case 1216389502: goto L_0x037d;
                case 1216985755: goto L_0x0371;
                default: goto L_0x0365;
            }
        L_0x0365:
            java.lang.String r0 = "can't parse unknown inputType: "
            java.lang.String r0 = X.002.A0R(r0, r4)
            X.3yO r1 = new X.3yO
            r1.<init>(r0)
            throw r1
        L_0x0371:
            java.lang.String r0 = "password"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0365
            X.GbD r25 = X.C52701GbD.PASSWORD
            goto L_0x03fc
        L_0x037d:
            java.lang.String r0 = "passcode"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0365
            X.GbD r25 = X.C52701GbD.PASSCODE
            goto L_0x03fc
        L_0x0388:
            java.lang.String r0 = "cap_sentences"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0365
            X.GbD r25 = X.C52701GbD.CAP_SENTENCES
            goto L_0x03fc
        L_0x0393:
            java.lang.String r0 = "phone"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0365
            X.GbD r25 = X.C52701GbD.PHONE
            goto L_0x03fc
        L_0x039e:
            java.lang.String r0 = "email"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0365
            X.GbD r25 = X.C52701GbD.A07
            goto L_0x03fc
        L_0x03a9:
            java.lang.String r0 = "text"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0365
            X.GbD r25 = X.C52701GbD.TEXT
            goto L_0x03fc
        L_0x03b4:
            java.lang.String r0 = "date"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0365
            X.GbD r25 = X.C52701GbD.DATE
            goto L_0x03fc
        L_0x03bf:
            java.lang.String r0 = "number"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0365
            X.GbD r25 = X.C52701GbD.NUMBER
            goto L_0x03fc
        L_0x03ca:
            r0 = 1084(0x43c, float:1.519E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0365
            X.GbD r25 = X.C52701GbD.AMOUNT
            goto L_0x03fc
        L_0x03d9:
            java.lang.String r0 = "cap_letters"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0365
            X.GbD r25 = X.C52701GbD.CAP_LETTERS
            goto L_0x03fc
        L_0x03e4:
            java.lang.String r0 = "text_no_suggestion"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0365
            X.GbD r25 = X.C52701GbD.TEXT_NO_SUGGESTIONS
            goto L_0x03fc
        L_0x03ef:
            r25 = r10
            goto L_0x03fc
        L_0x03f2:
            java.lang.String r0 = "cap_words"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0365
            X.GbD r25 = X.C52701GbD.CAP_WORDS
        L_0x03fc:
            r0 = 49
            boolean r45 = r1.A0R(r0, r3)
            r4 = 1
            r0 = 74
            boolean r46 = r1.A0R(r0, r4)
            r0 = 83
            java.lang.String r39 = r1.A0K(r0)
            r0 = 73
            int r0 = r1.A03(r0, r3)
            if (r0 == 0) goto L_0x043a
            if (r0 == r4) goto L_0x0437
            r4 = 2
            if (r0 != r4) goto L_0x043a
            X.GbS r23 = X.C52715GbS.ENABLED
        L_0x041e:
            r0 = 84
            boolean r47 = r1.A0R(r0, r3)
            r0 = 54
            java.lang.String r4 = r1.A0K(r0)
            java.lang.String r6 = r1.A0K(r6)
            r29 = 0
            java.lang.String r8 = "Error parsing text style for text input"
            java.lang.String r7 = "TextInputParseUtils"
            if (r4 == 0) goto L_0x04b3
            goto L_0x04a6
        L_0x0437:
            X.GbS r23 = X.C52715GbS.DISABLED
            goto L_0x041e
        L_0x043a:
            X.GbS r23 = X.C52715GbS.DEFAULT
            goto L_0x041e
        L_0x043d:
            java.lang.String r0 = "send"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0356
            X.Gbl r24 = X.C52734Gbl.SEND
            goto L_0x0356
        L_0x0449:
            java.lang.String r0 = "next"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0356
            X.Gbl r24 = X.C52734Gbl.NEXT
            goto L_0x0356
        L_0x0455:
            java.lang.String r0 = "done"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0356
            X.Gbl r24 = X.C52734Gbl.DONE
            goto L_0x0356
        L_0x0461:
            java.lang.String r0 = "go"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0356
            X.Gbl r24 = X.C52734Gbl.GO
            goto L_0x0356
        L_0x046d:
            java.lang.String r0 = "search"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0356
            X.Gbl r24 = X.C52734Gbl.SEARCH
            goto L_0x0356
        L_0x0479:
            r36 = r10
            goto L_0x0345
        L_0x047d:
            r37 = r10
            goto L_0x0335
        L_0x0481:
            r30 = r10
            goto L_0x0325
        L_0x0485:
            r13 = r10
            goto L_0x0315
        L_0x0488:
            r35 = r10
            goto L_0x0308
        L_0x048c:
            r34 = r10
            goto L_0x02f8
        L_0x0490:
            r15 = r10
            goto L_0x02e1
        L_0x0493:
            r19 = r10
            goto L_0x02c6
        L_0x0497:
            r17 = r10
            goto L_0x02b5
        L_0x049b:
            r5 = r10
            goto L_0x029c
        L_0x049e:
            r20 = r10
            goto L_0x028e
        L_0x04a2:
            r21 = r10
            goto L_0x027d
        L_0x04a6:
            int r0 = X.AnonymousClass6Su.A08(r4)     // Catch:{ 3yO -> 0x04af }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)     // Catch:{ 3yO -> 0x04af }
            goto L_0x04b5
        L_0x04af:
            r0 = move-exception
            X.1Kn.A00(r2, r7, r8, r0)
        L_0x04b3:
            r16 = r10
        L_0x04b5:
            if (r6 == 0) goto L_0x04cc
            X.1Kj r0 = X.C64361Kj.A00()
            X.4dY r9 = r0.A05
            r0 = r51
            android.graphics.Typeface r0 = r9.A00(r0, r6)
        L_0x04c3:
            if (r4 == 0) goto L_0x04f6
            int r6 = r4.length()
            if (r6 == 0) goto L_0x04f6
            goto L_0x04ce
        L_0x04cc:
            r0 = r10
            goto L_0x04c3
        L_0x04ce:
            android.graphics.Typeface r0 = X.AnonymousClass6TW.A00(r0, r4)     // Catch:{ 3yO -> 0x04f2 }
            goto L_0x04f6
        L_0x04d3:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x04db:
            int r0 = r1.A03
            long r0 = (long) r0
            X.IKM r4 = X.IKM.A00
            X.2WU r9 = X.C55300HfT.A00
            X.Ayc r11 = X.C41685Ayc.A00
            r14 = 0
            X.2WG r8 = new X.2WG
            r10 = r14
            r12 = r0
            r8.<init>(r9, r10, r11, r12)
        L_0x04ec:
            X.2WD r1 = new X.2WD
            r1.<init>(r4, r8)
            goto L_0x0549
        L_0x04f2:
            r4 = move-exception
            X.1Kn.A00(r2, r7, r8, r4)
        L_0x04f6:
            if (r0 != 0) goto L_0x0502
            if (r16 == 0) goto L_0x0502
            int r0 = r16.intValue()
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r0)
        L_0x0502:
            if (r5 == 0) goto L_0x0509
            X.GbL r10 = new X.GbL
            r10.<init>(r5)
        L_0x0509:
            r2 = 63
            boolean r48 = r1.A0R(r2, r3)
            r2 = 41
            java.lang.String r40 = r1.A0K(r2)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r18)
            X.GbF r18 = new X.GbF
            r26 = r15
            r31 = r29
            r38 = r29
            r41 = r21
            r42 = r20
            r43 = r19
            r44 = r17
            r19 = r13
            r20 = r0
            r21 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r3 = r14
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2 = 14
            X.TYA r0 = new X.TYA
            r0.<init>((int) r2, (java.lang.Object) r12, (java.lang.Object) r1)
            r4 = r51
            r5 = r11
            r6 = r18
            r7 = r3
            r8 = r0
            r9 = r49
            X.2WD r1 = X.C52699GbB.A01(r4, r5, r6, r7, r8, r9)
        L_0x0549:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r14)
            return r0
        L_0x054f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276774ts.A01(X.6S4, X.4tV, java.lang.Object):android.util.Pair");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.3qL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v15, types: [X.UAb] */
    /* JADX WARNING: type inference failed for: r7v16, types: [X.UAg] */
    /* JADX WARNING: type inference failed for: r8v5, types: [X.9YK, X.7zZ] */
    /* JADX WARNING: type inference failed for: r6v78, types: [java.lang.Object, X.9VS] */
    /* JADX WARNING: type inference failed for: r8v6, types: [X.2le, X.9VT] */
    /* JADX WARNING: type inference failed for: r6v85, types: [java.lang.Object, X.9VS] */
    /* JADX WARNING: type inference failed for: r6v97, types: [X.3jg, java.lang.Object, X.Q2K] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.3qL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v35, types: [X.4DU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v36, types: [X.4DU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v37, types: [X.4DU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v38, types: [X.4DU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v39, types: [X.4DU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x07cb, code lost:
        X.1Kn.A00(r1, "Bloks Flexbox", X.002.A0R("unknown visibility ", r4), (java.lang.Throwable) null);
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07e0, code lost:
        if (r0.intValue() != 4) goto L_0x08af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07e2, code lost:
        r0 = new X.C308026Sk(r1, (long) r2.A03, r6);
        r0.A02 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0854, code lost:
        if (r3 == false) goto L_0x0856;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0878, code lost:
        if (r3 == false) goto L_0x087a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x089c, code lost:
        if (r10.equals("visible") == false) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x08a9, code lost:
        r0 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0b3c, code lost:
        if (r2.A07(87) != null) goto L_0x0b3e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0c2b, code lost:
        if (r14.A04 == r20.A04) goto L_0x0c2d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0cab, code lost:
        throw new java.io.IOException(X.002.A0R("can't parse unknown snap gravity: ", r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x0d6d, code lost:
        if (X.Q06.A00(r7.A02, r9) != false) goto L_0x0daa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x0da8, code lost:
        if (X.Q06.A00(r7.A02, r9) != false) goto L_0x0daa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x0ec4, code lost:
        if (r10 != 0) goto L_0x0ec6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:545:0x0bca  */
    /* JADX WARNING: Removed duplicated region for block: B:683:0x0e15  */
    /* JADX WARNING: Removed duplicated region for block: B:689:0x0e2a  */
    /* JADX WARNING: Removed duplicated region for block: B:692:0x0e35  */
    /* JADX WARNING: Removed duplicated region for block: B:735:0x0ed5 A[Catch:{ 3yO -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:742:0x0f00 A[Catch:{ 3yO -> 0x0f08 }] */
    /* JADX WARNING: Removed duplicated region for block: B:748:0x0f53  */
    /* JADX WARNING: Removed duplicated region for block: B:753:0x0f70  */
    /* JADX WARNING: Removed duplicated region for block: B:766:0x0f9b  */
    /* JADX WARNING: Removed duplicated region for block: B:854:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.2Th A03(X.C307786Rm r31, X.C276544tV r32) {
        /*
            r30 = this;
            r2 = r32
            int r3 = r2.A04
            boolean r0 = X.C250563lf.A0k(r3)
            if (r0 == 0) goto L_0x1046
            r0 = 13326(0x340e, float:1.8674E-41)
            r1 = r31
            if (r3 == r0) goto L_0x103d
            r0 = 13327(0x340f, float:1.8675E-41)
            if (r3 == r0) goto L_0x1037
            r0 = 13616(0x3530, float:1.908E-41)
            if (r3 == r0) goto L_0x102e
            r0 = 13617(0x3531, float:1.9081E-41)
            if (r3 == r0) goto L_0x1024
            r0 = 13635(0x3543, float:1.9107E-41)
            if (r3 == r0) goto L_0x101e
            r0 = 13636(0x3544, float:1.9108E-41)
            if (r3 == r0) goto L_0x1018
            r0 = 15727(0x3d6f, float:2.2038E-41)
            if (r3 == r0) goto L_0x1012
            r0 = 15728(0x3d70, float:2.204E-41)
            if (r3 == r0) goto L_0x1009
            r0 = 16877(0x41ed, float:2.365E-41)
            if (r3 == r0) goto L_0x0fff
            r0 = 16878(0x41ee, float:2.3651E-41)
            if (r3 == r0) goto L_0x0ff5
            switch(r3) {
                case 13317: goto L_0x09b6;
                case 13320: goto L_0x07a2;
                case 13323: goto L_0x06cb;
                case 13329: goto L_0x069c;
                case 13399: goto L_0x0fef;
                case 13408: goto L_0x0692;
                case 13533: goto L_0x0fe9;
                case 13546: goto L_0x0fe3;
                case 13648: goto L_0x0fdd;
                case 13666: goto L_0x0689;
                case 13697: goto L_0x0fd7;
                case 13708: goto L_0x067f;
                case 13745: goto L_0x0653;
                case 13775: goto L_0x0fd1;
                case 13780: goto L_0x0fcb;
                case 13797: goto L_0x0632;
                case 13894: goto L_0x0649;
                case 13907: goto L_0x0fc5;
                case 13922: goto L_0x063f;
                case 13944: goto L_0x0fbf;
                case 13955: goto L_0x0632;
                case 13982: goto L_0x0606;
                case 14041: goto L_0x05fd;
                case 14045: goto L_0x05f4;
                case 14054: goto L_0x05c0;
                case 14093: goto L_0x0590;
                case 15753: goto L_0x058a;
                case 15768: goto L_0x0564;
                case 15770: goto L_0x0557;
                case 15778: goto L_0x054e;
                case 15856: goto L_0x04d8;
                case 15892: goto L_0x0fb9;
                case 15894: goto L_0x0440;
                case 15969: goto L_0x0437;
                case 15981: goto L_0x042a;
                case 16053: goto L_0x0415;
                case 16068: goto L_0x0fb3;
                case 16079: goto L_0x040b;
                case 16095: goto L_0x0fa9;
                case 16111: goto L_0x03e8;
                case 16122: goto L_0x03ab;
                case 16160: goto L_0x0fa3;
                case 16166: goto L_0x03a1;
                case 16218: goto L_0x0397;
                case 16260: goto L_0x038d;
                case 16278: goto L_0x037a;
                case 16355: goto L_0x0370;
                case 16383: goto L_0x0366;
                case 16390: goto L_0x035c;
                case 16411: goto L_0x0352;
                case 16444: goto L_0x0348;
                case 16451: goto L_0x030c;
                case 16467: goto L_0x0302;
                case 16584: goto L_0x024e;
                case 16586: goto L_0x022b;
                case 16641: goto L_0x020b;
                case 16675: goto L_0x01bf;
                case 16682: goto L_0x01b5;
                case 16688: goto L_0x019f;
                case 16801: goto L_0x018d;
                case 16910: goto L_0x0183;
                case 16919: goto L_0x0179;
                case 16927: goto L_0x0401;
                case 16995: goto L_0x016f;
                case 17025: goto L_0x0165;
                case 17088: goto L_0x015b;
                case 17096: goto L_0x0151;
                case 17106: goto L_0x0147;
                case 17134: goto L_0x013d;
                default: goto L_0x0037;
            }
        L_0x0037:
            switch(r3) {
                case 13334: goto L_0x0133;
                case 13335: goto L_0x0111;
                case 13336: goto L_0x0401;
                default: goto L_0x003a;
            }
        L_0x003a:
            switch(r3) {
                case 13375: goto L_0x010b;
                case 13376: goto L_0x00e7;
                case 13377: goto L_0x00de;
                case 13378: goto L_0x00d5;
                case 13379: goto L_0x0105;
                case 13380: goto L_0x00cc;
                default: goto L_0x003d;
            }
        L_0x003d:
            switch(r3) {
                case 13387: goto L_0x00a0;
                case 13388: goto L_0x0096;
                case 13389: goto L_0x008d;
                case 13390: goto L_0x0084;
                case 13391: goto L_0x007a;
                case 13392: goto L_0x00c6;
                case 13393: goto L_0x0070;
                default: goto L_0x0040;
            }
        L_0x0040:
            switch(r3) {
                case 16534: goto L_0x0061;
                case 16535: goto L_0x0057;
                case 16536: goto L_0x0f79;
                default: goto L_0x0043;
            }
        L_0x0043:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0057:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.NMT r0 = new X.NMT
            r0.<init>(r1, r2)
            return r0
        L_0x0061:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.L36 r3 = new X.L36
            r3.<init>(r1, r2)
            X.R9G r0 = new X.R9G
            r0.<init>(r3, r1, r2)
            return r0
        L_0x0070:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.UgH r0 = new X.UgH
            r0.<init>(r1, r2)
            return r0
        L_0x007a:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.DiS r0 = new X.DiS
            r0.<init>(r1, r2)
            return r0
        L_0x0084:
            X.0qQ.A0A(r1)
            X.H56 r0 = new X.H56
            r0.<init>(r1, r2)
            return r0
        L_0x008d:
            X.0qQ.A0A(r1)
            X.DiI r0 = new X.DiI
            r0.<init>(r1, r2)
            return r0
        L_0x0096:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.UgM r0 = new X.UgM
            r0.<init>(r1, r2)
            return r0
        L_0x00a0:
            java.lang.Object r6 = X.C307476Qg.A06(r1, r2)
            r6.getClass()
            X.WPq r6 = (X.C19210WPq) r6
            X.UTx r5 = r6.A02
            int r0 = r2.A03
            long r3 = (long) r0
            X.UTt r0 = new X.UTt
            r7 = r0
            r8 = r5
            r9 = r1
            r10 = r2
            r11 = r3
            r7.<init>(r8, r9, r10, r11)
            X.WK0 r2 = new X.WK0
            r2.<init>(r6)
            X.3ar r1 = new X.3ar
            r1.<init>(r2, r0)
            r0.A0D(r1)
            return r0
        L_0x00c6:
            X.EDy r0 = new X.EDy
            r0.<init>(r1, r2)
            return r0
        L_0x00cc:
            X.0qQ.A0A(r1)
            X.TxV r0 = new X.TxV
            r0.<init>(r1, r2)
            return r0
        L_0x00d5:
            int r0 = r2.A03
            long r1 = (long) r0
            X.6TT r0 = new X.6TT
            r0.<init>(r1)
            return r0
        L_0x00de:
            X.0qQ.A0A(r1)
            X.UgI r0 = new X.UgI
            r0.<init>(r1, r2)
            return r0
        L_0x00e7:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0lg r4 = X.C308206Td.A0A(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.session.UserSession"
            X.0qQ.A0C(r4, r0)
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = X.C307476Qg.A06(r1, r2)
            r3.getClass()
            X.VaJ r3 = (X.C17565VaJ) r3
            X.UgS r0 = new X.UgS
            r0.<init>(r3, r1, r2, r4)
            return r0
        L_0x0105:
            X.EDw r0 = new X.EDw
            r0.<init>(r1, r2)
            return r0
        L_0x010b:
            X.EDv r0 = new X.EDv
            r0.<init>(r1, r2)
            return r0
        L_0x0111:
            int r0 = r2.A03
            long r3 = (long) r0
            X.6TT r0 = new X.6TT
            r0.<init>(r3)
            r3 = 40
            X.4uI r4 = r2.A0A(r3)
            r3 = 1
            X.0qQ.A0B(r1, r3)
            if (r4 == 0) goto L_0x0f82
            X.GPd r3 = new X.GPd
            r3.<init>(r1, r2, r4)
            X.3ar r1 = new X.3ar
            r1.<init>(r3, r0)
            r0.A0D(r1)
            return r0
        L_0x0133:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.TzQ r0 = new X.TzQ
            r0.<init>(r1, r2)
            return r0
        L_0x013d:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.Ug1 r0 = new X.Ug1
            r0.<init>(r1, r2)
            return r0
        L_0x0147:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.UgC r0 = new X.UgC
            r0.<init>(r1, r2)
            return r0
        L_0x0151:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.Ug5 r0 = new X.Ug5
            r0.<init>(r1, r2)
            return r0
        L_0x015b:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.KAp r0 = new X.KAp
            r0.<init>(r1, r2)
            return r0
        L_0x0165:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.NMS r0 = new X.NMS
            r0.<init>(r1, r2)
            return r0
        L_0x016f:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.Uga r0 = new X.Uga
            r0.<init>(r1, r2)
            return r0
        L_0x0179:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.Ugc r0 = new X.Ugc
            r0.<init>(r1, r2)
            return r0
        L_0x0183:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.H5B r0 = new X.H5B
            r0.<init>(r1, r2)
            return r0
        L_0x018d:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            androidx.fragment.app.Fragment r0 = X.C308206Td.A00(r1)
            X.07Z r3 = r0.getViewLifecycleOwner()
            X.KAq r0 = new X.KAq
            r0.<init>(r3, r1, r2)
            return r0
        L_0x019f:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = X.C307476Qg.A06(r1, r2)
            X.Rnf r0 = (X.C10164Rnf) r0
            if (r0 == 0) goto L_0x01b3
            X.RR5 r3 = r0.A00
        L_0x01ad:
            X.R9F r0 = new X.R9F
            r0.<init>(r3, r1, r2)
            return r0
        L_0x01b3:
            r3 = 0
            goto L_0x01ad
        L_0x01b5:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.Ug3 r0 = new X.Ug3
            r0.<init>(r1, r2)
            return r0
        L_0x01bf:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r0 = r2.A03
            long r4 = (long) r0
            boolean r3 = X.C307476Qg.A0A(r1)
            X.6Sk r0 = new X.6Sk
            r0.<init>(r1, r4, r3)
            long r5 = r0.A0A
            X.Tz9 r4 = new X.Tz9
            r4.<init>(r1, r5)
            X.3ar r3 = new X.3ar
            r3.<init>(r4, r2)
            r0.A0D(r3)
            r7 = 38
            X.4tV r4 = r2.A07(r7)
            r6 = 0
            if (r4 == 0) goto L_0x0209
            r3 = 36
            X.4uI r5 = r4.A0A(r3)
        L_0x01ed:
            X.4tV r4 = r2.A07(r7)
            if (r4 == 0) goto L_0x01f9
            r3 = 35
            X.4uI r6 = r4.A0A(r3)
        L_0x01f9:
            if (r5 != 0) goto L_0x01fd
            if (r6 == 0) goto L_0x0f82
        L_0x01fd:
            X.Tz7 r4 = new X.Tz7
            r4.<init>(r1, r2, r6, r5)
            X.3ar r3 = new X.3ar
            r3.<init>(r4, r2)
            goto L_0x09b2
        L_0x0209:
            r5 = r6
            goto L_0x01ed
        L_0x020b:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0Tu r0 = X.0Tu.A05
            X.0qQ.A08(r0)
            r3 = 36321597824443991(0x810a4d00002657, double:3.0332629472889935E-306)
            boolean r0 = X.1AW.A06(r0, r3)
            if (r0 == 0) goto L_0x0225
            X.R9H r0 = new X.R9H
            r0.<init>(r1, r2)
            return r0
        L_0x0225:
            X.R9E r0 = new X.R9E
            r0.<init>(r1, r2)
            return r0
        L_0x022b:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r7 = X.C307476Qg.A06(r1, r2)
            r7.getClass()
            X.Hk4 r7 = (X.C55584Hk4) r7
            int r0 = r2.A03
            long r4 = (long) r0
            r6 = -1
            r3 = 17
            X.Iwy r0 = new X.Iwy
            r0.<init>(r3, r7, r2, r1)
            X.2WD r0 = X.HST.A00(r0, r6, r4)
            r7.A00 = r0
            X.2WG r0 = r0.A01
            X.2WH r0 = r0.A02
            return r0
        L_0x024e:
            r9 = 0
            X.0qQ.A0B(r1, r9)
            r13 = 1
            java.lang.Object r6 = X.C307476Qg.A06(r1, r2)
            r6.getClass()
            X.Vrd r6 = (X.C18434Vrd) r6
            boolean r3 = r1.A05
            r0 = 0
            if (r3 == 0) goto L_0x0267
            java.lang.String r5 = r2.A0G()
            if (r5 != 0) goto L_0x0277
        L_0x0267:
            r3 = 41
            java.lang.String r5 = r2.A0K(r3)
            if (r5 != 0) goto L_0x0277
            java.lang.String r3 = "BKBloksComponentsKeyframeBinderUtil"
            java.lang.String r2 = "Error: URL and DARK_MODE_URL are both null"
            X.1Kn.A00(r1, r3, r2, r0)
            return r0
        L_0x0277:
            int r3 = r2.A03
            long r3 = (long) r3
            android.net.Uri r10 = X.0cp.A03(r5)
            X.UJ5 r8 = new X.UJ5
            r8.<init>(r6)
            r14 = 0
            X.1U1 r5 = X.1U1.A0b
            X.1U3 r11 = X.AnonymousClass1UL.A00(r5)
            r5 = 40
            java.lang.String r5 = r2.A0K(r5)
            X.1U5 r12 = X.AnonymousClass1U5.A04
            if (r5 == 0) goto L_0x02ac
            android.widget.ImageView$ScaleType r5 = X.AnonymousClass6Su.A0A(r5)     // Catch:{ 3yO -> 0x02a5 }
            int[] r7 = X.VJM.A00     // Catch:{ 3yO -> 0x02a5 }
            int r5 = r5.ordinal()     // Catch:{ 3yO -> 0x02a5 }
            r5 = r7[r5]     // Catch:{ 3yO -> 0x02a5 }
            if (r5 != r13) goto L_0x02ac
            X.1U5 r12 = X.AnonymousClass1U5.A01     // Catch:{ 3yO -> 0x02a5 }
            goto L_0x02ac
        L_0x02a5:
            java.lang.String r7 = "BKBloksComponentsKeyframeBinderUtil"
            java.lang.String r5 = "Error parsing scale type"
            X.1Kn.A02(r7, r5)
        L_0x02ac:
            X.0qQ.A0A(r12)
            r11.A00(r12)
            r11.A0T = r9
            X.1U1 r5 = new X.1U1
            r5.<init>(r11)
            java.lang.String r19 = "BKBloksComponentsKeyframeBinderUtil"
            X.2he r18 = X.AnonymousClass6QK.A00(r10, r0)
            X.6QP r0 = new X.6QP
            r15 = r14
            r16 = r8
            r17 = r5
            r20 = r3
            r22 = r9
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r22)
            r5 = 2
            r3 = 41
            java.lang.String r3 = r2.A0K(r3)
            if (r3 == 0) goto L_0x02fa
            X.WK1 r4 = new X.WK1
            r4.<init>(r6, r1, r2, r3)
            X.3ar r3 = new X.3ar
            r3.<init>(r4, r0)
            X.WJz r2 = new X.WJz
            r2.<init>(r6)
            X.3ar r1 = new X.3ar
            r1.<init>(r2, r0)
            X.3ar[] r3 = new X.C244233ar[]{r3, r1}
            r2 = 0
        L_0x02f0:
            r1 = r3[r2]
            r0.A0C(r1)
            int r2 = r2 + 1
            if (r2 >= r5) goto L_0x0f82
            goto L_0x02f0
        L_0x02fa:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0302:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.R9D r0 = new X.R9D
            r0.<init>(r1, r2)
            return r0
        L_0x030c:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            android.content.Context r4 = r1.A00
            java.lang.String r3 = r4.getPackageName()
            java.lang.String r0 = "com.instagram.android"
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x032e
            java.lang.String r3 = r4.getPackageName()
            r0 = 2846(0xb1e, float:3.988E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x033d
        L_0x032e:
            r0 = 2131428799(0x7f0b05bf, float:1.8479253E38)
            java.lang.Object r0 = r1.A00(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r0 = r0.isAdded()
            if (r0 == 0) goto L_0x0401
        L_0x033d:
            X.Vg0 r3 = new X.Vg0
            r3.<init>(r1, r2)
            com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit r0 = new com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit
            r0.<init>(r3, r1, r2)
            return r0
        L_0x0348:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.H59 r0 = new X.H59
            r0.<init>(r1, r2)
            return r0
        L_0x0352:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.EDp r0 = new X.EDp
            r0.<init>(r1, r2)
            return r0
        L_0x035c:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.EDr r0 = new X.EDr
            r0.<init>(r1, r2)
            return r0
        L_0x0366:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.KAo r0 = new X.KAo
            r0.<init>(r1, r2)
            return r0
        L_0x0370:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.EDq r0 = new X.EDq
            r0.<init>(r1, r2)
            return r0
        L_0x037a:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r3 = X.C307476Qg.A06(r1, r2)
            r3.getClass()
            X.VtL r3 = (X.C18521VtL) r3
            X.UgQ r0 = new X.UgQ
            r0.<init>(r3, r1, r2)
            return r0
        L_0x038d:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.Ug6 r0 = new X.Ug6
            r0.<init>(r1, r2)
            return r0
        L_0x0397:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.Ugb r0 = new X.Ugb
            r0.<init>(r1, r2)
            return r0
        L_0x03a1:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.EDz r0 = new X.EDz
            r0.<init>(r1, r2)
            return r0
        L_0x03ab:
            X.0lg r8 = X.C308206Td.A0A(r1)
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            android.content.Context r0 = r1.A00
            X.2nD r7 = new X.2nD
            r7.<init>(r8, r0)
            r0 = 2131428798(0x7f0b05be, float:1.847925E38)
            java.lang.Object r6 = r1.A00(r0)
            X.0iw r6 = (X.AnonymousClass0iw) r6
            X.2s8 r5 = new X.2s8
            r5.<init>(r6, r8)
            r0 = 2131430138(0x7f0b0afa, float:1.8481968E38)
            java.lang.Object r4 = r1.A00(r0)
            X.2my r4 = (X.C229182my) r4
            r0 = 2131435803(0x7f0b211b, float:1.8493458E38)
            java.lang.Object r3 = r1.A00(r0)
            X.2lb r3 = (X.C228392lb) r3
            X.H57 r0 = new X.H57
            r9 = r5
            r10 = r6
            r11 = r1
            r12 = r2
            r13 = r8
            r14 = r3
            r15 = r7
            r16 = r4
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x03e8:
            r0 = 32
            java.util.List r4 = r2.A0N(r0)
            int r3 = r4.size()
            r0 = 1
            if (r3 > r0) goto L_0x0403
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0401
            X.H58 r0 = new X.H58
            r0.<init>(r1, r2)
            return r0
        L_0x0401:
            r0 = 0
            return r0
        L_0x0403:
            java.lang.String r1 = "Popup cannot have more than 1 child element"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x040b:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.UgA r0 = new X.UgA
            r0.<init>(r1, r2)
            return r0
        L_0x0415:
            r0 = 36
            java.lang.String r0 = r2.A0K(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            X.17k.A0E(r0)
            X.Ug7 r0 = new X.Ug7
            r0.<init>(r1, r2)
            return r0
        L_0x042a:
            X.0qQ.A0A(r1)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.9j3 r0 = new X.9j3
            r0.<init>(r1, r2)
            return r0
        L_0x0437:
            X.0qQ.A0A(r1)
            X.EDt r0 = new X.EDt
            r0.<init>(r1, r2)
            return r0
        L_0x0440:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "CPDPLightBoxReelsVideoComponent"
            com.instagram.common.session.UserSession r6 = X.C18182Vmw.A00(r1, r0)
            r0 = 0
            if (r6 == 0) goto L_0x0f82
            java.lang.String r5 = r2.A0D()
            if (r5 == 0) goto L_0x0f82
            r4 = 41
            r3 = -1
            int r7 = r2.A03(r4, r3)     // Catch:{ IOException -> 0x0f82 }
            X.0c5 r3 = X.0c9.A04     // Catch:{ IOException -> 0x0f82 }
            X.0c9 r3 = r3.A01(r6, r5)     // Catch:{ IOException -> 0x0f82 }
            X.Cv5 r3 = X.CpK.parseFromJson(r3)     // Catch:{ IOException -> 0x0f82 }
            X.0qQ.A0A(r3)     // Catch:{ IOException -> 0x0f82 }
            X.Vjd r5 = X.C45894D9x.A01(r6, r3)     // Catch:{ IOException -> 0x0f82 }
            if (r5 == 0) goto L_0x0f82
            java.lang.Integer r4 = r5.A02     // Catch:{ IOException -> 0x0f82 }
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x0f82 }
            if (r4 != r3) goto L_0x0493
            X.WWe r12 = new X.WWe     // Catch:{ IOException -> 0x0f82 }
            r12.<init>()     // Catch:{ IOException -> 0x0f82 }
            X.UrZ r5 = (X.C16272UrZ) r5     // Catch:{ IOException -> 0x0f82 }
            X.Ucy r4 = new X.Ucy     // Catch:{ IOException -> 0x0f82 }
            r8 = r4
            r9 = r1
            r10 = r2
            r11 = r6
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0f82 }
        L_0x0484:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0f82 }
            java.util.HashMap r2 = X.C17151VKd.A01     // Catch:{ IOException -> 0x0f82 }
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ IOException -> 0x0f82 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0f82 }
            r2.put(r3, r1)     // Catch:{ IOException -> 0x0f82 }
            goto L_0x04d7
        L_0x0493:
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y     // Catch:{ IOException -> 0x0f82 }
            if (r4 != r3) goto L_0x04a9
            X.WWe r12 = new X.WWe     // Catch:{ IOException -> 0x0f82 }
            r12.<init>()     // Catch:{ IOException -> 0x0f82 }
            X.UrY r5 = (X.C16271UrY) r5     // Catch:{ IOException -> 0x0f82 }
            X.Ucw r4 = new X.Ucw     // Catch:{ IOException -> 0x0f82 }
            r8 = r4
            r9 = r1
            r10 = r2
            r11 = r6
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0f82 }
            goto L_0x0484
        L_0x04a9:
            java.lang.Integer r3 = X.AnonymousClass05K.A0j     // Catch:{ IOException -> 0x0f82 }
            if (r4 != r3) goto L_0x0f82
            X.Urb r5 = (X.C16274Urb) r5     // Catch:{ IOException -> 0x0f82 }
            X.1Xj r3 = r5.A00     // Catch:{ IOException -> 0x0f82 }
            boolean r3 = r3.CeS()     // Catch:{ IOException -> 0x0f82 }
            if (r3 == 0) goto L_0x04c7
            X.WWe r12 = new X.WWe     // Catch:{ IOException -> 0x0f82 }
            r12.<init>()     // Catch:{ IOException -> 0x0f82 }
            X.Ucz r4 = new X.Ucz     // Catch:{ IOException -> 0x0f82 }
            r8 = r4
            r9 = r1
            r10 = r2
            r11 = r6
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0f82 }
            goto L_0x0484
        L_0x04c7:
            X.WWe r12 = new X.WWe     // Catch:{ IOException -> 0x0f82 }
            r12.<init>()     // Catch:{ IOException -> 0x0f82 }
            X.Ucx r4 = new X.Ucx     // Catch:{ IOException -> 0x0f82 }
            r8 = r4
            r9 = r1
            r10 = r2
            r11 = r6
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0f82 }
            goto L_0x0484
        L_0x04d7:
            return r4
        L_0x04d8:
            java.lang.String r7 = "CPDPHeroCarouselVideoComponent"
            com.instagram.common.session.UserSession r6 = X.C18182Vmw.A00(r1, r7)
            r0 = 0
            if (r6 == 0) goto L_0x0f82
            X.WWe r12 = new X.WWe
            r12.<init>()
            java.lang.String r4 = r2.A0J()
            if (r4 == 0) goto L_0x0f82
            X.0c5 r3 = X.0c9.A04     // Catch:{ IOException -> 0x0545 }
            X.0c9 r3 = r3.A01(r6, r4)     // Catch:{ IOException -> 0x0545 }
            X.Cv5 r3 = X.CpK.parseFromJson(r3)     // Catch:{ IOException -> 0x0545 }
            if (r3 == 0) goto L_0x0f82
            X.Vjd r5 = X.C45894D9x.A01(r6, r3)     // Catch:{ IOException -> 0x0545 }
            X.VZO r8 = X.C18680Vwd.A02(r1, r6, r7)     // Catch:{ IOException -> 0x0545 }
            if (r8 == 0) goto L_0x0f82
            if (r5 == 0) goto L_0x0f82
            java.lang.Integer r4 = r5.A02     // Catch:{ IOException -> 0x0545 }
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x0545 }
            if (r4 != r3) goto L_0x0514
            X.Ucv r7 = new X.Ucv     // Catch:{ IOException -> 0x0545 }
            r9 = r1
            r10 = r2
            r11 = r6
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0545 }
            return r7
        L_0x0514:
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y     // Catch:{ IOException -> 0x0545 }
            if (r4 != r3) goto L_0x0522
            X.Ucs r7 = new X.Ucs     // Catch:{ IOException -> 0x0545 }
            r9 = r1
            r10 = r2
            r11 = r6
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0545 }
            return r7
        L_0x0522:
            java.lang.Integer r3 = X.AnonymousClass05K.A0j     // Catch:{ IOException -> 0x0545 }
            if (r4 != r3) goto L_0x0f82
            r3 = r5
            X.Urb r3 = (X.C16274Urb) r3     // Catch:{ IOException -> 0x0545 }
            X.1Xj r3 = r3.A00     // Catch:{ IOException -> 0x0545 }
            boolean r3 = r3.CeS()     // Catch:{ IOException -> 0x0545 }
            if (r3 == 0) goto L_0x053b
            X.Ucu r7 = new X.Ucu     // Catch:{ IOException -> 0x0545 }
            r9 = r1
            r10 = r2
            r11 = r6
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0545 }
            return r7
        L_0x053b:
            X.Uct r7 = new X.Uct     // Catch:{ IOException -> 0x0545 }
            r9 = r1
            r10 = r2
            r11 = r6
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0545 }
            return r7
        L_0x0545:
            r4 = move-exception
            java.lang.String r3 = "CPDP_MVP_HEROCAROUSEL"
            java.lang.String r2 = "CPDPHeroCarouselVideoComponent createRenderUnit failed to parse the right model."
            X.1Kn.A00(r1, r3, r2, r4)
            return r0
        L_0x054e:
            X.0qQ.A0A(r1)
            X.Gb0 r0 = new X.Gb0
            r0.<init>(r1, r2)
            return r0
        L_0x0557:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r0 = r2.A03
            long r3 = (long) r0
            X.5ud r0 = new X.5ud
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0564:
            java.lang.Object r4 = X.C307476Qg.A06(r1, r2)
            X.6Jw r4 = (X.C305866Jw) r4
            if (r4 == 0) goto L_0x0582
            android.content.Context r3 = r1.A00
            X.2nJ r0 = r1.A02
            X.2nI r0 = (X.C229382nI) r0
            X.6gL r7 = X.C313366gK.A00(r0)
            X.UgV r0 = new X.UgV
            r5 = r0
            r6 = r3
            r8 = r4
            r9 = r1
            r10 = r2
            r11 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0582:
            java.lang.String r1 = "Got null while trying to retrieve controller for video"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x058a:
            X.R9I r0 = new X.R9I
            r0.<init>(r1, r2, r2)
            return r0
        L_0x0590:
            r3 = 2131429735(0x7f0b0967, float:1.8481151E38)
            android.util.SparseArray r0 = r1.A01
            java.lang.Object r6 = r0.get(r3)
            X.XAw r6 = (X.C21043XAw) r6
            if (r6 != 0) goto L_0x05a6
            java.lang.String r1 = "CDSBottomSheetWrapperBinderUtils"
            java.lang.String r0 = "Rendering a bk.cds.bottomsheet.Wrapper outside of a CDS bottom sheet. The header will not render properly."
            X.1Kn.A02(r1, r0)
            r0 = 0
            return r0
        L_0x05a6:
            int r0 = r2.A03
            long r4 = (long) r0
            boolean r3 = X.C307476Qg.A0A(r1)
            X.6Sk r0 = new X.6Sk
            r0.<init>(r1, r4, r3)
            X.TyQ r3 = new X.TyQ
            r3.<init>(r6)
            X.3ar r1 = new X.3ar
            r1.<init>(r3, r2)
            r0.A0D(r1)
            return r0
        L_0x05c0:
            android.content.Context r4 = r1.A00
            X.0lg r7 = X.C308206Td.A0A(r1)
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.0iw r6 = X.C308206Td.A07(r1)
            java.lang.Object r8 = X.C307476Qg.A06(r1, r2)
            X.IUt r8 = (X.C57258IUt) r8
            if (r8 == 0) goto L_0x05ec
            r5 = 0
            r10 = 0
            X.4EZ r3 = new X.4EZ
            r9 = r5
            r11 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.H5A r0 = new X.H5A
            r9 = r0
            r10 = r4
            r11 = r8
            r12 = r6
            r13 = r1
            r14 = r2
            r15 = r7
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x05ec:
            java.lang.String r1 = "Controller was defined but none was found"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x05f4:
            X.0qQ.A0A(r1)
            X.UgF r0 = new X.UgF
            r0.<init>(r1, r2)
            return r0
        L_0x05fd:
            X.0qQ.A0A(r1)
            X.UgG r0 = new X.UgG
            r0.<init>(r1, r2)
            return r0
        L_0x0606:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            androidx.fragment.app.Fragment r6 = X.C308206Td.A00(r1)
            boolean r0 = r6 instanceof X.AnonymousClass3M6
            if (r0 == 0) goto L_0x0630
            X.3M6 r6 = (X.AnonymousClass3M6) r6
        L_0x0614:
            int r0 = r2.A03
            long r4 = (long) r0
            boolean r3 = X.C307476Qg.A0A(r1)
            X.6Sk r0 = new X.6Sk
            r0.<init>(r1, r4, r3)
            long r4 = r0.A0A
            X.TyV r3 = new X.TyV
            r3.<init>(r6, r1, r4)
            X.3ar r1 = new X.3ar
            r1.<init>(r3, r2)
            r0.A0D(r1)
            return r0
        L_0x0630:
            r6 = 0
            goto L_0x0614
        L_0x0632:
            int r0 = r2.A03
            long r3 = (long) r0
            boolean r2 = X.C307476Qg.A0A(r1)
            X.6Sk r0 = new X.6Sk
            r0.<init>(r1, r3, r2)
            return r0
        L_0x063f:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.EDs r0 = new X.EDs
            r0.<init>(r1, r2)
            return r0
        L_0x0649:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.UgB r0 = new X.UgB
            r0.<init>(r1, r2)
            return r0
        L_0x0653:
            X.0lg r0 = X.C308206Td.A0A(r1)
            com.instagram.common.session.UserSession r4 = X.0Gl.A01(r0)
            if (r4 == 0) goto L_0x066a
            r3 = 46
            r0 = 0
            boolean r0 = r2.A0R(r3, r0)
            if (r0 == 0) goto L_0x066a
            r0 = 0
            X.SAX.A00(r4, r0)
        L_0x066a:
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            X.R9J r0 = new X.R9J
            r0.<init>(r1, r2, r3)
            X.Spi r3 = new X.Spi
            r3.<init>(r2)
            X.3ar r1 = new X.3ar
            r1.<init>(r3, r2)
            r0.A0D(r1)
            return r0
        L_0x067f:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.Ug9 r0 = new X.Ug9
            r0.<init>(r1, r2)
            return r0
        L_0x0689:
            X.0qQ.A0A(r1)
            X.TzJ r0 = new X.TzJ
            r0.<init>(r1, r2)
            return r0
        L_0x0692:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.UgN r0 = new X.UgN
            r0.<init>(r1, r2)
            return r0
        L_0x069c:
            int r0 = r2.A03
            long r3 = (long) r0
            X.6TT r0 = new X.6TT
            r0.<init>(r3)
            r3 = 41
            X.4uI r4 = r2.A0A(r3)
            r3 = 1
            X.0qQ.A0B(r1, r3)
            if (r4 == 0) goto L_0x06bd
            X.GPd r3 = new X.GPd
            r3.<init>(r1, r2, r4)
            X.3ar r2 = new X.3ar
            r2.<init>(r3, r0)
            r0.A0D(r2)
        L_0x06bd:
            X.GPg r2 = new X.GPg
            r2.<init>(r1)
            X.3ar r1 = new X.3ar
            r1.<init>(r2, r0)
            r0.A0D(r1)
            return r0
        L_0x06cb:
            if (r31 == 0) goto L_0x0703
            X.0lg r0 = X.C308206Td.A0A(r1)
            com.instagram.common.session.UserSession r0 = X.0Gl.A01(r0)
            if (r0 == 0) goto L_0x0703
            X.1Si r0 = X.1Se.A00(r0)
            boolean r0 = r0.A0A
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0703
            X.Ug2 r0 = new X.Ug2
            r0.<init>(r1, r2)
        L_0x06e6:
            android.net.Uri r1 = X.AnonymousClass6QD.A00(r1, r2)
            if (r1 == 0) goto L_0x0f82
            java.lang.String r4 = r1.toString()
            if (r4 == 0) goto L_0x0f82
            r3 = r0
            X.2Th r3 = (X.2Th) r3
            X.6QT r2 = new X.6QT
            r2.<init>()
            X.3ar r1 = new X.3ar
            r1.<init>(r2, r4)
            r3.A0D(r1)
            return r0
        L_0x0703:
            X.1Sw.A00()
            java.lang.String r12 = "ImageNodeUtils"
            r5 = 0
            X.0qQ.A0B(r1, r5)
            android.net.Uri r6 = X.AnonymousClass6QD.A00(r1, r2)
            if (r6 != 0) goto L_0x0783
            X.6QU r11 = X.AnonymousClass6QU.A00
        L_0x0714:
            X.579 r9 = X.AnonymousClass6QD.A01(r1, r2)
            r0 = 63
            X.4uI r3 = r2.A0A(r0)
            if (r3 != 0) goto L_0x077d
            r0 = 0
        L_0x0721:
            r3 = 2131428743(0x7f0b0587, float:1.847914E38)
            android.util.SparseArray r7 = r1.A01
            java.lang.Object r4 = r7.get(r3)
            X.6QM r6 = new X.6QM
            r6.<init>()
            if (r0 == 0) goto L_0x0736
            java.util.concurrent.CopyOnWriteArrayList r3 = r6.A00
            r3.add(r0)
        L_0x0736:
            if (r4 == 0) goto L_0x073d
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.A00
            r0.add(r4)
        L_0x073d:
            X.1U1 r10 = X.AnonymousClass6QD.A02(r1, r2)
            r0 = 74
            boolean r15 = r2.A0R(r0, r5)
            r0 = 2131428739(0x7f0b0583, float:1.847913E38)
            java.lang.Object r4 = r7.get(r0)
            com.facebook.common.callercontext.ContextChain r4 = (com.facebook.common.callercontext.ContextChain) r4
            java.lang.String r3 = "i"
            java.lang.String r0 = "BloksImageComponent"
            com.facebook.common.callercontext.ContextChain r7 = new com.facebook.common.callercontext.ContextChain
            r7.<init>(r4, r3, r0)
            int r0 = r2.A03
            long r3 = (long) r0
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0765
            r6 = 0
        L_0x0765:
            r0 = 73
            java.lang.String r5 = r2.A0K(r0)
            if (r5 == 0) goto L_0x0773
            com.facebook.common.callercontext.ContextChain r0 = new com.facebook.common.callercontext.ContextChain
            r0.<init>(r7, r5)
            r7 = r0
        L_0x0773:
            X.6QP r0 = new X.6QP
            r8 = r6
            r13 = r3
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15)
            goto L_0x06e6
        L_0x077d:
            X.WHV r0 = new X.WHV
            r0.<init>(r1, r2, r3)
            goto L_0x0721
        L_0x0783:
            r0 = 58
            java.lang.String r4 = r2.A0K(r0)
            if (r4 == 0) goto L_0x07a0
            r0 = 1451(0x5ab, float:2.033E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            X.0eP r0 = new X.0eP
            r0.<init>(r3, r4)
            java.util.Map r0 = X.0se.A0M(r0)
        L_0x079a:
            X.2he r11 = X.AnonymousClass6QK.A00(r6, r0)
            goto L_0x0714
        L_0x07a0:
            r0 = 0
            goto L_0x079a
        L_0x07a2:
            r7 = 38
            X.4tV r5 = r2.A07(r7)
            boolean r6 = X.C307476Qg.A0A(r1)
            if (r5 == 0) goto L_0x07b4
            r0 = 43
            boolean r6 = r5.A0R(r0, r6)
        L_0x07b4:
            r9 = 49
            java.lang.String r4 = r2.A0K(r9)
            if (r4 == 0) goto L_0x08af
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r10 = r4.toLowerCase(r0)
            int r0 = r10.hashCode()
            r3 = 0
            r8 = -1
            switch(r0) {
                case -1901805651: goto L_0x08a0;
                case 3178655: goto L_0x088b;
                case 466743410: goto L_0x0896;
                default: goto L_0x07cb;
            }
        L_0x07cb:
            java.lang.String r0 = "unknown visibility "
            java.lang.String r4 = X.002.A0R(r0, r4)
            r3 = 0
            java.lang.String r0 = "Bloks Flexbox"
            X.1Kn.A00(r1, r0, r4, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x07db:
            int r0 = r0.intValue()
            r8 = 4
            if (r0 != r8) goto L_0x08af
            int r0 = r2.A03
            long r3 = (long) r0
            X.6Sk r0 = new X.6Sk
            r0.<init>(r1, r3, r6)
            r0.A02 = r8
        L_0x07ec:
            r8 = 40
            r10 = 1
            boolean r3 = r2.A0R(r8, r10)
            if (r3 != 0) goto L_0x0802
            if (r0 != 0) goto L_0x07ff
            int r0 = r2.A03
            long r3 = (long) r0
            X.6Sk r0 = new X.6Sk
            r0.<init>(r1, r3, r6)
        L_0x07ff:
            r3 = 0
            r0.A08 = r3
        L_0x0802:
            r3 = 45
            X.4uI r11 = r2.A0A(r3)
            if (r11 == 0) goto L_0x081d
            if (r0 != 0) goto L_0x0814
            int r0 = r2.A03
            long r3 = (long) r0
            X.6Sk r0 = new X.6Sk
            r0.<init>(r1, r3, r6)
        L_0x0814:
            X.Tr0 r3 = new X.Tr0
            r3.<init>(r1, r2, r11)
            r0.A05 = r3
            r0.A09 = r10
        L_0x081d:
            if (r5 == 0) goto L_0x08fb
            if (r0 != 0) goto L_0x0829
            int r0 = r2.A03
            long r3 = (long) r0
            X.6Sk r0 = new X.6Sk
            r0.<init>(r1, r3, r6)
        L_0x0829:
            r0.A06 = r5
            r3 = 35
            X.4tV r14 = r5.A07(r3)
            X.6Rm r12 = r0.A0B
            r12.getClass()
            r11 = 0
            r15 = 1
            r4 = 0
            if (r14 == 0) goto L_0x0889
            X.1Kj r3 = X.C64361Kj.A00()
            X.4dW r5 = r3.A02
            X.4tV r3 = r0.A06
            android.graphics.drawable.Drawable r5 = r5.A00(r12, r14, r3)
            if (r5 == 0) goto L_0x0856
            X.C64361Kj.A00()
            int r13 = r14.A04
            r3 = 13761(0x35c1, float:1.9283E-41)
            if (r13 == r3) goto L_0x0884
            r3 = 0
        L_0x0853:
            r14 = 1
            if (r3 != 0) goto L_0x0857
        L_0x0856:
            r14 = 0
        L_0x0857:
            X.4tV r3 = r0.A06
            X.4tV r13 = r3.A07(r9)
            if (r13 == 0) goto L_0x087c
            X.1Kj r3 = X.C64361Kj.A00()
            X.4dW r9 = r3.A02
            X.4tV r3 = r0.A06
            android.graphics.drawable.Drawable r11 = r9.A00(r12, r13, r3)
            if (r11 == 0) goto L_0x087a
            X.C64361Kj.A00()
            int r9 = r13.A04
            r3 = 13761(0x35c1, float:1.9283E-41)
            if (r9 == r3) goto L_0x087f
            r3 = 0
        L_0x0877:
            r9 = 1
            if (r3 != 0) goto L_0x087b
        L_0x087a:
            r9 = 0
        L_0x087b:
            r14 = r14 | r9
        L_0x087c:
            if (r5 != 0) goto L_0x08f2
            goto L_0x08b2
        L_0x087f:
            boolean r3 = r13.A0R(r8, r10)
            goto L_0x0877
        L_0x0884:
            boolean r3 = r14.A0R(r8, r10)
            goto L_0x0853
        L_0x0889:
            r5 = r11
            goto L_0x0856
        L_0x088b:
            java.lang.String r0 = "gone"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x07cb
            r3 = 8
            goto L_0x08a9
        L_0x0896:
            java.lang.String r0 = "visible"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x08a9
            goto L_0x07cb
        L_0x08a0:
            java.lang.String r0 = "invisible"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x07cb
            r3 = 4
        L_0x08a9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x07db
        L_0x08af:
            r0 = 0
            goto L_0x07ec
        L_0x08b2:
            X.4tV r9 = r0.A06     // Catch:{ 3yO -> 0x08ec }
            r3 = 43
            boolean r3 = r9.A0R(r3, r4)     // Catch:{ 3yO -> 0x08ec }
            r10 = 0
            if (r3 != 0) goto L_0x08be
            r10 = 1
        L_0x08be:
            X.4tV r9 = r0.A06     // Catch:{ 3yO -> 0x08ec }
            r3 = 46
            java.lang.String r3 = r9.A0K(r3)     // Catch:{ 3yO -> 0x08ec }
            r9 = 0
            if (r3 == 0) goto L_0x08d2
            float r3 = X.AnonymousClass6Su.A01(r3)     // Catch:{ 3yO -> 0x08ec }
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x08d2
            r15 = 0
        L_0x08d2:
            if (r10 != 0) goto L_0x08d6
            if (r15 == 0) goto L_0x08f2
        L_0x08d6:
            X.4tV r3 = r0.A06     // Catch:{ 3yO -> 0x08ec }
            java.lang.String r3 = r3.A0K(r8)     // Catch:{ 3yO -> 0x08ec }
            if (r3 == 0) goto L_0x08f2
            float r3 = X.AnonymousClass6Su.A01(r3)     // Catch:{ 3yO -> 0x08ec }
            int r3 = (int) r3     // Catch:{ 3yO -> 0x08ec }
            if (r3 == 0) goto L_0x08f2
            X.4tV r3 = r0.A06     // Catch:{ 3yO -> 0x08ec }
            X.6Sx r5 = X.C308136Sw.A01(r12, r3, r4)     // Catch:{ 3yO -> 0x08ec }
            goto L_0x08f2
        L_0x08ec:
            r4 = move-exception
            java.lang.String r3 = "HostWithDecoratorRenderUnit"
            X.1Kn.A03(r3, r4)
        L_0x08f2:
            r0.A03 = r5
            r0.A04 = r11
            if (r14 == 0) goto L_0x08fb
            r3 = 2
            r0.A01 = r3
        L_0x08fb:
            java.util.List r12 = r2.A0L()
            r9 = 0
            r11 = 0
        L_0x0901:
            int r3 = r12.size()
            if (r11 >= r3) goto L_0x099c
            java.lang.Object r13 = r12.get(r11)
            X.4tV r13 = (X.C276544tV) r13
            r3 = 132(0x84, float:1.85E-43)
            X.4tV r5 = r13.A07(r3)
            if (r5 == 0) goto L_0x0998
            int r4 = r5.A04
            r3 = 13368(0x3438, float:1.8733E-41)
            if (r4 != r3) goto L_0x0998
            r3 = 75
            X.4tV r5 = r5.A07(r3)
            if (r5 == 0) goto L_0x0998
            if (r9 != 0) goto L_0x092a
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x092a:
            X.TyU r10 = new X.TyU
            r10.<init>()
            int r3 = r13.A03
            r10.A06 = r3
            r3 = 42
            java.lang.String r4 = r5.A0K(r3)     // Catch:{ 3yO -> 0x098a }
            r3 = 1
            if (r4 == 0) goto L_0x0940
            float r3 = X.AnonymousClass6Su.A01(r4)     // Catch:{ 3yO -> 0x098a }
        L_0x0940:
            r10.A05 = r3     // Catch:{ 3yO -> 0x098a }
            r3 = 35
            java.lang.String r4 = r5.A0K(r3)     // Catch:{ 3yO -> 0x098a }
            r3 = 1
            if (r4 == 0) goto L_0x094f
            float r3 = X.AnonymousClass6Su.A01(r4)     // Catch:{ 3yO -> 0x098a }
        L_0x094f:
            r10.A00 = r3     // Catch:{ 3yO -> 0x098a }
            r3 = 41
            java.lang.String r4 = r5.A0K(r3)     // Catch:{ 3yO -> 0x098a }
            r3 = 1
            if (r4 == 0) goto L_0x095e
            float r3 = X.AnonymousClass6Su.A01(r4)     // Catch:{ 3yO -> 0x098a }
        L_0x095e:
            r10.A04 = r3     // Catch:{ 3yO -> 0x098a }
            r3 = 36
            java.lang.String r4 = r5.A0K(r3)     // Catch:{ 3yO -> 0x098a }
            r3 = 1
            if (r4 == 0) goto L_0x096d
            float r3 = X.AnonymousClass6Su.A01(r4)     // Catch:{ 3yO -> 0x098a }
        L_0x096d:
            r10.A01 = r3     // Catch:{ 3yO -> 0x098a }
            java.lang.String r4 = r5.A0K(r7)     // Catch:{ 3yO -> 0x098a }
            r3 = 1
            if (r4 == 0) goto L_0x097a
            float r3 = X.AnonymousClass6Su.A01(r4)     // Catch:{ 3yO -> 0x098a }
        L_0x097a:
            r10.A02 = r3     // Catch:{ 3yO -> 0x098a }
            java.lang.String r4 = r5.A0K(r8)     // Catch:{ 3yO -> 0x098a }
            r3 = 1
            if (r4 == 0) goto L_0x0987
            float r3 = X.AnonymousClass6Su.A01(r4)     // Catch:{ 3yO -> 0x098a }
        L_0x0987:
            r10.A03 = r3     // Catch:{ 3yO -> 0x098a }
            goto L_0x0995
        L_0x098a:
            r5 = move-exception
            java.lang.String r4 = "FlexboxBinderUtils"
            java.lang.String r3 = "Error parsing touch expansion property"
            X.1Kn.A02(r4, r3)
            r5.printStackTrace()
        L_0x0995:
            r9.add(r10)
        L_0x0998:
            int r11 = r11 + 1
            goto L_0x0901
        L_0x099c:
            if (r9 == 0) goto L_0x0f82
            if (r0 != 0) goto L_0x09a8
            int r0 = r2.A03
            long r2 = (long) r0
            X.6Sk r0 = new X.6Sk
            r0.<init>(r1, r2, r6)
        L_0x09a8:
            X.TyR r1 = new X.TyR
            r1.<init>(r9)
            X.3ar r3 = new X.3ar
            r3.<init>(r1, r9)
        L_0x09b2:
            r0.A0D(r3)
            return r0
        L_0x09b6:
            java.lang.Object r5 = X.C307476Qg.A06(r1, r2)
            X.Ty7 r5 = (X.Ty7) r5
            int r17 = X.C14506TxS.A00(r2)
            int r0 = r2.A03
            long r6 = (long) r0
            X.Tq9 r10 = r5.A01
            android.content.Context r0 = r1.A00
            r29 = r0
            r4 = 1
            r3 = 0
            java.lang.Integer r0 = X.C14508TxU.A02(r2)
            int r9 = r0.intValue()
            if (r9 == r3) goto L_0x0a65
            X.Vtd r8 = X.C18527Vtd.A00
            r0 = r29
            X.Vay r11 = r8.A00(r0, r2)
            if (r9 == r4) goto L_0x0a1c
            int r8 = r11.A01
            int r0 = r11.A02
            X.UTv r14 = new X.UTv
            r14.<init>(r8, r0)
        L_0x09e8:
            X.Tpt r0 = new X.Tpt
            r0.<init>(r14, r10, r6)
            java.lang.Integer r7 = X.C14508TxU.A02(r2)
            java.lang.Integer r19 = X.AnonymousClass05K.A01
            r6 = r19
            if (r7 != r6) goto L_0x0a04
            X.WJw r7 = new X.WJw
            r7.<init>()
            X.3ar r6 = new X.3ar
            r6.<init>(r7, r2)
            r0.A0D(r6)
        L_0x0a04:
            X.VLl r6 = r5.A03
            r0.A07 = r6
            r6 = 67
            r18 = 0
            boolean r6 = r2.A0R(r6, r3)
            if (r6 == 0) goto L_0x0c49
            r6 = 71
            java.lang.String r8 = r2.A0K(r6)
            r7 = 1082130432(0x40800000, float:4.0)
            goto L_0x0a9b
        L_0x0a1c:
            java.util.List r8 = r2.A0L()
            X.0qQ.A07(r8)
            r0 = 10
            int r0 = X.0Yv.A1E(r8, r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r0)
            java.util.Iterator r9 = r8.iterator()
        L_0x0a32:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0a56
            java.lang.Object r8 = r9.next()
            X.4tV r8 = (X.C276544tV) r8
            X.0qQ.A0A(r8)
            boolean r0 = X.C49734F3z.A01(r8)
            if (r0 == 0) goto L_0x0a51
            int r0 = r11.A02
        L_0x0a49:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.add(r0)
            goto L_0x0a32
        L_0x0a51:
            int r0 = X.C49734F3z.A00(r8)
            goto L_0x0a49
        L_0x0a56:
            X.JkC r9 = new X.JkC
            r9.<init>(r12)
            int r8 = r11.A01
            int r0 = r11.A02
            X.UTw r14 = new X.UTw
            r14.<init>(r9, r8, r0)
            goto L_0x09e8
        L_0x0a65:
            int r13 = X.C14535Txv.A00(r2)
            r0 = 73
            r12 = 0
            boolean r11 = r2.A0R(r0, r3)
            java.util.List r0 = r2.A0L()
            X.0qQ.A07(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0a7b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0a94
            java.lang.Object r8 = r9.next()
            r0 = r8
            X.4tV r0 = (X.C276544tV) r0
            X.0qQ.A0A(r0)
            boolean r0 = X.C14541Ty1.A01(r0)
            if (r0 == 0) goto L_0x0a7b
            if (r8 == 0) goto L_0x0a94
            r12 = 1
        L_0x0a94:
            X.Ty2 r14 = new X.Ty2
            r14.<init>(r13, r11, r12)
            goto L_0x09e8
        L_0x0a9b:
            android.content.res.Resources r6 = r29.getResources()     // Catch:{ 3yO -> 0x0bb0 }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ 3yO -> 0x0bb0 }
            float r6 = r6.density     // Catch:{ 3yO -> 0x0bb0 }
            float r6 = r6 * r7
            if (r8 == 0) goto L_0x0aac
            float r6 = X.AnonymousClass6Su.A01(r8)     // Catch:{ 3yO -> 0x0bb0 }
        L_0x0aac:
            int r6 = (int) r6
            r27 = r6
            r6 = 70
            X.4tV r6 = r2.A07(r6)
            if (r6 == 0) goto L_0x0ad9
            int r11 = X.AnonymousClass6TP.A00(r1, r6, r3)
        L_0x0abb:
            r6 = 78
            X.4tV r6 = r2.A07(r6)
            if (r6 == 0) goto L_0x0ad7
            int r10 = X.AnonymousClass6TP.A00(r1, r6, r3)
        L_0x0ac7:
            r6 = 68
            boolean r16 = r2.A0R(r6, r3)
            r6 = 72
            java.lang.String r7 = r2.A0K(r6)
            r6 = 0
            if (r7 == 0) goto L_0x0aea
            goto L_0x0add
        L_0x0ad7:
            r10 = 0
            goto L_0x0ac7
        L_0x0ad9:
            r11 = -7829368(0xffffffffff888888, float:NaN)
            goto L_0x0abb
        L_0x0add:
            float r6 = X.AnonymousClass6Su.A01(r7)     // Catch:{ 3yO -> 0x0ae2 }
            goto L_0x0aea
        L_0x0ae2:
            java.lang.String r1 = "Invalid pixel format for scroll indicator corner radius"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0aea:
            int r6 = (int) r6
            r26 = r6
            X.UAh r9 = r5.A06
            r12 = 87
            X.4tV r8 = r2.A07(r12)
            if (r8 == 0) goto L_0x0b4b
            r6 = 42
            float r6 = X.C16918VAv.A00(r8, r6)
            int r15 = (int) r6
            r6 = 40
            float r6 = X.C16918VAv.A00(r8, r6)
            int r14 = (int) r6
            r6 = 41
            float r6 = X.C16918VAv.A00(r8, r6)
            int r13 = (int) r6
            r6 = 35
            float r6 = X.C16918VAv.A00(r8, r6)
            int r7 = (int) r6
            r6 = 36
            float r6 = X.C16918VAv.A00(r8, r6)
            int r6 = (int) r6
            r20 = r6
            r6 = 38
            float r6 = X.C16918VAv.A00(r8, r6)
            int r6 = (int) r6
            if (r15 != 0) goto L_0x0b27
            r15 = r20
        L_0x0b27:
            if (r13 != 0) goto L_0x0b2a
            r13 = r6
        L_0x0b2a:
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r15, r14, r13, r7)
        L_0x0b2f:
            r6 = 81
            X.4tV r6 = r2.A07(r6)
            if (r6 != 0) goto L_0x0b3e
            X.4tV r6 = r2.A07(r12)
            r7 = 0
            if (r6 == 0) goto L_0x0b3f
        L_0x0b3e:
            r7 = 1
        L_0x0b3f:
            r6 = 90
            java.lang.String r12 = r2.A0K(r6)
            r6 = 0
            r22 = 0
            if (r12 == 0) goto L_0x0b70
            goto L_0x0b5f
        L_0x0b4b:
            r6 = 76
            java.lang.String r7 = r2.A0K(r6)     // Catch:{ 3yO -> 0x0ba8 }
            r6 = 0
            if (r7 == 0) goto L_0x0b58
            float r6 = X.AnonymousClass6Su.A01(r7)     // Catch:{ 3yO -> 0x0ba8 }
        L_0x0b58:
            int r6 = (int) r6
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r6, r6, r6, r6)
            goto L_0x0b2f
        L_0x0b5f:
            float r22 = X.AnonymousClass6Su.A01(r12)     // Catch:{ 3yO -> 0x0b64 }
            goto L_0x0b70
        L_0x0b64:
            java.lang.String r0 = "Error parsing scroll indicator's shadow Width: "
            java.lang.String r1 = X.002.A0R(r0, r12)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0b70:
            r12 = 89
            java.lang.String r12 = r2.A0K(r12)
            r23 = 0
            if (r12 == 0) goto L_0x0b8b
            float r23 = X.AnonymousClass6Su.A01(r12)     // Catch:{ 3yO -> 0x0b7f }
            goto L_0x0b8b
        L_0x0b7f:
            java.lang.String r0 = "Error parsing scroll indicator's shadow Height: "
            java.lang.String r1 = X.002.A0R(r0, r12)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0b8b:
            r12 = 93
            java.lang.String r12 = r2.A0K(r12)
            if (r12 == 0) goto L_0x0bb8
            float r25 = X.AnonymousClass6Su.A01(r12)     // Catch:{ 3yO -> 0x0b9c }
            int r12 = (r25 > r6 ? 1 : (r25 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x0bba
            goto L_0x0bb8
        L_0x0b9c:
            java.lang.String r0 = "Error parsing scroll indicator's shadow Radius: "
            java.lang.String r1 = X.002.A0R(r0, r12)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0ba8:
            java.lang.String r1 = "Invalid pixel format for scroll indicator margin"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0bb0:
            java.lang.String r1 = "Invalid pixel format for scroll indicator size"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0bb8:
            r25 = 1056964608(0x3f000000, float:0.5)
        L_0x0bba:
            r12 = 91
            float r24 = r2.A02(r12, r6)
            int r6 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0f9b
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0f9b
            r6 = 88
            X.4tV r6 = r2.A07(r6)
            if (r6 == 0) goto L_0x0cf2
            int r21 = X.AnonymousClass6TP.A00(r1, r6, r3)
        L_0x0bd6:
            X.VaB r6 = new X.VaB
            r20 = r6
            r20.<init>(r21, r22, r23, r24, r25)
            if (r9 == 0) goto L_0x0cd9
            int r12 = r9.A04
            if (r12 != r11) goto L_0x0cd9
            int r12 = r9.A03
            if (r12 != r10) goto L_0x0cd9
            int r13 = r9.A06
            r12 = r27
            if (r13 != r12) goto L_0x0cd9
            int r13 = r9.A05
            r12 = r26
            if (r13 != r12) goto L_0x0cd9
            boolean r13 = r9.A09
            r12 = r16
            if (r13 != r12) goto L_0x0cd9
            android.graphics.Rect r12 = r9.A07
            boolean r12 = r12.equals(r8)
            if (r12 == 0) goto L_0x0cd9
            boolean r12 = r9.A0A
            if (r12 != r7) goto L_0x0cd9
            X.VaB r14 = r9.A08
            float r13 = r14.A01
            float r12 = r6.A01
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x0cd9
            float r13 = r14.A00
            float r12 = r6.A00
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x0cd9
            float r13 = r14.A02
            float r12 = r6.A02
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x0cd9
            float r13 = r14.A03
            float r12 = r6.A03
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x0cd9
            int r13 = r14.A04
            int r12 = r6.A04
            if (r13 != r12) goto L_0x0cd9
        L_0x0c2d:
            r6 = 77
            boolean r7 = r2.A0R(r6, r3)
            X.UAz r6 = new X.UAz
            r6.<init>(r9, r7)
            r0.A0J(r6)
            java.util.List r6 = r0.A08
            if (r6 != 0) goto L_0x0c46
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.A08 = r6
        L_0x0c46:
            r6.add(r9)
        L_0x0c49:
            r6 = 50
            X.4uI r7 = r2.A0A(r6)
            if (r7 == 0) goto L_0x0c59
            X.Dme r6 = new X.Dme
            r6.<init>(r1, r2, r7)
            r0.A0J(r6)
        L_0x0c59:
            r6 = 61
            X.4uI r7 = r2.A0A(r6)
            if (r7 == 0) goto L_0x0c69
            X.Dmd r6 = new X.Dmd
            r6.<init>(r1, r2, r7)
            r0.A0J(r6)
        L_0x0c69:
            r6 = 49
            X.4uI r8 = r2.A0A(r6)
            if (r8 == 0) goto L_0x0c82
            android.view.ViewGroup$MarginLayoutParams r6 = X.Q2K.A01
            X.S1b r7 = new X.S1b
            r7.<init>(r1, r2, r8)
            X.Q2K r6 = new X.Q2K
            r6.<init>()
            r6.A00 = r7
            r0.A0J(r6)
        L_0x0c82:
            r6 = 54
            java.lang.String r7 = r2.A0K(r6)
            if (r7 != 0) goto L_0x0c99
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
        L_0x0c8c:
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            if (r10 == r6) goto L_0x0dc8
            r6 = 69
            java.lang.String r7 = r2.A0K(r6)
            if (r7 == 0) goto L_0x0d1d
            goto L_0x0cf6
        L_0x0c99:
            int r6 = r7.hashCode()     // Catch:{ 3yO -> 0x0f93 }
            switch(r6) {
                case -1364013995: goto L_0x0cac;
                case 100571: goto L_0x0cb5;
                case 3387192: goto L_0x0cc0;
                case 109757538: goto L_0x0ccb;
                default: goto L_0x0ca0;
            }     // Catch:{ 3yO -> 0x0f93 }
        L_0x0ca0:
            java.lang.String r0 = "can't parse unknown snap gravity: "
            java.lang.String r1 = X.002.A0R(r0, r7)     // Catch:{ 3yO -> 0x0f93 }
            X.3yO r0 = new X.3yO     // Catch:{ 3yO -> 0x0f93 }
            r0.<init>(r1)     // Catch:{ 3yO -> 0x0f93 }
            throw r0     // Catch:{ 3yO -> 0x0f93 }
        L_0x0cac:
            java.lang.String r6 = "center"
            boolean r6 = r7.equals(r6)     // Catch:{ 3yO -> 0x0f93 }
            if (r6 == 0) goto L_0x0ca0
            goto L_0x0cd6
        L_0x0cb5:
            java.lang.String r6 = "end"
            boolean r6 = r7.equals(r6)     // Catch:{ 3yO -> 0x0f93 }
            if (r6 == 0) goto L_0x0ca0
            java.lang.Integer r10 = X.AnonymousClass05K.A0C     // Catch:{ 3yO -> 0x0f93 }
            goto L_0x0c8c
        L_0x0cc0:
            java.lang.String r6 = "none"
            boolean r6 = r7.equals(r6)     // Catch:{ 3yO -> 0x0f93 }
            if (r6 == 0) goto L_0x0ca0
            java.lang.Integer r10 = X.AnonymousClass05K.A0N     // Catch:{ 3yO -> 0x0f93 }
            goto L_0x0c8c
        L_0x0ccb:
            java.lang.String r6 = "start"
            boolean r6 = r7.equals(r6)     // Catch:{ 3yO -> 0x0f93 }
            if (r6 == 0) goto L_0x0ca0
            java.lang.Integer r10 = X.AnonymousClass05K.A00     // Catch:{ 3yO -> 0x0f93 }
            goto L_0x0c8c
        L_0x0cd6:
            r10 = r19
            goto L_0x0c8c
        L_0x0cd9:
            X.UAh r9 = new X.UAh
            r20 = r9
            r21 = r8
            r22 = r6
            r23 = r11
            r24 = r10
            r25 = r27
            r27 = r16
            r28 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r5.A06 = r9
            goto L_0x0c2d
        L_0x0cf2:
            r21 = 0
            goto L_0x0bd6
        L_0x0cf6:
            java.lang.String r6 = "linear"
            boolean r6 = r7.equals(r6)     // Catch:{ 3yO -> 0x0d15 }
            if (r6 != 0) goto L_0x0d12
            java.lang.String r6 = "pager"
            boolean r6 = r7.equals(r6)     // Catch:{ 3yO -> 0x0d15 }
            if (r6 != 0) goto L_0x0d1d
            java.lang.String r0 = "can't parse unknown snap style: "
            java.lang.String r1 = X.002.A0R(r0, r7)     // Catch:{ 3yO -> 0x0d15 }
            X.3yO r0 = new X.3yO     // Catch:{ 3yO -> 0x0d15 }
            r0.<init>(r1)     // Catch:{ 3yO -> 0x0d15 }
            throw r0     // Catch:{ 3yO -> 0x0d15 }
        L_0x0d12:
            java.lang.Integer r19 = X.AnonymousClass05K.A00     // Catch:{ 3yO -> 0x0d15 }
            goto L_0x0d1d
        L_0x0d15:
            java.lang.String r1 = "Invalid snap style value"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0d1d:
            r6 = 45
            java.lang.String r7 = r2.A0K(r6)
            r6 = 0
            if (r7 == 0) goto L_0x0d33
            float r6 = X.AnonymousClass6Su.A01(r7)     // Catch:{ 3yO -> 0x0d2b }
            goto L_0x0d33
        L_0x0d2b:
            java.lang.String r1 = "Invalid pixel format for left offset on snap"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0d33:
            java.lang.Float r9 = java.lang.Float.valueOf(r6)
            X.2lf r8 = r5.A05
            int r12 = r19.intValue()
            java.lang.String r11 = "Invalid gravity type :"
            r7 = 2
            int r6 = r10.intValue()
            if (r12 == r3) goto L_0x0d81
            if (r6 == r3) goto L_0x0d5a
            if (r6 == r7) goto L_0x0d5a
            if (r6 == r4) goto L_0x0d5a
            java.lang.String r0 = X.C16922VAz.A00(r10)
            java.lang.String r1 = X.002.A0R(r11, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0d5a:
            boolean r6 = r8 instanceof X.AnonymousClass9VT
            if (r6 == 0) goto L_0x0d70
            r6 = r8
            X.9VT r6 = (X.AnonymousClass9VT) r6
            X.9VS r7 = r6.A00
            java.lang.Integer r6 = r7.A03
            if (r6 != r10) goto L_0x0d70
            java.lang.Float r6 = r7.A02
            boolean r6 = X.Q06.A00(r6, r9)
            if (r6 == 0) goto L_0x0d70
            goto L_0x0daa
        L_0x0d70:
            X.9VT r8 = new X.9VT
            r8.<init>()
            X.9VS r6 = new X.9VS
            r6.<init>()
            r6.A03 = r10
            r6.A02 = r9
            r8.A00 = r6
            goto L_0x0daa
        L_0x0d81:
            if (r6 == r3) goto L_0x0d95
            if (r6 == r7) goto L_0x0d95
            if (r6 == r4) goto L_0x0d95
            java.lang.String r0 = X.C16922VAz.A00(r10)
            java.lang.String r1 = X.002.A0R(r11, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0d95:
            boolean r6 = r8 instanceof X.AnonymousClass9YK
            if (r6 == 0) goto L_0x0ee7
            r6 = r8
            X.9YK r6 = (X.AnonymousClass9YK) r6
            X.9VS r7 = r6.A00
            java.lang.Integer r6 = r7.A03
            if (r6 != r10) goto L_0x0ee7
            java.lang.Float r6 = r7.A02
            boolean r6 = X.Q06.A00(r6, r9)
            if (r6 == 0) goto L_0x0ee7
        L_0x0daa:
            r0.A06 = r8
            r5.A05 = r8
            r5.A07 = r10
            r6 = 51
            X.4uI r7 = r2.A0A(r6)
            r6 = 97
            X.4uI r6 = r2.A0A(r6)
            if (r7 != 0) goto L_0x0dc0
            if (r6 == 0) goto L_0x0dc8
        L_0x0dc0:
            X.UB2 r6 = new X.UB2
            r6.<init>(r8, r1, r2)
            r0.A0J(r6)
        L_0x0dc8:
            java.lang.Integer r6 = X.C14508TxU.A02(r2)
            int r6 = r6.intValue()
            if (r6 == r3) goto L_0x0dee
            X.Vtd r7 = X.C18527Vtd.A00
            r6 = r29
            X.Vay r6 = r7.A00(r6, r2)
            android.graphics.Rect r7 = r6.A04
            int r6 = r7.left
            if (r6 != 0) goto L_0x0dec
            int r6 = r7.top
            if (r6 != 0) goto L_0x0dec
            int r6 = r7.right
            if (r6 != 0) goto L_0x0dec
            int r6 = r7.bottom
            if (r6 == 0) goto L_0x0dee
        L_0x0dec:
            r0.A04 = r7
        L_0x0dee:
            java.lang.Integer r6 = X.C14508TxU.A02(r2)
            int r6 = r6.intValue()
            if (r6 == r3) goto L_0x0e4b
            if (r6 == r4) goto L_0x0e45
            X.UAg r7 = new X.UAg
            r7.<init>(r1, r2)
        L_0x0dff:
            java.util.List r6 = r0.A08
            if (r6 != 0) goto L_0x0e0a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.A08 = r6
        L_0x0e0a:
            r6.add(r7)
        L_0x0e0d:
            r6 = 43
            boolean r6 = r2.A0R(r6, r3)
            if (r6 == 0) goto L_0x0e21
            X.3AQ r6 = r5.A04
            if (r6 == 0) goto L_0x0e3f
            X.3AQ r6 = r5.A04
        L_0x0e1b:
            r5.A04 = r6
            r6.A00 = r3
            r0.A05 = r6
        L_0x0e21:
            r6 = 35
            boolean r7 = r2.A0R(r6, r3)
            r6 = 2
            if (r7 == 0) goto L_0x0e2b
            r6 = 0
        L_0x0e2b:
            r0.A02 = r6
            r6 = 41
            X.4tV r6 = r2.A07(r6)
            if (r6 == 0) goto L_0x0e3b
            int r3 = X.AnonymousClass6TP.A00(r1, r6, r3)
            r0.A00 = r3
        L_0x0e3b:
            r3 = 75
            goto L_0x0ef9
        L_0x0e3f:
            X.3AQ r6 = new X.3AQ
            r6.<init>()
            goto L_0x0e1b
        L_0x0e45:
            X.UAb r7 = new X.UAb
            r7.<init>(r1, r2)
            goto L_0x0dff
        L_0x0e4b:
            r6 = 55
            java.lang.String r6 = r2.A0K(r6)     // Catch:{ 3yO -> 0x0f8b }
            r13 = 0
            r23 = 0
            if (r6 == 0) goto L_0x0e5a
            float r23 = X.AnonymousClass6Su.A01(r6)     // Catch:{ 3yO -> 0x0f8b }
        L_0x0e5a:
            r6 = 56
            java.lang.String r6 = r2.A0K(r6)     // Catch:{ 3yO -> 0x0f8b }
            r21 = 0
            if (r6 == 0) goto L_0x0e68
            float r21 = X.AnonymousClass6Su.A01(r6)     // Catch:{ 3yO -> 0x0f8b }
        L_0x0e68:
            r6 = 44
            java.lang.String r6 = r2.A0K(r6)     // Catch:{ 3yO -> 0x0f8b }
            r22 = 0
            if (r6 == 0) goto L_0x0e76
            float r22 = X.AnonymousClass6Su.A01(r6)     // Catch:{ 3yO -> 0x0f8b }
        L_0x0e76:
            r6 = 100
            java.lang.String r6 = r2.A0K(r6)     // Catch:{ 3yO -> 0x0f8b }
            X.6TA r9 = X.AnonymousClass6TA.STRETCH     // Catch:{ 3yO -> 0x0f8b }
            X.6TA r8 = X.C14508TxU.A00(r9, r6)     // Catch:{ 3yO -> 0x0f8b }
            r12 = 0
            if (r8 != r9) goto L_0x0ec6
            java.util.List r7 = r2.A0L()     // Catch:{ 3yO -> 0x0f8b }
            X.0qQ.A07(r7)     // Catch:{ 3yO -> 0x0f8b }
            boolean r6 = r7 instanceof java.util.Collection     // Catch:{ 3yO -> 0x0f8b }
            if (r6 == 0) goto L_0x0e97
            boolean r6 = r7.isEmpty()     // Catch:{ 3yO -> 0x0f8b }
            if (r6 == 0) goto L_0x0e97
            goto L_0x0ed6
        L_0x0e97:
            java.util.Iterator r11 = r7.iterator()     // Catch:{ 3yO -> 0x0f8b }
            r10 = 0
        L_0x0e9c:
            boolean r6 = r11.hasNext()     // Catch:{ 3yO -> 0x0f8b }
            if (r6 == 0) goto L_0x0ec4
            java.lang.Object r7 = r11.next()     // Catch:{ 3yO -> 0x0f8b }
            X.4tV r7 = (X.C276544tV) r7     // Catch:{ 3yO -> 0x0f8b }
            r6 = 132(0x84, float:1.85E-43)
            X.4tV r7 = r7.A07(r6)     // Catch:{ 3yO -> 0x0f8b }
            if (r7 == 0) goto L_0x0ec2
            r6 = 42
            java.lang.String r6 = r7.A0K(r6)     // Catch:{ 3yO -> 0x0f8b }
        L_0x0eb6:
            X.6TA r6 = X.C14508TxU.A00(r8, r6)     // Catch:{ 3yO -> 0x0f8b }
            if (r6 == r9) goto L_0x0e9c
            int r10 = r10 + 1
            if (r10 >= 0) goto L_0x0e9c
            goto L_0x0f83
        L_0x0ec2:
            r6 = r12
            goto L_0x0eb6
        L_0x0ec4:
            if (r10 == 0) goto L_0x0ed6
        L_0x0ec6:
            r7 = 1
        L_0x0ec7:
            int r6 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0ed8
            int r6 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0ed8
            int r6 = (r22 > r13 ? 1 : (r22 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0ed8
            if (r7 == 0) goto L_0x0e0d
            goto L_0x0ed8
        L_0x0ed6:
            r7 = 0
            goto L_0x0ec7
        L_0x0ed8:
            int r24 = X.C14535Txv.A00(r2)     // Catch:{ 3yO -> 0x0f8b }
            X.TqA r7 = new X.TqA     // Catch:{ 3yO -> 0x0f8b }
            r19 = r7
            r20 = r8
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ 3yO -> 0x0f8b }
            goto L_0x0dff
        L_0x0ee7:
            X.9YK r8 = new X.9YK
            r8.<init>()
            X.9VS r6 = new X.9VS
            r6.<init>()
            r6.A03 = r10
            r6.A02 = r9
            r8.A00 = r6
            goto L_0x0daa
        L_0x0ef9:
            java.lang.String r6 = r2.A0K(r3)     // Catch:{ 3yO -> 0x0f08 }
            r3 = 0
            if (r6 == 0) goto L_0x0f04
            float r3 = X.AnonymousClass6Su.A01(r6)     // Catch:{ 3yO -> 0x0f08 }
        L_0x0f04:
            int r3 = (int) r3     // Catch:{ 3yO -> 0x0f08 }
            r18 = r3
            goto L_0x0f10
        L_0x0f08:
            r7 = move-exception
            java.lang.String r6 = "CollectionBinderUtils"
            java.lang.String r3 = "Invalid dimension for fading edge length"
            X.1Kn.A00(r1, r6, r3, r7)
        L_0x0f10:
            r3 = r18
            r0.A01 = r3
            r6 = 66
            r3 = -1
            int r3 = r2.A03(r6, r3)
            r0.A03 = r3
            r3 = 95
            boolean r3 = r2.A0R(r3, r4)
            r0.A0B = r3
            r3 = 98
            boolean r3 = r2.A0R(r3, r4)
            r0.A0A = r3
            X.Ty5 r6 = r5.A02
            X.Txx r5 = new X.Txx
            r3 = r17
            r5.<init>(r1, r3)
            X.Tpv r4 = new X.Tpv
            r4.<init>(r5, r6)
            X.3ar r3 = new X.3ar
            r3.<init>(r4, r0)
            r0.A0D(r3)
            X.2nJ r3 = r1.A02
            X.2nt r3 = r3.AgE()
            X.2nr r3 = r3.AgI()
            boolean r3 = r3.AGT()
            if (r3 == 0) goto L_0x0f60
            X.WJv r4 = new X.WJv
            r4.<init>()
            X.3ar r3 = new X.3ar
            r3.<init>(r4, r0)
            r0.A0D(r3)
        L_0x0f60:
            r3 = 65
            java.lang.String r3 = r2.A0K(r3)
            if (r3 == 0) goto L_0x0f82
            java.lang.String r2 = "on_drag"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0f82
            X.UAn r2 = new X.UAn
            r2.<init>(r1)
            r0.A0J(r2)
            return r0
        L_0x0f79:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.NMU r0 = new X.NMU
            r0.<init>(r1, r2)
        L_0x0f82:
            return r0
        L_0x0f83:
            X.0sr.A1S()     // Catch:{ 3yO -> 0x0f8b }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ 3yO -> 0x0f8b }
            throw r0     // Catch:{ 3yO -> 0x0f8b }
        L_0x0f8b:
            java.lang.String r1 = "Invalid pixel format for Collection spacing"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0f93:
            java.lang.String r1 = "Invalid snap gravity value"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0f9b:
            java.lang.String r1 = "Error parsing scroll indicator's shadow opacity: it should be in range [0..1]"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0fa3:
            X.Ug8 r0 = new X.Ug8
            r0.<init>(r1, r2)
            return r0
        L_0x0fa9:
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.Ug4 r0 = new X.Ug4
            r0.<init>(r1, r2)
            return r0
        L_0x0fb3:
            X.UgZ r0 = new X.UgZ
            r0.<init>(r1, r2)
            return r0
        L_0x0fb9:
            X.UgJ r0 = new X.UgJ
            r0.<init>(r1, r2)
            return r0
        L_0x0fbf:
            X.UgU r0 = new X.UgU
            r0.<init>(r1, r2)
            return r0
        L_0x0fc5:
            X.H54 r0 = new X.H54
            r0.<init>(r1, r2)
            return r0
        L_0x0fcb:
            X.UgE r0 = new X.UgE
            r0.<init>(r1, r2)
            return r0
        L_0x0fd1:
            X.H53 r0 = new X.H53
            r0.<init>(r1, r2)
            return r0
        L_0x0fd7:
            X.EDx r0 = new X.EDx
            r0.<init>(r1, r2)
            return r0
        L_0x0fdd:
            X.UgO r0 = new X.UgO
            r0.<init>(r1, r2)
            return r0
        L_0x0fe3:
            X.UgT r0 = new X.UgT
            r0.<init>(r1, r2)
            return r0
        L_0x0fe9:
            X.UgD r0 = new X.UgD
            r0.<init>(r1, r2)
            return r0
        L_0x0fef:
            X.UgK r0 = new X.UgK
            r0.<init>(r1, r2)
            return r0
        L_0x0ff5:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.NMR r0 = new X.NMR
            r0.<init>(r1, r2)
            return r0
        L_0x0fff:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.NMQ r0 = new X.NMQ
            r0.<init>(r1, r2)
            return r0
        L_0x1009:
            X.0qQ.A0A(r1)
            X.Tzu r0 = new X.Tzu
            r0.<init>(r1, r2)
            return r0
        L_0x1012:
            X.H55 r0 = new X.H55
            r0.<init>(r1, r2)
            return r0
        L_0x1018:
            X.TzY r0 = new X.TzY
            r0.<init>(r1, r2)
            return r0
        L_0x101e:
            X.UgR r0 = new X.UgR
            r0.<init>(r1, r2)
            return r0
        L_0x1024:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.UgP r0 = new X.UgP
            r0.<init>(r1, r2)
            return r0
        L_0x102e:
            X.0qQ.A0A(r1)
            X.EDu r0 = new X.EDu
            r0.<init>(r1, r2)
            return r0
        L_0x1037:
            X.UgL r0 = new X.UgL
            r0.<init>(r1, r2)
            return r0
        L_0x103d:
            X.0qQ.A0A(r1)
            X.H52 r0 = new X.H52
            r0.<init>(r1, r2)
            return r0
        L_0x1046:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Attempting to createRenderUnit for unrecognized component style id %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "ComponentMapper"
            X.1Kn.A02(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276774ts.A03(X.6Rm, X.4tV):X.2Th");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.WPp] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.EbJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object, X.O5N] */
    /* JADX WARNING: type inference failed for: r2v16, types: [java.lang.Object, X.VL1] */
    /* JADX WARNING: type inference failed for: r2v17, types: [java.lang.Object, X.O5O] */
    /* JADX WARNING: type inference failed for: r2v26, types: [X.Rtc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v44, types: [X.6OX, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v49, types: [X.EbJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, X.VLl] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0213: MOVE  (r1v5 com.instagram.common.session.UserSession) = (r1v3 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final java.lang.Object A04(X.C307786Rm r6, X.C276544tV r7) {
        /*
            r5 = this;
            int r1 = r7.A04
            boolean r0 = r5.A05(r7)
            if (r0 == 0) goto L_0x001c
            r0 = 13326(0x340e, float:1.8674E-41)
            if (r1 == r0) goto L_0x02b9
            r0 = 13336(0x3418, float:1.8688E-41)
            if (r1 == r0) goto L_0x00b1
            r0 = 16927(0x421f, float:2.372E-41)
            if (r1 != r0) goto L_0x009d
            android.content.Context r0 = r6.A00
            X.WKW r2 = new X.WKW
            r2.<init>(r0)
        L_0x001b:
            return r2
        L_0x001c:
            boolean r0 = X.C250563lf.A0k(r1)
            if (r0 == 0) goto L_0x02b9
            r0 = 13326(0x340e, float:1.8674E-41)
            if (r1 == r0) goto L_0x02b9
            r0 = 13327(0x340f, float:1.8675E-41)
            if (r1 == r0) goto L_0x02aa
            r0 = 13616(0x3530, float:1.908E-41)
            if (r1 == r0) goto L_0x029b
            r0 = 13617(0x3531, float:1.9081E-41)
            if (r1 == r0) goto L_0x02b9
            r0 = 13635(0x3543, float:1.9107E-41)
            if (r1 == r0) goto L_0x02b9
            r0 = 13636(0x3544, float:1.9108E-41)
            if (r1 == r0) goto L_0x02b9
            r0 = 15727(0x3d6f, float:2.2038E-41)
            if (r1 == r0) goto L_0x02b9
            r0 = 15728(0x3d70, float:2.204E-41)
            if (r1 == r0) goto L_0x02b9
            r0 = 16877(0x41ed, float:2.365E-41)
            if (r1 == r0) goto L_0x02b9
            r0 = 16878(0x41ee, float:2.3651E-41)
            if (r1 == r0) goto L_0x0292
            switch(r1) {
                case 13317: goto L_0x00db;
                case 13320: goto L_0x02b9;
                case 13323: goto L_0x0276;
                case 13329: goto L_0x02b9;
                case 13399: goto L_0x0237;
                case 13408: goto L_0x02b9;
                case 13533: goto L_0x02b9;
                case 13546: goto L_0x02b9;
                case 13648: goto L_0x02b9;
                case 13666: goto L_0x02b9;
                case 13697: goto L_0x00f6;
                case 13708: goto L_0x0105;
                case 13745: goto L_0x022a;
                case 13775: goto L_0x02b9;
                case 13780: goto L_0x02b9;
                case 13797: goto L_0x010b;
                case 13894: goto L_0x023d;
                case 13907: goto L_0x02b9;
                case 13922: goto L_0x02b9;
                case 13944: goto L_0x02b9;
                case 13955: goto L_0x02b9;
                case 13982: goto L_0x02b9;
                case 14041: goto L_0x02b9;
                case 14045: goto L_0x02b9;
                case 14054: goto L_0x0123;
                case 14093: goto L_0x02b9;
                case 15753: goto L_0x02b9;
                case 15768: goto L_0x0240;
                case 15770: goto L_0x0132;
                case 15778: goto L_0x02b9;
                case 15856: goto L_0x02b9;
                case 15892: goto L_0x0145;
                case 15894: goto L_0x02b9;
                case 15969: goto L_0x02b9;
                case 15981: goto L_0x02b9;
                case 16053: goto L_0x02b9;
                case 16068: goto L_0x006d;
                case 16079: goto L_0x02b9;
                case 16095: goto L_0x02b9;
                case 16111: goto L_0x0172;
                case 16122: goto L_0x017a;
                case 16160: goto L_0x01b0;
                case 16166: goto L_0x02b9;
                case 16218: goto L_0x02b9;
                case 16260: goto L_0x02b9;
                case 16278: goto L_0x01c1;
                case 16355: goto L_0x02b9;
                case 16383: goto L_0x02b9;
                case 16390: goto L_0x02b9;
                case 16411: goto L_0x02b9;
                case 16444: goto L_0x01c9;
                case 16451: goto L_0x0246;
                case 16467: goto L_0x024c;
                case 16584: goto L_0x0252;
                case 16586: goto L_0x01cf;
                case 16641: goto L_0x027c;
                case 16675: goto L_0x02b9;
                case 16682: goto L_0x0258;
                case 16688: goto L_0x01dd;
                case 16801: goto L_0x020b;
                case 16910: goto L_0x025e;
                case 16919: goto L_0x02b9;
                case 16927: goto L_0x02b9;
                case 16995: goto L_0x02b9;
                case 17025: goto L_0x0264;
                case 17088: goto L_0x02b9;
                case 17096: goto L_0x02b9;
                case 17106: goto L_0x02b9;
                case 17134: goto L_0x026d;
                default: goto L_0x004d;
            }
        L_0x004d:
            switch(r1) {
                case 13334: goto L_0x02b9;
                case 13335: goto L_0x02b9;
                case 13336: goto L_0x02b9;
                default: goto L_0x0050;
            }
        L_0x0050:
            switch(r1) {
                case 13375: goto L_0x00cf;
                case 13376: goto L_0x00c9;
                case 13377: goto L_0x00d5;
                case 13378: goto L_0x02b9;
                case 13379: goto L_0x02b9;
                case 13380: goto L_0x02b9;
                default: goto L_0x0053;
            }
        L_0x0053:
            switch(r1) {
                case 13387: goto L_0x00b7;
                case 13388: goto L_0x00bd;
                case 13389: goto L_0x02b9;
                case 13390: goto L_0x02b9;
                case 13391: goto L_0x02b9;
                case 13392: goto L_0x02b9;
                case 13393: goto L_0x00c3;
                default: goto L_0x0056;
            }
        L_0x0056:
            switch(r1) {
                case 16534: goto L_0x02b9;
                case 16535: goto L_0x02b9;
                case 16536: goto L_0x02b9;
                default: goto L_0x0059;
            }
        L_0x0059:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x006d:
            androidx.fragment.app.Fragment r4 = X.C308206Td.A00(r6)
            boolean r0 = r4 instanceof X.AnonymousClass3M3
            r2 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "PDPMediaGridStickyCtaRenderUnit"
            com.instagram.common.session.UserSession r3 = X.C18182Vmw.A00(r6, r0)
            if (r3 == 0) goto L_0x001b
            r0 = r4
            X.3M3 r0 = (X.AnonymousClass3M3) r0
            X.DiQ r0 = r0.A05
            java.util.Map r0 = r0.A0G
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.copyOf(r0)
            java.lang.String r0 = "MediaGridArguments"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments
            if (r0 == 0) goto L_0x001b
            android.content.Context r0 = r6.A00
            com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments r1 = (com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments) r1
            X.WQm r2 = new X.WQm
            r2.<init>(r0, r4, r3, r1)
            return r2
        L_0x009d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00b1:
            X.GbJ r2 = new X.GbJ
            r2.<init>()
            return r2
        L_0x00b7:
            X.WPq r2 = new X.WPq
            r2.<init>()
            return r2
        L_0x00bd:
            X.VMD r2 = new X.VMD
            r2.<init>()
            return r2
        L_0x00c3:
            X.Uu1 r2 = new X.Uu1
            r2.<init>()
            return r2
        L_0x00c9:
            X.VaJ r2 = new X.VaJ
            r2.<init>(r6, r7)
            return r2
        L_0x00cf:
            X.EtH r2 = new X.EtH
            r2.<init>()
            return r2
        L_0x00d5:
            X.VMA r2 = new X.VMA
            r2.<init>()
            return r2
        L_0x00db:
            android.view.ViewGroup$MarginLayoutParams r0 = X.Ty7.A09
            X.Ty5 r4 = new X.Ty5
            r4.<init>()
            X.VLl r3 = new X.VLl
            r3.<init>()
            int r1 = X.C14506TxS.A00(r7)
            X.Tq9 r0 = new X.Tq9
            r0.<init>(r6, r7, r1)
            X.Ty7 r2 = new X.Ty7
            r2.<init>(r0, r4, r3)
            return r2
        L_0x00f6:
            java.lang.String r1 = r7.A0I()
            X.EbJ r2 = new X.EbJ
            r2.<init>()
            r0 = -1
            r2.A01 = r0
            r2.A02 = r1
            return r2
        L_0x0105:
            X.Hqk r2 = new X.Hqk
            r2.<init>(r6)
            return r2
        L_0x010b:
            java.util.concurrent.atomic.AtomicInteger r2 = X.C276604tb.A00
            int r0 = r2.incrementAndGet()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.incrementAndGet()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r1, r0)
            return r2
        L_0x0123:
            X.0iw r1 = X.C308206Td.A07(r6)
            X.Fbz r0 = new X.Fbz
            r0.<init>(r1, r7)
            X.IUt r2 = new X.IUt
            r2.<init>(r6, r7, r0)
            return r2
        L_0x0132:
            r3 = 0
            r1 = 0
            r0 = 0
            X.6OX r2 = new X.6OX
            r2.<init>()
            r2.A02 = r1
            r2.A01 = r1
            r2.A00 = r1
            r2.A04 = r3
            r2.A03 = r0
            return r2
        L_0x0145:
            X.0lg r2 = X.C308206Td.A0A(r6)
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r1 = r7.A0D()
            if (r1 == 0) goto L_0x016a
            X.0c5 r0 = X.0c9.A04     // Catch:{ IOException -> 0x0161 }
            X.0c9 r0 = r0.A01(r2, r1)     // Catch:{ IOException -> 0x0161 }
            X.Cu1 r0 = X.C44807ClJ.parseFromJson(r0)     // Catch:{ IOException -> 0x0161 }
            X.VMB r2 = new X.VMB
            r2.<init>(r0)
            return r2
        L_0x0161:
            r2 = move-exception
            java.lang.String r1 = "Failed to parse guide"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x016a:
            java.lang.String r1 = "No serialized guide"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0172:
            android.content.Context r0 = r6.A00
            X.Hhb r2 = new X.Hhb
            r2.<init>(r0)
            return r2
        L_0x017a:
            X.0lg r2 = X.C308206Td.A0A(r6)
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r1 = r7.A0D()
            if (r1 == 0) goto L_0x01a8
            X.0c5 r0 = X.0c9.A04     // Catch:{ IOException -> 0x019f }
            X.0c9 r0 = r0.A01(r2, r1)     // Catch:{ IOException -> 0x019f }
            X.4sb r1 = X.C275964sG.parseFromJson(r0)     // Catch:{ IOException -> 0x019f }
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ IOException -> 0x019f }
            X.3Y6 r0 = new X.3Y6     // Catch:{ IOException -> 0x019f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x019f }
            X.Hhr r2 = new X.Hhr
            r2.<init>(r0)
            return r2
        L_0x019f:
            r2 = move-exception
            java.lang.String r1 = "Failed to parse clips"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x01a8:
            java.lang.String r1 = "No serialized clips"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x01b0:
            r1 = 49
            r0 = 0
            float r0 = r7.A02(r1, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.Vcx r2 = new X.Vcx
            r2.<init>(r0)
            return r2
        L_0x01c1:
            android.content.Context r0 = r6.A00
            X.VtL r2 = new X.VtL
            r2.<init>(r0)
            return r2
        L_0x01c9:
            X.Hzt r2 = new X.Hzt
            r2.<init>(r6, r7)
            return r2
        L_0x01cf:
            r2 = 5
            r1 = 10
            X.I13 r0 = new X.I13
            r0.<init>(r2, r1)
            X.Hk4 r2 = new X.Hk4
            r2.<init>(r0)
            return r2
        L_0x01dd:
            X.RR5 r4 = X.C10071Rm8.A00
            X.0lg r0 = X.C308206Td.A0A(r6)
            com.instagram.common.session.UserSession r3 = X.0Gl.A01(r0)
            if (r3 != 0) goto L_0x01f6
            java.lang.String r1 = "InstagramShopifyCheckoutBinderUtils"
            java.lang.String r0 = "Attempt to initialize IGCheckoutShopifySDKLogger without a userSession."
            X.1Kn.A02(r1, r0)
        L_0x01f0:
            X.Rnf r2 = new X.Rnf
            r2.<init>(r4)
            return r2
        L_0x01f6:
            if (r4 == 0) goto L_0x01f0
            java.lang.String r2 = r4.A01()
            if (r2 == 0) goto L_0x01f0
            android.content.Context r0 = r6.A00
            X.QKY r1 = new X.QKY
            r1.<init>(r0, r3, r2)
            r0 = r4
            X.QQ0 r0 = (X.QQ0) r0
            r0.A01 = r1
            goto L_0x01f0
        L_0x020b:
            X.0lg r1 = X.C308206Td.A0A(r6)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0222
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            if (r1 == 0) goto L_0x0222
            X.LZd r0 = new X.LZd
            r0.<init>(r1)
            com.facebook.fbavatar.cdsavatareditor.richavatarretextureview.impl.AvatarRetextureSparkPreviewController r2 = new com.facebook.fbavatar.cdsavatareditor.richavatarretextureview.impl.AvatarRetextureSparkPreviewController
            r2.<init>(r0)
            return r2
        L_0x0222:
            java.lang.String r1 = "unable to retrieve userSession"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x022a:
            X.Rtc r2 = new X.Rtc
            r2.<init>()
            X.QAF r0 = new X.QAF
            r0.<init>()
            r2.A00 = r0
            return r2
        L_0x0237:
            X.VMC r2 = new X.VMC
            r2.<init>()
            return r2
        L_0x023d:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0240:
            X.6Jw r2 = new X.6Jw
            r2.<init>(r6, r7)
            return r2
        L_0x0246:
            X.VQH r2 = new X.VQH
            r2.<init>()
            return r2
        L_0x024c:
            X.Rng r2 = new X.Rng
            r2.<init>()
            return r2
        L_0x0252:
            X.Vrd r2 = new X.Vrd
            r2.<init>()
            return r2
        L_0x0258:
            X.VUN r2 = new X.VUN
            r2.<init>()
            return r2
        L_0x025e:
            X.Hk3 r2 = new X.Hk3
            r2.<init>()
            return r2
        L_0x0264:
            r0 = 0
            X.O5O r2 = new X.O5O
            r2.<init>()
            r2.A00 = r0
            return r2
        L_0x026d:
            r0 = -1
            X.VL1 r2 = new X.VL1
            r2.<init>()
            r2.A00 = r0
            return r2
        L_0x0276:
            X.6Oc r2 = new X.6Oc
            r2.<init>()
            return r2
        L_0x027c:
            X.0Tu r2 = X.0Tu.A05
            X.0qQ.A08(r2)
            r0 = 36321597824443991(0x810a4d00002657, double:3.0332629472889935E-306)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 != 0) goto L_0x02b9
            X.S2d r2 = new X.S2d
            r2.<init>(r6)
            return r2
        L_0x0292:
            r0 = 0
            X.O5N r2 = new X.O5N
            r2.<init>()
            r2.A00 = r0
            return r2
        L_0x029b:
            java.lang.String r1 = r7.A0F()
            X.EbJ r2 = new X.EbJ
            r2.<init>()
            r0 = -1
            r2.A01 = r0
            r2.A02 = r1
            return r2
        L_0x02aa:
            r1 = 38
            r0 = 0
            boolean r0 = r7.A0R(r1, r0)
            X.WPp r2 = new X.WPp
            r2.<init>()
            r2.A01 = r0
            return r2
        L_0x02b9:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276774ts.A04(X.6Rm, X.4tV):java.lang.Object");
    }

    public final boolean A05(C276544tV r3) {
        int i = r3.A04;
        if (!C250563lf.A0m(i)) {
            return false;
        }
        if (i == 13326 || i == 13336 || i == 16927) {
            return true;
        }
        throw new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{Integer.valueOf(i)}));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v71, resolved type: X.XTp[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v53, resolved type: X.XTp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v54, resolved type: X.XTp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: X.XTp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v55, resolved type: X.XTp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v57, resolved type: X.XTp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v23, resolved type: X.XTp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v304, resolved type: X.XTp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v309, resolved type: X.XTp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v2, resolved type: X.HpO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v85, resolved type: X.HpO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v138, resolved type: X.6Sh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v142, resolved type: X.6Sh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v14, resolved type: X.VjJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v144, resolved type: X.6Sh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v147, resolved type: X.JfD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v149, resolved type: com.instagram.igds.components.textcell.IgdsListCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v150, resolved type: com.instagram.igds.components.textcell.IgdsListCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v151, resolved type: com.instagram.igds.components.button.IgdsButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v152, resolved type: X.6Sh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v153, resolved type: X.6Sh} */
    /* JADX WARNING: type inference failed for: r3v341, types: [X.XTp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v127, types: [X.6OZ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v102, types: [X.Vj5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v403, types: [X.3qL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v404, types: [X.3qL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v65, types: [java.lang.Object, X.V49] */
    /* JADX WARNING: type inference failed for: r7v41, types: [java.lang.Object, X.V3v] */
    /* JADX WARNING: type inference failed for: r10v141, types: [X.VjJ] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x2c36: MOVE  (r2v55 int) = (r22v5 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1670:0x2baf  */
    /* JADX WARNING: Removed duplicated region for block: B:1723:0x2caa  */
    /* JADX WARNING: Removed duplicated region for block: B:1729:0x2ccc  */
    /* JADX WARNING: Removed duplicated region for block: B:1739:0x2d08  */
    /* JADX WARNING: Removed duplicated region for block: B:1741:0x2d28  */
    /* JADX WARNING: Removed duplicated region for block: B:1840:0x2e9f  */
    /* JADX WARNING: Removed duplicated region for block: B:1846:0x2eaa  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0734  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x078c  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x07b6  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x07d1  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0801  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0842  */
    /* JADX WARNING: Removed duplicated region for block: B:740:0x1492  */
    /* JADX WARNING: Removed duplicated region for block: B:743:0x149b  */
    /* JADX WARNING: Removed duplicated region for block: B:779:0x1563  */
    /* JADX WARNING: Removed duplicated region for block: B:786:0x158b  */
    /* JADX WARNING: Removed duplicated region for block: B:789:0x1594  */
    /* JADX WARNING: Removed duplicated region for block: B:792:0x159f  */
    /* JADX WARNING: Removed duplicated region for block: B:795:0x15ab  */
    /* JADX WARNING: Removed duplicated region for block: B:798:0x15bb  */
    /* JADX WARNING: Removed duplicated region for block: B:806:0x15f1  */
    /* JADX WARNING: Removed duplicated region for block: B:809:0x1612  */
    /* JADX WARNING: Removed duplicated region for block: B:814:0x1635  */
    /* JADX WARNING: Removed duplicated region for block: B:817:0x1660  */
    /* JADX WARNING: Removed duplicated region for block: B:820:0x1692  */
    /* JADX WARNING: Removed duplicated region for block: B:823:0x1697  */
    /* JADX WARNING: Removed duplicated region for block: B:826:0x169d  */
    /* JADX WARNING: Removed duplicated region for block: B:829:0x16a5  */
    /* JADX WARNING: Removed duplicated region for block: B:832:0x16cd  */
    /* JADX WARNING: Removed duplicated region for block: B:850:0x1710 A[LOOP:21: B:849:0x170e->B:850:0x1710, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:851:0x1719  */
    /* JADX WARNING: Removed duplicated region for block: B:852:0x171c  */
    /* JADX WARNING: Removed duplicated region for block: B:853:0x1722  */
    /* JADX WARNING: Removed duplicated region for block: B:854:0x1725  */
    /* JADX WARNING: Removed duplicated region for block: B:855:0x1729  */
    /* JADX WARNING: Removed duplicated region for block: B:873:0x178e  */
    /* JADX WARNING: Removed duplicated region for block: B:887:0x1852  */
    public final X.AnonymousClass2Ta A02(X.C244943c0 r52, X.2Th r53, X.C276544tV r54, int r55, int r56) {
        /*
            r51 = this;
            r0 = r54
            r9 = r56
            r8 = r55
            r5 = r53
            int r3 = r0.A04
            boolean r1 = X.C250563lf.A0k(r3)
            if (r1 == 0) goto L_0x32c7
            r1 = 13326(0x340e, float:1.8674E-41)
            r2 = r52
            if (r3 == r1) goto L_0x32a0
            r1 = 13327(0x340f, float:1.8675E-41)
            if (r3 == r1) goto L_0x3246
            r1 = 13616(0x3530, float:1.908E-41)
            if (r3 == r1) goto L_0x321f
            r1 = 13617(0x3531, float:1.9081E-41)
            if (r3 == r1) goto L_0x31da
            r1 = 13635(0x3543, float:1.9107E-41)
            if (r3 == r1) goto L_0x3160
            r1 = 13636(0x3544, float:1.9108E-41)
            if (r3 == r1) goto L_0x314e
            r1 = 15727(0x3d6f, float:2.2038E-41)
            if (r3 == r1) goto L_0x313f
            r1 = 15728(0x3d70, float:2.204E-41)
            if (r3 == r1) goto L_0x3114
            r1 = 16877(0x41ed, float:2.365E-41)
            if (r3 == r1) goto L_0x3100
            r1 = 16878(0x41ee, float:2.3651E-41)
            if (r3 == r1) goto L_0x3100
            switch(r3) {
                case 13317: goto L_0x24f5;
                case 13320: goto L_0x086e;
                case 13323: goto L_0x0a4b;
                case 13329: goto L_0x0b15;
                case 13399: goto L_0x0d42;
                case 13408: goto L_0x0e64;
                case 13533: goto L_0x0e82;
                case 13546: goto L_0x10c6;
                case 13648: goto L_0x10d6;
                case 13666: goto L_0x10e0;
                case 13697: goto L_0x10f2;
                case 13708: goto L_0x10fc;
                case 13745: goto L_0x313f;
                case 13775: goto L_0x313f;
                case 13780: goto L_0x1167;
                case 13797: goto L_0x118f;
                case 13894: goto L_0x128a;
                case 13907: goto L_0x313f;
                case 13922: goto L_0x0aff;
                case 13944: goto L_0x12ac;
                case 13955: goto L_0x133d;
                case 13982: goto L_0x134d;
                case 14041: goto L_0x1395;
                case 14045: goto L_0x1395;
                case 14054: goto L_0x0848;
                case 14093: goto L_0x13d2;
                case 15753: goto L_0x1433;
                case 15768: goto L_0x1452;
                case 15770: goto L_0x149e;
                case 15778: goto L_0x0b03;
                case 15856: goto L_0x1eb6;
                case 15892: goto L_0x1ede;
                case 15894: goto L_0x1ef9;
                case 15969: goto L_0x0848;
                case 15981: goto L_0x1f20;
                case 16053: goto L_0x1f2d;
                case 16068: goto L_0x1f45;
                case 16079: goto L_0x0693;
                case 16095: goto L_0x1f7c;
                case 16111: goto L_0x1f9e;
                case 16122: goto L_0x0848;
                case 16160: goto L_0x1fc9;
                case 16166: goto L_0x30f2;
                case 16218: goto L_0x1ff4;
                case 16260: goto L_0x2027;
                case 16278: goto L_0x2060;
                case 16355: goto L_0x2143;
                case 16383: goto L_0x2167;
                case 16390: goto L_0x2212;
                case 16411: goto L_0x2238;
                case 16444: goto L_0x2296;
                case 16451: goto L_0x22b0;
                case 16467: goto L_0x22bf;
                case 16584: goto L_0x0a65;
                case 16586: goto L_0x22db;
                case 16641: goto L_0x2301;
                case 16675: goto L_0x230d;
                case 16682: goto L_0x2363;
                case 16688: goto L_0x239a;
                case 16801: goto L_0x23ad;
                case 16910: goto L_0x23d6;
                case 16919: goto L_0x2406;
                case 16927: goto L_0x30f8;
                case 16995: goto L_0x2429;
                case 17025: goto L_0x22b0;
                case 17088: goto L_0x2443;
                case 17096: goto L_0x24d8;
                case 17106: goto L_0x24e5;
                case 17134: goto L_0x06cf;
                default: goto L_0x003d;
            }
        L_0x003d:
            switch(r3) {
                case 13334: goto L_0x04a5;
                case 13335: goto L_0x04cd;
                case 13336: goto L_0x30f8;
                default: goto L_0x0040;
            }
        L_0x0040:
            switch(r3) {
                case 13375: goto L_0x02c4;
                case 13376: goto L_0x02d5;
                case 13377: goto L_0x02b4;
                case 13378: goto L_0x035a;
                case 13379: goto L_0x0252;
                case 13380: goto L_0x0484;
                default: goto L_0x0043;
            }
        L_0x0043:
            switch(r3) {
                case 13387: goto L_0x0076;
                case 13388: goto L_0x019d;
                case 13389: goto L_0x1e2e;
                case 13390: goto L_0x01b3;
                case 13391: goto L_0x01ed;
                case 13392: goto L_0x0247;
                case 13393: goto L_0x0848;
                default: goto L_0x0046;
            }
        L_0x0046:
            switch(r3) {
                case 16534: goto L_0x02b4;
                case 16535: goto L_0x005d;
                case 16536: goto L_0x005d;
                default: goto L_0x0049;
            }
        L_0x0049:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x005d:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            android.content.Context r2 = r2.A04
            r1 = 24
            float r0 = X.0nA.A04(r2, r1)
            int r3 = (int) r0
            float r0 = X.0nA.A04(r2, r1)
            int r2 = (int) r0
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x0076:
            X.4tk r22 = X.C276674ti.A00()
            int r17 = android.view.View.MeasureSpec.getMode(r8)
            int r15 = android.view.View.MeasureSpec.getMode(r9)
            java.util.List r16 = r0.A0L()
            int r1 = r16.size()
            android.util.LongSparseArray r7 = new android.util.LongSparseArray
            r7.<init>(r1)
            X.0eM r4 = r2.A06
            java.lang.Object r3 = r4.getValue()
            X.3bz r3 = (X.C244933bz) r3
            int r0 = r0.A03
            r32 = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r32)
            r3.A01(r1, r7)
            java.lang.Object r0 = r4.getValue()
            X.3bz r0 = (X.C244933bz) r0
            java.lang.Object r6 = r0.A00(r1)
            android.util.LongSparseArray r6 = (android.util.LongSparseArray) r6
            int r0 = r16.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r3 = 0
        L_0x00b8:
            int r0 = r16.size()
            r13 = 1
            r10 = 0
            if (r3 >= r0) goto L_0x0165
            r0 = r16
            java.lang.Object r11 = r0.get(r3)
            X.4tV r11 = (X.C276544tV) r11
            if (r6 != 0) goto L_0x015a
            r12 = r10
        L_0x00cb:
            if (r55 != 0) goto L_0x0150
            int r1 = X.AnonymousClass3XX.A00
        L_0x00cf:
            int r0 = X.AnonymousClass3XX.A00
            if (r22 != 0) goto L_0x011f
            if (r12 == 0) goto L_0x00db
            X.6SI r10 = r12.A00
            X.6Sh r10 = r10.A01()
        L_0x00db:
            android.content.Context r12 = r2.A04
            r19 = r12
            r12 = 0
            X.6SH r14 = new X.6SH
            r14.<init>(r11, r12, r12)
            java.lang.Object r12 = r2.A05
            r13 = r12
            X.6Rm r13 = (X.C307786Rm) r13
            X.3dB[] r28 = X.C307806Ro.A00(r13)
            int r13 = r2.A03
            r18 = r13
            long r0 = X.C244873bt.A00(r1, r0)
            X.Ty9 r13 = new X.Ty9
            r29 = r18
            r30 = r0
            r23 = r13
            r24 = r19
            r25 = r10
            r26 = r14
            r27 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            X.6SI r12 = new X.6SI
            r12.<init>(r10, r13, r0)
        L_0x010e:
            X.Txy r10 = new X.Txy
            r10.<init>(r12, r11)
            r4.add(r10)
            int r0 = r11.A03
            long r0 = (long) r0
            r7.put(r0, r10)
            int r3 = r3 + 1
            goto L_0x00b8
        L_0x011f:
            if (r12 != 0) goto L_0x0143
            r13 = r10
        L_0x0122:
            int r12 = r2.A03
            X.Wqd r14 = new X.Wqd
            r18 = r14
            r19 = r2
            r20 = r13
            r21 = r11
            r23 = r10
            r24 = r12
            r25 = r1
            r26 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            long r0 = X.C244873bt.A00(r1, r0)
            X.6SI r12 = new X.6SI
            r12.<init>(r13, r14, r0)
            goto L_0x010e
        L_0x0143:
            X.6SI r12 = r12.A00
            X.6Sh r13 = r12.A01()
            if (r13 == 0) goto L_0x0122
            java.lang.Object r10 = r13.A02
            X.VjJ r10 = (X.C17981VjJ) r10
            goto L_0x0122
        L_0x0150:
            int r0 = X.AnonymousClass3XX.A00
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            goto L_0x00cf
        L_0x015a:
            int r0 = r11.A03
            long r0 = (long) r0
            java.lang.Object r12 = r6.get(r0)
            X.Txy r12 = (X.C14538Txy) r12
            goto L_0x00cb
        L_0x0165:
            r6 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r17
            if (r0 == r1) goto L_0x0170
            if (r0 != r2) goto L_0x0194
        L_0x0170:
            if (r15 == r1) goto L_0x0174
            if (r15 != r2) goto L_0x0194
        L_0x0174:
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r0 = android.view.View.MeasureSpec.getSize(r9)
            int[] r0 = new int[]{r1, r0}
        L_0x0180:
            r3 = r0[r6]
            r2 = r0[r13]
            X.Txz r1 = new X.Txz
            r1.<init>(r4, r3, r2)
            r0 = r32
            X.C276984uE.A01(r4, r0, r6)
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x0194:
            r7 = r4
            r10 = r6
            r11 = r6
            r12 = r6
            int[] r0 = X.C14602Tz6.A00(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0180
        L_0x019d:
            r1 = 0
            int r0 = X.C308216Te.A00(r8, r1)
            int r3 = X.C308216Te.A00(r9, r1)
            int[] r0 = new int[]{r0, r3}
            r2 = r0[r1]
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r2, r3)
            return r0
        L_0x01b3:
            r7 = 0
            r0 = 2
            int[] r6 = new int[r0]
            android.content.Context r0 = r2.A04
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r4 = r0.getDisplayMetrics()
            X.0qQ.A07(r4)
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x01dd
            com.instagram.common.session.UserSession r3 = X.0ob.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320330810204476(0x8109260011213c, double:3.0324616823820673E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x01de
        L_0x01dd:
            r1 = 0
        L_0x01de:
            X.C55027Hay.A00(r4, r6, r8, r9, r1)
            r3 = r6[r7]
            r0 = 1
            r2 = r6[r0]
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x01ed:
            r4 = 0
            android.content.Context r1 = r2.A04
            boolean r0 = com.instagram.igds.components.switchbutton.IgdsSwitch.A0O
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x0214
            r0 = 2131239583(0x7f08229f, float:1.8095477E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            if (r2 == 0) goto L_0x020e
            r0 = 2131239584(0x7f0822a0, float:1.809548E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            if (r1 != 0) goto L_0x022c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x020e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0214:
            r0 = 2131239357(0x7f0821bd, float:1.8095019E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            if (r2 == 0) goto L_0x0241
            r0 = 2131239358(0x7f0821be, float:1.809502E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            if (r1 != 0) goto L_0x022c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x022c:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int[] r1 = X.C67611Mqj.A00(r0, r2, r1)
            r3 = r1[r4]
            r0 = 1
            r2 = r1[r0]
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x0241:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0247:
            r1 = 46
            java.lang.String r0 = r0.A0K(r1)
            X.6Tc r0 = X.C70850OOe.A00(r5, r0, r8, r9)
            return r0
        L_0x0252:
            if (r53 == 0) goto L_0x02ac
            X.3mq r3 = r5.A0I()
            android.content.Context r1 = r2.A04
            java.lang.Object r3 = r3.ALg(r1)
            com.instagram.hashtag.ui.HashtagFollowButton r3 = (com.instagram.hashtag.ui.HashtagFollowButton) r3
            r1 = 31
            java.lang.Object r2 = X.C276544tV.A00(r0, r1)
            com.instagram.model.hashtag.Hashtag r2 = (com.instagram.model.hashtag.Hashtag) r2
            if (r2 != 0) goto L_0x0278
            r1 = 35
            java.lang.Object r0 = X.C276544tV.A00(r0, r1)
            X.EtK r0 = (X.EtK) r0
            if (r0 == 0) goto L_0x02a4
            com.instagram.model.hashtag.Hashtag r2 = r0.A00
            if (r2 == 0) goto L_0x02a4
        L_0x0278:
            X.G5n r0 = r3.A00
            if (r0 == 0) goto L_0x027f
            r0.DIm(r2)
        L_0x027f:
            boolean r1 = X.C281965Ag.A03(r2)
            java.lang.String r0 = r2.getName()
            if (r0 == 0) goto L_0x02a1
            java.lang.String r0 = r2.getName()
        L_0x028d:
            com.instagram.hashtag.ui.HashtagFollowButton.A00(r3, r0, r1)
            r0 = 0
            r3.setOnClickListener(r0)
            r3.measure(r8, r9)
        L_0x0297:
            int r4 = r3.getMeasuredWidth()
            int r6 = r3.getMeasuredHeight()
            goto L_0x1494
        L_0x02a1:
            java.lang.String r0 = ""
            goto L_0x028d
        L_0x02a4:
            java.lang.String r1 = "HashtagFollowButtonBinderUtils"
            java.lang.String r0 = "Hashtag is required to render hashtag follow button properly"
            X.1Kn.A02(r1, r0)
            goto L_0x0297
        L_0x02ac:
            java.lang.String r1 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02b4:
            r0 = 0
            int r3 = X.C308216Te.A00(r8, r0)
            int r2 = X.C308216Te.A00(r9, r0)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x02c4:
            int[] r1 = com.instagram.ui.widget.edittext.ConfirmationCodeEditText.A03(r8, r9)
            r0 = 0
            r3 = r1[r0]
            r0 = 1
            r2 = r1[r0]
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x02d5:
            r7 = 0
            r1 = 2
            X.0qQ.A0B(r5, r1)
            X.3mq r3 = r5.A0I()
            android.content.Context r1 = r2.A04
            java.lang.Object r6 = r3.ALg(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.user.follow.FollowButton"
            X.0qQ.A0C(r6, r1)
            com.instagram.user.follow.FollowButton r6 = (com.instagram.user.follow.FollowButton) r6
            X.W12.A01(r0, r6)
            r1 = 38
            java.lang.Object r3 = X.C276544tV.A00(r0, r1)
            X.EtL r3 = (X.EtL) r3
            java.lang.Object r1 = r2.A05
            if (r1 == 0) goto L_0x0352
            X.6Rm r1 = (X.C307786Rm) r1
            X.0lg r10 = X.C308206Td.A0A(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.session.UserSession"
            X.0qQ.A0C(r10, r1)
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            r4 = 0
            if (r3 == 0) goto L_0x0337
            com.instagram.user.model.User r2 = r3.A00
            if (r2 == 0) goto L_0x0337
        L_0x030e:
            X.2f1 r0 = X.AnonymousClass2f1.A00(r10)
            com.instagram.user.model.FollowStatus r1 = r0.A0N(r2)
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A08
            if (r1 != r0) goto L_0x0321
            X.5mt r0 = X.C294695ms.A00(r10)
            r0.A0G(r2, r7)
        L_0x0321:
            X.4at r0 = r6.A0J
            r0.A06(r10, r2)
            r6.measure(r8, r9)
            int r2 = r6.getMeasuredWidth()
            int r1 = r6.getMeasuredHeight()
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r4, r2, r1)
            return r0
        L_0x0337:
            X.17i r3 = X.17h.A00(r10)
            java.lang.String r2 = ""
            r1 = 41
            java.lang.String r0 = r0.A0K(r1)
            if (r0 == 0) goto L_0x0346
            r2 = r0
        L_0x0346:
            com.instagram.user.model.User r2 = r3.A02(r2)
            if (r2 != 0) goto L_0x030e
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r4, r7, r7)
            return r0
        L_0x0352:
            java.lang.String r1 = "Expecting a valid Bloks context"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x035a:
            android.content.Context r4 = r2.A04
            X.90O r1 = X.AnonymousClass90M.A01(r4)
            X.90O r14 = r1.A02()
            r6 = 1
            r14.A0d = r6
            java.lang.String r1 = r0.A0G()
            if (r1 == 0) goto L_0x0389
            r7 = 2
            float r3 = X.AnonymousClass6Su.A02(r1)     // Catch:{ 3yO -> 0x0382 }
            android.content.res.Resources r1 = r4.getResources()     // Catch:{ 3yO -> 0x0382 }
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch:{ 3yO -> 0x0382 }
            float r1 = android.util.TypedValue.applyDimension(r7, r3, r1)     // Catch:{ 3yO -> 0x0382 }
            int r1 = (int) r1     // Catch:{ 3yO -> 0x0382 }
            r14.A0P = r1     // Catch:{ 3yO -> 0x0382 }
            goto L_0x0389
        L_0x0382:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0389:
            java.lang.String r7 = r0.A0D()
            if (r7 == 0) goto L_0x03bb
            java.lang.String r1 = "AvenyT"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x03a5
            X.0qq r3 = X.AnonymousClass0qo.A00(r4)
            X.0qm r1 = X.0qm.A0V
            android.graphics.Typeface r1 = r3.A02(r1)
            if (r1 == 0) goto L_0x03a5
            r14.A0S = r1
        L_0x03a5:
            java.lang.String r1 = "InstagramSansCondensed"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x03bb
            X.0qq r3 = X.AnonymousClass0qo.A00(r4)
            X.0qm r1 = X.0qm.A0V
            android.graphics.Typeface r1 = r3.A02(r1)
            if (r1 == 0) goto L_0x03bb
            r14.A0S = r1
        L_0x03bb:
            java.lang.String r1 = r0.A0I()
            if (r1 == 0) goto L_0x03de
            int r3 = X.AnonymousClass6Su.A06(r1)     // Catch:{ 3yO -> 0x03d7 }
            if (r3 == r6) goto L_0x03cf
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r3 == r1) goto L_0x03d2
            X.90N r1 = X.AnonymousClass90N.A07     // Catch:{ 3yO -> 0x03d7 }
            goto L_0x03d4
        L_0x03cf:
            X.90N r1 = X.AnonymousClass90N.A01     // Catch:{ 3yO -> 0x03d7 }
            goto L_0x03d4
        L_0x03d2:
            X.90N r1 = X.AnonymousClass90N.A06     // Catch:{ 3yO -> 0x03d7 }
        L_0x03d4:
            r14.A0V = r1     // Catch:{ 3yO -> 0x03d7 }
            goto L_0x03de
        L_0x03d7:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x03de:
            java.lang.Object r12 = r2.A05
            r12.getClass()
            X.6Rm r12 = (X.C307786Rm) r12
            android.content.res.Resources r1 = r4.getResources()
            android.util.DisplayMetrics r10 = r1.getDisplayMetrics()
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            int r7 = r1.length()
            java.lang.String r3 = r0.A0E()
            if (r3 == 0) goto L_0x03ff
            r1.append(r3)
        L_0x03ff:
            int r6 = r1.length()
            java.lang.String r3 = r0.A0G()
            r11 = 0
            if (r3 == 0) goto L_0x0424
            float r4 = X.AnonymousClass6Su.A02(r3)     // Catch:{ 3yO -> 0x041d }
            r3 = 2
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r10)     // Catch:{ 3yO -> 0x041d }
            int r4 = (int) r3     // Catch:{ 3yO -> 0x041d }
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan     // Catch:{ 3yO -> 0x041d }
            r3.<init>(r4)     // Catch:{ 3yO -> 0x041d }
            r1.setSpan(r3, r7, r6, r11)     // Catch:{ 3yO -> 0x041d }
            goto L_0x0424
        L_0x041d:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0424:
            java.lang.String r3 = r0.A0J()
            if (r3 == 0) goto L_0x043e
            int r4 = X.AnonymousClass6Su.A08(r3)     // Catch:{ 3yO -> 0x0437 }
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan     // Catch:{ 3yO -> 0x0437 }
            r3.<init>(r4)     // Catch:{ 3yO -> 0x0437 }
            r1.setSpan(r3, r7, r6, r11)     // Catch:{ 3yO -> 0x0437 }
            goto L_0x043e
        L_0x0437:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x043e:
            r3 = 36
            java.util.List r10 = r0.A0M(r3)
            java.lang.String r0 = r0.A0H()
            if (r10 == 0) goto L_0x0662
            if (r0 == 0) goto L_0x0662
            android.graphics.drawable.GradientDrawable$Orientation r3 = X.AnonymousClass6Su.A09(r0)     // Catch:{ 3yO -> 0x047d }
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT     // Catch:{ 3yO -> 0x047d }
            if (r3 != r0) goto L_0x0662
            int r0 = r10.size()     // Catch:{ 3yO -> 0x047d }
            int[] r4 = new int[r0]     // Catch:{ 3yO -> 0x047d }
        L_0x045a:
            int r0 = r10.size()     // Catch:{ 3yO -> 0x047d }
            if (r11 >= r0) goto L_0x0470
            java.lang.Object r3 = r10.get(r11)     // Catch:{ 3yO -> 0x047d }
            X.4tV r3 = (X.C276544tV) r3     // Catch:{ 3yO -> 0x047d }
            r0 = 0
            int r0 = X.AnonymousClass6TP.A00(r12, r3, r0)     // Catch:{ 3yO -> 0x047d }
            r4[r11] = r0     // Catch:{ 3yO -> 0x047d }
            int r11 = r11 + 1
            goto L_0x045a
        L_0x0470:
            r0 = 0
            X.ALh r3 = new X.ALh     // Catch:{ 3yO -> 0x047d }
            r3.<init>(r0, r4)     // Catch:{ 3yO -> 0x047d }
            r0 = 18
            r1.setSpan(r3, r7, r6, r0)     // Catch:{ 3yO -> 0x047d }
            goto L_0x0662
        L_0x047d:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0484:
            r1 = 42
            java.lang.String r1 = r0.A0K(r1)
            int r2 = X.C14549TyE.A00(r1, r8)
            r4 = 0
            r1 = 35
            java.lang.String r0 = r0.A0K(r1)
            int r3 = X.C14549TyE.A00(r0, r9)
            int[] r2 = new int[]{r2, r3}
            r1 = r2[r4]
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r2, r1, r3)
            return r0
        L_0x04a5:
            if (r53 == 0) goto L_0x04c5
            X.3mq r1 = r5.A0I()
            android.content.Context r0 = r2.A04
            java.lang.Object r0 = r1.ALg(r0)
            X.X9E r0 = (X.X9E) r0
            r0.measure(r8, r9)
            int r3 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x04c5:
            java.lang.String r1 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x04cd:
            android.content.Context r1 = r2.A04
            r17 = r1
            java.lang.Object r13 = r2.A05
            X.6Rm r13 = (X.C307786Rm) r13
            X.90O r14 = X.AnonymousClass90O.A00(r17)
            r1 = 42
            java.lang.String r1 = r0.A0K(r1)
            if (r1 == 0) goto L_0x04f4
            int r1 = X.AnonymousClass6Su.A06(r1)     // Catch:{ 3yO -> 0x04e6 }
            goto L_0x04ed
        L_0x04e6:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x04ed:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.AnonymousClass90O.A01(r14, r1)
        L_0x04f4:
            r1 = 38
            r3 = -1
            int r1 = r0.A03(r1, r3)
            if (r1 <= r3) goto L_0x0539
            r14.A0I = r1
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r14.A0T = r1
        L_0x0503:
            r1 = 51
            java.util.List r3 = r0.A0N(r1)
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0530
            r1 = 1
            X.0qQ.A0B(r13, r1)
            X.6TZ r1 = X.AnonymousClass6TV.A01(r13, r0, r3)
            java.lang.CharSequence r1 = r1.A00
        L_0x0519:
            r14.A0Y = r1
        L_0x051b:
            r1 = 45
            java.lang.String r7 = r0.A0K(r1)
            java.lang.String r12 = ""
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r7 == 0) goto L_0x057b
            r1 = 53
            java.lang.String r6 = r0.A0K(r1)
            if (r6 == 0) goto L_0x056e
            goto L_0x054e
        L_0x0530:
            r1 = 49
            java.lang.String r1 = r0.A0K(r1)
            if (r1 == 0) goto L_0x051b
            goto L_0x0519
        L_0x0539:
            if (r1 != r3) goto L_0x0503
            if (r13 == 0) goto L_0x0503
            X.2nJ r1 = r13.A02
            X.2nt r1 = r1.AgE()
            X.2nr r1 = r1.AgI()
            boolean r1 = r1.Etb()
            r14.A0e = r1
            goto L_0x0503
        L_0x054e:
            java.lang.String r1 = "[^0-9.]"
            java.lang.String r4 = r7.replaceAll(r1, r12)     // Catch:{ 3yO -> 0x0574 }
            int r3 = r4.length()     // Catch:{ 3yO -> 0x0574 }
            int r1 = r7.length()     // Catch:{ 3yO -> 0x0574 }
            if (r3 == r1) goto L_0x0565
            java.lang.String r3 = "text_size_ignored"
            java.lang.String r1 = "Only specify a size value for text_size if also specifying the text_size_unit property."
            X.1Kn.A02(r3, r1)     // Catch:{ 3yO -> 0x0574 }
        L_0x0565:
            float r11 = java.lang.Float.parseFloat(r4)     // Catch:{ 3yO -> 0x0574 }
            int r10 = X.AnonymousClass6Su.A07(r6)     // Catch:{ 3yO -> 0x0574 }
            goto L_0x057f
        L_0x056e:
            float r11 = X.AnonymousClass6Su.A02(r7)     // Catch:{ 3yO -> 0x0574 }
            r10 = 2
            goto L_0x057f
        L_0x0574:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x057b:
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = -1
            goto L_0x058e
        L_0x057f:
            android.content.res.Resources r1 = r17.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r10, r11, r1)
            int r1 = (int) r1
            r14.A0P = r1
        L_0x058e:
            r1 = 46
            java.lang.String r3 = r0.A0K(r1)
            r1 = 35
            java.lang.String r15 = r0.A0K(r1)
            r7 = 0
            r6 = 0
            if (r13 == 0) goto L_0x05c7
            if (r15 == 0) goto L_0x05ac
            X.1Kj r1 = X.C64361Kj.A00()
            X.4dY r4 = r1.A05
            android.content.Context r1 = r13.A00
            android.graphics.Typeface r7 = r4.A00(r1, r15)
        L_0x05ac:
            if (r3 == 0) goto L_0x05c1
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x05c1
            android.graphics.Typeface r7 = X.AnonymousClass6TW.A00(r7, r3)     // Catch:{ 3yO -> 0x05b9 }
            goto L_0x05c1
        L_0x05b9:
            r4 = move-exception
            java.lang.String r3 = "BKBloksComponentsTextBinderUtil"
            java.lang.String r1 = "Error parsing typeface for Text"
            X.1Kn.A00(r13, r3, r1, r4)
        L_0x05c1:
            if (r15 == 0) goto L_0x05c7
            if (r7 == 0) goto L_0x05c7
            r14.A0S = r7
        L_0x05c7:
            r1 = 59
            java.lang.String r1 = r0.A0K(r1)     // Catch:{ 3yO -> 0x05db }
            if (r1 == 0) goto L_0x05e3
            float r3 = X.AnonymousClass6Su.A01(r1)     // Catch:{ 3yO -> 0x05db }
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x05e3
            r14.A03 = r3     // Catch:{ 3yO -> 0x05db }
            goto L_0x05e3
        L_0x05db:
            r4 = move-exception
            java.lang.String r3 = "BKBloksComponentsTextBinderUtil"
            java.lang.String r1 = "Error parsing lineHeight for Text"
            X.1Kn.A00(r13, r3, r1, r4)
        L_0x05e3:
            r3 = 36
            r1 = r16
            float r4 = r0.A02(r3, r1)
            r3 = 1
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x05f5
            r14.A0c = r3
            r14.A04 = r4
        L_0x05f5:
            r1 = 44
            X.4tV r1 = r0.A07(r1)
            if (r1 == 0) goto L_0x0681
            java.lang.CharSequence r12 = X.C9813Rhb.A00(r1)
        L_0x0601:
            android.content.res.Resources r1 = r17.getResources()
            android.util.DisplayMetrics r3 = r1.getDisplayMetrics()
            r1 = 48
            X.4tV r1 = r0.A07(r1)
            if (r1 == 0) goto L_0x066e
            int r1 = X.AnonymousClass6TP.A00(r13, r1, r6)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
        L_0x0619:
            r1 = 50
            boolean r15 = r0.A0R(r1, r6)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            int r4 = r1.length()
            r1.append(r12)
            int r12 = r1.length()
            if (r13 == 0) goto L_0x063d
            int r13 = r13.intValue()
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r13)
            r1.setSpan(r0, r4, r12, r6)
        L_0x063d:
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x064e
            float r0 = android.util.TypedValue.applyDimension(r10, r11, r3)
            int r3 = (int) r0
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            r0.<init>(r3)
            r1.setSpan(r0, r4, r12, r6)
        L_0x064e:
            if (r7 == 0) goto L_0x0658
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r7)
            r1.setSpan(r0, r4, r12, r6)
        L_0x0658:
            if (r15 == 0) goto L_0x0662
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r1.setSpan(r0, r4, r12, r6)
        L_0x0662:
            X.6TT r5 = (X.AnonymousClass6TT) r5
            r3 = r5
            r4 = r14
            r5 = r1
            r6 = r8
            r7 = r9
            X.6Tc r0 = X.C308176Ta.A02(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x066e:
            r1 = 43
            java.lang.String r1 = r0.A0K(r1)
            if (r1 != 0) goto L_0x0678
            r13 = 0
            goto L_0x0619
        L_0x0678:
            int r1 = X.AnonymousClass6Su.A03(r1)     // Catch:{ 3yO -> 0x068c }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch:{ 3yO -> 0x068c }
            goto L_0x0619
        L_0x0681:
            r1 = 41
            java.lang.String r1 = r0.A0K(r1)
            if (r1 == 0) goto L_0x0601
            r12 = r1
            goto L_0x0601
        L_0x068c:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0693:
            r7 = 0
            r6 = 1
            r1 = 40
            X.4tV r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x06c7
            X.2Ta r11 = r0.AEy(r2, r8, r9)
            X.0qQ.A07(r11)
            r13 = 0
            long r14 = X.C244873bt.A00(r8, r9)
            r10 = r2
            r12 = r0
            X.6Sh r4 = X.C308006Si.A00(r10, r11, r12, r13, r14)
            r0 = 2
            int[] r1 = new int[r0]
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != 0) goto L_0x06c2
            X.3dH r0 = r4.A01
            int r0 = r0.A01()
        L_0x06be:
            r1[r7] = r0
            goto L_0x3276
        L_0x06c2:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x06be
        L_0x06c7:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x06cf:
            r4 = 0
            r13 = 1
            r15 = 2
            X.0qQ.A0B(r5, r15)
            r6 = 38
            X.4tV r1 = r0.A07(r6)
            if (r1 == 0) goto L_0x3138
            r3 = 36
            X.4tV r1 = r0.A07(r3)
            if (r1 == 0) goto L_0x3138
            int r11 = X.C308216Te.A00(r8, r4)
            int r1 = X.C308216Te.A00(r9, r4)
            X.4tV r10 = r0.A07(r6)
            X.4tV r6 = r0.A07(r3)
            r3 = 44
            java.lang.String r7 = r0.A0K(r3)
            r3 = 1053609165(0x3ecccccd, float:0.4)
            if (r7 == 0) goto L_0x0781
            java.lang.String r3 = "%"
            boolean r3 = r7.endsWith(r3)
            if (r3 == 0) goto L_0x0774
            X.TxT r3 = X.AnonymousClass6Su.A0B(r7)
            float r9 = (float) r1
            float r7 = r3.A00
            r3 = 1008981770(0x3c23d70a, float:0.01)
            float r7 = r7 * r3
            float r9 = r9 * r7
        L_0x0714:
            int r7 = X.AnonymousClass1GB.A01(r9)
        L_0x0718:
            r3 = 45
            java.util.List r3 = r0.A0N(r3)
            X.0qQ.A07(r3)
            java.util.List r9 = X.00k.A0Y(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r17 = r9.iterator()
        L_0x072e:
            boolean r9 = r17.hasNext()
            if (r9 == 0) goto L_0x0784
            java.lang.Object r12 = r17.next()
            java.lang.String r12 = (java.lang.String) r12
            r9 = 0
            if (r12 == 0) goto L_0x0771
            java.lang.String r9 = "%"
            boolean r9 = r12.endsWith(r9)
            if (r9 == 0) goto L_0x0762
            X.TxT r9 = X.AnonymousClass6Su.A0B(r12)
            float r14 = (float) r1
            r16 = 1065353216(0x3f800000, float:1.0)
            float r12 = r9.A00
            r9 = 1008981770(0x3c23d70a, float:0.01)
            float r12 = r12 * r9
            float r16 = r16 - r12
            float r14 = r14 * r16
        L_0x0756:
            int r9 = X.AnonymousClass1GB.A01(r14)
        L_0x075a:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3.add(r9)
            goto L_0x072e
        L_0x0762:
            float r9 = X.AnonymousClass6Su.A01(r12)
            int r9 = X.AnonymousClass1GB.A01(r9)
            int r9 = r1 - r9
            int r9 = java.lang.Math.max(r4, r9)
            goto L_0x075a
        L_0x0771:
            float r14 = (float) r1
            float r14 = r14 * r9
            goto L_0x0756
        L_0x0774:
            float r3 = X.AnonymousClass6Su.A01(r7)
            int r3 = X.AnonymousClass1GB.A01(r3)
            int r7 = java.lang.Math.max(r4, r3)
            goto L_0x0718
        L_0x0781:
            float r9 = (float) r1
            float r9 = r9 * r3
            goto L_0x0714
        L_0x0784:
            int r14 = r3.size()
            r9 = 3
            r12 = 0
            if (r14 <= r9) goto L_0x07b0
            java.lang.Object r14 = r3.get(r4)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r4 = r3.size()
            int r4 = r4 / r15
            java.lang.Object r9 = r3.get(r4)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r4 = r3.size()
            int r4 = r4 - r13
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Integer[] r3 = new java.lang.Integer[]{r14, r9, r3}
            java.util.ArrayList r3 = X.0sr.A1M(r3)
        L_0x07b0:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x07c6
            float r9 = (float) r1
            r4 = 1058642330(0x3f19999a, float:0.6)
            float r9 = r9 * r4
            int r4 = X.AnonymousClass1GB.A01(r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
        L_0x07c6:
            int r4 = r3.size()
            int r4 = r4 - r13
            int r9 = r3.size()
            if (r9 <= r13) goto L_0x07d2
            r12 = 1
        L_0x07d2:
            r9 = 40
            int r0 = r0.A03(r9, r12)
            int r4 = r4 - r0
            java.lang.Object r0 = r3.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r1 - r0
            int r0 = java.lang.Math.max(r0, r7)
            r9 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            java.lang.Object r0 = r3.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            java.lang.String r0 = "Required value was null."
            if (r10 == 0) goto L_0x0842
            X.2Ta r13 = r10.AEy(r2, r8, r12)
            X.0qQ.A07(r13)
            long r16 = X.C244873bt.A00(r8, r12)
            r15 = 0
            r12 = r2
            r14 = r10
            X.6Sh r13 = X.C308006Si.A00(r12, r13, r14, r15, r16)
            if (r6 == 0) goto L_0x083c
            X.2Ta r17 = r6.AEy(r2, r8, r9)
            X.0qQ.A07(r17)
            long r20 = X.C244873bt.A00(r8, r9)
            r16 = r2
            r18 = r6
            r19 = r15
            X.6Sh r14 = X.C308006Si.A00(r16, r17, r18, r19, r20)
            X.VkZ r12 = new X.VkZ
            r16 = r4
            r17 = r7
            r18 = r1
            r15 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r12, r11, r1)
            return r0
        L_0x083c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0842:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0848:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            r3 = 0
            if (r0 != 0) goto L_0x0869
            r2 = 0
        L_0x0850:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != 0) goto L_0x0864
            r1 = 0
        L_0x0857:
            int[] r0 = new int[]{r2, r1}
            r3 = r0[r3]
            r2 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r2, r3, r1)
            return r0
        L_0x0864:
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            goto L_0x0857
        L_0x0869:
            int r2 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x0850
        L_0x086e:
            X.6T2 r20 = X.AnonymousClass6T1.A00
            r1 = 49
            java.lang.String r3 = r0.A0K(r1)
            if (r3 == 0) goto L_0x0883
            java.lang.String r1 = "gone"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0883
            X.2Ta r0 = X.AnonymousClass6TI.A00
            return r0
        L_0x0883:
            android.content.Context r1 = r2.A04
            boolean r1 = X.AnonymousClass6T5.A00(r1)
            r14 = r1 ^ 1
            X.4tV r10 = X.AnonymousClass6T2.A02(r0)
            X.6T6 r7 = new X.6T6
            r7.<init>()
            X.6TC r1 = new X.6TC
            r1.<init>(r7, r0)
            r0.A0Q(r1)
            if (r14 != 0) goto L_0x08b5
            r1 = 2
            X.AnonymousClass6T6.A00(r7, r1)
            float[] r6 = r7.A01
            int r4 = r7.A00
            int r3 = r4 + 1
            r7.A00 = r3
            r1 = 0
            r6[r4] = r1
            int r1 = r3 + 1
            r7.A00 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            r6[r3] = r1
        L_0x08b5:
            if (r10 == 0) goto L_0x08bf
            X.6TE r1 = new X.6TE
            r1.<init>(r7, r14)
            r10.A0Q(r1)
        L_0x08bf:
            float[] r3 = r7.A01
            int r1 = r7.A00
            float[] r21 = java.util.Arrays.copyOf(r3, r1)
            java.util.List r19 = r0.A0L()
            int r1 = r19.size()
            float[][] r3 = new float[r1][]
            int r1 = r19.size()
            X.6TF[] r1 = new X.AnonymousClass6TF[r1]
            java.util.Iterator r18 = r19.iterator()
            r13 = 0
            r17 = 0
        L_0x08de:
            boolean r4 = r18.hasNext()
            if (r4 == 0) goto L_0x0985
            java.lang.Object r12 = r18.next()
            X.2TS r12 = (X.AnonymousClass2TS) r12
            boolean r4 = r12 instanceof X.C276544tV
            if (r4 == 0) goto L_0x0908
            r7 = r12
            X.4tV r7 = (X.C276544tV) r7
            int r6 = r7.A04
            r4 = 13320(0x3408, float:1.8665E-41)
            if (r6 != r4) goto L_0x0908
            r4 = 49
            java.lang.String r6 = r7.A0K(r4)
            if (r6 == 0) goto L_0x0908
            java.lang.String r4 = "gone"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0908
            goto L_0x08de
        L_0x0908:
            X.4tV r11 = X.AnonymousClass6T2.A02(r12)
            if (r11 == 0) goto L_0x0982
            X.6T3 r10 = new X.6T3
            r10.<init>()
            r6 = 62
            java.lang.String r4 = r11.A0K(r6)
            if (r4 == 0) goto L_0x0980
            java.lang.String r6 = r11.A0K(r6)
            java.lang.String r4 = "absolute"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0980
            r15 = 1
            r4 = 2
            X.AnonymousClass6T3.A00(r10, r4)
            float[] r7 = r10.A01
            int r6 = r10.A00
            int r4 = r6 + 1
            r10.A00 = r4
            r16 = 1101529088(0x41a80000, float:21.0)
            r7[r6] = r16
            int r6 = r4 + 1
            r10.A00 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r7[r4] = r6
        L_0x0940:
            if (r14 == 0) goto L_0x097b
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
        L_0x0946:
            X.6TG r4 = new X.6TG
            r4.<init>(r10, r7, r6, r15)
            r11.A0Q(r4)
        L_0x094e:
            float[] r6 = r10.A01
            int r4 = r10.A00
            float[] r4 = java.util.Arrays.copyOf(r6, r4)
            r3[r13] = r4
            X.6TH r6 = new X.6TH
            r4 = r20
            r6.<init>(r4, r2, r12, r14)
            X.6TF r4 = new X.6TF
            r4.<init>(r6)
            r1[r13] = r4
            X.4tV r7 = X.AnonymousClass6T2.A02(r12)
            r6 = 0
            if (r7 == 0) goto L_0x0977
            r4 = 81
            int r4 = r7.A03(r4, r6)
            if (r4 == 0) goto L_0x0977
            r17 = 1
        L_0x0977:
            int r13 = r13 + 1
            goto L_0x08de
        L_0x097b:
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            goto L_0x0946
        L_0x0980:
            r15 = 0
            goto L_0x0940
        L_0x0982:
            X.6T3 r10 = X.AnonymousClass6T2.A00
            goto L_0x094e
        L_0x0985:
            int r2 = r19.size()
            if (r2 <= r13) goto L_0x0997
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r13)
            float[][] r3 = (float[][]) r3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r13)
            X.6TF[] r1 = (X.AnonymousClass6TF[]) r1
        L_0x0997:
            r6 = 0
            if (r17 == 0) goto L_0x09b4
            java.lang.Integer[] r6 = new java.lang.Integer[r13]
            r4 = 0
        L_0x099d:
            if (r4 >= r13) goto L_0x09a8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r6[r4] = r2
            int r4 = r4 + 1
            goto L_0x099d
        L_0x09a8:
            X.WqF r7 = new X.WqF
            r4 = r20
            r2 = r19
            r7.<init>(r4, r2)
            java.util.Arrays.sort(r6, r7)
        L_0x09b4:
            float[] r13 = X.AnonymousClass6TI.A01(r8)
            float[] r12 = X.AnonymousClass6TI.A01(r9)
            r4 = 1
            r11 = r13[r4]
            r9 = r12[r4]
            X.4tV r10 = X.AnonymousClass6T2.A02(r0)
            if (r10 != 0) goto L_0x0a11
            r8 = 0
        L_0x09c8:
            r11 = 0
            if (r8 == 0) goto L_0x09eb
            r10 = r8[r11]
            r0 = 2
            r9 = r8[r0]
            r0 = 4
            r7 = r8[r0]
            r2 = r13[r11]
            r0 = r13[r4]
            float[] r13 = X.AnonymousClass6TI.A00(r10, r9, r7, r2, r0)
            r10 = r8[r4]
            r0 = 3
            r9 = r8[r0]
            r0 = 5
            r7 = r8[r0]
            r2 = r12[r11]
            r0 = r12[r4]
            float[] r12 = X.AnonymousClass6TI.A00(r10, r9, r7, r2, r0)
        L_0x09eb:
            r23 = r13[r11]
            r24 = r13[r4]
            r25 = r12[r11]
            r26 = r12[r4]
            int r0 = r3.length
            com.facebook.flexlayout.layoutoutput.LayoutOutput r2 = new com.facebook.flexlayout.layoutoutput.LayoutOutput
            r2.<init>(r0)
            X.6TL r0 = new X.6TL
            r0.<init>(r2, r1)
            r22 = r3
            r27 = r24
            r28 = r26
            r29 = r2
            r30 = r0
            com.facebook.flexlayout.FlexLayoutNative.jni_calculateLayout(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.6TK r0 = new X.6TK
            r0.<init>(r2, r5, r6)
            return r0
        L_0x0a11:
            r0 = 6
            float[] r8 = new float[r0]
            r0 = 68
            float r0 = X.AnonymousClass6T2.A00(r10, r11, r0, r4)
            r7 = 0
            r8[r7] = r0
            r0 = 42
            float r0 = X.AnonymousClass6T2.A00(r10, r9, r0, r4)
            r8[r4] = r0
            r2 = 2
            r0 = 54
            float r0 = X.AnonymousClass6T2.A00(r10, r11, r0, r7)
            r8[r2] = r0
            r2 = 3
            r0 = 53
            float r0 = X.AnonymousClass6T2.A00(r10, r9, r0, r7)
            r8[r2] = r0
            r2 = 4
            r0 = 52
            float r0 = X.AnonymousClass6T2.A00(r10, r11, r0, r7)
            r8[r2] = r0
            r2 = 5
            r0 = 51
            float r0 = X.AnonymousClass6T2.A00(r10, r9, r0, r7)
            r8[r2] = r0
            goto L_0x09c8
        L_0x0a4b:
            java.lang.Object r0 = r2.A05
            X.6Rm r0 = (X.C307786Rm) r0
            if (r0 == 0) goto L_0x0a7c
            X.0lg r0 = X.C308206Td.A0A(r0)
            com.instagram.common.session.UserSession r0 = X.0Gl.A01(r0)
            if (r0 == 0) goto L_0x0a7c
            X.1Si r0 = X.1Se.A00(r0)
            boolean r0 = r0.A0A
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0a7c
        L_0x0a65:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r3 = X.C308216Te.A01(r0, r8)
            int r2 = X.C308216Te.A01(r0, r9)
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r0, r0, r3, r2)
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x0a7c:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r4 = X.C308216Te.A01(r0, r8)
            int r3 = X.C308216Te.A01(r0, r9)
            boolean r0 = r5 instanceof X.AnonymousClass6QP
            if (r0 != 0) goto L_0x0aaf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Expected FrescoRenderUnit (got "
            r1.append(r0)
            if (r53 == 0) goto L_0x0aad
            java.lang.Class r0 = r5.getClass()
        L_0x0a9b:
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0aad:
            r0 = 0
            goto L_0x0a9b
        L_0x0aaf:
            r0 = r5
            X.6QP r0 = (X.AnonymousClass6QP) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            X.2he r1 = r0.A06
            boolean r0 = r1 instanceof X.AnonymousClass6QU
            if (r0 != 0) goto L_0x0af4
            boolean r0 = r1 instanceof X.AnonymousClass2iB
            if (r0 == 0) goto L_0x0acc
            java.lang.Class<X.2hk> r1 = X.C226722hk.class
            monitor-enter(r1)
            X.1Ts r0 = X.AnonymousClass1Ts.A01     // Catch:{ all -> 0x0ac9 }
            r0.Bel()     // Catch:{ all -> 0x0ac9 }
            goto L_0x0af1
        L_0x0ac9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0acc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Expected SingleImageSource (got "
            r2.append(r0)
            java.lang.Class r1 = r1.getClass()
            X.0Yh r0 = new X.0Yh
            r0.<init>(r1)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0af1:
            monitor-exit(r1)
            X.1TY r0 = X.AnonymousClass1TW.A00
        L_0x0af4:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r2, r2, r4, r3)
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r4, r3)
            return r0
        L_0x0aff:
            r0 = 2
            X.0qQ.A0B(r5, r0)
        L_0x0b03:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != 0) goto L_0x0b10
            r3 = 0
        L_0x0b0a:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            goto L_0x2415
        L_0x0b10:
            int r3 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x0b0a
        L_0x0b15:
            android.content.Context r1 = r2.A04
            java.lang.Object r13 = r2.A05
            X.6Rm r13 = (X.C307786Rm) r13
            X.90O r10 = X.AnonymousClass90O.A00(r1)
            r1 = 42
            java.lang.String r1 = r0.A0K(r1)
            if (r1 == 0) goto L_0x0b3a
            int r1 = X.AnonymousClass6Su.A06(r1)     // Catch:{ 3yO -> 0x0b2c }
            goto L_0x0b33
        L_0x0b2c:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0b33:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.AnonymousClass90O.A01(r10, r1)
        L_0x0b3a:
            r1 = 40
            r3 = -1
            int r1 = r0.A03(r1, r3)
            if (r1 <= r3) goto L_0x0bdb
            r10.A0I = r1
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r10.A0T = r1
        L_0x0b49:
            r1 = 68
            r12 = 0
            boolean r11 = r0.A0R(r1, r12)
            r1 = 44
            if (r11 == 0) goto L_0x0b56
            r1 = 70
        L_0x0b56:
            java.util.List r3 = r0.A0N(r1)
            boolean r1 = r3.isEmpty()
            r20 = 0
            if (r1 != 0) goto L_0x0bd8
            X.6TZ r7 = X.AnonymousClass6TV.A02(r13, r0, r3, r11)
            java.lang.CharSequence r1 = r7.A00
            r10.A0Y = r1
        L_0x0b6a:
            r1 = 54
            java.lang.String r4 = r0.A0K(r1)
            android.content.Context r15 = r13.A00
            boolean r3 = X.AnonymousClass6T5.A00(r15)
            if (r4 == 0) goto L_0x0b84
            java.lang.String r1 = "text_first_strong"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0bd0
            X.3cZ r1 = X.C245223cW.A03
        L_0x0b82:
            r10.A0U = r1
        L_0x0b84:
            r1 = 53
            X.4tV r1 = r0.A07(r1)
            if (r1 == 0) goto L_0x0bce
            int r1 = X.AnonymousClass6TP.A00(r13, r1, r12)
        L_0x0b90:
            r10.A0A = r1
            r1 = 52
            int r1 = r0.A03(r1, r12)
            r10.A0B = r1
            r1 = 46
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = r0.A03(r1, r4)
            r1 = 48
            int r6 = r0.A03(r1, r4)
            if (r3 == r4) goto L_0x0bcc
            if (r6 == r4) goto L_0x0bcc
            r14 = 1
            android.content.res.Resources r1 = r15.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r4 = r1.density
            float r1 = (float) r3
            float r1 = r1 * r4
            int r3 = java.lang.Math.round(r1)
            float r1 = (float) r6
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
            r10.A0F = r3
            r10.A0G = r1
        L_0x0bc7:
            r1 = 67
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0bf1
        L_0x0bcc:
            r14 = 0
            goto L_0x0bc7
        L_0x0bce:
            r1 = 0
            goto L_0x0b90
        L_0x0bd0:
            if (r3 == 0) goto L_0x0bd5
            X.3cZ r1 = X.C245223cW.A02
            goto L_0x0b82
        L_0x0bd5:
            X.3cZ r1 = X.C245223cW.A01
            goto L_0x0b82
        L_0x0bd8:
            r7 = r20
            goto L_0x0b6a
        L_0x0bdb:
            if (r1 != r3) goto L_0x0b49
            if (r13 == 0) goto L_0x0b49
            X.2nJ r1 = r13.A02
            X.2nt r1 = r1.AgE()
            X.2nr r1 = r1.AgI()
            boolean r1 = r1.Etb()
            r10.A0e = r1
            goto L_0x0b49
        L_0x0bf1:
            java.lang.String r1 = r0.A0K(r1)     // Catch:{ 3yO -> 0x0c03 }
            if (r1 == 0) goto L_0x0c0b
            float r3 = X.AnonymousClass6Su.A01(r1)     // Catch:{ 3yO -> 0x0c03 }
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0c0b
            r10.A03 = r3     // Catch:{ 3yO -> 0x0c03 }
            goto L_0x0c0b
        L_0x0c03:
            r4 = move-exception
            java.lang.String r3 = "BKBloksComponentsRichTextBinderUtil"
            java.lang.String r1 = "Error parsing lineHeight for RichText"
            X.1Kn.A00(r13, r3, r1, r4)
        L_0x0c0b:
            r1 = 38
            float r4 = r0.A02(r1, r6)
            r3 = r14 ^ 1
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0c1c
            r10.A0c = r3
            r10.A04 = r4
        L_0x0c1c:
            r1 = 32
            if (r11 == 0) goto L_0x0c22
            r1 = 69
        L_0x0c22:
            java.util.List r1 = r0.A0N(r1)
            X.6TZ r6 = X.AnonymousClass6TV.A02(r13, r0, r1, r11)
            java.lang.String r1 = r6.A01
            r10.A0Z = r1
            java.lang.CharSequence r1 = r6.A00
            r27 = r1
            android.text.SpannableString r24 = android.text.SpannableString.valueOf(r27)
            r1 = 50
            boolean r1 = r0.A0R(r1, r12)
            if (r1 == 0) goto L_0x0c41
            X.C64361Kj.A00()
        L_0x0c41:
            r1 = 140(0x8c, float:1.96E-43)
            X.4tV r15 = r0.A07(r1)
            if (r15 == 0) goto L_0x0c9d
            r1 = 65
            java.lang.String r3 = r0.A0K(r1)
            java.lang.String r1 = "background start padding"
            float r4 = X.V5D.A00(r13, r3, r1)
            r1 = 63
            java.lang.String r3 = r0.A0K(r1)
            java.lang.String r1 = "background end padding"
            float r19 = X.V5D.A00(r13, r3, r1)
            r1 = 66
            java.lang.String r3 = r0.A0K(r1)
            java.lang.String r1 = "background top padding"
            float r18 = X.V5D.A00(r13, r3, r1)
            r1 = 62
            java.lang.String r3 = r0.A0K(r1)
            java.lang.String r1 = "background bottom padding"
            float r17 = X.V5D.A00(r13, r3, r1)
            r1 = 58
            java.lang.String r1 = r0.A0K(r1)
            java.lang.String r0 = "background corner radius"
            float r16 = X.V5D.A00(r13, r1, r0)
            android.graphics.RectF r14 = new android.graphics.RectF
            r3 = r19
            r1 = r18
            r0 = r17
            r14.<init>(r4, r1, r3, r0)
            int r3 = X.AnonymousClass6TP.A00(r13, r15, r12)
            X.92c r1 = new X.92c
            r0 = r16
            r1.<init>(r14, r0, r3)
            r10.A0W = r1
        L_0x0c9d:
            X.6TT r5 = (X.AnonymousClass6TT) r5
            r21 = r2
            r22 = r5
            r23 = r10
            r25 = r8
            r26 = r9
            X.6Tc r0 = X.C308176Ta.A02(r21, r22, r23, r24, r25, r26)
            if (r7 == 0) goto L_0x0cb8
            java.util.List r1 = r7.A02
            boolean r1 = r1.isEmpty()
            r4 = 1
            if (r1 == 0) goto L_0x0cb9
        L_0x0cb8:
            r4 = 0
        L_0x0cb9:
            java.util.List r3 = r6.A02
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0cc4
            r1 = 0
            if (r4 == 0) goto L_0x0cc5
        L_0x0cc4:
            r1 = 1
        L_0x0cc5:
            if (r11 == 0) goto L_0x1e67
            if (r1 == 0) goto L_0x1e67
            android.text.SpannableString r16 = android.text.SpannableString.valueOf(r27)
            if (r7 != 0) goto L_0x0cff
            r13 = r20
        L_0x0cd1:
            java.util.Iterator r4 = r3.iterator()
        L_0x0cd5:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0d0a
            java.lang.Object r3 = r4.next()
            X.VXV r3 = (X.VXV) r3
            java.lang.Object r1 = r0.A02
            X.6Tb r1 = (X.C308186Tb) r1
            if (r1 == 0) goto L_0x0d0a
            android.text.Layout r1 = r1.A02
            if (r1 == 0) goto L_0x0d0a
            X.ViE r0 = r3.A02
            r14 = r0
            r15 = r1
            r17 = r3
            r18 = r8
            r19 = r9
            r14.A00(r15, r16, r17, r18, r19)
            r24 = r16
            X.6Tc r0 = X.C308176Ta.A02(r21, r22, r23, r24, r25, r26)
            goto L_0x0cd5
        L_0x0cff:
            java.lang.CharSequence r1 = r7.A00
            android.text.SpannableString r13 = android.text.SpannableString.valueOf(r1)
            java.util.List r1 = r7.A02
            r20 = r1
            goto L_0x0cd1
        L_0x0d0a:
            if (r13 == 0) goto L_0x1e67
            if (r20 == 0) goto L_0x1e67
            java.util.Iterator r4 = r20.iterator()
        L_0x0d12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x1e67
            java.lang.Object r3 = r4.next()
            X.VXV r3 = (X.VXV) r3
            java.lang.Object r1 = r0.A02
            X.6Tb r1 = (X.C308186Tb) r1
            if (r1 == 0) goto L_0x1e67
            android.text.Layout r1 = r1.A02
            if (r1 == 0) goto L_0x1e67
            X.ViE r0 = r3.A02
            r11 = r0
            r12 = r1
            r14 = r3
            r15 = r8
            r16 = r9
            r11.A00(r12, r13, r14, r15, r16)
            r14 = r2
            r15 = r5
            r16 = r10
            r17 = r13
            r18 = r8
            r19 = r9
            X.6Tc r0 = X.C308176Ta.A02(r14, r15, r16, r17, r18, r19)
            goto L_0x0d12
        L_0x0d42:
            java.lang.Object r11 = r2.A05
            X.6Rm r11 = (X.C307786Rm) r11
            java.lang.String r1 = "IgLinechartChartBinderUtils received a null bloksContext in calculateLayoutForComponent. This should not happen."
            X.17k.A07(r11, r1)
            r10 = 0
            int r3 = X.C308216Te.A00(r8, r10)
            int r1 = X.C308216Te.A00(r9, r10)
            r15 = 1
            int[] r14 = new int[]{r3, r1}
            if (r1 != 0) goto L_0x0d6a
            android.content.Context r1 = r2.A04
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131165533(0x7f07015d, float:1.7945286E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r14[r15] = r1
        L_0x0d6a:
            X.V3v r7 = new X.V3v
            r7.<init>()
            r12 = 35
            X.4tV r3 = r0.A07(r12)
            java.lang.String r1 = "Canvas model not supplied for LineChart node"
            X.17k.A07(r3, r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r1 = r3.A0N(r12)
            java.util.Iterator r2 = r1.iterator()
        L_0x0d8c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0da0
            java.lang.Object r1 = r2.next()
            X.4tV r1 = (X.C276544tV) r1
            java.lang.String r1 = r1.A0K(r12)
            r8.add(r1)
            goto L_0x0d8c
        L_0x0da0:
            r1 = 2147483647(0x7fffffff, float:NaN)
            r7.A01 = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.A00 = r1
            r9 = 36
            java.util.List r4 = r3.A0N(r9)
            int r3 = r4.size()
        L_0x0db3:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0ddd
            java.lang.Object r13 = r4.get(r3)
            X.4tV r13 = (X.C276544tV) r13
            java.lang.String r1 = r13.A0K(r12)
            r6.add(r1)
            int r2 = r7.A01
            int r1 = r13.A03(r9, r10)
            int r1 = java.lang.Math.min(r2, r1)
            r7.A01 = r1
            int r2 = r7.A00
            int r1 = r13.A03(r9, r10)
            int r1 = java.lang.Math.max(r2, r1)
            r7.A00 = r1
            goto L_0x0db3
        L_0x0ddd:
            int r1 = r6.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r3 = r6.toArray(r1)
            java.lang.String[] r3 = (java.lang.String[]) r3
            int r1 = r8.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r2 = r8.toArray(r1)
            java.lang.String[] r2 = (java.lang.String[]) r2
            X.VRU r1 = new X.VRU
            r1.<init>(r3, r2)
            r7.A02 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7.A03 = r1
            r1 = 38
            java.util.List r1 = r0.A0N(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x0e0d:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0e2b
            java.lang.Object r6 = r9.next()
            X.4tV r6 = (X.C276544tV) r6
            java.util.List r4 = r7.A03
            int r3 = r7.A01
            int r2 = r7.A00
            int r1 = r8.size()
            X.Vcy r1 = X.C16858V8n.A00(r11, r6, r3, r2, r1)
            r4.add(r1)
            goto L_0x0e0d
        L_0x0e2b:
            r1 = 40
            java.util.List r1 = r0.A0N(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.A04 = r0
            java.util.Iterator r6 = r1.iterator()
        L_0x0e3c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0e5a
            java.lang.Object r4 = r6.next()
            X.4tV r4 = (X.C276544tV) r4
            java.util.List r3 = r7.A04
            int r2 = r7.A01
            int r1 = r7.A00
            int r0 = r8.size()
            X.Vcy r0 = X.C16858V8n.A00(r11, r4, r2, r1, r0)
            r3.add(r0)
            goto L_0x0e3c
        L_0x0e5a:
            r2 = r14[r10]
            r1 = r14[r15]
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r7, r2, r1)
            return r0
        L_0x0e64:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 == 0) goto L_0x0e7a
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 == 0) goto L_0x0e7a
            int r4 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = android.view.View.MeasureSpec.getSize(r9)
            goto L_0x24ee
        L_0x0e7a:
            java.lang.String r1 = "Unspecified measures for IgStaticMapRenderUnit are not supported."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0e82:
            r7 = 0
            int r3 = X.C308216Te.A00(r8, r7)
            int r1 = X.C308216Te.A00(r9, r7)
            r16 = 1
            int[] r15 = new int[]{r3, r1}
            if (r1 != 0) goto L_0x0ea2
            android.content.Context r1 = r2.A04
            android.content.res.Resources r3 = r1.getResources()
            r1 = 2131165533(0x7f07015d, float:1.7945286E38)
            int r1 = r3.getDimensionPixelSize(r1)
            r15[r16] = r1
        L_0x0ea2:
            java.lang.Object r12 = r2.A05
            r12.getClass()
            X.6Rm r12 = (X.C307786Rm) r12
            X.V49 r6 = new X.V49
            r6.<init>()
            r11 = 35
            X.4tV r9 = r0.A07(r11)
            java.lang.String r1 = "Canvas model wasn't found for LineChartV2 node"
            X.17k.A07(r9, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A06 = r1
            r1 = 46
            java.util.List r1 = r0.A0N(r1)
            java.util.Iterator r14 = r1.iterator()
        L_0x0ed4:
            boolean r1 = r14.hasNext()
            r13 = 36
            r4 = 38
            r8 = 0
            if (r1 == 0) goto L_0x0ef8
            java.lang.Object r1 = r14.next()
            X.4tV r1 = (X.C276544tV) r1
            float r10 = r1.A02(r13, r8)
            float r8 = r1.A02(r4, r8)
            java.util.List r4 = r6.A06
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r10, r8)
            r4.add(r1)
            goto L_0x0ed4
        L_0x0ef8:
            java.util.List r1 = r9.A0N(r11)
            java.util.Iterator r10 = r1.iterator()
        L_0x0f00:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0f14
            java.lang.Object r1 = r10.next()
            X.4tV r1 = (X.C276544tV) r1
            java.lang.String r1 = r1.A0K(r11)
            r2.add(r1)
            goto L_0x0f00
        L_0x0f14:
            java.util.List r1 = r9.A0N(r13)
            java.util.Iterator r10 = r1.iterator()
        L_0x0f1c:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0f30
            java.lang.Object r1 = r10.next()
            X.4tV r1 = (X.C276544tV) r1
            java.lang.String r1 = r1.A0K(r11)
            r3.add(r1)
            goto L_0x0f1c
        L_0x0f30:
            r13 = 42
            float r1 = r9.A02(r13, r8)
            int r1 = (int) r1
            r6.A03 = r1
            r10 = 40
            float r1 = r9.A02(r10, r8)
            int r1 = (int) r1
            r6.A02 = r1
            r11 = 41
            float r1 = r9.A02(r11, r8)
            int r1 = (int) r1
            r6.A01 = r1
            float r1 = r9.A02(r4, r8)
            int r1 = (int) r1
            r6.A00 = r1
            int r1 = r3.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r3 = r3.toArray(r1)
            java.lang.String[] r3 = (java.lang.String[]) r3
            int r1 = r2.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r2 = r2.toArray(r1)
            java.lang.String[] r2 = (java.lang.String[]) r2
            X.VRU r1 = new X.VRU
            r1.<init>(r3, r2)
            r6.A04 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A09 = r1
            java.util.List r1 = r0.A0N(r4)
            java.util.Iterator r14 = r1.iterator()
        L_0x0f80:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0faa
            java.lang.Object r9 = r14.next()
            X.4tV r9 = (X.C276544tV) r9
            java.util.List r8 = r6.A09
            int r4 = r6.A03
            int r3 = r6.A02
            int r2 = r6.A01
            int r1 = r6.A00
            r18 = r9
            r19 = r4
            r20 = r3
            r21 = r2
            r22 = r1
            r17 = r12
            X.Vcy r1 = X.C18131Vm7.A01(r17, r18, r19, r20, r21, r22)
            r8.add(r1)
            goto L_0x0f80
        L_0x0faa:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A0A = r1
            java.util.List r1 = r0.A0N(r10)
            java.util.Iterator r10 = r1.iterator()
        L_0x0fb9:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0fe3
            java.lang.Object r9 = r10.next()
            X.4tV r9 = (X.C276544tV) r9
            java.util.List r8 = r6.A0A
            int r4 = r6.A03
            int r3 = r6.A02
            int r2 = r6.A01
            int r1 = r6.A00
            r18 = r9
            r19 = r4
            r20 = r3
            r21 = r2
            r22 = r1
            r17 = r12
            X.Vcy r1 = X.C18131Vm7.A01(r17, r18, r19, r20, r21, r22)
            r8.add(r1)
            goto L_0x0fb9
        L_0x0fe3:
            boolean r1 = r0.A0R(r13, r7)
            r6.A0D = r1
            r1 = 43
            boolean r1 = r0.A0R(r1, r7)
            r6.A0C = r1
            r1 = 50
            boolean r1 = r0.A0R(r1, r7)
            r6.A0E = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A07 = r1
            r1 = 44
            java.util.List r1 = r0.A0N(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x100a:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x1034
            java.lang.Object r9 = r10.next()
            X.4tV r9 = (X.C276544tV) r9
            java.util.List r8 = r6.A07
            int r4 = r6.A03
            int r3 = r6.A02
            int r2 = r6.A01
            int r1 = r6.A00
            r18 = r9
            r19 = r4
            r20 = r3
            r21 = r2
            r22 = r1
            r17 = r12
            X.Vcy r1 = X.C18131Vm7.A01(r17, r18, r19, r20, r21, r22)
            r8.add(r1)
            goto L_0x100a
        L_0x1034:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A0B = r1
            r1 = 45
            java.util.List r1 = r0.A0N(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x1045:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x106f
            java.lang.Object r9 = r10.next()
            X.4tV r9 = (X.C276544tV) r9
            java.util.List r8 = r6.A0B
            int r4 = r6.A03
            int r3 = r6.A02
            int r2 = r6.A01
            int r1 = r6.A00
            r18 = r9
            r19 = r4
            r20 = r3
            r21 = r2
            r22 = r1
            r17 = r12
            X.Vcy r1 = X.C18131Vm7.A01(r17, r18, r19, r20, r21, r22)
            r8.add(r1)
            goto L_0x1045
        L_0x106f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.A08 = r1
            r1 = 48
            java.util.List r1 = r0.A0N(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x1080:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x10aa
            java.lang.Object r9 = r10.next()
            X.4tV r9 = (X.C276544tV) r9
            java.util.List r8 = r6.A08
            int r4 = r6.A03
            int r3 = r6.A02
            int r2 = r6.A01
            int r1 = r6.A00
            r18 = r9
            r19 = r4
            r20 = r3
            r21 = r2
            r22 = r1
            r17 = r12
            X.Vcy r1 = X.C18131Vm7.A01(r17, r18, r19, r20, r21, r22)
            r8.add(r1)
            goto L_0x1080
        L_0x10aa:
            java.lang.String r0 = r0.A0K(r11)     // Catch:{ IOException -> 0x10bc }
            if (r0 == 0) goto L_0x10bc
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException -> 0x10bc }
            com.instagram.model.mediasize.SpriteSheetInfoCandidatesImpl r0 = X.C66961rG.parseFromJson(r0)     // Catch:{ IOException -> 0x10bc }
            com.instagram.model.mediasize.SpritesheetInfo r0 = r0.A00     // Catch:{ IOException -> 0x10bc }
            r6.A05 = r0     // Catch:{ IOException -> 0x10bc }
        L_0x10bc:
            r2 = r15[r7]
            r1 = r15[r16]
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r6, r2, r1)
            return r0
        L_0x10c6:
            r0 = 0
            int r3 = X.C308216Te.A00(r8, r0)
            int r2 = X.C308216Te.A00(r9, r0)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x10d6:
            if (r53 != 0) goto L_0x1171
            java.lang.String r1 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x10e0:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            X.3mq r1 = r5.A0I()
            android.content.Context r0 = r2.A04
            java.lang.Object r10 = r1.ALg(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.bloks.stdlib.components.bkcomponentsspinner.SpinnerImageView"
            goto L_0x243d
        L_0x10f2:
            if (r53 != 0) goto L_0x1171
            java.lang.String r1 = "A render unit was defined for this node but none was found"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x10fc:
            r1 = 41
            X.4tV r7 = r0.A07(r1)
            if (r7 == 0) goto L_0x115f
            java.lang.Object r1 = r2.A05
            if (r1 == 0) goto L_0x1157
            X.6Rm r1 = (X.C307786Rm) r1
            java.lang.Object r0 = X.C307476Qg.A06(r1, r0)
            r0.getClass()
            X.Hqk r0 = (X.C55979Hqk) r0
            X.VkU r4 = r0.A00
            if (r4 == 0) goto L_0x22a6
            android.graphics.RectF r0 = r4.A01
            float r0 = r0.width()
            int r1 = (int) r0
            int r0 = X.AnonymousClass3XX.A00
            r3 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r3)
            android.graphics.RectF r6 = r4.A01
            float r0 = r6.height()
            int r0 = (int) r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            X.2Ta r7 = r7.AEy(r2, r1, r0)
            X.0qQ.A07(r7)
            android.graphics.RectF r1 = r4.A02
            float r0 = r1.width()
            int r4 = (int) r0
            float r0 = r1.height()
            int r3 = (int) r0
            float r0 = r6.left
            int r2 = (int) r0
            float r0 = r6.top
            int r1 = (int) r0
            r9 = 0
            X.Ty8 r0 = new X.Ty8
            r6 = r0
            r8 = r5
            r10 = r4
            r11 = r3
            r12 = r2
            r13 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x1157:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x115f:
            java.lang.String r1 = "Server should have ensured that the Tooltip always has a child."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x1167:
            if (r53 != 0) goto L_0x1171
            java.lang.String r1 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1171:
            X.3mq r1 = r5.A0I()
            android.content.Context r0 = r2.A04
            java.lang.Object r0 = r1.ALg(r0)
            android.view.View r0 = (android.view.View) r0
            r0.measure(r8, r9)
            int r3 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x118f:
            r3 = 35
            r1 = 0
            float r14 = r0.A02(r3, r1)
            java.util.List r6 = r0.A0L()
            r11 = 0
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x11bf
            java.lang.Object r0 = r6.get(r11)
        L_0x11a3:
            X.4tV r0 = (X.C276544tV) r0
            X.2Ta r0 = r0.AEy(r2, r8, r9)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r0)
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            X.TyW r0 = new X.TyW
            r0.<init>(r5, r3, r2, r1)
            return r0
        L_0x11bf:
            r4 = 1
            r13 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x11cb
            java.lang.Object r0 = r6.get(r4)
            goto L_0x11a3
        L_0x11cb:
            java.lang.Object r1 = r6.get(r11)
            X.4tV r1 = (X.C276544tV) r1
            X.2Ta r3 = r1.AEy(r2, r8, r9)
            java.lang.Object r1 = r6.get(r4)
            X.4tV r1 = (X.C276544tV) r1
            X.2Ta r8 = r1.AEy(r2, r8, r9)
            int r6 = r3.getWidth()
            float r4 = (float) r6
            int r1 = r8.getWidth()
            int r1 = r1 - r6
            float r1 = (float) r1
            float r1 = r1 * r14
            float r4 = r4 + r1
            int r7 = (int) r4
            int r6 = r3.getHeight()
            float r4 = (float) r6
            int r1 = r8.getHeight()
            int r1 = r1 - r6
            float r1 = (float) r1
            float r1 = r1 * r14
            float r4 = r4 + r1
            int r6 = (int) r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Object r10 = r2.A05
            X.6Rm r10 = (X.C307786Rm) r10
            if (r10 == 0) goto L_0x1282
            java.lang.Object r12 = X.C307476Qg.A06(r10, r0)
            android.util.Pair r12 = (android.util.Pair) r12
            if (r12 == 0) goto L_0x127a
            r1 = 36
            boolean r0 = r0.A0R(r1, r11)
            if (r0 == 0) goto L_0x1273
            java.lang.Object r0 = r12.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            boolean r2 = X.C307476Qg.A0A(r10)
            X.6Sk r11 = new X.6Sk
            r11.<init>(r10, r0, r2)
            float r13 = r13 - r14
            java.lang.Float r2 = java.lang.Float.valueOf(r13)
            X.Q2w r1 = new X.Q2w
            r1.<init>()
            X.3ar r0 = new X.3ar
            r0.<init>(r1, r2)
            r11.A0D(r0)
            X.Ty8 r9 = new X.Ty8
            r9.<init>(r3, r11)
            java.lang.Object r0 = r12.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            boolean r2 = X.C307476Qg.A0A(r10)
            X.6Sk r3 = new X.6Sk
            r3.<init>(r10, r0, r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            X.Q2w r1 = new X.Q2w
            r1.<init>()
            X.3ar r0 = new X.3ar
            r0.<init>(r1, r2)
            r3.A0D(r0)
            X.Ty8 r0 = new X.Ty8
            r0.<init>(r8, r3)
            r4.add(r9)
            r4.add(r0)
        L_0x126d:
            X.TyW r0 = new X.TyW
            r0.<init>(r5, r4, r7, r6)
            return r0
        L_0x1273:
            r4.add(r3)
            r4.add(r8)
            goto L_0x126d
        L_0x127a:
            java.lang.String r1 = "Controller for component returned null but it should have returned a Pair<Integer, Integer>"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1282:
            java.lang.String r1 = "Calculate layout was called without a valid BloksContext"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x128a:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            r2 = 0
            if (r0 != 0) goto L_0x12a7
            r1 = 0
        L_0x1292:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 == 0) goto L_0x129c
            int r2 = android.view.View.MeasureSpec.getSize(r9)
        L_0x129c:
            int r2 = java.lang.Math.min(r1, r2)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r2, r2)
            return r0
        L_0x12a7:
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x1292
        L_0x12ac:
            if (r53 == 0) goto L_0x1335
            java.lang.Object r11 = r2.A05
            if (r11 == 0) goto L_0x1335
            X.6Rm r11 = (X.C307786Rm) r11
            X.0lg r1 = X.C308206Td.A0A(r11)
            com.instagram.common.session.UserSession r10 = X.0Gl.A01(r1)
            if (r10 != 0) goto L_0x12d5
            java.lang.String r1 = "MiniBloksShoppingProductTileBinderUtils"
            java.lang.String r0 = "Attempt to render product tile component outside logged in user context"
            X.1Kn.A02(r1, r0)
            r0 = 0
            int r3 = X.C308216Te.A00(r8, r0)
            int r2 = X.C308216Te.A00(r9, r0)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x12d5:
            r1 = 35
            X.4tV r1 = r0.A07(r1)
            if (r1 == 0) goto L_0x132d
            com.instagram.user.model.Product r1 = X.C18132Vm8.A01(r1)
            com.instagram.model.shopping.productfeed.ProductFeedItem r7 = new com.instagram.model.shopping.productfeed.ProductFeedItem
            r7.<init>(r1)
            X.3mq r3 = r5.A0I()
            android.content.Context r1 = r2.A04
            java.lang.Object r6 = r3.ALg(r1)
            android.view.View r6 = (android.view.View) r6
            X.Wd4 r1 = X.C18706VyX.A00
            r4 = 1
            if (r1 != 0) goto L_0x12fd
            X.Wd4 r1 = X.C18706VyX.A00(r11, r0, r10, r4)
            X.C18706VyX.A00 = r1
        L_0x12fd:
            X.C18706VyX.A02(r0, r7)
            r2 = 0
            X.UEM r1 = new X.UEM
            r1.<init>(r6, r2)
            X.Wd4 r11 = X.C18706VyX.A00
            r3 = 0
            X.Vj5 r15 = new X.Vj5
            r15.<init>()
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r4)
            r12 = r0
            r13 = r10
            r14 = r3
            r16 = r7
            r17 = r1
            X.C18706VyX.A01(r11, r12, r13, r14, r15, r16, r17, r18)
            r6.measure(r8, r9)
            int r2 = r6.getMeasuredWidth()
            int r1 = r6.getMeasuredHeight()
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r3, r2, r1)
            return r0
        L_0x132d:
            java.lang.String r1 = "Product component in Product Tile Binder is null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1335:
            java.lang.String r1 = "Product Tile binder returns a null render unit or a null bloksContext"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x133d:
            r1 = 35
            X.4tV r7 = r0.A07(r1)
            if (r7 != 0) goto L_0x22a6
            java.lang.String r1 = "Dialog wrapper has no child"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x134d:
            r12 = 0
            r3 = 35
            X.4tV r7 = r0.A07(r3)
            if (r7 == 0) goto L_0x138d
            r1 = 36
            X.4tV r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x22a6
            X.4tV r0 = X.C46617Dhx.A00(r0)
            if (r0 == 0) goto L_0x22a6
            X.4tV r6 = r0.A07(r3)
            if (r6 == 0) goto L_0x22a6
            android.content.Context r4 = r2.A04
            X.3dB[] r3 = r2.A07
            java.lang.Object r0 = r2.A05
            X.6Rm r0 = (X.C307786Rm) r0
            X.WJr r1 = new X.WJr
            r1.<init>(r4, r0, r6, r3)
            X.2Ta r7 = r7.AEy(r2, r8, r9)
            int r10 = r7.getWidth()
            int r11 = r7.getHeight()
            X.Ty8 r0 = new X.Ty8
            r6 = r0
            r8 = r5
            r9 = r1
            r13 = r12
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x138d:
            java.lang.String r1 = "Screen wrapper has no child"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1395:
            r4 = 0
            r1 = 38
            int r6 = r0.A03(r1, r4)
            android.content.Context r3 = r2.A04
            android.content.res.Resources r1 = r3.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.densityDpi
            int r1 = r1 / 160
            int r6 = r6 * r1
            int r2 = X.C308216Te.A01(r6, r8)
            r1 = 36
            int r1 = r0.A03(r1, r4)
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            int r0 = r0 / 160
            int r1 = r1 * r0
            int r3 = X.C308216Te.A01(r1, r9)
            int[] r2 = new int[]{r2, r3}
            r1 = r2[r4]
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r2, r1, r3)
            return r0
        L_0x13d2:
            r1 = 36
            X.4tV r6 = r0.A07(r1)
            if (r6 == 0) goto L_0x142b
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r7)
            r1 = 40
            X.4tV r4 = r0.A07(r1)
            r3 = 0
            if (r4 == 0) goto L_0x1401
            X.2Ta r1 = r4.AEy(r2, r8, r10)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            long r14 = X.C244873bt.A00(r8, r10)
            r10 = r2
            r11 = r1
            r12 = r4
            r13 = r3
            X.6Sh r3 = X.C308006Si.A00(r10, r11, r12, r13, r14)
        L_0x1401:
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            if (r3 == 0) goto L_0x1429
            X.3dH r0 = r3.A01
            int r13 = r0.A00()
        L_0x140d:
            int r1 = r1 - r13
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r7)
            X.2Ta r7 = r6.AEy(r2, r8, r0)
            int r10 = android.view.View.MeasureSpec.getSize(r8)
            int r11 = r7.getHeight()
            int r11 = r11 + r13
            r12 = 0
            X.Ty8 r0 = new X.Ty8
            r6 = r0
            r8 = r5
            r9 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x1429:
            r13 = 0
            goto L_0x140d
        L_0x142b:
            java.lang.String r1 = "bk.cds.bottomsheet.Wrapper has no content."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1433:
            X.SCZ.A01 = r54
            X.SS4.A02 = r54
            r1 = 44
            X.4tV r0 = r0.A07(r1)
            X.SS4.A03 = r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r0 = android.view.View.MeasureSpec.getSize(r9)
            int r2 = java.lang.Math.min(r1, r0)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r2, r2)
            return r0
        L_0x1452:
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r4 = X.C308216Te.A01(r1, r8)
            int r6 = X.C308216Te.A01(r1, r9)
            r1 = 44
            java.util.List r0 = r0.A0M(r1)
            java.util.ArrayList r0 = X.C16862V8r.A00(r0)
            java.util.Iterator r7 = r0.iterator()
            r3 = 1071877689(0x3fe38e39, float:1.7777778)
        L_0x146e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x148a
            java.lang.Object r2 = r7.next()
            com.instagram.model.mediasize.VideoUrlImpl r2 = (com.instagram.model.mediasize.VideoUrlImpl) r2
            int r1 = r2.A02
            r0 = -1
            if (r1 == r0) goto L_0x146e
            float r3 = (float) r1
            int r0 = r2.A00
            float r0 = (float) r0
            float r3 = r3 / r0
            int r1 = r2.A01
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L_0x146e
        L_0x148a:
            float r2 = (float) r4
            float r1 = (float) r6
            float r0 = r2 / r1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x149b
            float r2 = r2 / r3
            int r6 = (int) r2
        L_0x1494:
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r4, r6)
            return r0
        L_0x149b:
            float r1 = r1 * r3
            int r4 = (int) r1
            goto L_0x1494
        L_0x149e:
            r14 = 0
            r16 = 1
            java.lang.Object r1 = r2.A05
            r17 = r1
            java.lang.String r21 = "Required value was null."
            if (r1 == 0) goto L_0x1eae
            r1 = r17
            X.6Rm r1 = (X.C307786Rm) r1
            r17 = r1
            r4 = 2131441359(0x7f0b36cf, float:1.8504727E38)
            android.util.SparseArray r3 = r1.A01
            java.lang.Object r26 = r3.get(r4)
            r1 = r26
            X.6Q9 r1 = (X.AnonymousClass6Q9) r1
            r26 = r1
            r1 = 2131442630(0x7f0b3bc6, float:1.8507305E38)
            java.lang.Object r6 = r3.get(r1)
            X.0Ae r6 = (X.C58840Ae) r6
            android.content.Context r1 = r2.A04
            r24 = r1
            X.90O r12 = X.AnonymousClass90O.A00(r24)
            r1 = 62
            X.4tV r3 = r0.A07(r1)
            if (r3 == 0) goto L_0x14e7
            r1 = r17
            int r1 = X.AnonymousClass6TP.A00(r1, r3, r14)
            r12.A0N = r1
            r1 = 1073741824(0x40000000, float:2.0)
            r12.A08 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r12.A07 = r1
        L_0x14e7:
            r1 = 43
            java.lang.String r1 = r0.A0K(r1)
            if (r1 == 0) goto L_0x14fb
            int r37 = X.AnonymousClass6Su.A06(r1)     // Catch:{ 3yO -> 0x14f4 }
            goto L_0x14ff
        L_0x14f4:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x14fb:
            r37 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x1506
        L_0x14ff:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r37)
            X.AnonymousClass90O.A01(r12, r1)
        L_0x1506:
            java.lang.String r11 = "12sp"
            r1 = 38
            r3 = r11
            java.lang.String r1 = r0.A0K(r1)
            if (r1 == 0) goto L_0x1512
            r3 = r1
        L_0x1512:
            int r39 = X.AnonymousClass6OU.A00(r3)
            java.lang.String r3 = "48sp"
            r1 = 36
            java.lang.String r1 = r0.A0K(r1)
            if (r1 == 0) goto L_0x1521
            r3 = r1
        L_0x1521:
            int r40 = X.AnonymousClass6OU.A00(r3)
            r1 = 51
            java.lang.String r10 = r0.A0K(r1)
            if (r10 == 0) goto L_0x1550
            r1 = 3
            java.lang.Integer[] r7 = X.AnonymousClass05K.A00(r1)
            int r4 = r7.length
            r3 = 0
        L_0x1534:
            if (r3 >= r4) goto L_0x1550
            r33 = r7[r3]
            int r1 = r33.intValue()
            switch(r1) {
                case 1: goto L_0x154a;
                case 2: goto L_0x154d;
                default: goto L_0x153f;
            }
        L_0x153f:
            java.lang.String r1 = "CHARACTER"
        L_0x1541:
            boolean r1 = r1.equalsIgnoreCase(r10)
            if (r1 != 0) goto L_0x1552
            int r3 = r3 + 1
            goto L_0x1534
        L_0x154a:
            java.lang.String r1 = "WORD"
            goto L_0x1541
        L_0x154d:
            java.lang.String r1 = "LINE"
            goto L_0x1541
        L_0x1550:
            java.lang.Integer r33 = X.AnonymousClass05K.A01
        L_0x1552:
            r3 = 50
            r1 = 0
            float r35 = r0.A02(r3, r1)
            r1 = 140(0x8c, float:1.96E-43)
            X.4tV r1 = r0.A07(r1)
            r32 = 0
            if (r1 == 0) goto L_0x1582
            if (r26 == 0) goto L_0x15bd
            r3 = r26
            com.instagram.common.session.UserSession r10 = r3.A00
            X.0Tu r7 = X.0Tu.A05
            r3 = 36312733013378287(0x81023d001604ef, double:3.027656805075313E-306)
            boolean r3 = X.182.A06(r7, r10, r3)
            if (r3 == 0) goto L_0x15bd
            r3 = r17
            int r3 = X.AnonymousClass6TP.A00(r3, r1, r14)
            int r3 = r3 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 != 0) goto L_0x15bd
        L_0x1582:
            r1 = 44
            r13 = -1
            int r1 = r0.A03(r1, r13)
            if (r1 == 0) goto L_0x158c
            r13 = r1
        L_0x158c:
            r1 = 38
            java.lang.String r1 = r0.A0K(r1)
            if (r1 == 0) goto L_0x1595
            r11 = r1
        L_0x1595:
            java.lang.CharSequence r1 = X.00l.A0B(r11)
            java.lang.String r4 = r1.toString()
            if (r4 == 0) goto L_0x15bb
            int r3 = r4.length()
        L_0x15a3:
            int r1 = r4.length()
            r38 = 1
            if (r1 == 0) goto L_0x15d4
            r10 = 2
            java.lang.String r7 = "%"
            r1 = r16
            X.0qQ.A0B(r7, r1)
            boolean r1 = r4.endsWith(r7)
            if (r1 != 0) goto L_0x15d4
            int r3 = r3 - r10
            goto L_0x15c8
        L_0x15bb:
            r3 = 0
            goto L_0x15a3
        L_0x15bd:
            r3 = r17
            int r1 = X.AnonymousClass6TP.A00(r3, r1, r14)
            java.lang.Integer r32 = java.lang.Integer.valueOf(r1)
            goto L_0x1582
        L_0x15c8:
            java.lang.String r1 = r4.substring(r3)     // Catch:{ 3yO | StringIndexOutOfBoundsException -> 0x15d6 }
            X.0qQ.A07(r1)     // Catch:{ 3yO | StringIndexOutOfBoundsException -> 0x15d6 }
            int r38 = X.AnonymousClass6Su.A07(r1)     // Catch:{ 3yO | StringIndexOutOfBoundsException -> 0x15d6 }
            goto L_0x15d6
        L_0x15d4:
            r38 = 2
        L_0x15d6:
            r1 = 32
            java.util.List r3 = r0.A0N(r1)
            X.0qQ.A07(r3)
            r1 = r17
            X.6TZ r1 = X.AnonymousClass6TV.A01(r1, r0, r3)
            java.lang.CharSequence r4 = r1.A00
            r1 = 53
            boolean r42 = r0.A0R(r1, r14)
            r47 = 0
            if (r26 == 0) goto L_0x1729
            r1 = r26
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r1 = X.0Tu.A05
            r10 = 36594207990679188(0x82023d001f0694, double:3.2056627141291627E-306)
            long r10 = X.182.A01(r1, r3, r10)
            int r1 = (int) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
        L_0x1605:
            int r7 = r4.length()
            X.2HY r3 = new X.2HY
            r1 = r16
            r3.<init>(r1, r7)
            if (r10 == 0) goto L_0x1620
            int r1 = r10.intValue()
            boolean r3 = r3.A01(r1)
            if (r3 == 0) goto L_0x1620
            java.lang.CharSequence r4 = r4.subSequence(r14, r1)
        L_0x1620:
            android.text.SpannableString r28 = android.text.SpannableString.valueOf(r4)
            r4 = 45
            java.util.List r3 = r0.A0N(r4)
            X.0qQ.A07(r3)
            boolean r1 = r3.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x1725
            r1 = r17
            X.6TZ r1 = X.AnonymousClass6TV.A01(r1, r0, r3)
            java.lang.CharSequence r1 = r1.A00
            android.text.SpannableString r29 = android.text.SpannableString.valueOf(r1)
        L_0x1641:
            r1 = 46
            boolean r43 = r0.A0R(r1, r14)
            r3 = 54
            r1 = 1065353216(0x3f800000, float:1.0)
            float r36 = r0.A02(r3, r1)
            r1 = 55
            boolean r44 = r0.A0R(r1, r14)
            X.0qQ.A0A(r28)
            r1 = 52
            X.4uI r3 = r0.A0A(r1)
            if (r3 == 0) goto L_0x1722
            X.JGF r10 = new X.JGF
            r1 = r17
            r10.<init>(r4, r1, r3)
        L_0x1667:
            r3 = 59
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r15 = r0.A02(r3, r1)
            r3 = 56
            float r11 = r0.A02(r3, r1)
            r3 = 58
            float r7 = r0.A02(r3, r1)
            r4 = 57
            r3 = 1050253722(0x3e99999a, float:0.3)
            float r49 = r0.A02(r4, r3)
            r4 = 61
            r3 = 1039516303(0x3df5c28f, float:0.12)
            float r50 = r0.A02(r4, r3)
            int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            r3 = 0
            if (r4 != 0) goto L_0x1693
            r3 = 1
        L_0x1693:
            r48 = 0
            if (r3 == 0) goto L_0x171c
            r46 = r47
        L_0x1699:
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x16a1
            java.lang.Float r47 = java.lang.Float.valueOf(r11)
        L_0x16a1:
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x16a9
            java.lang.Float r48 = java.lang.Float.valueOf(r7)
        L_0x16a9:
            X.6OV r31 = new X.6OV
            r45 = r31
            r45.<init>(r46, r47, r48, r49, r50)
            X.6OW r7 = new X.6OW
            r27 = r7
            r30 = r12
            r34 = r10
            r41 = r13
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r1 = r17
            java.lang.Object r18 = X.C307476Qg.A06(r1, r0)
            r1 = r18
            X.6OX r1 = (X.AnonymousClass6OX) r1
            r18 = r1
            r23 = 0
            if (r1 == 0) goto L_0x1719
            X.6OZ r4 = r1.A04
        L_0x16cf:
            r19 = 0
            r3 = 0
            if (r4 == 0) goto L_0x1730
            int r1 = r4.A01
            if (r1 != r8) goto L_0x1730
            int r1 = r4.A00
            if (r1 != r9) goto L_0x1730
            float r1 = r7.A00
            int r10 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r10 <= 0) goto L_0x1730
            r10 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x1730
            X.6OW r7 = r4.A03
            android.text.SpannableString r2 = r7.A07
            int r0 = r2.length()
            java.lang.Class<X.U2L> r6 = X.U2L.class
            java.lang.Object[] r5 = r2.getSpans(r14, r0, r6)
            android.text.SpannableString r2 = r7.A08
            if (r2 == 0) goto L_0x1704
            int r0 = r2.length()
            java.lang.Object[] r0 = r2.getSpans(r14, r0, r6)
            if (r0 != 0) goto L_0x1706
        L_0x1704:
            X.U2L[] r0 = new X.U2L[r14]
        L_0x1706:
            X.0qQ.A0A(r5)
            java.lang.Object[] r5 = X.0Yw.A0a(r5, r0)
            int r2 = r5.length
        L_0x170e:
            if (r3 >= r2) goto L_0x172d
            r0 = r5[r3]
            X.U2L r0 = (X.U2L) r0
            r0.A00 = r1
            int r3 = r3 + 1
            goto L_0x170e
        L_0x1719:
            r4 = r23
            goto L_0x16cf
        L_0x171c:
            java.lang.Float r46 = java.lang.Float.valueOf(r15)
            goto L_0x1699
        L_0x1722:
            r10 = 0
            goto L_0x1667
        L_0x1725:
            r29 = r47
            goto L_0x1641
        L_0x1729:
            r10 = r47
            goto L_0x1605
        L_0x172d:
            X.2Ta r0 = r4.A02
            return r0
        L_0x1730:
            android.text.TextPaint r20 = new android.text.TextPaint
            r20.<init>()
            if (r53 == 0) goto L_0x1ea6
            X.6TT r5 = (X.AnonymousClass6TT) r5
            android.text.SpannableString r1 = r7.A07
            r46 = r1
            int r12 = r7.A04
            int r11 = r7.A03
            if (r12 == r11) goto L_0x183f
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            int r3 = android.view.View.MeasureSpec.getSize(r8)
            float r13 = (float) r3
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            float r10 = (float) r3
            r4 = r19
            r1.set(r4, r4, r13, r10)
            X.VyV r33 = X.C18704VyV.A00
            java.lang.String r3 = "1sp"
            int r38 = X.AnonymousClass6OU.A00(r3)
            r27 = r1
            r28 = r46
            r29 = r20
            r30 = r2
            r31 = r5
            r32 = r7
            r34 = r8
            r35 = r9
            r36 = r12
            r37 = r11
            X.VUt r10 = X.C18704VyV.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            boolean r3 = r10.A01
            r4 = -1
            if (r3 == 0) goto L_0x17dd
            r10 = -1
        L_0x177d:
            boolean r3 = r7.A0F
            if (r3 == 0) goto L_0x17e0
            if (r10 != r4) goto L_0x17e0
            r10 = -1
        L_0x1784:
            boolean r1 = r7.A0F
            r22 = -1
            if (r1 == 0) goto L_0x1852
            r1 = r22
            if (r10 != r1) goto L_0x1852
            if (r6 == 0) goto L_0x17c6
            int r4 = r7.A02
            java.lang.String r1 = "ads_text_overlay_client_logging_client_invalidation"
            X.0wc r6 = (X.0wc) r6
            X.0kJ r0 = r6.A00
            X.0Aj r3 = r6.A00(r0, r1)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x17c6
            r0 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "number_of_invalidations"
            r3.A9F(r0, r1)
            java.lang.String r1 = "original_overlay_text"
            r0 = r23
            r3.AAJ(r1, r0)
            java.lang.String r1 = "actual_overlay_text"
            r3.AAJ(r1, r0)
            long r0 = (long) r4
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "number_of_lines"
            r3.A9F(r0, r1)
            r3.Cgf()
        L_0x17c6:
            X.90O r0 = r7.A09
            r1 = r2
            r2 = r5
            r3 = r0
            r4 = r46
            r5 = r14
            r6 = r14
            X.6Tc r0 = X.C308176Ta.A02(r1, r2, r3, r4, r5, r6)
            X.2Th r2 = r0.A01
            java.lang.Object r1 = r0.A02
            X.6Tc r0 = new X.6Tc
            r0.<init>(r2, r1, r14, r14)
            return r0
        L_0x17dd:
            int r10 = r10.A00
            goto L_0x177d
        L_0x17e0:
            if (r10 != r4) goto L_0x1840
            if (r26 == 0) goto L_0x183f
            r3 = r26
            com.instagram.common.session.UserSession r13 = r3.A00
            X.0Tu r10 = X.0Tu.A05
            r3 = 36312733012788454(0x81023d000d04e6, double:3.0276568047023005E-306)
            boolean r3 = X.182.A06(r10, r13, r3)
            if (r3 == 0) goto L_0x183f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "Width: "
            r4.append(r3)
            r4.append(r8)
            java.lang.String r3 = ", Height: "
            r4.append(r3)
            r4.append(r9)
            java.lang.String r3 = ", TextAlign, "
            r4.append(r3)
            int r3 = r7.A05
            r4.append(r3)
            java.lang.String r3 = ", MinTextSize: "
            r4.append(r3)
            r4.append(r12)
            java.lang.String r3 = ", MaxTextSize: "
            r4.append(r3)
            r4.append(r11)
            java.lang.String r3 = ", MaxLines: "
            r4.append(r3)
            int r3 = r7.A02
            r4.append(r3)
            java.lang.String r3 = ", TextRect: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            java.lang.String r1 = "showreel_dynamic_text_calculate_layout"
            X.1Kn.A02(r1, r3)
        L_0x183f:
            r10 = r12
        L_0x1840:
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            r1 = r16
            r3.<init>(r10, r1)
            int r4 = r46.length()
            r1 = r46
            r1.setSpan(r3, r14, r4, r14)
            goto L_0x1784
        L_0x1852:
            int r4 = r7.A06
            float r3 = (float) r10
            android.content.res.Resources r1 = r24.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r4, r3, r1)
            int r4 = (int) r1
            if (r18 == 0) goto L_0x1868
            r1 = r18
            r1.A03 = r4
        L_0x1868:
            X.6OV r3 = r7.A0A
            java.lang.Float r1 = r3.A03
            if (r1 == 0) goto L_0x1c78
            float r15 = r1.floatValue()
        L_0x1872:
            java.lang.Integer r1 = r7.A0C
            r24 = r1
            if (r1 == 0) goto L_0x1c74
            java.lang.Float r1 = r3.A04
            if (r1 == 0) goto L_0x1c6e
            float r1 = r1.floatValue()
        L_0x1880:
            java.lang.Float r6 = r3.A02
            if (r6 == 0) goto L_0x1c68
            float r6 = r6.floatValue()
        L_0x1888:
            int r3 = android.view.View.MeasureSpec.getMode(r9)
            r25 = 0
            if (r3 != 0) goto L_0x1892
            r25 = 1
        L_0x1892:
            r42 = r8
            if (r24 == 0) goto L_0x18ac
            int r3 = android.view.View.MeasureSpec.getSize(r8)
            float r3 = (float) r3
            r11 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 * r15
            float r3 = r3 - r11
            int r3 = (int) r3
            int r11 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = X.AnonymousClass3XX.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r42 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r3)
        L_0x18ac:
            if (r25 == 0) goto L_0x1c56
            r43 = 0
        L_0x18b0:
            X.90O r3 = r7.A09
            r45 = r3
            r38 = r2
            r39 = r5
            r40 = r3
            r41 = r46
            X.6Tc r3 = X.C308176Ta.A02(r38, r39, r40, r41, r42, r43)
            java.lang.Object r3 = r3.A02
            X.6Tb r3 = (X.C308186Tb) r3
            if (r3 == 0) goto L_0x1e9e
            android.text.Layout r3 = r3.A02
            r29 = r3
            r20.reset()
            android.text.TextPaint r11 = r29.getPaint()
            r3 = r20
            r3.set(r11)
            float r3 = (float) r4
            r32 = r3
            r4 = r20
            r4.setTextSize(r3)
            r3 = r23
            int r21 = r4.getFontMetricsInt(r3)
            int r3 = r7.A02
            r28 = r3
            r11 = r3
            if (r26 == 0) goto L_0x1903
            r3 = r26
            com.instagram.common.session.UserSession r3 = r3.A00
            r27 = r3
            X.0Tu r20 = X.0Tu.A05
            r12 = 36312733013574898(0x81023d001904f2, double:3.027656805199651E-306)
            r3 = r12
            r13 = r20
            r12 = r27
            boolean r3 = X.182.A06(r13, r12, r3)
            if (r3 == 0) goto L_0x1905
        L_0x1903:
            if (r25 != 0) goto L_0x1930
        L_0x1905:
            boolean r3 = r7.A0G
            r4 = r9
            if (r3 == 0) goto L_0x190c
            r4 = r43
        L_0x190c:
            int r11 = android.view.View.MeasureSpec.getSize(r4)
            int r4 = r29.getTopPadding()
            int r11 = r11 - r4
            int r4 = r29.getBottomPadding()
            int r11 = r11 - r4
            int r11 = r11 / r21
            if (r3 != 0) goto L_0x1930
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            int r3 = r29.getHeight()
            if (r4 >= r3) goto L_0x1930
            int r3 = r29.getLineCount()
            if (r3 < r11) goto L_0x1930
            int r11 = r11 + -1
        L_0x1930:
            if (r26 == 0) goto L_0x1946
            r3 = r26
            com.instagram.common.session.UserSession r3 = r3.A00
            r12 = r3
            X.0Tu r13 = X.0Tu.A05
            r20 = 36312733013509361(0x81023d001804f1, double:3.027656805158205E-306)
            r3 = r20
            boolean r3 = X.182.A06(r13, r12, r3)
            if (r3 == 0) goto L_0x1c4a
        L_0x1946:
            r4 = r22
            r3 = r28
            if (r3 != r4) goto L_0x1c4a
            if (r11 <= r4) goto L_0x1956
        L_0x194e:
            r3 = r45
            r3.A0I = r11
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r3.A0T = r4
        L_0x1956:
            android.text.SpannableString r3 = r7.A08
            if (r3 == 0) goto L_0x196c
            android.text.style.AbsoluteSizeSpan r11 = new android.text.style.AbsoluteSizeSpan
            r4 = r16
            r11.<init>(r10, r4)
            int r4 = r3.length()
            r3.setSpan(r11, r14, r4, r14)
            r4 = r45
            r4.A0Y = r3
        L_0x196c:
            if (r24 == 0) goto L_0x1a07
            X.90P r10 = X.AnonymousClass90P.A02
            r4 = r45
            r4.A0X = r10
            r4.A00 = r15
            r4.A01 = r15
            X.0sL r4 = r7.A0D
            if (r4 != 0) goto L_0x1a07
            boolean r4 = r7.A0E
            if (r4 != 0) goto L_0x1a07
            X.6Tc r4 = X.C308176Ta.A02(r38, r39, r40, r41, r42, r43)
            X.0qQ.A0A(r4)
            int r40 = r24.intValue()
            java.lang.Object r10 = r4.A02
            java.lang.String r4 = "null cannot be cast to non-null type com.facebook.rendercore.text.TextMeasurementUtils.TextLayout"
            X.0qQ.A0C(r10, r4)
            X.6Tb r10 = (X.C308186Tb) r10
            int r12 = android.view.View.MeasureSpec.getSize(r9)
            android.text.Layout r4 = r10.A02
            r11 = 0
            if (r4 == 0) goto L_0x19a1
            int r11 = r4.getHeight()
        L_0x19a1:
            int r4 = r12 - r11
            float r4 = (float) r4
            r13 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r13
            if (r12 >= r11) goto L_0x1c30
            r1 = 0
            r6 = 0
        L_0x19ab:
            r4 = 1082130432(0x40800000, float:4.0)
            float r39 = r32 / r4
            r4 = 1090519040(0x41000000, float:8.0)
            int r4 = (r39 > r4 ? 1 : (r39 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x19b7
            r39 = 1090519040(0x41000000, float:8.0)
        L_0x19b7:
            float r4 = r7.A01
            float r39 = r39 * r4
            r4 = r17
            java.lang.Object r4 = X.C307476Qg.A06(r4, r0)
            r4.getClass()
            X.6OX r4 = (X.AnonymousClass6OX) r4
            r4.A02 = r15
            r4.A01 = r1
            r4.A00 = r6
            android.text.Layout r4 = r10.A02
            X.6OY r12 = new X.6OY
            r33 = r12
            r34 = r4
            r35 = r15
            r36 = r15
            r37 = r1
            r38 = r6
            r33.<init>(r34, r35, r36, r37, r38, r39, r40)
            int r11 = r46.length()
            r10 = 18
            r4 = r46
            r4.setSpan(r12, r14, r11, r10)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            X.0eP r4 = new X.0eP
            r4.<init>(r1, r6)
            java.lang.Object r1 = r4.A00
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r4 = r4.A01
            java.lang.Number r4 = (java.lang.Number) r4
            float r6 = r4.floatValue()
        L_0x1a07:
            X.0sL r10 = r7.A0D
            if (r10 == 0) goto L_0x1cf1
            boolean r4 = r7.A0E
            if (r4 != 0) goto L_0x1cf1
            float r12 = r7.A01
            java.lang.Integer r4 = r7.A0B
            r37 = r4
            float r4 = r7.A00
            r22 = r4
            r11 = r16
            r4 = r37
            X.0qQ.A0B(r4, r11)
            r11 = 7
            r4 = r46
            X.0qQ.A0B(r4, r11)
            r11 = 9
            r4 = r45
            X.0qQ.A0B(r4, r11)
            r38 = r2
            r39 = r5
            r40 = r4
            X.6Tc r4 = X.C308176Ta.A02(r38, r39, r40, r41, r42, r43)
            java.lang.Object r11 = r4.A02
            java.lang.String r21 = "null cannot be cast to non-null type com.facebook.rendercore.text.TextMeasurementUtils.TextLayout"
            r4 = r21
            X.0qQ.A0C(r11, r4)
            X.6Tb r11 = (X.C308186Tb) r11
            android.text.Layout r4 = r11.A02
            r44 = r4
            X.VgZ r31 = new X.VgZ
            r4 = r31
            r4.<init>(r10)
            X.HpO r20 = new X.HpO
            r20.<init>()
            r4 = 1082130432(0x40800000, float:4.0)
            float r32 = r32 / r4
            r4 = 1090519040(0x41000000, float:8.0)
            int r4 = (r32 > r4 ? 1 : (r32 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x1a5e
            r32 = 1090519040(0x41000000, float:8.0)
        L_0x1a5e:
            float r32 = r32 * r12
            java.util.ArrayList r30 = new java.util.ArrayList
            r30.<init>()
            X.Wz6 r29 = new X.Wz6
            r13 = r44
            r12 = r31
            r11 = r30
            r10 = r22
            r4 = r29
            r4.<init>(r13, r12, r11, r10)
            X.0qQ.A0A(r44)
            r33 = r13
            r34 = r46
            r35 = r3
            r36 = r20
            r38 = r4
            r39 = r14
            int r28 = X.HSZ.A00(r33, r34, r35, r36, r37, r38, r39)
            r38 = r2
            r39 = r5
            X.6Tc r4 = X.C308176Ta.A02(r38, r39, r40, r41, r42, r43)
            java.lang.Object r10 = r4.A02
            r4 = r21
            X.0qQ.A0C(r10, r4)
            X.6Tb r10 = (X.C308186Tb) r10
            android.text.Layout r4 = r10.A02
            r27 = r4
            X.0qQ.A0A(r27)
            java.lang.CharSequence r10 = r44.getText()
            X.0qQ.A07(r10)
            if (r3 == 0) goto L_0x1c2c
            r4 = r3
        L_0x1aa9:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r4 = X.00l.A0D(r10, r4)
            int r39 = r4.length()
            r33 = r27
            r38 = r29
            X.HSZ.A00(r33, r34, r35, r36, r37, r38, r39)
            r10 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            if (r3 == 0) goto L_0x1b19
            java.lang.CharSequence r4 = r27.getText()
            X.0qQ.A07(r4)
            boolean r4 = X.00l.A0a(r4, r3)
            if (r4 == 0) goto L_0x1b19
            java.lang.CharSequence r4 = r27.getText()
            X.0qQ.A07(r4)
            java.lang.CharSequence r4 = X.00l.A0D(r4, r3)
            int r26 = r4.length()
            int r11 = r37.intValue()
            if (r11 == r14) goto L_0x1bc8
            r4 = r16
            if (r11 == r4) goto L_0x1b9a
            r4 = 2
            if (r11 != r4) goto L_0x1c85
            int r4 = r3.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            X.0eP r13 = new X.0eP
            r13.<init>(r12, r4)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r26)
            int r4 = r3.length()
            int r26 = r26 + r4
            int r26 = r26 - r16
            java.lang.Integer r12 = java.lang.Integer.valueOf(r26)
            X.0eP r11 = new X.0eP
            r4 = r20
            r11.<init>(r4, r12)
            int r4 = r28 - r16
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            r4 = r29
            r4.invoke(r3, r13, r11, r12)
        L_0x1b19:
            int r12 = android.view.View.MeasureSpec.getSize(r9)
            int r11 = r44.getHeight()
            int r4 = r12 - r11
            float r4 = (float) r4
            r21 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r21
            if (r12 >= r11) goto L_0x1b8a
            r38 = 0
        L_0x1b2c:
            if (r12 >= r11) goto L_0x1b7a
            r39 = 0
        L_0x1b30:
            if (r24 == 0) goto L_0x1c8b
            int r41 = r24.intValue()
            X.Vsq r20 = new X.Vsq
            r33 = r20
            r34 = r27
            r35 = r30
            r36 = r15
            r37 = r15
            r40 = r32
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41)
            int r13 = r46.length()
            java.lang.Class<X.U2L> r12 = X.U2L.class
            r11 = 0
            r4 = r46
            java.lang.Object[] r13 = r4.getSpans(r14, r13, r12)
            if (r3 == 0) goto L_0x1b60
            int r4 = r3.length()
            java.lang.Object[] r3 = r3.getSpans(r14, r4, r12)
            if (r3 != 0) goto L_0x1b62
        L_0x1b60:
            X.U2L[] r3 = new X.U2L[r14]
        L_0x1b62:
            X.0qQ.A0A(r13)
            java.lang.Object[] r4 = X.0Yw.A0a(r13, r3)
            int r13 = r4.length
        L_0x1b6a:
            if (r11 >= r13) goto L_0x1c8b
            r3 = r4[r11]
            X.U2L r3 = (X.U2L) r3
            java.util.List r12 = r3.A02
            r3 = r20
            r12.add(r3)
            int r11 = r11 + 1
            goto L_0x1b6a
        L_0x1b7a:
            float r11 = r6 / r1
            float r4 = r4 * r11
            float r11 = java.lang.Math.abs(r4)
            r39 = r6
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x1b30
            r39 = r11
            goto L_0x1b30
        L_0x1b8a:
            float r13 = r1 / r6
            float r13 = r13 * r4
            float r20 = java.lang.Math.abs(r13)
            r38 = r1
            int r13 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r13 <= 0) goto L_0x1b2c
            r38 = r20
            goto L_0x1b2c
        L_0x1b9a:
            int r4 = r3.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            X.0eP r10 = new X.0eP
            r10.<init>(r12, r4)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r26)
            int r4 = r3.length()
            int r26 = r26 + r4
            int r26 = r26 - r16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r26)
            X.0eP r11 = new X.0eP
            r11.<init>(r12, r4)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r28)
            r4 = r29
            r4.invoke(r3, r10, r11, r12)
            r10 = 1
            goto L_0x1b19
        L_0x1bc8:
            java.lang.String r13 = r3.toString()
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r11 = r20
            r4 = r27
            java.util.ArrayList r22 = r11.A00(r4, r12, r13)
            int r21 = r22.size()
        L_0x1bda:
            r4 = r21
            if (r10 >= r4) goto L_0x1c26
            r4 = r22
            java.lang.Object r13 = r4.get(r10)
            java.lang.Object r4 = r4.get(r10)
            X.0eP r4 = (X.0eP) r4
            java.lang.Object r4 = r4.A00
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r4 = r4 + r26
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r4 = r22
            java.lang.Object r4 = r4.get(r10)
            X.0eP r4 = (X.0eP) r4
            java.lang.Object r4 = r4.A01
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r4 = r4 + r26
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            X.0eP r20 = new X.0eP
            r4 = r20
            r4.<init>(r11, r12)
            int r4 = r28 + r10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12 = r29
            r11 = r4
            r4 = r20
            r12.invoke(r3, r13, r4, r11)
            int r10 = r10 + 1
            goto L_0x1bda
        L_0x1c26:
            int r10 = r22.size()
            goto L_0x1b19
        L_0x1c2c:
            java.lang.String r4 = ""
            goto L_0x1aa9
        L_0x1c30:
            float r11 = r1 / r6
            float r13 = r6 / r1
            float r11 = r11 * r4
            float r12 = java.lang.Math.abs(r11)
            int r11 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x1c3e
            r1 = r12
        L_0x1c3e:
            float r4 = r4 * r13
            float r11 = java.lang.Math.abs(r4)
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x19ab
            r6 = r11
            goto L_0x19ab
        L_0x1c4a:
            r3 = r28
            if (r11 <= r3) goto L_0x1c4f
            r11 = r3
        L_0x1c4f:
            r3 = r16
            if (r11 >= r3) goto L_0x194e
            r11 = 1
            goto L_0x194e
        L_0x1c56:
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            float r3 = (float) r3
            float r3 = r3 - r1
            float r3 = r3 - r6
            int r11 = (int) r3
            int r3 = X.AnonymousClass3XX.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r43 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r3)
            goto L_0x18b0
        L_0x1c68:
            float r6 = (float) r4
            float r3 = r3.A01
            float r6 = r6 * r3
            goto L_0x1888
        L_0x1c6e:
            float r1 = (float) r4
            float r6 = r3.A01
            float r1 = r1 * r6
            goto L_0x1880
        L_0x1c74:
            r1 = 0
            r6 = 0
            goto L_0x1888
        L_0x1c78:
            java.lang.Integer r1 = r7.A0C
            if (r1 != 0) goto L_0x1c7f
            r15 = 0
            goto L_0x1872
        L_0x1c7f:
            float r15 = (float) r4
            float r1 = r3.A00
            float r15 = r15 * r1
            goto L_0x1872
        L_0x1c85:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x1c8b:
            int r28 = r28 + r10
            r3 = r31
            X.4Cq r12 = r3.A02
            X.JTh r11 = new X.JTh
            r10 = r3
            r4 = r23
            r3 = r28
            r11.<init>((X.C17820VgZ) r10, (X.AnonymousClass4D7) r4, (int) r3)
            X.19B r3 = X.19B.A00
            X.1Eo.A05(r3, r11, r12)
            int r11 = android.view.View.MeasureSpec.getSize(r9)
            r10 = 0
            if (r27 == 0) goto L_0x1cab
            int r10 = r27.getHeight()
        L_0x1cab:
            int r3 = r11 - r10
            float r4 = (float) r3
            float r4 = r4 / r21
            r12 = 0
            if (r11 >= r10) goto L_0x1da7
            r3 = 0
        L_0x1cb4:
            if (r11 < r10) goto L_0x1cc3
            float r10 = r1 / r15
            float r4 = r4 * r10
            float r10 = java.lang.Math.abs(r4)
            r12 = r1
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x1cc3
            r12 = r10
        L_0x1cc3:
            r4 = r17
            java.lang.Object r0 = X.C307476Qg.A06(r4, r0)
            r0.getClass()
            X.6OX r0 = (X.AnonymousClass6OX) r0
            r0.A02 = r6
            r0.A01 = r3
            r0.A00 = r12
            java.lang.Float r3 = java.lang.Float.valueOf(r15)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.0eP r0 = new X.0eP
            r0.<init>(r3, r1)
            java.lang.Object r1 = r0.A00
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r0 = r0.A01
            java.lang.Number r0 = (java.lang.Number) r0
            float r6 = r0.floatValue()
        L_0x1cf1:
            r38 = r2
            r39 = r5
            r40 = r45
            r41 = r46
            X.6Tc r26 = X.C308176Ta.A02(r38, r39, r40, r41, r42, r43)
            r0 = r26
            java.lang.Object r11 = r0.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.rendercore.text.TextMeasurementUtils.TextLayout"
            X.0qQ.A0C(r11, r0)
            r12 = r11
            X.6Tb r12 = (X.C308186Tb) r12
            boolean r0 = r7.A0G
            r23 = r0
            if (r0 == 0) goto L_0x1d94
            android.text.Layout r0 = r12.A02
            r10 = 0
            if (r0 == 0) goto L_0x1d18
            int r10 = r0.getHeight()
        L_0x1d18:
            float r0 = r1 + r6
            int r0 = (int) r0
            int r10 = r10 + r0
        L_0x1d1c:
            int r22 = android.view.View.MeasureSpec.getSize(r8)
            boolean r0 = r7.A0E
            r21 = r0
            if (r0 == 0) goto L_0x1db7
            boolean r0 = r11 instanceof X.C308186Tb
            if (r0 == 0) goto L_0x1db7
            if (r12 == 0) goto L_0x1db7
            android.text.Layout r13 = r12.A02
            if (r13 == 0) goto L_0x1db7
            int r20 = r13.getLineCount()
            r6 = 0
            r5 = 0
        L_0x1d36:
            r0 = r20
            if (r6 >= r0) goto L_0x1dba
            int r0 = r13.getLineStart(r6)
            int r3 = r13.getLineEnd(r6)
            java.lang.CharSequence r2 = r13.getText()
            java.lang.CharSequence r17 = r2.subSequence(r0, r3)
            java.lang.CharSequence r3 = X.00l.A0B(r17)
            java.lang.String r0 = r17.toString()
            java.lang.String r2 = r3.toString()
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x1d92
            java.lang.String r2 = r3.toString()
            r0 = r17
            int r4 = X.00l.A08(r0, r2, r14, r14)
            int r0 = r3.length()
            int r4 = r4 + r0
            android.text.TextPaint r2 = r13.getPaint()
            X.0qQ.A07(r2)
            int r0 = r17.length()
            if (r4 >= r0) goto L_0x1d92
            int r0 = r17.length()
            r3 = r2
            r2 = r0
            r0 = r17
            float r2 = r3.measureText(r0, r4, r2)
            float r2 = r2 + r19
        L_0x1d86:
            float r0 = r13.getLineWidth(r6)
            float r0 = r0 - r2
            float r5 = java.lang.Math.max(r5, r0)
            int r6 = r6 + 1
            goto L_0x1d36
        L_0x1d92:
            r2 = 0
            goto L_0x1d86
        L_0x1d94:
            if (r25 == 0) goto L_0x1da1
            android.text.Layout r0 = r12.A02
            r10 = 0
            if (r0 == 0) goto L_0x1d1c
            int r10 = r0.getHeight()
            goto L_0x1d1c
        L_0x1da1:
            int r10 = android.view.View.MeasureSpec.getSize(r9)
            goto L_0x1d1c
        L_0x1da7:
            float r3 = r15 / r1
            float r3 = r3 * r4
            float r20 = java.lang.Math.abs(r3)
            r3 = r15
            int r13 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r13 <= 0) goto L_0x1cb4
            r3 = r20
            goto L_0x1cb4
        L_0x1db7:
            r2 = r22
            goto L_0x1dbf
        L_0x1dba:
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r15
            float r5 = r5 + r0
            int r2 = (int) r5
        L_0x1dbf:
            if (r24 != 0) goto L_0x1dc3
            if (r21 == 0) goto L_0x1de1
        L_0x1dc3:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r23 != 0) goto L_0x1dca
            if (r25 == 0) goto L_0x1e1d
            r1 = 0
        L_0x1dca:
            r12.A01 = r1
            int r22 = r22 - r2
            r0 = r22
            float r3 = (float) r0
            float r3 = r3 / r4
            int r1 = r7.A05
            r0 = r16
            if (r1 == r0) goto L_0x1e0e
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r1 == r0) goto L_0x1dfe
            float r0 = r12.A00
        L_0x1ddf:
            r12.A00 = r0
        L_0x1de1:
            r0 = r26
            X.2Th r1 = r0.A01
            X.6Tc r0 = new X.6Tc
            r0.<init>(r1, r11, r2, r10)
            if (r18 == 0) goto L_0x1e67
            X.6OZ r2 = new X.6OZ
            r2.<init>()
            r2.A01 = r8
            r2.A00 = r9
            r2.A03 = r7
            r2.A02 = r0
            r1 = r18
            r1.A04 = r2
            return r0
        L_0x1dfe:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            float r0 = (float) r0
            android.text.Layout r1 = r12.A02
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r1 = r1 + r15
            float r0 = r0 - r1
            float r3 = r3 * r4
            goto L_0x1e1b
        L_0x1e0e:
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            android.text.Layout r0 = r12.A02
            int r0 = r0.getWidth()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 / r4
        L_0x1e1b:
            float r0 = r0 - r3
            goto L_0x1ddf
        L_0x1e1d:
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            android.text.Layout r1 = r12.A02
            r0 = 0
            if (r1 == 0) goto L_0x1e2a
            int r0 = r1.getHeight()
        L_0x1e2a:
            int r3 = r3 - r0
            float r1 = (float) r3
            float r1 = r1 / r4
            goto L_0x1dca
        L_0x1e2e:
            r3 = 0
            r1 = 1
            java.lang.Object r4 = r2.A05
            if (r4 == 0) goto L_0x2418
            r4 = 2
            int[] r4 = new int[r4]
            int r6 = android.view.View.MeasureSpec.getMode(r8)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r6 != r7) goto L_0x1e68
            int r6 = android.view.View.MeasureSpec.getMode(r9)
            if (r6 != r7) goto L_0x1e68
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r7) goto L_0x1e51
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            r4[r3] = r0
        L_0x1e51:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != r7) goto L_0x1e5d
            int r0 = android.view.View.MeasureSpec.getSize(r9)
        L_0x1e5b:
            r4[r1] = r0
        L_0x1e5d:
            r3 = r4[r3]
            r2 = r4[r1]
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
        L_0x1e67:
            return r0
        L_0x1e68:
            java.lang.String r7 = "loading"
            r6 = 35
            java.lang.String r0 = r0.A0K(r6)
            if (r0 == 0) goto L_0x1e73
            r7 = r0
        L_0x1e73:
            X.3uy r0 = X.C46638DiJ.A00(r7)
            android.content.Context r2 = r2.A04
            int r0 = r0.ordinal()
            if (r0 == r3) goto L_0x1e95
            if (r0 != r1) goto L_0x1e99
            r0 = 2131239153(0x7f0820f1, float:1.8094605E38)
        L_0x1e84:
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r0)
            if (r2 == 0) goto L_0x1e99
            int r0 = r2.getIntrinsicWidth()
            r4[r3] = r0
            int r0 = r2.getIntrinsicHeight()
            goto L_0x1e5b
        L_0x1e95:
            r0 = 2131239961(0x7f082419, float:1.8096244E38)
            goto L_0x1e84
        L_0x1e99:
            r4[r3] = r3
            r4[r1] = r1
            goto L_0x1e5d
        L_0x1e9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r21
            r1.<init>(r0)
            throw r1
        L_0x1ea6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r21
            r1.<init>(r0)
            throw r1
        L_0x1eae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r21
            r1.<init>(r0)
            throw r1
        L_0x1eb6:
            r4 = 0
            if (r53 == 0) goto L_0x1ed0
            java.lang.Object r3 = r2.A05
            if (r3 == 0) goto L_0x1ed0
            r1 = r5
            X.UgW r1 = (X.C15666UgW) r1
            android.content.Context r0 = r2.A04
            android.view.View r0 = r1.A0J(r0)
            X.6Rm r3 = (X.C307786Rm) r3
            r1.A0P(r0, r3, r4)
            X.6Tc r0 = X.C18680Vwd.A01(r0, r5, r8, r9)
            return r0
        L_0x1ed0:
            java.lang.String r1 = "CPDP_MVP_HEROCAROUSEL"
            java.lang.String r0 = "CPDPHeroCarouselVideoComponent calculateLayoutForComponent with null renderUnit"
            X.1Kn.A02(r1, r0)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r4, r4)
            return r0
        L_0x1ede:
            android.content.Context r0 = r2.A04
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165460(0x7f070114, float:1.7945138E38)
            int r3 = r1.getDimensionPixelSize(r0)
            r0 = 2131165359(0x7f0700af, float:1.7944933E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x1ef9:
            r3 = 0
            if (r53 == 0) goto L_0x1f18
            java.lang.Object r0 = r2.A05
            if (r0 == 0) goto L_0x1f18
            boolean r0 = r5 instanceof X.C15667UgY
            if (r0 == 0) goto L_0x1f18
            r1 = r5
            X.UgY r1 = (X.C15667UgY) r1
            android.content.Context r0 = r2.A04
            android.view.View r0 = r1.A0J(r0)
            X.0qQ.A07(r0)
            r1.A0U(r3)
            X.6Tc r0 = X.C18680Vwd.A01(r0, r5, r8, r9)
            return r0
        L_0x1f18:
            java.lang.String r1 = "CPDPLightBoxReelsVideoComponent received a null renderUnit"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1f20:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r4 = X.C308216Te.A01(r0, r8)
            int r2 = X.C308216Te.A01(r0, r9)
            goto L_0x24ee
        L_0x1f2d:
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r1 = X.C308216Te.A01(r2, r8)
            r0 = 0
            int r3 = X.C308216Te.A01(r2, r9)
            int[] r2 = new int[]{r1, r3}
            r1 = r2[r0]
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r2, r1, r3)
            return r0
        L_0x1f45:
            if (r53 == 0) goto L_0x1f74
            java.lang.Object r4 = r2.A05
            if (r4 == 0) goto L_0x1f74
            boolean r1 = r5 instanceof X.C15668UgZ
            if (r1 == 0) goto L_0x1f74
            r3 = r5
            X.Tpp r3 = (X.C14097Tpp) r3
            android.content.Context r1 = r2.A04
            android.view.View r2 = r3.A0J(r1)
            X.6Rm r4 = (X.C307786Rm) r4
            X.C15668UgZ.A00(r2, r4, r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x1f6f
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            r0 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
        L_0x1f6f:
            X.6Tc r0 = X.C18680Vwd.A01(r2, r5, r8, r9)
            return r0
        L_0x1f74:
            java.lang.String r1 = "PDPMediaGridStickyCtaComponent received a null renderUnit"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1f7c:
            if (r53 == 0) goto L_0x1f96
            java.lang.Object r4 = r2.A05
            if (r4 == 0) goto L_0x1f96
            r3 = r5
            X.Ug4 r3 = (X.C15638Ug4) r3
            android.content.Context r1 = r2.A04
            android.view.View r2 = r3.A0J(r1)
            X.6Rm r4 = (X.C307786Rm) r4
            r1 = 0
            r3.A0O(r2, r4, r0, r1)
            X.6Tc r0 = X.C18680Vwd.A01(r2, r5, r8, r9)
            return r0
        L_0x1f96:
            java.lang.String r1 = "HeroCarouselTryInARRenderUnit received a null renderUnit"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1f9e:
            java.lang.String r6 = "Popup does not have an anchor view id"
            r3 = 35
            java.lang.String r0 = r0.A0K(r3)     // Catch:{ ClassCastException -> 0x1fae }
            if (r0 != 0) goto L_0x1fbe
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            throw r0
        L_0x1fae:
            r1 = 0
            long r3 = r0.A04(r3, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x1fbe
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            throw r0
        L_0x1fbe:
            r2 = 1
            int[] r1 = new int[]{r8, r9}
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r2, r2)
            return r0
        L_0x1fc9:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != 0) goto L_0x1ff2
            X.3mq r1 = r5.A0I()
            android.content.Context r0 = r2.A04
            java.lang.Object r0 = r1.ALg(r0)
            android.view.View r0 = (android.view.View) r0
            r0.measure(r8, r9)
            int r1 = r0.getMeasuredHeight()
        L_0x1fe2:
            r0 = 0
            int r3 = X.C308216Te.A00(r8, r0)
            int r2 = X.C308216Te.A00(r9, r1)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x1ff2:
            r1 = 0
            goto L_0x1fe2
        L_0x1ff4:
            if (r53 == 0) goto L_0x201f
            X.3mq r3 = r5.A0I()
            android.content.Context r1 = r2.A04
            java.lang.Object r4 = r3.ALg(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.View"
            X.0qQ.A0C(r4, r1)
            android.view.View r4 = (android.view.View) r4
            r4.measure(r8, r9)
            r2 = 31
            int r1 = r4.getMeasuredHeight()
            int r3 = r0.A03(r2, r1)
            int r2 = r4.getMeasuredWidth()
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r2, r3)
            return r0
        L_0x201f:
            java.lang.String r1 = "Survey Media Content render unit is null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x2027:
            r3 = 0
            r1 = 35
            X.4tV r0 = r0.A07(r1)
            if (r0 != 0) goto L_0x203e
            java.lang.String r1 = "BKBloksComponentsZoomableBinderUtil"
            java.lang.String r0 = "Zoomable container has empty content. Returning null layout"
            X.1Kn.A02(r1, r0)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r1, r1, r3, r3)
            return r0
        L_0x203e:
            X.2Ta r10 = r0.AEy(r2, r8, r9)
            X.0qQ.A07(r10)
            r12 = 0
            long r13 = X.C244873bt.A00(r8, r9)
            r9 = r2
            r11 = r0
            X.6Sh r0 = X.C308006Si.A00(r9, r10, r11, r12, r13)
            X.3dH r3 = r0.A01
            int r2 = r3.A01()
            int r1 = r3.A00()
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r3, r2, r1)
            return r0
        L_0x2060:
            r12 = 0
            r11 = 2
            X.0qQ.A0B(r5, r11)
            android.content.Context r4 = r2.A04
            r3 = 41
            r1 = 0
            float r18 = r0.A02(r3, r1)
            android.app.Activity r10 = X.C18771W0t.A00(r4)
            java.lang.String r7 = "Required value was null."
            if (r10 == 0) goto L_0x213d
            r17 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x20da
            java.lang.String r13 = r0.A0E()
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            if (r13 == 0) goto L_0x20a9
            r1 = 3
            java.lang.Integer[] r6 = X.AnonymousClass05K.A00(r1)
            int r4 = r6.length
            r3 = 0
        L_0x208b:
            if (r3 >= r4) goto L_0x20a9
            r15 = r6[r3]
            int r1 = r15.intValue()
            switch(r1) {
                case 1: goto L_0x20cc;
                case 2: goto L_0x20cf;
                default: goto L_0x2096;
            }
        L_0x2096:
            java.lang.String r14 = "AUTO"
        L_0x2098:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r13.toUpperCase(r1)
            X.0qQ.A07(r1)
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x20c9
            r16 = r15
        L_0x20a9:
            android.content.ContentResolver r3 = r10.getContentResolver()
            java.lang.String r1 = "accelerometer_rotation"
            r6 = 0
            int r1 = android.provider.Settings.System.getInt(r3, r1, r12)
            r4 = 1
            r3 = 0
            if (r1 == r4) goto L_0x20b9
            r3 = 1
        L_0x20b9:
            int r1 = r16.intValue()
            if (r1 == r12) goto L_0x20d2
            if (r1 == r11) goto L_0x20d6
            if (r1 == r4) goto L_0x20d7
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x20c9:
            int r3 = r3 + 1
            goto L_0x208b
        L_0x20cc:
            java.lang.String r14 = "LANDSCAPE"
            goto L_0x2098
        L_0x20cf:
            java.lang.String r14 = "PORTRAIT"
            goto L_0x2098
        L_0x20d2:
            r6 = 10
            if (r3 == 0) goto L_0x20d7
        L_0x20d6:
            r6 = 1
        L_0x20d7:
            r10.setRequestedOrientation(r6)
        L_0x20da:
            r1 = 35
            X.4tV r6 = r0.A07(r1)
            if (r6 == 0) goto L_0x2137
            int r0 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x2105
            android.view.Window r0 = r10.getWindow()
            android.view.View r4 = r0.getDecorView()
            X.0qQ.A07(r4)
            int r3 = r4.getWidth()
            int r0 = X.AnonymousClass3XX.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            int r0 = r4.getHeight()
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L_0x2105:
            X.2Ta r10 = r6.AEy(r2, r8, r9)
            X.0qQ.A07(r10)
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != 0) goto L_0x2132
            int r3 = r10.getWidth()
        L_0x2116:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != 0) goto L_0x212d
            int r4 = r10.getHeight()
        L_0x2120:
            r12 = 0
            long r13 = X.C244873bt.A00(r8, r9)
            r9 = r2
            r11 = r6
            X.6Sh r2 = X.C308006Si.A00(r9, r10, r11, r12, r13)
            goto L_0x30c9
        L_0x212d:
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            goto L_0x2120
        L_0x2132:
            int r3 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x2116
        L_0x2137:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x213d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r7)
            throw r1
        L_0x2143:
            if (r53 == 0) goto L_0x215f
            X.3mq r3 = r5.A0I()
            android.content.Context r1 = r2.A04
            java.lang.Object r10 = r3.ALg(r1)
            r1 = 147(0x93, float:2.06E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.0qQ.A0C(r10, r1)
            com.instagram.igds.components.button.IgdsButton r10 = (com.instagram.igds.components.button.IgdsButton) r10
            X.C48269Ebo.A00(r0, r10)
            goto L_0x24bd
        L_0x215f:
            java.lang.String r1 = "Button binder returns a null render unit"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x2167:
            r11 = 0
            r10 = 1
            if (r53 == 0) goto L_0x220a
            X.3mq r1 = r5.A0I()
            android.content.Context r6 = r2.A04
            java.lang.Object r3 = r1.ALg(r6)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.igds.components.mediabutton.IgdsMediaButton"
            X.0qQ.A0C(r3, r1)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r3 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r3
            java.lang.String r2 = r0.A0G()
            java.lang.String r1 = "large"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x2207
            X.5pk r1 = X.C296245pk.LARGE
        L_0x218a:
            r3.A01 = r1
            java.lang.String r1 = r0.A0J()
            r3.setLabel(r1)
            X.C62962KpE.A00(r6, r0, r3)
            r3.measure(r8, r9)
            r7 = 2
            int r1 = r3.getMeasuredWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            int r1 = r3.getMeasuredHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer[] r2 = new java.lang.Integer[]{r2, r1}
            r4 = 46
            X.4tV r1 = r0.A07(r4)
            if (r1 != 0) goto L_0x21be
            r4 = 45
            X.4tV r1 = r0.A07(r4)
            if (r1 == 0) goto L_0x21f9
        L_0x21be:
            X.4tV r0 = r0.A07(r4)
            if (r0 == 0) goto L_0x21f9
            java.lang.String r4 = r0.A0F()
            if (r4 == 0) goto L_0x21f9
            java.lang.String r0 = "_"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 3
            java.util.List r0 = X.00l.A0R(r4, r1, r0)
            float r1 = r3.getLabelWidth()
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            float r0 = X.0nA.A04(r6, r0)
            float r1 = r1 + r0
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.getMeasuredHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r2 = new java.lang.Integer[]{r1, r0}
        L_0x21f9:
            r0 = r2[r11]
            int r4 = r0.intValue()
            r0 = r2[r10]
            int r2 = r0.intValue()
            goto L_0x24ee
        L_0x2207:
            X.5pk r1 = X.C296245pk.SMALL
            goto L_0x218a
        L_0x220a:
            java.lang.String r1 = "Media button binder returns a null render unit"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x2212:
            if (r53 == 0) goto L_0x2230
            X.3mq r3 = r5.A0I()
            android.content.Context r1 = r2.A04
            java.lang.Object r10 = r3.ALg(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.igds.components.textcell.IgdsListCell"
            X.0qQ.A0C(r10, r1)
            com.instagram.igds.components.textcell.IgdsListCell r10 = (com.instagram.igds.components.textcell.IgdsListCell) r10
            java.lang.Object r1 = r2.A05
            X.6Rm r1 = (X.C307786Rm) r1
            if (r1 == 0) goto L_0x24bd
            X.C48270Ebp.A00(r1, r0, r10)
            goto L_0x24bd
        L_0x2230:
            java.lang.String r1 = "Text cell binder returns a null render unit"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x2238:
            r7 = 0
            if (r53 == 0) goto L_0x2294
            X.3mq r3 = r5.A0I()
            if (r3 == 0) goto L_0x2294
            android.content.Context r1 = r2.A04
            java.lang.Object r6 = r3.ALg(r1)
        L_0x2247:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout"
            X.0qQ.A0C(r6, r1)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r6 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r6
            r1 = 36
            X.4tV r4 = r0.A07(r1)
            r1 = 38
            X.4tV r3 = r0.A07(r1)
            if (r4 == 0) goto L_0x2292
            java.lang.String r1 = r4.A0I()
        L_0x2260:
            r6.setPrimaryActionText(r1)
            if (r3 == 0) goto L_0x2269
            java.lang.String r7 = r3.A0I()
        L_0x2269:
            r6.setSecondaryActionText(r7)
            java.lang.Object r2 = r2.A05
            X.6Rm r2 = (X.C307786Rm) r2
            if (r2 == 0) goto L_0x2284
            r1 = 35
            java.util.List r1 = r0.A0M(r1)
            X.0qQ.A07(r1)
            X.6TZ r0 = X.AnonymousClass6TV.A01(r2, r0, r1)
            java.lang.CharSequence r0 = r0.A00
            r6.setFooterText(r0)
        L_0x2284:
            r6.measure(r8, r9)
            int r3 = r6.getMeasuredWidth()
            int r4 = r6.getMeasuredHeight()
            r2 = 0
            goto L_0x30c9
        L_0x2292:
            r1 = r7
            goto L_0x2260
        L_0x2294:
            r6 = r7
            goto L_0x2247
        L_0x2296:
            r1 = 42
            X.4tV r7 = r0.A07(r1)
            if (r7 != 0) goto L_0x22a6
            java.lang.String r1 = "Server should have ensured that the Tooltip Container always has a child."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x22a6:
            X.2Ta r1 = r7.AEy(r2, r8, r9)
            X.Ty8 r0 = new X.Ty8
            r0.<init>(r1, r5)
            return r0
        L_0x22b0:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            r0 = 0
            int r4 = X.C308216Te.A00(r8, r0)
            int r2 = X.C308216Te.A00(r9, r0)
            goto L_0x24ee
        L_0x22bf:
            r3 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r1 = 2
            r0.A0P(r1, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r1 = 3
            r0.A0P(r1, r2)
            r1 = 0
            int r4 = X.C308216Te.A00(r8, r1)
            int r2 = r0.A03(r3, r1)
            goto L_0x24ee
        L_0x22db:
            java.lang.Object r3 = r2.A05
            java.lang.String r1 = "Required value was null."
            if (r3 == 0) goto L_0x22fb
            X.6Rm r3 = (X.C307786Rm) r3
            java.lang.Object r0 = X.C307476Qg.A06(r3, r0)
            r0.getClass()
            X.Hk4 r0 = (X.C55584Hk4) r0
            X.2WD r0 = r0.A00
            if (r0 == 0) goto L_0x22f5
            X.2Ta r0 = r0.AEy(r2, r8, r9)
            return r0
        L_0x22f5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x22fb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x2301:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            r2 = 0
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r2, r1, r1)
            return r0
        L_0x230d:
            r1 = 2
            X.0qQ.A0B(r5, r1)
            java.lang.Object r4 = r2.A05
            if (r4 == 0) goto L_0x235b
            X.6Rm r4 = (X.C307786Rm) r4
            r1 = 36
            X.4tV r6 = r0.A07(r1)
            if (r6 == 0) goto L_0x2353
            r3 = 2131428764(0x7f0b059c, float:1.8479182E38)
            android.util.SparseArray r1 = r4.A01
            java.lang.Object r4 = r1.get(r3)
            X.XBO r4 = (X.XBO) r4
            boolean r1 = r4 instanceof X.C20943X5m
            if (r1 == 0) goto L_0x2349
            r3 = 35
            X.4tV r1 = r0.A07(r3)
            if (r1 == 0) goto L_0x2349
            X.X5m r4 = (X.C20943X5m) r4
            X.4tV r1 = r0.A07(r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.0qQ.A0C(r1, r0)
            r3 = r4
            r4 = r2
            r7 = r1
            X.2Ta r0 = r3.Cfj(r4, r5, r6, r7, r8, r9)
            return r0
        L_0x2349:
            X.2Ta r1 = r6.AEy(r2, r8, r9)
            X.Ty8 r0 = new X.Ty8
            r0.<init>(r1, r5)
            return r0
        L_0x2353:
            java.lang.String r0 = "Expected content in screen wrapper but found none"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x235b:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x2363:
            r3 = 0
            r0 = 2
            X.0qQ.A0B(r5, r0)
            android.content.Context r0 = r2.A04
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            X.0qQ.A07(r1)
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != 0) goto L_0x2397
            r2 = 1112539136(0x42500000, float:52.0)
            int r0 = r1.densityDpi
            float r1 = (float) r0
            r0 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 / r0
            float r2 = r2 * r1
            int r0 = X.AnonymousClass1GB.A01(r2)
        L_0x2388:
            int r3 = X.C308216Te.A00(r8, r3)
            int r2 = X.C308216Te.A00(r9, r0)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x2397:
            r0 = 50
            goto L_0x2388
        L_0x239a:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r3 = X.C308216Te.A01(r0, r9)
            r0 = 0
            int r2 = X.C308216Te.A00(r8, r0)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r2, r3)
            return r0
        L_0x23ad:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            android.content.Context r1 = r2.A04
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r6 = r0.widthPixels
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            double r3 = (double) r0
            r0 = 4604480259023595111(0x3fe6666666666667, double:0.7000000000000001)
            double r3 = r3 * r0
            int r2 = (int) r3
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r6, r2)
            return r0
        L_0x23d6:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            android.content.Context r0 = r2.A04
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            X.0qQ.A07(r0)
            r1 = 1106247680(0x41f00000, float:30.0)
            int r0 = r0.densityDpi
            float r2 = (float) r0
            r0 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 / r0
            float r1 = r1 * r2
            int r1 = X.AnonymousClass1GB.A01(r1)
            r0 = 1135312896(0x43ab8000, float:343.0)
            float r0 = r0 * r2
            int r0 = X.AnonymousClass1GB.A01(r0)
            int r4 = X.C308216Te.A00(r8, r0)
            int r2 = X.C308216Te.A00(r9, r1)
            goto L_0x24ee
        L_0x2406:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != 0) goto L_0x2424
            r3 = 0
        L_0x2411:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
        L_0x2415:
            if (r0 != 0) goto L_0x241f
            r1 = 0
        L_0x2418:
            r2 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r2, r3, r1)
            return r0
        L_0x241f:
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            goto L_0x2418
        L_0x2424:
            int r3 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x2411
        L_0x2429:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            X.3mq r1 = r5.A0I()
            android.content.Context r0 = r2.A04
            java.lang.Object r10 = r1.ALg(r0)
            r0 = 1640(0x668, float:2.298E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x243d:
            X.0qQ.A0C(r10, r0)
            android.view.View r10 = (android.view.View) r10
            goto L_0x24bd
        L_0x2443:
            r7 = 0
            r10 = 0
            if (r53 == 0) goto L_0x2453
            X.3mq r3 = r5.A0I()
            if (r3 == 0) goto L_0x2453
            android.content.Context r1 = r2.A04
            java.lang.Object r10 = r3.ALg(r1)
        L_0x2453:
            boolean r1 = r10 instanceof X.C60077JfD
            if (r1 == 0) goto L_0x24d1
            X.JfD r10 = (X.C60077JfD) r10
            if (r10 == 0) goto L_0x24d1
            java.lang.Object r4 = r2.A05
            if (r4 == 0) goto L_0x24c9
            X.6Rm r4 = (X.C307786Rm) r4
            r1 = 38
            java.util.List r3 = r0.A0M(r1)
            X.0qQ.A07(r3)
            r2 = 41
            r1 = 0
            float r2 = r0.A02(r2, r1)
            r1 = 35
            int r11 = r0.A03(r1, r7)
            r1 = 40
            r0.A0R(r1, r7)
            java.util.List r0 = X.C63065Kqu.A00(r4, r3, r2)
            java.util.ArrayList r1 = X.C63095KrO.A00(r0)
            java.util.List r6 = r10.A01
            r6.clear()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r10.A00 = r0
            r10.removeAllViews()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x249a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x24b7
            java.lang.Object r0 = r3.next()
            X.L8n r0 = (X.C63832L8n) r0
            X.Jf8 r2 = X.C60077JfD.A00(r10, r0, r11)
            r1 = -2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r7, r1)
            r10.addView(r2, r0)
            r4.add(r2)
            goto L_0x249a
        L_0x24b7:
            X.C60077JfD.A01(r10, r4)
            r6.addAll(r4)
        L_0x24bd:
            r10.measure(r8, r9)
            int r4 = r10.getMeasuredWidth()
            int r2 = r10.getMeasuredHeight()
            goto L_0x24ee
        L_0x24c9:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x24d1:
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r7, r7)
            return r0
        L_0x24d8:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            int r4 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = android.view.View.MeasureSpec.getSize(r9)
            goto L_0x24ee
        L_0x24e5:
            r0 = 0
            int r4 = X.C308216Te.A00(r8, r0)
            int r2 = X.C308216Te.A00(r9, r0)
        L_0x24ee:
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r4, r2)
            return r0
        L_0x24f5:
            r6 = 0
            r1 = 1
            r4 = 2
            X.0qQ.A0B(r5, r4)
            java.lang.Integer r3 = X.C14508TxU.A02(r0)
            int r3 = r3.intValue()
            if (r3 == r6) goto L_0x2c72
            X.Vtd r4 = X.C18527Vtd.A00
            if (r3 == r1) goto L_0x27aa
            android.content.Context r13 = r2.A04
            X.Vay r3 = r4.A00(r13, r0)
            int r12 = r3.A01
            int r11 = r3.A02
            android.graphics.Rect r10 = r3.A04
            int r7 = r3.A00
            int r4 = r3.A03
            boolean r29 = X.C16919VAw.A00(r13)
            java.util.List r3 = r0.A0L()
            int r13 = r3.size()
            java.util.ArrayList r28 = new java.util.ArrayList
            r3 = r28
            r3.<init>(r13)
            X.TyA r27 = new X.TyA
            r3 = r27
            r3.<init>(r2, r0)
            int r13 = android.view.View.MeasureSpec.getSize(r8)
            int r3 = r10.left
            int r13 = r13 - r3
            int r3 = r10.right
            int r13 = r13 - r3
            int r14 = android.view.View.MeasureSpec.getSize(r9)
            int r3 = r10.top
            int r14 = r14 - r3
            int r3 = r10.bottom
            int r14 = r14 - r3
            if (r12 == r1) goto L_0x254a
            r13 = r14
        L_0x254a:
            int[] r3 = new int[r11]
            r26 = r3
            int r16 = r13 / r11
            int r13 = r13 % r11
            r14 = 0
            r15 = 0
        L_0x2553:
            if (r14 >= r11) goto L_0x2567
            int r15 = r15 + r13
            if (r15 <= 0) goto L_0x2564
            int r3 = r11 - r15
            if (r3 >= r13) goto L_0x2564
            int r3 = r16 + 1
            int r15 = r15 - r11
        L_0x255f:
            r26[r14] = r3
            int r14 = r14 + 1
            goto L_0x2553
        L_0x2564:
            r3 = r16
            goto L_0x255f
        L_0x2567:
            r13 = r4
            if (r12 != r1) goto L_0x256b
            r13 = r7
        L_0x256b:
            r3 = r29
            android.graphics.Rect[] r25 = X.V5C.A00(r12, r13, r11, r3)
            if (r12 != r1) goto L_0x2589
            int r7 = r4 / 2
        L_0x2575:
            X.XTp[] r4 = new X.C21295XTp[r11]
            r14 = 0
        L_0x2578:
            r13 = 0
            if (r14 >= r11) goto L_0x258c
            X.XTp r3 = new X.XTp
            r3.<init>()
            r3.A00 = r6
            r3.A01 = r13
            r4[r14] = r3
            int r14 = r14 + 1
            goto L_0x2578
        L_0x2589:
            int r7 = r7 / 2
            goto L_0x2575
        L_0x258c:
            java.util.List r3 = r0.A0L()
            int r13 = r3.size()
            java.util.ArrayList r24 = new java.util.ArrayList
            r3 = r24
            r3.<init>(r13)
            java.util.List r3 = r0.A0L()
            X.0qQ.A07(r3)
            java.util.Iterator r23 = r3.iterator()
            r22 = 0
        L_0x25a8:
            boolean r3 = r23.hasNext()
            if (r3 == 0) goto L_0x2779
            java.lang.Object r14 = r23.next()
            int r21 = r22 + 1
            if (r22 < 0) goto L_0x2ef7
            X.4tV r14 = (X.C276544tV) r14
            X.0qQ.A0A(r14)
            r20 = 132(0x84, float:1.85E-43)
            r3 = r20
            X.4tV r13 = r14.A07(r3)
            r19 = 0
            if (r13 == 0) goto L_0x25d3
            int r15 = r13.A04
            r3 = 16482(0x4062, float:2.3096E-41)
            if (r15 != r3) goto L_0x25d3
            r3 = 36
            boolean r19 = r13.A0R(r3, r6)
        L_0x25d3:
            X.0sj r3 = X.03t.A0L(r4)
            java.util.Iterator r17 = r3.iterator()
            boolean r3 = r17.hasNext()
            if (r19 == 0) goto L_0x2740
            if (r3 == 0) goto L_0x2770
            java.lang.Object r15 = r17.next()
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x260f
            r3 = r15
            X.0k0 r3 = (X.0k0) r3
            java.lang.Object r3 = r3.A01
            X.XTp r3 = (X.C21295XTp) r3
            int r13 = r3.A00
        L_0x25f6:
            java.lang.Object r16 = r17.next()
            r3 = r16
            X.0k0 r3 = (X.0k0) r3
            java.lang.Object r3 = r3.A01
            X.XTp r3 = (X.C21295XTp) r3
            int r3 = r3.A00
            if (r13 >= r3) goto L_0x2609
            r13 = r3
            r15 = r16
        L_0x2609:
            boolean r3 = r17.hasNext()
            if (r3 != 0) goto L_0x25f6
        L_0x260f:
            X.0k0 r15 = (X.0k0) r15
            if (r15 == 0) goto L_0x2773
            int r3 = r15.A00
            r18 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            if (r3 == 0) goto L_0x2773
            if (r19 == 0) goto L_0x2737
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
        L_0x2624:
            r3 = r24
            r3.add(r13)
            r3 = r20
            X.4tV r16 = r14.A07(r3)
            r17 = 0
            if (r16 == 0) goto L_0x2656
            r3 = r16
            int r3 = r3.A04
            r15 = r3
            r3 = 16482(0x4062, float:2.3096E-41)
            if (r15 != r3) goto L_0x2656
            r15 = 35
            r3 = r16
            java.lang.Object r15 = X.C276544tV.A00(r3, r15)
            if (r15 == 0) goto L_0x2656
            boolean r3 = r15 instanceof java.lang.Number
            if (r3 == 0) goto L_0x2656
            java.lang.Number r15 = (java.lang.Number) r15
            if (r15 == 0) goto L_0x2656
            float r3 = r15.floatValue()
            java.lang.Float r17 = java.lang.Float.valueOf(r3)
        L_0x2656:
            if (r19 == 0) goto L_0x2663
            r3 = 0
            r15 = 0
        L_0x265a:
            if (r3 >= r11) goto L_0x2665
            r16 = r26[r3]
            int r15 = r15 + r16
            int r3 = r3 + 1
            goto L_0x265a
        L_0x2663:
            r15 = r26[r18]
        L_0x2665:
            if (r12 != r1) goto L_0x26fb
            int r3 = r13.left
            int r15 = r15 - r3
            int r3 = r13.right
        L_0x266c:
            int r15 = r15 - r3
            if (r17 == 0) goto L_0x26f8
            if (r19 != 0) goto L_0x26f8
            float r13 = (float) r15
            float r3 = r17.floatValue()
            float r13 = r13 * r3
            int r13 = (int) r13
            int r3 = X.AnonymousClass3XX.A00
            r3 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r3)
        L_0x2680:
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r3)
            r15 = r3
            if (r12 != 0) goto L_0x268b
            r15 = r13
            r13 = r3
        L_0x268b:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            X.0eP r13 = new X.0eP
            r13.<init>(r15, r3)
            java.lang.Object r3 = r13.A00
            java.lang.Number r3 = (java.lang.Number) r3
            int r15 = r3.intValue()
            java.lang.Object r3 = r13.A01
            java.lang.Number r3 = (java.lang.Number) r3
            int r13 = r3.intValue()
            r3 = r27
            X.Txy r13 = X.C14508TxU.A01(r3, r2, r14, r15, r13)
            r3 = r28
            r3.add(r13)
            X.6SI r3 = r13.A00
            java.lang.Object r3 = r3.A00()
            X.6Sh r3 = (X.C307996Sh) r3
            X.3dH r3 = r3.A01
            if (r12 != r1) goto L_0x26f3
            int r14 = r3.A00()
        L_0x26c3:
            r16 = r4[r18]
            r3 = r16
            int r13 = r3.A00
            int r13 = r13 + r14
            X.XYu r3 = r3.A01
            if (r3 == 0) goto L_0x2710
            int r3 = r7 * 2
            int r13 = r13 + r3
            r14 = 0
        L_0x26d2:
            if (r14 >= r11) goto L_0x2702
            r3 = r4[r14]
            X.XYu r3 = r3.A01
            if (r3 == 0) goto L_0x26e8
            int r3 = r3.A00
            r15 = r24
            java.lang.Object r3 = r15.get(r3)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            if (r12 != r1) goto L_0x26eb
            r3.bottom = r7
        L_0x26e8:
            int r14 = r14 + 1
            goto L_0x26d2
        L_0x26eb:
            if (r29 != 0) goto L_0x26f0
            r3.right = r7
            goto L_0x26e8
        L_0x26f0:
            r3.left = r7
            goto L_0x26e8
        L_0x26f3:
            int r14 = r3.A01()
            goto L_0x26c3
        L_0x26f8:
            int r13 = X.AnonymousClass3XX.A00
            goto L_0x2680
        L_0x26fb:
            int r3 = r13.top
            int r15 = r15 - r3
            int r3 = r13.bottom
            goto L_0x266c
        L_0x2702:
            r14 = r24
            r3 = r22
            java.lang.Object r3 = r14.get(r3)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            if (r12 != r1) goto L_0x2725
            r3.top = r7
        L_0x2710:
            X.XYu r14 = new X.XYu
            r3 = r22
            r14.<init>(r3)
            if (r19 == 0) goto L_0x272d
            r15 = 0
        L_0x271a:
            if (r15 >= r11) goto L_0x2733
            r3 = r4[r15]
            r3.A01 = r14
            r3.A00 = r13
            int r15 = r15 + 1
            goto L_0x271a
        L_0x2725:
            if (r29 != 0) goto L_0x272a
            r3.left = r7
            goto L_0x2710
        L_0x272a:
            r3.right = r7
            goto L_0x2710
        L_0x272d:
            r3 = r16
            r3.A01 = r14
            r3.A00 = r13
        L_0x2733:
            r22 = r21
            goto L_0x25a8
        L_0x2737:
            r3 = r25[r18]
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>(r3)
            goto L_0x2624
        L_0x2740:
            if (r3 == 0) goto L_0x2770
            java.lang.Object r15 = r17.next()
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x260f
            r3 = r15
            X.0k0 r3 = (X.0k0) r3
            java.lang.Object r3 = r3.A01
            X.XTp r3 = (X.C21295XTp) r3
            int r13 = r3.A00
        L_0x2755:
            java.lang.Object r16 = r17.next()
            r3 = r16
            X.0k0 r3 = (X.0k0) r3
            java.lang.Object r3 = r3.A01
            X.XTp r3 = (X.C21295XTp) r3
            int r3 = r3.A00
            if (r13 <= r3) goto L_0x2768
            r13 = r3
            r15 = r16
        L_0x2768:
            boolean r3 = r17.hasNext()
            if (r3 != 0) goto L_0x2755
            goto L_0x260f
        L_0x2770:
            r15 = 0
            goto L_0x260f
        L_0x2773:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x2779:
            java.lang.Object r2 = r2.A05
            X.6Rm r2 = (X.C307786Rm) r2
            if (r2 == 0) goto L_0x278c
            java.lang.Object r2 = X.C307476Qg.A06(r2, r0)
            r2.getClass()
            X.Ty7 r2 = (X.Ty7) r2
            r0 = r24
            r2.A08 = r0
        L_0x278c:
            int r14 = android.view.View.MeasureSpec.getMode(r8)
            int r13 = android.view.View.MeasureSpec.getMode(r9)
            if (r12 != r1) goto L_0x27a0
            if (r14 != 0) goto L_0x3070
            java.lang.String r1 = "StaggeredGridCollectionMeasureHelper: Width should be specified for vertical grid collection"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x27a0:
            if (r13 != 0) goto L_0x3070
            java.lang.String r1 = "StaggeredGridCollectionMeasureHelper: Height should be specified for horizontal grid collection"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x27aa:
            android.content.Context r3 = r2.A04
            r46 = r3
            X.Vay r4 = r4.A00(r3, r0)
            int r6 = r4.A01
            int r7 = r4.A02
            int r3 = r4.A00
            r44 = r3
            int r3 = r4.A03
            r43 = r3
            android.graphics.Rect r13 = r4.A04
            X.4tV r10 = r4.A05
            r3 = 35
            java.lang.Object r42 = X.C276544tV.A00(r10, r3)
            r3 = r42
            boolean r3 = r3 instanceof java.lang.Number
            r41 = 0
            if (r3 == 0) goto L_0x2833
            r3 = r42
            java.lang.Number r3 = (java.lang.Number) r3
            r42 = r3
        L_0x27d6:
            java.lang.Integer r3 = r4.A06
            r45 = r3
            java.util.List r14 = r0.A0L()
            X.0qQ.A07(r14)
            java.util.ArrayList r40 = new java.util.ArrayList
            r40.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r11 = r14.size()
            r10 = 0
            r15 = 0
        L_0x27f1:
            if (r10 >= r11) goto L_0x2836
            java.lang.Object r4 = r14.get(r10)
            X.4tV r4 = (X.C276544tV) r4
            boolean r3 = X.C49734F3z.A01(r4)
            if (r3 == 0) goto L_0x282e
            r16 = r7
        L_0x2801:
            int r15 = r15 + r16
            if (r15 <= r7) goto L_0x282a
            java.util.List r15 = X.00k.A0a(r12)
            r3 = r40
            r3.add(r15)
            r12.clear()
            r12.add(r4)
            r15 = r16
        L_0x2816:
            int r3 = r14.size()
            int r3 = r3 + -1
            if (r10 != r3) goto L_0x2827
            java.util.List r4 = X.00k.A0a(r12)
            r3 = r40
            r3.add(r4)
        L_0x2827:
            int r10 = r10 + 1
            goto L_0x27f1
        L_0x282a:
            r12.add(r4)
            goto L_0x2816
        L_0x282e:
            int r16 = X.C49734F3z.A00(r4)
            goto L_0x2801
        L_0x2833:
            r42 = r41
            goto L_0x27d6
        L_0x2836:
            int r39 = r40.size()
            java.util.ArrayList r38 = new java.util.ArrayList
            r4 = r38
            r3 = r39
            r4.<init>(r3)
            java.util.List r3 = r0.A0L()
            int r4 = r3.size()
            java.util.ArrayList r36 = new java.util.ArrayList
            r3 = r36
            r3.<init>(r4)
            X.TyA r37 = new X.TyA
            r3 = r37
            r3.<init>(r2, r0)
            int r12 = android.view.View.MeasureSpec.getSize(r8)
            int r3 = r13.left
            int r12 = r12 - r3
            int r3 = r13.right
            int r12 = r12 - r3
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            int r3 = r13.top
            int r4 = r4 - r3
            int r3 = r13.bottom
            int r4 = r4 - r3
            if (r6 == r1) goto L_0x2870
            r12 = r4
        L_0x2870:
            int[] r3 = new int[r7]
            r35 = r3
            int r11 = r12 / r7
            int r12 = r12 % r7
            r10 = 0
            r4 = 0
        L_0x2879:
            if (r10 >= r7) goto L_0x288c
            int r4 = r4 + r12
            if (r4 <= 0) goto L_0x288a
            int r3 = r7 - r4
            if (r3 >= r12) goto L_0x288a
            int r3 = r11 + 1
            int r4 = r4 - r7
        L_0x2885:
            r35[r10] = r3
            int r10 = r10 + 1
            goto L_0x2879
        L_0x288a:
            r3 = r11
            goto L_0x2885
        L_0x288c:
            java.util.ArrayList r34 = new java.util.ArrayList
            r4 = r34
            r3 = r39
            r4.<init>(r3)
            java.util.ArrayList r33 = new java.util.ArrayList
            r4 = r33
            r4.<init>(r3)
            java.util.ArrayList r32 = new java.util.ArrayList
            r4 = r32
            r4.<init>(r3)
            int r31 = r40.size()
            r12 = 0
            r30 = 0
        L_0x28aa:
            r3 = r31
            if (r12 >= r3) goto L_0x2a7d
            r3 = r40
            java.lang.Object r29 = r3.get(r12)
            r3 = r29
            java.util.List r3 = (java.util.List) r3
            r29 = r3
            java.util.ArrayList r28 = new java.util.ArrayList
            r28.<init>()
            boolean r27 = X.C16919VAw.A00(r46)
            r26 = r7
            int r4 = r29.size()
            java.util.ArrayList r25 = new java.util.ArrayList
            r3 = r25
            r3.<init>(r4)
            java.util.Iterator r24 = r29.iterator()
            r11 = 0
        L_0x28d5:
            boolean r3 = r24.hasNext()
            if (r3 == 0) goto L_0x299a
            java.lang.Object r4 = r24.next()
            X.4tV r4 = (X.C276544tV) r4
            boolean r3 = X.C49734F3z.A01(r4)
            if (r3 == 0) goto L_0x2994
            r10 = r7
        L_0x28e8:
            int r10 = r10 + r11
            int r10 = r10 - r1
            if (r6 != r1) goto L_0x298c
            if (r12 != 0) goto L_0x2990
        L_0x28ee:
            r23 = 1
        L_0x28f0:
            if (r6 != r1) goto L_0x2984
            if (r11 != 0) goto L_0x2988
        L_0x28f4:
            r18 = 1
        L_0x28f6:
            if (r6 != r1) goto L_0x297a
            int r3 = r7 + -1
            if (r10 != r3) goto L_0x2980
        L_0x28fc:
            r22 = 1
        L_0x28fe:
            if (r6 != r1) goto L_0x2972
            int r3 = r39 + -1
            if (r12 != r3) goto L_0x2977
        L_0x2904:
            r21 = 1
        L_0x2906:
            r3 = r44
            double r14 = (double) r3
            double r3 = (double) r7
            r16 = r3
            double r14 = r14 / r3
            r3 = r43
            double r3 = (double) r3
            double r19 = r3 / r16
            if (r18 == 0) goto L_0x2963
            r18 = 0
        L_0x2916:
            if (r23 == 0) goto L_0x2956
            r11 = 0
        L_0x2919:
            if (r22 == 0) goto L_0x2945
            r14 = 0
        L_0x291c:
            if (r21 == 0) goto L_0x2934
            r15 = 0
        L_0x291f:
            android.graphics.Rect r4 = new android.graphics.Rect
            r3 = r18
            if (r27 != 0) goto L_0x2930
            r4.<init>(r3, r11, r14, r15)
        L_0x2928:
            r3 = r25
            r3.add(r4)
            int r11 = r10 + 1
            goto L_0x28d5
        L_0x2930:
            r4.<init>(r14, r11, r3, r15)
            goto L_0x2928
        L_0x2934:
            if (r6 != 0) goto L_0x2942
            int r3 = r10 + 1
            double r3 = (double) r3
            double r15 = r3 * r19
            int r3 = X.AnonymousClass1GB.A00(r15)
            int r15 = r43 - r3
            goto L_0x291f
        L_0x2942:
            int r15 = r43 / 2
            goto L_0x291f
        L_0x2945:
            if (r6 != r1) goto L_0x2953
            int r3 = r10 + 1
            double r3 = (double) r3
            double r16 = r3 * r14
            int r3 = X.AnonymousClass1GB.A00(r16)
            int r14 = r44 - r3
            goto L_0x291c
        L_0x2953:
            int r14 = r44 / 2
            goto L_0x291c
        L_0x2956:
            if (r6 != 0) goto L_0x2960
            double r3 = (double) r11
            double r16 = r3 * r19
            int r11 = X.AnonymousClass1GB.A00(r16)
            goto L_0x2919
        L_0x2960:
            int r11 = r43 / 2
            goto L_0x2919
        L_0x2963:
            if (r6 != r1) goto L_0x296d
            double r3 = (double) r11
            double r16 = r3 * r14
            int r18 = X.AnonymousClass1GB.A00(r16)
            goto L_0x2916
        L_0x296d:
            int r3 = r44 / 2
            r18 = r3
            goto L_0x2916
        L_0x2972:
            int r3 = r7 + -1
            if (r10 != r3) goto L_0x2977
            goto L_0x2904
        L_0x2977:
            r21 = 0
            goto L_0x2906
        L_0x297a:
            int r3 = r39 + -1
            if (r12 != r3) goto L_0x2980
            goto L_0x28fc
        L_0x2980:
            r22 = 0
            goto L_0x28fe
        L_0x2984:
            if (r12 != 0) goto L_0x2988
            goto L_0x28f4
        L_0x2988:
            r18 = 0
            goto L_0x28f6
        L_0x298c:
            if (r11 != 0) goto L_0x2990
            goto L_0x28ee
        L_0x2990:
            r23 = 0
            goto L_0x28f0
        L_0x2994:
            int r10 = X.C49734F3z.A00(r4)
            goto L_0x28e8
        L_0x299a:
            int r19 = r29.size()
            r16 = 0
            r4 = 0
        L_0x29a1:
            r3 = r19
            if (r4 >= r3) goto L_0x2a62
            r3 = r29
            java.lang.Object r14 = r3.get(r4)
            X.4tV r14 = (X.C276544tV) r14
            boolean r18 = X.C49734F3z.A01(r14)
            if (r18 != 0) goto L_0x29b7
            int r26 = X.C49734F3z.A00(r14)
        L_0x29b7:
            r3 = r25
            java.lang.Object r15 = r3.get(r4)
            android.graphics.Rect r15 = (android.graphics.Rect) r15
            if (r42 == 0) goto L_0x2a5e
            float r3 = r42.floatValue()
            java.lang.Float r17 = java.lang.Float.valueOf(r3)
        L_0x29c9:
            r11 = r4
            int r26 = r26 + r4
            r10 = 0
        L_0x29cd:
            r3 = r26
            if (r11 >= r3) goto L_0x29d7
            r3 = r35[r11]
            int r10 = r10 + r3
            int r11 = r11 + 1
            goto L_0x29cd
        L_0x29d7:
            if (r6 != r1) goto L_0x2a59
            int r3 = r15.left
            int r11 = r15.right
        L_0x29dd:
            int r3 = r3 + r11
            int r10 = r10 - r3
            if (r17 == 0) goto L_0x2a56
            if (r18 != 0) goto L_0x2a56
            float r11 = (float) r10
            float r3 = r17.floatValue()
            float r11 = r11 * r3
            int r11 = (int) r11
            int r3 = X.AnonymousClass3XX.A00
            r3 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r3)
        L_0x29f2:
            if (r6 != 0) goto L_0x2a4f
            r3 = r15
            r11 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
        L_0x29fb:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            X.0eP r10 = new X.0eP
            r10.<init>(r11, r3)
            java.lang.Object r3 = r10.A00
            java.lang.Number r3 = (java.lang.Number) r3
            int r11 = r3.intValue()
            java.lang.Object r3 = r10.A01
            java.lang.Number r3 = (java.lang.Number) r3
            int r10 = r3.intValue()
            r26 = r7
            r3 = r37
            X.Txy r3 = X.C14508TxU.A01(r3, r2, r14, r11, r10)
            X.6SI r3 = r3.A00
            java.lang.Object r3 = r3.A00()
            X.6Sh r3 = (X.C307996Sh) r3
            X.3dH r3 = r3.A01
            if (r6 != r1) goto L_0x2a4a
            int r14 = r3.A00()
        L_0x2a30:
            r3 = r30
            int r30 = java.lang.Math.max(r3, r14)
            r3 = r16
            int r16 = java.lang.Math.max(r3, r14)
            X.XZq r14 = new X.XZq
            r14.<init>(r11, r10)
            r3 = r28
            r3.add(r14)
            int r4 = r4 + 1
            goto L_0x29a1
        L_0x2a4a:
            int r14 = r3.A01()
            goto L_0x2a30
        L_0x2a4f:
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r3)
            goto L_0x29fb
        L_0x2a56:
            int r15 = X.AnonymousClass3XX.A00
            goto L_0x29f2
        L_0x2a59:
            int r3 = r15.top
            int r11 = r15.bottom
            goto L_0x29dd
        L_0x2a5e:
            r17 = r41
            goto L_0x29c9
        L_0x2a62:
            r4 = r33
            r3 = r25
            r4.add(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r3 = r32
            r3.add(r4)
            r4 = r34
            r3 = r28
            r4.add(r3)
            int r12 = r12 + 1
            goto L_0x28aa
        L_0x2a7d:
            int r20 = r40.size()
            r4 = 0
        L_0x2a82:
            r3 = r20
            if (r4 >= r3) goto L_0x2b1c
            r3 = r40
            java.lang.Object r19 = r3.get(r4)
            r3 = r19
            java.util.List r3 = (java.util.List) r3
            r19 = r3
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            r3 = r34
            java.lang.Object r11 = r3.get(r4)
            X.0qQ.A07(r11)
            java.util.List r11 = (java.util.List) r11
            int r17 = r19.size()
            r10 = 0
        L_0x2aa7:
            r3 = r17
            if (r10 >= r3) goto L_0x2b11
            r3 = r19
            java.lang.Object r12 = r3.get(r10)
            X.4tV r12 = (X.C276544tV) r12
            java.lang.Object r15 = r11.get(r10)
            X.XZq r15 = (X.C21383XZq) r15
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r14 = r45
            if (r14 != r3) goto L_0x2af7
            int r3 = X.AnonymousClass3XX.A00
            r3 = 1073741824(0x40000000, float:2.0)
            r14 = r30
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r3)
        L_0x2ac9:
            r3 = r14
            if (r6 != 0) goto L_0x2af4
            int r3 = r15.A00
        L_0x2ace:
            r15 = r37
            X.Txy r12 = X.C14508TxU.A01(r15, r2, r12, r14, r3)
            r3 = r33
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r10)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            X.VQT r14 = new X.VQT
            r14.<init>(r3, r12)
            r3 = r18
            r3.add(r14)
            r3 = r36
            r3.add(r12)
            int r10 = r10 + 1
            goto L_0x2aa7
        L_0x2af4:
            int r14 = r15.A01
            goto L_0x2ace
        L_0x2af7:
            r3 = r32
            java.lang.Object r3 = r3.get(r4)
            X.0qQ.A07(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r16 = r3.intValue()
            int r3 = X.AnonymousClass3XX.A00
            r14 = 1073741824(0x40000000, float:2.0)
            r3 = r16
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r14)
            goto L_0x2ac9
        L_0x2b11:
            r10 = r38
            r3 = r18
            r10.add(r3)
            int r4 = r4 + 1
            goto L_0x2a82
        L_0x2b1c:
            java.lang.Object r2 = r2.A05
            X.6Rm r2 = (X.C307786Rm) r2
            if (r2 == 0) goto L_0x2b31
            java.lang.Object r3 = X.C307476Qg.A06(r2, r0)
            r3.getClass()
            X.Ty7 r3 = (X.Ty7) r3
            java.util.ArrayList r2 = X.0Yv.A1F(r33)
            r3.A08 = r2
        L_0x2b31:
            int r24 = android.view.View.MeasureSpec.getMode(r8)
            int r23 = android.view.View.MeasureSpec.getMode(r9)
            if (r6 != r1) goto L_0x2b45
            if (r24 != 0) goto L_0x2b4f
            java.lang.String r1 = "GridCollectionMeasureHelper: Width should be specified for vertical grid collection"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x2b45:
            if (r23 != 0) goto L_0x2b4f
            java.lang.String r1 = "GridCollectionMeasureHelper: Height should be specified for horizontal grid collection"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x2b4f:
            int r22 = android.view.View.MeasureSpec.getSize(r8)
            r3 = 1073741824(0x40000000, float:2.0)
            r21 = -1
            r2 = r24
            if (r2 == r3) goto L_0x2b5f
            r20 = -1
            if (r6 != r1) goto L_0x2b61
        L_0x2b5f:
            r20 = r22
        L_0x2b61:
            int r19 = android.view.View.MeasureSpec.getSize(r9)
            r2 = r23
            if (r2 == r3) goto L_0x2b6b
            if (r6 != 0) goto L_0x2b6d
        L_0x2b6b:
            r21 = r19
        L_0x2b6d:
            r3 = -1
            r2 = r20
            if (r2 == r3) goto L_0x2bcc
            r2 = r21
            if (r2 == r3) goto L_0x2bcc
        L_0x2b76:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
        L_0x2b7a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            X.0eP r2 = new X.0eP
            r2.<init>(r3, r1)
            java.lang.Object r1 = r2.A00
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            java.lang.Object r1 = r2.A01
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = r1.intValue()
            java.util.List r1 = r0.A0L()
            X.0qQ.A07(r1)
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x2ba9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x2c69
            java.lang.Object r1 = r2.next()
            X.4tV r1 = (X.C276544tV) r1
            X.0qQ.A0A(r1)
            boolean r0 = X.C49734F3z.A01(r1)
            if (r0 == 0) goto L_0x2bc7
            r0 = r7
        L_0x2bbf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
            goto L_0x2ba9
        L_0x2bc7:
            int r0 = X.C49734F3z.A00(r1)
            goto L_0x2bbf
        L_0x2bcc:
            int r8 = r13.left
            int r2 = r13.right
            int r8 = r8 + r2
            int r4 = r13.top
            int r2 = r13.bottom
            int r4 = r4 + r2
            int r18 = r38.size()
            r9 = 0
        L_0x2bdb:
            r2 = r18
            if (r9 >= r2) goto L_0x2c54
            r2 = r38
            java.lang.Object r17 = r2.get(r9)
            r2 = r17
            java.util.List r2 = (java.util.List) r2
            r17 = r2
            int r16 = r17.size()
            r12 = 0
            r11 = 0
            r10 = 0
        L_0x2bf2:
            r2 = r16
            if (r10 >= r2) goto L_0x2c2c
            r2 = r17
            java.lang.Object r2 = r2.get(r10)
            X.VQT r2 = (X.VQT) r2
            android.graphics.Rect r14 = r2.A00
            X.Txy r2 = r2.A01
            X.6SI r2 = r2.A00
            java.lang.Object r2 = r2.A00()
            X.6Sh r2 = (X.C307996Sh) r2
            X.3dH r2 = r2.A01
            r13 = r2
            int r15 = r2.A01()
            int r2 = r14.left
            int r15 = r15 + r2
            int r2 = r14.right
            int r15 = r15 + r2
            int r13 = r13.A00()
            int r2 = r14.top
            int r13 = r13 + r2
            int r2 = r14.bottom
            int r13 = r13 + r2
            int r12 = java.lang.Math.max(r12, r15)
            int r11 = java.lang.Math.max(r11, r13)
            int r10 = r10 + 1
            goto L_0x2bf2
        L_0x2c2c:
            int r8 = r8 + r12
            int r4 = r4 + r11
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != 0) goto L_0x2c46
            r2 = r24
            if (r2 != r10) goto L_0x2c3c
            r2 = r22
            if (r8 < r2) goto L_0x2c3c
            r20 = r2
        L_0x2c3c:
            r2 = r20
            if (r2 == r3) goto L_0x2c51
            r2 = r21
            if (r2 == r3) goto L_0x2c51
            goto L_0x2b76
        L_0x2c46:
            r2 = r23
            if (r2 != r10) goto L_0x2c3c
            r2 = r19
            if (r4 < r2) goto L_0x2c3c
            r21 = r2
            goto L_0x2c3c
        L_0x2c51:
            int r9 = r9 + 1
            goto L_0x2bdb
        L_0x2c54:
            if (r6 != r1) goto L_0x2c64
            r1 = r21
            if (r1 != r3) goto L_0x2c5c
            r21 = r4
        L_0x2c5c:
            r8 = r20
        L_0x2c5e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L_0x2b7a
        L_0x2c64:
            r1 = r20
            if (r1 == r3) goto L_0x2c5e
            goto L_0x2c5c
        L_0x2c69:
            X.UTu r2 = new X.UTu
            r0 = r36
            r2.<init>(r0, r6, r3, r4)
            goto L_0x30c9
        L_0x2c72:
            r3 = 99
            java.lang.String r7 = r0.A0K(r3)
            if (r7 != 0) goto L_0x2c7c
            java.lang.String r7 = "v1"
        L_0x2c7c:
            java.lang.String r3 = "v2"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x2eff
            java.lang.String r12 = "ListCollectionMeasureV2Helper"
            int r10 = X.C14535Txv.A00(r0)
            r3 = 63
            boolean r11 = r0.A0R(r3, r6)
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            int r3 = android.view.View.MeasureSpec.getMode(r9)
            if (r11 != 0) goto L_0x2c9e
            if (r10 != r1) goto L_0x2cfe
            if (r7 != 0) goto L_0x2d01
        L_0x2c9e:
            r18 = 1
            if (r11 != 0) goto L_0x2ca6
        L_0x2ca2:
            if (r10 != r1) goto L_0x2cf8
            if (r3 != 0) goto L_0x2cfb
        L_0x2ca6:
            r17 = 1
        L_0x2ca8:
            if (r18 != 0) goto L_0x2cad
            r15 = 0
            if (r17 == 0) goto L_0x2cae
        L_0x2cad:
            r15 = 1
        L_0x2cae:
            X.Typ r30 = new X.Typ
            r3 = r30
            r3.<init>(r2, r0)
            java.util.List r11 = r0.A0L()
            int r3 = r11.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r3)
            java.util.Iterator r14 = r11.iterator()
        L_0x2cc6:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x2d04
            java.lang.Object r13 = r14.next()
            X.4tV r13 = (X.C276544tV) r13
            X.0qQ.A0A(r13)
            r24 = r8
            r25 = r9
            if (r10 != r1) goto L_0x2cdf
            r24 = r9
            r25 = r8
        L_0x2cdf:
            r26 = r18 ^ 1
            r19 = r30
            r20 = r2
            r21 = r13
            r22 = r0
            r23 = r10
            X.6SI r11 = X.C14586Tyq.A03(r19, r20, r21, r22, r23, r24, r25, r26)
            X.Txy r3 = new X.Txy
            r3.<init>(r11, r13)
            r7.add(r3)
            goto L_0x2cc6
        L_0x2cf8:
            if (r7 != 0) goto L_0x2cfb
            goto L_0x2ca6
        L_0x2cfb:
            r17 = 0
            goto L_0x2ca8
        L_0x2cfe:
            if (r3 != 0) goto L_0x2d01
            goto L_0x2c9e
        L_0x2d01:
            r18 = 0
            goto L_0x2ca2
        L_0x2d04:
            r29 = 73
            if (r15 != 0) goto L_0x2d28
            int r3 = android.view.View.MeasureSpec.getSize(r8)
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            int r2 = r0.A03
            r1 = r29
            boolean r0 = r0.A0R(r1, r6)
            X.Ty3 r1 = X.C276984uE.A01(r7, r2, r0)
        L_0x2d1c:
            X.Txz r0 = new X.Txz
            r0.<init>(r7, r3, r4)
            X.Ty4 r2 = new X.Ty4
            r2.<init>(r1, r0)
            goto L_0x30c9
        L_0x2d28:
            r14 = 55
            r13 = 0
            java.lang.String r3 = r0.A0K(r14)     // Catch:{ 3yO -> 0x2d37 }
            r11 = 0
            if (r3 == 0) goto L_0x2d45
            float r11 = X.AnonymousClass6Su.A01(r3)     // Catch:{ 3yO -> 0x2d37 }
            goto L_0x2d45
        L_0x2d37:
            java.lang.String r11 = "Invalid format for spacing-after: "
            java.lang.String r3 = r0.A0K(r14)
            java.lang.String r3 = X.002.A0R(r11, r3)
            X.1Kn.A02(r12, r3)
            r11 = 0
        L_0x2d45:
            r3 = 56
            java.lang.String r15 = r0.A0K(r3)     // Catch:{ 3yO -> 0x2d53 }
            r14 = 0
            if (r15 == 0) goto L_0x2d61
            float r14 = X.AnonymousClass6Su.A01(r15)     // Catch:{ 3yO -> 0x2d53 }
            goto L_0x2d61
        L_0x2d53:
            java.lang.String r14 = "Invalid format for spacing-before: "
            java.lang.String r3 = r0.A0K(r3)
            java.lang.String r3 = X.002.A0R(r14, r3)
            X.1Kn.A02(r12, r3)
            r14 = 0
        L_0x2d61:
            r3 = 44
            java.lang.String r16 = r0.A0K(r3)     // Catch:{ 3yO -> 0x2d70 }
            r15 = 0
            if (r16 == 0) goto L_0x2d6e
            float r15 = X.AnonymousClass6Su.A01(r16)     // Catch:{ 3yO -> 0x2d70 }
        L_0x2d6e:
            r13 = r15
            goto L_0x2d7d
        L_0x2d70:
            java.lang.String r15 = "Invalid format for item-spacing: "
            java.lang.String r3 = r0.A0K(r3)
            java.lang.String r3 = X.002.A0R(r15, r3)
            X.1Kn.A02(r12, r3)
        L_0x2d7d:
            int r3 = (int) r14
            r16 = r3
            int r14 = (int) r13
            int r3 = (int) r11
            r15 = r17
            if (r10 != r1) goto L_0x2d8a
            r15 = r18
            r18 = r17
        L_0x2d8a:
            r11 = 0
            r28 = 0
            r27 = 1
            if (r10 != 0) goto L_0x2d95
            r28 = 1
            r27 = 0
        L_0x2d95:
            int r26 = android.view.View.MeasureSpec.getMode(r8)
            int r25 = android.view.View.MeasureSpec.getMode(r9)
            int[] r13 = new int[r4]
            r13 = {-1, -1} // fill-array
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r26 == 0) goto L_0x2ee4
            int r8 = android.view.View.MeasureSpec.getSize(r8)
        L_0x2dab:
            if (r15 != 0) goto L_0x2daf
            r13[r6] = r8
        L_0x2daf:
            if (r25 == 0) goto L_0x2db5
            int r12 = android.view.View.MeasureSpec.getSize(r9)
        L_0x2db5:
            if (r18 != 0) goto L_0x2db9
            r13[r1] = r12
        L_0x2db9:
            r4 = r13[r6]
            r9 = -1
            if (r4 <= r9) goto L_0x2e09
            r4 = r13[r1]
            if (r4 <= r9) goto L_0x2e09
        L_0x2dc2:
            r3 = r13[r6]
            java.util.Iterator r15 = r7.iterator()
            r12 = 0
        L_0x2dc9:
            boolean r8 = r15.hasNext()
            if (r8 == 0) goto L_0x2ee9
            java.lang.Object r8 = r15.next()
            int r14 = r12 + 1
            if (r12 < 0) goto L_0x2ef7
            X.Txy r8 = (X.C14538Txy) r8
            X.4tV r11 = r8.A01
            r13 = r3
            if (r10 != r1) goto L_0x2ddf
            r13 = r4
        L_0x2ddf:
            int r8 = X.AnonymousClass3XX.A00
            r9 = 1073741824(0x40000000, float:2.0)
            int r21 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r9)
            r8 = r4
            if (r10 != r1) goto L_0x2deb
            r8 = r3
        L_0x2deb:
            int r22 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            r16 = r30
            r17 = r2
            r18 = r11
            r19 = r0
            r20 = r10
            r23 = r1
            X.6SI r9 = X.C14586Tyq.A03(r16, r17, r18, r19, r20, r21, r22, r23)
            X.Txy r8 = new X.Txy
            r8.<init>(r9, r11)
            r7.set(r12, r8)
            r12 = r14
            goto L_0x2dc9
        L_0x2e09:
            r24 = 0
            r23 = 0
            r22 = 0
            if (r28 == 0) goto L_0x2e17
            r24 = r16
            r23 = r14
            r22 = r3
        L_0x2e17:
            r21 = 0
            r20 = 0
            r19 = 0
            if (r27 == 0) goto L_0x2e25
            r21 = r16
            r20 = r14
            r19 = r3
        L_0x2e25:
            r15 = 0
            r4 = 0
            r14 = 0
            r18 = 0
        L_0x2e2a:
            int r3 = r7.size()
            if (r15 >= r3) goto L_0x2e9b
            java.lang.Object r3 = r7.get(r15)
            X.Txy r3 = (X.C14538Txy) r3
            X.6SI r3 = r3.A00
            java.lang.Object r3 = r3.A00()
            X.6Sh r3 = (X.C307996Sh) r3
            X.3dH r3 = r3.A01
            r31 = r3
            r17 = 0
            if (r15 != 0) goto L_0x2e48
            r17 = 1
        L_0x2e48:
            int r3 = r7.size()
            int r3 = r3 + -1
            r16 = 0
            if (r15 == r3) goto L_0x2e54
            r16 = 1
        L_0x2e54:
            int r3 = r31.A01()
            if (r16 == 0) goto L_0x2ecc
            if (r17 == 0) goto L_0x2e5e
            int r3 = r24 + r3
        L_0x2e5e:
            int r3 = r3 + r23
        L_0x2e60:
            int r11 = java.lang.Math.max(r11, r3)
            int r4 = r4 + r3
            r3 = r13[r6]
            if (r3 > r9) goto L_0x2e73
            if (r28 == 0) goto L_0x2e6d
            if (r4 >= r8) goto L_0x2e71
        L_0x2e6d:
            if (r27 == 0) goto L_0x2e73
            if (r11 < r8) goto L_0x2e73
        L_0x2e71:
            r13[r6] = r8
        L_0x2e73:
            int r3 = r31.A00()
            if (r16 == 0) goto L_0x2ec5
            if (r17 == 0) goto L_0x2e7d
            int r3 = r21 + r3
        L_0x2e7d:
            int r3 = r3 + r20
        L_0x2e7f:
            int r14 = java.lang.Math.max(r14, r3)
            int r18 = r18 + r3
            if (r25 == 0) goto L_0x2e93
            if (r27 == 0) goto L_0x2e8d
            r3 = r18
            if (r3 >= r12) goto L_0x2e91
        L_0x2e8d:
            if (r28 == 0) goto L_0x2e93
            if (r14 < r12) goto L_0x2e93
        L_0x2e91:
            r13[r1] = r12
        L_0x2e93:
            r3 = r13[r6]
            if (r3 <= r9) goto L_0x2ec1
            r3 = r13[r1]
            if (r3 <= r9) goto L_0x2ec1
        L_0x2e9b:
            r3 = r13[r6]
            if (r3 > r9) goto L_0x2ea6
            if (r26 != 0) goto L_0x2eb5
            if (r28 == 0) goto L_0x2ea4
            r11 = r4
        L_0x2ea4:
            r13[r6] = r11
        L_0x2ea6:
            r4 = r13[r1]
            if (r4 > r9) goto L_0x2dc2
            if (r25 != 0) goto L_0x2ed3
            if (r27 == 0) goto L_0x2eb0
            r14 = r18
        L_0x2eb0:
            r13[r1] = r14
            r4 = r14
            goto L_0x2dc2
        L_0x2eb5:
            if (r28 == 0) goto L_0x2ebc
            int r11 = java.lang.Math.min(r4, r8)
            goto L_0x2ea4
        L_0x2ebc:
            int r11 = java.lang.Math.min(r11, r8)
            goto L_0x2ea4
        L_0x2ec1:
            int r15 = r15 + 1
            goto L_0x2e2a
        L_0x2ec5:
            if (r17 == 0) goto L_0x2ec9
            int r3 = r21 + r3
        L_0x2ec9:
            int r3 = r3 + r19
            goto L_0x2e7f
        L_0x2ecc:
            if (r17 == 0) goto L_0x2ed0
            int r3 = r24 + r3
        L_0x2ed0:
            int r3 = r3 + r22
            goto L_0x2e60
        L_0x2ed3:
            if (r27 == 0) goto L_0x2edf
            r3 = r18
            int r4 = java.lang.Math.min(r3, r12)
        L_0x2edb:
            r13[r1] = r4
            goto L_0x2dc2
        L_0x2edf:
            int r4 = java.lang.Math.min(r14, r12)
            goto L_0x2edb
        L_0x2ee4:
            r8 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x2dab
        L_0x2ee9:
            int r2 = r0.A03
            r1 = r29
            boolean r0 = r0.A0R(r1, r6)
            X.Ty3 r1 = X.C276984uE.A01(r7, r2, r0)
            goto L_0x2d1c
        L_0x2ef7:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x2eff:
            int r10 = X.C14535Txv.A00(r0)
            java.util.List r4 = r0.A0L()
            X.TyA r18 = new X.TyA
            r3 = r18
            r3.<init>(r2, r0)
            java.util.List r3 = r0.A0L()
            int r3 = r3.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r3)
            X.0qQ.A0A(r4)
            java.util.Iterator r17 = r4.iterator()
        L_0x2f22:
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x2ff2
            java.lang.Object r11 = r17.next()
            X.4tV r11 = (X.C276544tV) r11
            X.0qQ.A0A(r11)
            int r4 = android.view.View.MeasureSpec.getSize(r8)
            if (r10 != r1) goto L_0x2fee
            if (r4 == 0) goto L_0x2fee
            int r3 = X.AnonymousClass3XX.A00
            r3 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
        L_0x2f41:
            r13 = 132(0x84, float:1.85E-43)
            X.4tV r14 = r11.A07(r13)
            if (r14 == 0) goto L_0x2f8a
            int r15 = r14.A04
            r3 = 13366(0x3436, float:1.873E-41)
            if (r15 != r3) goto L_0x2f8a
            r3 = 41
            java.lang.String r14 = r14.A0K(r3)
            if (r10 != 0) goto L_0x2f8a
            if (r14 == 0) goto L_0x2f8a
            X.TxT r3 = X.AnonymousClass6Su.A0B(r14)     // Catch:{ 3yO -> 0x2f7f }
            float r15 = r3.A00     // Catch:{ 3yO -> 0x2f7f }
            java.lang.Integer r3 = r3.A01     // Catch:{ 3yO -> 0x2f7f }
            int r3 = r3.intValue()     // Catch:{ 3yO -> 0x2f7f }
            if (r3 == r6) goto L_0x2f77
            if (r3 != r1) goto L_0x2f8a
            float r3 = (float) r4     // Catch:{ 3yO -> 0x2f7f }
            float r15 = r15 * r3
            double r3 = (double) r15     // Catch:{ 3yO -> 0x2f7f }
            r15 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 / r15
            int r15 = (int) r3     // Catch:{ 3yO -> 0x2f7f }
            r3 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r3)     // Catch:{ 3yO -> 0x2f7f }
            goto L_0x2f8a
        L_0x2f77:
            int r4 = (int) r15     // Catch:{ 3yO -> 0x2f7f }
            r3 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)     // Catch:{ 3yO -> 0x2f7f }
            goto L_0x2f8a
        L_0x2f7f:
            java.lang.String r3 = "Error parsing style width: "
            java.lang.String r4 = X.002.A0R(r3, r14)
            java.lang.String r3 = "ListCollectionMeasureHelper"
            X.1Kn.A02(r3, r4)
        L_0x2f8a:
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            if (r10 == r1) goto L_0x2faf
            if (r4 == 0) goto L_0x2faf
            r3 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
        L_0x2f98:
            X.4tV r13 = r11.A07(r13)
            if (r13 == 0) goto L_0x2fe3
            int r15 = r13.A04
            r3 = 13366(0x3436, float:1.873E-41)
            if (r15 != r3) goto L_0x2fe3
            r3 = 35
            java.lang.String r13 = r13.A0K(r3)
            if (r10 != r1) goto L_0x2fe3
            if (r13 == 0) goto L_0x2fe3
            goto L_0x2fb2
        L_0x2faf:
            int r14 = X.AnonymousClass3XX.A00
            goto L_0x2f98
        L_0x2fb2:
            X.TxT r3 = X.AnonymousClass6Su.A0B(r13)     // Catch:{ 3yO -> 0x2fd8 }
            float r15 = r3.A00     // Catch:{ 3yO -> 0x2fd8 }
            java.lang.Integer r3 = r3.A01     // Catch:{ 3yO -> 0x2fd8 }
            int r3 = r3.intValue()     // Catch:{ 3yO -> 0x2fd8 }
            if (r3 == r6) goto L_0x2fd0
            if (r3 != r1) goto L_0x2fe3
            float r3 = (float) r4     // Catch:{ 3yO -> 0x2fd8 }
            float r15 = r15 * r3
            double r3 = (double) r15     // Catch:{ 3yO -> 0x2fd8 }
            r15 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 / r15
            int r15 = (int) r3     // Catch:{ 3yO -> 0x2fd8 }
            r3 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r3)     // Catch:{ 3yO -> 0x2fd8 }
            goto L_0x2fe3
        L_0x2fd0:
            int r4 = (int) r15     // Catch:{ 3yO -> 0x2fd8 }
            r3 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)     // Catch:{ 3yO -> 0x2fd8 }
            goto L_0x2fe3
        L_0x2fd8:
            java.lang.String r3 = "Error parsing style height: "
            java.lang.String r4 = X.002.A0R(r3, r13)
            java.lang.String r3 = "ListCollectionMeasureHelper"
            X.1Kn.A02(r3, r4)
        L_0x2fe3:
            r3 = r18
            X.Txy r3 = X.C14508TxU.A01(r3, r2, r11, r12, r14)
            r7.add(r3)
            goto L_0x2f22
        L_0x2fee:
            int r12 = X.AnonymousClass3XX.A00
            goto L_0x2f41
        L_0x2ff2:
            r2 = 63
            boolean r2 = r0.A0R(r2, r6)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x3038
            int r11 = android.view.View.MeasureSpec.getMode(r8)
            int r4 = android.view.View.MeasureSpec.getMode(r9)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r11 == r2) goto L_0x300c
            if (r11 != r3) goto L_0x3038
        L_0x300c:
            if (r4 == r2) goto L_0x3010
            if (r4 != r3) goto L_0x3038
        L_0x3010:
            int r3 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = android.view.View.MeasureSpec.getSize(r9)
            int[] r2 = new int[]{r3, r2}
        L_0x301c:
            r3 = r2[r6]
            r4 = r2[r1]
            int r2 = r0.A03
            r1 = 73
            boolean r0 = r0.A0R(r1, r6)
            X.Ty3 r1 = X.C276984uE.A01(r7, r2, r0)
            X.Txz r0 = new X.Txz
            r0.<init>(r7, r3, r4)
            X.Ty4 r2 = new X.Ty4
            r2.<init>(r1, r0)
            goto L_0x30c9
        L_0x3038:
            r2 = 55
            java.lang.String r3 = r0.A0K(r2)     // Catch:{ 3yO -> 0x30ea }
            r2 = 56
            java.lang.String r12 = r0.A0K(r2)     // Catch:{ 3yO -> 0x30ea }
            r2 = 44
            java.lang.String r4 = r0.A0K(r2)     // Catch:{ 3yO -> 0x30ea }
            r11 = 0
            if (r3 == 0) goto L_0x3051
            float r11 = X.AnonymousClass6Su.A01(r3)     // Catch:{ 3yO -> 0x30ea }
        L_0x3051:
            r3 = 0
            if (r12 == 0) goto L_0x3058
            float r3 = X.AnonymousClass6Su.A01(r12)     // Catch:{ 3yO -> 0x30ea }
        L_0x3058:
            r2 = 0
            if (r4 == 0) goto L_0x305f
            float r2 = X.AnonymousClass6Su.A01(r4)     // Catch:{ 3yO -> 0x30ea }
        L_0x305f:
            int r4 = (int) r3     // Catch:{ 3yO -> 0x30ea }
            int r3 = (int) r2     // Catch:{ 3yO -> 0x30ea }
            int r2 = (int) r11     // Catch:{ 3yO -> 0x30ea }
            r11 = r7
            r12 = r8
            r13 = r9
            r14 = r4
            r15 = r3
            r16 = r2
            r17 = r10
            int[] r2 = X.C14602Tz6.A00(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 3yO -> 0x30ea }
            goto L_0x301c
        L_0x3070:
            r2 = 0
            if (r11 == 0) goto L_0x307d
            r15 = r4[r6]
            int r7 = r11 + -1
            if (r7 != 0) goto L_0x30d8
            if (r15 == 0) goto L_0x307d
        L_0x307b:
            int r2 = r15.A00
        L_0x307d:
            if (r12 != r1) goto L_0x30d3
            int r3 = r10.top
            int r0 = r10.bottom
        L_0x3083:
            int r3 = r3 + r0
            int r2 = r2 + r3
            int r4 = android.view.View.MeasureSpec.getSize(r8)
            if (r12 != 0) goto L_0x3095
            r0 = 1073741824(0x40000000, float:2.0)
            if (r14 == r0) goto L_0x3095
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 != r0) goto L_0x30d1
            if (r2 < r4) goto L_0x30d1
        L_0x3095:
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            if (r12 != r1) goto L_0x30a5
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L_0x30a5
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 != r0) goto L_0x30cf
            if (r2 < r3) goto L_0x30cf
        L_0x30a5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.0eP r1 = new X.0eP
            r1.<init>(r2, r0)
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r0 = r1.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            X.Txz r2 = new X.Txz
            r0 = r28
            r2.<init>(r0, r3, r4)
        L_0x30c9:
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r2, r3, r4)
            return r0
        L_0x30cf:
            r3 = r2
            goto L_0x30a5
        L_0x30d1:
            r4 = r2
            goto L_0x3095
        L_0x30d3:
            int r3 = r10.left
            int r0 = r10.right
            goto L_0x3083
        L_0x30d8:
            int r6 = r15.A00
            if (r1 > r7) goto L_0x307b
            r3 = 1
        L_0x30dd:
            r2 = r4[r3]
            int r0 = r2.A00
            if (r6 >= r0) goto L_0x30e5
            r15 = r2
            r6 = r0
        L_0x30e5:
            if (r3 == r7) goto L_0x307b
            int r3 = r3 + 1
            goto L_0x30dd
        L_0x30ea:
            java.lang.String r1 = "Invalid pixel format for Collection spacing"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x30f2:
            r0 = 0
            X.6Tc r0 = X.C70850OOe.A00(r5, r0, r8, r9)
            return r0
        L_0x30f8:
            r2 = 0
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r2, r2)
            return r0
        L_0x3100:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            r0 = 0
            int r3 = X.C308216Te.A00(r8, r0)
            int r2 = X.C308216Te.A00(r9, r0)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x3114:
            r1 = 35
            X.4tV r1 = r0.A07(r1)
            if (r1 != 0) goto L_0x3125
            r2 = 0
            r1 = 24
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r2, r1, r1)
            return r0
        L_0x3125:
            r0 = 36
            java.lang.String r1 = r1.A0K(r0)     // Catch:{ 3yO -> 0x3134 }
            r0 = 1103101952(0x41c00000, float:24.0)
            if (r1 == 0) goto L_0x3137
            float r0 = X.AnonymousClass6Su.A01(r1)     // Catch:{ 3yO -> 0x3134 }
            goto L_0x3137
        L_0x3134:
            r4 = 24
            goto L_0x3138
        L_0x3137:
            int r4 = (int) r0
        L_0x3138:
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r4, r4)
            return r0
        L_0x313f:
            int r3 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = android.view.View.MeasureSpec.getSize(r9)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x314e:
            r2 = 31
            r1 = 0
            int r3 = r0.A03(r2, r1)
            int r2 = X.C308216Te.A00(r8, r1)
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r2, r3)
            return r0
        L_0x3160:
            if (r53 == 0) goto L_0x31d2
            android.content.Context r10 = r2.A04
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.lang.String r14 = r0.A0E()
            java.lang.String r15 = r0.A0H()
            java.lang.String r18 = r0.A0E()
            X.Uz7 r12 = X.C16671Uz7.GRID
            r2 = 0
            java.lang.String r1 = ""
            java.lang.String r0 = r0.A0I()
            if (r0 == 0) goto L_0x3181
            r1 = r0
        L_0x3181:
            X.WWk r11 = new X.WWk
            r11.<init>(r1)
            r13 = 0
            java.lang.String r16 = "bloks"
            r17 = r16
            r21 = r2
            r20 = r2
            X.WSC r3 = X.C17094VHq.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.3mq r0 = r5.A0I()
            java.lang.Object r0 = r0.ALg(r10)
            android.view.View r0 = (android.view.View) r0
            X.UEO r1 = new X.UEO
            r1.<init>(r0)
            r0 = 1
            X.C18270Vok.A01(r1, r3, r0)
            int r6 = X.C308216Te.A00(r8, r2)
            android.view.View r4 = r1.A01
            r4.measure(r8, r9)
            com.instagram.shopping.widget.clickabletext.ClickableTextContainer r3 = r1.A09
            r3.measure(r8, r9)
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x31c2
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x31c2
            int r2 = r1.topMargin
        L_0x31c2:
            int r1 = r4.getMeasuredHeight()
            int r0 = r3.getMeasuredHeight()
            int r1 = r1 + r0
            int r1 = r1 + r2
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r13, r6, r1)
            return r0
        L_0x31d2:
            java.lang.String r1 = "Product Tile binder returns a null render unit or a null bloksContext"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x31da:
            java.lang.String r1 = "MiniBloksComponentProductTileName"
            if (r53 == 0) goto L_0x3213
            X.3mq r3 = r5.A0I()
            android.content.Context r1 = r2.A04
            java.lang.Object r3 = r3.ALg(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.View"
            X.0qQ.A0C(r3, r1)
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r1 = r2.A05
            if (r1 == 0) goto L_0x320b
            X.6Rm r1 = (X.C307786Rm) r1
            X.C15659UgP.A00(r3, r1, r0)
            X.6Tc r0 = X.C18680Vwd.A01(r3, r5, r8, r9)
            X.2Th r4 = r0.A01
            int r3 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = r0.A00
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r4, r1, r3, r2)
            return r0
        L_0x320b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x3213:
            java.lang.String r0 = " received a null renderUnit"
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x321f:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            X.3mq r1 = r5.A0I()
            android.content.Context r0 = r2.A04
            java.lang.Object r1 = r1.ALg(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.igds.components.search.IgdsInlineSearchBox"
            X.0qQ.A0C(r1, r0)
            android.view.View r1 = (android.view.View) r1
            r1.measure(r8, r9)
            int r3 = r1.getMeasuredWidth()
            int r2 = r1.getMeasuredHeight()
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x3246:
            r1 = 35
            java.lang.Object r3 = X.C276544tV.A00(r0, r1)
            X.4tV r3 = (X.C276544tV) r3
            if (r3 == 0) goto L_0x3298
            X.2Ta r1 = r3.AEy(r2, r8, r9)
            r13 = 0
            r7 = 0
            r0 = 2
            X.0qQ.A0B(r1, r0)
            long r14 = X.C244873bt.A00(r8, r9)
            r10 = r2
            r11 = r1
            r12 = r3
            X.6Sh r4 = X.C308006Si.A00(r10, r11, r12, r13, r14)
            int[] r1 = new int[r0]
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != 0) goto L_0x3293
            X.3dH r0 = r4.A01
            int r0 = r0.A01()
        L_0x3273:
            r1[r7] = r0
            r6 = 1
        L_0x3276:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != 0) goto L_0x328e
            X.3dH r0 = r4.A01
            int r3 = r0.A00()
        L_0x3282:
            r1[r6] = r3
            r2 = r1[r7]
            X.3dH r1 = r4.A01
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r2, r3)
            return r0
        L_0x328e:
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            goto L_0x3282
        L_0x3293:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x3273
        L_0x3298:
            java.lang.String r1 = "PTR container has no child"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x32a0:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            X.3mq r1 = r5.A0I()
            android.content.Context r0 = r2.A04
            java.lang.Object r1 = r1.ALg(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ProgressBar"
            X.0qQ.A0C(r1, r0)
            android.view.View r1 = (android.view.View) r1
            r1.measure(r8, r9)
            int r3 = r1.getMeasuredWidth()
            int r2 = r1.getMeasuredHeight()
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r3, r2)
            return r0
        L_0x32c7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r3 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Attempting to calculateLayoutForComponent for unrecognized component style id %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "ComponentMapper"
            X.1Kn.A02(r0, r1)
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L_0x32f8
            int r2 = android.view.View.MeasureSpec.getSize(r8)
        L_0x32e7:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != r1) goto L_0x32f1
            int r3 = android.view.View.MeasureSpec.getSize(r9)
        L_0x32f1:
            r1 = 0
            X.6Tc r0 = new X.6Tc
            r0.<init>(r5, r1, r2, r3)
            return r0
        L_0x32f8:
            r2 = 0
            goto L_0x32e7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276774ts.A02(X.3c0, X.2Th, X.4tV, int, int):X.2Ta");
    }
}
