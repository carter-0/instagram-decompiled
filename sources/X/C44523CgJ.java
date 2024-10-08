package X;

import com.instagram.api.schemas.TextPostAppSuggestionCardProfileContextIdentifier;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CgJ  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44523CgJ {
    public static Map A00(C279994zp r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AyB() != null) {
            A1H.put("display_string", r3.AyB());
        }
        if (r3.BEe() != null) {
            TextPostAppSuggestionCardProfileContextIdentifier BEe = r3.BEe();
            0qQ.A0B(BEe, 0);
            A1H.put("identifier", BEe.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
