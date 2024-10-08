package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;

public final class TTC extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTC(Context context, C284945Oz r3, S5B s5b, String str, String str2, String str3, String str4, AnonymousClass4D7 r9, 0sK r10) {
        super(2, r9);
        this.A05 = r10;
        this.A04 = context;
        this.A07 = s5b;
        this.A0B = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A08 = str4;
        this.A06 = r3;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.TTC, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r18) {
        AnonymousClass4D7 r14 = r18;
        if (this.A03 != 0) {
            int i = this.A01;
            String str = this.A0A;
            String str2 = this.A09;
            String str3 = this.A0B;
            return new TTC((Context) this.A04, (SKG) this.A02, (QuickPerformanceLogger) this.A06, (1QS) this.A07, (1QU) this.A05, str, str2, str3, this.A08, r14, i);
        }
        String str4 = this.A0B;
        String str5 = this.A09;
        String str6 = this.A0A;
        String str7 = this.A08;
        return new TTC((Context) this.A04, (C284945Oz) this.A06, (S5B) this.A07, str4, str5, str6, str7, r14, (0sK) this.A05);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.TTC, java.lang.Object, X.4D7] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r8 = r19
            int r1 = r0.A03
            if (r1 == 0) goto L_0x005b
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x001b
            if (r2 != r4) goto L_0x0016
            X.0eS.A00(r8)     // Catch:{ Exception -> 0x0173 }
            goto L_0x01a4
        L_0x0016:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x001b:
            X.0eS.A00(r8)
            com.instagram.common.session.UserSession r6 = X.C11159SCp.A01     // Catch:{ Exception -> 0x0173 }
            X.0Tu r5 = X.0Tu.A05     // Catch:{ Exception -> 0x0173 }
            r2 = 36611263304046808(0x8211c0000418d8, double:3.21644856297908E-306)
            long r2 = X.182.A01(r5, r6, r2)     // Catch:{ Exception -> 0x0173 }
            java.lang.Object r9 = r0.A06     // Catch:{ Exception -> 0x0173 }
            com.facebook.quicklog.QuickPerformanceLogger r9 = (com.facebook.quicklog.QuickPerformanceLogger) r9     // Catch:{ Exception -> 0x0173 }
            int r5 = r0.A01     // Catch:{ Exception -> 0x0173 }
            java.lang.String r12 = r0.A09     // Catch:{ Exception -> 0x0173 }
            java.lang.String r13 = r0.A0A     // Catch:{ Exception -> 0x0173 }
            java.lang.String r14 = r0.A0B     // Catch:{ Exception -> 0x0173 }
            java.lang.Object r8 = r0.A02     // Catch:{ Exception -> 0x0173 }
            X.SKG r8 = (X.SKG) r8     // Catch:{ Exception -> 0x0173 }
            java.lang.Object r7 = r0.A04     // Catch:{ Exception -> 0x0173 }
            android.content.Context r7 = (android.content.Context) r7     // Catch:{ Exception -> 0x0173 }
            java.lang.String r15 = r0.A08     // Catch:{ Exception -> 0x0173 }
            java.lang.Object r10 = r0.A07     // Catch:{ Exception -> 0x0173 }
            X.1QS r10 = (X.1QS) r10     // Catch:{ Exception -> 0x0173 }
            java.lang.Object r11 = r0.A05     // Catch:{ Exception -> 0x0173 }
            X.1QU r11 = (X.1QU) r11     // Catch:{ Exception -> 0x0173 }
            r16 = 0
            com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$fetchScript$1$1 r6 = new com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$fetchScript$1$1     // Catch:{ Exception -> 0x0173 }
            r17 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0173 }
            r0.A00 = r4     // Catch:{ Exception -> 0x0173 }
            java.lang.Object r0 = X.I3P.A01(r0, r6, r2)     // Catch:{ Exception -> 0x0173 }
            if (r0 != r1) goto L_0x01a4
            return r1
        L_0x005b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 2
            r5 = 1
            if (r2 == 0) goto L_0x006d
            if (r2 == r5) goto L_0x009f
            int r4 = r0.A01
            java.lang.Object r2 = r0.A02
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            goto L_0x010f
        L_0x006d:
            X.0eS.A00(r8)
            r2 = 0
            r4 = 0
        L_0x0072:
            java.lang.Object r3 = r0.A06
            X.5Oz r3 = (X.C284945Oz) r3
            java.lang.Object r3 = r3.getValue()
            X.IFm r3 = (X.C56865IFm) r3
            X.4gU r3 = r3.A03
            boolean r3 = X.C51971G9r.A1X(r3)
            if (r3 != 0) goto L_0x0141
            if (r4 == 0) goto L_0x00ae
            java.lang.Object r7 = r0.A05
            X.0sK r7 = (X.0sK) r7
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r4)
            X.0qQ.A0A(r2)
            r0.A02 = r2
            r0.A01 = r4
            r0.A00 = r5
            java.lang.Object r8 = r7.invoke(r3, r2, r0)
            if (r8 != r1) goto L_0x00a8
            return r1
        L_0x009f:
            int r4 = r0.A01
            java.lang.Object r2 = r0.A02
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            X.0eS.A00(r8)
        L_0x00a8:
            boolean r3 = X.AnonymousClass7TE.A1a(r8)
            if (r3 == 0) goto L_0x0141
        L_0x00ae:
            java.lang.Object r8 = r0.A04     // Catch:{ all -> 0x013b }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x013b }
            java.lang.Object r9 = r0.A07     // Catch:{ all -> 0x013b }
            X.S5B r9 = (X.S5B) r9     // Catch:{ all -> 0x013b }
            java.lang.String r10 = r0.A0B     // Catch:{ all -> 0x013b }
            if (r10 == 0) goto L_0x010d
            boolean r3 = X.00l.A0W(r10)     // Catch:{ all -> 0x013b }
            if (r3 != 0) goto L_0x010d
            r3 = 47
            boolean r3 = X.00l.A0Y(r10, r3)     // Catch:{ all -> 0x013b }
            if (r3 != 0) goto L_0x00ce
            java.lang.String r3 = "/"
            java.lang.String r10 = X.0qQ.A03(r10, r3)     // Catch:{ all -> 0x013b }
        L_0x00ce:
            java.lang.String r11 = r0.A09     // Catch:{ all -> 0x013b }
            if (r11 == 0) goto L_0x010b
            boolean r3 = X.00l.A0W(r11)     // Catch:{ all -> 0x013b }
            if (r3 != 0) goto L_0x010b
            r3 = 47
            boolean r3 = X.00l.A0Y(r11, r3)     // Catch:{ all -> 0x013b }
            if (r3 != 0) goto L_0x00e6
            java.lang.String r3 = "/"
            java.lang.String r11 = X.0qQ.A03(r11, r3)     // Catch:{ all -> 0x013b }
        L_0x00e6:
            java.lang.String r12 = r0.A0A     // Catch:{ all -> 0x013b }
            boolean r3 = X.00l.A0W(r12)     // Catch:{ all -> 0x013b }
            if (r3 != 0) goto L_0x00fb
            java.lang.String r7 = "."
            r3 = 0
            boolean r3 = X.00p.A0k(r12, r7, r3)     // Catch:{ all -> 0x013b }
            if (r3 != 0) goto L_0x00fb
            java.lang.String r12 = X.0qQ.A03(r7, r12)     // Catch:{ all -> 0x013b }
        L_0x00fb:
            java.lang.String r13 = r0.A08     // Catch:{ all -> 0x013b }
            r0.A02 = r2     // Catch:{ all -> 0x013b }
            r0.A01 = r4     // Catch:{ all -> 0x013b }
            r0.A00 = r6     // Catch:{ all -> 0x013b }
            r14 = r0
            java.lang.Object r8 = com.airbnb.lottie.compose.RememberLottieCompositionKt.A01(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x013b }
            if (r8 != r1) goto L_0x0112
            goto L_0x0140
        L_0x010b:
            r11 = 0
            goto L_0x00e6
        L_0x010d:
            r10 = 0
            goto L_0x00ce
        L_0x010f:
            X.0eS.A00(r8)     // Catch:{ all -> 0x013b }
        L_0x0112:
            X.S7N r8 = (X.S7N) r8     // Catch:{ all -> 0x013b }
            java.lang.Object r3 = r0.A06     // Catch:{ all -> 0x013b }
            X.5Oz r3 = (X.C284945Oz) r3     // Catch:{ all -> 0x013b }
            java.lang.Object r7 = r3.getValue()     // Catch:{ all -> 0x013b }
            X.IFm r7 = (X.C56865IFm) r7     // Catch:{ all -> 0x013b }
            monitor-enter(r7)     // Catch:{ all -> 0x013b }
            r3 = 0
            X.0qQ.A0B(r8, r3)     // Catch:{ all -> 0x0138 }
            X.4gU r3 = r7.A02     // Catch:{ all -> 0x0138 }
            boolean r3 = X.C51971G9r.A1X(r3)     // Catch:{ all -> 0x0138 }
            if (r3 != 0) goto L_0x0135
            X.5Oz r3 = r7.A01     // Catch:{ all -> 0x0138 }
            r3.Epw(r8)     // Catch:{ all -> 0x0138 }
            X.3Ns r3 = r7.A04     // Catch:{ all -> 0x0138 }
            r3.A0T(r8)     // Catch:{ all -> 0x0138 }
        L_0x0135:
            monitor-exit(r7)     // Catch:{ all -> 0x013b }
            goto L_0x0072
        L_0x0138:
            r2 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x013b }
            throw r2     // Catch:{ all -> 0x013b }
        L_0x013b:
            r2 = move-exception
            int r4 = r4 + 1
            goto L_0x0072
        L_0x0140:
            return r1
        L_0x0141:
            java.lang.Object r1 = r0.A06
            X.5Oz r1 = (X.C284945Oz) r1
            java.lang.Object r0 = r1.getValue()
            X.IFm r0 = (X.C56865IFm) r0
            X.4gU r0 = r0.A02
            boolean r0 = X.C51971G9r.A1X(r0)
            if (r0 != 0) goto L_0x01a4
            if (r2 == 0) goto L_0x01a4
            java.lang.Object r1 = r1.getValue()
            X.IFm r1 = (X.C56865IFm) r1
            monitor-enter(r1)
            X.4gU r0 = r1.A02     // Catch:{ all -> 0x0170 }
            boolean r0 = X.C51971G9r.A1X(r0)     // Catch:{ all -> 0x0170 }
            if (r0 != 0) goto L_0x016e
            X.5Oz r0 = r1.A00     // Catch:{ all -> 0x0170 }
            r0.Epw(r2)     // Catch:{ all -> 0x0170 }
            X.3Ns r0 = r1.A04     // Catch:{ all -> 0x0170 }
            r0.A0U(r2)     // Catch:{ all -> 0x0170 }
        L_0x016e:
            monitor-exit(r1)
            goto L_0x01a4
        L_0x0170:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0173:
            r7 = move-exception
            java.lang.Object r6 = r0.A06
            com.facebook.quicklog.QuickPerformanceLogger r6 = (com.facebook.quicklog.QuickPerformanceLogger) r6
            int r5 = r0.A01
            java.lang.String r4 = r7.getMessage()
            java.lang.String r3 = ""
            if (r4 != 0) goto L_0x0183
            r4 = r3
        L_0x0183:
            java.lang.String r2 = "execute_http_request_error"
            r1 = 646459455(0x2688303f, float:9.449973E-16)
            X.SKG.A00(r6, r2, r4, r5, r1)
            java.lang.String r2 = "execute_http_request_error "
            java.lang.String r1 = r7.getMessage()
            if (r1 == 0) goto L_0x0194
            r3 = r1
        L_0x0194:
            java.lang.String r8 = X.002.A0R(r2, r3)
            java.lang.String r9 = r0.A0A
            java.lang.String r10 = r0.A09
            java.lang.String r11 = r0.A0B
            r12 = 646454053(0x26881b25, float:9.444253E-16)
            X.SKG.A01(r7, r8, r9, r10, r11, r12)
        L_0x01a4:
            X.0gF r1 = X.C60340gF.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TTC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TTC) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTC(Context context, SKG skg, QuickPerformanceLogger quickPerformanceLogger, 1QS r5, 1QU r6, String str, String str2, String str3, String str4, AnonymousClass4D7 r11, int i) {
        super(2, r11);
        this.A02 = skg;
        this.A06 = quickPerformanceLogger;
        this.A01 = i;
        this.A0A = str;
        this.A09 = str2;
        this.A0B = str3;
        this.A04 = context;
        this.A08 = str4;
        this.A07 = r5;
        this.A05 = r6;
    }
}
