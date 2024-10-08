package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CWP {
    public static Map A00(DUK duk) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (duk.Ad1() != null) {
            A1H.put("attribution_call_to_action", duk.Ad1());
        }
        if (duk.Ad6() != null) {
            A1H.put("attribution_owner_id", duk.Ad6());
        }
        User Ad7 = duk.Ad7();
        if (Ad7 != null) {
            A1H.put("attribution_owner_user_dict", Ad7.A08());
        }
        if (duk.Ad9() != null) {
            A1H.put("attribution_target_email", duk.Ad9());
        }
        return 0Yt.A0B(A1H);
    }
}
