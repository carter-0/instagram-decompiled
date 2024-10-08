package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public final class OMs {
    public final View A00;
    public final View A01;
    public final IgSimpleImageView A02;
    public final IgSimpleImageView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final CircularImageView A06;

    public final void A01(String str) {
        IgTextView igTextView = this.A04;
        igTextView.setVisibility(0);
        igTextView.setText(str);
    }

    public final void A00(int i) {
        IgSimpleImageView igSimpleImageView = this.A02;
        igSimpleImageView.setVisibility(0);
        DbU.A13(igSimpleImageView.getContext(), igSimpleImageView, i);
    }

    public OMs(View view) {
        this.A00 = view;
        this.A05 = DbX.A0Z(view, R.id.item_title);
        this.A04 = DbX.A0Z(view, R.id.item_subtitle);
        this.A02 = DbX.A0Y(view, R.id.item_icon);
        this.A06 = DbX.A0a(view, R.id.item_circular_icon);
        this.A03 = DbX.A0Y(view, R.id.notification_dot);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.new_badge);
    }
}
