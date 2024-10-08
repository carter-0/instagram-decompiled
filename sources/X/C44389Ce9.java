package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ce9  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44389Ce9 {
    public static Map A00(C46310DUn dUn) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUn.B4B() != null) {
            A1H.put("fb_entity_author_id", dUn.B4B());
        }
        if (dUn.B4C() != null) {
            A1H.put("fb_entity_id", dUn.B4C());
        }
        if (dUn.B4D() != null) {
            A1H.put("fb_entity_subtype", dUn.B4D());
        }
        if (dUn.B4E() != null) {
            A1H.put("fb_entity_type", dUn.B4E());
        }
        if (dUn.B4F() != null) {
            A1H.put("fb_entity_url", dUn.B4F());
        }
        if (dUn.B4V() != null) {
            A1H.put("fb_reshare_session_id", dUn.B4V());
        }
        if (dUn.BSu() != null) {
            A1H.put("mib_extid", dUn.BSu());
        }
        if (dUn.getPk() != null) {
            A1H.put("pk", dUn.getPk());
        }
        return 0Yt.A0B(A1H);
    }
}
