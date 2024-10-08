package X;

import android.util.LruCache;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.Q1v  reason: case insensitive filesystem */
public abstract class C7271Q1v implements C13872Tit {
    public final LruCache A00;
    public final C7274Q1y A01;
    public final C7272Q1w A02;
    public final C7264Q1o A03;
    public final Executor A04;
    public final C7273Q1x A05;

    public static final C303656Af A00(Q2X q2x, Q1l q1l, C7271Q1v q1v, ListenableFuture listenableFuture, String str, Map map, boolean z) {
        Q2b q2b = new Q2b(q2x, q1v);
        Executor executor = q1v.A04;
        ListenableFuture[] listenableFutureArr = {C303646Ae.A01(q2b, listenableFuture, executor), C303646Ae.A01(new C7276Q2a(q2x, q1l, q1v, str, map, z), listenableFuture, executor)};
        1K8 r0 = 1L8.A03;
        return C303646Ae.A01(new C7277Q2c(0, C67606Mqe.A00), new C67347MmO(ImmutableList.copyOf((Object[]) listenableFutureArr), true), executor);
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [X.R20, java.lang.Object, java.lang.Runnable, X.1K2] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.common.util.concurrent.ListenableFuture A01(X.Q2X r24, X.Q1l r25, X.C7271Q1v r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30) {
        /*
            r15 = r26
            android.util.LruCache r1 = r15.A00
            r8 = r25
            if (r1 == 0) goto L_0x001c
            int r0 = r8.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x001c
            X.1Ks r5 = new X.1Ks
            r5.<init>(r0)
        L_0x001b:
            return r5
        L_0x001c:
            X.Q1y r0 = r15.A01
            r10 = r24
            if (r0 == 0) goto L_0x004f
            java.util.Map r3 = r0.A00
            java.lang.Object r1 = r3.get(r8)
            X.Q1u r1 = (X.C7270Q1u) r1
            if (r1 == 0) goto L_0x004a
            java.lang.String r2 = r1.A01
        L_0x002e:
            java.lang.Object r1 = r3.get(r8)
            X.Q1u r1 = (X.C7270Q1u) r1
            if (r1 == 0) goto L_0x004f
            com.google.common.util.concurrent.ListenableFuture r5 = r1.A00
            boolean r1 = r5.isDone()
            if (r1 != 0) goto L_0x004c
            boolean r1 = r5.isCancelled()
            if (r1 != 0) goto L_0x004c
            if (r2 == 0) goto L_0x004f
            r10.Ctc(r2)
            return r5
        L_0x004a:
            r2 = 0
            goto L_0x002e
        L_0x004c:
            r3.remove(r8)
        L_0x004f:
            X.Q1x r9 = r15.A05
            java.lang.String r4 = "Failed to create interactive animation for single network request"
            r1 = 1
            r10.D9j()
            java.lang.String r3 = r8.A00
            r20 = r30
            if (r3 == 0) goto L_0x00b0
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x00b0
            X.16F r2 = X.16P.A00(r3)     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            X.Roy r2 = X.Q2O.parseFromJson(r2)     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            X.Rox r2 = r2.A00     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            if (r2 == 0) goto L_0x0094
            X.Txb r6 = r2.A00     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            if (r6 == 0) goto L_0x008b
            X.Txq r2 = X.C14530Txq.A00     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            X.GYt r5 = r2.A01(r10, r6)     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            java.lang.String r3 = "network"
            int r2 = X.C14527Txn.A00(r6)     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            r10.D9k(r3, r2)     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            com.google.common.util.concurrent.ListenableFuture r3 = X.C255183ti.A03(r5)     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            X.0qQ.A07(r3)     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            goto L_0x00e4
        L_0x008b:
            java.lang.String r2 = "missing animation query model in payload"
            X.Nn9 r3 = new X.Nn9     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            goto L_0x009c
        L_0x0094:
            java.lang.String r2 = "missing animation wrapper in payload"
            X.Nn9 r3 = new X.Nn9     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
        L_0x009c:
            throw r3     // Catch:{ IOException -> 0x009d, Nn9 -> 0x00a7 }
        L_0x009d:
            r3 = move-exception
            X.RKD r2 = new X.RKD
            r2.<init>(r4, r3)
            r10.D9i(r2)
            goto L_0x00b0
        L_0x00a7:
            r3 = move-exception
            X.RKD r2 = new X.RKD
            r2.<init>(r4, r3)
            r10.D9i(r2)
        L_0x00b0:
            r12 = r28
            r11 = r29
            if (r30 == 0) goto L_0x01a6
            r2 = r9
            r3 = r10
            r4 = r8
            r5 = r12
            r6 = r11
            r7 = r20
            com.google.common.util.concurrent.ListenableFuture r3 = r2.A00(r3, r4, r5, r6, r7)
        L_0x00c1:
            r4 = 22
            X.PqL r2 = new X.PqL
            r2.<init>(r10, r4)
            X.Q2c r5 = new X.Q2c
            r5.<init>(r1, r2)
            X.0nO r4 = r9.A01
            r23 = 322(0x142, float:4.51E-43)
            r24 = 3
            r25 = 0
            X.0nQ r2 = new X.0nQ
            r21 = r2
            r22 = r4
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            X.6Af r3 = X.C303646Ae.A01(r5, r3, r2)
        L_0x00e4:
            java.util.List r5 = r8.A03
            X.0qQ.A06(r5)
            boolean r4 = X.AnonymousClass7TE.A1b(r5)
            r10.DWH(r4)
            r2 = r27
            if (r4 != 0) goto L_0x012a
            r19 = 2
            X.Pzd r14 = new X.Pzd
            r16 = r8
            r17 = r10
            r18 = r2
            r14.<init>((java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.String) r18, (int) r19, (boolean) r20)
            r4 = 0
            X.Q2c r1 = new X.Q2c
            r1.<init>(r4, r14)
        L_0x0107:
            java.util.concurrent.Executor r4 = r15.A04
            X.6Af r5 = X.C303646Ae.A01(r1, r3, r4)
            if (r0 == 0) goto L_0x001b
            r1 = 3
            X.0qQ.A0B(r4, r1)
            java.util.Map r3 = r0.A00
            X.0qQ.A06(r3)
            X.Q1u r1 = new X.Q1u
            r1.<init>(r5, r2)
            r3.put(r8, r1)
            r2 = 5
            X.T0O r1 = new X.T0O
            r1.<init>(r2, r0, r8)
            X.C255183ti.A04(r1, r5, r4)
            return r5
        L_0x012a:
            boolean r4 = X.AnonymousClass7TE.A1b(r5)
            X.17k.A0E(r4)
            com.google.common.collect.ImmutableList$Builder r7 = X.Pxe.A0Y()
            java.util.Iterator r6 = r5.iterator()
        L_0x0139:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0151
            java.lang.Object r5 = r6.next()
            java.lang.String r5 = (java.lang.String) r5
            X.0qQ.A0A(r5)
            X.JV7 r4 = new X.JV7
            r4.<init>((java.lang.String) r5, (java.lang.String) r5)
            r7.add(r4)
            goto L_0x0139
        L_0x0151:
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r6)
            r5 = 11
            X.JwI r4 = new X.JwI
            r4.<init>((java.util.List) r6, (int) r5)
            com.google.common.collect.ImmutableList r23 = X.DbZ.A0K(r7)
            com.google.common.collect.ImmutableList r24 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r24)
            java.lang.String r25 = ""
            X.Q1n r21 = new X.Q1n
            r22 = r4
            r26 = r25
            r21.<init>(r22, r23, r24, r25, r26)
            X.Q1o r4 = r15.A03
            r9 = r4
            r11 = r8
            r12 = r21
            r13 = r2
            r14 = r20
            X.6Af r4 = r9.A00(r10, r11, r12, r13, r14)
            r5 = 0
            com.google.common.util.concurrent.ListenableFuture[] r4 = new com.google.common.util.concurrent.ListenableFuture[]{r3, r4}
            X.1K8 r3 = X.1L8.A03
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.copyOf((java.lang.Object[]) r4)
            X.MmO r3 = new X.MmO
            r3.<init>(r4, r1)
            r19 = 3
            X.Pzd r14 = new X.Pzd
            r16 = r8
            r17 = r10
            r18 = r2
            r14.<init>((java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.String) r18, (int) r19, (boolean) r20)
            X.Q2c r1 = new X.Q2c
            r1.<init>(r5, r14)
            goto L_0x0107
        L_0x01a6:
            r13 = 0
            com.instagram.common.session.UserSession r2 = r9.A00     // Catch:{ IllegalArgumentException -> 0x01c0, IOException -> 0x01ba }
            r21 = r8
            r22 = r2
            r23 = r12
            r24 = r11
            r25 = r13
            r26 = r1
            X.1OC r3 = X.SBX.A00(r21, r22, r23, r24, r25, r26)     // Catch:{ IllegalArgumentException -> 0x01c0, IOException -> 0x01ba }
            goto L_0x01c6
        L_0x01ba:
            r2 = move-exception
            X.R1v r4 = X.RKD.A00(r10, r2)
            goto L_0x01eb
        L_0x01c0:
            r2 = move-exception
            X.R1v r4 = X.RKD.A00(r10, r2)
            goto L_0x01eb
        L_0x01c6:
            X.0qQ.A0B(r3, r13)
            com.google.common.util.concurrent.SettableFuture r2 = new com.google.common.util.concurrent.SettableFuture
            r2.<init>()
            X.R22 r4 = new X.R22
            r4.<init>(r2, r3)
            r2 = 4
            X.T0J r5 = new X.T0J
            r5.<init>(r10, r2)
            X.0nO r3 = r9.A01
            r23 = 322(0x142, float:4.51E-43)
            r24 = 3
            X.0nQ r2 = new X.0nQ
            r21 = r2
            r22 = r3
            r21.<init>(r22, r23, r24, r25, r26)
            X.C255183ti.A04(r5, r4, r2)
        L_0x01eb:
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            X.TWQ r7 = new X.TWQ
            r14 = r13
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            X.Q2c r5 = new X.Q2c
            r5.<init>(r1, r7)
            X.0nO r2 = r9.A01
            r23 = 324(0x144, float:4.54E-43)
            r24 = 3
            X.0nQ r7 = new X.0nQ
            r21 = r7
            r22 = r2
            r25 = r13
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            r2 = r4
            X.R1r r3 = new X.R1r
            r3.<init>()
            com.google.common.util.concurrent.ListenableFuture r2 = (com.google.common.util.concurrent.ListenableFuture) r2
            r3.A00 = r2
            r3.A01 = r6
            r3.A02 = r5
            java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(r7, r3)
            r4.addListener(r3, r2)
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7271Q1v.A01(X.Q2X, X.Q1l, X.Q1v, java.lang.String, java.lang.String, java.lang.String, boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    public C7271Q1v(LruCache lruCache, C7274Q1y q1y, C7272Q1w q1w, C7273Q1x q1x, C7264Q1o q1o, Executor executor) {
        this.A05 = q1x;
        this.A02 = q1w;
        this.A03 = q1o;
        this.A04 = executor;
        this.A00 = lruCache;
        this.A01 = q1y;
    }
}
