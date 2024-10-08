package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class L9P {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;
    public final IgImageView A03;
    public final IgImageView A04;

    public L9P(View view) {
        this.A04 = JTR.A0i(view, R.id.user_verified_icon);
        this.A02 = JTR.A0i(view, R.id.user_badge_icon);
        this.A00 = DbW.A0B(view, R.id.user_badge_count);
        this.A03 = JTR.A0i(view, R.id.user_pinned_icon);
        this.A01 = DbW.A0B(view, R.id.user_pinned_text);
    }
}
