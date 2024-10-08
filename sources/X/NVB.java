package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

public class NVB extends NVC {
    public final C71859Os0 A00 = new Object();
    public final UserSession A01;

    public void A01(NVH nvh) {
        super.A01(nvh);
        User user = nvh.A01.A02;
        if (user != null) {
            OWC owc = this.A02;
            IgImageView igImageView = (IgImageView) AnonymousClass7TE.A14(owc.A0Q);
            View view = owc.A0D.getView();
            C71859Os0 os0 = this.A00;
            AnonymousClass7TG.A1U(igImageView, view, os0);
            DbU.A1S(os0, igImageView, user);
            view.setVisibility(0);
            C66580MXl.A1Q(owc.A0J, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Os0, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NVB(View view, UserSession userSession, OLM olm, int i, boolean z) {
        super(view, userSession, olm, i, z);
        AnonymousClass7TG.A1O(userSession, olm);
        this.A01 = userSession;
    }
}
