package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;

/* renamed from: X.DpG  reason: case insensitive filesystem */
public final class C47024DpG extends C249703kE {
    public final View A00;
    public final IgSimpleImageView A01;
    public final List A02;
    public final View A03;
    public final ViewGroup A04;
    public final ViewGroup A05;
    public final ViewGroup A06;

    public C47024DpG(View view) {
        super(view);
        this.A03 = view;
        this.A01 = DbX.A0Y(view, R.id.follow_chaining_unit_dismiss_button);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.follow_chaining_unit_see_all_row);
        ViewGroup A0I = DbX.A0I(view, R.id.follow_chaining_unit_user_row_1);
        this.A04 = A0I;
        ViewGroup A0I2 = DbX.A0I(view, R.id.follow_chaining_unit_user_row_2);
        this.A05 = A0I2;
        ViewGroup A0I3 = DbX.A0I(view, R.id.follow_chaining_unit_user_row_3);
        this.A06 = A0I3;
        this.A02 = 0sr.A1P(new ViewGroup[]{A0I, A0I2, A0I3});
    }
}
