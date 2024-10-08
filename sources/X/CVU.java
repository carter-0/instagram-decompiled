package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CVU {
    public static Map A00(C239783Id r5) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList2 = null;
        if (r5.BG8() != null) {
            List BG8 = r5.BG8();
            if (BG8 != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = BG8.iterator();
                while (it.hasNext()) {
                    C41847B3o.A1U(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A1H.put("image_hints", arrayList);
        }
        if (r5.BPh() != null) {
            List<C46251DSg> BPh = r5.BPh();
            if (BPh != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (C46251DSg dSg : BPh) {
                    if (dSg != null) {
                        arrayList2.add(dSg.FHC());
                    }
                }
            }
            A1H.put("media", arrayList2);
        }
        if (r5.CDj() != null) {
            A1H.put("version", r5.CDj());
        }
        List CE3 = r5.CE3();
        if (CE3 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(CE3);
            Iterator it2 = CE3.iterator();
            while (it2.hasNext()) {
                C41846B3n.A1U(A0r, it2);
            }
            A1H.put("video_hints", A0r);
        }
        return 0Yt.A0B(A1H);
    }
}
