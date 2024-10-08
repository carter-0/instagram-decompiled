package X;

import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.MyY  reason: case insensitive filesystem */
public final class C68006MyY extends C249703kE {
    public final CircularImageView A00;
    public final View A01;
    public final LinearLayout.LayoutParams A02;
    public final AnonymousClass0iw A03;

    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68006MyY(View view, AnonymousClass0iw r3) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = r3;
        this.A01 = AnonymousClass7TE.A0b(view, R.id.image_container);
        ? r0 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.circular_image);
        this.A00 = r0;
        this.A02 = (LinearLayout.LayoutParams) r0.getLayoutParams();
    }
}
