package com.instagram.security.attestation.playintegrity.worker;

import X.0nV;
import X.0qQ;
import X.AnonymousClass12T;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class PlayIntegrityAttestationWorker extends CoroutineWorker {
    public final 0nV A00 = AnonymousClass12T.A00.CO6(718484570, 3);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayIntegrityAttestationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        0qQ.A0B(context, 1);
        0qQ.A0B(workerParameters, 2);
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [X.4D7] */
    /* JADX WARNING: type inference failed for: r17v1, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r23) {
        /*
            r22 = this;
            r3 = r23
            boolean r0 = r3 instanceof X.C41543Avl
            r5 = r22
            if (r0 == 0) goto L_0x002c
            r4 = r3
            X.Avl r4 = (X.C41543Avl) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r6 = r4.A07
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r11 = 2
            r8 = 1
            if (r0 == 0) goto L_0x004b
            if (r0 == r8) goto L_0x0032
            if (r0 == r11) goto L_0x0032
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002c:
            X.Avl r4 = new X.Avl
            r4.<init>(r5, r3)
            goto L_0x0016
        L_0x0032:
            boolean r7 = r4.A06
            long r0 = r4.A01
            java.lang.Object r10 = r4.A05
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r2 = r4.A04
            X.A4M r2 = (X.A4M) r2
            java.lang.Object r14 = r4.A03
            X.0Ak r14 = (X.0Ak) r14
            java.lang.Object r4 = r4.A02
            X.5Ft r4 = (X.C283015Ft) r4
            X.0eS.A00(r6)
            goto L_0x017b
        L_0x004b:
            X.0eS.A00(r6)
            X.08y r0 = X.09i.A0A     // Catch:{ IllegalStateException -> 0x021c }
            com.instagram.common.session.UserSession r15 = r0.A08(r5)     // Catch:{ IllegalStateException -> 0x021c }
            r13 = 0
            X.0kM r0 = new X.0kM
            r0.<init>(r15)
            X.0wc r2 = r0.A00()
            java.lang.String r1 = "ig_attest_playintegrity_background"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            r0 = 191(0xbf, float:2.68E-43)
            X.1Ln r14 = new X.1Ln
            r14.<init>(r1, r0)
            X.G0f r1 = new X.G0f
            r1.<init>(r15, r8)
            java.lang.Class<X.A4M> r0 = X.A4M.class
            java.lang.Object r2 = r15.A01(r0, r1)
            X.A4M r2 = (X.A4M) r2
            X.0Tu r9 = X.0Tu.A05
            r0 = 2342160874711815798(0x208106e800041676, double:4.06377600370942E-152)
            boolean r12 = X.182.A06(r9, r15, r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)
            X.0Tu r6 = X.0Tu.A06
            r0 = 36599340475026939(0x8206e800070dfb, double:3.208908517897536E-306)
            long r0 = X.182.A01(r6, r15, r0)
            boolean r10 = X.14i.A08()
            if (r12 == 0) goto L_0x00e1
            if (r10 != 0) goto L_0x00e1
            X.0Aj r0 = r14.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x00cc
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r0 = 943(0x3af, float:1.321E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r14.A0O(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r0 = 1493(0x5d5, float:2.092E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r14.A0O(r0, r1)
            r0 = 1466(0x5ba, float:2.054E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "error_type"
            r14.A0R(r0, r1)
            r14.Cgf()
        L_0x00cc:
            X.0xa r0 = r2.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "PLAY_INTEGRITY_ERROR_CODES"
            r0 = 0
            r2.E5g(r1, r0)
            r2.apply()
            X.5Fh r3 = new X.5Fh
            r3.<init>()
            return r3
        L_0x00e1:
            r6 = 943(0x3af, float:1.321E-42)
            java.lang.String r6 = X.C273654mx.A00(r6)
            r14.A0O(r6, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r10)
            r6 = 1493(0x5d5, float:2.092E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            r14.A0O(r6, r7)
            X.0xa r7 = r2.A00
            java.lang.String r6 = "PLAY_INTEGRITY_ERROR_CODES"
            r12 = 0
            java.lang.String r10 = r7.getString(r6, r12)
            if (r10 == 0) goto L_0x0143
            com.google.gson.Gson r7 = new com.google.gson.Gson
            r7.<init>()
            X.R1c r6 = new X.R1c
            r6.<init>()
            java.lang.reflect.Type r6 = r6.A00
            java.lang.Object r10 = r7.A09(r10, r6)
            X.0qQ.A07(r10)
            java.util.List r10 = (java.util.List) r10
            r6 = 10
            int r6 = X.0Yv.A1E(r10, r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L_0x0126:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x013e
            java.lang.Object r6 = r10.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            X.RHJ r6 = X.RHJ.A00(r6)
            r7.add(r6)
            goto L_0x0126
        L_0x013e:
            java.util.ArrayList r10 = X.00k.A0U(r7)
            goto L_0x0148
        L_0x0143:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0148:
            r6 = 36317865498383992(0x8106e800081678, double:3.0309026092597794E-306)
            boolean r7 = X.182.A06(r9, r15, r6)
            if (r7 == 0) goto L_0x01a1
            android.content.Context r11 = r5.mAppContext
            X.0qQ.A07(r11)
            X.0nV r9 = r5.A00
            int r6 = (int) r0
            r4.A02 = r5
            r4.A03 = r14
            r4.A04 = r2
            r4.A05 = r10
            r4.A01 = r0
            r4.A06 = r7
            r4.A00 = r8
            java.lang.String r16 = "AndroidPlayIntegrityAttestationWorker"
            r13 = r11
            r17 = r4
            r18 = r9
            r19 = r6
            r20 = r8
            java.lang.Object r6 = com.instagram.security.attestation.playintegrity.worker.IgPlayIntegrityAttestationUtils.A00(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r6 == r3) goto L_0x01a0
            r4 = r5
        L_0x017b:
            X.9IP r6 = (X.AnonymousClass9IP) r6
            X.0Aj r3 = r14.A00
            boolean r3 = r3.isSampled()
            if (r3 == 0) goto L_0x0188
            r14.Cgf()
        L_0x0188:
            boolean r3 = r6.A02
            if (r3 == 0) goto L_0x01cb
            X.0xa r0 = r2.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "PLAY_INTEGRITY_ERROR_CODES"
            r0 = 0
            r2.E5g(r1, r0)
            r2.apply()
            X.5G1 r3 = new X.5G1
            r3.<init>()
        L_0x01a0:
            return r3
        L_0x01a1:
            android.content.Context r13 = r5.mAppContext
            X.0qQ.A07(r13)
            X.0nV r6 = r5.A00
            r4.A02 = r5
            r4.A03 = r14
            r4.A04 = r2
            r4.A05 = r10
            r4.A01 = r0
            r4.A06 = r7
            r4.A00 = r11
            java.lang.String r17 = "AndroidPlayIntegrityAttestationWorker"
            r19 = r4
            r20 = r6
            r21 = r8
            r16 = r12
            r18 = r10
            java.lang.Object r6 = com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationUtils.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r6 == r3) goto L_0x01a0
            r4 = r5
            r7 = 0
            goto L_0x017b
        L_0x01cb:
            androidx.work.WorkerParameters r3 = r4.mWorkerParams
            int r3 = r3.A01
            long r4 = (long) r3
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x00cc
            if (r7 != 0) goto L_0x00cc
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r0 = 10
            int r0 = X.0Yv.A1E(r10, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r1 = r10.iterator()
        L_0x01e9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r0 = r1.next()
            X.RHJ r0 = (X.RHJ) r0
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            goto L_0x01e9
        L_0x01ff:
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r3 = r0.A0B(r3)
            X.0xa r0 = r2.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "PLAY_INTEGRITY_ERROR_CODES"
            r1.E5g(r0, r3)
            r1.apply()
            X.5G2 r3 = new X.5G2
            r3.<init>()
            return r3
        L_0x021c:
            X.5Fh r0 = new X.5Fh
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationWorker.A03(X.4D7):java.lang.Object");
    }
}
