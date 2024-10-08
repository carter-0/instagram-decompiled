package androidx.datastore.core;

import X.0r1;
import X.0rm;
import X.136;
import X.C284245Lp;

public final class SingleProcessDataStore$readAndInit$api$1 implements C284245Lp {
    public final /* synthetic */ SingleProcessDataStore A00;
    public final /* synthetic */ 0r1 A01;
    public final /* synthetic */ 0rm A02;
    public final /* synthetic */ 136 A03;

    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, X.4D7, X.9Ji] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088 A[Catch:{ all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8 A[Catch:{ all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object FK3(X.AnonymousClass4D7 r12, X.0sL r13) {
        /*
            r11 = this;
            r3 = 0
            boolean r0 = X.C376789Ji.A00(r3, r12)
            if (r0 == 0) goto L_0x0033
            r7 = r12
            X.9Ji r7 = (X.C376789Ji) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0033
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r7.A06
            X.1Hj r10 = X.1Hj.A02
            int r2 = r7.A00
            r8 = 3
            r9 = 2
            r0 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0066
            if (r2 == r0) goto L_0x004e
            if (r2 == r9) goto L_0x0041
            if (r2 != r8) goto L_0x0039
            java.lang.Object r0 = r7.A03
            java.lang.Object r5 = r7.A02
            X.0rm r5 = (X.0rm) r5
            java.lang.Object r2 = r7.A01
            X.136 r2 = (X.136) r2
            goto L_0x00b5
        L_0x0033:
            X.9Ji r7 = new X.9Ji
            r7.<init>(r11, r12, r3)
            goto L_0x0015
        L_0x0039:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0041:
            java.lang.Object r4 = r7.A03
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            java.lang.Object r5 = r7.A02
            X.0rm r5 = (X.0rm) r5
            java.lang.Object r2 = r7.A01
            X.136 r2 = (X.136) r2
            goto L_0x009d
        L_0x004e:
            java.lang.Object r4 = r7.A05
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            java.lang.Object r5 = r7.A04
            X.0rm r5 = (X.0rm) r5
            java.lang.Object r3 = r7.A03
            X.0r1 r3 = (X.0r1) r3
            java.lang.Object r2 = r7.A02
            X.136 r2 = (X.136) r2
            java.lang.Object r13 = r7.A01
            X.0sL r13 = (X.0sL) r13
            X.0eS.A00(r1)
            goto L_0x0084
        L_0x0066:
            X.0eS.A00(r1)
            X.136 r2 = r11.A03
            X.0r1 r3 = r11.A01
            X.0rm r5 = r11.A02
            androidx.datastore.core.SingleProcessDataStore r4 = r11.A00
            r7.A01 = r13
            r7.A02 = r2
            r7.A03 = r3
            r7.A04 = r5
            r7.A05 = r4
            r7.A00 = r0
            java.lang.Object r0 = X.136.A00(r7, r2)
            if (r0 != r10) goto L_0x0084
            return r10
        L_0x0084:
            boolean r0 = r3.A00     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x00c2
            java.lang.Object r0 = r5.A00     // Catch:{ all -> 0x00ca }
            r7.A01 = r2     // Catch:{ all -> 0x00ca }
            r7.A02 = r5     // Catch:{ all -> 0x00ca }
            r7.A03 = r4     // Catch:{ all -> 0x00ca }
            r7.A04 = r6     // Catch:{ all -> 0x00ca }
            r7.A05 = r6     // Catch:{ all -> 0x00ca }
            r7.A00 = r9     // Catch:{ all -> 0x00ca }
            java.lang.Object r1 = r13.invoke(r0, r7)     // Catch:{ all -> 0x00ca }
            if (r1 != r10) goto L_0x00a0
            return r10
        L_0x009d:
            X.0eS.A00(r1)     // Catch:{ all -> 0x00c0 }
        L_0x00a0:
            java.lang.Object r0 = r5.A00     // Catch:{ all -> 0x00c0 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x00c0 }
            if (r0 != 0) goto L_0x00ba
            r7.A01 = r2     // Catch:{ all -> 0x00c0 }
            r7.A02 = r5     // Catch:{ all -> 0x00c0 }
            r7.A03 = r1     // Catch:{ all -> 0x00c0 }
            r7.A00 = r8     // Catch:{ all -> 0x00c0 }
            r4.A07(r1, r7)     // Catch:{ all -> 0x00c0 }
            r0 = r1
            goto L_0x00b8
        L_0x00b5:
            X.0eS.A00(r1)     // Catch:{ all -> 0x00cc }
        L_0x00b8:
            r5.A00 = r0     // Catch:{ all -> 0x00cc }
        L_0x00ba:
            java.lang.Object r0 = r5.A00     // Catch:{ all -> 0x00cc }
            r2.A05(r6)
            return r0
        L_0x00c0:
            r0 = move-exception
            goto L_0x00cd
        L_0x00c2:
            java.lang.String r1 = "InitializerApi.updateData should not be called after initialization is complete."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ca }
            r0.<init>(r1)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            goto L_0x00cd
        L_0x00cc:
            r0 = move-exception
        L_0x00cd:
            r2.A05(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1.FK3(X.4D7, X.0sL):java.lang.Object");
    }

    public SingleProcessDataStore$readAndInit$api$1(SingleProcessDataStore singleProcessDataStore, 0r1 r2, 0rm r3, 136 r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = singleProcessDataStore;
    }
}
