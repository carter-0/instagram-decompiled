package X;

import android.app.Application;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.common.session.UserSession;

public final class JWZ extends C361478gI {
    public final 2Fk A00;
    public final ClipsDraftPreviewItemRepository A01;
    public final UserSession A02;
    public final 0nV A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JWZ(Application application, ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository, AnonymousClass12V r6, UserSession userSession) {
        super(application);
        AnonymousClass7TF.A1D(clipsDraftPreviewItemRepository, 3, r6);
        this.A02 = userSession;
        this.A01 = clipsDraftPreviewItemRepository;
        0nV AOJ = r6.AOJ(2113530577, 3);
        this.A03 = AOJ;
        this.A00 = DbT.A0G(11M.A01(AOJ, MCA.A00(this, clipsDraftPreviewItemRepository.A03, 22)));
    }
}
