package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CZH {
    public static Map A00(C269984g0 r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.B7E() != null) {
            A1H.put("footerSubtype", r4.B7E());
        }
        if (r4.CP8() != null) {
            A1H.put("isAutofillEnabled", r4.CP8());
        }
        if (r4.Bhg() != null) {
            List<C46248DSd> Bhg = r4.Bhg();
            ArrayList arrayList = null;
            if (Bhg != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46248DSd dSd : Bhg) {
                    if (dSd != null) {
                        arrayList.add(dSd.FHC());
                    }
                }
            }
            A1H.put("promoCodes", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
