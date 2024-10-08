package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class H7P extends C232232tF {
    public final Context A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C53120Gis(DbU.A09(layoutInflater, viewGroup, R.layout.fan_club_consideration_more_teaser_view, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C53120Gis gis = (C53120Gis) r5;
        0qQ.A0B(gis, 1);
        IgTextView igTextView = gis.A00;
        Context context = this.A00;
        DbT.A18(context, igTextView, 2131961961);
        DbU.A13(context, gis.A01, R.drawable.ig_illustrations_qp_crown_badge_refresh);
    }

    public final Class modelClass() {
        return C50315FXu.class;
    }

    public H7P(Context context) {
        this.A00 = context;
    }
}
