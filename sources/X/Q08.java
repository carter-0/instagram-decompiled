package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.Map;

public abstract class Q08 {
    public static Object A00(C307896Rx r5, Map map) {
        if (!map.containsKey("initial_lispy")) {
            return map.get("initial");
        }
        try {
            return AnonymousClass6Tn.A00(r5, AnonymousClass6Tm.A01, new BloksScript((C276634te) null, (String) map.get("initial_lispy"), r5.A0D, -1));
        } catch (AnonymousClass6QV e) {
            1Kn.A00((C307786Rm) null, "StateModule", "Exception gettin initial_lispy value", e);
            return null;
        }
    }
}
