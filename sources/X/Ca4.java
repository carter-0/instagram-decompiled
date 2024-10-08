package X;

import com.instagram.api.schemas.InspirationSignalType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class Ca4 {
    public static Map A00(DSK dsk) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dsk.BwO() != null) {
            List<InspirationSignalType> BwO = dsk.BwO();
            ArrayList A0r = AnonymousClass7TG.A0r(BwO);
            for (InspirationSignalType inspirationSignalType : BwO) {
                0qQ.A0B(inspirationSignalType, 0);
                A0r.add(inspirationSignalType.A00);
            }
            A1H.put("signal_types", A0r);
        }
        return 0Yt.A0B(A1H);
    }
}
