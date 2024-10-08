package X;

import com.instagram.api.schemas.BusinessProfileDict;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CVC {
    public static Map A00(BusinessProfileDict businessProfileDict) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (businessProfileDict.getId() != null) {
            C41845B3m.A0x(businessProfileDict.getId(), A1H);
        }
        if (businessProfileDict.Bh3() != null) {
            ImageUrl Bh3 = businessProfileDict.Bh3();
            if (Bh3 != null) {
                str = Bh3.getUrl();
            } else {
                str = null;
            }
            A1H.put("profile_pic_url", str);
        }
        if (businessProfileDict.getUsername() != null) {
            A1H.put(Dbk.A00(), businessProfileDict.getUsername());
        }
        return 0Yt.A0B(A1H);
    }
}
