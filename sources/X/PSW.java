package X;

public final class PSW implements 1aV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public PSW(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = obj;
        this.A02 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x024a, code lost:
        r1.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x024d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0266, code lost:
        X.C69902Nu4.A00(r2, r1, r0);
        r0 = (X.0sP) r9.A02;
        r3 = X.C68720NUg.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x026f, code lost:
        r0.invoke(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0272, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02ac, code lost:
        r2.A0D(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02af, code lost:
        r0 = (X.0sP) r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        X.0qQ.A0B(r7, 0);
        X.0qQ.A0B(r4, 3);
        r0 = r7.mResultSet.getInteger(0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002f, code lost:
        if (r0 == 1) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r0 != 2) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        X.C299275ur.A00(r4.A00, X.AnonymousClass6Tm.A01, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
        r8.A02(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0127 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0127 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x020f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r33) {
        /*
            r32 = this;
            r9 = r32
            r7 = r33
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x023a;
                case 1: goto L_0x01b9;
                case 2: goto L_0x0180;
                case 3: goto L_0x005a;
                case 4: goto L_0x003b;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.NBG r7 = (X.NBG) r7
            java.lang.Object r8 = r9.A02
            X.Oaw r8 = (X.C71077Oaw) r8
            X.0qQ.A0A(r7)
            java.lang.Object r6 = r9.A04
            X.4uI r6 = (X.C277014uI) r6
            java.lang.Object r5 = r9.A03
            X.4uI r5 = (X.C277014uI) r5
            java.lang.Object r4 = r9.A01
            X.5ur r4 = (X.C299275ur) r4
        L_0x001e:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r3 = 1
            r2 = 2
            r0 = 3
            X.0qQ.A0B(r4, r0)
            com.facebook.msys.mci.CQLResultSet r1 = r7.mResultSet
            r0 = 0
            int r0 = r1.getInteger(r0, r0)
            if (r0 == r3) goto L_0x0056
            if (r0 != r2) goto L_0x003a
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            X.6Rx r0 = r4.A00
            X.C299275ur.A00(r0, r1, r6)
        L_0x003a:
            return
        L_0x003b:
            X.NBG r7 = (X.NBG) r7
            java.lang.Object r8 = r9.A02
            X.Oaw r8 = (X.C71077Oaw) r8
            X.0qQ.A0A(r7)
            java.lang.Object r6 = r9.A04
            X.4uI r6 = (X.C277014uI) r6
            java.lang.Object r5 = r9.A03
            X.4uI r5 = (X.C277014uI) r5
            java.lang.Object r0 = r9.A01
            X.6Rx r0 = (X.C307896Rx) r0
            X.5ur r4 = new X.5ur
            r4.<init>(r0)
            goto L_0x001e
        L_0x0056:
            r8.A02(r4, r5)
            return
        L_0x005a:
            X.3xP r7 = (X.C257443xP) r7
            r21 = 0
            r0 = r21
            X.0qQ.A0B(r7, r0)
            boolean r10 = r7.A06()
            java.lang.Object r8 = r9.A04
            X.OyU r8 = (X.C72204OyU) r8
            java.lang.Object r6 = r9.A03
            X.3t3 r6 = (X.C254793t3) r6
            if (r10 == 0) goto L_0x0165
            java.lang.Object r0 = r7.A03()
            X.NH7 r0 = (X.NH7) r0
            java.util.List r0 = r0.A00
            java.lang.Object r5 = r9.A01
            X.3t0 r5 = (X.C254763t0) r5
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r20 = r0.iterator()
        L_0x0085:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r20.next()
            X.OMx r0 = (X.C70825OMx) r0
            X.Oa5 r3 = new X.Oa5
            r3.<init>((X.C70825OMx) r0)
            X.1Xj r19 = r3.A02()
            if (r19 == 0) goto L_0x0127
            com.instagram.common.session.UserSession r13 = r8.A04
            java.lang.String r2 = r3.A04()
            java.lang.Boolean r12 = r3.A03()
            java.lang.Object r1 = r3.A00
            boolean r0 = r1 instanceof X.OIP
            if (r0 != 0) goto L_0x0161
            boolean r0 = r1 instanceof X.C70825OMx
            if (r0 == 0) goto L_0x0158
            X.OMx r1 = (X.C70825OMx) r1
            java.lang.Long r0 = r1.A05
            r16 = r0
        L_0x00b6:
            r14 = 1
            X.0Tu r11 = X.0Tu.A05
            r0 = 36321529104967159(0x810a3d000025f7, double:3.033219488815134E-306)
            boolean r0 = X.182.A06(r11, r13, r0)
            if (r0 == 0) goto L_0x0127
            java.lang.String r24 = X.AnonymousClass4KK.A02(r5)
            X.3tH r18 = X.AnonymousClass4KK.A00(r5)
            r1 = r18
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            boolean r15 = X.0qQ.A0K(r12, r0)
            if (r15 == 0) goto L_0x0153
            X.3tH r1 = X.C254923tH.ACT
        L_0x00da:
            java.lang.String r1 = r1.A00
            r17 = r1
        L_0x00de:
            r31 = 1
            boolean r1 = X.0qQ.A0K(r12, r0)
            if (r1 != 0) goto L_0x00ee
            if (r18 == 0) goto L_0x0150
            boolean r1 = r18.A00()
            if (r1 != r14) goto L_0x0150
        L_0x00ee:
            r14 = 36321529105032696(0x810a3d000125f8, double:3.0332194888565797E-306)
            boolean r1 = X.182.A06(r11, r13, r14)
            if (r1 == 0) goto L_0x00ff
            X.4KM r1 = X.AnonymousClass4KL.A01
            java.lang.String r2 = r1.A00(r2)
        L_0x00ff:
            X.1iA r11 = r19.BR7()
            X.1iA r1 = X.1iA.A0a
            if (r11 != r1) goto L_0x012c
            java.lang.Integer r23 = X.AnonymousClass05K.A01
        L_0x0109:
            boolean r30 = X.0qQ.A0K(r12, r0)
            long r27 = X.JTS.A06(r16)
            X.4KO r0 = new X.4KO
            r22 = r0
            r25 = r17
            r26 = r2
            r29 = r21
            r22.<init>(r23, r24, r25, r26, r27, r29, r30, r31)
            com.instagram.model.mediasize.ImageInfo r1 = r19.A1p()
            if (r1 == 0) goto L_0x0127
            X.1iI.A08(r0, r1)
        L_0x0127:
            r4.add(r3)
            goto L_0x0085
        L_0x012c:
            X.1iA r11 = r19.BR7()
            X.1iA r1 = X.1iA.A0Q
            if (r11 != r1) goto L_0x0137
            java.lang.Integer r23 = X.AnonymousClass05K.A00
            goto L_0x0109
        L_0x0137:
            com.instagram.model.mediatype.ProductType r11 = r19.A1v()
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r11 != r1) goto L_0x0142
            java.lang.Integer r23 = X.AnonymousClass05K.A0Y
            goto L_0x0109
        L_0x0142:
            com.instagram.model.mediatype.ProductType r11 = r19.A1v()
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.FEED
            if (r11 != r1) goto L_0x014d
            java.lang.Integer r23 = X.AnonymousClass05K.A0j
            goto L_0x0109
        L_0x014d:
            java.lang.Integer r23 = X.AnonymousClass05K.A06
            goto L_0x0109
        L_0x0150:
            r31 = 0
            goto L_0x00ee
        L_0x0153:
            if (r18 != 0) goto L_0x00da
            r17 = 0
            goto L_0x00de
        L_0x0158:
            boolean r0 = r1 instanceof X.N3S
            if (r0 != 0) goto L_0x0161
            java.lang.IllegalStateException r0 = X.C66583MXo.A0b(r1)
            throw r0
        L_0x0161:
            r16 = 0
            goto L_0x00b6
        L_0x0165:
            X.0sn r4 = X.0sn.A00
        L_0x0167:
            r0 = 0
            goto L_0x017c
        L_0x0169:
            java.lang.Object r0 = r7.A03()
            X.NH7 r0 = (X.NH7) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x017b
            java.lang.Object r0 = r9.A02
            X.0r1 r0 = (X.0r1) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0167
        L_0x017b:
            r0 = 1
        L_0x017c:
            X.C72204OyU.A08(r8, r6, r4, r10, r0)
            return
        L_0x0180:
            java.lang.Object r5 = r9.A04
            X.Ma2 r5 = (X.C66633Ma2) r5
            X.1a8 r4 = r5.A1K
            java.lang.Object r3 = r9.A02
            X.3sy r3 = (X.C254743sy) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.model.direct.threadkey.impl.MsysThreadId"
            X.0qQ.A0C(r3, r0)
            r1 = r3
            com.instagram.model.direct.threadkey.impl.MsysThreadId r1 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r1
            X.MYb r0 = X.MYc.A00(r5)
            X.1aU r1 = r0.A01(r1)
            r0 = 23
            X.1aU r1 = X.C72120Owf.A00(r1, r5, r0)
            X.4fh r0 = X.C318146oT.A01
            X.1aU r2 = r1.A0P(r0)
            java.lang.Object r1 = r9.A03
            java.lang.Object r0 = r9.A01
            r9 = 1
            X.PSc r8 = new X.PSc
            r10 = r1
            r11 = r7
            r12 = r5
            r13 = r0
            r14 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r4.A02(r2, r8)
            return
        L_0x01b9:
            X.NoL r7 = (X.C69577NoL) r7
            X.NTz r0 = X.C68713NTz.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r1 = r9.A03
            X.Mex r1 = (X.C66913Mex) r1
            java.lang.String r0 = "BLOCKSTORE_RECOVERY_CODE_FETCHED"
            goto L_0x024a
        L_0x01cb:
            X.NU1 r0 = X.NU1.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r0 = r9.A04
            X.P12 r0 = (X.P12) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.Object r0 = r9.A01
            android.app.Activity r0 = (android.app.Activity) r0
            android.app.Application r1 = r0.getApplication()
            java.lang.String r0 = "EB restored through block store successfully"
            goto L_0x0266
        L_0x01e5:
            X.NTy r0 = X.C68712NTy.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x01fe
            X.NU0 r0 = X.NU0.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x01fe
            boolean r0 = r7 instanceof X.C68711NTx
            if (r0 != 0) goto L_0x01fe
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01fe:
            boolean r0 = r7 instanceof X.C68711NTx
            if (r0 == 0) goto L_0x0220
            X.NTx r7 = (X.C68711NTx) r7
            java.lang.String r0 = r7.A00
        L_0x0206:
            X.NUe r3 = new X.NUe
            r3.<init>(r0)
        L_0x020b:
            boolean r0 = r3 instanceof X.C68718NUe
            if (r0 == 0) goto L_0x02af
            java.lang.Object r2 = r9.A03
            X.Mex r2 = (X.C66913Mex) r2
            r0 = r3
            X.NUe r0 = (X.C68718NUe) r0
            java.lang.String r1 = r0.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "BLOCKSTORE_FAILURE_REASON"
            goto L_0x02ac
        L_0x0220:
            boolean r0 = r7 instanceof X.C68712NTy
            if (r0 == 0) goto L_0x0227
            java.lang.String r0 = "Blockstore Not Supported"
            goto L_0x0206
        L_0x0227:
            boolean r0 = r7 instanceof X.NU0
            if (r0 == 0) goto L_0x0237
            java.lang.Object r1 = r9.A03
            X.Mex r1 = (X.C66913Mex) r1
            java.lang.String r0 = "BLOCKSTORE_RECOVERY_CODE_NOT_FOUND"
            r1.A0B(r0)
            X.NUf r3 = X.C68719NUf.A00
            goto L_0x020b
        L_0x0237:
            java.lang.String r0 = "Unknown Blockstore Error"
            goto L_0x0206
        L_0x023a:
            X.NoG r7 = (X.C69572NoG) r7
            X.NTg r0 = X.C68694NTg.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x024e
            java.lang.Object r1 = r9.A03
            X.Mex r1 = (X.C66913Mex) r1
            java.lang.String r0 = "AUTORESTORE_RECOVERY_CODE_FETCHED"
        L_0x024a:
            r1.A0B(r0)
            return
        L_0x024e:
            X.NTi r0 = X.C68696NTi.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x0273
            java.lang.Object r0 = r9.A04
            X.P11 r0 = (X.P11) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.Object r0 = r9.A01
            android.app.Activity r0 = (android.app.Activity) r0
            android.app.Application r1 = r0.getApplication()
            java.lang.String r0 = "EB restored through auto restore successfully"
        L_0x0266:
            X.C69902Nu4.A00(r2, r1, r0)
            java.lang.Object r0 = r9.A02
            X.0sP r0 = (X.0sP) r0
            X.NUg r3 = X.C68720NUg.A00
        L_0x026f:
            r0.invoke(r3)
            return
        L_0x0273:
            X.NTf r0 = X.C68693NTf.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x028c
            X.NTh r0 = X.C68695NTh.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x028c
            boolean r0 = r7 instanceof X.C68692NTe
            if (r0 != 0) goto L_0x028c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x028c:
            boolean r0 = r7 instanceof X.C68692NTe
            if (r0 == 0) goto L_0x02b4
            X.NTe r7 = (X.C68692NTe) r7
            java.lang.String r0 = r7.A00
        L_0x0294:
            X.NUe r3 = new X.NUe
            r3.<init>(r0)
        L_0x0299:
            boolean r0 = r3 instanceof X.C68718NUe
            if (r0 == 0) goto L_0x02af
            java.lang.Object r2 = r9.A03
            X.Mex r2 = (X.C66913Mex) r2
            r0 = r3
            X.NUe r0 = (X.C68718NUe) r0
            java.lang.String r1 = r0.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "AUTORESTORE_FAILURE_REASON"
        L_0x02ac:
            r2.A0D(r0, r1)
        L_0x02af:
            java.lang.Object r0 = r9.A02
            X.0sP r0 = (X.0sP) r0
            goto L_0x026f
        L_0x02b4:
            boolean r0 = r7 instanceof X.C68693NTf
            if (r0 == 0) goto L_0x02bb
            java.lang.String r0 = "Auto Restore Not Supported"
            goto L_0x0294
        L_0x02bb:
            boolean r0 = r7 instanceof X.C68695NTh
            if (r0 == 0) goto L_0x02cb
            java.lang.Object r1 = r9.A03
            X.Mex r1 = (X.C66913Mex) r1
            java.lang.String r0 = "AUTORESTORE_RECOVERY_CODE_NOT_FOUND"
            r1.A0B(r0)
            X.NUf r3 = X.C68719NUf.A00
            goto L_0x0299
        L_0x02cb:
            java.lang.String r0 = "Unknown Auto Restore Error"
            goto L_0x0294
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PSW.accept(java.lang.Object):void");
    }
}
