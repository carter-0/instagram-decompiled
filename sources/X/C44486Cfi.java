package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cfi  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44486Cfi {
    public static Map A00(C46302DUf dUf) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUf.Alg() != null) {
            A1H.put("card_id", dUf.Alg());
        }
        if (dUf.getMediaId() != null) {
            C41845B3m.A13(dUf.getMediaId(), A1H);
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (dUf.BZQ() != null) {
            List<DUD> BZQ = dUf.BZQ();
            if (BZQ != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DUD dud : BZQ) {
                    if (dud != null) {
                        arrayList.add(dud.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put(AnonymousClass000.A00(1664), arrayList);
        }
        if (dUf.C44() != null) {
            A1H.put("taken_at", dUf.C44());
        }
        if (dUf.C4Z() != null) {
            A1H.put("template_id", dUf.C4Z());
        }
        if (dUf.CCk() != null) {
            DUD CCk = dUf.CCk();
            if (CCk != null) {
                treeUpdaterJNI = CCk.FHC();
            }
            A1H.put("user_data", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
