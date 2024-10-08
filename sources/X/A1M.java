package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class A1M {
    public static final List A00(String str) {
        if (str == null || str.length() == 0) {
            return 0sn.A00;
        }
        List A0R = 00l.A0R(str, new String[]{" "}, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(A0R);
        Iterator it = A0R.iterator();
        while (it.hasNext()) {
            A0r.add(Float.valueOf(Float.parseFloat(AnonymousClass7TE.A18(it))));
        }
        return 00k.A0a(A0r);
    }
}
