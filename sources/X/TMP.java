package X;

import com.google.common.collect.HashBiMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public final class TMP implements Iterator {
    public int A00;
    public int A01;
    public int A02 = -1;
    public int A03;
    public final /* synthetic */ TSE A04;

    public TMP(TSE tse) {
        this.A04 = tse;
        HashBiMap hashBiMap = tse.A00;
        this.A01 = hashBiMap.A00;
        this.A00 = hashBiMap.A01;
        this.A03 = hashBiMap.A02;
    }

    public final boolean hasNext() {
        if (this.A04.A00.A01 != this.A00) {
            throw new ConcurrentModificationException();
        } else if (this.A01 == -2 || this.A03 <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public final void remove() {
        HashBiMap hashBiMap = this.A04.A00;
        if (hashBiMap.A01 == this.A00) {
            Pxh.A1T(JTQ.A1O(this.A02, -1));
            int i = this.A02;
            HashBiMap.A07(hashBiMap, i, 1J7.A02(hashBiMap.A0B[i]), 1J7.A02(hashBiMap.A0C[i]));
            if (this.A01 == hashBiMap.A02) {
                this.A01 = this.A02;
            }
            this.A02 = -1;
            this.A00 = hashBiMap.A01;
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final Object next() {
        Object qzI;
        Object[] objArr;
        if (hasNext()) {
            TSE tse = this.A04;
            int i = this.A01;
            if (tse instanceof R01) {
                objArr = ((R01) tse).A00.A0C;
            } else if (tse instanceof R00) {
                objArr = ((R00) tse).A00.A0B;
            } else {
                if (tse instanceof C8682Qzy) {
                    qzI = new C8673QzJ(tse.A00, i);
                } else {
                    qzI = new QzI(((Qzz) tse).A00, i);
                }
                this.A02 = i;
                this.A01 = tse.A00.A09[i];
                this.A03--;
                return qzI;
            }
            qzI = objArr[i];
            this.A02 = i;
            this.A01 = tse.A00.A09[i];
            this.A03--;
            return qzI;
        }
        throw Pxe.A1C();
    }
}
