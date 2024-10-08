package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CmW  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44880CmW {
    public static Map A00(C239723Ht r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.B0x() != null) {
            List<C46313DUq> B0x = r4.B0x();
            ArrayList arrayList = null;
            if (B0x != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46313DUq dUq : B0x) {
                    if (dUq != null) {
                        arrayList.add(dUq.FHC());
                    }
                }
            }
            A1H.put(AnonymousClass000.A00(1299), arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
