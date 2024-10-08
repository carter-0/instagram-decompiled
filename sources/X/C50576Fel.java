package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.pollresults.PollResultsView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.Fel  reason: case insensitive filesystem */
public final class C50576Fel implements G7D {
    public PollResultsView A00;
    public final View A01;
    public final ViewStub A02;
    public final TextView A03;
    public final CircularImageView A04;
    public final C71662eb A05;
    public final C71662eb A06;
    public final C71662eb A07;
    public final C71662eb A08;

    public final CircularImageView Bwa() {
        return this.A04;
    }

    public final StackedAvatarView ByY() {
        return (StackedAvatarView) this.A07.A01();
    }

    public C50576Fel(View view) {
        this.A01 = view;
        this.A04 = DbU.A0X(view, R.id.row_user_imageview);
        this.A05 = DbY.A0S(view, R.id.row_user_imageview_reelring);
        this.A07 = DbY.A0S(view, R.id.row_user_stacked_avatar);
        this.A03 = DbU.A0G(view, R.id.row_text);
        this.A08 = DbY.A0S(view, R.id.row_stacked_media_image);
        this.A06 = DbY.A0S(view, R.id.reel_media_view);
        this.A02 = DbU.A0D(view, R.id.poll_results_stub);
    }
}
