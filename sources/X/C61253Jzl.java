package X;

/* renamed from: X.Jzl  reason: case insensitive filesystem */
public final class C61253Jzl extends AnonymousClass0T0 implements MR8 {
    public final C255773uh A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61253Jzl) {
                C61253Jzl jzl = (C61253Jzl) obj;
                if (!0qQ.A0K(this.A00, jzl.A00) || this.A01 != jzl.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + C63410KwW.A00(this.A01);
    }

    public C61253Jzl(C255773uh r1, Integer num) {
        AnonymousClass7TG.A1O(r1, num);
        this.A00 = r1;
        this.A01 = num;
    }
}
