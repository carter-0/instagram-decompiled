package X;

import android.net.Uri;
import java.util.List;

public final class P20 implements C74319Psv {
    public final AnonymousClass7X6 A00;

    public P20(AnonymousClass7X6 r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final boolean Cmw(Uri uri, N3I n3i) {
        String A19;
        AnonymousClass7TG.A1N(uri, n3i);
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 3 || !AnonymousClass7TE.A19(pathSegments, 1).equals("live") || (A19 = AnonymousClass7TE.A19(pathSegments, 2)) == null) {
            return false;
        }
        this.A00.Cps(n3i.A05, A19);
        return true;
    }
}
