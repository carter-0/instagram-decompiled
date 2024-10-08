package X;

import android.content.Context;
import android.net.Uri;

public abstract class SQU {
    public static final 0bY A00 = DbW.A0G();

    public static Uri A00(Context context, Uri uri) {
        if (!AnonymousClass3HA.A00(context) || uri.getQueryParameter("theme") != null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("theme", "dark");
        return buildUpon.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r6 = X.C61120lW.A04(r6)
            java.lang.String r5 = "#"
            r2 = 2
            java.lang.String[] r1 = r7.split(r5, r2)
            r0 = 0
            r0 = r1[r0]
            java.lang.StringBuilder r4 = X.Pxe.A16(r0)
            int r0 = r1.length
            if (r0 != r2) goto L_0x002d
            r0 = 1
            r3 = r1[r0]
        L_0x0018:
            java.lang.String r0 = "?"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "?android=1"
        L_0x0022:
            r4.append(r0)
            java.lang.String r1 = "&instagram_android_version="
            if (r6 == 0) goto L_0x0037
            goto L_0x002f
        L_0x002a:
            java.lang.String r0 = "&android=1"
            goto L_0x0022
        L_0x002d:
            r3 = 0
            goto L_0x0018
        L_0x002f:
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r6, r0)     // Catch:{ Exception -> 0x0037 }
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            X.C66580MXl.A1V(r1, r0, r4)
            java.lang.String r2 = "&android_version="
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x0049 }
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            X.C66580MXl.A1V(r2, r0, r4)
            java.lang.String r2 = "&android_sdk="
            java.lang.String r1 = android.os.Build.VERSION.SDK
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x005b }
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            X.C66580MXl.A1V(r2, r0, r4)
            java.lang.String r2 = "&android_device_model="
            java.lang.String r1 = android.os.Build.MODEL
            if (r1 == 0) goto L_0x006d
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x006d }
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            X.C66580MXl.A1V(r2, r0, r4)
            java.lang.String r2 = "&android_device_manuf="
            java.lang.String r1 = android.os.Build.MANUFACTURER
            if (r1 == 0) goto L_0x007f
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x007f }
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            X.C66580MXl.A1V(r2, r0, r4)
            java.lang.String r2 = "&android_device_brand="
            java.lang.String r1 = android.os.Build.BRAND
            if (r1 == 0) goto L_0x0091
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0092
        L_0x0091:
            r0 = 0
        L_0x0092:
            X.C66580MXl.A1V(r2, r0, r4)
            java.lang.String r2 = "&android_device_name="
            java.lang.String r1 = android.os.Build.DEVICE
            if (r1 == 0) goto L_0x00a3
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00a4
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            X.C66580MXl.A1V(r2, r0, r4)
            if (r3 == 0) goto L_0x00af
            r4.append(r5)
            r4.append(r3)
        L_0x00af:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQU.A01(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String A02(Context context, String str) {
        Uri A01;
        if (!AnonymousClass3HA.A00(context) || (A01 = 0cp.A01(A00, str)) == null) {
            return str;
        }
        return A00(context, A01).toString();
    }
}
