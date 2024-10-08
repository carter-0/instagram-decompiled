package X;

import java.util.Iterator;
import java.util.Map;

public final class S7E {
    public Map A00;
    public boolean A01 = false;
    public final String A02;

    public final void A03() {
        this.A01 = true;
    }

    public final String A01() {
        return this.A02;
    }

    public final Map A02() {
        return this.A00;
    }

    public final boolean A04() {
        return this.A01;
    }

    public S7E(String str) {
        this.A02 = str;
        this.A00 = AnonymousClass7TE.A1E();
    }

    public final String A00() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Iterator A0u = AnonymousClass7TF.A0u(this.A00);
        int i = 0;
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (i > 0) {
                A1A.append(" , ");
            }
            Pxg.A1S(A1A, A1J);
            A1A.append(": ");
            A1A.append(DbS.A0s(A1J));
            i++;
        }
        return A1A.toString();
    }
}
