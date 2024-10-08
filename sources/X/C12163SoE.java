package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.SoE  reason: case insensitive filesystem */
public final class C12163SoE implements C340147km {
    public final C343137pj Ap9(C340177kp r2, C340177kp r3, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        throw AnonymousClass7TE.A1B("Only photo mode is used");
    }

    public final C343137pj Bf6(List list, int i, int i2, int i3) {
        throw AnonymousClass7TE.A1B("Only photo mode is used");
    }

    public final C343137pj CEC(C340177kp r2, List list, List list2, int i, int i2, int i3) {
        throw AnonymousClass7TE.A1B("Only photo mode is used");
    }

    public final C343137pj Bc4(C340177kp r13, List list, List list2, int i, int i2, int i3) {
        AnonymousClass7TG.A1N(list, list2);
        int i4 = 0;
        C343047pa r5 = (C343047pa) list.get(0);
        Iterator it = list.iterator();
        C343047pa r9 = null;
        int i5 = 0;
        while (it.hasNext()) {
            C343047pa r4 = (C343047pa) it.next();
            int i6 = r4.A02;
            int i7 = r4.A01;
            int i8 = i6 * i7;
            if (AnonymousClass7TE.A00(((float) i6) / ((float) i7), 4.0f / 3.0f) <= 0.05f && i8 > i4) {
                r9 = r4;
                i4 = i8;
            } else if (i8 > i5) {
                r5 = r4;
                i5 = i8;
            }
        }
        if (r9 != null) {
            r5 = r9;
        }
        int i9 = i * i2;
        Iterator it2 = list2.iterator();
        C343047pa r8 = null;
        int i10 = Integer.MAX_VALUE;
        while (it2.hasNext()) {
            C343047pa r7 = (C343047pa) it2.next();
            int i11 = r7.A02;
            int i12 = r7.A01;
            int abs = Math.abs(i9 - (i11 * i12));
            if (abs < i10) {
                if (AnonymousClass7TE.A00(((float) i11) / ((float) i12), ((float) r5.A02) / ((float) r5.A01)) <= 0.05f) {
                    r8 = r7;
                    i10 = abs;
                }
            }
        }
        return new C343137pj(r8, r5, (C343047pa) null, (C343047pa) null);
    }
}
