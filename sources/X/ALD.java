package X;

import android.media.ImageReader;

public final /* synthetic */ class ALD implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ C364078kp A00;

    public /* synthetic */ ALD(C364078kp r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.8kR, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onImageAvailable(android.media.ImageReader r14) {
        /*
            r13 = this;
            X.8kp r1 = r13.A00
            X.8kr r3 = r1.A01
            android.media.ImageReader r0 = r1.A00
            r6 = 0
            if (r0 == 0) goto L_0x000e
            r0.setOnImageAvailableListener(r6, r6)
            r1.A01 = r6
        L_0x000e:
            android.media.Image r5 = r14.acquireLatestImage()     // Catch:{ Exception -> 0x0034 }
            if (r5 == 0) goto L_0x0043
            X.8kR r4 = new X.8kR     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            r11 = 1
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r12 = r11
            r4.A02(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0027 }
            r6 = r4
            r5.close()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0043
        L_0x0027:
            r1 = move-exception
            goto L_0x002b
        L_0x0029:
            r1 = move-exception
            r4 = r6
        L_0x002b:
            r5.close()     // Catch:{ all -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ Exception -> 0x0036 }
        L_0x0033:
            throw r1     // Catch:{ Exception -> 0x0036 }
        L_0x0034:
            r2 = move-exception
            goto L_0x0038
        L_0x0036:
            r2 = move-exception
            r6 = r4
        L_0x0038:
            java.lang.String r1 = "YuvPhotoProcessor"
            java.lang.String r0 = "Failed to acquire image: "
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r0, r2)
            X.C340577lU.A02(r1, r0)
        L_0x0043:
            if (r3 == 0) goto L_0x004d
            X.8ku r0 = new X.8ku
            r0.<init>(r6)
            r3.A00(r0)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALD.onImageAvailable(android.media.ImageReader):void");
    }
}
