package X;

public final class SR4 {
    public boolean A00 = false;
    public final Object A01;

    public static Object A00(Object obj) {
        return ((SR4) obj).A03();
    }

    public static void A01(2Fk r1, Object obj) {
        r1.A0B(new SR4(obj));
    }

    public static void A02(2Fk r1, Object obj) {
        r1.A0A(new SR4(obj));
    }

    public final Object A03() {
        if (this.A00) {
            return null;
        }
        this.A00 = true;
        return this.A01;
    }

    public SR4(Object obj) {
        this.A01 = obj;
    }
}
