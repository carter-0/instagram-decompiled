package X;

public final class TGH implements Runnable {
    public final /* synthetic */ C10416Rrs A00;
    public final /* synthetic */ C11376SQm A01;

    public TGH(C10416Rrs rrs, C11376SQm sQm) {
        this.A00 = rrs;
        this.A01 = sQm;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fc, code lost:
        if (r4.A0g != false) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r8 = r18
            X.Rrs r0 = r8.A00
            X.ST9 r4 = r0.A01
            r6 = 0
            X.ST3 r5 = r0.A00
            X.ST3 r0 = r4.A0w
            if (r0 != r5) goto L_0x0250
            X.SQm r3 = r8.A01
            X.T9D r2 = r3.A02
            boolean r0 = r2 instanceof X.C7860Qbk
            if (r0 == 0) goto L_0x0088
            r0 = 0
        L_0x0016:
            r7 = 0
            if (r0 == 0) goto L_0x0085
            X.ThS r1 = r4.A0I
            java.lang.Object r0 = r2.A01()
            X.42j r0 = (X.C2596142j) r0
            boolean r16 = r1.FJS(r0)
        L_0x0025:
            java.lang.String r0 = r4.A0Y
            boolean r0 = X.C241833Rj.A02(r0)
            if (r0 != 0) goto L_0x0041
            X.T9D r2 = r3.A03
            boolean r0 = r2 instanceof X.C7860Qbk
            if (r0 != 0) goto L_0x0041
            X.TiJ r1 = r4.A0R
            java.lang.Object r0 = r2.A01()
            X.TaU r0 = (X.C13441TaU) r0
            boolean r0 = r1.FJT(r0)
            r16 = r16 | r0
        L_0x0041:
            java.lang.String r2 = r4.A0Y
            X.C241833Rj.A02(r2)
            X.T9D r1 = r4.A06
            boolean r0 = r1 instanceof X.C7860Qbk
            if (r0 != 0) goto L_0x00dc
            boolean r0 = X.C241833Rj.A02(r2)
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r1.A01()
            X.Rrq r0 = (X.C10414Rrq) r0
            java.lang.String r14 = "MQTT"
            r2 = 0
            X.3RV r3 = r0.A01
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "fbns_state"
            X.45J r3 = X.Pxf.A0N(r1, r3, r0)
            X.0qQ.A0B(r3, r7)
            java.util.concurrent.atomic.AtomicBoolean r12 = new java.util.concurrent.atomic.AtomicBoolean
            r12.<init>(r7)
            r15 = 1
            java.util.concurrent.CountDownLatch r11 = new java.util.concurrent.CountDownLatch
            r11.<init>(r15)
            java.lang.String r13 = "gateway_type"
            r10 = r3
            X.45I r10 = (X.AnonymousClass45I) r10
            boolean r0 = r10.contains(r13)
            r12.set(r0)
            r11.countDown()
            r0 = 5
            goto L_0x008a
        L_0x0085:
            r16 = 0
            goto L_0x0025
        L_0x0088:
            r0 = 1
            goto L_0x0016
        L_0x008a:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x008f }
            r11.await(r0, r9)     // Catch:{ InterruptedException -> 0x008f }
        L_0x008f:
            boolean r9 = r12.get()
            if (r9 == 0) goto L_0x00c7
            java.util.concurrent.atomic.AtomicBoolean r12 = new java.util.concurrent.atomic.AtomicBoolean
            r12.<init>(r7)
            java.util.concurrent.CountDownLatch r11 = new java.util.concurrent.CountDownLatch
            r11.<init>(r15)
            java.lang.String r2 = ""
            java.lang.String r2 = r10.getString(r13, r2)
            boolean r2 = r14.equals(r2)
            r10 = r2 ^ 1
            if (r10 == 0) goto L_0x00bb
            X.TiS r9 = r3.AR1()
            r9.E5e(r13, r14)
            java.lang.String r3 = "FbnsGatewayTypeManager"
            java.lang.String r2 = "Failed to save gateway type in preferences"
            r9.AIR(r3, r2)
        L_0x00bb:
            r12.set(r10)
            r11.countDown()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00d6 }
            r11.await(r0, r2)     // Catch:{ InterruptedException -> 0x00d6 }
            goto L_0x00d6
        L_0x00c7:
            X.TiS r3 = r3.AR1()
            r3.E5e(r13, r14)
            java.lang.String r1 = "FbnsGatewayTypeManager"
            java.lang.String r0 = "Failed to save gateway type in preferences"
            r3.AIR(r1, r0)
            goto L_0x00da
        L_0x00d6:
            boolean r2 = r12.get()
        L_0x00da:
            r16 = r16 | r2
        L_0x00dc:
            if (r16 == 0) goto L_0x00e7
            X.TiD r0 = r4.A0M
            r0.D7E()
        L_0x00e3:
            java.util.Map r3 = r4.A0Z
            monitor-enter(r3)
            goto L_0x0108
        L_0x00e7:
            java.lang.String r0 = r4.A0Y
            boolean r0 = X.C241833Rj.A02(r0)
            if (r0 == 0) goto L_0x00e3
            X.TiJ r2 = r4.A0R
            android.content.Context r0 = r4.A04
            boolean r0 = X.C9555Rcs.A00(r0)
            if (r0 != 0) goto L_0x00fe
            boolean r0 = r4.A0g
            r1 = 0
            if (r0 == 0) goto L_0x00ff
        L_0x00fe:
            r1 = 1
        L_0x00ff:
            X.Ror r0 = new X.Ror
            r0.<init>(r8)
            r2.EaV(r0, r1)
            goto L_0x00e3
        L_0x0108:
            android.util.Pair r2 = r4.A05()     // Catch:{ all -> 0x0246 }
            if (r2 == 0) goto L_0x0118
            java.util.concurrent.Executor r1 = r4.A0a     // Catch:{ all -> 0x0246 }
            X.TGG r0 = new X.TGG     // Catch:{ all -> 0x0246 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x0246 }
            r1.execute(r0)     // Catch:{ all -> 0x0246 }
        L_0x0118:
            monitor-exit(r3)     // Catch:{ all -> 0x0246 }
            r4.A09()
            X.ST2 r8 = r4.A0D
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.concurrent.atomic.AtomicLong r2 = r4.A0r
            long r2 = r2.get()
            long r0 = r0 - r2
            java.lang.Class<X.Qbm> r2 = X.C7862Qbm.class
            X.TaT r9 = r8.A05(r2)
            X.Sq3 r9 = (X.C12249Sq3) r9
            X.RJ1 r3 = X.RJ1.A06
            X.C12249Sq3.A00(r3, r9)
            X.RJ1 r3 = X.RJ1.A04
            java.lang.Object r3 = r9.A01(r3)
            java.util.concurrent.atomic.AtomicLong r3 = (java.util.concurrent.atomic.AtomicLong) r3
            r3.set(r0)
            X.S3D r0 = r8.A00
            java.util.concurrent.atomic.AtomicLong r3 = r0.A01
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.set(r0)
            X.SES r3 = X.SES.A02
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A00 = r0
            java.lang.System.currentTimeMillis()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A00 = r0
            java.lang.System.currentTimeMillis()
            X.RqX r0 = r8.A01
            java.util.List r8 = r0.A00
            monitor-enter(r8)
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x0243 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x017a
            r1.next()     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = "onMqttNetworkConnectionSuccess"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ all -> 0x0243 }
            throw r0     // Catch:{ all -> 0x0243 }
        L_0x017a:
            monitor-exit(r8)
            X.3RQ r0 = r4.A07
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x01d2
            X.ST2 r3 = r4.A0D
            X.Qbn r11 = X.ST2.A00(r3)
            X.TaT r9 = r3.A05(r2)
            X.Qbm r9 = (X.C7862Qbm) r9
            X.S3D r1 = r3.A00
            r0 = 1
            X.RwE r8 = r1.A00(r0)
            java.lang.Class<X.Qbq> r0 = X.C7866Qbq.class
            X.TaT r10 = r3.A05(r0)
            X.Qbq r10 = (X.C7866Qbq) r10
            java.lang.Class<X.Qbs> r0 = X.C7868Qbs.class
            X.TaT r0 = r3.A05(r0)
            X.Qbs r0 = (X.C7868Qbs) r0
            r13 = r6
            r14 = r6
            r15 = r0
            r16 = r7
            r17 = r7
            r12 = r6
            org.json.JSONObject r0 = X.C9559Rcw.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ JSONException -> 0x01b5 }
            java.lang.String r8 = r0.toString()     // Catch:{ JSONException -> 0x01b5 }
            goto L_0x01b7
        L_0x01b5:
            java.lang.String r8 = ""
        L_0x01b7:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x01d2
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ 3Rq -> 0x01d2 }
            java.lang.String r1 = "/mqtt_health_stats"
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r8.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x01cb }
            r4.A04(r6, r3, r1, r0)     // Catch:{ 3Rq -> 0x01d2 }
            goto L_0x01d2
        L_0x01cb:
            java.lang.String r0 = "UTF-8 not supported"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ 3Rq -> 0x01d2 }
            throw r0     // Catch:{ 3Rq -> 0x01d2 }
        L_0x01d2:
            X.ST2 r0 = r4.A0D
            X.TaT r1 = r0.A05(r2)
            X.Sq3 r1 = (X.C12249Sq3) r1
            X.RJ1 r0 = X.RJ1.A07
            r1.A03(r0, r6)
            X.TiD r0 = r4.A0M
            r0.D5k()
            long r9 = android.os.SystemClock.elapsedRealtime()
            X.SHw r2 = r4.A0V
            long r0 = r2.A02
            long r9 = r9 - r0
            X.SRZ r8 = r4.A0C
            int r0 = r2.A01
            java.lang.String r3 = "retry_count"
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "retry_duration_ms"
            java.lang.String r0 = java.lang.String.valueOf(r9)
            java.lang.String[] r0 = new java.lang.String[]{r3, r2, r1, r0}
            java.util.HashMap r2 = X.S9J.A01(r0)
            java.lang.String r1 = "mqtt_connection_retries"
            r8.A06(r1, r2)
            X.TjG r0 = r8.A01
            if (r0 == 0) goto L_0x0214
            r0.Cgl(r1, r2)
        L_0x0214:
            r4.A0h = r7
            r8 = r5
            monitor-enter(r8)
            java.util.List r2 = r5.A01     // Catch:{ all -> 0x0243 }
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0K     // Catch:{ all -> 0x0243 }
            int r1 = r0.incrementAndGet()     // Catch:{ all -> 0x0243 }
            r0 = 1
            if (r1 <= r0) goto L_0x0239
            X.Rrs r3 = r5.A0X     // Catch:{ all -> 0x0243 }
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ all -> 0x0243 }
            r2.<init>()     // Catch:{ all -> 0x0243 }
        L_0x022a:
            X.ST9 r0 = r3.A01     // Catch:{ all -> 0x0243 }
            android.os.Handler r1 = r0.A05     // Catch:{ all -> 0x0243 }
            X.TGK r0 = new X.TGK     // Catch:{ all -> 0x0243 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0243 }
            r1.post(r0)     // Catch:{ all -> 0x0243 }
        L_0x0236:
            r5.A01 = r6     // Catch:{ all -> 0x0243 }
            goto L_0x0249
        L_0x0239:
            if (r2 != 0) goto L_0x0236
            X.Rrs r3 = r5.A0X     // Catch:{ all -> 0x0243 }
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ all -> 0x0243 }
            r2.<init>()     // Catch:{ all -> 0x0243 }
            goto L_0x022a
        L_0x0243:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0246:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0246 }
            throw r0
        L_0x0249:
            monitor-exit(r8)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.A02 = r0
        L_0x0250:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TGH.run():void");
    }
}
