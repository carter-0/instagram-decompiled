package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F3x  reason: case insensitive filesystem */
public abstract class C49732F3x {
    public static C276544tV A00(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C276544tV r1 = (C276544tV) it.next();
            if (r1.A04 == 14063) {
                return r1;
            }
        }
        return null;
    }

    public static String A01(Object obj) {
        if ((obj instanceof Number) || !(obj instanceof Boolean)) {
            return obj.toString();
        }
        if (AnonymousClass7TE.A1a(obj)) {
            return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        return "0";
    }
}
