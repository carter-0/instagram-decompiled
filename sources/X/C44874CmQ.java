package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CmQ  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44874CmQ {
    public static Map A00(DUH duh) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (duh.Abw() != null) {
            List<C46289DTs> Abw = duh.Abw();
            ArrayList arrayList = null;
            if (Abw != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46289DTs dTs : Abw) {
                    if (dTs != null) {
                        arrayList.add(dTs.FHC());
                    }
                }
            }
            A1H.put("answers", arrayList);
        }
        if (duh.BiQ() != null) {
            A1H.put("qid", duh.BiQ());
        }
        if (duh.getTitle() != null) {
            C41845B3m.A12(duh.getTitle(), A1H);
        }
        if (duh.C8q() != null) {
            A1H.put(AnonymousClass000.A00(807), duh.C8q());
        }
        if (duh.CAh() != null) {
            C41845B3m.A11(duh.CAh(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
