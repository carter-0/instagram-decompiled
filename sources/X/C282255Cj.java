package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Cj  reason: invalid class name and case insensitive filesystem */
public final class C282255Cj {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public final 1Oe A00(String str) {
        Map map = this.A00;
        02V.A07(map.containsKey(str), 002.A0R("No DirectMutationDefinition registered for type: ", str));
        Object obj = map.get(str);
        obj.getClass();
        return (1Oe) obj;
    }

    public final C66717MbO A01(String str) {
        02V.A07(this.A00.containsKey(str), 002.A0R("No SessionScopedDirectMutationDefinition registered for type: ", str));
        Object obj = this.A01.get(str);
        obj.getClass();
        return (C66717MbO) ((AnonymousClass0eM) obj).getValue();
    }

    public C282255Cj(UserSession userSession, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1Oe r3 = (1Oe) it.next();
            String str = r3.A02;
            this.A00.put(str, r3);
            this.A01.put(str, 0Kk.A00(userSession, r3.A01));
        }
    }
}
