package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.F9l  reason: case insensitive filesystem */
public abstract class C49846F9l {
    public static final List A00 = AnonymousClass7TE.A1I("smsrecovery");

    public static final boolean A00(Uri uri) {
        String host = uri.getHost();
        if ("instagram.com".equalsIgnoreCase(host) || "www.instagram.com".equalsIgnoreCase(host) || "help.instagram.com".equalsIgnoreCase(host) || "about.instagram.com".equalsIgnoreCase(host) || "m.instagram.com".equalsIgnoreCase(host) || "applink.instagram.com".equalsIgnoreCase(host)) {
            return true;
        }
        return false;
    }
}
