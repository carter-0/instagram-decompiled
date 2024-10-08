package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.4WY  reason: invalid class name */
public abstract class AnonymousClass4WY {
    public static File A00;
    public static final AnonymousClass0eM A01 = AnonymousClass0eN.A01(AnonymousClass4WZ.A00);

    public static final File A01(Context context, UserSession userSession, String str) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 2);
        File A002 = A00(context);
        if (A002 == null || (182.A06(0Tu.A05, userSession, 36317728058971614L) && !A04(str))) {
            return null;
        }
        String canonicalPath = A002.getCanonicalPath();
        String hexString = Integer.toHexString(str.hashCode());
        0qQ.A07(hexString);
        return new File(canonicalPath, hexString);
    }

    public static final String A02(UserSession userSession, 1Xj r2) {
        0qQ.A0B(userSession, 1);
        if (r2.CYg()) {
            return r2.A0C.getOrganicTrackingToken();
        }
        if (C231122qu.A0F(userSession, r2) != null) {
            return C231122qu.A0F(userSession, r2);
        }
        return r2.getId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.content.Context r4, android.graphics.Bitmap r5, java.lang.String r6) {
        /*
            r0 = 2
            X.0qQ.A0B(r4, r0)
            java.io.File r0 = A00(r4)
            if (r0 == 0) goto L_0x009f
            java.lang.String r1 = r0.getCanonicalPath()
            int r0 = r6.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            X.0qQ.A07(r0)
            java.io.File r3 = new java.io.File
            r3.<init>(r1, r0)
            java.io.File r1 = A00(r4)
            if (r1 == 0) goto L_0x009f
            X.0eM r4 = A01
            java.lang.Object r0 = r4.getValue()
            X.0qQ.A07(r0)
            java.util.Set r0 = (java.util.Set) r0
            int r0 = r0.size()
            r2 = 25
            if (r0 <= r2) goto L_0x006f
            java.io.File[] r1 = r1.listFiles()
            if (r1 == 0) goto L_0x006f
            int r0 = r1.length
            if (r0 <= r2) goto L_0x006f
            X.ArM r0 = new X.ArM
            r0.<init>()
            java.util.List r1 = X.03t.A0A(r0, r1)
            r0 = 12
            java.util.ListIterator r2 = r1.listIterator(r0)
        L_0x004f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r2.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            java.lang.Object r1 = r4.getValue()
            X.0qQ.A07(r1)
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
            goto L_0x004f
        L_0x006f:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0097 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0097 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0090 }
            X.JZK.A00(r0, r5, r2)     // Catch:{ all -> 0x0090 }
            java.lang.Object r1 = r4.getValue()     // Catch:{ all -> 0x0090 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0090 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = r3.getName()     // Catch:{ all -> 0x0090 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0090 }
            r1.add(r0)     // Catch:{ all -> 0x0090 }
            r2.close()     // Catch:{ IOException -> 0x0097 }
            return
        L_0x0090:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException -> 0x0097 }
            throw r0     // Catch:{ IOException -> 0x0097 }
        L_0x0097:
            r2 = move-exception
            java.lang.String r1 = "VideoCoverFrameCache"
            java.lang.String r0 = "Failed to save video cover frame to disk"
            X.0KC.A0H(r1, r0, r2)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4WY.A03(android.content.Context, android.graphics.Bitmap, java.lang.String):void");
    }

    public static final File A00(Context context) {
        File file = A00;
        if (file == null) {
            file = 1M1.A00(context, "coverframe", false);
            if (file == null) {
                return null;
            }
            if (!file.exists()) {
                file.mkdirs();
            } else {
                String[] list = file.list();
                if (list != null) {
                    Object value = A01.getValue();
                    0qQ.A07(value);
                    018.A18((Collection) value, list);
                }
            }
            A00 = file;
        }
        return file;
    }

    public static final boolean A04(String str) {
        Object value = A01.getValue();
        0qQ.A07(value);
        String hexString = Integer.toHexString(str.hashCode());
        0qQ.A07(hexString);
        return ((Set) value).contains(hexString);
    }
}
