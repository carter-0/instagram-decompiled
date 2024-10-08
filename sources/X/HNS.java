package X;

import java.util.HashMap;
import java.util.Map;

public enum HNS {
    GO_TO_POST("GO_TO_POST"),
    CLEAR_MEDIA_COVER("CLEAR_MEDIA_COVER"),
    OPEN_BLOKS_APP("OPEN_BLOKS_APP"),
    OPEN_EXTERNAL_URL("OPEN_EXTERNAL_URL"),
    OTHER("OTHER");
    
    public static final Map A02 = null;
    public String A00;
    public String A01;

    /* access modifiers changed from: public */
    static {
        HNS hns;
        HNS hns2;
        HNS hns3;
        HNS hns4;
        HashMap A1E = AnonymousClass7TE.A1E();
        A02 = A1E;
        A1E.put(hns, "go_to_post");
        A1E.put(hns2, "clear_media_cover");
        A1E.put(hns3, "see_why");
        A1E.put(hns4, "open_external_url");
    }

    /* access modifiers changed from: public */
    HNS(String str) {
        this.A01 = str;
    }

    public static HNS A00(C278014w6 r1) {
        Integer A012 = I2I.A01(r1);
        if (A012 != null) {
            int intValue = A012.intValue();
            if (intValue == 0) {
                return OPEN_EXTERNAL_URL;
            }
            if (intValue == 2) {
                return CLEAR_MEDIA_COVER;
            }
            if (intValue == 3) {
                return OPEN_BLOKS_APP;
            }
        }
        return OTHER;
    }
}
