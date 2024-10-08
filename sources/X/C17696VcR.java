package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.VcR  reason: case insensitive filesystem */
public final class C17696VcR {
    public final View A00;
    public final ConstraintLayout A01;
    public final IgLinearLayout A02;
    public final IgLinearLayout A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;
    public final IgdsButton A09;
    public final IgdsButton A0A;

    public C17696VcR(View view, boolean z) {
        IgdsButton igdsButton;
        IgdsButton igdsButton2;
        IgLinearLayout igLinearLayout;
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A04 = DbX.A0Z(view, R.id.afi_view_question);
        this.A05 = DbX.A0Z(view, R.id.afi_view_question_description);
        IgLinearLayout igLinearLayout2 = null;
        if (z) {
            igdsButton = null;
        } else {
            igdsButton = (IgdsButton) view.requireViewById(R.id.afi_view_left_button);
        }
        this.A09 = igdsButton;
        if (z) {
            igdsButton2 = null;
        } else {
            igdsButton2 = (IgdsButton) view.requireViewById(R.id.afi_view_right_button);
        }
        this.A0A = igdsButton2;
        this.A08 = DbX.A0b(view, R.id.afi_view_close_button);
        if (z) {
            igLinearLayout = (IgLinearLayout) view.requireViewById(R.id.afi_left_button_container);
        } else {
            igLinearLayout = null;
        }
        this.A02 = igLinearLayout;
        this.A03 = z ? (IgLinearLayout) view.requireViewById(R.id.afi_right_button_container) : igLinearLayout2;
        this.A01 = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.afi_view_container);
        this.A06 = DbX.A0b(view, R.id.afi_arrow_indicator_no_border);
        this.A07 = DbX.A0b(view, R.id.afi_arrow_indicator_with_border);
    }
}
