package com.google.common.collect;

import X.17k;
import X.AnonymousClass3W6;
import X.AnonymousClass7TF;
import X.C249803kO;
import X.C281945Ae;
import X.C66580MXl;
import X.C9740Rfy;
import X.R10;
import X.R1S;
import X.S79;
import X.SK2;
import com.google.common.collect.RegularImmutableMultiset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements AnonymousClass3W6<E> {
    public static final long serialVersionUID = 912559;
    public transient ImmutableList A00;
    public transient ImmutableSet A01;

    public final class EntrySet extends IndexedImmutableSet {
        public static final long serialVersionUID = 0;

        public EntrySet() {
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        public final boolean A0B() {
            return ImmutableMultiset.this.A0B();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof S79)) {
                return false;
            }
            S79 s79 = (S79) obj;
            if (s79.A00() <= 0 || ImmutableMultiset.this.AKq(s79.A01()) != s79.A00()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        public final int size() {
            return ImmutableMultiset.this.A0C().size();
        }

        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    public class EntrySetSerializedForm implements Serializable {
        public final ImmutableMultiset multiset;

        public Object readResolve() {
            return this.multiset.entrySet();
        }

        public EntrySetSerializedForm(ImmutableMultiset immutableMultiset) {
            this.multiset = immutableMultiset;
        }
    }

    public abstract Object writeReplace();

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final ImmutableSet A0C() {
        if (this instanceof RegularImmutableMultiset) {
            RegularImmutableMultiset regularImmutableMultiset = (RegularImmutableMultiset) this;
            ImmutableSet immutableSet = regularImmutableMultiset.A00;
            if (immutableSet != null) {
                return immutableSet;
            }
            RegularImmutableMultiset.ElementSet elementSet = new RegularImmutableMultiset.ElementSet();
            regularImmutableMultiset.A00 = elementSet;
            return elementSet;
        } else if (this instanceof RegularImmutableSortedMultiset) {
            return ((RegularImmutableSortedMultiset) this).elementSet;
        } else {
            return ((ImmutableSortedMultiset) this).A0I();
        }
    }

    /* renamed from: A0D */
    public final ImmutableSet entrySet() {
        RegularImmutableSet regularImmutableSet = this.A01;
        if (regularImmutableSet == null) {
            if (isEmpty()) {
                regularImmutableSet = RegularImmutableSet.A03;
            } else {
                regularImmutableSet = new EntrySet();
            }
            this.A01 = regularImmutableSet;
        }
        return regularImmutableSet;
    }

    public final S79 A0E(int i) {
        if (this instanceof RegularImmutableMultiset) {
            SK2 sk2 = ((RegularImmutableMultiset) this).A01;
            17k.A01(i, sk2.A02);
            return new R10(sk2, i);
        } else if (!(this instanceof RegularImmutableSortedMultiset)) {
            return (S79) ((DescendingImmutableSortedMultiset) this).A00.entrySet().asList().reverse().get(i);
        } else {
            RegularImmutableSortedMultiset regularImmutableSortedMultiset = (RegularImmutableSortedMultiset) this;
            Object obj = regularImmutableSortedMultiset.elementSet.elements.get(i);
            long[] jArr = regularImmutableSortedMultiset.A02;
            int i2 = regularImmutableSortedMultiset.A01 + i;
            return new Multisets$ImmutableEntry(obj, (int) (jArr[i2 + 1] - jArr[i2]));
        }
    }

    public final ImmutableList asList() {
        ImmutableList immutableList = this.A00;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList asList = super.asList();
        this.A00 = asList;
        return asList;
    }

    @Deprecated
    public final int ECy(Object obj, int i) {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final boolean ESx(Object obj, int i, int i2) {
        throw C66580MXl.A11();
    }

    public final boolean contains(Object obj) {
        return AnonymousClass7TF.A1R(AKq(obj));
    }

    public final int copyIntoArray(Object[] objArr, int i) {
        C249803kO it = entrySet().iterator();
        while (it.hasNext()) {
            S79 s79 = (S79) it.next();
            Arrays.fill(objArr, i, s79.A00() + i, s79.A01());
            i += s79.A00();
        }
        return i;
    }

    public final boolean equals(Object obj) {
        return C9740Rfy.A00(this, obj);
    }

    public final int hashCode() {
        return C281945Ae.A00(entrySet());
    }

    public final C249803kO iterator() {
        return new R1S(entrySet().iterator());
    }

    public final String toString() {
        return entrySet().toString();
    }
}
