package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class EH8 extends C232232tF {
    public View A00;
    public final E7Y A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C46990Doi doi = (C46990Doi) r6;
        0qQ.A0B(doi, 1);
        E7Y e7y = this.A01;
        0qQ.A0B(e7y, 1);
        FP1.A01(doi.A00, 44, e7y);
        doi.A01.setImageResource(R.drawable.instagram_group_pano_filled_24);
        doi.A03.setText(2131954683);
        IgTextView igTextView = doi.A02;
        igTextView.setVisibility(0);
        igTextView.setText(2131954682);
        igTextView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final Class modelClass() {
        return C50316FXv.class;
    }

    public EH8(E7Y e7y) {
        this.A01 = e7y;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_campfire_create_row, false);
        this.A00 = A0D;
        return new C46990Doi(A0D);
    }
}
