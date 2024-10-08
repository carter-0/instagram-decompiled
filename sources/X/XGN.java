package X;

import java.util.Iterator;
import java.util.Map;

public final class XGN extends C21502Xd7 implements Iterator, AnonymousClass0s4 {
    public final Object next() {
        Map.Entry entry = this.A02;
        if (entry != null) {
            A00();
            return entry.getKey();
        }
        throw Pxe.A0i();
    }
}
