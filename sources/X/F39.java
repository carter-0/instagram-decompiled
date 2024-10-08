package X;

import java.util.Collection;
import java.util.List;

public abstract class F39 {
    public int A00 = -1;
    public final List A01;

    public final C49722F3l A00() {
        int i = this.A00 + 1;
        this.A00 = i;
        List list = this.A01;
        if (i < list.size()) {
            return (C49722F3l) list.get(this.A00);
        }
        return null;
    }

    public final boolean A01(Enum enumR) {
        List<C49722F3l> list = this.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C49722F3l f3l : list) {
                if (0qQ.A0K(f3l.A00, enumR)) {
                    return true;
                }
            }
        }
        return false;
    }

    public F39(Collection collection) {
        this.A01 = 00k.A0a(collection);
    }
}
