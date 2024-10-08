package X;

import java.util.Iterator;
import java.util.Map;

public abstract class TMS implements Iterator {
    public final Iterator A00;

    public final Object A00(Object obj) {
        C13647TeE teE;
        if (this instanceof C8543Qwh) {
            return ((Map.Entry) obj).getValue();
        }
        if (this instanceof C8545Qwj) {
            teE = ((C8545Qwj) this).A00.A00;
        } else {
            teE = ((C8544Qwi) this).A00.A00;
        }
        return teE.FP2(obj);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final Object next() {
        return A00(this.A00.next());
    }

    public final void remove() {
        this.A00.remove();
    }

    public TMS(Iterator it) {
        it.getClass();
        this.A00 = it;
    }
}
