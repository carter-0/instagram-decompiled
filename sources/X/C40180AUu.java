package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.AUu  reason: case insensitive filesystem */
public final class C40180AUu implements C340147km {
    public final float A00;
    public final int A01;
    public final int A02;

    public final C343137pj Bf6(List list, int i, int i2, int i3) {
        0qQ.A0B(list, 0);
        C343047pa A012 = A01(list, this.A00, this.A01);
        return new C343137pj(A012, A012, (C343047pa) null, (C343047pa) null);
    }

    public C40180AUu(int i, float f) {
        this.A01 = i;
        this.A02 = i;
        this.A00 = f;
    }

    public static C343137pj A00(C40180AUu aUu, List list, List list2, List list3) {
        0qQ.A07(list);
        List A002 = C343077pd.A00(C343077pd.A01, C343057pb.A01(list2, list3));
        0qQ.A07(A002);
        int i = aUu.A01;
        float f = aUu.A00;
        C343047pa A012 = A01(list, f, i);
        C343047pa A013 = A01(A002, f, aUu.A02);
        return new C343137pj(A013, A012, A013, (C343047pa) null);
    }

    public static final C343047pa A01(List list, float f, int i) {
        Iterator it = list.iterator();
        double d = Double.MAX_VALUE;
        C343047pa r14 = null;
        C343047pa r13 = null;
        int i2 = AnonymousClass972.MUTABLE_FLAG_MASK;
        double d2 = Double.MAX_VALUE;
        while (it.hasNext()) {
            C343047pa r10 = (C343047pa) it.next();
            int i3 = r10.A01;
            int i4 = r10.A02;
            int i5 = i3 * i4;
            if (i5 > i2) {
                r13 = r10;
                i2 = i5;
            }
            float f2 = (float) i4;
            float f3 = f;
            double abs = (double) Math.abs(Math.min((int) (f2 / f), i3) - i);
            if (abs <= d && (abs != d || ((double) AnonymousClass7TE.A00(f3, f2 / ((float) i3))) <= Math.abs(((double) f3) - d2))) {
                d = abs;
                d2 = (double) (f2 / ((float) i3));
                r14 = r10;
            }
        }
        if (r14 != null || r13 == null) {
            return r14;
        }
        return r13;
    }

    public final C343137pj Ap9(C340177kp r2, C340177kp r3, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        AnonymousClass7TG.A1T(list, list2, list3);
        return A00(this, C343077pd.A00(C343077pd.A00, list), list3, list2);
    }

    public final C343137pj Bc4(C340177kp r5, List list, List list2, int i, int i2, int i3) {
        AnonymousClass7TG.A1N(list, list2);
        List A002 = C343077pd.A00(C343077pd.A00, list);
        0qQ.A07(A002);
        List A003 = C343077pd.A00(C343077pd.A01, list2);
        0qQ.A07(A003);
        int i4 = this.A01;
        float f = this.A00;
        return new C343137pj(A01(A003, f, this.A02), A01(A002, f, i4), (C343047pa) null, (C343047pa) null);
    }

    public final C343137pj CEC(C340177kp r2, List list, List list2, int i, int i2, int i3) {
        AnonymousClass7TG.A1N(list, list2);
        return A00(this, C343077pd.A00(C343077pd.A00, list), list2, list);
    }
}
