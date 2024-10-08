package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.4Rd  reason: invalid class name and case insensitive filesystem */
public final class C264754Rd {
    public static final C264754Rd A01 = new C264754Rd(new C264764Re[0]);
    public static final C264764Re A02;
    public final C264764Re[] A00;

    static {
        int max = Math.max(0, 0);
        int[] copyOf = Arrays.copyOf(new int[0], max);
        Arrays.fill(copyOf, 0, max, 0);
        long[] copyOf2 = Arrays.copyOf(new long[0], max);
        Arrays.fill(copyOf2, 0, max, -9223372036854775807L);
        A02 = new C264764Re(copyOf, copyOf2, (Uri[]) Arrays.copyOf(new Uri[0], 0));
    }

    public final C264764Re A00(int i) {
        if (i < 0) {
            return A02;
        }
        return this.A00[i];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && Arrays.equals(this.A00, ((C264754Rd) obj).A00);
        }
        return true;
    }

    public final int hashCode() {
        return 961 + Arrays.hashCode(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pxd.A00(351));
        sb.append((Object) null);
        sb.append(Pxd.A00(306));
        sb.append(0);
        sb.append(Pxd.A00(305));
        sb.append("])");
        return sb.toString();
    }

    public C264754Rd(C264764Re[] r1) {
        this.A00 = r1;
    }
}
