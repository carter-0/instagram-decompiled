package X;

/* renamed from: X.4mD  reason: invalid class name and case insensitive filesystem */
public final class C273244mD extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C273244mD(2Lk r7) {
        super("maybeRestoreCookiesForSession", 575743522, 5, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.HSC] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.1K2] */
    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, X.1K2] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (r8.A02 == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r9 = this;
            X.2Lk r1 = r9.A00
            com.facebook.common.callercontext.CallerContext r0 = X.2Lk.A08
            android.content.Context r6 = r1.A01
            X.02m r5 = X.02m.A0p
            X.0qQ.A07(r5)
            X.HSC r4 = new X.HSC
            r4.<init>()
            com.instagram.common.session.UserSession r3 = r1.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321404552095070(0x810a200012255e, double:3.0331407210772905E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            X.Hmx r8 = new X.Hmx
            r8.<init>(r6, r4, r5, r0)
            android.content.Context r0 = r8.A00
            boolean r0 = X.C249103j8.A01(r0)
            if (r0 == 0) goto L_0x002f
            boolean r1 = r8.A02
            r0 = 1
            if (r1 != 0) goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            java.lang.String r3 = "HeliumCookieRestorer"
            if (r0 != 0) goto L_0x005a
            X.1BJ r2 = X.AnonymousClass1F2.A00()
            r1 = 924283537(0x37177291, float:9.026976E-6)
            r0 = 0
            java.io.File r2 = r2.AXT(r0, r1)
            java.lang.String r1 = "Cookies"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            r0.delete()
            java.lang.String r0 = "Backup/restore disabled"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
        L_0x0051:
            X.R1v r0 = new X.R1v
            r0.<init>()
            r0.setException(r1)
            return
        L_0x005a:
            com.facebook.quicklog.QuickPerformanceLogger r6 = r8.A01
            r5 = 47655239(0x2d72947, float:3.1615103E-37)
            r6.markerStart(r5)
            X.1BJ r2 = X.AnonymousClass1F2.A00()
            r1 = 924283537(0x37177291, float:9.026976E-6)
            r0 = 0
            java.io.File r1 = r2.AXT(r0, r1)
            java.lang.String r0 = "Cookies"
            java.io.File r7 = new java.io.File
            r7.<init>(r1, r0)
            boolean r0 = r7.exists()
            r2 = 3
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "no_backup"
            r6.markerPoint(r5, r0)
            r6.markerEnd(r5, r2)
            java.lang.String r0 = "No backup found"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            goto L_0x0051
        L_0x008c:
            java.lang.String r4 = r7.getCanonicalPath()     // Catch:{ IOException -> 0x00cd }
            android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()
            X.0qQ.A0A(r1)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.TfK r0 = X.C249113j9.A01
            if (r0 == 0) goto L_0x00b8
            X.TfL r3 = r0.ArK(r1)
            java.lang.String r0 = "restore_start"
            r6.markerPoint(r5, r0)
            com.google.common.util.concurrent.SettableFuture r2 = new com.google.common.util.concurrent.SettableFuture
            r2.<init>()
            r1 = 20
            X.Iwy r0 = new X.Iwy
            r0.<init>(r1, r7, r8, r2)
            r3.EIo(r4, r0)
            return
        L_0x00b8:
            java.lang.String r0 = "Not using Helium, skipping cookie store restore"
            X.0KC.A0D(r3, r0)
            java.lang.String r0 = "helium_inactive"
            r6.markerPoint(r5, r0)
            r6.markerEnd(r5, r2)
            java.lang.String r0 = "Helium inactive"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            goto L_0x0051
        L_0x00cd:
            r1 = move-exception
            java.lang.String r0 = "Failed to resolve cookie backup path"
            X.0KC.A0F(r3, r0, r1)
            java.lang.String r0 = "invalid_path"
            r6.markerPoint(r5, r0)
            r6.markerEnd(r5, r2)
            X.R1v r0 = new X.R1v
            r0.<init>()
            r0.setException(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273244mD.loggedRun():void");
    }
}
