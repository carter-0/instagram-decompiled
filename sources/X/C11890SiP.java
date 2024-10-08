package X;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.SiP  reason: case insensitive filesystem */
public final class C11890SiP implements C13812Thf {
    public InputStream A00;
    public final Uri A01;
    public final SFT A02;

    public final void cancel() {
    }

    public final Class AvH() {
        return InputStream.class;
    }

    public final Integer AvP() {
        return AnonymousClass05K.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0098 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x009e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CgB(X.RE3 r11, X.C13692TfA r12) {
        /*
            r10 = this;
            X.SFT r7 = r10.A02     // Catch:{ FileNotFoundException -> 0x00a4 }
            android.net.Uri r6 = r10.A01     // Catch:{ FileNotFoundException -> 0x00a4 }
            java.lang.String r5 = "ThumbStreamOpener"
            r1 = 0
            X.Tc3 r0 = r7.A02     // Catch:{ SecurityException -> 0x001d, all -> 0x001b }
            android.database.Cursor r2 = r0.E5i(r6)     // Catch:{ SecurityException -> 0x001d, all -> 0x001b }
            if (r2 == 0) goto L_0x002f
            boolean r0 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x001e }
            if (r0 == 0) goto L_0x002c
            r0 = 0
            java.lang.String r1 = r2.getString(r0)     // Catch:{ SecurityException -> 0x001e }
            goto L_0x002c
        L_0x001b:
            r0 = move-exception
            goto L_0x006c
        L_0x001d:
            r2 = r1
        L_0x001e:
            r0 = 3
            android.util.Log.isLoggable(r5, r0)     // Catch:{ all -> 0x0023 }
            goto L_0x002a
        L_0x0023:
            r0 = move-exception
            if (r2 == 0) goto L_0x006c
            r2.close()     // Catch:{ FileNotFoundException -> 0x00a4 }
            goto L_0x006c
        L_0x002a:
            if (r2 == 0) goto L_0x002f
        L_0x002c:
            r2.close()     // Catch:{ FileNotFoundException -> 0x00a4 }
        L_0x002f:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ FileNotFoundException -> 0x00a4 }
            r4 = 0
            if (r0 != 0) goto L_0x006d
            java.io.File r3 = X.AnonymousClass7TE.A0t(r1)     // Catch:{ FileNotFoundException -> 0x00a4 }
            boolean r0 = r3.exists()     // Catch:{ FileNotFoundException -> 0x00a4 }
            if (r0 == 0) goto L_0x006d
            r8 = 0
            long r1 = r3.length()     // Catch:{ FileNotFoundException -> 0x00a4 }
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006d
            android.net.Uri r3 = android.net.Uri.fromFile(r3)     // Catch:{ FileNotFoundException -> 0x00a4 }
            android.content.ContentResolver r0 = r7.A00     // Catch:{ NullPointerException -> 0x0055 }
            java.io.InputStream r4 = r0.openInputStream(r3)     // Catch:{ NullPointerException -> 0x0055 }
            goto L_0x006d
        L_0x0055:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ FileNotFoundException -> 0x00a4 }
            java.lang.String r0 = "NPE opening uri: "
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x00a4 }
            r1.append(r6)     // Catch:{ FileNotFoundException -> 0x00a4 }
            java.lang.String r0 = " -> "
            java.io.FileNotFoundException r0 = X.Pxj.A0b(r3, r0, r1)     // Catch:{ FileNotFoundException -> 0x00a4 }
            java.lang.Throwable r0 = r0.initCause(r2)     // Catch:{ FileNotFoundException -> 0x00a4 }
        L_0x006c:
            throw r0     // Catch:{ FileNotFoundException -> 0x00a4 }
        L_0x006d:
            r3 = -1
            if (r4 == 0) goto L_0x009e
            r2 = 0
            android.content.ContentResolver r0 = r7.A00     // Catch:{ IOException | NullPointerException -> 0x008d }
            java.io.InputStream r2 = r0.openInputStream(r6)     // Catch:{ IOException | NullPointerException -> 0x008d }
            java.util.List r1 = r7.A04     // Catch:{ IOException | NullPointerException -> 0x008d }
            X.ST0 r0 = r7.A03     // Catch:{ IOException | NullPointerException -> 0x008d }
            int r1 = X.SKE.A00(r0, r2, r1)     // Catch:{ IOException | NullPointerException -> 0x008d }
            if (r2 == 0) goto L_0x0084
            r2.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            if (r1 == r3) goto L_0x009e
            X.RC8 r0 = new X.RC8     // Catch:{ FileNotFoundException -> 0x00a4 }
            r0.<init>(r4, r1)     // Catch:{ FileNotFoundException -> 0x00a4 }
            r4 = r0
            goto L_0x009e
        L_0x008d:
            r0 = 3
            android.util.Log.isLoggable(r5, r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0099
        L_0x0092:
            r0 = move-exception
            if (r2 == 0) goto L_0x0098
            r2.close()     // Catch:{ IOException -> 0x0098 }
        L_0x0098:
            throw r0     // Catch:{ FileNotFoundException -> 0x00a4 }
        L_0x0099:
            if (r2 == 0) goto L_0x009e
            r2.close()     // Catch:{ IOException -> 0x009e }
        L_0x009e:
            r10.A00 = r4     // Catch:{ FileNotFoundException -> 0x00a4 }
            r12.D7o(r4)     // Catch:{ FileNotFoundException -> 0x00a4 }
            return
        L_0x00a4:
            r2 = move-exception
            r1 = 3
            java.lang.String r0 = "MediaStoreThumbFetcher"
            android.util.Log.isLoggable(r0, r1)
            r12.DOG(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11890SiP.CgB(X.RE3, X.TfA):void");
    }

    public final void cleanup() {
        InputStream inputStream = this.A00;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public C11890SiP(Uri uri, SFT sft) {
        this.A01 = uri;
        this.A02 = sft;
    }

    public static C11890SiP A00(Context context, Uri uri, C13531Tc3 tc3) {
        return new C11890SiP(uri, new SFT(context.getContentResolver(), tc3, SUv.A00(context).A02, ((C11044S7e) SUv.A00(context).A00.A05.get()).A01()));
    }
}
