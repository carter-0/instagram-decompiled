package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B6H {
    public static Map A00(AnonymousClass4EU r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.B42() != null) {
            A1H.put("fb_account_creation_time", r3.B42());
        }
        if (r3.getId() != null) {
            C41845B3m.A0x(r3.getId(), A1H);
        }
        r3.CHk();
        A1H.put("is_valid", Boolean.valueOf(r3.CHk()));
        if (r3.BMr() != null) {
            A1H.put("link_time", r3.BMr());
        }
        if (r3.getName() != null) {
            C41845B3m.A0z(r3.getName(), A1H);
        }
        if (r3.BhK() != null) {
            A1H.put("profile_url", r3.BhK());
        }
        return 0Yt.A0B(A1H);
    }
}
