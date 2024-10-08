package X;

import java.util.Iterator;
import java.util.List;

public final class Qzg extends PzX {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Iterable A01;

    public Qzg(Iterable iterable, int i) {
        this.A01 = iterable;
        this.A00 = i;
    }

    public final Iterator iterator() {
        Iterable iterable = this.A01;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.A00), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        int i = this.A00;
        it.getClass();
        17k.A0G(Pxf.A1R(i), "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new TMC(it);
    }
}
