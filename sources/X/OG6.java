package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public final class OG6 {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final CircularImageView A03;
    public final CircularImageView A04;

    public OG6(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A01 = DbX.A0Y(view, R.id.null_state_action_item_icon);
        this.A03 = DbX.A0a(view, R.id.null_state_circular_action_item_icon);
        this.A04 = DbX.A0a(view, R.id.null_state_circular_action_item_icon_large);
        this.A02 = DbX.A0Z(view, R.id.null_state_action_item_text);
    }
}
