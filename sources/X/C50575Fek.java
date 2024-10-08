package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.Fek  reason: case insensitive filesystem */
public final class C50575Fek implements G7D {
    public final View A00;
    public final TextView A01;
    public final CircularImageView A02;
    public final C71662eb A03;
    public final C71662eb A04;
    public final C71662eb A05;
    public final C71662eb A06;
    public final C71662eb A07;
    public final C71662eb A08;

    public final CircularImageView Bwa() {
        return this.A02;
    }

    public final StackedAvatarView ByY() {
        return (StackedAvatarView) this.A08.A01();
    }

    public C50575Fek(View view) {
        this.A00 = view;
        this.A02 = DbU.A0X(view, R.id.row_user_imageview);
        this.A08 = DbY.A0S(view, R.id.row_user_stacked_avatar);
        this.A06 = DbY.A0S(view, R.id.row_user_imageview_reelring);
        this.A01 = DbU.A0G(view, R.id.row_text);
        this.A03 = DbY.A0S(view, R.id.blue_dot);
        this.A07 = DbY.A0S(view, R.id.right_arrow);
        this.A05 = DbY.A0S(view, R.id.row_inline_survey);
        this.A04 = DbY.A0S(view, R.id.row_inline_survey_confirmation);
    }
}
