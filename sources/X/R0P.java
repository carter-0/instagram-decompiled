package X;

import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.RegularImmutableSortedMultiset;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.Arrays;
import java.util.Comparator;

public final class R0P extends R04 {
    public int A00;
    public boolean A01;
    public int[] A02 = new int[4];
    public final Comparator A03;
    public Object[] elements = new Object[4];

    /* renamed from: A03 */
    public final ImmutableSortedMultiset build() {
        int i;
        A01(false);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.A00;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.A02;
            int i4 = iArr[i2];
            if (i4 > 0) {
                Object[] objArr = this.elements;
                objArr[i3] = objArr[i2];
                iArr[i3] = i4;
                i3++;
            }
            i2++;
        }
        Arrays.fill(this.elements, i3, i, (Object) null);
        Arrays.fill(this.A02, i3, this.A00, 0);
        this.A00 = i3;
        Comparator comparator = this.A03;
        if (i3 != 0) {
            RegularImmutableSortedSet A07 = ImmutableSortedSet.A07(comparator, this.elements, i3);
            int i5 = this.A00;
            long[] jArr = new long[(i5 + 1)];
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i6 + 1;
                jArr[i7] = jArr[i6] + ((long) this.A02[i6]);
                i6 = i7;
            }
            this.A01 = true;
            return new RegularImmutableSortedMultiset(A07, jArr, 0, i5);
        } else if (NaturalOrdering.A00.equals(comparator)) {
            return RegularImmutableSortedMultiset.A03;
        } else {
            return new RegularImmutableSortedMultiset(comparator);
        }
    }

    public final /* bridge */ /* synthetic */ 1J3 add(Object obj) {
        A04(obj, 1);
        return this;
    }

    private void A01(boolean z) {
        int i;
        int i2 = this.A00;
        if (i2 != 0) {
            Object[] copyOf = Arrays.copyOf(this.elements, i2);
            Comparator comparator = this.A03;
            Arrays.sort(copyOf, comparator);
            int i3 = 1;
            for (int i4 = 1; i4 < copyOf.length; i4++) {
                if (comparator.compare(copyOf[i3 - 1], copyOf[i4]) < 0) {
                    copyOf[i3] = copyOf[i4];
                    i3++;
                }
            }
            Arrays.fill(copyOf, i3, this.A00, (Object) null);
            if (z) {
                int i5 = i3 * 4;
                int i6 = this.A00;
                if (i5 > i6 * 3) {
                    copyOf = Arrays.copyOf(copyOf, 1WJ.A02(((long) i6) + ((long) ((i6 / 2) + 1))));
                }
            }
            int[] iArr = new int[copyOf.length];
            for (int i7 = 0; i7 < this.A00; i7++) {
                int binarySearch = Arrays.binarySearch(copyOf, 0, i3, this.elements[i7], comparator);
                int i8 = this.A02[i7];
                if (i8 >= 0) {
                    i = iArr[binarySearch] + i8;
                } else {
                    i = i8 ^ -1;
                }
                iArr[binarySearch] = i;
            }
            this.elements = copyOf;
            this.A02 = iArr;
            this.A00 = i3;
        }
    }

    public R0P(Comparator comparator) {
        this.A01 = false;
        this.A00 = null;
        comparator.getClass();
        this.A03 = comparator;
    }

    public final void A04(Object obj, int i) {
        obj.getClass();
        1J2.A00(i, "occurrences");
        if (i != 0) {
            int i2 = this.A00;
            Object[] objArr = this.elements;
            int length = objArr.length;
            if (i2 == length) {
                A01(true);
            } else if (this.A01) {
                this.elements = Arrays.copyOf(objArr, length);
            }
            this.A01 = false;
            Object[] objArr2 = this.elements;
            int i3 = this.A00;
            objArr2[i3] = obj;
            this.A02[i3] = i;
            this.A00 = i3 + 1;
        }
    }
}
