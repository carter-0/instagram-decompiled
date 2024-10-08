package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

public final class L6F {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;

    public L6F(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A01 = (IgSimpleImageView) view.findViewById(R.id.icon);
        this.A02 = JTO.A0X(view, R.id.label);
    }
}
