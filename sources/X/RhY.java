package X;

import java.net.HttpCookie;

public abstract class RhY {
    public static final String A00(HttpCookie httpCookie) {
        StringBuilder A0l = C51975G9x.A0l(httpCookie);
        A0l.append(002.A0T(httpCookie.getName(), httpCookie.getValue(), '='));
        if (httpCookie.getMaxAge() >= 0) {
            A0l.append(002.A0Q("; Max-Age=", httpCookie.getMaxAge()));
        }
        String domain = httpCookie.getDomain();
        if (domain != null) {
            C66580MXl.A1V("; Domain=", domain, A0l);
        }
        String path = httpCookie.getPath();
        if (path != null) {
            C66580MXl.A1V("; Path=", path, A0l);
        }
        if (httpCookie.getSecure()) {
            A0l.append("; Secure");
        }
        if (httpCookie.isHttpOnly()) {
            A0l.append("; HttpOnly");
        }
        return DbT.A10(A0l);
    }
}
