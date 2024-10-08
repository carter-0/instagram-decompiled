package com.facebook.rti.mqtt.manager;

import X.00a;
import X.00f;
import X.C14696U1w;
import X.UU0;
import android.content.Intent;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class MqttBackgroundServiceDelegate extends 00a {
    public boolean A00;
    public final Object A01 = new Object();
    public volatile C14696U1w A02;

    public final void A09(Intent intent, int i) {
        A07(intent, -1, i);
    }

    public abstract void A0H();

    public abstract void A0J(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public final int A07(Intent intent, int i, int i2) {
        this.A02.A02(i, i2, intent);
        return 1;
    }

    public void A0F() {
        this.A02.A00();
        MqttBackgroundServiceDelegate.super.A0F();
    }

    /* JADX WARNING: type inference failed for: r1v47, types: [java.lang.Object, X.RQH] */
    /* JADX WARNING: type inference failed for: r13v2, types: [java.lang.Object, X.RQG] */
    /* JADX WARNING: type inference failed for: r47v0, types: [X.Rd1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r48v0, types: [X.Rd2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r49v0, types: [X.44q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r31v1, types: [X.Rcr, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:39|(3:42|(1:44)|45)|46|47|48|49|50|51|52|56|(0)|59|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x015f, code lost:
        r9.AIR("FbnsServiceDelegate", "PreferencesManager failed to commit analytics config values");
        r14 = new java.util.concurrent.atomic.AtomicInteger(-1);
        r13 = 1;
        r10 = new java.util.concurrent.CountDownLatch(1);
        r9 = X.AnonymousClass3RY.A0A;
        r5 = -1;
        r4 = new X.C12235Spp(r10, r14);
        r2 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0185, code lost:
        if (r2.A00().isInstance(r5) == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0187, code lost:
        r2.A04(r4, r7, r5, "logging_health_stats_sample_rate");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r10.await(5, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0196, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.0KC.A0F("FbnsServiceDelegate", "Waiting for current health sample rate fetch in initHealthStatsAnalytics was interrupted", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0214, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x021b, code lost:
        r1 = (X.AnonymousClass3RQ) r2.A00();
        r5 = r27.getApplicationContext();
        X.0qQ.A07(r5);
        r1.A00 = r4;
        r2 = X.SHT.A04;
        r9 = new X.SHT(r5, new X.C12246Sq0(r6, r3));
        r2 = new X.SHM(r5, X.AnonymousClass3RA.A00(r5), "MQTT", (java.util.Map) null);
        r11 = r1.Aws();
        r14 = r27.getApplicationContext();
        X.0qQ.A07(r14);
        r13 = new java.lang.Object();
        r13.A00 = r7;
        r37 = X.C9560Rcx.A00(r51);
        r5 = new X.C12245Spz(r6, r3);
        r2 = X.C12231Spl.A0E;
        r10 = X.AnonymousClass3RA.A00(r14);
        r4 = new X.SHM(r14, r10, "MQTT", (java.util.Map) null);
        r30 = new X.C12231Spl(r14, r9, r7, r5, new X.C12239Spt(r11), r13, r37, r4.A01(), r10.A01, r10.A00);
        r3.A09 = new X.C10983S3t(r9);
        r5 = r27.getApplicationContext();
        X.0qQ.A07(r5);
        r2 = r8.A00(r5, X.002.A0R("rti.mqtt.", "ids"));
        r47 = new java.lang.Object();
        r48 = new java.lang.Object();
        r28 = r27.getApplicationContext();
        X.0qQ.A07(r28);
        r4 = r27.getApplicationContext();
        X.0qQ.A07(r4);
        r5 = X.C9555Rcs.A00(r4);
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02c6, code lost:
        if (r5 != false) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02c8, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02ca, code lost:
        r1 = new java.lang.RuntimeException("IMqttStatsLogSwitcher not bound in FBNS Config Manager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02d2, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Cannot cast");
        r1.append(r5.getClass());
        r1 = new java.lang.ClassCastException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02f5, code lost:
        r10 = new X.ST9(r4);
        r13 = r3.A0D;
        r9 = new X.C12254Sq8(r2);
        r49 = new java.lang.Object();
        r7 = new android.os.Handler(android.os.Looper.getMainLooper());
        r31 = new java.lang.Object();
        r12 = r3.A03;
        r4 = r3.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x031a, code lost:
        if (r4.A02 == null) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x031c, code lost:
        r4.A02 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x031e, code lost:
        r11 = r3.A0B;
        r46 = new X.C10743RxM();
        r5 = new X.C7861Qbl(r1);
        r4 = new X.C11165SDb(r3);
        r2 = new X.C7876Qc0();
        r27 = new X.C10861RzM(r28, r7, r30, r31, r5, r12, r8, (X.C13575Td0) null, r1, r1, r1, r1, r6, r9, r11, r13, r10, r1, r46, r47, r48, r49, r4, r51, r52, (java.net.Proxy) null, (java.util.Map) null);
        r14 = new X.C9566Rd6();
        r2.A00 = r1;
        r6 = r27.A00;
        r8 = r15.A02();
        r5 = new X.C10414Rrq(r6, r8);
        r2.A00(new X.C7861Qbl(r5), r27, com.facebook.rti.push.service.FbnsServiceDelegate.A0F);
        r10 = r8.A00(r6, X.002.A0R("rti.mqtt.", "analytics"));
        r2.A03 = new X.SRS(r6, r8, r2.A05, r2.A06);
        r7 = r2.A08;
        r5 = r2.A04;
        r2.A02 = new X.S3T(r6, r2.A00, r8, r5, r2.A07, r7);
        r5 = r2.A0I;
        r2.A01 = new X.C11004S4y(r6, r2.A01, r10, r2.A04, r2, r5, r14);
        r0.A0A = r2;
        r0.A0N();
        r0.A0M();
        ((X.C12232Spm) r0.A01).A01 = new X.C10232Ros(r0);
        com.facebook.rti.mqtt.manager.MqttPushServiceDelegate.A06(r0, "doCreate");
        r3 = r0.A0E;
        r4 = X.002.A0R(X.C9560Rcx.A00(r51), ".SERVICE_CREATE");
        r2 = X.C7860Qbk.A00;
        r8 = r0.A0B.get();
        r6 = r0.A06.A06.get();
        r3.A02(r0.A06.A02(), r2, r2, r4, (java.lang.String) null, r6, r8);
        r55.A00 = true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x01e8 */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0214 A[Catch:{ InterruptedException -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x021b A[Catch:{ InterruptedException -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02ca A[Catch:{ InterruptedException -> 0x0196 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G() {
        /*
            r56 = this;
            java.lang.String r1 = "MqttBackgroundServiceDelegate.ensureInitialized"
            r0 = -1398809912(0xffffffffac9fdac8, float:-4.5433414E-12)
            X.0fh.A01(r1, r0)
            r55 = r56
            r0 = r55
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x0417 }
            r26 = r0
            monitor-enter(r26)     // Catch:{ all -> 0x0417 }
            r0 = r55
            boolean r0 = r0.A00     // Catch:{ all -> 0x0414 }
            if (r0 != 0) goto L_0x040c
            r0 = r55
            com.facebook.rti.mqtt.manager.MqttPushServiceDelegate r0 = (com.facebook.rti.mqtt.manager.MqttPushServiceDelegate) r0     // Catch:{ all -> 0x0414 }
            X.S3c r2 = r0.A0A     // Catch:{ all -> 0x0414 }
            r1 = 0
            if (r2 != 0) goto L_0x0021
            r1 = 1
        L_0x0021:
            X.S9L.A01(r1)     // Catch:{ all -> 0x0414 }
            r3 = r0
            com.facebook.rti.push.service.FbnsServiceDelegate r3 = (com.facebook.rti.push.service.FbnsServiceDelegate) r3     // Catch:{ all -> 0x0414 }
            com.facebook.rti.push.service.FbnsServiceDelegate r1 = com.facebook.rti.push.service.FbnsServiceDelegate.A0D     // Catch:{ all -> 0x0414 }
            if (r1 == 0) goto L_0x002e
            r1.A0P()     // Catch:{ all -> 0x0414 }
        L_0x002e:
            com.facebook.rti.push.service.FbnsServiceDelegate.A0D = r3     // Catch:{ all -> 0x0414 }
            java.lang.Object r15 = X.AnonymousClass3RD.A00     // Catch:{ all -> 0x0414 }
            X.3RX r15 = (X.AnonymousClass3RX) r15     // Catch:{ all -> 0x0414 }
            X.00f r1 = r3.A01     // Catch:{ all -> 0x0414 }
            r27 = r1
            android.content.Context r1 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0414 }
            X.3RV r8 = r15.A02()     // Catch:{ all -> 0x0414 }
            android.content.Context r2 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0414 }
            X.Spm r1 = new X.Spm     // Catch:{ all -> 0x0414 }
            r1.<init>(r2, r8)     // Catch:{ all -> 0x0414 }
            r3.A03 = r1     // Catch:{ all -> 0x0414 }
            X.Spu r25 = new X.Spu     // Catch:{ all -> 0x0414 }
            r1 = r25
            r1.<init>(r3)     // Catch:{ all -> 0x0414 }
            X.Spv r24 = new X.Spv     // Catch:{ all -> 0x0414 }
            r1 = r24
            r1.<init>(r3)     // Catch:{ all -> 0x0414 }
            X.Spw r23 = new X.Spw     // Catch:{ all -> 0x0414 }
            r1 = r23
            r1.<init>(r3)     // Catch:{ all -> 0x0414 }
            r22 = 0
            android.content.Context r4 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x0414 }
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0414 }
            X.3Rv r21 = new X.3Rv     // Catch:{ all -> 0x0414 }
            r1 = r21
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0414 }
            android.content.Context r1 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0414 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0414 }
            boolean r4 = X.C241833Rj.A02(r1)     // Catch:{ all -> 0x0414 }
            X.3RT r2 = r15.A00     // Catch:{ all -> 0x0414 }
            java.lang.Object r1 = r2.A00     // Catch:{ all -> 0x0414 }
            if (r1 == 0) goto L_0x02ed
            r2.A00()     // Catch:{ all -> 0x0414 }
            android.content.Context r2 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0414 }
            X.SqD r20 = new X.SqD     // Catch:{ all -> 0x0414 }
            r1 = r20
            r1.<init>(r2, r8, r4)     // Catch:{ all -> 0x0414 }
            java.lang.String r1 = r20.Aws()     // Catch:{ all -> 0x0414 }
            r3.A0A = r1     // Catch:{ all -> 0x0414 }
            android.content.Context r1 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0414 }
            X.Qbt r6 = new X.Qbt     // Catch:{ all -> 0x0414 }
            r6.<init>(r1)     // Catch:{ all -> 0x0414 }
            android.content.Context r4 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x0414 }
            java.lang.String r19 = "rti.mqtt."
            java.lang.Integer r51 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0414 }
            java.lang.String r18 = "analytics"
            r2 = r18
            r1 = r19
            java.lang.String r1 = X.002.A0R(r1, r2)     // Catch:{ all -> 0x0414 }
            X.45J r7 = r8.A00(r4, r1)     // Catch:{ all -> 0x0414 }
            android.content.Context r1 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0414 }
            X.3RA r1 = X.AnonymousClass3RA.A00(r1)     // Catch:{ all -> 0x0414 }
            boolean r1 = r1.A02     // Catch:{ all -> 0x0414 }
            r1 = r1 ^ 1
            r11 = 10000(0x2710, float:1.4013E-41)
            r4 = 1
            r2 = 1
            if (r1 != 0) goto L_0x00e3
            r2 = 10000(0x2710, float:1.4013E-41)
        L_0x00e3:
            X.TiS r9 = r7.AR1()     // Catch:{ all -> 0x0414 }
            java.util.Random r1 = new java.util.Random     // Catch:{ all -> 0x0414 }
            r1.<init>()     // Catch:{ all -> 0x0414 }
            int r1 = r1.nextInt(r11)     // Catch:{ all -> 0x0414 }
            if (r1 < r2) goto L_0x00f3
            r4 = 0
        L_0x00f3:
            X.3RY r10 = X.AnonymousClass3RY.A0C     // Catch:{ all -> 0x0414 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0414 }
            r10.A01(r9, r1)     // Catch:{ all -> 0x0414 }
            X.3RY r2 = X.AnonymousClass3RY.A0B     // Catch:{ all -> 0x0414 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0414 }
            r2.A01(r9, r1)     // Catch:{ all -> 0x0414 }
            java.lang.String r12 = "FbnsServiceDelegate"
            java.util.Map r1 = com.facebook.rti.push.service.FbnsServiceDelegate.A0G     // Catch:{ all -> 0x0414 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0414 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x0414 }
        L_0x0111:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x0414 }
            if (r1 == 0) goto L_0x015f
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x0414 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0414 }
            java.lang.Object r13 = r1.getKey()     // Catch:{ all -> 0x0414 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0414 }
            java.lang.Object r5 = r1.getValue()     // Catch:{ all -> 0x0414 }
            if (r5 == 0) goto L_0x0151
            X.3RZ r1 = r10.A00     // Catch:{ all -> 0x0414 }
            java.lang.Class r1 = r1.A00()     // Catch:{ all -> 0x0414 }
            boolean r1 = r1.isInstance(r5)     // Catch:{ all -> 0x0414 }
            if (r1 != 0) goto L_0x0151
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0414 }
            r1.<init>()     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "Cannot cast"
            r1.append(r0)     // Catch:{ all -> 0x0414 }
            java.lang.Class r0 = r5.getClass()     // Catch:{ all -> 0x0414 }
            r1.append(r0)     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0414 }
            java.lang.ClassCastException r1 = new java.lang.ClassCastException     // Catch:{ all -> 0x0414 }
            r1.<init>(r0)     // Catch:{ all -> 0x0414 }
            goto L_0x02f4
        L_0x0151:
            X.3RZ r4 = r10.A00     // Catch:{ all -> 0x0414 }
            java.lang.String r2 = "LOG_SR"
            java.lang.String r1 = "/"
            java.lang.String r1 = X.002.A0g(r2, r1, r13)     // Catch:{ all -> 0x0414 }
            r4.A03(r9, r5, r1)     // Catch:{ all -> 0x0414 }
            goto L_0x0111
        L_0x015f:
            java.lang.String r1 = "PreferencesManager failed to commit analytics config values"
            r9.AIR(r12, r1)     // Catch:{ all -> 0x0414 }
            r1 = -1
            java.util.concurrent.atomic.AtomicInteger r14 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ all -> 0x0414 }
            r14.<init>(r1)     // Catch:{ all -> 0x0414 }
            r13 = 1
            java.util.concurrent.CountDownLatch r10 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0414 }
            r10.<init>(r13)     // Catch:{ all -> 0x0414 }
            X.3RY r9 = X.AnonymousClass3RY.A0A     // Catch:{ all -> 0x0414 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0414 }
            X.Spp r4 = new X.Spp     // Catch:{ all -> 0x0414 }
            r4.<init>(r10, r14)     // Catch:{ all -> 0x0414 }
            X.3RZ r2 = r9.A00     // Catch:{ all -> 0x0414 }
            java.lang.Class r1 = r2.A00()     // Catch:{ all -> 0x0414 }
            boolean r1 = r1.isInstance(r5)     // Catch:{ all -> 0x0414 }
            if (r1 == 0) goto L_0x02d2
            java.lang.String r1 = "logging_health_stats_sample_rate"
            r2.A04(r4, r7, r5, r1)     // Catch:{ all -> 0x0414 }
            java.lang.String r2 = "Waiting for current health sample rate fetch in initHealthStatsAnalytics was interrupted"
            r4 = 5
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0196 }
            r10.await(r4, r1)     // Catch:{ InterruptedException -> 0x0196 }
            goto L_0x019a
        L_0x0196:
            r1 = move-exception
            X.0KC.A0F(r12, r2, r1)     // Catch:{ all -> 0x0414 }
        L_0x019a:
            int r10 = r14.get()     // Catch:{ all -> 0x0414 }
            if (r10 < 0) goto L_0x01a2
            if (r10 <= r11) goto L_0x01c6
        L_0x01a2:
            android.content.Context r1 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0414 }
            X.3RA r1 = X.AnonymousClass3RA.A00(r1)     // Catch:{ all -> 0x0414 }
            boolean r1 = r1.A02     // Catch:{ all -> 0x0414 }
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x01b5
            r13 = 10000(0x2710, float:1.4013E-41)
        L_0x01b5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0414 }
            X.TiS r2 = r7.AR1()     // Catch:{ all -> 0x0414 }
            r9.A01(r2, r1)     // Catch:{ all -> 0x0414 }
            java.lang.String r1 = "PreferencesManager failed to commit health stats sampling rate"
            r2.AIR(r12, r1)     // Catch:{ all -> 0x0414 }
            r10 = r13
        L_0x01c6:
            r1 = -1
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0414 }
            r9.<init>(r1)     // Catch:{ all -> 0x0414 }
            r17 = 1
            java.util.concurrent.CountDownLatch r13 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0414 }
            r1 = r17
            r13.<init>(r1)     // Catch:{ all -> 0x0414 }
            java.lang.String r14 = "fb_uid"
            java.lang.String r2 = ""
            r1 = r7
            X.45I r1 = (X.AnonymousClass45I) r1     // Catch:{ all -> 0x0414 }
            java.lang.String r1 = r1.getString(r14, r2)     // Catch:{ all -> 0x0414 }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x01e8 }
            r9.set(r1)     // Catch:{ NumberFormatException -> 0x01e8 }
        L_0x01e8:
            r13.countDown()     // Catch:{ all -> 0x0414 }
            java.lang.String r2 = "Waiting for logger user id fetch was interrupted"
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x01f3 }
            r13.await(r4, r1)     // Catch:{ InterruptedException -> 0x01f3 }
            goto L_0x01f7
        L_0x01f3:
            r1 = move-exception
            X.0KC.A0F(r12, r2, r1)     // Catch:{ all -> 0x0414 }
        L_0x01f7:
            long r1 = r9.get()     // Catch:{ all -> 0x0414 }
            java.lang.Long r52 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0414 }
            X.RQH r1 = new X.RQH     // Catch:{ all -> 0x0414 }
            r1.<init>()     // Catch:{ all -> 0x0414 }
            r1.A00 = r7     // Catch:{ all -> 0x0414 }
            r3.A07 = r1     // Catch:{ all -> 0x0414 }
            java.util.Random r1 = new java.util.Random     // Catch:{ all -> 0x0414 }
            r1.<init>()     // Catch:{ all -> 0x0414 }
            int r1 = r1.nextInt(r11)     // Catch:{ all -> 0x0414 }
            r4 = 0
            if (r1 >= r10) goto L_0x0215
            r4 = 1
        L_0x0215:
            X.3RT r2 = r15.A02     // Catch:{ all -> 0x0414 }
            java.lang.Object r1 = r2.A00     // Catch:{ all -> 0x0414 }
            if (r1 == 0) goto L_0x02ca
            java.lang.Object r1 = r2.A00()     // Catch:{ all -> 0x0414 }
            X.3RQ r1 = (X.AnonymousClass3RQ) r1     // Catch:{ all -> 0x0414 }
            android.content.Context r5 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x0414 }
            r1.A00 = r4     // Catch:{ all -> 0x0414 }
            java.util.concurrent.Executor r2 = X.SHT.A04     // Catch:{ all -> 0x0414 }
            java.lang.String r12 = "MQTT"
            X.Sq0 r2 = new X.Sq0     // Catch:{ all -> 0x0414 }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x0414 }
            X.SHT r9 = new X.SHT     // Catch:{ all -> 0x0414 }
            r9.<init>(r5, r2)     // Catch:{ all -> 0x0414 }
            X.3RA r10 = X.AnonymousClass3RA.A00(r5)     // Catch:{ all -> 0x0414 }
            X.SHM r16 = new X.SHM     // Catch:{ all -> 0x0414 }
            r4 = r22
            r2 = r16
            r2.<init>(r5, r10, r12, r4)     // Catch:{ all -> 0x0414 }
            java.lang.String r11 = r20.Aws()     // Catch:{ all -> 0x0414 }
            android.content.Context r14 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r14)     // Catch:{ all -> 0x0414 }
            X.RQG r13 = new X.RQG     // Catch:{ all -> 0x0414 }
            r13.<init>()     // Catch:{ all -> 0x0414 }
            r13.A00 = r7     // Catch:{ all -> 0x0414 }
            java.lang.String r37 = X.C9560Rcx.A00(r51)     // Catch:{ all -> 0x0414 }
            X.Spz r5 = new X.Spz     // Catch:{ all -> 0x0414 }
            r5.<init>(r6, r3)     // Catch:{ all -> 0x0414 }
            X.TO6 r2 = X.C12231Spl.A0E     // Catch:{ all -> 0x0414 }
            X.3RA r10 = X.AnonymousClass3RA.A00(r14)     // Catch:{ all -> 0x0414 }
            X.SHM r4 = new X.SHM     // Catch:{ all -> 0x0414 }
            r2 = r22
            r4.<init>(r14, r10, r12, r2)     // Catch:{ all -> 0x0414 }
            X.Spt r2 = new X.Spt     // Catch:{ all -> 0x0414 }
            r2.<init>(r11)     // Catch:{ all -> 0x0414 }
            java.lang.String r38 = r4.A01()     // Catch:{ all -> 0x0414 }
            java.lang.String r11 = r10.A01     // Catch:{ all -> 0x0414 }
            java.lang.String r4 = r10.A00     // Catch:{ all -> 0x0414 }
            X.Spl r30 = new X.Spl     // Catch:{ all -> 0x0414 }
            r31 = r14
            r32 = r9
            r33 = r7
            r34 = r5
            r35 = r2
            r36 = r13
            r39 = r11
            r40 = r4
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0414 }
            X.S3t r2 = new X.S3t     // Catch:{ all -> 0x0414 }
            r2.<init>(r9)     // Catch:{ all -> 0x0414 }
            r3.A09 = r2     // Catch:{ all -> 0x0414 }
            android.content.Context r5 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x0414 }
            java.lang.String r4 = "ids"
            r2 = r19
            java.lang.String r2 = X.002.A0R(r2, r4)     // Catch:{ all -> 0x0414 }
            X.45J r2 = r8.A00(r5, r2)     // Catch:{ all -> 0x0414 }
            X.Rd1 r47 = new X.Rd1     // Catch:{ all -> 0x0414 }
            r47.<init>()     // Catch:{ all -> 0x0414 }
            X.Rd2 r48 = new X.Rd2     // Catch:{ all -> 0x0414 }
            r48.<init>()     // Catch:{ all -> 0x0414 }
            android.content.Context r28 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r28)     // Catch:{ all -> 0x0414 }
            android.content.Context r4 = r27.getApplicationContext()     // Catch:{ all -> 0x0414 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x0414 }
            boolean r5 = X.C9555Rcs.A00(r4)     // Catch:{ all -> 0x0414 }
            r4 = 0
            if (r5 == 0) goto L_0x02f5
            r4 = 1
            goto L_0x02f5
        L_0x02ca:
            java.lang.String r0 = "IMqttStatsLogSwitcher not bound in FBNS Config Manager"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0414 }
            r1.<init>(r0)     // Catch:{ all -> 0x0414 }
            goto L_0x02f4
        L_0x02d2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0414 }
            r1.<init>()     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "Cannot cast"
            r1.append(r0)     // Catch:{ all -> 0x0414 }
            java.lang.Class r0 = r5.getClass()     // Catch:{ all -> 0x0414 }
            r1.append(r0)     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0414 }
            java.lang.ClassCastException r1 = new java.lang.ClassCastException     // Catch:{ all -> 0x0414 }
            r1.<init>(r0)     // Catch:{ all -> 0x0414 }
            goto L_0x02f4
        L_0x02ed:
            java.lang.String r0 = "MqttIdManagerBuilder not bound in Fbns Config Manager"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0414 }
            r1.<init>(r0)     // Catch:{ all -> 0x0414 }
        L_0x02f4:
            throw r1     // Catch:{ all -> 0x0414 }
        L_0x02f5:
            X.ST9 r10 = new X.ST9     // Catch:{ all -> 0x0414 }
            r10.<init>(r4)     // Catch:{ all -> 0x0414 }
            X.TiD r13 = r3.A0D     // Catch:{ all -> 0x0414 }
            X.Sq8 r9 = new X.Sq8     // Catch:{ all -> 0x0414 }
            r9.<init>(r2)     // Catch:{ all -> 0x0414 }
            X.44q r49 = new X.44q     // Catch:{ all -> 0x0414 }
            r49.<init>()     // Catch:{ all -> 0x0414 }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0414 }
            android.os.Handler r7 = new android.os.Handler     // Catch:{ all -> 0x0414 }
            r7.<init>(r2)     // Catch:{ all -> 0x0414 }
            X.Rcr r31 = new X.Rcr     // Catch:{ all -> 0x0414 }
            r31.<init>()     // Catch:{ all -> 0x0414 }
            X.Spm r12 = r3.A03     // Catch:{ all -> 0x0414 }
            X.SFM r4 = r3.A0C     // Catch:{ all -> 0x0414 }
            X.452 r2 = r4.A02     // Catch:{ all -> 0x0414 }
            if (r2 != 0) goto L_0x031e
            r4.A02 = r6     // Catch:{ all -> 0x0414 }
        L_0x031e:
            X.Td3 r11 = r3.A0B     // Catch:{ all -> 0x0414 }
            X.RxM r46 = new X.RxM     // Catch:{ all -> 0x0414 }
            r46.<init>()     // Catch:{ all -> 0x0414 }
            X.Qbl r5 = new X.Qbl     // Catch:{ all -> 0x0414 }
            r5.<init>(r1)     // Catch:{ all -> 0x0414 }
            X.SDb r4 = new X.SDb     // Catch:{ all -> 0x0414 }
            r4.<init>(r3)     // Catch:{ all -> 0x0414 }
            X.Qc0 r2 = new X.Qc0     // Catch:{ all -> 0x0414 }
            r2.<init>()     // Catch:{ all -> 0x0414 }
            X.RzM r1 = new X.RzM     // Catch:{ all -> 0x0414 }
            r27 = r1
            r29 = r7
            r32 = r5
            r33 = r12
            r34 = r8
            r35 = r22
            r36 = r25
            r37 = r23
            r38 = r24
            r39 = r23
            r40 = r6
            r41 = r9
            r42 = r11
            r43 = r13
            r44 = r10
            r45 = r20
            r50 = r4
            r53 = r22
            r54 = r22
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)     // Catch:{ all -> 0x0414 }
            X.Rd6 r14 = new X.Rd6     // Catch:{ all -> 0x0414 }
            r14.<init>()     // Catch:{ all -> 0x0414 }
            r3 = r21
            r2.A00 = r3     // Catch:{ all -> 0x0414 }
            android.content.Context r6 = r1.A00     // Catch:{ all -> 0x0414 }
            X.3RV r8 = r15.A02()     // Catch:{ all -> 0x0414 }
            X.Rrq r5 = new X.Rrq     // Catch:{ all -> 0x0414 }
            r5.<init>(r6, r8)     // Catch:{ all -> 0x0414 }
            java.util.List r4 = com.facebook.rti.push.service.FbnsServiceDelegate.A0F     // Catch:{ all -> 0x0414 }
            X.Qbl r3 = new X.Qbl     // Catch:{ all -> 0x0414 }
            r3.<init>(r5)     // Catch:{ all -> 0x0414 }
            r2.A00(r3, r1, r4)     // Catch:{ all -> 0x0414 }
            r3 = r18
            r1 = r19
            java.lang.String r1 = X.002.A0R(r1, r3)     // Catch:{ all -> 0x0414 }
            X.45J r10 = r8.A00(r6, r1)     // Catch:{ all -> 0x0414 }
            X.458 r4 = r2.A05     // Catch:{ all -> 0x0414 }
            X.3RA r3 = r2.A06     // Catch:{ all -> 0x0414 }
            X.SRS r1 = new X.SRS     // Catch:{ all -> 0x0414 }
            r1.<init>(r6, r8, r4, r3)     // Catch:{ all -> 0x0414 }
            r2.A03 = r1     // Catch:{ all -> 0x0414 }
            X.S1p r7 = r2.A08     // Catch:{ all -> 0x0414 }
            com.facebook.rti.common.time.RealtimeSinceBootClock r5 = r2.A04     // Catch:{ all -> 0x0414 }
            X.3Rv r4 = r2.A00     // Catch:{ all -> 0x0414 }
            X.3RB r3 = r2.A07     // Catch:{ all -> 0x0414 }
            X.S3T r1 = new X.S3T     // Catch:{ all -> 0x0414 }
            r27 = r1
            r28 = r6
            r29 = r4
            r30 = r8
            r31 = r5
            r32 = r3
            r33 = r7
            r27.<init>(r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0414 }
            r2.A02 = r1     // Catch:{ all -> 0x0414 }
            X.SJJ r5 = r2.A0I     // Catch:{ all -> 0x0414 }
            com.facebook.rti.common.time.RealtimeSinceBootClock r4 = r2.A04     // Catch:{ all -> 0x0414 }
            X.42n r3 = r2.A01     // Catch:{ all -> 0x0414 }
            X.S4y r1 = new X.S4y     // Catch:{ all -> 0x0414 }
            r7 = r1
            r8 = r6
            r9 = r3
            r11 = r4
            r12 = r16
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0414 }
            r2.A01 = r1     // Catch:{ all -> 0x0414 }
            r0.A0A = r2     // Catch:{ all -> 0x0414 }
            r0.A0N()     // Catch:{ all -> 0x0414 }
            r0.A0M()     // Catch:{ all -> 0x0414 }
            X.TjG r2 = r0.A01     // Catch:{ all -> 0x0414 }
            X.Ros r1 = new X.Ros     // Catch:{ all -> 0x0414 }
            r1.<init>(r0)     // Catch:{ all -> 0x0414 }
            X.Spm r2 = (X.C12232Spm) r2     // Catch:{ all -> 0x0414 }
            r2.A01 = r1     // Catch:{ all -> 0x0414 }
            java.lang.String r1 = "doCreate"
            com.facebook.rti.mqtt.manager.MqttPushServiceDelegate.A06(r0, r1)     // Catch:{ all -> 0x0414 }
            X.SRZ r3 = r0.A0E     // Catch:{ all -> 0x0414 }
            java.lang.String r2 = X.C9560Rcx.A00(r51)     // Catch:{ all -> 0x0414 }
            java.lang.String r1 = ".SERVICE_CREATE"
            java.lang.String r4 = X.002.A0R(r2, r1)     // Catch:{ all -> 0x0414 }
            X.Qbk r2 = X.C7860Qbk.A00     // Catch:{ all -> 0x0414 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0B     // Catch:{ all -> 0x0414 }
            boolean r8 = r1.get()     // Catch:{ all -> 0x0414 }
            X.SJJ r1 = r0.A06     // Catch:{ all -> 0x0414 }
            java.util.concurrent.atomic.AtomicLong r1 = r1.A06     // Catch:{ all -> 0x0414 }
            long r6 = r1.get()     // Catch:{ all -> 0x0414 }
            X.SJJ r0 = r0.A06     // Catch:{ all -> 0x0414 }
            android.net.NetworkInfo r1 = r0.A02()     // Catch:{ all -> 0x0414 }
            r0 = r3
            r3 = r2
            r5 = r22
            r0.A02(r1, r2, r3, r4, r5, r6, r8)     // Catch:{ all -> 0x0414 }
            r1 = r17
            r0 = r55
            r0.A00 = r1     // Catch:{ all -> 0x0414 }
        L_0x040c:
            monitor-exit(r26)     // Catch:{ all -> 0x0414 }
            r0 = 282297691(0x10d3855b, float:8.343029E-29)
            X.0fh.A00(r0)
            return
        L_0x0414:
            r0 = move-exception
            monitor-exit(r26)     // Catch:{ all -> 0x0414 }
            throw r0     // Catch:{ all -> 0x0417 }
        L_0x0417:
            r1 = move-exception
            r0 = 1268921199(0x4ba2336f, float:2.1259998E7)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate.A0G():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0106, code lost:
        if (r1 != null) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(int r18, int r19, android.content.Intent r20) {
        /*
            r17 = this;
            r3 = r20
            r5 = r17
            com.facebook.rti.mqtt.manager.MqttPushServiceDelegate r5 = (com.facebook.rti.mqtt.manager.MqttPushServiceDelegate) r5
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            if (r20 != 0) goto L_0x00f7
            r1 = 0
            java.lang.String r0 = "intent"
        L_0x0010:
            r2.put(r0, r1)
        L_0x0013:
            X.TjG r1 = r5.A01
            java.lang.String r0 = "start_command"
            r1.Cgl(r0, r2)
            r11 = r5
            com.facebook.rti.push.service.FbnsServiceDelegate r11 = (com.facebook.rti.push.service.FbnsServiceDelegate) r11
            if (r20 == 0) goto L_0x003e
            java.lang.String r2 = X.C241903Rv.A00(r3)
            X.00f r0 = r11.A01
            android.content.Context r0 = r0.getApplicationContext()
            X.0qQ.A07(r0)
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x003e
            X.S3t r1 = r11.A09
            java.lang.String r0 = "verify_sender_failed"
            r1.A00(r0, r2)
            r3 = 0
        L_0x003e:
            r1 = r18
            r0 = r19
            X.3Ri r4 = r5.A0K(r3, r1, r0)
            if (r3 == 0) goto L_0x0094
            java.lang.String r1 = r3.getAction()
            java.lang.String r0 = "Orca.PERSISTENT_KICK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = r3.getAction()
            java.lang.String r0 = "Orca.FORCE_KICK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = r3.getAction()
            java.lang.String r0 = "Orca.PERSISTENT_KICK_SKIP_PING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = r3.getAction()
            java.lang.String r0 = "Orca.STOP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x010d
            X.RGw r0 = X.C8947RGw.SERVICE_STOP
            r5.A0L(r0)
            X.00f r0 = r5.A01
            r0.A04()
        L_0x0082:
            return
        L_0x0083:
            java.lang.String r0 = r3.getAction()
            if (r0 == 0) goto L_0x0094
            java.lang.String r1 = r3.getAction()
            java.lang.String r0 = "Orca.FORCE_KICK"
            boolean r1 = r0.equals(r1)
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0B
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00a2
            if (r3 != 0) goto L_0x010a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0117
        L_0x00a2:
            if (r1 == 0) goto L_0x00ac
            java.lang.Integer r1 = X.AnonymousClass05K.A08
        L_0x00a6:
            X.ST9 r0 = r5.A09
            r0.A0E(r1)
            return
        L_0x00ac:
            boolean r0 = r5.A0T()
            if (r0 == 0) goto L_0x00e4
            X.ST9 r0 = r5.A09
            X.ST3 r0 = r0.A0w
            if (r0 == 0) goto L_0x00e4
            java.lang.Integer r1 = r0.A0Y
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00e4
            if (r3 == 0) goto L_0x0082
            java.lang.String r1 = r3.getAction()
            java.lang.String r0 = "Orca.PERSISTENT_KICK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0082
            X.ST9 r6 = r5.A09
            java.lang.String r7 = r4.A03
            X.452 r0 = r6.A0E
            X.453 r0 = r0.A00()
            int r3 = r0.A0F
            if (r3 < 0) goto L_0x0082
            X.ST3 r2 = r6.A0w
            if (r2 == 0) goto L_0x0082
            long r4 = android.os.SystemClock.elapsedRealtime()
            monitor-enter(r2)
            goto L_0x00e7
        L_0x00e4:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x00a6
        L_0x00e7:
            long r0 = r2.A0R     // Catch:{ all -> 0x02c8 }
            monitor-exit(r2)
            long r4 = r4 - r0
            long r2 = (long) r3
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            r6.A0F(r7)
            return
        L_0x00f7:
            java.lang.String r1 = r3.getAction()
            java.lang.String r0 = "action"
            r2.put(r0, r1)
            java.lang.String r0 = "caller"
            java.lang.String r1 = r3.getStringExtra(r0)
            if (r1 == 0) goto L_0x0013
            goto L_0x0010
        L_0x010a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0117
        L_0x010d:
            java.lang.String r0 = "Orca.START"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011b
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0117:
            r5.A0S(r4, r0)
            return
        L_0x011b:
            java.lang.String r0 = "Orca.EXPIRE_CONNECTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0146
            X.ST9 r7 = r5.A09
            long r4 = r4.A00
            X.ST3 r6 = r7.A0w
            X.ST2 r0 = r7.A0D
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            r0.A0F = r3
            if (r6 == 0) goto L_0x0142
            long r1 = r6.A0V
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0142
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            X.RGw r0 = X.C8947RGw.EXPIRE_CONNECTION
            r7.A07(r6, r0, r1)
            X.ST9.A03(r7)
            return
        L_0x0142:
            r7.A0D(r3)
            return
        L_0x0146:
            java.lang.String r9 = r3.getAction()
            java.lang.String r5 = "appid"
            java.lang.String r14 = r3.getStringExtra(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L_0x0158
            java.lang.String r14 = ""
        L_0x0158:
            r0 = 198(0xc6, float:2.77E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r1 = r0.equals(r9)
            java.lang.String r8 = "com.facebook.rti.fbns.intent.REGISTER_RETRY"
            java.lang.String r7 = "com.facebook.rti.fbns.intent.UNREGISTER"
            if (r1 != 0) goto L_0x0174
            boolean r1 = r8.equals(r9)
            if (r1 != 0) goto L_0x0174
            boolean r1 = r7.equals(r9)
            if (r1 == 0) goto L_0x01e6
        L_0x0174:
            java.lang.String r1 = "pkg_name"
            java.lang.String r13 = r3.getStringExtra(r1)
            java.lang.String r6 = X.C241903Rv.A00(r3)
            boolean r1 = r7.equals(r9)
            if (r1 == 0) goto L_0x01e3
            java.lang.String r12 = "unreg_fail"
        L_0x0186:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            java.lang.String r2 = " from "
            if (r1 == 0) goto L_0x01af
            java.lang.String r0 = "Empty package name for "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r9)
            r3.append(r2)
            r3.append(r6)
        L_0x019e:
            java.lang.String r15 = r3.toString()
            java.lang.String r0 = "FbnsServiceDelegate"
            X.0KC.A0D(r0, r15)
            java.util.Map r16 = java.util.Collections.emptyMap()
            com.facebook.rti.push.service.FbnsServiceDelegate.A02(r11, r12, r13, r14, r15, r16)
            return
        L_0x01af:
            boolean r1 = r8.equals(r9)
            if (r1 == 0) goto L_0x01e1
            X.00f r1 = r11.A01
            android.content.Context r1 = r1.getApplicationContext()
            X.0qQ.A07(r1)
            java.lang.String r1 = r1.getPackageName()
        L_0x01c2:
            boolean r10 = r1.equals(r6)
            if (r10 != 0) goto L_0x01e6
            java.lang.String r0 = "Package mismatch for "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r9)
            r3.append(r2)
            r3.append(r6)
            java.lang.String r0 = ": packageName "
            r3.append(r0)
            r3.append(r1)
            goto L_0x019e
        L_0x01e1:
            r1 = r13
            goto L_0x01c2
        L_0x01e3:
            java.lang.String r12 = "reg_fail"
            goto L_0x0186
        L_0x01e6:
            java.lang.String r1 = r3.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x022b
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            r11.A0S(r4, r0)
            r11.A0V(r3)
        L_0x01f8:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.00f r0 = r11.A01
            android.content.Context r0 = r0.getApplicationContext()
            X.0qQ.A07(r0)
            X.C241833Rj.A01(r0, r4, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r11.A0c(r2)
            X.ST2 r1 = r11.A05
            java.lang.String r0 = X.ST2.A02(r4)
            r1.A0K = r0
            java.lang.String r0 = X.ST2.A02(r3)
            r1.A0H = r0
            java.lang.String r0 = X.ST2.A02(r2)
            r1.A0J = r0
            return
        L_0x022b:
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x024f
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            r11.A0S(r4, r0)
            java.lang.String r0 = "pkg_name"
            java.lang.String r13 = r3.getStringExtra(r0)
            java.lang.String r14 = r3.getStringExtra(r5)
            r11.A0b(r13, r14)
            java.util.HashMap r16 = new java.util.HashMap
            r16.<init>()
            java.lang.String r12 = "reg_retry_legacy"
            r15 = 0
            com.facebook.rti.push.service.FbnsServiceDelegate.A02(r11, r12, r13, r14, r15, r16)
            goto L_0x01f8
        L_0x024f:
            boolean r0 = r7.equals(r1)
            if (r0 == 0) goto L_0x02c0
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            r11.A0S(r4, r0)
            java.lang.String r0 = "pkg_name"
            java.lang.String r3 = r3.getStringExtra(r0)
            X.SRS r1 = r11.A08
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r0 = r0 ^ 1
            X.S9L.A00(r0)
            X.45J r4 = X.SRS.A01(r1)
            java.lang.String r2 = ""
            r1 = r4
            X.45I r1 = (X.AnonymousClass45I) r1
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.String r1 = r1.getString(r3, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0299
            X.SHZ r1 = X.SHZ.A00(r1)     // Catch:{ JSONException -> 0x0291 }
            boolean r0 = r1.A04     // Catch:{ JSONException -> 0x0291 }
            if (r0 != 0) goto L_0x0299
            r0 = 1
            r1.A04 = r0     // Catch:{ JSONException -> 0x0291 }
            X.SRS.A02(r4, r1, r3)     // Catch:{ JSONException -> 0x0291 }
            goto L_0x0299
        L_0x0291:
            r2 = move-exception
            java.lang.String r1 = "RegistrationState"
            java.lang.String r0 = "Parse failed"
            X.0KC.A0G(r1, r0, r2)
        L_0x0299:
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.String r2 = X.C66579MXk.A00(r0)
            java.lang.String r0 = "com.facebook.rti.fbns.intent.RECEIVE"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            r1.setPackage(r3)
            r1.addCategory(r3)
            java.lang.String r0 = "receive_type"
            r1.putExtra(r0, r2)
            r11.A0W(r1)
            X.SRS r1 = r11.A08
            X.SqP r0 = new X.SqP
            r0.<init>(r11, r3)
            r1.A06(r0, r3)
            goto L_0x01f8
        L_0x02c0:
            java.lang.String r1 = "FbnsServiceDelegate"
            java.lang.String r0 = "service/doIntent/unrecognized_action"
            X.0KC.A0C(r1, r0)
            return
        L_0x02c8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate.A0I(int, int, android.content.Intent):void");
    }

    public MqttBackgroundServiceDelegate(00f r2) {
        super(r2);
    }

    public final void A0A(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        A0G();
        A0J(fileDescriptor, printWriter, strArr);
    }

    public void A0C() {
        MqttBackgroundServiceDelegate.super.A0C();
        this.A02 = new UU0(Looper.getMainLooper(), this);
        this.A02.A01();
    }
}
