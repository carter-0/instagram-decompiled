package X;

import java.util.function.Predicate;

public final class MBF implements Predicate {
    public final int A00;
    public final Object A01;

    public MBF(int i, 0sP r3) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 3:
            case 4:
                break;
            default:
                0qQ.A0B(r3, 1);
                break;
        }
        this.A01 = r3;
    }

    public final /* synthetic */ boolean test(Object obj) {
        return C51971G9r.A1a(obj, (0sP) this.A01);
    }
}
