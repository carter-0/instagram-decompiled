package X;

import java.util.Map;

public final class IZ4 implements AnonymousClass2w6 {
    public final 1PG A00;

    public final void EJC(1PW r3) {
        0qQ.A0B(r3, 0);
        1PG r0 = this.A00;
        r0.A03.put(I3x.A01(), r3);
    }

    public final 1PW Bo2() {
        1PW r0;
        1PG r02 = this.A00;
        AnonymousClass1PB A01 = I3x.A01();
        Map map = r02.A03;
        if (map.containsKey(A01)) {
            r0 = (1PW) map.get(A01);
        } else {
            r0 = 1PW.A0K;
        }
        0qQ.A07(r0);
        return r0;
    }

    public IZ4(1PG r1) {
        this.A00 = r1;
    }
}
