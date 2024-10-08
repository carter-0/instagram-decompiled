package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.ChD  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44579ChD {
    public static Map A00(DTW dtw) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        dtw.getCanViewerLinkBackToOriginalMediaFromVcr();
        A1H.put("can_viewer_link_back_to_original_media_from_vcr", Boolean.valueOf(dtw.getCanViewerLinkBackToOriginalMediaFromVcr()));
        if (dtw.ApG() != null) {
            A1H.put("comment_info", dtw.ApG().FHC());
        }
        if (dtw.BZ5() != null) {
            A1H.put("original_media", dtw.BZ5().FHC());
        }
        return 0Yt.A0B(A1H);
    }
}
