package X;

/* renamed from: X.N2m  reason: case insensitive filesystem */
public final class C68146N2m extends AnonymousClass0T0 {
    public final C266444Yx A00;
    public final C266444Yx A01;
    public final C69272NiY A02;
    public final C69284Nik A03;
    public final C69260NiM A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68146N2m) {
                C68146N2m n2m = (C68146N2m) obj;
                if (!(this.A04 == n2m.A04 && this.A03 == n2m.A03 && 0qQ.A0K(this.A00, n2m.A00) && 0qQ.A0K(this.A01, n2m.A01) && this.A02 == n2m.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A04);
        return AnonymousClass7TE.A0N(this.A02, (((AnonymousClass7TF.A07(this.A03, A0K) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31);
    }

    public C68146N2m(C266444Yx r2, C266444Yx r3, C69272NiY niY, C69284Nik nik, C69260NiM niM) {
        AnonymousClass7TG.A1O(niM, nik);
        0qQ.A0B(niY, 5);
        this.A04 = niM;
        this.A03 = nik;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = niY;
    }
}
