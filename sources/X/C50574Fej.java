package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.Fej  reason: case insensitive filesystem */
public final class C50574Fej implements G7D {
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

    public C50574Fej(View view) {
        this.A00 = view;
        this.A02 = DbU.A0X(view, R.id.row_user_imageview);
        this.A07 = DbY.A0T(view, R.id.row_user_imageview_reelring);
        this.A08 = DbY.A0T(view, R.id.row_user_stacked_avatar);
        this.A01 = DbU.A0G(view, R.id.row_text);
        this.A03 = DbY.A0T(view, R.id.row_follow_button);
        this.A05 = DbY.A0T(view, R.id.row_inline_survey);
        this.A04 = DbY.A0T(view, R.id.row_inline_survey_confirmation);
        this.A06 = DbY.A0T(view, R.id.row_quick_message_button);
    }
}
