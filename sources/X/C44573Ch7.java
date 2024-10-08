package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ch7  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44573Ch7 {
    public static Map A00(DTV dtv) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dtv.B1k() != null) {
            A1H.put("end_ts", dtv.B1k());
        }
        if (dtv.BDY() != null) {
            A1H.put("highlight_text", dtv.BDY());
        }
        if (dtv.Byu() != null) {
            A1H.put("start_ts", dtv.Byu());
        }
        return 0Yt.A0B(A1H);
    }
}
