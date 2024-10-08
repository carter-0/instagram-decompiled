package X;

/* renamed from: X.I0z  reason: case insensitive filesystem */
public final class C56545I0z {
    public final AnonymousClass5ZB A00;
    public final AnonymousClass5ZB A01;
    public final AnonymousClass5ZB A02;
    public final AnonymousClass5ZB A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C56545I0z)) {
                C56545I0z i0z = (C56545I0z) obj;
                if (!0qQ.A0K(this.A03, i0z.A03) || !0qQ.A0K(this.A00, i0z.A00) || !0qQ.A0K(this.A01, i0z.A01) || !0qQ.A0K(this.A02, i0z.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0E = ((((C51971G9r.A0E(this.A03) * 31) + C51971G9r.A0E(this.A00)) * 31) + C51971G9r.A0E(this.A01)) * 31;
        AnonymousClass5ZB r0 = this.A02;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return A0E + i;
    }

    public C56545I0z(AnonymousClass5ZB r1, AnonymousClass5ZB r2, AnonymousClass5ZB r3, AnonymousClass5ZB r4) {
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public C56545I0z() {
        this((AnonymousClass5ZB) null, (AnonymousClass5ZB) null, (AnonymousClass5ZB) null, (AnonymousClass5ZB) null);
    }
}
