package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CaB {
    public static Map A00(C46251DSg dSg) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dSg.Bni() != null) {
            List<DTI> Bni = dSg.Bni();
            ArrayList arrayList = null;
            if (Bni != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DTI dti : Bni) {
                    if (dti != null) {
                        arrayList.add(dti.FHC());
                    }
                }
            }
            A1H.put("resources", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
