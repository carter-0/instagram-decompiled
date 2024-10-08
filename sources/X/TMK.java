package X;

import com.google.common.collect.AbstractMapBasedMultiset;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public abstract class TMK implements Iterator {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final /* synthetic */ AbstractMapBasedMultiset A03;

    public TMK(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        this.A03 = abstractMapBasedMultiset;
        SK2 sk2 = abstractMapBasedMultiset.A01;
        this.A00 = sk2.A02();
        this.A01 = sk2.A01;
    }

    public final boolean hasNext() {
        if (this.A03.A01.A01 == this.A01) {
            return Pxf.A1R(this.A00);
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        AbstractMapBasedMultiset abstractMapBasedMultiset = this.A03;
        if (abstractMapBasedMultiset.A01.A01 == this.A01) {
            Pxh.A1T(JTQ.A1O(this.A02, -1));
            abstractMapBasedMultiset.A00 -= (long) abstractMapBasedMultiset.A01.A04(this.A02);
            SK2 sk2 = abstractMapBasedMultiset.A01;
            int i = this.A00;
            int i2 = this.A02;
            if (!(sk2 instanceof R16)) {
                i--;
            } else if (i == sk2.A02) {
                i = i2;
            }
            this.A00 = i;
            this.A02 = -1;
            this.A01 = sk2.A01;
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final Object next() {
        Object obj;
        if (hasNext()) {
            int i = this.A00;
            if (this instanceof QzE) {
                SK2 sk2 = ((QzE) this).A00.A01;
                17k.A01(i, sk2.A02);
                obj = new R10(sk2, i);
            } else {
                SK2 sk22 = ((C8672QzD) this).A00.A01;
                17k.A01(i, sk22.A02);
                obj = sk22.A06[i];
            }
            int i2 = this.A00;
            this.A02 = i2;
            this.A00 = this.A03.A01.A03(i2);
            return obj;
        }
        throw Pxe.A1C();
    }
}
