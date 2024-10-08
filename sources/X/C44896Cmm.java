package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cmm  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44896Cmm {
    public static Map A00(C46304DUh dUh) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUh.AZ3() != null) {
            A1H.put("ad_id", dUh.AZ3());
        }
        if (dUh.Ali() != null) {
            A1H.put("card_modifier_label", dUh.Ali());
        }
        if (dUh.At9() != null) {
            A1H.put("cta", dUh.At9().FHC());
        }
        if (dUh.BSv() != null) {
            A1H.put("micro_product", dUh.BSv().FHC());
        }
        if (dUh.Bg4() != null) {
            A1H.put("product_context", dUh.Bg4());
        }
        if (dUh.Btj() != null) {
            List<C46282DTl> Btj = dUh.Btj();
            ArrayList arrayList = null;
            if (Btj != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46282DTl dTl : Btj) {
                    if (dTl != null) {
                        arrayList.add(dTl.FHC());
                    }
                }
            }
            A1H.put("shoppable_media", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
