package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Dp1  reason: case insensitive filesystem */
public final class C47009Dp1 extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final GradientSpinnerAvatarView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47009Dp1(View view) {
        super(view);
        0qQ.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.image_view);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) requireViewById;
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        0qQ.A07(requireViewById);
        this.A04 = gradientSpinnerAvatarView;
        this.A00 = AnonymousClass7TF.A0G(view, R.id.image_view_end_space);
        this.A02 = DbX.A0Z(view, R.id.primary_text);
        this.A03 = DbX.A0Z(view, R.id.secondary_text);
        this.A01 = DbX.A0Z(view, R.id.disclosure_text);
    }
}
