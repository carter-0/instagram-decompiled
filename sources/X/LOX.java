package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.File;

public final class LOX {
    public final int A00;
    public final int A01;
    public final LAM A02;
    public final int A03;
    public final int A04;
    public final Bitmap A05;
    public final String A06;

    public final void A01(ContentResolver contentResolver, UserSession userSession, String str) {
        String str2 = this.A02.A04;
        File A0t = AnonymousClass7TE.A0t(str2);
        String name = A0t.getName();
        0qQ.A0A(name);
        0qQ.A0B(name, 0);
        0eP A1L = AnonymousClass7TE.A1L(DialogModule.KEY_TITLE, TextUtils.substring(name, 0, 00l.A05(name, '.', name.length() - 1)));
        0eP A1L2 = AnonymousClass7TE.A1L("_display_name", name);
        0eP A1L3 = AnonymousClass7TE.A1L("datetaken", C51968G9o.A0u());
        String A002 = 0mf.A00(name);
        if (A002 == null) {
            A002 = "unknown";
        }
        0eP[] r7 = {A1L, A1L2, A1L3, AnonymousClass7TE.A1L("mime_type", A002), AnonymousClass7TE.A1L("_size", Long.valueOf(A0t.length()))};
        ContentValues contentValues = new ContentValues(5);
        int i = 0;
        do {
            0eP r0 = r7[i];
            String str3 = (String) r0.A00;
            Object obj = r0.A01;
            if (obj == null) {
                contentValues.putNull(str3);
            } else if (obj instanceof String) {
                contentValues.put(str3, (String) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str3, (Integer) obj);
            } else if (obj instanceof Long) {
                contentValues.put(str3, (Long) obj);
            } else if (obj instanceof Boolean) {
                contentValues.put(str3, (Boolean) obj);
            } else if (obj instanceof Float) {
                contentValues.put(str3, (Float) obj);
            } else if (obj instanceof Double) {
                contentValues.put(str3, (Double) obj);
            } else if (obj instanceof byte[]) {
                contentValues.put(str3, (byte[]) obj);
            } else if (obj instanceof Byte) {
                contentValues.put(str3, (Byte) obj);
            } else if (obj instanceof Short) {
                contentValues.put(str3, (Short) obj);
            } else {
                throw AnonymousClass7TE.A0w(002.A0v(Pxd.A00(511), obj.getClass().getCanonicalName(), " for key \"", str3, '\"'));
            }
            i++;
        } while (i < 5);
        if (Build.VERSION.SDK_INT >= 29) {
            A00(contentResolver, contentValues, userSession, str);
            return;
        }
        A02(userSession);
        contentValues.put("_data", str2);
        try {
            contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        } catch (Exception e) {
            0kD.A0D("SavePhotoUtil_ScopedStorage", "Save photo to MediaStore failed (legacy)", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0103, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0107, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(com.instagram.common.session.UserSession r18) {
        /*
            r17 = this;
            r9 = 0
            r13 = r18
            X.0qQ.A0B(r13, r9)
            r14 = r17
            java.lang.String r2 = r14.A06
            int r1 = r2.hashCode()
            r0 = -1487464693(0xffffffffa757170b, float:-2.9849735E-15)
            r6 = 1
            if (r1 == r0) goto L_0x0114
            r0 = -1487394660(0xffffffffa758289c, float:-2.9998036E-15)
            if (r1 == r0) goto L_0x0080
            r0 = -1487018032(0xffffffffa75de7d0, float:-3.0795577E-15)
            if (r1 != r0) goto L_0x0178
            java.lang.String r0 = "image/webp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0178
            android.graphics.Bitmap r5 = r14.A05
            if (r5 == 0) goto L_0x0176
            X.LAM r0 = r14.A02     // Catch:{ IOException -> 0x016e }
            java.lang.String r4 = r0.A04     // Catch:{ IOException -> 0x016e }
            java.io.File r0 = X.AnonymousClass7TE.A0t(r4)     // Catch:{ IOException -> 0x016e }
            java.io.FileOutputStream r3 = X.JTO.A0t(r0)     // Catch:{ IOException -> 0x016e }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0079 }
            r0 = 30
            if (r1 < r0) goto L_0x006d
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x0079 }
            r0 = 36327907132717862(0x81100a00143b26, double:3.037252979246935E-306)
            boolean r0 = X.182.A06(r2, r13, r0)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x006a
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.WEBP_LOSSLESS     // Catch:{ all -> 0x0079 }
        L_0x004b:
            int r0 = r14.A01     // Catch:{ all -> 0x0079 }
            X.0fO.A01(r1, r5, r0)     // Catch:{ all -> 0x0079 }
            boolean r0 = r5.compress(r1, r0, r3)     // Catch:{ all -> 0x0079 }
            if (r0 != 0) goto L_0x0075
            X.0wj r2 = X.0wj.A01     // Catch:{ all -> 0x0079 }
            r1 = 817892527(0x30c00caf, float:1.3973444E-9)
            java.lang.String r0 = "bitmap_compress_error"
            X.0f9 r1 = r2.AEf(r0, r1)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "path"
            r1.ABQ(r0, r4)     // Catch:{ all -> 0x0079 }
            r1.report()     // Catch:{ all -> 0x0079 }
            goto L_0x0070
        L_0x006a:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.WEBP_LOSSY     // Catch:{ all -> 0x0079 }
            goto L_0x004b
        L_0x006d:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ all -> 0x0079 }
            goto L_0x004b
        L_0x0070:
            r3.close()     // Catch:{ IOException -> 0x016e }
            goto L_0x0176
        L_0x0075:
            r3.close()     // Catch:{ IOException -> 0x016e }
            return r6
        L_0x0079:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ IOException -> 0x016e }
            throw r0     // Catch:{ IOException -> 0x016e }
        L_0x0080:
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0178
            int r7 = r14.A00
            r0 = -1
            if (r7 == r0) goto L_0x00c7
            com.instagram.util.creation.RenderBridge.mirrorImage(r7)
            X.LAM r3 = r14.A02
            java.lang.String r8 = r3.A04
            int r11 = r14.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313291357685617(0x8102bf00000771, double:3.028009904263541E-306)
            boolean r12 = X.182.A06(r2, r13, r0)
            r10 = r9
            r13 = r9
            long r4 = com.instagram.util.creation.RenderBridge.saveAndClearCachedImageFull(r7, r8, r9, r10, r11, r12, r13)
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0177
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failure writing "
            r1.append(r0)
            X.KgB r0 = r3.A02
            r1.append(r0)
            java.lang.String r0 = " image to file"
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.String r1 = "SavePhotoUtil_save_jpeg_error"
            r0 = 0
            X.0kD.A0D(r1, r2, r0)
        L_0x00c7:
            android.graphics.Bitmap r2 = r14.A05
            if (r2 == 0) goto L_0x0176
            java.lang.String r4 = "UltraHDR"
            X.LAM r0 = r14.A02     // Catch:{ IOException -> 0x0108 }
            java.lang.String r5 = r0.A04     // Catch:{ IOException -> 0x0108 }
            java.io.File r0 = X.AnonymousClass7TE.A0t(r5)     // Catch:{ IOException -> 0x0108 }
            java.io.FileOutputStream r3 = X.JTO.A0t(r0)     // Catch:{ IOException -> 0x0108 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0101 }
            int r0 = r14.A01     // Catch:{ all -> 0x0101 }
            X.0fO.A01(r1, r2, r0)     // Catch:{ all -> 0x0101 }
            boolean r0 = r2.compress(r1, r0, r3)     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x00fd
            X.0wj r2 = X.0wj.A01     // Catch:{ all -> 0x0101 }
            r1 = 817901427(0x30c02f73, float:1.3983324E-9)
            java.lang.String r0 = "bitmap_compress_error"
            X.0f9 r1 = r2.AEf(r0, r1)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "path"
            r1.ABQ(r0, r5)     // Catch:{ all -> 0x0101 }
            r1.report()     // Catch:{ all -> 0x0101 }
            r3.close()     // Catch:{ IOException -> 0x0108 }
            goto L_0x0176
        L_0x00fd:
            r3.close()     // Catch:{ IOException -> 0x0108 }
            return r6
        L_0x0101:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ IOException -> 0x0108 }
            throw r0     // Catch:{ IOException -> 0x0108 }
        L_0x0108:
            r2 = move-exception
            java.lang.String r1 = "jpeg_image_local_save_error"
            java.lang.String r0 = ""
            X.0kD.A0D(r1, r0, r2)
            X.0KC.A0C(r4, r1)
            goto L_0x0176
        L_0x0114:
            java.lang.String r0 = "image/heic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0178
            X.0Tu r2 = X.0Tu.A06
            r0 = 36317723764659676(0x8106c7000b15dc, double:3.030812976281806E-306)
            boolean r4 = X.182.A06(r2, r13, r0)
            if (r4 == 0) goto L_0x0138
            int r2 = r14.A00
            int r1 = r14.A04
            int r0 = r14.A03
            android.graphics.Bitmap r12 = X.C64001LId.A00(r2, r1, r0)
        L_0x0133:
            if (r12 == 0) goto L_0x0165
            int r2 = r14.A01
            goto L_0x013b
        L_0x0138:
            android.graphics.Bitmap r12 = r14.A05
            goto L_0x0133
        L_0x013b:
            X.12T r1 = X.AnonymousClass12T.A00     // Catch:{ Exception -> 0x0150 }
            r15 = 0
            r0 = 207111648(0xc5845e0, float:1.6661062E-31)
            X.0nV r0 = X.JTP.A0U(r1, r0)     // Catch:{ Exception -> 0x0150 }
            X.MHO r11 = new X.MHO     // Catch:{ Exception -> 0x0150 }
            r16 = r2
            r11.<init>((android.graphics.Bitmap) r12, (com.instagram.common.session.UserSession) r13, (X.LOX) r14, (X.AnonymousClass4D7) r15, (int) r16)     // Catch:{ Exception -> 0x0150 }
            X.C67351tA.A00(r0, r11)     // Catch:{ Exception -> 0x0150 }
            goto L_0x0166
        L_0x0150:
            r3 = move-exception
            X.0kg r2 = X.0kg.A03
            java.lang.String r0 = r3.getMessage()
            if (r0 != 0) goto L_0x015b
            java.lang.String r0 = "null"
        L_0x015b:
            java.lang.String r1 = "heic_image_upload_error"
            X.0wb.A02(r2, r1, r0, r3)
            java.lang.String r0 = "SavePhotoUtil"
            X.0KC.A0F(r0, r1, r3)
        L_0x0165:
            r6 = 0
        L_0x0166:
            if (r4 == 0) goto L_0x0177
            if (r12 == 0) goto L_0x0177
            r12.recycle()
            return r6
        L_0x016e:
            r2 = move-exception
            java.lang.String r1 = "webp_image_local_save_error"
            java.lang.String r0 = "saveWebpToFile failed"
            X.0kD.A0D(r1, r0, r2)
        L_0x0176:
            r6 = 0
        L_0x0177:
            return r6
        L_0x0178:
            java.lang.String r2 = "jpeg_bitmap_compress_error"
            java.lang.String r1 = "No image to save"
            r0 = 0
            X.0kD.A0D(r2, r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LOX.A02(com.instagram.common.session.UserSession):boolean");
    }

    private final void A00(ContentResolver contentResolver, ContentValues contentValues, UserSession userSession, String str) {
        contentValues.put("relative_path", str);
        contentValues.put("is_pending", 1);
        try {
            Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (insert != null) {
                A02(userSession);
                contentValues.clear();
                contentValues.put("is_pending", C51967G9n.A0k());
                contentResolver.update(insert, contentValues, (String) null, (String[]) null);
                return;
            }
            0kD.A0D("SavePhotoUtil_ScopedStorage", "Save photo failed (11+): could not get file URI", (Throwable) null);
        } catch (Exception e) {
            0kD.A0D("SavePhotoUtil_ScopedStorage", "Save photo failed (11+)", e);
        }
    }

    public LOX(Bitmap bitmap, LAM lam, String str, int i, int i2, int i3, int i4) {
        this.A04 = i;
        this.A03 = i2;
        this.A02 = lam;
        this.A01 = i3;
        this.A05 = bitmap;
        this.A00 = i4;
        this.A06 = str;
    }
}
