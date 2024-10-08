package X;

import android.net.Uri;
import java.net.URI;

/* renamed from: X.7T0  reason: invalid class name */
public final class AnonymousClass7T0 implements AnonymousClass7T1 {
    public final boolean CmU(String str) {
        return 00l.A0d(str, "giphy.com/", false);
    }

    public final String EJr(String str) {
        URI uri = new URI(str);
        Uri A03 = 0cp.A03(new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), (String) null, uri.getFragment()).toString());
        0qQ.A07(A03);
        String path = A03.getPath();
        if (path == null) {
            return "";
        }
        return path;
    }
}
