package X;

/* renamed from: X.Jzo  reason: case insensitive filesystem */
public final class C61256Jzo extends AnonymousClass0T0 implements MRA {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C61256Jzo(C61083JwL jwL, 0wc r3, int i) {
        this.A00 = i;
        0qQ.A0B(r3, 2);
        this.A02 = jwL;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C61256Jzo)) {
            return false;
        }
        C61256Jzo jzo = (C61256Jzo) obj;
        if (jzo.A00 != i || !0qQ.A0K(this.A02, jzo.A02) || !0qQ.A0K(this.A01, jzo.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A02));
    }
}
