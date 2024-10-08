package X;

/* renamed from: X.5k2  reason: invalid class name and case insensitive filesystem */
public final class C293085k2 extends 0vM {
    public final /* synthetic */ 2DU A00;
    public final /* synthetic */ AnonymousClass2HN A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C293085k2(2DU r7, AnonymousClass2HN r8, String str) {
        super("InitMultiInstancesSyncForAllBackgroundAccounts", 726478904, 5, false, false);
        this.A00 = r7;
        this.A01 = r8;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r0v37, types: [java.lang.Object, X.NxU] */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0135, code lost:
        if (r5.equals("apps_start_offline_completion") != false) goto L_0x0137;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r22 = this;
            r6 = r22
            X.2DU r0 = r6.A00
            com.instagram.common.session.UserSession r1 = r0.A09
            X.0BQ r0 = X.AnonymousClass0BO.A00(r1)
            java.lang.String r5 = r1.A06
            java.util.List r14 = r0.BNy(r5)
            X.2HN r1 = r6.A01
            X.2HR r0 = r1.A1B
            java.lang.Object r0 = r0.A00()
            java.lang.Number r0 = (java.lang.Number) r0
            long r17 = r0.longValue()
            X.2HR r0 = r1.A16
            java.lang.Object r0 = r0.A00()
            java.lang.Number r0 = (java.lang.Number) r0
            long r12 = r0.longValue()
            X.2HR r0 = r1.A15
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0057
            X.NxU r0 = new X.NxU
            r0.<init>()
            java.lang.Class<X.Mfq> r3 = X.C66957Mfq.class
            monitor-enter(r3)
            X.Mfp r1 = X.C66957Mfq.A0A     // Catch:{ all -> 0x0054 }
            monitor-enter(r1)     // Catch:{ all -> 0x0054 }
            X.Mfq r2 = X.C66957Mfq.A09     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x004e
            X.Mfq r2 = new X.Mfq     // Catch:{ all -> 0x0051 }
            r2.<init>(r0)     // Catch:{ all -> 0x0051 }
            X.C66957Mfq.A09 = r2     // Catch:{ all -> 0x0051 }
        L_0x004e:
            monitor-exit(r1)     // Catch:{ all -> 0x0054 }
            goto L_0x0119
        L_0x0051:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0057:
            java.lang.Class<X.8zu> r1 = X.C372178zu.class
            monitor-enter(r1)
            X.8zv r0 = X.C372178zu.A0A     // Catch:{ all -> 0x01bf }
            X.8zu r4 = r0.A01()     // Catch:{ all -> 0x01bf }
            monitor-exit(r1)
            r4.A05(r5)
            java.lang.String r10 = r6.A02
            r19 = 0
            long r2 = java.lang.System.currentTimeMillis()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r20
            java.lang.String r0 = "apps_start_offline_completion"
            boolean r8 = r10.equals(r0)
            if (r8 == 0) goto L_0x00fb
            long r0 = r4.A01
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f9
            r7 = 1
        L_0x0081:
            java.lang.String r0 = "apps_resume"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0093
            long r0 = r4.A00
            long r5 = r2 - r0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x014b
            r4.A00 = r2
        L_0x0093:
            if (r7 != 0) goto L_0x014b
            if (r8 == 0) goto L_0x0099
            r4.A00 = r2
        L_0x0099:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r9 = r0.toString()
            X.0qQ.A07(r9)
            java.util.Iterator r3 = r14.iterator()
        L_0x00a8:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.concurrent.ConcurrentLinkedQueue r0 = r4.A06
            r6 = 0
            boolean r0 = X.C372178zu.A03(r4, r8, r1, r0)
            if (r0 != 0) goto L_0x00a8
            java.util.concurrent.ConcurrentLinkedQueue r2 = r4.A07
            boolean r0 = X.C372178zu.A03(r4, r8, r10, r2)
            if (r0 != 0) goto L_0x00a8
            java.util.concurrent.ConcurrentLinkedQueue r0 = r4.A05
            boolean r0 = X.C372178zu.A03(r4, r8, r1, r0)
            if (r0 != 0) goto L_0x00a8
            java.util.Set r0 = r4.A04
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = r4.A03
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 != 0) goto L_0x00a8
            X.PPx r0 = r4.A02
            if (r0 == 0) goto L_0x00e8
            com.instagram.common.session.UserSession r0 = r0.A03
            if (r0 == 0) goto L_0x00e8
            java.lang.String r1 = r0.A06
        L_0x00e8:
            boolean r0 = X.0qQ.A0K(r1, r8)
            if (r0 != 0) goto L_0x00a8
            X.8zw r5 = new X.8zw
            r7 = r6
            r11 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.add(r5)
            goto L_0x00a8
        L_0x00f9:
            r4.A01 = r2
        L_0x00fb:
            r7 = 0
            goto L_0x0081
        L_0x00fd:
            java.util.concurrent.ConcurrentLinkedQueue r0 = r4.A07
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x014b
            com.facebook.msys.mci.Execution.initialize()
            X.8zx r0 = new X.8zx
            r0.<init>(r4)
            long r20 = r20 * r17
            r18 = 1
            r16 = r0
            r17 = r1
            com.facebook.msys.mci.Execution.executeAfterWithPriority(r16, r17, r18, r19, r20)
            return
        L_0x0119:
            monitor-exit(r3)
            r2.A04(r5)
            java.lang.String r5 = r6.A02
            r16 = 0
            r15 = 1
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "apps_start"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0137
            java.lang.String r0 = "apps_start_offline_completion"
            boolean r0 = r5.equals(r0)
            r11 = 0
            if (r0 == 0) goto L_0x0138
        L_0x0137:
            r11 = 1
        L_0x0138:
            long r0 = r2.A00
            long r7 = r3 - r0
            r9 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r9
            int r6 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x014b
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x014c
            if (r11 == 0) goto L_0x014c
        L_0x014b:
            return
        L_0x014c:
            r2.A00 = r3
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            java.lang.String r4 = r0.toString()
            X.0qQ.A07(r4)
            java.util.Iterator r6 = r14.iterator()
        L_0x015d:
            boolean r0 = r6.hasNext()
            r14 = 0
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.A05
            boolean r0 = X.C66957Mfq.A03(r2, r3, r0)
            if (r0 != 0) goto L_0x015d
            java.util.concurrent.ConcurrentLinkedQueue r1 = r2.A06
            boolean r0 = X.C66957Mfq.A03(r2, r3, r1)
            if (r0 != 0) goto L_0x015d
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.A04
            boolean r0 = X.C66957Mfq.A03(r2, r3, r0)
            if (r0 != 0) goto L_0x015d
            java.util.Set r0 = r2.A03
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x015d
            java.lang.String r0 = r2.A02
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x015d
            X.Oan r0 = r2.A01
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = r0.A0D
        L_0x0198:
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x015d
            X.JwB r0 = new X.JwB
            r0.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.util.HashMap) r14)
            r1.add(r0)
            goto L_0x015d
        L_0x01a7:
            r0 = r14
            goto L_0x0198
        L_0x01a9:
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x014b
            com.facebook.msys.mci.Execution.initialize()
            X.NBK r13 = new X.NBK
            r13.<init>(r2)
            long r17 = r17 * r9
            com.facebook.msys.mci.Execution.executeAfterWithPriority(r13, r14, r15, r16, r17)
            return
        L_0x01bf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C293085k2.loggedRun():void");
    }
}
