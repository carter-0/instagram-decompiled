package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public final class LNx {
    public C70648OEv A00;
    public final UserSession A01;
    public final Queue A02 = new LinkedList();

    public final void A01(List list) {
        0qQ.A0B(list, 0);
        Queue queue = this.A02;
        queue.clear();
        queue.addAll(00k.A0S(0jo.A1G(00k.A0c(list, 1)), 00k.A0d(list, 1)));
        A00(this);
    }

    public static final void A00(LNx lNx) {
        LNx lNx2 = lNx;
        C61030JvU jvU = (C61030JvU) lNx2.A02.poll();
        if (jvU != null) {
            MMO mmo = new MMO(lNx2, 15);
            IgImageView igImageView = (IgImageView) jvU.A03;
            Context A0S = AnonymousClass7TE.A0S(igImageView);
            UserSession userSession = lNx2.A01;
            Drawable A012 = C320996tP.A01(A0S, userSession, (C320986tO) null, jvU.A05, (String) null, (String) null, (String) null, jvU.A01, jvU.A02, false, false, C63282KuR.A00(userSession), false, false);
            lNx2.A00 = C71081Ob0.A00.A02(A012, igImageView, (IgImageView) jvU.A04, jvU.A06, mmo, false);
        }
    }

    public LNx(UserSession userSession) {
        this.A01 = userSession;
    }
}
