package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.EgN  reason: case insensitive filesystem */
public abstract class C48552EgN {
    public static Object A00(C307896Rx r22, AnonymousClass6Tm r23) {
        Object obj;
        HashMap A1E = AnonymousClass7TE.A1E();
        Map map = (Map) r23.A03(0);
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            Object next = A16.next();
            String str = (String) next;
            if (str.equals("step_data")) {
                Object obj2 = map.get(next);
                obj2.getClass();
                obj = C308206Td.A0H((Map) obj2);
            } else {
                boolean equals = str.equals("flow_render_type");
                obj = map.get(next);
                if (equals) {
                    obj.getClass();
                    obj = obj.toString();
                }
            }
            A1E.put(str, obj);
        }
        0lg A0B = C308206Td.A0B(r22);
        FragmentActivity A04 = C308206Td.A04(r22);
        FZ1 A00 = F5E.A00(A0B);
        String A0r = DbS.A0r("flow_render_type", A1E);
        String A0r2 = DbS.A0r("step_name", A1E);
        Object obj3 = A1E.get("step_data");
        obj3.getClass();
        HashMap hashMap = (HashMap) obj3;
        String A0r3 = DbS.A0r("challenge_context", A1E);
        if (A0r == null) {
            return null;
        }
        if (A0r.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
            A00.A04(DbT.A04(), A0r2, A0r3, hashMap);
            return null;
        } else if (!A0r.equals("4") && !A0r.equals("5") && !A0r.equals("6")) {
            return null;
        } else {
            String A0r4 = DbS.A0r("url", A1E);
            0qQ.A0B(A04, 0);
            if (A04 instanceof ChallengeActivity) {
                A04.finish();
            }
            SimpleWebViewActivity.A00(A04, A0B, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, true, true, false, false, true, false, false, false, (String) null, A0r4));
            return null;
        }
    }
}
