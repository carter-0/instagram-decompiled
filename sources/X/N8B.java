package X;

public final class N8B extends AnonymousClass0T0 implements C74567PxG, C74243PrX {
    public final AnonymousClass9IV A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8B) {
                N8B n8b = (N8B) obj;
                if (!0qQ.A0K(this.A00, n8b.A00) || !0qQ.A0K(this.A01, n8b.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AYo() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public N8B(AnonymousClass9IV r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public N8B() {
        this((AnonymousClass9IV) null, (String) null);
    }
}
