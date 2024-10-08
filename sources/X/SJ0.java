package X;

import java.util.Arrays;

public final class SJ0 {
    public static final C10994S4o A01;
    public static final SJ0 A02 = new SJ0(new C10994S4o[0]);
    public final C10994S4o[] A00;

    static {
        C10994S4o s4o = new C10994S4o(new int[0], new long[0], new SIc[0], -1);
        int[] iArr = s4o.A01;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = s4o.A02;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        A01 = new C10994S4o(copyOf, copyOf2, (SIc[]) Arrays.copyOf(s4o.A04, 0), 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && Arrays.equals(this.A00, ((SJ0) obj).A00);
        }
        return true;
    }

    public final int hashCode() {
        return 961 + Arrays.hashCode(this.A00);
    }

    public SJ0(C10994S4o[] s4oArr) {
        this.A00 = s4oArr;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AdPlaybackState(adsId=");
        A1A.append((Object) null);
        A1A.append(", adResumePositionUs=");
        A1A.append(0);
        A1A.append(", adGroups=[");
        return AnonymousClass7TF.A0l("])", A1A);
    }
}
