package X;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.Comparator;

public final class R0Q extends 1R1 {
    public final Comparator A00;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.AbstractCollection, com.google.common.collect.RegularImmutableSortedSet] */
    public static RegularImmutableSortedSet A02(R0Q r0q) {
        ? A07 = ImmutableSortedSet.A07(r0q.A00, r0q.A02, r0q.A00);
        r0q.A00 = A07.size();
        r0q.A01 = true;
        return A07;
    }

    public R0Q(Comparator comparator) {
        comparator.getClass();
        this.A00 = comparator;
    }

    public final /* bridge */ /* synthetic */ ImmutableSet A05() {
        return A02(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.common.collect.ImmutableCollection, com.google.common.collect.RegularImmutableSortedSet] */
    public final /* bridge */ /* synthetic */ ImmutableCollection build() {
        return A02(this);
    }

    public final /* bridge */ /* synthetic */ 1R1 A04(Object obj) {
        R0Q.super.A04(obj);
        return this;
    }

    public final void A08(Object... objArr) {
        R0Q.super.A07(objArr);
    }

    public final /* bridge */ /* synthetic */ 1J3 add(Object obj) {
        R0Q.super.A04(obj);
        return this;
    }
}
