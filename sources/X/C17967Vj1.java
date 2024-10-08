package X;

/* renamed from: X.Vj1  reason: case insensitive filesystem */
public final class C17967Vj1 {
    public final int A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C17967Vj1 vj1 = (C17967Vj1) obj;
            if (this.A00 != vj1.A00 || !2PP.A00(this.A01, vj1.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0A(Integer.valueOf(this.A00), this.A01);
    }

    public C17967Vj1(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }
}
