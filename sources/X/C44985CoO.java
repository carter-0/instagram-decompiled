package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CoO  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44985CoO {
    public static Map A00(DUZ duz) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (duz.BP8() != null) {
            A1H.put("max_id", duz.BP8());
        }
        duz.BU8();
        A1H.put("more_available", Boolean.valueOf(duz.BU8()));
        if (duz.getPollId() != null) {
            A1H.put("poll_id", duz.getPollId());
        }
        if (duz.CG0() != null) {
            List<DUY> CG0 = duz.CG0();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (DUY duy : CG0) {
                if (duy != null) {
                    A1C.add(duy.FHC());
                }
            }
            A1H.put("voters", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
