package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class F12 {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final C71662eb A09;
    public final C71662eb A0A;

    public F12(View view) {
        View requireViewById = view.requireViewById(R.id.follow_sheet_close_friends_row);
        this.A00 = requireViewById;
        this.A05 = AnonymousClass7TE.A0d(requireViewById, R.id.profile_follow_relationship_row_title);
        this.A03 = DbU.A0F(requireViewById, R.id.profile_follow_relationship_row_icon);
        View requireViewById2 = view.requireViewById(R.id.follow_sheet_feed_favorites_row);
        this.A01 = requireViewById2;
        this.A06 = DbU.A0G(requireViewById2, R.id.profile_follow_relationship_row_title);
        this.A04 = DbU.A0F(requireViewById2, R.id.profile_follow_relationship_row_icon);
        View requireViewById3 = view.requireViewById(R.id.follow_sheet_mute_row);
        this.A02 = requireViewById3;
        this.A07 = AnonymousClass7TE.A0d(requireViewById3, R.id.profile_follow_relationship_row_title);
        this.A09 = DbY.A0T(requireViewById3, R.id.profile_follow_relationship_row_subtext_stub);
        this.A0A = DbY.A0T(view, R.id.follow_sheet_restrict_stub);
        this.A08 = DbU.A0G(view, R.id.follow_sheet_unfollow_row);
    }
}
