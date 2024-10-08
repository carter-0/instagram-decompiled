package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.8lo  reason: invalid class name and case insensitive filesystem */
public final class C364678lo {
    public static final Uri A00 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    public static final C364678lo A01 = new Object();
    public static final SimpleDateFormat A02;
    public static final SimpleDateFormat A03;

    public static final int A00(C227922kK r3) {
        int A0M = r3.A0M("Orientation", 0);
        if (A0M == 3) {
            return 180;
        }
        if (A0M == 6) {
            return 90;
        }
        if (A0M == 8) {
            return 270;
        }
        return 0;
    }

    public static final int A01(String str) {
        0qQ.A0B(str, 0);
        try {
            return A00(new C227922kK(str));
        } catch (IOException e) {
            0KC.A0F("ImageManager", "cannot read exif", e);
            return 0;
        }
    }

    public static final File A04(Bitmap bitmap, UserSession userSession, String str, String str2, byte[] bArr) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str, str2);
        A08(bitmap, userSession, file2, bArr);
        return file2;
    }

    public static final String A06(String str) {
        0qQ.A0B(str, 0);
        try {
            String A0N = new C227922kK(str).A0N("MakerNote");
            if (A0N == null) {
                return "";
            }
            return A0N;
        } catch (IOException e) {
            0KC.A0F("ImageManager", "cannot read exif", e);
            return "";
        }
    }

    public static final String A07(String str) {
        0qQ.A0B(str, 0);
        try {
            String A0N = new C227922kK(str).A0N("Model");
            if (A0N == null) {
                return "";
            }
            return A0N;
        } catch (IOException e) {
            0KC.A0F("ImageManager", "cannot read exif", e);
            return "";
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8lo, java.lang.Object] */
    static {
        Locale locale = Locale.US;
        A02 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        A03 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r0 != null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A02(X.C227922kK r4) {
        /*
            r0 = 2283(0x8eb, float:3.199E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ ParseException -> 0x0026 }
            java.lang.String r3 = r4.A0N(r0)     // Catch:{ ParseException -> 0x0026 }
            r0 = 2285(0x8ed, float:3.202E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ ParseException -> 0x0026 }
            java.lang.String r2 = r4.A0N(r0)     // Catch:{ ParseException -> 0x0026 }
            if (r3 == 0) goto L_0x0026
            if (r2 == 0) goto L_0x0026
            java.text.SimpleDateFormat r1 = A03     // Catch:{ ParseException -> 0x0026 }
            r0 = 32
            java.lang.String r0 = X.002.A0T(r3, r2, r0)     // Catch:{ ParseException -> 0x0026 }
            java.util.Date r0 = r1.parse(r0)     // Catch:{ ParseException -> 0x0026 }
            if (r0 != 0) goto L_0x0036
        L_0x0026:
            java.lang.String r0 = "DateTime"
            java.lang.String r1 = r4.A0N(r0)     // Catch:{ ParseException -> 0x003b }
            if (r1 == 0) goto L_0x003b
            java.text.SimpleDateFormat r0 = A02     // Catch:{ ParseException -> 0x003b }
            java.util.Date r0 = r0.parse(r1)     // Catch:{ ParseException -> 0x003b }
            if (r0 == 0) goto L_0x003b
        L_0x0036:
            long r0 = r0.getTime()
            return r0
        L_0x003b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364678lo.A02(X.2kK):long");
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [X.B1c, java.lang.Object, X.Ah3] */
    /* JADX WARNING: type inference failed for: r1v11, types: [X.B1c, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (X.C66579MXk.A00(360).equals(r1) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C41797B1c A03(android.content.ContentResolver r9, com.instagram.util.gallery.ImageManager$ImageListParam r10) {
        /*
            java.lang.Integer r8 = r10.A03
            int r4 = r10.A00
            int r3 = r10.A01
            java.lang.String r2 = r10.A04
            android.net.Uri r5 = r10.A02
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x0014
            X.Ah4 r1 = new X.Ah4
            r1.<init>()
            return r1
        L_0x0014:
            if (r5 == 0) goto L_0x0026
            X.Ah3 r1 = new X.Ah3
            r1.<init>()
            r1.A00 = r5
            r2 = 0
            X.8m1 r0 = new X.8m1
            r0.<init>(r9, r5, r2)
            r1.A01 = r0
            return r1
        L_0x0026:
            r7 = 0
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            r0 = 707(0x2c3, float:9.91E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0044
            r0 = 360(0x168, float:5.04E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0045
        L_0x0044:
            r0 = 1
        L_0x0045:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r0 == 0) goto L_0x0061
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r8 == r0) goto L_0x0061
            r0 = r4 & 1
            if (r0 == 0) goto L_0x0061
            android.net.Uri r1 = A00
            X.0qQ.A08(r1)
            X.Ah6 r0 = new X.Ah6
            r0.<init>(r9, r1, r2, r3)
            r6.add(r0)
        L_0x0061:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r5 = 1
            if (r8 == r0) goto L_0x006a
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r8 != r0) goto L_0x007b
        L_0x006a:
            r0 = r4 & 1
            if (r0 == 0) goto L_0x007b
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            X.0qQ.A08(r1)
            X.Ah6 r0 = new X.Ah6
            r0.<init>(r9, r1, r2, r3)
            r6.add(r0)
        L_0x007b:
            java.util.Iterator r4 = r6.iterator()
            X.0qQ.A07(r4)
        L_0x0082:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r3 = r4.next()
            X.0qQ.A07(r3)
            X.Ah6 r3 = (X.Ah6) r3
            android.database.Cursor r0 = X.Ah6.A00(r3)
            if (r0 == 0) goto L_0x009f
            monitor-enter(r3)
            int r0 = r0.getCount()     // Catch:{ all -> 0x00c5 }
            monitor-exit(r3)
            if (r0 != 0) goto L_0x0082
        L_0x009f:
            android.database.Cursor r0 = X.Ah6.A00(r3)     // Catch:{ IllegalStateException -> 0x00ab }
            if (r0 == 0) goto L_0x00b3
            r0.deactivate()     // Catch:{ IllegalStateException -> 0x00ab }
            r3.A02 = r5     // Catch:{ IllegalStateException -> 0x00ab }
            goto L_0x00b3
        L_0x00ab:
            r2 = move-exception
            java.lang.String r1 = "ImageList"
            java.lang.String r0 = "Caught exception while deactivating cursor."
            X.0KC.A0F(r1, r0, r2)
        L_0x00b3:
            r1 = 0
            r3.A00 = r1
            android.database.Cursor r0 = X.Ah6.A00(r3)
            if (r0 == 0) goto L_0x00bf
            r0.close()
        L_0x00bf:
            r3.A01 = r1
            r4.remove()
            goto L_0x0082
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00c8:
            int r0 = r6.size()
            if (r0 != r5) goto L_0x00d8
            java.lang.Object r1 = r6.get(r7)
            X.0qQ.A0A(r1)
        L_0x00d5:
            X.B1c r1 = (X.C41797B1c) r1
            return r1
        L_0x00d8:
            X.B1c[] r0 = new X.C41797B1c[r7]
            java.lang.Object[] r0 = r6.toArray(r0)
            X.B1c[] r0 = (X.C41797B1c[]) r0
            X.Ah5 r1 = new X.Ah5
            r1.<init>(r0)
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364678lo.A03(android.content.ContentResolver, com.instagram.util.gallery.ImageManager$ImageListParam):X.B1c");
    }

    public static final String A05(String str) {
        try {
            String A0N = new C227922kK(str).A0N("ImageUniqueID");
            if (A0N == null) {
                return "";
            }
            return A0N;
        } catch (IOException e) {
            0KC.A0F("ImageManager", "cannot read exif", e);
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
        if (r4 != null) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082 A[Catch:{ all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0089 A[SYNTHETIC, Splitter:B:35:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(android.graphics.Bitmap r7, com.instagram.common.session.UserSession r8, java.io.File r9, byte[] r10) {
        /*
            java.lang.String r3 = "ImageManager"
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r0 = 1
            X.0qQ.A0B(r9, r0)
            r4 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x007b }
            r2.<init>(r9)     // Catch:{ IOException -> 0x007b }
            if (r7 == 0) goto L_0x0013
            goto L_0x0019
        L_0x0013:
            if (r10 == 0) goto L_0x006d
            r2.write(r10)     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            goto L_0x004d
        L_0x0019:
            X.0Tu r4 = X.0Tu.A05     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            r0 = 36314828955978552(0x81042500000b38, double:3.028982287615404E-306)
            boolean r0 = X.182.A06(r4, r8, r0)     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            if (r0 == 0) goto L_0x0054
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            r0 = 36596303932754309(0x82042500010985, double:3.2069881963371505E-306)
            long r4 = X.182.A01(r4, r8, r0)     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            int r0 = (int) r4     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
        L_0x0032:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            r1.<init>(r6, r0)     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            java.lang.Object r0 = r1.second     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            java.lang.Object r1 = r1.first     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            X.0qQ.A06(r0)     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            X.0fO.A02(r1, r7, r2, r0)     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
        L_0x004d:
            r9.length()     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            r9.getName()     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            goto L_0x0069
        L_0x0054:
            r0 = 36314828956109625(0x81042500020b39, double:3.0289822876982954E-306)
            boolean r0 = X.182.A06(r4, r8, r0)     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            if (r0 == 0) goto L_0x0064
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            r0 = 100
            goto L_0x0032
        L_0x0064:
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            r0 = 75
            goto L_0x0032
        L_0x0069:
            r2.close()     // Catch:{ all -> 0x008c }
            return
        L_0x006d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
            throw r0     // Catch:{ IOException -> 0x0078, all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            r4 = r2
            goto L_0x0091
        L_0x0078:
            r1 = move-exception
            r4 = r2
            goto L_0x007c
        L_0x007b:
            r1 = move-exception
        L_0x007c:
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = ""
        L_0x0084:
            X.0KC.A0I(r3, r0, r1)     // Catch:{ all -> 0x008d }
            if (r4 == 0) goto L_0x008c
            r4.close()     // Catch:{ all -> 0x008c }
        L_0x008c:
            return
        L_0x008d:
            r0 = move-exception
            if (r4 != 0) goto L_0x0091
        L_0x0090:
            throw r0
        L_0x0091:
            r4.close()     // Catch:{ all -> 0x0090 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364678lo.A08(android.graphics.Bitmap, com.instagram.common.session.UserSession, java.io.File, byte[]):void");
    }
}
