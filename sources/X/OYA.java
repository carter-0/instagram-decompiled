package X;

import android.net.Uri;
import java.util.Set;

public abstract class OYA {
    public static final Set A00 = AnonymousClass7TE.A1F();

    public static void A01(Uri uri) {
        Uri uri2 = C70361O3n.A00;
        if ("res".equals(uri.getScheme())) {
            if (!uri.isAbsolute()) {
                throw new C73545Pec("Resource URI path must be absolute.");
            } else if (!uri.getPath().isEmpty()) {
                try {
                    Integer.parseInt(uri.getPath().substring(1));
                } catch (NumberFormatException unused) {
                    throw new C73545Pec("Resource URI path must be a resource id.");
                }
            } else {
                throw new C73545Pec("Resource URI must not be empty");
            }
        }
        if ("asset".equals(uri.getScheme()) && !uri.isAbsolute()) {
            throw new C73545Pec("Asset URI path must be absolute.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c A[LOOP:0: B:5:0x001c->B:8:0x002e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.net.Uri r3) {
        /*
            android.net.Uri r0 = X.C70361O3n.A00
            java.lang.String r1 = r3.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "http"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0030
            java.util.Set r0 = A00
            java.util.Iterator r2 = r0.iterator()
        L_0x001c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            java.lang.String r0 = r3.getScheme()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OYA.A00(android.net.Uri):void");
    }
}
