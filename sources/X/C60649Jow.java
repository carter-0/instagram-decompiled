package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Jow  reason: case insensitive filesystem */
public final class C60649Jow extends C249703kE {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final C252063oV A03;
    public final GradientSpinnerAvatarView A04;

    public C60649Jow(View view) {
        super(view);
        this.A04 = DbX.A0j(view, R.id.avatar);
        this.A00 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.balance_area);
        this.A01 = DbX.A0Z(view, R.id.balance);
        this.A02 = DbX.A0Z(view, R.id.title);
        this.A03 = DbU.A0Z(view, R.id.banner_stub);
    }
}
