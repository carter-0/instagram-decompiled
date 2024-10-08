package X;

import java.util.Comparator;

/* renamed from: X.Ijz  reason: case insensitive filesystem */
public final class C58006Ijz implements Comparator {
    public static final C58006Ijz A00 = new Object();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass5VN A04 = ((AnonymousClass5SX) obj).A04();
        AnonymousClass5VN A042 = ((AnonymousClass5SX) obj2).A04();
        int compare = Float.compare(A042.A02, A04.A02);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Float.compare(A04.A03, A042.A03);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Float.compare(A04.A00, A042.A00);
        if (compare3 == 0) {
            return Float.compare(A042.A01, A04.A01);
        }
        return compare3;
    }
}
