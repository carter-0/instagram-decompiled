package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.LHy  reason: case insensitive filesystem */
public abstract class C63998LHy {
    public static final LinkedHashMap A01(Bundle bundle) {
        if (bundle == null) {
            return AnonymousClass7TE.A1H();
        }
        LinkedHashMap A0x = DbS.A0x(bundle.size());
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            A0x.put(A18, bundle.getString(A18));
        }
        return A0x;
    }

    public static final Bundle A00(Map map) {
        Bundle bundle = new Bundle(map.size());
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            bundle.putString(DbT.A13(A1J), DbS.A0s(A1J));
        }
        return bundle;
    }
}
