package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NQ2 extends C232232tF {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C317116mk A02;
    public final C74360Pta A03;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        C71961Otm otm = (C71961Otm) r9;
        C68019Myl myl = (C68019Myl) r10;
        AnonymousClass7TG.A1N(otm, myl);
        C317116mk r4 = this.A02;
        C70313O1r.A00(this.A00, this.A01, otm.A00, (AnonymousClass3BT) null, r4, this.A03, myl, myl.getAbsoluteAdapterPosition());
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        LayoutInflater A0F = DbX.A0F(viewGroup, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C68019Myl(viewGroup, DbT.A0D(A0F, viewGroup, R.layout.layout_roll_call_interstitial_item, false));
    }

    public final Class modelClass() {
        return C71961Otm.class;
    }

    public NQ2(AnonymousClass0iw r1, UserSession userSession, C317116mk r3, C74360Pta pta) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = r1;
        this.A03 = pta;
    }
}
