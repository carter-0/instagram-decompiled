package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.follow.chaining.FollowChainingButton;
import com.instagram.user.follow.FollowButton;

public final class F17 {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ViewGroup A04;
    public final ViewStub A05;
    public final ViewStub A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final FollowChainingButton A0B;
    public final FollowButton A0C;
    public final View A0D;
    public final ViewStub A0E;

    public F17(View view) {
        this.A03 = view;
        this.A0D = view.requireViewById(R.id.profile_scoreboard_header);
        this.A02 = view.requireViewById(R.id.row_profile_header_container_photos);
        this.A0A = DbU.A0G(view, R.id.row_profile_header_textview_photos_count);
        this.A00 = view.requireViewById(R.id.row_profile_header_container_followers);
        this.A08 = DbU.A0G(view, R.id.row_profile_header_textview_followers_count);
        this.A01 = view.requireViewById(R.id.row_profile_header_container_following);
        this.A09 = DbU.A0G(view, R.id.row_profile_header_textview_following_count);
        FollowButton followButton = (FollowButton) view.requireViewById(R.id.row_profile_header_button_follow);
        this.A0C = followButton;
        C267064at r1 = followButton.A0J;
        r1.A0H = "user_profile_header";
        r1.A0J = null;
        r1.A0I = null;
        r1.A06 = null;
        this.A0B = (FollowChainingButton) view.requireViewById(R.id.row_profile_header_button_chaining);
        this.A07 = DbU.A0G(view, R.id.row_profile_header_edit_profile);
        this.A05 = DbU.A0D(view, R.id.row_profile_header_direct_message_stub);
        ViewGroup A0C2 = DbU.A0C(view, R.id.similar_accounts_container);
        this.A04 = A0C2;
        A0C2.setVisibility(8);
        this.A06 = DbU.A0D(view, R.id.row_profile_header_no_user_stub);
        this.A0E = DbU.A0D(view, R.id.row_profile_header_promote_stub);
    }
}
