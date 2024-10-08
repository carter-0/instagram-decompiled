package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cd4  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44322Cd4 {
    public static Map A00(DUA dua) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dua.Arm() != null) {
            A1H.put("country_list", dua.Arm());
        }
        if (dua.Bjz() != null) {
            A1H.put("reason", dua.Bjz());
        }
        if (dua.BrW() != null) {
            A1H.put("segmented_video_group_handler_id", dua.BrW());
        }
        if (dua.Bu2() != null) {
            A1H.put("should_disable_sharing", dua.Bu2());
        }
        if (dua.CAh() != null) {
            C41845B3m.A11(dua.CAh(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
