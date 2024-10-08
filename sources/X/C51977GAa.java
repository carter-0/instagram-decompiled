package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GAa  reason: case insensitive filesystem */
public abstract /* synthetic */ class C51977GAa {
    public static Map A00(C245923dh r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AYn() != null) {
            A1H.put("actor_id", r3.AYn());
        }
        if (r3.B2q() != null) {
            A1H.put("explanation", r3.B2q());
        }
        if (r3.B2v() != null) {
            A1H.put(AnonymousClass000.A00(3080), r3.B2v());
        }
        if (r3.BIL() != null) {
            A1H.put("interest", r3.BIL());
        }
        if (r3.BIM() != null) {
            A1H.put("interest_id", r3.BIM());
        }
        if (r3.CSs() != null) {
            A1H.put("is_explanation_clickable", r3.CSs());
        }
        if (r3.Bxw() != null) {
            A1H.put(AnonymousClass000.A00(1835), r3.Bxw());
        }
        if (r3.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, r3.getTitle());
        }
        if (r3.C7s() != null) {
            A1H.put("title_id", r3.C7s());
        }
        if (r3.C8V() != null) {
            A1H.put("topic", r3.C8V());
        }
        return 0Yt.A0B(A1H);
    }
}
