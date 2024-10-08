package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.Fem  reason: case insensitive filesystem */
public final class C50577Fem implements G7D {
    public View A00;
    public TextView A01;
    public final View A02;
    public final TextView A03;
    public final CircularImageView A04;
    public final C71662eb A05;
    public final C71662eb A06;
    public final C71662eb A07;
    public final C71662eb A08;
    public final C71662eb A09;
    public final C71662eb A0A;

    public final CircularImageView Bwa() {
        return this.A04;
    }

    public final StackedAvatarView ByY() {
        return (StackedAvatarView) this.A0A.A01();
    }

    public C50577Fem(View view) {
        this.A02 = view;
        this.A04 = DbU.A0X(view, R.id.row_user_imageview);
        this.A0A = DbY.A0T(view, R.id.row_user_stacked_avatar);
        this.A08 = DbY.A0T(view, R.id.row_user_imageview_reelring);
        this.A03 = DbU.A0G(view, R.id.row_text);
        this.A05 = DbY.A0T(view, R.id.row_follow_button);
        this.A09 = DbY.A0T(view, R.id.row_requested_user_actions_group);
        this.A07 = DbY.A0T(view, R.id.row_inline_survey);
        this.A06 = DbY.A0T(view, R.id.row_inline_survey_confirmation);
    }
}
