package X;

public enum RDK {
    ;

    /* access modifiers changed from: public */
    static {
        A00 = new C7897QcP(1);
        A01 = new C7897QcP(2);
        new C7897QcP(3);
        new C7897QcP(4);
        new C7897QcP(5);
        new C7897QcP(6);
        new C7897QcP(7);
        new C7897QcP(8);
        new C7897QcP(9);
        A02 = new C7897QcP(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        return new X.11T(r1.getCanonicalPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C7894QcM A00(android.content.Context r3) {
        /*
            r2 = this;
            r0 = r2
            X.QcP r0 = (X.C7897QcP) r0     // Catch:{ IOException -> 0x0090 }
            int r0 = r0.A00     // Catch:{ IOException -> 0x0090 }
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x007a;
                case 2: goto L_0x0075;
                case 3: goto L_0x0066;
                case 4: goto L_0x0056;
                case 5: goto L_0x0046;
                case 6: goto L_0x0036;
                case 7: goto L_0x0026;
                case 8: goto L_0x0016;
                default: goto L_0x0008;
            }     // Catch:{ IOException -> 0x0090 }
        L_0x0008:
            java.io.File r1 = r3.getExternalCacheDir()     // Catch:{ IOException -> 0x0090 }
            if (r1 != 0) goto L_0x0086
            java.lang.String r0 = "Your scope does not exist on device yet."
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ IOException -> 0x0090 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0090 }
        L_0x0015:
            throw r1     // Catch:{ IOException -> 0x0090 }
        L_0x0016:
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ IOException -> 0x0090 }
            java.io.File r1 = r3.getExternalFilesDir(r0)     // Catch:{ IOException -> 0x0090 }
            if (r1 != 0) goto L_0x0086
            java.lang.String r0 = "Your scope does not exist on device yet."
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ IOException -> 0x0090 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0090 }
            goto L_0x0015
        L_0x0026:
            java.lang.String r0 = android.os.Environment.DIRECTORY_MOVIES     // Catch:{ IOException -> 0x0090 }
            java.io.File r1 = r3.getExternalFilesDir(r0)     // Catch:{ IOException -> 0x0090 }
            if (r1 != 0) goto L_0x0086
            java.lang.String r0 = "Your scope does not exist on device yet."
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ IOException -> 0x0090 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0090 }
            goto L_0x0015
        L_0x0036:
            java.lang.String r0 = android.os.Environment.DIRECTORY_PICTURES     // Catch:{ IOException -> 0x0090 }
            java.io.File r1 = r3.getExternalFilesDir(r0)     // Catch:{ IOException -> 0x0090 }
            if (r1 != 0) goto L_0x0086
            java.lang.String r0 = "Your scope does not exist on device yet."
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ IOException -> 0x0090 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0090 }
            goto L_0x0015
        L_0x0046:
            java.lang.String r0 = android.os.Environment.DIRECTORY_DCIM     // Catch:{ IOException -> 0x0090 }
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r0)     // Catch:{ IOException -> 0x0090 }
            if (r1 != 0) goto L_0x0086
            java.lang.String r0 = "Your scope does not exist on device yet."
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ IOException -> 0x0090 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0090 }
            goto L_0x0015
        L_0x0056:
            java.lang.String r0 = android.os.Environment.DIRECTORY_DCIM     // Catch:{ IOException -> 0x0090 }
            java.io.File r1 = r3.getExternalFilesDir(r0)     // Catch:{ IOException -> 0x0090 }
            if (r1 != 0) goto L_0x0086
            java.lang.String r0 = "Your scope does not exist on device yet."
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ IOException -> 0x0090 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0090 }
            goto L_0x0015
        L_0x0066:
            r0 = 0
            java.io.File r1 = r3.getExternalFilesDir(r0)     // Catch:{ IOException -> 0x0090 }
            if (r1 != 0) goto L_0x0086
            java.lang.String r0 = "Your scope does not exist on device yet."
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ IOException -> 0x0090 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0090 }
            goto L_0x0015
        L_0x0075:
            java.io.File r1 = r3.getFilesDir()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0086
        L_0x007a:
            java.io.File r1 = r3.getCacheDir()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0086
        L_0x007f:
            java.lang.String r0 = "/"
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0090 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0090 }
        L_0x0086:
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0090 }
            X.QcM r0 = new X.QcM     // Catch:{ IOException -> 0x0090 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0090 }
            return r0
        L_0x0090:
            java.lang.String r1 = "Cannot resolve the scope's path with passed in context."
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RDK.A00(android.content.Context):X.QcM");
    }
}
