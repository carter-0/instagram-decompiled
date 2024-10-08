package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.HJr  reason: case insensitive filesystem */
public final class C54582HJr extends C54010Gxs {
    public final IgImageView A00;
    public final C55838HoL A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54582HJr(View view) {
        super(view);
        0qQ.A0B(view, 1);
        IgImageView A0b = AnonymousClass7TE.A0b(view, R.id.image_blur_background);
        this.A00 = A0b;
        this.A01 = new C55838HoL(AnonymousClass7TF.A0G(view, R.id.media_quality_survey_container));
        A0b.A0I = C55402Hh8.A01;
    }
}
