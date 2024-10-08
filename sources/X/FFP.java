package X;

import android.content.Context;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.List;

public abstract class FFP {
    public static 1OC A00(Context context, AnonymousClass0aP r5, String str, String str2, String str3, String str4, List list, boolean z) {
        String str5;
        1NY A0a = AnonymousClass7TG.A0a(r5);
        A0a.A0A("accounts/two_factor_login/");
        DbW.A1D(A0a);
        A0a.A9m(DcV.A01(), str);
        A0a.A0G("verification_method", str4);
        DbZ.A0y(context, A0a, "phone_id", DbW.A0I(A0a, r5, DcV.A00(), DbT.A0u(context, A0a, DcV.A02(124, 21, 30), str2)).A02(19f.A1D));
        A0a.A0G(DcV.A02(153, 17, 57), str3);
        if (z) {
            str5 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str5 = "0";
        }
        DbY.A1J(A0a, "trust_this_device", str5);
        if (list != null && !list.isEmpty()) {
            A0a.A9m("trusted_notification_polling_nonces", new Gson().A0B(list));
        }
        return DbW.A0K(A0a);
    }

    public static 1OC A01(Context context, UserSession userSession) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("accounts/account_security_info/");
        A0N.A0R(DwU.class, F65.class);
        A0N.A9m(DcV.A00(), 0qv.A00(context));
        return DbW.A0K(A0N);
    }

    public static 1OC A02(Context context, UserSession userSession, String str) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("accounts/send_two_factor_enable_sms/");
        A0N.A0R(EM3.class, F6I.class);
        DbZ.A0x(context, A0N, Dbb.A0T(), str);
        return DbW.A0K(A0N);
    }

    public static 1OC A03(Context context, UserSession userSession, String str, String str2) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("accounts/enable_sms_two_factor/");
        A0N.A0R(EM6.class, F6N.class);
        DbZ.A0x(context, A0N, Dbb.A0T(), str);
        A0N.A9m(DcV.A02(153, 17, 57), str2);
        return DbW.A0K(A0N);
    }
}
