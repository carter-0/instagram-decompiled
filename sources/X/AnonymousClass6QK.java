package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.6QK  reason: invalid class name */
public abstract class AnonymousClass6QK {
    public static 0sP A00 = AnonymousClass6QL.A00;

    public static final C226662he A01(String str) {
        Uri uri;
        if (str != null) {
            uri = (Uri) A00.invoke(str);
        } else {
            uri = null;
        }
        return A00(uri, (Map) null);
    }

    public static final C226662he A00(Uri uri, Map map) {
        if (uri == null) {
            return AnonymousClass6QU.A00;
        }
        0Ym r1 = new 0Ym();
        if (map != null) {
            r1.putAll(map);
        }
        r1.put("uri_source", uri);
        return new AnonymousClass2iB(uri, 0se.A0N(r1));
    }
}
