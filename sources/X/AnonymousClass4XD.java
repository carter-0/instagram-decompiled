package X;

import android.util.Log;
import java.util.List;

/* renamed from: X.4XD  reason: invalid class name */
public class AnonymousClass4XD extends C256733wG implements AnonymousClass4XE {
    public final C256763wJ A00;

    public final long AeC(long j, long j2) {
        C256763wJ r4 = this.A00;
        long A01 = r4.A01(j);
        if (A01 == -1) {
            return (long) ((int) (r4.A05((j2 - r4.A04) + r4.A01, j) - r4.A03(j, j2)));
        }
        return A01;
    }

    public final long AzV(long j, long j2) {
        return this.A00.A04(j, j2);
    }

    public final long B61(long j, long j2) {
        return this.A00.A03(j, j2);
    }

    public final long B6B() {
        return this.A00.A05;
    }

    public final long BWL(long j, long j2) {
        C256763wJ r6 = this.A00;
        if (r6.A06 != null) {
            return -9223372036854775807L;
        }
        long A03 = r6.A03(j, j2);
        long A01 = r6.A01(j);
        if (A01 == -1) {
            A01 = (long) ((int) (r6.A05((j2 - r6.A04) + r6.A01, j) - r6.A03(j, j2)));
        }
        long j3 = A03 + A01;
        return (r6.A02(j3) + r6.A04(j3, j)) - r6.A01;
    }

    public final int BeW(long j) {
        return this.A00.A00(j);
    }

    public final long BrO(long j) {
        return this.A00.A01(j);
    }

    public final long BrS(long j, long j2) {
        return this.A00.A05(j, j2);
    }

    public final long BrT(long j) {
        int i;
        int i2;
        long j2;
        long j3;
        C256763wJ r3 = this.A00;
        if (!(r3 instanceof C256753wI)) {
            return -1;
        }
        C256753wI r32 = (C256753wI) r3;
        long A01 = r32.A01(-9223372036854775807L);
        long j4 = r32.A05;
        if (A01 <= 0 || j4 < 0) {
            return -1;
        }
        List list = r32.A06;
        if (A01 == ((long) list.size())) {
            j3 = ((j4 + A01) - 1) + j;
            i = r32.A00.A01;
        } else {
            i = ((C39797A9s) list.get(list.size() - 1)).A00;
            if (j >= ((long) i)) {
                j3 = ((j4 + A01) - 1) + j;
            } else {
                C39797A9s a9s = (C39797A9s) list.get(0);
                if (j < ((long) (a9s.A00 - (a9s.A02 - 1)))) {
                    return -1;
                }
                int size = list.size() - 1;
                int i3 = 0;
                while (i3 <= size) {
                    int i4 = (i3 + size) / 2;
                    C39797A9s a9s2 = (C39797A9s) list.get(i4);
                    int i5 = a9s2.A00;
                    int i6 = i5 + 1;
                    int i7 = i5 - (a9s2.A02 - 1);
                    long j5 = (long) i6;
                    if (j5 <= j) {
                        i3 = i4 + 1;
                    } else if (j5 > j && i4 != 0 && ((long) i7) > j) {
                        size = i4 - 1;
                    } else if (j5 <= j || (i4 != 0 && ((long) i7) > j)) {
                        throw new IndexOutOfBoundsException("Segment Index out of Segment Timeline bounds");
                    } else {
                        j2 = ((long) a9s2.A00) - j;
                        int i8 = a9s2.A02;
                        if (j2 >= ((long) i8)) {
                            return -1;
                        }
                        j3 = ((long) a9s2.A01) + j4 + ((long) (i8 - 1));
                        return j3 - j2;
                    }
                }
                Long valueOf = Long.valueOf(j);
                int i9 = -1;
                if (list.size() > 0) {
                    i2 = ((C39797A9s) list.get(0)).A00;
                } else {
                    i2 = -1;
                }
                Integer valueOf2 = Integer.valueOf(i2);
                if (list.size() > 0) {
                    i9 = ((C39797A9s) list.get(list.size() - 1)).A00;
                }
                Log.w("SegmentTemplate", String.format("Search Fail; Index: %d, Start predicted num: %d, End predicted num: %d, Segment Timeline Size: %d", new Object[]{valueOf, valueOf2, Integer.valueOf(i9), Integer.valueOf(list.size())}));
                return -1;
            }
        }
        j2 = (long) i;
        return j3 - j2;
    }

    public final C256573vz BrV(long j) {
        return this.A00.A06(this, j);
    }

    public final long C7P(long j) {
        return this.A00.A02(j);
    }

    public final boolean isExplicit() {
        return this.A00.A08();
    }

    public AnonymousClass4XD(C256683wB r1, C256763wJ r2, List list, List list2, List list3, List list4) {
        super(r1, r2, list, list2, list3, list4);
        this.A00 = r2;
    }
}
