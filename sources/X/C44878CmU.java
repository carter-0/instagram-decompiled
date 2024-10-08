package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CmU  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44878CmU {
    public static Map A00(C46313DUq dUq) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUq.BCi() != null) {
            A1H.put("header_text", dUq.BCi());
        }
        if (dUq.BFr() != null) {
            A1H.put(AnonymousClass000.A00(1449), dUq.BFr());
        }
        ArrayList arrayList = null;
        if (dUq.BH8() != null) {
            List<AnonymousClass3UK> BH8 = dUq.BH8();
            if (BH8 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (AnonymousClass3UK r0 : BH8) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            }
            A1H.put(AnonymousClass000.A00(1462), arrayList);
        }
        1Xj Bke = dUq.Bke();
        if (Bke != null) {
            A1H.put("reel_item", Bke.A1C());
        }
        if (dUq.C2C() != null) {
            A1H.put(AnonymousClass000.A00(1857), dUq.C2C());
        }
        if (dUq.C4Z() != null) {
            A1H.put("template_id", dUq.C4Z());
        }
        return 0Yt.A0B(A1H);
    }
}
