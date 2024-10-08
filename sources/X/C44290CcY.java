package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CcY  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44290CcY {
    public static Map A00(AnonymousClass3IU r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.AYU() != null) {
            A1H.put("action_text", r4.AYU());
        }
        if (r4.Aum() != null) {
            A1H.put("cursor", r4.Aum());
        }
        if (r4.BEY() != null) {
            C41845B3m.A0x(r4.BEY(), A1H);
        }
        if (r4.Cc8() != null) {
            A1H.put("is_shuffle", r4.Cc8());
        }
        if (r4.Cdn() != null) {
            A1H.put("is_unit_dismissable", r4.Cdn());
        }
        if (r4.BVq() != null) {
            A1H.put("netego_title", r4.BVq());
        }
        if (r4.BVt() != null) {
            A1H.put("netego_type", r4.BVt());
        }
        if (r4.C9L() != null) {
            A1H.put("tracking_token", r4.C9L());
        }
        if (r4.C9t() != null) {
            List<DUU> C9t = r4.C9t();
            ArrayList arrayList = null;
            if (C9t != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DUU duu : C9t) {
                    if (duu != null) {
                        arrayList.add(duu.FHC());
                    }
                }
            }
            A1H.put(AnonymousClass000.A00(812), arrayList);
        }
        if (r4.CAg() != null) {
            C41845B3m.A11(r4.CAg(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
