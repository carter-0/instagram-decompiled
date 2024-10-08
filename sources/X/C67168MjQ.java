package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MjQ  reason: case insensitive filesystem */
public final class C67168MjQ extends C67184Mjg {
    public final UserSession A00;
    public final C74491Pvl A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67480Moa(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_header_pill_layout, false), this.A00, this.A01);
    }

    public C67168MjQ(UserSession userSession, C74491Pvl pvl) {
        this.A00 = userSession;
        this.A01 = pvl;
    }
}
