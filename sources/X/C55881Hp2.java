package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Hp2  reason: case insensitive filesystem */
public final class C55881Hp2 {
    public View.OnClickListener A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final CircularImageView A07;
    public final IgImageView A08;
    public final IgImageView A09;
    public final FollowButton A0A;

    public C55881Hp2(View view) {
        0qQ.A0B(view, 1);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.save_collection_header_title);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.visible_subtitle);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.num_posts);
        this.A08 = DbX.A0b(view, R.id.audience_icon);
        this.A09 = DbX.A0b(view, R.id.dropdown_icon);
        this.A07 = DbX.A0a(view, R.id.save_collection_header_facepile);
        this.A06 = AnonymousClass7TG.A0R(view, R.id.username);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.visibility_header);
        this.A0A = (FollowButton) AnonymousClass7TF.A0F(view, R.id.follow_button);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.follow_separator);
    }
}
