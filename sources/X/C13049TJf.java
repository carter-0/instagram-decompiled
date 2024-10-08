package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.camera.ImageStoreManager;

/* renamed from: X.TJf  reason: case insensitive filesystem */
public final class C13049TJf implements Runnable {
    public final /* synthetic */ Callback A00;
    public final /* synthetic */ Callback A01;
    public final /* synthetic */ ImageStoreManager A02;
    public final /* synthetic */ String A03;

    public C13049TJf(Callback callback, Callback callback2, ImageStoreManager imageStoreManager, String str) {
        this.A02 = imageStoreManager;
        this.A03 = str;
        this.A01 = callback;
        this.A00 = callback2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|15|16|17) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|27|28) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(3:21|22|23)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x003c=Splitter:B:11:0x003c, B:16:0x004c=Splitter:B:16:0x004c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            r7 = 0
            com.facebook.react.modules.camera.ImageStoreManager r0 = r8.A02     // Catch:{ FileNotFoundException -> 0x0064 }
            X.QZK r0 = X.Pxe.A0T(r0)     // Catch:{ FileNotFoundException -> 0x0064 }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0064 }
            java.lang.String r0 = r8.A03     // Catch:{ FileNotFoundException -> 0x0064 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ FileNotFoundException -> 0x0064 }
            java.io.InputStream r4 = r1.openInputStream(r0)     // Catch:{ FileNotFoundException -> 0x0064 }
            java.lang.String r0 = "null cannot be cast to non-null type java.io.InputStream"
            X.0qQ.A0C(r4, r0)     // Catch:{ FileNotFoundException -> 0x0064 }
            com.facebook.react.bridge.Callback r6 = r8.A01     // Catch:{ IOException -> 0x004d }
            X.0qQ.A0B(r4, r7)     // Catch:{ IOException -> 0x004d }
            java.io.ByteArrayOutputStream r5 = X.Pxe.A0b()     // Catch:{ IOException -> 0x004d }
            r0 = 2
            android.util.Base64OutputStream r3 = new android.util.Base64OutputStream     // Catch:{ IOException -> 0x004d }
            r3.<init>(r5, r0)     // Catch:{ IOException -> 0x004d }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x004d }
        L_0x002e:
            int r1 = r4.read(r2)     // Catch:{ all -> 0x0048 }
            r0 = -1
            if (r1 <= r0) goto L_0x0039
            r3.write(r2, r7, r1)     // Catch:{ all -> 0x0048 }
            goto L_0x002e
        L_0x0039:
            r3.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            java.lang.String r0 = X.DbT.A10(r5)     // Catch:{ IOException -> 0x004d }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x004d }
            r6.invoke(r0)     // Catch:{ IOException -> 0x004d }
            goto L_0x005b
        L_0x0048:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            r0 = move-exception
            com.facebook.react.bridge.Callback r1 = r8.A00     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x005f }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x005f }
            r1.invoke(r0)     // Catch:{ all -> 0x005f }
        L_0x005b:
            r4.close()     // Catch:{ IOException -> 0x006e }
            return
        L_0x005f:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            throw r0     // Catch:{ FileNotFoundException -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            com.facebook.react.bridge.Callback r1 = r8.A00
            java.lang.String r0 = r0.getMessage()
            X.Pxh.A1E(r1, r0)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13049TJf.run():void");
    }
}
