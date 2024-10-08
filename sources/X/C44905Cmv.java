package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cmv  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44905Cmv {
    public static Map A00(C269854fn r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.BKJ() != null) {
            List<C46305DUi> BKJ = r4.BKJ();
            ArrayList arrayList = null;
            if (BKJ != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46305DUi dUi : BKJ) {
                    if (dUi != null) {
                        arrayList.add(dUi.FHC());
                    }
                }
            }
            A1H.put("keywords", arrayList);
        }
        if (r4.BTi() != null) {
            A1H.put("model_version", r4.BTi());
        }
        return 0Yt.A0B(A1H);
    }
}
