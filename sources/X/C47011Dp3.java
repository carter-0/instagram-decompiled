package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.touch.TouchOverlayView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Dp3  reason: case insensitive filesystem */
public final class C47011Dp3 extends C249703kE {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;
    public final RoundedCornerImageView A03;
    public final TouchOverlayView A04;

    public C47011Dp3(View view) {
        super(view);
        this.A03 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.icon);
        this.A02 = DbX.A0a(view, R.id.avatar);
        this.A00 = DbX.A0Z(view, R.id.primary_text);
        this.A01 = DbX.A0Z(view, R.id.secondary_text);
        this.A04 = (TouchOverlayView) AnonymousClass7TF.A0F(view, R.id.touch_overlay);
    }
}
