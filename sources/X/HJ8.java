package X;

public final class HJ8 extends HQB {
    public final int A00;
    public final boolean A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HJ8) {
                HJ8 hj8 = (HJ8) obj;
                if (!(0qQ.A0K(this.A02, hj8.A02) && this.A03 == hj8.A03 && this.A01 == hj8.A01 && this.A00 == hj8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A01, AnonymousClass7TF.A09(this.A03, AnonymousClass7TE.A0O(this.A02))) + this.A00;
    }

    public HJ8(String str, boolean z, boolean z2, int i) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = z2;
        this.A00 = i;
    }
}
