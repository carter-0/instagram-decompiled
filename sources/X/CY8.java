package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CY8 {
    public static Map A00(C46279DTi dTi) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTi.getId() != null) {
            C41845B3m.A0x(dTi.getId(), A1H);
        }
        if (dTi.C75() != null) {
            A1H.put("thumbnail_url", dTi.C75());
        }
        if (dTi.getTitle() != null) {
            C41845B3m.A12(dTi.getTitle(), A1H);
        }
        if (dTi.getUsername() != null) {
            A1H.put(Dbk.A00(), dTi.getUsername());
        }
        return 0Yt.A0B(A1H);
    }
}
