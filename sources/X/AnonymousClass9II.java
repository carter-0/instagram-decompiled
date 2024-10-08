package X;

/* renamed from: X.9II  reason: invalid class name */
public final class AnonymousClass9II extends AnonymousClass0T0 implements C262894Gk {
    public final int A00 = 1;
    public final Object A01;

    public AnonymousClass9II(AnonymousClass9IZ r2) {
        this.A01 = r2;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9II) || ((AnonymousClass9II) obj).A00 != i) {
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
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((AnonymousClass9II) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public AnonymousClass9II(C376449Ia r2) {
        this.A01 = r2;
    }
}
