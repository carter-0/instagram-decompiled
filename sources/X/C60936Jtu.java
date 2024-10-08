package X;

/* renamed from: X.Jtu  reason: case insensitive filesystem */
public final class C60936Jtu extends AnonymousClass0T0 {
    public final int A00;
    public final C300925yB A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public C60936Jtu(C300925yB r2, Integer num, String str, String str2, int i) {
        0qQ.A0B(num, 5);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = r2;
        this.A00 = i;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60936Jtu) {
                C60936Jtu jtu = (C60936Jtu) obj;
                if (!0qQ.A0K(this.A03, jtu.A03) || !0qQ.A0K(this.A04, jtu.A04) || !0qQ.A0K(this.A01, jtu.A01) || this.A00 != jtu.A00 || this.A02 != jtu.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TE.A0O(this.A03) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31) + this.A00) * 31) + C69907Nu9.A00(this.A02);
    }
}
