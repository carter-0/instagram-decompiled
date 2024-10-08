package X;

import com.google.common.collect.CompactHashMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.42O  reason: invalid class name */
public abstract class AnonymousClass42O implements Iterator {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final /* synthetic */ CompactHashMap A03;

    public Object A00(int i) {
        return new AnonymousClass42P(((AnonymousClass42N) this).A00, i);
    }

    public AnonymousClass42O(CompactHashMap compactHashMap) {
        this.A03 = compactHashMap;
        this.A01 = compactHashMap.A00;
        this.A00 = compactHashMap.A04();
    }

    public final boolean hasNext() {
        if (this.A00 >= 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        CompactHashMap compactHashMap = this.A03;
        if (compactHashMap.A00 != this.A01) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            int i = this.A00;
            this.A02 = i;
            Object A002 = A00(i);
            this.A00 = compactHashMap.A05(this.A00);
            return A002;
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        CompactHashMap compactHashMap = this.A03;
        if (compactHashMap.A00 == this.A01) {
            boolean z = false;
            if (this.A02 >= 0) {
                z = true;
            }
            17k.A0H(z, Pxd.A00(244));
            this.A01 += 32;
            int i = this.A02;
            Object[] objArr = compactHashMap.keys;
            objArr.getClass();
            compactHashMap.remove(objArr[i]);
            this.A00 = compactHashMap.A06(this.A00, this.A02);
            this.A02 = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
