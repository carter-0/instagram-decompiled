package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CbX {
    public static Map A00(DTK dtk) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dtk.getId() != null) {
            C41845B3m.A0x(dtk.getId(), A1H);
        }
        if (dtk.C48() != null) {
            List<DTL> C48 = dtk.C48();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (DTL dtl : C48) {
                if (dtl != null) {
                    A1C.add(dtl.FHC());
                }
            }
            A1H.put("tallies", A1C);
        }
        if (dtk.getText() != null) {
            C41845B3m.A10(dtk.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
