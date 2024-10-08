package X;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public final class SNJ {
    public final C13886Tj9 A00;
    public final Map A01;

    public SNJ(C13886Tj9 tj9, String str, String str2, Map map) {
        0qQ.A0B(str2, 3);
        this.A00 = tj9;
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A01 = A1E;
        A1E.put("composer_session_id", str);
        A1E.put(AnonymousClass000.A00(738), str2);
        if (map != null) {
            A1E.putAll(map);
        }
    }

    public static final void A00(SNJ snj, String str, Map map) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.putAll(snj.A01);
        if (map != null) {
            A1E.putAll(map);
        }
        HashMap A1E2 = AnonymousClass7TE.A1E();
        A01("debug_message", A1E, A1E2);
        A01("media_composition_hash", A1E, A1E2);
        A01("reason", A1E, A1E2);
        A01("retry_attempt_number", A1E, A1E2);
        A01("decoder_debug_info", A1E, A1E2);
        A1E.put("debug_info", A1E2.toString());
        C13886Tj9 tj9 = snj.A00;
        if (tj9 != null) {
            tj9.logEvent(str, A1E);
        }
    }

    public static void A01(Object obj, AbstractMap abstractMap, AbstractMap abstractMap2) {
        if (abstractMap.containsKey(obj)) {
            abstractMap2.put(obj, abstractMap.get(obj));
        }
    }
}
