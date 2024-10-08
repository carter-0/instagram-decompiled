package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

public final class IJQ implements AnonymousClass2WT {
    public static final IJQ A00 = new IJQ();

    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        View A08 = DbU.A08(DbT.A0B(context), R.layout.suggested_entity_card);
        0qQ.A0C(A08, AnonymousClass000.A00(5));
        View A0F = AnonymousClass7TF.A0F(A08, R.id.suggested_entity_card_container);
        CircularImageView A0a = DbX.A0a(A08, R.id.suggested_entity_card_image);
        A08.setTag(new C55831HoE(A0F, AnonymousClass7TF.A0G(A08, R.id.dismiss_button), AnonymousClass7TG.A0R(A08, R.id.suggested_entity_card_name), AnonymousClass7TG.A0R(A08, R.id.suggested_entity_card_context), A0a, (FollowButton) AnonymousClass7TF.A0G(A08, R.id.suggested_user_card_follow_button)));
        Object tag = A08.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.adapter.row.coalesced.followchaining.SuggestedEntityUserCardComponent.Holder");
        ((C55831HoE) tag).A05.setVisibility(0);
        return A08;
    }
}
