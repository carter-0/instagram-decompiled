package X;

/* renamed from: X.Eo5  reason: case insensitive filesystem */
public abstract /* synthetic */ class C49029Eo5 {
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017e, code lost:
        if (r2.A08() == null) goto L_0x0180;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder A00(X.AnonymousClass0aP r15, X.C60937Jtv r16, X.C239803Ii r17, java.lang.Integer r18, int r19, int r20, boolean r21, boolean r22) {
        /*
            r12 = r19
            r11 = r18
            r13 = r22
            r14 = r21
            r9 = 0
            r1 = r20
            r0 = r20 & 16
            if (r0 == 0) goto L_0x0010
            r14 = 0
        L_0x0010:
            r0 = r20 & 64
            if (r0 == 0) goto L_0x0015
            r13 = 0
        L_0x0015:
            r0 = r1 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r0 == 0) goto L_0x001b
            r11 = r9
        L_0x001b:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0020
            r12 = 1
        L_0x0020:
            r0 = r1 & 512(0x200, float:7.175E-43)
            r7 = r15
            if (r0 == 0) goto L_0x0090
            X.0wX r0 = r15.A00
            android.content.Context r4 = r0.A06()
        L_0x002b:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0031
            X.DiE r9 = X.C46634DiE.A0G
        L_0x0031:
            r8 = r16
            r3 = r17
            X.AnonymousClass7TG.A1N(r8, r3)
            r0 = 3
            X.AnonymousClass7TF.A1G(r15, r0, r4)
            r0 = 10
            X.0qQ.A0B(r9, r0)
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x008a
            r0 = r3
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            X.Dvv r0 = (X.C47361Dvv) r0
            X.Ebh r0 = X.C44960Cnu.A00(r0)
            X.3Ih r10 = X.C41845B3m.A0d(r0)
        L_0x0054:
            android.content.Context r6 = X.DbT.A05(r4)
            X.F0t r5 = new X.F0t
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r1 == 0) goto L_0x00bb
            X.Jtv r0 = r5.A03
            java.lang.Integer r2 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 == r0) goto L_0x015d
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r2 == r0) goto L_0x015d
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r2 == r0) goto L_0x015d
            r1 = 18
            X.G4U r0 = new X.G4U
            r0.<init>(r5, r1)
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = new com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder
            r3.<init>()
            r0.invoke(r3)
            int r0 = r2.intValue()
            switch(r0) {
                case 0: goto L_0x0092;
                case 1: goto L_0x009d;
                case 2: goto L_0x0092;
                case 3: goto L_0x0092;
                case 4: goto L_0x0092;
                case 5: goto L_0x018f;
                case 6: goto L_0x018f;
                case 7: goto L_0x018f;
                case 8: goto L_0x009d;
                case 9: goto L_0x00b1;
                default: goto L_0x0085;
            }
        L_0x0085:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008a:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01c9
            r10 = r3
            goto L_0x0054
        L_0x0090:
            r4 = r9
            goto L_0x002b
        L_0x0092:
            java.lang.String r1 = "Unexpected resolvable account type received: "
            java.lang.String r0 = X.C49774F6h.A01(r2)
            java.lang.IllegalStateException r0 = X.DbW.A0c(r1, r0)
            throw r0
        L_0x009d:
            X.FfW r0 = X.C49854F9t.A02
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r3.A02(r0)
            X.FfW r0 = X.C49854F9t.A0G
            X.0qQ.A0B(r0, r1)
            r3.A02(r0)
            X.FfW r1 = X.C49854F9t.A0C
            goto L_0x00b3
        L_0x00b1:
            X.FfW r1 = X.C49854F9t.A0A
        L_0x00b3:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r3.A02(r1)
            return r3
        L_0x00bb:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01c4
            X.Jtv r3 = r5.A03
            java.lang.Integer r4 = r3.A01
            X.3Ii r1 = r5.A05
            X.G3g r0 = X.C51822G3g.A00
            java.lang.Object r0 = X.C49775F6i.A00(r1, r0)
            X.4dm r0 = (X.C268654dm) r0
            X.F2t r0 = X.C46413Dea.A03(r0)
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x00e5
            r1 = 19
            X.G4U r0 = new X.G4U
            r0.<init>(r5, r1)
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = new com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder
            r3.<init>()
            r0.invoke(r3)
            return r3
        L_0x00e5:
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L_0x00f2
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C49931FFk.A00(r5)
            return r3
        L_0x00f2:
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C49931FFk.A01(r5)
            return r3
        L_0x00f7:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 == r0) goto L_0x019c
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r4 == r0) goto L_0x019c
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r4 == r0) goto L_0x019c
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            if (r4 != r0) goto L_0x0138
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C49931FFk.A00(r5)
            X.FfW r1 = X.C49854F9t.A09
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r3.A02(r1)
        L_0x0114:
            r1 = 19
            X.MEQ r0 = new X.MEQ
            r0.<init>(r1, r2)
            X.FfX r1 = new X.FfX
            r1.<init>(r0)
            X.FfW r0 = new X.FfW
            r0.<init>(r1)
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r3.A02(r0)
            int r0 = r4.intValue()
            switch(r0) {
                case 0: goto L_0x018f;
                case 1: goto L_0x0149;
                case 2: goto L_0x0152;
                case 3: goto L_0x0152;
                case 4: goto L_0x0152;
                case 5: goto L_0x018f;
                case 6: goto L_0x0146;
                case 7: goto L_0x0146;
                case 8: goto L_0x0149;
                case 9: goto L_0x018f;
                default: goto L_0x0133;
            }
        L_0x0133:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0138:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r4 != r0) goto L_0x0141
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C49931FFk.A01(r5)
            goto L_0x0114
        L_0x0141:
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C49931FFk.A00(r5)
            goto L_0x0114
        L_0x0146:
            X.FfW r0 = X.C49854F9t.A0B
            goto L_0x014b
        L_0x0149:
            X.FfW r0 = X.C49854F9t.A08
        L_0x014b:
            X.0qQ.A0B(r0, r1)
            r3.A02(r0)
            return r3
        L_0x0152:
            java.lang.String r1 = "Unexpected resolvable account type received: "
            java.lang.String r0 = X.C49774F6h.A01(r4)
            java.lang.IllegalStateException r0 = X.DbW.A0c(r1, r0)
            throw r0
        L_0x015d:
            X.3Ii r1 = r5.A05
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0190
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.Ebh r2 = (X.C48262Ebh) r2
            if (r2 == 0) goto L_0x0199
            com.instagram.user.model.User r0 = r2.A03()
            if (r0 == 0) goto L_0x0199
            r1 = 1
            boolean r0 = r2.A0A()
            if (r0 != r1) goto L_0x0180
            java.lang.String r0 = r2.A08()
            r1 = 20
            if (r0 != 0) goto L_0x0182
        L_0x0180:
            r1 = 21
        L_0x0182:
            X.G4U r0 = new X.G4U
            r0.<init>(r5, r1)
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = new com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder
            r3.<init>()
            r0.invoke(r3)
        L_0x018f:
            return r3
        L_0x0190:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0199
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0199:
            r1 = 22
            goto L_0x0182
        L_0x019c:
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C49931FFk.A00(r5)
            r0 = 18
            X.MEQ r1 = new X.MEQ
            r1.<init>(r0, r2)
            X.FfX r0 = new X.FfX
            r0.<init>(r1)
            X.FfW r2 = new X.FfW
            r2.<init>(r0)
            java.lang.String r1 = "defaultErrorType"
            X.FfX r0 = r2.A00
            r0.A00 = r1
            r1 = 0
            r3.A02(r2)
            X.FfW r0 = X.C49854F9t.A06
            X.0qQ.A0B(r0, r1)
            r3.A02(r0)
            return r3
        L_0x01c4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01c9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49029Eo5.A00(X.0aP, X.Jtv, X.3Ii, java.lang.Integer, int, int, boolean, boolean):com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder");
    }
}
