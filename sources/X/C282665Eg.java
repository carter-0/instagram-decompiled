package X;

import android.net.Uri;
import com.instagram.common.gallery.Medium;
import java.io.File;
import java.util.UUID;

/* renamed from: X.5Eg  reason: invalid class name and case insensitive filesystem */
public final class C282665Eg {
    /* JADX WARNING: Can't wrap try/catch for region: R(4:26|27|28|29) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:31|32|33|34|35) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:36|37|38|(1:(2:40|(1:42)))|43|44|45|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        X.1zE.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0076 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0080 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b2 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053 A[Catch:{ IOException -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A[Catch:{ IOException -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073 A[SYNTHETIC, Splitter:B:26:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d A[SYNTHETIC, Splitter:B:31:0x007d] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0062=Splitter:B:23:0x0062, B:45:0x00b2=Splitter:B:45:0x00b2, B:28:0x0076=Splitter:B:28:0x0076} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.common.gallery.Medium A00(android.app.Activity r10, android.net.Uri r11, int r12) {
        /*
            r8 = 0
            X.0qQ.A0B(r10, r8)
            r0 = 2
            X.0qQ.A0B(r11, r0)
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r0]
            r4 = 0
            r6 = 1
            android.content.ContentResolver r0 = r10.getContentResolver()     // Catch:{ IOException -> 0x00c3 }
            java.io.InputStream r5 = r0.openInputStream(r11)     // Catch:{ IOException -> 0x00c3 }
            r3 = -1
            if (r12 == r6) goto L_0x0084
            r0 = 3
            if (r12 != r0) goto L_0x007b
            java.lang.String r6 = "tmp_video_"
            java.lang.String r2 = ".mp4"
            X.1BJ r1 = X.AnonymousClass1F2.A00()     // Catch:{ all -> 0x00bc }
            r0 = 1532730990(0x5b5b9e6e, float:6.1817215E16)
            java.io.File r0 = r1.AXT(r4, r0)     // Catch:{ all -> 0x00bc }
            java.io.File r9 = java.io.File.createTempFile(r6, r2, r0)     // Catch:{ all -> 0x00bc }
            r9.getClass()     // Catch:{ all -> 0x00bc }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bc }
            r6.<init>(r9)     // Catch:{ all -> 0x00bc }
            if (r5 == 0) goto L_0x0043
        L_0x0039:
            int r0 = r5.read(r7)     // Catch:{ all -> 0x00bc }
            if (r0 == r3) goto L_0x0043
            r6.write(r7, r8, r0)     // Catch:{ all -> 0x00bc }
            goto L_0x0039
        L_0x0043:
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch:{ IOException -> 0x0060 }
            r2.<init>()     // Catch:{ IOException -> 0x0060 }
            r2.setDataSource(r10, r11)     // Catch:{ IOException -> 0x0060 }
            r0 = 9
            java.lang.String r0 = r2.extractMetadata(r0)     // Catch:{ IOException -> 0x0060 }
            if (r0 == 0) goto L_0x0059
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ IOException -> 0x0060 }
            int r7 = (int) r0     // Catch:{ IOException -> 0x0060 }
            goto L_0x005a
        L_0x0059:
            r7 = 0
        L_0x005a:
            r2.release()     // Catch:{ IOException -> 0x005e }
            goto L_0x0071
        L_0x005e:
            r3 = move-exception
            goto L_0x0062
        L_0x0060:
            r3 = move-exception
            r7 = 0
        L_0x0062:
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x00bc }
            java.lang.Object[] r2 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = "Medium"
            java.lang.String r0 = "Failed to extract duration from %s"
            X.0KC.A0L(r1, r0, r3, r2)     // Catch:{ all -> 0x00bc }
        L_0x0071:
            if (r7 == 0) goto L_0x007b
            r6.close()     // Catch:{ all -> 0x0076 }
        L_0x0076:
            com.instagram.common.gallery.Medium r0 = A03(r9, r12, r7)     // Catch:{ all -> 0x00bc }
            goto L_0x00b6
        L_0x007b:
            if (r5 == 0) goto L_0x00d3
            r5.close()     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r5.close()     // Catch:{ IOException -> 0x00c3 }
            return r4
        L_0x0084:
            r0 = 4115(0x1013, float:5.766E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r9 = ".jpg"
            X.1BJ r2 = X.AnonymousClass1F2.A00()     // Catch:{ all -> 0x00bc }
            r1 = 1532730990(0x5b5b9e6e, float:6.1817215E16)
            java.io.File r1 = r2.AXT(r4, r1)     // Catch:{ all -> 0x00bc }
            java.io.File r2 = java.io.File.createTempFile(r0, r9, r1)     // Catch:{ all -> 0x00bc }
            r2.getClass()     // Catch:{ all -> 0x00bc }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bc }
            r1.<init>(r2)     // Catch:{ all -> 0x00bc }
            if (r5 == 0) goto L_0x00af
        L_0x00a5:
            int r0 = r5.read(r7)     // Catch:{ all -> 0x00bc }
            if (r0 == r3) goto L_0x00af
            r1.write(r7, r8, r0)     // Catch:{ all -> 0x00bc }
            goto L_0x00a5
        L_0x00af:
            r1.close()     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            com.instagram.common.gallery.Medium r0 = A03(r2, r6, r8)     // Catch:{ all -> 0x00bc }
        L_0x00b6:
            if (r5 == 0) goto L_0x00bb
            r5.close()     // Catch:{ IOException -> 0x00c3 }
        L_0x00bb:
            return r0
        L_0x00bc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            X.1zE.A00(r5, r1)     // Catch:{ IOException -> 0x00c3 }
            throw r0     // Catch:{ IOException -> 0x00c3 }
        L_0x00c3:
            r3 = move-exception
            java.lang.String r0 = r11.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Medium"
            java.lang.String r0 = "File not found while opening input stream for %s"
            X.0KC.A0L(r1, r0, r3, r2)
        L_0x00d3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C282665Eg.A00(android.app.Activity, android.net.Uri, int):com.instagram.common.gallery.Medium");
    }

    public static final Medium A02(Medium medium, File file) {
        File file2 = file;
        0qQ.A0B(file2, 1);
        int i = medium.A05;
        int i2 = medium.A08;
        String absolutePath = file2.getAbsolutePath();
        0qQ.A07(absolutePath);
        int i3 = medium.A02;
        Medium medium2 = new Medium(medium.A02(), absolutePath, medium.A0O, i, i2, i3, medium.A07, medium.A03, medium.A0C, medium.A0D, medium.A0f);
        medium2.A0e = medium.A0e;
        medium2.A0a = medium.A0a;
        medium2.A06 = medium.A06;
        medium2.A0G = medium.A0G;
        medium2.A0H = medium.A0H;
        medium2.A0N = medium.A0N;
        medium2.A0g = medium.A0g;
        medium2.A09 = medium.A09;
        medium2.A0A = medium.A0A;
        medium2.A0I = medium.A0I;
        medium2.A0E = medium.A0E;
        return medium2;
    }

    public static final Medium A03(File file, int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        String absolutePath = file.getAbsolutePath();
        0qQ.A07(absolutePath);
        return new Medium(Uri.fromFile(file), absolutePath, 0, i, 0, i2, currentTimeMillis / 1000, currentTimeMillis);
    }

    public final Medium A05(File file) {
        0qQ.A0B(file, 0);
        return A03(file, 1, 0);
    }

    public final Medium A06(File file) {
        return A03(file, 3, 0);
    }

    public static final Medium A01(Medium medium) {
        int i = medium.A05;
        int i2 = medium.A08;
        String str = medium.A0X;
        int i3 = medium.A02;
        Medium medium2 = new Medium(medium.A02(), str, medium.A0O, i, i2, i3, medium.A07, medium.A03, medium.A0C, medium.A0D, medium.A0f);
        medium2.A0e = medium.A0e;
        medium2.A0a = medium.A0a;
        medium2.A06 = medium.A06;
        medium2.A0G = medium.A0G;
        medium2.A0H = medium.A0H;
        medium2.A0N = medium.A0N;
        medium2.A0g = medium.A0g;
        medium2.A09 = medium.A09;
        medium2.A0A = medium.A0A;
        medium2.A0I = medium.A0I;
        medium2.A0E = medium.A0E;
        return medium2;
    }

    public static final Medium A04(String str, String str2, int i, int i2, int i3, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = Medium.A0h;
        Medium.A0h = i4 + 1;
        int i5 = 1;
        if (z) {
            i5 = 3;
        }
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        Medium medium = new Medium((Uri) null, obj, i4, i5, 0, i3, currentTimeMillis / 1000, currentTimeMillis);
        medium.A0B = i;
        medium.A04 = i2;
        medium.A0Y = str;
        medium.A0a = str2;
        return medium;
    }
}
