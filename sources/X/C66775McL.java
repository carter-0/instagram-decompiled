package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.feed.widget.IgProgressImageViewProgressBar;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.McL  reason: case insensitive filesystem */
public final class C66775McL implements C328007Db, C328017Dc, C3263976p {
    public C66819MdB A00;
    public C328087Dj A01;
    public final View A02;
    public final View A03;
    public final ViewStub A04;
    public final N4R A05;
    public final 1a8 A06 = C66580MXl.A0O();
    public final C252063oV A07;
    public final AnonymousClass3V4 A08;
    public final IgProgressImageView A09;
    public final IgProgressImageViewProgressBar A0A;
    public final RoundedCornerMediaFrameLayout A0B;
    public final ImageView A0C;
    public final C252063oV A0D;

    public C66775McL(View view) {
        0qQ.A0B(view, 1);
        this.A0B = (RoundedCornerMediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.media_container);
        IgProgressImageView igProgressImageView = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.image);
        this.A09 = igProgressImageView;
        this.A03 = AnonymousClass7TF.A0G(view, R.id.play_icon);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.pending_overlay);
        this.A0A = (IgProgressImageViewProgressBar) AnonymousClass7TF.A0F(view, R.id.upload_progress_indicator);
        C252063oV A0Z = DbU.A0Z(view, R.id.privacy_overlay_stub);
        this.A0D = A0Z;
        this.A04 = JTR.A0X(view, R.id.pill_overlay_stub);
        this.A08 = new AnonymousClass3V4(DbU.A0D(view, R.id.zero_rating_video_play_button_stub));
        this.A07 = DbU.A0Z(view, R.id.hd_icon_stub);
        this.A0C = DbX.A0J(view, R.id.doubletap_heart);
        this.A05 = new N4R(A0Z, igProgressImageView);
    }

    public final ImageView Afl() {
        return this.A0C;
    }

    public final View BJd() {
        return this.A0B;
    }

    public final C328087Dj BY0() {
        return this.A01;
    }

    public final void EeT(C328087Dj r1) {
        this.A01 = r1;
    }
}
