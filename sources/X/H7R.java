package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class H7R extends C232232tF {
    public final UserSession A00;
    public final C67161MjJ A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53117Gip(DbT.A0D(layoutInflater, viewGroup, R.layout.twinbox_filter_layout, false), this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        NPL npl = (NPL) r11;
        C53117Gip gip = (C53117Gip) r12;
        AnonymousClass7TG.A1N(npl, gip);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C53343GmT gmT : npl.A00) {
            int i = gmT.A02;
            int i2 = gmT.A00;
            int i3 = gmT.A01;
            A1C.add(new C55830HoD(gmT.A03, gmT.A04, gmT.A05, i, i2, i3));
        }
        C53068Gi1 gi1 = gip.A00;
        DbW.A0z(gi1, A1C, gi1.A02);
    }

    public final Class modelClass() {
        return NPL.class;
    }

    public H7R(UserSession userSession, C67161MjJ mjJ) {
        this.A00 = userSession;
        this.A01 = mjJ;
    }
}
