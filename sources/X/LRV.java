package X;

public final class LRV {
    public static final LRV A03 = new LRV("logged_out");
    public static final LRV A04 = new LRV("not_initialized");
    public String A00;
    public final 28D A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (obj instanceof LRV) {
            LRV lrv = (LRV) obj;
            if (!0qQ.A0K(this.A02, lrv.A02) || 0qQ.A0K(this.A00, "d_") || 0qQ.A0K(lrv.A00, "d_")) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public LRV(28D r2) {
        this.A02 = AnonymousClass7TG.A0j();
        this.A01 = r2;
        this.A00 = "d_";
        this.A00 = "a_";
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('[');
        A1A.append(this.A02);
        A1A.append(' ');
        A1A.append(this.A01);
        return C51967G9n.A0r(A1A, ']');
    }

    public LRV(String str) {
        28D r0 = 28D.A5J;
        this.A02 = str;
        this.A01 = r0;
        this.A00 = "d_";
    }
}
