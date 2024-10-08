package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.5T7  reason: invalid class name */
public final class AnonymousClass5T7 implements List<C267794cD>, C62650uo {
    public int A00 = -1;
    public int A01;
    public boolean A02 = true;
    public long[] A03 = new long[16];
    public Object[] A04 = new Object[16];

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        this.A00 = -1;
        A01(this);
        this.A02 = true;
    }

    public final Iterator iterator() {
        return new C13129TMn(this, 0, 0, size());
    }

    public final ListIterator listIterator(int i) {
        return new C13129TMn(this, i, 0, size());
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return 0q3.A00(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return 0q3.A01(this, objArr);
    }

    public static final long A00(AnonymousClass5T7 r10) {
        long floatToIntBits = ((long) Float.floatToIntBits(Float.POSITIVE_INFINITY)) << 32;
        int i = r10.A00 + 1;
        int size = r10.size() - 1;
        if (i <= size) {
            while (true) {
                long j = r10.A03[i];
                if (C52420GRx.A00(j, floatToIntBits) < 0) {
                    floatToIntBits = j;
                }
                if ((Float.intBitsToFloat((int) (floatToIntBits >> 32)) < 0.0f && ((int) (floatToIntBits & 4294967295L)) != 0) || i == size) {
                    break;
                }
                i++;
            }
        }
        return floatToIntBits;
    }

    public static final void A01(AnonymousClass5T7 r5) {
        int i = r5.A00 + 1;
        int i2 = i;
        int size = r5.size() - 1;
        if (i <= size) {
            while (true) {
                r5.A04[i] = null;
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        r5.A01 = i2;
    }

    public final void A02(C267794cD r10, C62320sa r11, float f, boolean z) {
        long j;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        Object[] objArr = this.A04;
        int length = objArr.length;
        if (i2 >= length) {
            int i3 = length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, i3);
            0qQ.A07(copyOf);
            this.A04 = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.A03, i3);
            0qQ.A07(copyOf2);
            this.A03 = copyOf2;
        }
        Object[] objArr2 = this.A04;
        int i4 = this.A00;
        objArr2[i4] = r10;
        long[] jArr = this.A03;
        long floatToIntBits = (long) Float.floatToIntBits(f);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        jArr[i4] = (j & 4294967295L) | (floatToIntBits << 32);
        A01(this);
        r11.invoke();
        this.A00 = i;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if ((obj instanceof C267794cD) && indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        Object obj = this.A04[i];
        0qQ.A0C(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return obj;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C267794cD) {
            int size = size() - 1;
            int i = 0;
            if (size >= 0) {
                while (!0qQ.A0K(this.A04[i], obj)) {
                    int i2 = i;
                    i++;
                    if (i2 == size) {
                    }
                }
                return i;
            }
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C267794cD) {
            for (int size = size() - 1; -1 < size; size--) {
                if (0qQ.A0K(this.A04[size], obj)) {
                    return size;
                }
            }
        }
        return -1;
    }

    public final /* bridge */ int size() {
        return this.A01;
    }

    public final List subList(int i, int i2) {
        return new C13123TMh(this, i, i2);
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final ListIterator listIterator() {
        return new C13129TMn(this, 0, 0, size());
    }
}
