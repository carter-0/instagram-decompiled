package X;

/* renamed from: X.Gqn  reason: case insensitive filesystem */
public final class C53572Gqn extends AnonymousClass0T0 implements C59506JMe {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C53572Gqn(String str, String str2, String str3, String str4) {
        0qQ.A0B(str4, 4);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53572Gqn) {
                C53572Gqn gqn = (C53572Gqn) obj;
                if (!0qQ.A0K(this.A01, gqn.A01) || !0qQ.A0K(this.A02, gqn.A02) || !0qQ.A0K(this.A00, gqn.A00) || !0qQ.A0K(this.A03, gqn.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, ((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A00)) * 31);
    }
}
