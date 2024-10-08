package X;

/* renamed from: X.6Q8  reason: invalid class name */
public final class AnonymousClass6Q8 extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass6Q8(String str, String str2, String str3, String str4, int i) {
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        this.A03 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6Q8) {
                AnonymousClass6Q8 r5 = (AnonymousClass6Q8) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A03.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A00;
    }
}
