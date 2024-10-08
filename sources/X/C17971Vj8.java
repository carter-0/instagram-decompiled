package X;

/* renamed from: X.Vj8  reason: case insensitive filesystem */
public final class C17971Vj8 {
    public static C17971Vj8 A02;
    public final 1P0 A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !DbY.A1b(this, obj)) {
            return false;
        }
        return 0qQ.A0K(this.A01, ((C17971Vj8) obj).A01);
    }

    public final int hashCode() {
        return Pxf.A08(this.A01);
    }

    public C17971Vj8(1P0 r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
