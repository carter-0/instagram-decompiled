package X;

import com.instagram.api.schemas.HallpassDetailsDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CYS {
    public static Map A00(HallpassDetailsDict hallpassDetailsDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (hallpassDetailsDict.getColor() != null) {
            A1H.put("color", hallpassDetailsDict.getColor());
        }
        if (hallpassDetailsDict.BAL() != null) {
            A1H.put("hallpass_id", hallpassDetailsDict.BAL());
        }
        if (hallpassDetailsDict.getName() != null) {
            C41845B3m.A0z(hallpassDetailsDict.getName(), A1H);
        }
        List BxT = hallpassDetailsDict.BxT();
        if (BxT != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(BxT);
            Iterator it = BxT.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("social_context_members", A0r);
        }
        return 0Yt.A0B(A1H);
    }
}
