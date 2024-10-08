package X;

import com.facebook.common.callercontext.CallerContextable;
import java.util.HashMap;

public abstract class FRK implements CallerContextable {
    public static final String __redex_internal_original_name = "BusinessAnalyticsUtil";

    public static final HashMap A00(boolean z, boolean z2, boolean z3) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("should_show_public_contacts", String.valueOf(z));
        A1E.put("should_show_category", String.valueOf(z2));
        A1E.put("should_show_discount", String.valueOf(z3));
        return A1E;
    }
}
