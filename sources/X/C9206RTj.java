package X;

import android.net.Uri;

/* renamed from: X.RTj  reason: case insensitive filesystem */
public abstract class C9206RTj {
    public static boolean A00(Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }
}
