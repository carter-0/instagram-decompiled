package X;

import android.view.ViewStub;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

public final class P1L implements C74468PvO {
    public final User A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;

    public P1L(AnonymousClass0iw r2, UserSession userSession, String str, String str2) {
        0qQ.A0B(str2, 3);
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = r2;
        User A0j = DbV.A0j(userSession, str2);
        if (A0j != null) {
            this.A00 = A0j;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void CMO(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        0qQ.A0B(viewStub, 0);
        IgImageView A0H = JTP.A0H(viewStub, R.layout.fragment_direct_reply_modal_circular_profile);
        0qQ.A0C(A0H, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.CircularImageView");
        A0H.setUrl(this.A00.Bh3(), this.A01);
    }

    public final /* synthetic */ void DBt(C317486nL r1) {
    }

    public final void EMw(AnonymousClass2Ep r12, 2Dm r13, DirectShareTarget directShareTarget, String str, boolean z) {
        DbY.A1S(str, r12);
        UserSession userSession = this.A02;
        C333527Zh.A00(userSession).EMr((C254933tI) null, r12.BJy(), str, NetInfoModule.CONNECTION_TYPE_NONE, (String) null, z);
        C69842Nt6.A00(userSession, this.A04);
        C3265677h.A0L(this.A01, userSession, this.A03, "", "");
    }

    public final User CD0() {
        return this.A00;
    }
}
