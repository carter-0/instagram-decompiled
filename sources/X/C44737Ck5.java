package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ck5  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44737Ck5 {
    public static Map A00(DUG dug) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dug.AoF() != null) {
            List AoF = dug.AoF();
            ArrayList A0r = AnonymousClass7TG.A0r(AoF);
            Iterator it = AoF.iterator();
            while (it.hasNext()) {
                C41846B3n.A1U(A0r, it);
            }
            A1H.put("clips_spins", A0r);
        }
        dug.BUF();
        A1H.put("more_spins_available", Boolean.valueOf(dug.BUF()));
        if (dug.BaN() != null) {
            A1H.put("paging_cursor", dug.BaN());
        }
        return 0Yt.A0B(A1H);
    }
}
