package com.google.common.collect;

import X.C249803kO;
import com.google.common.collect.ImmutableList;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] A00 = new Object[0];
    public static final long serialVersionUID = 912559;

    public Object[] A0A() {
        return null;
    }

    public abstract boolean A0B();

    public abstract boolean contains(Object obj);

    public abstract C249803kO iterator();

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public int A08() {
        throw new UnsupportedOperationException();
    }

    public int A09() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public ImmutableList asList() {
        if (isEmpty()) {
            return ImmutableList.of();
        }
        return ImmutableList.asImmutableList(toArray());
    }

    public int copyIntoArray(Object[] objArr, int i) {
        C249803kO it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] A0A = A0A();
            if (A0A != null) {
                return Arrays.copyOfRange(A0A, A09(), A08(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        copyIntoArray(objArr, 0);
        return objArr;
    }

    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    public final Object[] toArray() {
        return toArray(A00);
    }
}
