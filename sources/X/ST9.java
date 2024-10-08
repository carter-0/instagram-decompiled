package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

public final class ST9 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public Context A04;
    public Handler A05;
    public T9D A06;
    public AnonymousClass3RQ A07;
    public C13893TjG A08;
    public RealtimeSinceBootClock A09;
    public SBV A0A;
    public C10936S1p A0B;
    public SRZ A0C;
    public ST2 A0D;
    public AnonymousClass452 A0E;
    public SJJ A0F;
    public C11248SHi A0G;
    public C10334RqX A0H;
    public C13803ThS A0I;
    public SSX A0J;
    public C13578Td3 A0K;
    public C11269SIg A0L;
    public C13838TiD A0M;
    public C10816Ryc A0N;
    public SIa A0O;
    public AnonymousClass4CQ A0P;
    public AnonymousClass459 A0Q;
    public C13843TiJ A0R;
    public C13775Tgq A0S;
    public C13719Tfk A0T;
    public C2601944q A0U;
    public C11262SHw A0V;
    public C11165SDb A0W;
    public String A0X = "FbnsConnectionManager";
    public String A0Y;
    public Map A0Z = AnonymousClass7TE.A1E();
    public Executor A0a;
    public AtomicBoolean A0b = new AtomicBoolean(false);
    public AtomicInteger A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h = false;
    public long A0i;
    public BroadcastReceiver A0j;
    public BroadcastReceiver A0k;
    public Method A0l;
    public final Object A0m;
    public final Runnable A0n;
    public final Runnable A0o;
    public final Runnable A0p;
    public final Runnable A0q;
    public final AtomicLong A0r;
    public final C10230Roq A0s;
    public volatile long A0t;
    public volatile Pair A0u;
    public volatile AnonymousClass453 A0v;
    public volatile ST3 A0w;
    public volatile Rd1 A0x;
    public volatile long A0y;

    public final int A04(C13719Tfk tfk, Integer num, String str, byte[] bArr) {
        T9D A062 = A06((C13775Tgq) null, tfk, num, str, bArr, this.A0E.A00().A0L);
        if (A062 instanceof C7860Qbk) {
            return -1;
        }
        return ((C11026S6d) A062.A01()).A01;
    }

    public final Future A07(ST3 st3, C8947RGw rGw, Integer num) {
        synchronized (this) {
            if (this.A0w == st3) {
                this.A0w = null;
            }
        }
        boolean z = false;
        Future future = TOA.A01;
        if (st3 != null) {
            z = AnonymousClass7TF.A1W(st3.A0Y, AnonymousClass05K.A0N);
            st3.A0X = null;
            synchronized (st3) {
                C8889REg rEg = C8889REg.DISCONNECT;
                if (st3.A04()) {
                    future = st3.A0J.submit(new C13052TJi(st3, rEg, rGw, (Throwable) null));
                }
            }
            this.A01 = System.currentTimeMillis();
        }
        if (!z) {
            A01(C7860Qbk.A00, this, num);
            return future;
        }
        this.A0M.D5o(C7860Qbk.A00);
        return future;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        if (X.AnonymousClass7TE.A0P(X.Pxe.A0C(r1)) >= ((long) r3.A0E.A00().A0O)) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.T9D r17, X.ST9 r18, java.lang.Integer r19) {
        /*
            r4 = r17
            boolean r0 = r4 instanceof X.C7860Qbk
            if (r0 == 0) goto L_0x0046
            r9 = 0
        L_0x0007:
            r3 = r18
            X.SIa r6 = r3.A0O
            if (r9 == 0) goto L_0x002d
            java.lang.Object r0 = r4.A01()
            X.REt r0 = (X.C8901REt) r0
            java.lang.String r0 = r0.name()
        L_0x0017:
            java.lang.Integer r2 = X.S9M.A00(r0)
            java.lang.String r1 = X.S9M.A01(r2)
            r0 = 0
            X.3Rq r13 = new X.3Rq
            r13.<init>(r2, r1, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Map r1 = r6.A02
            monitor-enter(r1)
            goto L_0x004b
        L_0x002d:
            int r0 = r19.intValue()
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.String r0 = "PREEMPTIVE_RECONNECT_SUCCESS"
            goto L_0x0017
        L_0x0037:
            java.lang.String r0 = "STALED_CONNECTION"
            goto L_0x0017
        L_0x003a:
            java.lang.String r0 = "DISCONNECTED"
            goto L_0x0017
        L_0x003d:
            java.lang.String r0 = "BY_REQUEST"
            goto L_0x0017
        L_0x0040:
            java.lang.String r0 = "CONNECTION_LOST"
            goto L_0x0017
        L_0x0043:
            java.lang.String r0 = "CONNECT_FAILED"
            goto L_0x0017
        L_0x0046:
            r9 = 1
            r4.A01()
            goto L_0x0007
        L_0x004b:
            java.util.Collection r0 = r1.values()     // Catch:{ all -> 0x00e4 }
            r2.addAll(r0)     // Catch:{ all -> 0x00e4 }
            r1.clear()     // Catch:{ all -> 0x00e4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            r2.size()
            java.util.Iterator r5 = r2.iterator()
        L_0x005d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r2 = r5.next()
            X.S6d r2 = (X.C11026S6d) r2
            r2.A01(r13)
            int r15 = r2.A01
            X.ST3 r0 = r2.A03
            long r0 = r0.A0V
            X.SRZ r10 = r6.A00
            java.lang.String r11 = "abort"
            java.lang.String r12 = r2.A05
            r14 = 1
            r16 = r15
            r17 = r0
            r10.A05(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x005d
        L_0x0081:
            r13.getMessage()
            int r0 = r19.intValue()
            r8 = 0
            r7 = 1
            if (r0 == r8) goto L_0x00d4
            if (r0 != r7) goto L_0x00d9
            X.ST2 r1 = r3.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            r1.A0F = r0
            long r1 = r3.A02
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            long r0 = X.Pxe.A0C(r1)
            long r5 = X.AnonymousClass7TE.A0P(r0)
            X.452 r0 = r3.A0E
            X.453 r0 = r0.A00()
            int r0 = r0.A0O
            long r1 = (long) r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r2 = 1
            if (r0 < 0) goto L_0x00b3
        L_0x00b2:
            r2 = 0
        L_0x00b3:
            X.SJJ r0 = r3.A0F
            android.net.NetworkInfo r0 = r0.A01()
            if (r0 == 0) goto L_0x00be
            r0.isConnected()
        L_0x00be:
            X.SHw r1 = r3.A0V
            monitor-enter(r1)
            if (r2 == 0) goto L_0x00c6
            r1.A0A = r7     // Catch:{ all -> 0x00d0 }
            goto L_0x00d3
        L_0x00c6:
            r1.A0A = r8     // Catch:{ all -> 0x00d0 }
            monitor-exit(r1)
            X.SHw r1 = r3.A0V
            monitor-enter(r1)
            X.C11262SHw.A00(r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x00d3
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00d3:
            monitor-exit(r1)
        L_0x00d4:
            X.SHw r0 = r3.A0V
            r0.A01()
        L_0x00d9:
            if (r9 == 0) goto L_0x00de
            r4.A01()
        L_0x00de:
            X.TiD r0 = r3.A0M
            r0.D5o(r4)
            return
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ST9.A01(X.T9D, X.ST9, java.lang.Integer):void");
    }

    public static void A02(ST9 st9) {
        boolean z;
        C11165SDb sDb = st9.A0W;
        if (sDb != null) {
            FbnsServiceDelegate fbnsServiceDelegate = FbnsServiceDelegate.A0D;
            SFM sfm = sDb.A00.A0C;
            sfm.A01 = 0;
            int i = sfm.A00 + 1;
            sfm.A00 = i;
            if (i % 2 == 0) {
                AtomicInteger atomicInteger = sfm.A03;
                int i2 = atomicInteger.get() - 1;
                synchronized (sfm) {
                    if (i2 >= 0) {
                        if (i2 < SFM.A05.size()) {
                            atomicInteger.set(i2);
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    C11165SDb.A00(sDb);
                }
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0254 A[Catch:{ all -> 0x03c3 }, LOOP:1: B:43:0x024e->B:45:0x0254, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x026f A[Catch:{ all -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x027d A[Catch:{ all -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x02b4 A[Catch:{ all -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x02b9 A[Catch:{ all -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02ee A[Catch:{ all -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0304 A[Catch:{ all -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x033e A[Catch:{ all -> 0x03c3 }] */
    public static void A03(X.ST9 r47) {
        /*
            r1 = r47
            X.ST2 r2 = r1.A0D
            java.lang.Class<X.Qbm> r21 = X.C7862Qbm.class
            r0 = r21
            X.TaT r2 = r2.A05(r0)
            X.Sq3 r2 = (X.C12249Sq3) r2
            X.RJ1 r20 = X.RJ1.A05
            r0 = r20
            X.C12249Sq3.A00(r0, r2)
            java.util.concurrent.atomic.AtomicLong r0 = r1.A0r
            long r2 = android.os.SystemClock.elapsedRealtime()
            r0.set(r2)
            X.452 r0 = r1.A0E
            X.453 r0 = r0.A00()
            int r2 = r0.A0I
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.setPriority(r2)
            r1.A0C()
            java.util.Map r3 = r1.A0Z
            monitor-enter(r3)
            java.util.ArrayList r2 = X.Dba.A0e(r3)     // Catch:{ all -> 0x03cf }
            X.44q r0 = r1.A0U     // Catch:{ all -> 0x03cf }
            java.util.List r32 = r0.getConnectSubscribeTopics(r2)     // Catch:{ all -> 0x03cf }
            monitor-exit(r3)     // Catch:{ all -> 0x03cf }
            X.Ryc r5 = r1.A0N
            X.S3c r4 = r5.A03
            X.452 r0 = r4.A0E
            X.453 r0 = r0.A00()
            X.RzM r3 = r5.A04
            X.TiJ r6 = r3.A0H
            java.lang.String r29 = r6.Aws()
            java.lang.String r7 = r6.Awv()
            boolean r2 = r5.A08
            if (r2 != 0) goto L_0x006e
            boolean r2 = android.text.TextUtils.isEmpty(r29)
            if (r2 != 0) goto L_0x0064
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 == 0) goto L_0x006e
        L_0x0064:
            X.ThS r2 = r3.A0D
            r2.clear()
            X.Q8K r2 = X.Q8K.A01
            r6.FJT(r2)
        L_0x006e:
            java.lang.String r2 = r0.A0T
            r27 = r2
            java.lang.String r2 = r0.A0U
            r24 = r2
            int r2 = r0.A0N
            r23 = r2
            int r2 = r0.A09
            r17 = r2
            boolean r15 = r0.A0X
            X.ThS r2 = r3.A0D
            r47 = r2
            X.42j r25 = r47.BK9()
            java.lang.String r30 = r6.Awv()
            java.lang.String r31 = r6.Ac5()
            X.SHM r14 = r4.A09
            java.util.concurrent.atomic.AtomicInteger r13 = r4.A0V
            int r12 = r0.A0K
            int r11 = r0.A0P
            int r10 = r0.A0D
            boolean r2 = r0.A0W
            boolean r41 = X.AnonymousClass7TF.A1P(r2)
            int r9 = r0.A0G
            int r8 = r0.A0J
            X.Td0 r7 = r3.A0A
            X.Td0 r2 = r3.A07
            java.lang.Object r2 = r2.get()
            boolean r45 = X.AnonymousClass7TE.A1a(r2)
            X.Td0 r2 = r3.A09
            r19 = r2
            if (r2 == 0) goto L_0x0180
            java.lang.Object r2 = r19.get()
            boolean r46 = X.AnonymousClass7TE.A1a(r2)
        L_0x00be:
            r18 = 0
            java.util.Map r6 = r3.A0Q
            r16 = 0
            X.TiJ r2 = r4.A0T
            java.util.Map r0 = r0.A01
            X.RzK r22 = new X.RzK
            r28 = r24
            r33 = r6
            r34 = r0
            r35 = r13
            r36 = r23
            r37 = r17
            r38 = r12
            r39 = r11
            r40 = r10
            r42 = r9
            r43 = r8
            r44 = r15
            r23 = r7
            r24 = r14
            r26 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            X.RxM r13 = r3.A0I
            X.RwF r14 = r5.A02
            com.facebook.rti.common.time.RealtimeSinceBootClock r12 = r4.A04
            java.util.concurrent.ScheduledExecutorService r11 = r5.A07
            X.S1q r10 = r5.A05
            X.44q r9 = r3.A0L
            android.content.Context r8 = r5.A00
            X.ST9 r0 = r4.A0O
            boolean r7 = r0.A0g
            X.SRZ r6 = r13.A01
            X.458 r2 = r13.A00
            java.lang.String r0 = r13.A03
            X.SRA r36 = new X.SRA
            r23 = r36
            r25 = r12
            r26 = r2
            r27 = r6
            r28 = r14
            r29 = r10
            r30 = r22
            r31 = r9
            r32 = r0
            r33 = r11
            r34 = r7
            r24 = r8
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.ST2 r2 = r4.A0D
            java.lang.String r0 = r13.A04
            r2.A0G = r0
            X.SJJ r15 = r4.A0I
            X.SBV r14 = r5.A01
            X.SRZ r11 = r4.A0B
            X.ST2 r10 = r4.A0D
            com.facebook.rti.common.time.RealtimeSinceBootClock r9 = r4.A04
            java.util.concurrent.ExecutorService r12 = r5.A06
            X.SIe r8 = r4.A0C
            X.Rcr r7 = r3.A03
            X.Rd1 r6 = r3.A0J
            X.Rd2 r5 = r3.A0K
            X.S3C r13 = r4.A0A
            X.Td0 r4 = r3.A0B
            X.3RQ r2 = r3.A04
            java.lang.Long r3 = r3.A0O
            r17 = 0
            X.ST3 r0 = new X.ST3
            r23 = r0
            r24 = r7
            r25 = r2
            r26 = r9
            r27 = r4
            r28 = r19
            r29 = r14
            r30 = r13
            r31 = r11
            r32 = r8
            r33 = r10
            r34 = r15
            r35 = r47
            r37 = r6
            r38 = r22
            r39 = r5
            r40 = r3
            r41 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.Rrs r2 = new X.Rrs
            r2.<init>(r1, r0)
            r0.A0X = r2
            java.util.List r15 = java.util.Collections.emptyList()
            boolean r11 = r1.A0h
            r2 = r11 ^ 1
            r1.A0h = r2
            monitor-enter(r0)
            goto L_0x0184
        L_0x0180:
            r46 = 0
            goto L_0x00be
        L_0x0184:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03cc }
            r0.A0R = r2     // Catch:{ all -> 0x03cc }
            r0.A0P = r2     // Catch:{ all -> 0x03cc }
            r15.getClass()     // Catch:{ all -> 0x03cc }
            r0.A01 = r15     // Catch:{ all -> 0x03cc }
            X.RzK r2 = r0.A0G     // Catch:{ all -> 0x03cc }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.A0K     // Catch:{ all -> 0x03cc }
            int r19 = r3.get()     // Catch:{ all -> 0x03cc }
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x03cc }
            java.util.Map r6 = r0.A0I     // Catch:{ all -> 0x03cc }
            monitor-enter(r6)     // Catch:{ all -> 0x03cc }
            java.util.List r3 = r2.A0H     // Catch:{ all -> 0x03c6 }
            java.util.Iterator r5 = r3.iterator()     // Catch:{ all -> 0x03c6 }
        L_0x01a6:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x03c6 }
            if (r3 == 0) goto L_0x01bb
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x03c6 }
            com.facebook.rti.mqtt.protocol.messages.SubscribeTopic r4 = (com.facebook.rti.mqtt.protocol.messages.SubscribeTopic) r4     // Catch:{ all -> 0x03c6 }
            java.lang.String r3 = r4.A01     // Catch:{ all -> 0x03c6 }
            r14.add(r3)     // Catch:{ all -> 0x03c6 }
            r6.put(r3, r4)     // Catch:{ all -> 0x03c6 }
            goto L_0x01a6
        L_0x01bb:
            monitor-exit(r6)     // Catch:{ all -> 0x03c6 }
            boolean r9 = r0.A0L     // Catch:{ all -> 0x03cc }
            r5 = 0
            if (r9 == 0) goto L_0x01f7
            X.SHM r3 = r2.A0B     // Catch:{ all -> 0x03cc }
            java.lang.String r7 = "["
            java.lang.String r8 = "FBAN"
            java.lang.String r6 = r3.A02     // Catch:{ all -> 0x03cc }
            java.lang.String r4 = "FBAV"
            X.3RA r3 = r3.A01     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = r3.A01     // Catch:{ all -> 0x03cc }
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r6, r4, r3}     // Catch:{ all -> 0x03cc }
            java.lang.String r4 = "%s/%s;%s/%s;"
            java.lang.String r4 = java.lang.String.format(r5, r4, r6)     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = "]"
            java.lang.String r34 = X.002.A0g(r7, r4, r3)     // Catch:{ all -> 0x03cc }
            r10 = r5
        L_0x01e0:
            X.Td0 r3 = r0.A06     // Catch:{ all -> 0x03cc }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x0204
            java.lang.String r13 = r3.trim()     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = ""
            boolean r3 = r13.equals(r3)     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x0205
            goto L_0x0204
        L_0x01f7:
            X.SHM r3 = r2.A0B     // Catch:{ all -> 0x03cc }
            java.lang.String r34 = r3.A01()     // Catch:{ all -> 0x03cc }
            X.Q8K r3 = r2.A0D     // Catch:{ all -> 0x03cc }
            java.lang.Object r10 = r3.first     // Catch:{ all -> 0x03cc }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x03cc }
            goto L_0x01e0
        L_0x0204:
            r13 = r5
        L_0x0205:
            X.SJJ r6 = r0.A0C     // Catch:{ all -> 0x03cc }
            android.net.NetworkInfo r3 = r6.A02()     // Catch:{ all -> 0x03cc }
            r0.A0W = r3     // Catch:{ all -> 0x03cc }
            X.S2M r3 = r6.A03()     // Catch:{ all -> 0x03cc }
            java.lang.Integer r3 = r3.A02     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = X.C9557Rcu.A00(r3)     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ all -> 0x03cc }
            r0.A0a = r3     // Catch:{ all -> 0x03cc }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03cc }
            r0.A0V = r3     // Catch:{ all -> 0x03cc }
            X.Ikc r4 = new X.Ikc     // Catch:{ all -> 0x03cc }
            r3 = r18
            r4.<init>(r3)     // Catch:{ all -> 0x03cc }
            r0.A0b = r4     // Catch:{ all -> 0x03cc }
            java.lang.Long r29 = X.C51971G9r.A0m()     // Catch:{ all -> 0x03cc }
            X.42j r3 = r2.A0C     // Catch:{ NumberFormatException -> 0x0242 }
            java.lang.Object r3 = r3.first     // Catch:{ NumberFormatException -> 0x0242 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NumberFormatException -> 0x0242 }
            r0.A0Z = r3     // Catch:{ NumberFormatException -> 0x0242 }
            java.lang.String r3 = r0.A0Z     // Catch:{ NumberFormatException -> 0x0242 }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0242 }
            java.lang.Long r29 = java.lang.Long.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0242 }
        L_0x0242:
            X.S2M r12 = r6.A03()     // Catch:{ all -> 0x03cc }
            java.util.EnumSet r3 = X.ST3.A0c     // Catch:{ all -> 0x03cc }
            java.util.Iterator r8 = r3.iterator()     // Catch:{ all -> 0x03cc }
            r6 = 0
        L_0x024e:
            boolean r3 = r8.hasNext()     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x0261
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x03cc }
            X.RFb r3 = (X.C8908RFb) r3     // Catch:{ all -> 0x03cc }
            byte r4 = r3.A00     // Catch:{ all -> 0x03cc }
            r3 = 1
            int r3 = r3 << r4
            long r3 = (long) r3     // Catch:{ all -> 0x03cc }
            long r6 = r6 | r3
            goto L_0x024e
        L_0x0261:
            java.lang.Long r30 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x03cc }
            long r3 = r0.A0V     // Catch:{ all -> 0x03cc }
            java.lang.Long r31 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x03cc }
            android.net.NetworkInfo r3 = r0.A0W     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x02b4
            android.net.NetworkInfo r3 = r0.A0W     // Catch:{ all -> 0x03cc }
            int r3 = r3.getType()     // Catch:{ all -> 0x03cc }
            java.lang.Integer r27 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03cc }
        L_0x0279:
            android.net.NetworkInfo r3 = r0.A0W     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x0287
            android.net.NetworkInfo r3 = r0.A0W     // Catch:{ all -> 0x03cc }
            int r3 = r3.getSubtype()     // Catch:{ all -> 0x03cc }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03cc }
        L_0x0287:
            boolean r3 = r2.A0M     // Catch:{ all -> 0x03cc }
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x03cc }
            java.lang.Boolean r24 = X.AnonymousClass7TE.A0v()     // Catch:{ all -> 0x03cc }
            X.Q8K r3 = r2.A0D     // Catch:{ all -> 0x03cc }
            java.lang.Object r8 = r3.second     // Catch:{ all -> 0x03cc }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x03cc }
            boolean r4 = r2.A0L     // Catch:{ all -> 0x03cc }
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x03cc }
            X.Td0 r4 = r2.A0A     // Catch:{ all -> 0x03cc }
            java.lang.Object r6 = r4.get()     // Catch:{ all -> 0x03cc }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x03cc }
            int r4 = r2.A07     // Catch:{ all -> 0x03cc }
            r43 = r4
            X.ThS r4 = r0.A0D     // Catch:{ all -> 0x03cc }
            java.lang.String r37 = r4.Anh()     // Catch:{ all -> 0x03cc }
            java.lang.String r4 = r2.A0F     // Catch:{ all -> 0x03cc }
            r38 = r4
            goto L_0x02b7
        L_0x02b4:
            r27 = r5
            goto L_0x0279
        L_0x02b7:
            if (r9 == 0) goto L_0x02bd
            java.lang.String r4 = r2.A0G     // Catch:{ all -> 0x03cc }
            r17 = r4
        L_0x02bd:
            X.SRA r7 = r0.A0E     // Catch:{ all -> 0x03cc }
            r4 = 3
            java.lang.Byte r26 = java.lang.Byte.valueOf(r4)     // Catch:{ all -> 0x03cc }
            java.util.Map r4 = r2.A0I     // Catch:{ all -> 0x03cc }
            r42 = r4
            java.lang.Long r4 = r0.A0H     // Catch:{ all -> 0x03cc }
            r33 = r4
            java.lang.Integer r4 = r12.A02     // Catch:{ all -> 0x03cc }
            r4.intValue()     // Catch:{ all -> 0x03cc }
            X.SOV r22 = new X.SOV     // Catch:{ all -> 0x03cc }
            r28 = r16
            r32 = r6
            r35 = r10
            r36 = r8
            r39 = r17
            r40 = r13
            r41 = r14
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x03cc }
            java.lang.Object r4 = r3.first     // Catch:{ all -> 0x03cc }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x03cc }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x03cc }
            if (r4 == 0) goto L_0x033e
            java.lang.String r4 = X.AnonymousClass7TF.A0b()     // Catch:{ all -> 0x03cc }
        L_0x02f2:
            r6 = 20
            int r3 = r4.length()     // Catch:{ all -> 0x03cc }
            int r6 = java.lang.Math.min(r6, r3)     // Catch:{ all -> 0x03cc }
            r3 = r18
            java.lang.String r25 = r4.substring(r3, r6)     // Catch:{ all -> 0x03cc }
            if (r9 != 0) goto L_0x030a
            X.42j r3 = r2.A0C     // Catch:{ all -> 0x03cc }
            java.lang.Object r5 = r3.second     // Catch:{ all -> 0x03cc }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x03cc }
        L_0x030a:
            java.util.Map r3 = r2.A0J     // Catch:{ all -> 0x03cc }
            X.SHn r8 = new X.SHn     // Catch:{ all -> 0x03cc }
            r23 = r8
            r24 = r22
            r26 = r5
            r27 = r15
            r28 = r3
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = r2.A01     // Catch:{ all -> 0x03cc }
            r8.A00 = r3     // Catch:{ all -> 0x03cc }
            java.lang.Integer r3 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x03cc }
            r0.A0Y = r3     // Catch:{ all -> 0x03cc }
            X.ST2 r6 = r0.A0B     // Catch:{ all -> 0x03cc }
            X.RqX r5 = r6.A01     // Catch:{ all -> 0x03cc }
            r3 = r21
            X.TaT r4 = r6.A05(r3)     // Catch:{ all -> 0x03cc }
            X.Sq3 r4 = (X.C12249Sq3) r4     // Catch:{ all -> 0x03cc }
            r3 = r20
            java.lang.Object r3 = r4.A01(r3)     // Catch:{ all -> 0x03cc }
            java.util.concurrent.atomic.AtomicLong r3 = (java.util.concurrent.atomic.AtomicLong) r3     // Catch:{ all -> 0x03cc }
            r3.intValue()     // Catch:{ all -> 0x03cc }
            java.util.List r5 = r5.A00     // Catch:{ all -> 0x03cc }
            monitor-enter(r5)     // Catch:{ all -> 0x03cc }
            goto L_0x0343
        L_0x033e:
            java.lang.Object r4 = r3.first     // Catch:{ all -> 0x03cc }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x03cc }
            goto L_0x02f2
        L_0x0343:
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x03c9 }
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x03c9 }
            if (r3 == 0) goto L_0x0358
            r4.next()     // Catch:{ all -> 0x03c9 }
            java.lang.String r1 = "onMqttNetworkConnectionStart"
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r1)     // Catch:{ all -> 0x03c9 }
            throw r1     // Catch:{ all -> 0x03c9 }
        L_0x0358:
            monitor-exit(r5)     // Catch:{ all -> 0x03cc }
            X.S3D r12 = r6.A00     // Catch:{ all -> 0x03cc }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03cc }
            java.util.concurrent.atomic.AtomicLong r10 = r12.A03     // Catch:{ all -> 0x03cc }
            r3 = 0
            r10.compareAndSet(r3, r5)     // Catch:{ all -> 0x03cc }
            java.util.concurrent.atomic.AtomicLong r10 = r12.A00     // Catch:{ all -> 0x03cc }
            r10.compareAndSet(r3, r5)     // Catch:{ all -> 0x03cc }
            if (r11 == 0) goto L_0x036e
            goto L_0x0371
        L_0x036e:
            int r5 = r2.A06     // Catch:{ all -> 0x03cc }
            goto L_0x0373
        L_0x0371:
            int r5 = r2.A02     // Catch:{ all -> 0x03cc }
        L_0x0373:
            r0.A00 = r5     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = r2.A00     // Catch:{ all -> 0x03cc }
            boolean r2 = r2.A0N     // Catch:{ all -> 0x03cc }
            monitor-enter(r7)     // Catch:{ all -> 0x03cc }
            X.TKf r4 = new X.TKf     // Catch:{ all -> 0x03c3 }
            r15 = r7
            r16 = r8
            r17 = r3
            r18 = r5
            r20 = r9
            r21 = r2
            r14 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x03c3 }
            java.lang.String r2 = "MqttClient-Network-Thread"
            java.lang.Thread r3 = new java.lang.Thread     // Catch:{ all -> 0x03c3 }
            r3.<init>(r4, r2)     // Catch:{ all -> 0x03c3 }
            X.RzK r2 = r7.A0C     // Catch:{ all -> 0x03c3 }
            int r2 = r2.A09     // Catch:{ all -> 0x03c3 }
            r3.setPriority(r2)     // Catch:{ all -> 0x03c3 }
            r3.start()     // Catch:{ all -> 0x03c3 }
            monitor-exit(r7)     // Catch:{ all -> 0x03cc }
            monitor-exit(r0)
            monitor-enter(r1)
            X.ST3 r3 = r1.A0w     // Catch:{ all -> 0x03c0 }
            r1.A0w = r0     // Catch:{ all -> 0x03c0 }
            monitor-exit(r1)     // Catch:{ all -> 0x03c0 }
            if (r3 == 0) goto L_0x03b4
            java.lang.String r2 = r1.A0X
            java.lang.String r0 = "connecting new client without disconnecting old one"
            X.0KC.A0D(r2, r0)
            X.RGw r2 = X.C8947RGw.EXPIRE_CONNECTION
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1.A07(r3, r2, r0)
        L_0x03b4:
            long r2 = java.lang.System.currentTimeMillis()
            r1.A00 = r2
            X.TiD r0 = r1.A0M
            r0.D5i()
            return
        L_0x03c0:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03c0 }
            throw r0
        L_0x03c3:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x03cc }
            goto L_0x03cb
        L_0x03c6:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x03c6 }
            goto L_0x03cb
        L_0x03c9:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03cc }
        L_0x03cb:
            throw r1     // Catch:{ all -> 0x03cc }
        L_0x03cc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x03cf:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03cf }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ST9.A03(X.ST9):void");
    }

    public final Pair A05() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ST3 st3 = this.A0w;
        if (st3 == null) {
            return null;
        }
        Map map = this.A0Z;
        Map map2 = st3.A0I;
        synchronized (map2) {
            Iterator A0v2 = AnonymousClass7TF.A0v(map);
            arrayList = null;
            while (A0v2.hasNext()) {
                SubscribeTopic subscribeTopic = (SubscribeTopic) A0v2.next();
                String str = subscribeTopic.A01;
                if (!map2.containsKey(str)) {
                    map2.put(str, subscribeTopic);
                    if (arrayList == null) {
                        arrayList = AnonymousClass7TE.A1C();
                    }
                    arrayList.add(subscribeTopic);
                }
            }
            Iterator A0u2 = AnonymousClass7TF.A0u(map2);
            arrayList2 = null;
            while (A0u2.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u2);
                if (!map.containsKey(A1J.getKey())) {
                    if (arrayList2 == null) {
                        arrayList2 = AnonymousClass7TE.A1C();
                    }
                    arrayList2.add((SubscribeTopic) A1J.getValue());
                    A0u2.remove();
                }
            }
            S9L.A01(AnonymousClass7TF.A1S(map.size(), map2.size()));
        }
        if (arrayList == null && arrayList2 == null) {
            return null;
        }
        return Pxe.A0K(arrayList, arrayList2);
    }

    public final T9D A06(C13775Tgq tgq, C13719Tfk tfk, Integer num, String str, byte[] bArr, int i) {
        int i2;
        long j;
        int i3;
        C11026S6d s6d;
        long j2;
        int i4 = i;
        Integer num2 = num;
        switch (num2.intValue()) {
            case 0:
                i2 = 0;
                break;
            case 1:
                i2 = 1;
                break;
            default:
                i2 = 2;
                break;
        }
        S9L.A00(AnonymousClass7TF.A1T(i2, 2));
        ST3 st3 = this.A0w;
        String str2 = str;
        if (st3 == null) {
            j = 0;
        } else if (!st3.A04()) {
            j = st3.A0V;
        } else {
            SBU sbu = SBU.A00;
            try {
                int andIncrement = ST3.A0e.getAndIncrement() & 65535;
                Integer num3 = st3.A0Y;
                if (num3 == AnonymousClass05K.A00 || num3 == AnonymousClass05K.A01) {
                    long j3 = 0;
                    if (st3.A0V > 0) {
                        j2 = SystemClock.elapsedRealtime() - st3.A0V;
                    } else {
                        j2 = 0;
                    }
                    long j4 = ((long) this.A0E.A00().A0K) * 1000;
                    long j5 = j4 - j2;
                    if (j5 >= 0) {
                        if (j5 > j4) {
                            j3 = j4;
                        } else {
                            j3 = j5;
                        }
                    }
                    i3 = (int) (j3 / 1000);
                } else {
                    i3 = 0;
                }
                int i5 = i3 + i;
                if (i5 < Integer.MAX_VALUE) {
                    i4 = i5;
                }
                Integer num4 = AnonymousClass05K.A01;
                if (num2 == num4) {
                    C13775Tgq tgq2 = tgq;
                    if (tgq == null) {
                        s6d = this.A0O.A02(st3, RFZ.PUBACK, str2, andIncrement, i4);
                    } else {
                        s6d = this.A0O.A01(st3, tgq2, RFZ.PUBACK, str2, andIncrement, i4);
                    }
                } else {
                    s6d = new C11026S6d(st3, RFZ.PUBACK, str2, andIncrement, SystemClock.elapsedRealtime());
                    if (s6d.A07 != null) {
                        s6d.A07.onSuccess(s6d.A01);
                    }
                    if (s6d.A06 != null) {
                        s6d.A06.cancel(false);
                    }
                    this.A0C.A04(str2, 0, i2, andIncrement, s6d.A01, st3.A0V);
                }
                synchronized (st3) {
                    if (st3.A04()) {
                        ST3 st32 = st3;
                        st3.A0J.execute(new C13076TKg(sbu, st32, tfk, num2, str2, bArr, andIncrement));
                    } else {
                        Integer num5 = AnonymousClass05K.A15;
                        throw new C241873Rq(num5, S9M.A01(num5), (Throwable) null);
                    }
                }
                if (!"/mqtt_health_stats".equals(str2) && num2 == num4) {
                    A09();
                }
                return new C7861Qbl(s6d);
            } catch (C241873Rq e) {
                0KC.A0I(this.A0X, "exception/publish", e);
                A07(st3, C8947RGw.SEND_FAILURE, AnonymousClass05K.A01);
                throw e;
            }
        }
        String str3 = str2;
        this.A0C.A05("not_connected", str3, (Throwable) null, i2, 0, 0, j);
        return C7860Qbk.A00;
    }

    public final Future A08(C8947RGw rGw) {
        C11262SHw sHw = this.A0V;
        synchronized (sHw) {
            C11262SHw.A00(sHw);
        }
        return A07(this.A0w, rGw, AnonymousClass05K.A0C);
    }

    public final void A09() {
        this.A0L.A00();
        if (!this.A0d) {
            this.A0J.A05();
        } else {
            this.A0L.A01();
        }
    }

    public final void A0A() {
        Q63 q63 = new Q63(this, 11);
        this.A0k = q63;
        0DH.A01(q63, this.A04, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), this.A05);
        Q63 q632 = new Q63(this, 12);
        this.A0j = q632;
        0DH.A02(q632, this.A04, new IntentFilter("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED"), this.A05, (String) null, false);
        SJJ sjj = this.A0F;
        C10230Roq roq = this.A0s;
        synchronized (sjj) {
            sjj.A04.add(roq);
        }
        this.A0Q.A00();
    }

    public final void A0B() {
        this.A0J.A03();
        this.A0L.A00();
        this.A0J.A04();
        SJJ sjj = this.A0F;
        C10230Roq roq = this.A0s;
        synchronized (sjj) {
            sjj.A04.remove(roq);
        }
        BroadcastReceiver broadcastReceiver = this.A0k;
        if (broadcastReceiver != null) {
            try {
                this.A04.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                0KC.A0I(this.A0X, "Failed to unregister broadcast receiver", e);
            }
            this.A0k = null;
        }
        BroadcastReceiver broadcastReceiver2 = this.A0j;
        if (broadcastReceiver2 != null) {
            try {
                this.A04.unregisterReceiver(broadcastReceiver2);
            } catch (IllegalArgumentException e2) {
                0KC.A0I(this.A0X, "Failed to unregister broadcast receiver", e2);
            }
            this.A0j = null;
        }
        this.A0Q.A01();
        this.A0P.A01();
    }

    public final void A0C() {
        int Aek;
        boolean z = this.A0b.get();
        C13578Td3 td3 = this.A0K;
        if (z) {
            Aek = 60;
        } else {
            Aek = td3.Aek();
        }
        if (this.A0c.getAndSet(Aek) != Aek) {
            A09();
        }
    }

    public final void A0D(Integer num) {
        Integer num2;
        ST3 st3 = this.A0w;
        List list = this.A0H.A00;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("setMqttNetworkConnectionRetryInfo");
            }
        }
        if (AnonymousClass05K.A08.equals(num)) {
            num2 = AnonymousClass05K.A0C;
        } else if (!this.A0M.Ero()) {
            A08(C8947RGw.KICK_SHOULD_NOT_CONNECT);
            return;
        } else {
            if (st3 != null) {
                if (!st3.A04()) {
                    num2 = AnonymousClass05K.A0N;
                } else {
                    return;
                }
            }
            A03(this);
        }
        A07(st3, C8947RGw.EXPIRE_CONNECTION, num2);
        A03(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.SIg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.SSX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.SIg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.SIg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.SIg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.SIg} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(java.lang.Integer r6) {
        /*
            r5 = this;
            X.ST3 r2 = r5.A0w
            X.TiD r0 = r5.A0M
            boolean r0 = r0.Ero()
            if (r0 != 0) goto L_0x0010
            X.RGw r0 = X.C8947RGw.KICK_SHOULD_NOT_CONNECT
            r5.A08(r0)
        L_0x000f:
            return
        L_0x0010:
            boolean r0 = r5.A0d
            if (r0 != 0) goto L_0x0023
            X.SSX r1 = r5.A0J
            monitor-enter(r1)
            boolean r0 = r1.A03     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x001f
            r1.A05()     // Catch:{ all -> 0x00d8 }
            goto L_0x002d
        L_0x001f:
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00d8 }
            goto L_0x002d
        L_0x0023:
            X.SIg r1 = r5.A0L
            monitor-enter(r1)
            boolean r0 = r1.A00     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x002d
            r1.A01()     // Catch:{ all -> 0x00d8 }
        L_0x002d:
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0099
            java.lang.Integer r1 = r2.A0Y
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0099
            X.ThS r0 = r5.A0I
            X.42j r0 = r0.BK9()
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r2.A0Z
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0053
            X.RGw r0 = X.C8947RGw.AUTH_CREDENTIALS_CHANGE
            r5.A08(r0)
        L_0x004d:
            X.RqX r0 = r5.A0H
            java.util.List r2 = r0.A00
            monitor-enter(r2)
            goto L_0x00a4
        L_0x0053:
            long r3 = r5.A03
            long r1 = r5.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004d
            java.lang.Integer r0 = X.AnonymousClass05K.A08
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.ST2 r1 = r5.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r1.A0F = r0
            X.SHw r2 = r5.A0V
            monitor-enter(r2)
            java.lang.Runnable r0 = r2.A07     // Catch:{ all -> 0x00d5 }
            if (r0 != 0) goto L_0x0078
            java.lang.String r1 = "ConnectionRetryManager"
            java.lang.String r0 = "No force reconnect runnable set. Completing early from kickNow()"
            X.0KC.A0D(r1, r0)     // Catch:{ all -> 0x00d5 }
            goto L_0x0097
        L_0x0078:
            android.os.Handler r0 = r2.A0B     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x0090
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x00d5 }
            java.lang.Thread r1 = r0.getThread()     // Catch:{ all -> 0x00d5 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d5 }
            if (r1 != r0) goto L_0x0090
            java.lang.Runnable r0 = r2.A07     // Catch:{ all -> 0x00d5 }
            r0.run()     // Catch:{ all -> 0x00d5 }
            goto L_0x0097
        L_0x0090:
            java.util.concurrent.ExecutorService r1 = r2.A0D     // Catch:{ all -> 0x00d5 }
            java.lang.Runnable r0 = r2.A07     // Catch:{ all -> 0x00d5 }
            r1.submit(r0)     // Catch:{ all -> 0x00d5 }
        L_0x0097:
            monitor-exit(r2)
            goto L_0x004d
        L_0x0099:
            X.ST3 r0 = r5.A0w
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x004d
            return
        L_0x00a4:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x00d5 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00b9
            r1.next()     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "setMqttNetworkConnectionInfo"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00b9:
            monitor-exit(r2)
            r5.A0C()
            X.ST2 r0 = r5.A0D
            r0.A0F = r6
            X.SHw r1 = r5.A0V
            monitor-enter(r1)
            int r0 = r1.A00     // Catch:{ all -> 0x00d2 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x00d2 }
            X.C11262SHw.A00(r1)     // Catch:{ all -> 0x00d2 }
            r1.A01()     // Catch:{ all -> 0x00d2 }
            monitor-exit(r1)
            return
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ST9.A0E(java.lang.Integer):void");
    }

    public final void A0F(String str) {
        String str2;
        ST3 st3 = this.A0w;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (AnonymousClass7TE.A0P(elapsedRealtime - this.A0y) >= ((long) this.A0E.A00().A00)) {
                this.A0y = elapsedRealtime;
                SES.A02.A01 = str;
                AnonymousClass3RQ r2 = this.A07;
                this.A0F.A03();
                if (r2.A00) {
                    if (this.A0b.get()) {
                        C12249Sq3.A00(RJ2.ForegroundPing, (C12249Sq3) this.A0D.A05(C7865Qbp.class));
                    } else {
                        C12249Sq3.A00(RJ2.BackgroundPing, (C12249Sq3) this.A0D.A05(C7865Qbp.class));
                    }
                    if (st3 != null && st3.A0Y == AnonymousClass05K.A0C) {
                        long A0C2 = Pxe.A0C(st3.A0V);
                        ST2 st2 = this.A0D;
                        try {
                            str2 = C9559Rcw.A00((C10675RwE) null, (C7862Qbm) null, (C7866Qbq) null, ST2.A00(st2), (C7864Qbo) st2.A05(C7864Qbo.class), ST2.A01(st2, A0C2), (C7867Qbr) null, (C7868Qbs) null, false, true).toString();
                        } catch (JSONException unused) {
                            str2 = "";
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                Integer num = AnonymousClass05K.A01;
                                byte[] bytes = str2.getBytes(ReactWebViewManager.HTML_ENCODING);
                                T9D A062 = A06(this.A0S, this.A0T, num, "/mqtt_health_stats", bytes, this.A0E.A00().A0L);
                                if (!(A062 instanceof C7860Qbk)) {
                                    A062.A01();
                                }
                            } catch (UnsupportedEncodingException unused2) {
                                throw AnonymousClass7TE.A15("UTF-8 not supported");
                            } catch (C241873Rq unused3) {
                            }
                        }
                    }
                } else if (st3 != null) {
                    Integer num2 = st3.A0Y;
                    Integer num3 = AnonymousClass05K.A0C;
                    if (num2 == num3) {
                        if (this.A0S != null) {
                            SIa sIa = this.A0O;
                            RFZ rfz = RFZ.PINGRESP;
                            int i = this.A0E.A00().A0L;
                            sIa.A01(st3, this.A0S, rfz, "callPing", -1, i);
                        } else {
                            this.A0O.A02(st3, RFZ.PINGRESP, "callPing", -1, this.A0E.A00().A0L);
                        }
                        synchronized (st3) {
                            if (st3.A0Y == num3) {
                                st3.A0J.execute(new C12888TCc(st3));
                            } else {
                                Integer num4 = AnonymousClass05K.A15;
                                throw new C241873Rq(num4, S9M.A01(num4), (Throwable) null);
                            }
                        }
                    }
                }
            }
        } catch (C241873Rq e) {
            0KC.A0G(this.A0X, "exception/send_keepalive", e);
            A07(st3, C8947RGw.SEND_FAILURE, AnonymousClass05K.A01);
        }
    }

    public ST9(boolean z) {
        C10334RqX rqX = C10334RqX.A01;
        if (rqX == null) {
            rqX = new C10334RqX();
            C10334RqX.A01 = rqX;
        }
        this.A0H = rqX;
        this.A0m = Pxe.A0p();
        this.A0s = new C10230Roq(this);
        this.A0r = new AtomicLong();
        this.A0q = new TCV(this);
        this.A0n = new TCW(this);
        this.A0o = new TCX(this);
        this.A0p = new TCY(this);
        this.A0g = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r3.A01.equals(r4.A01) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0128, code lost:
        if (r0.isConnected() == false) goto L_0x012a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Intent r6, X.ST9 r7) {
        /*
            java.lang.String r1 = r6.getAction()
            java.lang.String r0 = "com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED"
            boolean r0 = X.C9556Rct.A00(r1, r0)
            if (r0 == 0) goto L_0x0081
            X.452 r0 = r7.A0E
            r0.A01()
            X.452 r0 = r7.A0E
            X.453 r3 = r0.A00()
            X.453 r4 = r7.A0v
            java.lang.String r1 = r3.A0T
            java.lang.String r0 = r4.A0T
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            int r1 = r3.A0N
            int r0 = r4.A0N
            if (r1 != r0) goto L_0x0050
            int r1 = r3.A09
            int r0 = r4.A09
            if (r1 != r0) goto L_0x0050
            boolean r1 = r3.A0X
            boolean r0 = r4.A0X
            if (r1 != r0) goto L_0x0050
            java.lang.String r2 = r3.A0U
            java.lang.String r1 = r4.A0U
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x006e
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x006e
        L_0x0045:
            java.util.Map r1 = r3.A01
            java.util.Map r0 = r4.A01
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0051
        L_0x0050:
            r0 = 1
        L_0x0051:
            r7.A0v = r3
            if (r0 == 0) goto L_0x0060
            X.RGw r0 = X.C8947RGw.KICK_CONFIG_CHANGED
            r7.A08(r0)
        L_0x005a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x005c:
            r7.A0E(r0)
        L_0x005f:
            return
        L_0x0060:
            X.ST3 r0 = r7.A0w
            if (r0 == 0) goto L_0x005a
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x005a
            r7.A0C()
            return
        L_0x006e:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0050
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0050
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x0050
            goto L_0x0045
        L_0x0081:
            java.lang.String r0 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            boolean r0 = X.C9556Rct.A00(r1, r0)
            if (r0 == 0) goto L_0x00d5
            java.lang.reflect.Method r0 = r7.A0l     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            r3 = 0
            if (r0 != 0) goto L_0x009a
            java.lang.Class<android.os.PowerManager> r2 = android.os.PowerManager.class
            java.lang.String r1 = "isPowerSaveMode"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            r7.A0l = r0     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
        L_0x009a:
            X.S1p r2 = r7.A0B     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            java.lang.String r1 = "power"
            java.lang.Class<android.os.PowerManager> r0 = android.os.PowerManager.class
            X.T9D r1 = r2.A00(r0, r1)     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            boolean r0 = r1 instanceof X.C7860Qbk     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            if (r0 != 0) goto L_0x005f
            java.lang.reflect.Method r2 = r7.A0l     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            java.lang.Object r1 = r1.A01()     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            java.lang.String r1 = r0.toString()     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            X.SRZ r3 = r7.A0C     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            java.lang.String r0 = "pow"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            java.util.HashMap r2 = X.S9J.A01(r0)     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            java.lang.String r1 = "mqtt_device_state"
            r3.A06(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            X.TjG r0 = r3.A01     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            if (r0 == 0) goto L_0x005f
            r0.Cgl(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0180, IllegalAccessException -> 0x017a, InvocationTargetException -> 0x0186 }
            goto L_0x0179
        L_0x00d5:
            java.lang.String r0 = "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED"
            boolean r0 = X.C9556Rct.A00(r1, r0)
            if (r0 == 0) goto L_0x005f
            X.SRZ r6 = r7.A0C
            X.SJJ r0 = r7.A0F
            java.util.concurrent.atomic.AtomicLong r0 = r0.A06
            long r1 = r0.get()
            X.SJJ r0 = r7.A0F
            android.net.NetworkInfo r0 = r0.A02()
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            X.SRZ.A00(r1, r5)
            X.SRZ.A01(r0, r6, r5)
            X.SJJ r0 = r6.A03
            java.util.concurrent.atomic.AtomicLong r0 = r0.A07
            long r3 = r0.get()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x010e
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "dc_ms_ago"
            r5.put(r0, r1)
        L_0x010e:
            java.lang.String r1 = "mqtt_network_changed"
            r6.A06(r1, r5)
            X.TjG r0 = r6.A01
            if (r0 == 0) goto L_0x011b
            r0.Cgl(r1, r5)
        L_0x011b:
            X.SJJ r0 = r7.A0F
            android.net.NetworkInfo r0 = r0.A01()
            if (r0 == 0) goto L_0x012a
            boolean r0 = r0.isConnected()
            r5 = 1
            if (r0 != 0) goto L_0x012b
        L_0x012a:
            r5 = 0
        L_0x012b:
            X.SJJ r0 = r7.A0F
            android.net.NetworkInfo r3 = r0.A02()
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.DISCONNECTED
            if (r3 == 0) goto L_0x0168
            int r1 = r3.getType()
            int r0 = r3.getSubtype()
            android.net.NetworkInfo$State r2 = r3.getState()
            r3.getTypeName()
            r3.getSubtypeName()
            r3.getState()
        L_0x014a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = X.Pxf.A0B(r1, r0, r2)
            long r3 = (long) r0
            long r1 = r7.A0i
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x016b
            X.ST3 r0 = r7.A0w
            if (r0 == 0) goto L_0x016b
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x016b
            return
        L_0x0168:
            r1 = 0
            r0 = 0
            goto L_0x014a
        L_0x016b:
            r7.A0i = r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.A03 = r0
            if (r5 == 0) goto L_0x018f
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x005c
        L_0x0179:
            return
        L_0x017a:
            r2 = move-exception
            java.lang.String r1 = r7.A0X
            java.lang.String r0 = "exception/IllegalAccessException"
            goto L_0x018b
        L_0x0180:
            r2 = move-exception
            java.lang.String r1 = r7.A0X
            java.lang.String r0 = "exception/NoSuchMethodException"
            goto L_0x018b
        L_0x0186:
            r2 = move-exception
            java.lang.String r1 = r7.A0X
            java.lang.String r0 = "exception/InvocationTargetException"
        L_0x018b:
            X.0KC.A0I(r1, r0, r2)
            return
        L_0x018f:
            X.SSX r0 = r7.A0J
            r0.A03()
            X.SIg r0 = r7.A0L
            r0.A00()
            X.RGw r0 = X.C8947RGw.NETWORK_LOST
            r7.A08(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ST9.A00(android.content.Intent, X.ST9):void");
    }

    public ST9() {
        C10334RqX rqX = C10334RqX.A01;
        if (rqX == null) {
            rqX = new C10334RqX();
            C10334RqX.A01 = rqX;
        }
        this.A0H = rqX;
        this.A0m = Pxe.A0p();
        this.A0s = new C10230Roq(this);
        this.A0r = new AtomicLong();
        this.A0q = new TCV(this);
        this.A0n = new TCW(this);
        this.A0o = new TCX(this);
        this.A0p = new TCY(this);
    }
}
