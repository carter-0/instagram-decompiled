package X;

/* renamed from: X.EJa  reason: case insensitive filesystem */
public final class C47828EJa extends C48820Eki implements C51861G4u {
    public final Integer A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47828EJa) {
                C47828EJa eJa = (C47828EJa) obj;
                if (!"".equals("") || this.A00 != eJa.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C48819Ekh.A00(this.A00);
    }

    public C47828EJa(Integer num) {
        this.A00 = num;
    }

    public C47828EJa() {
        this(AnonymousClass05K.A01);
    }
}
