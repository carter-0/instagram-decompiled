package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B6u  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41919B6u {
    public static Map A00(C255013tR r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Aic() != null) {
            A1H.put("business_response_time_in_sec", AnonymousClass7TH.A0D(r3.Aic()));
        }
        if (r3.Aid() != null) {
            A1H.put("business_responsiveness_time_text", r3.Aid());
        }
        if (r3.CGP() != null) {
            A1H.put("welcome_message_text", r3.CGP());
        }
        return 0Yt.A0B(A1H);
    }
}
