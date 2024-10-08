package X;

import java.util.Arrays;

/* renamed from: X.4TS  reason: invalid class name */
public final class AnonymousClass4TS implements AnonymousClass4TD {
    public S2T A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public boolean A03;
    public boolean A04;
    public long[] A05;
    public final C256683wB A06;
    public final AnonymousClass4XU A07 = new AnonymousClass4XU();

    public final boolean CaO() {
        return true;
    }

    public final void Cnj() {
    }

    public final void A00(long j) {
        int i;
        long[] jArr = this.A05;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = binarySearch ^ -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length || jArr[binarySearch] != j) {
                    i = binarySearch - 1;
                }
                binarySearch++;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch - 1;
        }
        this.A01 = i;
        if (!this.A03 || i != this.A05.length) {
            j = -9223372036854775807L;
        }
        this.A02 = j;
    }

    public final void A01(S2T s2t, boolean z) {
        long j;
        int i = this.A01;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.A05[i - 1];
        }
        this.A03 = z;
        this.A00 = s2t;
        long[] jArr = s2t.A02;
        this.A05 = jArr;
        long j2 = this.A02;
        if (j2 != -9223372036854775807L) {
            A00(j2);
        } else if (j != -9223372036854775807L) {
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            } else {
                do {
                    binarySearch++;
                    if (binarySearch >= jArr.length) {
                        break;
                    }
                } while (jArr[binarySearch] != j);
            }
            this.A01 = binarySearch;
        }
    }

    public final int E6J(AnonymousClass4PO r6, AnonymousClass4PQ r7, int i) {
        int i2 = this.A01;
        boolean z = false;
        if (i2 == this.A05.length) {
            z = true;
        }
        if (z && !this.A03) {
            r7.A00 = 4;
            return -4;
        } else if ((i & 2) != 0 || !this.A04) {
            r6.A00 = this.A06;
            this.A04 = true;
            return -5;
        } else if (z) {
            return -3;
        } else {
            if ((i & 1) == 0) {
                this.A01 = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] A002 = this.A07.A00(this.A00.A03[i2]);
                r7.A01(A002.length);
                r7.A02.put(A002);
            }
            r7.A01 = this.A05[i2];
            r7.A00 = 1;
            return -4;
        }
    }

    public final int Evj(long j) {
        int i;
        int i2 = this.A01;
        long[] jArr = this.A05;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = binarySearch ^ -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length || jArr[binarySearch] != j) {
                    i = binarySearch - 1;
                }
                binarySearch++;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch - 1;
        }
        int max = Math.max(i2, i);
        int i3 = max - this.A01;
        this.A01 = max;
        return i3;
    }

    public AnonymousClass4TS(C256683wB r3, S2T s2t, boolean z) {
        this.A06 = r3;
        this.A00 = s2t;
        this.A05 = s2t.A02;
        A01(s2t, z);
    }

    public final /* synthetic */ long C96(int i) {
        return -9223372036854775807L;
    }
}
