package X;

import java.util.List;
import java.util.Map;

public abstract class RUI {
    public static final void A00(C10860RzL rzL, C59721JVf jVf) {
        0qQ.A0B(rzL, 0);
        String str = rzL.A0P.A03;
        if (str != null) {
            C61084JwM jwM = rzL.A0K;
            Map map = (Map) jwM.A02;
            Object obj = map.get(str);
            if (obj == null) {
                obj = AnonymousClass7TE.A1C();
                map.put(str, obj);
            }
            ((List) obj).add(jVf);
            String A02 = C11429STt.A02(str);
            if (A02 != null) {
                Map map2 = (Map) jwM.A01;
                Object obj2 = map2.get(A02);
                if (obj2 == null) {
                    obj2 = AnonymousClass7TE.A1C();
                    map2.put(A02, obj2);
                }
                ((List) obj2).add(jVf);
            }
        }
    }
}
