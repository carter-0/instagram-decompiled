package X;

import com.google.common.collect.CompactHashSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public final class TML implements Iterator {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final /* synthetic */ CompactHashSet A03;

    public TML(CompactHashSet compactHashSet) {
        this.A03 = compactHashSet;
        this.A01 = compactHashSet.A00;
        this.A00 = compactHashSet.A02();
    }

    public final boolean hasNext() {
        return Pxf.A1R(this.A00);
    }

    public final Object next() {
        CompactHashSet compactHashSet = this.A03;
        if (compactHashSet.A00 != this.A01) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            int i = this.A00;
            this.A02 = i;
            Object[] objArr = compactHashSet.elements;
            objArr.getClass();
            Object obj = objArr[i];
            this.A00 = compactHashSet.A03(this.A00);
            return obj;
        } else {
            throw Pxe.A1C();
        }
    }

    public final void remove() {
        CompactHashSet compactHashSet = this.A03;
        if (compactHashSet.A00 == this.A01) {
            Pxh.A1T(Pxf.A1R(this.A02));
            this.A01 += 32;
            int i = this.A02;
            Object[] objArr = compactHashSet.elements;
            objArr.getClass();
            compactHashSet.remove(objArr[i]);
            this.A00 = compactHashSet.A04(this.A00, this.A02);
            this.A02 = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
