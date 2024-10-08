package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class KUJ extends C61608KEk {
    public final AnonymousClass2tC A00;
    public final C63658L1u A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KUJ(AnonymousClass2tC r4, UserSession userSession, MXF mxf, boolean z) {
        super(userSession, mxf);
        0qQ.A0B(userSession, 1);
        this.A00 = r4;
        this.A02 = z;
        0Tu r2 = 0Tu.A05;
        182.A06(r2, userSession, 36316289245450443L);
        this.A01 = new C63658L1u(182.A06(r2, userSession, 36316289244991690L));
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new KUN(DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_section_post, false), this.A02);
    }

    public final Class modelClass() {
        return KUQ.class;
    }
}
