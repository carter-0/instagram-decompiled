package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cbe  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44243Cbe {
    public static Map A00(C46299DUc dUc) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList = null;
        if (dUc.Ai9() != null) {
            List<C239663Hm> Ai9 = dUc.Ai9();
            if (Ai9 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C239663Hm r0 : Ai9) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            }
            A1H.put("broadcasts", arrayList);
        }
        if (dUc.AkR() != null) {
            A1H.put("can_reply", dUc.AkR());
        }
        if (dUc.AkT() != null) {
            A1H.put("can_reshare", dUc.AkT());
        }
        if (dUc.BLJ() != null) {
            A1H.put(AnonymousClass000.A00(686), AnonymousClass7TH.A0D(dUc.BLJ()));
        }
        if (dUc.getPk() != null) {
            A1H.put("pk", dUc.getPk());
        }
        C41846B3n.A1J(dUc.CCd(), A1H);
        return 0Yt.A0B(A1H);
    }
}
