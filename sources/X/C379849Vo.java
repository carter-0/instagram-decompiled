package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.IOException;

/* renamed from: X.9Vo  reason: invalid class name and case insensitive filesystem */
public abstract class C379849Vo {
    public static final Bitmap A00(ContentResolver contentResolver, BitmapFactory.Options options, Uri uri, ParcelFileDescriptor parcelFileDescriptor, int i) {
        int i2;
        int i3;
        int i4;
        IllegalStateException illegalStateException;
        Bitmap bitmap = null;
        if (parcelFileDescriptor == null) {
            if (uri == null) {
                try {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                } catch (OutOfMemoryError e) {
                    0KC.A0F("Util", "Got oom exception ", e);
                } catch (Throwable th) {
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            } else if (contentResolver != null) {
                try {
                    parcelFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                } catch (IOException unused2) {
                    parcelFileDescriptor = null;
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            }
            throw illegalStateException;
        }
        if (parcelFileDescriptor != null) {
            FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect) null, options);
            if (!(options.mCancel || (i2 = options.outWidth) == -1 || (i3 = options.outHeight) == -1)) {
                double d = (double) i2;
                double d2 = (double) i3;
                int i5 = 1;
                if (i != -1) {
                    i5 = (int) Math.ceil(Math.sqrt((d * d2) / ((double) i)));
                }
                if (i5 <= 8) {
                    i4 = 1;
                    while (i4 < i5) {
                        i4 <<= 1;
                    }
                } else {
                    i4 = ((i5 + 7) / 8) * 8;
                }
                options.inSampleSize = i4;
                options.inJustDecodeBounds = false;
                options.inDither = false;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                bitmap = BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect) null, options);
            }
        }
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable unused3) {
            }
        }
        return bitmap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.os.ParcelFileDescriptor} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[SYNTHETIC, Splitter:B:9:0x001c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap A01(android.content.ContentResolver r4, android.net.Uri r5, int r6) {
        /*
            r3 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r4.openFileDescriptor(r5, r0)     // Catch:{ IOException -> 0x0020, all -> 0x0019 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0021, all -> 0x0016 }
            r1.<init>()     // Catch:{ IOException -> 0x0021, all -> 0x0016 }
            r0 = 1
            r1.inPurgeable = r0     // Catch:{ IOException -> 0x0021, all -> 0x0016 }
            r1.inInputShareable = r0     // Catch:{ IOException -> 0x0021, all -> 0x0016 }
            android.graphics.Bitmap r3 = A00(r4, r1, r5, r2, r6)     // Catch:{ IOException -> 0x0021, all -> 0x0016 }
            goto L_0x0021
        L_0x0016:
            r0 = move-exception
            r3 = r2
            goto L_0x001a
        L_0x0019:
            r0 = move-exception
        L_0x001a:
            if (r3 == 0) goto L_0x001f
            r3.close()     // Catch:{ all -> 0x001f }
        L_0x001f:
            throw r0
        L_0x0020:
            r2 = r3
        L_0x0021:
            if (r2 == 0) goto L_0x0026
            r2.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C379849Vo.A01(android.content.ContentResolver, android.net.Uri, int):android.graphics.Bitmap");
    }
}
