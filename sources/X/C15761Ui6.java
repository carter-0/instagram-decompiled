package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Ui6  reason: case insensitive filesystem */
public final class C15761Ui6 extends C232222tE {
    public final VPE A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        WS4 ws4 = (WS4) r4;
        UCK uck = (UCK) r5;
        AnonymousClass7TG.A1N(ws4, uck);
        VPE vpe = this.A00;
        0qQ.A0B(vpe, 2);
        TextView textView = uck.A00;
        textView.setText(ws4.A00.A01);
        WBD.A00(textView, 67, ws4, vpe);
    }

    public final Class modelClass() {
        return WS4.class;
    }

    public C15761Ui6(VPE vpe) {
        this.A00 = vpe;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new UCK(DbT.A0D(layoutInflater, viewGroup, R.layout.tagging_feed_expansion, false));
    }
}
