package com.instagram.pendingmedia.service.impl;

import X.0eO;
import X.0qQ;
import X.19E;
import X.1iA;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass4D7;
import X.AnonymousClass7TF;
import X.C255323tw;
import X.C51802G2l;
import X.C67625Mqx;
import X.JTR;
import X.JTw;
import X.LPi;
import X.OI4;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.instagram.pendingmedia.model.constants.ShareType;

public final class PendingMediaWorker extends CoroutineWorker {
    public final Context A00;
    public final OI4 A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingMediaWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ShareType shareType;
        AnonymousClass7TF.A1B(context, 1, workerParameters);
        this.A00 = context;
        0eO r2 = 0eO.A02;
        this.A03 = AnonymousClass0eN.A00(r2, new C51802G2l((Object) this, 14));
        this.A02 = AnonymousClass0eN.A00(r2, new C51802G2l((Object) this, 13));
        C255323tw r1 = this.mWorkerParams.A02;
        0qQ.A07(r1);
        int A0G = JTR.A0G(r1.A03("PENDING_MEDIA_KEY"));
        String A032 = this.mWorkerParams.A02.A03("PENDING_SHARE_TYPE_KEY");
        if (A032 != null) {
            shareType = ShareType.valueOf(A032);
        } else {
            shareType = null;
        }
        this.A01 = new OI4((Intent) null, (Bitmap) null, (1iA) null, (ShareType) null, A0G, LPi.A02(shareType), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r1 != null) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C282925Fh A00(X.C61021JvL r9, com.instagram.pendingmedia.service.impl.PendingMediaWorker r10, java.lang.String r11, java.lang.Throwable r12) {
        /*
            r7 = r11
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r11)
            java.lang.String r0 = ", "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r9, r0, r1)
            java.lang.String r0 = "PendingMediaWorker"
            X.0KC.A0C(r0, r1)
            X.OI4 r4 = r10.A01
            boolean r0 = r4.A09
            r2 = 0
            if (r0 == 0) goto L_0x0027
            X.Mqx r3 = X.C67625Mqx.A00
            android.content.Context r1 = r10.mAppContext
            X.0qQ.A07(r1)
            X.0eM r0 = r10.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r3.A02(r1, r0, r4, r2)
        L_0x0027:
            r3 = 0
            if (r9 == 0) goto L_0x0048
            java.lang.String r0 = r9.A04
            X.3Q2 r5 = new X.3Q2
            r5.<init>(r0)
            com.instagram.pendingmedia.model.constants.ShareType r0 = r9.A03
            r5.A0e(r0)
            X.1iA r0 = r9.A02
            r5.A0V(r0)
            X.28D r0 = r9.A01
            r5.A0i = r0
        L_0x003f:
            X.0eM r0 = r10.A02
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            if (r1 != 0) goto L_0x0067
            goto L_0x004a
        L_0x0048:
            r5 = r3
            goto L_0x003f
        L_0x004a:
            X.08y r0 = X.09i.A0A     // Catch:{ all -> 0x0059 }
            X.0wW r1 = r0.A05(r10)     // Catch:{ all -> 0x0059 }
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0057
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1     // Catch:{ all -> 0x0059 }
            goto L_0x005e
        L_0x0057:
            r1 = r3
            goto L_0x005e
        L_0x0059:
            r0 = move-exception
            X.0eQ r1 = X.JTO.A1B(r0)
        L_0x005e:
            boolean r0 = r1 instanceof X.0eQ
            if (r0 == 0) goto L_0x0063
            r1 = r3
        L_0x0063:
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            if (r1 == 0) goto L_0x006d
        L_0x0067:
            android.content.Context r0 = r10.A00
            X.37k r3 = X.C2373637i.A00(r0, r1)
        L_0x006d:
            java.lang.String r1 = "PENDING_MEDIA_NOT_FOUND"
            boolean r0 = r11.equals(r1)
            if (r0 == 0) goto L_0x00b0
            if (r5 == 0) goto L_0x00b0
            if (r3 == 0) goto L_0x007c
            r3.EFy(r5, r1, r2)
        L_0x007c:
            java.lang.String r1 = "ERROR_KEY"
            if (r9 == 0) goto L_0x009b
            X.3tx r3 = new X.3tx
            r3.<init>()
            X.3tw r0 = r9.A00()
            java.util.Map r0 = r0.A00
            r3.A02(r0)
            r3.A01(r11, r1)
        L_0x0091:
            X.3tw r1 = r3.A00()
            X.5Fh r0 = new X.5Fh
            r0.<init>(r1)
            return r0
        L_0x009b:
            X.0eP[] r0 = X.DbW.A1b(r1, r11)
            X.3tx r3 = new X.3tx
            r3.<init>()
            r0 = r0[r2]
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.A01
            r3.A01(r0, r1)
            goto L_0x0091
        L_0x00b0:
            java.lang.String r0 = "Network Error"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x007c
            if (r5 == 0) goto L_0x00c4
            if (r3 == 0) goto L_0x007c
            r4 = 0
            java.lang.String r6 = "worker_failure"
            r8 = r4
            r3.Cji(r4, r5, r6, r7, r8)
            goto L_0x007c
        L_0x00c4:
            if (r3 == 0) goto L_0x007c
            androidx.work.WorkerParameters r0 = r10.mWorkerParams
            X.3tw r1 = r0.A02
            X.0qQ.A07(r1)
            java.lang.String r0 = "PENDING_MEDIA_KEY"
            java.lang.String r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = "EMPTY_KEY"
        L_0x00d7:
            X.3Q2 r5 = new X.3Q2
            r5.<init>(r0)
            r4 = 0
            java.lang.String r6 = "worker_failure"
            r8 = r12
            r3.Cji(r4, r5, r6, r7, r8)
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.PendingMediaWorker.A00(X.JvL, com.instagram.pendingmedia.service.impl.PendingMediaWorker, java.lang.String, java.lang.Throwable):X.5Fh");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.AnonymousClass3Q2 r11, com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor r12, com.instagram.pendingmedia.service.impl.PendingMediaWorker r13, java.lang.String r14, X.AnonymousClass4D7 r15) {
        /*
            r6 = r11
            r3 = 16
            r5 = r15
            boolean r0 = X.ME9.A03(r3, r15)
            if (r0 == 0) goto L_0x002c
            r4 = r5
            X.ME9 r4 = (X.ME9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r0 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r1) goto L_0x0035
            java.lang.Object r12 = r4.A02
            com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor r12 = (com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor) r12
            java.lang.Object r6 = r4.A01
            X.3Q2 r6 = (X.AnonymousClass3Q2) r6
            goto L_0x0031
        L_0x002c:
            X.ME9 r4 = X.ME9.A00(r13, r15, r3)
            goto L_0x0018
        L_0x0031:
            X.0eS.A00(r0)     // Catch:{ CancellationException -> 0x005a }
            return r0
        L_0x0035:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x003a:
            X.0eS.A00(r0)
            r9 = 0
            r10 = 2
            X.3Ns r8 = new X.3Ns     // Catch:{ CancellationException -> 0x005a }
            r8.<init>()     // Catch:{ CancellationException -> 0x005a }
            r11 = 0
            X.KVs r5 = new X.KVs     // Catch:{ CancellationException -> 0x005a }
            r7 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ CancellationException -> 0x005a }
            X.3Ns r0 = r12.A00(r5)     // Catch:{ CancellationException -> 0x005a }
            X.ME9.A01(r6, r12, r4, r1)     // Catch:{ CancellationException -> 0x005a }
            java.lang.Object r0 = r0.A0E(r4)     // Catch:{ CancellationException -> 0x005a }
            if (r0 != r3) goto L_0x0059
            return r3
        L_0x0059:
            return r0
        L_0x005a:
            r2 = move-exception
            java.lang.String r0 = r6.A35
            X.KVr r1 = new X.KVr
            r1.<init>(r0)
            X.3ju r0 = r12.A0D
            X.C301205yj.A00(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.PendingMediaWorker.A01(X.3Q2, com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor, com.instagram.pendingmedia.service.impl.PendingMediaWorker, java.lang.String, X.4D7):java.lang.Object");
    }

    public final Object A03(AnonymousClass4D7 r4) {
        return 19E.A00(r4, new JTw((Object) this, (AnonymousClass4D7) null, 22));
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0 = r1.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r0 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bf, code lost:
        r0 = new X.0eQ(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:17:0x0046, B:29:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d A[SYNTHETIC, Splitter:B:29:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a A[Catch:{ ExecutionException -> 0x0081, all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b7 A[Catch:{ ExecutionException -> 0x0081, all -> 0x00be }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.pendingmedia.service.impl.PendingMediaWorker r7, X.AnonymousClass4D7 r8, boolean r9) {
        /*
            r3 = 20
            boolean r0 = X.C66138MDq.A02(r3, r8)
            if (r0 == 0) goto L_0x0029
            r6 = r8
            X.MDq r6 = (X.C66138MDq) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r6.A02
            X.1Hj r4 = X.1Hj.A02
            int r3 = r6.A00
            r2 = 3
            r0 = 2
            r1 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 == r1) goto L_0x003c
            if (r3 == r0) goto L_0x0037
            if (r3 != r2) goto L_0x002f
            goto L_0x00b8
        L_0x0029:
            X.MDq r6 = new X.MDq
            r6.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x002f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0037:
            java.lang.Object r7 = r6.A01
            X.5Ft r7 = (X.C283015Ft) r7
            goto L_0x0069
        L_0x003c:
            java.lang.Object r7 = r6.A01
            X.5Ft r7 = (X.C283015Ft) r7
            goto L_0x0051
        L_0x0041:
            X.0eS.A00(r5)
            if (r9 == 0) goto L_0x005e
            r6.A01 = r7     // Catch:{ all -> 0x00be }
            r6.A00 = r1     // Catch:{ all -> 0x00be }
            java.lang.Object r5 = r7.A04(r6)     // Catch:{ all -> 0x00be }
            if (r5 != r4) goto L_0x0054
            return r4
        L_0x0051:
            X.0eS.A00(r5)     // Catch:{ all -> 0x00be }
        L_0x0054:
            X.Q4b r5 = (X.C7325Q4b) r5     // Catch:{ all -> 0x00be }
            com.google.common.util.concurrent.ListenableFuture r0 = r7.setForegroundAsync(r5)     // Catch:{ all -> 0x00be }
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x00be }
            goto L_0x00c4
        L_0x005e:
            r6.A01 = r7     // Catch:{ all -> 0x00be }
            r6.A00 = r0     // Catch:{ all -> 0x00be }
            java.lang.Object r5 = r7.A04(r6)     // Catch:{ all -> 0x00be }
            if (r5 != r4) goto L_0x006c
            return r4
        L_0x0069:
            X.0eS.A00(r5)     // Catch:{ all -> 0x00be }
        L_0x006c:
            X.Q4b r5 = (X.C7325Q4b) r5     // Catch:{ all -> 0x00be }
            r0 = 0
            r6.A01 = r0     // Catch:{ all -> 0x00be }
            r6.A00 = r2     // Catch:{ all -> 0x00be }
            com.google.common.util.concurrent.ListenableFuture r3 = r7.setForegroundAsync(r5)     // Catch:{ all -> 0x00be }
            boolean r0 = r3.isDone()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x008a
            r3.get()     // Catch:{ ExecutionException -> 0x0081 }
            goto L_0x00b3
        L_0x0081:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x0089
            r0 = r1
        L_0x0089:
            throw r0     // Catch:{ all -> 0x00be }
        L_0x008a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.1IW.A02     // Catch:{ all -> 0x00be }
            X.4D7 r0 = X.1Ey.A02(r6)     // Catch:{ all -> 0x00be }
            X.1IW r2 = new X.1IW     // Catch:{ all -> 0x00be }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x00be }
            r2.A0I()     // Catch:{ all -> 0x00be }
            X.JcN r1 = new X.JcN     // Catch:{ all -> 0x00be }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x00be }
            X.JcP r0 = X.C59958JcP.A01     // Catch:{ all -> 0x00be }
            r3.addListener(r1, r0)     // Catch:{ all -> 0x00be }
            r1 = 15
            X.9Kw r0 = new X.9Kw     // Catch:{ all -> 0x00be }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x00be }
            r2.CO0(r0)     // Catch:{ all -> 0x00be }
            java.lang.Object r0 = r2.A0E()     // Catch:{ all -> 0x00be }
            if (r0 != r4) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x00be }
        L_0x00b5:
            if (r0 != r4) goto L_0x00bb
            return r4
        L_0x00b8:
            X.0eS.A00(r5)     // Catch:{ all -> 0x00be }
        L_0x00bb:
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x00be }
            goto L_0x00c4
        L_0x00be:
            r1 = move-exception
            X.0eQ r0 = new X.0eQ
            r0.<init>(r1)
        L_0x00c4:
            java.lang.Throwable r2 = X.0eR.A00(r0)
            if (r2 == 0) goto L_0x00d1
            java.lang.String r1 = "PendingMediaWorker"
            java.lang.String r0 = "setForeground failure"
            X.0KC.A0F(r1, r0, r2)
        L_0x00d1:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.PendingMediaWorker.A02(com.instagram.pendingmedia.service.impl.PendingMediaWorker, X.4D7, boolean):java.lang.Object");
    }

    public final Object A04(AnonymousClass4D7 r5) {
        C67625Mqx mqx = C67625Mqx.A00;
        Context context = this.mAppContext;
        0qQ.A07(context);
        OI4 oi4 = this.A01;
        this.A02.getValue();
        return mqx.A01(context, oi4);
    }
}
