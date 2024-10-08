package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.EzD  reason: case insensitive filesystem */
public final class C49594EzD {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgdsButton A03;

    public C49594EzD(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A02 = DbX.A0Z(view, R.id.rff_banner_title_textview);
        this.A01 = DbX.A0Y(view, R.id.rff_banner_dismiss_button);
        this.A03 = (IgdsButton) AnonymousClass7TF.A0F(view, R.id.rff_banner_continue_button);
    }
}
