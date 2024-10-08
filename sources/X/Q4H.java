package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Q4H {
    public static final C3034368u A00(C307896Rx r5, AnonymousClass6Tm r6) {
        String A0g = DbY.A0g(r6);
        Map map = (Map) DbT.A0p(r6, 1);
        C246643ew r2 = Q05.A01(r5, A0g).A00.A00.A00;
        List list = r5.A0D;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (list != null) {
            A1C.addAll(list);
        }
        AnonymousClass7TF.A1M(A1C, C276604tb.A00.incrementAndGet());
        return Q4I.A01(C307896Rx.A02(r5, A1C), r2, map, true, true);
    }
}
