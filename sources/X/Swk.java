package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Swk implements C296765qb {
    public final long[] A00;
    public final C264814Rj[] A01;

    public final long B2M(int i) {
        boolean z = true;
        C256703wD.A03(Pxf.A1R(i));
        long[] jArr = this.A00;
        if (i >= jArr.length) {
            z = false;
        }
        C256703wD.A03(z);
        return jArr[i];
    }

    public final List Atg(long j) {
        C264814Rj r1;
        int A04 = Util.A04(this.A00, j, false);
        if (A04 == -1 || (r1 = this.A01[A04]) == C264814Rj.A0D) {
            return Collections.emptyList();
        }
        return Collections.singletonList(r1);
    }

    public final int B2N() {
        return this.A00.length;
    }

    public final int BW7(long j) {
        long[] jArr = this.A00;
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
        if (binarySearch >= jArr.length) {
            return -1;
        }
        return binarySearch;
    }

    public Swk(long[] jArr, C264814Rj[] r2) {
        this.A01 = r2;
        this.A00 = jArr;
    }
}
