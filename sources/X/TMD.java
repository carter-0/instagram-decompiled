package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class TMD implements Iterator {
    public Collection A00;
    public final Iterator A01;
    public final /* synthetic */ TS3 A02;

    public TMD(TS3 ts3) {
        this.A02 = ts3;
        this.A01 = AnonymousClass7TF.A0u(ts3.A02);
    }

    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry A1J = AnonymousClass7TE.A1J(this.A01);
        this.A00 = Pxe.A18(A1J);
        TS3 ts3 = this.A02;
        Object key = A1J.getKey();
        return new C8527QwR(key, ts3.A03.A00(key, Pxe.A18(A1J)));
    }

    public final void remove() {
        if (AnonymousClass7TF.A1V(this.A00)) {
            this.A01.remove();
            this.A02.A03.A00 -= this.A00.size();
            this.A00.clear();
            this.A00 = null;
            return;
        }
        throw AnonymousClass7TE.A0z("no calls to next() since the last call to remove()");
    }
}
