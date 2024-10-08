package X;

public abstract class R1D extends TSD {
    public final AnonymousClass3W6 A00() {
        if (this instanceof R15) {
            return ((R15) this).A00;
        }
        R14 r14 = (R14) this;
        if (r14 instanceof QzN) {
            return ((QzN) r14).A00;
        }
        return r14.A00;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof S79)) {
            return false;
        }
        S79 s79 = (S79) obj;
        if (s79.A00() <= 0 || A00().AKq(s79.A01()) != s79.A00()) {
            return false;
        }
        return true;
    }

    public final boolean remove(Object obj) {
        if (obj instanceof S79) {
            S79 s79 = (S79) obj;
            Object A01 = s79.A01();
            int A00 = s79.A00();
            if (A00 != 0) {
                return A00().ESx(A01, A00, 0);
            }
        }
        return false;
    }

    public final void clear() {
        A00().clear();
    }
}
