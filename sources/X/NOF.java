package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

public final class NOF extends C232222tE {
    public final C70496O8v A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C71966Otr otr = (C71966Otr) r7;
        C67951Mxb mxb = (C67951Mxb) r8;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        TextView textView = mxb.A01;
        textView.setText(otr.A01.A00);
        C71409Ok8.A01(mxb.itemView, 0, otr, this);
        C70496O8v o8v = this.A00;
        View view = mxb.A00;
        C71153OeR oeR = o8v.A00;
        if (!oeR.A0s.A00.getBoolean("has_seen_pending_inbox_filter_tooltip", false)) {
            view.postDelayed(new C73243PZN(view, oeR), 500);
            return;
        }
        OH3 oh3 = oeR.A0q;
        C230882qT r2 = oh3.A05;
        C231002qi r1 = oh3.A01;
        if (r1 == null) {
            0qQ.A0F("quickPromotionPresenter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r2.A00(textView, QPTooltipAnchor.PENDING_INBOX_RANKING_DROPDOWN, r1);
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C67951Mxb(DbT.A0C(layoutInflater, viewGroup, R.layout.pending_threads_inbox_sort_row));
    }

    public final Class modelClass() {
        return C71966Otr.class;
    }

    public NOF(C70496O8v o8v) {
        this.A00 = o8v;
    }
}
