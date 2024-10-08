package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

public final class F0Y {
    public final View A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final CircularImageView A04;
    public final IgdsButton A05;
    public final FrameLayout A06;

    public F0Y(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A06 = (FrameLayout) AnonymousClass7TF.A0F(view, R.id.avatar_container);
        this.A04 = DbX.A0a(view, R.id.row_invite_user_imageview);
        this.A01 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.row_invite_user_info_container);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.row_invite_contact_name);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.row_invite_contact_phone_number);
        this.A05 = (IgdsButton) AnonymousClass7TF.A0F(view, R.id.row_invite_contact_invite_button);
    }
}
