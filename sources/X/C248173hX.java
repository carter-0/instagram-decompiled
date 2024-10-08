package X;

/* renamed from: X.3hX  reason: invalid class name and case insensitive filesystem */
public final class C248173hX extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248173hX(2Lk r7) {
        super("maybeDownloadHeliumSplit", 1572057322, 5, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0120, code lost:
        if (X.182.A06(r2, r5, 36321404551308630L) != false) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r13 = this;
            X.2Lk r1 = r13.A00
            com.facebook.common.callercontext.CallerContext r0 = X.2Lk.A08
            android.content.Context r4 = r1.A01
            com.instagram.common.session.UserSession r5 = r1.A04
            r6 = 1
            X.0qQ.A0B(r4, r6)
            r3 = 2
            X.0qQ.A0B(r5, r3)
            X.0Tu r2 = X.0Tu.A06
            r0 = 2342164413764740434(0x20810a2000022552, double:4.066776820380077E-152)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0094
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x001f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x003b
            X.02m r6 = X.02m.A0p
            r5 = 47650251(0x2d715cb, float:3.160392E-37)
            r6.markerStart(r5)
            java.lang.String r2 = "heliumiab"
            boolean r0 = X.0gH.A01(r4, r2)
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "download_not_needed_split_apks_exist"
        L_0x0035:
            r6.markerPoint(r5, r0)
            r6.markerEnd(r5, r3)
        L_0x003b:
            return
        L_0x003c:
            java.lang.Boolean r0 = X.1Tj.A01(r4)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "oxygen_download_start"
            r6.markerPoint(r5, r0)
            X.1SD r1 = X.1Tj.A00(r4)
            java.lang.Boolean r0 = X.1Tj.A01(r4)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0074
            java.util.List r0 = java.util.Collections.singletonList(r2)     // Catch:{ all -> 0x0064 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0064 }
            r1.A03(r0)     // Catch:{ all -> 0x0064 }
            goto L_0x0074
        L_0x0064:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            java.lang.String r1 = "VoltronPreloadsRequestManager"
            java.lang.String r0 = "Exception found while installing module %s, %s"
            X.0KC.A0O(r1, r0, r2)
        L_0x0074:
            java.lang.String r0 = "oxygen_download_end"
            goto L_0x0035
        L_0x0077:
            java.lang.String r0 = "gplay_download_start"
            r6.markerPoint(r5, r0)
            android.content.Context r0 = r4.getApplicationContext()
            X.2JI r1 = X.AnonymousClass2JJ.A00(r0)
            X.0qQ.A07(r1)
            java.util.List r0 = java.util.Collections.singletonList(r2)
            X.0qQ.A07(r0)
            r1.AOL(r0)
            java.lang.String r0 = "gplay_download_end"
            goto L_0x0035
        L_0x0094:
            int r12 = android.system.OsConstants._SC_PAGESIZE
            long r7 = android.system.Os.sysconf(r12)
            r1 = 4096(0x1000, double:2.0237E-320)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c1
            X.0Tu r11 = X.0Tu.A05
            r0 = 36602879529128774(0x820a2000171346, double:3.2111466299621635E-306)
            long r9 = X.182.A01(r11, r5, r0)
            r7 = 0
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c1
            long r7 = android.system.Os.sysconf(r12)
            long r1 = X.182.A01(r11, r5, r0)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c1
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            goto L_0x001f
        L_0x00c1:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321404551112019(0x810a2000032553, double:3.033140720455605E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x00d2
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x001f
        L_0x00d2:
            X.0g7 r0 = X.0g7.A00()
            java.lang.String r7 = "heliumiab"
            java.lang.String r1 = r0.A02(r7)
            if (r1 == 0) goto L_0x00f0
            X.0g3 r0 = X.C60290fq.A00(r4)
            java.io.File r0 = r0.A02(r4, r7, r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00f0
        L_0x00ec:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x001f
        L_0x00f0:
            X.0JN r0 = X.0JN.A01()
            long r9 = r0.A05()
            r0 = 36602879527686980(0x820a2000011344, double:3.211146629050367E-306)
            long r7 = X.182.A01(r2, r5, r0)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0109
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x001f
        L_0x0109:
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0123 }
            if (r1 == 0) goto L_0x0123
            java.lang.String r0 = "com.android.vending"
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r6)     // Catch:{ NameNotFoundException -> 0x0123 }
            if (r0 == 0) goto L_0x0123
            r0 = 36321404551308630(0x810a2000062556, double:3.033140720579943E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0123
            goto L_0x00ec
        L_0x0123:
            r0 = 36321404551832923(0x810a20000e255b, double:3.033140720911508E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C248173hX.loggedRun():void");
    }
}
