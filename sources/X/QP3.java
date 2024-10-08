package X;

import com.google.android.gms.auth.UserRecoverableAuthException;

public final class QP3 extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;

    public QP3(C74223PrB prB) {
        0qQ.A0B(prB, 1);
        this.A01 = prB;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof QP3) || ((QP3) obj).A00 != i) {
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
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((QP3) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public QP3(UserRecoverableAuthException userRecoverableAuthException) {
        0qQ.A0B(userRecoverableAuthException, 1);
        this.A01 = userRecoverableAuthException;
    }
}
