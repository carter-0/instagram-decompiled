package X;

import com.instagram.api.schemas.RingSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cd6  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44324Cd6 {
    public static Map A00(RingSpec ringSpec) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (ringSpec.Ap5() != null) {
            A1H.put("colors", ringSpec.Ap5());
        }
        if (ringSpec.B1X() != null) {
            A1H.put("end_point", ringSpec.B1X().FHC());
        }
        if (ringSpec.BNn() != null) {
            List BNn = ringSpec.BNn();
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = BNn.iterator();
            while (it.hasNext()) {
                C41847B3o.A1Y(A1C, it);
            }
            A1H.put("locations", A1C);
        }
        if (ringSpec.getName() != null) {
            C41845B3m.A0z(ringSpec.getName(), A1H);
        }
        if (ringSpec.Byj() != null) {
            A1H.put("start_point", ringSpec.Byj().FHC());
        }
        return 0Yt.A0B(A1H);
    }
}
