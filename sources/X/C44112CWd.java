package X;

import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerBottomCTAType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CWd  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44112CWd {
    public static Map A00(CreatorViewerBottomCTA creatorViewerBottomCTA) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (creatorViewerBottomCTA.AhL() != null) {
            CreatorViewerBottomCTAType AhL = creatorViewerBottomCTA.AhL();
            0qQ.A0B(AhL, 0);
            A1H.put("bottom_cta_type", AhL.A00);
        }
        if (creatorViewerBottomCTA.getText() != null) {
            C41845B3m.A10(creatorViewerBottomCTA.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
