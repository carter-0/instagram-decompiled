package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

public final class TRZ extends AbstractCollection {
    public final /* synthetic */ TS6 A00;

    public TRZ(TS6 ts6) {
        this.A00 = ts6;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final Iterator iterator() {
        TS6 ts6 = this.A00;
        Map A02 = ts6.A02();
        if (A02 != null) {
            return AnonymousClass7TF.A0v(A02);
        }
        return new C8531QwV(ts6);
    }

    public final int size() {
        return this.A00.size();
    }
}
