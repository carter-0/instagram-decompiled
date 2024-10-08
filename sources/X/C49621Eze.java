package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Eze  reason: case insensitive filesystem */
public final class C49621Eze {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final C252063oV A03;
    public final GradientSpinnerAvatarView A04;

    public C49621Eze(View view) {
        this.A00 = AnonymousClass7TF.A0G(view, R.id.row_user_container);
        this.A04 = DbX.A0j(view, R.id.selectable_user_row_avatar);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.row_user_username);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.row_user_info);
        C252063oV A012 = 2b1.A01(view.requireViewById(R.id.selectable_user_row_checkbox_view_stub), false, false);
        this.A03 = A012;
        A012.EeU(FZJ.A00);
        A012.setVisibility(0);
    }
}
