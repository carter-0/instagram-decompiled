package X;

import java.util.concurrent.Callable;

public final /* synthetic */ class TNE implements Callable {
    public final C12822T8r A00;

    public TNE(C12822T8r t8r) {
        this.A00 = t8r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C9995Rkp.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r8 = this;
            X.T8r r2 = r8.A00
            java.net.URL r5 = r2.A01
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String.valueOf(r0)
            java.lang.String r4 = "FirebaseMessaging"
            java.net.URLConnection r1 = r5.openConnection()     // Catch:{ IOException -> 0x0067 }
            r0 = -1639484572(0xffffffff9e477364, float:-1.05588345E-20)
            X.0fV r6 = X.0fi.A00(r1, r0)     // Catch:{ IOException -> 0x0067 }
            X.RC4 r7 = new X.RC4     // Catch:{ all -> 0x0059 }
            r7.<init>(r6)     // Catch:{ all -> 0x0059 }
            r2.A02 = r6     // Catch:{ all -> 0x004b }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x002f
            X.Pxg.A1N(r4, r5)     // Catch:{ all -> 0x004b }
            r7.close()     // Catch:{ all -> 0x0059 }
            r6.close()     // Catch:{ IOException -> 0x0067 }
            return r0
        L_0x002f:
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x004b }
            int r0 = X.Pxf.A09(r2)     // Catch:{ all -> 0x004b }
            int r0 = r0 + 24
            java.lang.StringBuilder r1 = X.Pxe.A14(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "Failed to decode image: "
            java.lang.String r0 = X.Pxg.A0s(r0, r2, r1)     // Catch:{ all -> 0x004b }
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x004b }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x004d }
        L_0x004d:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r1 = move-exception
            X.RQz r0 = X.C9995Rkp.A00     // Catch:{ all -> 0x0059 }
            r0.A00(r3, r1)     // Catch:{ all -> 0x0059 }
        L_0x0058:
            throw r2     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x005b }
        L_0x005b:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x0060 }
            goto L_0x0066
        L_0x0060:
            r1 = move-exception
            X.RQz r0 = X.C9995Rkp.A00     // Catch:{ IOException -> 0x0067 }
            r0.A00(r3, r1)     // Catch:{ IOException -> 0x0067 }
        L_0x0066:
            throw r2     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            r3 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r0 = X.Pxf.A09(r2)
            int r0 = r0 + 26
            java.lang.StringBuilder r1 = X.Pxe.A14(r0)
            java.lang.String r0 = "Failed to download image: "
            java.lang.String r0 = X.Pxg.A0s(r0, r2, r1)
            android.util.Log.w(r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TNE.call():java.lang.Object");
    }
}
