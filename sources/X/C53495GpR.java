package X;

/* renamed from: X.GpR  reason: case insensitive filesystem */
public final class C53495GpR extends AnonymousClass0T0 implements C59481JLf {
    public final int A00;
    public final boolean A01;

    public C53495GpR(boolean z, int i) {
        this.A00 = i;
        this.A01 = z;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53495GpR) || ((C53495GpR) obj).A00 != i) {
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
        if (!A00(i, obj) || this.A01 != ((C53495GpR) obj).A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A01) {
            return 1231;
        }
        return 1237;
    }
}
