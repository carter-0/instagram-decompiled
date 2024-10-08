package X;

import android.net.Uri;

/* renamed from: X.Nvj  reason: case insensitive filesystem */
public abstract class C70005Nvj {
    public static final boolean A00(String str) {
        Uri A09 = DbT.A09(str);
        if (!"fb".equalsIgnoreCase(A09.getScheme()) || !"profile".equalsIgnoreCase(A09.getHost())) {
            return false;
        }
        return AnonymousClass7TE.A1b(A09.getPathSegments());
    }
}
