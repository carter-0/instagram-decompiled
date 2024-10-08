package com.instagram.pendingmedia.service.upload.armadilloexpress;

public final class ArmadilloExpressMediaUploader {
    public static final ArmadilloExpressMediaUploader A00 = new Object();

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e3, code lost:
        if (r2 != null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e9, code lost:
        if (r0 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        r0 = "unknown upload error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ed, code lost:
        r8 = r10.A02(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f3, code lost:
        if (r2 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f5, code lost:
        r0 = r2.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f9, code lost:
        r9 = X.002.A0R("Armadillo express media upload error:", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0106, code lost:
        if (new X.1Cn(r3).A05() == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0108, code lost:
        r1 = 101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010a, code lost:
        r7 = r8.A01;
        r0 = X.C71122OdG.A00;
        r6 = r10.A0C;
        r5 = r10.A0D;
        X.C71122OdG.A03(r6, java.lang.Integer.valueOf(r1), r5.A3p, (java.util.List) null, 1111);
        r10.A0E.EFz(r7, r5, r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0125, code lost:
        if (r4 != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0127, code lost:
        r1 = 100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012a, code lost:
        if (r2 == null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012c, code lost:
        r1 = r2.getCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0131, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0133, code lost:
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.LP8 r17, X.AnonymousClass4D7 r18) {
        /*
            r16 = this;
            r10 = r17
            r5 = 20
            r6 = r18
            boolean r0 = X.ME9.A03(r5, r6)
            r3 = r16
            if (r0 == 0) goto L_0x002c
            r2 = r6
            X.ME9 r2 = (X.ME9) r2
            int r4 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x002c
            int r4 = r4 - r1
            r2.A00 = r4
        L_0x001c:
            java.lang.Object r4 = r2.A03
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r5) goto L_0x0031
            java.lang.Object r10 = r2.A02
            X.LP8 r10 = (X.LP8) r10
            goto L_0x00a8
        L_0x002c:
            X.ME9 r2 = X.ME9.A00(r3, r6, r5)
            goto L_0x001c
        L_0x0031:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0036:
            X.0eS.A00(r4)
            com.instagram.common.session.UserSession r7 = r10.A0C
            X.3Q2 r6 = r10.A0D
            java.lang.String r9 = r6.A3p
            X.OdG r8 = X.C71122OdG.A00
            r13 = 0
            r0 = 1109(0x455, float:1.554E-42)
            X.C71122OdG.A03(r7, r13, r9, r13, r0)
            X.MYx r0 = X.C66612MYy.A00
            boolean r0 = r0.A02(r7, r5)
            if (r0 != 0) goto L_0x005d
            X.1as r4 = X.1as.A04
            r0 = 550(0x226, float:7.71E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.A0F(r7, r0)
            r8.A04(r7, r9)
        L_0x005d:
            X.1iA r0 = r6.A1G
            java.lang.Integer r11 = X.C71023OYz.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r4 = "Required value was null."
            if (r11 == r0) goto L_0x0071
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r11 == r0) goto L_0x0071
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r11 != r0) goto L_0x0080
        L_0x0071:
            boolean r0 = r6.A0q()
            if (r0 == 0) goto L_0x0080
            java.lang.String r12 = r6.A33
            if (r12 != 0) goto L_0x0095
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x0080:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r11 != r0) goto L_0x0089
            java.lang.String r12 = r6.A3V
            if (r12 == 0) goto L_0x0089
            goto L_0x0095
        L_0x0089:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r11 != r0) goto L_0x017f
            X.4n7 r0 = r6.A1L
            if (r0 == 0) goto L_0x017f
            java.lang.String r12 = r0.A01
            if (r12 == 0) goto L_0x017f
        L_0x0095:
            r14 = 19
            r15 = 42
            X.MH7 r9 = new X.MH7     // Catch:{ MCs -> 0x00cf }
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.String) r12, (X.AnonymousClass4D7) r13, (int) r14, (int) r15)     // Catch:{ MCs -> 0x00cf }
            X.ME9.A01(r3, r10, r2, r5)     // Catch:{ MCs -> 0x00cf }
            java.lang.Object r0 = X.19E.A00(r2, r9)     // Catch:{ MCs -> 0x00cf }
            if (r0 != r1) goto L_0x00ab
            return r1
        L_0x00a8:
            X.0eS.A00(r4)     // Catch:{ MCs -> 0x00cf }
        L_0x00ab:
            X.0sm r6 = X.0Yt.A0E()     // Catch:{ MCs -> 0x00cf }
            com.instagram.common.session.UserSession r4 = r10.A0C     // Catch:{ MCs -> 0x00cf }
            X.3Q2 r3 = r10.A0D     // Catch:{ MCs -> 0x00cf }
            java.lang.String r2 = r3.A3p     // Catch:{ MCs -> 0x00cf }
            r1 = 0
            r0 = 1110(0x456, float:1.555E-42)
            X.C71122OdG.A03(r4, r1, r2, r1, r0)     // Catch:{ MCs -> 0x00cf }
            X.37k r2 = r10.A0E     // Catch:{ MCs -> 0x00cf }
            X.37j r2 = (X.C2373737j) r2     // Catch:{ MCs -> 0x00cf }
            X.0qQ.A0B(r6, r5)     // Catch:{ MCs -> 0x00cf }
            r0 = -1
            r2.A0G(r3, r6, r0)     // Catch:{ MCs -> 0x00cf }
            X.3QD r0 = X.AnonymousClass3QD.UPLOADED     // Catch:{ MCs -> 0x00cf }
            r3.A0b(r0)     // Catch:{ MCs -> 0x00cf }
            X.KVm r1 = X.C62013KVm.A00     // Catch:{ MCs -> 0x00cf }
            return r1
        L_0x00cf:
            r0 = move-exception
            com.facebook.msys.mcf.MsysError r2 = r0.A00
            boolean r4 = r0.A01
            android.content.Context r3 = r10.A0B
            X.1Cn r0 = new X.1Cn
            r0.<init>(r3)
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0135
            X.55S r1 = X.AnonymousClass55S.A08
        L_0x00e3:
            if (r2 == 0) goto L_0x00eb
        L_0x00e5:
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L_0x00ed
        L_0x00eb:
            java.lang.String r0 = "unknown upload error"
        L_0x00ed:
            X.55U r8 = r10.A02(r1, r0)
            java.lang.String r1 = "Armadillo express media upload error:"
            if (r2 == 0) goto L_0x0133
            java.lang.String r0 = r2.getMessage()
        L_0x00f9:
            java.lang.String r9 = X.002.A0R(r1, r0)
            X.1Cn r0 = new X.1Cn
            r0.<init>(r3)
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0125
            r1 = 101(0x65, float:1.42E-43)
        L_0x010a:
            X.55S r7 = r8.A01
            X.OdG r0 = X.C71122OdG.A00
            com.instagram.common.session.UserSession r6 = r10.A0C
            X.3Q2 r5 = r10.A0D
            java.lang.String r4 = r5.A3p
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r1 = 0
            r0 = 1111(0x457, float:1.557E-42)
            X.C71122OdG.A03(r6, r3, r4, r1, r0)
            X.37k r0 = r10.A0E
            r0.EFz(r7, r5, r9, r2)
            goto L_0x01b2
        L_0x0125:
            if (r4 != 0) goto L_0x012a
            r1 = 100
            goto L_0x010a
        L_0x012a:
            if (r2 == 0) goto L_0x0131
            int r1 = r2.getCode()
            goto L_0x010a
        L_0x0131:
            r1 = 0
            goto L_0x010a
        L_0x0133:
            r0 = 0
            goto L_0x00f9
        L_0x0135:
            if (r4 == 0) goto L_0x0167
            if (r2 == 0) goto L_0x0167
            int r1 = r2.getCode()
            if (r1 == r5) goto L_0x017b
            r0 = 2
            if (r1 == r0) goto L_0x017b
            r0 = 3
            if (r1 == r0) goto L_0x017b
            r0 = 4
            if (r1 == r0) goto L_0x0177
            r0 = 12
            if (r1 == r0) goto L_0x0173
            r0 = 14
            if (r1 == r0) goto L_0x0173
            r0 = 22
            if (r1 == r0) goto L_0x017b
            r0 = 29
            if (r1 == r0) goto L_0x016f
            r0 = 34
            if (r1 == r0) goto L_0x016b
            r0 = 26
            if (r1 == r0) goto L_0x016b
            r0 = 27
            if (r1 == r0) goto L_0x016f
            switch(r1) {
                case 16: goto L_0x0173;
                case 17: goto L_0x0173;
                case 18: goto L_0x0173;
                default: goto L_0x0167;
            }
        L_0x0167:
            X.55S r1 = X.AnonymousClass55S.A0P
            goto L_0x00e3
        L_0x016b:
            X.55S r1 = X.AnonymousClass55S.A0O
            goto L_0x00e5
        L_0x016f:
            X.55S r1 = X.AnonymousClass55S.A0T
            goto L_0x00e5
        L_0x0173:
            X.55S r1 = X.AnonymousClass55S.A0G
            goto L_0x00e5
        L_0x0177:
            X.55S r1 = X.AnonymousClass55S.A0A
            goto L_0x00e5
        L_0x017b:
            X.55S r1 = X.AnonymousClass55S.A0E
            goto L_0x00e5
        L_0x017f:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Cannot process upload attempt of type "
            r1.append(r0)
            X.1iA r0 = r6.A1G
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r0, r1)
            X.55S r0 = X.AnonymousClass55S.A0F
            X.55U r8 = r10.A02(r0, r1)
            java.lang.String r0 = "Armadillo express media upload error:"
            java.lang.String r5 = X.002.A0R(r0, r1)
            java.lang.IllegalStateException r4 = X.AnonymousClass7TE.A0z(r1)
            X.55S r3 = r8.A01
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r2 = r6.A3p
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1111(0x457, float:1.557E-42)
            X.C71122OdG.A03(r7, r1, r2, r13, r0)
            X.37k r0 = r10.A0E
            r0.EFz(r3, r6, r5, r4)
        L_0x01b2:
            X.KVk r0 = new X.KVk
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader.A00(X.LP8, X.4D7):java.lang.Object");
    }
}
