package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ces  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44434Ces {
    public static Map A00(C46288DTr dTr) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTr.getEmoji() != null) {
            A1H.put("emoji", dTr.getEmoji());
        }
        if (dTr.Bjt() != null) {
            List Bjt = dTr.Bjt();
            ArrayList A0r = AnonymousClass7TG.A0r(Bjt);
            Iterator it = Bjt.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("reactors", A0r);
        }
        return 0Yt.A0B(A1H);
    }
}
