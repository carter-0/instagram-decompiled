package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

public final class L9L {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgdsButton A04;

    public L9L(View view) {
        this.A03 = DbX.A0Z(view, R.id.incentive_title);
        this.A00 = DbX.A0Z(view, R.id.auto_applied_at_checkout_text);
        this.A01 = DbX.A0Z(view, R.id.expiration_text);
        this.A02 = DbX.A0Z(view, R.id.incentive_description);
        this.A04 = JTR.A0n(view, R.id.buy_on_ig_incentive_button);
    }
}
