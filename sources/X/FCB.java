package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

public final class FCB {
    public static EM4 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                A00(r3, r0, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(16F r3, EM4 em4, String str) {
        if ("logged_in_user".equals(str)) {
            Parcelable.Creator creator = User.CREATOR;
            em4.A00 = 1aC.A00(r3, false);
            return;
        }
        ArrayList arrayList = null;
        if ("login_deferred_accounts".equals(str)) {
            if (r3.A11() == 16L.A0C) {
                arrayList = AnonymousClass7TE.A1C();
                while (r3.A1J() != 16L.A08) {
                    C49557Exs parseFromJson = C49021Enx.parseFromJson(r3);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            em4.A0B = arrayList;
        } else if ("help_url".equals(str)) {
            em4.A04 = AnonymousClass7TG.A0l(r3);
        } else if ("help_url_text".equals(str)) {
            em4.A05 = AnonymousClass7TG.A0l(r3);
        } else if ("bolded_text".equals(str)) {
            em4.A03 = AnonymousClass7TG.A0l(r3);
        } else if ("buttons".equals(str)) {
            if (r3.A11() == 16L.A0C) {
                arrayList = AnonymousClass7TE.A1C();
                while (r3.A1J() != 16L.A08) {
                    C49590Eyz parseFromJson2 = C48966En4.parseFromJson(r3);
                    if (parseFromJson2 != null) {
                        arrayList.add(parseFromJson2);
                    }
                }
            }
            em4.A0A = arrayList;
        } else if ("invalid_credentials".equals(str)) {
            em4.A0C = r3.A0d();
        } else if ("sso_enabled".equals(str)) {
            em4.A0D = r3.A0d();
        } else if ("mac_login_nonce".equals(str)) {
            em4.A07 = AnonymousClass7TG.A0l(r3);
        } else if ("trusted_device_nonce".equals(str)) {
            em4.A09 = AnonymousClass7TG.A0l(r3);
        } else if ("session_flush_nonce".equals(str)) {
            em4.A08 = AnonymousClass7TG.A0l(r3);
        } else if ("login_source".equals(str)) {
            em4.A06 = AnonymousClass7TG.A0l(r3);
        } else if ("show_autoconf_consent".equals(str)) {
            em4.A01 = AnonymousClass7TF.A0X(r3);
        } else if ("text_app_stop_deletion_token".equals(str) || "grace_period_deadline".equals(str)) {
            C41846B3n.A1A(r3);
        } else if ("account_delegate_igid".equals(str)) {
            em4.A02 = AnonymousClass7TF.A0Z(r3);
        } else {
            F6K.A00(r3, em4, str);
        }
    }
}
