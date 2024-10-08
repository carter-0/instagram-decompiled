package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cgx  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44563Cgx {
    public static Map A00(DT2 dt2) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dt2.B0d() != null) {
            List<C46291DTu> B0d = dt2.B0d();
            ArrayList arrayList = null;
            if (B0d != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46291DTu dTu : B0d) {
                    if (dTu != null) {
                        arrayList.add(dTu.FHC());
                    }
                }
            }
            A1H.put(AnonymousClass000.A00(1297), arrayList);
        }
        if (dt2.BTA() != null) {
            A1H.put(AnonymousClass000.A00(1600), dt2.BTA());
        }
        return 0Yt.A0B(A1H);
    }
}
