package X;

/* renamed from: X.N2a  reason: case insensitive filesystem */
public final class C68136N2a extends AnonymousClass0T0 {
    public final int A00;
    public final C3260875i A01;
    public final C3260875i A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68136N2a) {
                C68136N2a n2a = (C68136N2a) obj;
                if (!0qQ.A0K(this.A01, n2a.A01) || !0qQ.A0K(this.A02, n2a.A02) || this.A00 != n2a.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31) + this.A00;
    }

    public C68136N2a(C3260875i r1, C3260875i r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }
}
