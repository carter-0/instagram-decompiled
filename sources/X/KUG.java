package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class KUG extends C61608KEk {
    public final boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KUG(UserSession userSession, MXF mxf, boolean z) {
        super(userSession, mxf);
        0qQ.A0B(userSession, 1);
        this.A00 = z;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new KUM(DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_section_insights, false), this.A00);
    }

    public final Class modelClass() {
        return KUS.class;
    }
}
