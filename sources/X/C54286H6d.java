package X;

import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.common.session.UserSession;

/* renamed from: X.H6d  reason: case insensitive filesystem */
public final class C54286H6d extends C228042kh {
    public final ClipsTemplateBrowserV2Type A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final String A03;

    public C54286H6d(ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type, AnonymousClass4DH r3, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = clipsTemplateBrowserV2Type;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        Fragment fragment = this.A01;
        return new C53023GhE(userSession, new C55840HoN(fragment.requireContext(), AnonymousClass07i.A00(fragment), this.A00, userSession, this.A03), new C55560Hjg());
    }
}
