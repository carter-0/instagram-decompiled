package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.Uht  reason: case insensitive filesystem */
public final class C15748Uht extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.upcoming_event_cta_row_item, false);
        Object A0U = C13988Tno.A0U(A09, new UCN(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventCtaRowItemViewBinder.ViewHolder");
        return (C249703kE) A0U;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        WSE wse = (WSE) r5;
        UCN ucn = (UCN) r6;
        AnonymousClass7TG.A1N(wse, ucn);
        IgdsListCell igdsListCell = ucn.A00;
        N4G n4g = wse.A00;
        C20862X1o x1o = wse.A01;
        igdsListCell.A05(n4g.A00);
        igdsListCell.A0I(n4g.A01);
        if (x1o == null) {
            igdsListCell.setAlpha(0.3f);
        } else {
            igdsListCell.A0C(new WB0(x1o, 30));
        }
    }

    public final Class modelClass() {
        return WSE.class;
    }
}
