package X;

import java.util.Map;

public final class PS8 implements 1aV {
    public final /* synthetic */ C66633Ma2 A00;

    public PS8(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Map map = (Map) obj;
        0qQ.A0B(map, 0);
        AnonymousClass4iZ r1 = AnonymousClass4iZ.A00;
        if (map.containsKey(r1)) {
            Object obj2 = map.get(r1);
            if (obj2 != null) {
                int A0M = AnonymousClass7TE.A0M(obj2);
                C66633Ma2 ma2 = this.A00;
                ma2.A13(A0M);
                ma2.A16(Integer.valueOf(A0M));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
