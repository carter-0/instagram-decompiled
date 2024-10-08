package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.PBg  reason: case insensitive filesystem */
public final class C72575PBg implements C328007Db, C328017Dc, C3263976p {
    public C328087Dj A00;
    public final FrameLayout A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final CircularImageView A06;
    public final IgProgressImageView A07;
    public final MediaFrameLayout A08;
    public final ImageView A09;

    public C72575PBg(View view) {
        0qQ.A0B(view, 1);
        this.A01 = (FrameLayout) AnonymousClass7TF.A0F(view, R.id.product_message_content);
        this.A06 = DbX.A0a(view, R.id.avatar);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.username);
        this.A08 = (MediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.media_container);
        IgProgressImageView igProgressImageView = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.image);
        this.A07 = igProgressImageView;
        this.A02 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.title_container);
        this.A04 = C66582MXn.A0F(view);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.subtitle);
        this.A09 = DbX.A0J(view, R.id.doubletap_heart);
        igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public final ImageView Afl() {
        return this.A09;
    }

    public final View BJd() {
        return this.A01;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
