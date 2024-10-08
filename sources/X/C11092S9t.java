package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.S9t  reason: case insensitive filesystem */
public abstract class C11092S9t {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if ("RECOVER_PIN".equalsIgnoreCase(X.SQ8.A01(r6, 1)) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        if ("PIN".equalsIgnoreCase(X.DbU.A0l(r6, "AUTH_METHOD_TYPE")) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        if ("FB_ACCESS_TOKEN".equalsIgnoreCase(X.DbU.A0l(r6, "AUTH_METHOD_TYPE")) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b6, code lost:
        throw X.AnonymousClass7TE.A0w("Not supported operation");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.os.Bundle r6) {
        /*
            if (r6 == 0) goto L_0x0011
            java.lang.String r0 = "AUTH_METHOD_TYPE"
            java.lang.String r1 = X.DbU.A0l(r6, r0)
            java.lang.String r0 = "PIN"
            boolean r1 = r0.equalsIgnoreCase(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.lang.String r5 = "VERIFY_FACTOR"
            if (r0 != 0) goto L_0x0026
            if (r6 == 0) goto L_0x007a
            java.lang.String r0 = "AUTH_METHOD_TYPE"
            java.lang.String r1 = X.DbU.A0l(r6, r0)
            java.lang.String r0 = "BIO_OR_PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x007a
        L_0x0026:
            r0 = 2
            java.lang.String r0 = X.SQ8.A01(r6, r0)
            r4 = 1
            java.lang.String r3 = X.SQ8.A01(r6, r4)
            java.lang.String r1 = "CONFIRM_PIN"
            boolean r0 = r1.equalsIgnoreCase(r0)
            java.lang.String r2 = "RESET_FBPAY_PIN"
            if (r0 != 0) goto L_0x0059
            boolean r0 = r1.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x0059
            java.lang.String r1 = X.SQ8.A01(r6, r4)
            java.lang.String r0 = "VERIFY_PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x00af
            java.lang.String r1 = X.SQ8.A01(r6, r4)
            java.lang.String r0 = "RECOVER_PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00b0
        L_0x0058:
            return r2
        L_0x0059:
            java.lang.String r1 = X.SQ8.A00(r6, r4)
            java.lang.String r0 = "CHANGE_PIN_USING_OLD_PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0077
            if (r6 == 0) goto L_0x0058
            java.lang.String r0 = "AUTH_FLOW_UTIL_PIN_LOCKED"
            boolean r0 = r6.getBoolean(r0)
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "AUTH_FLOW_UTIL_PIN_FORGOT"
            boolean r0 = r6.getBoolean(r0)
            if (r0 == 0) goto L_0x0058
        L_0x0077:
            java.lang.String r2 = "CREATE_FBPAY_PIN"
            return r2
        L_0x007a:
            r6.getClass()
            java.lang.String r2 = "AUTH_METHOD_TYPE"
            java.lang.String r1 = X.DbU.A0l(r6, r2)
            java.lang.String r0 = "CSC"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x00af
            java.lang.String r1 = X.DbU.A0l(r6, r2)
            java.lang.String r0 = "PAYPAL_ACCESS_TOKEN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x00af
            java.lang.String r1 = X.DbU.A0l(r6, r2)
            java.lang.String r0 = "IG_ACCESS_TOKEN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x00af
            java.lang.String r1 = X.DbU.A0l(r6, r2)
            java.lang.String r0 = "FB_ACCESS_TOKEN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00b0
        L_0x00af:
            return r5
        L_0x00b0:
            java.lang.String r0 = "Not supported operation"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11092S9t.A00(android.os.Bundle):java.lang.String");
    }

    public static List A01(Bundle bundle) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        String[] stringArray = bundle.getStringArray("PTT_UTIL_CAP_NAMES");
        if (stringArray != null) {
            Collections.addAll(A1C, stringArray);
        }
        return Collections.unmodifiableList(A1C);
    }
}
