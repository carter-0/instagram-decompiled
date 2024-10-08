package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.JoX  reason: case insensitive filesystem */
public final class C60624JoX extends C249703kE {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60624JoX(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = DbX.A0Y(view, R.id.button_icon);
        this.A02 = DbX.A0Z(view, R.id.button_name);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.control_bar_item);
    }
}
