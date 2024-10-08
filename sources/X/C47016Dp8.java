package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Dp8  reason: case insensitive filesystem */
public final class C47016Dp8 extends C249703kE {
    public final IgSimpleImageView A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final C252063oV A04;
    public final ViewGroup A05;

    public C47016Dp8(View view) {
        super(view);
        this.A05 = DbX.A0I(view, R.id.hall_pass_member_row_container);
        this.A01 = DbX.A0Y(view, R.id.profile_picture);
        this.A02 = DbX.A0Z(view, R.id.member_name);
        this.A03 = DbX.A0Z(view, R.id.member_username);
        this.A00 = DbX.A0Y(view, R.id.more_button);
        this.A04 = DbU.A0Z(view, R.id.follow_button_stub);
    }
}
