package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Egs  reason: case insensitive filesystem */
public abstract class C48583Egs {
    public static Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        User user = ((EtL) r15.A03(0)).A00;
        if (user == null) {
            1Kn.A02(C273654mx.A00(734), "Null user in user alien object");
            return null;
        }
        Object A0p = DbT.A0p(r15, 1);
        A0p.getClass();
        HashMap A0H = C308206Td.A0H((Map) A0p);
        String str = (String) A0H.get("destination_url");
        String A0r = DbS.A0r("show_autoconf_consent", A0H);
        if (A0r == null) {
            A0r = "-1";
        }
        int parseInt = Integer.parseInt(A0r);
        FragmentActivity A04 = C308206Td.A04(r14);
        AnonymousClass0iw A08 = C308206Td.A08(r14);
        UserSession A02 = C46413Dea.A02(A04, A08, C308206Td.A0B(r14), user, (String) null, false);
        Uri A03 = 0cp.A03(002.A0R("instagram://", str));
        if (parseInt == 2 || parseInt == 3 || parseInt == 4) {
            String str2 = (String) A0H.get("register_start_message");
            String str3 = (String) A0H.get("nonce_code");
            if (!(str2 == null || str3 == null)) {
                C309516Yo A0J = DbY.A0J(A04, A02);
                String A00 = AnonymousClass000.A00(1095);
                Bundle A09 = DbY.A09(A02);
                A09.putString("REGISTER_START_MESSAGE", str2);
                A09.putString("NONCE", str3);
                A09.putString("SMS_FLOW_TYPE", A00);
                A09.putInt("CONSENT_MODE", parseInt);
                DbX.A18(A09, new E2O(), A0J);
                return null;
            }
        }
        C46413Dea.A05(A04, A03, A08, A02);
        return null;
    }
}
