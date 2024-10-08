package X;

import android.os.Handler;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.S3c  reason: case insensitive filesystem */
public class C10970S3c {
    public Handler A00;
    public C2596542n A01;
    public C13893TjG A02;
    public AnonymousClass3RV A03;
    public RealtimeSinceBootClock A04;
    public AnonymousClass458 A05;
    public AnonymousClass3RA A06;
    public AnonymousClass3RB A07;
    public C10936S1p A08;
    public SHM A09;
    public S3C A0A;
    public SRZ A0B;
    public C11267SIe A0C;
    public ST2 A0D;
    public AnonymousClass452 A0E;
    public C13986Tnc A0F;
    public C13262TSd A0G;
    public C10228Roo A0H;
    public SJJ A0I;
    public C11248SHi A0J;
    public C12251Sq5 A0K;
    public SSX A0L;
    public C11269SIg A0M;
    public AnonymousClass45K A0N;
    public ST9 A0O;
    public C10816Ryc A0P;
    public SIa A0Q;
    public AnonymousClass4CQ A0R;
    public AnonymousClass459 A0S;
    public C13843TiJ A0T;
    public C11262SHw A0U;
    public AtomicInteger A0V;
    public boolean A0W = false;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: X.Sq2} */
    /* JADX WARNING: type inference failed for: r7v6, types: [X.4CQ, X.45A] */
    /* JADX WARNING: type inference failed for: r4v47, types: [java.lang.Object, X.Rcz] */
    /* JADX WARNING: type inference failed for: r24v5, types: [X.Td1] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0036, code lost:
        if (r4 != false) goto L_0x0038;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.T9D r37, X.C10861RzM r38, java.util.List r39) {
        /*
            r36 = this;
            r2 = r38
            android.content.Context r1 = r2.A00
            android.content.Context r3 = r1.getApplicationContext()
            X.S1p r0 = new X.S1p
            r0.<init>(r3)
            r3 = r36
            r3.A08 = r0
            java.lang.Integer r6 = r2.A0N
            java.lang.String r0 = X.C9560Rcx.A00(r6)
            X.3RB r4 = X.AnonymousClass3RB.A02
            r3.A07 = r4
            X.3RA r4 = X.AnonymousClass3RA.A00(r1)
            r3.A06 = r4
            java.lang.String r4 = r1.getPackageName()
            boolean r32 = X.C241833Rj.A02(r4)
            X.3RA r4 = r3.A06
            boolean r4 = r4.A02
            r4 = r4 ^ 1
            X.3RV r5 = r2.A06
            r3.A03 = r5
            if (r32 == 0) goto L_0x0038
            r7 = 1
            if (r4 == 0) goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            X.SIe r4 = new X.SIe
            r4.<init>(r1, r5, r0, r7)
            r3.A0C = r4
            X.458 r4 = X.AnonymousClass458.A00
            r3.A05 = r4
            com.facebook.rti.common.time.RealtimeSinceBootClock r4 = com.facebook.rti.common.time.RealtimeSinceBootClock.INSTANCE
            r3.A04 = r4
            X.3RA r9 = r3.A06
            X.TiJ r4 = r2.A0H
            r35 = r4
            java.lang.String r8 = r35.getAppName()
            java.util.Map r7 = r2.A0Q
            X.SHM r4 = new X.SHM
            r4.<init>(r1, r9, r8, r7)
            r3.A09 = r4
            X.S1p r8 = r3.A08
            android.os.Handler r11 = r2.A01
            com.facebook.rti.common.time.RealtimeSinceBootClock r7 = r3.A04
            X.SHi r4 = new X.SHi
            r4.<init>(r1, r11, r7, r8)
            r3.A0J = r4
            X.SBV r18 = X.SBV.A00
            java.util.concurrent.ExecutorService r30 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r4 = 2
            java.util.concurrent.Executors.newFixedThreadPool(r4)
            java.util.concurrent.ScheduledExecutorService r31 = java.util.concurrent.Executors.newScheduledThreadPool(r4)
            r3.A00 = r11
            X.TSc r4 = new X.TSc
            r4.<init>(r11)
            r3.A0F = r4
            X.S1p r12 = r3.A08
            com.facebook.rti.common.time.RealtimeSinceBootClock r9 = r3.A04
            android.os.Handler r8 = r3.A00
            X.3RB r7 = r3.A07
            X.TSd r4 = new X.TSd
            r20 = r1
            r21 = r8
            r22 = r9
            r23 = r7
            r24 = r12
            r25 = r0
            r19 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r3.A0G = r4
            X.S1p r9 = r3.A08
            android.content.Context r20 = r1.getApplicationContext()
            com.facebook.rti.common.time.RealtimeSinceBootClock r8 = r3.A04
            android.content.Context r4 = r1.getApplicationContext()
            X.SN9 r7 = new X.SN9
            r7.<init>(r4)
            r17 = 0
            X.SJJ r4 = new X.SJJ
            r19 = r4
            r21 = r11
            r22 = r7
            r23 = r8
            r24 = r9
            r19.<init>(r20, r21, r22, r23, r24)
            r3.A0I = r4
            X.Roo r4 = new X.Roo
            r4.<init>(r1)
            r3.A0H = r4
            r4 = r35
            r3.A0T = r4
            X.452 r8 = r2.A0C
            r3.A0E = r8
            X.458 r7 = r3.A05
            X.459 r4 = new X.459
            r12 = r1
            r13 = r5
            r14 = r7
            r15 = r8
            r16 = r6
            r11 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r3.A0S = r4
            X.45K r4 = new X.45K
            r4.<init>(r1)
            r3.A0N = r4
            X.452 r4 = r3.A0E
            X.4CQ r7 = new X.4CQ
            r7.<init>(r1, r5, r4, r6)
            java.lang.String r4 = "mqtt_last_host"
            X.45J r6 = X.Pxf.A0N(r1, r5, r4)
            java.lang.String r4 = "work_last_host"
            java.lang.String r5 = ""
            java.lang.String r4 = r6.getString(r4, r5)
            r7.A06 = r4
            java.lang.String r4 = "work_last_analytics_endpoint"
            java.lang.String r4 = r6.getString(r4, r5)
            r7.A05 = r4
            r3.A0R = r7
            X.452 r5 = r3.A0E
            X.459 r4 = r3.A0S
            r5.A03(r4)
            X.452 r5 = r3.A0E
            X.45K r4 = r3.A0N
            r5.A03(r4)
            X.452 r4 = r3.A0E
            r4.A01()
            X.452 r4 = r3.A0E
            r3.A0E = r4
            X.42n r9 = r2.A02
            r3.A01 = r9
            X.TjG r8 = r2.A05
            r3.A02 = r8
            X.SJJ r7 = r3.A0I
            X.Roo r6 = r3.A0H
            X.458 r5 = r3.A05
            X.SRZ r4 = new X.SRZ
            r19 = r4
            r20 = r1
            r21 = r9
            r22 = r8
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r3.A0B = r4
            X.S1p r13 = r3.A08
            X.SJJ r12 = r3.A0I
            X.SHi r11 = r3.A0J
            com.facebook.rti.common.time.RealtimeSinceBootClock r9 = r3.A04
            X.458 r8 = r3.A05
            X.Td0 r7 = r2.A09
            X.3RQ r4 = r2.A04
            r34 = r4
            boolean r6 = r4.A00
            X.3RV r5 = r3.A03
            X.ST2 r4 = new X.ST2
            r21 = r5
            r22 = r9
            r23 = r8
            r24 = r7
            r25 = r13
            r26 = r12
            r27 = r11
            r28 = r0
            r29 = r6
            r19 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3.A0D = r4
            X.RxM r9 = r2.A0I
            X.SJJ r8 = r3.A0I
            X.458 r5 = r3.A05
            X.SRZ r6 = r3.A0B
            X.ThS r4 = r2.A0D
            r33 = r4
            java.lang.String r4 = r33.Anh()
            r9.A00 = r5
            r9.A01 = r6
            r9.A02 = r8
            r9.A03 = r4
            com.facebook.rti.common.time.RealtimeSinceBootClock r8 = r3.A04
            X.Td0 r4 = r2.A08
            java.lang.Object r4 = r4.get()
            boolean r16 = X.AnonymousClass7TE.A1a(r4)
            X.3RV r5 = r3.A03
            X.S3C r4 = new X.S3C
            r12 = r1
            r13 = r5
            r14 = r8
            r15 = r6
            r11 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r3.A0A = r4
            X.452 r4 = r3.A0E
            X.453 r4 = r4.A00()
            int r5 = r4.A08
            java.util.concurrent.atomic.AtomicInteger r4 = new java.util.concurrent.atomic.AtomicInteger
            r4.<init>(r5)
            r3.A0V = r4
            java.lang.Object r4 = X.AnonymousClass3RD.A00
            X.3RX r4 = (X.AnonymousClass3RX) r4
            X.3RT r5 = r4.A01
            java.lang.Object r4 = r5.A00
            if (r4 == 0) goto L_0x045b
            r5.A00()
            X.RwF r8 = new X.RwF
            r8.<init>()
            java.net.Proxy r4 = r2.A0P
            r8.A00 = r4
            X.3RV r5 = r3.A03
            java.lang.String r4 = "address"
            X.45J r6 = X.Pxf.A0N(r1, r5, r4)
            X.Rcz r4 = new X.Rcz
            r4.<init>()
            X.Qc1 r5 = new X.Qc1
            r5.<init>(r6, r4, r10)
            X.Ryc r4 = new X.Ryc
            r24 = r1
            r25 = r18
            r26 = r8
            r27 = r3
            r28 = r2
            r29 = r5
            r23 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r3.A0P = r4
            X.452 r4 = r3.A0E
            X.453 r4 = r4.A00()
            int r8 = r4.A0C
            X.452 r4 = r3.A0E
            X.453 r4 = r4.A00()
            int r4 = r4.A0B
            if (r8 <= 0) goto L_0x0374
            if (r4 <= 0) goto L_0x0374
            com.facebook.rti.common.time.RealtimeSinceBootClock r6 = r3.A04
            long r4 = (long) r4
            X.Sq2 r12 = new X.Sq2
            r12.<init>(r6, r8, r4)
        L_0x0213:
            com.facebook.rti.common.time.RealtimeSinceBootClock r11 = r3.A04
            if (r7 != 0) goto L_0x021d
            r4 = 1
            X.Spy r7 = new X.Spy
            r7.<init>(r3, r4)
        L_0x021d:
            X.Tnc r10 = r3.A0F
            X.TSd r9 = r3.A0G
            android.os.Handler r8 = r3.A00
            X.452 r6 = r3.A0E
            X.TjG r5 = r3.A02
            X.SHw r4 = new X.SHw
            r19 = r4
            r20 = r8
            r21 = r5
            r22 = r11
            r23 = r7
            r24 = r12
            r25 = r6
            r26 = r10
            r27 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r3.A0U = r4
            X.Tnc r8 = r3.A0F
            X.TSd r9 = r3.A0G
            X.SRZ r6 = r3.A0B
            X.ST2 r7 = r3.A0D
            com.facebook.rti.common.time.RealtimeSinceBootClock r5 = r3.A04
            X.SIa r4 = new X.SIa
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A0Q = r4
            X.S1p r12 = r3.A08
            java.util.concurrent.atomic.AtomicInteger r11 = r3.A0V
            X.452 r4 = r3.A0E
            X.453 r4 = r4.A00()
            int r4 = r4.A0H
            int r4 = r4 * 1000
            long r5 = (long) r4
            com.facebook.rti.common.time.RealtimeSinceBootClock r10 = r3.A04
            android.os.Handler r9 = r3.A00
            X.3RB r8 = r3.A07
            X.SRZ r7 = r3.A0B
            X.SSX r4 = new X.SSX
            r19 = r4
            r20 = r1
            r21 = r9
            r22 = r10
            r23 = r8
            r24 = r12
            r25 = r7
            r26 = r0
            r27 = r11
            r28 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3.A0L = r4
            X.Sq5 r4 = new X.Sq5
            r4.<init>()
            r3.A0K = r4
            java.util.Set r6 = r4.A00
            X.SJJ r5 = r3.A0I
            X.Sq6 r4 = new X.Sq6
            r4.<init>(r5)
            r6.add(r4)
            X.S1p r8 = r3.A08
            com.facebook.rti.common.time.RealtimeSinceBootClock r7 = r3.A04
            android.os.Handler r6 = r3.A00
            X.Td3 r4 = r2.A0E
            r28 = r4
            X.3RB r5 = r3.A07
            X.SIg r4 = new X.SIg
            r9 = r4
            r10 = r1
            r11 = r6
            r12 = r7
            r13 = r5
            r14 = r8
            r15 = r28
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r3.A0M = r4
            X.ST9 r4 = r2.A0G
            r3.A0O = r4
            X.S1p r0 = r3.A08
            r15 = r0
            X.TiD r0 = r2.A0F
            r27 = r0
            X.Rd1 r0 = r2.A0J
            r26 = r0
            java.lang.String r16 = r1.getPackageName()
            X.Ryc r0 = r3.A0P
            r25 = r0
            X.SHw r12 = r3.A0U
            X.SIa r0 = r3.A0Q
            r24 = r0
            X.SSX r0 = r3.A0L
            r23 = r0
            X.SIg r13 = r3.A0M
            java.util.concurrent.atomic.AtomicInteger r11 = r3.A0V
            X.SDb r10 = r2.A0M
            X.SRZ r0 = r3.A0B
            r22 = r0
            X.TjG r0 = r3.A02
            r21 = r0
            X.ST2 r0 = r3.A0D
            r20 = r0
            android.os.Handler r0 = r3.A00
            r19 = r0
            com.facebook.rti.common.time.RealtimeSinceBootClock r9 = r3.A04
            X.452 r8 = r3.A0E
            X.44q r14 = r2.A0L
            X.SJJ r0 = r3.A0I
            X.SHi r7 = r3.A0J
            X.459 r6 = r3.A0S
            X.4CQ r5 = r3.A0R
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newCachedThreadPool()
            X.TO6 r3 = new X.TO6
            r3.<init>(r2)
            X.RqX r2 = X.C10334RqX.A01
            if (r2 != 0) goto L_0x030c
            X.RqX r2 = new X.RqX
            r2.<init>()
            X.C10334RqX.A01 = r2
        L_0x030c:
            r4.A0B = r15
            r4.A04 = r1
            r1 = r27
            r4.A0M = r1
            r1 = r26
            r4.A0x = r1
            r1 = r16
            r4.A0Y = r1
            r1 = r25
            r4.A0N = r1
            r4.A0V = r12
            r1 = r35
            r4.A0R = r1
            r1 = r33
            r4.A0I = r1
            r1 = r24
            r4.A0O = r1
            r1 = r23
            r4.A0J = r1
            r4.A0L = r13
            r4.A0c = r11
            r4.A0W = r10
            if (r10 == 0) goto L_0x0348
            X.SqE r1 = new X.SqE
            r1.<init>(r4)
            r4.A0S = r1
            X.SqF r1 = new X.SqF
            r1.<init>(r4)
            r4.A0T = r1
        L_0x0348:
            r1 = r22
            r4.A0C = r1
            r1 = r21
            r4.A08 = r1
            r1 = r20
            r4.A0D = r1
            r1 = r19
            r4.A05 = r1
            r4.A09 = r9
            r4.A0E = r8
            r1 = r28
            r4.A0K = r1
            r4.A0U = r14
            r4.A0F = r0
            r0 = r18
            r4.A0A = r0
            r4.A0G = r7
            r4.A0Q = r6
            r4.A0P = r5
            r4.A0a = r3
            java.lang.Runnable r1 = r4.A0q
            monitor-enter(r12)
            goto L_0x037b
        L_0x0374:
            X.Sq1 r12 = new X.Sq1
            r12.<init>()
            goto L_0x0213
        L_0x037b:
            java.lang.Runnable r0 = r12.A08     // Catch:{ all -> 0x0458 }
            boolean r0 = X.DbW.A1a(r0)
            X.S9L.A01(r0)     // Catch:{ all -> 0x0458 }
            r12.A08 = r1     // Catch:{ all -> 0x0458 }
            monitor-exit(r12)
            X.SHw r3 = r4.A0V
            java.lang.Runnable r1 = r4.A0n
            monitor-enter(r3)
            java.lang.Runnable r0 = r3.A07     // Catch:{ all -> 0x0455 }
            boolean r0 = X.DbW.A1a(r0)
            X.S9L.A01(r0)     // Catch:{ all -> 0x0455 }
            r3.A07 = r1     // Catch:{ all -> 0x0455 }
            monitor-exit(r3)
            X.SSX r3 = r4.A0J
            java.lang.Runnable r1 = r4.A0o
            monitor-enter(r3)
            java.lang.Runnable r0 = r3.A0P     // Catch:{ all -> 0x0455 }
            if (r0 != 0) goto L_0x03d1
            r3.A0P = r1     // Catch:{ all -> 0x0455 }
            X.3RB r5 = r3.A0G     // Catch:{ all -> 0x0455 }
            android.content.Context r7 = r3.A0D     // Catch:{ all -> 0x0455 }
            android.content.BroadcastReceiver r6 = r3.A0B     // Catch:{ all -> 0x0455 }
            java.lang.String r0 = r3.A0J     // Catch:{ all -> 0x0455 }
            android.content.IntentFilter r8 = new android.content.IntentFilter     // Catch:{ all -> 0x0455 }
            r8.<init>(r0)     // Catch:{ all -> 0x0455 }
            android.os.Handler r9 = r3.A0E     // Catch:{ all -> 0x0455 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r17)     // Catch:{ all -> 0x0455 }
            r5.A07(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0455 }
            android.content.BroadcastReceiver r6 = r3.A0C     // Catch:{ all -> 0x0455 }
            java.lang.String r0 = r3.A0K     // Catch:{ all -> 0x0455 }
            android.content.IntentFilter r8 = new android.content.IntentFilter     // Catch:{ all -> 0x0455 }
            r8.<init>(r0)     // Catch:{ all -> 0x0455 }
            r5.A07(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0455 }
            android.content.BroadcastReceiver r6 = r3.A0A     // Catch:{ all -> 0x0455 }
            java.lang.String r0 = r3.A0I     // Catch:{ all -> 0x0455 }
            android.content.IntentFilter r8 = new android.content.IntentFilter     // Catch:{ all -> 0x0455 }
            r8.<init>(r0)     // Catch:{ all -> 0x0455 }
            r5.A07(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0455 }
        L_0x03d1:
            monitor-exit(r3)
            X.SIg r3 = r4.A0L
            java.lang.Runnable r1 = r4.A0p
            monitor-enter(r3)
            java.lang.Runnable r0 = r3.A0C     // Catch:{ all -> 0x0455 }
            if (r0 != 0) goto L_0x03dd
            r3.A0C = r1     // Catch:{ all -> 0x0455 }
        L_0x03dd:
            monitor-exit(r3)
            java.util.Iterator r5 = r39.iterator()
        L_0x03e2:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x03f6
            java.lang.Object r3 = r5.next()
            com.facebook.rti.mqtt.protocol.messages.SubscribeTopic r3 = (com.facebook.rti.mqtt.protocol.messages.SubscribeTopic) r3
            java.util.Map r1 = r4.A0Z
            java.lang.String r0 = r3.A01
            r1.put(r0, r3)
            goto L_0x03e2
        L_0x03f6:
            X.452 r0 = r4.A0E
            r0.A01()
            X.452 r0 = r4.A0E
            X.453 r0 = r0.A00()
            r4.A0v = r0
            r0 = r34
            r4.A07 = r0
            r0 = r37
            r4.A06 = r0
            r0 = r17
            r4.A0e = r0
            r4.A0f = r0
            X.453 r0 = r4.A0v
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x041a
            r0 = 1
            r4.A0d = r0
        L_0x041a:
            X.453 r0 = r4.A0v
            boolean r0 = r0.A0Y
            if (r0 == 0) goto L_0x043c
            java.lang.String r6 = r4.A0X
            java.lang.String r5 = "_"
            X.ThS r0 = r4.A0I
            X.42j r0 = r0.BK9()
            java.lang.Object r3 = r0.first
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x043f
            java.lang.String r0 = "????"
        L_0x0436:
            java.lang.String r0 = X.002.A0g(r6, r5, r0)
            r4.A0X = r0
        L_0x043c:
            r4.A0H = r2
            return
        L_0x043f:
            int r1 = r3.length()
            r0 = 4
            if (r1 > r0) goto L_0x044f
            int r0 = r3.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0436
        L_0x044f:
            int r1 = r1 - r0
            java.lang.String r0 = r3.substring(r1)
            goto L_0x0436
        L_0x0455:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0458:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x045b:
            java.lang.String r0 = "mSSLSocketFactoryAdapterBuilder not bound in Fbns Config Manager"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10970S3c.A00(X.T9D, X.RzM, java.util.List):void");
    }
}
