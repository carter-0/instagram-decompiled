package X;

import android.net.Uri;

/* renamed from: X.Nv3  reason: case insensitive filesystem */
public abstract class C69963Nv3 {
    public static final boolean A00(String str) {
        Uri A09 = DbT.A09(str);
        if ("instagram".equals(A09.getScheme()) && "thread".equals(A09.getHost()) && !A09.getPathSegments().isEmpty()) {
            String str2 = A09.getPathSegments().get(0);
            0qQ.A07(str2);
            return str2.length() != 0 && AnonymousClass7TE.A19(A09.getPathSegments(), 1).equals("details") && AnonymousClass7TE.A19(A09.getPathSegments(), 2).equals("invite_link");
        }
    }
}
