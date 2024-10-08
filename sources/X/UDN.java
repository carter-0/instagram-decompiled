package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class UDN extends C249703kE {
    public final LinearLayout A00;
    public final TextView A01;
    public final IgSimpleImageView A02;
    public final IgImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDN(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.row_effect_recent_search_container);
        this.A03 = DbX.A0b(view, R.id.row_search_profile_image);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.row_effect_recent_search_title);
        this.A02 = DbX.A0Y(view, R.id.dismiss_button);
    }
}
