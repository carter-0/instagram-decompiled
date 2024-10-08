package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B6G {
    public static Map A00(C2609047m r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r3.AdN();
        A1H.put("audience_type", Integer.valueOf(r3.AdN()));
        r3.COP();
        A1H.put("is_added_to_inbox", Boolean.valueOf(r3.COP()));
        if (r3.CQH() != null) {
            A1H.put("is_collaborator", r3.CQH());
        }
        if (r3.CTt() != null) {
            A1H.put("is_follower", r3.CTt());
        }
        if (r3.CVt() != null) {
            A1H.put("is_invited_collaborator", r3.CVt());
        }
        if (r3.Ccj() != null) {
            A1H.put("is_subscriber", r3.Ccj());
        }
        return 0Yt.A0B(A1H);
    }
}
