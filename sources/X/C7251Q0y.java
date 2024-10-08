package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.Q0y  reason: case insensitive filesystem */
public final class C7251Q0y implements C13749TgL {
    public final byte[] A00;

    public final long Cfu() {
        return (long) this.A00.length;
    }

    public final InputStream E15() {
        return new ByteArrayInputStream(this.A00);
    }

    public C7251Q0y(String... strArr) {
        C239023El r2 = new C239023El("");
        Iterator it = Arrays.asList(strArr).iterator();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        r2.A03(A1A, it);
        String obj = A1A.toString();
        if (obj != null) {
            this.A00 = C66582MXn.A1a(obj);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
