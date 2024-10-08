package X;

import android.graphics.Rect;
import java.util.concurrent.Callable;

/* renamed from: X.TNq  reason: case insensitive filesystem */
public final class C13158TNq implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static Rect A00(int i, int i2, int i3, int i4) {
        int min = Math.min((int) (((float) (i - i2)) * 0.2f), (int) (0.2f * ((float) (i3 - i4))));
        return new Rect(Math.max(i2 - min, 0), Math.max(i4 - min, 0), i + min, i3 + min);
    }

    public C13158TNq(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [com.facebook.smartcapture.view.IdCaptureActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r1v10, types: [android.content.Context, com.facebook.smartcapture.view.IdCaptureActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0288, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        X.1zE.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0294, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0295, code lost:
        r3.A0E.logError("Photo save error", r2);
        r1 = (X.C13777Tgs) r20.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02a2, code lost:
        if (r1 != null) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02a4, code lost:
        r1 = (com.facebook.smartcapture.view.IdCaptureActivity) r1;
        r1.runOnUiThread(new X.C12906TCu(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02ae, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0294 A[ExcHandler: FileNotFoundException | IOException (r2v4 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:33:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0089 A[Catch:{ FileNotFoundException | IOException -> 0x0294 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r21 = this;
            r5 = r21
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x02af;
                case 1: goto L_0x0035;
                case 2: goto L_0x02e8;
                case 3: goto L_0x02ba;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A01
            X.13i r0 = (X.C635813i) r0
            java.lang.Object r4 = r5.A02
            java.util.concurrent.Callable r4 = (java.util.concurrent.Callable) r4
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r2 = r3.getName()
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r3.setName(r0)     // Catch:{ SecurityException -> 0x0021 }
            goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            java.lang.Object r19 = r4.call()     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x02b9
            r3.setName(r2)     // Catch:{ SecurityException -> 0x02b9 }
            return r19
        L_0x002e:
            r0 = move-exception
            if (r1 == 0) goto L_0x0034
            r3.setName(r2)     // Catch:{ SecurityException -> 0x0034 }
        L_0x0034:
            throw r0
        L_0x0035:
            java.lang.Object r3 = r5.A02
            X.SoH r3 = (X.C12166SoH) r3
            java.lang.ref.WeakReference r0 = r3.A0K
            r20 = r0
            java.lang.Object r1 = r20.get()
            X.Tgs r1 = (X.C13777Tgs) r1
            r8 = 0
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r8)
            if (r1 == 0) goto L_0x02b9
            com.facebook.smartcapture.flow.IdCaptureConfig r2 = r3.A0D
            X.RDv r9 = r3.A03
            java.lang.String r7 = X.C9583RdN.A00(r9, r2)
            com.facebook.smartcapture.docauth.CaptureState r4 = r3.A04
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.CAPTURING_AUTOMATIC
            if (r4 != r0) goto L_0x0070
            com.facebook.smartcapture.logging.AuthenticityUploadMedium r6 = com.facebook.smartcapture.logging.AuthenticityUploadMedium.SC_V2_AUTO
        L_0x005a:
            int r4 = r9.ordinal()
            if (r4 == r8) goto L_0x006b
            r0 = 1
            if (r4 != r0) goto L_0x0073
            java.util.Map r4 = r3.A0L
            X.RE6 r0 = X.RE6.ID_BACK
        L_0x0067:
            r4.put(r0, r6)
            goto L_0x0073
        L_0x006b:
            java.util.Map r4 = r3.A0L
            X.RE6 r0 = X.RE6.ID_FRONT
            goto L_0x0067
        L_0x0070:
            com.facebook.smartcapture.logging.AuthenticityUploadMedium r6 = com.facebook.smartcapture.logging.AuthenticityUploadMedium.CAMERA_MANUAL
            goto L_0x005a
        L_0x0073:
            android.graphics.BitmapFactory$Options r12 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r12.<init>()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r4 = 1
            r12.inJustDecodeBounds = r4     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.Object r6 = r5.A01     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.8kS r6 = (X.C363858kS) r6     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.8kz r0 = X.C363858kS.A0X     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.Object r5 = r6.A04(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            byte[] r5 = (byte[]) r5     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            if (r5 == 0) goto L_0x02b9
            int r0 = r5.length     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r18 = r0
            X.0fP.A00(r5, r8, r0, r12)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.8ky r0 = X.C363858kS.A0N     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.Object r10 = r6.A03(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.0qQ.A07(r10)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            android.graphics.Rect r10 = (android.graphics.Rect) r10     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r9 = r3.A01     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            com.facebook.smartcapture.view.IdCaptureActivity r1 = (com.facebook.smartcapture.view.IdCaptureActivity) r1     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.Ti8 r0 = r1.A02     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.0qQ.A0A(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r17 = r0.Boi(r9)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r15 = r10.width()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r13 = r10.height()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            android.widget.FrameLayout r0 = r1.A01     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.0qQ.A0A(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r11 = r0.getWidth()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            android.widget.FrameLayout r0 = r1.A01     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.0qQ.A0A(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r10 = r0.getHeight()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r9 = r12.outWidth     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r12 = r12.outHeight     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            boolean r16 = X.C51970G9q.A1W(r12, r9)
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r1)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r1 = r0.density     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            com.facebook.smartcapture.docauth.DocumentType r0 = r3.A05     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            if (r0 != 0) goto L_0x00d5
            com.facebook.smartcapture.docauth.DocumentType r0 = r3.A0B     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
        L_0x00d5:
            android.graphics.Rect r1 = X.Pxk.A0A(r0, r1, r11, r10)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            android.graphics.Rect r14 = X.AnonymousClass7TE.A0W()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.C11321SMv.A01(r14, r15, r13, r9, r12)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r9 = r14.width()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r0 = r14.height()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            android.graphics.Rect r13 = X.AnonymousClass7TE.A0W()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.C11321SMv.A01(r13, r11, r10, r9, r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r0 = r13.width()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r10 = (float) r0     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r0 = (float) r11     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r10 = r10 / r0
            int r0 = r14.left     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r15 = r13.left     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r0 = r0 + r15
            float r11 = (float) r0     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r0 = r1.left     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r9 = (float) r0     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r9 = r9 * r10
            float r11 = r11 + r9
            int r11 = (int) r11     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r0 = r14.top     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r13 = r13.top     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r0 = r0 + r13
            float r0 = (float) r0     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r1 = r1.top     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r1 = (float) r1     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r1 = r1 * r10
            float r0 = r0 + r1
            int r10 = (int) r0     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r0 = r14.right     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r0 = r0 - r15
            float r0 = (float) r0     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r0 = r0 - r9
            int r9 = (int) r0     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r0 = r14.bottom     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r0 = r0 - r13
            float r0 = (float) r0     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r0 = r0 - r1
            int r1 = (int) r0     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            if (r16 == 0) goto L_0x0131
            android.graphics.Rect r10 = A00(r9, r11, r1, r10)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
        L_0x0120:
            int r0 = X.C364138kv.A00(r5)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r9 = 90
            if (r0 > 0) goto L_0x0149
            r0 = r17
            int r0 = 450 - r0
            int r1 = r0 % 360
            if (r16 == 0) goto L_0x0141
            goto L_0x0139
        L_0x0131:
            int r0 = r12 - r9
            int r12 = r12 - r11
            android.graphics.Rect r10 = A00(r1, r10, r12, r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            goto L_0x0120
        L_0x0139:
            if (r1 == r9) goto L_0x013f
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L_0x0148
        L_0x013f:
            r9 = 0
            goto L_0x0149
        L_0x0141:
            if (r1 == 0) goto L_0x0149
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 != r0) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r9 = r1
        L_0x0149:
            r0 = r18
            android.graphics.BitmapRegionDecoder r1 = android.graphics.BitmapRegionDecoder.newInstance(r5, r8, r0, r4)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.0qQ.A07(r1)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r0 = 0
            android.graphics.Bitmap r12 = r1.decodeRegion(r10, r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.0qQ.A07(r12)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            if (r9 == 0) goto L_0x0183
            android.graphics.Matrix r10 = X.AnonymousClass7TE.A0U()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r0 = (float) r9     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r10.postRotate(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            long r13 = r5.totalMemory()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            long r0 = r5.freeMemory()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            long r13 = r13 - r0
            long r8 = r5.maxMemory()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            long r8 = r8 - r13
            int r0 = r12.getAllocationByteCount()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            long r0 = (long) r0     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x028d
            android.graphics.Bitmap r12 = X.Pxh.A0H(r12, r10)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
        L_0x0183:
            if (r12 == 0) goto L_0x02b9
            long r0 = r2.A01     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r5.<init>(r7)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            android.graphics.Bitmap$CompressFormat r14 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0286 }
            r13 = 90
            X.0fO.A02(r14, r12, r5, r13)     // Catch:{ all -> 0x0286 }
            r5.close()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r10 = r12.getWidth()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r9 = r12.getHeight()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            long r17 = X.Pxf.A0F(r7)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r11 = 0
        L_0x01a3:
            r15 = 0
            int r5 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d9
            int r5 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d9
            int r11 = r11 + 1
            java.io.File r5 = X.AnonymousClass7TE.A0t(r7)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r5.delete()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r5 = (float) r10     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r8 = 1064514355(0x3f733333, float:0.95)
            float r5 = r5 * r8
            int r10 = (int) r5     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r5 = (float) r9     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            float r5 = r5 * r8
            int r9 = (int) r5     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            android.graphics.Bitmap r8 = X.0fO.A00(r12, r10, r9, r4)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.0qQ.A07(r8)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r5.<init>(r7)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.0fO.A02(r14, r8, r5, r13)     // Catch:{ all -> 0x0286 }
            r5.close()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r8.recycle()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            long r17 = X.Pxf.A0F(r7)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            goto L_0x01a3
        L_0x01d9:
            com.facebook.smartcapture.logging.InMemoryLogger r1 = r3.A0F     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.String r0 = "cropped_bitmap_info"
            com.facebook.smartcapture.logging.InMemoryLogger$LogEntryBuilder r5 = r1.addEntry(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.String r0 = "resize_count"
            r5.put((java.lang.String) r0, (int) r11)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.String r0 = "width"
            r5.put((java.lang.String) r0, (int) r10)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.String r0 = "height"
            r5.put((java.lang.String) r0, (int) r9)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.Long r1 = java.lang.Long.valueOf(r17)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.String r0 = "size"
            r5.put((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r5.submit()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.2kK r5 = new X.2kK     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r5.<init>((java.lang.String) r7)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.8ky r0 = X.C363858kS.A0M     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.Object r0 = r6.A03(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.0qQ.A07(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r1 = r0.width()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r0 = r0.height()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            if (r1 <= r0) goto L_0x0223
            r0 = 6
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.String r0 = "Orientation"
            r5.A0P(r0, r1)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
        L_0x0223:
            java.lang.String r1 = r2.A0D     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r0 = 4299(0x10cb, float:6.024E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.String r2 = X.002.A0R(r1, r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x026a, FileNotFoundException | IOException -> 0x0294 }
            byte[] r0 = X.C66582MXn.A1a(r2)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r1.update(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.StringBuilder r8 = X.AnonymousClass7TE.A1A()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            byte[] r7 = r1.digest()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.0qQ.A07(r7)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r6 = r7.length     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r2 = 0
        L_0x0249:
            if (r2 >= r6) goto L_0x0275
            byte r0 = r7[r2]     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r4)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.String r0 = "%02x"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            X.0qQ.A07(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r8.append(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            int r2 = r2 + 1
            goto L_0x0249
        L_0x026a:
            r2 = move-exception
            com.facebook.smartcapture.logging.IdCaptureLogger r1 = r3.A0E     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.String r0 = "Error in getting MessageDigest for submission hash"
            r1.logError(r0, r2)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.String r1 = ""
            goto L_0x0279
        L_0x0275:
            java.lang.String r1 = X.DbT.A10(r8)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
        L_0x0279:
            java.lang.String r0 = "UserComment"
            r5.A0P(r0, r1)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            r5.A0O()     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r4)
            return r19
        L_0x0286:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0288 }
        L_0x0288:
            r0 = move-exception
            X.1zE.A00(r5, r1)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
            goto L_0x0293
        L_0x028d:
            java.lang.String r0 = "Source bitmap null or not enough memory to allocate rotated bitmap"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
        L_0x0293:
            throw r0     // Catch:{ FileNotFoundException | IOException -> 0x0294 }
        L_0x0294:
            r2 = move-exception
            java.lang.String r1 = "Photo save error"
            com.facebook.smartcapture.logging.IdCaptureLogger r0 = r3.A0E
            r0.logError(r1, r2)
            java.lang.Object r1 = r20.get()
            X.Tgs r1 = (X.C13777Tgs) r1
            if (r1 == 0) goto L_0x02b9
            com.facebook.smartcapture.view.IdCaptureActivity r1 = (com.facebook.smartcapture.view.IdCaptureActivity) r1
            X.TCu r0 = new X.TCu
            r0.<init>(r1)
            r1.runOnUiThread(r0)
            return r19
        L_0x02af:
            java.lang.Object r0 = r5.A02
            X.PzC r0 = (X.PzC) r0
            java.lang.String r0 = r0.A01
            android.graphics.Bitmap r19 = android.graphics.BitmapFactory.decodeFile(r0)
        L_0x02b9:
            return r19
        L_0x02ba:
            java.lang.Object r0 = r5.A02
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            java.lang.Object r3 = r0.get()
            X.Tia r3 = (X.C13855Tia) r3
            r0 = 0
            java.lang.String r2 = "scheduleReleaseDemuxDecodeWrapper: demuxDecodeWrapper.release"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x02d3 }
            java.lang.String r0 = "MultipleTrackCoordinatorRealtime"
            X.Q1V.A00(r0, r2, r1)     // Catch:{ all -> 0x02d3 }
            r3.release()     // Catch:{ all -> 0x02d3 }
            goto L_0x0303
        L_0x02d3:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            java.lang.String r1 = "scheduleReleaseDemuxDecodeWrapper: Throwable=%s"
            java.lang.String r0 = "MultipleTrackCoordinatorRealtime"
            X.Q1V.A00(r0, r1, r2)
            java.lang.String r1 = "async release failed"
            X.4ZS r0 = new X.4ZS
            r0.<init>(r1, r3)
            throw r0
        L_0x02e8:
            java.lang.Object r0 = r5.A02     // Catch:{ all -> 0x02f8 }
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0     // Catch:{ all -> 0x02f8 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x02f8 }
            X.Tia r0 = (X.C13855Tia) r0     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x0303
            r0.release()     // Catch:{ all -> 0x02f8 }
            goto L_0x0303
        L_0x02f8:
            r2 = move-exception
            java.lang.Object r0 = r5.A01
            X.STM r0 = (X.STM) r0
            android.os.Handler r1 = r0.A0D
            r0 = 7
            X.Pxe.A1N(r1, r2, r0)
        L_0x0303:
            r19 = 0
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13158TNq.call():java.lang.Object");
    }
}
