package com.google.common.collect;

import X.17k;
import X.1J2;
import X.1Kw;
import X.2PP;
import X.C249773kL;
import X.C249793kN;
import X.C249803kO;
import X.Pxe;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    public static final C249793kN EMPTY_ITR = new C249773kL(RegularImmutableList.A01, 0);
    public static final long serialVersionUID = -889275714;

    public class ReverseImmutableList<E> extends ImmutableList<E> {
        public final transient ImmutableList A00;

        public final boolean A0B() {
            return this.A00.A0B();
        }

        public final boolean contains(Object obj) {
            return this.A00.contains(obj);
        }

        public final int indexOf(Object obj) {
            int lastIndexOf = this.A00.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return A00(lastIndexOf);
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            int indexOf = this.A00.indexOf(obj);
            if (indexOf >= 0) {
                return A00(indexOf);
            }
            return -1;
        }

        public final ImmutableList reverse() {
            return this.A00;
        }

        public final int size() {
            return this.A00.size();
        }

        public ReverseImmutableList(ImmutableList immutableList) {
            this.A00 = immutableList;
        }

        private int A00(int i) {
            return Pxe.A0A(this) - i;
        }

        private int A01(int i) {
            return size() - i;
        }

        public final Object get(int i) {
            17k.A01(i, size());
            return this.A00.get(A00(i));
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        public final ImmutableList subList(int i, int i2) {
            17k.A03(i, i2, size());
            return this.A00.subList(A01(i2), A01(i)).reverse();
        }

        public Object writeReplace() {
            return ImmutableList.super.writeReplace();
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }
    }

    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object[] elements;

        public Object readResolve() {
            return ImmutableList.copyOf(this.elements);
        }

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }
    }

    public class SubList extends ImmutableList<E> {
        public final transient int A00;
        public final transient int A01;

        public final boolean A0B() {
            return true;
        }

        public SubList(int i, int i2) {
            this.A01 = i;
            this.A00 = i2;
        }

        public final int A08() {
            return ImmutableList.this.A09() + this.A01 + this.A00;
        }

        public final int A09() {
            return ImmutableList.this.A09() + this.A01;
        }

        public final Object[] A0A() {
            return ImmutableList.this.A0A();
        }

        public final Object get(int i) {
            17k.A01(i, this.A00);
            return ImmutableList.this.get(i + this.A01);
        }

        public final int size() {
            return this.A00;
        }

        public final ImmutableList subList(int i, int i2) {
            17k.A03(i, i2, this.A00);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.A01;
            return immutableList.subList(i + i3, i2 + i3);
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        public Object writeReplace() {
            return ImmutableList.super.writeReplace();
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }
    }

    public static ImmutableList asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static ImmutableList construct(Object... objArr) {
        1Kw.A00(objArr, objArr.length);
        return asImmutableList(objArr);
    }

    @Deprecated
    public final ImmutableList asList() {
        return this;
    }

    public ImmutableList subListUnchecked(int i, int i2) {
        return new SubList(i, i2 - i);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builderWithExpectedSize(int i) {
        1J2.A00(i, "expectedSize");
        return new Builder(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r6 == r5) goto L_0x0059
            boolean r0 = r6 instanceof java.util.List
            r4 = 0
            if (r0 == 0) goto L_0x005a
            java.util.List r6 = (java.util.List) r6
            int r3 = r5.size()
            int r0 = r6.size()
            if (r3 != r0) goto L_0x005a
            boolean r0 = r5 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x002f
            boolean r0 = r6 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x002f
            r2 = 0
        L_0x001c:
            if (r2 >= r3) goto L_0x0059
            java.lang.Object r1 = r5.get(r2)
            java.lang.Object r0 = r6.get(r2)
            boolean r0 = X.2PP.A00(r1, r0)
            if (r0 == 0) goto L_0x005a
            int r2 = r2 + 1
            goto L_0x001c
        L_0x002f:
            java.util.Iterator r3 = r5.iterator()
            java.util.Iterator r2 = r6.iterator()
        L_0x0037:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0052
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r1 = r3.next()
            java.lang.Object r0 = r2.next()
            boolean r0 = X.2PP.A00(r1, r0)
            if (r0 != 0) goto L_0x0037
            return r4
        L_0x0052:
            boolean r0 = r2.hasNext()
            r4 = r0 ^ 1
            return r4
        L_0x0059:
            r4 = 1
        L_0x005a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableList.equals(java.lang.Object):boolean");
    }

    public int indexOf(Object obj) {
        if (obj != null) {
            if (this instanceof RandomAccess) {
                int size = size();
                for (int i = 0; i < size; i++) {
                    if (obj.equals(get(i))) {
                        return i;
                    }
                }
            } else {
                ListIterator listIterator = listIterator();
                while (listIterator.hasNext()) {
                    if (2PP.A00(obj, listIterator.next())) {
                        return listIterator.previousIndex();
                    }
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            int size = size();
            do {
                size--;
                if (size < 0) {
                    return -1;
                }
            } while (!obj.equals(get(size)));
            return size;
        }
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (2PP.A00(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public static ImmutableList copyOf(Iterator it) {
        if (!it.hasNext()) {
            return of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return of(next);
        }
        Builder builder = new Builder();
        builder.add(next);
        builder.addAll(it);
        return builder.build();
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public C249793kN listIterator(int i) {
        17k.A02(i, size());
        if (isEmpty()) {
            return EMPTY_ITR;
        }
        return new C249773kL(this, i);
    }

    public ImmutableList reverse() {
        if (size() <= 1) {
            return this;
        }
        return new ReverseImmutableList(this);
    }

    public ImmutableList subList(int i, int i2) {
        17k.A03(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return of();
        }
        return subListUnchecked(i, i2);
    }

    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static ImmutableList of() {
        return RegularImmutableList.A01;
    }

    public static ImmutableList of(Object obj) {
        return construct(obj);
    }

    public static ImmutableList of(Object obj, Object obj2) {
        return construct(obj, obj2);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3) {
        return construct(obj, obj2, obj3);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4) {
        return construct(obj, obj2, obj3, obj4);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return construct(obj, obj2, obj3, obj4, obj5);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return construct(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return construct(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return construct(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return construct(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return construct(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        Object[] objArr2 = objArr;
        int length = objArr2.length;
        Object[] objArr3 = new Object[(length + 12)];
        objArr3[0] = obj;
        objArr3[1] = obj2;
        objArr3[2] = obj3;
        objArr3[3] = obj4;
        objArr3[4] = obj5;
        objArr3[5] = obj6;
        objArr3[6] = obj7;
        objArr3[7] = obj8;
        objArr3[8] = obj9;
        objArr3[9] = obj10;
        objArr3[10] = obj11;
        objArr3[11] = obj12;
        System.arraycopy(objArr2, 0, objArr3, 12, length);
        return construct(objArr3);
    }

    public static ImmutableList asImmutableList(Object[] objArr, int i) {
        if (i == 0) {
            return of();
        }
        return new RegularImmutableList(objArr, i);
    }

    public static ImmutableList copyOf(Collection collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return construct(collection.toArray());
        }
        ImmutableList asList = ((ImmutableCollection) collection).asList();
        if (asList.A0B()) {
            return asImmutableList(asList.toArray());
        }
        return asList;
    }

    public C249803kO iterator() {
        return listIterator();
    }

    public static ImmutableList copyOf(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public C249793kN listIterator() {
        return listIterator(0);
    }

    public static ImmutableList copyOf(Object[] objArr) {
        if (objArr.length == 0) {
            return of();
        }
        return construct((Object[]) objArr.clone());
    }
}
