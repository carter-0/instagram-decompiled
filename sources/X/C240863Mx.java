package X;

import android.graphics.Color;
import com.instagram.api.schemas.RingSpec;

/* renamed from: X.3Mx  reason: invalid class name and case insensitive filesystem */
public abstract class C240863Mx {
    public static final int[] A00(RingSpec ringSpec) {
        String A0D;
        0qQ.A0B(ringSpec, 0);
        int[] iArr = new int[ringSpec.Ap5().size()];
        int size = ringSpec.Ap5().size();
        for (int i = 0; i < size; i++) {
            if (00p.A0k((String) ringSpec.Ap5().get(i), "#", false)) {
                A0D = (String) ringSpec.Ap5().get(i);
            } else {
                A0D = 002.A0D((String) ringSpec.Ap5().get(i), '#');
            }
            iArr[i] = Color.parseColor(A0D);
        }
        return iArr;
    }
}
