package X;

/* renamed from: X.8Rk  reason: invalid class name and case insensitive filesystem */
public final class C355798Rk extends C355808Rl {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C355798Rk) {
                C355798Rk r5 = (C355798Rk) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final String toString() {
        return 002.A0X("AudioFilter(selectedIndex=", ", selectedRow=", ')', this.A00, this.A01);
    }

    public C355798Rk(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public C355798Rk() {
        this(-1, 0);
    }
}
