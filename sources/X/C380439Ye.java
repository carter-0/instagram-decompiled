package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.9Ye  reason: invalid class name and case insensitive filesystem */
public final class C380439Ye extends C249703kE {
    public final IgSimpleImageView A00;
    public final RoundedCornerImageView A01;

    public C380439Ye(View view, AnonymousClass8QZ r5) {
        super(view);
        this.A01 = (RoundedCornerImageView) AnonymousClass7TE.A0b(view, R.id.background_image_view);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.plus_image);
        this.A00 = igSimpleImageView;
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(igSimpleImageView);
        A0m.A0C = true;
        A0m.A07 = true;
        A0m.A02 = 0.95f;
        A0m.A04 = new C64850LjC(r5, 4);
        A0m.A00();
    }
}
