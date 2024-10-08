package X;

public final class N88 extends AnonymousClass0T0 implements C232262tL, C331837So {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C66709MbG A03;
    public final CharSequence A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final C327637Bp A08;

    public N88(C66709MbG mbG, CharSequence charSequence, int i, int i2, boolean z, boolean z2) {
        0qQ.A0B(charSequence, 2);
        this.A03 = mbG;
        this.A04 = charSequence;
        this.A06 = z;
        this.A07 = z2;
        this.A01 = i;
        this.A00 = i2;
        long j = mbG.A01;
        this.A02 = j;
        this.A08 = (C327637Bp) mbG.A03;
        this.A05 = String.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N88) {
                N88 n88 = (N88) obj;
                if (!(0qQ.A0K(this.A03, n88.A03) && 0qQ.A0K(this.A04, n88.A04) && this.A06 == n88.A06 && this.A07 == n88.A07 && this.A01 == n88.A01 && this.A00 == n88.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long C7Z() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final int getType() {
        return 6;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A03)))) + this.A01) * 31) + this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
