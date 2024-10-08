package X;

import java.util.List;

public final class UNS extends AnonymousClass0T0 implements XA0 {
    public final int A00;
    public final int A01;
    public final List A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNS) {
                UNS uns = (UNS) obj;
                if (!(this.A03 == uns.A03 && 0qQ.A0K(this.A02, uns.A02) && this.A00 == uns.A00 && this.A01 == uns.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A03 * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A00) * 31) + this.A01;
    }

    public UNS(List list, int i, int i2, int i3) {
        this.A03 = i;
        this.A02 = list;
        this.A00 = i2;
        this.A01 = i3;
    }
}
