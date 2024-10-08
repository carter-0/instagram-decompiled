package X;

import java.io.IOException;

public final class N4v extends AnonymousClass0T0 implements C74223PrB {
    public final int A00 = 0;
    public final Object A01;

    public N4v(IOException iOException) {
        0qQ.A0B(iOException, 1);
        this.A01 = iOException;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof N4v) || ((N4v) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((N4v) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public N4v(RKT rkt) {
        this.A01 = rkt;
    }
}
