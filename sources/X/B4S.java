package X;

import com.instagram.api.schemas.UserTagInfoDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B4S {
    public static Map A00(C256193vN r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.CHj() != null) {
            List<UserTagInfoDictIntf> CHj = r4.CHj();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (UserTagInfoDictIntf userTagInfoDictIntf : CHj) {
                if (userTagInfoDictIntf != null) {
                    A1C.add(userTagInfoDictIntf.FHC());
                }
            }
            A1H.put("in", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
