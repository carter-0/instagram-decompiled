package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.SiI  reason: case insensitive filesystem */
public abstract class C11885SiI implements C13812Thf {
    public Object A00;
    public final ContentResolver A01;
    public final Uri A02;

    public final void cancel() {
    }

    public final Integer AvP() {
        return AnonymousClass05K.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A[Catch:{ FileNotFoundException -> 0x0074 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CgB(X.RE3 r6, X.C13692TfA r7) {
        /*
            r5 = this;
            android.net.Uri r2 = r5.A02     // Catch:{ FileNotFoundException -> 0x0074 }
            android.content.ContentResolver r4 = r5.A01     // Catch:{ FileNotFoundException -> 0x0074 }
            boolean r0 = r5 instanceof X.QH0     // Catch:{ FileNotFoundException -> 0x0074 }
            if (r0 == 0) goto L_0x003d
            r3 = r2
            android.content.UriMatcher r0 = X.QH0.A00     // Catch:{ FileNotFoundException -> 0x0074 }
            int r1 = r0.match(r2)     // Catch:{ FileNotFoundException -> 0x0074 }
            r0 = 1
            if (r1 == r0) goto L_0x001d
            r0 = 3
            if (r1 == r0) goto L_0x002b
            r0 = 5
            if (r1 == r0) goto L_0x001d
            java.io.InputStream r0 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x0074 }
            goto L_0x0030
        L_0x001d:
            android.net.Uri r3 = android.provider.ContactsContract.Contacts.lookupContact(r4, r2)     // Catch:{ FileNotFoundException -> 0x0074 }
            if (r3 != 0) goto L_0x002b
            java.lang.String r1 = "Contact cannot be found"
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0074 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0074 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0074 }
        L_0x002b:
            r0 = 1
            java.io.InputStream r0 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r3, r0)     // Catch:{ FileNotFoundException -> 0x0074 }
        L_0x0030:
            if (r0 != 0) goto L_0x004e
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ FileNotFoundException -> 0x0074 }
            java.lang.String r0 = "InputStream is null for "
            java.io.FileNotFoundException r0 = X.Pxj.A0b(r2, r0, r1)     // Catch:{ FileNotFoundException -> 0x0074 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0074 }
        L_0x003d:
            boolean r0 = r5 instanceof X.C7508QGz     // Catch:{ FileNotFoundException -> 0x0074 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r0 = r4.openAssetFileDescriptor(r2, r0)     // Catch:{ FileNotFoundException -> 0x0074 }
            if (r0 == 0) goto L_0x0069
            android.os.ParcelFileDescriptor r0 = r0.getParcelFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0074 }
        L_0x004e:
            r5.A00 = r0     // Catch:{ FileNotFoundException -> 0x0074 }
            r7.D7o(r0)     // Catch:{ FileNotFoundException -> 0x0074 }
            goto L_0x0068
        L_0x0054:
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r0 = r4.openAssetFileDescriptor(r2, r0)     // Catch:{ FileNotFoundException -> 0x0074 }
            if (r0 != 0) goto L_0x004e
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ FileNotFoundException -> 0x0074 }
            java.lang.String r0 = "FileDescriptor is null for: "
            java.io.FileNotFoundException r0 = X.Pxj.A0b(r2, r0, r1)     // Catch:{ FileNotFoundException -> 0x0074 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0074 }
        L_0x0068:
            return
        L_0x0069:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ FileNotFoundException -> 0x0074 }
            java.lang.String r0 = "FileDescriptor is null for: "
            java.io.FileNotFoundException r0 = X.Pxj.A0b(r2, r0, r1)     // Catch:{ FileNotFoundException -> 0x0074 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0074 }
        L_0x0074:
            r2 = move-exception
            r1 = 3
            java.lang.String r0 = "LocalUriFetcher"
            android.util.Log.isLoggable(r0, r1)
            r7.DOG(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11885SiI.CgB(X.RE3, X.TfA):void");
    }

    public final void cleanup() {
        Object obj = this.A00;
        if (obj != null) {
            try {
                if (this instanceof QH0) {
                    ((InputStream) obj).close();
                } else if (this instanceof C7508QGz) {
                    ((ParcelFileDescriptor) obj).close();
                } else {
                    ((AssetFileDescriptor) obj).close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public C11885SiI(ContentResolver contentResolver, Uri uri) {
        this.A01 = contentResolver;
        this.A02 = uri;
    }
}
