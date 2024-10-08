package X;

import android.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

/* renamed from: X.3wJ  reason: invalid class name and case insensitive filesystem */
public abstract class C256763wJ extends C256563vy {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List A06;
    public final long A07;

    public C256763wJ(C256573vz r9, List list, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        super(r9, j, j2);
        this.A05 = j3;
        this.A02 = j4;
        this.A06 = list;
        this.A01 = j5;
        this.A07 = j6;
        this.A04 = j7;
        this.A00 = i;
        this.A03 = j8;
    }

    public C256573vz A06(C256733wG r11, long j) {
        C45443CwV cwV;
        long j2 = j;
        C256753wI r4 = (C256753wI) this;
        long j3 = 0;
        if (r4.A06 != null) {
            C45370CvC cvC = r4.A00;
            if (cvC == null || !r4.A03) {
                int i = (int) (j - r4.A05);
                if (!r4.A07(i).A05 || cvC == null) {
                    j3 = r4.A07(i).A04;
                    cwV = r4.A02;
                }
            }
            j2 = (long) r4.A00(j);
            cwV = cvC.A03;
        } else {
            j3 = (j - r4.A05) * r4.A02;
            cwV = r4.A02;
        }
        C256683wB r0 = r11.A02;
        return new C256573vz(cwV.A00(r0.A0T, r0.A05, j2, j3), 0, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r6 = (X.C256753wI) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(long r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C256753wI
            if (r0 == 0) goto L_0x003e
            r6 = r7
            X.3wI r6 = (X.C256753wI) r6
            java.util.List r5 = r6.A06
            if (r5 == 0) goto L_0x003e
            X.CvC r4 = r6.A00
            if (r4 == 0) goto L_0x003e
            long r0 = r6.A05
            long r8 = r8 - r0
            int r3 = (int) r8
            int r2 = r6.A00
            int r0 = r5.size()
            if (r2 == r0) goto L_0x0037
            if (r3 < r2) goto L_0x0030
            int r0 = r5.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r5.get(r0)
            X.A9s r0 = (X.C39797A9s) r0
            int r1 = r0.A00
            int r3 = r3 - r2
            int r0 = r3 + 1
            int r1 = r1 + r0
            return r1
        L_0x0030:
            X.A9s r0 = r6.A07(r3)
            int r1 = r0.A00
            return r1
        L_0x0037:
            int r0 = r4.A01
            int r3 = r3 + r0
            int r3 = r3 - r2
            int r1 = r3 + 1
            return r1
        L_0x003e:
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256763wJ.A00(long):int");
    }

    public long A01(long j) {
        int i;
        if (this.A06 != null) {
            i = this.A00;
        } else if (j == -9223372036854775807L) {
            return -1;
        } else {
            long j2 = (this.A02 * 1000000) / this.A01;
            i = (int) (((j + j2) - 1) / j2);
        }
        return (long) i;
    }

    public final long A02(long j) {
        long j2;
        List list = this.A06;
        long j3 = j - this.A05;
        if (list != null) {
            j2 = A07((int) j3).A04 - this.A00;
        } else {
            j2 = j3 * this.A02;
        }
        return Util.A09(j2, 1000000, this.A01);
    }

    public final long A04(long j, long j2) {
        long j3;
        if (this.A06 != null) {
            j3 = A07((int) (j - this.A05)).A03;
        } else {
            long A012 = A01(j2);
            if (A012 != -1 && j == (this.A05 + A012) - 1) {
                return j2 - A02(j);
            }
            j3 = this.A02;
        }
        return (j3 * 1000000) / this.A01;
    }

    public final long A05(long j, long j2) {
        long j3 = this.A05;
        long A012 = A01(j2);
        if (A012 != 0) {
            if (this.A06 == null) {
                long j4 = j3 + (j / ((this.A02 * 1000000) / this.A01));
                if (j4 >= j3) {
                    if (A012 == -1) {
                        return j4;
                    }
                    return Math.min(j4, (j3 + A012) - 1);
                }
            } else {
                long j5 = (A012 + j3) - 1;
                long j6 = j3;
                while (j6 <= j5) {
                    long j7 = ((j5 - j6) / 2) + j6;
                    long A022 = A02(j7);
                    if (A022 < j) {
                        j6 = j7 + 1;
                    } else if (A022 <= j) {
                        return j7;
                    } else {
                        j5 = j7 - 1;
                    }
                }
                if (j6 == j3) {
                    return j6;
                }
                return j5;
            }
        }
        return j3;
    }

    public final C39797A9s A07(int i) {
        int i2;
        int i3 = i;
        int i4 = this.A00;
        List list = this.A06;
        if (i4 == list.size()) {
            if (i3 >= i4) {
                i3 = i4 - 1;
                Log.w("SegmentTemplate", "index was past bounds of the list, so clamping to final element");
            }
            return (C39797A9s) list.get(i3);
        }
        int size = list.size() - 1;
        int i5 = i + ((C39797A9s) list.get(0)).A01;
        int i6 = 0;
        while (i6 <= size) {
            int i7 = (i6 + size) / 2;
            C39797A9s a9s = (C39797A9s) list.get(i7);
            int i8 = a9s.A01;
            int i9 = a9s.A02 + i8;
            if (i9 <= i5) {
                i6 = i7 + 1;
            } else if (i9 > i5 && i7 != 0 && i8 > i5) {
                size = i7 - 1;
            } else if (i9 <= i5 || (i7 != 0 && i8 > i5)) {
                throw new IndexOutOfBoundsException("Segment Index out of Segment Timeline bounds");
            } else {
                long j = a9s.A04;
                long j2 = a9s.A03;
                int i10 = a9s.A01;
                int i11 = i5 - i10;
                return new C39797A9s(1, i10, (a9s.A00 - (a9s.A02 - 1)) + i11, j + (j2 * ((long) i11)), j2, a9s.A05);
            }
        }
        Integer valueOf = Integer.valueOf(i5);
        int i12 = -1;
        if (list.size() > 0) {
            i2 = ((C39797A9s) list.get(0)).A01;
        } else {
            i2 = -1;
        }
        Integer valueOf2 = Integer.valueOf(i2);
        if (list.size() > 0) {
            i12 = ((C39797A9s) list.get(list.size() - 1)).A01;
        }
        Log.w("SegmentTemplate", String.format("Search Fail; Index: %d, Start relative index: %d, End relative index: %d, Segment Timeline Size: %d", new Object[]{valueOf, valueOf2, Integer.valueOf(i12), Integer.valueOf(list.size())}));
        throw new IndexOutOfBoundsException("Segment Index out of Segment Timeline bounds");
    }

    public boolean A08() {
        if (this.A06 != null) {
            return true;
        }
        return false;
    }

    public final long A03(long j, long j2) {
        if (A01(j) == -1) {
            long j3 = this.A07;
            if (j3 != -9223372036854775807L) {
                return Math.max(this.A05, A05((j2 - this.A04) - j3, j));
            }
        }
        return this.A05;
    }
}
