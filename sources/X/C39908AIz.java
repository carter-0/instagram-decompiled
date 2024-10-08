package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.util.jpeg.JpegBridge;
import java.io.File;

/* renamed from: X.AIz  reason: case insensitive filesystem */
public abstract class C39908AIz {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (X.182.A06(X.0Tu.A05, r14, 36322804710255022L) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap A00(com.instagram.common.session.UserSession r14, java.lang.String r15, int r16, int r17, long r18) {
        /*
            r5 = r15
            java.lang.String r3 = "Exception calling MediaMetadataRetriever#release"
            java.lang.String r10 = ""
            java.lang.String r4 = "file_path"
            android.media.MediaMetadataRetriever r12 = new android.media.MediaMetadataRetriever
            r12.<init>()
            r2 = 0
            r12.setDataSource(r15)     // Catch:{ RuntimeException -> 0x00a7 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ RuntimeException -> 0x00a7 }
            r9 = 1
            r8 = 30
            if (r6 < r8) goto L_0x002d
            r0 = 35
            java.lang.String r0 = r12.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x00a7 }
            if (r0 == 0) goto L_0x002d
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ RuntimeException -> 0x00a7 }
            r1 = 6
            if (r0 == 0) goto L_0x002d
            int r0 = r0.intValue()     // Catch:{ RuntimeException -> 0x00a7 }
            if (r0 != r1) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r9 = 0
        L_0x002e:
            if (r9 == 0) goto L_0x003e
            X.0Tu r7 = X.0Tu.A05     // Catch:{ RuntimeException -> 0x00a7 }
            r0 = 36322804710255022(0x810b66000029ae, double:3.0340261867356286E-306)
            boolean r0 = X.182.A06(r7, r14, r0)     // Catch:{ RuntimeException -> 0x00a7 }
            r7 = 1
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            r13 = r18
            if (r16 <= 0) goto L_0x0068
            if (r17 <= 0) goto L_0x0068
            if (r6 < r8) goto L_0x0068
            android.media.MediaMetadataRetriever$BitmapParams r1 = new android.media.MediaMetadataRetriever$BitmapParams     // Catch:{ RuntimeException -> 0x00a7 }
            r1.<init>()     // Catch:{ RuntimeException -> 0x00a7 }
            if (r9 == 0) goto L_0x0055
            r0 = 33
            if (r6 < r0) goto L_0x0055
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_1010102     // Catch:{ RuntimeException -> 0x00a7 }
            goto L_0x005d
        L_0x0055:
            if (r9 == 0) goto L_0x0058
            goto L_0x005b
        L_0x0058:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ RuntimeException -> 0x00a7 }
            goto L_0x005d
        L_0x005b:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ RuntimeException -> 0x00a7 }
        L_0x005d:
            r1.setPreferredConfig(r0)     // Catch:{ RuntimeException -> 0x00a7 }
            r15 = 2
            r18 = r1
            android.graphics.Bitmap r2 = r12.getScaledFrameAtTime(r13, r15, r16, r17, r18)     // Catch:{ RuntimeException -> 0x00a7 }
            goto L_0x006d
        L_0x0068:
            r15 = 2
            android.graphics.Bitmap r2 = r12.getScaledFrameAtTime(r13, r15, r16, r17)     // Catch:{ RuntimeException -> 0x00a7 }
        L_0x006d:
            if (r9 == 0) goto L_0x007e
            r0 = 29
            if (r6 < r0) goto L_0x007e
            if (r2 == 0) goto L_0x007e
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.BT2020     // Catch:{ RuntimeException -> 0x00a7 }
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)     // Catch:{ RuntimeException -> 0x00a7 }
            r2.setColorSpace(r0)     // Catch:{ RuntimeException -> 0x00a7 }
        L_0x007e:
            if (r7 == 0) goto L_0x00b5
            if (r2 == 0) goto L_0x00b5
            android.graphics.Picture r7 = new android.graphics.Picture     // Catch:{ RuntimeException -> 0x00a7 }
            r7.<init>()     // Catch:{ RuntimeException -> 0x00a7 }
            android.graphics.Paint r6 = new android.graphics.Paint     // Catch:{ RuntimeException -> 0x00a7 }
            r6.<init>()     // Catch:{ RuntimeException -> 0x00a7 }
            int r1 = r2.getWidth()     // Catch:{ RuntimeException -> 0x00a7 }
            int r0 = r2.getHeight()     // Catch:{ RuntimeException -> 0x00a7 }
            android.graphics.Canvas r1 = r7.beginRecording(r1, r0)     // Catch:{ RuntimeException -> 0x00a7 }
            X.0qQ.A07(r1)     // Catch:{ RuntimeException -> 0x00a7 }
            r0 = 0
            r1.drawBitmap(r2, r0, r0, r6)     // Catch:{ RuntimeException -> 0x00a7 }
            r7.endRecording()     // Catch:{ RuntimeException -> 0x00a7 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r7)     // Catch:{ RuntimeException -> 0x00a7 }
            goto L_0x00b5
        L_0x00a7:
            r6 = move-exception
            java.lang.String r1 = "Exception calling MediaMetadataRetriever#getScaledFrameAtTime"
            r0 = r5
            if (r5 != 0) goto L_0x00ae
            r0 = r10
        L_0x00ae:
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r4, r0)     // Catch:{ all -> 0x00c6 }
            X.0kD.A0I(r1, r6, r0)     // Catch:{ all -> 0x00c6 }
        L_0x00b5:
            r12.release()     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00c5
        L_0x00b9:
            r1 = move-exception
            if (r5 != 0) goto L_0x00bd
            r5 = r10
        L_0x00bd:
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r4, r5)
            X.0kD.A0I(r3, r1, r0)
            return r2
        L_0x00c5:
            return r2
        L_0x00c6:
            r2 = move-exception
            r12.release()     // Catch:{ Exception -> 0x00cb }
            throw r2
        L_0x00cb:
            r1 = move-exception
            if (r5 != 0) goto L_0x00cf
            r5 = r10
        L_0x00cf:
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r4, r5)
            X.0kD.A0I(r3, r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39908AIz.A00(com.instagram.common.session.UserSession, java.lang.String, int, int, long):android.graphics.Bitmap");
    }

    public static final Bitmap A01(String str, long j) {
        Bitmap bitmap;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            bitmap = mediaMetadataRetriever.getFrameAtTime(j, 2);
        } catch (RuntimeException unused) {
            bitmap = null;
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused2) {
            }
            throw th;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Exception unused3) {
        }
        return bitmap;
    }

    public static final C352218Cl A03(Bitmap bitmap, C376649Iu r16, UserSession userSession, String str, String str2, int i, boolean z) {
        File A04;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        String str3 = str;
        String str4 = str2;
        AnonymousClass7TG.A1Q(str3, str4);
        Matrix A0U = AnonymousClass7TE.A0U();
        int i2 = i;
        Bitmap bitmap2 = bitmap;
        A0U.setRotate((float) i2, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        float f = 1.0f;
        if (z) {
            f = -1.0f;
        }
        A0U.postScale(f, 1.0f, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        0fO.A03(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, A0U, false);
        0qQ.A07(createBitmap);
        if (182.A06(0Tu.A05, userSession2, 36329148376956758L)) {
            File A0t = AnonymousClass7TE.A0t(str3);
            if (!A0t.exists()) {
                A0t.mkdirs();
            }
            String A0T = 002.A0T(str3, str4, '/');
            if (JpegBridge.A01()) {
                JpegBridge.compressBitmapToFileNative(createBitmap, A0T, 75, true, false, false);
            }
            A04 = AnonymousClass7TE.A0t(A0T);
        } else {
            A04 = C364678lo.A04(createBitmap, userSession2, str3, str4, (byte[]) null);
        }
        C376649Iu r1 = r16;
        if (r16 != null) {
            C227792jv.A02(r1, A04);
        }
        long currentTimeMillis = System.currentTimeMillis();
        C352218Cl r10 = new C352218Cl(A04, createBitmap.getWidth(), createBitmap.getHeight(), currentTimeMillis, currentTimeMillis, false);
        r10.A0I = 0oY.A01(0oT.A01(bitmap2, AnonymousClass05K.A00), i2);
        return r10;
    }

    public static final C349307zv A04(C21986Xoh xoh, File file) {
        String str;
        boolean z;
        int i;
        C21986Xoh xoh2 = xoh;
        Integer A00 = xoh2.A00(C21986Xoh.A0J);
        if (A00 == null || 1 != A00.intValue()) {
            str = "back";
            z = false;
        } else {
            str = "front";
            z = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int intValue = xoh2.A00(C21986Xoh.A0L).intValue();
        int intValue2 = xoh2.A00(C21986Xoh.A0K).intValue();
        int intValue3 = xoh2.A00(C21986Xoh.A0M).intValue();
        Object A01 = xoh2.A01(C21986Xoh.A0T);
        if (A01 != null) {
            C349307zv r3 = new C349307zv(file, (Integer) null, str, intValue, intValue2, intValue3, currentTimeMillis, currentTimeMillis, z, false, AnonymousClass7TE.A1a(A01));
            r3.A01 = A00.intValue();
            r3.A0Z = (Integer) xoh2.A01(C21986Xoh.A0O);
            r3.A0a = (Integer) xoh2.A01(C21986Xoh.A0P);
            Number number = (Number) xoh2.A01(C21986Xoh.A0Q);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 3;
            }
            r3.A0b = Integer.valueOf(i);
            return r3;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final boolean A06(CameraConfiguration cameraConfiguration) {
        C279284yO r2 = cameraConfiguration.A03;
        if ((r2 instanceof AnonymousClass80O) && !cameraConfiguration.A04.contains(C358088aL.A0y)) {
            return true;
        }
        if (r2 == AnonymousClass9QA.A00 || r2 == AnonymousClass80M.A00) {
            return cameraConfiguration.A04.contains(C358088aL.A0B);
        }
        return false;
    }

    public static final BackgroundGradientColors A02(File file) {
        Bitmap A01;
        if (!file.exists() || (A01 = A01(file.getPath(), 0)) == null) {
            return new BackgroundGradientColors(-16777216, -16777216);
        }
        return 0oT.A01(A01, AnonymousClass05K.A00);
    }

    public static final void A05(Context context, UserSession userSession, RR6 rr6, MUR mur) {
        int i;
        int i2;
        Point A0D = 0nA.A0D(context);
        if (rr6.A00 == 0 || rr6.A01 == 0) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36312891925726752L)) {
                i = (int) 182.A01(r2, userSession, 36594366902503108L);
                i2 = (int) 182.A01(r2, userSession, 36594366902503108L);
            } else {
                i = A0D.x;
                i2 = A0D.y;
            }
            rr6.A00 = i2;
            rr6.A01 = i;
        }
        C11156SCl.A00(new M09(userSession, mur), rr6);
    }
}
