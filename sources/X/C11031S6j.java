package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Range;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.RegularImmutableSortedSet;

/* renamed from: X.S6j  reason: case insensitive filesystem */
public abstract class C11031S6j {
    public final ImmutableSet A00() {
        ImmutableList immutableList = ((ImmutableRangeSet) this).A00;
        if (immutableList.isEmpty()) {
            return RegularImmutableSet.A03;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = RegularImmutableSortedSet.A00;
        Range range = Range.A00;
        return new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.A00);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11031S6j) {
            return A00().equals(((C11031S6j) obj).A00());
        }
        return false;
    }

    public final int hashCode() {
        return A00().hashCode();
    }

    public final String toString() {
        return A00().toString();
    }
}
