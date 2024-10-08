package X;

import java.net.URI;
import java.net.URISyntaxException;

public abstract class RUE {
    public static final String A00(String str) {
        0qQ.A0B(str, 0);
        try {
            String host = new URI(str).getHost();
            if (host == null) {
                return str;
            }
            if (C66580MXl.A1a("www.", 1, host)) {
                return C66580MXl.A0z(host, 4);
            }
            return host;
        } catch (URISyntaxException unused) {
            return str;
        }
    }
}
