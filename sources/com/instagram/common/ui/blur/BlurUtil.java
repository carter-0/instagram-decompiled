package com.instagram.common.ui.blur;

import X.0fO;
import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass1GB;
import X.AnonymousClass49B;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;

public final class BlurUtil {
    public static final AnonymousClass0eM A00 = AnonymousClass0eN.A01(AnonymousClass49B.A00);
    public static final BlurUtil INSTANCE = new Object();

    public static final Bitmap blur(Bitmap bitmap, float f, int i) {
        0qQ.A0B(bitmap, 0);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int A01 = AnonymousClass1GB.A01(((float) width) * f);
        if (A01 == 0) {
            A01 = width;
        }
        int A012 = AnonymousClass1GB.A01(((float) height) * f);
        if (A012 == 0) {
            A012 = height;
        }
        Bitmap A002 = 0fO.A00(bitmap, A01, A012, false);
        0qQ.A07(A002);
        blurInPlace(A002, i);
        Bitmap A003 = 0fO.A00(A002, width, height, false);
        0qQ.A07(A003);
        return A003;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (X.0yU.A07(X.AnonymousClass0yP.A00(36326343763310308L)) == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void blurInPlace(android.graphics.Bitmap r8, int r9) {
        /*
            r0 = 0
            X.0qQ.A0B(r8, r0)
            android.graphics.Bitmap$Config r1 = r8.getConfig()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r1 != r0) goto L_0x008e
            boolean r0 = X.AnonymousClass1HS.A00
            if (r0 == 0) goto L_0x0020
            r0 = 36326343763310308(0x810e9e000036e4, double:3.036264298138414E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)
            boolean r1 = X.0yU.A07(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            long r1 = java.lang.System.nanoTime()
            long r3 = X.AnonymousClass49C.A00
            long r1 = r1 - r3
            if (r0 == 0) goto L_0x0072
            android.content.Context r0 = X.C60960kU.A00     // Catch:{ Exception -> 0x0069 }
            android.renderscript.RenderScript r7 = android.renderscript.RenderScript.create(r0)     // Catch:{ Exception -> 0x0069 }
            android.renderscript.Allocation r6 = android.renderscript.Allocation.createFromBitmap(r7, r8)     // Catch:{ Exception -> 0x0069 }
            android.renderscript.Type r0 = r6.getType()     // Catch:{ Exception -> 0x0069 }
            android.renderscript.Allocation r5 = android.renderscript.Allocation.createTyped(r7, r0)     // Catch:{ Exception -> 0x0069 }
            android.renderscript.Element r0 = android.renderscript.Element.U8_4(r7)     // Catch:{ Exception -> 0x0069 }
            android.renderscript.ScriptIntrinsicBlur r4 = android.renderscript.ScriptIntrinsicBlur.create(r7, r0)     // Catch:{ Exception -> 0x0069 }
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = (float) r9     // Catch:{ Exception -> 0x0069 }
            float r3 = r3 * r0
            r0 = 1103626240(0x41c80000, float:25.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0050
            r3 = 1103626240(0x41c80000, float:25.0)
        L_0x0050:
            r4.setRadius(r3)     // Catch:{ Exception -> 0x0069 }
            r4.setInput(r6)     // Catch:{ Exception -> 0x0069 }
            r4.forEach(r5)     // Catch:{ Exception -> 0x0069 }
            r5.copyTo(r8)     // Catch:{ Exception -> 0x0069 }
            r7.destroy()     // Catch:{ Exception -> 0x0069 }
            r6.destroy()     // Catch:{ Exception -> 0x0069 }
            r5.destroy()     // Catch:{ Exception -> 0x0069 }
            r4.destroy()     // Catch:{ Exception -> 0x0069 }
            goto L_0x007e
        L_0x0069:
            r4 = move-exception
            java.lang.String r3 = "BlurUtil"
            java.lang.String r0 = "RenderScript blur failed"
            X.0KC.A0F(r3, r0, r4)
            goto L_0x007e
        L_0x0072:
            X.0eM r0 = A00
            java.lang.Object r3 = r0.getValue()
            com.instagram.jni.igblur.IgBlur r3 = (com.instagram.jni.igblur.IgBlur) r3
            r0 = 2
            r3.iterativeBoxBlur(r8, r0, r9)
        L_0x007e:
            X.49C r0 = X.AnonymousClass49C.A01
            long r0 = r0.A00(r1)
            r8.isMutable()
            r8.getWidth()
            X.AnonymousClass30M.A03(r0)
            return
        L_0x008e:
            X.0eM r0 = A00
            java.lang.Object r1 = r0.getValue()
            com.instagram.jni.igblur.IgBlur r1 = (com.instagram.jni.igblur.IgBlur) r1
            X.0qg r0 = X.0qg.A01()
            int r0 = r0.A04()
            r1.functionToBlur(r8, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.blur.BlurUtil.blurInPlace(android.graphics.Bitmap, int):void");
    }

    public static final Bitmap blurRadial(Bitmap bitmap, float f, float f2, int i) {
        Bitmap bitmap2 = bitmap;
        0qQ.A0B(bitmap, 0);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int A01 = AnonymousClass1GB.A01(((float) width) * f);
        if (A01 == 0) {
            A01 = width;
        }
        int A012 = AnonymousClass1GB.A01(((float) height) * f);
        if (A012 == 0) {
            A012 = height;
        }
        int i2 = i;
        float f3 = (((float) (i - 1)) * f2) + 1.0f;
        int i3 = (int) (((float) A01) / f3);
        int i4 = (int) (((float) A012) / f3);
        float f4 = ((float) (A01 - i3)) / 2.0f;
        float f5 = ((float) (A012 - i4)) / 2.0f;
        Bitmap A002 = 0fO.A00(bitmap2, i3, i4, false);
        0qQ.A07(A002);
        Bitmap createBitmap = Bitmap.createBitmap(A01, A012, Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Paint paint = new Paint();
        matrix.setTranslate(f4, f5);
        canvas.drawBitmap(A002, matrix, paint);
        paint.setAlpha(51);
        for (int i5 = 0; i5 < i2; i5++) {
            float f6 = (((float) i5) * f2) + 1.0f;
            matrix.setScale(f6, f6, ((float) i3) / 2.0f, ((float) i4) / 2.0f);
            matrix.postTranslate(f4, f5);
            canvas.drawBitmap(A002, matrix, paint);
        }
        return createBitmap;
    }

    public static final Bitmap blurTranslation(Bitmap bitmap, float f, int i, int i2, int i3, int i4) {
        0qQ.A0B(bitmap, 0);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int A01 = AnonymousClass1GB.A01(((float) width) * f);
        if (A01 == 0) {
            A01 = width;
        }
        int A012 = AnonymousClass1GB.A01(((float) height) * f);
        if (A012 == 0) {
            A012 = height;
        }
        Bitmap A002 = 0fO.A00(bitmap, A01, A012, false);
        0qQ.A07(A002);
        Bitmap createBitmap = Bitmap.createBitmap(A002.getWidth(), A002.getHeight(), Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Paint paint = new Paint();
        float f2 = (float) (i3 / 2);
        float f3 = (float) i;
        float f4 = (float) i2;
        matrix.setTranslate(f2 * f3, f2 * f4);
        canvas.drawBitmap(A002, matrix, paint);
        int i5 = i3 / i4;
        paint.setAlpha(255 / i5);
        for (int i6 = 0; i6 < i5; i6++) {
            float f5 = (float) (i6 * i4);
            matrix.setTranslate(f5 * f3, f5 * f4);
            canvas.drawBitmap(A002, matrix, paint);
        }
        return createBitmap;
    }

    public static final Bitmap blurWithAlpha(Bitmap bitmap, float f, int i, int i2) {
        0qQ.A0B(bitmap, 0);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int A01 = AnonymousClass1GB.A01(((float) width) * f);
        if (A01 == 0) {
            A01 = width;
        }
        int A012 = AnonymousClass1GB.A01(((float) height) * f);
        if (A012 == 0) {
            A012 = height;
        }
        Bitmap A002 = 0fO.A00(bitmap, A01, A012, false);
        0qQ.A07(A002);
        blurInPlace(A002, i);
        if (!A002.isMutable()) {
            A002 = A002.copy(Bitmap.Config.ARGB_8888, true);
        }
        new Canvas(A002).drawColor((i2 & 255) << 24, PorterDuff.Mode.DST_IN);
        Bitmap A003 = 0fO.A00(A002, width, height, false);
        0qQ.A07(A003);
        return A003;
    }

    public static /* synthetic */ Bitmap blurRadial$default(Bitmap bitmap, float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 10;
        }
        return blurRadial(bitmap, f, f2, i);
    }

    public static /* synthetic */ Bitmap blurTranslation$default(Bitmap bitmap, float f, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            i3 = 10;
        }
        if ((i5 & 32) != 0) {
            i4 = 1;
        }
        return blurTranslation(bitmap, f, i, i2, i3, i4);
    }
}
