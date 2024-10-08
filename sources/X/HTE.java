package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class HTE {
    public static Map A00(C275544qW r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.Abw() != null) {
            List<C275524qU> Abw = r4.Abw();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C275524qU r0 : Abw) {
                if (r0 != null) {
                    A1C.add(r0.FHC());
                }
            }
            A1H.put("answers", A1C);
        }
        if (r4.Bid() != null) {
            A1H.put("question_id", r4.Bid());
        }
        if (r4.C2B() != null) {
            A1H.put(C273654mx.A00(979), r4.C2B());
        }
        if (r4.getText() != null) {
            A1H.put("text", r4.getText());
        }
        return 0Yt.A0B(A1H);
    }
}
