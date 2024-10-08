package X;

import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.ChM  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44588ChM {
    public static Map A00(XpostOriginalSoundFBCreatorInfo xpostOriginalSoundFBCreatorInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (xpostOriginalSoundFBCreatorInfo.Asa() != null) {
            A1H.put(AnonymousClass000.A00(1243), xpostOriginalSoundFBCreatorInfo.Asa());
        }
        if (xpostOriginalSoundFBCreatorInfo.Asc() != null) {
            A1H.put(AnonymousClass000.A00(1245), xpostOriginalSoundFBCreatorInfo.Asc());
        }
        if (xpostOriginalSoundFBCreatorInfo.B4J() != null) {
            A1H.put("fb_oa_android_aggregation_page_url", xpostOriginalSoundFBCreatorInfo.B4J());
        }
        if (xpostOriginalSoundFBCreatorInfo.B4K() != null) {
            A1H.put("fb_oa_ios_aggregation_page_url", xpostOriginalSoundFBCreatorInfo.B4K());
        }
        return 0Yt.A0B(A1H);
    }
}
