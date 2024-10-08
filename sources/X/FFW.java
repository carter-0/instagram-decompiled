package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public final class FFW {
    public static final boolean A01(AnonymousClass0wW r4, boolean z, boolean z2) {
        0qQ.A0B(r4, 0);
        if (!(r4 instanceof UserSession)) {
            return false;
        }
        if ((!z || !182.A06(0Tu.A05, r4, 36318621413022024L)) && (!z2 || !182.A06(0Tu.A05, r4, 36329466204799115L))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(java.lang.String r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.0bY r0 = com.instagram.url.UrlHandlerActivity.A05
            r4 = 1
            android.net.Uri r0 = X.0cp.A01(r0, r5)
            if (r0 == 0) goto L_0x004d
            java.lang.String r1 = r0.getPath()
            if (r1 == 0) goto L_0x004d
            java.lang.String r0 = "/share/"
            boolean r0 = X.00p.A0k(r1, r0, r3)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "/"
            java.util.List r2 = X.DbW.A0o(r1, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x004a
            int r0 = r2.size()
            java.util.ListIterator r1 = r2.listIterator(r0)
        L_0x002f:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x004a
            int r0 = X.DbX.A06(r1)
            if (r0 == 0) goto L_0x002f
            java.util.List r1 = X.DbX.A0y(r2, r1)
        L_0x003f:
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r0 = r1.toArray(r0)
            int r1 = r0.length
            r0 = 3
            if (r1 <= r0) goto L_0x004d
            return r4
        L_0x004a:
            X.0sn r1 = X.0sn.A00
            goto L_0x003f
        L_0x004d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FFW.A02(java.lang.String):boolean");
    }

    public static final String A00(String str) {
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        ArrayList A1D = AnonymousClass7TE.A1D(DbT.A09(DbT.A12(locale, str)).getQueryParameterNames());
        for (Object contains : C49851F9q.A01) {
            if (A1D.contains(contains)) {
                return DbT.A10(DbW.A07(str).clearQuery().build());
            }
        }
        if (!DbU.A1a(str, "invites/contact")) {
            return str;
        }
        Uri A09 = DbT.A09(str);
        ArrayList A1D2 = AnonymousClass7TE.A1D(A09.getQueryParameterNames());
        if (!A1D2.contains("utm_content")) {
            return str;
        }
        Uri.Builder clearQuery = DbW.A07(str).clearQuery();
        Iterator it = A1D2.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            if (!0qQ.A0K(A18, "utm_content")) {
                clearQuery.appendQueryParameter(A18, A09.getQueryParameter(A18));
            }
        }
        return DbT.A10(clearQuery.build());
    }
}
