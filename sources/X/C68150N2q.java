package X;

/* renamed from: X.N2q  reason: case insensitive filesystem */
public final class C68150N2q extends AnonymousClass0T0 {
    public final double A00;
    public final double A01;
    public final int A02;
    public final String A03;
    public final String A04;

    public C68150N2q(String str, String str2, double d, double d2, int i) {
        0qQ.A0B(str2, 2);
        this.A03 = str;
        this.A04 = str2;
        this.A00 = d;
        this.A01 = d2;
        this.A02 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68150N2q) {
                C68150N2q n2q = (C68150N2q) obj;
                if (!(0qQ.A0K(this.A03, n2q.A03) && 0qQ.A0K(this.A04, n2q.A04) && Double.compare(this.A00, n2q.A00) == 0 && Double.compare(this.A01, n2q.A01) == 0 && this.A02 == n2q.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A08(this.A04, AnonymousClass7TG.A0E(this.A03) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01))) * 31) + this.A02;
    }
}
