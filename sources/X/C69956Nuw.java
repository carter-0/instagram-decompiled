package X;

import java.util.Map;

/* renamed from: X.Nuw  reason: case insensitive filesystem */
public abstract class C69956Nuw {
    public static final void A00(0wc r1, String str, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(r1, "direct_in_thread_translation_events");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            A0e.A9H("event_data", map);
            A0e.Cgf();
        }
    }
}
