package X;

import android.view.View;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

public final class NR0 extends C339867kI {
    public final /* synthetic */ C317486nL A00;
    public final /* synthetic */ OD8 A01;

    /* JADX WARNING: type inference failed for: r5v1, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void DP5(View view) {
        View view2 = view;
        0qQ.A0B(view, 0);
        OD8 od8 = this.A01;
        C317486nL r6 = this.A00;
        if (C336957fS.A03(r6.A02) && C337097fg.A00(r6)) {
            OLV olv = od8.A01;
            UserSession userSession = olv.A02;
            AnonymousClass0iw r3 = od8.A00;
            if (r3 != null) {
                ? r5 = (ConstrainedImageView) view2;
                new C56807IDe(r3, userSession, r5, r6, new PRJ(1, olv, r6), DbU.A05(r5).getDimensionPixelSize(R.dimen.abc_star_medium), true);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final boolean Dqe(View view) {
        0qQ.A0B(view, 0);
        this.A01.A01.A04.A0I(this.A00.A02, NetInfoModule.CONNECTION_TYPE_NONE, "quick_emoji_tray", (String) null);
        return true;
    }

    public NR0(C317486nL r1, OD8 od8) {
        this.A01 = od8;
        this.A00 = r1;
    }
}
