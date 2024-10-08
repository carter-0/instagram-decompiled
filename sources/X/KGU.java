package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class KGU extends C232232tF {
    public final float A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.media_thumbnail_preview_null_state_item_layout, viewGroup, false);
        ((MediaFrameLayout) AnonymousClass7TF.A0F(inflate, R.id.preview_null_state_item)).A00 = this.A00;
        return new C249703kE(inflate);
    }

    public final Class modelClass() {
        return C64747LhO.class;
    }

    public KGU(float f) {
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
    }
}
