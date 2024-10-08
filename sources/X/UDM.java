package X;

import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

public final class UDM extends C249703kE {
    public final LinearLayout A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDM(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.campaign_controls_row);
        this.A03 = DbX.A0Z(view, R.id.campaign_controls_row_text);
        this.A02 = DbX.A0Z(view, R.id.campaign_controls_row_subtext);
        this.A01 = DbX.A0Y(view, R.id.campaign_controls_row_arrow);
    }
}
