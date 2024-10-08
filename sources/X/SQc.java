package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public abstract class SQc {
    public static final Paint A00;
    public static final Paint A01 = AnonymousClass7TE.A0V(7);
    public static final Lock A02;
    public static final Paint A03 = AnonymousClass7TE.A0V(6);
    public static final Set A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.util.concurrent.locks.ReentrantLock} */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.concurrent.locks.Lock] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 6
            android.graphics.Paint r0 = X.AnonymousClass7TE.A0V(r0)
            A03 = r0
            r5 = 7
            android.graphics.Paint r0 = X.AnonymousClass7TE.A0V(r5)
            A01 = r0
            r0 = 29
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r6 = "XT1085"
            java.lang.String r7 = "XT1092"
            java.lang.String r8 = "XT1093"
            java.lang.String r9 = "XT1094"
            java.lang.String r10 = "XT1095"
            java.lang.String r11 = "XT1096"
            java.lang.String r12 = "XT1097"
            java.lang.String r13 = "XT1098"
            java.lang.String r14 = "XT1031"
            java.lang.String r15 = "XT1028"
            java.lang.String r16 = "XT937C"
            java.lang.String r17 = "XT1032"
            java.lang.String r18 = "XT1008"
            java.lang.String r19 = "XT1033"
            java.lang.String r20 = "XT1035"
            java.lang.String r21 = "XT1034"
            java.lang.String r22 = "XT939G"
            java.lang.String r23 = "XT1039"
            java.lang.String r24 = "XT1040"
            java.lang.String r25 = "XT1042"
            java.lang.String r26 = "XT1045"
            java.lang.String r27 = "XT1063"
            java.lang.String r28 = "XT1064"
            java.lang.String r29 = "XT1068"
            java.lang.String r30 = "XT1069"
            java.lang.String r31 = "XT1072"
            java.lang.String r32 = "XT1077"
            java.lang.String[] r1 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}
            boolean r4 = X.AnonymousClass7TF.A1X(r1, r0)
            java.lang.String r2 = "XT1078"
            java.lang.String r1 = "XT1079"
            java.lang.String[] r3 = new java.lang.String[]{r2, r1}
            r2 = 27
            r1 = 2
            java.lang.System.arraycopy(r3, r4, r0, r2, r1)
            java.util.HashSet r1 = X.Pxf.A0s(r0)
            A04 = r1
            java.lang.String r0 = android.os.Build.MODEL
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x007f
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
        L_0x0071:
            A02 = r0
            android.graphics.Paint r1 = X.AnonymousClass7TE.A0V(r5)
            A00 = r1
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.Pxi.A0v(r1, r0)
            return
        L_0x007f:
            X.TOV r0 = new X.TOV
            r0.<init>()
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQc.<clinit>():void");
    }

    public static Bitmap A00(Bitmap bitmap, C13813Thg thg) {
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap AWz = thg.AWz(bitmap.getWidth(), bitmap.getHeight(), config);
        JTO.A0B(AWz).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return AWz;
    }

    public static void A02(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = A02;
        lock.lock();
        try {
            Canvas A0B = JTO.A0B(bitmap2);
            A0B.drawBitmap(bitmap, matrix, A03);
            A0B.setBitmap((Bitmap) null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap A01(Bitmap bitmap, C13813Thg thg, int i, int i2) {
        Bitmap.Config config;
        if (!(bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
            float min = Math.min(((float) i) / JTO.A02(bitmap), ((float) i2) / JTO.A01(bitmap));
            int A05 = AnonymousClass7TE.A05(JTO.A02(bitmap), min);
            int A052 = AnonymousClass7TE.A05(JTO.A01(bitmap), min);
            if (!(bitmap.getWidth() == A05 && bitmap.getHeight() == A052)) {
                int A022 = (int) (JTO.A02(bitmap) * min);
                int A012 = (int) (JTO.A01(bitmap) * min);
                if (bitmap.getConfig() != null) {
                    config = bitmap.getConfig();
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap AWz = thg.AWz(A022, A012, config);
                AWz.setHasAlpha(bitmap.hasAlpha());
                if (Log.isLoggable("TransformationUtils", 2)) {
                    bitmap.getWidth();
                    bitmap.getHeight();
                    AWz.getWidth();
                    AWz.getHeight();
                }
                Matrix A0U = AnonymousClass7TE.A0U();
                A0U.setScale(min, min);
                A02(bitmap, AWz, A0U);
                return AWz;
            }
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }
}
