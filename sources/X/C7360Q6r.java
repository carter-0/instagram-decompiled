package X;

import android.os.AsyncTask;

/* renamed from: X.Q6r  reason: case insensitive filesystem */
public abstract class C7360Q6r extends AsyncTask {
    public final C13567Tcn A00;

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011f A[SYNTHETIC, Splitter:B:67:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.Object... r14) {
        /*
            r13 = this;
            r9 = r13
            X.QZ2 r9 = (X.QZ2) r9
            java.lang.String r3 = "Could not close output channel"
            java.lang.String r5 = "Could not close input channel"
            java.lang.String r2 = "ReactNative"
            android.net.Uri r6 = r9.A01
            java.io.File r1 = X.Pxg.A0Y(r6)
            r7 = 0
            java.lang.String r4 = r6.getScheme()     // Catch:{ IOException -> 0x0100, all -> 0x014d }
            java.lang.String r0 = "http"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0100, all -> 0x014d }
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0100, all -> 0x014d }
            if (r0 != 0) goto L_0x002e
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0100, all -> 0x014d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0100, all -> 0x014d }
            java.nio.channels.FileChannel r8 = r0.getChannel()     // Catch:{ IOException -> 0x0100, all -> 0x014d }
            goto L_0x003f
        L_0x002e:
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x0100, all -> 0x014d }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0100, all -> 0x014d }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0100, all -> 0x014d }
            java.io.InputStream r0 = r0.openStream()     // Catch:{ IOException -> 0x0100, all -> 0x014d }
            java.nio.channels.ReadableByteChannel r8 = java.nio.channels.Channels.newChannel(r0)     // Catch:{ IOException -> 0x0100, all -> 0x014d }
        L_0x003f:
            java.lang.String r0 = android.os.Environment.DIRECTORY_DCIM     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            java.io.File r11 = X.0eY.A00(r0)     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            r11.mkdirs()     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            boolean r0 = r11.isDirectory()     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            if (r0 != 0) goto L_0x006b
            X.TjR r4 = r9.A02     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            java.lang.String r1 = "E_UNABLE_TO_LOAD"
            java.lang.String r0 = "External media storage directory not available"
            com.facebook.react.bridge.PromiseImpl r4 = (com.facebook.react.bridge.PromiseImpl) r4     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            r4.reject(r1, r0, r7, r7)     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            if (r8 == 0) goto L_0x0127
            boolean r0 = r8.isOpen()
            if (r0 == 0) goto L_0x0127
            r8.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x006a
        L_0x0065:
            r0 = move-exception
            X.0I1.A05(r2, r5, r0)
            return
        L_0x006a:
            return
        L_0x006b:
            java.lang.String r0 = r1.getName()     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            java.io.File r12 = X.JTO.A0s(r11, r0)     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            java.lang.String r10 = r1.getName()     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            r4 = 46
            int r1 = r10.indexOf(r4)     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            r0 = 0
            if (r1 < 0) goto L_0x008e
            int r1 = r10.lastIndexOf(r4)     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            java.lang.String r0 = r10.substring(r0, r1)     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            java.lang.String r6 = r10.substring(r1)     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            r10 = r0
            goto L_0x0090
        L_0x008e:
            java.lang.String r6 = ""
        L_0x0090:
            r4 = 0
        L_0x0091:
            boolean r0 = r12.createNewFile()     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "_"
            int r1 = r4 + 1
            java.lang.String r0 = X.002.A06(r4, r10, r0, r6)     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            java.io.File r12 = X.JTO.A0s(r11, r0)     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            r4 = r1
            goto L_0x0091
        L_0x00a5:
            java.io.FileOutputStream r0 = X.JTO.A0t(r12)     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            java.nio.channels.FileChannel r4 = r0.getChannel()     // Catch:{ IOException -> 0x00fa, all -> 0x00f7 }
            r0 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
        L_0x00b3:
            int r0 = r8.read(r1)     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            if (r0 <= 0) goto L_0x00c3
            r1.flip()     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            r4.write(r1)     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            r1.compact()     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            goto L_0x00b3
        L_0x00c3:
            r1.flip()     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
        L_0x00c6:
            boolean r0 = r1.hasRemaining()     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            if (r0 == 0) goto L_0x00d0
            r4.write(r1)     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            goto L_0x00c6
        L_0x00d0:
            r8.close()     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            r4.close()     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            android.content.Context r6 = r9.A00     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            X.SVp r0 = new X.SVp     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            r0.<init>(r9)     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            android.media.MediaScannerConnection.scanFile(r6, r1, r7, r0)     // Catch:{ IOException -> 0x00fd, all -> 0x012a }
            boolean r0 = r8.isOpen()
            if (r0 == 0) goto L_0x0119
            r8.close()     // Catch:{ IOException -> 0x00f2 }
            goto L_0x0119
        L_0x00f2:
            r0 = move-exception
            X.0I1.A05(r2, r5, r0)
            goto L_0x0119
        L_0x00f7:
            r1 = move-exception
            r4 = r7
            goto L_0x012b
        L_0x00fa:
            r1 = move-exception
            r4 = r7
            goto L_0x00fe
        L_0x00fd:
            r1 = move-exception
        L_0x00fe:
            r7 = r8
            goto L_0x0102
        L_0x0100:
            r1 = move-exception
            r4 = r7
        L_0x0102:
            X.TjR r0 = r9.A02     // Catch:{ all -> 0x0128 }
            r0.reject(r1)     // Catch:{ all -> 0x0128 }
            if (r7 == 0) goto L_0x0117
            boolean r0 = r7.isOpen()
            if (r0 == 0) goto L_0x0117
            r7.close()     // Catch:{ IOException -> 0x0113 }
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            X.0I1.A05(r2, r5, r0)
        L_0x0117:
            if (r4 == 0) goto L_0x0127
        L_0x0119:
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L_0x0127
            r4.close()     // Catch:{ IOException -> 0x0123 }
            return
        L_0x0123:
            r0 = move-exception
            X.0I1.A05(r2, r3, r0)
        L_0x0127:
            return
        L_0x0128:
            r1 = move-exception
            goto L_0x012c
        L_0x012a:
            r1 = move-exception
        L_0x012b:
            r7 = r8
        L_0x012c:
            if (r7 == 0) goto L_0x013c
            boolean r0 = r7.isOpen()
            if (r0 == 0) goto L_0x013c
            r7.close()     // Catch:{ IOException -> 0x0138 }
            goto L_0x013c
        L_0x0138:
            r0 = move-exception
            X.0I1.A05(r2, r5, r0)
        L_0x013c:
            if (r4 == 0) goto L_0x014e
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L_0x014e
            r4.close()     // Catch:{ IOException -> 0x0148 }
            throw r1
        L_0x0148:
            r0 = move-exception
            X.0I1.A05(r2, r3, r0)
            throw r1
        L_0x014d:
            r1 = move-exception
        L_0x014e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7360Q6r.A00(java.lang.Object[]):void");
    }

    public C7360Q6r(Q6H q6h) {
        C13567Tcn tcn = q6h.A00;
        if (tcn == null) {
            tcn = new C12214SpE(q6h);
            q6h.A00 = tcn;
        }
        this.A00 = tcn;
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            A00(objArr);
            return null;
        } catch (RuntimeException e) {
            this.A00.handleException(e);
            return null;
        }
    }
}
