package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgdsButton;

public final class UDC extends C249703kE {
    public final IgSimpleImageView A00;
    public final IgdsButton A01;
    public final View A02;

    public UDC(View view) {
        super(view);
        this.A02 = view;
        this.A01 = JTR.A0n(view, R.id.megaphone_cta_button);
        this.A00 = DbX.A0Y(view, R.id.megaphone_dismiss_button);
    }
}
