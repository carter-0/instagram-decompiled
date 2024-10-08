package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class TME implements Iterator {
    public Map.Entry A00;
    public final /* synthetic */ C8541Qwf A01;
    public final /* synthetic */ Iterator A02;

    public TME(C8541Qwf qwf, Iterator it) {
        this.A01 = qwf;
        this.A02 = it;
    }

    public final boolean hasNext() {
        return this.A02.hasNext();
    }

    public final Object next() {
        Map.Entry A1J = AnonymousClass7TE.A1J(this.A02);
        this.A00 = A1J;
        return A1J.getKey();
    }

    public final void remove() {
        Map.Entry entry = this.A00;
        if (AnonymousClass7TF.A1V(entry)) {
            Collection A18 = Pxe.A18(entry);
            this.A02.remove();
            this.A01.A01.A00 -= A18.size();
            A18.clear();
            this.A00 = null;
            return;
        }
        throw AnonymousClass7TE.A0z("no calls to next() since the last call to remove()");
    }
}
