package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

public final class UDR extends C249703kE {
    public final IgTextView A00;
    public final IgView A01;
    public final CircularImageView A02;
    public final IgdsButton A03;

    public UDR(View view) {
        super(view);
        this.A00 = Dba.A0E(view, R.id.lead_ad_multi_submit_advertiser_username);
        this.A02 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.lead_ad_multi_submit_circular_imageview);
        this.A01 = (IgView) AnonymousClass7TE.A0b(view, R.id.horizontal_divider);
        this.A03 = C13989Tnp.A0X(view, R.id.thank_you_cta_button);
    }
}
