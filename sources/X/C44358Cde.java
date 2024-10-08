package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cde  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44358Cde {
    public static Map A00(DTQ dtq) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        dtq.B1Q();
        A1H.put("end", Integer.valueOf(dtq.B1Q()));
        dtq.Byb();
        A1H.put("start", Integer.valueOf(dtq.Byb()));
        if (dtq.getText() != null) {
            C41845B3m.A10(dtq.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
