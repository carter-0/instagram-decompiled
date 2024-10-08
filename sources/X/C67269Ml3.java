package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ml3  reason: case insensitive filesystem */
public abstract class C67269Ml3 {
    public static final List A00(Iterable iterable, List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            A0r.add(new 0eP(next, Integer.valueOf(i)));
            i = i2;
        }
        return 00k.A0g(iterable, new C73428PcS((Object) 0Yt.A08(A0r), 2));
    }
}
