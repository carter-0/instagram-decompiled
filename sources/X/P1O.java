package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

public final class P1O implements C74468PvO {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final 1Xj A02;
    public final User A03;
    public final String A04;
    public final String A05;

    public P1O(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3, String str4) {
        1Xj r0;
        DbW.A1N(str, 3, str3);
        this.A01 = userSession;
        this.A00 = r2;
        this.A05 = str;
        this.A04 = str2;
        User A0j = DbV.A0j(userSession, str3);
        if (A0j != null) {
            this.A03 = A0j;
            if (str4 != null) {
                r0 = DbV.A0U(userSession, str4);
            } else {
                r0 = null;
            }
            this.A02 = r0;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* synthetic */ void DBt(C317486nL r1) {
    }

    public final void EMw(AnonymousClass2Ep r14, 2Dm r15, DirectShareTarget directShareTarget, String str, boolean z) {
        1Xj r5;
        String str2 = str;
        0qQ.A0B(str2, 0);
        DirectShareTarget directShareTarget2 = directShareTarget;
        AnonymousClass7TG.A1U(r15, r14, directShareTarget2);
        String str3 = this.A04;
        boolean z2 = z;
        if (str3 == null || (r5 = this.A02) == null) {
            C333527Zh.A00(this.A01).EMr((C254933tI) null, r14.BJy(), str2, NetInfoModule.CONNECTION_TYPE_NONE, (String) null, z2);
            return;
        }
        AnonymousClass1pH.A00().E52(this.A01).A00(directShareTarget2).EMn((C317966o8) null, new C381819cP(this.A00.getModuleName(), "", z2, false), r5, directShareTarget2, str3, this.A05, str2, "direct_reply_modal", false, false);
    }

    public final User CD0() {
        return this.A03;
    }

    public final void CMO(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        AnonymousClass7TG.A1N(viewStub, viewStub2);
        IgImageView A0H = JTP.A0H(viewStub, R.layout.fragment_direct_reply_modal_circular_profile);
        0qQ.A0C(A0H, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.CircularImageView");
        A0H.setUrl(this.A03.Bh3(), this.A00);
        View A0H2 = JTP.A0H(viewStub2, R.layout.fragment_direct_reply_modal_subtitle);
        0qQ.A0C(A0H2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) A0H2;
        Context context = textView.getContext();
        DbT.A18(context, textView, 2131966144);
        DbY.A11(textView, context);
    }
}
