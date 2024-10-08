package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Col  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45008Col {
    public static Map A00(AnonymousClass3IE r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.BGL() != null) {
            A1H.put("image_url", r3.BGL());
        }
        if (r3.BGM() != null) {
            A1H.put(AnonymousClass000.A00(306), r3.BGM());
        }
        if (r3.getName() != null) {
            C41845B3m.A0z(r3.getName(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
