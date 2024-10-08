package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.S4o  reason: case insensitive filesystem */
public final class C10994S4o {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    @Deprecated
    public final Uri[] A03;
    public final SIc[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C10994S4o s4o = (C10994S4o) obj;
            if (this.A00 != s4o.A00 || !Arrays.equals(this.A04, s4o.A04) || !Arrays.equals(this.A01, s4o.A01) || !Arrays.equals(this.A02, s4o.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = (int) (0 >>> 32);
        return ((((((((((((this.A00 * 31) - 1) * 31) + i) * 31) + Arrays.hashCode(this.A04)) * 31) + Arrays.hashCode(this.A01)) * 31) + Arrays.hashCode(this.A02)) * 31) + i) * 31;
    }

    public C10994S4o(int[] iArr, long[] jArr, SIc[] sIcArr, int i) {
        Uri uri;
        int length = iArr.length;
        int length2 = sIcArr.length;
        int i2 = 0;
        C11366SPh.A01(AnonymousClass7TF.A1S(length, length2));
        this.A00 = i;
        this.A01 = iArr;
        this.A04 = sIcArr;
        this.A02 = jArr;
        this.A03 = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.A03;
            if (i2 < uriArr.length) {
                SIc sIc = sIcArr[i2];
                if (sIc == null) {
                    uri = null;
                } else {
                    C10995S4p s4p = sIc.A03;
                    s4p.getClass();
                    uri = s4p.A01;
                }
                uriArr[i2] = uri;
                i2++;
            } else {
                return;
            }
        }
    }
}
