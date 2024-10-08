package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class Cb4 {
    public static Map A00(C270824hM r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        List BeM = r4.BeM();
        if (BeM != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(BeM);
            Iterator it = BeM.iterator();
            while (it.hasNext()) {
                C41846B3n.A1U(A0r, it);
            }
            A1H.put("posts", A0r);
        }
        C41846B3n.A1J(r4.CCd(), A1H);
        return 0Yt.A0B(A1H);
    }
}
