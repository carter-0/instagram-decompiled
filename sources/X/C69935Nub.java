package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.Nub  reason: case insensitive filesystem */
public abstract class C69935Nub {
    public static final boolean A00(String str) {
        Uri A09 = DbT.A09(str);
        if (!"instagram".equals(A09.getScheme()) || !"notifications".equals(A09.getHost())) {
            return false;
        }
        List<String> pathSegments = A09.getPathSegments();
        0qQ.A07(pathSegments);
        return 0qQ.A0K(00k.A0J(pathSegments), "manage") && !A09.getQueryParameterNames().isEmpty();
    }
}
