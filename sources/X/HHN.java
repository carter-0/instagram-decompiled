package X;

public final class HHN extends C54717HPw {
    public final float A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HHN) {
                HHN hhn = (HHN) obj;
                if (!(this.A01 == hhn.A01 && Float.compare(this.A00, hhn.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51966G9m.A02(this.A01 * 31, this.A00);
    }

    public HHN(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WithBorder(color=");
        A1A.append(this.A01);
        A1A.append(", widthDp=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
