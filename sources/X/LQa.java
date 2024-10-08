package X;

import android.view.View;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

public final class LQa {
    public final View A00;
    public final View A01;
    public final ScrollView A02;
    public final RecyclerView A03;
    public final IgdsButton A04;
    public final IgAutoCompleteTextView A05;

    public LQa(View view) {
        this.A02 = (ScrollView) AnonymousClass7TF.A0F(view, R.id.scroll_view);
        this.A03 = JTR.A0c(view, R.id.media_preview_recycler_view);
        this.A05 = (IgAutoCompleteTextView) AnonymousClass7TF.A0F(view, R.id.caption_text_view);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.content_overlay);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.followers_share_content_rows_disabled_overlay);
        this.A04 = JTR.A0n(view, R.id.save_draft_footer_button);
    }

    public static RecyclerView A00(FollowersShareFragment followersShareFragment) {
        return followersShareFragment.A0S().A03;
    }

    public static IgAutoCompleteTextView A01(FollowersShareFragment followersShareFragment) {
        return followersShareFragment.A0S().A05;
    }
}
