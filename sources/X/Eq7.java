package X;

import com.instagram.common.session.UserSession;
import java.util.WeakHashMap;

public abstract class Eq7 {
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.FA2] */
    public static final FA2 A00(0lg r3) {
        0qQ.A0B(r3, 0);
        if (!(r3 instanceof UserSession)) {
            ? obj = new Object();
            WeakHashMap weakHashMap = FA2.A01;
            if (!weakHashMap.containsKey(r3) || weakHashMap.get(r3) == null) {
                weakHashMap.put(r3, obj);
                return obj;
            }
            FA2 fa2 = (FA2) weakHashMap.get(r3);
            if (fa2 != null) {
                return fa2;
            }
            return obj;
        }
        throw DbT.A0m();
    }
}
