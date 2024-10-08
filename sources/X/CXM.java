package X;

import com.instagram.api.schemas.Entity;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CXM {
    public static Map A00(Entity entity) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (entity.getId() != null) {
            C41845B3m.A0x(entity.getId(), A1H);
        }
        if (entity.CAs() != null) {
            A1H.put("typename", entity.CAs());
        }
        if (entity.getUrl() != null) {
            C41845B3m.A0y(entity.getUrl(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
