package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.base.AspectRatioFrameLayout;

/* renamed from: X.Jp2  reason: case insensitive filesystem */
public final class C60655Jp2 extends C249703kE {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final AspectRatioFrameLayout A04;

    public C60655Jp2(View view) {
        super(view);
        this.A04 = (AspectRatioFrameLayout) AnonymousClass7TE.A0b(view, R.id.suggested_live_container);
        this.A02 = Dba.A0E(view, R.id.live_viewer_count);
        this.A01 = Dba.A0E(view, R.id.live_username);
        this.A00 = Dba.A0E(view, R.id.live_title);
        this.A03 = JTR.A0i(view, R.id.suggested_live_cover);
    }
}
