package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.B4i  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41864B4i {
    public static Map A00(C242043Sk r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.BBw() != null) {
            A1H.put("has_public_channels", r4.BBw());
        }
        if (r4.BcT() != null) {
            List<C2609247o> BcT = r4.BcT();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C2609247o r0 : BcT) {
                if (r0 != null) {
                    A1C.add(r0.FHC());
                }
            }
            A1H.put("pinned_channels_list", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
