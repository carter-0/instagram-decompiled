package X;

import java.util.Comparator;

/* renamed from: X.FwA  reason: case insensitive filesystem */
public final class C51564FwA implements Comparator {
    public static final C51564FwA A00 = new C51564FwA();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String A0H = ((C276544tV) obj).A0H();
        String A0H2 = ((C276544tV) obj2).A0H();
        if (!(A0H == null || A0H2 == null)) {
            if (A0H.equals("emphasized")) {
                return -1;
            }
            if (!A0H.equals("neutral") || A0H2.equals("emphasized")) {
                return 1;
            }
            return -1;
        }
        return 1;
    }
}
