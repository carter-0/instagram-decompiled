package com.facebook.webpsupport;

import X.0fP;
import X.AnonymousClass0Sc;
import X.AnonymousClass7TE;
import X.C9153RRe;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class WebpBitmapFactoryImpl {
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        AnonymousClass0Sc.A00();
        return 0fP.A00(bArr, i, i2, (BitmapFactory.Options) null);
    }

    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        FileInputStream fileInputStream;
        Bitmap bitmap = null;
        try {
            fileInputStream = new FileInputStream(str);
            bitmap = hookDecodeStream(fileInputStream, (Rect) null, options);
            fileInputStream.close();
            return bitmap;
        } catch (Exception unused) {
            return bitmap;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        throw th;
    }

    public static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    public static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    public static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    public static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (options != null && (bitmap = options.inBitmap) != null && bitmap.isMutable()) {
            return options.inBitmap;
        }
        throw AnonymousClass7TE.A11("jpegGenerator");
    }

    public static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        if (options == null || (bArr = options.inTempStorage) == null) {
            return new byte[8192];
        }
        return bArr;
    }

    public static float getScaleFromOptions(BitmapFactory.Options options) {
        float f = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        if (i > 1) {
            f = 1.0f / ((float) i);
        }
        if (!options.inScaled) {
            return f;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        int i4 = options.inScreenDensity;
        if (i2 == 0 || i3 == 0 || i2 == i4) {
            return f;
        }
        return ((float) i3) / ((float) i2);
    }

    public static Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        InputStream openRawResource;
        TypedValue typedValue = new TypedValue();
        Bitmap bitmap = null;
        try {
            openRawResource = resources.openRawResource(i, typedValue);
            bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, (Rect) null, options);
            if (openRawResource != null) {
                openRawResource.close();
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        if (bitmap != null || options == null || options.inBitmap == null) {
            return bitmap;
        }
        throw AnonymousClass7TE.A0w("Problem decoding into existing bitmap");
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r1 != 65535) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap hookDecodeResourceStream(android.content.res.Resources r2, android.util.TypedValue r3, java.io.InputStream r4, android.graphics.Rect r5, android.graphics.BitmapFactory.Options r6) {
        /*
            if (r6 != 0) goto L_0x0007
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options
            r6.<init>()
        L_0x0007:
            int r0 = r6.inDensity
            if (r0 != 0) goto L_0x0015
            if (r3 == 0) goto L_0x0015
            int r1 = r3.density
            if (r1 != 0) goto L_0x0028
            r1 = 160(0xa0, float:2.24E-43)
        L_0x0013:
            r6.inDensity = r1
        L_0x0015:
            int r0 = r6.inTargetDensity
            if (r0 != 0) goto L_0x0023
            if (r2 == 0) goto L_0x0023
            android.util.DisplayMetrics r0 = r2.getDisplayMetrics()
            int r0 = r0.densityDpi
            r6.inTargetDensity = r0
        L_0x0023:
            android.graphics.Bitmap r0 = hookDecodeStream(r4, r5, r6)
            return r0
        L_0x0028:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 == r0) goto L_0x0015
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeResourceStream(android.content.res.Resources, android.util.TypedValue, java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    public static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    public static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    public static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        byte[] bArr;
        AnonymousClass0Sc.A00();
        long nativeSeek = nativeSeek(fileDescriptor, 0, false);
        if (nativeSeek != -1) {
            InputStream fileInputStream = new FileInputStream(fileDescriptor);
            if (!fileInputStream.markSupported()) {
                fileInputStream = new BufferedInputStream(fileInputStream, 20);
            }
            try {
                fileInputStream.mark(20);
                if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
                    bArr = new byte[20];
                }
                try {
                    fileInputStream.read(bArr, 0, 20);
                    fileInputStream.reset();
                } catch (IOException unused) {
                }
                nativeSeek(fileDescriptor, nativeSeek, true);
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
                try {
                    fileInputStream.close();
                    return decodeFileDescriptor;
                } catch (Throwable unused2) {
                    return decodeFileDescriptor;
                }
            } catch (Throwable unused3) {
            }
        } else {
            Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return hookDecodeStream;
        }
        throw th;
    }

    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        AnonymousClass0Sc.A00();
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 20);
        }
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    public static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    public static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    public static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    public static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        AnonymousClass0Sc.A00();
        return 0fP.A00(bArr, i, i2, options);
    }

    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, (BitmapFactory.Options) null);
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, (Rect) null, (BitmapFactory.Options) null);
    }

    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, (BitmapFactory.Options) null);
    }

    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, (Rect) null, (BitmapFactory.Options) null);
    }

    public static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return 0fP.A00(bArr, i, i2, options);
    }

    public static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    public static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }
}
