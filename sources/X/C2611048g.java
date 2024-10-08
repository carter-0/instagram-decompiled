package X;

import java.util.Comparator;

/* renamed from: X.48g  reason: invalid class name and case insensitive filesystem */
public final class C2611048g implements Comparator {
    public static final C2611048g A00 = new C2611048g();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String A0g = ((C254703su) obj).A0g();
        String A0g2 = ((C254703su) obj2).A0g();
        if (A0g == null || A0g2 == null) {
            0wb.A03("direct_message_missing_msg_id", "One or more messages missing msg_id when comparing two DirectMessages");
            if (A0g != null) {
                if (A0g2 == null) {
                    return 1;
                }
            } else if (A0g2 == null) {
                return 0;
            } else {
                return -1;
            }
        }
        return AnonymousClass48V.A01.compare(A0g, A0g2);
    }
}
