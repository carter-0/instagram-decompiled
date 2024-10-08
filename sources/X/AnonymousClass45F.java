package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: X.45F  reason: invalid class name */
public abstract class AnonymousClass45F {
    public static File A00;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(android.graphics.Bitmap r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.io.File r3 = A00()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002b }
            r0.<init>(r3)     // Catch:{ Exception -> 0x002b }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x002b }
            r2.<init>(r0)     // Catch:{ Exception -> 0x002b }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0024 }
            r0 = 100
            X.0fO.A02(r1, r4, r2, r0)     // Catch:{ all -> 0x0024 }
            r2.close()     // Catch:{ Exception -> 0x002b }
            java.lang.String r0 = r3.getCanonicalPath()
            X.0qQ.A07(r0)
            return r0
        L_0x0024:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ Exception -> 0x002b }
            throw r0     // Catch:{ Exception -> 0x002b }
        L_0x002b:
            r2 = move-exception
            java.lang.String r1 = "PhotoStorageUtil"
            java.lang.String r0 = "Failed while trying to save bitmap decor image"
            X.0wb.A06(r1, r0, r2)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass45F.A02(android.graphics.Bitmap):java.lang.String");
    }

    public static final String A03(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        Rect bounds = drawable.getBounds();
        0qQ.A07(bounds);
        Bitmap createBitmap = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.translate(-((float) bounds.left), -((float) bounds.top));
        drawable.draw(canvas);
        canvas.restore();
        return A02(createBitmap);
    }

    public static final File A00() {
        String A04 = A04("quick_cam_decor", ".png");
        File file = new File(A01(), A04);
        try {
            file.createNewFile();
            return file;
        } catch (IOException unused) {
            return new File(2RR.A01(), A04);
        }
    }

    public static final File A01() {
        File file = A00;
        if (file != null) {
            return file;
        }
        File AXT = AnonymousClass1F2.A00().AXT((1LJ) null, 653514818);
        A00 = AXT;
        return AXT;
    }

    public static final String A04(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        sb.append(UUID.randomUUID());
        sb.append(str2);
        return sb.toString();
    }
}
