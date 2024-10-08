package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.follow.FollowButton;

public final class HKU extends C53110Gii {
    public final IgdsPeopleCell A00;
    public final FollowButton A01;
    public final /* synthetic */ C53079GiC A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HKU(View view, C53079GiC giC) {
        super(view);
        0qQ.A0B(view, 2);
        this.A02 = giC;
        IgdsPeopleCell igdsPeopleCell = (IgdsPeopleCell) view;
        this.A00 = igdsPeopleCell;
        View A0C = DbT.A0C(DbV.A0D(this.itemView), igdsPeopleCell, R.layout.follow_button_medium);
        0qQ.A0C(A0C, C273654mx.A00(50));
        FollowButton followButton = (FollowButton) A0C;
        this.A01 = followButton;
        followButton.setBaseStyle(C243923aK.MEDIUM);
    }
}
