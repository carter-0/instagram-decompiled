package com.instagram.ml.remotepresence;

import X.0eO;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass7TG;
import X.C51793G2c;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class RpModelDownloadWorker extends CoroutineWorker {
    public final int A00 = this.mWorkerParams.A02.A02("maxRetries", 0);
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new C51793G2c(this, 21));

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e A[Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4 A[Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r9) {
        /*
            r8 = this;
            r3 = 5
            boolean r0 = X.C66147MDz.A02(r3, r9)
            if (r0 == 0) goto L_0x0029
            r5 = r9
            X.MDz r5 = (X.C66147MDz) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r5.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r7) goto L_0x002f
            java.lang.Object r4 = r5.A03
            X.JVh r4 = (X.C59723JVh) r4
            java.lang.Object r5 = r5.A01
            com.instagram.ml.remotepresence.RpModelDownloadWorker r5 = (com.instagram.ml.remotepresence.RpModelDownloadWorker) r5
            goto L_0x0097
        L_0x0029:
            X.MDz r5 = new X.MDz
            r5.<init>(r8, r9, r3)
            goto L_0x0015
        L_0x002f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0034:
            X.0eS.A00(r3)
            androidx.work.WorkerParameters r0 = r8.mWorkerParams
            X.3tw r1 = r0.A02
            java.lang.String r0 = "modelUseCse"
            java.lang.String r3 = r1.A03(r0)
            X.0eM r0 = r8.A01
            X.0lg r2 = X.DbT.A0X(r0)
            if (r2 == 0) goto L_0x00e1
            if (r3 == 0) goto L_0x00e1
            android.content.Context r1 = r8.mAppContext
            X.0qQ.A07(r1)
            r0 = 31
            X.MMW r1 = X.MMW.A00(r1, r2, r0)
            java.lang.Class<com.instagram.ml.remotepresence.RpModelDownloadManager> r0 = com.instagram.ml.remotepresence.RpModelDownloadManager.class
            java.lang.Object r2 = r2.A01(r0, r1)
            com.instagram.ml.remotepresence.RpModelDownloadManager r2 = (com.instagram.ml.remotepresence.RpModelDownloadManager) r2
            java.util.List r0 = r2.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0064:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r4 = r1.next()
            r0 = r4
            X.JVh r0 = (X.C59723JVh) r0
            java.lang.String r0 = r0.A07
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x0064
        L_0x0079:
            X.JVh r4 = (X.C59723JVh) r4
            if (r4 == 0) goto L_0x00e1
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x00e1
            goto L_0x0088
        L_0x0086:
            r4 = 0
            goto L_0x0079
        L_0x0088:
            java.lang.Object r0 = r4.A04     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d4 }
            X.0r6 r0 = (X.AnonymousClass0r6) r0     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d4 }
            X.C66147MDz.A00(r8, r2, r4, r5, r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d4 }
            java.lang.Object r3 = X.AnonymousClass10c.A03(r5, r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d4 }
            if (r3 == r6) goto L_0x00e6
            r5 = r8
            goto L_0x009a
        L_0x0097:
            X.0eS.A00(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
        L_0x009a:
            com.facebook.mantle.ig.IGMantle r3 = (com.facebook.mantle.ig.IGMantle) r3     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            if (r3 != 0) goto L_0x00a4
            X.5Fh r6 = new X.5Fh     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            r6.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            return r6
        L_0x00a4:
            java.lang.String r2 = r4.A07     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            java.lang.String r1 = r4.A06     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            java.lang.Object r0 = r4.A02     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            com.google.common.collect.ImmutableMap r0 = (com.google.common.collect.ImmutableMap) r0     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            com.google.common.util.concurrent.ListenableFuture r3 = r3.runMantleWithConfigStr(r2, r1, r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            java.lang.Object r0 = r4.A03     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            X.930 r0 = (X.AnonymousClass930) r0     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            if (r0 == 0) goto L_0x00c3
            X.02m r2 = r0.A00     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            r1 = 331812717(0x13c70f6d, float:5.0249873E-27)
            r2.markerStart(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            java.lang.String r0 = "MODEL_DOWNLOAD_START"
            r2.markerPoint(r1, r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
        L_0x00c3:
            java.lang.Object r0 = r3.get()     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            com.google.common.collect.ImmutableMap r0 = (com.google.common.collect.ImmutableMap) r0     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            com.instagram.ml.remotepresence.RpModelDownloadManager.A00(r4, r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x00d2 }
            X.5G1 r6 = new X.5G1
            r6.<init>()
            return r6
        L_0x00d2:
            r2 = move-exception
            goto L_0x00d6
        L_0x00d4:
            r2 = move-exception
            r5 = r8
        L_0x00d6:
            androidx.work.WorkerParameters r0 = r5.mWorkerParams
            int r1 = r0.A01
            int r0 = r5.A00
            if (r1 <= r0) goto L_0x00e7
            com.instagram.ml.remotepresence.RpModelDownloadManager.A01(r4, r2)
        L_0x00e1:
            X.5Fh r6 = new X.5Fh
            r6.<init>()
        L_0x00e6:
            return r6
        L_0x00e7:
            X.5G2 r6 = new X.5G2
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ml.remotepresence.RpModelDownloadWorker.A03(X.4D7):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RpModelDownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
    }
}
