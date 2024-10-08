package X;

/* renamed from: X.QvJ  reason: case insensitive filesystem */
public final class C8474QvJ extends TA9 {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((C8474QvJ) obj).A00);
    }

    public static TA9 A00(C13136TMu tMu, long j) {
        return (TA9) tMu.get(new C8474QvJ(j));
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        TA9 ta9 = (TA9) obj;
        int A02 = A02();
        int A022 = ta9.A02();
        if (A02 != A022) {
            return A02 - A022;
        }
        long abs = Math.abs(this.A00);
        long abs2 = Math.abs(((C8474QvJ) ta9).A00);
        if (abs < abs2) {
            return -1;
        }
        return AnonymousClass7TF.A1R((abs > abs2 ? 1 : (abs == abs2 ? 0 : -1))) ? 1 : 0;
    }

    public final String toString() {
        return Long.toString(this.A00);
    }

    public C8474QvJ(long j) {
        this.A00 = j;
    }

    public final int hashCode() {
        return Pxf.A0A(Integer.valueOf(A02()), Long.valueOf(this.A00));
    }
}
