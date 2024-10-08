package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.RrP  reason: case insensitive filesystem */
public final class C10388RrP {
    public final C13886Tj9 A00;
    public final HashMap A01;

    public C10388RrP(C13886Tj9 tj9, String str, Map map) {
        0qQ.A0B(str, 2);
        this.A00 = tj9;
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A01 = A1E;
        A1E.put("waterfall_id", str);
        if (map != null) {
            A1E.putAll(map);
        }
    }
}
