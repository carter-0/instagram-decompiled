package X;

/* renamed from: X.3j1  reason: invalid class name and case insensitive filesystem */
public final class C249043j1 extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C249043j1(2Lk r7) {
        super("LogPerfBenchmark", 1688637810, 3, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01ef, code lost:
        if (r1 != false) goto L_0x01f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r34 = this;
            r0 = r34
            X.2Lk r1 = r0.A00
            com.facebook.common.callercontext.CallerContext r0 = X.2Lk.A08
            com.instagram.common.session.UserSession r8 = r1.A04
            java.lang.ref.WeakReference r0 = r1.A06
            java.lang.Object r7 = r0.get()
            android.content.Context r7 = (android.content.Context) r7
            r4 = 0
            X.0qQ.A0B(r8, r4)
            X.0wc r2 = X.AnonymousClass0kN.A02(r8)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r1 = "ig_device_perf_benchmark"
            X.0kJ r0 = r2.A00     // Catch:{ Exception -> 0x0216 }
            X.0Aj r6 = r2.A00(r0, r1)     // Catch:{ Exception -> 0x0216 }
            boolean r0 = r6.isSampled()     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x0216
            X.0wX r12 = X.C61170le.A00     // Catch:{ Exception -> 0x0216 }
            X.0xm r0 = X.AnonymousClass0xl.A00(r12)     // Catch:{ Exception -> 0x0216 }
            X.0xa r0 = r0.A00     // Catch:{ Exception -> 0x0216 }
            X.0sl r3 = X.0sl.A00     // Catch:{ Exception -> 0x0216 }
            java.lang.String r2 = "preference_logged_performance_benchmarks"
            java.util.Set r9 = r0.getStringSet(r2, r3)     // Catch:{ Exception -> 0x0216 }
            if (r9 != 0) goto L_0x0039
            r9 = r3
        L_0x0039:
            X.0Tu r5 = X.0Tu.A05     // Catch:{ Exception -> 0x0216 }
            r0 = 36885213497983576(0x830ae800030258, double:3.389695768733581E-306)
            java.lang.String r1 = X.182.A04(r5, r8, r0)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x0216 }
            java.util.List r1 = X.00l.A0R(r1, r0, r4)     // Catch:{ Exception -> 0x0216 }
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)     // Catch:{ Exception -> 0x0216 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x0216 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0216 }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ Exception -> 0x0216 }
        L_0x005d:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0216 }
            X.9Fl[] r1 = X.C375859Fl.values()     // Catch:{ Exception -> 0x0216 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0216 }
            r0 = r1[r0]     // Catch:{ Exception -> 0x0216 }
            r11.add(r0)     // Catch:{ Exception -> 0x0216 }
            goto L_0x005d
        L_0x0077:
            java.util.List r0 = X.0jo.A1G(r11)     // Catch:{ Exception -> 0x0216 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x0216 }
        L_0x007f:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x009b
            java.lang.Object r10 = r1.next()     // Catch:{ Exception -> 0x0216 }
            r0 = r10
            X.9Fl r0 = (X.C375859Fl) r0     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = r0.name()     // Catch:{ Exception -> 0x0216 }
            boolean r0 = r9.contains(r0)     // Catch:{ Exception -> 0x0216 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007f
        L_0x0098:
            X.9Fl r10 = (X.C375859Fl) r10     // Catch:{ Exception -> 0x0216 }
            goto L_0x009d
        L_0x009b:
            r10 = 0
            goto L_0x0098
        L_0x009d:
            if (r10 == 0) goto L_0x0216
            X.0xm r0 = X.AnonymousClass0xl.A00(r12)     // Catch:{ Exception -> 0x0216 }
            X.0xa r0 = r0.A00     // Catch:{ Exception -> 0x0216 }
            java.util.Set r0 = r0.getStringSet(r2, r3)     // Catch:{ Exception -> 0x0216 }
            if (r0 != 0) goto L_0x00ac
            r0 = r3
        L_0x00ac:
            java.util.Set r1 = X.00k.A0j(r0)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = r10.name()     // Catch:{ Exception -> 0x0216 }
            r1.add(r0)     // Catch:{ Exception -> 0x0216 }
            X.0xm r0 = X.AnonymousClass0xl.A00(r12)     // Catch:{ Exception -> 0x0216 }
            X.0xa r0 = r0.A00     // Catch:{ Exception -> 0x0216 }
            X.0xY r0 = r0.AR4()     // Catch:{ Exception -> 0x0216 }
            r0.E5h(r2, r1)     // Catch:{ Exception -> 0x0216 }
            r0.apply()     // Catch:{ Exception -> 0x0216 }
            java.lang.String r3 = r10.toString()     // Catch:{ Exception -> 0x0216 }
            com.instagram.devicesegmentation.logging.PerfMetricRunnerJni r9 = new com.instagram.devicesegmentation.logging.PerfMetricRunnerJni     // Catch:{ Exception -> 0x0216 }
            r9.<init>()     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = "FILE"
            r2 = 0
            boolean r0 = X.00l.A0d(r3, r0, r4)     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x00ee
            java.lang.String r1 = "ig_benchmarks"
            java.lang.String r0 = ".dat"
            java.io.File r0 = java.io.File.createTempFile(r1, r0)     // Catch:{ Exception -> 0x0216 }
            r0.deleteOnExit()     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ Exception -> 0x0216 }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x0216 }
            r9.setTempFilename(r0)     // Catch:{ Exception -> 0x0216 }
        L_0x00ee:
            boolean r0 = r9.runBenchmark(r3)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r4 = r9.getProgressLog()     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x01c6
            X.9Fm r0 = r10.A00     // Catch:{ Exception -> 0x0216 }
            r16 = r0
            java.lang.String r17 = r9.getResultUnits()     // Catch:{ Exception -> 0x0216 }
            int r0 = r9.getResultSampleCount()     // Catch:{ Exception -> 0x0216 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0216 }
            r18 = r0
            float r0 = r9.getResultMin()     // Catch:{ Exception -> 0x0216 }
            double r0 = (double) r0     // Catch:{ Exception -> 0x0216 }
            r20 = r0
            float r0 = r9.getResultQuartile1()     // Catch:{ Exception -> 0x0216 }
            double r0 = (double) r0     // Catch:{ Exception -> 0x0216 }
            r22 = r0
            float r0 = r9.getResultMedian()     // Catch:{ Exception -> 0x0216 }
            double r14 = (double) r0     // Catch:{ Exception -> 0x0216 }
            float r0 = r9.getResultQuartile3()     // Catch:{ Exception -> 0x0216 }
            double r12 = (double) r0     // Catch:{ Exception -> 0x0216 }
            float r0 = r9.getResultMax()     // Catch:{ Exception -> 0x0216 }
            double r10 = (double) r0     // Catch:{ Exception -> 0x0216 }
            float r0 = r9.getResultMean()     // Catch:{ Exception -> 0x0216 }
            double r2 = (double) r0     // Catch:{ Exception -> 0x0216 }
            float r0 = r9.getResultStdDev()     // Catch:{ Exception -> 0x0216 }
            double r0 = (double) r0     // Catch:{ Exception -> 0x0216 }
            X.9Fp r9 = new X.9Fp     // Catch:{ Exception -> 0x0216 }
            r24 = r12
            r26 = r10
            r28 = r2
            r30 = r0
            r32 = r18
            r18 = r20
            r20 = r22
            r22 = r14
            r15 = r9
            r15.<init>(r16, r17, r18, r20, r22, r24, r26, r28, r30, r32)     // Catch:{ Exception -> 0x0216 }
            X.0eP r0 = new X.0eP     // Catch:{ Exception -> 0x0216 }
            r0.<init>(r9, r4)     // Catch:{ Exception -> 0x0216 }
        L_0x0149:
            java.lang.Object r2 = r0.A00     // Catch:{ Exception -> 0x0216 }
            X.9Fp r2 = (X.C375879Fp) r2     // Catch:{ Exception -> 0x0216 }
            java.lang.Object r3 = r0.A01     // Catch:{ Exception -> 0x0216 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0216 }
            if (r2 == 0) goto L_0x0203
            X.9Fm r1 = r2.A08     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = "benchmark_name"
            r6.A8M(r1, r0)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r1 = r2.A09     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = "benchmark_units"
            r6.AAJ(r0, r1)     // Catch:{ Exception -> 0x0216 }
            long r0 = r2.A07     // Catch:{ Exception -> 0x0216 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = "benchmark_samples"
            r6.A9F(r0, r1)     // Catch:{ Exception -> 0x0216 }
            double r0 = r2.A03     // Catch:{ Exception -> 0x0216 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = "benchmark_min"
            r6.A8D(r0, r1)     // Catch:{ Exception -> 0x0216 }
            double r0 = r2.A04     // Catch:{ Exception -> 0x0216 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = "benchmark_quartile1"
            r6.A8D(r0, r1)     // Catch:{ Exception -> 0x0216 }
            double r0 = r2.A02     // Catch:{ Exception -> 0x0216 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = "benchmark_median"
            r6.A8D(r0, r1)     // Catch:{ Exception -> 0x0216 }
            double r0 = r2.A05     // Catch:{ Exception -> 0x0216 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = "benchmark_quartile3"
            r6.A8D(r0, r1)     // Catch:{ Exception -> 0x0216 }
            double r0 = r2.A01     // Catch:{ Exception -> 0x0216 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = "benchmark_max"
            r6.A8D(r0, r1)     // Catch:{ Exception -> 0x0216 }
            double r0 = r2.A00     // Catch:{ Exception -> 0x0216 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = "benchmark_arithmeticmean"
            r6.A8D(r0, r1)     // Catch:{ Exception -> 0x0216 }
            double r0 = r2.A06     // Catch:{ Exception -> 0x0216 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = "benchmark_standarddeviation"
            r6.A8D(r0, r1)     // Catch:{ Exception -> 0x0216 }
            r0 = 36322263544637470(0x810ae80004281e, double:3.0336839514199896E-306)
            boolean r0 = X.182.A06(r5, r8, r0)     // Catch:{ Exception -> 0x0216 }
            r2 = 0
            if (r0 == 0) goto L_0x01f6
            goto L_0x01cd
        L_0x01c6:
            X.0eP r0 = new X.0eP     // Catch:{ Exception -> 0x0216 }
            r0.<init>(r2, r4)     // Catch:{ Exception -> 0x0216 }
            goto L_0x0149
        L_0x01cd:
            if (r7 == 0) goto L_0x01d0
            goto L_0x01d2
        L_0x01d0:
            r1 = r2
            goto L_0x01d8
        L_0x01d2:
            java.lang.String r0 = "power"
            java.lang.Object r1 = r7.getSystemService(r0)     // Catch:{ Exception -> 0x0216 }
        L_0x01d8:
            boolean r0 = r1 instanceof android.os.PowerManager     // Catch:{ Exception -> 0x0216 }
            if (r0 == 0) goto L_0x01f6
            android.os.PowerManager r1 = (android.os.PowerManager) r1     // Catch:{ Exception -> 0x0216 }
            if (r1 == 0) goto L_0x01f6
            boolean r2 = r1.isPowerSaveMode()     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = r7.getPackageName()     // Catch:{ Exception -> 0x0216 }
            boolean r1 = r1.isIgnoringBatteryOptimizations(r0)     // Catch:{ Exception -> 0x0216 }
            if (r2 == 0) goto L_0x01f1
            r0 = 1
            if (r1 == 0) goto L_0x01f2
        L_0x01f1:
            r0 = 0
        L_0x01f2:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
        L_0x01f6:
            r0 = 3449(0xd79, float:4.833E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x0216 }
            r6.A7p(r0, r2)     // Catch:{ Exception -> 0x0216 }
            r6.Cgf()     // Catch:{ Exception -> 0x0216 }
            return
        L_0x0203:
            X.0wj r2 = X.0wj.A01     // Catch:{ Exception -> 0x0216 }
            r1 = 817896335(0x30c01b8f, float:1.3977671E-9)
            java.lang.String r0 = "perf_benchmark_failure"
            X.0f9 r1 = r2.AEf(r0, r1)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r0 = "progressLog"
            r1.ABQ(r0, r3)     // Catch:{ Exception -> 0x0216 }
            r1.report()     // Catch:{ Exception -> 0x0216 }
        L_0x0216:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249043j1.loggedRun():void");
    }
}
