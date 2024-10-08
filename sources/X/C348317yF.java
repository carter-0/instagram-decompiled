package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.util.Size;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.7yF  reason: invalid class name and case insensitive filesystem */
public abstract class C348317yF {
    public static final String[] A00 = {"_id", "image_id", "_data"};
    public static final String[] A01 = {"_id", "video_id", "_data"};

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (X.0mf.A00.contains(r1) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r5, android.graphics.BitmapFactory.Options r6, com.instagram.common.gallery.Medium r7, boolean r8) {
        /*
            r3 = 0
            r0 = 2
            X.0qQ.A0B(r6, r0)
            boolean r0 = r7.A05()
            if (r0 == 0) goto L_0x002e
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x002e
            java.lang.String r1 = r7.A03()
            if (r1 == 0) goto L_0x0062
            java.util.List r0 = X.0mf.A00
            java.lang.String r0 = "image/heic"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "image/heif"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x002e
        L_0x0029:
            java.lang.String r2 = r7.A0X
        L_0x002b:
            r7.A0a = r2
            return
        L_0x002e:
            if (r8 == 0) goto L_0x006a
            boolean r0 = r7.A05()
            if (r0 == 0) goto L_0x006a
            boolean r0 = r7.isValid()
            if (r0 == 0) goto L_0x006a
            java.lang.String r2 = r7.A0X
            r1 = 46
            X.0qQ.A0B(r2, r3)
            int r0 = r2.length()
            int r0 = r0 + -1
            int r0 = X.00l.A05(r2, r1, r0)
            if (r0 < 0) goto L_0x005f
            java.lang.String r1 = r2.substring(r0)
            X.0qQ.A07(r1)
        L_0x0056:
            java.util.List r0 = X.0mf.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x006a
            goto L_0x002b
        L_0x005f:
            java.lang.String r1 = ""
            goto L_0x0056
        L_0x0062:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x006a:
            java.lang.String r1 = r7.A0a
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = r7.A0X
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0077
            return
        L_0x0077:
            boolean r4 = r7.CeS()
            r3 = 1
            android.content.ContentResolver r2 = r5.getContentResolver()
            int r0 = r7.A05
            long r0 = (long) r0
            if (r4 == 0) goto L_0x008c
            android.provider.MediaStore.Video.Thumbnails.getThumbnail(r2, r0, r3, r6)
        L_0x0088:
            A02(r5, r7)
            return
        L_0x008c:
            android.provider.MediaStore.Images.Thumbnails.getThumbnail(r2, r0, r3, r6)
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C348317yF.A01(android.content.Context, android.graphics.BitmapFactory$Options, com.instagram.common.gallery.Medium, boolean):void");
    }

    public static final void A02(Context context, Medium medium) {
        Uri uri;
        0qQ.A0B(medium, 1);
        if (medium.CeS()) {
            uri = MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI;
        }
        Cursor cursor = null;
        0qQ.A0A(uri);
        ContentProviderClient A002 = C61990qh.A00(context, uri);
        if (A002 != null) {
            try {
                if (medium.CeS()) {
                    cursor = A002.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, A01, 002.A0O("video_id = ", medium.A05), (String[]) null, (String) null);
                } else {
                    cursor = A002.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, A00, 002.A0O("image_id = ", medium.A05), (String[]) null, (String) null);
                }
                if (cursor != null && cursor.moveToFirst()) {
                    if (medium.CeS()) {
                        medium.A0a = cursor.getString(cursor.getColumnIndex("_data"));
                    } else {
                        medium.A0a = cursor.getString(cursor.getColumnIndex("_data"));
                    }
                }
                A002.release();
                if (cursor == null) {
                    return;
                }
            } catch (RemoteException unused) {
                A002.release();
                if (cursor == null) {
                    return;
                }
            } catch (Throwable th) {
                A002.release();
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th;
            }
            if (!cursor.isClosed()) {
                cursor.close();
            }
        }
    }

    public static final Bitmap A00(ContentResolver contentResolver, CancellationSignal cancellationSignal, C348297yD r11, Medium medium, UserSession userSession, WeakReference weakReference, int i, int i2) {
        C348257y9 r1;
        String str;
        C348257y9 r12;
        Bitmap bitmap = null;
        ContentResolver contentResolver2 = contentResolver;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        C348297yD r10 = r11;
        UserSession userSession2 = userSession;
        int i3 = i2;
        if (r10 != null) {
            try {
                bitmap = JXS.A01(contentResolver2, medium.A02(), cancellationSignal2, new Size(i, i3), r10, userSession2);
            } catch (IOException e) {
                e = e;
                str = "GalleryThumbnailUtil#IOException";
                if (!(e instanceof FileNotFoundException) && userSession != null) {
                    0f9 AEf = 0wj.A01.AEf(str, 817894040);
                    AEf.ERJ(e);
                    AEf.report();
                }
                0KC.A0F("GalleryThumbnailUtil", str, e);
                return bitmap;
            } catch (OperationCanceledException e2) {
                e = e2;
                str = "GalleryThumbnailUtil#OperationCanceledException";
                0KC.A0F("GalleryThumbnailUtil", str, e);
                return bitmap;
            } catch (NullPointerException e3) {
                e = e3;
                if (!(weakReference == null || (r12 = (C348257y9) weakReference.get()) == null || !r12.CWP(medium))) {
                    r12.DLY(medium, "GalleryThumbnailUtil#NullPointerException - medium.mUri is null");
                }
                str = "GalleryThumbnailUtil#NullPointerException";
                0KC.A0F("GalleryThumbnailUtil", str, e);
                return bitmap;
            }
        } else {
            bitmap = contentResolver.loadThumbnail(medium.A02(), new Size(i, i3), cancellationSignal2);
        }
        if (!(bitmap == null || weakReference == null || (r1 = (C348257y9) weakReference.get()) == null || !r1.CWP(medium))) {
            11Z.A02(new C348327yG(bitmap, cancellationSignal2, medium, r1));
            return bitmap;
        }
        return bitmap;
    }

    public static final void A03(CancellationSignal cancellationSignal, Medium medium, WeakReference weakReference, int i, int i2) {
        String str;
        Bitmap bitmap;
        C348257y9 r1;
        try {
            if (medium.A05()) {
                if (Build.VERSION.SDK_INT >= 29) {
                    bitmap = ThumbnailUtils.createImageThumbnail(new File(medium.A0X), new Size(i, i2), cancellationSignal);
                } else {
                    return;
                }
            } else if (Build.VERSION.SDK_INT >= 29) {
                bitmap = ThumbnailUtils.createVideoThumbnail(new File(medium.A0X), new Size(i, i2), cancellationSignal);
            } else {
                bitmap = ThumbnailUtils.createVideoThumbnail(medium.A0X, 1);
            }
            if (bitmap != null && (r1 = (C348257y9) weakReference.get()) != null && r1.CWP(medium)) {
                11Z.A02(new C348327yG(bitmap, cancellationSignal, medium, r1));
            }
        } catch (IOException e) {
            e = e;
            0wb.A07("GalleryThumbnailUti.loadThumbnailFromFilel#IOException", e);
            str = "GalleryThumbnailUtil.loadThumbnailFromFile#IOException";
            0KC.A0F("GalleryThumbnailUtil", str, e);
        } catch (OperationCanceledException e2) {
            e = e2;
            str = "GalleryThumbnailUtil.loadThumbnailFromFile#OperationCanceledException";
            0KC.A0F("GalleryThumbnailUtil", str, e);
        }
    }
}
