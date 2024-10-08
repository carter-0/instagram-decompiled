package X;

import com.instagram.api.schemas.CreatorDigestSignalInfo;
import com.instagram.api.schemas.InspirationSignalType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CWZ {
    public static Map A00(CreatorDigestSignalInfo creatorDigestSignalInfo) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (creatorDigestSignalInfo.BwM() != null) {
            InspirationSignalType BwM = creatorDigestSignalInfo.BwM();
            if (BwM != null) {
                str = BwM.A00;
            } else {
                str = null;
            }
            A1H.put("signal_type", str);
        }
        if (creatorDigestSignalInfo.getSubtitle() != null) {
            A1H.put("subtitle", creatorDigestSignalInfo.getSubtitle());
        }
        if (creatorDigestSignalInfo.getTitle() != null) {
            C41845B3m.A12(creatorDigestSignalInfo.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
