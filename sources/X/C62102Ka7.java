package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Ka7  reason: case insensitive filesystem */
public final class C62102Ka7 extends C62940Kos {
    public IgImageView A00;
    public MediaFrameLayout A01;

    public C62102Ka7(View view) {
        0qQ.A0B(view, 1);
        Context context = view.getContext();
        C71662eb A0T = DbY.A0T(view, R.id.media_tag_indicator_stub);
        this.A02 = A0T;
        A0T.A02 = new C64886Ljm(1, context, this);
        this.A01 = (MediaFrameLayout) AnonymousClass7TE.A0b(view, R.id.image_container);
        this.A00 = JTR.A0i(view, R.id.tag_image_view);
    }
}
