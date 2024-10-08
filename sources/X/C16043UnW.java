package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.leadads.repository.LeadFormRepository;

/* renamed from: X.UnW  reason: case insensitive filesystem */
public final class C16043UnW extends C14766U8c {
    public final C319836rJ A00;
    public final WYW A01;
    public final LeadFormRepository A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final UserSession A07;

    public C16043UnW(C319836rJ r2, UserSession userSession, WYW wyw, LeadFormRepository leadFormRepository) {
        AnonymousClass7TG.A1P(userSession, wyw);
        this.A07 = userSession;
        this.A00 = r2;
        this.A01 = wyw;
        this.A02 = leadFormRepository;
        Object A002 = r2.A00("adID");
        if (A002 != null) {
            this.A03 = (String) A002;
            String str = (String) r2.A00("trackingToken");
            this.A06 = str == null ? "" : str;
            this.A04 = (String) r2.A00("dynamicItemID");
            this.A05 = (String) r2.A00(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
