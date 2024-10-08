package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CVp  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44098CVp {
    public static Map A00(DSI dsi) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dsi.CEY() != null) {
            List CEY = dsi.CEY();
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = CEY.iterator();
            while (it.hasNext()) {
                C41847B3o.A1X(A1C, it);
            }
            A1H.put("video_versions", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
