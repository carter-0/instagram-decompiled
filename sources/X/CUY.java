package X;

import com.instagram.api.schemas.AppreciationUFIEntryActionType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CUY {
    public static Map A00(AnonymousClass5AV r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AYW() != null) {
            AppreciationUFIEntryActionType AYW = r3.AYW();
            0qQ.A0B(AYW, 0);
            A1H.put("action_type", AYW.A00);
        }
        r3.B9I();
        return C41845B3m.A0u("gift_count", Integer.valueOf(r3.B9I()), A1H);
    }
}
