package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CUn  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44070CUn {
    public static Map A00(DU2 du2) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (du2.getAccessToken() != null) {
            A1H.put("access_token", du2.getAccessToken());
        }
        User ByI = du2.ByI();
        if (ByI != null) {
            A1H.put("sponsor", ByI.A08());
        }
        List ByP = du2.ByP();
        if (ByP != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(ByP);
            Iterator it = ByP.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("sponsors", A0r);
        }
        return 0Yt.A0B(A1H);
    }
}
