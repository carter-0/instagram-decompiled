package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.util.HashMap;

public abstract class OWX {
    public final Integer A00;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.OWX A00(android.net.Uri r5) {
        /*
            java.lang.String r0 = "s"
            java.lang.String r0 = r5.getQueryParameter(r0)
            if (r0 == 0) goto L_0x0025
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x001d }
            if (r2 <= 0) goto L_0x0025
            r1 = 3
            java.lang.Integer[] r0 = X.AnonymousClass05K.A00(r1)     // Catch:{ NumberFormatException -> 0x001d }
            int r0 = r0.length     // Catch:{ NumberFormatException -> 0x001d }
            if (r2 >= r0) goto L_0x0025
            java.lang.Integer[] r0 = X.AnonymousClass05K.A00(r1)     // Catch:{ NumberFormatException -> 0x001d }
            r5 = r0[r2]     // Catch:{ NumberFormatException -> 0x001d }
            goto L_0x005d
        L_0x001d:
            r2 = move-exception
            java.lang.String r1 = "SecureFileProviderScope"
            java.lang.String r0 = "Invalid scope for direct file access"
            X.0KC.A0F(r1, r0, r2)
        L_0x0025:
            java.util.List r2 = r5.getPathSegments()
            int r1 = r2.size()
            r0 = 2
            if (r1 < r0) goto L_0x005b
            int r0 = X.DbT.A02(r2, r0)
            java.lang.Object r4 = r2.get(r0)
            r0 = 3
            java.lang.Integer[] r3 = X.AnonymousClass05K.A00(r0)
            int r2 = r3.length
            r1 = 0
        L_0x003f:
            if (r1 >= r2) goto L_0x005b
            r5 = r3[r1]
            int r0 = r5.intValue()
            switch(r0) {
                case 1: goto L_0x0055;
                case 2: goto L_0x0058;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.String r0 = "any_app"
        L_0x004c:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x005d
            int r1 = r1 + 1
            goto L_0x003f
        L_0x0055:
            java.lang.String r0 = "third_party"
            goto L_0x004c
        L_0x0058:
            java.lang.String r0 = "family"
            goto L_0x004c
        L_0x005b:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
        L_0x005d:
            int r1 = r5.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0076
            r0 = 1
            if (r1 == r0) goto L_0x0070
            r0 = 2
            if (r1 != r0) goto L_0x0076
            X.NEJ r0 = new X.NEJ
            r0.<init>()
            return r0
        L_0x0070:
            X.NEK r0 = new X.NEK
            r0.<init>()
            return r0
        L_0x0076:
            X.NEI r0 = new X.NEI
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWX.A00(android.net.Uri):X.OWX");
    }

    public final Boolean A04(Context context) {
        if (this instanceof NEK) {
            0cS r1 = new 0cS();
            r1.A01 = 0cQ.A00();
            return DbT.A0l(r1.A00().A03(context, (Intent) null, (0bY) null));
        } else if (!(this instanceof NEJ)) {
            return AnonymousClass7TE.A0v();
        } else {
            0cS r12 = new 0cS();
            r12.A01 = 0cQ.A00();
            return Boolean.valueOf(r12.A00().A03(context, (Intent) null, (0bY) null));
        }
    }

    public OWX(Integer num) {
        this.A00 = num;
    }

    public final Uri A01(Context context, File file) {
        return DbV.A08(C66582MXn.A0J(context).A04(file).buildUpon(), "s", String.valueOf(this.A00.intValue()));
    }

    public final File A02(Context context, Uri uri) {
        return C66582MXn.A0J(context).A05(uri, AnonymousClass7TE.A0v());
    }

    public final File A03(Context context, String str, String str2) {
        String str3;
        C70806OMb A02 = MY3.A02(C66582MXn.A0J(context), MY4.CACHE_PATH);
        switch (this.A00.intValue()) {
            case 0:
                str3 = "any_app";
                break;
            case 1:
                str3 = "third_party";
                break;
            default:
                str3 = "family";
                break;
        }
        String A0R = 002.A0R("__SFP_SCOPE__/", str3);
        if (A0R != null && !A0R.isEmpty()) {
            HashMap hashMap = A02.A02;
            if (hashMap.containsKey(A0R)) {
                A02 = (C70806OMb) hashMap.get(A0R);
            } else {
                A02 = new C70806OMb(A02.A00, JTO.A0s(A02.A01, A0R));
                hashMap.put(A0R, A02);
            }
        }
        if (str2 != null && !str2.startsWith(".")) {
            str2 = 002.A0R(".", str2);
        }
        return File.createTempFile(str, str2, A02.A00());
    }
}
