package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.HAd  reason: case insensitive filesystem */
public final class C54363HAd extends C54728HQh {
    public final IgTextView A00;
    public final IgImageView A01;
    public final IgdsButton A02;
    public final IgdsButton A03;

    public C54363HAd(View view) {
        0qQ.A0B(view, 1);
        this.A02 = (IgdsButton) AnonymousClass7TF.A0F(view, R.id.control_view_left_button);
        this.A03 = (IgdsButton) AnonymousClass7TF.A0F(view, R.id.control_view_right_button);
        this.A01 = DbX.A0b(view, R.id.control_view_close_button);
        this.A00 = DbX.A0Z(view, R.id.control_view_question);
    }
}
