package X;

/* renamed from: X.N2f  reason: case insensitive filesystem */
public final class C68139N2f extends AnonymousClass0T0 {
    public final N4R A00;
    public final C69296Niw A01;
    public final C69262NiO A02;
    public final N3W A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68139N2f) {
                C68139N2f n2f = (C68139N2f) obj;
                if (this.A02 != n2f.A02 || this.A01 != n2f.A01 || !0qQ.A0K(this.A00, n2f.A00) || !0qQ.A0K(this.A03, n2f.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02))));
    }

    public C68139N2f(N4R n4r, C69296Niw niw, C69262NiO niO, N3W n3w) {
        C51974G9v.A1P(niO, niw, n4r, n3w);
        this.A02 = niO;
        this.A01 = niw;
        this.A00 = n4r;
        this.A03 = n3w;
    }
}
