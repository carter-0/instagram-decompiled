package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4jR  reason: invalid class name and case insensitive filesystem */
public final class C271694jR implements Iterator {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03 = false;
    public final C271674jP A04;
    public final Object[] A05;
    public final /* synthetic */ C271674jP A06;

    public C271694jR(C271674jP r2, C271674jP r3) {
        this.A06 = r2;
        this.A04 = r3;
        this.A05 = r3.A03;
        this.A01 = r3.A01;
        int A022 = r3.A02(-1);
        this.A00 = A022;
        this.A02 = A022;
    }

    public final boolean hasNext() {
        if (this.A00 >= 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (this.A01 == this.A04.A01) {
            int i = this.A00;
            if (i >= 0) {
                Object[] objArr = this.A05;
                Object obj = objArr[i];
                if (obj == C271674jP.A04) {
                    obj = null;
                }
                this.A02 = i;
                this.A03 = true;
                while (true) {
                    i++;
                    if (i < objArr.length) {
                        if (objArr[i] != null) {
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                this.A00 = i;
                return obj;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        int i = this.A01;
        C271674jP r1 = this.A04;
        if (i != r1.A01) {
            throw new ConcurrentModificationException();
        } else if (this.A03) {
            this.A03 = false;
            Object[] objArr = this.A05;
            r1.remove(objArr[this.A02]);
            this.A01++;
            int i2 = this.A02;
            while (true) {
                if (i2 < objArr.length) {
                    if (objArr[i2] != null) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            this.A00 = i2;
        } else {
            throw new IllegalStateException();
        }
    }
}
