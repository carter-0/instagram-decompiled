package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class OG3 {
    public final TextView A00;
    public final IgFrameLayout A01;
    public final GradientSpinnerAvatarView A02;
    public final View A03;
    public final View A04;

    public OG3(View view) {
        0qQ.A0B(view, 1);
        this.A01 = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.frame_layout_wrapper);
        this.A04 = AnonymousClass7TF.A0G(view, R.id.floating_send_container);
        this.A03 = AnonymousClass7TF.A0G(view, R.id.send_button_pill_container);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.send_label);
        this.A02 = DbX.A0j(view, R.id.avatar_image_view);
    }
}
