package com.google.common.collect;

import X.002;
import X.1R1;
import X.AnonymousClass42M;
import X.C10008Rl3;
import X.C10091RmT;
import X.C10907S0h;
import X.C249803kO;
import X.Pxd;
import X.R0Q;
import X.R1T;
import X.SQD;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ImmutableSetMultimap extends ImmutableMultimap implements AnonymousClass42M {
    public static final long serialVersionUID = 0;
    public transient ImmutableSet A00;
    public final transient ImmutableSet A01 = RegularImmutableSet.A03;

    public final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        public final transient ImmutableSetMultimap A00;

        public final boolean A0B() {
            return false;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.A00.AJa(entry.getKey(), entry.getValue());
        }

        public final C249803kO iterator() {
            return new R1T(this.A00);
        }

        public final int size() {
            return this.A00.A00;
        }

        public EntrySet(ImmutableSetMultimap immutableSetMultimap) {
            this.A00 = immutableSetMultimap;
        }

        public Object writeReplace() {
            return ImmutableSetMultimap.super.writeReplace();
        }
    }

    /* renamed from: A08 */
    public final ImmutableSet AXL(Object obj) {
        Object obj2 = this.A01.get(obj);
        ImmutableSet immutableSet = this.A01;
        if (obj2 == null) {
            if (immutableSet != null) {
                obj2 = immutableSet;
            } else {
                throw new NullPointerException(Pxd.A00(365));
            }
        }
        return (ImmutableSet) obj2;
    }

    public final /* bridge */ /* synthetic */ Collection ASn() {
        ImmutableSet immutableSet = this.A00;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet entrySet = new EntrySet(this);
        this.A00 = entrySet;
        return entrySet;
    }

    public final /* bridge */ /* synthetic */ Set ASo() {
        ImmutableSet immutableSet = this.A00;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet entrySet = new EntrySet(this);
        this.A00 = entrySet;
        return entrySet;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Collection EDC(Object obj) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSetMultimap(ImmutableMap immutableMap, int i) {
        super(immutableMap, i);
    }

    public static ImmutableSetMultimap A00(Collection collection) {
        if (collection.isEmpty()) {
            return EmptyImmutableSetMultimap.A00;
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ImmutableSet A03 = ImmutableSet.A03((Collection) entry.getValue());
            if (!A03.isEmpty()) {
                builder.put(key, A03);
                i += A03.size();
            }
        }
        return new ImmutableSetMultimap(builder.buildOrThrow(), i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        RegularImmutableSet A06;
        1R1 r0q;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                readObject.getClass();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    if (comparator == null) {
                        r0q = new 1R1();
                    } else {
                        r0q = new R0Q(comparator);
                    }
                    int i3 = 0;
                    do {
                        Object readObject2 = objectInputStream.readObject();
                        readObject2.getClass();
                        r0q.A04(readObject2);
                        i3++;
                    } while (i3 < readInt2);
                    ImmutableSet A05 = r0q.A05();
                    if (A05.size() == readInt2) {
                        builder.put(readObject, A05);
                        i2 += readInt2;
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(readObject);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    throw new InvalidObjectException(002.A0O(Pxd.A00(518), readInt2));
                }
            }
            try {
                C10091RmT.A00.A00(this, builder.buildOrThrow());
                try {
                    C10091RmT.A01.A00.set(this, Integer.valueOf(i2));
                    C10907S0h s0h = C10008Rl3.A00;
                    if (comparator == null) {
                        A06 = RegularImmutableSet.A03;
                    } else {
                        A06 = ImmutableSortedSet.A06(comparator);
                    }
                    s0h.A00(this, A06);
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                }
            } catch (IllegalArgumentException e2) {
                throw new InvalidObjectException(e2.getMessage()).initCause(e2);
            }
        } else {
            throw new InvalidObjectException(002.A0O(Pxd.A00(516), readInt));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Comparator comparator;
        objectOutputStream.defaultWriteObject();
        ImmutableSortedSet immutableSortedSet = this.A01;
        if (immutableSortedSet instanceof ImmutableSortedSet) {
            comparator = immutableSortedSet.comparator();
        } else {
            comparator = null;
        }
        objectOutputStream.writeObject(comparator);
        SQD.A02(this, objectOutputStream);
    }
}
