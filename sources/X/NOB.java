package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header.PendingThreadsMessageSettingsView;

public final class NOB extends C232222tE {
    public final C70750OJw A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C71965Otq otq = (C71965Otq) r3;
        Mx0 mx0 = (Mx0) r4;
        AnonymousClass7TG.A1N(otq, mx0);
        0qQ.A0B(this.A00, 2);
        PendingThreadsMessageSettingsView pendingThreadsMessageSettingsView = mx0.A00;
        pendingThreadsMessageSettingsView.setTitleText(otq.A01);
        pendingThreadsMessageSettingsView.setLinkToSettingsVisibility(8);
    }

    public final Class modelClass() {
        return C71965Otq.class;
    }

    public NOB(C70750OJw oJw) {
        this.A00 = oJw;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.pending_threads_header_row, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header.PendingThreadsMessageSettingsView");
        return new Mx0((PendingThreadsMessageSettingsView) inflate);
    }
}
