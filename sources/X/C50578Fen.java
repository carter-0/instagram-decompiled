package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.Fen  reason: case insensitive filesystem */
public final class C50578Fen implements G7D {
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public final View A04;
    public final TextView A05;
    public final CircularImageView A06;
    public final C71662eb A07;
    public final C71662eb A08;
    public final C71662eb A09;
    public final C71662eb A0A;
    public final C71662eb A0B;
    public final C71662eb A0C;

    public static void A00(C50578Fen fen) {
        C71662eb r1 = fen.A09;
        if (!r1.A04()) {
            View A012 = r1.A01();
            fen.A00 = A012.requireViewById(R.id.row_newsfeed_like_button_click_area);
            fen.A02 = DbU.A0G(A012, R.id.row_newsfeed_textview_reply_button);
            fen.A01 = DbU.A0G(A012, R.id.row_newsfeed_textview_private_reply_button);
            fen.A03 = DbU.A0G(A012, R.id.row_newsfeed_textview_send_button);
        }
    }

    public final CircularImageView Bwa() {
        return this.A06;
    }

    public final StackedAvatarView ByY() {
        return (StackedAvatarView) this.A0C.A01();
    }

    public C50578Fen(View view) {
        this.A04 = view;
        this.A06 = DbU.A0X(view, R.id.row_user_imageview);
        this.A0B = DbY.A0T(view, R.id.row_user_imageview_reelring);
        this.A0C = DbY.A0T(view, R.id.row_user_stacked_avatar);
        this.A05 = DbU.A0G(view, R.id.row_text);
        this.A0A = DbY.A0T(view, R.id.row_media_image);
        this.A09 = DbY.A0T(view, R.id.row_like_and_reply_controls);
        this.A08 = DbY.A0T(view, R.id.row_inline_survey);
        this.A07 = DbY.A0T(view, R.id.row_inline_survey_confirmation);
    }
}
