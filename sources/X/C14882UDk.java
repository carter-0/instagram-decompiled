package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.UDk  reason: case insensitive filesystem */
public final class C14882UDk extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final CircularImageView A03;
    public final IgdsCheckBox A04;

    public C14882UDk(View view) {
        super(view);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.lead_ad_multi_submit_row);
        this.A01 = Dba.A0E(view, R.id.lead_ad_multi_submit_advertiser_username);
        this.A02 = Dba.A0E(view, R.id.lead_ad_multi_submit_advertiser_subtitle);
        this.A03 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.lead_ad_multi_submit_circular_imageview);
        this.A04 = (IgdsCheckBox) AnonymousClass7TE.A0b(view, R.id.lead_ad_multi_submit_check_box);
    }
}
