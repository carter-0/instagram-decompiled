package X;

import com.facebook.ffmpeg.FFMpegMediaMetadataRetriever;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.util.ArrayList;

public abstract class Q0X {
    public static final int A00(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 270;
        }
        if (i != 2) {
            return i == 3 ? 90 : 0;
        }
        return 180;
    }

    public static final ClipInfo A02(UserSession userSession, File file, long j) {
        0qQ.A0B(userSession, 2);
        String absolutePath = file.getAbsolutePath();
        0qQ.A07(absolutePath);
        ClipInfo A03 = A03(userSession, absolutePath, j, j);
        A03.A00 = ((float) A03.A09) / ((float) A03.A06);
        return A03;
    }

    public static final void A04(ClipInfo clipInfo, AnonymousClass3Q2 r5) {
        0qQ.A0B(clipInfo, 1);
        if (0qQ.A0K(clipInfo.A0E, "boomerang")) {
            r5.A5F = true;
        }
        ArrayList A1M = 0sr.A1M(new ClipInfo[]{clipInfo});
        0qQ.A0B(A1M, 0);
        r5.A4G = A1M;
        r5.A1N = clipInfo;
        r5.A0H = clipInfo.A09;
        r5.A0G = clipInfo.A06;
    }

    public static final int A01(File file) {
        int i;
        FFMpegMediaMetadataRetriever fFMpegMediaMetadataRetriever = new FFMpegMediaMetadataRetriever(Q12.A00, file.getAbsolutePath());
        fFMpegMediaMetadataRetriever.initialize();
        try {
            int rotation = fFMpegMediaMetadataRetriever.getRotation();
            if (rotation == 90) {
                i = 3;
            } else if (rotation != 180) {
                i = 1;
                if (rotation != 270) {
                    i = 0;
                }
            } else {
                i = 2;
            }
            return i;
        } finally {
            fFMpegMediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.1zE.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0082 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a0 A[Catch:{ IOException | RuntimeException -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.pendingmedia.model.ClipInfo A03(com.instagram.common.session.UserSession r14, java.lang.String r15, long r16, long r18) {
        /*
            r0 = r16
            java.lang.String r7 = "Could not retrieve video metadata"
            java.lang.String r6 = "ClipInfoUtil"
            r5 = 0
            X.AnonymousClass7TF.A1C(r15, r5, r14)
            r4 = 0
            r13 = 0
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            com.instagram.pendingmedia.model.ClipInfo r2 = new com.instagram.pendingmedia.model.ClipInfo
            r2.<init>(r4, r3)
            r2.A0F = r15
            r2.A0A = r0
            r2.A07 = r5
            r3 = r18
            int r8 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0025
            long r0 = java.lang.Math.min(r3, r0)
        L_0x0025:
            int r3 = (int) r0
            r2.A05 = r3
            r0 = -1
            r2.A03 = r0
            java.lang.String r3 = "{TakenWith: Boomerang}"
            java.io.File r1 = X.AnonymousClass7TE.A0t(r15)
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0082 }
            r9.<init>(r1, r0)     // Catch:{ Exception -> 0x0082 }
            long r11 = r1.length()     // Catch:{ all -> 0x007b }
            java.lang.String r10 = "ftyp"
            int r0 = X.Q0Y.A00(r9, r10, r11, r13)     // Catch:{ all -> 0x007b }
            if (r0 < 0) goto L_0x0077
            long r13 = (long) r0     // Catch:{ all -> 0x007b }
        L_0x0047:
            java.lang.String r10 = "udta"
            int r8 = X.Q0Y.A00(r9, r10, r11, r13)     // Catch:{ all -> 0x007b }
            if (r8 <= 0) goto L_0x0077
            r0 = 1024(0x400, float:1.435E-42)
            if (r8 >= r0) goto L_0x006c
            int r0 = r8 + -8
            byte[] r4 = new byte[r0]     // Catch:{ all -> 0x007b }
            r9.read(r4)     // Catch:{ all -> 0x007b }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII     // Catch:{ all -> 0x007b }
            X.0qQ.A08(r1)     // Catch:{ all -> 0x007b }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x007b }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x007b }
            boolean r0 = X.00l.A0d(r0, r3, r5)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            long r0 = (long) r8     // Catch:{ all -> 0x007b }
            long r13 = r13 + r0
            goto L_0x0047
        L_0x006f:
            r9.close()     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = "boomerang"
            r2.A0E = r0
            goto L_0x0082
        L_0x0077:
            r9.close()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0082
        L_0x007b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            X.1zE.A00(r9, r1)     // Catch:{ Exception -> 0x0082 }
            throw r0     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            java.io.File r0 = X.AnonymousClass7TE.A0t(r15)     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0090 }
            int r0 = A01(r0)     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0090 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0090 }
            r2.A0C = r0     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0090 }
        L_0x0090:
            java.lang.String r8 = "MediaMetadataRetriever failed to retrieve dimensions and exif data"
            java.lang.String r10 = r2.A0F     // Catch:{ IOException | RuntimeException -> 0x010a }
            if (r10 == 0) goto L_0x00ff
            java.io.File r0 = X.AnonymousClass7TE.A0t(r10)     // Catch:{ IOException | RuntimeException -> 0x010a }
            boolean r0 = r0.isFile()     // Catch:{ IOException | RuntimeException -> 0x010a }
            if (r0 == 0) goto L_0x00ff
            r11 = 0
            r3 = 0
        L_0x00a2:
            android.media.MediaMetadataRetriever r9 = new android.media.MediaMetadataRetriever     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
            r9.<init>()     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
            r9.setDataSource(r10)     // Catch:{ RuntimeException -> 0x00ab }
            goto L_0x00b2
        L_0x00ab:
            r1 = move-exception
            int r3 = r3 + 1
            r0 = 6
            if (r3 < r0) goto L_0x00a2
            goto L_0x00ed
        L_0x00b2:
            r11 = r9
            r0 = 18
            java.lang.String r5 = r9.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
            r0 = 19
            java.lang.String r4 = r9.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
            r3 = 3
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
            r0 = 30
            if (r1 < r0) goto L_0x00d5
            r0 = 36
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
            if (r0 == 0) goto L_0x00d2
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
        L_0x00d2:
            r2.A04 = r3     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
            goto L_0x00da
        L_0x00d5:
            int r3 = X.C7324Q4a.A00(r10)     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
            goto L_0x00d2
        L_0x00da:
            if (r5 == 0) goto L_0x00e9
            if (r4 == 0) goto L_0x00e9
            int r1 = java.lang.Integer.parseInt(r5)     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
            int r0 = java.lang.Integer.parseInt(r4)     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
            r2.A01(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
        L_0x00e9:
            r9.release()     // Catch:{ IOException | RuntimeException -> 0x010a }
            return r2
        L_0x00ed:
            throw r1     // Catch:{ IllegalArgumentException -> 0x00f0, RuntimeException -> 0x00ee }
        L_0x00ee:
            r0 = move-exception
            goto L_0x00f6
        L_0x00f0:
            r0 = move-exception
            java.io.IOException r0 = X.Pxe.A0c(r8, r0)     // Catch:{ all -> 0x00fb }
            goto L_0x00fa
        L_0x00f6:
            java.io.IOException r0 = X.Pxe.A0c(r8, r0)     // Catch:{ all -> 0x00fb }
        L_0x00fa:
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r0 = move-exception
            if (r11 == 0) goto L_0x0109
            goto L_0x0106
        L_0x00ff:
            java.lang.String r0 = "Invalid video file path: "
            java.io.IOException r0 = X.Pxg.A0Z(r0, r10)     // Catch:{ IOException | RuntimeException -> 0x010a }
            goto L_0x0109
        L_0x0106:
            r11.release()     // Catch:{ IOException | RuntimeException -> 0x010a }
        L_0x0109:
            throw r0     // Catch:{ IOException | RuntimeException -> 0x010a }
        L_0x010a:
            r0 = move-exception
            X.0KC.A0F(r6, r7, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q0X.A03(com.instagram.common.session.UserSession, java.lang.String, long, long):com.instagram.pendingmedia.model.ClipInfo");
    }
}
