package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CgV  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44535CgV {
    public static Map A00(DT0 dt0) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dt0.B1p() != null) {
            List<DTT> B1p = dt0.B1p();
            ArrayList arrayList = null;
            if (B1p != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DTT dtt : B1p) {
                    if (dtt != null) {
                        arrayList.add(dtt.FHC());
                    }
                }
            }
            A1H.put("entities", arrayList);
        }
        if (dt0.getText() != null) {
            C41845B3m.A10(dt0.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
