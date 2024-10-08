package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.DpD  reason: case insensitive filesystem */
public final class C47021DpD extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgSimpleImageView A03;
    public final IgdsButton A04;
    public final GradientSpinnerAvatarView A05;
    public final View A06;

    public C47021DpD(View view) {
        super(view);
        this.A06 = view;
        this.A00 = view;
        this.A05 = (GradientSpinnerAvatarView) AnonymousClass7TE.A0b(view, R.id.row_user_imageview);
        this.A03 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.row_avatar_placeholder);
        this.A02 = DbW.A0B(view, R.id.row_user_primary_name);
        this.A01 = DbW.A0B(view, R.id.row_user_secondary_name);
        this.A04 = (IgdsButton) AnonymousClass7TE.A0b(view, R.id.row_direct_action_button);
    }
}
