package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Callable;

/* renamed from: X.JaW  reason: case insensitive filesystem */
public final class C59855JaW implements Callable {
    public final Context A00;
    public final Bitmap.CompressFormat A01 = C59854JaV.A01;
    public final Uri A02;
    public final Uri A03;
    public final UserSession A04;
    public final boolean A05;

    public C59855JaW(Context context, Uri uri, Uri uri2, UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = uri;
        this.A03 = uri2;
        this.A00 = context;
        this.A05 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x019f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        X.1zE.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01a3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x020a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x020b, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007d, code lost:
        if (r6 != null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r17.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0172, code lost:
        if (r14 == false) goto L_0x01ff;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:41:0x0082, B:45:0x0089] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x011d */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01d1 A[Catch:{ all -> 0x008d, all -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ea A[Catch:{ Exception -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f7 A[Catch:{ Exception -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0101 A[Catch:{ Exception -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013e A[Catch:{ all -> 0x008d, all -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015b A[Catch:{ all -> 0x008d, all -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x016e A[Catch:{ all -> 0x008d, all -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0176 A[Catch:{ all -> 0x008d, all -> 0x020a }] */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C59861Jad call() {
        /*
            r23 = this;
            java.lang.String r4 = "No input stream for "
            r13 = r23
            android.content.Context r11 = r13.A00
            android.content.ContentResolver r10 = r11.getContentResolver()
            r5 = 0
            android.net.Uri r3 = r13.A02     // Catch:{ all -> 0x0208 }
            java.io.InputStream r2 = r10.openInputStream(r3)     // Catch:{ all -> 0x0208 }
            if (r2 == 0) goto L_0x00ad
            android.net.Uri r0 = r13.A03     // Catch:{ all -> 0x020a }
            java.lang.String r16 = "Required value was null."
            if (r0 != 0) goto L_0x001a
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x020a }
            if (r0 == 0) goto L_0x00a8
            java.io.File r12 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ all -> 0x020a }
            goto L_0x0029
        L_0x0025:
            java.io.File r12 = X.0mb.A04(r11)     // Catch:{ all -> 0x020a }
        L_0x0029:
            boolean r0 = X.0mb.A09(r12, r2)     // Catch:{ all -> 0x020a }
            if (r0 == 0) goto L_0x00a1
            android.net.Uri r9 = android.net.Uri.fromFile(r12)     // Catch:{ all -> 0x020a }
            com.instagram.creation.photo.util.ExifImageData r4 = new com.instagram.creation.photo.util.ExifImageData     // Catch:{ all -> 0x020a }
            r4.<init>()     // Catch:{ all -> 0x020a }
            java.lang.String r1 = r3.getScheme()     // Catch:{ all -> 0x020a }
            if (r1 == 0) goto L_0x00ca
            java.lang.String r0 = "content"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x020a }
            if (r0 == 0) goto L_0x0092
            android.content.ContentProviderClient r17 = X.C61990qh.A00(r11, r3)     // Catch:{ all -> 0x020a }
            if (r17 == 0) goto L_0x00ca
            java.lang.String r1 = "_data"
            java.lang.String[] r19 = new java.lang.String[]{r1}     // Catch:{ RemoteException -> 0x0086 }
            r18 = r3
            r20 = r5
            r21 = r5
            r22 = r5
            android.database.Cursor r6 = r17.query(r18, r19, r20, r21, r22)     // Catch:{ RemoteException -> 0x0086 }
            if (r6 == 0) goto L_0x007c
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x007c
            int r1 = r6.getColumnIndex(r1)     // Catch:{ all -> 0x0072 }
            r0 = -1
            if (r1 == r0) goto L_0x007c
            java.lang.String r1 = r6.getString(r1)     // Catch:{ all -> 0x0072 }
            goto L_0x007f
        L_0x0072:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r0 = move-exception
            X.086.A00(r1, r0)     // Catch:{ RemoteException -> 0x0086 }
        L_0x007b:
            throw r1     // Catch:{ RemoteException -> 0x0086 }
        L_0x007c:
            r1 = r5
            if (r6 == 0) goto L_0x0082
        L_0x007f:
            r6.close()     // Catch:{ RemoteException -> 0x0086 }
        L_0x0082:
            r17.release()     // Catch:{ all -> 0x020a }
            goto L_0x009e
        L_0x0086:
            r1 = move-exception
            java.lang.String r0 = "Remote exception while getting file path "
            X.0wb.A07(r0, r1)     // Catch:{ all -> 0x008d }
            goto L_0x00c7
        L_0x008d:
            r0 = move-exception
            r17.release()     // Catch:{ all -> 0x020a }
            goto L_0x00d4
        L_0x0092:
            java.lang.String r0 = "file"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x020a }
            if (r0 == 0) goto L_0x00ca
            java.lang.String r1 = r3.getEncodedPath()     // Catch:{ all -> 0x020a }
        L_0x009e:
            if (r1 != 0) goto L_0x00d5
            goto L_0x00ca
        L_0x00a1:
            java.lang.String r0 = "Failed to copy file"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x020a }
            goto L_0x00d4
        L_0x00a8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)     // Catch:{ all -> 0x020a }
            goto L_0x00d4
        L_0x00ad:
            java.lang.String r1 = "LoadImageTask"
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x020a }
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r4, r0)     // Catch:{ all -> 0x020a }
            X.0kD.A0C(r1, r0, r5)     // Catch:{ all -> 0x020a }
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x020a }
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r4, r0)     // Catch:{ all -> 0x020a }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x020a }
            goto L_0x00d4
        L_0x00c7:
            r17.release()     // Catch:{ all -> 0x020a }
        L_0x00ca:
            java.lang.String r1 = r9.getPath()     // Catch:{ all -> 0x020a }
            if (r1 != 0) goto L_0x00d5
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)     // Catch:{ all -> 0x020a }
        L_0x00d4:
            throw r0     // Catch:{ all -> 0x020a }
        L_0x00d5:
            r15 = 0
            r8 = 1
            X.2kK r14 = new X.2kK     // Catch:{ Exception -> 0x011d }
            r14.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x011d }
            java.lang.String r0 = "Orientation"
            int r7 = r14.A0M(r0, r8)     // Catch:{ Exception -> 0x011d }
            r6 = 0
            if (r7 == 0) goto L_0x00f9
            if (r7 == r8) goto L_0x00f9
            r0 = 3
            if (r7 == r0) goto L_0x00f7
            r0 = 6
            if (r7 == r0) goto L_0x00f4
            r0 = 8
            if (r7 != r0) goto L_0x00f9
            r6 = 270(0x10e, float:3.78E-43)
            goto L_0x00f9
        L_0x00f4:
            r6 = 90
            goto L_0x00f9
        L_0x00f7:
            r6 = 180(0xb4, float:2.52E-43)
        L_0x00f9:
            r4.A00 = r6     // Catch:{ Exception -> 0x011d }
            double[] r14 = X.C379829Vm.A04(r14)     // Catch:{ Exception -> 0x011d }
            if (r14 == 0) goto L_0x0111
            r6 = r14[r15]     // Catch:{ Exception -> 0x011d }
            java.lang.Double r0 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x011d }
            r4.A01 = r0     // Catch:{ Exception -> 0x011d }
            r6 = r14[r8]     // Catch:{ Exception -> 0x011d }
            java.lang.Double r0 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x011d }
            r4.A02 = r0     // Catch:{ Exception -> 0x011d }
        L_0x0111:
            java.util.HashMap r6 = X.C379839Vn.A00(r1)     // Catch:{ Exception -> 0x011d }
            java.util.HashMap r0 = r4.A03     // Catch:{ Exception -> 0x011d }
            r0.clear()     // Catch:{ Exception -> 0x011d }
            r0.putAll(r6)     // Catch:{ Exception -> 0x011d }
        L_0x011d:
            X.0qQ.A0A(r9)     // Catch:{ all -> 0x020a }
            X.8m1 r6 = new X.8m1     // Catch:{ all -> 0x020a }
            r6.<init>(r10, r9, r3)     // Catch:{ all -> 0x020a }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x020a }
            r7.<init>()     // Catch:{ all -> 0x020a }
            r14 = 1
            r7.inJustDecodeBounds = r8     // Catch:{ all -> 0x020a }
            android.graphics.BitmapFactory.decodeFile(r1, r7)     // Catch:{ all -> 0x020a }
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3     // Catch:{ all -> 0x020a }
            android.graphics.ColorSpace r1 = android.graphics.ColorSpace.get(r0)     // Catch:{ all -> 0x020a }
            android.graphics.ColorSpace r0 = r7.outColorSpace     // Catch:{ all -> 0x020a }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x020a }
            if (r0 != 0) goto L_0x013f
            r14 = 0
        L_0x013f:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x020a }
            long r7 = r0.maxMemory()     // Catch:{ all -> 0x020a }
            double r0 = (double) r7     // Catch:{ all -> 0x020a }
            r7 = 4590429028186199163(0x3fb47ae147ae147b, double:0.08)
            double r0 = r0 * r7
            int r7 = (int) r0     // Catch:{ all -> 0x020a }
            int r0 = r7 / 4
            android.graphics.Bitmap r1 = r6.AWY(r0, r15, r14)     // Catch:{ all -> 0x020a }
            boolean r0 = r6.CW0()     // Catch:{ all -> 0x020a }
            if (r0 == 0) goto L_0x016e
            boolean r0 = r13.A05     // Catch:{ all -> 0x020a }
            if (r0 != 0) goto L_0x0174
            if (r12 == 0) goto L_0x0168
            boolean r0 = X.0mf.A01(r12)     // Catch:{ all -> 0x020a }
            if (r0 != 0) goto L_0x0174
            goto L_0x0172
        L_0x0168:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)     // Catch:{ all -> 0x020a }
            goto L_0x00d4
        L_0x016e:
            X.C364798m1.A01(r6)     // Catch:{ all -> 0x020a }
            goto L_0x0174
        L_0x0172:
            if (r14 == 0) goto L_0x01ff
        L_0x0174:
            if (r1 == 0) goto L_0x01d1
            android.graphics.Bitmap$CompressFormat r7 = r13.A01     // Catch:{ all -> 0x020a }
            java.lang.String r12 = r9.getPath()     // Catch:{ all -> 0x020a }
            if (r12 == 0) goto L_0x01cb
            r6 = 100
            android.content.ContentResolver r8 = r11.getContentResolver()     // Catch:{ all -> 0x020a }
            android.net.Uri r0 = X.JTQ.A09(r12)     // Catch:{ IOException -> 0x01a4 }
            java.io.OutputStream r8 = r8.openOutputStream(r0)     // Catch:{ IOException -> 0x01a4 }
            if (r8 == 0) goto L_0x01b0
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x019d }
            X.0fO.A01(r0, r1, r6)     // Catch:{ all -> 0x019d }
            boolean r0 = r1.compress(r0, r6, r8)     // Catch:{ all -> 0x019d }
            r8.close()     // Catch:{ IOException -> 0x01a4 }
            if (r0 == 0) goto L_0x01b0
            goto L_0x01fa
        L_0x019d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x019f }
        L_0x019f:
            r0 = move-exception
            X.1zE.A00(r8, r1)     // Catch:{ IOException -> 0x01a4 }
            throw r0     // Catch:{ IOException -> 0x01a4 }
        L_0x01a4:
            r4 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[]{r12}     // Catch:{ all -> 0x020a }
            java.lang.String r1 = "LoadImageTask"
            java.lang.String r0 = "Cannot compress bitmap to file: %s"
            X.0KC.A0L(r1, r0, r4, r3)     // Catch:{ all -> 0x020a }
        L_0x01b0:
            java.lang.String r3 = "LoadImageTask_CompressError"
            java.lang.String r1 = "Unable to compress image to format=%s and quality=%d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x020a }
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r0}     // Catch:{ all -> 0x020a }
            java.lang.String r0 = X.0mp.A06(r1, r0)     // Catch:{ all -> 0x020a }
            X.0kD.A0C(r3, r0, r5)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "Failed to compress bitmap"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x020a }
            goto L_0x00d4
        L_0x01cb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)     // Catch:{ all -> 0x020a }
            goto L_0x00d4
        L_0x01d1:
            java.lang.String r4 = "LoadImageTask_BitmapError"
            java.lang.String r3 = "Bitmap for non valid image is null. Width: %d, Height: %d"
            X.C364798m1.A01(r6)     // Catch:{ all -> 0x020a }
            int r0 = r6.A01     // Catch:{ all -> 0x020a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x020a }
            X.C364798m1.A01(r6)     // Catch:{ all -> 0x020a }
            int r0 = r6.A00     // Catch:{ all -> 0x020a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x020a }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x020a }
            java.lang.String r0 = X.0mp.A06(r3, r0)     // Catch:{ all -> 0x020a }
            X.0kD.A0C(r4, r0, r5)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "Failed to load bitmap"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x020a }
            goto L_0x00d4
        L_0x01fa:
            X.8m1 r6 = new X.8m1     // Catch:{ all -> 0x020a }
            r6.<init>(r10, r9, r3)     // Catch:{ all -> 0x020a }
        L_0x01ff:
            X.Jad r0 = new X.Jad     // Catch:{ all -> 0x020a }
            r0.<init>(r1, r4, r6)     // Catch:{ all -> 0x020a }
            com.google.common.io.Closeables.A01(r2)
            return r0
        L_0x0208:
            r0 = move-exception
            goto L_0x020c
        L_0x020a:
            r0 = move-exception
            r5 = r2
        L_0x020c:
            com.google.common.io.Closeables.A01(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59855JaW.call():X.Jad");
    }
}
