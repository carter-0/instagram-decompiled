package X;

import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.session.UserSession;

public final class KCT extends C228042kh {
    public final HighlightReelTypeStr A00;
    public final UserSession A01;

    public KCT(HighlightReelTypeStr highlightReelTypeStr, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = highlightReelTypeStr;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60162Jgh(this.A00, this.A01);
    }
}
