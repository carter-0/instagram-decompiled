package X;

/* renamed from: X.546  reason: invalid class name */
public final class AnonymousClass546 extends 0ng {
    public final /* synthetic */ AnonymousClass540 A00;
    public final /* synthetic */ C278784xW A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A03, 36319364441906357L) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r5 = r16
            X.4xW r6 = r5.A01
            X.4xV r7 = r6.A04
            boolean r0 = X.C278774xV.A00(r7)
            if (r0 == 0) goto L_0x0016
            X.1QP r4 = r7.A01
            long r1 = r7.A00
            java.lang.String r3 = "XMA_CLIPS"
            r0 = 0
            r4.flowStart(r1, r3, r0)
        L_0x0016:
            X.1Jf r0 = X.AnonymousClass1K7.A00()
            boolean r0 = r0.A0D()
            if (r0 != 0) goto L_0x01e9
            X.1Jf r0 = X.AnonymousClass1K7.A00()
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x01e9
            boolean r0 = X.14i.A08()
            if (r0 != 0) goto L_0x003f
            com.instagram.common.session.UserSession r3 = r6.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319364441906357(0x81084500071cb5, double:3.031850547179084E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01e9
        L_0x003f:
            X.540 r5 = r5.A00
            r4 = 0
            X.0qQ.A0B(r5, r4)
            com.instagram.common.session.UserSession r3 = r6.A03
            X.2Dm r0 = X.1bJ.A00(r3)
            java.util.Map r1 = r0.CBr()
            int r0 = r1.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x0060:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            r2.add(r0)
            goto L_0x0060
        L_0x0074:
            java.util.ArrayList r0 = X.0Yv.A1F(r2)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r0.iterator()
        L_0x0081:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0098
            java.lang.Object r2 = r8.next()
            r0 = r2
            X.3su r0 = (X.C254703su) r0
            X.2FW r1 = r0.A10
            X.2FW r0 = X.2FW.A1p
            if (r1 != r0) goto L_0x0081
            r9.add(r2)
            goto L_0x0081
        L_0x0098:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x00a1:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r9.next()
            X.3su r0 = (X.C254703su) r0
            com.google.common.collect.ImmutableList r0 = r0.A0H()
            r1 = 0
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = r0.A0u
            if (r0 == 0) goto L_0x00a1
            android.net.Uri r2 = X.0cp.A03(r0)     // Catch:{ all -> 0x00cd }
            if (r2 == 0) goto L_0x00d3
            java.lang.String r0 = "id"
            java.lang.String r1 = r2.getQueryParameter(r0)     // Catch:{ all -> 0x00cd }
            goto L_0x00d3
        L_0x00cd:
            r0 = move-exception
            X.0eQ r1 = new X.0eQ
            r1.<init>(r0)
        L_0x00d3:
            boolean r0 = r1 instanceof X.0eQ
            if (r0 != 0) goto L_0x00a1
            if (r1 == 0) goto L_0x00a1
            r8.add(r1)
            goto L_0x00a1
        L_0x00dd:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r15 = r8.iterator()
        L_0x00e6:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r11 = r15.next()
            r10 = r11
            java.lang.String r10 = (java.lang.String) r10
            X.0Tu r8 = X.0Tu.A06
            r0 = 36600839418351614(0x82084500030ffe, double:3.209856455691821E-306)
            long r0 = X.182.A01(r8, r3, r0)
            com.facebook.stash.core.Stash r12 = r6.A02
            boolean r8 = r12.hasKey(r10)
            if (r8 == 0) goto L_0x011c
            long r13 = java.lang.System.currentTimeMillis()
            long r8 = r12.lastAccessTime(r10)
            long r13 = r13 - r8
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MINUTES
            long r8 = r8.toMillis(r0)
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e6
            r12.remove(r10)
        L_0x011c:
            r2.add(r11)
            goto L_0x00e6
        L_0x0120:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x013d
            java.lang.String r4 = "No unseen clips - finishing job"
            boolean r0 = X.C278774xV.A00(r7)
            if (r0 == 0) goto L_0x0137
            X.1QP r3 = r7.A01
            long r1 = r7.A00
            java.lang.String r0 = "NO_DATA"
            r3.flowEndCancel(r1, r0, r4)
        L_0x0137:
            java.lang.String r0 = "direct_xma_clips_background_prefetch"
            r5.AVX(r0)
            return
        L_0x013d:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r2.iterator()
        L_0x0146:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0160
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            com.facebook.stash.core.Stash r0 = r6.A02     // Catch:{ IOException -> 0x0158 }
            r0.write(r1)     // Catch:{ IOException -> 0x0158 }
            goto L_0x0146
        L_0x0158:
            r0 = move-exception
            r8.add(r1)
            r0.getMessage()
            goto L_0x0146
        L_0x0160:
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x017b
            boolean r0 = X.C278774xV.A00(r7)
            if (r0 == 0) goto L_0x017b
            X.1QP r10 = r7.A01
            long r0 = r7.A00
            java.lang.String r9 = r8.toString()
            java.lang.String r8 = "failed_to_cache_medias"
            r10.flowAnnotate(r0, r8, r9)
        L_0x017b:
            X.0Tu r8 = X.0Tu.A06
            r0 = 36600839418220541(0x82084500010ffd, double:3.20985645560893E-306)
            long r0 = X.182.A01(r8, r3, r0)
            int r10 = (int) r0
            if (r10 <= 0) goto L_0x01b7
            int r0 = r2.size()
            if (r0 <= r10) goto L_0x01b7
            r2.size()
            int r11 = r2.size()
            boolean r0 = X.C278774xV.A00(r7)
            if (r0 == 0) goto L_0x01b3
            X.1QP r9 = r7.A01
            long r0 = r7.A00
            java.lang.String r7 = "max_data_to_prefetch"
            r9.flowAnnotate(r0, r7, r10)
            java.lang.String r7 = "data_available_to_prefetch"
            r9.flowAnnotate(r0, r7, r11)
            r8 = 0
            if (r11 <= r10) goto L_0x01ae
            r8 = 1
        L_0x01ae:
            java.lang.String r7 = "is_data_to_prefetched_reduced"
            r9.flowAnnotate(r0, r7, r8)
        L_0x01b3:
            java.util.List r2 = X.00k.A0d(r2, r10)
        L_0x01b7:
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            java.util.Iterator r1 = r2.iterator()
        L_0x01c0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r0 = r1.next()
            r7.put(r0)
            goto L_0x01c0
        L_0x01ce:
            java.lang.String r1 = r7.toString()
            X.0qQ.A07(r1)
            r0 = 0
            X.1OC r2 = X.AnonymousClass93V.A03(r0, r3, r1)
            X.UfF r0 = new X.UfF
            r0.<init>(r5, r6)
            r2.A00 = r0
            r1 = 133133950(0x7ef767e, float:3.6030367E-34)
            r0 = 3
            X.1ES.A05(r2, r1, r0, r4, r4)
            return
        L_0x01e9:
            java.lang.String r6 = "Skipping background prefetch - finishing job"
            boolean r0 = X.C278774xV.A00(r7)
            if (r0 == 0) goto L_0x021d
            X.1QP r4 = r7.A01
            long r2 = r7.A00
            boolean r1 = X.14i.A08()
            java.lang.String r0 = "is_app_backgrounded"
            r4.flowAnnotate(r2, r0, r1)
            X.1Jf r0 = X.AnonymousClass1K7.A00()
            boolean r1 = r0.A0D()
            java.lang.String r0 = "is_device_memory_low"
            r4.flowAnnotate(r2, r0, r1)
            X.1Jf r0 = X.AnonymousClass1K7.A00()
            boolean r1 = r0.A0E()
            java.lang.String r0 = "is_java_heap_low"
            r4.flowAnnotate(r2, r0, r1)
            java.lang.String r0 = "SKIP"
            r4.flowEndCancel(r2, r0, r6)
        L_0x021d:
            X.540 r1 = r5.A00
            java.lang.String r0 = "direct_xma_clips_background_prefetch"
            r1.AVX(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass546.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass546(AnonymousClass540 r4, C278784xW r5) {
        super(1479209349, 3, false, false);
        this.A01 = r5;
        this.A00 = r4;
    }
}
