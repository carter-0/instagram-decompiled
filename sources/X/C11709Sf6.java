package X;

import androidx.media3.common.util.Util;
import java.util.Arrays;

/* renamed from: X.Sf6  reason: case insensitive filesystem */
public final class C11709Sf6 implements C13511Tbc {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    public final S5O Br9(long j) {
        long[] jArr = this.A04;
        int A022 = Util.A02(jArr, j, true);
        long j2 = jArr[A022];
        long[] jArr2 = this.A03;
        SJ4 sj4 = new SJ4(j2, jArr2[A022]);
        if (sj4.A01 >= j || A022 == this.A00 - 1) {
            return new S5O(sj4, sj4);
        }
        int i = A022 + 1;
        return new S5O(sj4, new SJ4(jArr[i], jArr2[i]));
    }

    public C11709Sf6(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            int i = length - 1;
            this.A05 = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ChunkIndex(length=");
        A1A.append(this.A00);
        A1A.append(", sizes=");
        A1A.append(Arrays.toString(this.A01));
        A1A.append(", offsets=");
        A1A.append(Arrays.toString(this.A03));
        A1A.append(", timeUs=");
        A1A.append(Arrays.toString(this.A04));
        A1A.append(", durationsUs=");
        A1A.append(Arrays.toString(this.A02));
        return AnonymousClass7TF.A0l(")", A1A);
    }
}
