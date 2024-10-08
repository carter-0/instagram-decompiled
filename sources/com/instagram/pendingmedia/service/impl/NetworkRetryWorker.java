package com.instagram.pendingmedia.service.impl;

import X.0qQ;
import X.1iA;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;
import X.C255323tw;
import X.C51802G2l;
import X.C67625Mqx;
import X.JTR;
import X.OI4;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.instagram.pendingmedia.model.constants.ShareType;

public final class NetworkRetryWorker extends CoroutineWorker {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(new C51802G2l((Object) this, 12));

    /* JADX WARNING: type inference failed for: r8v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fc, code lost:
        if (r0 == r7) goto L_0x00fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r15) {
        /*
            r14 = this;
            r3 = 27
            boolean r0 = X.ME0.A02(r3, r15)
            if (r0 == 0) goto L_0x0106
            r8 = r15
            X.ME0 r8 = (X.ME0) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0106
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r8.A05
            X.1Hj r7 = X.1Hj.A02
            r6 = r7
            int r0 = r8.A00
            r5 = 0
            r4 = 0
            r13 = 1
            if (r0 == 0) goto L_0x0087
            if (r0 != r13) goto L_0x010d
            java.lang.Object r9 = r8.A04
            com.instagram.pendingmedia.store.PendingMediaStore r9 = (com.instagram.pendingmedia.store.PendingMediaStore) r9
            java.lang.Object r3 = r8.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r10 = r8.A02
            X.JvL r10 = (X.C61021JvL) r10
            java.lang.Object r7 = r8.A01
            X.5Ft r7 = (X.C283015Ft) r7
            X.0eS.A00(r1)
        L_0x0037:
            java.lang.String r0 = r10.A04
            X.3Q2 r6 = r9.A03(r0)
            if (r6 == 0) goto L_0x0045
            boolean r0 = r6.A5K
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L_0x0045:
            boolean r0 = X.AnonymousClass7TF.A1Y(r5, r4)
            if (r0 == 0) goto L_0x0066
            r6.A5K = r13
            X.JTP.A1M(r3)
            android.content.Context r0 = r7.mAppContext
            X.0qQ.A07(r0)
            X.37k r2 = X.C2373637i.A00(r0, r3)
            X.3QF r1 = r6.A1T
            com.instagram.pendingmedia.model.constants.ShareType r0 = r6.A0E()
            int r0 = r1.A01(r0)
            r2.EGB(r6, r0)
        L_0x0066:
            X.1ud r8 = X.1ua.A0G
            android.content.Context r0 = r7.mAppContext
            X.385 r9 = X.AnonymousClass385.A00(r0)
            X.0qQ.A07(r9)
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317500425901248(0x810693000414c0, double:3.030671735951663E-306)
            boolean r12 = X.182.A06(r2, r3, r0)
            r8.A03(r9, r10, r11, r12, r13)
            X.5G1 r6 = new X.5G1
            r6.<init>()
        L_0x0086:
            return r6
        L_0x0087:
            X.0eS.A00(r1)
            androidx.work.WorkerParameters r0 = r14.mWorkerParams     // Catch:{ all -> 0x0096 }
            X.3tw r0 = r0.A02     // Catch:{ all -> 0x0096 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0096 }
            X.JvL r10 = X.C63388Kw9.A00(r0)     // Catch:{ all -> 0x0096 }
            goto L_0x009b
        L_0x0096:
            r0 = move-exception
            X.0eQ r10 = X.JTO.A1B(r0)
        L_0x009b:
            boolean r0 = r10 instanceof X.0eQ
            if (r0 == 0) goto L_0x00a0
            r10 = r5
        L_0x00a0:
            X.JvL r10 = (X.C61021JvL) r10
            java.lang.String r2 = "ERROR_KEY"
            if (r10 != 0) goto L_0x00c7
            X.0eP[] r1 = new X.0eP[r13]
            java.lang.String r0 = "can't parse payload"
        L_0x00aa:
            X.JTP.A1P(r2, r0, r1, r4)
            X.3tx r2 = new X.3tx
            r2.<init>()
            r0 = r1[r4]
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.A01
            r2.A01(r0, r1)
            X.3tw r0 = r2.A00()
            X.5Fh r6 = new X.5Fh
            r6.<init>(r0)
            return r6
        L_0x00c7:
            X.0eM r0 = r14.A00
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            if (r3 != 0) goto L_0x00d8
            X.0eP[] r1 = new X.0eP[r13]
            r0 = 935(0x3a7, float:1.31E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x00aa
        L_0x00d8:
            com.instagram.pendingmedia.store.PendingMediaStore r9 = X.28K.A00(r3)
            X.ME0.A00(r14, r10, r3, r9, r8)
            r8.A00 = r13
            boolean r0 = r9.A0E()
            if (r0 != 0) goto L_0x0103
            X.3Ns r2 = new X.3Ns
            r2.<init>()
            com.instagram.pendingmedia.store.PendingMediaStoreSerializer r1 = X.28E.A00(r3)
            X.M4e r0 = new X.M4e
            r0.<init>(r2)
            r1.A06(r0)
            java.lang.Object r0 = r2.A0E(r8)
            if (r0 != r7) goto L_0x0103
        L_0x00fe:
            if (r0 == r7) goto L_0x0086
            r7 = r14
            goto L_0x0037
        L_0x0103:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x00fe
        L_0x0106:
            X.ME0 r8 = new X.ME0
            r8.<init>(r14, r15, r3)
            goto L_0x0016
        L_0x010d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.NetworkRetryWorker.A03(X.4D7):java.lang.Object");
    }

    public final Object A04(AnonymousClass4D7 r13) {
        C67625Mqx mqx = C67625Mqx.A00;
        Context context = this.mAppContext;
        0qQ.A07(context);
        C255323tw r1 = this.mWorkerParams.A02;
        0qQ.A07(r1);
        return mqx.A01(context, new OI4((Intent) null, (Bitmap) null, (1iA) null, (ShareType) null, JTR.A0G(r1.A03("PENDING_MEDIA_KEY")), false, true));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkRetryWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
    }
}
