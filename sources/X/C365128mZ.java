package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.util.DisplayMetrics;
import com.instagram.common.session.UserSession;
import com.instagram.util.jpeg.JpegBridge;
import com.instagram.util.jpeg.NativeImage;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.8mZ  reason: invalid class name and case insensitive filesystem */
public final class C365128mZ {
    public static int A00 = 1024;
    public static boolean A01;

    static {
        DisplayMetrics A0H = 0nA.A0H(C60960kU.A00);
        if (Math.min(A0H.widthPixels, A0H.heightPixels) <= 320) {
        }
    }

    public static NativeImage A01(NativeImage nativeImage) {
        int i = nativeImage.width;
        int i2 = nativeImage.height;
        int i3 = A00;
        if (i3 == -1) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(3379, iArr, 0);
            i3 = Math.min(iArr[0], 8192);
            A00 = i3;
        }
        int i4 = 128;
        boolean z = false;
        float f = (float) i2;
        float f2 = f;
        float f3 = (float) i;
        int i5 = i2;
        if (i >= i2) {
            z = true;
            f = f3;
            f3 = f2;
            i5 = i;
            i = i2;
        }
        if (i < 128) {
            i5 = (int) (((128.0f * f) / f3) + 0.5f);
        } else {
            i4 = i;
        }
        if (i5 > i3) {
            i4 = (int) (((((float) i3) * f3) / f) + 0.5f);
            i5 = i3;
        }
        int i6 = i5;
        if (!z) {
            i6 = i4;
            i4 = i5;
        }
        Point point = new Point(i6, i4);
        int i7 = point.x;
        int i8 = nativeImage.width;
        if (i7 == i8 && point.y == nativeImage.height) {
            return nativeImage;
        }
        0wb.A03("JpegHelper", 002.A10("Scaling texture: ", "x", " --> ", "x", i8, nativeImage.height, i7, point.y));
        NativeImage scaleImage = JpegBridge.scaleImage(nativeImage, point.x, point.y, 12);
        JpegBridge.releaseNativeBuffer(nativeImage.bufferId);
        return scaleImage;
    }

    public static synchronized void A02(Context context, UserSession userSession) {
        synchronized (C365128mZ.class) {
            if (!A01) {
                WXK wxk = new WXK(context, userSession);
                wxk.ErI(new LNz());
                if (A00 == -1) {
                    int[] iArr = new int[1];
                    GLES20.glGetIntegerv(3379, iArr, 0);
                    A00 = Math.min(iArr[0], 8192);
                }
                wxk.AOs();
                A01 = true;
            }
        }
    }

    public static NativeImage A00(Rect rect, C364968mJ r9, String str) {
        int i;
        int i2;
        String lowerCase = str.toLowerCase();
        int hashCode = str.hashCode();
        if (r9 != null) {
            r9.A00.markerStart(17633132, hashCode);
        }
        if (!lowerCase.endsWith(".jpg") && !lowerCase.endsWith(".jpeg")) {
            String A002 = 0mf.A00(str);
            if (!"image/jpeg".equals(A002)) {
                0KC.A0O("JpegHelper", "Could not load non-JPEG file %s", new Object[]{str});
                if (r9 != null) {
                    if (A002 == null) {
                        A002 = "unknown";
                    }
                    r9.A02(hashCode, "non-JPEG file", A002);
                    r9.A00();
                }
                throw new IOException(002.A0R("JpegHelper: Abort loading non-jpg file: ", str));
            }
        }
        if (JpegBridge.A01()) {
            if (r9 != null) {
                try {
                    r9.A01(hashCode, "decodeJpeg start");
                } catch (UnsatisfiedLinkError e) {
                    if (r9 != null) {
                        r9.A02(hashCode, "UnsatisfiedLinkError", "");
                        r9.A00();
                    }
                    0KC.A0G("JpegHelper", "UnsatisfiedLinkError", e);
                }
            }
            NativeImage A003 = JpegBridge.A00(rect, str);
            if (A003 == null) {
                if (r9 != null) {
                    r9.A01(hashCode, "decodeJpeg failed");
                    r9.A00();
                }
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str, options);
                    i2 = options.outWidth;
                    try {
                        i = options.outHeight;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    i2 = 0;
                    0wb.A03(002.A0R("JpegHelper", "_decode_image"), 002.A0R("Error decoding image: ", str));
                    i = 0;
                    throw new IOException(002.A0R("JpegHelper: Could not load file: ", String.format(Locale.US, "%dx%d, size=%d KB, path=%s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i), Long.valueOf(new File(str).length() / 1024), str})));
                }
                throw new IOException(002.A0R("JpegHelper: Could not load file: ", String.format(Locale.US, "%dx%d, size=%d KB, path=%s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i), Long.valueOf(new File(str).length() / 1024), str})));
            }
            if (r9 != null) {
                r9.A01(hashCode, "decodeJpeg end");
                r9.A02(hashCode, "decodeJpeg", 002.A02(A003.width, A003.height, "end w: ", " h: "));
                r9.A01(hashCode, "scaleImage start");
            }
            NativeImage A012 = A01(A003);
            if (r9 == null) {
                return A012;
            }
            r9.A01(hashCode, "scaleImage end");
            r9.A02(hashCode, "scaleImage", 002.A02(A012.width, A012.height, "end w: ", " h: "));
            r9.A00.markerEnd(17633132, 2);
            return A012;
        }
        if (r9 != null) {
            r9.A01(hashCode, "decodeJpeg failed load library");
            r9.A00();
        }
        return null;
    }
}
