package X;

/* renamed from: X.9yb  reason: invalid class name and case insensitive filesystem */
public abstract class C394729yb {
    /* JADX WARNING: type inference failed for: r0v11, types: [X.Srd, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C12331Srd A00(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r4 = "AudioEffectUtil_toFbaAudioEffect"
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r5 = 0
            java.lang.String r2 = "audio-effect-"
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x004c }
            java.lang.String r1 = X.002.A0Q(r2, r0)     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x004c }
            java.lang.String r0 = ".json"
            java.io.File r1 = java.io.File.createTempFile(r1, r0)     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x004c }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x004c }
            r3.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x004c }
            android.content.res.AssetManager r0 = r6.getAssets()     // Catch:{ all -> 0x0045 }
            java.io.InputStream r2 = r0.open(r7)     // Catch:{ all -> 0x0045 }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x003e }
            X.C11108SAj.A00(r2, r3)     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x002f
            r2.close()     // Catch:{ all -> 0x0045 }
        L_0x002f:
            r3.close()     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x004c }
            java.lang.String r1 = r1.getPath()     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x004c }
            X.Srd r0 = new X.Srd     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x004c }
            r0.<init>()     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x004c }
            r0.A00 = r1     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x004c }
            return r0
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x004c }
            throw r0     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x004c }
        L_0x004c:
            r1 = move-exception
            r0 = 71
            java.lang.String r0 = X.Pxd.A00(r0)
            goto L_0x005b
        L_0x0054:
            r1 = move-exception
            java.lang.String r0 = "Unable to open temp file "
            java.lang.String r0 = X.002.A0R(r0, r7)
        L_0x005b:
            X.0kD.A05(r4, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C394729yb.A00(android.content.Context, java.lang.String):X.Srd");
    }
}
