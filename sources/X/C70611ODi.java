package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.ODi  reason: case insensitive filesystem */
public final class C70611ODi {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;

    public C70611ODi(View view) {
        this.A00 = view;
        this.A01 = DbX.A0Y(view, R.id.shortcut_button_icon);
        this.A02 = DbX.A0Z(view, R.id.shortcut_button_text);
    }
}
