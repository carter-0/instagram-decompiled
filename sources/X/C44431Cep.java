package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cep  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44431Cep {
    public static Map A00(DUS dus) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dus.BP8() != null) {
            A1H.put("max_id", dus.BP8());
        }
        if (dus.BU7() != null) {
            A1H.put("more_available", dus.BU7());
        }
        if (dus.Bal() != null) {
            List<DUC> Bal = dus.Bal();
            ArrayList arrayList = null;
            if (Bal != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DUC duc : Bal) {
                    if (duc != null) {
                        arrayList.add(duc.FHC());
                    }
                }
            }
            A1H.put("participants", arrayList);
        }
        if (dus.Biw() != null) {
            A1H.put("quiz_id", dus.Biw());
        }
        return 0Yt.A0B(A1H);
    }
}
