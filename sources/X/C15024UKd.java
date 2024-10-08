package X;

/* renamed from: X.UKd  reason: case insensitive filesystem */
public final class C15024UKd extends AnonymousClass0T0 {
    public final C15030UKj A00;
    public final C15030UKj A01;
    public final CharSequence A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15024UKd) {
                C15024UKd uKd = (C15024UKd) obj;
                if (!(0qQ.A0K(this.A00, uKd.A00) && 0qQ.A0K(this.A01, uKd.A01) && this.A06 == uKd.A06 && this.A03 == uKd.A03 && this.A04 == uKd.A04 && this.A05 == uKd.A05 && 0qQ.A0K(this.A02, uKd.A02) && this.A07 == uKd.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A06, (AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01)) * 31)));
        return DbS.A06(this.A07, (AnonymousClass7TF.A09(this.A05, A09) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }

    public C15024UKd(C15030UKj uKj, C15030UKj uKj2, CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = uKj;
        this.A01 = uKj2;
        this.A06 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A02 = charSequence;
        this.A07 = z5;
    }
}
