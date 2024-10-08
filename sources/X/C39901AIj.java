package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.AIj  reason: case insensitive filesystem */
public abstract class C39901AIj {
    public static final Bitmap A00(Bitmap.Config config, Point point, File file, long j) {
        Bitmap bitmap;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(file.getPath());
            long j2 = j;
            if (Build.VERSION.SDK_INT >= 30) {
                MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
                bitmapParams.setPreferredConfig(config);
                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j2, 2, point.x, point.y, bitmapParams);
            } else {
                bitmap = mediaMetadataRetriever.getFrameAtTime(j, 2);
            }
            if (bitmap != null) {
                return bitmap;
            }
            String format = String.format("Closest frame is null, size=%s, config=%s, time=%l", Arrays.copyOf(new Object[]{point, config, Long.valueOf(AnonymousClass7TE.A0P(j))}, 3));
            0qQ.A07(format);
            throw new IOException(format);
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    public static final Bitmap A01(Bitmap.Config config, File file, int i, int i2) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Rect A0H = 1MF.A0H(canonicalPath);
            if (A0H.width() == 0 || A0H.height() == 0) {
                return null;
            }
            int i3 = i;
            if (i == 0) {
                return null;
            }
            int i4 = i2;
            if (i2 == 0) {
                return null;
            }
            return 1MF.A03(config, canonicalPath, A0H.width(), A0H.height(), i3, i4);
        } catch (IOException e) {
            0kD.A09(AnonymousClass000.A00(1057), "could not read thumbnail path from file", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r11 > r9) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap A02(X.C7237Q0j r8, long r9, long r11) {
        /*
            r4 = 0
            r6 = 60000(0xea60, double:2.9644E-319)
            r2 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x000f
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            r5 = 1
            if (r0 <= 0) goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Invalid frame time to extract video"
            X.17k.A0J(r5, r0, r1)
            long r0 = r11 - r6
            long r2 = java.lang.Math.max(r2, r0)
            long r0 = r11 + r6
            long r5 = java.lang.Math.min(r0, r9)
            X.AhA r7 = new X.AhA
            r7.<init>(r2, r11)
            r8.A05 = r7
            X.Q0m r0 = r8.A0A
            r0.A02 = r7
            r8.A01 = r2
            r0 = 500000(0x7a120, double:2.47033E-318)
            long r5 = r5 + r0
            r8.A00 = r5
            r8.A06 = r4
            r8.A07 = r4
            java.util.PriorityQueue r0 = r8.A0C
            r0.clear()
            r2 = 1
            r8.A01()
            android.graphics.Bitmap r0 = r7.A00
            if (r0 == 0) goto L_0x0048
            return r0
        L_0x0048:
            long r0 = X.AnonymousClass7TE.A0P(r11)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r0 = "Closest frame is null, time=%d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39901AIj.A02(X.Q0j, long, long):android.graphics.Bitmap");
    }

    public static final C7237Q0j A03(Context context, UserSession userSession, C378989Rz r23, C67266Ml0 ml0, C379229Ta r25, File file, long j, boolean z) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1H(context2, userSession2);
        C67266Ml0 ml02 = ml0;
        C379229Ta r0 = r25;
        AnonymousClass7TG.A1R(ml02, r0);
        UserSession userSession3 = r0.A00;
        File file2 = file;
        ClipInfo A02 = Q0X.A02(userSession3, file2, j);
        C378989Rz r6 = r23;
        C59783JYc A00 = C59784JYd.A00(r6.A00(new Point(A02.A09, A02.A06)), r6.A00(new Point(A02.A09, A02.A06)), A02);
        C7234Q0g q0g = new C7234Q0g(context2, userSession3, AnonymousClass9SY.A00(context2, userSession3), C14279TtC.A01, A00);
        Point point = A00.A03;
        int i = point.x;
        int i2 = point.y;
        0sn r13 = 0sn.A00;
        AnonymousClass7TF.A1F(q0g, 2, r13);
        return new C7237Q0j(context2, q0g, userSession2, ml02, C7237Q0j.A0G, file2, r13, i, i2, 0, 0, false, false, z);
    }

    public static final void A04(Bitmap bitmap, FileOutputStream fileOutputStream) {
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        0fO.A01(compressFormat, bitmap, 100);
        if (!bitmap.compress(compressFormat, 100, fileOutputStream)) {
            throw new IOException("could not compress frame");
        }
    }
}
