package X;

/* renamed from: X.Jrg  reason: case insensitive filesystem */
public final class C60811Jrg extends C62977KpT {
    public final Integer A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C60811Jrg)) {
            return super.equals(obj);
        }
        Integer num = this.A00;
        if (num == AnonymousClass05K.A05) {
            return false;
        }
        return 0qQ.A0K(C16774V5h.A00(num), C16774V5h.A00(((C60811Jrg) obj).A00));
    }

    public final int hashCode() {
        Integer num = this.A00;
        return C51971G9r.A0D(num, C16774V5h.A00(num));
    }

    public C60811Jrg(Integer num) {
        this.A00 = num;
    }
}
