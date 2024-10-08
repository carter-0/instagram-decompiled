package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class Ey1 {
    public final TextView A00;
    public final CircularImageView A01;
    public final IgdsSwitch A02;

    public Ey1(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 1);
        this.A01 = DbX.A0a(viewGroup, R.id.row_user_avatar);
        this.A00 = AnonymousClass7TG.A0R(viewGroup, R.id.row_username_textview);
        this.A02 = (IgdsSwitch) AnonymousClass7TF.A0F(viewGroup, R.id.featured_account_switch);
    }
}
