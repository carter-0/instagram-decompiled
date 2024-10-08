package X;

/* renamed from: X.9cz  reason: invalid class name and case insensitive filesystem */
public final class C382039cz extends AnonymousClass0T0 implements AnonymousClass913 {
    public final int A00;
    public final Object A01;

    public C382039cz(C279864zZ r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C382039cz) || ((C382039cz) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final C279864zZ BWY() {
        return (C279864zZ) this.A01;
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
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((C382039cz) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
