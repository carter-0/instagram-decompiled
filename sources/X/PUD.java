package X;

public final class PUD implements 1aV, C61910qF {
    public final int A00;
    public final Object A01;

    public PUD(int i, 0sP r3) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 2:
                0qQ.A0B(r3, 1);
                break;
        }
        this.A01 = r3;
    }

    public static void A00(1aU r1, 1a8 r2, 0sP r3, int i) {
        r2.A02(r1, new PUD(i, r3));
    }

    public final /* synthetic */ void accept(Object obj) {
        C51965G9l.A1W(this.A01, obj);
    }

    public final boolean equals(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                if (!(obj instanceof 1aV) || !(obj instanceof C61910qF)) {
                    return false;
                }
                return AnonymousClass7TG.A1Y(obj, this.A01);
            default:
                return super.equals(obj);
        }
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return (AnonymousClass0eL) this.A01;
    }

    public final int hashCode() {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return this.A01.hashCode();
            default:
                return super.hashCode();
        }
    }
}
