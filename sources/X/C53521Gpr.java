package X;

/* renamed from: X.Gpr  reason: case insensitive filesystem */
public final class C53521Gpr extends AnonymousClass0T0 implements C59494JLs {
    public final int A00;
    public final Object A01;

    public C53521Gpr(AnonymousClass62O r2, int i) {
        this.A00 = i;
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53521Gpr) || ((C53521Gpr) obj).A00 != i) {
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
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((C53521Gpr) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
