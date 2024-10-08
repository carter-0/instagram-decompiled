package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class KUI extends C61608KEk {
    public final Fragment A00;
    public final UserSession A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KUI(Fragment fragment, UserSession userSession, MXF mxf, boolean z) {
        super(userSession, mxf);
        0qQ.A0B(userSession, 2);
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new KUO(DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_section_profiles, false), this.A00, this.A01, this.A02);
    }

    public final Class modelClass() {
        return KUR.class;
    }
}
