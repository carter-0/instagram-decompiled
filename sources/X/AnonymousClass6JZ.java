package X;

import java.util.Comparator;

/* renamed from: X.6JZ  reason: invalid class name */
public final class AnonymousClass6JZ implements Comparator {
    public static final AnonymousClass6JZ A00 = new Object();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass5VN r3 = (AnonymousClass5VN) ((0eP) obj).A00;
        float f = r3.A03;
        AnonymousClass5VN r2 = (AnonymousClass5VN) ((0eP) obj2).A00;
        int compare = Float.compare(f, r2.A03);
        if (compare == 0) {
            return Float.compare(r3.A00, r2.A00);
        }
        return compare;
    }
}
