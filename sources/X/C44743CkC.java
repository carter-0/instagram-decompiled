package X;

import com.instagram.api.schemas.GuideMediaType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CkC  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44743CkC {
    public static Map A00(DTY dty) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dty.AqS() != null) {
            A1H.put("content", dty.AqS().FHC());
        }
        if (dty.CAM() != null) {
            GuideMediaType CAM = dty.CAM();
            0qQ.A0B(CAM, 0);
            C41845B3m.A11(CAM.A00, A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
