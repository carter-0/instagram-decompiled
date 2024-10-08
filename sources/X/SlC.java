package X;

import android.webkit.CookieManager;

public final class SlC implements C13814Thh {
    public static CookieManager A00;

    public final void EDE(C10773Rxr rxr) {
        if (A00 == null) {
            0KC.A0E("SystemCookieManager", "cookieManager is null");
        }
        CookieManager cookieManager = A00;
        if (cookieManager != null) {
            cookieManager.removeAllCookies(new C11523Sbk(0));
        }
    }

    public final void ESr(String str, String str2) {
        if (A00 == null) {
            0KC.A0E("SystemCookieManager", "cookieManager is null");
        }
        CookieManager cookieManager = A00;
        if (cookieManager != null) {
            cookieManager.setCookie(str, str2);
        }
    }

    public final void ESs(C10773Rxr rxr, String str, String str2) {
        if (A00 == null) {
            0KC.A0E("SystemCookieManager", "cookieManager is null");
        }
        CookieManager cookieManager = A00;
        if (cookieManager != null) {
            cookieManager.setCookie(str, str2, new C11524Sbl(rxr, 0));
        }
    }

    public final void flush() {
        try {
            if (A00 == null) {
                0KC.A0E("SystemCookieManager", "cookieManager is null");
            }
            CookieManager cookieManager = A00;
            if (cookieManager != null) {
                cookieManager.flush();
            }
        } catch (Exception e) {
            0KC.A0J("SystemCookieManager", "error flushing cookies", e);
        }
    }

    public final void FKd() {
        A00 = CookieManager.getInstance();
    }
}
