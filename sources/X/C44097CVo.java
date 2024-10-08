package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CVo  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44097CVo {
    public static Map A00(AnonymousClass58M r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r3.getDurationInMs();
        A1H.put("duration_in_ms", Long.valueOf(r3.getDurationInMs()));
        if (r3.BGr() != null) {
            A1H.put("index", r3.BGr());
        }
        if (r3.getName() != null) {
            C41845B3m.A0z(r3.getName(), A1H);
        }
        r3.getStartTimeInMs();
        return C41845B3m.A0u("start_time_in_ms", Long.valueOf(r3.getStartTimeInMs()), A1H);
    }
}
