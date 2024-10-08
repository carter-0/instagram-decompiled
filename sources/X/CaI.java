package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CaI {
    public static Map A00(DUO duo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        List B3f = duo.B3f();
        if (B3f != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(B3f);
            Iterator it = B3f.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("facepile_top_participants", A0r);
        }
        duo.Bak();
        A1H.put("participant_count", Integer.valueOf(duo.Bak()));
        if (duo.Bhp() != null) {
            A1H.put("prompt_id", duo.Bhp());
        }
        if (duo.getText() != null) {
            C41845B3m.A10(duo.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
