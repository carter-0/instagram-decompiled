package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class OHI {
    public C66819MdB A00;
    public final C252063oV A01;
    public final C252063oV A02;
    public final View A03;
    public final C252063oV A04;
    public final C252063oV A05;
    public final SpinnerImageView A06;

    public OHI(View view) {
        0qQ.A0B(view, 1);
        View A0G = AnonymousClass7TF.A0G(view, R.id.media_viewer_container);
        this.A03 = A0G;
        this.A06 = (SpinnerImageView) AnonymousClass7TF.A0F(A0G, R.id.loading_progress_bar);
        this.A02 = C66581MXm.A0T(A0G, R.id.media_image_stub);
        this.A04 = C66581MXm.A0T(A0G, R.id.media_video_stub);
        this.A05 = C66581MXm.A0T(view, R.id.zero_rating_data_banner);
        this.A01 = C66581MXm.A0T(A0G, R.id.hd_icon_stub);
    }
}
