package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Mye  reason: case insensitive filesystem */
public final class C68012Mye extends C249703kE {
    public final View A00;
    public final IgdsPeopleCell A01;
    public final FollowButton A02;
    public final View A03;
    public final View A04;

    public C68012Mye(View view) {
        super(view);
        this.A04 = view;
        IgdsPeopleCell igdsPeopleCell = (IgdsPeopleCell) AnonymousClass7TF.A0F(view, R.id.people_cell);
        this.A01 = igdsPeopleCell;
        View A0D = DbT.A0D(DbV.A0D(this.itemView), igdsPeopleCell, R.layout.follow_button_medium, false);
        this.A03 = A0D;
        this.A02 = (FollowButton) AnonymousClass7TF.A0F(A0D, R.id.row_follow_button);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.hide_button);
        igdsPeopleCell.setPadding(igdsPeopleCell.getPaddingLeft(), igdsPeopleCell.getPaddingTop(), igdsPeopleCell.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material), igdsPeopleCell.getPaddingBottom());
    }
}
