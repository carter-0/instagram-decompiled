package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerInsightInfo;
import com.instagram.api.schemas.CreatorViewerInsightTypeV2;
import com.instagram.api.schemas.FormattedString;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CWh  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44116CWh {
    public static Map A00(CreatorViewerInsightInfo creatorViewerInsightInfo) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (creatorViewerInsightInfo.B7m() != null) {
            FormattedString B7m = creatorViewerInsightInfo.B7m();
            if (B7m != null) {
                treeUpdaterJNI = B7m.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("formatted_text", treeUpdaterJNI);
        }
        if (creatorViewerInsightInfo.BHi() != null) {
            CreatorViewerInsightTypeV2 BHi = creatorViewerInsightInfo.BHi();
            0qQ.A0B(BHi, 0);
            A1H.put("insight_type_v2", BHi.A00);
        }
        if (creatorViewerInsightInfo.getText() != null) {
            C41845B3m.A10(creatorViewerInsightInfo.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
