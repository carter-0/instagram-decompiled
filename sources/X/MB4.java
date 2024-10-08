package X;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

public final class MB4 implements Callable {
    public final Context A00;
    public final Uri A01;
    public final 0lg A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (X.00p.A0k(r1, org.webrtc.MediaStreamTrack.VIDEO_TRACK_KIND, false) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0035, code lost:
        if (X.00p.A0k(r1, org.webrtc.MediaStreamTrack.VIDEO_TRACK_KIND, false) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        r14 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0 A[SYNTHETIC, Splitter:B:36:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0182  */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.common.gallery.Medium call() {
        /*
            r21 = this;
            X.OOC r6 = new X.OOC
            r6.<init>()
            r4 = r21
            android.content.Context r5 = r4.A00
            android.net.Uri r2 = r4.A01
            X.0qQ.A0A(r2)
            X.MY4 r1 = X.MY4.CACHE_PATH
            java.lang.String r0 = r4.A06
            r3 = 1
            r6.A02(r5, r2, r1, r0)
            X.Ni4 r7 = r6.A00()
            java.lang.String r12 = r7.getAbsolutePath()
            android.net.Uri r11 = android.net.Uri.fromFile(r7)
            java.lang.String r1 = r4.A05
            r13 = 0
            if (r1 == 0) goto L_0x003c
            java.lang.String r0 = "image"
            boolean r0 = X.00p.A0k(r1, r0, r13)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "video"
            boolean r0 = X.00p.A0k(r1, r0, r13)
            if (r0 == 0) goto L_0x003c
        L_0x0037:
            r14 = 3
        L_0x0038:
            r15 = 0
            r0 = 0
            goto L_0x00a5
        L_0x003c:
            if (r2 == 0) goto L_0x0099
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "content"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0086
            android.content.ContentResolver r0 = r5.getContentResolver()
            java.lang.String r0 = r0.getType(r2)
            java.lang.String r2 = X.C63436Kww.A00(r0)
        L_0x0056:
            if (r2 == 0) goto L_0x009a
            java.lang.String r0 = "heic"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "heif"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x009a
        L_0x0068:
            java.lang.String r1 = "image/"
            java.lang.String r0 = X.AnonymousClass7TF.A0j(r2)
            java.lang.String r1 = X.002.A0R(r1, r0)
        L_0x0072:
            r14 = 0
            if (r1 == 0) goto L_0x0038
            java.lang.String r0 = "image"
            boolean r0 = X.00p.A0k(r1, r0, r13)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "video"
            boolean r0 = X.00p.A0k(r1, r0, r13)
            if (r0 == 0) goto L_0x0038
            goto L_0x0037
        L_0x0086:
            java.lang.String r0 = r2.getPath()
            if (r0 == 0) goto L_0x01bb
            android.net.Uri r0 = X.JTQ.A09(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r0)
            goto L_0x0056
        L_0x0099:
            r2 = 0
        L_0x009a:
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r0.getMimeTypeFromExtension(r2)
            goto L_0x0072
        L_0x00a3:
            r14 = 1
            goto L_0x0038
        L_0x00a5:
            X.2kK r2 = new X.2kK     // Catch:{ IOException -> 0x00b3 }
            r2.<init>((java.lang.String) r12)     // Catch:{ IOException -> 0x00b3 }
            int r15 = X.C364678lo.A00(r2)     // Catch:{ IOException -> 0x00b3 }
            long r19 = X.C364678lo.A02(r2)     // Catch:{ IOException -> 0x00b3 }
            goto L_0x00bd
        L_0x00b3:
            r6 = move-exception
            java.lang.String r5 = "ExternalMediaImportCallable"
            java.lang.String r2 = "cannot read exif"
            X.0KC.A0F(r5, r2, r6)
            r19 = 0
        L_0x00bd:
            r2 = 3
            if (r14 != r2) goto L_0x00fa
            android.media.MediaMetadataRetriever r6 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x00e8 }
            r6.<init>()     // Catch:{ all -> 0x00e8 }
            java.lang.String r5 = r7.getAbsolutePath()     // Catch:{ IllegalArgumentException -> 0x00e6 }
            r6.setDataSource(r5)     // Catch:{ IllegalArgumentException -> 0x00e6 }
            r5 = 9
            java.lang.String r5 = r6.extractMetadata(r5)     // Catch:{ all -> 0x00e8 }
            if (r5 == 0) goto L_0x00e3
            java.lang.Long r5 = X.AnonymousClass7TE.A10(r5)     // Catch:{ all -> 0x00e8 }
            if (r5 == 0) goto L_0x00e3
            long r5 = r5.longValue()     // Catch:{ all -> 0x00e8 }
        L_0x00de:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00e8 }
            goto L_0x00ed
        L_0x00e3:
            r5 = 0
            goto L_0x00de
        L_0x00e6:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r5 = move-exception
            X.0eQ r5 = X.JTO.A1B(r5)
        L_0x00ed:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            boolean r0 = r5 instanceof X.0eQ
            if (r0 == 0) goto L_0x00f6
            r5 = r1
        L_0x00f6:
            long r0 = X.AnonymousClass7TE.A0R(r5)
        L_0x00fa:
            X.0qQ.A0A(r12)
            int r5 = (int) r0
            long r17 = X.AnonymousClass7TG.A0I()
            r1 = 0
            com.instagram.common.gallery.Medium r10 = new com.instagram.common.gallery.Medium
            r16 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r19)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r7 = r10.A0G
            int r0 = r10.A08
            if (r0 != r3) goto L_0x0182
            java.lang.String r0 = r10.A0X
            java.lang.String r1 = X.C364678lo.A06(r0)
            java.lang.String r0 = r10.A0X
            java.lang.String r0 = X.C364678lo.A07(r0)
            java.lang.String r0 = X.DbV.A12(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x012c
            java.lang.String r0 = r10.A0X
            java.lang.String r1 = X.C364678lo.A07(r0)
        L_0x012c:
            java.lang.String r9 = r4.A04
            X.0lg r6 = r4.A02
            X.0sn r5 = X.0sn.A00
            java.lang.String r8 = X.C59737JVv.A02(r6, r9, r5)
            boolean r0 = X.00l.A0W(r8)
            if (r0 == 0) goto L_0x0140
            java.lang.String r8 = X.C59737JVv.A02(r6, r1, r5)
        L_0x0140:
            int r0 = r8.length()
            if (r0 != 0) goto L_0x014c
            java.lang.String r8 = r4.A03
            if (r8 != 0) goto L_0x014c
            java.lang.String r8 = ""
        L_0x014c:
            r7.A03 = r8
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r10.A0G
            r1.A04 = r9
            int r0 = r10.A08
            if (r0 != r3) goto L_0x0176
            java.lang.String r0 = r10.A0X
            X.0qQ.A0B(r0, r13)
            java.lang.String r0 = X.C364678lo.A05(r0)
        L_0x015f:
            r1.A0A = r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r10.A0G
            java.lang.String r0 = r0.A03
            X.Kp0 r0 = X.C59737JVv.A01(r6, r0, r5)
            if (r0 == 0) goto L_0x0175
            java.lang.String r1 = r0.A02()
            if (r1 == 0) goto L_0x0175
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r10.A0G
            r0.A05 = r1
        L_0x0175:
            return r10
        L_0x0176:
            if (r0 != r2) goto L_0x017f
            java.lang.String r0 = r10.A0X
            java.lang.String r0 = X.C59737JVv.A03(r0)
            goto L_0x015f
        L_0x017f:
            java.lang.String r0 = ""
            goto L_0x015f
        L_0x0182:
            if (r0 != r2) goto L_0x012c
            X.Q0h r0 = X.C9955RkA.A00
            X.Q0e r5 = new X.Q0e
            r5.<init>(r0)
            java.lang.String r0 = r10.A0X     // Catch:{ IOException -> 0x01b1 }
            android.net.Uri r0 = X.0cp.A03(r0)     // Catch:{ IOException -> 0x01b1 }
            X.Q0d r0 = r5.AU7(r0)     // Catch:{ IOException -> 0x01b1 }
            java.lang.String r1 = r0.A0C     // Catch:{ IOException -> 0x01b1 }
            if (r1 == 0) goto L_0x01a3
            java.lang.String r0 = X.DbV.A12(r1)     // Catch:{ IOException -> 0x01b1 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x01b1 }
            if (r0 != 0) goto L_0x012c
        L_0x01a3:
            java.lang.String r0 = r10.A0X     // Catch:{ IOException -> 0x01b1 }
            android.net.Uri r0 = X.0cp.A03(r0)     // Catch:{ IOException -> 0x01b1 }
            X.Q0d r0 = r5.AU7(r0)     // Catch:{ IOException -> 0x01b1 }
            java.lang.String r1 = r0.A0E     // Catch:{ IOException -> 0x01b1 }
            goto L_0x012c
        L_0x01b1:
            r6 = move-exception
            java.lang.String r5 = "ExternalMediaImportCallable"
            java.lang.String r0 = "Failed to extract MediaMetadata by FFMpegVideoMetadataExtractor"
            X.0KC.A0F(r5, r0, r6)
            goto L_0x012c
        L_0x01bb:
            java.lang.String r0 = "No path for asset URI"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MB4.call():com.instagram.common.gallery.Medium");
    }

    public MB4(Context context, Uri uri, 0lg r3, String str, String str2, String str3, String str4) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = uri;
        this.A06 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }
}
