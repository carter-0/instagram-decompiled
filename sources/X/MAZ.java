package X;

import java.util.Comparator;
import java.util.Map;

public final class MAZ implements Comparator {
    public final int A00;
    public final Object A01;

    public MAZ(0sL r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable;
        Comparable comparable2;
        int i;
        switch (this.A00) {
            case 0:
                long j = ((AnonymousClass3Q2) obj).A0g;
                long j2 = ((AnonymousClass3Q2) obj2).A0g;
                if (j > j2) {
                    return -1;
                }
                return C51970G9q.A1U((j > j2 ? 1 : (j == j2 ? 0 : -1))) ? 1 : 0;
            case 1:
                int compare = ((Comparator) this.A01).compare(obj, obj2);
                if (compare == 0) {
                    boolean z = true;
                    comparable = Boolean.valueOf(AnonymousClass7TF.A1V(((C59832Ja7) obj2).A02));
                    if (((C59832Ja7) obj).A02 == null) {
                        z = false;
                    }
                    comparable2 = Boolean.valueOf(z);
                    break;
                } else {
                    return compare;
                }
            case 5:
                Map map = (Map) this.A01;
                Number A14 = C51966G9m.A14(((C320716sp) obj).A05, map);
                if (A14 != null) {
                    i = A14.intValue();
                } else {
                    i = Integer.MAX_VALUE;
                }
                comparable = Integer.valueOf(i);
                comparable2 = Integer.valueOf(C51967G9n.A04(C51966G9m.A14(((C320716sp) obj2).A05, map), Integer.MAX_VALUE));
                break;
            default:
                return AnonymousClass7TE.A0M(((0sL) this.A01).invoke(obj, obj2));
        }
        return 29b.A00(comparable, comparable2);
    }

    public MAZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
