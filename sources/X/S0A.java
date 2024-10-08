package X;

import java.util.List;

public final class S0A {
    public final List A00 = AnonymousClass7TE.A1C();

    public final synchronized C13915TlH A00(Class cls) {
        C13915TlH tlH;
        int i = 0;
        List list = this.A00;
        int size = list.size();
        while (true) {
            if (i >= size) {
                tlH = null;
                break;
            }
            C10371Rr8 rr8 = (C10371Rr8) list.get(i);
            if (rr8.A01.isAssignableFrom(cls)) {
                tlH = rr8.A00;
                break;
            }
            i++;
        }
        return tlH;
    }
}
