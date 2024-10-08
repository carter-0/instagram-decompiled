package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.F0o  reason: case insensitive filesystem */
public final class C49657F0o {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final C252063oV A04;
    public final C252063oV A05;
    public final GradientSpinnerAvatarView A06;
    public final FollowButton A07;

    public C49657F0o(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 1);
        this.A06 = DbX.A0j(viewGroup, R.id.user_avatar);
        this.A01 = AnonymousClass7TG.A0R(viewGroup, R.id.other_user_full_name_or_username);
        this.A02 = AnonymousClass7TG.A0R(viewGroup, R.id.network_attribution);
        this.A04 = 2b1.A00(viewGroup.findViewById(R.id.thread_context_item_stub_0));
        this.A05 = 2b1.A00(viewGroup.findViewById(R.id.thread_context_item_stub_1));
        this.A00 = DbX.A0I(viewGroup, R.id.null_state_shortcut_container);
        this.A03 = AnonymousClass7TG.A0R(viewGroup, R.id.view_profile_button);
        this.A07 = (FollowButton) AnonymousClass7TF.A0F(viewGroup, R.id.follow_button);
    }
}
