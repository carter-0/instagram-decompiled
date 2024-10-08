package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CoF  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44976CoF {
    public static Map A00(C46295DTy dTy) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTy.AyX() != null) {
            List<C46294DTx> AyX = dTy.AyX();
            ArrayList arrayList = null;
            if (AyX != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46294DTx dTx : AyX) {
                    if (dTx != null) {
                        arrayList.add(dTx.FHC());
                    }
                }
            }
            A1H.put("donations", arrayList);
        }
        if (dTy.BP8() != null) {
            A1H.put("max_id", dTy.BP8());
        }
        if (dTy.BU7() != null) {
            A1H.put("more_available", dTy.BU7());
        }
        return 0Yt.A0B(A1H);
    }
}
