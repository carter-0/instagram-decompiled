package X;

public final class UMw extends AnonymousClass0T0 implements C21013X9p {
    public final int A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UMw) {
                UMw uMw = (UMw) obj;
                if (!(this.A00 == uMw.A00 && this.A01 == uMw.A01 && 0qQ.A0K(this.A02, uMw.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + AnonymousClass7TG.A0E(this.A02);
    }

    public UMw(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }
}
