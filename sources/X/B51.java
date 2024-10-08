package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B51 {
    public static Map A00(AnonymousClass3I2 r5) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList2 = null;
        if (r5.At0() != null) {
            List<C250463lU> At0 = r5.At0();
            if (At0 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C250463lU r0 : At0) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put(AnonymousClass000.A00(4674), arrayList);
        }
        if (r5.BNf() != null) {
            List<C250463lU> BNf = r5.BNf();
            if (BNf != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (C250463lU r02 : BNf) {
                    if (r02 != null) {
                        arrayList2.add(r02.FHC());
                    }
                }
            }
            A1H.put("local_surface", arrayList2);
        }
        if (r5.BSa() != null) {
            A1H.put("meta_ids", r5.BSa());
        }
        return 0Yt.A0B(A1H);
    }
}
