package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.realtimeclient.RealtimeSubscription;

public abstract class FH3 {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.0SC, java.lang.Object] */
    public static final Intent A00(Context context, Bundle bundle, String str, String str2) {
        0qQ.A0B(context, 0);
        Intent className = DbS.A09().setClassName(context, str);
        0qQ.A07(className);
        if (bundle != null) {
            className.putExtras(bundle);
        }
        return className.putExtra("key_uri", str2).putExtra("key_sanitized_uri", new Object().EJq(str2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.os.Bundle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.Intent A01(android.content.Context r10, java.lang.Integer r11, java.lang.String r12, java.lang.String r13, char[] r14, int r15) {
        /*
            r4 = 0
            X.0qQ.A0B(r10, r4)
            int r2 = r15 + 1
            int r5 = r14.length
            r3 = 63
            if (r2 >= r5) goto L_0x0060
            char r1 = r14[r15]
            r0 = 47
            if (r1 != r0) goto L_0x0060
            char r0 = r14[r2]
            if (r0 != r3) goto L_0x0060
            int r2 = r15 + 2
        L_0x0017:
            r1 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3 = r4
            if (r2 < 0) goto L_0x0072
            int r5 = r5 - r2
            java.lang.String r8 = X.DbS.A0u(r14, r2, r5)
            r6 = 0
            r9 = 0
        L_0x0026:
            if (r1 >= r5) goto L_0x0069
            r0 = 61
            int r7 = X.00l.A04(r8, r0, r1)
            if (r7 < 0) goto L_0x0072
            java.lang.String r2 = r8.substring(r1, r7)
            X.0qQ.A07(r2)
            r0 = 38
            int r1 = X.00l.A04(r8, r0, r7)
            int r0 = r7 + 1
            if (r1 <= 0) goto L_0x0054
            java.lang.String r0 = r8.substring(r0, r1)
            X.0qQ.A07(r0)
            int r1 = r1 + 1
        L_0x004a:
            android.os.Bundle r0 = A06(r2, r0, r6)
            if (r0 == 0) goto L_0x0052
            r6 = r0
            goto L_0x0026
        L_0x0052:
            r9 = 1
            goto L_0x0026
        L_0x0054:
            java.lang.String r0 = r8.substring(r0)
            X.0qQ.A07(r0)
            int r1 = r8.length()
            goto L_0x004a
        L_0x0060:
            if (r15 >= r5) goto L_0x0067
            char r0 = r14[r15]
            if (r0 != r3) goto L_0x0067
            goto L_0x0017
        L_0x0067:
            r2 = -1
            goto L_0x0017
        L_0x0069:
            if (r9 == 0) goto L_0x007a
            int r1 = r11.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x007a
        L_0x0072:
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x007c
            r0 = 0
            return r0
        L_0x007a:
            r4 = r6
            goto L_0x0072
        L_0x007c:
            android.content.Intent r0 = A02(r10, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH3.A01(android.content.Context, java.lang.Integer, java.lang.String, java.lang.String, char[], int):android.content.Intent");
    }

    public static final Intent A02(Context context, String str, String str2) {
        return A00(context, (Bundle) null, str, str2);
    }

    public static final Boolean A07(String str) {
        if (str == null) {
            return null;
        }
        boolean z = true;
        if (!str.equalsIgnoreCase("true") && !str.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
            if (!str.equalsIgnoreCase("false") && !str.equals("0")) {
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final void A08(Bundle bundle, String str, char[] cArr, int i, int i2) {
        bundle.putString(str, DbS.A0u(cArr, i, i2 - i));
    }

    public static final boolean A09(String str, char[] cArr, int i) {
        int length = cArr.length;
        int length2 = str.length();
        if (length > i) {
            int i2 = 0;
            while (i < length && i2 < length2) {
                if (cArr[i] == str.charAt(i2)) {
                    i++;
                    i2++;
                }
            }
            if (length2 <= i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final int[] A0A(Bundle bundle, String str, char[] cArr, int i) {
        int length = cArr.length;
        int i2 = i;
        while (true) {
            if (length <= i2) {
                break;
            }
            char c = cArr[i2];
            if (c != '/' && c != '?') {
                i2++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        bundle.putString(str, DbS.A0u(cArr, i, i2 - i));
        return new int[]{i2, 3};
    }

    public static final Intent A03(Context context, String str, String str2, char[] cArr, int i) {
        return A01(context, AnonymousClass05K.A0C, str, str2, cArr, i);
    }

    public static final Intent A04(Context context, String str, String str2, char[] cArr, int i) {
        return A01(context, AnonymousClass05K.A01, str, str2, cArr, i);
    }

    public static final Intent A05(Context context, String str, String str2, char[] cArr, int i) {
        return A01(context, AnonymousClass05K.A00, str, str2, cArr, i);
    }

    public static final Bundle A06(String str, String str2, Bundle bundle) {
        String str3;
        switch (str.hashCode()) {
            case -1483898950:
                str3 = "__tn__";
                break;
            case -983972142:
                str3 = "pn_ref";
                break;
            case 2931858:
                if (!str.equals("_ft_")) {
                    return null;
                }
                break;
            case 3151469:
                str3 = "fref";
                break;
            default:
                return null;
        }
        if (!str.equals(str3)) {
            return null;
        }
        if (bundle == null) {
            bundle = DbV.A09();
        }
        bundle.putString(str, str2);
        return bundle;
    }
}
