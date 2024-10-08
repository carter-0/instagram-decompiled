package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.HQa  reason: case insensitive filesystem */
public abstract class C54721HQa {
    public final boolean A00() {
        if (!(this instanceof C54562HIx)) {
            return false;
        }
        List<Object> list = ((C54562HIx) this).A04;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (Object obj : list) {
            if (obj instanceof C57589IdG) {
                return true;
            }
        }
        return false;
    }
}
