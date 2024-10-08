package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import libraries.zero.headers.ZeroHeadersEntry;

public final class OYZ {
    public final UserSession A00;

    public OYZ(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final Map A00(OYZ oyz) {
        Object A1H = AnonymousClass7TE.A1H();
        String string = C51969G9p.A0n(1Al.A01(oyz.A00), 1An.A1X, oyz).getString("headers_entries", (String) null);
        if (string == null) {
            string = "";
        }
        try {
            A1H = C250863mB.A03.A00(string, new C258613zM(C255453u9.A01, new C258613zM(C360278eK.A00, C73537PeT.A01)));
        } catch (Exception unused) {
        }
        Map map = (Map) A1H;
        long A0I = AnonymousClass7TG.A0I();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            Map map2 = (Map) A1J.getValue();
            Iterator A0u2 = AnonymousClass7TF.A0u(map2);
            while (A0u2.hasNext()) {
                if (A0I > ((long) ((ZeroHeadersEntry) C51971G9r.A0p(A0u2)).A02)) {
                    A0u2.remove();
                }
            }
            if (map2.isEmpty()) {
                A1C.add(key);
            }
        }
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return map;
    }

    public static final void A01(OYZ oyz, Map map) {
        DbX.A1U(C51969G9p.A0n(1Al.A01(oyz.A00), 1An.A1X, oyz), "headers_entries", C250863mB.A03.A02(map, new C258613zM(C255453u9.A01, new C258613zM(C360278eK.A00, C73537PeT.A01))));
    }
}
