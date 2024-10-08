package X;

import com.instagram.api.schemas.TextEntityType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CgF  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44519CgF {
    public static Map A00(C46290DTt dTt) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTt.AyC() != null) {
            A1H.put("display_text", dTt.AyC());
        }
        if (dTt.B1t() != null) {
            TextEntityType B1t = dTt.B1t();
            0qQ.A0B(B1t, 0);
            A1H.put("entity_type", B1t.A00);
        }
        if (dTt.getId() != null) {
            C41845B3m.A0x(dTt.getId(), A1H);
        }
        if (dTt.getUrl() != null) {
            C41845B3m.A0y(dTt.getUrl(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
