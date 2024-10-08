package X;

import java.util.Comparator;

/* renamed from: X.48f  reason: invalid class name and case insensitive filesystem */
public final class C2610948f implements Comparator {
    public static final C2610948f A00 = new C2610948f();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C254703su r7 = (C254703su) obj;
        C254703su r8 = (C254703su) obj2;
        String A0f = r7.A0f();
        String A0f2 = r8.A0f();
        String str = "(null msg id)";
        if (A0f == null) {
            String A0g = r7.A0g();
            if (A0g == null) {
                A0g = str;
            }
            0wb.A03("direct_message_missing_client_context", 002.A0R(A0g, " has null client context"));
        }
        if (A0f2 == null) {
            String A0g2 = r8.A0g();
            if (A0g2 != null) {
                str = A0g2;
            }
            0wb.A03("direct_message_missing_client_context", 002.A0R(str, " has null client context"));
        }
        if (A0f != null) {
            if (A0f2 != null) {
                return A0f.compareTo(A0f2);
            }
            return 1;
        } else if (A0f2 == null) {
            return 0;
        } else {
            return -1;
        }
    }
}
