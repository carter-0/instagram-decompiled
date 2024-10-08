package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Txt  reason: case insensitive filesystem */
public final class C14533Txt implements G8K {
    public long A00;
    public long A01;
    public Integer A02;
    public String A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final C14532Txs A07;
    public final C276904u6 A08;
    public final QuickPerformanceLogger A09;
    public final HashMap A0A = new HashMap();
    public final HashMap A0B = new HashMap();
    public final List A0C = new ArrayList();
    public final List A0D = new ArrayList();
    public final C276954uB A0E;
    public final C276934u9 A0F;
    public final List A0G;
    public final AtomicBoolean A0H;
    public final AtomicBoolean A0I;

    /* JADX INFO: finally extract failed */
    public C14533Txt(C276954uB r31, C276934u9 r32, C276904u6 r33, QuickPerformanceLogger quickPerformanceLogger, String str, int i, int i2, long j, long j2, boolean z, boolean z2) {
        long j3;
        String A002 = AnonymousClass000.A00(4132);
        C276904u6 r0 = r33;
        QuickPerformanceLogger quickPerformanceLogger2 = quickPerformanceLogger;
        AnonymousClass7TF.A1B(quickPerformanceLogger2, 1, r0);
        this.A09 = quickPerformanceLogger2;
        this.A08 = r0;
        this.A0E = r31;
        this.A0F = r32;
        this.A06 = i;
        this.A05 = i2;
        V5V v5v = C14532Txs.A01;
        C14532Txs txs = C14532Txs.A02;
        if (txs == null) {
            synchronized (v5v) {
                txs = C14532Txs.A02;
                if (txs == null) {
                    txs = new C14532Txs();
                    C14532Txs.A02 = txs;
                }
            }
        }
        this.A07 = txs;
        this.A0G = new ArrayList();
        this.A0I = new AtomicBoolean(false);
        this.A0H = new AtomicBoolean(false);
        this.A02 = AnonymousClass05K.A00;
        long j4 = j;
        long j5 = j2;
        boolean z3 = z;
        if (!z || j2 <= 0) {
            j3 = j4;
        } else {
            j3 = j5;
        }
        this.A01 = j3;
        int i3 = this.A06;
        int i4 = this.A05;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        quickPerformanceLogger2.markerStartForUserFlow(i3, i4, j3, timeUnit, z2);
        txs.A02(this.A06, this.A05, this.A01);
        if (z) {
            quickPerformanceLogger2.markerPoint(this.A06, this.A05, "ttrc_start_trace_api_called", j4, timeUnit);
            txs.A06(this.A06, this.A05, "ttrc_start_trace_api_called", j4);
        } else if (j2 > 0) {
            quickPerformanceLogger2.markerPoint(this.A06, this.A05, "ttrc_touch_up", j5, timeUnit);
            txs.A06(this.A06, this.A05, "ttrc_touch_up", j5);
        }
        MarkerEditor withMarker = quickPerformanceLogger2.withMarker(this.A06, this.A05);
        try {
            withMarker.annotate("ttrc_qpl_instancekey", this.A05);
            withMarker.annotate("ttrc_tracking_version", 1);
            withMarker.annotate("ttrc_back_start_on_touch_up", z3);
            int i5 = this.A06;
            int i6 = this.A05;
            txs.A04(i5, i6, "ttrc_qpl_instancekey", i6);
            txs.A04(this.A06, this.A05, "ttrc_tracking_version", 1);
            txs.A08(this.A06, this.A05, "ttrc_back_start_on_touch_up", z3);
            String str2 = str;
            if (str != null) {
                withMarker.annotate(A002, str2);
                txs.A07(this.A06, this.A05, A002, str2);
            }
            withMarker.markerEditingCompleted();
            this.A04 = false;
        } catch (Throwable th) {
            withMarker.markerEditingCompleted();
            throw th;
        }
    }

    private final synchronized void A02() {
        if (!this.A0I.get() || this.A0H.get()) {
            Iterator A0t = AnonymousClass7TF.A0t(this.A0B);
            while (true) {
                if (A0t.hasNext()) {
                    Object next = A0t.next();
                    0qQ.A07(next);
                    if (((C14546TyB) next).A00 != AnonymousClass05K.A0N) {
                        break;
                    }
                } else if (A05()) {
                    A00();
                    A01();
                }
            }
        }
    }

    public static final synchronized void A04(C14533Txt txt, String str) {
        synchronized (txt) {
            String str2 = str;
            txt.A09(str, 3);
            if (txt.A0B()) {
                txt.A06(AnonymousClass05K.A0Y);
            }
            int i = txt.A06;
            String A052 = 002.A05(i, "marker_id:", ",error:", str);
            String A0x = 002.A0x("marker_id:", ",instance_key:", ",error:", str2, i, txt.A05);
            txt.A0F.EFT(002.A0R("TTRCTrace|", String.valueOf(i)), A052, new Throwable(A0x));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        if (r6 == X.AnonymousClass05K.A0Y) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean A06(java.lang.Integer r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Integer r0 = r5.A07()     // Catch:{ all -> 0x00b2 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x00b2 }
            r3 = 1
            r4 = 0
            if (r1 == r4) goto L_0x0057
            if (r1 == r3) goto L_0x0014
            r0 = 2
            if (r1 != r0) goto L_0x00b0
            goto L_0x009c
        L_0x0014:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x00b2 }
            if (r6 == r0) goto L_0x002a
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x00b2 }
            if (r6 == r0) goto L_0x002a
            java.lang.Integer r0 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x00b2 }
            if (r6 == r0) goto L_0x002a
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x00b2 }
            if (r6 == r0) goto L_0x002a
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x00b2 }
            if (r6 != r0) goto L_0x00b0
            goto L_0x00ac
        L_0x002a:
            java.lang.String r1 = "cache_and_network_queries"
            java.util.List r0 = r5.A0C     // Catch:{ all -> 0x00b2 }
            java.lang.String[] r0 = X.DbU.A1b(r0, r4)     // Catch:{ all -> 0x00b2 }
            r5.A0A(r1, r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = "network_only_queries"
            java.util.List r0 = r5.A0D     // Catch:{ all -> 0x00b2 }
            java.lang.String[] r0 = X.DbU.A1b(r0, r4)     // Catch:{ all -> 0x00b2 }
            r5.A0A(r1, r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "steps"
            java.util.HashMap r0 = r5.A0A     // Catch:{ all -> 0x00b2 }
            java.util.Set r1 = r0.keySet()     // Catch:{ all -> 0x00b2 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ all -> 0x00b2 }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x00b2 }
            r5.A0A(r2, r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00ac
        L_0x0057:
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x00b2 }
            if (r6 == r0) goto L_0x00ac
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x00b2 }
            if (r6 == r0) goto L_0x00ac
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x00b2 }
            if (r6 == r0) goto L_0x00ac
            java.lang.Integer r0 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x00b2 }
            if (r6 == r0) goto L_0x00ac
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x00b2 }
            if (r6 == r0) goto L_0x00ac
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x00b2 }
            if (r6 != r0) goto L_0x00b0
            java.lang.String r1 = "cache_and_network_queries"
            java.util.List r0 = r5.A0C     // Catch:{ all -> 0x00b2 }
            java.lang.String[] r0 = X.DbU.A1b(r0, r4)     // Catch:{ all -> 0x00b2 }
            r5.A0A(r1, r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = "network_only_queries"
            java.util.List r0 = r5.A0D     // Catch:{ all -> 0x00b2 }
            java.lang.String[] r0 = X.DbU.A1b(r0, r4)     // Catch:{ all -> 0x00b2 }
            r5.A0A(r1, r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "steps"
            java.util.HashMap r0 = r5.A0A     // Catch:{ all -> 0x00b2 }
            java.util.Set r1 = r0.keySet()     // Catch:{ all -> 0x00b2 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ all -> 0x00b2 }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x00b2 }
            r5.A0A(r2, r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00ac
        L_0x009c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x00b2 }
            if (r6 == r0) goto L_0x00ac
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x00b2 }
            if (r6 == r0) goto L_0x00ac
            java.lang.Integer r0 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x00b2 }
            if (r6 == r0) goto L_0x00ac
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x00b2 }
            if (r6 != r0) goto L_0x00b0
        L_0x00ac:
            r5.A02 = r6     // Catch:{ all -> 0x00b2 }
            monitor-exit(r5)
            return r3
        L_0x00b0:
            monitor-exit(r5)
            return r4
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14533Txt.A06(java.lang.Integer):boolean");
    }

    public final synchronized Integer A07() {
        Integer num;
        num = this.A02;
        if (num == null) {
            0qQ.A0F("traceState");
            throw AnonymousClass00P.createAndThrow();
        }
        return num;
    }

    public final synchronized void A08(String str, long j) {
        String str2;
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerPoint(i, i2, str, (String) null, j, TimeUnit.MILLISECONDS);
        C14532Txs txs = this.A07;
        if (str == null) {
            str2 = "Unknown name";
        } else {
            str2 = str;
        }
        txs.A06(i, i2, str2, j);
        this.A0G.add(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (A07() == X.AnonymousClass05K.A0C) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0B() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Integer r1 = r3.A07()     // Catch:{ all -> 0x001d }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x001d }
            if (r1 == r0) goto L_0x001a
            java.lang.Integer r1 = r3.A07()     // Catch:{ all -> 0x001d }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x001d }
            if (r1 == r0) goto L_0x001a
            java.lang.Integer r2 = r3.A07()     // Catch:{ all -> 0x001d }
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x001d }
            r0 = 0
            if (r2 != r1) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            monitor-exit(r3)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14533Txt.A0B():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (A06(r3) != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0C(java.lang.Integer r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Integer r0 = r2.A07()     // Catch:{ all -> 0x0011 }
            if (r0 == r3) goto L_0x000e
            boolean r1 = r2.A06(r3)     // Catch:{ all -> 0x0011 }
            r0 = 0
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14533Txt.A0C(java.lang.Integer):boolean");
    }

    public final synchronized void A9w(String str, TimeUnit timeUnit, long j) {
        C14546TyB tyB;
        0qQ.A0B(timeUnit, 2);
        if (A0C(AnonymousClass05K.A01)) {
            HashMap hashMap = this.A0B;
            if (hashMap.containsKey(str)) {
                A04(this, 002.A0R("Attempted to Add Query Twice for: ", str));
            } else {
                if (j == -1) {
                    tyB = new C14546TyB(this, str);
                } else {
                    tyB = new C14546TyB(this, str, timeUnit.toMillis(j));
                }
                hashMap.put(str, tyB);
            }
        }
    }

    public final synchronized void AAI(String str) {
        if (A0C(AnonymousClass05K.A01)) {
            HashMap hashMap = this.A0A;
            if (hashMap.containsKey(str)) {
                A04(this, 002.A0R("Attempted to Add Additional Step Twice for: ", str));
            } else {
                hashMap.put(str, new C14569TyY());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        if (r2 != 1) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002f, code lost:
        if (r3 != r5) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void AEs(long r9, java.lang.String r11, boolean r12, long r13) {
        /*
            r8 = this;
            r7 = r8
            monitor-enter(r7)
            r6 = 0
            java.lang.Integer r5 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0077 }
            boolean r0 = r8.A0C(r5)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x002d
            java.util.HashMap r0 = r8.A0B     // Catch:{ all -> 0x0027 }
            java.lang.Object r4 = r0.get(r11)     // Catch:{ all -> 0x0027 }
            X.TyB r4 = (X.C14546TyB) r4     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x002d
            if (r12 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r3 = r5
            goto L_0x001c
        L_0x001a:
            java.lang.Integer r3 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0077 }
        L_0x001c:
            java.lang.Integer r0 = r4.A00     // Catch:{ all -> 0x0077 }
            int r2 = r0.intValue()     // Catch:{ all -> 0x0077 }
            r0 = 2
            r1 = 1
            if (r2 == r0) goto L_0x0031
            goto L_0x0029
        L_0x0027:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0029:
            if (r2 == r6) goto L_0x002f
            if (r2 == r1) goto L_0x0031
        L_0x002d:
            monitor-exit(r7)
            return
        L_0x002f:
            if (r3 == r5) goto L_0x0036
        L_0x0031:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0077 }
            if (r3 == r0) goto L_0x0036
            goto L_0x002d
        L_0x0036:
            r4.A00 = r3     // Catch:{ all -> 0x0077 }
            r5 = 0
            r4.A03 = r1     // Catch:{ all -> 0x0077 }
            long r0 = r4.A04     // Catch:{ all -> 0x0077 }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0042
            r5 = 1
        L_0x0042:
            r4.A01 = r5     // Catch:{ all -> 0x0077 }
            X.Txt r3 = r4.A06     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "cache_was_recent_for_"
            java.lang.String r2 = r4.A05     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = X.002.A0R(r0, r2)     // Catch:{ all -> 0x0077 }
            r0 = r5 ^ 1
            r3.CmG(r1, r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "cache_age_ms_for_"
            java.lang.String r0 = X.002.A0R(r0, r2)     // Catch:{ all -> 0x0077 }
            r3.CmE(r0, r9)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "ttcc_for_"
            java.lang.String r0 = X.002.A0R(r0, r2)     // Catch:{ all -> 0x0077 }
            r3.A03 = r0     // Catch:{ all -> 0x0077 }
            r3.A00 = r13     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x006b
            r3.A08(r0, r13)     // Catch:{ all -> 0x0077 }
        L_0x006b:
            r8.A03(r13)     // Catch:{ all -> 0x0077 }
            if (r12 == 0) goto L_0x002d
            r4.A00()     // Catch:{ all -> 0x0077 }
            r8.A02()     // Catch:{ all -> 0x0077 }
            goto L_0x002d
        L_0x0077:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14533Txt.AEs(long, java.lang.String, boolean, long):void");
    }

    public final synchronized void AUZ(String str) {
        synchronized (this) {
            long now = this.A0E.now();
            if (A0B()) {
                A06(AnonymousClass05K.A0Y);
                A00();
                A09(str, 3);
                EventBuilder level = this.A09.markEventBuilder(21364738, String.valueOf(this.A06)).annotate(TraceFieldType.Duration, now - this.A01).setLevel(3);
                if (str != null) {
                    level.annotate(DialogModule.KEY_MESSAGE, str);
                }
                level.report();
            }
        }
    }

    public final synchronized void Cft(String str) {
        synchronized (this) {
            long now = this.A0E.now();
            if (A0B()) {
                A00();
                HashMap hashMap = this.A0B;
                if (!hashMap.isEmpty() || !this.A0A.isEmpty()) {
                    Iterator A0t = AnonymousClass7TF.A0t(hashMap);
                    boolean z = true;
                    while (A0t.hasNext()) {
                        Object next = A0t.next();
                        0qQ.A07(next);
                        C14546TyB tyB = (C14546TyB) next;
                        Integer num = tyB.A00;
                        if ((num != AnonymousClass05K.A0C || tyB.A01) && num != AnonymousClass05K.A0N) {
                            z = false;
                        }
                    }
                    if (z && A05()) {
                        Iterator A0t2 = AnonymousClass7TF.A0t(hashMap);
                        while (A0t2.hasNext()) {
                            Object next2 = A0t2.next();
                            0qQ.A07(next2);
                            C14546TyB tyB2 = (C14546TyB) next2;
                            if (tyB2.A00 == AnonymousClass05K.A0C) {
                                tyB2.A00();
                            }
                        }
                        A01();
                    }
                }
                A06(AnonymousClass05K.A0j);
                A09(str, 4);
                long j = now - this.A01;
                if (j > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                    this.A09.markEventBuilder(21364739, String.valueOf(this.A06)).annotate(TraceFieldType.Duration, j).setLevel(5).report();
                }
            }
        }
    }

    public final synchronized void CmK() {
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerDropForUserFlow(i, i2);
        this.A07.A01(i, i2);
        A06(AnonymousClass05K.A0u);
        this.A08.A01(this);
    }

    public final synchronized void CmM(String str) {
        String str2;
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerPoint(i, i2, str);
        C14532Txs txs = this.A07;
        if (str == null) {
            str2 = "Unknown name";
        } else {
            str2 = str;
        }
        txs.A06(i, i2, str2, this.A0E.now());
        this.A0G.add(str);
    }

    public final synchronized void CmN(String str, long j) {
        String str2;
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerPoint(i, i2, str, (String) null, j, TimeUnit.MILLISECONDS);
        C14532Txs txs = this.A07;
        if (str == null) {
            str2 = "Unknown name";
        } else {
            str2 = str;
        }
        txs.A06(i, i2, str2, j);
        this.A0G.add(str);
    }

    public final synchronized void Cqw(String str, boolean z) {
        synchronized (this) {
            long now = this.A0E.now();
            if (A0C(AnonymousClass05K.A0C)) {
                C14546TyB tyB = (C14546TyB) this.A0B.get(str);
                if (tyB != null) {
                    Integer num = AnonymousClass05K.A0N;
                    int intValue = tyB.A00.intValue();
                    if (intValue == 2 || intValue == 0 || intValue == 1) {
                        tyB.A00 = num;
                        tyB.A02 = true;
                        String A0R = 002.A0R("ttnc_for_", tyB.A05);
                        C14533Txt txt = tyB.A06;
                        txt.A03 = A0R;
                        txt.A00 = now;
                        txt.A08(A0R, now);
                        tyB.A00();
                        A03(now);
                        A02();
                    }
                }
            }
        }
    }

    public final synchronized void Ey0(String str) {
        synchronized (this) {
            long now = this.A0E.now();
            if (A0C(AnonymousClass05K.A0C)) {
                C14569TyY tyY = (C14569TyY) this.A0A.get(str);
                if (tyY != null) {
                    if (tyY.A00 == AnonymousClass05K.A00) {
                        tyY.A00 = AnonymousClass05K.A01;
                        String A0R = 002.A0R("step_completed_", str);
                        if (this.A00 <= now) {
                            this.A03 = A0R;
                            this.A00 = now;
                        }
                        A08(A0R, now);
                        A03(this.A00);
                        A02();
                    }
                }
            }
        }
    }

    public final synchronized void Ey1(String str) {
        synchronized (this) {
            long now = this.A0E.now();
            Integer num = AnonymousClass05K.A0C;
            if (A0C(num)) {
                C14569TyY tyY = (C14569TyY) this.A0A.get(str);
                if (tyY != null) {
                    if (tyY.A00 == AnonymousClass05K.A00) {
                        tyY.A00 = num;
                        A03(Math.max(this.A00, now));
                        A02();
                    }
                }
            }
        }
    }

    private final void A00() {
        String A0g;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = this.A0B;
        Iterator A0t = AnonymousClass7TF.A0t(hashMap);
        while (A0t.hasNext()) {
            Object next = A0t.next();
            0qQ.A07(next);
            C14546TyB tyB = (C14546TyB) next;
            int intValue = tyB.A00.intValue();
            if (intValue == 0) {
                arrayList3.add(tyB.A05);
            } else if (intValue == 1 || intValue == 2) {
                arrayList4.add(tyB.A05);
            }
        }
        Iterator A0s = AnonymousClass7TF.A0s(this.A0A);
        while (A0s.hasNext()) {
            Map.Entry entry = (Map.Entry) A0s.next();
            Object key = entry.getKey();
            Integer num = ((C14569TyY) entry.getValue()).A00;
            if (num == AnonymousClass05K.A0C) {
                arrayList2.add(key);
            } else if (num == AnonymousClass05K.A00) {
                arrayList5.add(key);
            }
        }
        A0A("revoked_queries", Pxf.A1a(arrayList, 0));
        A0A("revoked_steps", Pxf.A1a(arrayList2, 0));
        A0A("pending_cache_and_network_queries", Pxf.A1a(arrayList3, 0));
        A0A("pending_network_queries", Pxf.A1a(arrayList4, 0));
        A0A("pending_steps", Pxf.A1a(arrayList5, 0));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator A0t2 = AnonymousClass7TF.A0t(hashMap);
        while (A0t2.hasNext()) {
            Object next2 = A0t2.next();
            0qQ.A07(next2);
            C14546TyB tyB2 = (C14546TyB) next2;
            if (tyB2.A00 == AnonymousClass05K.A0N) {
                if (!tyB2.A03 || tyB2.A02) {
                    arrayList7.add(tyB2.A05);
                } else {
                    arrayList6.add(tyB2.A05);
                }
            }
        }
        if (DbT.A1b(arrayList6) || DbT.A1b(arrayList7)) {
            if (arrayList7.isEmpty()) {
                A0g = "CACHE";
            } else if (arrayList6.isEmpty()) {
                A0g = "NETWORK";
            } else {
                01V.A1C(arrayList6);
                01V.A1C(arrayList7);
                A0g = 002.A0g(00k.A0P(", ", "", "", arrayList6, C14652Tzy.A00), ", ", 00k.A0P(", ", "", "", arrayList7, C14653Tzz.A00));
            }
            CmF("ttrc_source", A0g);
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator A0t3 = AnonymousClass7TF.A0t(hashMap);
        while (A0t3.hasNext()) {
            Object next3 = A0t3.next();
            0qQ.A07(next3);
            C14546TyB tyB3 = (C14546TyB) next3;
            if (tyB3.A03) {
                arrayList8.add(tyB3.A05);
            }
        }
        if (DbT.A1b(arrayList8)) {
            01V.A1C(arrayList8);
            CmF("ttrc_cache_rendered", 00k.A0P(", ", "", "", arrayList8, (0sP) null));
        }
    }

    private final void A01() {
        String str;
        try {
            QuickPerformanceLogger quickPerformanceLogger = this.A09;
            int i = this.A06;
            int i2 = this.A05;
            quickPerformanceLogger.markerEndAtPointForUserFlow(i, i2, 2, this.A03);
            this.A07.A03(i, i2, this.A01, this.A00, 2);
            this.A08.A01(this);
            A06(AnonymousClass05K.A0N);
        } catch (0XX e) {
            A09("Point not found", 3);
            A06(AnonymousClass05K.A0Y);
            int i3 = this.A06;
            String A0R = 002.A0R("TTRCTrace | ", String.valueOf(i3));
            String[] strArr = e.A02;
            if (strArr != null) {
                str = 03t.A07(", ", "", "", (0sP) null, strArr);
            } else {
                str = "null";
            }
            C276934u9 r3 = this.A0F;
            r3.E5V("ttrc_qpl_points_known", str);
            r3.E5V("ttrc_qpl_points_submitted", 00k.A0P(", ", "", "", this.A0G, (0sP) null));
            Locale locale = Locale.US;
            String format = String.format(locale, "%d:%d", Arrays.copyOf(C51968G9o.A1Z(Integer.valueOf(i3), this.A05), 2));
            0qQ.A07(format);
            r3.E5V("ttrc_qpl_markerid_sumbited", format);
            r3.E5V("ttrc_qpl_markerid_known", Pxg.A0v("%d:%d", locale, C51968G9o.A1Z(Integer.valueOf(e.A01), e.A00), 2));
            r3.EFT(A0R, "Error while ending trace", e);
        }
    }

    private final void A03(long j) {
        if (!this.A04 && A05()) {
            if (A07() == AnonymousClass05K.A00 || A07() == AnonymousClass05K.A0C) {
                Iterator A0t = AnonymousClass7TF.A0t(this.A0B);
                while (A0t.hasNext()) {
                    Object next = A0t.next();
                    0qQ.A07(next);
                    Integer num = ((C14546TyB) next).A00;
                    if (num != AnonymousClass05K.A0N && num != AnonymousClass05K.A0C) {
                        return;
                    }
                }
                A08("time_to_initial_content", j);
                this.A04 = true;
            }
        }
    }

    private final boolean A05() {
        Iterator A0t = AnonymousClass7TF.A0t(this.A0A);
        while (A0t.hasNext()) {
            Object next = A0t.next();
            0qQ.A07(next);
            Integer num = ((C14569TyY) next).A00;
            if (num != AnonymousClass05K.A01 && num != AnonymousClass05K.A0C) {
                return false;
            }
        }
        return true;
    }

    public final void A09(String str, short s) {
        if (!(str == null || str.length() == 0)) {
            MarkerEditor withMarker = this.A09.withMarker(this.A06, this.A05);
            withMarker.annotate("end_reason", str);
            withMarker.markerEditingCompleted();
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerEndForUserFlow(i, i2, s);
        this.A07.A03(i, i2, this.A01, this.A00, s);
        this.A08.A01(this);
    }

    public final void A0A(String str, String[] strArr) {
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerAnnotate(i, i2, str, strArr);
        if (strArr != null) {
            this.A07.A09(i, i2, str, strArr);
        }
    }

    public final long CA9() {
        int i = this.A06;
        return (((long) this.A05) & 4294967295L) | ((((long) i) << 32) & -4294967296L);
    }

    public final void Cfs() {
        Cft("leftSurface");
    }

    public final void CmD(String str, int i) {
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i2 = this.A06;
        int i3 = this.A05;
        quickPerformanceLogger.markerAnnotate(i2, i3, str, i);
        if (str != null) {
            this.A07.A04(i2, i3, str, i);
        }
    }

    public final void CmE(String str, long j) {
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        String str2 = str;
        long j2 = j;
        quickPerformanceLogger.markerAnnotate(i, i2, str2, j2);
        if (str != null) {
            this.A07.A05(i, i2, str2, j2);
        }
    }

    public final void CmF(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerAnnotate(i, i2, str, str2);
        if (str != null && str2 != null) {
            this.A07.A07(i, i2, str, str2);
        }
    }

    public final void CmG(String str, boolean z) {
        QuickPerformanceLogger quickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerAnnotate(i, i2, str, z);
        if (str != null) {
            this.A07.A08(i, i2, str, z);
        }
    }

    public final MarkerEditor FNW() {
        MarkerEditor withMarker = this.A09.withMarker(this.A06, this.A05);
        0qQ.A07(withMarker);
        return withMarker;
    }

    public final int getMarkerId() {
        return this.A06;
    }

    public final String toString() {
        return 002.A01('_', this.A06, this.A05);
    }
}
