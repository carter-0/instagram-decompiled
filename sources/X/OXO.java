package X;

import android.net.Uri;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;

public abstract class OXO {
    public static final boolean A02(Uri uri) {
        String host = uri.getHost();
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2) {
            return false;
        }
        String A19 = AnonymousClass7TE.A19(pathSegments, 1);
        if (!"ig.me".equalsIgnoreCase(host) && !1Q6.A00(host)) {
            return false;
        }
        String str = pathSegments.get(0);
        0qQ.A07(str);
        String str2 = str;
        if ((!"j".equalsIgnoreCase(str2) && !"channel".equalsIgnoreCase(str2)) || A19 == null || A19.length() == 0) {
            return false;
        }
        return true;
    }

    public static final String A00(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (!A02(uri)) {
            return null;
        }
        return AnonymousClass7TE.A19(pathSegments, 1);
    }

    public static final String A01(String str, List list) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            buildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        return DbT.A10(buildUpon.build());
    }
}
