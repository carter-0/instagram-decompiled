package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;

/* renamed from: X.62M  reason: invalid class name */
public final class AnonymousClass62M<E> extends AnonymousClass62N<E> implements AnonymousClass62P<E> {
    public static final AnonymousClass62M A01 = new AnonymousClass62M(new Object[0]);
    public final Object[] A00;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.AbstractCollection, X.TqS] */
    public final AnonymousClass62O A09(Collection collection) {
        0qQ.A0B(collection, 0);
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.A00, size() + collection.size());
            0qQ.A07(copyOf);
            int size = size();
            for (Object obj : collection) {
                copyOf[size] = obj;
                size++;
            }
            return new AnonymousClass62M(copyOf);
        }
        ? tqS = new C14133TqS(this, this.A00);
        tqS.addAll(collection);
        return tqS.AEK();
    }

    public final int A08() {
        return this.A00.length;
    }

    public final int indexOf(Object obj) {
        return 03t.A02(this.A00, obj);
    }

    public final int lastIndexOf(Object obj) {
        return 03t.A03(this.A00, obj);
    }

    public AnonymousClass62M(Object[] objArr) {
        this.A00 = objArr;
    }

    public final AnonymousClass62O A7T(Object obj) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.A00, size() + 1);
            0qQ.A07(copyOf);
            copyOf[size()] = obj;
            return new AnonymousClass62M(copyOf);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return new C14128TqN(this.A00, objArr, size() + 1, 0);
    }

    public final Object get(int i) {
        AnonymousClass6BV.A00(i, size());
        return this.A00[i];
    }

    public final ListIterator listIterator(int i) {
        AnonymousClass6BV.A01(i, size());
        return new AnonymousClass6BW(this.A00, i, size());
    }
}
