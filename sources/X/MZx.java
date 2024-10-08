package X;

import com.facebook.pushlite.model.PushInfraMetaData;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;

public final class MZx {
    public final C58840Ae A00;

    public static final void A00(MZx mZx, PushInfraMetaData pushInfraMetaData, String str, String str2, Map map) {
        String str3 = pushInfraMetaData.A05;
        if (str3 != null && !str3.equals("0")) {
            1Ln A0K = 1Ln.A0K(mZx.A00);
            if (DbT.A1Y(A0K)) {
                boolean z = true;
                boolean A1V = AnonymousClass7TF.A1V(pushInfraMetaData.A02);
                if (pushInfraMetaData.A01 == null) {
                    z = false;
                }
                map.put("isHPKEEncrypted", String.valueOf(A1V));
                map.put("isZSTDCompressed", String.valueOf(z));
                map.put("push_lite_logger", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                Long l = pushInfraMetaData.A00;
                if (l != null) {
                    A0K.A0Q("push_usecase_id", l);
                }
                String str4 = pushInfraMetaData.A07;
                if (str4 != null) {
                    A0K.A0R("pi_nid", str4);
                }
                String str5 = pushInfraMetaData.A06;
                if (str5 != null) {
                    A0K.A0R("notif_id", str5);
                }
                C250873mC r2 = C250863mB.A03;
                C255453u9 r1 = C255453u9.A01;
                String A02 = r2.A02(map, new C258613zM(r1, r1));
                A0K.A0R("notif_event", str);
                A0K.A0R("channel", str2);
                A0K.A0R("notif_event_log_flag", str3);
                A0K.A0R("extra_info", A02);
                A0K.Cgf();
            }
        }
    }

    public MZx(C58840Ae r1) {
        this.A00 = r1;
    }
}
