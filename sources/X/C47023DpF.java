package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.DpF  reason: case insensitive filesystem */
public final class C47023DpF extends C249703kE {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final IgSimpleImageView A02;
    public final IgSimpleImageView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgdsRadioButton A06;

    public C47023DpF(View view) {
        super(view);
        this.A00 = DbX.A0I(view, R.id.hall_pass_row_container);
        this.A01 = DbX.A0I(view, R.id.hall_pass_name_container);
        this.A05 = DbX.A0Z(view, R.id.hall_pass_name);
        this.A04 = DbX.A0Z(view, R.id.hall_pass_member_count);
        this.A02 = DbX.A0Y(view, R.id.subtitle_right_chevron);
        this.A06 = (IgdsRadioButton) AnonymousClass7TF.A0F(view, R.id.hall_pass_radio_button);
        this.A03 = DbX.A0Y(view, R.id.right_chevron);
    }
}
