package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.BlockButton;

public final class VZN {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final BlockButton A04;

    public VZN(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 1);
        this.A00 = viewGroup;
        this.A03 = DbX.A0a(viewGroup, R.id.row_search_user_imageview);
        this.A01 = AnonymousClass7TG.A0R(viewGroup, R.id.row_search_user_fullname);
        TextView A0R = AnonymousClass7TG.A0R(viewGroup, R.id.row_search_user_username);
        this.A02 = A0R;
        this.A04 = (BlockButton) AnonymousClass7TF.A0F(viewGroup, R.id.block_button);
        C13988Tno.A16(A0R, true);
    }
}
