package X;

import android.os.Parcelable;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

public final class P1N implements C74468PvO {
    public final User A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final Product A03;
    public final String A04;

    public final void CMO(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        0qQ.A0B(viewStub, 0);
        ImageUrl Bh3 = this.A00.Bh3();
        IgImageView A0H = JTP.A0H(viewStub, R.layout.fragment_direct_reply_modal_circular_profile);
        0qQ.A0C(A0H, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.CircularImageView");
        A0H.setUrl(Bh3, this.A01);
    }

    public final /* synthetic */ void DBt(C317486nL r1) {
    }

    public final void EMw(AnonymousClass2Ep r8, 2Dm r9, DirectShareTarget directShareTarget, String str, boolean z) {
        0qQ.A0B(str, 0);
        String A12 = DbV.A12(str);
        if (A12 != null && A12.length() != 0) {
            1as.A04.A0E(this.A02, this.A03, this.A01.getModuleName(), this.A04, A12);
        }
    }

    public final User CD0() {
        return this.A00;
    }

    public P1N(AnonymousClass0iw r6, UserSession userSession, Product product, String str) {
        String str2;
        String str3;
        C51972G9s.A1D(product, str);
        this.A02 = userSession;
        this.A01 = r6;
        this.A03 = product;
        this.A04 = str;
        Parcelable.Creator creator = User.CREATOR;
        User user = product.A0B;
        ImageUrl imageUrl = null;
        if (user != null) {
            str2 = AnonymousClass3ZA.A00(user);
            str3 = user.A03.getUsername();
        } else {
            str2 = null;
            str3 = null;
        }
        User user2 = new User(str2, str3);
        user2.A0l(user != null ? user.A03.Bh3() : imageUrl);
        this.A00 = user2;
    }
}
