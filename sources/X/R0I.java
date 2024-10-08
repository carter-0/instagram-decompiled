package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.Arrays;
import java.util.Comparator;

public final class R0I extends ImmutableMap.Builder {
    public final Comparator A00;
    public transient Object[] A01 = new Object[4];
    public transient Object[] A02 = new Object[4];

    public R0I(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.A00 = comparator;
    }

    /* renamed from: A00 */
    public final ImmutableSortedMap buildOrThrow() {
        RegularImmutableSortedSet regularImmutableSortedSet;
        ImmutableList immutableList;
        int i = this.size;
        if (i == 0) {
            return ImmutableSortedMap.A01(this.A00);
        }
        if (i != 1) {
            Object[] copyOf = Arrays.copyOf(this.A01, i);
            Comparator comparator = this.A00;
            Arrays.sort(copyOf, comparator);
            Object[] objArr = new Object[this.size];
            for (int i2 = 0; i2 < this.size; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (comparator.compare(copyOf[i3], copyOf[i2]) == 0) {
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append("keys required to be distinct but compared as equal: ");
                        A1A.append(copyOf[i3]);
                        A1A.append(" and ");
                        throw C66582MXn.A0j(copyOf[i2], A1A);
                    }
                }
                objArr[Arrays.binarySearch(copyOf, Pxe.A0t(this.A01, i2), comparator)] = Pxe.A0t(this.A02, i2);
            }
            ImmutableSortedMap immutableSortedMap = ImmutableSortedMap.A03;
            RegularImmutableSortedSet regularImmutableSortedSet2 = RegularImmutableSortedSet.A00;
            regularImmutableSortedSet = new RegularImmutableSortedSet(ImmutableList.asImmutableList(copyOf), comparator);
            immutableList = ImmutableList.asImmutableList(objArr);
        } else {
            Comparator comparator2 = this.A00;
            Object A0t = Pxe.A0t(this.A01, 0);
            Object A0t2 = Pxe.A0t(this.A02, 0);
            ImmutableSortedMap immutableSortedMap2 = ImmutableSortedMap.A03;
            RegularImmutableSortedSet regularImmutableSortedSet3 = RegularImmutableSortedSet.A00;
            regularImmutableSortedSet = new RegularImmutableSortedSet(ImmutableList.of(A0t), comparator2);
            immutableList = ImmutableList.of(A0t2);
        }
        return new ImmutableSortedMap(immutableList, (ImmutableSortedMap) null, regularImmutableSortedSet);
    }

    public final /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object obj, Object obj2) {
        int i = this.size + 1;
        int length = this.A01.length;
        if (i > length) {
            int A002 = 1J3.A00(length, i);
            this.A01 = Arrays.copyOf(this.A01, A002);
            this.A02 = Arrays.copyOf(this.A02, A002);
        }
        1J2.A01(obj, obj2);
        Object[] objArr = this.A01;
        int i2 = this.size;
        objArr[i2] = obj;
        this.A02[i2] = obj2;
        this.size = i2 + 1;
        return this;
    }
}
