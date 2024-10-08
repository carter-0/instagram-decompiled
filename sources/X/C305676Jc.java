package X;

import java.util.Comparator;

/* renamed from: X.6Jc  reason: invalid class name and case insensitive filesystem */
public final class C305676Jc implements Comparator {
    public final /* synthetic */ Comparator A00;

    public C305676Jc(Comparator comparator) {
        this.A00 = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        int compare = this.A00.compare(obj, obj2);
        if (compare == 0) {
            return 29b.A00(Integer.valueOf(((AnonymousClass5SX) obj).A02), Integer.valueOf(((AnonymousClass5SX) obj2).A02));
        }
        return compare;
    }
}
