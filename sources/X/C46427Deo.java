package X;

import android.net.Uri;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Deo  reason: case insensitive filesystem */
public abstract class C46427Deo {
    public static final boolean A01(Uri uri) {
        String host;
        if (uri == null || (host = uri.getHost()) == null) {
            return false;
        }
        return host.equals(IGPixelRequestBuffer.URL_PREFIX) || 00p.A0i(host, AnonymousClass000.A00(2060), false) || host.equals("fb.watch");
    }

    public static final boolean A02(UserSession userSession, User user) {
        long j;
        0qQ.A0B(userSession, 1);
        boolean A0K = 0qQ.A0K(user.getId(), userSession.A06);
        0Tu r2 = 0Tu.A05;
        if (A0K) {
            j = 36320120356937763L;
        } else if (!182.A06(r2, userSession, 36320120355889179L)) {
            return false;
        } else {
            j = 36320120356544546L;
        }
        if (!182.A06(r2, userSession, j)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r0 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r4.length() == 0) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(android.content.Context r5, X.C253443qn r6, com.instagram.common.session.UserSession r7) {
        /*
            X.AnonymousClass7TG.A1N(r6, r7)
            java.lang.String r4 = r6.getUrl()
            if (r4 == 0) goto L_0x0010
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = 0
            if (r0 != 0) goto L_0x0018
            android.net.Uri r3 = X.0cp.A03(r4)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0018 }
        L_0x0018:
            if (r3 == 0) goto L_0x0068
            boolean r0 = X.SS2.A01(r3)
            if (r0 != 0) goto L_0x0026
            boolean r0 = A01(r3)
            if (r0 == 0) goto L_0x0068
        L_0x0026:
            java.lang.String r2 = r3.getPath()
            r0 = 0
            if (r2 == 0) goto L_0x0033
            java.lang.String r1 = "/help/"
            boolean r0 = X.00l.A0d(r2, r1, r0)
        L_0x0033:
            if (r0 != 0) goto L_0x0068
            if (r4 == 0) goto L_0x0060
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r1 = r1.setFlags(r0)
            X.FSs r0 = X.FH7.A00
            android.net.Uri r0 = X.0cp.A01(r0, r4)
            android.content.Intent r2 = r1.setData(r0)
            X.0qQ.A07(r2)
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            if (r1 == 0) goto L_0x0060
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            if (r1 == 0) goto L_0x0068
            java.lang.String r0 = r3.toString()
            return r0
        L_0x0068:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46427Deo.A00(android.content.Context, X.3qn, com.instagram.common.session.UserSession):java.lang.String");
    }
}
