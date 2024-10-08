package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.UUID;

public abstract class OQ0 {
    public static final String A00(UserSession userSession) {
        if (userSession == null || !182.A06(0Tu.A05, userSession, 36319454635826590L)) {
            return null;
        }
        UUID A00 = AnonymousClass0HM.A00();
        0qQ.A07(A00);
        return AnonymousClass7TG.A0m(A00, "fake_", AnonymousClass7TE.A1A());
    }

    public static final HashMap A01(AnonymousClass5HJ r4) {
        String str;
        String str2;
        String str3;
        HashMap A00 = C69693NqF.A00(r4.A0P);
        if (A00 == null) {
            return null;
        }
        String A0d = AnonymousClass7TF.A0d(C60960kU.A00.getApplicationContext().getResources(), 2131963986);
        String str4 = r4.A0Q;
        if (str4 == null) {
            str4 = A0d;
        }
        A00.put("account", str4);
        String str5 = r4.A0S;
        if (str5 != null) {
            A0d = str5;
        }
        A00.put("sn", A0d);
        String str6 = r4.A0R;
        String str7 = "";
        if (str6 == null) {
            str6 = str7;
        }
        A00.put("su", str6);
        if (!r4.A1S || (str = r4.A0i) == null) {
            str = str7;
        }
        A00.put("itt", str);
        A00.put("armadillo_is_thread_muted", String.valueOf(r4.A1Q));
        A00.put("armadillo_is_thread_hidden", String.valueOf(r4.A1P));
        A00.put("is_silent", String.valueOf(r4.A1M));
        A00.put(C273654mx.A00(3189), r4.A12);
        String str8 = r4.A0U;
        if (str8 != null) {
            A00.put("wa_push_id", str8);
        }
        if (r4.A1S) {
            str2 = r4.A0i;
        } else {
            str2 = null;
        }
        if (0qQ.A0K(str2, "2")) {
            A00.put("feature_tags", "15");
        }
        if (r4.A1S) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        A00.put("is_instamadillo", str3);
        String str9 = r4.A1G;
        if (!(str9 == null && (str9 = r4.A1F) == null)) {
            str7 = str9;
        }
        A00.put("thread_igid", str7);
        String str10 = r4.A0z;
        if (str10 == null) {
            return A00;
        }
        A00.put("atid", str10);
        return A00;
    }
}
