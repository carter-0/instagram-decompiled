package X;

import java.util.concurrent.Callable;

public final class TN6 implements Callable {
    public final /* synthetic */ C8483QvV A00;

    public TN6(C8483QvV qvV) {
        this.A00 = qvV;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075 A[SYNTHETIC, Splitter:B:33:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082 A[SYNTHETIC, Splitter:B:40:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008e A[SYNTHETIC, Splitter:B:50:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object call() {
        /*
            r11 = this;
            X.QvV r3 = r11.A00
            X.SFa r0 = X.C11381SQt.A00(r3)
            android.content.Context r6 = r0.A01
            java.lang.String r5 = "gaClientId"
            java.lang.String r2 = "Failed to close client id reading stream"
            java.lang.String r0 = "ClientId should be loaded from worker thread"
            X.AnonymousClass3Qk.A05(r0)
            r10 = 0
            java.io.FileInputStream r4 = r6.openFileInput(r5)     // Catch:{ FileNotFoundException -> 0x008b, IOException -> 0x0069, all -> 0x0067 }
            r0 = 36
            byte[] r9 = new byte[r0]     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            r8 = 0
            int r7 = r4.read(r9, r8, r0)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            int r0 = r4.available()     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            if (r0 <= 0) goto L_0x0035
            java.lang.String r1 = "clientId file seems corrupted, deleting it."
            r0 = 5
            X.ST5.A0B(r3, r1, r0)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            r6.deleteFile(r5)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            r4.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x009b
        L_0x0035:
            r0 = 14
            if (r7 >= r0) goto L_0x004e
            java.lang.String r1 = "clientId file is empty, deleting it."
            r0 = 5
            X.ST5.A0B(r3, r1, r0)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            r6.deleteFile(r5)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            r4.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x009b
        L_0x0049:
            r0 = move-exception
            r3.A0H(r2, r0)
            goto L_0x009b
        L_0x004e:
            r4.close()     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            java.lang.String r1 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            r1.<init>(r9, r8, r7)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            java.lang.String r0 = "Read client id from disk"
            r3.A0E(r0, r1)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0065 }
            r4.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r0 = move-exception
            r3.A0H(r2, r0)
        L_0x0063:
            r10 = r1
            goto L_0x009b
        L_0x0065:
            r1 = move-exception
            goto L_0x006b
        L_0x0067:
            r1 = move-exception
            goto L_0x0080
        L_0x0069:
            r1 = move-exception
            r4 = r10
        L_0x006b:
            java.lang.String r0 = "Error reading client id file, deleting it"
            r3.A0H(r0, r1)     // Catch:{ all -> 0x007e }
            r6.deleteFile(r5)     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x009b
            r4.close()     // Catch:{ IOException -> 0x0079 }
            goto L_0x009b
        L_0x0079:
            r0 = move-exception
            r3.A0H(r2, r0)
            goto L_0x009b
        L_0x007e:
            r1 = move-exception
            r10 = r4
        L_0x0080:
            if (r10 == 0) goto L_0x008a
            r10.close()     // Catch:{ IOException -> 0x0086 }
            throw r1
        L_0x0086:
            r0 = move-exception
            r3.A0H(r2, r0)
        L_0x008a:
            throw r1
        L_0x008b:
            r4 = r10
        L_0x008c:
            if (r4 == 0) goto L_0x009b
            r4.close()     // Catch:{ IOException -> 0x0092 }
            goto L_0x009b
        L_0x0092:
            r0 = move-exception
            r3.A0H(r2, r0)
            goto L_0x009b
        L_0x0097:
            r0 = move-exception
            r3.A0H(r2, r0)
        L_0x009b:
            if (r10 != 0) goto L_0x00a1
            java.lang.String r10 = X.C8483QvV.A00(r3)
        L_0x00a1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TN6.call():java.lang.Object");
    }
}
