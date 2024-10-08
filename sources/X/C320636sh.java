package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.6sh  reason: invalid class name and case insensitive filesystem */
public final class C320636sh extends C232222tE {
    public final C320356sF A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
    }

    public final C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        C46899DnF dnF = new C46899DnF(layoutInflater.inflate(R.layout.layout_clips_grid_video_series_item, viewGroup, false));
        AnonymousClass0fU.A00(new AND(this), dnF.itemView);
        return dnF;
    }

    public final Class modelClass() {
        return C320686sm.class;
    }

    public C320636sh(C320356sF r1) {
        this.A00 = r1;
    }
}
