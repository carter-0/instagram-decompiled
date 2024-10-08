package X;

/* renamed from: X.2xe  reason: invalid class name and case insensitive filesystem */
public final class C234312xe {
    public int A00;
    public Integer A01;
    public Integer A02;

    public final Integer A00() {
        return this.A01;
    }

    public final void A01(int i) {
        Integer num;
        if (i == 0) {
            num = AnonymousClass05K.A0C;
        } else if (i > 0) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        this.A01 = num;
    }

    public C234312xe(Integer num) {
        this.A02 = num;
        this.A01 = num;
        this.A00 = num == AnonymousClass05K.A01 ? -1 : Integer.MAX_VALUE;
    }
}
