package com.google.common.collect;

import X.17k;
import X.AnonymousClass7TE;
import X.C249803kO;
import X.C264654Qt;
import X.C66580MXl;
import X.Dba;
import X.Pxe;
import X.Pxi;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

public final class ImmutableSortedMap<K, V> extends ImmutableMap<K, V> implements NavigableMap<K, V> {
    public static final ImmutableSortedMap A03;
    public static final Comparator A04;
    public static final long serialVersionUID = 0;
    public transient ImmutableSortedMap A00;
    public final transient ImmutableList A01;
    public final transient RegularImmutableSortedSet A02;

    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public final Map.Entry floorEntry(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        obj.getClass();
        return A00(0, regularImmutableSortedSet.A0F(obj, true)).lastEntry();
    }

    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public final Map.Entry lowerEntry(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        obj.getClass();
        return A00(0, regularImmutableSortedSet.A0F(obj, false)).lastEntry();
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        17k.A09(obj, obj2, "expected fromKey <= toKey but %s > %s", Dba.A1U(comparator().compare(obj, obj2)));
        return A00(0, this.A02.A0F(obj2, false)).tailMap(obj, true);
    }

    public class SerializedForm extends ImmutableMap$SerializedForm {
        public static final long serialVersionUID = 0;
        public final Comparator comparator;

        public SerializedForm(ImmutableSortedMap immutableSortedMap) {
            super(immutableSortedMap);
            this.comparator = immutableSortedMap.comparator();
        }
    }

    static {
        NaturalOrdering naturalOrdering = NaturalOrdering.A00;
        A04 = naturalOrdering;
        A03 = new ImmutableSortedMap(ImmutableList.of(), (ImmutableSortedMap) null, ImmutableSortedSet.A06(naturalOrdering));
    }

    private ImmutableSortedMap A00(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return A01(comparator());
        }
        return new ImmutableSortedMap(this.A01.subList(i, i2), (ImmutableSortedMap) null, this.A02.A0H(i, i2));
    }

    public static ImmutableSortedMap A01(Comparator comparator) {
        if (NaturalOrdering.A00.equals(comparator)) {
            return A03;
        }
        return new ImmutableSortedMap(ImmutableList.of(), (ImmutableSortedMap) null, ImmutableSortedSet.A06(comparator));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: A02 */
    public final ImmutableSortedMap tailMap(Object obj, boolean z) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        obj.getClass();
        return A00(regularImmutableSortedSet.A0G(obj, z), size());
    }

    public final Comparator comparator() {
        return this.A02.comparator();
    }

    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.A02.descendingSet();
    }

    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        ImmutableSortedMap immutableSortedMap = this.A00;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        if (isEmpty()) {
            return A01(C264654Qt.A00(comparator()).A01());
        }
        return new ImmutableSortedMap(this.A01.reverse(), this, (RegularImmutableSortedSet) this.A02.descendingSet());
    }

    public final Object firstKey() {
        return this.A02.first();
    }

    public final Object get(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        int i = -1;
        if (obj != null) {
            try {
                int binarySearch = Collections.binarySearch(regularImmutableSortedSet.elements, obj, regularImmutableSortedSet.A01);
                if (binarySearch >= 0) {
                    i = binarySearch;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (i == -1) {
            return null;
        }
        return this.A01.get(i);
    }

    public final /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        obj.getClass();
        return A00(0, regularImmutableSortedSet.A0F(obj, z));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.common.collect.ImmutableCollection, com.google.common.collect.RegularImmutableSortedSet] */
    public final boolean isPartialView() {
        if (this.A02.A0B() || this.A01.A0B()) {
            return true;
        }
        return false;
    }

    public final Object lastKey() {
        return this.A02.last();
    }

    public final /* bridge */ /* synthetic */ NavigableSet navigableKeySet() {
        return this.A02;
    }

    public final int size() {
        return this.A01.size();
    }

    public final ImmutableCollection values() {
        return this.A01;
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public ImmutableSortedMap(ImmutableList immutableList, ImmutableSortedMap immutableSortedMap, RegularImmutableSortedSet regularImmutableSortedSet) {
        this.A02 = regularImmutableSortedSet;
        this.A01 = immutableList;
        this.A00 = immutableSortedMap;
    }

    public final Object ceilingKey(Object obj) {
        return Pxi.A0X(ceilingEntry(obj));
    }

    public final ImmutableSet createEntrySet() {
        if (isEmpty()) {
            return RegularImmutableSet.A03;
        }
        return new ImmutableMapEntrySet<K, V>() {
            public final ImmutableList A0C() {
                return new ImmutableList<Map.Entry<K, V>>() {
                    public final boolean A0B() {
                        return true;
                    }

                    /* renamed from: A0C */
                    public final AbstractMap.SimpleImmutableEntry get(int i) {
                        ImmutableSortedMap immutableSortedMap = ImmutableSortedMap.this;
                        ImmutableSortedMap immutableSortedMap2 = ImmutableSortedMap.A03;
                        return new AbstractMap.SimpleImmutableEntry(immutableSortedMap.A02.elements.get(i), ImmutableSortedMap.this.A01.get(i));
                    }

                    public final int size() {
                        return ImmutableSortedMap.this.size();
                    }

                    public Object writeReplace() {
                        return super.writeReplace();
                    }
                };
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.ImmutableCollection, com.google.common.collect.ImmutableSortedMap$1EntrySet] */
            public final C249803kO iterator() {
                return asList().iterator();
            }

            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    public final ImmutableSet createKeySet() {
        throw Pxe.A0e("should never be called");
    }

    public final ImmutableCollection createValues() {
        throw Pxe.A0e("should never be called");
    }

    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) AnonymousClass7TE.A13(entrySet().asList());
    }

    public final Object floorKey(Object obj) {
        return Pxi.A0X(floorEntry(obj));
    }

    public final Object higherKey(Object obj) {
        return Pxi.A0X(higherEntry(obj));
    }

    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(size() - 1);
    }

    public final Object lowerKey(Object obj) {
        return Pxi.A0X(lowerEntry(obj));
    }

    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw C66580MXl.A11();
    }

    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        obj.getClass();
        return A00(0, regularImmutableSortedSet.A0F(obj, false));
    }

    public final /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        17k.A09(obj, obj2, "expected fromKey <= toKey but %s > %s", Dba.A1U(comparator().compare(obj, obj2)));
        return A00(0, this.A02.A0F(obj2, z2)).tailMap(obj, z);
    }

    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
