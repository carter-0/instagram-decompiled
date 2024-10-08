package com.google.common.collect;

import X.17k;
import X.1J2;
import X.1WJ;
import X.AnonymousClass3W5;
import X.C10007Rl2;
import X.C256393vh;
import X.S79;
import X.TMR;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class ConcurrentHashMultiset<E> extends AnonymousClass3W5<E> implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient ConcurrentMap A00;

    public final boolean ESx(Object obj, int i, int i2) {
        Object obj2;
        int i3;
        obj.getClass();
        1J2.A00(i, "oldCount");
        ConcurrentMap concurrentMap = this.A00;
        concurrentMap.getClass();
        try {
            obj2 = concurrentMap.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj2;
        if (atomicInteger == null || (i3 = atomicInteger.get()) != i || !atomicInteger.compareAndSet(i3, 0)) {
            return false;
        }
        concurrentMap.remove(obj, atomicInteger);
        return true;
    }

    public final int AKq(Object obj) {
        Object obj2;
        ConcurrentMap concurrentMap = this.A00;
        concurrentMap.getClass();
        try {
            obj2 = concurrentMap.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj2;
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final int size() {
        long j = 0;
        for (AtomicInteger atomicInteger : this.A00.values()) {
            j += (long) atomicInteger.get();
        }
        return 1WJ.A02(j);
    }

    public ConcurrentHashMultiset(ConcurrentMap concurrentMap) {
        17k.A0A(concurrentMap, "the backing map (%s) must be empty", concurrentMap.isEmpty());
        this.A00 = concurrentMap;
    }

    private ArrayList A00() {
        ArrayList arrayList = new ArrayList(C256393vh.computeArrayListCapacity(size()));
        for (S79 s79 : entrySet()) {
            Object A01 = s79.A01();
            for (int A002 = s79.A00(); A002 > 0; A002--) {
                arrayList.add(A01);
            }
        }
        return arrayList;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        readObject.getClass();
        C10007Rl2.A00.A00(this, readObject);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A00);
    }

    public final Iterator iterator() {
        return new TMR(this, entrySet().iterator());
    }

    public final Object[] toArray(Object[] objArr) {
        return A00().toArray(objArr);
    }

    public final Object[] toArray() {
        return A00().toArray();
    }
}
