package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class DcX {
    public static Map A00(C253503qt r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.B1p() != null) {
            List<C255253tp> B1p = r4.B1p();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C255253tp r0 : B1p) {
                if (r0 != null) {
                    A1C.add(r0.FHC());
                }
            }
            A1H.put("entities", A1C);
        }
        if (r4.Bjf() != null) {
            A1H.put("raw_text", r4.Bjf());
        }
        return 0Yt.A0B(A1H);
    }
}
