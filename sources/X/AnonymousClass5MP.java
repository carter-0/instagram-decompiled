package X;

import android.net.Uri;

/* renamed from: X.5MP  reason: invalid class name */
public abstract class AnonymousClass5MP {
    public static final 0bY A00 = new 1Q7("IgSecureUriParser").A00;

    public static final int A00(AnonymousClass16b r2) {
        String queryParameter;
        Integer A0l;
        Uri A01 = 0cp.A01(A00, r2.CCJ());
        if (A01 == null || (queryParameter = A01.getQueryParameter("se")) == null || (A0l = 00y.A0l(queryParameter)) == null) {
            return -1;
        }
        return A0l.intValue();
    }
}
