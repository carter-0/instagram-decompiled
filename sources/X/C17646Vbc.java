package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.touch.TouchOverlayView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Vbc  reason: case insensitive filesystem */
public final class C17646Vbc {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final TouchOverlayView A03;
    public final IgImageView A04;
    public final C252063oV A05;
    public final MediaFrameLayout A06;

    public C17646Vbc(View view) {
        this.A02 = view;
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A04 = JTR.A0i(view, R.id.image);
        this.A06 = (MediaFrameLayout) AnonymousClass7TE.A0b(view, R.id.video_container);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.tint);
        this.A05 = C66581MXm.A0T(view, R.id.eye_off_overlay);
        this.A03 = (TouchOverlayView) AnonymousClass7TE.A0b(view, R.id.touch_overlay);
    }
}
