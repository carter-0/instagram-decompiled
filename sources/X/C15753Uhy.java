package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.model.venue.Venue;

/* renamed from: X.Uhy  reason: case insensitive filesystem */
public final class C15753Uhy extends C232222tE {
    public final VOP A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = DbX.A0E(viewGroup).inflate(R.layout.row_location_map, viewGroup, false);
        inflate.setTag(new VOV(inflate));
        return new C249703kE(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C19283WSr wSr = (C19283WSr) r4;
        AnonymousClass7TG.A1N(wSr, r5);
        Venue venue = wSr.A02;
        if (venue.A00() != null && venue.A01() != null) {
            Object tag = r5.itemView.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.maps.adapter.LocationMapRowViewBinder.Holder");
            C18378Vqe.A00(this.A00, (VOV) tag, venue);
        }
    }

    public final Class modelClass() {
        return C19283WSr.class;
    }

    public C15753Uhy(VOP vop) {
        this.A00 = vop;
    }
}
