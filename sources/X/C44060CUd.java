package X;

import com.instagram.api.schemas.AudienceListIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CUd  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44060CUd {
    public static Map A00(AudienceListIntf audienceListIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        audienceListIntf.CRG();
        A1H.put("is_default", Boolean.valueOf(audienceListIntf.CRG()));
        audienceListIntf.CWL();
        A1H.put("is_list_name_public", Boolean.valueOf(audienceListIntf.CWL()));
        audienceListIntf.CWM();
        A1H.put("is_list_named", Boolean.valueOf(audienceListIntf.CWM()));
        if (audienceListIntf.BN7() != null) {
            A1H.put("list_id", audienceListIntf.BN7());
        }
        if (audienceListIntf.getName() != null) {
            C41845B3m.A0z(audienceListIntf.getName(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
