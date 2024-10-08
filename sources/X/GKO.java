package X;

import android.content.res.Resources;
import java.util.Arrays;

public final class GKO extends C266444Yx {
    public final int A00;
    public final Object[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && 0qQ.A0K(getClass(), obj.getClass())) {
                GKO gko = (GKO) obj;
                if (this.A00 != gko.A00 || !Arrays.equals(this.A01, gko.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final CharSequence A01(Resources resources) {
        String string;
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (length == 0) {
            string = resources.getString(this.A00);
        } else {
            string = resources.getString(this.A00, Arrays.copyOf(objArr, length));
        }
        0qQ.A07(string);
        return string;
    }

    public final int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public GKO(Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = objArr;
    }
}
