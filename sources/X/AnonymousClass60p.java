package X;

import android.location.Location;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.60p  reason: invalid class name */
public abstract class AnonymousClass60p {
    public long A00;
    public C13709TfW A01;
    public AnonymousClass9QC A02;
    public C276164sm A03;
    public String A04;
    public ExecutorService A05;
    public ScheduledFuture A06;
    public final AnonymousClass0JR A07;
    public final C270924hc A08;
    public final C273354mO A09;
    public final C270914hb A0A;
    public final C270964hg A0B;
    public final LightweightQuickPerformanceLogger A0C;
    public final C270944he A0D;
    public final ScheduledExecutorService A0E;
    public final AtomicBoolean A0F = new AtomicBoolean();
    public final AnonymousClass0JP A0G;
    public final RQN A0H;
    public final C242093Sp A0I;
    public final C9250RVb A0J;

    public static final void A01(AnonymousClass60p r2) {
        r2.A02 = null;
        r2.A01 = null;
        r2.A04 = null;
        r2.A03 = null;
        r2.A00 = r2.A07.now();
        C270914hb r0 = r2.A0A;
        if (r0 != null) {
            r0.A01(r2);
        }
    }

    public abstract void A05();

    public final synchronized void A06() {
        if (this.A0F.getAndSet(false)) {
            ScheduledFuture scheduledFuture = this.A06;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.A06 = null;
            }
            A05();
            this.A0D.A01((Boolean) null, "FbLocationManager", "stopLocations", this.A04, (String) null, (String) null, false);
            A02(this, "");
            A01(this);
            C270914hb r0 = this.A0A;
            if (r0 != null) {
                r0.A01(this);
            }
        }
    }

    public static final void A02(AnonymousClass60p r8, String str) {
        String A0D2;
        Integer num;
        RQN rqn = r8.A0H;
        if (rqn != null) {
            long now = r8.A07.now() - r8.A00;
            String str2 = r8.A04;
            if (str.length() == 0) {
                A0D2 = "";
            } else {
                A0D2 = 002.A0D(str, '-');
            }
            String A0R = 002.A0R(str2, A0D2);
            if (00p.A0k(A0R, "com.facebook.", false)) {
                A0R = A0R.substring(13);
                0qQ.A07(A0R);
            }
            AnonymousClass9QC r0 = r8.A02;
            if (r0 == null || (num = r0.A05) == null) {
                num = AnonymousClass05K.A00;
            }
            int intValue = num.intValue();
            AnonymousClass0Xp r4 = rqn.A00;
            synchronized (r4) {
                if (intValue == 2) {
                    0Xx r3 = r4.A00;
                    01r r02 = r3.A05;
                    0C2 r2 = (0C2) r02.get(A0R);
                    if (r2 == null) {
                        r2 = new 0C2();
                        r02.put(A0R, r2);
                    }
                    r2.A01 += now;
                    r3.A01 += now;
                } else if (intValue != 1) {
                    0Xx r32 = r4.A00;
                    01r r03 = r32.A05;
                    0C2 r22 = (0C2) r03.get(A0R);
                    if (r22 == null) {
                        r22 = new 0C2();
                        r03.put(A0R, r22);
                    }
                    r22.A00 += now;
                    r32.A00 += now;
                } else {
                    0Xx r33 = r4.A00;
                    01r r04 = r33.A05;
                    0C2 r23 = (0C2) r04.get(A0R);
                    if (r23 == null) {
                        r23 = new 0C2();
                        r04.put(A0R, r23);
                    }
                    r23.A02 += now;
                    r33.A02 += now;
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:95|96) */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r7 = r8.A03;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0214 */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x026c A[SYNTHETIC, Splitter:B:113:0x026c] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f6 A[SYNTHETIC, Splitter:B:88:0x01f6] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0217 A[Catch:{ Q0M -> 0x021f, all -> 0x0291, all -> 0x029b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A07(X.C13709TfW r24, X.AnonymousClass9QC r25, java.lang.String r26) {
        /*
            r23 = this;
            r0 = r23
            r14 = r0
            monitor-enter(r14)
            r2 = 0
            r8 = r25
            X.0qQ.A0B(r8, r2)     // Catch:{ all -> 0x02a7 }
            r1 = 1
            r6 = r24
            X.0qQ.A0B(r6, r1)     // Catch:{ all -> 0x02a7 }
            r11 = 2
            r10 = r26
            X.0qQ.A0B(r10, r11)     // Catch:{ all -> 0x02a7 }
            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r0.A0C     // Catch:{ all -> 0x02a5 }
            if (r3 == 0) goto L_0x0020
            r4 = 794437326(0x2f5a26ce, float:1.984077E-10)
            r3.markerStart(r4)     // Catch:{ all -> 0x02a5 }
        L_0x0020:
            java.lang.String r4 = "calling_class_name"
            r0.A0A(r4, r10)     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r12 = r8.A05     // Catch:{ all -> 0x02a5 }
            int r4 = r12.intValue()     // Catch:{ all -> 0x02a5 }
            switch(r4) {
                case 1: goto L_0x008c;
                case 2: goto L_0x0093;
                default: goto L_0x002e;
            }     // Catch:{ all -> 0x02a5 }
        L_0x002e:
            java.lang.String r5 = "LOW_POWER"
        L_0x0030:
            java.lang.String r4 = "priority"
            r0.A0A(r4, r5)     // Catch:{ all -> 0x02a5 }
            java.lang.Long r9 = r8.A06     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "age_limit_ms"
            r0.A09(r4, r9)     // Catch:{ all -> 0x02a5 }
            java.lang.Float r5 = r8.A04     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "accuracy_limit_meters"
            r0.A08(r4, r5)     // Catch:{ all -> 0x02a5 }
            java.lang.Long r5 = r8.A07     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "timeou_ms"
            r0.A09(r4, r5)     // Catch:{ all -> 0x02a5 }
            long r4 = r8.A03     // Catch:{ all -> 0x02a5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "time_between_updates_ms"
            r0.A09(r4, r5)     // Catch:{ all -> 0x02a5 }
            float r4 = r8.A00     // Catch:{ all -> 0x02a5 }
            java.lang.Float r5 = java.lang.Float.valueOf(r4)     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "distance_between_updates_meters"
            r0.A08(r4, r5)     // Catch:{ all -> 0x02a5 }
            long r4 = r8.A02     // Catch:{ all -> 0x02a5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "significant_time_improvement_ms"
            r0.A09(r4, r5)     // Catch:{ all -> 0x02a5 }
            float r4 = r8.A01     // Catch:{ all -> 0x02a5 }
            java.lang.Float r5 = java.lang.Float.valueOf(r4)     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "significant_accuracy_improvement_ratio"
            r0.A08(r4, r5)     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "allow_collection_in_background"
            r0.A0B(r4, r2)     // Catch:{ all -> 0x02a5 }
            boolean r5 = r8.A09     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "allow_subscriptions"
            r0.A0B(r4, r5)     // Catch:{ all -> 0x02a5 }
            boolean r5 = r8.A0A     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "force_fresh_location"
            r0.A0B(r4, r5)     // Catch:{ all -> 0x02a5 }
            java.lang.String r5 = "num_updates"
            goto L_0x009a
        L_0x008c:
            r4 = 360(0x168, float:5.04E-43)
            java.lang.String r5 = X.Pxd.A00(r4)     // Catch:{ all -> 0x02a5 }
            goto L_0x0030
        L_0x0093:
            r4 = 504(0x1f8, float:7.06E-43)
            java.lang.String r5 = X.Pxd.A00(r4)     // Catch:{ all -> 0x02a5 }
            goto L_0x0030
        L_0x009a:
            if (r3 == 0) goto L_0x00a2
            r4 = 794437326(0x2f5a26ce, float:1.984077E-10)
            r3.markerAnnotate(r4, r5, r2)     // Catch:{ all -> 0x02a5 }
        L_0x00a2:
            X.4mO r7 = r0.A09     // Catch:{ all -> 0x02a5 }
            if (r7 == 0) goto L_0x00b8
            boolean r5 = r7.A01()     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "has_any_location_permission"
            r0.A0B(r4, r5)     // Catch:{ all -> 0x02a5 }
            boolean r5 = r7.A02()     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "has_fine_location_permission"
            r0.A0B(r4, r5)     // Catch:{ all -> 0x02a5 }
        L_0x00b8:
            X.4hb r5 = r0.A0A     // Catch:{ all -> 0x02a5 }
            if (r5 == 0) goto L_0x00eb
            boolean r4 = r8.A08     // Catch:{ all -> 0x02a5 }
            if (r4 == 0) goto L_0x00cb
            java.lang.Integer r7 = X.C270914hb.A00(r5)     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r4 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x02a5 }
            if (r7 == r4) goto L_0x00eb
            java.lang.Integer r4 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x02a5 }
            goto L_0x00d1
        L_0x00cb:
            java.lang.Integer r7 = X.C270914hb.A00(r5)     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r4 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x02a5 }
        L_0x00d1:
            if (r7 == r4) goto L_0x00eb
            java.lang.String r8 = "FbLocationManager"
            java.lang.String r9 = "requestLocations"
            r11 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x02a5 }
            X.4he r6 = r0.A0D     // Catch:{ all -> 0x02a5 }
            r12 = r11
            r13 = r1
            r6.A01(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x02a5 }
            java.lang.String r2 = "end_reason"
            java.lang.String r1 = "request in background"
            r0.A0A(r2, r1)     // Catch:{ all -> 0x02a5 }
            goto L_0x0148
        L_0x00eb:
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.A0F     // Catch:{ all -> 0x02a5 }
            boolean r4 = r4.getAndSet(r1)     // Catch:{ all -> 0x02a5 }
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x029d
            r0.A02 = r8     // Catch:{ all -> 0x02a5 }
            r0.A01 = r6     // Catch:{ all -> 0x02a5 }
            r0.A04 = r10     // Catch:{ all -> 0x02a5 }
            X.0JR r4 = r0.A07     // Catch:{ all -> 0x02a5 }
            long r6 = r4.now()     // Catch:{ all -> 0x02a5 }
            r0.A00 = r6     // Catch:{ all -> 0x02a5 }
            X.4hc r4 = r0.A08     // Catch:{ all -> 0x02a5 }
            X.Q0G r7 = r4.A01(r12, r1)     // Catch:{ all -> 0x02a5 }
            java.lang.String r17 = "FbLocationManager"
            java.lang.String r18 = "requestLocations"
            r6 = 0
            java.lang.Integer r4 = r7.A01     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r7 = r7.A00     // Catch:{ all -> 0x02a5 }
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x02a5 }
            X.4he r15 = r0.A0D     // Catch:{ all -> 0x02a5 }
            java.lang.String r20 = X.C270974hh.A00(r4)     // Catch:{ all -> 0x02a5 }
            java.lang.String r21 = X.Q0J.A00(r7)     // Catch:{ all -> 0x02a5 }
            r22 = r2
            r19 = r10
            r15.A01(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x02a5 }
            java.lang.Integer r7 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x02a5 }
            if (r4 == r7) goto L_0x0153
            java.lang.Integer r2 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x02a5 }
            java.lang.String r1 = "LOCATION_UNAVAILABLE"
            A02(r0, r1)     // Catch:{ all -> 0x02a5 }
            X.Q0M r4 = new X.Q0M     // Catch:{ all -> 0x02a5 }
            r4.<init>(r2)     // Catch:{ all -> 0x02a5 }
            java.util.concurrent.ExecutorService r2 = r0.A05     // Catch:{ all -> 0x02a5 }
            X.Q0N r1 = new X.Q0N     // Catch:{ all -> 0x02a5 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x02a5 }
            r2.execute(r1)     // Catch:{ all -> 0x02a5 }
            java.lang.String r2 = "end_reason"
            java.lang.String r1 = "location unavailable"
            r0.A0A(r2, r1)     // Catch:{ all -> 0x02a5 }
        L_0x0148:
            r1 = 3
            if (r3 == 0) goto L_0x028d
            r0 = 794437326(0x2f5a26ce, float:1.984077E-10)
            r3.markerEnd(r0, r1)     // Catch:{ all -> 0x02a5 }
            goto L_0x028d
        L_0x0153:
            if (r5 == 0) goto L_0x0158
            X.C270914hb.A00(r5)     // Catch:{ all -> 0x02a5 }
        L_0x0158:
            X.9QC r3 = r0.A02     // Catch:{ all -> 0x02a5 }
            if (r3 == 0) goto L_0x0173
            java.lang.Long r3 = r3.A07     // Catch:{ all -> 0x02a5 }
            if (r3 == 0) goto L_0x0173
            java.util.concurrent.ScheduledExecutorService r13 = r0.A0E     // Catch:{ all -> 0x02a5 }
            X.Q4c r12 = new X.Q4c     // Catch:{ all -> 0x02a5 }
            r12.<init>(r0)     // Catch:{ all -> 0x02a5 }
            long r3 = r3.longValue()     // Catch:{ all -> 0x02a5 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x02a5 }
            java.util.concurrent.ScheduledFuture r3 = r13.schedule(r12, r3, r10)     // Catch:{ all -> 0x02a5 }
            r0.A06 = r3     // Catch:{ all -> 0x02a5 }
        L_0x0173:
            r3 = r0
            X.Q0H r3 = (X.Q0H) r3     // Catch:{ all -> 0x02a5 }
            java.util.concurrent.atomic.AtomicBoolean r10 = r3.A06     // Catch:{ all -> 0x029b }
            boolean r4 = r10.getAndSet(r1)     // Catch:{ all -> 0x029b }
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0293
            r3.A00 = r8     // Catch:{ all -> 0x029b }
            X.9QC r8 = r3.A02     // Catch:{ all -> 0x028f }
            if (r8 == 0) goto L_0x018f
            boolean r4 = r8.A0A     // Catch:{ all -> 0x028f }
            if (r4 == r1) goto L_0x01e0
            boolean r4 = r8.A09     // Catch:{ all -> 0x028f }
            if (r4 != r1) goto L_0x018f
            goto L_0x01e0
        L_0x018f:
            r4 = 2
            java.lang.String r8 = r3.A04     // Catch:{ all -> 0x029b }
            X.4hg r15 = r3.A0B     // Catch:{ all -> 0x029b }
            if (r9 == 0) goto L_0x024a
            long r18 = r9.longValue()     // Catch:{ all -> 0x029b }
        L_0x019a:
            r17 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r20 = r1
            r16 = r8
            X.4sm r8 = r15.A01(r16, r17, r18, r20)     // Catch:{ all -> 0x029b }
            if (r8 == 0) goto L_0x01d3
            android.location.Location r9 = r8.A00     // Catch:{ all -> 0x029b }
            android.location.Location r8 = new android.location.Location     // Catch:{ all -> 0x029b }
            r8.<init>(r9)     // Catch:{ all -> 0x029b }
            X.4sm r8 = A00(r8)     // Catch:{ all -> 0x029b }
            if (r8 == 0) goto L_0x01d3
            boolean r8 = r3.A0C(r8)     // Catch:{ all -> 0x029b }
            if (r8 == 0) goto L_0x01d3
            boolean r8 = r15.A03()     // Catch:{ all -> 0x029b }
            if (r8 == 0) goto L_0x01d3
            java.lang.String r6 = "cached location used and minimizeLocationAccess"
            java.lang.String r2 = "end_reason"
        L_0x01c4:
            r3.A0A(r2, r6)     // Catch:{ all -> 0x029b }
        L_0x01c7:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r3.A0C     // Catch:{ all -> 0x029b }
            if (r3 == 0) goto L_0x026a
            r2 = 794437326(0x2f5a26ce, float:1.984077E-10)
            r3.markerEnd(r2, r4)     // Catch:{ all -> 0x029b }
            goto L_0x026a
        L_0x01d3:
            X.3Sp r8 = r15.A06     // Catch:{ all -> 0x029b }
            boolean r8 = r8.A01()     // Catch:{ all -> 0x029b }
            if (r8 == 0) goto L_0x01e0
            java.lang.String r6 = "OS Subscriptions are disabled"
            java.lang.String r2 = "end_reason"
            goto L_0x01c4
        L_0x01e0:
            java.lang.String r9 = "passive"
            X.4hc r8 = r3.A03     // Catch:{ Q0M -> 0x021f }
            X.9QC r4 = r3.A00     // Catch:{ Q0M -> 0x021f }
            if (r4 == 0) goto L_0x01ec
            java.lang.Integer r4 = r4.A05     // Catch:{ Q0M -> 0x021f }
            if (r4 != 0) goto L_0x01ee
        L_0x01ec:
            java.lang.Integer r4 = X.AnonymousClass05K.A00     // Catch:{ Q0M -> 0x021f }
        L_0x01ee:
            X.Q0G r8 = r8.A01(r4, r1)     // Catch:{ Q0M -> 0x021f }
            java.lang.Integer r4 = r8.A01     // Catch:{ Q0M -> 0x021f }
            if (r4 != r7) goto L_0x0217
            android.location.LocationManager r4 = r3.A02     // Catch:{ SecurityException -> 0x0214 }
            if (r4 == 0) goto L_0x020e
            android.location.LocationProvider r4 = r4.getProvider(r9)     // Catch:{ SecurityException -> 0x0214 }
            if (r4 == 0) goto L_0x020e
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ SecurityException -> 0x0214 }
            r7.<init>()     // Catch:{ SecurityException -> 0x0214 }
            java.util.Set r4 = r8.A03     // Catch:{ SecurityException -> 0x0214 }
            r7.addAll(r4)     // Catch:{ SecurityException -> 0x0214 }
            r7.add(r9)     // Catch:{ SecurityException -> 0x0214 }
            goto L_0x0251
        L_0x020e:
            java.util.Set r7 = r8.A03     // Catch:{ SecurityException -> 0x0214 }
            X.0qQ.A06(r7)     // Catch:{ SecurityException -> 0x0214 }
            goto L_0x0251
        L_0x0214:
            java.util.Set r7 = r8.A03     // Catch:{ Q0M -> 0x021f }
            goto L_0x0251
        L_0x0217:
            java.lang.Integer r7 = X.AnonymousClass05K.A00     // Catch:{ Q0M -> 0x021f }
            X.Q0M r4 = new X.Q0M     // Catch:{ Q0M -> 0x021f }
            r4.<init>(r7)     // Catch:{ Q0M -> 0x021f }
            throw r4     // Catch:{ Q0M -> 0x021f }
        L_0x021f:
            r8 = move-exception
            java.util.concurrent.ScheduledFuture r4 = r3.A06     // Catch:{ all -> 0x0291 }
            if (r4 == 0) goto L_0x0229
            r4.cancel(r2)     // Catch:{ all -> 0x0291 }
            r3.A06 = r6     // Catch:{ all -> 0x0291 }
        L_0x0229:
            java.util.concurrent.ExecutorService r7 = r3.A05     // Catch:{ all -> 0x0291 }
            X.Q0N r4 = new X.Q0N     // Catch:{ all -> 0x0291 }
            r4.<init>(r8, r3)     // Catch:{ all -> 0x0291 }
            r7.execute(r4)     // Catch:{ all -> 0x0291 }
            r10.set(r2)     // Catch:{ all -> 0x029b }
            r3.A00 = r6     // Catch:{ all -> 0x029b }
            java.lang.String r6 = "end_reason"
            java.lang.String r4 = "FbLocationManagerException: "
            java.lang.String r2 = r8.getMessage()     // Catch:{ all -> 0x029b }
            java.lang.String r2 = X.002.A0R(r4, r2)     // Catch:{ all -> 0x029b }
            r3.A0A(r6, r2)     // Catch:{ all -> 0x029b }
            r4 = 3
            goto L_0x01c7
        L_0x024a:
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x019a
        L_0x0251:
            java.lang.String r6 = "os_subscribed"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r4 = r3.A0C     // Catch:{ all -> 0x029b }
            if (r4 == 0) goto L_0x0260
            r2 = 794437326(0x2f5a26ce, float:1.984077E-10)
            r4.markerPoint(r2, r6)     // Catch:{ all -> 0x029b }
            r4.markerEnd(r2, r11)     // Catch:{ all -> 0x029b }
        L_0x0260:
            java.util.concurrent.ExecutorService r4 = r3.A05     // Catch:{ all -> 0x029b }
            X.92w r2 = new X.92w     // Catch:{ all -> 0x029b }
            r2.<init>(r3, r7)     // Catch:{ all -> 0x029b }
            r4.execute(r2)     // Catch:{ all -> 0x029b }
        L_0x026a:
            if (r5 == 0) goto L_0x028d
            java.util.concurrent.ScheduledExecutorService r4 = r0.A0E     // Catch:{ all -> 0x02a5 }
            java.util.concurrent.CopyOnWriteArrayList r3 = r5.A03     // Catch:{ all -> 0x02a5 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x02a5 }
            r2.<init>(r0)     // Catch:{ all -> 0x02a5 }
            r3.add(r2)     // Catch:{ all -> 0x02a5 }
            monitor-enter(r5)     // Catch:{ all -> 0x02a5 }
            r5.A00 = r4     // Catch:{ all -> 0x028a }
            int r0 = r3.size()     // Catch:{ all -> 0x028a }
            if (r0 != r1) goto L_0x0288
            android.app.Application r1 = r5.A01     // Catch:{ all -> 0x028a }
            com.facebook.location.appstate.GeoApiLocationAppStateListener$LifecycleCallback r0 = r5.A02     // Catch:{ all -> 0x028a }
            r1.registerActivityLifecycleCallbacks(r0)     // Catch:{ all -> 0x028a }
        L_0x0288:
            monitor-exit(r5)     // Catch:{ all -> 0x028a }
            goto L_0x028d
        L_0x028a:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x028a }
            goto L_0x02a4
        L_0x028d:
            monitor-exit(r14)
            return
        L_0x028f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0291 }
        L_0x0291:
            r1 = move-exception
            goto L_0x029a
        L_0x0293:
            java.lang.String r0 = "operation already running"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x029b }
            r1.<init>(r0)     // Catch:{ all -> 0x029b }
        L_0x029a:
            throw r1     // Catch:{ all -> 0x029b }
        L_0x029b:
            r1 = move-exception
            goto L_0x02a4
        L_0x029d:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02a5 }
            r1.<init>(r0)     // Catch:{ all -> 0x02a5 }
        L_0x02a4:
            throw r1     // Catch:{ all -> 0x02a5 }
        L_0x02a5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02a7 }
        L_0x02a7:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass60p.A07(X.TfW, X.9QC, java.lang.String):void");
    }

    public final void A08(String str, Float f) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        if (f != null && (lightweightQuickPerformanceLogger = this.A0C) != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794437326, str, (double) f.floatValue());
        }
    }

    public final void A09(String str, Long l) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        if (l != null && (lightweightQuickPerformanceLogger = this.A0C) != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794437326, str, l.longValue());
        }
    }

    public final void A0A(String str, String str2) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        if (str2 != null && (lightweightQuickPerformanceLogger = this.A0C) != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794437326, str, str2);
        }
    }

    public final void A0B(String str, boolean z) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A0C;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794437326, str, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a3, code lost:
        if (A03(r4, r9) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0120, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0C(X.C276164sm r23) {
        /*
            r22 = this;
            r3 = r22
            monitor-enter(r3)
            r2 = 0
            X.9QC r0 = r3.A02     // Catch:{ all -> 0x0121 }
            r12 = 0
            if (r0 == 0) goto L_0x0029
            X.4hb r1 = r3.A0A     // Catch:{ all -> 0x0121 }
            if (r1 == 0) goto L_0x0029
            boolean r0 = r0.A08     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x001c
            java.lang.Integer r1 = X.C270914hb.A00(r1)     // Catch:{ all -> 0x0121 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0121 }
            if (r1 == r0) goto L_0x0029
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0121 }
            goto L_0x0022
        L_0x001c:
            java.lang.Integer r1 = X.C270914hb.A00(r1)     // Catch:{ all -> 0x0121 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0121 }
        L_0x0022:
            if (r1 == r0) goto L_0x0029
            r3.A06()     // Catch:{ all -> 0x0121 }
            monitor-exit(r3)
            return r2
        L_0x0029:
            X.4hg r0 = r3.A0B     // Catch:{ all -> 0x0121 }
            r4 = r23
            r0.A02(r4)     // Catch:{ all -> 0x0121 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0F     // Catch:{ all -> 0x0121 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x011f
            X.9QC r0 = r3.A02     // Catch:{ all -> 0x0121 }
            r10 = 0
            if (r0 == 0) goto L_0x0040
            java.lang.Long r0 = r0.A06     // Catch:{ all -> 0x0121 }
            goto L_0x0041
        L_0x0040:
            r0 = r10
        L_0x0041:
            r9 = 0
            if (r0 == 0) goto L_0x0051
            long r7 = r3.A04(r4)     // Catch:{ all -> 0x0121 }
            long r5 = r0.longValue()     // Catch:{ all -> 0x0121 }
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            goto L_0x006c
        L_0x0051:
            X.9QC r0 = r3.A02     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0057
            java.lang.Float r10 = r0.A04     // Catch:{ all -> 0x0121 }
        L_0x0057:
            java.lang.Float r0 = r4.A01()     // Catch:{ all -> 0x0121 }
            if (r10 == 0) goto L_0x006b
            if (r0 == 0) goto L_0x006b
            float r1 = r0.floatValue()     // Catch:{ all -> 0x0121 }
            float r0 = r10.floatValue()     // Catch:{ all -> 0x0121 }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x006c
        L_0x006b:
            r9 = 1
        L_0x006c:
            if (r9 == 0) goto L_0x011f
            X.4sm r9 = r3.A03     // Catch:{ all -> 0x0121 }
            r10 = 1
            if (r9 == 0) goto L_0x00a5
            boolean r0 = r3.A03(r9, r4)     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x00a5
            java.lang.Float r1 = r4.A01()     // Catch:{ all -> 0x0121 }
            java.lang.Float r0 = r9.A01()     // Catch:{ all -> 0x0121 }
            if (r1 == 0) goto L_0x00bc
            if (r0 == 0) goto L_0x00bc
            float r5 = r0.floatValue()     // Catch:{ all -> 0x0121 }
            float r1 = r1.floatValue()     // Catch:{ all -> 0x0121 }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00bc
            X.9QC r0 = r3.A02     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0098
            float r0 = r0.A01     // Catch:{ all -> 0x0121 }
            goto L_0x009a
        L_0x0098:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x009a:
            float r5 = r5 * r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00bc
            boolean r0 = r3.A03(r4, r9)     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x00bc
        L_0x00a5:
            java.util.concurrent.ScheduledFuture r0 = r3.A06     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00af
            r0.cancel(r2)     // Catch:{ all -> 0x0121 }
            r0 = 0
            r3.A06 = r0     // Catch:{ all -> 0x0121 }
        L_0x00af:
            r3.A03 = r4     // Catch:{ all -> 0x0121 }
            java.util.concurrent.ExecutorService r1 = r3.A05     // Catch:{ all -> 0x0121 }
            X.Q1P r0 = new X.Q1P     // Catch:{ all -> 0x0121 }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x0121 }
            r1.execute(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x011e
        L_0x00bc:
            X.9QC r6 = r3.A02     // Catch:{ all -> 0x0121 }
            if (r6 == 0) goto L_0x00a5
            long r0 = r6.A03     // Catch:{ all -> 0x0121 }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0121 }
            float r0 = r6.A00     // Catch:{ all -> 0x0121 }
            java.lang.Float r11 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x0121 }
            if (r5 == 0) goto L_0x00a5
            if (r11 == 0) goto L_0x00a5
            java.lang.Long r0 = r9.A03()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x011b
            java.lang.Long r0 = r4.A03()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x011b
            java.lang.Long r0 = r4.A03()     // Catch:{ all -> 0x0121 }
            long r7 = r0.longValue()     // Catch:{ all -> 0x0121 }
            java.lang.Long r0 = r9.A03()     // Catch:{ all -> 0x0121 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0121 }
            long r7 = r7 - r0
        L_0x00ed:
            long r5 = r5.longValue()     // Catch:{ all -> 0x0121 }
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x011f
            float[] r1 = new float[r10]     // Catch:{ all -> 0x0121 }
            android.location.Location r0 = r9.A00     // Catch:{ all -> 0x0121 }
            double r13 = r0.getLatitude()     // Catch:{ all -> 0x0121 }
            double r15 = r0.getLongitude()     // Catch:{ all -> 0x0121 }
            android.location.Location r0 = r4.A00     // Catch:{ all -> 0x0121 }
            double r17 = r0.getLatitude()     // Catch:{ all -> 0x0121 }
            double r19 = r0.getLongitude()     // Catch:{ all -> 0x0121 }
            r21 = r1
            android.location.Location.distanceBetween(r13, r15, r17, r19, r21)     // Catch:{ all -> 0x0121 }
            r1 = r1[r2]     // Catch:{ all -> 0x0121 }
            float r0 = r11.floatValue()     // Catch:{ all -> 0x0121 }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x011f
            goto L_0x00a5
        L_0x011b:
            r7 = -9223372036854775808
            goto L_0x00ed
        L_0x011e:
            r12 = 1
        L_0x011f:
            monitor-exit(r3)
            return r12
        L_0x0121:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass60p.A0C(X.4sm):boolean");
    }

    public AnonymousClass60p(AnonymousClass0JP r2, AnonymousClass0JR r3, C270924hc r4, C273354mO r5, C270914hb r6, C9250RVb rVb, C270964hg r8, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, RQN rqn, C270944he r11, C242093Sp r12, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.A08 = r4;
        this.A0G = r2;
        this.A07 = r3;
        this.A0E = scheduledExecutorService;
        this.A05 = executorService;
        this.A0B = r8;
        this.A0H = rqn;
        this.A0J = rVb;
        this.A0A = r6;
        this.A0D = r11;
        this.A0I = r12;
        this.A09 = r5;
        this.A0C = lightweightQuickPerformanceLogger;
    }

    public static final C276164sm A00(Location location) {
        if (!location.hasAccuracy()) {
            location.setAccuracy(3333.0f);
        }
        if (C270984hi.A00(location)) {
            return new C276164sm(new Location(location), (Boolean) null);
        }
        return null;
    }

    private final boolean A03(C276164sm r7, C276164sm r8) {
        long j;
        Long A032 = r7.A03();
        Long A033 = r8.A03();
        if (A032 == null || A033 == null) {
            return false;
        }
        long longValue = A032.longValue();
        long longValue2 = A033.longValue();
        if (longValue > longValue2) {
            return false;
        }
        long j2 = longValue2 - longValue;
        AnonymousClass9QC r0 = this.A02;
        if (r0 != null) {
            j = r0.A02;
        } else {
            j = 0;
        }
        if (j2 >= j) {
            return true;
        }
        return false;
    }

    public final long A04(C276164sm r5) {
        long j;
        if (r5.A03() == null) {
            return Long.MIN_VALUE;
        }
        long now = this.A0G.now();
        Long A032 = r5.A03();
        if (A032 != null) {
            j = A032.longValue();
        } else {
            j = 0;
        }
        return now - j;
    }
}
