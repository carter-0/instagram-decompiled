package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Hnj  reason: case insensitive filesystem */
public final class C55803Hnj {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final GradientSpinnerAvatarView A04;

    public C55803Hnj(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 1);
        this.A00 = viewGroup;
        this.A01 = DbX.A0I(viewGroup, R.id.row_user_container_base);
        this.A04 = (GradientSpinnerAvatarView) AnonymousClass7TF.A0F(viewGroup, R.id.row_user_imageview);
        this.A02 = DbX.A0Z(viewGroup, R.id.row_user_primary_name);
        this.A03 = DbX.A0Z(viewGroup, R.id.row_user_secondary_name);
    }
}
