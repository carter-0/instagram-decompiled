package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;

public final class EFR extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final ExY A02;
    public final boolean A03;
    public final boolean A04;

    public EFR(AnonymousClass0iw r2, UserSession userSession, ExY exY, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = exY;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.direct.fragment.sharesheet.util.DirectShareSheetApi, java.lang.Object] */
    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        return new DirectShareSheetFragmentViewModel(userSession, this.A02, new Object(), C49757F5i.A00(this.A00, userSession), 17h.A00(userSession), this.A03, this.A04);
    }
}
