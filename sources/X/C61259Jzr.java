package X;

/* renamed from: X.Jzr  reason: case insensitive filesystem */
public final class C61259Jzr extends AnonymousClass0T0 implements MRK {
    public final int A00;
    public final int A01;

    public C61259Jzr(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61259Jzr) || ((C61259Jzr) obj).A00 != i) {
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
        if (!A00(i, obj) || this.A01 != ((C61259Jzr) obj).A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01;
    }
}
