package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.4Re  reason: invalid class name and case insensitive filesystem */
public final class C264764Re {
    public final int[] A00;
    public final long[] A01;
    public final Uri[] A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C264764Re r5 = (C264764Re) obj;
            if (!Arrays.equals(this.A02, r5.A02) || !Arrays.equals(this.A00, r5.A00) || !Arrays.equals(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = (int) (0 >>> 32);
        return (((((((((i - 31) * 31) + Arrays.hashCode(this.A02)) * 31) + Arrays.hashCode(this.A00)) * 31) + Arrays.hashCode(this.A01)) * 31) + i) * 31;
    }

    public C264764Re(int[] iArr, long[] jArr, Uri[] uriArr) {
        C256703wD.A03(iArr.length == uriArr.length);
        this.A00 = iArr;
        this.A02 = uriArr;
        this.A01 = jArr;
    }
}
