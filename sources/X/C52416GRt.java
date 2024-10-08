package X;

import android.graphics.LinearGradient;
import java.util.List;

/* renamed from: X.GRt  reason: case insensitive filesystem */
public abstract class C52416GRt {
    public static final int[] A02(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = C285595Rx.A00(((AnonymousClass5RW) list.get(i)).A00);
        }
        return iArr;
    }

    public static final LinearGradient A00(List list, List list2, int i, long j, long j2) {
        float[] fArr;
        A01(list, list2);
        float A01 = C289295dM.A01(j);
        float A02 = C289295dM.A02(j);
        float A012 = C289295dM.A01(j2);
        float A022 = C289295dM.A02(j2);
        int[] A023 = A02(list);
        if (list2 != null) {
            fArr = 00k.A0w(list2);
        } else {
            fArr = null;
        }
        return new LinearGradient(A01, A02, A012, A022, A023, fArr, C52417GRu.A00(i));
    }

    public static final void A01(List list, List list2) {
        int size = list.size();
        if (list2 == null) {
            if (size < 2) {
                throw AnonymousClass7TE.A0w("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (size != list2.size()) {
            throw AnonymousClass7TE.A0w("colors and colorStops arguments must have equal length.");
        }
    }
}
