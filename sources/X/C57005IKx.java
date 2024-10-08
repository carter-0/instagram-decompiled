package X;

import java.util.Map;

/* renamed from: X.IKx  reason: case insensitive filesystem */
public final class C57005IKx implements 1UV {
    public final long A00;
    public final Map A01;
    public final Map A02;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean apply(java.lang.Object r13) {
        /*
            r12 = this;
            X.1Xg r13 = (X.1Xg) r13
            r11 = 0
            if (r13 == 0) goto L_0x0053
            X.1Xj r10 = X.C51965G9l.A0o(r13)
            if (r10 == 0) goto L_0x0053
            java.util.Map r1 = r12.A02
            boolean r0 = X.AnonymousClass3VO.A09(r10)
            if (r0 == 0) goto L_0x005d
            X.1UQ r0 = X.1UQ.A0a
        L_0x0015:
            java.lang.Number r0 = X.C51966G9m.A14(r0, r1)
            if (r0 == 0) goto L_0x005a
            long r5 = r0.longValue()
        L_0x001f:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r8 = r2.toSeconds(r0)
            boolean r0 = X.AnonymousClass3VO.A09(r10)
            if (r0 == 0) goto L_0x0054
            java.util.Map r1 = r12.A01
            X.1UQ r0 = X.1UQ.A0a
            java.lang.Number r7 = X.C51966G9m.A14(r0, r1)
            long r3 = r10.A19()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            if (r7 == 0) goto L_0x0054
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r0.toSeconds(r3)
            long r0 = r7.longValue()
            long r2 = r2 + r0
        L_0x004e:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            r11 = 1
        L_0x0053:
            return r11
        L_0x0054:
            long r2 = r10.A1A()
            long r2 = r2 + r5
            goto L_0x004e
        L_0x005a:
            long r5 = r12.A00
            goto L_0x001f
        L_0x005d:
            X.1UQ r0 = r13.A06
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57005IKx.apply(java.lang.Object):boolean");
    }

    public C57005IKx(Map map, Map map2, long j) {
        this.A02 = map;
        this.A00 = j;
        this.A01 = map2;
    }
}
