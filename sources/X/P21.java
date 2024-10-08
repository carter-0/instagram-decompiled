package X;

import android.graphics.RectF;
import android.net.Uri;
import java.util.List;

public final class P21 implements C74319Psv {
    public final AnonymousClass7VL A00;
    public final C332997Xg A01;

    public final boolean Cmw(Uri uri, N3I n3i) {
        boolean A1U = AnonymousClass7TF.A1U(0, uri, n3i);
        List<String> pathSegments = uri.getPathSegments();
        RectF rectF = n3i.A01;
        if (rectF == null || pathSegments.size() < 2 || !"ar".equalsIgnoreCase(AnonymousClass7TE.A19(pathSegments, 0))) {
            return false;
        }
        if ("reels".equalsIgnoreCase(AnonymousClass7TE.A19(pathSegments, A1U ? 1 : 0))) {
            this.A00.A00(DbT.A10(uri), "link_preview", n3i.A09, (String) null);
            return A1U;
        }
        C332997Xg r2 = this.A01;
        String str = pathSegments.get(A1U);
        0qQ.A07(str);
        r2.CpE(rectF, n3i.A05, str);
        return A1U;
    }

    public P21(AnonymousClass7VL r1, C332997Xg r2) {
        AnonymousClass7TG.A1O(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
