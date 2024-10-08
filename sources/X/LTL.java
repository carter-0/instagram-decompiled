package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.util.Map;

public abstract class LTL {
    public static final int A00(C14123TqI tqI, int i) {
        int i2 = i;
        C14122TqH tqH = tqI.A01;
        if (tqH != null) {
            i2 = tqH.A05;
        }
        int A00 = tqI.A00(i);
        int i3 = i;
        C18469VsL vsL = C18469VsL.A06;
        Map map = tqI.A04;
        C14122TqH tqH2 = (C14122TqH) map.get(vsL);
        if (tqH2 != null) {
            i3 = tqH2.A05;
        }
        int i4 = i;
        C14122TqH tqH3 = (C14122TqH) map.get(C18469VsL.A04);
        if (tqH3 != null) {
            i4 = tqH3.A05;
        }
        int i5 = i;
        C14122TqH tqH4 = (C14122TqH) map.get(C18469VsL.A05);
        if (tqH4 != null) {
            i5 = tqH4.A05;
        }
        int i6 = i;
        C14122TqH tqH5 = (C14122TqH) map.get(C18469VsL.A07);
        if (tqH5 != null) {
            i6 = tqH5.A05;
        }
        int i7 = i;
        C14122TqH tqH6 = (C14122TqH) map.get(C18469VsL.A03);
        if (tqH6 != null) {
            i7 = tqH6.A05;
        }
        int[] iArr = {i2, A00, i3, i4, i5, i6, i7};
        int i8 = 0;
        while (true) {
            int i9 = iArr[i8];
            if (i9 == i) {
                i8++;
                if (i8 >= 7) {
                    break;
                }
            } else if (Integer.valueOf(i9) != null) {
                return i9;
            }
        }
        return i;
    }

    public static final Bitmap A01(Context context, Bitmap bitmap, int i, int i2, int i3, boolean z) {
        int[] A08;
        0qQ.A0B(context, 0);
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (bitmap != null) {
            if (z) {
                int A06 = AnonymousClass7TE.A06(JTO.A01(bitmap), 0.1f);
                C14120TqF tqF = new C14120TqF(bitmap);
                tqF.A01(0, bitmap.getWidth(), A06);
                int A00 = A00(tqF.A00(), i6);
                tqF.A01 = null;
                tqF.A01(bitmap.getHeight() - A06, bitmap.getWidth(), bitmap.getHeight());
                A08 = new int[]{A00, A00(tqF.A00(), i6)};
            } else {
                A08 = A08(new C14120TqF(bitmap).A00(), i6);
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, (float) i5, A08[0], A08[1], Shader.TileMode.CLAMP);
            Bitmap A0B = AnonymousClass7TF.A0B(i4, i5);
            Canvas A0B2 = JTO.A0B(A0B);
            Paint A0V = AnonymousClass7TE.A0V(5);
            A0V.setShader(linearGradient);
            Paint A0C = JTO.A0C();
            AnonymousClass7TE.A1N(context, A0C, R.color.sticker_background);
            A0C.setAlpha((int) (0.2f * 255.0f));
            A0B2.drawPaint(A0V);
            A0B2.drawPaint(A0C);
            return A0B;
        }
        Bitmap A0B3 = AnonymousClass7TF.A0B(i4, i5);
        JTO.A0B(A0B3).drawColor(i6);
        return A0B3;
    }

    public static final int[] A08(C14123TqI tqI, int i) {
        int i2 = i;
        C14122TqH tqH = tqI.A01;
        if (tqH != null) {
            i2 = tqH.A05;
        }
        int i3 = i;
        C14122TqH tqH2 = (C14122TqH) tqI.A04.get(C18469VsL.A06);
        if (tqH2 != null) {
            i3 = tqH2.A05;
        }
        int A00 = tqI.A00(i);
        if (A00 == i || i3 == i) {
            return new int[]{i2, i2};
        }
        return new int[]{i3, A00};
    }

    public static final File A02(String str) {
        AnonymousClass7TE.A0t(str).mkdirs();
        return new File(str, 002.A0e("media_sticker_background_", ".jpg", System.currentTimeMillis()));
    }

    public static final void A03(Context context, Bitmap bitmap, MTS mts, String str, int i) {
        0nY.A00().ATE(new KJ7(context, bitmap, mts, str, i));
    }

    public static final void A04(Context context, ImageUrl imageUrl, MTS mts, String str, int i, boolean z) {
        0nY.A00().ATE(new KJA(context, imageUrl, mts, str, i, z));
    }

    public static final void A05(Context context, MTS mts, String str, float f, int i, int i2, boolean z) {
        int[] iArr = {i, i2};
        int[] iArr2 = {0, 0, 0, 1};
        if (z) {
            // fill-array-data instruction
            iArr2[0] = 1;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 1;
        }
        A06(context, mts, str, iArr, iArr2, f);
    }

    public static final void A06(Context context, MTS mts, String str, int[] iArr, int[] iArr2, float f) {
        0nY.A00().ATE(new KJB(context, mts, str, iArr, iArr2, f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(android.graphics.Bitmap r3, X.MTS r4, java.io.File r5) {
        /*
            java.io.FileOutputStream r2 = X.JTO.A0t(r5)     // Catch:{ IOException -> 0x001e }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0017 }
            r0 = 90
            X.0fO.A02(r1, r3, r2, r0)     // Catch:{ all -> 0x0017 }
            X.M8T r0 = new X.M8T     // Catch:{ all -> 0x0017 }
            r0.<init>(r3, r4, r5)     // Catch:{ all -> 0x0017 }
            X.11Z.A02(r0)     // Catch:{ all -> 0x0017 }
            r2.close()     // Catch:{ IOException -> 0x001e }
            return
        L_0x0017:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException -> 0x001e }
            throw r0     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            r1 = move-exception
            java.lang.String r0 = "unable to create background input file"
            X.0wb.A07(r0, r1)
            X.M62 r0 = new X.M62
            r0.<init>(r4, r1)
            X.11Z.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTL.A07(android.graphics.Bitmap, X.MTS, java.io.File):void");
    }
}
