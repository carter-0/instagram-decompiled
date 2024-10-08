package X;

/* renamed from: X.Xoa  reason: case insensitive filesystem */
public final class C21981Xoa {
    public static final C21981Xoa A02 = new C21981Xoa(-1, -1);
    public final int A00;
    public final int A01;

    static {
        new C21981Xoa(0, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21981Xoa)) {
            return false;
        }
        C21981Xoa xoa = (C21981Xoa) obj;
        return this.A01 == xoa.A01 && this.A00 == xoa.A00;
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = this.A01;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        return 002.A0P("x", this.A01, this.A00);
    }

    public C21981Xoa(int i, int i2) {
        boolean z;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        } else {
            z = false;
        }
        C11366SPh.A01(z);
        this.A01 = i;
        this.A00 = i2;
    }
}
