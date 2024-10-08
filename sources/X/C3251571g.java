package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.71g  reason: invalid class name and case insensitive filesystem */
public final class C3251571g implements Iterable, C62650uo {
    public final int A00;
    public final List A01;
    public final int A02;

    public C3251571g(List list, int i, int i2) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = i;
        this.A02 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && 0qQ.A0K(getClass(), obj.getClass())) {
                C3251571g r6 = (C3251571g) obj;
                int i = this.A00;
                if (i == r6.A00 && A00() == r6.A00()) {
                    Collection r1 = new 2HY(i, A00());
                    if (!(r1 instanceof Collection) || !r1.isEmpty()) {
                        0sh it = r1.iterator();
                        while (it.hasNext()) {
                            int A002 = it.A00();
                            if (!0qQ.A0K(this.A01.get(A002), r6.A01.get(A002))) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    private final int A00() {
        return Math.min(this.A00 + this.A02, this.A01.size()) - 1;
    }

    public final Object A02(int i) {
        return this.A01.get(this.A00 + i);
    }

    public final int hashCode() {
        int i;
        int i2 = this.A00;
        int A002 = A00();
        int i3 = 1;
        if (i2 <= A002) {
            while (true) {
                Object obj = this.A01.get(i2);
                int i4 = i3 * 31;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i3 = i4 + i;
                if (i2 == A002) {
                    break;
                }
                i2++;
            }
        }
        return i3;
    }

    public final Iterator iterator() {
        return this.A01.subList(this.A00, A00() + 1).iterator();
    }

    public final int A01() {
        int A002 = (A00() - this.A00) + 1;
        int size = this.A01.size();
        if (A002 > size) {
            A002 = size;
        }
        if (A002 < 0) {
            return 0;
        }
        return A002;
    }
}
