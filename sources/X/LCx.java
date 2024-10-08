package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Map;

public final class LCx {
    public final AnonymousClass0JR A00;
    public final Map A01;
    public final UserSession A02;

    public final void A00() {
        Map map = this.A01;
        if (map.containsKey("open_camera")) {
            Object obj = map.get("open_camera");
            if (obj != null) {
                ((Number) obj).longValue();
                this.A00.now();
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        map.remove("open_camera");
    }

    public LCx(AnonymousClass0JR r2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = r2;
        Map synchronizedMap = Collections.synchronizedMap(AnonymousClass7TE.A1E());
        0qQ.A07(synchronizedMap);
        this.A01 = synchronizedMap;
    }
}
