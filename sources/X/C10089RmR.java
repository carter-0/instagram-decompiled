package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.RmR  reason: case insensitive filesystem */
public abstract class C10089RmR {
    public static final Map A00;
    public static final Map A01;

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A00 = A1E;
        HashMap A1E2 = AnonymousClass7TE.A1E();
        A01 = A1E2;
        Integer A0j = C51967G9n.A0j();
        A1E.put(A0j, "The Play Store app is either not installed or not the official version.");
        A1E.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        A1E.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        A1E2.put(A0j, "PLAY_STORE_NOT_FOUND");
        A1E2.put(-2, "INVALID_REQUEST");
        A1E2.put(-100, "INTERNAL_ERROR");
    }
}
