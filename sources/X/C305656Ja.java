package X;

import java.util.Comparator;

/* renamed from: X.6Ja  reason: invalid class name and case insensitive filesystem */
public final class C305656Ja implements Comparator {
    public static final C305656Ja A00 = new Object();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass5VN A04 = ((AnonymousClass5SX) obj).A04();
        AnonymousClass5VN A042 = ((AnonymousClass5SX) obj2).A04();
        int compare = Float.compare(A04.A01, A042.A01);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Float.compare(A04.A03, A042.A03);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Float.compare(A04.A00, A042.A00);
        if (compare3 == 0) {
            return Float.compare(A04.A02, A042.A02);
        }
        return compare3;
    }
}
