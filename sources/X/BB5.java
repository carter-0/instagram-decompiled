package X;

public final class BB5 extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BB5) {
                BB5 bb5 = (BB5) obj;
                if (this.A00 != bb5.A00 || !0qQ.A0K(this.A01, bb5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AnonymousClass7TG.A0E(this.A01);
    }

    public BB5(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
