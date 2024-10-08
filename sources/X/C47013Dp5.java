package X;

import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Dp5  reason: case insensitive filesystem */
public final class C47013Dp5 extends C249703kE {
    public final CheckBox A00;
    public final TextView A01;
    public final TextView A02;
    public final ConstraintLayout A03;
    public final IgSimpleImageView A04;
    public final GradientSpinnerAvatarView A05;

    public C47013Dp5(ConstraintLayout constraintLayout) {
        super(constraintLayout);
        this.A03 = constraintLayout;
        this.A00 = (CheckBox) AnonymousClass7TF.A0F(constraintLayout, R.id.edit_icon);
        this.A05 = DbX.A0j(constraintLayout, R.id.image_view);
        this.A01 = AnonymousClass7TG.A0R(constraintLayout, R.id.header);
        this.A02 = AnonymousClass7TG.A0R(constraintLayout, R.id.sub_header);
        this.A04 = DbX.A0Y(constraintLayout, R.id.right_drag_handle);
    }
}
