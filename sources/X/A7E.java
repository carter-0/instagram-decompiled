package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public final class A7E {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final CircularImageView A04;

    public A7E(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A03 = AnonymousClass7TG.A0R(view, R.id.row_feed_survey_title);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.row_feed_survey_subtitle);
        this.A04 = (CircularImageView) AnonymousClass7TF.A0F(view, R.id.row_feed_survey_header_image);
        this.A01 = (ImageView) AnonymousClass7TF.A0F(view, R.id.dotMoreLayout);
    }
}
