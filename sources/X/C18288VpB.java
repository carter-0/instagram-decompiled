package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.VpB  reason: case insensitive filesystem */
public abstract class C18288VpB {
    public static final List A00 = new ArrayList();

    public static final Object A00(AnonymousClass6Tm r3) {
        Object A01 = r3.A01();
        0qQ.A0C(A01, Pxd.A00(2));
        Map map = (Map) A01;
        if (!(!map.isEmpty())) {
            return null;
        }
        for (C18741VzM vzM : A00) {
            vzM.A0B.A0D(new JSONObject(map));
        }
        return null;
    }
}
