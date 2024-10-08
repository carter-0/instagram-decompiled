package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class LFP {
    public final Context A00;
    public final LP7 A01;
    public final C63952LEu A02;
    public final UserSession A03;
    public final C3499682q A04;
    public final MUI A05;
    public final boolean A06;

    public final void A00() {
        LP7 lp7 = this.A01;
        if (lp7.A04()) {
            View view = lp7.A01;
            if (view != null) {
                view.setAlpha(1.0f);
                C64273LXz.A00(lp7.A01, 57, lp7);
            }
            C62565Khv khv = C62565Khv.AUTO_PLACE;
            UserSession userSession = this.A03;
            C3499682q r1 = this.A04;
            ArrayList A012 = LTX.A01(userSession, r1, khv);
            if (!this.A06 || LTZ.A01(userSession, r1) != 0 || !(!A012.isEmpty())) {
                this.A05.DkO(false, 0);
                this.A02.A01(0sn.A00);
                lp7.A01();
                return;
            }
            this.A05.DkO(true, A012.size());
            this.A02.A01(A012);
            lp7.A02(true);
        }
    }

    public final void A01() {
        LP7 lp7 = this.A01;
        View view = lp7.A01;
        if (view == null) {
            0wb.A03("ProductTagRowControllerImpl", "maybeShow called before setRootView");
        } else if (lp7.A04()) {
            view.setVisibility(0);
            LE2 le2 = lp7.A0C;
            if (le2 != null) {
                le2.A00(view);
            }
        } else {
            view.setVisibility(8);
        }
    }

    public LFP(Context context, UserSession userSession, C3499582p r4, LP7 lp7, MUI mui, boolean z) {
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = lp7;
        this.A05 = mui;
        this.A06 = z;
        this.A02 = new C63952LEu(mui, z);
        this.A04 = r4.A00();
    }
}
