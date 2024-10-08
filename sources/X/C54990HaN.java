package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.HaN  reason: case insensitive filesystem */
public abstract class C54990HaN {
    public static final Map A00(List list) {
        if (list == null) {
            return 0Yt.A0E();
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass7TF.A1I(DbS.A0j(i), next, A0r);
            i = i2;
        }
        return 0Yt.A08(A0r);
    }
}
