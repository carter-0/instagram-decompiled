package X;

import java.net.HttpCookie;
import java.util.List;

public abstract class F7c {
    public static final HttpCookie A00(String str, String str2) {
        if (str.length() <= 0) {
            return null;
        }
        HttpCookie httpCookie = new HttpCookie(str2, str);
        httpCookie.setPath("/");
        httpCookie.setDomain(AnonymousClass000.A00(4294));
        httpCookie.setSecure(true);
        httpCookie.setHttpOnly(true);
        return httpCookie;
    }

    public static final List A01(0lg r6) {
        1NJ A00 = AnonymousClass1NG.A00(r6);
        HttpCookie[] httpCookieArr = {A00(A00.A00(), "ig-u-ig-direct-region-hint"), A00(A00.A03(), "ig-u-shbid"), A00(A00.A04(), "ig-u-shbts"), A00(A00.A01(), "ig-u-ds-user-id"), A00(A00.A02(), "ig-u-rur")};
        0qQ.A0B(httpCookieArr, 0);
        return 03t.A0I(httpCookieArr);
    }
}
