package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.DpI  reason: case insensitive filesystem */
public final class C47026DpI extends C249703kE {
    public final IgImageView A00;
    public final IgImageView A01;
    public final IgImageView A02;
    public final IgdsPeopleCell A03;
    public final GradientSpinnerAvatarView A04;
    public final FollowButton A05;
    public final View A06;
    public final View A07;

    public C47026DpI(View view) {
        super(view);
        this.A07 = view;
        IgdsPeopleCell igdsPeopleCell = (IgdsPeopleCell) AnonymousClass7TF.A0F(view, R.id.business_cell);
        this.A03 = igdsPeopleCell;
        this.A04 = DbX.A0j(view, R.id.imageview);
        View A0D = DbT.A0D(DbV.A0D(this.itemView), igdsPeopleCell, R.layout.layout_follow_button_event, false);
        this.A06 = A0D;
        this.A05 = (FollowButton) AnonymousClass7TF.A0F(A0D, R.id.row_follow_button);
        this.A00 = DbX.A0b(view, R.id.business_media_preview_1);
        this.A01 = DbX.A0b(view, R.id.business_media_preview_2);
        this.A02 = DbX.A0b(view, R.id.business_media_preview_3);
    }
}
