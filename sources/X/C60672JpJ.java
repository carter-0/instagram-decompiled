package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JpJ  reason: case insensitive filesystem */
public final class C60672JpJ extends C249703kE {
    public final View A00;
    public final FrameLayout A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgImageView A05;
    public final IgImageView A06;
    public final View A07;

    public C60672JpJ(View view) {
        super(view);
        this.A07 = view;
        this.A00 = view;
        this.A06 = JTR.A0i(view, R.id.image_view);
        this.A04 = Dba.A0E(view, R.id.song_title);
        this.A02 = Dba.A0E(view, R.id.artist_name);
        this.A05 = JTR.A0i(view, R.id.explicit_icon);
        this.A03 = Dba.A0E(view, R.id.display_label);
        this.A01 = (FrameLayout) AnonymousClass7TE.A0b(view, R.id.spotlight_banner_frame_layout);
    }
}
