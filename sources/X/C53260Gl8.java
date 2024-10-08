package X;

/* renamed from: X.Gl8  reason: case insensitive filesystem */
public final class C53260Gl8 extends AnonymousClass0T0 {
    public final 1Xj A00;
    public final String A01;

    public C53260Gl8(1Xj r2, String str) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53260Gl8) {
                C53260Gl8 gl8 = (C53260Gl8) obj;
                if (!0qQ.A0K(this.A00, gl8.A00) || !0qQ.A0K(this.A01, gl8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }
}
