package com.instagram.zero.dogfooding.state;

import X.02o;

public final class IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2 implements 02o {
    public final /* synthetic */ String A00;
    public final /* synthetic */ 02o A01;

    public IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2(String str, 02o r2) {
        this.A01 = r2;
        this.A00 = str;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.9JW] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x002c, B:16:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ExcHandler: CancellationException (unused java.util.concurrent.CancellationException), SYNTHETIC, Splitter:B:10:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 9
            boolean r0 = X.AnonymousClass9JW.A00(r3, r7)
            if (r0 == 0) goto L_0x0026
            r4 = r7
            X.9JW r4 = (X.AnonymousClass9JW) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 != r1) goto L_0x0032
            java.lang.Object r0 = r4.A01
            com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2 r0 = (com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2) r0
            goto L_0x002c
        L_0x0026:
            X.9JW r4 = new X.9JW
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x002c:
            X.0eS.A00(r3)     // Catch:{ CancellationException -> 0x005d, Exception -> 0x0030 }
            goto L_0x005d
        L_0x0030:
            r3 = move-exception
            goto L_0x004c
        L_0x0032:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x003a:
            X.0eS.A00(r3)
            X.02o r0 = r5.A01     // Catch:{ CancellationException -> 0x005d, Exception -> 0x004a }
            r4.A01 = r5     // Catch:{ CancellationException -> 0x005d, Exception -> 0x004a }
            r4.A00 = r1     // Catch:{ CancellationException -> 0x005d, Exception -> 0x004a }
            java.lang.Object r0 = r0.emit(r6, r4)     // Catch:{ CancellationException -> 0x005d, Exception -> 0x004a }
            if (r0 != r2) goto L_0x005d
            return r2
        L_0x004a:
            r3 = move-exception
            r0 = r5
        L_0x004c:
            X.0wj r2 = X.0wj.A01
            r1 = 238954923(0xe3e29ab, float:2.343937E-30)
            java.lang.String r0 = r0.A00
            X.0f9 r0 = r2.AEf(r0, r1)
            r0.ERJ(r3)
            r0.report()
        L_0x005d:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
