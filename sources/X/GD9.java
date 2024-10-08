package X;

public final class GD9 {
    public final C62320sa A00;
    public final C62320sa A01;

    public final int A01() {
        return C52012GBj.A01(this.A00);
    }

    public final C267324bN A02() {
        return A03(((C52012GBj) this.A00.invoke()).A06());
    }

    public final C267324bN A03(int i) {
        if (i < 0) {
            return null;
        }
        C62320sa r1 = this.A01;
        if (i < ((GD6) r1.invoke()).A0A.A0A()) {
            return ((GD6) r1.invoke()).A0A.A0F(i);
        }
        return null;
    }

    public GD9(C62320sa r1, C62320sa r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static C267324bN A00(C227232is r0) {
        return r0.A0O().A02();
    }
}
