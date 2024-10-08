package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.AUt  reason: case insensitive filesystem */
public final class C40179AUt implements C340147km {
    public static C343047pa A00(List list, int i, int i2) {
        float f = ((float) i) / ((float) i2);
        Iterator it = list.iterator();
        C343047pa r9 = null;
        double d = Double.MAX_VALUE;
        int i3 = AnonymousClass972.MUTABLE_FLAG_MASK;
        C343047pa r6 = null;
        while (it.hasNext()) {
            C343047pa r3 = (C343047pa) it.next();
            int i4 = r3.A01;
            int i5 = r3.A02;
            int i6 = i4 * i5;
            if (i6 > i3 && (i4 < i2 || r6 == null)) {
                r6 = r3;
                i3 = i6;
            }
            if (AnonymousClass7TE.A00(((float) i5) / ((float) i4), f) <= 0.05f) {
                double abs = (double) Math.abs(i4 - i2);
                if (abs < d) {
                    d = abs;
                    r9 = r3;
                }
            }
        }
        if (r9 != null) {
            return r9;
        }
        if (r6 != null) {
            return r6;
        }
        throw AnonymousClass7TE.A15("This device has no compatible camera sizes.");
    }

    public final C343137pj Ap9(C340177kp r5, C340177kp r6, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        C343047pa A00 = A00(C343037pZ.A00(list2, list3), i, i2);
        return new C343137pj(A00, A00(list, i, i2), A00, (C343047pa) null);
    }

    public final C343137pj Bc4(C340177kp r5, List list, List list2, int i, int i2, int i3) {
        return new C343137pj(A00(list2, i, i2), A00(list, i, i2), (C343047pa) null, (C343047pa) null);
    }

    public final C343137pj Bf6(List list, int i, int i2, int i3) {
        return new C343137pj(A00(list, i, i2), (C343047pa) null, (C343047pa) null, (C343047pa) null);
    }

    public final C343137pj CEC(C340177kp r4, List list, List list2, int i, int i2, int i3) {
        C343047pa A00 = A00(C343037pZ.A00(list, list2), i, i2);
        return new C343137pj(A00, (C343047pa) null, A00, (C343047pa) null);
    }
}
