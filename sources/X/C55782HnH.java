package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.HnH  reason: case insensitive filesystem */
public final class C55782HnH {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgdsButton A03;

    public C55782HnH(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A01 = DbX.A0Y(view, R.id.icon);
        this.A02 = DbX.A0Z(view, R.id.text);
        this.A03 = (IgdsButton) AnonymousClass7TF.A0F(view, R.id.action_button);
    }
}
