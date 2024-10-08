package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

public final class QL3 extends C12050Sld {
    public static final ArrayList A00 = Pxf.A0q(new String[]{"com.android.vending", "com.google.android.gms", "com.google.market"});
    public static final 0TC A01 = new Object();

    public static boolean A00(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        for (String equals : str.replace(" ", "").split(",")) {
            if (equals.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r5 = 1
            if (r10 != 0) goto L_0x004a
            java.lang.String r0 = "https://play.google.com/store/apps/details?id="
            boolean r0 = r6.startsWith(r0)
            r4 = 0
            if (r0 == 0) goto L_0x0049
            X.0TC r2 = A01
            android.net.Uri r3 = X.0cp.A00(r2, r6)
            if (r3 == 0) goto L_0x0049
            java.lang.String r1 = "https://play.google.com/store/apps/details?"
            java.lang.String r0 = "referrer"
            java.lang.String r0 = r3.getQueryParameter(r0)
            java.lang.String r0 = X.002.A0R(r1, r0)
            android.net.Uri r2 = X.0cp.A00(r2, r0)
            if (r2 == 0) goto L_0x0049
            java.lang.String r0 = "ads_account"
            java.lang.String r1 = r2.getQueryParameter(r0)
            java.lang.String r0 = "ads_set"
            java.lang.String r0 = r2.getQueryParameter(r0)
            boolean r0 = A00(r7, r0)
            if (r0 != 0) goto L_0x004a
            boolean r0 = A00(r8, r1)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.getQueryParameter(r0)
            boolean r4 = X.2Ob.A00(r0, r9)
        L_0x0049:
            return r4
        L_0x004a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL3.A01(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):boolean");
    }

    public final Bundle ALa(String str, String str2, boolean z) {
        Bundle A0J = Pxh.A0J(str, str2, z);
        A0J.putStringArrayList("package_names", A00);
        return A0J;
    }

    public final boolean FIC(Context context, Bundle bundle) {
        String string = bundle.getString("package_name");
        if (string == null) {
            return false;
        }
        return C12050Sld.A02(context, DbV.A08(Pxe.A0I().scheme("market").authority("details"), PublicKeyCredentialControllerUtility.JSON_KEY_ID, string), bundle);
    }

    public final boolean FID(Context context, Bundle bundle) {
        String string = bundle.getString("url");
        if (string == null || !string.startsWith("https://play.google.com/store/apps/details?id=")) {
            return false;
        }
        return C12050Sld.A02(context, 0cp.A03(string), bundle);
    }
}
