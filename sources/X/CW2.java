package X;

import com.instagram.api.schemas.MediaType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CW2 {
    public static Map A00(C269804fi r3) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AeQ() != null) {
            A1H.put("avatar_sticker_cdn_url", r3.AeQ());
        }
        if (r3.AeS() != null) {
            A1H.put("avatar_sticker_ikid", r3.AeS());
        }
        if (r3.CAR() != null) {
            MediaType CAR = r3.CAR();
            if (CAR != null) {
                str = CAR.A00;
            } else {
                str = null;
            }
            C41845B3m.A11(str, A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
