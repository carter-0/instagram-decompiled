package X;

public final class S49 {
    public long A00;
    public long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            S49 s49 = (S49) obj;
            if (!(this.A00 == s49.A00 && this.A01 == s49.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0A(Long.valueOf(this.A00), Long.valueOf(this.A01));
    }
}
