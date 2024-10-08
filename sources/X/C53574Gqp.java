package X;

/* renamed from: X.Gqp  reason: case insensitive filesystem */
public final class C53574Gqp extends AnonymousClass0T0 implements C59506JMe {
    public final int A00 = 1;
    public final Object A01;

    public C53574Gqp(C59725JVj jVj) {
        0qQ.A0B(jVj, 1);
        this.A01 = jVj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53574Gqp) || ((C53574Gqp) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!A00(1, obj) || !0qQ.A0K(this.A01, ((C53574Gqp) obj).A01)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!A00(0, obj) || this.A01 != ((C53574Gqp) obj).A01) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C53574Gqp(C267324bN r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }
}
