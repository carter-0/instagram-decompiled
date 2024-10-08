package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Doe  reason: case insensitive filesystem */
public final class C46986Doe extends C249703kE {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgdsButton A02;
    public final GradientSpinnerAvatarView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46986Doe(View view) {
        super(view);
        0qQ.A0B(view, 1);
        View findViewById = view.findViewById(R.id.row_user_imageview);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) findViewById;
        gradientSpinnerAvatarView.A05();
        0qQ.A07(findViewById);
        this.A03 = gradientSpinnerAvatarView;
        this.A01 = Dba.A0E(view, R.id.row_user_primary_name);
        this.A00 = Dba.A0E(view, R.id.row_user_secondary_name);
        View findViewById2 = view.findViewById(R.id.row_direct_action_button);
        IgdsButton igdsButton = (IgdsButton) findViewById2;
        igdsButton.setVisibility(0);
        igdsButton.setText(igdsButton.getContext().getString(2131973082));
        0qQ.A07(findViewById2);
        this.A02 = igdsButton;
    }
}
