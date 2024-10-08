package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.HoY  reason: case insensitive filesystem */
public final class C55851HoY {
    public final View A00;
    public final ConstraintLayout A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final IgdsButton A05;
    public final IgdsButton A06;

    public C55851HoY(View view) {
        IgImageView igImageView;
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A02 = DbX.A0Z(view, R.id.afi_view_title);
        if (I3y.A00 == REPETITION_UI_TYPE.MEDIUM) {
            igImageView = DbT.A0b(view, R.id.afi_view_dismiss_button);
        } else {
            igImageView = null;
        }
        this.A04 = igImageView;
        this.A05 = (IgdsButton) AnonymousClass7TF.A0F(view, R.id.afi_view_left_button);
        this.A06 = (IgdsButton) AnonymousClass7TF.A0F(view, R.id.afi_view_right_button);
        this.A03 = DbX.A0b(view, R.id.afi_view_indicator_arrow);
        this.A01 = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.afi_view_container);
    }
}
