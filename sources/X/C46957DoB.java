package X;

import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.DoB  reason: case insensitive filesystem */
public final class C46957DoB extends C249703kE {
    public final LinearLayout A00;
    public final IgTextView A01;
    public final GradientSpinnerAvatarView A02;

    public C46957DoB(View view) {
        super(view);
        this.A02 = DbX.A0j(view, R.id.grid_view_action_pog_avatar_view);
        this.A01 = DbX.A0Z(view, R.id.grid_view_action_pog_text_view);
        this.A00 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.grid_view_action_label_container);
    }
}
