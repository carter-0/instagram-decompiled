package X;

/* renamed from: X.Na1  reason: case insensitive filesystem */
public final class C68869Na1 extends C69609Nor {
    public final int A00;
    public final int A01;
    public final int A02;
    public final CharSequence A03;
    public final CharSequence A04;

    public C68869Na1(CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3) {
        0qQ.A0B(charSequence, 1);
        this.A04 = charSequence;
        this.A03 = charSequence2;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68869Na1) {
                C68869Na1 na1 = (C68869Na1) obj;
                if (!(0qQ.A0K(this.A04, na1.A04) && 0qQ.A0K(this.A03, na1.A03) && this.A02 == na1.A02 && this.A01 == na1.A01 && this.A00 == na1.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TE.A0K(this.A04) + AnonymousClass7TG.A0C(this.A03)) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }
}
