package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;

public final class NOA extends C232222tE {
    public final C70750OJw A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        NP9 np9 = (NP9) r5;
        C67858Mw2 mw2 = (C67858Mw2) r6;
        AnonymousClass7TG.A1N(np9, mw2);
        C70750OJw oJw = this.A00;
        boolean A1Y = C51970G9q.A1Y(oJw);
        IgdsBanner igdsBanner = mw2.A00;
        DbT.A1U(igdsBanner, np9.A01, A1Y);
        igdsBanner.setAction((CharSequence) np9.A00);
        igdsBanner.A00 = new C50468FcG(oJw, 6);
    }

    public final Class modelClass() {
        return NP9.class;
    }

    public NOA(C70750OJw oJw) {
        this.A00 = oJw;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, X.Mw2] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.pending_threads_banner_row, false);
        ? r1 = new C249703kE(A0D);
        r1.A00 = (IgdsBanner) AnonymousClass7TF.A0F(A0D, R.id.pending_threads_banner);
        return r1;
    }
}
