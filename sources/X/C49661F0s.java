package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.F0s  reason: case insensitive filesystem */
public final class C49661F0s {
    public final View A00;
    public final TextView A01;
    public final CircularImageView A02;
    public final C71662eb A03;
    public final C71662eb A04;
    public final C71662eb A05;
    public final C71662eb A06;
    public final C71662eb A07;
    public final C71662eb A08;

    public C49661F0s(View view) {
        this.A00 = view;
        this.A02 = DbU.A0X(view, R.id.row_user_imageview);
        this.A08 = DbY.A0T(view, R.id.row_user_imageview_reelring);
        this.A03 = DbY.A0T(view, R.id.row_user_branding_badge);
        this.A01 = DbU.A0G(view, R.id.row_text);
        this.A04 = DbY.A0T(view, R.id.row_hashtag_follow_button);
        this.A07 = DbY.A0T(view, R.id.row_media_set);
        this.A06 = DbY.A0T(view, R.id.row_inline_survey);
        this.A05 = DbY.A0T(view, R.id.row_inline_survey_confirmation);
    }
}
