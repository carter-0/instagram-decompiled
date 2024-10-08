package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.touch.TouchOverlayView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.VZu  reason: case insensitive filesystem */
public final class C17541VZu {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final TouchOverlayView A03;
    public final IgImageView A04;

    public C17541VZu(View view) {
        this.A02 = view;
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A04 = JTR.A0i(view, R.id.image);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.tint);
        this.A03 = (TouchOverlayView) AnonymousClass7TE.A0b(view, R.id.touch_overlay);
    }
}
