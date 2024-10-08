package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;

public final class F0J {
    public final ViewStub A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgProgressImageView A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C73662Phb(this, 39));

    public F0J(View view) {
        0qQ.A0B(view, 1);
        this.A04 = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.preview_image);
        this.A03 = DbX.A0a(view, R.id.feed_preview_profile_picture);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.feed_preview_username);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.feed_preview_subtitle);
        this.A00 = (ViewStub) AnonymousClass7TF.A0F(view, R.id.feed_preview_icon_view_stub);
    }
}
