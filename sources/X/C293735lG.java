package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.textview.UpdatableButton;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.5lG  reason: invalid class name and case insensitive filesystem */
public final class C293735lG extends C249703kE {
    public C293975le A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ViewGroup A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final TightTextView A08;
    public final CircularImageView A09;
    public final CircularImageView A0A;
    public final UpdatableButton A0B;
    public final FollowButton A0C;
    public final ViewGroup A0D;

    /* JADX WARNING: type inference failed for: r5v1, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C293735lG(Context context, View view, AnonymousClass0iw r13, UserSession userSession, AnonymousClass4D6 r15) {
        super(view);
        C293975le r4;
        AnonymousClass4D6 r8 = r15;
        0qQ.A0B(r15, 3);
        0qQ.A0B(view, 5);
        View requireViewById = view.requireViewById(R.id.suggested_entity_card_container);
        0qQ.A07(requireViewById);
        this.A01 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.suggested_entity_card_image);
        0qQ.A07(requireViewById2);
        this.A09 = (CircularImageView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.suggested_entity_card_name);
        0qQ.A07(requireViewById3);
        this.A07 = (TextView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.suggested_entity_card_chaining_context);
        0qQ.A07(requireViewById4);
        this.A04 = (ViewGroup) requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.suggested_entity_card_chaining_context_header);
        0qQ.A07(requireViewById5);
        this.A06 = (TextView) requireViewById5;
        View requireViewById6 = view.requireViewById(R.id.suggested_entity_card_chaining_context_pic);
        0qQ.A07(requireViewById6);
        this.A0A = (CircularImageView) requireViewById6;
        View requireViewById7 = view.requireViewById(R.id.suggested_entity_card_social_context_container);
        0qQ.A07(requireViewById7);
        ViewGroup viewGroup = (ViewGroup) requireViewById7;
        this.A0D = viewGroup;
        View requireViewById8 = viewGroup.requireViewById(R.id.suggested_entity_card_context);
        0qQ.A07(requireViewById8);
        ? r5 = (TightTextView) requireViewById8;
        this.A08 = r5;
        View requireViewById9 = viewGroup.requireViewById(R.id.suggested_entity_card_context_stacked_avatar_view);
        0qQ.A07(requireViewById9);
        this.A05 = (ImageView) requireViewById9;
        View requireViewById10 = view.requireViewById(R.id.dismiss_button);
        0qQ.A07(requireViewById10);
        this.A02 = requireViewById10;
        View requireViewById11 = view.requireViewById(R.id.suggested_user_card_follow_button);
        0qQ.A07(requireViewById11);
        FollowButton followButton = (FollowButton) requireViewById11;
        this.A0C = followButton;
        UpdatableButton updatableButton = (UpdatableButton) view.findViewById(R.id.suggested_entity_card_close_friend_button);
        this.A0B = updatableButton;
        View findViewById = view.findViewById(R.id.suggested_user_card_new_badge);
        this.A03 = findViewById;
        Context context2 = r5.getContext();
        r5.setTextColor(context2.getColor(2Yu.A0H(context2, R.attr.igdsSecondaryText)));
        followButton.A0J.A0H = "feed_suggested_user_carousel";
        if (updatableButton != null) {
            r4 = new C293975le(context, r13, userSession, r8, updatableButton);
        } else {
            r4 = null;
        }
        this.A00 = r4;
        0oe.A02(findViewById, AnonymousClass05K.A01, true);
    }
}
