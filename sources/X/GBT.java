package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class GBT extends GBR {
    public final AnonymousClass0iw A00;
    public final C51980GAd A01;

    public final boolean A02() {
        return false;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.layout_clips_viewer_survey, false);
        C54582HJr hJr = new C54582HJr(A09);
        A09.setTag(hJr);
        return hJr;
    }

    public final Class modelClass() {
        return C54579HJo.class;
    }

    public GBT(JSx jSx, AnonymousClass0iw r2, C51987GAk gAk, C51980GAd gAd) {
        super(jSx, gAk);
        this.A00 = r2;
        this.A01 = gAd;
    }
}
