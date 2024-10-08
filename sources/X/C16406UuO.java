package X;

/* renamed from: X.UuO  reason: case insensitive filesystem */
public final class C16406UuO extends C16407UuP {
    public final int A00;
    public final String A01;
    public final int A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16406UuO) {
                C16406UuO uuO = (C16406UuO) obj;
                if (!(this.A03 == uuO.A03 && this.A02 == uuO.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((215180831 + this.A03.intValue()) * 31) + this.A02;
    }

    public final String toString() {
        return this.A01;
    }

    public C16406UuO(int i, Integer num) {
        this.A03 = num;
        this.A02 = i;
        this.A00 = i;
        this.A01 = 002.A0J("s", 'x', i, i);
    }
}
