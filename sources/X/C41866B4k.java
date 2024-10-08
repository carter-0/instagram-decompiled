package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.B4k  reason: case insensitive filesystem */
public final class C41866B4k extends 1P0 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C46199DQb A02;
    public final /* synthetic */ 1Av A03;
    public final /* synthetic */ String A04;

    public C41866B4k(UserSession userSession, C46199DQb dQb, 1Av r3, String str, long j) {
        this.A03 = r3;
        this.A00 = j;
        this.A02 = dQb;
        this.A01 = userSession;
        this.A04 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r36) {
        /*
            r35 = this;
            r1 = r36
            r0 = 738758969(0x2c089139, float:1.9407377E-12)
            int r15 = X.AnonymousClass0fD.A03(r0)
            X.3JC r1 = (X.AnonymousClass3JC) r1
            r0 = 1098716716(0x417d162c, float:15.817913)
            int r8 = X.AnonymousClass7TG.A0D(r1, r0)
            java.lang.Object r0 = r1.A01
            X.DYU r0 = (X.DYU) r0
            r7 = 0
            if (r0 == 0) goto L_0x01c0
            X.Dax r18 = r0.BFb()
        L_0x001d:
            r1 = r35
            X.1Av r2 = r1.A03
            long r9 = r1.A00
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r2.A0p(r0)
            if (r18 == 0) goto L_0x01cb
            com.instagram.common.session.UserSession r11 = r1.A01
            java.lang.String r6 = r1.A04
            r4 = 2
            X.DYT r3 = r18.C7l()
            r5 = 0
            if (r3 == 0) goto L_0x01bc
            java.lang.String r25 = r3.getText()
        L_0x003c:
            X.DYS r3 = r18.C2Z()
            if (r3 == 0) goto L_0x01b8
            java.lang.String r26 = r3.getText()
        L_0x0046:
            X.DYL r3 = r18.BfR()
            if (r3 == 0) goto L_0x01b4
            java.lang.String r29 = r3.getText()
        L_0x0050:
            X.DYK r3 = r18.BfQ()
            if (r3 == 0) goto L_0x01b0
            java.lang.String r30 = r3.getText()
        L_0x005a:
            X.DYR r3 = r18.BqV()
            if (r3 == 0) goto L_0x01ac
            java.lang.String r31 = r3.getText()
        L_0x0064:
            X.DYQ r3 = r18.BqU()
            if (r3 == 0) goto L_0x01a8
            java.lang.String r32 = r3.getText()
        L_0x006e:
            java.lang.String r27 = r18.Aqt()
            kotlin.enums.EnumEntries r3 = X.C69354Njt.A02
            X.NkR r3 = r18.B6b()
            if (r3 == 0) goto L_0x007e
            java.lang.String r5 = r3.name()
        L_0x007e:
            X.Njt r20 = X.O0X.A00(r5)
            X.9sh r3 = r18.Aio()
            if (r3 == 0) goto L_0x01a4
            int r3 = r3.ordinal()
            if (r3 != r4) goto L_0x01a4
            java.lang.Integer r21 = X.AnonymousClass05K.A00
        L_0x0090:
            X.EWq r3 = r18.BfS()
            if (r3 == 0) goto L_0x01a0
            int r5 = r3.ordinal()
            r3 = 1
            if (r5 != r3) goto L_0x01a0
            java.lang.Integer r22 = X.AnonymousClass05K.A00
        L_0x009f:
            X.EWq r3 = r18.BqW()
            if (r3 == 0) goto L_0x019c
            int r5 = r3.ordinal()
            r3 = 1
            if (r5 != r3) goto L_0x019c
            java.lang.Integer r23 = X.AnonymousClass05K.A00
        L_0x00ae:
            X.NkQ r3 = r18.AfE()
            if (r3 == 0) goto L_0x0198
            int r3 = r3.ordinal()
            if (r3 == r4) goto L_0x0194
            r4 = 1
            if (r3 != r4) goto L_0x0198
            java.lang.Integer r24 = X.AnonymousClass05K.A0C
        L_0x00bf:
            r28 = r6
            r33 = r9
            r19 = r11
            X.N3L r13 = X.C66832MdQ.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.DYP r5 = r18.Bp6()
            if (r5 == 0) goto L_0x01dc
            X.7Up r4 = X.C332337Uo.A00(r11)
            boolean r3 = r4.A01()
            if (r3 == 0) goto L_0x01dc
            X.7Uz r12 = r4.A02
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            com.google.common.collect.ImmutableList r3 = r5.BIb()
            X.0qQ.A07(r3)
            java.util.Iterator r17 = r3.iterator()
        L_0x00ea:
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x01d0
            java.lang.Object r14 = r17.next()
            X.DaA r14 = (X.DaA) r14
            r14.BGb()
            java.lang.String r26 = r14.CAh()
            X.DYM r3 = r14.BGb()
            r16 = 0
            if (r3 == 0) goto L_0x0192
            X.DZQ r3 = r3.ACd()
            if (r3 == 0) goto L_0x0192
            int r10 = r3.BPZ()
            int r9 = r3.BPa()
            int r4 = r3.BGX()
            X.30J r3 = X.AnonymousClass30J.SECONDS
            long r3 = X.AnonymousClass30K.A03(r3, r4)
            X.9VH r5 = new X.9VH
            r5.<init>(r10, r9, r3)
        L_0x0122:
            X.DYN r3 = r14.BJf()
            if (r3 == 0) goto L_0x012c
            X.DZ1 r16 = r3.ACc()
        L_0x012c:
            r4 = 0
            if (r16 == 0) goto L_0x0140
            java.lang.String r9 = r16.B6c()
            java.lang.String r3 = r16.B6Z()
            if (r9 == 0) goto L_0x0140
            if (r3 == 0) goto L_0x0140
            X.BB6 r4 = new X.BB6
            r4.<init>(r9, r3)
        L_0x0140:
            if (r26 == 0) goto L_0x00ea
            if (r5 == 0) goto L_0x00ea
            if (r4 == 0) goto L_0x00ea
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r14.C4V()
            com.google.common.collect.ImmutableList r9 = r14.C4V()
            X.0qQ.A07(r9)
            java.util.Iterator r10 = r9.iterator()
        L_0x0159:
            boolean r9 = r10.hasNext()
            if (r9 == 0) goto L_0x0174
            java.lang.Object r9 = r10.next()
            X.DYO r9 = (X.DYO) r9
            X.Px3 r9 = r9.ACe()
            X.0qQ.A07(r9)
            X.9VG r9 = X.C67549Mpj.A00(r9)
            r3.add(r9)
            goto L_0x0159
        L_0x0174:
            int r28 = r14.getPriority()
            X.9VE r9 = new X.9VE
            r19 = r9
            r20 = r5
            r21 = r4
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r27 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r11.add(r9)
            goto L_0x00ea
        L_0x0192:
            r5 = 0
            goto L_0x0122
        L_0x0194:
            java.lang.Integer r24 = X.AnonymousClass05K.A01
            goto L_0x00bf
        L_0x0198:
            java.lang.Integer r24 = X.AnonymousClass05K.A00
            goto L_0x00bf
        L_0x019c:
            java.lang.Integer r23 = X.AnonymousClass05K.A01
            goto L_0x00ae
        L_0x01a0:
            java.lang.Integer r22 = X.AnonymousClass05K.A01
            goto L_0x009f
        L_0x01a4:
            java.lang.Integer r21 = X.AnonymousClass05K.A01
            goto L_0x0090
        L_0x01a8:
            r32 = r7
            goto L_0x006e
        L_0x01ac:
            r31 = r7
            goto L_0x0064
        L_0x01b0:
            r30 = r7
            goto L_0x005a
        L_0x01b4:
            r29 = r7
            goto L_0x0050
        L_0x01b8:
            r26 = r7
            goto L_0x0046
        L_0x01bc:
            r25 = r7
            goto L_0x003c
        L_0x01c0:
            r18 = r7
            goto L_0x001d
        L_0x01c4:
            java.lang.String r2 = "ProactiveWarningBannerLoader"
            java.lang.String r0 = "invalid data"
            X.0wb.A03(r2, r0)
        L_0x01cb:
            X.DQb r1 = r1.A02
            X.48z r0 = X.C2612848z.A00
            goto L_0x01fc
        L_0x01d0:
            java.util.List r4 = X.00k.A0a(r11)
            X.7Us r3 = r12.A01
            r3.A03(r0)
            r3.A04(r4)
        L_0x01dc:
            X.DYJ r3 = r18.B3H()
            if (r3 == 0) goto L_0x01ea
            boolean r3 = r3.BJC()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
        L_0x01ea:
            X.C66832MdQ.A02(r2, r7, r6)
            boolean r0 = r2.A25(r6, r0)
            if (r0 != 0) goto L_0x01cb
            if (r13 == 0) goto L_0x01c4
            X.DQb r1 = r1.A02
            X.3xQ r0 = new X.3xQ
            r0.<init>(r13)
        L_0x01fc:
            r1.DOY(r0)
            r0 = 2084882084(0x7c44c6a4, float:4.0868764E36)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = 1155855319(0x44e4f3d7, float:1831.62)
            X.AnonymousClass0fD.A0A(r0, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41866B4k.onSuccessInBackground(java.lang.Object):void");
    }

    public final void onFailInBackground(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(395105121);
        C46199DQb dQb = this.A02;
        C2612848z r0 = C2612848z.A00;
        0qQ.A07(r0);
        dQb.DOY(r0);
        AnonymousClass0fD.A0A(-314061233, A032);
    }
}
