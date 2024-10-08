package X;

import com.google.common.collect.TreeMultiset;
import java.util.Iterator;

public final class R15 extends R1D<E> {
    public final /* synthetic */ Qzq A00;

    public R15(Qzq qzq) {
        this.A00 = qzq;
    }

    public final Iterator iterator() {
        return new TMY((TreeMultiset) this.A00.A03, 2);
    }

    public final int size() {
        return this.A00.A03.entrySet().size();
    }
}
