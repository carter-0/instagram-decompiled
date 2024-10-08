package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.DpH  reason: case insensitive filesystem */
public final class C47025DpH extends C249703kE {
    public ImageView A00;
    public CircularImageView A01;
    public final View A02;
    public final ViewGroup A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final /* synthetic */ C46823Dlz A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47025DpH(ViewGroup viewGroup, C46823Dlz dlz) {
        super(viewGroup);
        0qQ.A0B(viewGroup, 2);
        this.A06 = dlz;
        this.A03 = viewGroup;
        this.A04 = DbX.A0Z(viewGroup, R.id.row_user_username);
        this.A05 = DbX.A0Z(viewGroup, R.id.row_user_info);
        this.A01 = DbX.A0a(viewGroup, R.id.user_profile_pic);
        this.A00 = DbX.A0J(viewGroup, R.id.close_friends_icon);
        this.A02 = AnonymousClass7TF.A0G(viewGroup, R.id.row_user_message);
    }
}
