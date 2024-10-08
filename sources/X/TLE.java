package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class TLE implements Runnable, Comparable, C13766Tge, C13543TcF {
    public int A00;
    public int A01;
    public int A02;
    public Q6I A03;
    public RE3 A04;
    public C13892TjF A05;
    public C13892TjF A06;
    public C11856Shi A07;
    public C10112Rmo A08;
    public C12005SkO A09;
    public C11855Shh A0A;
    public Integer A0B;
    public Integer A0C;
    public Object A0D;
    public boolean A0E;
    public long A0F;
    public C13892TjF A0G;
    public C13812Thf A0H;
    public Integer A0I;
    public Object A0J;
    public Thread A0K;
    public boolean A0L;
    public final S77 A0M = new S77();
    public final C10524Rtd A0N = new Object();
    public final C10525Rte A0O = new Object();
    public final S10 A0P;
    public final 02U A0Q;
    public final S0B A0R = new Object();
    public final List A0S = AnonymousClass7TE.A1C();
    public volatile C13695TfD A0T;
    public volatile boolean A0U;
    public volatile boolean A0V;

    private C13695TfD A00() {
        Integer num = this.A0C;
        int intValue = num.intValue();
        if (intValue == 1) {
            return new C11883SiG(this, this.A0M);
        }
        if (intValue == 2) {
            S77 s77 = this.A0M;
            return new C11882SiF(this, s77, s77.A02());
        } else if (intValue == 3) {
            return new C11904Sid(this, this.A0M);
        } else {
            if (intValue == 5) {
                return null;
            }
            throw DbW.A0c("Unrecognized stage: ", C9207RTk.A00(num));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.Sim} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.Sim} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: X.Shg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: X.Shk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: X.Shk} */
    /* JADX WARNING: type inference failed for: r14v3, types: [X.TjF] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
        if (r8.A0E != false) goto L_0x005c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5 A[Catch:{ RKo -> 0x025c, all -> 0x039b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02() {
        /*
            r38 = this;
            java.lang.String r23 = "DecodeJob"
            r10 = 2
            r0 = r23
            boolean r0 = android.util.Log.isLoggable(r0, r10)
            r11 = r38
            if (r0 == 0) goto L_0x0035
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "data: "
            r1.append(r0)
            java.lang.Object r0 = r11.A0J
            r1.append(r0)
            java.lang.String r0 = ", cache key: "
            r1.append(r0)
            X.TjF r0 = r11.A05
            r1.append(r0)
            java.lang.String r0 = ", fetcher: "
            r1.append(r0)
            X.Thf r0 = r11.A0H
            r1.append(r0)
            r1.toString()
            android.os.SystemClock.elapsedRealtimeNanos()
        L_0x0035:
            X.Thf r0 = r11.A0H     // Catch:{ RKo -> 0x03ac }
            r37 = r0
            java.lang.Object r2 = r11.A0J     // Catch:{ RKo -> 0x03ac }
            java.lang.Integer r9 = r11.A0I     // Catch:{ RKo -> 0x03ac }
            if (r2 != 0) goto L_0x0042
            r1 = 0
            goto L_0x0286
        L_0x0042:
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x03a7 }
            X.S77 r8 = r11.A0M     // Catch:{ all -> 0x03a7 }
            java.lang.Class r0 = r2.getClass()     // Catch:{ all -> 0x03a7 }
            X.S1c r7 = r8.A01(r0)     // Catch:{ all -> 0x03a7 }
            X.Shi r6 = r11.A07     // Catch:{ all -> 0x03a7 }
            java.lang.Integer r22 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x03a7 }
            r0 = r22
            if (r9 == r0) goto L_0x005c
            boolean r0 = r8.A0E     // Catch:{ all -> 0x03a7 }
            r4 = 0
            if (r0 == 0) goto L_0x005d
        L_0x005c:
            r4 = 1
        L_0x005d:
            X.SJ8 r3 = X.C11416SSr.A05     // Catch:{ all -> 0x03a7 }
            java.lang.Object r0 = r6.A00(r3)     // Catch:{ all -> 0x03a7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x0070
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x0085
            if (r4 == 0) goto L_0x0070
            goto L_0x0085
        L_0x0070:
            X.Shi r6 = new X.Shi     // Catch:{ all -> 0x03a7 }
            r6.<init>()     // Catch:{ all -> 0x03a7 }
            X.Shi r0 = r11.A07     // Catch:{ all -> 0x03a7 }
            X.0yf r1 = r6.A00     // Catch:{ all -> 0x03a7 }
            X.0yf r0 = r0.A00     // Catch:{ all -> 0x03a7 }
            r1.A09(r0)     // Catch:{ all -> 0x03a7 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x03a7 }
            r1.put(r3, r0)     // Catch:{ all -> 0x03a7 }
        L_0x0085:
            X.Q6I r0 = r11.A03     // Catch:{ all -> 0x03a7 }
            X.Tj5 r0 = r0.A05     // Catch:{ all -> 0x03a7 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03a7 }
            X.S7e r0 = (X.C11044S7e) r0     // Catch:{ all -> 0x03a7 }
            X.TfC r21 = r0.A00(r2)     // Catch:{ all -> 0x03a7 }
            int r0 = r11.A02     // Catch:{ all -> 0x03a2 }
            r36 = r0
            int r0 = r11.A00     // Catch:{ all -> 0x03a2 }
            r35 = r0
            X.02U r0 = r7.A00     // Catch:{ all -> 0x03a2 }
            r34 = r0
            java.lang.Object r5 = r34.A7A()     // Catch:{ all -> 0x03a2 }
            X.C9217RTu.A00(r5)     // Catch:{ all -> 0x03a2 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x03a2 }
            java.util.List r0 = r7.A02     // Catch:{ all -> 0x039b }
            r33 = r0
            int r20 = r33.size()     // Catch:{ all -> 0x039b }
            r4 = 0
        L_0x00b1:
            r0 = r20
            if (r4 >= r0) goto L_0x038f
            r0 = r33
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x039b }
            X.S2e r3 = (X.C10946S2e) r3     // Catch:{ all -> 0x039b }
            X.02U r2 = r3.A00     // Catch:{ RKo -> 0x025c }
            java.lang.Object r1 = r2.A7A()     // Catch:{ RKo -> 0x025c }
            X.C9217RTu.A00(r1)     // Catch:{ RKo -> 0x025c }
            java.util.List r1 = (java.util.List) r1     // Catch:{ RKo -> 0x025c }
            java.util.List r0 = r3.A03     // Catch:{ all -> 0x0245 }
            r17 = r0
            int r16 = r17.size()     // Catch:{ all -> 0x0245 }
            r13 = 0
        L_0x00d1:
            r0 = r16
            if (r13 >= r0) goto L_0x0239
            r0 = r17
            java.lang.Object r15 = r0.get(r13)     // Catch:{ all -> 0x0245 }
            X.Tf9 r15 = (X.C13691Tf9) r15     // Catch:{ all -> 0x0245 }
            java.lang.Object r0 = r21.EJO()     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x00f6 }
            boolean r0 = r15.CJU(r6, r0)     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x00f6 }
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r14 = r21.EJO()     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x00f6 }
            r12 = r36
            r0 = r35
            X.ThF r12 = r15.ANe(r6, r14, r12, r0)     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x00f6 }
            if (r12 == 0) goto L_0x00ff
            goto L_0x0102
        L_0x00f6:
            r12 = move-exception
            java.lang.String r0 = "DecodePath"
            android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x0245 }
            r1.add(r12)     // Catch:{ all -> 0x0245 }
        L_0x00ff:
            int r13 = r13 + 1
            goto L_0x00d1
        L_0x0102:
            r2.ECR(r1)     // Catch:{ RKo -> 0x025c }
            java.lang.Object r0 = r12.get()     // Catch:{ RKo -> 0x025c }
            java.lang.Class r19 = r0.getClass()     // Catch:{ RKo -> 0x025c }
            r1 = 0
            r0 = r22
            if (r9 == r0) goto L_0x0166
            r0 = r19
            X.TlI r18 = r8.A00(r0)     // Catch:{ RKo -> 0x025c }
            X.Q6I r14 = r11.A03     // Catch:{ RKo -> 0x025c }
            int r13 = r11.A02     // Catch:{ RKo -> 0x025c }
            int r2 = r11.A00     // Catch:{ RKo -> 0x025c }
            r0 = r18
            X.ThF r2 = r0.FHe(r14, r12, r13, r2)     // Catch:{ RKo -> 0x025c }
        L_0x0124:
            boolean r0 = r12.equals(r2)     // Catch:{ RKo -> 0x025c }
            if (r0 != 0) goto L_0x012d
            r12.recycle()     // Catch:{ RKo -> 0x025c }
        L_0x012d:
            X.S7e r0 = X.C13882Tj5.A00(r8)     // Catch:{ RKo -> 0x025c }
            X.S0A r12 = r0.A08     // Catch:{ RKo -> 0x025c }
            java.lang.Class r0 = r2.Bne()     // Catch:{ RKo -> 0x025c }
            X.TlH r0 = r12.A00(r0)     // Catch:{ RKo -> 0x025c }
            if (r0 == 0) goto L_0x0163
            X.S7e r0 = X.C13882Tj5.A00(r8)     // Catch:{ RKo -> 0x025c }
            X.S0A r1 = r0.A08     // Catch:{ RKo -> 0x025c }
            java.lang.Class r0 = r2.Bne()     // Catch:{ RKo -> 0x025c }
            X.TlH r1 = r1.A00(r0)     // Catch:{ RKo -> 0x025c }
            if (r1 == 0) goto L_0x021d
            X.Shi r0 = r11.A07     // Catch:{ RKo -> 0x025c }
            java.lang.Integer r12 = r1.B1N(r0)     // Catch:{ RKo -> 0x025c }
        L_0x0153:
            X.TjF r0 = r11.A05     // Catch:{ RKo -> 0x025c }
            r24 = r0
            java.util.List r17 = r8.A03()     // Catch:{ RKo -> 0x025c }
            int r14 = r17.size()     // Catch:{ RKo -> 0x025c }
            r16 = 0
            r13 = 0
            goto L_0x016a
        L_0x0163:
            java.lang.Integer r12 = X.AnonymousClass05K.A0C     // Catch:{ RKo -> 0x025c }
            goto L_0x0153
        L_0x0166:
            r2 = r12
            r18 = r1
            goto L_0x0124
        L_0x016a:
            if (r13 >= r14) goto L_0x0184
            r0 = r17
            java.lang.Object r0 = r0.get(r13)     // Catch:{ RKo -> 0x025c }
            X.Rth r0 = (X.C10528Rth) r0     // Catch:{ RKo -> 0x025c }
            X.TjF r15 = r0.A00     // Catch:{ RKo -> 0x025c }
            r0 = r24
            boolean r0 = r15.equals(r0)     // Catch:{ RKo -> 0x025c }
            if (r0 == 0) goto L_0x017f
            goto L_0x0182
        L_0x017f:
            int r13 = r13 + 1
            goto L_0x016a
        L_0x0182:
            r16 = 1
        L_0x0184:
            r13 = 0
            r14 = r16 ^ 1
            X.Rmo r0 = r11.A08     // Catch:{ RKo -> 0x025c }
            boolean r0 = r0 instanceof X.QH3     // Catch:{ RKo -> 0x025c }
            if (r0 == 0) goto L_0x0214
            if (r14 == 0) goto L_0x0193
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ RKo -> 0x025c }
            if (r9 == r0) goto L_0x0197
        L_0x0193:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ RKo -> 0x025c }
            if (r9 != r0) goto L_0x0214
        L_0x0197:
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ RKo -> 0x025c }
            if (r12 != r0) goto L_0x0214
            if (r1 == 0) goto L_0x01d0
            int r12 = r12.intValue()     // Catch:{ RKo -> 0x025c }
            if (r12 == r13) goto L_0x01f0
            r0 = 1
            if (r12 != r0) goto L_0x024a
            X.Q6I r0 = r8.A02     // Catch:{ RKo -> 0x025c }
            X.ST0 r0 = r0.A04     // Catch:{ RKo -> 0x025c }
            r29 = r0
            X.TjF r0 = r11.A05     // Catch:{ RKo -> 0x025c }
            r17 = r0
            X.TjF r0 = r11.A06     // Catch:{ RKo -> 0x025c }
            r16 = r0
            int r15 = r11.A02     // Catch:{ RKo -> 0x025c }
            int r12 = r11.A00     // Catch:{ RKo -> 0x025c }
            X.Shi r0 = r11.A07     // Catch:{ RKo -> 0x025c }
            X.Shk r14 = new X.Shk     // Catch:{ RKo -> 0x025c }
            r24 = r14
            r25 = r17
            r26 = r16
            r27 = r0
            r28 = r18
            r30 = r19
            r31 = r15
            r32 = r12
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ RKo -> 0x025c }
            goto L_0x01f9
        L_0x01d0:
            java.lang.Object r0 = r2.get()     // Catch:{ RKo -> 0x025c }
            java.lang.Class r2 = r0.getClass()     // Catch:{ RKo -> 0x025c }
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ RKo -> 0x025c }
            java.lang.String r0 = "Failed to find result encoder for resource class: "
            r1.append(r0)     // Catch:{ RKo -> 0x025c }
            r1.append(r2)     // Catch:{ RKo -> 0x025c }
            java.lang.String r0 = ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ RKo -> 0x025c }
            X.QGr r3 = new X.QGr     // Catch:{ RKo -> 0x025c }
            r3.<init>(r0)     // Catch:{ RKo -> 0x025c }
            goto L_0x0255
        L_0x01f0:
            X.TjF r12 = r11.A05     // Catch:{ RKo -> 0x025c }
            X.TjF r0 = r11.A06     // Catch:{ RKo -> 0x025c }
            X.Shg r14 = new X.Shg     // Catch:{ RKo -> 0x025c }
            r14.<init>(r12, r0)     // Catch:{ RKo -> 0x025c }
        L_0x01f9:
            X.02U r0 = X.C11913Sim.A04     // Catch:{ RKo -> 0x025c }
            java.lang.Object r12 = r0.A7A()     // Catch:{ RKo -> 0x025c }
            X.C9217RTu.A00(r12)     // Catch:{ RKo -> 0x025c }
            X.Sim r12 = (X.C11913Sim) r12     // Catch:{ RKo -> 0x025c }
            r12.A02 = r13     // Catch:{ RKo -> 0x025c }
            r0 = 1
            r12.A01 = r0     // Catch:{ RKo -> 0x025c }
            r12.A00 = r2     // Catch:{ RKo -> 0x025c }
            r2 = r12
            X.Rtd r0 = r11.A0N     // Catch:{ RKo -> 0x025c }
            r0.A00 = r14     // Catch:{ RKo -> 0x025c }
            r0.A01 = r1     // Catch:{ RKo -> 0x025c }
            r0.A02 = r12     // Catch:{ RKo -> 0x025c }
        L_0x0214:
            X.TcA r0 = r3.A01     // Catch:{ RKo -> 0x025c }
            X.ThF r1 = r0.FHZ(r6, r2)     // Catch:{ RKo -> 0x025c }
            if (r1 == 0) goto L_0x0260
            goto L_0x0264
        L_0x021d:
            java.lang.Class r2 = r2.Bne()     // Catch:{ RKo -> 0x025c }
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ RKo -> 0x025c }
            java.lang.String r0 = "Failed to find result encoder for resource class: "
            r1.append(r0)     // Catch:{ RKo -> 0x025c }
            r1.append(r2)     // Catch:{ RKo -> 0x025c }
            java.lang.String r0 = ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ RKo -> 0x025c }
            X.QGr r3 = new X.QGr     // Catch:{ RKo -> 0x025c }
            r3.<init>(r0)     // Catch:{ RKo -> 0x025c }
            goto L_0x0255
        L_0x0239:
            java.lang.String r12 = r3.A02     // Catch:{ all -> 0x0245 }
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r1)     // Catch:{ all -> 0x0245 }
            X.RKo r0 = new X.RKo     // Catch:{ all -> 0x0245 }
            r0.<init>(r12, r3)     // Catch:{ all -> 0x0245 }
            throw r0     // Catch:{ all -> 0x0245 }
        L_0x0245:
            r3 = move-exception
            r2.ECR(r1)     // Catch:{ RKo -> 0x025c }
            goto L_0x0255
        L_0x024a:
            java.lang.String r1 = "Unknown strategy: "
            switch(r12) {
                case 1: goto L_0x0259;
                case 2: goto L_0x0256;
                default: goto L_0x024f;
            }     // Catch:{ RKo -> 0x025c }
        L_0x024f:
            java.lang.String r0 = "SOURCE"
        L_0x0251:
            java.lang.IllegalArgumentException r3 = X.AnonymousClass7TF.A0W(r1, r0)     // Catch:{ RKo -> 0x025c }
        L_0x0255:
            throw r3     // Catch:{ RKo -> 0x025c }
        L_0x0256:
            java.lang.String r0 = "NONE"
            goto L_0x0251
        L_0x0259:
            java.lang.String r0 = "TRANSFORMED"
            goto L_0x0251
        L_0x025c:
            r0 = move-exception
            r5.add(r0)     // Catch:{ all -> 0x039b }
        L_0x0260:
            int r4 = r4 + 1
            goto L_0x00b1
        L_0x0264:
            r0 = r34
            r0.ECR(r5)     // Catch:{ all -> 0x03a2 }
            r21.cleanup()     // Catch:{ all -> 0x03a7 }
            r0 = r23
            boolean r0 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x0286
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x03a7 }
            java.lang.String r0 = "Decoded result "
            r2.append(r0)     // Catch:{ all -> 0x03a7 }
            r2.append(r1)     // Catch:{ all -> 0x03a7 }
            r2.toString()     // Catch:{ all -> 0x03a7 }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x03a7 }
        L_0x0286:
            r37.cleanup()     // Catch:{ RKo -> 0x03ac }
            if (r1 == 0) goto L_0x03bd
            java.lang.Integer r3 = r11.A0I
            boolean r2 = r11.A0L
            boolean r0 = r1 instanceof X.C13532Tc4     // Catch:{ all -> 0x038d }
            if (r0 == 0) goto L_0x0299
            r0 = r1
            X.Tc4 r0 = (X.C13532Tc4) r0     // Catch:{ all -> 0x038d }
            r0.initialize()     // Catch:{ all -> 0x038d }
        L_0x0299:
            r6 = 0
            X.Rtd r7 = r11.A0N     // Catch:{ all -> 0x038d }
            X.Sim r0 = r7.A02     // Catch:{ all -> 0x038d }
            if (r0 == 0) goto L_0x02b4
            X.02U r0 = X.C11913Sim.A04     // Catch:{ all -> 0x038d }
            java.lang.Object r6 = r0.A7A()     // Catch:{ all -> 0x038d }
            X.C9217RTu.A00(r6)     // Catch:{ all -> 0x038d }
            X.Sim r6 = (X.C11913Sim) r6     // Catch:{ all -> 0x038d }
            r0 = 0
            r6.A02 = r0     // Catch:{ all -> 0x038d }
            r0 = 1
            r6.A01 = r0     // Catch:{ all -> 0x038d }
            r6.A00 = r1     // Catch:{ all -> 0x038d }
            r1 = r6
        L_0x02b4:
            r11.A05()     // Catch:{ all -> 0x038d }
            X.SkO r4 = r11.A09     // Catch:{ all -> 0x038d }
            monitor-enter(r4)     // Catch:{ all -> 0x038d }
            r4.A04 = r1     // Catch:{ all -> 0x0387 }
            r4.A05 = r3     // Catch:{ all -> 0x0387 }
            r4.A09 = r2     // Catch:{ all -> 0x0387 }
            monitor-exit(r4)     // Catch:{ all -> 0x0387 }
            monitor-enter(r4)     // Catch:{ all -> 0x038d }
            X.S0B r0 = r4.A0M     // Catch:{ all -> 0x0384 }
            r0.A00()     // Catch:{ all -> 0x0384 }
            boolean r0 = r4.A0O     // Catch:{ all -> 0x0384 }
            if (r0 == 0) goto L_0x02d5
            X.ThF r0 = r4.A04     // Catch:{ all -> 0x0384 }
            r0.recycle()     // Catch:{ all -> 0x0384 }
            X.C12005SkO.A00(r4)     // Catch:{ all -> 0x0384 }
            monitor-exit(r4)     // Catch:{ all -> 0x0384 }
            goto L_0x032c
        L_0x02d5:
            X.TAI r0 = r4.A0H     // Catch:{ all -> 0x0384 }
            java.util.List r9 = r0.A00     // Catch:{ all -> 0x0384 }
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x0376
            boolean r0 = r4.A07     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x037d
            X.ThF r8 = r4.A04     // Catch:{ all -> 0x0384 }
            boolean r5 = r4.A08     // Catch:{ all -> 0x0384 }
            X.TjF r3 = r4.A00     // Catch:{ all -> 0x0384 }
            X.SOI r2 = r4.A0F     // Catch:{ all -> 0x0384 }
            r1 = 1
            X.Sii r0 = new X.Sii     // Catch:{ all -> 0x0384 }
            r0.<init>(r3, r2, r8, r5)     // Catch:{ all -> 0x0384 }
            r4.A02 = r0     // Catch:{ all -> 0x0384 }
            r4.A07 = r1     // Catch:{ all -> 0x0384 }
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r9)     // Catch:{ all -> 0x0384 }
            int r0 = r3.size()     // Catch:{ all -> 0x0384 }
            int r0 = r0 + 1
            r4.A02(r0)     // Catch:{ all -> 0x0384 }
            X.TjF r2 = r4.A00     // Catch:{ all -> 0x0384 }
            X.Sii r1 = r4.A02     // Catch:{ all -> 0x0384 }
            monitor-exit(r4)     // Catch:{ all -> 0x0384 }
            X.SOI r0 = r4.A0E     // Catch:{ all -> 0x038d }
            r0.A01(r2, r4, r1)     // Catch:{ all -> 0x038d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x038d }
        L_0x0310:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x038d }
            if (r0 == 0) goto L_0x0329
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x038d }
            X.S48 r0 = (X.S48) r0     // Catch:{ all -> 0x038d }
            java.util.concurrent.Executor r2 = r0.A01     // Catch:{ all -> 0x038d }
            X.Sk9 r1 = r0.A00     // Catch:{ all -> 0x038d }
            X.TFI r0 = new X.TFI     // Catch:{ all -> 0x038d }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x038d }
            r2.execute(r0)     // Catch:{ all -> 0x038d }
            goto L_0x0310
        L_0x0329:
            r4.A01()     // Catch:{ all -> 0x038d }
        L_0x032c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x038d }
            r11.A0C = r0     // Catch:{ all -> 0x038d }
            X.Sim r0 = r7.A02     // Catch:{ all -> 0x036f }
            if (r0 == 0) goto L_0x0357
            X.S10 r0 = r11.A0P     // Catch:{ all -> 0x036f }
            X.Shi r5 = r11.A07     // Catch:{ all -> 0x036f }
            X.TfE r4 = r0.A00()     // Catch:{ all -> 0x0350 }
            X.TjF r3 = r7.A00     // Catch:{ all -> 0x0350 }
            X.TlH r2 = r7.A01     // Catch:{ all -> 0x0350 }
            X.Sim r1 = r7.A02     // Catch:{ all -> 0x0350 }
            X.VUR r0 = new X.VUR     // Catch:{ all -> 0x0350 }
            r0.<init>(r2, r5, r1)     // Catch:{ all -> 0x0350 }
            r4.E5J(r3, r0)     // Catch:{ all -> 0x0350 }
            X.Sim r0 = r7.A02     // Catch:{ all -> 0x036f }
            r0.A00()     // Catch:{ all -> 0x036f }
            goto L_0x0357
        L_0x0350:
            r1 = move-exception
            X.Sim r0 = r7.A02     // Catch:{ all -> 0x036f }
            r0.A00()     // Catch:{ all -> 0x036f }
            throw r1     // Catch:{ all -> 0x036f }
        L_0x0357:
            if (r6 == 0) goto L_0x035c
            r6.A00()     // Catch:{ all -> 0x038d }
        L_0x035c:
            X.Rte r1 = r11.A0O     // Catch:{ all -> 0x038d }
            monitor-enter(r1)     // Catch:{ all -> 0x038d }
            r0 = 1
            r1.A00 = r0     // Catch:{ all -> 0x038a }
            boolean r0 = r1.A02     // Catch:{ all -> 0x038a }
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x038d }
            if (r0 == 0) goto L_0x03c0
            A06(r11)     // Catch:{ all -> 0x038d }
            return
        L_0x036f:
            r0 = move-exception
            if (r6 == 0) goto L_0x038c
            r6.A00()     // Catch:{ all -> 0x038d }
            goto L_0x038c
        L_0x0376:
            java.lang.String r0 = "Received a resource without any callbacks to notify"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x0384 }
            goto L_0x0383
        L_0x037d:
            java.lang.String r0 = "Already have resource"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x0384 }
        L_0x0383:
            throw r0     // Catch:{ all -> 0x0384 }
        L_0x0384:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0384 }
            goto L_0x038c
        L_0x0387:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0387 }
            goto L_0x038c
        L_0x038a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x038d }
        L_0x038c:
            throw r0     // Catch:{ all -> 0x038d }
        L_0x038d:
            r0 = move-exception
            throw r0
        L_0x038f:
            java.lang.String r2 = r7.A01     // Catch:{ all -> 0x039b }
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r5)     // Catch:{ all -> 0x039b }
            X.RKo r0 = new X.RKo     // Catch:{ all -> 0x039b }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x039b }
            throw r0     // Catch:{ all -> 0x039b }
        L_0x039b:
            r1 = move-exception
            r0 = r34
            r0.ECR(r5)     // Catch:{ all -> 0x03a2 }
            throw r1     // Catch:{ all -> 0x03a2 }
        L_0x03a2:
            r0 = move-exception
            r21.cleanup()     // Catch:{ all -> 0x03a7 }
            throw r0     // Catch:{ all -> 0x03a7 }
        L_0x03a7:
            r0 = move-exception
            r37.cleanup()     // Catch:{ RKo -> 0x03ac }
            throw r0     // Catch:{ RKo -> 0x03ac }
        L_0x03ac:
            r3 = move-exception
            X.TjF r2 = r11.A0G
            java.lang.Integer r1 = r11.A0I
            r0 = 0
            r3.A00 = r2
            r3.A03 = r1
            r3.A01 = r0
            java.util.List r0 = r11.A0S
            r0.add(r3)
        L_0x03bd:
            r11.A04()
        L_0x03c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TLE.A02():void");
    }

    private void A05() {
        Throwable th;
        this.A0R.A00();
        if (this.A0V) {
            List list = this.A0S;
            if (list.isEmpty()) {
                th = null;
            } else {
                th = (Throwable) list.get(DbT.A02(list, 1));
            }
            throw Pxe.A0j("Already notified", th);
        }
        this.A0V = true;
    }

    public static void A06(TLE tle) {
        C10525Rte rte = tle.A0O;
        synchronized (rte) {
            rte.A00 = false;
            rte.A02 = false;
            rte.A01 = false;
        }
        C10524Rtd rtd = tle.A0N;
        rtd.A00 = null;
        rtd.A01 = null;
        rtd.A02 = null;
        S77 s77 = tle.A0M;
        s77.A02 = null;
        s77.A0A = null;
        s77.A04 = null;
        s77.A08 = null;
        s77.A09 = null;
        s77.A05 = null;
        s77.A03 = null;
        s77.A0B = null;
        s77.A06 = null;
        s77.A0H.clear();
        s77.A0D = false;
        s77.A0G.clear();
        s77.A0C = false;
        tle.A0V = false;
        tle.A03 = null;
        tle.A06 = null;
        tle.A07 = null;
        tle.A04 = null;
        tle.A0A = null;
        tle.A09 = null;
        tle.A0C = null;
        tle.A0T = null;
        tle.A0K = null;
        tle.A05 = null;
        tle.A0J = null;
        tle.A0I = null;
        tle.A0H = null;
        tle.A0F = 0;
        tle.A0U = false;
        tle.A0D = null;
        tle.A0S.clear();
        tle.A0Q.ECR(tle);
    }

    private void A07(Integer num) {
        TO7 to7;
        this.A0B = num;
        C12005SkO skO = this.A09;
        if (skO.A0C) {
            to7 = skO.A0L;
        } else if (skO.A0B) {
            to7 = skO.A0I;
        } else {
            to7 = skO.A0K;
        }
        to7.execute(this);
    }

    public final S0B CDi() {
        return this.A0R;
    }

    public final void D7m(C13892TjF tjF, C13892TjF tjF2, C13812Thf thf, Integer num, Object obj) {
        this.A05 = tjF;
        this.A0J = obj;
        this.A0H = thf;
        this.A0I = num;
        this.A0G = tjF2;
        boolean z = false;
        if (tjF != this.A0M.A02().get(0)) {
            z = true;
        }
        this.A0L = z;
        if (Thread.currentThread() != this.A0K) {
            A07(AnonymousClass05K.A0C);
        } else {
            A02();
        }
    }

    public final void EHo() {
        A07(AnonymousClass05K.A01);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        TLE tle = (TLE) obj;
        int ordinal = this.A04.ordinal() - tle.A04.ordinal();
        if (ordinal == 0) {
            return this.A01 - tle.A01;
        }
        return ordinal;
    }

    public final void run() {
        C13812Thf thf = this.A0H;
        try {
            if (this.A0U) {
                A03();
            } else {
                int intValue = this.A0B.intValue();
                if (intValue == 0) {
                    this.A0C = A01(this, AnonymousClass05K.A00);
                    this.A0T = A00();
                } else if (intValue != 1) {
                    if (intValue == 2) {
                        A02();
                    } else {
                        throw DbW.A0c("Unrecognized run reason: ", "INITIALIZE");
                    }
                }
                A04();
            }
            if (thf != null) {
                thf.cleanup();
            }
        } catch (TQ4 e) {
            throw e;
        } catch (Throwable th) {
            if (thf != null) {
                thf.cleanup();
            }
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.S0B, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.Rtd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Rte, java.lang.Object] */
    public TLE(02U r2, S10 s10) {
        this.A0P = s10;
        this.A0Q = r2;
    }

    public static Integer A01(TLE tle, Integer num) {
        boolean z;
        boolean z2;
        Integer num2;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (!(intValue == 3 || intValue == 5)) {
                    if (intValue == 0) {
                        if (tle.A08 instanceof QH3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        num2 = AnonymousClass05K.A01;
                    } else {
                        throw AnonymousClass7TF.A0W("Unrecognized stage: ", C9207RTk.A00(num));
                    }
                }
            } else if (!tle.A0E) {
                return AnonymousClass05K.A0N;
            }
            return AnonymousClass05K.A0j;
        }
        C10112Rmo rmo = tle.A08;
        if ((rmo instanceof QH3) || (rmo instanceof QH2)) {
            z = true;
        } else {
            z = false;
        }
        num2 = AnonymousClass05K.A0C;
        if (!z2) {
            return A01(tle, num2);
        }
        return num2;
    }

    private void A03() {
        boolean A1P;
        IllegalStateException illegalStateException;
        A05();
        C8995RKo rKo = new C8995RKo("Failed to load resource", AnonymousClass7TE.A1D(this.A0S));
        C12005SkO skO = this.A09;
        synchronized (skO) {
            skO.A03 = rKo;
        }
        synchronized (skO) {
            skO.A0M.A00();
            if (skO.A0O) {
                C12005SkO.A00(skO);
            } else {
                List list = skO.A0H.A00;
                if (list.isEmpty()) {
                    illegalStateException = AnonymousClass7TE.A0z("Received an exception without any callbacks to notify");
                } else if (!skO.A06) {
                    skO.A06 = true;
                    C13892TjF tjF = skO.A00;
                    ArrayList A1D = AnonymousClass7TE.A1D(list);
                    skO.A02(A1D.size() + 1);
                    skO.A0E.A01(tjF, skO, (C11909Sii) null);
                    Iterator it = A1D.iterator();
                    while (it.hasNext()) {
                        S48 s48 = (S48) it.next();
                        s48.A01.execute(new TFH(skO, s48.A00));
                    }
                    skO.A01();
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Already failed once");
                }
                throw illegalStateException;
            }
        }
        C10525Rte rte = this.A0O;
        synchronized (rte) {
            rte.A01 = true;
            A1P = AnonymousClass7TF.A1P(rte.A02 ? 1 : 0);
        }
        if (A1P) {
            A06(this);
        }
    }

    private void A04() {
        this.A0K = Thread.currentThread();
        this.A0F = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.A0U && this.A0T != null && !(z = this.A0T.ExI())) {
            this.A0C = A01(this, this.A0C);
            this.A0T = A00();
            if (this.A0C == AnonymousClass05K.A0N) {
                A07(AnonymousClass05K.A01);
                return;
            }
        }
        if ((this.A0C == AnonymousClass05K.A0j || this.A0U) && !z) {
            A03();
        }
    }

    public final void D7l(C13892TjF tjF, C13812Thf thf, Exception exc, Integer num) {
        thf.cleanup();
        C8995RKo rKo = new C8995RKo("Fetching data failed", Collections.singletonList(exc));
        Class AvH = thf.AvH();
        rKo.A00 = tjF;
        rKo.A03 = num;
        rKo.A01 = AvH;
        this.A0S.add(rKo);
        if (Thread.currentThread() != this.A0K) {
            A07(AnonymousClass05K.A01);
        } else {
            A04();
        }
    }
}
