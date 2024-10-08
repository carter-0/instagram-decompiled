package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.RuL  reason: case insensitive filesystem */
public final class C10566RuL {
    public Long A00;
    public final C10425Rs1 A01;
    public final Map A02;

    public C10566RuL(C10425Rs1 rs1, String str, Map map) {
        Long l;
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A02 = A1E;
        this.A01 = rs1;
        A1E.put("composer_session_id", str);
        if (map != null) {
            A1E.putAll(map);
        }
        if (rs1 != null) {
            l = Long.valueOf(rs1.A01.generateNewFlowId(rs1.A00));
        } else {
            l = null;
        }
        this.A00 = l;
    }
}
