package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

public final class OGI {
    public final TextView A00;
    public final TextView A01;
    public final IgLinearLayout A02;
    public final IgSimpleImageView A03;
    public final RoundedCornerConstraintLayout A04;

    public OGI(View view) {
        0qQ.A0B(view, 1);
        this.A02 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.row_feed_notice_with_thumbnail);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.row_feed_notice_text);
        this.A01 = A0R;
        this.A00 = AnonymousClass7TG.A0R(view, R.id.row_feed_notice_sub_text);
        this.A04 = (RoundedCornerConstraintLayout) AnonymousClass7TF.A0F(view, R.id.row_feed_notice_thumbnail);
        this.A03 = DbX.A0Y(view, R.id.row_feed_notice_icon);
        DbT.A1H(A0R);
    }
}
