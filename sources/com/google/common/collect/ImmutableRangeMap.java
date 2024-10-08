package com.google.common.collect;

import X.17k;
import X.AnonymousClass7TE;
import X.C249803kO;
import X.C9738Rfw;
import com.google.common.collect.Range;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class ImmutableRangeMap implements Serializable {
    public static final ImmutableRangeMap A02 = new ImmutableRangeMap(ImmutableList.of(), ImmutableList.of());
    public static final long serialVersionUID = 0;
    public final transient ImmutableList A00;
    public final transient ImmutableList A01;

    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final ImmutableMap mapOfRanges;

        public Object readResolve() {
            if (this.mapOfRanges.isEmpty()) {
                return ImmutableRangeMap.A02;
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            C249803kO it = this.mapOfRanges.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                Range range = (Range) A1J.getKey();
                Object value = A1J.getValue();
                range.getClass();
                value.getClass();
                17k.A0A(range, "Range must not be empty, but was %s", !range.lowerBound.equals(range.upperBound));
                A1C.add(new ImmutableEntry(range, value));
            }
            return C9738Rfw.A00(A1C);
        }

        public SerializedForm(ImmutableMap immutableMap) {
            this.mapOfRanges = immutableMap;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final ImmutableMap A00() {
        ImmutableList immutableList = this.A00;
        if (immutableList.isEmpty()) {
            return RegularImmutableMap.A02;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = RegularImmutableSortedSet.A00;
        Range range = Range.A00;
        return new ImmutableSortedMap(this.A01, (ImmutableSortedMap) null, new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.A00));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ImmutableRangeMap) {
            return A00().equals(((ImmutableRangeMap) obj).A00());
        }
        return false;
    }

    public ImmutableRangeMap(ImmutableList immutableList, ImmutableList immutableList2) {
        this.A00 = immutableList;
        this.A01 = immutableList2;
    }

    public final int hashCode() {
        return A00().hashCode();
    }

    public final String toString() {
        return A00().toString();
    }

    public Object writeReplace() {
        return new SerializedForm(A00());
    }
}
