package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NQ8 extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67905Mwn(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_campaign_loading_indicator, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        C67905Mwn mwn = (C67905Mwn) r3;
        0qQ.A0B(mwn, 1);
        DbS.A1T(mwn.A00);
    }

    public final Class modelClass() {
        return C71954Otf.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        C67905Mwn mwn = (C67905Mwn) r3;
        0qQ.A0B(mwn, 0);
        mwn.A00.setLoadingStatus(C255943uy.SUCCESS);
    }
}
