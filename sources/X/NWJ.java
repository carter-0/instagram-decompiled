package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NWJ extends C67184Mjg {
    public final UserSession A00;
    public final C74491Pvl A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new NWK(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_linear_layout_pill_layout, false), this.A00, this.A01);
    }

    public NWJ(UserSession userSession, C74491Pvl pvl) {
        this.A00 = userSession;
        this.A01 = pvl;
    }
}
