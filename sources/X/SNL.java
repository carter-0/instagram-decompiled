package X;

public final class SNL {
    public final Object A00;
    public final C10267RpR A01;

    public SNL(C10267RpR rpR, Object obj) {
        this.A01 = rpR;
        this.A00 = obj;
    }

    public static SNL A00(int i, int i2) {
        return new SNL(new C10267RpR(Integer.valueOf(i2)), Integer.valueOf(i));
    }

    public static SNL A01(long j, long j2) {
        return new SNL(new C10267RpR(Long.valueOf(j2)), Long.valueOf(j));
    }
}
