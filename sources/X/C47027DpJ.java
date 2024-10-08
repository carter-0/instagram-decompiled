package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.DpJ  reason: case insensitive filesystem */
public final class C47027DpJ extends C249703kE {
    public ViewGroup A00;
    public final TextView A01 = AnonymousClass7TG.A0R(this.A00, R.id.row_user_label);
    public final TextView A02 = AnonymousClass7TG.A0R(this.A00, R.id.row_user_primary_name);
    public final TextView A03 = AnonymousClass7TG.A0R(this.A00, R.id.row_user_secondary_name);
    public final IgSimpleImageView A04 = DbX.A0Y(this.A00, R.id.message_button);
    public final C252063oV A05 = DbU.A0Z(this.A00, R.id.follow_button_stub);
    public final GradientSpinnerAvatarView A06 = DbX.A0j(this.A00, R.id.row_user_imageview);
    public final ViewGroup A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47027DpJ(ViewGroup viewGroup) {
        super(viewGroup);
        0qQ.A0B(viewGroup, 1);
        this.A00 = viewGroup;
        this.A07 = DbX.A0I(viewGroup, R.id.row_user_container_base);
    }
}
