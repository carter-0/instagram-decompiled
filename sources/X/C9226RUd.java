package X;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

/* renamed from: X.RUd  reason: case insensitive filesystem */
public abstract class C9226RUd {
    public static void A00(Context context, String str) {
        CookieSyncManager createInstance = CookieSyncManager.createInstance(context);
        SlD A00 = RUF.A00();
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie != null) {
            String[] split = cookie.split(";");
            for (String split2 : split) {
                A00.ESr(str, 002.A0R(Pxe.A13(split2.split("="), 0), "=; Expires=Wed, 31 Dec 2095 23:59:59 GMT"));
            }
            createInstance.sync();
        }
    }
}
