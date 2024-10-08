package com.instagram.pendingmedia.service.impl;

public final class SharePostThreadHelper {
    public static final SharePostThreadHelper A00 = new Object();

    /* JADX WARNING: type inference failed for: r8v1, types: [X.4D7, X.MDM] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f3, code lost:
        if (r10 != false) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00db A[EDGE_INSN: B:63:0x00db->B:46:0x00db ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.LP8 r12, X.AnonymousClass4D7 r13, X.C249523jv r14) {
        /*
            r11 = this;
            r3 = 0
            boolean r0 = r13 instanceof X.MDM
            if (r0 == 0) goto L_0x00d4
            r8 = r13
            X.MDM r8 = (X.MDM) r8
            int r0 = r8.A07
            if (r0 != r3) goto L_0x00d4
            int r2 = r8.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d4
            int r2 = r2 - r1
            r8.A02 = r2
        L_0x0017:
            java.lang.Object r1 = r8.A06
            X.1Hj r4 = X.1Hj.A02
            int r0 = r8.A02
            r5 = 0
            r9 = 1
            r2 = 2
            if (r0 == 0) goto L_0x0061
            if (r0 != r9) goto L_0x00f9
            int r7 = r8.A01
            int r6 = r8.A00
            java.lang.Object r3 = r8.A05
            java.lang.Object r14 = r8.A04
            X.3jv r14 = (X.C249523jv) r14
            java.lang.Object r12 = r8.A03
            X.LP8 r12 = (X.LP8) r12
            X.0eS.A00(r1)
        L_0x0035:
            X.55U r1 = (X.AnonymousClass55U) r1
            if (r1 == 0) goto L_0x00d0
            X.55S r2 = r1.A01
            java.lang.String r0 = r1.A03
            r12.A02(r2, r0)
            r10 = 1
        L_0x0041:
            java.util.List r0 = r12.A0K
            java.util.List r0 = X.00k.A0a(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x004b:
            r2 = 1
        L_0x004c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00db
            X.3Q2 r0 = X.JTO.A0m(r4)
            if (r2 == 0) goto L_0x005f
            boolean r0 = r0.A14()
            if (r0 != 0) goto L_0x005f
            goto L_0x004b
        L_0x005f:
            r2 = 0
            goto L_0x004c
        L_0x0061:
            X.0eS.A00(r1)
            X.3QD r3 = r12.A06
            X.3QD r0 = r12.A05
            if (r0 == 0) goto L_0x00fe
            int r0 = r0.ordinal()
            if (r0 != r2) goto L_0x00fe
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            if (r3 != r0) goto L_0x00fe
            java.util.List r0 = r12.A0K
            java.util.List r0 = X.00k.A0a(r0)
            int r7 = r0.size()
            r1 = r5
            r6 = 0
            r10 = 0
        L_0x0081:
            if (r6 >= r7) goto L_0x0041
            java.util.List r0 = r12.A0K
            java.util.List r0 = X.00k.A0a(r0)
            java.lang.Object r2 = r0.get(r6)
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            boolean r0 = r2.A14()
            if (r0 == 0) goto L_0x00d1
            if (r6 != 0) goto L_0x00b5
            X.3Q2 r0 = r12.A0D
            java.lang.String r0 = r0.A3X
            r2.A3X = r0
        L_0x009d:
            X.MHL r0 = new X.MHL
            r0.<init>((X.AnonymousClass3Q2) r2, (X.LP8) r12, (X.AnonymousClass4D7) r5, (X.C249523jv) r14)
            r8.A03 = r12
            r8.A04 = r14
            r8.A05 = r3
            r8.A00 = r6
            r8.A01 = r7
            r8.A02 = r9
            java.lang.Object r1 = X.19E.A00(r8, r0)
            if (r1 != r4) goto L_0x0035
            return r4
        L_0x00b5:
            java.util.List r0 = r12.A0K
            java.util.List r1 = X.00k.A0a(r0)
            int r0 = r6 + -1
            java.lang.Object r0 = r1.get(r0)
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            X.1Xj r0 = r0.A1C
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = r0.getId()
        L_0x00cb:
            r2.A3X = r0
            goto L_0x009d
        L_0x00ce:
            r0 = r5
            goto L_0x00cb
        L_0x00d0:
            r10 = 1
        L_0x00d1:
            int r6 = r6 + 1
            goto L_0x0081
        L_0x00d4:
            X.MDM r8 = new X.MDM
            r8.<init>(r11, r13, r3)
            goto L_0x0017
        L_0x00db:
            if (r2 == 0) goto L_0x00ec
            if (r1 == 0) goto L_0x00e1
            X.55S r5 = r1.A01
        L_0x00e1:
            X.55S r0 = X.AnonymousClass55S.A0J
            if (r5 == r0) goto L_0x00ec
            X.3Q2 r2 = r12.A0D
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            r2.A0b(r0)
        L_0x00ec:
            if (r1 == 0) goto L_0x00f6
            X.KVk r4 = new X.KVk
            r4.<init>(r1)
        L_0x00f3:
            if (r10 != 0) goto L_0x0113
            goto L_0x0100
        L_0x00f6:
            X.KVm r4 = X.C62013KVm.A00
            goto L_0x00f3
        L_0x00f9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00fe:
            X.KVl r4 = X.C62012KVl.A00
        L_0x0100:
            X.3QD r0 = X.AnonymousClass3QD.NOT_UPLOADED
            if (r3 == r0) goto L_0x0113
            X.37k r5 = r12.A0E
            X.3Q2 r7 = r12.A0D
            java.lang.String r9 = X.LP8.A00(r12, r3)
            r6 = 0
            java.lang.String r8 = "POST_STATE_MACHINE_ERROR"
            r10 = r6
            r5.Cji(r6, r7, r8, r9, r10)
        L_0x0113:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.SharePostThreadHelper.A00(X.LP8, X.4D7, X.3jv):java.lang.Object");
    }
}
