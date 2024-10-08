package X;

/* renamed from: X.9Oh  reason: invalid class name and case insensitive filesystem */
public final class C378049Oh implements Runnable {
    public final /* synthetic */ C375259Cw A00;
    public final /* synthetic */ C374989Bq A01;
    public final /* synthetic */ C375229Ct A02;

    public C378049Oh(C375259Cw r1, C374989Bq r2, C375229Ct r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058 A[Catch:{ all -> 0x0076, Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ all -> 0x0076, Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            X.9Bq r5 = r8.A01
            java.lang.Class r1 = r5.getClass()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r2 = r1.getName()
            int r0 = r2.length()
            int r0 = r0 + 11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "<cls>"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "</cls>"
            java.lang.String r4 = X.AnonymousClass7TF.A0l(r0, r1)
            X.0qQ.A07(r4)
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
            boolean r2 = r5 instanceof com.facebook.mobileboost.boosters.instagram.classpreload.DirectThreadClassPreloader     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
            if (r2 == 0) goto L_0x0043
            java.lang.String r1 = "DirectThreadClassPreloader.preload"
            r0 = 75497134(0x47ffeae, float:3.009205E-36)
        L_0x0037:
            X.0fS.A01(r1, r0)     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
        L_0x003a:
            java.lang.String r1 = "StartPreloading.%s"
            r0 = 1708478000(0x65d54e30, float:1.259133E23)
            X.0fh.A03(r1, r4, r0)     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
            goto L_0x004d
        L_0x0043:
            boolean r0 = r5 instanceof com.facebook.mobileboost.boosters.instagram.classpreload.DirectInboxClassPreloader     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
            if (r0 == 0) goto L_0x003a
            java.lang.String r1 = "DirectInboxClassPreloader.preload"
            r0 = -22038212(0xfffffffffeafb93c, float:-1.1678835E38)
            goto L_0x0037
        L_0x004d:
            r5.preloadClasses()     // Catch:{ all -> 0x0076 }
            r0 = 1282914044(0x4c77b6fc, float:6.4936944E7)
            X.0fh.A00(r0)     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
            if (r2 == 0) goto L_0x005c
            r0 = -1688727988(0xffffffff9b580e4c, float:-1.7871721E-22)
            goto L_0x0063
        L_0x005c:
            boolean r0 = r5 instanceof com.facebook.mobileboost.boosters.instagram.classpreload.DirectInboxClassPreloader     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
            if (r0 == 0) goto L_0x0066
            r0 = -298613061(0xffffffffee3386bb, float:-1.3890174E28)
        L_0x0063:
            X.0fS.A00(r0)     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
        L_0x0066:
            X.9Ct r3 = r8.A02     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
            long r1 = r1 - r6
            java.lang.String r0 = "Succeeded"
            r3.A01 = r4     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
            r3.A00 = r1     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
            r3.A02 = r0     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
            return
        L_0x0076:
            r1 = move-exception
            r0 = 197871819(0xbcb48cb, float:7.830228E-32)
            X.0fh.A00(r0)     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
            throw r1     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x007e }
        L_0x007e:
            r1 = move-exception
            boolean r0 = r5 instanceof com.facebook.mobileboost.boosters.instagram.classpreload.DirectThreadClassPreloader
            if (r0 == 0) goto L_0x009a
            r0 = 1309927893(0x4e13e9d5, float:6.2039379E8)
        L_0x0086:
            X.0fS.A00(r0)
        L_0x0089:
            X.9Ct r3 = r8.A02
            java.lang.String r0 = "Failed : "
            java.lang.String r2 = X.AnonymousClass7TF.A0m(r0, r1)
            r0 = 0
            r3.A01 = r4
            r3.A00 = r0
            r3.A02 = r2
            return
        L_0x009a:
            boolean r0 = r5 instanceof com.facebook.mobileboost.boosters.instagram.classpreload.DirectInboxClassPreloader
            if (r0 == 0) goto L_0x0089
            r0 = -1639263567(0xffffffff9e4ad2b1, float:-1.0737361E-20)
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378049Oh.run():void");
    }
}
