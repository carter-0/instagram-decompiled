package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AUr  reason: case insensitive filesystem */
public final class C40177AUr implements C340147km {
    public final C343137pj Bc4(C340177kp r2, List list, List list2, int i, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public final C343137pj CEC(C340177kp r2, List list, List list2, int i, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public final C343137pj Ap9(C340177kp r10, C340177kp r11, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        C343047pa r4;
        C343047pa r5;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (list2 == null || list2.isEmpty()) {
            A1C.addAll(list3);
        } else {
            for (Object next : list2) {
                if (list3.contains(next)) {
                    A1C.add(next);
                }
            }
        }
        List A00 = C343077pd.A00(C343077pd.A01, A1C);
        Collections.sort(A00, new ArV((Object) this, 2));
        if (A00.size() == 1) {
            r4 = (C343047pa) AnonymousClass7TE.A13(A00);
        } else {
            r4 = null;
        }
        C340177kp r52 = C340177kp.HIGH;
        if (r11.equals(r52)) {
            r4 = (C343047pa) A00.get(A00.size() - 1);
        } else if (r11.equals(C340177kp.MEDIUM)) {
            C343047pa r0 = (C343047pa) A00.get(A00.size() - 1);
            int i4 = (r0.A02 * r0.A01) / 2;
            int size = A00.size();
            do {
                size--;
                if (size < 0) {
                    break;
                }
                r4 = (C343047pa) A00.get(size);
            } while (r4.A02 * r4.A01 > i4);
        } else if (r11.equals(C340177kp.LOW)) {
            C343047pa r02 = (C343047pa) A00.get(A00.size() - 1);
            int i5 = (r02.A02 * r02.A01) / 3;
            int size2 = A00.size();
            do {
                size2--;
                if (size2 < 0) {
                    break;
                }
                r4 = (C343047pa) A00.get(size2);
            } while (r4.A02 * r4.A01 > i5);
        }
        r4.getClass();
        List A002 = C343077pd.A00(C343077pd.A00, list);
        ArrayList A1D = AnonymousClass7TE.A1D(A002);
        if (A1D.isEmpty()) {
            A1D.addAll(A002);
        }
        Collections.sort(A1D, new ArV((Object) this, 3));
        if (r10.equals(r52)) {
            r5 = (C343047pa) A1D.get(A1D.size() - 1);
        } else if (r10.equals(C340177kp.MEDIUM)) {
            int size3 = A1D.size();
            r5 = null;
            do {
                size3--;
                if (size3 < 0) {
                    break;
                }
                r5 = (C343047pa) A1D.get(size3);
            } while (r5.A02 * r5.A01 > 2097152);
        } else if (r10.equals(C340177kp.LOW)) {
            int size4 = A1D.size();
            r5 = null;
            do {
                size4--;
                if (size4 < 0) {
                    break;
                }
                r5 = (C343047pa) A1D.get(size4);
            } while (r5.A02 * r5.A01 > 1048576);
        } else {
            r5 = null;
        }
        return new C343137pj(r4, r5, r4, (C343047pa) null);
    }

    public final C343137pj Bf6(List list, int i, int i2, int i3) {
        float f;
        float f2;
        float max = ((float) Math.max(i, i2)) / ((float) Math.min(i, i2));
        Iterator it = list.iterator();
        int i4 = 0;
        C343047pa r5 = null;
        while (it.hasNext()) {
            C343047pa r4 = (C343047pa) it.next();
            int i5 = r4.A02;
            int i6 = r4.A01;
            if (max < ((float) Math.max(i5, i6)) / ((float) Math.min(i5, i6))) {
                f2 = (float) i6;
                f = f2 * max;
            } else {
                f = (float) i5;
                f2 = f / max;
            }
            int i7 = (int) (f * f2);
            if (i7 > i4) {
                r5 = r4;
                i4 = i7;
            }
        }
        return new C343137pj(r5, (C343047pa) null, (C343047pa) null, (C343047pa) null);
    }
}
