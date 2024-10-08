package com.google.common.collect;

import X.17k;
import X.AnonymousClass00P;
import X.AnonymousClass7TF;
import X.C13959TmM;
import X.C264654Qt;
import X.C66580MXl;
import X.Dba;
import X.R0P;
import X.S79;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;

public abstract class ImmutableSortedMultiset<E> extends ImmutableMultiset<E> implements C13959TmM<E> {
    public static final long serialVersionUID = 912559;
    public transient ImmutableSortedMultiset A00;

    public final class SerializedForm implements Serializable {
        public final Comparator comparator;
        public final int[] counts;
        public final Object[] elements;

        public Object readResolve() {
            int length = this.elements.length;
            R0P r0p = new R0P(this.comparator);
            for (int i = 0; i < length; i++) {
                r0p.A04(this.elements[i], this.counts[i]);
            }
            return r0p.build();
        }

        public SerializedForm(C13959TmM tmM) {
            this.comparator = tmM.comparator();
            int size = tmM.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (S79 s79 : tmM.entrySet()) {
                this.elements[i] = s79.A01();
                this.counts[i] = s79.A00();
                i++;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final ImmutableSortedMultiset A0F() {
        ImmutableSortedMultiset descendingImmutableSortedMultiset;
        if (this instanceof DescendingImmutableSortedMultiset) {
            return ((DescendingImmutableSortedMultiset) this).A00;
        }
        ImmutableSortedMultiset immutableSortedMultiset = this.A00;
        if (immutableSortedMultiset != null) {
            return immutableSortedMultiset;
        }
        if (isEmpty()) {
            C264654Qt A01 = C264654Qt.A00(A0I().comparator()).A01();
            if (NaturalOrdering.A00.equals(A01)) {
                descendingImmutableSortedMultiset = RegularImmutableSortedMultiset.A03;
            } else {
                descendingImmutableSortedMultiset = new RegularImmutableSortedMultiset(A01);
            }
        } else {
            descendingImmutableSortedMultiset = new DescendingImmutableSortedMultiset(this);
        }
        this.A00 = descendingImmutableSortedMultiset;
        return descendingImmutableSortedMultiset;
    }

    public final ImmutableSortedMultiset A0G(BoundType boundType, Object obj) {
        if (!(this instanceof RegularImmutableSortedMultiset)) {
            return ((DescendingImmutableSortedMultiset) this).A00.A0H(boundType, obj).A0F();
        }
        RegularImmutableSortedMultiset regularImmutableSortedMultiset = (RegularImmutableSortedMultiset) this;
        RegularImmutableSortedSet regularImmutableSortedSet = regularImmutableSortedMultiset.elementSet;
        boundType.getClass();
        return regularImmutableSortedMultiset.A0J(0, regularImmutableSortedSet.A0F(obj, AnonymousClass7TF.A1W(boundType, BoundType.CLOSED)));
    }

    public final ImmutableSortedMultiset A0H(BoundType boundType, Object obj) {
        if (!(this instanceof RegularImmutableSortedMultiset)) {
            return ((DescendingImmutableSortedMultiset) this).A00.A0G(boundType, obj).A0F();
        }
        RegularImmutableSortedMultiset regularImmutableSortedMultiset = (RegularImmutableSortedMultiset) this;
        RegularImmutableSortedSet regularImmutableSortedSet = regularImmutableSortedMultiset.elementSet;
        boundType.getClass();
        return regularImmutableSortedMultiset.A0J(regularImmutableSortedSet.A0G(obj, AnonymousClass7TF.A1W(boundType, BoundType.CLOSED)), regularImmutableSortedMultiset.A00);
    }

    public final ImmutableSortedSet A0I() {
        if (this instanceof RegularImmutableSortedMultiset) {
            return ((RegularImmutableSortedMultiset) this).elementSet;
        }
        return ((DescendingImmutableSortedMultiset) this).A00.A0I().descendingSet();
    }

    public final /* bridge */ /* synthetic */ C13959TmM AOl() {
        if (this instanceof DescendingImmutableSortedMultiset) {
            return ((DescendingImmutableSortedMultiset) this).A00;
        }
        return A0F();
    }

    @Deprecated
    public final S79 E2x() {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final S79 E2y() {
        throw C66580MXl.A11();
    }

    public final /* bridge */ /* synthetic */ C13959TmM Eyh(BoundType boundType, BoundType boundType2, Object obj, Object obj2) {
        17k.A09(obj, obj2, "Expected lowerBound <= upperBound but %s > %s", Dba.A1U(A0I().comparator().compare(obj, obj2)));
        return A0H(boundType, obj).A0G(boundType2, obj2);
    }

    public final Comparator comparator() {
        return A0I().comparator();
    }

    public Object writeReplace() {
        throw AnonymousClass00P.createAndThrow();
    }
}
