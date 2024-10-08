package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ch9  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44575Ch9 {
    public static Map A00(DT4 dt4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        dt4.getCreatedAt();
        A1H.put("created_at", Long.valueOf(dt4.getCreatedAt()));
        if (dt4.getEmoji() != null) {
            A1H.put("emoji", dt4.getEmoji());
        }
        return 0Yt.A0B(A1H);
    }
}
