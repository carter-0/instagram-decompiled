package X;

import androidx.media3.common.Timeline;
import java.util.Arrays;

/* renamed from: X.XGb  reason: case insensitive filesystem */
public abstract class C21134XGb extends Timeline {
    public final int A00;
    public final Y8A A01;

    public final XcO A0B(XcO xcO, int i, boolean z) {
        C21142XGj xGj = (C21142XGj) this;
        int[] iArr = xGj.A03;
        int i2 = i + 1;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] != i2);
        }
        xGj.A05[binarySearch].A0B(xcO, i - iArr[binarySearch], true);
        throw null;
    }

    public static int A00(C21134XGb xGb, int i, boolean z) {
        if (z) {
            C22094XvK xvK = (C22094XvK) xGb.A01;
            int i2 = xvK.A01[i] + 1;
            int[] iArr = xvK.A02;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        } else if (i < xGb.A00 - 1) {
            return i + 1;
        } else {
            return -1;
        }
    }

    public C21134XGb(Y8A y8a) {
        this.A01 = y8a;
        this.A00 = ((C22094XvK) y8a).A02.length;
    }
}
